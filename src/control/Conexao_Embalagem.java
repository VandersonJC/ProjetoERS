package control;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import entities.Embalagem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Conexao_Embalagem {

    Conexao conexao = new Conexao();
    Connection con = Conexao.Connetion();
    PreparedStatement stmt;

    public void inserir(Embalagem embalagem) {

        String sql = "INSERT INTO embalagem(descricao,comprimento,largura,altura) VALUES(?,?,?,?)";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, embalagem.getDescricao());
            stmt.setDouble(2, embalagem.getComprimento());
            stmt.setDouble(3, embalagem.getLargura());
            stmt.setDouble(4, embalagem.getAltura());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    public void excluir(Embalagem embalagem) {

        String sql = "DELETE FROM embalagem WHERE id_embalagem = ?";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, embalagem.getId_embalagem());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public void alterar(Embalagem embalagem) {

        String sql = "UPDATE embalagem SET descricao = ?, comprimento = ?, largura = ?, altura = ? WHERE id_embalagem = ?";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, embalagem.getDescricao());
            stmt.setDouble(2, embalagem.getComprimento());
            stmt.setDouble(3, embalagem.getLargura());
            stmt.setDouble(4, embalagem.getAltura());
            stmt.setInt(5, embalagem.getId_embalagem());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public List<Embalagem> listar() {

        String sql = "SELECT * FROM embalagem";

        List<Embalagem> lista = new ArrayList<>();

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                Embalagem embalagem = new Embalagem();
                embalagem.setId_embalagem(response.getInt("id_embalagem"));
                embalagem.setDescricao(response.getString("descricao"));
                embalagem.setComprimento(response.getDouble("comprimento"));
                embalagem.setLargura(response.getDouble("largura"));
                embalagem.setAltura(response.getDouble("altura"));

                lista.add(embalagem);

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

        return lista;
    }

}

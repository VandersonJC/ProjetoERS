package control;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import entities.Produto;
import entities.Saida;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Conexao_Saida {

    Conexao conexao = new Conexao();
    Connection con = Conexao.Connetion();
    PreparedStatement stmt;

    public void inserir(Saida saida) {

        String sql = "INSERT INTO saida(unidades,data_saida,id_item) VALUES(?,?,?)";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, saida.getUnidades());
            stmt.setDate(2, (Date) saida.getData_saida());
            stmt.setInt(3, saida.getProduto().getId_item());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    public void excluir(Saida saida) {

        String sql = "DELETE FROM saida WHERE id_saida = ?";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, saida.getId_saida());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public void alterar(Saida saida) {

        String sql = "UPDATE saida SET unidades = ?,data_entrada = ?,id_item = ? WHERE id_entrada = ?";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, saida.getUnidades());
            stmt.setDate(2, (Date) saida.getData_saida());
            stmt.setInt(3, saida.getProduto().getId_item());
            stmt.setInt(4, saida.getId_saida());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public List<Saida> listar() {

        String sql = "SELECT * FROM saida";

        List<Saida> lista = new ArrayList<>();

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                Saida saida = new Saida();
                saida.setId_saida(response.getInt("id_saida"));
                saida.setUnidades(response.getInt("unidades"));
                saida.setData_saida(response.getDate("data_saida"));
                saida.setProduto(response.getObject("id_item", Produto.class));

                lista.add(saida);

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

        return lista;
    }

}

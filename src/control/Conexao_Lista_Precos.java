package control;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import entities.Lista_Precos;
import entities.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Conexao_Lista_Precos {

    Conexao conexao = new Conexao();
    Connection con = Conexao.Connetion();
    PreparedStatement stmt;

    public void inserir(Lista_Precos lista_Precos) {

        String sql = "INSERT INTO lista_precos(descricao,preco,id_item) VALUES(?,?,?)";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, lista_Precos.getDescricao());
            stmt.setDouble(2, lista_Precos.getPreco());
            stmt.setInt(3, lista_Precos.getProduto().getId_item());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    public void excluir(Lista_Precos lista_Precos) {

        String sql = "DELETE FROM lista_precos WHERE id_lista = ?";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, lista_Precos.getId_lista());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public void alterar(Lista_Precos lista_Precos) {

        String sql = "UPDATE lista_precos SET descricao = ?,preco = ?,id_item = ? WHERE id_lista = ?";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, lista_Precos.getDescricao());
            stmt.setDouble(2, lista_Precos.getPreco());
            stmt.setInt(3, lista_Precos.getProduto().getId_item());
            stmt.setInt(4, lista_Precos.getId_lista());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public List<Lista_Precos> listar() {

        String sql = "SELECT * FROM lista_precos";

        List<Lista_Precos> lista = new ArrayList<>();

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                Lista_Precos lista_Precos = new Lista_Precos();
                lista_Precos.setId_lista(response.getInt("id_lista"));
                lista_Precos.setDescricao(response.getString("descricao"));
                lista_Precos.setPreco(response.getDouble("preco"));
                lista_Precos.setProduto(response.getObject("id_item", Produto.class));
      
                lista.add(lista_Precos);

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

        return lista;
    }

    
    public List<Lista_Precos> listarPrecoProduto(int id_item) {

        String sql = "SELECT * FROM lista_precos WHERE id_item = ?";

        List<Lista_Precos> lista = new ArrayList<>();

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, id_item);
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                Lista_Precos lista_Precos = new Lista_Precos();
                lista_Precos.setId_lista(response.getInt("id_lista"));
                lista_Precos.setDescricao(response.getString("descricao"));
                lista_Precos.setPreco(response.getDouble("preco"));
                lista_Precos.setProduto(response.getObject("id_item", Produto.class));
      
                lista.add(lista_Precos);

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

        return lista;
    }
    
    
}

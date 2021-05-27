package control;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import entities.Embalagem;
import entities.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Conexao_Produto {

    Conexao conexao = new Conexao();
    Connection con = Conexao.Connetion();
    PreparedStatement stmt;

    public void inserir(Produto produto) {

        String sql = "INSERT INTO item_produto(nome,ean,preco,peso,garantia,custo,marca,descricao,imagem,id_embalagem,estoque_minimo,quantidade) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getEan());
            stmt.setDouble(3, produto.getPreco());
            stmt.setDouble(4, produto.getPeso());
            stmt.setString(5, produto.getGarantia());
            stmt.setDouble(6, produto.getCusto());
            stmt.setString(7, produto.getMarca());
            stmt.setString(8, produto.getDescricao());
            stmt.setBytes(9, produto.getImagem());
            stmt.setInt(10, produto.getEmbalagem().getId_embalagem());
            stmt.setInt(11, produto.getEstoque_minimo());
            stmt.setInt(12, produto.getQuantidade());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    public void excluir(Produto produto) {

        String sql = "DELETE FROM item_produto WHERE id_item = ?";

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, produto.getId_item());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public void alterar(Produto produto) {

        String sql = "UPDATE item_produto SET nome = ?,ean = ?,preco = ?,peso = ?,garantia = ?,custo = ?,marca = ?,descricao = ?,imagem = ?,id_embalagem = ?,estoque_minimo = ?,quantidade = ? WHERE id_item = ?";

        try {
  
            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getEan());
            stmt.setDouble(3, produto.getPreco());
            stmt.setDouble(4, produto.getPeso());
            stmt.setString(5, produto.getGarantia());
            stmt.setDouble(6, produto.getCusto());
            stmt.setString(7, produto.getMarca());
            stmt.setString(8, produto.getDescricao());
            stmt.setBytes(9, produto.getImagem());
            stmt.setInt(10, produto.getEmbalagem().getId_embalagem());
            stmt.setInt(11, produto.getEstoque_minimo());
            stmt.setInt(12, produto.getQuantidade());
            stmt.setInt(13, produto.getId_item());
            stmt.execute();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public List<Produto> listar() {

        String sql = "SELECT * FROM item_produto";

        List<Produto> lista = new ArrayList<>();

        try {

            stmt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                Produto produto = new Produto();
                produto.setId_item(response.getInt("id_item"));
                produto.setNome(response.getString("nome"));
                produto.setEan(response.getString("ean"));
                produto.setPreco(response.getDouble("preco"));
                produto.setPeso(response.getDouble("peso"));
                produto.setGarantia(response.getString("garantia"));
                produto.setCusto(response.getDouble("custo"));
                produto.setMarca(response.getString("marca"));
                produto.setDescricao(response.getString("descricao"));
                produto.setImagem(response.getBytes("imagem"));
                produto.setEmbalagem(response.getObject("id_embalagem", Embalagem.class));
                produto.setEstoque_minimo(response.getInt("estoque_minimo"));
                produto.setQuantidade(response.getInt("quantidade"));

                lista.add(produto);

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

        return lista;
    }

}

package connectionDB;

import DTO.Lanche;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class RestauranteConn {
    Connection conn;
    PreparedStatement pstm;
    private List<Lanche> cardapio;

    public void adicionarLanche(String restaurante, String nome, double preco) {
        Lanche novoLanche = new Lanche(nome, preco, restaurante);
        cardapio.add(novoLanche);

        conn = new ConexaoDAO().conectaBD();
        String sql = "INSERT INTO cardapio (restaurante, nome, preco) VALUES (?, ?, ?)";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, restaurante);
            pstm.setString(2, nome);
            pstm.setDouble(3, preco);

            pstm.execute();
            pstm.close();
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "RestauranteConn: " + error);
        }
    }

    public void removerLanche(String restaurante, String nome) {
        cardapio.removeIf(lanche -> lanche.getNome().equals(nome));

        conn = new ConexaoDAO().conectaBD();
        String sql = "DELETE FROM cardapio WHERE restaurante = ? AND nome = ?";

        try{
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, restaurante);
            pstm.setString(2, nome);

            pstm.execute();
            pstm.close();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "RestauranteConn: " + error);
        }
    }

    public void carregarCardapio(String nomeRestaurante) {
        cardapio.clear();

        conn = new ConexaoDAO().conectaBD();
        String sql = "SELECT * FROM cardapio WHERE restaurante = ?";

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nomeRestaurante);

            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                String nomeLanche = resultSet.getString("nome");
                double preco = resultSet.getDouble("preco");
                cardapio.add(new Lanche(nomeLanche, preco, nomeRestaurante));
            }

            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "RestauranteConn: " + e);
        }
    }
}

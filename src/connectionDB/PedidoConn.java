package connectionDB;

import DTO.Lanche;
import DTO.Pedido;
import DTO.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PedidoConn {
    Connection conn;
    PreparedStatement pstm;

    public void fazerPedido(Usuario usuario, List<Lanche> itens) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "INSERT INTO pedido (usuario_id, restaurante, item, preco) VALUES (?, ?, ?, ?)";

        try {
            pstm = conn.prepareStatement(sql);

            for (Lanche item : itens) {
                pstm.setInt(1, usuario.getId());
                pstm.setString(2, item.getRestaurante());  // Supondo que haja um método getRestaurante()
                pstm.setString(3, item.getNome());
                pstm.setDouble(4, item.getPreco());

                pstm.addBatch();
            }

            pstm.executeBatch();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Pedido realizado com sucesso!");

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "PedidoConn: " + error);
        }
    }

    public void imprimirPedido(Usuario usuario) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "SELECT * FROM pedido WHERE usuario_id = ?";

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, usuario.getId());

            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String restaurante = resultSet.getString("restaurante");
                String item = resultSet.getString("item");
                double preco = resultSet.getDouble("preco");

                System.out.println("Restaurante: " + restaurante + ", Item: " + item + ", Preço: " + preco);
            }

            pstm.close();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "PedidoConn: " + error);
        }
    }
}

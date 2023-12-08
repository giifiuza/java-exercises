package connectionDB;
import DTO.Usuario;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioConn {

    Connection conn;
    PreparedStatement pstm;

    public ResultSet autenticacaoUser(Usuario objusuario) {
        conn = new ConexaoDAO().conectaBD();

        try{
            String sql = "select * from usuario where user = ? and senha = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuario.getUser());
            pstm.setString(2, objusuario.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException error){
            JOptionPane.showMessageDialog(null, "UsuarioConn" + error);
            return null;
        }
    }

    public void registerUser(Usuario objuserDTO){
        String sql = "insert into usuario (user, senha, endereco, cpf ) values (?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objuserDTO.getUser());
            pstm.setString(2, objuserDTO.getSenha());
            pstm.setString(3, objuserDTO.getEndereco());
            pstm.setString(4, objuserDTO.getCpf());

            pstm.execute();
            pstm.close();

        }catch (Exception error){
            JOptionPane.showMessageDialog(null, "Usuario Dao" + error );
        }
    }
}

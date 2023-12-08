package VIEW;

import DTO.Usuario;
import connectionDB.UsuarioConn;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Register {
    public Register() {
        App();
    }
    private void App(){
        JFrame tela = new JFrame("Coffee Cove");
        tela.setSize(650, 500);
        tela.setLocation(300, 250);
        tela.setLayout(null);

//        ImageIcon icon = new ImageIcon("C:\\Users\\37076111837\\Desktop\\java-studies\\Delivery\\src\\Imagens\\fundo.png");
//        ImageIcon icon = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Delivery\\src\\VIEW\\Imagens\\fundo.png");
        ImageIcon icon = new ImageIcon("C:\\Users\\giihf\\Desktop\\java-studies\\Delivery\\src\\VIEW\\Imagens\\fundo.png");
        JLabel label = new JLabel(icon);
        label.setBounds(0,0, 800, 473);
        label.setLayout(null);
        tela.add(label);

        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBounds(40, 43, 560, 360);
        label.add(panel);

        JPanel panelImage = new JPanel();
        panelImage.setLayout(null);
        panelImage.setBounds(280,0,280,380);
        panel.add(panelImage);

        JPanel panelInput = new JPanel();
        panelInput.setLayout(null);
        panel.setBackground(Color.white);
        panelInput.setBounds(0,0,280,380);
        panel.add(panelInput);

//        ImageIcon imagem = new ImageIcon("C:\\Users\\37076111837\\Desktop\\java-studies\\Delivery\\src\\Imagens\\coffe.jpg");
//        ImageIcon imagem = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Delivery\\src\\VIEW\\Imagens\\register.jpg");
        ImageIcon imagem = new ImageIcon("C:\\Users\\giihf\\Desktop\\java-studies\\Delivery\\src\\VIEW\\Imagens\\register.jpg");
        JLabel img = new JLabel(imagem);
        img.setBounds(0,-20, 280, 380);
        img.setLayout(null);
        panelImage.add(img);

        JLabel title = new JLabel("Coffee Cove");
        title.setBounds(90, -10, 120, 100);
        Color cor = new Color(192, 149, 105);
        title.setLayout(null);
        title.setForeground(cor);
        title.setFont(new Font("Arial", 1, 20));
        panelInput.add(title);

        JLabel titleUser = new JLabel("User");
        titleUser.setBounds(50, 30, 120, 100);
        titleUser.setLayout(null);
        titleUser.setForeground(cor);
        titleUser.setFont(new Font("Arial", 1, 15));
        panelInput.add(titleUser);

        JTextField inputUser = new JTextField();
        inputUser.setBounds(50, 95, 170, 30);
        inputUser.setForeground(Color.black);
        inputUser.setBorder(new LineBorder(Color.white, 2));
        inputUser.setLayout(null);
        panelInput.add(inputUser);

        JLabel titlePassword = new JLabel("Password");
        titlePassword.setBounds(50, 87, 120, 100);
        titlePassword.setLayout(null);
        titlePassword.setForeground(cor);
        titlePassword.setFont(new Font("Arial", 1, 15));
        panelInput.add(titlePassword);

        JPasswordField inputPassword = new JPasswordField();
        inputPassword.setBounds(50, 150, 170, 30);
        inputPassword.setForeground(Color.black);
        inputPassword.setLayout(null);
        inputPassword.setBorder(new LineBorder(Color.white, 2));
        panelInput.add(inputPassword);

        JLabel titleCPF = new JLabel("CPF");
        titleCPF.setBounds(50, 148, 120, 100);
        titleCPF.setLayout(null);
        titleCPF.setForeground(cor);
        titleCPF.setFont(new Font("Arial", 1, 15));
        panelInput.add(titleCPF);

        JTextField inputCPF = new JTextField();
        inputCPF.setBounds(50, 210, 170, 30);
        inputCPF.setForeground(Color.black);
        inputCPF.setLayout(null);
        inputCPF.setBorder(new LineBorder(Color.white, 2));
        panelInput.add(inputCPF);

        JLabel x = new JLabel("X");
        x.setBounds(50, 200, 120, 100);
        x.setLayout(null);
        x.setForeground(cor);
        x.setFont(new Font("Arial", 1, 13));
        panelInput.add(x);

        JTextField inputX = new JTextField();
        inputX.setBounds(50, 260, 30, 20);
        inputX.setForeground(Color.black);
        inputX.setLayout(null);
        inputX.setBorder(new LineBorder(Color.white, 2));
        panelInput.add(inputX);

        JLabel y = new JLabel("Y");
        y.setBounds(100, 200, 120, 100);
        y.setLayout(null);
        y.setForeground(cor);
        y.setFont(new Font("Arial", 1, 13));
        panelInput.add(y);

        JTextField inputY = new JTextField();
        inputY.setBounds(100, 260, 30, 20);
        inputY.setForeground(Color.black);
        inputY.setLayout(null);
        inputY.setBorder(new LineBorder(Color.white, 2));
        panelInput.add(inputY);

        JButton btn = new JButton("Register");
        btn.setBounds(80, 290, 120, 35);
        btn.setFont(new Font("Arial", 1, 14));
        btn.setForeground(Color.white);
        btn.setBorder(new LineBorder(cor, 2));
        btn.setBackground(cor);
        btn.addActionListener(e ->{

            String user, senha, cpfUser;

            user = inputUser.getText();
            senha = new String (inputPassword.getPassword());
            cpfUser = inputCPF.getText();

            Usuario objusuario = new Usuario();

            objusuario.setUser(user);
            objusuario.setSenha(senha);
            objusuario.setSenha(cpfUser);

            UsuarioConn userCon = new UsuarioConn();
            userCon.registerUser(objusuario);
        });
        panelInput.add(btn);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(80, 320, 120, 35);
        btnLogin.setFont(new Font("Arial", 1, 14));
        Color corBtn = new Color(238,238,238,255);
        btnLogin.setForeground(cor);
        btnLogin.setBackground(corBtn);
        btnLogin.setBorder(new LineBorder(corBtn, 2));
        btnLogin.addActionListener(e -> {
            Login telaLogin  = new Login();

            tela.setVisible(false);
        });
        panelInput.add(btnLogin);

        tela.setVisible(true);
    }

}


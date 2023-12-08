package VIEW;

import javax.swing.*;
import java.awt.*;


public class Produtos {

    public Produtos() {
        Screen();
    }
    private void Screen(){
        JFrame tela = new JFrame("Products");
        tela.setSize(650, 500);
        tela.setLocation(300, 250);
        tela.setLayout(null);

//        ImageIcon icon = new ImageIcon("C:\\Users\\37076111837\\Desktop\\java-studies\\Delivery\\src\\Imagens\\fundo.png");
        ImageIcon icon = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Delivery\\src\\VIEW\\Imagens\\fundo.png");
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
        panelImage.setBounds(0,0,280,380);
        panel.add(panelImage);

        tela.setVisible(true);

    }

}

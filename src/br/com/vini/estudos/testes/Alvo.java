package br.com.vini.estudos.testes;

import javax.swing.*;
import java.awt.*;

public class Alvo extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // desenha o rosto
        g.setColor(Color.YELLOW);
        g.fillOval(10,10,200,200);

        g.setColor(Color.CYAN);
        g.fillOval(35,35,150,150);

        g.setColor(Color.GREEN);
        g.fillOval(55,55,100,100);



    }
}

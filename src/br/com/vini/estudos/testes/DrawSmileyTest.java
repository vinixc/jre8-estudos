package br.com.vini.estudos.testes;

import javax.swing.*;

public class DrawSmileyTest {

    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        Alvo alvo = new Alvo();

        //JFrame application = new JFrame();
       // application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //application.add(panel);
        //application.setSize(230,250);
        //application.setVisible(true);

        JFrame application2 = new JFrame();
        application2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application2.add(alvo);
        application2.setSize(230,250);
        application2.setVisible(true);


    }
}

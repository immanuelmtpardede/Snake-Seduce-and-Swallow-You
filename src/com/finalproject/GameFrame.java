package com.finalproject;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
    GameFrame(int delay){
        this.setVisible(true);
        this.add(new GamePanel(delay));
        this.pack();
        this.setTitle("Snake : Seduce and Swallow You");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
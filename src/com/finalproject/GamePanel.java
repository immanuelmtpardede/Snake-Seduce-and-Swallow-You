package com.finalproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_LEBAR = 890;
    static final int SCREEN_TINGGI = 670;
    static final int UNIT_SISI = 10;
    static final int UNIT_BANYAK = (SCREEN_LEBAR*SCREEN_TINGGI)/(UNIT_SISI*UNIT_SISI);
    final int x[] = new int[UNIT_BANYAK];
    final int y[] = new int[UNIT_BANYAK];
    int tubuh_panjang = 2;
    int skor;
    int makanan_x;
    int makanan_y;
    int racun_banyak = 1;
    int racun_x[] = new int[100];
    int racun_y[] = new int[100];
    char arah = 'R';
    boolean berjalan = false;
    Timer timer;
    Random random;
    boolean jeda = false;
    
    GamePanel(int delay){
        this.setPreferredSize(new Dimension(SCREEN_LEBAR, SCREEN_TINGGI));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        random = new Random();
        startGame(delay);
    }

    public void startGame(int delay) {
        y[0] = 5*UNIT_SISI;
        makanan();
        racun();
        timer = new Timer(delay, this);
        timer.start();
        berjalan = true;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if(berjalan) {
            g.setColor(Color.red);
            g.drawLine(0, 5*UNIT_SISI, SCREEN_LEBAR, 5*UNIT_SISI);
            
            g.setColor(Color.cyan);
            g.fillOval(makanan_x, makanan_y, UNIT_SISI, UNIT_SISI);
            
            for(int i = 0; i < racun_banyak; i++){
                g.setColor(new Color(random.nextInt(255), random.nextInt(255), 0));
                g.fillOval(racun_x[i], racun_y[i], UNIT_SISI, UNIT_SISI);
            }
          
            for(int i = 0; i < tubuh_panjang; i++) {
                if(i == 0) {
                    g.setColor(Color.white);
                    g.fillRect(x[i], y[i], UNIT_SISI, UNIT_SISI);
                }
                else {
                    g.setColor(new Color(255, y[i]%256, x[i]%256));
                    g.fillRect(x[i], y[i], UNIT_SISI, UNIT_SISI);
                }		
            }
            
            g.setColor(Color.white);
            g.setFont(new Font("Broadway", Font.PLAIN, 35));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score : " + skor, (SCREEN_LEBAR - metrics.stringWidth("Score : " + skor))/2, g.getFont().getSize());
        }
        else {
            gameOver(g);
        }
        if(jeda){
            g.setColor(Color.red);
            g.setFont(new Font("Broadway", Font.PLAIN, 70));
            FontMetrics metrics2 = getFontMetrics(g.getFont());
            g.drawString("Jeda", (SCREEN_LEBAR - metrics2.stringWidth("Jeda"))/2, SCREEN_TINGGI/2);
        }
    }

    public void makanan(){
        makanan_x = random.nextInt((int)(SCREEN_LEBAR/UNIT_SISI))*UNIT_SISI;
        makanan_y = (random.nextInt((int)(SCREEN_TINGGI/UNIT_SISI)-5)+5)*UNIT_SISI;
    }
    
    public void racun(){
        for(int i = 0; i < racun_banyak; i++){
            racun_x[i] = random.nextInt((int)(SCREEN_LEBAR/UNIT_SISI))*UNIT_SISI;
            racun_y[i] = (random.nextInt((int)(SCREEN_TINGGI/UNIT_SISI)-5)+5)*UNIT_SISI;
        }
    }

    public void gerak(){
        for(int i = tubuh_panjang; i > 0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        switch(arah) {
        case 'U':
            y[0] = y[0] - UNIT_SISI;
            break;
        case 'D':
            y[0] = y[0] + UNIT_SISI;
            break;
        case 'L':
            x[0] = x[0] - UNIT_SISI;
            break;
        case 'R':
            x[0] = x[0] + UNIT_SISI;
            break;
        }
    }

    public void dimakan() {
        if((x[0] == makanan_x) && (y[0] == makanan_y)) {
            tubuh_panjang++;
            skor++;
            makanan();
            racun_banyak++;
            racun();
        }
        for(int i = 0; i < racun_banyak; i++){
            if((x[0] == racun_x[i]) && (y[0] == racun_y[i])) {
                tubuh_panjang--;
                skor--;
                racun_banyak++;
                racun();
                makanan();
            }
        }
    }

    public void tabrak() {
        for(int i = tubuh_panjang; i > 0; i--) {
            if((x[0] == x[i]) && (y[0] == y[i]))
                berjalan = false;
        }

        if(x[0] < 0) {
            berjalan = false;
        }

        if(x[0] > SCREEN_LEBAR) {
            berjalan = false;
        }

        if(y[0] < 5*UNIT_SISI) {
            berjalan = false;
        }

        if(y[0] > SCREEN_TINGGI) {
            berjalan = false;
        }
        
        if(tubuh_panjang == 0){
            berjalan = false;
        }
        
        if(!berjalan) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
	g.setColor(Color.red);
        g.setFont(new Font("Broadway", Font.PLAIN, 35));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score : " + skor, (SCREEN_LEBAR - metrics1.stringWidth("Score : " + skor))/2, g.getFont().getSize());

        g.setColor(Color.red);
        g.setFont(new Font("Broadway", Font.PLAIN, 70));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_LEBAR - metrics2.stringWidth("Game Over"))/2, SCREEN_TINGGI/2);
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if(arah != 'R') {
                        arah = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(arah != 'L') {
                        arah = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(arah != 'D') {
                        arah = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(arah != 'U') {
                        arah = 'D';
                    }
                    break;
                case KeyEvent.VK_P:
                    jeda = true;
                    timer.stop();
                    break;
                case KeyEvent.VK_R:
                    jeda = false;
                    timer.start();
                    break;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(berjalan) {
            gerak();
            dimakan();
            tabrak();
        }
        repaint();
    }
}
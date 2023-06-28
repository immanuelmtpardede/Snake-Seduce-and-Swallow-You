/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalproject;

/**
 *
 * @author Personal
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        MenuOption = new javax.swing.JPanel();
        Start = new javax.swing.JLabel();
        Rules = new javax.swing.JLabel();
        Background0 = new javax.swing.JLabel();
        StartOption = new javax.swing.JPanel();
        Level1 = new javax.swing.JLabel();
        Level2 = new javax.swing.JLabel();
        Level3 = new javax.swing.JLabel();
        Level4 = new javax.swing.JLabel();
        Level5 = new javax.swing.JLabel();
        BackStart = new javax.swing.JLabel();
        RulesOption = new javax.swing.JPanel();
        BackRules = new javax.swing.JLabel();
        Background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake : Seduce and Swallow You");

        MainPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        MainPanel.setLayout(new java.awt.CardLayout());

        MenuOption.setBackground(new java.awt.Color(255, 255, 255));

        Start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Start.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Start.png")); // NOI18N
        Start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartMouseClicked(evt);
            }
        });

        Rules.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rules.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Rules.png")); // NOI18N
        Rules.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RulesMouseClicked(evt);
            }
        });

        Background0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background0.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Background.jpg")); // NOI18N

        javax.swing.GroupLayout MenuOptionLayout = new javax.swing.GroupLayout(MenuOption);
        MenuOption.setLayout(MenuOptionLayout);
        MenuOptionLayout.setHorizontalGroup(
            MenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rules, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(MenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Start, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE))
            .addGroup(MenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuOptionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Background0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MenuOptionLayout.setVerticalGroup(
            MenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuOptionLayout.createSequentialGroup()
                .addContainerGap(392, Short.MAX_VALUE)
                .addComponent(Rules)
                .addGap(181, 181, 181))
            .addGroup(MenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuOptionLayout.createSequentialGroup()
                    .addContainerGap(278, Short.MAX_VALUE)
                    .addComponent(Start)
                    .addContainerGap(279, Short.MAX_VALUE)))
            .addGroup(MenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuOptionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Background0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        MainPanel.add(MenuOption, "card4");

        StartOption.setBackground(new java.awt.Color(255, 255, 255));

        Level1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Level1.png")); // NOI18N
        Level1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Level1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Level1MouseClicked(evt);
            }
        });

        Level2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Level2.png")); // NOI18N
        Level2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Level2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Level2MouseClicked(evt);
            }
        });

        Level3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Level3.png")); // NOI18N
        Level3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Level3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Level3MouseClicked(evt);
            }
        });

        Level4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Level4.png")); // NOI18N
        Level4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Level4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Level4MouseClicked(evt);
            }
        });

        Level5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Level5.png")); // NOI18N
        Level5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Level5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Level5MouseClicked(evt);
            }
        });

        BackStart.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Back.png")); // NOI18N
        BackStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackStartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout StartOptionLayout = new javax.swing.GroupLayout(StartOption);
        StartOption.setLayout(StartOptionLayout);
        StartOptionLayout.setHorizontalGroup(
            StartOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Level1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addComponent(Level2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Level3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Level4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Level5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(StartOptionLayout.createSequentialGroup()
                .addComponent(BackStart, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        StartOptionLayout.setVerticalGroup(
            StartOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StartOptionLayout.createSequentialGroup()
                .addComponent(BackStart, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Level1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Level2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Level3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Level4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Level5))
        );

        MainPanel.add(StartOption, "card3");

        RulesOption.setBackground(new java.awt.Color(255, 255, 255));
        RulesOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackRules.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackRules.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\Back.png")); // NOI18N
        BackRules.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackRules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackRulesMouseClicked(evt);
            }
        });
        RulesOption.add(BackRules, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Background2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Personal\\Desktop\\Final Project\\ThisIsTheRule.png")); // NOI18N
        RulesOption.add(Background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, -1, -1));

        MainPanel.add(RulesOption, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Level1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level1MouseClicked
        //this.setVisible(false);
        GameFrame n = new GameFrame(77);
        n.setVisible(true);
    }//GEN-LAST:event_Level1MouseClicked

    private void Level2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level2MouseClicked
        //this.setVisible(false);
        GameFrame n = new GameFrame(49);
        n.setVisible(true);
    }//GEN-LAST:event_Level2MouseClicked

    private void Level3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level3MouseClicked
        //this.setVisible(false);
        GameFrame n = new GameFrame(35);
        n.setVisible(true);
    }//GEN-LAST:event_Level3MouseClicked

    private void Level4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level4MouseClicked
        //this.setVisible(false);
        GameFrame n = new GameFrame(14);
        n.setVisible(true);
    }//GEN-LAST:event_Level4MouseClicked

    private void Level5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level5MouseClicked
        //this.setVisible(false);
        GameFrame n = new GameFrame(7);
        n.setVisible(true);
    }//GEN-LAST:event_Level5MouseClicked

    private void StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseClicked
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(StartOption);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_StartMouseClicked

    private void BackStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackStartMouseClicked
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(MenuOption);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_BackStartMouseClicked

    private void RulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RulesMouseClicked
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(RulesOption);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_RulesMouseClicked

    private void BackRulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackRulesMouseClicked
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(MenuOption);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_BackRulesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackRules;
    private javax.swing.JLabel BackStart;
    private javax.swing.JLabel Background0;
    private javax.swing.JLabel Background2;
    private javax.swing.JLabel Level1;
    private javax.swing.JLabel Level2;
    private javax.swing.JLabel Level3;
    private javax.swing.JLabel Level4;
    private javax.swing.JLabel Level5;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuOption;
    private javax.swing.JLabel Rules;
    private javax.swing.JPanel RulesOption;
    private javax.swing.JLabel Start;
    private javax.swing.JPanel StartOption;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.kamil.ociepa.sprawdzian;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author a20ko
 */
public class sprawdzian extends javax.swing.JFrame {

    /**
     * Creates new form sprawdzian
     */
    public sprawdzian() {
        initComponents();
        addKeyListenerTojTextFieldCzlon();
        addKeyListenerTojTextFieldCyfry();
    }
    
    private void addKeyListenerTojTextFieldCzlon(){
        jTextFieldCzlon.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTextFieldCzlon.getText();
                char ch = e.getKeyChar();
                if(ch == 'A' ||ch == 'B' ||ch == 'C' ||ch == 'D' ||ch == 'E' ||ch == 'F' || ch == '-' ){
                    jTextFieldCzlon.setEditable(true);
                }else{
                    jTextFieldCzlon.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void addKeyListenerTojTextFieldCyfry(){
        jTextFieldCyfry.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTextFieldCyfry.getText();
                char ch = e.getKeyChar();
                if( (ch >= '0' && ch <= '9')){
                  
                    jTextFieldCyfry.setEditable(true);
                    
                    
                }else{
                    jTextFieldCyfry.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGlowny = new javax.swing.JPanel();
        jLabelTablica = new javax.swing.JLabel();
        jLabelPierwszyCzlon = new javax.swing.JLabel();
        jLabelCyfry = new javax.swing.JLabel();
        jTextFieldCzlon = new javax.swing.JTextField();
        jTextFieldCyfry = new javax.swing.JTextField();
        jButtonZapisz = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuEdit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelGlowny.setBackground(new java.awt.Color(255, 153, 153));

        jLabelTablica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTablica.setText("Tablica rejestracyjna");

        jLabelPierwszyCzlon.setText("Pierwszy człon");

        jLabelCyfry.setText("Cyfry");

        jTextFieldCzlon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldCyfry.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonZapisz.setText("Zapisz");
        jButtonZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZapiszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGlownyLayout = new javax.swing.GroupLayout(jPanelGlowny);
        jPanelGlowny.setLayout(jPanelGlownyLayout);
        jPanelGlownyLayout.setHorizontalGroup(
            jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGlownyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonZapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanelGlownyLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPierwszyCzlon)
                    .addComponent(jLabelTablica)
                    .addGroup(jPanelGlownyLayout.createSequentialGroup()
                        .addComponent(jTextFieldCzlon, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addGroup(jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCyfry)
                            .addComponent(jTextFieldCyfry, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanelGlownyLayout.setVerticalGroup(
            jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGlownyLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelTablica)
                .addGap(30, 30, 30)
                .addGroup(jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPierwszyCzlon)
                    .addComponent(jLabelCyfry))
                .addGap(5, 5, 5)
                .addGroup(jPanelGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCzlon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCyfry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButtonZapisz)
                .addGap(37, 37, 37))
        );

        jMenuFile.setText("File");
        jMenuBar.add(jMenuFile);

        jMenuEdit.setText("Edit");
        jMenuBar.add(jMenuEdit);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGlowny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGlowny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZapiszActionPerformed
        File f = new File("Kamil_Ociepa.txt");
        String czlon = jTextFieldCzlon.getText();
        String cyfra = jTextFieldCyfry.getText();
        try{
            
            FileWriter fw = new FileWriter(f);
            fw.write(czlon+"/"+cyfra);
            fw.close();
        }catch(IOException e){
            System.out.println("BŁĄD: "+e.toString());
        }
    }//GEN-LAST:event_jButtonZapiszActionPerformed

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
            java.util.logging.Logger.getLogger(sprawdzian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sprawdzian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sprawdzian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sprawdzian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sprawdzian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonZapisz;
    private javax.swing.JLabel jLabelCyfry;
    private javax.swing.JLabel jLabelPierwszyCzlon;
    private javax.swing.JLabel jLabelTablica;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JPanel jPanelGlowny;
    private javax.swing.JTextField jTextFieldCyfry;
    private javax.swing.JTextField jTextFieldCzlon;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_sell;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author zakaria
 */
public class Login_Interface extends javax.swing.JFrame {
      
public static String login ; 

// VARIABLES:
String[] motdepasse = {""," "};
String[] logins={"zakaria",""};
String[] logines={"client"};
String[] motdepasse2={" "};      

        public Login_Interface() {
        initComponents();
   
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connexion");
        setMaximumSize(new java.awt.Dimension(729, 428));
        setMinimumSize(new java.awt.Dimension(729, 428));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nom D'utilisateur  : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mot De Passe :");

        txt_username.setBackground(new java.awt.Color(254, 254, 254));
        txt_username.setForeground(new java.awt.Color(1, 1, 1));
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usernameKeyPressed(evt);
            }
        });

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        jLabel5.setText("*Si Vous Etes Un Acheteur Les Identifiants Vous Seront Envoyés Par Message");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_password)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txt_username)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setText("Connexion(Vendeur) ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton2.setText("Quitter ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton3.setText("Connexion(Acheteur)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 210, 730, 180);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vente De Voitures ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 730, 76);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car_sell/Banner for car selling program zakka.jpg"))); // NOI18N
        jLabel1.setEnabled(false);
        jLabel1.setMaximumSize(new java.awt.Dimension(729, 428));
        jLabel1.setMinimumSize(new java.awt.Dimension(729, 428));
        jLabel1.setPreferredSize(new java.awt.Dimension(729, 428));
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 729, 428);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int pos=-1;
    int i;
  
      for(i=0;i<logins.length;i++)
      {
          if(logins[i].equalsIgnoreCase(this.txt_username.getText()))
          {
              pos =i ;
          }
      }
      if(pos == -1)
          JOptionPane.showMessageDialog(null,"Identifiant Introuvable","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE);
      
       else
          if(!motdepasse[pos].equalsIgnoreCase(this.txt_password.getText()))
          JOptionPane.showMessageDialog(null,"Mot De Passe Incorect","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE );
       else
          {
              login =this.txt_username.getText();
             // LIAISION ENTRE LES 2 CLASSES 
               Vendor_Interface h = new Vendor_Interface();
                h.setVisible(true);
                this.dispose();
          }
          
      
  
     
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        
        int pos=-1;
    int i;
  
      for(i=0;i<logines.length;i++)
      {
          if(logines[i].equalsIgnoreCase(this.txt_username.getText()))
          {
              pos =i ;
          }
      }
      if(pos == -1)
          JOptionPane.showMessageDialog(null,"Identifiant Introuvable","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE);
      
       else
          if(!motdepasse2[pos].equalsIgnoreCase(this.txt_password.getText()))
          JOptionPane.showMessageDialog(null,"Mot De Passe Incorect","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE );
       else
          {
              login =this.txt_username.getText();
             // LIAISION ENTRE LES 2 CLASSES 
             Client_Interface h = new Client_Interface();
                h.setVisible(true);
                this.dispose();
          }
          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  int rep=JOptionPane.showConfirmDialog(this, "Voulez Vous Vraiment Quitter Ce Programme ?", "Car Sell System ", JOptionPane.YES_NO_OPTION);
        if(rep==JOptionPane.YES_OPTION)
        this.dispose();       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
        int pos=-1;
    int i;
  
      for(i=0;i<logins.length;i++)
      {
          if(logins[i].equalsIgnoreCase(this.txt_username.getText()))
          {
              pos =i ;
          }
      }
      if(pos == -1)
          JOptionPane.showMessageDialog(null,"Identifiant Introuvable","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE);
      
       else
          if(!motdepasse[pos].equalsIgnoreCase(this.txt_password.getText()))
          JOptionPane.showMessageDialog(null,"Mot De Passe Incorect","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE );
       else
          {
              login =this.txt_username.getText();
              
             // LIAISION ENTRE LES 2 CLASSES 
              
               Vendor_Interface h = new Vendor_Interface();
                h.setVisible(true);
                this.dispose();
          }
    }//GEN-LAST:event_jButton1KeyTyped

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed

           int pos=-1;
    int i;
  
      for(i=0;i<logines.length;i++)
      {
          if(logines[i].equalsIgnoreCase(this.txt_username.getText()))
          {
              pos =i ;
          }
      }
      if(pos == -1)
          JOptionPane.showMessageDialog(null,"Identifiant Introuvable","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE);
      
       else
          if(!motdepasse2[pos].equalsIgnoreCase(this.txt_password.getText()))
          JOptionPane.showMessageDialog(null,"Mot De Passe Incorect","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE );
       else
          {
              login =this.txt_username.getText();
        // LIAISION ENTRE LES 2 CLASSES 
             Client_Interface h = new Client_Interface();
                h.setVisible(true);
                this.dispose();
          }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyPressed
   if(evt.getKeyCode()==KeyEvent.VK_ENTER)
   {
         int pos=-1;
    int i;
  
      for(i=0;i<logins.length;i++)
      {
          if(logins[i].equalsIgnoreCase(this.txt_username.getText()))
          {
              pos =i ;
          }
      }
      if(pos == -1)
          JOptionPane.showMessageDialog(null,"Identifiant Introuvable","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE);
      
       else
          if(!motdepasse[pos].equalsIgnoreCase(this.txt_password.getText()))
          JOptionPane.showMessageDialog(null,"Mot De Passe Incorect","Erreur Lors De La Connexion",JOptionPane.ERROR_MESSAGE );
       else
          {
              login =this.txt_username.getText();
             // LIAISION ENTRE LES 2 CLASSES 
               Vendor_Interface h = new Vendor_Interface();
                h.setVisible(true);
                this.dispose();
          }
      
      
   }    }//GEN-LAST:event_txt_usernameKeyPressed

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
            java.util.logging.Logger.getLogger(Login_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}

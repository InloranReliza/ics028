package Frames;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null); // tunga mo tunga
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlmain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        Lusername1 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        BttnRegister = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlmain.setBackground(new java.awt.Color(245, 230, 190));
        pnlmain.setForeground(new java.awt.Color(41, 114, 182));
        pnlmain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 174, 239));

        jLabel1.setBackground(new java.awt.Color(0, 174, 239));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/stitch_login_bg.gif"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 230, 190));
        jLabel2.setText("Welcome Home!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pnlmain.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        Lpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lpassword.setForeground(new java.awt.Color(0, 91, 150));
        Lpassword.setText("Password");
        pnlmain.add(Lpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 90, -1));

        txtusername.setBackground(new java.awt.Color(255, 251, 240));
        txtusername.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(0, 91, 150));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        pnlmain.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 370, 50));

        Lusername1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lusername1.setForeground(new java.awt.Color(0, 91, 150));
        Lusername1.setText("Username");
        pnlmain.add(Lusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 90, -1));

        jpassword.setBackground(new java.awt.Color(255, 251, 240));
        jpassword.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jpassword.setForeground(new java.awt.Color(0, 91, 150));
        pnlmain.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 370, 50));

        jToggleButton1.setBackground(new java.awt.Color(255, 140, 66));
        jToggleButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 195));
        jToggleButton1.setText("Login");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        pnlmain.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 370, 48));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 91, 150));
        jLabel3.setText("Dont have an account?");
        pnlmain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

        BttnRegister.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        BttnRegister.setForeground(new java.awt.Color(255, 105, 180));
        BttnRegister.setText("Register Now!");
        BttnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BttnRegisterMouseClicked(evt);
            }
        });
        pnlmain.add(BttnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 110, -1));

        showpass.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        showpass.setForeground(new java.awt.Color(0, 91, 150));
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        pnlmain.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 130, 20));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 34)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 91, 150));
        jLabel4.setText(" Log in to Your Account ");
        pnlmain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 430, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlmain, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String user = txtusername.getText().trim();
        String pass = new String(jpassword.getPassword()).trim();
        
         if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your username and password!.",
                    "Login Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void BttnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BttnRegisterMouseClicked
        Register reg = new Register();
        reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_BttnRegisterMouseClicked

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
            jpassword.setEchoChar((char)0); //ipakita ang password
        }else {
            jpassword.setEchoChar('*');//Taguan ang password
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BttnRegister;
    private javax.swing.JLabel Lpassword;
    private javax.swing.JLabel Lusername1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}

package Frames;
    
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        loadTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Lusername2 = new javax.swing.JLabel();
        Lusername1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        Lpassword = new javax.swing.JLabel();
        txtfullname = new javax.swing.JTextField();
        bttnupdate = new javax.swing.JToggleButton();
        bttndelete = new javax.swing.JToggleButton();
        bttndelete1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmain = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(910, 560));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 595));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 174, 239));

        Lusername2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lusername2.setForeground(new java.awt.Color(255, 255, 255));
        Lusername2.setText("Full Name");

        Lusername1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lusername1.setForeground(new java.awt.Color(255, 255, 255));
        Lusername1.setText("Username");

        txtusername.setBackground(new java.awt.Color(255, 251, 240));
        txtusername.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(0, 91, 150));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        Lpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lpassword.setForeground(new java.awt.Color(255, 255, 255));
        Lpassword.setText("Password");

        txtfullname.setBackground(new java.awt.Color(255, 251, 240));
        txtfullname.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        txtfullname.setForeground(new java.awt.Color(0, 91, 150));
        txtfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfullnameActionPerformed(evt);
            }
        });

        bttnupdate.setBackground(new java.awt.Color(255, 140, 66));
        bttnupdate.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bttnupdate.setForeground(new java.awt.Color(255, 255, 195));
        bttnupdate.setText("Update");
        bttnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnupdateActionPerformed(evt);
            }
        });

        bttndelete.setBackground(new java.awt.Color(255, 140, 66));
        bttndelete.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bttndelete.setForeground(new java.awt.Color(255, 255, 195));
        bttndelete.setText("Delete");
        bttndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttndeleteActionPerformed(evt);
            }
        });

        bttndelete1.setBackground(new java.awt.Color(0, 109, 170));
        bttndelete1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bttndelete1.setForeground(new java.awt.Color(255, 255, 255));
        bttndelete1.setText("Log out");
        bttndelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttndelete1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Management Hub");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ohana ");

        txtpassword.setBackground(new java.awt.Color(255, 251, 240));
        txtpassword.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 91, 150));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lusername2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusername)
                            .addComponent(txtfullname)
                            .addComponent(bttndelete1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txtpassword))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bttnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(118, 118, 118))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(Lusername2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lusername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(bttndelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        jPanel4.setBackground(new java.awt.Color(245, 230, 190));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 91, 150));
        jLabel6.setText("Ohana User List ");

        tblmain.setBackground(new java.awt.Color(255, 249, 227));
        tblmain.setForeground(new java.awt.Color(51, 51, 51));
        tblmain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Full Name", "Username", "Password", "Date Created"
            }
        ));
        tblmain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmain);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel6)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 580, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfullnameActionPerformed

    private void bttnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnupdateActionPerformed
        String fullname, user, pass;
        
        fullname = txtfullname.getText();
        user = txtusername.getText();
        pass = txtpassword.getText();
        
        
        try {
            String url = "jdbc:mysql://localhost/lilo_stitch_db";
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url, "root", "");

            
            String sql = "UPDATE users SET fullname=?, password=? WHERE username=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, fullname);
            pst.setString(2, user);
            pst.setString(3, pass);
            
            int updated = pst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Slayer Record Updated!");
                loadTableData(); // I refresh ang table 
                txtusername.setEditable(true); // para magamit sa sunod
            }
                conn.close();
            
        }catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Update Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bttnupdateActionPerformed

    private void bttndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttndeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttndeleteActionPerformed

    private void bttndelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttndelete1ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttndelete1ActionPerformed

    private void tblmainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmainMouseClicked
        int row = tblmain.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblmain.getModel();

        // Populate the text fields with data from the selected row
        txtfullname.setText(model.getValueAt(row, 0).toString()); // Full Name
        txtusername.setText(model.getValueAt(row, 1).toString());  // Username
        txtpassword.setText(model.getValueAt(row, 2).toString());   // Password

        //Disable the Username field during update to prevent changing the Primary Key
        txtusername.setEditable(false);
    }//GEN-LAST:event_tblmainMouseClicked

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    public void loadTableData() {
        // Note: Changed 'userTable' to 'jTable1' to match your variable declaration
    DefaultTableModel model = (DefaultTableModel) tblmain.getModel();
    model.setRowCount(0); // Clear existing data

    String url = "jdbc:mysql://localhost/lilo_stitch_db";
    String user = "root";
    String password = "";
    
    // Using the exact column names from your database
    String query = "SELECT fullname, username, password, date FROM users"; 
    
    try (java.sql.Connection conn = java.sql.DriverManager.getConnection(url, user, password);
         java.sql.Statement stmt = conn.createStatement();
         java.sql.ResultSet rs = stmt.executeQuery(query)) {

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("fullname"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("date")
            });
        }
    } catch (java.sql.SQLException e) {
        JOptionPane.showMessageDialog(this, "Failed to load data: " + e.getMessage());
    }
    }

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lpassword;
    private javax.swing.JLabel Lusername1;
    private javax.swing.JLabel Lusername2;
    private javax.swing.JToggleButton bttndelete;
    private javax.swing.JToggleButton bttndelete1;
    private javax.swing.JToggleButton bttnupdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmain;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}

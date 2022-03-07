/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author shashank's pc
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        SelectUser();
    }

  Connection Con=null;
    Statement stm=null;
    ResultSet rs=null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UserPhone = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UserPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(83, 231, 43));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 24, 40));
        jLabel1.setText("Inventory Management System");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 420, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 24, 40));
        jLabel2.setText("Manage Users");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 220, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 24, 40));
        jLabel6.setText("UserName");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 24, 40));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 24, 40));
        jLabel8.setText("Phone");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 30));
        jPanel2.add(UserPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, 30));
        jPanel2.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, 30));

        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddButton.setText("Add");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        jPanel2.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 40));

        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateButton.setText("Edit");
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
        });
        jPanel2.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 100, 40));

        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 100, 40));

        HomeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HomeButton.setText("Home");
        jPanel2.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 100, 40));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Password", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UserTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 420, 320));

        jPanel4.setBackground(new java.awt.Color(83, 231, 43));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 810, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 24, 40));
        jLabel3.setText("User List");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 130, 30));

        UserPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserPassActionPerformed(evt);
            }
        });
        jPanel2.add(UserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public  void SelectUser(){
       try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
            stm=Con.createStatement();
            rs=stm.executeQuery("select * from USERTABLE");
            UserTable.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UserPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPassActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        
        try{
             Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
            PreparedStatement add;
            add = Con.prepareStatement("insert into USERTABLE values(?,?,?)");
            add.setString(1,UserName.getText());
            add.setString(2,UserPass.getText());
            add.setString(3, UserPhone.getText());
            
            
            int row;
            row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "User is Succesfully Added");
            Con.close();
            SelectUser();
           
        }
        catch(SQLException e){
            System.out.println(e);
        }    
             
    }//GEN-LAST:event_AddButtonMouseClicked

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
       
        if(UserName.getText().isEmpty() || UserPass.getText().isEmpty() || UserPhone.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing Information");
    }
        else{
            try {
                  Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
                  String updateQuery="update shashankmadaan.USERTABLE set UserName='"+UserName.getText() +"'"+",UserPass='"+UserPass.getText()+"'"+"where UserPhone="+UserPhone.getText()+"'";
                  Statement Add=Con.createStatement();
                  Add.executeUpdate(updateQuery);
                  JOptionPane.showMessageDialog(this,"Userr is Updated Successfully");
                  SelectUser();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_UpdateButtonMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
      
         if(UserPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Phone Number of the User you want to delete");
        }
        else{
            try {
                  Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
                  String Id;
                  Id= UserPhone.getText();
                  String Query="Delete from shashankmadaan.USERTABLE where UserPhone="+"'"+Id+"'";
                  Statement Add =Con.createStatement();
                  Add.executeUpdate(Query);
                  SelectUser();
                   JOptionPane.showMessageDialog(this, "User is Deleted Successfully");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void UserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTableMouseClicked
        
        DefaultTableModel model=(DefaultTableModel)UserTable.getModel();
        int myindex=UserTable.getSelectedRow();
        UserName.setText(model.getValueAt(myindex, 0).toString());
        UserPass.setText(model.getValueAt(myindex, 1).toString());
       UserPhone.setText(model.getValueAt(myindex, 2).toString());
    }//GEN-LAST:event_UserTableMouseClicked

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField UserName;
    private javax.swing.JPasswordField UserPass;
    private javax.swing.JTextField UserPhone;
    private javax.swing.JTable UserTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

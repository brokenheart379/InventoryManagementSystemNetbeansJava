/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inventory;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author shashank's pc
 */
public final class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        SelectProd();
    }

    Connection Con=null;
    Statement stm=null;
    ResultSet rs=null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProdCategory = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ProdID = new javax.swing.JTextField();
        ProdName = new javax.swing.JTextField();
        ProdQty = new javax.swing.JTextField();
        ProdDesc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(83, 231, 43));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 24, 40));
        jLabel1.setText("Manage Product");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 420, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 24, 40));
        jLabel5.setText("Category");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 30));

        ProdCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProdCategory.setForeground(new java.awt.Color(240, 24, 40));
        jPanel1.add(ProdCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 24, 40));
        jLabel6.setText("ProdID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, 30));

        ProdID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProdID.setForeground(new java.awt.Color(240, 24, 40));
        jPanel1.add(ProdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, 30));

        ProdName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProdName.setForeground(new java.awt.Color(240, 24, 40));
        jPanel1.add(ProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 30));

        ProdQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(240, 24, 40));
        jPanel1.add(ProdQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, 30));

        ProdDesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProdDesc.setForeground(new java.awt.Color(240, 24, 40));
        ProdDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdDescActionPerformed(evt);
            }
        });
        jPanel1.add(ProdDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 24, 40));
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 24, 40));
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 24, 40));
        jLabel9.setText("Description");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, 30));

        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddButton.setText("Add");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, 40));

        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateButton.setText("Edit");
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 100, 40));

        HomeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HomeButton.setText("Home");
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 100, 40));

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
        jPanel1.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 100, 40));

        ProductTable.setBackground(new java.awt.Color(204, 204, 204));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProdID", "Name", "Quantity", "Description", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ProductTable.setRowHeight(25);
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 450, 260));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 24, 40));
        jLabel2.setText("Product List");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 160, 30));

        jPanel3.setBackground(new java.awt.Color(83, 231, 43));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 860, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   public  void SelectProd(){
       try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
            stm=Con.createStatement();
            rs=stm.executeQuery("select * from PRODUCTTABLE");
            ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
    private void ProdDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdDescActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        try{
             Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
            PreparedStatement add;
            add = Con.prepareStatement("insert into PRODUCTTABLE values(?,?,?,?,?)");
            add.setInt(1,Integer.valueOf(ProdID.getText()));
            add.setString(2,String.valueOf(ProdName.getText()));
            add.setInt(3,Integer.valueOf(ProdQty.getText()));
            add.setString(4,String.valueOf(ProdDesc.getText()));
            add.setString(5,String.valueOf(ProdCategory.getText()));
            int row;
            row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product is Succesfully Added");
            Con.close();
            SelectProd();
        }
        catch(SQLException e){
            System.out.println(e);
        } 
        
    }//GEN-LAST:event_AddButtonMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
        if(ProdID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Product you want to delete");
        }
        else{
            try {
                  Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
                  String Id;
                  Id = ProdID.getText();
                  String Query="Delete from shashankmadaan.PRODUCTTABLE where ProdId="+Id;
                  Statement Add =Con.createStatement();
                  Add.executeUpdate(Query);
                  SelectProd();
                   JOptionPane.showMessageDialog(this, "Product is Deleted Successfully");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        // TODO add your handling code here:
         new MainForm().setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)ProductTable.getModel();
        int myindex=ProductTable.getSelectedRow();
        ProdID.setText(model.getValueAt(myindex, 0).toString());
        ProdName.setText(model.getValueAt(myindex, 1).toString());
        ProdQty.setText(model.getValueAt(myindex, 2).toString());
         ProdDesc.setText(model.getValueAt(myindex, 3).toString());
         ProdCategory.setText(model.getValueAt(myindex, 4).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseExited

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        // TODO add your handling code here:
        if(ProdID.getText().isEmpty() || ProdName.getText().isEmpty() || ProdQty.getText().isEmpty() || ProdDesc.getText().isEmpty() || ProdCategory.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Missing Information");
    }
        else{
            try {
                  Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
                  String updateQuery="update shashankmadaan.PRODUCTTABLE set ProdName='"+ProdName.getText() + "'"+",ProdQty="+ProdQty.getText()+""+",ProdDesc='"+ProdDesc.getText()+"'"+",ProdCategory='"+ProdCategory.getText()+"'"+"where ProdID="+ProdID.getText();
                  Statement Add=Con.createStatement();
                  Add.executeUpdate(updateQuery);
                  JOptionPane.showMessageDialog(this,"Product is Updated Successfully");
                  SelectProd();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_UpdateButtonMouseClicked

    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JTextField ProdCategory;
    private javax.swing.JTextField ProdDesc;
    private javax.swing.JTextField ProdID;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

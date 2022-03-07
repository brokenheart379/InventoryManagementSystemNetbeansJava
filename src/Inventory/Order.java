package Inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.PreparedStatement;


public class Order extends javax.swing.JFrame {

    
    public Order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
        //update();
    }
  Connection Con=null;
    Statement stm=null;
    ResultSet rs=null;
    
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
    public  void SelectCust(){
       try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
            stm=Con.createStatement();
            rs=stm.executeQuery("select * from CUSTOMERTABLE");
            CustomerTable.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
    
    private void GetToday(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy:MM::dd  HH:mm::ss");
        LocalDateTime now=LocalDateTime.now();
        Datelbl.setText(dtf.format(now));
        
    }
    public  void update(){
        int NewQty=OldQty-Integer.valueOf(Qtylb.getText() );
        try {
            
                  Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
                  String updateQuery="update shashankmadaan.PRODUCTTABLE set PRODQTY="+NewQty+""+"where PRODID="+ProductID;
                  Statement Add=Con.createStatement();
                  Add.executeUpdate(updateQuery);
                  //JOptionPane.showMessageDialog(this,"Category is Updated Successfully");
                  SelectProd();
            } catch (SQLException e) {
                System.out.println(e);
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BillID = new javax.swing.JTextField();
        Qtylb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        AddtoOrderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        CustNamelbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        TotalAmtlbl = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel1.setText("Manage Orders");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 230, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 24, 40));
        jLabel5.setText("Date & Time");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 24, 40));
        jLabel6.setText("OrderID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 90, 30));

        BillID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BillID.setForeground(new java.awt.Color(240, 24, 40));
        jPanel1.add(BillID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 150, 30));

        Qtylb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Qtylb.setForeground(new java.awt.Color(240, 24, 40));
        Qtylb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtylbActionPerformed(evt);
            }
        });
        jPanel1.add(Qtylb, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 150, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 24, 40));
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 90, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 24, 40));
        jLabel9.setText("CustomerName");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 150, 30));

        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddButton.setText("Add Order");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 130, 40));

        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateButton.setText("View Order");
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, 40));

        HomeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HomeButton.setText("Home");
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 110, 40));

        AddtoOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddtoOrderButton.setText("Add To Order");
        AddtoOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddtoOrderButtonMouseClicked(evt);
            }
        });
        AddtoOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoOrderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddtoOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 150, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 450, 190));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 24, 40));
        jLabel2.setText("Product List");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 160, 30));

        jPanel3.setBackground(new java.awt.Color(83, 231, 43));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1070, 30));

        CustomerTable.setBackground(new java.awt.Color(204, 204, 204));
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustID", "Name", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CustomerTable.setRowHeight(25);
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 450, 180));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 24, 40));
        jLabel3.setText("Customer List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 160, 30));

        Datelbl.setBackground(new java.awt.Color(255, 255, 255));
        Datelbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Datelbl.setForeground(new java.awt.Color(240, 24, 40));
        Datelbl.setText("Date");
        jPanel1.add(Datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 200, 30));

        CustNamelbl.setBackground(new java.awt.Color(255, 255, 255));
        CustNamelbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustNamelbl.setForeground(new java.awt.Color(240, 24, 40));
        CustNamelbl.setText("CustName");
        jPanel1.add(CustNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 190, 30));

        OrderTable.setBackground(new java.awt.Color(204, 204, 204));
        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Qty", "UPrice", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        OrderTable.setRowHeight(25);
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(OrderTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 450, 190));

        TotalAmtlbl.setBackground(new java.awt.Color(255, 255, 255));
        TotalAmtlbl.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        TotalAmtlbl.setForeground(new java.awt.Color(240, 24, 40));
        TotalAmtlbl.setText("TotalAmount");
        jPanel1.add(TotalAmtlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, 130, 30));

        Price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price.setForeground(new java.awt.Color(240, 24, 40));
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 24, 40));
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 60, 20));

        Print.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Print.setForeground(new java.awt.Color(240, 24, 40));
        Print.setText("Print");
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
        });
        jPanel1.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 603, 90, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 24, 40));
        jLabel7.setText("Rs.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        if(BillID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter The Order ID");
        }
        else{
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
            PreparedStatement add;
            add = Con.prepareStatement("insert into ORDERTABLE values(?,?,?,?)");
            add.setInt(1,Integer.valueOf(BillID.getText()));
            add.setString(2,CustNamelbl.getText());
            add.setString(3,Datelbl.getText());
            add.setInt(4,Integer.valueOf(TotalAmtlbl.getText()));
            
            int row;
            row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Order is Succesfully Added");
            Con.close();
            SelectProd();
           
        }
        catch(SQLException e){
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        // TODO add your handling code here:
       /* if(ProdID.getText().isEmpty() || ProdName.getText().isEmpty() || Qtylb.getText().isEmpty() || ProdDesc.getText().isEmpty() || ProdCategory.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvMSysDB","shashankmadaan","shashank");
                String updateQuery="update shashankmadaan.PRODUCTTABLE set ProdName='"+ProdName.getText() + "'"+",ProdQty="+Qtylb.getText()+""+",ProdDesc='"+ProdDesc.getText()+"'"+",ProdCategory='"+ProdCategory.getText()+"'"+"where ProdID="+ProdID.getText();
                Statement Add=Con.createStatement();
                Add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this,"Product is Updated Successfully");
                SelectProd();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        */
    }//GEN-LAST:event_UpdateButtonMouseClicked

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        // TODO add your handling code here:
        new MainForm().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_HomeButtonMouseClicked
 int i=1;
 String Prodname;
 int UPrice,total=0,Total;
    private void AddtoOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtoOrderButtonMouseClicked
        if(flag==0 || Qtylb.getText().isEmpty() || Price.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Select Product and Enter the Qty");
        }
        else{
        UPrice=Integer.valueOf(Price.getText());
        total=UPrice * Integer.valueOf(Qtylb.getText());
        Vector vec=new Vector();
        vec.add(i);
        vec.add(Prodname);
        vec.add(Qtylb.getText());
        vec.add(UPrice);
        vec.add(total);
        DefaultTableModel dtm=(DefaultTableModel)OrderTable.getModel();
        dtm.addRow(vec);
        Total=Total+total;
        TotalAmtlbl.setText(""+Total);
        update();
        i++;
        
        }
    }//GEN-LAST:event_AddtoOrderButtonMouseClicked

    private void AddtoOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddtoOrderButtonActionPerformed

    int flag=0,ProductID,OldQty;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)ProductTable.getModel();
        int myindex=ProductTable.getSelectedRow();
        ProductID=Integer.valueOf(model.getValueAt(myindex, 0).toString());
        Prodname=model.getValueAt(myindex, 1).toString();
        Qtylb.setText(model.getValueAt(myindex, 2).toString());
        OldQty=Integer.valueOf(model.getValueAt(myindex, 3).toString());
        //ProdCategory.setText(model.getValueAt(myindex, 4).toString());
        flag=1;
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseExited

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        // TODO add your handling code here:
       DefaultTableModel model=(DefaultTableModel)CustomerTable.getModel();
        int myindex=CustomerTable.getSelectedRow();
        //CustID.setText(model.getValueAt(myindex, 0).toString());
        CustNamelbl.setText(model.getValueAt(myindex, 1).toString());
       // CustPhone.setText(model.getValueAt(myindex, 2).toString());
   
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void QtylbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtylbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtylbActionPerformed

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderTableMouseClicked

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
       
       try{
            OrderTable.print();
       }
       catch(Exception e){
           System.out.println(e);
       }
        
    }//GEN-LAST:event_PrintMouseClicked

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddtoOrderButton;
    private javax.swing.JTextField BillID;
    private javax.swing.JLabel CustNamelbl;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JButton HomeButton;
    private javax.swing.JTable OrderTable;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Print;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField Qtylb;
    private javax.swing.JLabel TotalAmtlbl;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

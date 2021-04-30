/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_Package;

import static java.lang.String.*;
import javax.swing.*;

/**
 *
 * @author kisho
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin_login
     */
    JPanel panels[] = new JPanel[2];
    AdminDb db = new AdminDb();
    
    public Admin() {
        initComponents();
        
        panels[0] = Login;
        panels[1] = Dashboard;
        Dashboard.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Products = new javax.swing.JPanel();
        productsTable = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        new_product = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        productname1 = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        add_status = new javax.swing.JLabel();
        edit_product = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        productname2 = new javax.swing.JTextField();
        price2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        pid_edit = new javax.swing.JTextField();
        edit_status = new javax.swing.JLabel();
        delete_product = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pid_del = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        delete_status = new javax.swing.JLabel();
        Outlet = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        login_status = new javax.swing.JLabel();
        Admin_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin_SCMS");

        jLabel1.setText("SCMS - ADMIN");

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(437, 437, 437))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jLabel5.setText("Dashboard");

        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        productTable.setAutoCreateRowSorter(true);
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductId", "ProductName", "Selling Price", "Sales qty."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productsTable.setViewportView(productTable);

        jLabel4.setText("Add New Product");

        jLabel6.setText("Product Name :");

        jLabel7.setText("Price :");

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout new_productLayout = new javax.swing.GroupLayout(new_product);
        new_product.setLayout(new_productLayout);
        new_productLayout.setHorizontalGroup(
            new_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_productLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(new_productLayout.createSequentialGroup()
                .addGroup(new_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new_productLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, new_productLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new_productLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(add_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(new_productLayout.createSequentialGroup()
                        .addGroup(new_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productname1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        new_productLayout.setVerticalGroup(
            new_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_productLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(new_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(productname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(new_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel8.setText("Edit Product");

        jLabel9.setText("Product ID:");

        jLabel10.setText("Price :");

        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setText("Product Name :");

        javax.swing.GroupLayout edit_productLayout = new javax.swing.GroupLayout(edit_product);
        edit_product.setLayout(edit_productLayout);
        edit_productLayout.setHorizontalGroup(
            edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_productLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(170, 170, 170))
            .addGroup(edit_productLayout.createSequentialGroup()
                .addGroup(edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_productLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_productLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_productLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_status))
                    .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productname2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pid_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        edit_productLayout.setVerticalGroup(
            edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_productLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pid_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(productname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(edit_status))
                .addContainerGap())
        );

        jLabel11.setText("Delete Product");

        jLabel12.setText("Product Id :");

        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delete_productLayout = new javax.swing.GroupLayout(delete_product);
        delete_product.setLayout(delete_productLayout);
        delete_productLayout.setHorizontalGroup(
            delete_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_productLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(delete_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_productLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(delete_status, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pid_del, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_productLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(170, 170, 170))
        );
        delete_productLayout.setVerticalGroup(
            delete_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_productLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(14, 14, 14)
                .addGroup(delete_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pid_del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(delete_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(new_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(delete_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(new_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout ProductsLayout = new javax.swing.GroupLayout(Products);
        Products.setLayout(ProductsLayout);
        ProductsLayout.setHorizontalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productsTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ProductsLayout.setVerticalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productsTable))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Products", Products);

        javax.swing.GroupLayout OutletLayout = new javax.swing.GroupLayout(Outlet);
        Outlet.setLayout(OutletLayout);
        OutletLayout.setHorizontalGroup(
            OutletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
        );
        OutletLayout.setVerticalGroup(
            OutletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Outlets", Outlet);

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(366, 366, 366)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setText("Login Page");

        jLabel3.setText("Enter Admin Password:");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addComponent(Admin_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(login_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(318, 318, 318))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(449, 449, 449)
                .addComponent(jLabel2)
                .addContainerGap(450, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(104, 104, 104)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admin_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(login_status, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(555, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 28, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void renderDashboard(){
        productTable.setModel(db.getProducts());
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login_status.setText("");
        String pwd = valueOf(Admin_Password.getPassword());
        Admin_Password.setText("");
        if(pwd.equals("admin_scms")){
            Login.setVisible(false);
            db.init();
            Dashboard.setVisible(true);
            renderDashboard();
        }else{
            login_status.setText("Invalid Password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Dashboard.setVisible(false);
        Login.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String id = pid_del.getText();
        pid_del.setText("");
        if (id.matches("[0-9]+") && id.length() > 0) {
            int status = db.deleteProduct(Integer.parseInt((id)));
            if(status == -1){
               delete_status.setText("Invalid Product ID");
            }else{
               delete_status.setText("Deleted Successfully");
               renderDashboard();
            }
        }else{
            delete_status.setText("Invalid Product ID");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = pid_edit.getText();
        String pname = productname2.getText();
        String price = price2.getText();
        pid_edit.setText("");
        productname2.setText("");
        price2.setText("");
        
        if (id.matches("[0-9]+") && id.length() > 0) {
            if(pname != ""){
                if(price.matches("[0-9]+") && price.length() > 0){
                    int status = db.updateProduct(Integer.parseInt(id), pname, Integer.parseInt(price));
                    if(status == -1){
                        edit_status.setText("Product doesn't exist");
                    }else{
                        renderDashboard();
                        edit_status.setText("Updated Successfully");
                    }
                }else{
                    edit_status.setText("Invalid Price");
                }
            }
            else{
                edit_status.setText("Invalid Product Name");
            }
        }else{
            edit_status.setText("Invalid Product ID");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String pname = productname1.getText();
        String price = price1.getText();
        productname1.setText("");
        price1.setText("");
        
        if(pname != ""){
            if(price.matches("[0-9]+") && price.length() > 0){
                int status = db.insertProduct(pname, Integer.parseInt(price));
                if(status == -1){
                    add_status.setText("Error Occurred");
                }else{
                    renderDashboard();
                    add_status.setText("Product Added Successfully");
                }
            }else{
                add_status.setText("Invalid Price");
            }
        }else{
            add_status.setText("Invalid Product Name");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Admin_Password;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Outlet;
    private javax.swing.JPanel Products;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel add_status;
    private javax.swing.JPanel delete_product;
    private javax.swing.JLabel delete_status;
    private javax.swing.JPanel edit_product;
    private javax.swing.JLabel edit_status;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel login_status;
    private javax.swing.JPanel new_product;
    private javax.swing.JTextField pid_del;
    private javax.swing.JTextField pid_edit;
    private javax.swing.JTextField price1;
    private javax.swing.JTextField price2;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField productname1;
    private javax.swing.JTextField productname2;
    private javax.swing.JScrollPane productsTable;
    // End of variables declaration//GEN-END:variables
}
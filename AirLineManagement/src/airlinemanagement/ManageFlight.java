/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airlinemanagement;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mdama
 */
public class ManageFlight extends javax.swing.JFrame {

    /**
     * Creates new form ManageFlight
     */
    public ManageFlight() {
        initComponents();
        table_update();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nos = new javax.swing.JTextField();
        fc = new javax.swing.JTextField();
        sc = new javax.swing.JTextField();
        dt = new javax.swing.JTextField();
        deleteBtn = new rojeru_san.complementos.RSButtonHover();
        insertBtn = new rojeru_san.complementos.RSButtonHover();
        updateBtn = new rojeru_san.complementos.RSButtonHover();
        searchBtn = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        to = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Flight");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Seats Available");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Flight Code");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Source");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Destination");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));
        jPanel1.add(nos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 110, -1));
        jPanel1.add(fc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, -1));
        jPanel1.add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, -1));
        jPanel1.add(dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 110, -1));

        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 90, 20));

        insertBtn.setText("INSERT");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        jPanel1.add(insertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 90, 20));

        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 90, 20));

        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 90, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Flight Code", "Source", "Destination", "Take of", "No of Seats"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 760, 410));
        jPanel1.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlinemanagement/jet-border.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 760, 140));

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

    private void table_update(){
        int c;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conr=DriverManager.getConnection("jdbc:mysql://localhost/ams","root","1234");
            String qry ="SELECT * from manageflight";
            
            PreparedStatement pr = conr.prepareStatement(qry);
            
            ResultSet rst= pr.executeQuery();
            
            ResultSetMetaData Rss = rst.getMetaData();

            c =Rss.getColumnCount();

            DefaultTableModel d=(DefaultTableModel)jTable1.getModel();
            
            d.setRowCount(0);
            
              while(rst.next()){
                
                Object o[]={rst.getString("flightcode"),rst.getString("source"),rst.getString("destination"),rst.getString("takeof"),rst.getString("noofseats")};
                d.addRow(o);
                
            }
        }catch(Exception err){
            
        }
    }
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
       try {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection conr = DriverManager.getConnection("jdbc:mysql://localhost/ams", "root", "1234");
        
        String id = fc.getText(); // fc is the text field where you enter the ID
        
        String qry = "SELECT * FROM `manageflight` WHERE flightcode = ?";
        
        PreparedStatement pr = conr.prepareStatement(qry);
        pr.setString(1, id);
        
        ResultSet rst = pr.executeQuery();
        
        DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
        d.setRowCount(0);
        
        while (rst.next()) {
            Object o[] = {rst.getString("flightcode"), rst.getString("source"), rst.getString("destination"), rst.getString("takeof"), rst.getString("noofseats")};
            d.addRow(o);
        }
        
        conr.close();
    } catch (Exception err) {
        JOptionPane.showMessageDialog(this, err);
    }
      if(fc.getText()== null || fc.getText().length()== 0){
            table_update();
        }
      fc.setText("");
      fc.requestFocus();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
  try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conr = DriverManager.getConnection("jdbc:mysql://localhost/ams", "root", "1234");
        Statement st = conr.createStatement();
        String id = fc.getText();

        if (id == null || id.length() == 0) {
            JOptionPane.showMessageDialog(this, "Empty ID or wrong ID");
        } else {
            String checkQuery = "SELECT * FROM `manageflight` WHERE flightcode=?";
            PreparedStatement checkStmt = conr.prepareStatement(checkQuery);
            checkStmt.setString(1, id);
            ResultSet checkResult = checkStmt.executeQuery();

            if (checkResult.next()) {
                String deleteQuery = "DELETE FROM `manageflight` WHERE flightcode=?";
                PreparedStatement pr = conr.prepareStatement(deleteQuery);
                pr.setString(1, id);
                int rowsDeleted = pr.executeUpdate();

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Data deleted successfully");
                    table_update();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete data");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Record with ID " + id + " does not exist");
            }
            fc.setText("");
            fc.requestFocus();
            conr.close();
        }
    } catch (Exception err) {
        JOptionPane.showMessageDialog(this, err);
    }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        try{
            String id= fc.getText();
            String source=sc.getText();
            String des=dt.getText();
            Date selectDate=to.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String tak=sdf.format(selectDate);
            String noofseat=nos.getText();
            Class.forName("com.mysql.jdbc.Driver");

            Connection conr=DriverManager.getConnection("jdbc:mysql://localhost/ams","root","1234");

            //String qry= "UPDATE `manageflight` SET `source`='"+source+"',`destination`='"+des+"',`takeof`='"+tak+"',`noofseats`='"+noofseat+"'";
            String qry = "UPDATE `manageflight` SET `source`=?, `destination`=?, `takeof`=?, `noofseats`=? WHERE `flightcode`=?";

            PreparedStatement pr=conr.prepareStatement(qry);
            pr.setString(1, source);
            pr.setString(2, des);
            pr.setString(3, tak);
            pr.setString(4, noofseat);
            pr.setString(5, id); // Set the flightcode for the record you want to update
    
            int rowsUpdated = pr.executeUpdate();
    
            if (rowsUpdated > 0) {
               JOptionPane.showMessageDialog(this, "Record updated Successfully!");
            } else {
               JOptionPane.showMessageDialog(this, "Record not found or not updated.");
            }
               table_update();
               fc.setText("");
               sc.setText("");
               dt.setText("");
               nos.setText("");
               fc.requestFocus();
               conr.close();
    
         }catch (Exception err) {
             JOptionPane.showMessageDialog(this, err);
         }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection conr=DriverManager.getConnection("jdbc:mysql://localhost/ams","root","1234");

            String qry = "insert into manageflight values (?,?,?,?,?)";

            PreparedStatement pr=conr.prepareStatement(qry);

            pr.setString(1, fc.getText());
            pr.setString(2, sc.getText());
            pr.setString(3, dt.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String date = sdf.format(to.getDate());
            pr.setString(4, date);
            pr.setString(5, nos.getText());

            pr.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Inserted Successfully!");
            table_update();
            fc.setText("");
            sc.setText("");
            dt.setText("");
            nos.setText("");
            fc.requestFocus();
            conr.close();
        }catch(Exception err){
            JOptionPane.showMessageDialog(this, err);
        }
    }//GEN-LAST:event_insertBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManageFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover deleteBtn;
    private javax.swing.JTextField dt;
    private javax.swing.JTextField fc;
    private rojeru_san.complementos.RSButtonHover insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nos;
    private javax.swing.JTextField sc;
    private rojeru_san.complementos.RSButtonHover searchBtn;
    private com.toedter.calendar.JDateChooser to;
    private rojeru_san.complementos.RSButtonHover updateBtn;
    // End of variables declaration//GEN-END:variables
}
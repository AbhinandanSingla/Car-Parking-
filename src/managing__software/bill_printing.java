/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * created by himanshi abd group.
 */

package managing__software;



import java.awt.event.FocusAdapter; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class bill_printing extends javax.swing.JFrame {

    /**
     * Creates new form bill_printing
     */
    public bill_printing() {
        initComponents();
        setSize(1200,570);
        setResizable(false);
       String vehicle="";  
       try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/managing_software","root","");
    Statement stmt=con.createStatement();
    String x="select * from addvehicle";
   // String x1 = " ";
    ResultSet rs=stmt.executeQuery(x);
    while(rs.next())
    {
        vehicle=rs.getString("VEHICLETYPE");
        jComboBox3.addItem(vehicle);
    }
    jComboBox3.setSelectedIndex(0);
ResultSet resultSet = stmt.executeQuery("select billno from bill_printing");
resultSet.afterLast();
while (resultSet.previous()) {
   id = resultSet.getString("billno");
   int no = Integer.parseInt(id);
   ++no;
   id = Integer.toString(no); 
 // JOptionPane.showMessageDialog(this,id);
 jLabel1.setText(id);
  break;
}  
}
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("billno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 140, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("carno");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 200, 80, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("floorno");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 250, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CHARGES");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 380, 110, 50);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 390, 60, 30);

        jTextField2.setForeground(new java.awt.Color(64, 26, 59));
        jTextField2.setName(""); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(250, 190, 170, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(38, 62, 135));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GROUND FLOOR", "FIRST FLOOR", "SECOND FLOOR", "THIRD FLOOR", "FOURTH FLOOR" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(250, 250, 170, 30);

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(770, 100, 330, 360);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("BILL PRINTING");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 10, 360, 60);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("type");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 310, 110, 40);

        jComboBox3.setForeground(new java.awt.Color(97, 110, 41));
        jComboBox3.setAutoscrolls(true);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(250, 320, 170, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 500, 110, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("GET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(223, 500, 110, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("PRINT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(390, 500, 110, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(540, 500, 110, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(530, 20, 120, 40);

        jLabel1.setText("1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 140, 41, 16);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managing__software/OPOPOP.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-6, -6, 1260, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
public String id;

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        area.setText("******************************************\n");
         area.setText(area.getText()+"**       CAR PARKING BILL RECEIPT      **\n\n");
          area.setText(area.getText()+"******************************************\n");
     
      Date obj = new Date();
      String date = obj.toString();
      
        area.setText(area.getText()+"\n"+date+"\n\n");
                    area.setText(area.getText()+"bill no: "+id+"\n\n");
                         area.setText(area.getText()+"car no:"+jTextField2.getText()+"\n\n");
                              area.setText(area.getText()+"floor no:"+jComboBox1.getSelectedItem().toString()+"\n\n");
                                  
                                   area.setText(area.getText()+"type :"+jComboBox3.getSelectedItem().toString()+"\n\n");
                                      
                                     area.setText(area.getText()+"charges:"+jLabel7.getText()+"\n");              
                                       
          
         
      
     
          
          
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
        try
        {
area.print();

        
    }//GEN-LAST:event_jButton3ActionPerformed
catch(Exception ex)
{
    
}
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String carno=jTextField2.getText();
        String floorno=jComboBox1.getSelectedItem().toString();
        String type =jComboBox3.getSelectedItem().toString();
        String ty="";
        String ch="";
        try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/managing_software","root","");
    Statement stmt=con.createStatement();
    String xx="select * from addvehicle where VEHICLETYPE='"+type+"'";
    ResultSet rs=stmt.executeQuery(xx);
     while(rs.next())
    {
        ty=rs.getString("VEHICLETYPE");
        ch=rs.getString("CHARGES");
    }
        String x= "insert into bill_printing values(null,'"+carno+"','"+floorno+"','"+ty+"','"+ch+"')";
       stmt.executeUpdate(x);
ResultSet resultSet = stmt.executeQuery("select billno from bill_printing");
resultSet.afterLast();
while (resultSet.previous()) {
   id = resultSet.getString("billno");
   int no = Integer.parseInt(id);
   ++no;
   id = Integer.toString(no); 
  //JOptionPane.showMessageDialog(this,id);
  jLabel1.setText(id);
  break;
  
}
   
         JOptionPane.showMessageDialog(this,"Done");
   }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex);
        }
        
             
         
             
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 area.setText("");   
jTextField2.setText("");  

jLabel7.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        employeelogin1 e1 = new employeelogin1();
        e1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
     String price="";
   
        String vehicle=jComboBox3.getSelectedItem().toString();
        try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/managing_software","root","");
    Statement stmt=con.createStatement();
    String x="select * from addvehicle where VEHICLETYPE='"+vehicle+"'";
    ResultSet rs=stmt.executeQuery(x);
    while(rs.next())
    {
        price=rs.getString("CHARGES");
    }
   jLabel7.setText(price);
}
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(bill_printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill_printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill_printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill_printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill_printing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

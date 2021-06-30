/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postOffice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static postOffice.ParcelService.Sname_Par;

/**
 *
 * @author Lakshan
 */
public class MoneyOrder extends javax.swing.JFrame {
     ResultSet rs =null;
    Connection conn=DBconnection.connect();

    /**
     * Creates new form MoneyOrder
     */
    public MoneyOrder() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sadd_Money = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Sname_Money = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Amount_Money = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Rname_Money = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Rphno_Money = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Radd_Money = new javax.swing.JTextField();
        Reset_Money = new javax.swing.JButton();
        Submit_Money = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Branch_Money = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postOffice/DOP_header.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 760, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel2.setText("Money Order Service /");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 260, 30));

        jLabel3.setFont(new java.awt.Font("4u-Malith", 0, 28)); // NOI18N
        jLabel3.setText("uqo,a wekjqï fiajdj");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 270, 30));

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postOffice/back3.png"))); // NOI18N
        jButton8.setText("GO Back");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postOffice/money_orders.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 410, 120));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Sender Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 130, 30));

        Sadd_Money.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sadd_Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sadd_MoneyActionPerformed(evt);
            }
        });
        jPanel1.add(Sadd_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 230, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Sender Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, 30));

        Sname_Money.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sname_Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sname_MoneyActionPerformed(evt);
            }
        });
        jPanel1.add(Sname_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 230, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Amount");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 110, 30));

        Amount_Money.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Amount_Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Amount_MoneyActionPerformed(evt);
            }
        });
        jPanel1.add(Amount_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 230, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Recever Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 120, 30));

        Rname_Money.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rname_Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rname_MoneyActionPerformed(evt);
            }
        });
        jPanel1.add(Rname_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 230, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Recever Phone.No");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 160, 30));

        Rphno_Money.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rphno_Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rphno_MoneyActionPerformed(evt);
            }
        });
        jPanel1.add(Rphno_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Recever Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 650, 130, 30));

        Radd_Money.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Radd_Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radd_MoneyActionPerformed(evt);
            }
        });
        jPanel1.add(Radd_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, 230, 30));

        Reset_Money.setBackground(new java.awt.Color(255, 51, 51));
        Reset_Money.setForeground(new java.awt.Color(255, 255, 255));
        Reset_Money.setText("Reset");
        jPanel1.add(Reset_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 820, 110, 40));

        Submit_Money.setBackground(new java.awt.Color(255, 51, 51));
        Submit_Money.setForeground(new java.awt.Color(255, 255, 255));
        Submit_Money.setText("Submit");
        Submit_Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_MoneyActionPerformed(evt);
            }
        });
        jPanel1.add(Submit_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 820, 110, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Branch");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 710, 130, 30));

        Branch_Money.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Branch_Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Branch_MoneyActionPerformed(evt);
            }
        });
        jPanel1.add(Branch_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        MainMenu MM=new MainMenu();
        setVisible(false);
        MM.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Sadd_MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sadd_MoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sadd_MoneyActionPerformed

    private void Sname_MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sname_MoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sname_MoneyActionPerformed

    private void Amount_MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Amount_MoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Amount_MoneyActionPerformed

    private void Rname_MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rname_MoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rname_MoneyActionPerformed

    private void Rphno_MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rphno_MoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rphno_MoneyActionPerformed

    private void Radd_MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radd_MoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radd_MoneyActionPerformed

    private void Branch_MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Branch_MoneyActionPerformed
        // TODO add your handling code here:.
    }//GEN-LAST:event_Branch_MoneyActionPerformed

    private void Submit_MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_MoneyActionPerformed
        // TODO add your handling code here:
        float A_M=Float.parseFloat(Amount_Money.getText());
        int Ph_no_M=Integer.parseInt(Rphno_Money.getText());
         try 
         {
          String MoneyOrderAdd="insert into money_order(Sender_Name,Sender_Address,Amount,Reciver_Name,Reciver_Address,Reciver_PH_No,Branch) values('"+Sname_Money.getText()+"','"+Sadd_Money.getText()+"',"+A_M+",'"+Rname_Money.getText()+"','"+Radd_Money.getText()+"',"+Ph_no_M+",'"+Branch_Money.getText()+"')";
         
            //String Add="insert into parcel_post(Sender_Name)values('abc')";
            //System.out.println(MoneyOrderAdd);
            PreparedStatement ps =conn.prepareStatement(MoneyOrderAdd);
            ps.execute();
            //Notice_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) 
        {
            
             System.out.println(e);
        }
        Amount_Money.setText("");
        Rphno_Money.setText("");
        Sname_Money.setText("");
        Sadd_Money.setText("");
        Rname_Money.setText("");
        Radd_Money.setText("");
        Branch_Money.setText("");
    }//GEN-LAST:event_Submit_MoneyActionPerformed

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
            java.util.logging.Logger.getLogger(MoneyOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoneyOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoneyOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoneyOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount_Money;
    private javax.swing.JTextField Branch_Money;
    private javax.swing.JTextField Radd_Money;
    private javax.swing.JButton Reset_Money;
    private javax.swing.JTextField Rname_Money;
    private javax.swing.JTextField Rphno_Money;
    private javax.swing.JTextField Sadd_Money;
    private javax.swing.JTextField Sname_Money;
    private javax.swing.JButton Submit_Money;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
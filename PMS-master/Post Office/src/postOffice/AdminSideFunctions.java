/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postOffice;

import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Lakshan
 */
public class AdminSideFunctions extends javax.swing.JFrame {
Connection conn=DBconnection.connect();
 ResultSet rs =null;
 int numberRow;
    /**
     * Creates new form AdminSideFunctions
     */
    public AdminSideFunctions() {
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

        jPanel1456 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1456.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1456.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1456.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel1456.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 760, -1));

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
        jPanel1456.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 45));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member Portal /");
        jPanel1456.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 210, -1));

        jLabel3.setFont(new java.awt.Font("4u-Malith", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("idu??l ??ysfodr");
        jPanel1456.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 350, 30));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Goods Request");
        jButton2.setPreferredSize(new java.awt.Dimension(187, 57));
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1456.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 270, 50));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Check Routing");
        jButton3.setPreferredSize(new java.awt.Dimension(187, 57));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1456.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 270, 50));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Edit Profiles");
        jButton4.setPreferredSize(new java.awt.Dimension(187, 57));
        jPanel1456.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 270, 50));

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Add Users");
        jButton5.setPreferredSize(new java.awt.Dimension(187, 57));
        jPanel1456.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 270, 50));

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("View & Delete Users");
        jButton6.setPreferredSize(new java.awt.Dimension(187, 57));
        jPanel1456.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, 270, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postOffice/Sri_Lanka_Post_logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1456.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 490, 200));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postOffice/9703.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1456.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, 310, 220));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postOffice/979a.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1456.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 270, 150));

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Send Daily Summery");
        jButton7.setPreferredSize(new java.awt.Dimension(187, 57));
        jButton7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton7MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton7MouseMoved(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1456.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 270, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1456, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1456, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        AdminSide ASide=new AdminSide();
        setVisible(false);
        ASide.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        // TODO add your handling code here:
        AdminSideSendDailyBillPaySummery ASDBPS=new AdminSideSendDailyBillPaySummery();
        ASDBPS.setVisible(true);
        setVisible(false);
        String ASDBPSQuerery="select * from bill_payments";
        PreparedStatement ps =conn.prepareStatement(ASDBPSQuerery);
        //ps.execute();
        rs=ps.executeQuery();
        while(rs.next()){
            numberRow = rs.getInt("No");
            
        }
        if(numberRow<9)
            ASDBPS.BillPayCount.setText("0"+numberRow);
        else
            ASDBPS.BillPayCount.setText(""+numberRow);    
    } catch (SQLException ex) {
        Logger.getLogger(AdminSideFunctions.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       //AdminSideSendDailyMoneyOrder hh=new AdminSideSendDailyMoneyOrder();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
       
    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseDragged
        // TODO add your handling code here:
       // System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
       
    }//GEN-LAST:event_jButton2MouseDragged

    private void jButton7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseDragged

    private void jButton7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseMoved

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSideFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSideFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSideFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSideFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSideFunctions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1456;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

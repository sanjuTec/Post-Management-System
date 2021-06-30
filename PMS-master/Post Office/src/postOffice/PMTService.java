/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postOffice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import static postOffice.EmailSend.Amount;
import static postOffice.EmailSend.send;

/**
 *
 * @author Lakshan
 */
public class PMTService extends javax.swing.JFrame {
Connection conn=DBconnection.connect();
    /**
     * Creates new form PMTService
     */
    public PMTService() {
        initComponents();
         ErrorDisplayEMO.setVisible(false);
          
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
        Sphn_EMO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Sname_EMO = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Amount_EMO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Rname_EMO = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Rphno_EMO = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Radd_EMO = new javax.swing.JTextField();
        Reset_Money = new javax.swing.JButton();
        Submit_Money = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Branch_EMO = new javax.swing.JTextField();
        EMOAmount = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ErrorDisplayEMO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel2.setText("EMO Service /");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, 30));

        jLabel3.setFont(new java.awt.Font("4u-Malith", 0, 28)); // NOI18N
        jLabel3.setText("bf,lafg%dksla uqo,a yqjurej");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 350, 30));

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
        jLabel5.setText("Sender Phone.No");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 140, 30));

        Sphn_EMO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sphn_EMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sphn_EMOActionPerformed(evt);
            }
        });
        jPanel1.add(Sphn_EMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 230, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Sender Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, 30));

        Sname_EMO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sname_EMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sname_EMOActionPerformed(evt);
            }
        });
        jPanel1.add(Sname_EMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 230, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Amount");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 110, 30));

        Amount_EMO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Amount_EMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Amount_EMOActionPerformed(evt);
            }
        });
        Amount_EMO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Amount_EMOKeyReleased(evt);
            }
        });
        jPanel1.add(Amount_EMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 230, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Recever Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 120, 30));

        Rname_EMO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rname_EMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rname_EMOActionPerformed(evt);
            }
        });
        jPanel1.add(Rname_EMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 230, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Recever Phone.No");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 160, 30));

        Rphno_EMO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rphno_EMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rphno_EMOActionPerformed(evt);
            }
        });
        jPanel1.add(Rphno_EMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Recever E-mail");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 650, 130, 30));

        Radd_EMO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Radd_EMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radd_EMOActionPerformed(evt);
            }
        });
        jPanel1.add(Radd_EMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, 230, 30));

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

        Branch_EMO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Branch_EMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Branch_EMOActionPerformed(evt);
            }
        });
        jPanel1.add(Branch_EMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, 230, 30));

        EMOAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(EMOAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 626, 140, 110));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("Amount (Rs.)");
        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 586, 140, 30));

        ErrorDisplayEMO.setForeground(new java.awt.Color(255, 51, 51));
        ErrorDisplayEMO.setText("You Cannot Enter This Amount");
        jPanel1.add(ErrorDisplayEMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 750, 180, 30));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        MainMenu MM=new MainMenu();
        setVisible(false);
        MM.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Sname_EMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sname_EMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sname_EMOActionPerformed

    private void Amount_EMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Amount_EMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Amount_EMOActionPerformed

    private void Rname_EMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rname_EMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rname_EMOActionPerformed

    private void Rphno_EMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rphno_EMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rphno_EMOActionPerformed

    private void Radd_EMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radd_EMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radd_EMOActionPerformed

    private void Submit_MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_MoneyActionPerformed
        // TODO add your handling code here:
        float A_M=Float.parseFloat(Amount_EMO.getText());
        int Ph_no_R=Integer.parseInt(Rphno_EMO.getText());
        int Ph_no_S=Integer.parseInt(Sphn_EMO.getText());
        //EmailSend ES=new EmailSend(Ph_no_R,A_M);
       // EmailSend. send("sm.manura.96@gmail.com","Manura577$","manura.lakshan8@aiesec.net",""+A_M,""+Ph_no_R);  
        //System.out.println(Ph_no_S);
       try
        {
            String MoneyOrderAdd="insert into emo(Sender_name,Sender_Address,Amount,Reciver_Name,Reciver_Address,Reciver_PH_No,Branch) values('"+Sname_EMO.getText()+"','"+Ph_no_S+"',"+A_M+",'"+Rname_EMO.getText()+"','"+Radd_EMO.getText()+"',"+Ph_no_R+",'"+Branch_EMO.getText()+"')";

            //String Add="insert into parcel_post(Sender_Name)values('abc')";
            //System.out.println(MoneyOrderAdd);
            PreparedStatement ps =conn.prepareStatement(MoneyOrderAdd);
            ps.execute();
            //Notice_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e)
        {

            System.out.println(e);
        }
        /*EMOAmount_Money.setText("");
        Rphno_Money.setText("");
        Sname_Money.setText("");
        Sadd_Money.setText("");
        Rname_Money.setText("");
        Radd_Money.setText("");
        Branch_Money.setText("");*/
    }//GEN-LAST:event_Submit_MoneyActionPerformed

    private void Branch_EMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Branch_EMOActionPerformed
        // TODO add your handling code here:.
    }//GEN-LAST:event_Branch_EMOActionPerformed

    private void Amount_EMOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Amount_EMOKeyReleased
        // TODO add your handling code here:
       
        float TotOFAmount = 0;    
        if(Amount_EMO.getText().length() != 0){
        float GetSendAmount=Float.parseFloat(Amount_EMO.getText());
        if(GetSendAmount>=1 && GetSendAmount<2000){
            TotOFAmount=(float) 13.00;
            ErrorDisplayEMO.setVisible(false);
        }
        else if(GetSendAmount>=2000 && GetSendAmount<10000 ){
             TotOFAmount=(float) 20.00;
              ErrorDisplayEMO.setVisible(false);
        }
        else if(GetSendAmount>=10000 && GetSendAmount< 25000){
             TotOFAmount=(float) 30.00;
              ErrorDisplayEMO.setVisible(false);
        }
        else if(GetSendAmount>=25000 && GetSendAmount<=50000){
             TotOFAmount=(float) 50.00;
              ErrorDisplayEMO.setVisible(false);
        }
        else
        {
            EMOAmount.setText("");
            ErrorDisplayEMO.setVisible(true);
           // ErrorDisplayEMO.setText("");
        }
        EMOAmount.setText(""+TotOFAmount);
         }
         else
         {
             EMOAmount.setText(null);
             ErrorDisplayEMO.setVisible(false);
         }
    }//GEN-LAST:event_Amount_EMOKeyReleased

    private void Sphn_EMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sphn_EMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sphn_EMOActionPerformed

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
            java.util.logging.Logger.getLogger(PMTService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PMTService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PMTService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PMTService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PMTService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount_EMO;
    private javax.swing.JTextField Branch_EMO;
    private javax.swing.JLabel EMOAmount;
    private javax.swing.JLabel ErrorDisplayEMO;
    private javax.swing.JTextField Radd_EMO;
    private javax.swing.JButton Reset_Money;
    private javax.swing.JTextField Rname_EMO;
    private javax.swing.JTextField Rphno_EMO;
    private javax.swing.JTextField Sname_EMO;
    private javax.swing.JTextField Sphn_EMO;
    private javax.swing.JButton Submit_Money;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postOffice;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Lakshan
 */
public class Echannel extends javax.swing.JFrame {

    /**
     * Creates new form Echannel
     */
    public Echannel() {
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
        Dname_Channel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Reset01_Channel = new javax.swing.JButton();
        Next_Channel = new javax.swing.JButton();
        Date_Channel = new com.toedter.calendar.JDateChooser();
        Hospital_Channel = new javax.swing.JComboBox<>();
        Specia_Channel = new javax.swing.JComboBox<>();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel2.setText("E-Channelling /");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 210, 30));

        jLabel3.setFont(new java.awt.Font("4u-Malith", 0, 28)); // NOI18N
        jLabel3.setText("wka;??cd,fhka pek,a ls??u");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 350, 30));

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

        Dname_Channel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dname_Channel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dname_ChannelActionPerformed(evt);
            }
        });
        jPanel1.add(Dname_Channel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 230, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Doctor Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Education\\Level2_Sem_2\\Software Engineering\\project\\header-logo.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 140, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\Education\\Level2_Sem_2\\Software Engineering\\project\\header-logo.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 200, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Specialization ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 130, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Hospital");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 130, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, 100, 30));

        Reset01_Channel.setBackground(new java.awt.Color(255, 51, 51));
        Reset01_Channel.setForeground(new java.awt.Color(255, 255, 255));
        Reset01_Channel.setText("Reset");
        Reset01_Channel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset01_ChannelActionPerformed(evt);
            }
        });
        jPanel1.add(Reset01_Channel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 810, 120, 40));

        Next_Channel.setBackground(new java.awt.Color(255, 51, 51));
        Next_Channel.setForeground(new java.awt.Color(255, 255, 255));
        Next_Channel.setText("Next Page");
        Next_Channel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_ChannelActionPerformed(evt);
            }
        });
        jPanel1.add(Next_Channel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 810, 120, 40));

        Date_Channel.setBackground(new java.awt.Color(255, 51, 51));
        Date_Channel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Date_Channel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, -1, -1));

        Hospital_Channel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT YOUR HOSPITAL", "Lakeside Adventist Hospital, Kandy", "Suwasewana Hospital, Kandy", "Asiri Hospital, Kandy", "MK Hospital, Gampola", "Kandy Private Hospital, Kandy", "Royal Hospital, Anuradhapura", "Suwa Shanthi Private Hospital, Anuradhapura", "Cooperative Hospital, Kurunegala", "Seth Sevana Hospital, Kurunegala", "Miracle Health hospital ,Kurunegala", "Co-operative Hospital, Galle", "Hemas Southern Hospital, Galle", "Roseth Hospital, Ambalangoda", "Ruhunu Hospital, Galle", "Suvana Suva Madiya Hospital, Ambalangoda", "Asiri Hospital, Matara", "Co-operative Hospital, Matara", "Medicare Hospital, Matara", "Monaragala Nursing Home, Monaragala", "Uva Private Hospital, Wellawaya" }));
        jPanel1.add(Hospital_Channel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 230, 30));

        Specia_Channel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SPECIALISATION AREA", "Anaesthetists", "General Surgeons", "Cardiothoracic Surgeons", "Plastic Surgeons", "Neuro Surgeons", "Genito Urinary Surgeons", "Vascular Surgeons", "Gastroenterology Surgeon", "ENT Surgeons", "General Physicians", "Cardiologists", "Resident Cardiologists", "Resident Physicians", "Dermatologists", "Neurologists", "Rheumatologists", "Cardiac Electro Physiologists", "Electro Neuro Physiologists", "Endocrinologists", "Histopathologists", "Haematologists", "Microbiologist", "Radiologists", "Chemical Pathologist", "Gastroenterology Medicine", "Nephrologists", "Pain Management" }));
        Specia_Channel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Specia_ChannelMouseClicked(evt);
            }
        });
        jPanel1.add(Specia_Channel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
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

    private void Dname_ChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dname_ChannelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dname_ChannelActionPerformed

    private void Next_ChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_ChannelActionPerformed
        //TODO add your handling code here:
       int a=Date_Channel.getCalendar().get(Calendar.MONTH)+1;
        int b=Date_Channel.getCalendar().get(Calendar.DATE);
        int c=Date_Channel.getCalendar().get(Calendar.YEAR);
        String SelectedDate=c+"-"+"0"+a+"-"+b;
        String channelling_SelectHospital = Hospital_Channel.getSelectedItem().toString();
        //Date channelling_AppointDate = Date_Channel.getDate();
        String channelling_SelectSpecialist = Specia_Channel.getSelectedItem().toString();
        String Doctor_Name=Dname_Channel.getText();
        Echannel_p2 Echnlp2=new Echannel_p2();
        Echnlp2.channelling_SelectSpecialist=channelling_SelectSpecialist;
        Echnlp2.channelling_SelectHospital=channelling_SelectHospital;
        Echnlp2.channelling_AppointDate=SelectedDate;
        Echnlp2.Doctor_name=Doctor_Name;
        setVisible(false);
        Echnlp2.setVisible(true);
        
      /*  try
        {

            if(Bill_Payment.getText().equals("") && Bill_Phn.getText().equals("") && Bill_UserNme.getText().equals("") && Bill_Account1.getText().equals(""))
            {
                Validate_Bill.setText("Please Fill Every Fields");

            }
            else
            {
                float B_Payment=Float.parseFloat(Bill_Payment.getText());
                int B_Phn=Integer.parseInt(Bill_Phn.getText());
                int B_Acc=Integer.parseInt(Bill_Account1.getText());
                String BT_SelectValue = BillType.getSelectedItem().toString();

                if("Select Bill Type".equals(BT_SelectValue))
                {
                    Billtype_Check.setText("Select Correct Bill Type");
                }
                else
                {
                    Billtype_Check.setVisible(false);
                    String BillPayAdd="insert into bill_payments(User_Name,Account_No,Bill_Type,Phone_No,Amount) values('"+Bill_UserNme.getText()+"',"+B_Acc+",'"+BT_SelectValue+"',"+B_Phn+","+B_Payment+")";
                    PreparedStatement ps =conn.prepareStatement(BillPayAdd);
                    ps.execute();
                }

            }
        }
        catch (Exception e)
        {

            System.out.println(e);
        }
        Bill_Payment.setText("");
        Bill_Phn.setText("");
        Bill_UserNme.setText("");
        Bill_Account1.setText("");*/
        //Date channelling_AppointDate = Date_Channel.getDate();
        //System.out.println(channelling_AppointDate);
    }//GEN-LAST:event_Next_ChannelActionPerformed

    private void Specia_ChannelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Specia_ChannelMouseClicked
        // TODO add your handling code here:
         //String channelling_SelectSpecialist = Specia_Channel.getSelectedItem().toString();
    }//GEN-LAST:event_Specia_ChannelMouseClicked

    private void Reset01_ChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset01_ChannelActionPerformed
        // TODO add your handling code here:
       Dname_Channel.setText(null);
       Date_Channel.setDate(null);
    }//GEN-LAST:event_Reset01_ChannelActionPerformed

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
            java.util.logging.Logger.getLogger(Echannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Echannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Echannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Echannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Echannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser Date_Channel;
    public javax.swing.JTextField Dname_Channel;
    public javax.swing.JComboBox<String> Hospital_Channel;
    private javax.swing.JButton Next_Channel;
    private javax.swing.JButton Reset01_Channel;
    public static javax.swing.JComboBox<String> Specia_Channel;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

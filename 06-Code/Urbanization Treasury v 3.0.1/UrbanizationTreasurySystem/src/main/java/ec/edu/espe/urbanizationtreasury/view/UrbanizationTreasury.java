/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.urbanizationtreasury.view;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class UrbanizationTreasury extends javax.swing.JFrame {

    /**
     * Creates new form UrbanizationTreasury
     */
    
    public UrbanizationTreasury() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        newResident = new javax.swing.JButton();
        residentInformation = new javax.swing.JButton();
        newPayment = new javax.swing.JButton();
        informationTable = new javax.swing.JButton();
        btmEditResident = new javax.swing.JButton();
        btmDeletePayment = new javax.swing.JButton();
        btmPrintResident = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("Urbanization");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Treasury");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setText("System");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        newResident.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newResident.setText("Nuevo Residente");
        newResident.setActionCommand("newResident");
        newResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newResidentActionPerformed(evt);
            }
        });

        residentInformation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        residentInformation.setText("Información del Residente");
        residentInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentInformationActionPerformed(evt);
            }
        });

        newPayment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newPayment.setText("Nuevo Pago");
        newPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPaymentActionPerformed(evt);
            }
        });

        informationTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        informationTable.setText("Tabla de Beneficios");
        informationTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationTableActionPerformed(evt);
            }
        });

        btmEditResident.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btmEditResident.setText("Editar Residente");
        btmEditResident.setActionCommand("newResident");
        btmEditResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEditResidentActionPerformed(evt);
            }
        });

        btmDeletePayment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btmDeletePayment.setText("Eliminar Pago");
        btmDeletePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmDeletePaymentActionPerformed(evt);
            }
        });

        btmPrintResident.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btmPrintResident.setText("Imprimir Residente");
        btmPrintResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmPrintResidentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newResident)
                    .addComponent(informationTable)
                    .addComponent(residentInformation)
                    .addComponent(newPayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmEditResident, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmDeletePayment)
                    .addComponent(btmPrintResident))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newResident)
                    .addComponent(btmEditResident))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentInformation)
                    .addComponent(btmDeletePayment))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPayment)
                    .addComponent(btmPrintResident))
                .addGap(41, 41, 41)
                .addComponent(informationTable)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel3)))
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void residentInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentInformationActionPerformed
        // TODO add your handling code here:
        FrmResidentInformation payment = new FrmResidentInformation();
        payment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_residentInformationActionPerformed

    private void informationTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationTableActionPerformed
        // TODO add your handling code here:
        FrmBenefists benefists = new FrmBenefists();
        benefists.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_informationTableActionPerformed

    private void newPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPaymentActionPerformed
        // TODO add your handling code here:
        FrmNewPayment newPay = new FrmNewPayment();
        newPay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newPaymentActionPerformed

    private void newResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newResidentActionPerformed
        // TODO add your handling code here:
        FrmNewResident newResident1 = new FrmNewResident();
        newResident1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newResidentActionPerformed

    private void btmEditResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEditResidentActionPerformed
        // TODO add your handling code here:
        FrmEditResident editResident = new FrmEditResident();
        editResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btmEditResidentActionPerformed

    private void btmDeletePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmDeletePaymentActionPerformed
        // TODO add your handling code here:
        FrmDeletePayment deletePayment = new FrmDeletePayment();
        deletePayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btmDeletePaymentActionPerformed

    private void btmPrintResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmPrintResidentActionPerformed
        // TODO add your handling code here:
        FrmViewResidents deletePayment = new FrmViewResidents();
        deletePayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btmPrintResidentActionPerformed

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
            java.util.logging.Logger.getLogger(UrbanizationTreasury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrbanizationTreasury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrbanizationTreasury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrbanizationTreasury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrbanizationTreasury().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmDeletePayment;
    private javax.swing.JButton btmEditResident;
    private javax.swing.JButton btmPrintResident;
    private javax.swing.JButton informationTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newPayment;
    private javax.swing.JButton newResident;
    private javax.swing.JButton residentInformation;
    // End of variables declaration//GEN-END:variables
}

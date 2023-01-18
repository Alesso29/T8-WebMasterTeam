package ec.edu.espe.urbanizationtreasury.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.urbanizationtreasury.controller.Controller;
import ec.edu.espe.urbanizationtreasury.model.Resident;
import ec.edu.espe.urbanizationtreasury.utils.IdValidationException;
import javax.swing.JOptionPane;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author cesar
 */
public class FrmNewResident extends javax.swing.JFrame {

    /**
     * Creates new form FrmNewResident
     */
    private static final Resident resident = new Resident();

    public FrmNewResident() {
        initComponents();
        fillTheBatch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cbxBatchNumber = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnAddResident = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuResident = new javax.swing.JMenu();
        mnitNewResident = new javax.swing.JMenuItem();
        mnuitResidentInformation = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuitDeleteResident = new javax.swing.JMenuItem();
        mnuPayment = new javax.swing.JMenu();
        mnuitNewPayment = new javax.swing.JMenuItem();
        mnuItDeletePayment = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuitBenefist = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuitFrequentQuestions = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(629, 639));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("New Resident");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Id:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Batch Number:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Name:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddResident.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddResident.setText("Add Resident");
        btnAddResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddResidentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddResident)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxBatchNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxBatchNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAddResident))
                .addGap(28, 28, 28))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("UrbanizationTreasury");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        jMenu1.add(itmAbout);

        jMenuItem2.setText("Quit");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        mnuResident.setText("Residente");

        mnitNewResident.setText("Nuevo Residente");
        mnitNewResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitNewResidentActionPerformed(evt);
            }
        });
        mnuResident.add(mnitNewResident);

        mnuitResidentInformation.setText("Informacion del Residente");
        mnuitResidentInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitResidentInformationActionPerformed(evt);
            }
        });
        mnuResident.add(mnuitResidentInformation);

        jMenuItem1.setText("Editar Residente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuResident.add(jMenuItem1);

        mnuitDeleteResident.setText("Eliminar Residente");
        mnuitDeleteResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitDeleteResidentActionPerformed(evt);
            }
        });
        mnuResident.add(mnuitDeleteResident);

        jMenuBar1.add(mnuResident);

        mnuPayment.setText("Pagos");
        mnuPayment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuPaymentItemStateChanged(evt);
            }
        });

        mnuitNewPayment.setText("Nuevo Pago");
        mnuitNewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitNewPaymentActionPerformed(evt);
            }
        });
        mnuPayment.add(mnuitNewPayment);

        mnuItDeletePayment.setText("Eliminar Pago");
        mnuItDeletePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItDeletePaymentActionPerformed(evt);
            }
        });
        mnuPayment.add(mnuItDeletePayment);

        jMenuBar1.add(mnuPayment);

        jMenu3.setText("Extra");

        mnuitBenefist.setText("Benefist");
        mnuitBenefist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitBenefistActionPerformed(evt);
            }
        });
        jMenu3.add(mnuitBenefist);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        mnuitFrequentQuestions.setText("Preguntas Frecuentes");
        mnuitFrequentQuestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitFrequentQuestionsActionPerformed(evt);
            }
        });
        jMenu4.add(mnuitFrequentQuestions);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillTheBatch() {
        cbxBatchNumber.addItem("-Selecciona-");
        for (int i = 1; i <= 100; i++) {
            String number = String.valueOf(i);
            cbxBatchNumber.addItem(number);
        }
    }

    private void btnAddResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddResidentActionPerformed
        // TODO add your handling code here:
        String uri = "mongodb+srv://WebMasterTeam:1234@cluster0.zxu5lqj.mongodb.net/?retryWrites=true&w=majority";
        boolean existResident = true;
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("UrbanizationTreasurySystem");

            try {
                //Connect with server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);

                String id = txtId.getText();
                resident.setId(Long.parseLong(id));
                existResident = Controller.noRepeatRecident(database, resident, existResident);
                try {
                    Controller.validateTheId(id);
                    if (existResident == false) {
                        if (cbxBatchNumber.getSelectedItem().toString().equals("-Selecciona-")) {
                            JOptionPane.showMessageDialog(this, "Select the batch number",
                                    "Warning on input data", JOptionPane.WARNING_MESSAGE);
                        } else {
                            MongoCollection<Document> collection = database.getCollection("Residents");
                            Document residentAdded = new Document();
                            long numericValueOfId;
                            int batch;
                            numericValueOfId = Long.parseLong(id);
                            batch = Integer.parseInt(String.valueOf(cbxBatchNumber.getSelectedItem()));
                            residentAdded.append("id", numericValueOfId)
                                    .append("name", txtName.getText())
                                    .append("batch", batch);
                            collection.insertOne(residentAdded);
                            txtId.setText("");
                            txtName.setText("");
                            cbxBatchNumber.setSelectedItem("-Selecciona-");
                            JOptionPane.showMessageDialog(this, "Resident added succesfuly", "Added succesfuly", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "The resident with this id already exists", "Warning on adding data", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (IdValidationException ive) {
                    JOptionPane.showMessageDialog(this, "Invalid Id",
                            "Warning on input data", JOptionPane.WARNING_MESSAGE);
                    txtId.setText("");
                }

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }//GEN-LAST:event_btnAddResidentActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)))
            evt.consume();
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c != ' ' && !(Character.isAlphabetic(c)))
            evt.consume();
    }//GEN-LAST:event_txtNameKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UrbanizationTreasury urbanizationTreasury;
        urbanizationTreasury = new UrbanizationTreasury();
        this.setVisible(false);
        urbanizationTreasury.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        // TODO add your handling code here:
        FrmAbout frmAbout = new FrmAbout();
        frmAbout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmAboutActionPerformed

    private void mnitNewResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitNewResidentActionPerformed
        // TODO add your handling code here:
        FrmNewResident newResident1 = new FrmNewResident();
        newResident1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnitNewResidentActionPerformed

    private void mnuitResidentInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitResidentInformationActionPerformed
        // TODO add your handling code here:
        FrmResidentInformation residentInfo = new FrmResidentInformation();
        residentInfo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitResidentInformationActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FrmEditResident editResident = new FrmEditResident();
        editResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuitDeleteResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitDeleteResidentActionPerformed
        // TODO add your handling code here:
        FrmDeleteResident editResident = new FrmDeleteResident();
        editResident.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitDeleteResidentActionPerformed

    private void mnuitNewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitNewPaymentActionPerformed
        // TODO add your handling code here:
        FrmNewPayment newPay = new FrmNewPayment();
        newPay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitNewPaymentActionPerformed

    private void mnuItDeletePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItDeletePaymentActionPerformed
        // TODO add your handling code here:
        FrmDeletePayment editPayment = new FrmDeletePayment();
        editPayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuItDeletePaymentActionPerformed

    private void mnuPaymentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuPaymentItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPaymentItemStateChanged

    private void mnuitBenefistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitBenefistActionPerformed
        // TODO add your handling code here:
        FrmBenefists benefists = new FrmBenefists();
        benefists.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitBenefistActionPerformed

    private void mnuitFrequentQuestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitFrequentQuestionsActionPerformed
        // TODO add your handling code here:
        FrmFrequentQuestions frecuentQuestions = new FrmFrequentQuestions();
        frecuentQuestions.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitFrequentQuestionsActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNewResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNewResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNewResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNewResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNewResident().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddResident;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbxBatchNumber;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem mnitNewResident;
    private javax.swing.JMenuItem mnuItDeletePayment;
    private javax.swing.JMenu mnuPayment;
    private javax.swing.JMenu mnuResident;
    private javax.swing.JMenuItem mnuitBenefist;
    private javax.swing.JMenuItem mnuitDeleteResident;
    private javax.swing.JMenuItem mnuitFrequentQuestions;
    private javax.swing.JMenuItem mnuitNewPayment;
    private javax.swing.JMenuItem mnuitResidentInformation;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

package ec.edu.espe.urbanizationtreasury.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.urbanizationtreasury.controller.Controller;
import ec.edu.espe.urbanizationtreasury.model.Resident;
import ec.edu.espe.urbanizationtreasury.utils.IdValidationException;
import static ec.edu.espe.urbanizationtreasury.view.FrmNewPayment.resident;
import javax.swing.JOptionPane;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class FrmDeleteResident extends javax.swing.JFrame {

    /**
     * Creates new form FrmEditResident
     */
    public FrmDeleteResident() {
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
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnDeleteResident = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlName = new javax.swing.JLabel();
        jlBatch = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Id:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Elimar Residente");

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setText("<- Atras");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDeleteResident.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDeleteResident.setText("Eliminar Residente");
        btnDeleteResident.setEnabled(false);
        btnDeleteResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteResidentActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Lote:");

        jlName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlBatch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(btnSearch)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jlName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(11, 11, 11)))
                        .addGap(202, 202, 202))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteResident)
                .addGap(192, 192, 192))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnDeleteResident)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)))
        evt.consume();
    }//GEN-LAST:event_txtIdKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UrbanizationTreasury urbanizationTreasury;
        urbanizationTreasury = new UrbanizationTreasury();
        this.dispose();
        urbanizationTreasury.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String uri = "mongodb+srv://WebMasterTeam:1234@cluster0.zxu5lqj.mongodb.net/?retryWrites=true&w=majority";
        boolean existResident = true;

        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("UrbanizationTreasurySystem");

            try {
                //Connect with server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);

                String document = "";
                Gson gson = new Gson();
                String id = txtId.getText();

                resident.setId(Long.parseLong(id));
                existResident = Controller.noRepeatRecident(database, resident, existResident);

                try {
                    Controller.validateTheId(id);

                    if (existResident == true) {
                        MongoCollection<Document> collection = database.getCollection("Residents");
                        Bson filter = Filters.eq("id", resident.getId());
                        Document query = collection.find(Filters.and(filter)).first();
                        document = query.toJson();
                        TypeToken<Resident> type = new TypeToken<Resident>() {
                        };
                        Resident residentData = gson.fromJson(document, type.getType());

                        jlName.setText(residentData.getName());
                        jlBatch.setText(Integer.toString(residentData.getBatch()));
                        txtId.setEnabled(false);                     
                        btnDeleteResident.setEnabled(true);

                    }else {
                        JOptionPane.showMessageDialog(this, "Resident not found", "Warning on finding data", JOptionPane.WARNING_MESSAGE);
                        txtId.setText("");
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
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteResidentActionPerformed
        // TODO add your handling code here:
            String uri = "mongodb+srv://WebMasterTeam:1234@cluster0.zxu5lqj.mongodb.net/?retryWrites=true&w=majority";
            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("UrbanizationTreasurySystem");
                try {
                    //Connect with server
                    Bson command = new BsonDocument("ping", new BsonInt64(1));
                    org.bson.Document commandResult = database.runCommand(command);
                    Document residentEdited = new Document();
                    MongoCollection<Document> collection = database.getCollection("Residents");
                    long id;
                    int batch;
                    id = Long.parseLong(txtId.getText());                                   
                    Bson filter = Filters.eq("id", resident.getId());
                    collection.deleteOne(filter);
                }catch (MongoException me) {
                    System.err.println("An error occurred while attempting to connect: " + me);
                }
            }
            JOptionPane.showMessageDialog(this, "Resident edited succesfuly", "Edited succesfuly", JOptionPane.INFORMATION_MESSAGE);
            jlName.setText("");
            jlBatch.setText("");
            txtId.setEnabled(true);
            txtId.setText("");
            btnDeleteResident.setEnabled(false);
        
    }//GEN-LAST:event_btnDeleteResidentActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDeleteResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDeleteResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDeleteResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDeleteResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrmDeleteResident().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteResident;
    private javax.swing.JButton btnSearch;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlBatch;
    private javax.swing.JLabel jlName;
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
    // End of variables declaration//GEN-END:variables
}

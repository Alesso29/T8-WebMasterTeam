/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
import ec.edu.espe.urbanizationtreasury.model.*;
import ec.edu.espe.urbanizationtreasury.utils.IdValidationException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class FrmNewPayment extends javax.swing.JFrame {

    /**
     * Creates new form FrmNewPayment
     */
    public static final Payment paymentTypeSelect = new Payment();
    public static final Resident resident = new Resident();
    public static final ArrayList<Payment> paymentList = new ArrayList<>();

    public FrmNewPayment() {
        initComponents();
        btmSearch.setEnabled(false);
        btmAdd.setEnabled(false);

        cbBatch.addItem("-Selecciona-");
        for (int i = 1; i <= 100; i++) {
            String number = String.valueOf(i);
            cbBatch.addItem(number);
        }
    }

    public void enableSearchBottom() {
        if (!txtId.getText().isEmpty()) {
            btmSearch.setEnabled(true);
        } else {
            btmSearch.setEnabled(false);
        }
    }

    public void enableAddBottom() {
        if (!txtName.getText().isEmpty() && !cbBatch.getSelectedItem().toString().equals("-Selecciona-")
                && !txtId.getText().isEmpty() && !cbMonth.getSelectedItem().toString().equals("-Selecciona-")
                && !txtPayment.getText().isEmpty()) {
            btmAdd.setEnabled(true);
        } else {
            btmAdd.setEnabled(false);
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

        rbgPaymentType = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbBatch = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbMonth = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        btmSearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        aliquot = new javax.swing.JRadioButton();
        accesscard = new javax.swing.JRadioButton();
        accesscontroll = new javax.swing.JRadioButton();
        extraordinary = new javax.swing.JRadioButton();
        btmAdd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        btmSubmit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuResident = new javax.swing.JMenu();
        mnitNewResident = new javax.swing.JMenuItem();
        mnuitResidentInformation = new javax.swing.JMenuItem();
        mnuPayment = new javax.swing.JMenu();
        mnuitNewPayment = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuitBenefist = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Payments");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Id:");

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Name:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Batch Number:");

        cbBatch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbBatchKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Month:");

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecciona-", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Nobember", "December" }));
        cbMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbMonthKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Payment Value:");

        txtPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentActionPerformed(evt);
            }
        });
        txtPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentKeyTyped(evt);
            }
        });

        btmSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btmSearch.setText("Search");
        btmSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSearchActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Payment type:");

        rbgPaymentType.add(aliquot);
        aliquot.setText("Aliquot");

        rbgPaymentType.add(accesscard);
        accesscard.setText("Acces Card");

        rbgPaymentType.add(accesscontroll);
        accesscontroll.setText("Access Controll");
        accesscontroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accesscontrollActionPerformed(evt);
            }
        });

        rbgPaymentType.add(extraordinary);
        extraordinary.setText("Extraordinary");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aliquot)
                    .addComponent(accesscard))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(extraordinary)
                    .addComponent(accesscontroll))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aliquot)
                    .addComponent(accesscontroll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accesscard)
                    .addComponent(extraordinary))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btmAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btmAdd.setText("Add");
        btmAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(230, 230, 230))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(txtId))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btmSearch)
                                .addGap(150, 150, 150))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addContainerGap(17, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(cbBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmAdd)
                        .addGap(101, 101, 101))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btmSearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btmAdd))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        back.setText("<- Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        btmSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btmSubmit.setText("Submit");
        btmSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btmSubmit)
                .addGap(112, 112, 112)
                .addComponent(back)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(btmSubmit))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(204, 255, 204)));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu3.setText("UrbanizationTreasury");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        jMenu3.add(itmAbout);

        jMenuItem2.setText("Quit");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        mnuResident.setText("Resident");

        mnitNewResident.setText("New Resident");
        mnitNewResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitNewResidentActionPerformed(evt);
            }
        });
        mnuResident.add(mnitNewResident);

        mnuitResidentInformation.setText("Resident Information");
        mnuResident.add(mnuitResidentInformation);

        jMenuBar1.add(mnuResident);

        mnuPayment.setText("Payment");

        mnuitNewPayment.setText("New Payment");
        mnuitNewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitNewPaymentActionPerformed(evt);
            }
        });
        mnuPayment.add(mnuitNewPayment);

        jMenuBar1.add(mnuPayment);

        jMenu5.setText("Extra");

        mnuitBenefist.setText("Benefist");
        mnuitBenefist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitBenefistActionPerformed(evt);
            }
        });
        jMenu5.add(mnuitBenefist);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Help");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        // TODO add your handling code here:
        FrmAbout frmAbout = new FrmAbout();
        frmAbout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmAboutActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btmSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSearchActionPerformed
        // TODO add your handling code here:

        String uri = "mongodb+srv://WebMasterTeam:1234@cluster0.zxu5lqj.mongodb.net/?retryWrites=true&w=majority";
        boolean existResident = true;

        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("UrbanizationTreasurySystem");

            try {
                //Connect with server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

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

                        txtName.setText(residentData.getName());
                        int batch = residentData.getBatch();
                        cbBatch.setSelectedItem(Integer.toString(batch));

                    }
                    if (existResident == false) {
                        JOptionPane.showMessageDialog(this, "Resident not found", "Warning on finding data", JOptionPane.WARNING_MESSAGE);
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
    }//GEN-LAST:event_btmSearchActionPerformed

    private void accesscontrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accesscontrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accesscontrollActionPerformed

    private void btmAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAddActionPerformed
        // TODO add your handling code here:

        String name = "";
        boolean existResident = true;
        Payment payment = new Payment();

        String uri = "mongodb+srv://WebMasterTeam:1234@cluster0.zxu5lqj.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("UrbanizationTreasurySystem");

            try {
                //Connect with server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                String document = "";
                Gson gson = new Gson();
                String id = txtId.getText();
                payment.setIdPayment(Long.parseLong(id));
                resident.setId(Long.parseLong(id));
                existResident = Controller.noRepeatRecident(database, resident, existResident);

                if (cbMonth.getSelectedItem().toString().equals("-Selecciona-")) {
                    JOptionPane.showMessageDialog(this, "Select a month",
                            "Warning on input data", JOptionPane.WARNING_MESSAGE);
                }
                if (!(cbMonth.getSelectedItem().toString().equals("-Selecciona-"))) {
                    payment.setMonth(cbMonth.getSelectedItem().toString());
                }

                rbgPaymentType.add(aliquot);
                rbgPaymentType.add(accesscard);
                rbgPaymentType.add(accesscontroll);
                rbgPaymentType.add(extraordinary);

                if (aliquot.isSelected()) {
                    paymentTypeSelect.setPaymentType("Aliquots");
                }
                if (accesscard.isSelected()) {
                    paymentTypeSelect.setPaymentType("CardPayment");
                }
                if (accesscontroll.isSelected()) {
                    paymentTypeSelect.setPaymentType("ControllPayment");
                }
                if (extraordinary.isSelected()) {
                    paymentTypeSelect.setPaymentType("ExtraordinaryPayment");
                }

                String paymentConvert = txtPayment.getText();
                payment.setPayment(Float.parseFloat(paymentConvert));

                if (paymentTypeSelect.getPaymentType().equals("")) {
                    JOptionPane.showMessageDialog(this, "Select a payment type",
                            "Warning on input data", JOptionPane.WARNING_MESSAGE);
                }
                if (!paymentTypeSelect.getPaymentType().equals("")) {

                    MongoCollection<Document> collection = database.getCollection("Residents");
                    Bson filter = Filters.eq("id", resident.getId());
                    Document query = collection.find(Filters.and(filter)).first();
                    document = query.toJson();
                    TypeToken<Resident> type = new TypeToken<Resident>() {
                    };
                    Resident residentData = gson.fromJson(document, type.getType());

                    int batch = residentData.getBatch();

                    try {
                        Controller.validateTheId(id);

                        if (!"-Selecciona-".equals(cbMonth.getSelectedItem().toString())
                                && residentData.getName().equals(txtName.getText()) && Integer.toString(batch).equals(cbBatch.getSelectedItem())) {

                            if (existResident == true) {

                                paymentList.add(payment);
                            }
                            if (existResident == false) {
                                JOptionPane.showMessageDialog(this, "Resident not found", "Warning on finding data", JOptionPane.WARNING_MESSAGE);
                            }
                        }

                    } catch (IdValidationException ive) {
                        JOptionPane.showMessageDialog(this, "Invalid Id",
                                "Warning on input data", JOptionPane.WARNING_MESSAGE);
                        txtId.setText("");
                    }

                    if (!residentData.getName().equals(txtName.getText()) && !Integer.toString(batch).equals(cbBatch.getSelectedItem())) {

                        JOptionPane.showMessageDialog(this, "The batch number or name entered is incorrect",
                                "Warning on input data", JOptionPane.WARNING_MESSAGE);
                        txtName.setText("");
                        cbBatch.setSelectedItem("-Selecciona-");
                    }

                    txtId.setText("");
                    txtPayment.setText("");
                    cbMonth.setSelectedItem("-Selecciona-");
                    txtName.setText("");
                    cbBatch.setSelectedItem("-Selecciona-");

                }

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
        JOptionPane.showMessageDialog(this, "Payment added succesfuly", "Added succesfuly", JOptionPane.INFORMATION_MESSAGE);

        aliquot.setEnabled(false);
        extraordinary.setEnabled(false);
        accesscard.setEnabled(false);
        accesscontroll.setEnabled(false);

    }//GEN-LAST:event_btmAddActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        UrbanizationTreasury backBtm = new UrbanizationTreasury();
        backBtm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
        enableSearchBottom();
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        enableAddBottom();
    }//GEN-LAST:event_txtNameKeyTyped

    private void cbBatchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbBatchKeyTyped
        // TODO add your handling code here:
        enableAddBottom();
    }//GEN-LAST:event_cbBatchKeyTyped

    private void cbMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbMonthKeyTyped
        // TODO add your handling code here:
        enableAddBottom();
    }//GEN-LAST:event_cbMonthKeyTyped

    private void txtPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c != '.' && !(Character.isDigit(c))) {
            evt.consume();
        }
        enableAddBottom();

    }//GEN-LAST:event_txtPaymentKeyTyped

    private void txtPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentActionPerformed

    private void btmSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSubmitActionPerformed
        // TODO add your handling code here:
        if (!paymentList.isEmpty()) {
            if (paymentTypeSelect.getPaymentType().equals("Aliquots")) {
                FrmAliquot paymentFrame = new FrmAliquot();
                paymentFrame.setVisible(true);
            }
            if (paymentTypeSelect.getPaymentType().equals("CardPayment")) {
                FrmAccessCard CardPaymentFrame = new FrmAccessCard();
                CardPaymentFrame.setVisible(true);
            }
            if (paymentTypeSelect.getPaymentType().equals("ControllPayment")) {
                FrmAccessControll ControllPaymentFrame = new FrmAccessControll();
                ControllPaymentFrame.setVisible(true);
            }
            if (paymentTypeSelect.getPaymentType().equals("ExtraordinaryPayment")) {
                FrmExtraordinaryPayment ExtraordinaryPaymentFrame = new FrmExtraordinaryPayment();
                ExtraordinaryPaymentFrame.setVisible(true);
            }
        }
        if (paymentList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "The data was not added",
                    "Warning on adding data", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btmSubmitActionPerformed


    private void mnitNewResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitNewResidentActionPerformed
        // TODO add your handling code here:
        FrmNewResident newResident1 = new FrmNewResident();
        newResident1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnitNewResidentActionPerformed

    private void mnuitNewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitNewPaymentActionPerformed
        // TODO add your handling code here:
        FrmNewPayment newPay = new FrmNewPayment();
        newPay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitNewPaymentActionPerformed

    private void mnuitBenefistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitBenefistActionPerformed
        // TODO add your handling code here:
        FrmBenefists benefists = new FrmBenefists();
        benefists.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuitBenefistActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNewPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNewPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNewPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNewPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNewPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton accesscard;
    private javax.swing.JRadioButton accesscontroll;
    private javax.swing.JRadioButton aliquot;
    private javax.swing.JButton back;
    private javax.swing.JButton btmAdd;
    private javax.swing.JButton btmSearch;
    private javax.swing.JButton btmSubmit;
    private javax.swing.JComboBox<String> cbBatch;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JRadioButton extraordinary;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenuItem mnitNewResident;
    private javax.swing.JMenu mnuPayment;
    private javax.swing.JMenu mnuResident;
    private javax.swing.JMenuItem mnuitBenefist;
    private javax.swing.JMenuItem mnuitNewPayment;
    private javax.swing.JMenuItem mnuitResidentInformation;
    private javax.swing.ButtonGroup rbgPaymentType;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables
}
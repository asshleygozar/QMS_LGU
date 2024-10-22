/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qms_lgu_inf238;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Counter8 extends javax.swing.JFrame {

    public static Queue<String> counter8Data = new LinkedList<>(); //Data for Waiting Table
    public static Queue<String> onHoldData = new LinkedList<>();  //Data for On Hold Table
    public static Queue<String> noShowData = new LinkedList<>();  // Data for No Show Table
    public static Queue<String> transactionData = new LinkedList<>(); // Data for Transaction Type
    public static Queue<String> certificateData = new LinkedList<>(); // Data for Certificate Type
    public static Queue<String> HoldTransactionData = new LinkedList<>(); // Data for Transaction Type Holding Table
    public static Queue<String> HoldCertificateData = new LinkedList<>(); // Data for Certificate Type Holding Table
    public static Queue <Integer> counter8Queue = new LinkedList<>();
    public static Queue <String> counter8Number = new LinkedList<>();
    public static Queue <String> numberOfCopiesPrice = new LinkedList<>();
    public static Queue <String> HoldNumberOfCopiesPrice = new LinkedList<>();
    public static int counter8Basis = 1;
    JComboBox<String> comboBox;
    private static long startTime;
    public static Timer timer;
    
    public static void simpleAnalytics(){
        if(transactionTypeLabel.getText().equals(Customer.requestCopy) & documentTypeLabel.getText().equals(Customer.birthCert)){
                    Analytics.red++;
                    Analytics.redLabel.setText(Analytics.red + "");
                }else if(transactionTypeLabel.getText().equals(Customer.requestCopy) & documentTypeLabel.getText().equals(Customer.deathCert)){
                    Analytics.blue++;
                    Analytics.blueLabel.setText(Analytics.blue + "");
                }else if(transactionTypeLabel.getText().equals(Customer.requestCopy) & documentTypeLabel.getText().equals(Customer.marriageCert)){
                    Analytics.green++;
                    Analytics.greenLabel.setText(Analytics.green + "");
                }else if(transactionTypeLabel.getText().equals(Customer.requestCopy) & documentTypeLabel.getText().equals(Customer.cenomarCert)){
                    Analytics.yellow++;
                    Analytics.yellowLabel.setText(Analytics.yellow + "");
                }else if(transactionTypeLabel.getText().equals(Customer.amendment) & documentTypeLabel.getText().equals(Customer.birthCert)){
                    Analytics.violet++;
                    Analytics.violetLabel.setText(Analytics.violet + "");
                }else if(transactionTypeLabel.getText().equals(Customer.amendment) & documentTypeLabel.getText().equals(Customer.deathCert)){
                    Analytics.orange++;
                    Analytics.orangeLabel.setText(Analytics.orange + "");
                }else if(transactionTypeLabel.getText().equals(Customer.amendment) & documentTypeLabel.getText().equals(Customer.marriageCert)){
                    Analytics.cyan++;
                    Analytics.cyanLabel.setText(Analytics.cyan + "");
                }else if(transactionTypeLabel.getText().equals(Customer.amendment) & documentTypeLabel.getText().equals(Customer.cenomarCert)){
                    Analytics.pink++;
                    Analytics.pinkLabel.setText(Analytics.pink + "");
                }
    }
    public static void stopTimer(){
            timer.restart();
            timer.stop();
            timeLabel.setText("00:00:00");
            startTime = System.nanoTime();
    }
    public void processTimer(){
        
        startTime = System.nanoTime();
        timer = new Timer(1000, new ActionListener() {
         
            @Override
            public void actionPerformed(ActionEvent e) {
               
                long elapsedTime = System.nanoTime() - startTime;
                long hours = TimeUnit.NANOSECONDS.toHours(elapsedTime);
                long minutes = TimeUnit.NANOSECONDS.toMinutes(elapsedTime) % 60;
                long seconds = TimeUnit.NANOSECONDS.toSeconds(elapsedTime) % 60;

                String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                timeLabel.setText(formattedTime);
            }
        }); 
      timer.start(); 
    }
    public Counter8() {
        initComponents();
        currentNumberField.setHorizontalAlignment(currentNumberField.CENTER);
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
        timeLabel = new javax.swing.JTextField();
        stopButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        WaitingTable = new javax.swing.JTable();
        currentNumberField = new javax.swing.JTextField();
        transactionTypeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        NoShowTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        FinishedTable = new javax.swing.JTable();
        holdButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        transferButton = new javax.swing.JButton();
        noShowButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        OnHoldTable = new javax.swing.JTable();
        processLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        registryLabel = new javax.swing.JLabel();
        registryClerkName = new javax.swing.JLabel();
        recallButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        documentLabel = new javax.swing.JLabel();
        transactionLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        documentTypeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registryLabel1 = new javax.swing.JLabel();
        numberOfCopiesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 4, 94));

        timeLabel.setEditable(false);
        timeLabel.setText("00:00:00");

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        WaitingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Waiting"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(WaitingTable);

        currentNumberField.setEditable(false);
        currentNumberField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        transactionTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        transactionTypeLabel.setText("Request Copy");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current Serving");

        NoShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Show"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(NoShowTable);

        FinishedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Finished"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(FinishedTable);

        holdButton.setText("Hold");
        holdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                holdButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        transferButton.setText("Transfer");
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

        noShowButton.setText("No Show");
        noShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowButtonActionPerformed(evt);
            }
        });

        OnHoldTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "On Hold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(OnHoldTable);

        processLabel.setForeground(new java.awt.Color(255, 255, 255));
        processLabel.setText("Processing Time:");

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        registryLabel.setForeground(new java.awt.Color(255, 255, 255));
        registryLabel.setText("Registry Clerk Name:");

        registryClerkName.setForeground(new java.awt.Color(255, 255, 255));
        registryClerkName.setText("Asshley Gozar");

        recallButton.setText("Recall");
        recallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recallButtonActionPerformed(evt);
            }
        });

        finishButton.setText("Finish");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        documentLabel.setForeground(new java.awt.Color(255, 255, 255));
        documentLabel.setText("Document Type:");

        transactionLabel.setForeground(new java.awt.Color(255, 255, 255));
        transactionLabel.setText("Transaction Type:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Counter 8");

        documentTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        documentTypeLabel.setText("Birth Certficate");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Releasing");

        registryLabel1.setForeground(new java.awt.Color(255, 255, 255));
        registryLabel1.setText("Number Of Copies:");

        numberOfCopiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberOfCopiesLabel.setText("3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(currentNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(148, 148, 148))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(transactionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(processLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transactionTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registryClerkName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numberOfCopiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(holdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(finishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(noShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(transferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(processLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transactionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(transactionTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(documentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentTypeLabel))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(currentNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(registryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numberOfCopiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(registryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(registryClerkName)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(holdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed

       if(!currentNumberField.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "There is still active cutomer!");
      }else{
        nextButton.setEnabled(false);
        finishButton.setEnabled(false);
        stopButton.setEnabled(false);
        holdButton.setEnabled(false);
        noShowButton.setEnabled(false);
        transferButton.setEnabled(false);
        recallButton.setEnabled(false);
        startButton.setEnabled(true);
       }
    }//GEN-LAST:event_stopButtonActionPerformed

    private void holdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_holdButtonActionPerformed

        if(currentNumberField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Current Serving");
        }else{
            
            if(!counter8Data.contains(currentNumberField.getText())){
                
                String onHoldNumbers =  currentNumberField.getText();
        
                Object[]row = {onHoldNumbers};
                DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
                HoldModel.addRow(row);
        
                timer.restart();
                timer.stop();
                timeLabel.setText("00:00:00");
                startTime = System.nanoTime();
                onHoldData.add(onHoldNumbers);
                HoldTransactionData.add(transactionTypeLabel.getText());
                HoldCertificateData.add(documentTypeLabel.getText());
                HoldNumberOfCopiesPrice.add(numberOfCopiesLabel.getText());
                transactionTypeLabel.setText("");
                documentTypeLabel.setText("");
                ScreenNumbers.counter8Screen.setText("--");
                currentNumberField.setText("");
                numberOfCopiesLabel.setText("");
                
            }else{
                String onHoldNumbers =  counter8Data.poll();
        
                Object[]row = {onHoldNumbers};
                DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
                HoldModel.addRow(row);
        
                timer.restart();
                timer.stop();
                timeLabel.setText("00:00:00");
                startTime = System.nanoTime();
                onHoldData.add(onHoldNumbers);
                transactionTypeLabel.setText("");
                documentTypeLabel.setText("");
                currentNumberField.setText("");
                numberOfCopiesLabel.setText("");
                ScreenNumbers.counter8Screen.setText("--");
                HoldTransactionData.add(transactionData.poll());
                HoldCertificateData.add(certificateData.poll());
                HoldNumberOfCopiesPrice.add(numberOfCopiesPrice.poll());
            }
        }
    }//GEN-LAST:event_holdButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        if(counter8Data.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Serving Yet!");
        }else{
            processTimer();
            currentNumberField.setText(counter8Data.peek());
            transactionTypeLabel.setText(transactionData.peek());
            documentTypeLabel.setText(certificateData.peek());
            ScreenNumbers.counter8Screen.setText(currentNumberField.getText());
            DefaultTableModel waitingModel = (DefaultTableModel)WaitingTable.getModel();
            waitingModel.removeRow(0);
            startButton.setEnabled(false);
            nextButton.setEnabled(true);
            finishButton.setEnabled(true);
            stopButton.setEnabled(true);
            holdButton.setEnabled(true);
            noShowButton.setEnabled(true);
            transferButton.setEnabled(true);
            recallButton.setEnabled(true);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed

        if(currentNumberField.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Current Serving is Empty!");
      }else{
        Transfer.invoker = 3;
        new Transfer().setVisible(true);

         } 
    }//GEN-LAST:event_transferButtonActionPerformed

    private void noShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowButtonActionPerformed

         if(currentNumberField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Current Serving!");
        }else{
            
            if(!counter8Data.contains(currentNumberField.getText())){
                
            String noShowNumber = currentNumberField.getText();
            noShowData.add(noShowNumber);
            currentNumberField.setText("");
            timer.restart();
            timer.stop();
            timeLabel.setText("00:00:00");
            startTime = System.nanoTime();
            transactionTypeLabel.setText("");
            documentTypeLabel.setText("");
            numberOfCopiesLabel.setText("");
            ScreenNumbers.counter8Screen.setText("--");
            Object[]row = {noShowNumber};
            DefaultTableModel NoShowModel = (DefaultTableModel)NoShowTable.getModel();
            NoShowModel.addRow(row);
            
            }else{
                
            String noShowNumber = currentNumberField.getText();
            noShowData.add(noShowNumber);
            counter8Data.poll();
            currentNumberField.setText("");
             timer.restart();
             timer.stop();
             timeLabel.setText("00:00:00");
             startTime = System.nanoTime();
            transactionTypeLabel.setText("");
            documentTypeLabel.setText("");
            numberOfCopiesLabel.setText("");
            ScreenNumbers.counter8Screen.setText("--");
            transactionData.poll();
            certificateData.poll();
            numberOfCopiesPrice.poll();
            Object[]row = {noShowNumber};
            DefaultTableModel NoShowModel = (DefaultTableModel)NoShowTable.getModel();
            NoShowModel.addRow(row);
            }
        } 
    }//GEN-LAST:event_noShowButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        if(!currentNumberField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "There is still Active Customer!");
        }
        else{
            if(counter8Data.isEmpty()){

                JOptionPane.showMessageDialog(this, "Queue Table is Empty");
            }else{
                processTimer();
                currentNumberField.setText(counter8Data.peek());
                transactionTypeLabel.setText(transactionData.peek());
                documentTypeLabel.setText(certificateData.peek());
                ScreenNumbers.counter8Screen.setText(currentNumberField.getText());
                numberOfCopiesLabel.setText(numberOfCopiesPrice.peek());
                DefaultTableModel waitingModel = (DefaultTableModel)WaitingTable.getModel();
                DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
                if(counter8Data.contains(currentNumberField.getText())){
                    waitingModel.removeRow(0);
                } else{
                    HoldModel.removeRow(0);
                }
            }
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void recallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recallButtonActionPerformed

        DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
        if(onHoldData.isEmpty()){
            JOptionPane.showMessageDialog(this, "On Hold Table is Empty");
        }else if(!currentNumberField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Currently Serving " + currentNumberField.getText());
        }else{
            processTimer();
            currentNumberField.setText(onHoldData.poll());
            transactionTypeLabel.setText(HoldTransactionData.poll());
            documentTypeLabel.setText(HoldCertificateData.poll());
            ScreenNumbers.counter8Screen.setText(currentNumberField.getText());
            numberOfCopiesLabel.setText(HoldNumberOfCopiesPrice.poll());
            HoldModel.removeRow(0);
        }
    }//GEN-LAST:event_recallButtonActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed

        if(currentNumberField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Current Serving!");
        }else{

            if(!counter8Data.contains(currentNumberField.getText())){

                DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
                if(HoldModel.getRowCount() == -1){
                    JOptionPane.showMessageDialog(this, "On Hold Table is Empty");
                }else{
                    String ticketNumbers = currentNumberField.getText();
                    Object[]row = {ticketNumbers};

                    DefaultTableModel FinishedModel = (DefaultTableModel)Counter8.FinishedTable.getModel();
                
                    counter8Queue.poll();
                    counter8Number.poll();
                    counter8Basis++;
                    FinishedModel.addRow(row);
                    timer.restart();
                    timer.stop();
                    timeLabel.setText("00:00:00");
                    startTime = System.nanoTime();
                    simpleAnalytics();
                    currentNumberField.setText("");
                    transactionTypeLabel.setText("");
                    ScreenNumbers.counter8Screen.setText("--");
                    documentTypeLabel.setText("");
                    numberOfCopiesLabel.setText("");
                }
            }else{
                String ticketNumbers = counter8Data.peek();
                Object[]row = {ticketNumbers};

                DefaultTableModel model = (DefaultTableModel)Counter8.FinishedTable.getModel();
                if(WaitingTable.getRowCount() == -1){
                    JOptionPane.showMessageDialog(this, "Waiting Table is Empty");
                }else{
                    model.addRow(row);

                    if(counter8Data
                        .isEmpty()){
                        JOptionPane.showMessageDialog(this, "Queue is Empty");
                    }else{
                        timer.restart();
                        timer.stop();
                        timeLabel.setText("00:00:00");
                        startTime = System.nanoTime();
                        simpleAnalytics();
                        transactionTypeLabel.setText("");
                        ScreenNumbers.counter8Screen.setText("--");
                        documentTypeLabel.setText("");
                        transactionData.poll();
                        certificateData.poll();
                        counter8Data.poll();
                        currentNumberField.setText("");
                        numberOfCopiesLabel.setText("");
                    }
                }
            }
        }
    }//GEN-LAST:event_finishButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Counter8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Counter8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Counter8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Counter8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Counter8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable FinishedTable;
    public static javax.swing.JTable NoShowTable;
    public static javax.swing.JTable OnHoldTable;
    public static javax.swing.JTable WaitingTable;
    public static javax.swing.JTextField currentNumberField;
    private javax.swing.JLabel documentLabel;
    public static javax.swing.JLabel documentTypeLabel;
    private javax.swing.JButton finishButton;
    private javax.swing.JButton holdButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton noShowButton;
    public static javax.swing.JLabel numberOfCopiesLabel;
    private javax.swing.JLabel processLabel;
    private javax.swing.JButton recallButton;
    private javax.swing.JLabel registryClerkName;
    private javax.swing.JLabel registryLabel;
    private javax.swing.JLabel registryLabel1;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private static javax.swing.JTextField timeLabel;
    private javax.swing.JLabel transactionLabel;
    public static javax.swing.JLabel transactionTypeLabel;
    private javax.swing.JButton transferButton;
    // End of variables declaration//GEN-END:variables
}

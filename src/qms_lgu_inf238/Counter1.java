
package qms_lgu_inf238;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//import static qms_lgu_inf238.TicketNumber.counter1Queue;

public class Counter1 extends javax.swing.JFrame {

    public static Queue<String> counter1Data = new LinkedList<>(); //Data for Waiting Table
    public static Queue<String> onHoldData = new LinkedList<>();  //Data for On Hold Table
    public static Queue<String> noShowData = new LinkedList<>();  // Data for No Show Table
    public static Queue<String> transactionData = new LinkedList<>(); // Data for Transaction Type
    public static Queue<String> certificateData = new LinkedList<>(); // Data for Certificate Type
    public static Queue<String> HoldTransactionData = new LinkedList<>(); // Data for Transaction Type Holding Table
    public static Queue<String> HoldCertificateData = new LinkedList<>(); // Data for Certificate Type Holding Table
    public static Queue <Integer> counter2Queue = new LinkedList<>();
    public static Queue <String> counter2Number = new LinkedList<>();
    public static int counter2Basis = 1;
    public static int timeInvoker = 1;
    JComboBox<String> comboBox;
    private static long startTime;
    public static Timer timer;
    
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
      
      numberOfCopiesField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();  
                }
            }
        });
          
    }
    
    public Counter1() {
        initComponents();
        
        currentNumberField.setHorizontalAlignment(currentNumberField.CENTER);
       
        nextButton.setEnabled(false);
        finishButton.setEnabled(false);
        stopButton.setEnabled(false);
        holdButton.setEnabled(false);
        noShowButton.setEnabled(false);
        transferButton.setEnabled(false);
        recallButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        currentNumberField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        WaitingTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        OnHoldTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        NoShowTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        FinishedTable = new javax.swing.JTable();
        processLabel = new javax.swing.JLabel();
        transactionLabel = new javax.swing.JLabel();
        documentLabel = new javax.swing.JLabel();
        transactionTypeLabel = new javax.swing.JLabel();
        documentTypeLabel = new javax.swing.JLabel();
        registryLabel = new javax.swing.JLabel();
        registryClerkName = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        holdButton = new javax.swing.JButton();
        transferButton = new javax.swing.JButton();
        recallButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JTextField();
        noShowButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        registryLabel1 = new javax.swing.JLabel();
        numberOfCopiesField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 4, 94));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Counter 1");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current Serving");

        currentNumberField.setEditable(false);
        currentNumberField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

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
        WaitingTable.setGridColor(new java.awt.Color(232, 189, 33));
        jScrollPane1.setViewportView(WaitingTable);
        if (WaitingTable.getColumnModel().getColumnCount() > 0) {
            WaitingTable.getColumnModel().getColumn(0).setResizable(false);
        }

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
        OnHoldTable.setGridColor(new java.awt.Color(232, 189, 33));
        jScrollPane2.setViewportView(OnHoldTable);
        if (OnHoldTable.getColumnModel().getColumnCount() > 0) {
            OnHoldTable.getColumnModel().getColumn(0).setResizable(false);
        }

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
        NoShowTable.setGridColor(new java.awt.Color(232, 189, 33));
        jScrollPane3.setViewportView(NoShowTable);
        if (NoShowTable.getColumnModel().getColumnCount() > 0) {
            NoShowTable.getColumnModel().getColumn(0).setResizable(false);
        }

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
        FinishedTable.setGridColor(new java.awt.Color(232, 189, 33));
        jScrollPane4.setViewportView(FinishedTable);
        if (FinishedTable.getColumnModel().getColumnCount() > 0) {
            FinishedTable.getColumnModel().getColumn(0).setResizable(false);
        }

        processLabel.setForeground(new java.awt.Color(255, 255, 255));
        processLabel.setText("Processing Time:");

        transactionLabel.setForeground(new java.awt.Color(255, 255, 255));
        transactionLabel.setText("Transaction Type:");

        documentLabel.setForeground(new java.awt.Color(255, 255, 255));
        documentLabel.setText("Document Type:");

        transactionTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        transactionTypeLabel.setText("Request Copy");

        documentTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        documentTypeLabel.setText("Birth Certficate");

        registryLabel.setForeground(new java.awt.Color(255, 255, 255));
        registryLabel.setText("Number of Copies");

        registryClerkName.setForeground(new java.awt.Color(255, 255, 255));
        registryClerkName.setText("Asshley Gozar");

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        holdButton.setText("Hold");
        holdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                holdButtonActionPerformed(evt);
            }
        });

        transferButton.setText("Transfer");
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

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

        timeLabel.setEditable(false);
        timeLabel.setText("00:00:00");

        noShowButton.setText("No Show");
        noShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        registryLabel1.setForeground(new java.awt.Color(255, 255, 255));
        registryLabel1.setText("Registry Clerk Name:");

        numberOfCopiesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfCopiesFieldActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Screening");

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
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currentNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(143, 143, 143))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(transactionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numberOfCopiesField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registryClerkName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentTypeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transactionTypeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(processLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(timeLabel)))
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
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(processLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(transactionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transactionTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(documentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentTypeLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(currentNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registryClerkName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(registryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberOfCopiesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
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
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        if(counter1Data.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Serving Yet!");
        }else{
        processTimer();
        currentNumberField.setText(counter1Data.peek());
        transactionTypeLabel.setText(transactionData.peek());
        documentTypeLabel.setText(certificateData.peek());
        ScreenNumbers.counter1Screen.setText(currentNumberField.getText());
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

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
      
     if(!currentNumberField.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "There is still Active Customer!");
     }
     else{
       if(counter1Data.isEmpty()){
           
            JOptionPane.showMessageDialog(this, "Queue Table is Empty");
           }else{
             processTimer();
             currentNumberField.setText(counter1Data.peek());
             transactionTypeLabel.setText(transactionData.peek());
             documentTypeLabel.setText(certificateData.peek());
             ScreenNumbers.counter1Screen.setText(currentNumberField.getText());
             DefaultTableModel waitingModel = (DefaultTableModel)WaitingTable.getModel();
             DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
            if(counter1Data.contains(currentNumberField.getText())){
             waitingModel.removeRow(0);
           } else{
            HoldModel.removeRow(0);
             }
         }
     }
        
        
         

        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        
    
     if(currentNumberField.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "No Current Serving!");
     }else{
         if(numberOfCopiesField.getText().isEmpty())    {
        JOptionPane.showMessageDialog(this, "Input How many Copies does they want.");
    }else{
        
        if(!counter1Data.contains(currentNumberField.getText())){
            
          DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
           if(HoldModel.getRowCount() == -1){
            JOptionPane.showMessageDialog(this, "On Hold Table is Empty");
           }else{
            String ticketNumbers = currentNumberField.getText();
            Object[]row = {ticketNumbers};
            
            DefaultTableModel FinishedModel = (DefaultTableModel)Counter1.FinishedTable.getModel();
           
            counter2Queue.add(counter2Basis);
            DefaultTableModel counter = (DefaultTableModel)Counter2.WaitingTable.getModel();
            counter2Number.add("B-"+counter2Queue.peek().toString());
            Counter2.counter2Data.add(counter2Number.peek());
            Object[]counterRow4 = {counter2Number.peek()};
            counter.addRow(counterRow4);
            String numberValue = numberOfCopiesField.getText();
            int numValue = Integer.parseInt(numberValue);
            numberOfCopiesField.setText("");
            Counter2.numberOfCopies.add(numValue);
            counter2Queue.poll();
            counter2Number.poll();
            counter2Basis++;
            //counter1Queue.poll();
            transactionData.poll();
            certificateData.poll();
            FinishedModel.addRow(row);
            Counter2.transactionData.add(transactionTypeLabel.getText());
            Counter2.certificateData.add(documentTypeLabel.getText());
            timer.restart();
            timer.stop();
            timeLabel.setText("00:00:00");
            startTime = System.nanoTime();
            currentNumberField.setText("");
            ScreenNumbers.counter1Screen.setText("--");
            transactionTypeLabel.setText("");
            documentTypeLabel.setText("");
            
            
              
           }
       }else{
          String ticketNumbers = counter1Data.peek();
          Object[]row = {ticketNumbers};
        
          DefaultTableModel model = (DefaultTableModel)Counter1.FinishedTable.getModel();
            if(WaitingTable.getRowCount() == -1){
              JOptionPane.showMessageDialog(this, "Waiting Table is Empty");
            }else{
              model.addRow(row);
              
              if(counter1Data.isEmpty()){
              JOptionPane.showMessageDialog(this, "Queue is Empty");
              }else{
                  
               counter2Queue.add(counter2Basis);
               DefaultTableModel counter = (DefaultTableModel)Counter2.WaitingTable.getModel();
               counter2Number.add("B-"+counter2Queue.peek().toString());
               Counter2.counter2Data.add(counter2Number.peek());
               Object[]counterRow4 = {counter2Number.peek()};
               counter.addRow(counterRow4);
               
               counter2Queue.poll();
               counter2Number.poll();
               counter2Basis++;
               
                
               
                   String numberValue = numberOfCopiesField.getText();
                   int numValue = Integer.parseInt(numberValue);
                   Counter2.numberOfCopies.add(numValue);
                   numberOfCopiesField.setText("");
                timer.restart();
                timer.stop();
                timeLabel.setText("00:00:00");
                startTime = System.nanoTime();
                transactionTypeLabel.setText("");
                documentTypeLabel.setText("");
                ScreenNumbers.counter1Screen.setText("--");
                Counter2.transactionData.add(transactionData.poll());
                Counter2.certificateData.add(certificateData.poll());
                counter1Data.poll();
                currentNumberField.setText("");
            }
        }      
     }
  }      
        }    
    }//GEN-LAST:event_finishButtonActionPerformed

    private void holdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_holdButtonActionPerformed
        
        
        if(currentNumberField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Current Serving");
        }else{
            
            if(!counter1Data.contains(currentNumberField.getText())){
                
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
                transactionTypeLabel.setText("");
                documentTypeLabel.setText("");
                currentNumberField.setText("");
                ScreenNumbers.counter1Screen.setText("--");
                
            }else{
                String onHoldNumbers =  counter1Data.poll();
        
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
                ScreenNumbers.counter1Screen.setText("--");
                HoldTransactionData.add(transactionData.poll());
                HoldCertificateData.add(certificateData.poll());
            }
        }
    }//GEN-LAST:event_holdButtonActionPerformed

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
        ScreenNumbers.counter1Screen.setText(currentNumberField.getText());
       //onHoldData.poll();
        HoldModel.removeRow(0);
        }
    }//GEN-LAST:event_recallButtonActionPerformed

    private void noShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowButtonActionPerformed
        
        if(currentNumberField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Current Serving!");
        }else{
            
            if(!counter1Data.contains(currentNumberField.getText())){
                String noShowNumber = currentNumberField.getText();
                noShowData.add(noShowNumber);
               // counter1Queue.poll();
                currentNumberField.setText("");
                timer.restart();
                timer.stop();
                timeLabel.setText("00:00:00");
                startTime = System.nanoTime();
                transactionTypeLabel.setText("");
                documentTypeLabel.setText("");
                transactionTypeLabel.setText("");
                documentTypeLabel.setText("");
                numberOfCopiesField.setText("");
                ScreenNumbers.counter1Screen.setText("--");
                Object[]row = {noShowNumber};
                DefaultTableModel NoShowModel = (DefaultTableModel)NoShowTable.getModel();
                NoShowModel.addRow(row);
            }else{
                String noShowNumber = currentNumberField.getText();
                noShowData.add(noShowNumber);
                counter1Data.poll();
                currentNumberField.setText("");
                timer.restart();
                timer.stop();
                timeLabel.setText("00:00:00");
                startTime = System.nanoTime();
                transactionTypeLabel.setText("");
                documentTypeLabel.setText("");
                transactionTypeLabel.setText("");
                documentTypeLabel.setText("");
                numberOfCopiesField.setText("");
                ScreenNumbers.counter1Screen.setText("--");
                transactionData.poll(); 
                certificateData.poll();
                Object[]row = {noShowNumber};
                DefaultTableModel NoShowModel = (DefaultTableModel)NoShowTable.getModel();
                NoShowModel.addRow(row);
            }
        }
    }//GEN-LAST:event_noShowButtonActionPerformed

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

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        
      if(currentNumberField.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Current Serving is Empty!");
      }else{
        Transfer.invoker = 0;
        new Transfer().setVisible(true);

         }  
    }//GEN-LAST:event_transferButtonActionPerformed

    private void numberOfCopiesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfCopiesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfCopiesFieldActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt){
        
       String selectedItem = (String) comboBox.getSelectedItem();
       
       if(selectedItem.equals("Counter 2")){
          
       }else if(selectedItem.equals("Counter 3")){
           
       }else if(selectedItem.equals("Counter 4")){
           
       }else if(selectedItem.equals("Counter 5")){
           
       }else if(selectedItem.equals("Counter 6")){
           
       }else if(selectedItem.equals("Counter 7")){
           
       }else if(selectedItem.equals("Counter 8")){
           
       }
       
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Counter1().setVisible(true);
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
    public static javax.swing.JTextField numberOfCopiesField;
    private javax.swing.JLabel processLabel;
    private javax.swing.JButton recallButton;
    public static javax.swing.JLabel registryClerkName;
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


package qms_lgu_inf238;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static qms_lgu_inf238.TicketNumber.Counter1TicketNumberField;

public class Counter1 extends javax.swing.JFrame {

    public static Queue<String> counter1Data = new LinkedList<>();
    public static Queue<String> onHoldData = new LinkedList<>();
    public static Queue<String> noShowData = new LinkedList<>();
    JComboBox<String> comboBox;
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Counter 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        jScrollPane4.setViewportView(FinishedTable);
        if (FinishedTable.getColumnModel().getColumnCount() > 0) {
            FinishedTable.getColumnModel().getColumn(0).setResizable(false);
        }

        processLabel.setText("Processing Time:");

        transactionLabel.setText("Transaction Type:");

        documentLabel.setText("Document Type:");

        transactionTypeLabel.setText("Request Copy");

        documentTypeLabel.setText("Birth Certficate");

        registryLabel.setText("Registry Clerk Name:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(registryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transactionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(transactionTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registryClerkName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(processLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(timeLabel))))
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
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(processLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(currentNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(documentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registryClerkName))
                        .addGap(38, 38, 38)
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
                .addContainerGap(30, Short.MAX_VALUE))
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
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        if(counter1Data.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Serving Yet!");
        }else{
        currentNumberField.setText(counter1Data.peek());
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
             currentNumberField.setText(counter1Data.peek());
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
         
     
        if(!counter1Data.contains(currentNumberField.getText())){
            
          DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
           if(HoldModel.getRowCount() == -1){
            JOptionPane.showMessageDialog(this, "On Hold Table is Empty");
           }else{
            String ticketNumbers = currentNumberField.getText();
            Object[]row = {ticketNumbers};
            
            DefaultTableModel FinishedModel = (DefaultTableModel)Counter1.FinishedTable.getModel();
            
            FinishedModel.addRow(row);
            currentNumberField.setText("");
            
              
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
                counter1Data.poll();
                currentNumberField.setText("");
            }
        }      
    }
        
        }    
    }//GEN-LAST:event_finishButtonActionPerformed

    private void holdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_holdButtonActionPerformed
        
        
        if(currentNumberField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Current Serving");
        }else{
            String onHoldNumbers = currentNumberField.getText();
        
        Object[]row = {onHoldNumbers};
        DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
        HoldModel.addRow(row);
        
        
        onHoldData.add(onHoldNumbers);
        counter1Data.poll();
        currentNumberField.setText("");
        }
        
        
        
        
    }//GEN-LAST:event_holdButtonActionPerformed

    private void recallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recallButtonActionPerformed
        
        DefaultTableModel HoldModel = (DefaultTableModel)OnHoldTable.getModel();
      if(onHoldData.isEmpty()){
          JOptionPane.showMessageDialog(this, "On Hold Table is Empty");
      }else if(!currentNumberField.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Currently Serving " + currentNumberField.getText());
      }else{
        currentNumberField.setText(onHoldData.peek());
        onHoldData.poll();
        HoldModel.removeRow(0);
      }
       
        
    }//GEN-LAST:event_recallButtonActionPerformed

    private void noShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowButtonActionPerformed
        
        if(currentNumberField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Current Serving!");
        }else{
        String noShowNumber = currentNumberField.getText();
        noShowData.add(noShowNumber);
        counter1Data.poll();
        currentNumberField.setText("");
        Object[]row = {noShowNumber};
        DefaultTableModel NoShowModel = (DefaultTableModel)NoShowTable.getModel();
        NoShowModel.addRow(row); 
        }
       
    }//GEN-LAST:event_noShowButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
      
        nextButton.setEnabled(false);
        finishButton.setEnabled(false);
        stopButton.setEnabled(false);
        holdButton.setEnabled(false);
        noShowButton.setEnabled(false);
        transferButton.setEnabled(false);
        recallButton.setEnabled(false);
        startButton.setEnabled(true);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        
        JFrame transferFrame = new JFrame("Transfer Options");
        JPanel panel = new JPanel();
        String[] items = {"Counter 2", "Counter 3", "Counter 4", "Counter 5", "Counter 6", "Counter 7", "Counter 8"};
        comboBox = new JComboBox<>(items);

         Font font = new Font("Arial", Font.PLAIN, 18);
        
        comboBox.setBounds(20, 50, 150, 80);
        comboBox.setFont(font);

        
        

        panel.add(comboBox);
        panel.setSize(200, 200);
        panel.setLayout(null);
        transferFrame.add(panel);
        transferFrame.setResizable(false);
        transferFrame.setLocationRelativeTo(null);
        transferFrame.setSize(200,200);
        transferFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        transferFrame.setVisible(true);
        
    }//GEN-LAST:event_transferButtonActionPerformed

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
    private javax.swing.JTextField currentNumberField;
    private javax.swing.JLabel documentLabel;
    private javax.swing.JLabel documentTypeLabel;
    private javax.swing.JButton finishButton;
    private javax.swing.JButton holdButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton noShowButton;
    private javax.swing.JLabel processLabel;
    private javax.swing.JButton recallButton;
    private javax.swing.JLabel registryClerkName;
    private javax.swing.JLabel registryLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JTextField timeLabel;
    private javax.swing.JLabel transactionLabel;
    private javax.swing.JLabel transactionTypeLabel;
    private javax.swing.JButton transferButton;
    // End of variables declaration//GEN-END:variables
}

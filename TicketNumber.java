/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qms_lgu_inf238;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;
import javax.swing.*;
import java.util.LinkedList;
import java.util.TimerTask;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class TicketNumber extends javax.swing.JFrame {

    //Data Structures Queue and LinkedList for Generating Number
    
    public static Queue <Integer> counter1Queue = new LinkedList<>();
    public static Queue <Integer> counter2Queue = new LinkedList<>();
    public static Queue <Integer> counter3Queue = new LinkedList<>();
    public static Queue <Integer> counter4Queue = new LinkedList<>();
    public static Queue <Integer> counter5Queue = new LinkedList<>();
    public static Queue <Integer> counter6Queue = new LinkedList<>();
    public static Queue <Integer> counter7Queue = new LinkedList<>();
    public static Queue <Integer> counter8Queue = new LinkedList<>();
    
    public static int counter1Basis = 0;
    public static int counter2Basis = 0;
    public static int counter3Basis = 0;
    
    
    
  
    public TicketNumber() {
        initComponents();
        
        Counter1TicketNumberField.setHorizontalAlignment(Counter1TicketNumberField.CENTER);
        Counter2TicketNumberField.setHorizontalAlignment(Counter1TicketNumberField.CENTER);
        Counter3TicketNumberField.setHorizontalAlignment(Counter1TicketNumberField.CENTER);
        
        //Ticket Number Generation
        
          if(Customer.invokeBasis == 0){
              
         
         Counter1TicketNumberField.setText("A-"+counter1Queue.peek().toString());
         Counter1.counter1Data.add(Counter1TicketNumberField.getText()); 
         String ticketNumbers = Counter1TicketNumberField.getText();
            Object[]row = {ticketNumbers};
            DefaultTableModel model = (DefaultTableModel)Counter1.WaitingTable.getModel();
       
            model.addRow(row);
         counter1Queue.poll();
         Counter2TicketNumberField.setVisible(false);
         Counter3TicketNumberField.setVisible(false);
         
            
       
          }else if(Customer.invokeBasis == 1){
         
         Counter1TicketNumberField.setVisible(false);
         Counter2TicketNumberField.setText("B-" + counter2Queue.poll().toString());
         Counter3TicketNumberField.setVisible(false);
          }else if(Customer.invokeBasis == 3){
         Counter1TicketNumberField.setVisible(false);
         Counter3TicketNumberField.setText("C-" + counter3Queue.poll().toString());
         Counter2TicketNumberField.setVisible(false);
          }
          
          
         Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
              setVisible(false);
            }
        });

        // Start the timer
        timer.setRepeats(false); // Execute only once
        timer.start();
         
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        counter1_2Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Counter1TicketNumberField = new javax.swing.JTextField();
        Counter2TicketNumberField = new javax.swing.JTextField();
        Counter3TicketNumberField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        counter1_2Panel.setBackground(new java.awt.Color(0, 204, 204));
        counter1_2Panel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("          Your Ticket Number!");
        counter1_2Panel.add(jLabel1);
        jLabel1.setBounds(34, 28, 397, 74);

        Counter1TicketNumberField.setEditable(false);
        Counter1TicketNumberField.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Counter1TicketNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Counter1TicketNumberField.setText("A-001");
        Counter1TicketNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Counter1TicketNumberFieldActionPerformed(evt);
            }
        });
        counter1_2Panel.add(Counter1TicketNumberField);
        Counter1TicketNumberField.setBounds(110, 140, 288, 156);

        Counter2TicketNumberField.setEditable(false);
        Counter2TicketNumberField.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Counter2TicketNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Counter2TicketNumberField.setText("A-001");
        Counter2TicketNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Counter2TicketNumberFieldActionPerformed(evt);
            }
        });
        counter1_2Panel.add(Counter2TicketNumberField);
        Counter2TicketNumberField.setBounds(107, 142, 288, 156);

        Counter3TicketNumberField.setEditable(false);
        Counter3TicketNumberField.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Counter3TicketNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Counter3TicketNumberField.setText("A-001");
        Counter3TicketNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Counter3TicketNumberFieldActionPerformed(evt);
            }
        });
        counter1_2Panel.add(Counter3TicketNumberField);
        Counter3TicketNumberField.setBounds(110, 140, 288, 156);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(counter1_2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(counter1_2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(518, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Counter1TicketNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Counter1TicketNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Counter1TicketNumberFieldActionPerformed

    private void Counter2TicketNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Counter2TicketNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Counter2TicketNumberFieldActionPerformed

    private void Counter3TicketNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Counter3TicketNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Counter3TicketNumberFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TicketNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketNumber().setVisible(true);
            }
        });
         
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Counter1TicketNumberField;
    public static javax.swing.JTextField Counter2TicketNumberField;
    public static javax.swing.JTextField Counter3TicketNumberField;
    private javax.swing.JPanel counter1_2Panel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

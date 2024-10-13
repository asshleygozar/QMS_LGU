/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qms_lgu_inf238;

import java.awt.Component;
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asshley Gozar
 */
public class Customer extends javax.swing.JFrame {

   // Data Structures Queue LinkedList for Ticket Number Generation
    public static int counter1Basis = 1;
    public static int counter2Basis = 1;
    public static int counter3Basis = 1;
    
    public static int invokeBasis = 0;
    
    
    public Customer() {
        initComponents();
        
        //To hide documentPanel all elements while transaction panel is active
        Component[] components1 = documentPanel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         
         new Counter1().setVisible(true);

         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transactionPanel = new javax.swing.JPanel();
        amendmentsButton = new javax.swing.JButton();
        getCopyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        documentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        birthCertButton = new javax.swing.JButton();
        deathCertButton = new javax.swing.JButton();
        marriageCertButton = new javax.swing.JButton();
        cenomarCertButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        amendmentsButton.setText("Amendments");
        amendmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amendmentsButtonActionPerformed(evt);
            }
        });

        getCopyButton.setText("Request Copy");
        getCopyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCopyButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Choose Type of Transaction");

        javax.swing.GroupLayout transactionPanelLayout = new javax.swing.GroupLayout(transactionPanel);
        transactionPanel.setLayout(transactionPanelLayout);
        transactionPanelLayout.setHorizontalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(getCopyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(amendmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        transactionPanelLayout.setVerticalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getCopyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amendmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        getContentPane().add(transactionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 500));

        documentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Choose Type of Document");
        documentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 16, 512, 84));

        birthCertButton.setText("Birth Certificate");
        birthCertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthCertButtonActionPerformed(evt);
            }
        });
        documentPanel.add(birthCertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 131, 181, 119));

        deathCertButton.setText("Death Certficate");
        deathCertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deathCertButtonActionPerformed(evt);
            }
        });
        documentPanel.add(deathCertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 131, 183, 119));

        marriageCertButton.setText("Marriage Certificate");
        marriageCertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marriageCertButtonActionPerformed(evt);
            }
        });
        documentPanel.add(marriageCertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 300, 181, 119));

        cenomarCertButton.setText("CENOMAR Certificate");
        cenomarCertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenomarCertButtonActionPerformed(evt);
            }
        });
        documentPanel.add(cenomarCertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 300, 200, 119));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        documentPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 437, 146, 49));

        getContentPane().add(documentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        setSize(new java.awt.Dimension(642, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void amendmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amendmentsButtonActionPerformed
       Component[] components = transactionPanel.getComponents();
        for (Component component : components) {
            component.setVisible(false);
        }
        transactionPanel.setVisible(false);
        
        documentPanel.setVisible(true);
        Component[] components1 = documentPanel.getComponents();
         for (Component component : components1) {
            component.setVisible(true);
        }
    }//GEN-LAST:event_amendmentsButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        documentPanel.setVisible(false);
        Component[] components1 = documentPanel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
        transactionPanel.setVisible(true);
         Component[] components = transactionPanel.getComponents();
        for (Component component : components) {
            component.setVisible(true);
        }
        transactionPanel.setVisible(true);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void getCopyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCopyButtonActionPerformed
      Component[] components = transactionPanel.getComponents();
        for (Component component : components) {
            component.setVisible(false);
        }
        transactionPanel.setVisible(false);
        
        documentPanel.setVisible(true);
        Component[] components1 = documentPanel.getComponents();
         for (Component component : components1) {
            component.setVisible(true);
        }
        
    }//GEN-LAST:event_getCopyButtonActionPerformed

    private void birthCertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthCertButtonActionPerformed
      TicketNumber.counter1Queue.add(counter1Basis);
      counter1Basis++;
      invokeBasis = 0;
      //this.setVisible(false);
      new TicketNumber().setVisible(true);
      Component[] components = transactionPanel.getComponents();
        for (Component component : components) {
            component.setVisible(true);
        }
        transactionPanel.setVisible(true);
        
        documentPanel.setVisible(false);
        Component[] components1 = documentPanel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
      
          
    }//GEN-LAST:event_birthCertButtonActionPerformed

    private void deathCertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deathCertButtonActionPerformed
      TicketNumber.counter1Queue.add(counter1Basis);
      counter1Basis++;
      invokeBasis = 0;
      //this.setVisible(false);
      new TicketNumber().setVisible(true);

       Component[] components = transactionPanel.getComponents();
        for (Component component : components) {
            component.setVisible(true);
        }
        transactionPanel.setVisible(true);
        
        documentPanel.setVisible(false);
        Component[] components1 = documentPanel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
          
    }//GEN-LAST:event_deathCertButtonActionPerformed

    private void marriageCertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marriageCertButtonActionPerformed
      TicketNumber.counter2Queue.add(counter2Basis);
      counter2Basis++;
      invokeBasis = 1;
      //this.setVisible(false);
      new TicketNumber().setVisible(true);
       Component[] components = transactionPanel.getComponents();
        for (Component component : components) {
            component.setVisible(true);
        }
        transactionPanel.setVisible(true);
        
        documentPanel.setVisible(false);
        Component[] components1 = documentPanel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
          
    }//GEN-LAST:event_marriageCertButtonActionPerformed

    private void cenomarCertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenomarCertButtonActionPerformed
      TicketNumber.counter2Queue.add(counter2Basis);
      counter2Basis++;
      invokeBasis = 1;
      //this.setVisible(false);
      new TicketNumber().setVisible(true);
       Component[] components = transactionPanel.getComponents();
        for (Component component : components) {
            component.setVisible(true);
        }
        transactionPanel.setVisible(true);
        
        documentPanel.setVisible(false);
        Component[] components1 = documentPanel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
          
    }//GEN-LAST:event_cenomarCertButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton amendmentsButton;
    private javax.swing.JButton backButton;
    public static javax.swing.JButton birthCertButton;
    public static javax.swing.JButton cenomarCertButton;
    public static javax.swing.JButton deathCertButton;
    private javax.swing.JPanel documentPanel;
    private javax.swing.JButton getCopyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JButton marriageCertButton;
    private javax.swing.JPanel transactionPanel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qms_lgu_inf238;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static qms_lgu_inf238.Counter1.counter2Basis;
import static qms_lgu_inf238.Counter1.counter2Number;
import static qms_lgu_inf238.Counter1.counter2Queue;
import static qms_lgu_inf238.Counter2.counter5Basis;
import static qms_lgu_inf238.Counter2.counter5Number;
import static qms_lgu_inf238.Counter2.counter5Queue;
import static qms_lgu_inf238.Counter7.counter7Basis;
import static qms_lgu_inf238.Counter7.counter7Number;
import static qms_lgu_inf238.Counter7.counter7Queue;
import static qms_lgu_inf238.Customer.counter1Basis;
import static qms_lgu_inf238.TicketNumber.Counter1TicketNumberField;
import static qms_lgu_inf238.TicketNumber.counter1Queue;

/**
 *
 * @author Asshley Gozar
 */
public class Transfer extends javax.swing.JFrame {

    public static int invoker = 0;
    
    public Transfer() {
        initComponents();
        
              numberOfCopiesField1To7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();  
                }
            }
        });
            
        switch(invoker){
            case 0:
            {
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(true);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components0 = Counter1TransferPanel.getComponents();
         for (Component component : components0) {
            component.setVisible(true);
        }
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(true);
          }
         break;
        }
            case 1:{
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(true);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components0 = Counter1TransferPanel.getComponents();
         for (Component component : components0) {
            component.setVisible(false);
        }
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(true);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
        }
                 break;
            }
            
            case 2:{
        Counter7TransferPanel.setVisible(true);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components0 = Counter1TransferPanel.getComponents();
         for (Component component : components0) {
            component.setVisible(false);
        }
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(true);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
        }
                
            break; 
            } 
             
            case 3:{
                
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(true);
        
        Component[] components0 = Counter1TransferPanel.getComponents();
         for (Component component : components0) {
            component.setVisible(false);
        }
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(true);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(true);
        }
                
            break;
              }   
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

        Counter7TransferPanel = new javax.swing.JPanel();
        counter7To1Button = new javax.swing.JButton();
        counter7To2Button = new javax.swing.JButton();
        counter7CancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Counter2TransferPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        counter2To1Button = new javax.swing.JButton();
        counter2To8Button = new javax.swing.JButton();
        counter2CancelButton = new javax.swing.JButton();
        Counter1To7Panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        numberOfCopiesField1To7 = new javax.swing.JTextField();
        typeOfTransactionComboBox1To7 = new javax.swing.JComboBox<>();
        documentTypeComboBox1To7 = new javax.swing.JComboBox<>();
        ConfirmButton1To7 = new javax.swing.JButton();
        BackButton1To7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Counter1TransferPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        counter1To7Button = new javax.swing.JButton();
        counter1To8Button = new javax.swing.JButton();
        counter1CancelButton = new javax.swing.JButton();
        Counter8TransferPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        numberOfCopiesField8To7 = new javax.swing.JTextField();
        typeOfTransactionComboBox8To7 = new javax.swing.JComboBox<>();
        documentTypeComboBox8To7 = new javax.swing.JComboBox<>();
        ConfirmButton8To7 = new javax.swing.JButton();
        CancelButton8To7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Counter2To8Panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        numberOfCopiesField2To8 = new javax.swing.JTextField();
        typeOfTransactionComboBox2To8 = new javax.swing.JComboBox<>();
        documentTypeComboBox2To8 = new javax.swing.JComboBox<>();
        ConfirmButton2To8 = new javax.swing.JButton();
        BackButton2To8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Counter2To1Panel = new javax.swing.JPanel();
        documentTypeComboBox2To1 = new javax.swing.JComboBox<>();
        ConfirmButton2To1 = new javax.swing.JButton();
        BackButton2To1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        typeOfTransactionComboBox2To1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        Counter1To8Panel = new javax.swing.JPanel();
        typeOfTransactionComboBox1To8 = new javax.swing.JComboBox<>();
        documentTypeComboBox1To8 = new javax.swing.JComboBox<>();
        ConfirmButton1To8 = new javax.swing.JButton();
        BackButton1To8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        numberOfCopiesField1To8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Counter7To2Panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        numberOfCopiesField7To2 = new javax.swing.JTextField();
        typeOfTransactionComboBox7To2 = new javax.swing.JComboBox<>();
        documentTypeComboBox7To2 = new javax.swing.JComboBox<>();
        ConfirmButton7To2 = new javax.swing.JButton();
        BackButton7To2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Counter7To1Panel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        numberOfCopiesField7To1 = new javax.swing.JTextField();
        typeOfTransactionComboBox7To1 = new javax.swing.JComboBox<>();
        documentTypeComboBox7To1 = new javax.swing.JComboBox<>();
        ConfirmButton7To1 = new javax.swing.JButton();
        BackButton7To1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Counter7TransferPanel.setBackground(new java.awt.Color(0, 153, 102));

        counter7To1Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counter7To1Button.setText("Counter 1");
        counter7To1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counter7To1ButtonActionPerformed(evt);
            }
        });

        counter7To2Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counter7To2Button.setText("Counter 2");
        counter7To2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counter7To2ButtonActionPerformed(evt);
            }
        });

        counter7CancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counter7CancelButton.setText("Cancel");
        counter7CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counter7CancelButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Counter 7 Transfer");

        javax.swing.GroupLayout Counter7TransferPanelLayout = new javax.swing.GroupLayout(Counter7TransferPanel);
        Counter7TransferPanel.setLayout(Counter7TransferPanelLayout);
        Counter7TransferPanelLayout.setHorizontalGroup(
            Counter7TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter7TransferPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(counter7To1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(counter7To2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter7TransferPanelLayout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(Counter7TransferPanelLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(counter7CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Counter7TransferPanelLayout.setVerticalGroup(
            Counter7TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter7TransferPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(Counter7TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(counter7To1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(counter7To2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(counter7CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        Counter2TransferPanel.setBackground(new java.awt.Color(51, 0, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Counter 2 Transfer");

        counter2To1Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counter2To1Button.setText("Counter 1");
        counter2To1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counter2To1ButtonActionPerformed(evt);
            }
        });

        counter2To8Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counter2To8Button.setText("Counter 8");
        counter2To8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counter2To8ButtonActionPerformed(evt);
            }
        });

        counter2CancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counter2CancelButton.setText("Cancel");
        counter2CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counter2CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Counter2TransferPanelLayout = new javax.swing.GroupLayout(Counter2TransferPanel);
        Counter2TransferPanel.setLayout(Counter2TransferPanelLayout);
        Counter2TransferPanelLayout.setHorizontalGroup(
            Counter2TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter2TransferPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(counter2To1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(counter2To8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter2TransferPanelLayout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(Counter2TransferPanelLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(counter2CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Counter2TransferPanelLayout.setVerticalGroup(
            Counter2TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter2TransferPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(Counter2TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(counter2To1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(counter2To8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(counter2CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        Counter1To7Panel.setBackground(new java.awt.Color(102, 0, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Counter 1 to 7 Transfer");

        numberOfCopiesField1To7.setBackground(new java.awt.Color(102, 51, 255));
        numberOfCopiesField1To7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberOfCopiesField1To7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numberOfCopiesField1To7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number Of Copies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        numberOfCopiesField1To7.setOpaque(false);

        typeOfTransactionComboBox1To7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request Copy", "Amendment" }));
        typeOfTransactionComboBox1To7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        typeOfTransactionComboBox1To7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfTransactionComboBox1To7ActionPerformed(evt);
            }
        });

        documentTypeComboBox1To7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birth Certificate", "Death Certificate", "Marriage Certificate", "CENOMAR" }));
        documentTypeComboBox1To7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ConfirmButton1To7.setText("Confirm");
        ConfirmButton1To7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton1To7ActionPerformed(evt);
            }
        });

        BackButton1To7.setText("Back");
        BackButton1To7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1To7ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Input Transfer Transaction Details");

        javax.swing.GroupLayout Counter1To7PanelLayout = new javax.swing.GroupLayout(Counter1To7Panel);
        Counter1To7Panel.setLayout(Counter1To7PanelLayout);
        Counter1To7PanelLayout.setHorizontalGroup(
            Counter1To7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter1To7PanelLayout.createSequentialGroup()
                .addGroup(Counter1To7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(documentTypeComboBox1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                        .addGroup(Counter1To7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(BackButton1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(numberOfCopiesField1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(Counter1To7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(typeOfTransactionComboBox1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ConfirmButton1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(68, 68, 68))
            .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                .addGroup(Counter1To7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Counter1To7PanelLayout.setVerticalGroup(
            Counter1To7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Counter1To7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(numberOfCopiesField1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Counter1To7PanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(typeOfTransactionComboBox1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(documentTypeComboBox1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(Counter1To7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton1To7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        Counter1TransferPanel.setBackground(new java.awt.Color(3, 4, 94));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Counter 1 Transfer");

        counter1To7Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counter1To7Button.setText("Counter 7");
        counter1To7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counter1To7ButtonActionPerformed(evt);
            }
        });

        counter1To8Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counter1To8Button.setText("Counter 8");
        counter1To8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counter1To8ButtonActionPerformed(evt);
            }
        });

        counter1CancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counter1CancelButton.setText("Cancel");
        counter1CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counter1CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Counter1TransferPanelLayout = new javax.swing.GroupLayout(Counter1TransferPanel);
        Counter1TransferPanel.setLayout(Counter1TransferPanelLayout);
        Counter1TransferPanelLayout.setHorizontalGroup(
            Counter1TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter1TransferPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(counter1To7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(counter1To8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter1TransferPanelLayout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(Counter1TransferPanelLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(counter1CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Counter1TransferPanelLayout.setVerticalGroup(
            Counter1TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter1TransferPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(Counter1TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(counter1To7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(counter1To8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(counter1CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        Counter8TransferPanel.setBackground(new java.awt.Color(0, 153, 153));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Counter 8 to 7 Transfer");

        numberOfCopiesField8To7.setBackground(new java.awt.Color(0, 153, 153));
        numberOfCopiesField8To7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberOfCopiesField8To7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numberOfCopiesField8To7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number Of Copies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        numberOfCopiesField8To7.setOpaque(false);

        typeOfTransactionComboBox8To7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request Copy", "Amendment" }));
        typeOfTransactionComboBox8To7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        typeOfTransactionComboBox8To7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfTransactionComboBox8To7ActionPerformed(evt);
            }
        });

        documentTypeComboBox8To7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birth Certificate", "Death Certificate", "Marriage Certificate", "CENOMAR" }));
        documentTypeComboBox8To7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ConfirmButton8To7.setText("Confirm");
        ConfirmButton8To7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton8To7ActionPerformed(evt);
            }
        });

        CancelButton8To7.setText("Cancel");
        CancelButton8To7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButton8To7ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Input Transfer Transaction Details");

        javax.swing.GroupLayout Counter8TransferPanelLayout = new javax.swing.GroupLayout(Counter8TransferPanel);
        Counter8TransferPanel.setLayout(Counter8TransferPanelLayout);
        Counter8TransferPanelLayout.setHorizontalGroup(
            Counter8TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter8TransferPanelLayout.createSequentialGroup()
                .addGroup(Counter8TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Counter8TransferPanelLayout.createSequentialGroup()
                        .addGroup(Counter8TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Counter8TransferPanelLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(CancelButton8To7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter8TransferPanelLayout.createSequentialGroup()
                                .addContainerGap(40, Short.MAX_VALUE)
                                .addComponent(numberOfCopiesField8To7, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(Counter8TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter8TransferPanelLayout.createSequentialGroup()
                                .addComponent(ConfirmButton8To7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addComponent(typeOfTransactionComboBox8To7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Counter8TransferPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(documentTypeComboBox8To7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(Counter8TransferPanelLayout.createSequentialGroup()
                .addGroup(Counter8TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Counter8TransferPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Counter8TransferPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Counter8TransferPanelLayout.setVerticalGroup(
            Counter8TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter8TransferPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Counter8TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfCopiesField8To7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeOfTransactionComboBox8To7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(documentTypeComboBox8To7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(Counter8TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton8To7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton8To7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        Counter2To8Panel.setBackground(new java.awt.Color(102, 51, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Input Transfer Transaction Details");

        numberOfCopiesField2To8.setBackground(new java.awt.Color(102, 51, 255));
        numberOfCopiesField2To8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberOfCopiesField2To8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numberOfCopiesField2To8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number Of Copies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        numberOfCopiesField2To8.setOpaque(false);

        typeOfTransactionComboBox2To8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request Copy", "Amendment" }));
        typeOfTransactionComboBox2To8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        typeOfTransactionComboBox2To8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfTransactionComboBox2To8ActionPerformed(evt);
            }
        });

        documentTypeComboBox2To8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birth Certificate", "Death Certificate", "Marriage Certificate", "CENOMAR" }));
        documentTypeComboBox2To8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ConfirmButton2To8.setText("Confirm");
        ConfirmButton2To8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton2To8ActionPerformed(evt);
            }
        });

        BackButton2To8.setText("Back");
        BackButton2To8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton2To8ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Counter 2 to 8 Transfer");

        javax.swing.GroupLayout Counter2To8PanelLayout = new javax.swing.GroupLayout(Counter2To8Panel);
        Counter2To8Panel.setLayout(Counter2To8PanelLayout);
        Counter2To8PanelLayout.setHorizontalGroup(
            Counter2To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter2To8PanelLayout.createSequentialGroup()
                .addGroup(Counter2To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Counter2To8PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Counter2To8PanelLayout.createSequentialGroup()
                        .addGroup(Counter2To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Counter2To8PanelLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(BackButton2To8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Counter2To8PanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(numberOfCopiesField2To8, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(Counter2To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(documentTypeComboBox2To8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Counter2To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter2To8PanelLayout.createSequentialGroup()
                                    .addComponent(ConfirmButton2To8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31))
                                .addComponent(typeOfTransactionComboBox2To8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter2To8PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        Counter2To8PanelLayout.setVerticalGroup(
            Counter2To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter2To8PanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Counter2To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Counter2To8PanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(numberOfCopiesField2To8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter2To8PanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(typeOfTransactionComboBox2To8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(documentTypeComboBox2To8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(Counter2To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton2To8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton2To8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        Counter2To1Panel.setBackground(new java.awt.Color(102, 102, 255));

        documentTypeComboBox2To1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birth Certificate", "Death Certificate", "Marriage Certificate", "CENOMAR" }));
        documentTypeComboBox2To1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ConfirmButton2To1.setText("Confirm");
        ConfirmButton2To1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton2To1ActionPerformed(evt);
            }
        });

        BackButton2To1.setText("Back");
        BackButton2To1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton2To1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Input Transfer Transaction Details");

        typeOfTransactionComboBox2To1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request Copy", "Amendment" }));
        typeOfTransactionComboBox2To1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        typeOfTransactionComboBox2To1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfTransactionComboBox2To1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Counter 2 to 1 Transfer");

        javax.swing.GroupLayout Counter2To1PanelLayout = new javax.swing.GroupLayout(Counter2To1Panel);
        Counter2To1Panel.setLayout(Counter2To1PanelLayout);
        Counter2To1PanelLayout.setHorizontalGroup(
            Counter2To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter2To1PanelLayout.createSequentialGroup()
                .addGroup(Counter2To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Counter2To1PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Counter2To1PanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(typeOfTransactionComboBox2To1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(documentTypeComboBox2To1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(68, 68, 68))
            .addGroup(Counter2To1PanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(BackButton2To1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfirmButton2To1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(Counter2To1PanelLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Counter2To1PanelLayout.setVerticalGroup(
            Counter2To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter2To1PanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(Counter2To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeOfTransactionComboBox2To1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(documentTypeComboBox2To1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(Counter2To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton2To1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton2To1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        Counter1To8Panel.setBackground(new java.awt.Color(102, 0, 255));

        typeOfTransactionComboBox1To8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request Copy", "Amendment" }));
        typeOfTransactionComboBox1To8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        typeOfTransactionComboBox1To8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfTransactionComboBox1To8ActionPerformed(evt);
            }
        });

        documentTypeComboBox1To8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birth Certificate", "Death Certificate", "Marriage Certificate", "CENOMAR" }));
        documentTypeComboBox1To8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ConfirmButton1To8.setText("Confirm");
        ConfirmButton1To8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton1To8ActionPerformed(evt);
            }
        });

        BackButton1To8.setText("Back");
        BackButton1To8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1To8ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Input Transfer Transaction Details");

        numberOfCopiesField1To8.setBackground(new java.awt.Color(51, 51, 255));
        numberOfCopiesField1To8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberOfCopiesField1To8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numberOfCopiesField1To8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number Of Copies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        numberOfCopiesField1To8.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Counter 1 to 8 Transfer");

        javax.swing.GroupLayout Counter1To8PanelLayout = new javax.swing.GroupLayout(Counter1To8Panel);
        Counter1To8Panel.setLayout(Counter1To8PanelLayout);
        Counter1To8PanelLayout.setHorizontalGroup(
            Counter1To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter1To8PanelLayout.createSequentialGroup()
                .addGroup(Counter1To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Counter1To8PanelLayout.createSequentialGroup()
                        .addGroup(Counter1To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Counter1To8PanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(BackButton1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Counter1To8PanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(numberOfCopiesField1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(Counter1To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfirmButton1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentTypeComboBox1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeOfTransactionComboBox1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Counter1To8PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(Counter1To8PanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Counter1To8PanelLayout.setVerticalGroup(
            Counter1To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter1To8PanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(Counter1To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfCopiesField1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeOfTransactionComboBox1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(documentTypeComboBox1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(Counter1To8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton1To8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        Counter7To2Panel.setBackground(new java.awt.Color(102, 0, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Input Transfer Transaction Details");

        numberOfCopiesField7To2.setBackground(new java.awt.Color(51, 51, 255));
        numberOfCopiesField7To2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberOfCopiesField7To2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numberOfCopiesField7To2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number Of Copies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        numberOfCopiesField7To2.setOpaque(false);

        typeOfTransactionComboBox7To2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request Copy", "Amendment" }));
        typeOfTransactionComboBox7To2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        typeOfTransactionComboBox7To2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfTransactionComboBox7To2ActionPerformed(evt);
            }
        });

        documentTypeComboBox7To2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birth Certificate", "Death Certificate", "Marriage Certificate", "CENOMAR" }));
        documentTypeComboBox7To2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ConfirmButton7To2.setText("Confirm");
        ConfirmButton7To2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton7To2ActionPerformed(evt);
            }
        });

        BackButton7To2.setText("Back");
        BackButton7To2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton7To2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Counter 7 to 2 Transfer");

        javax.swing.GroupLayout Counter7To2PanelLayout = new javax.swing.GroupLayout(Counter7To2Panel);
        Counter7To2Panel.setLayout(Counter7To2PanelLayout);
        Counter7To2PanelLayout.setHorizontalGroup(
            Counter7To2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter7To2PanelLayout.createSequentialGroup()
                .addGroup(Counter7To2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Counter7To2PanelLayout.createSequentialGroup()
                        .addGroup(Counter7To2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Counter7To2PanelLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(BackButton7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Counter7To2PanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(numberOfCopiesField7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(Counter7To2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfirmButton7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentTypeComboBox7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeOfTransactionComboBox7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Counter7To2PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(Counter7To2PanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Counter7To2PanelLayout.setVerticalGroup(
            Counter7To2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter7To2PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(Counter7To2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfCopiesField7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeOfTransactionComboBox7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(documentTypeComboBox7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(Counter7To2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton7To2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        Counter7To1Panel.setBackground(new java.awt.Color(153, 0, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Input Transfer Transaction Details");

        numberOfCopiesField7To1.setBackground(new java.awt.Color(153, 0, 255));
        numberOfCopiesField7To1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberOfCopiesField7To1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numberOfCopiesField7To1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number Of Copies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        numberOfCopiesField7To1.setOpaque(false);

        typeOfTransactionComboBox7To1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request Copy", "Amendment" }));
        typeOfTransactionComboBox7To1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        typeOfTransactionComboBox7To1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfTransactionComboBox7To1ActionPerformed(evt);
            }
        });

        documentTypeComboBox7To1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birth Certificate", "Death Certificate", "Marriage Certificate", "CENOMAR" }));
        documentTypeComboBox7To1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ConfirmButton7To1.setText("Confirm");
        ConfirmButton7To1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton7To1ActionPerformed(evt);
            }
        });

        BackButton7To1.setText("Back");
        BackButton7To1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton7To1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Counter 7 to 1 Transfer");

        javax.swing.GroupLayout Counter7To1PanelLayout = new javax.swing.GroupLayout(Counter7To1Panel);
        Counter7To1Panel.setLayout(Counter7To1PanelLayout);
        Counter7To1PanelLayout.setHorizontalGroup(
            Counter7To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter7To1PanelLayout.createSequentialGroup()
                .addGroup(Counter7To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Counter7To1PanelLayout.createSequentialGroup()
                        .addGroup(Counter7To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Counter7To1PanelLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(BackButton7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Counter7To1PanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(numberOfCopiesField7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(Counter7To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfirmButton7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentTypeComboBox7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeOfTransactionComboBox7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Counter7To1PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Counter7To1PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        Counter7To1PanelLayout.setVerticalGroup(
            Counter7To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Counter7To1PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(Counter7To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Counter7To1PanelLayout.createSequentialGroup()
                        .addComponent(typeOfTransactionComboBox7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(documentTypeComboBox7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(Counter7To1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConfirmButton7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackButton7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(Counter7To1PanelLayout.createSequentialGroup()
                        .addComponent(numberOfCopiesField7To1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Counter1TransferPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter2TransferPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter7TransferPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter8TransferPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter1To7Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter1To8Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter2To1Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter2To8Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter7To1Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter7To2Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Counter1TransferPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter2TransferPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter7TransferPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter8TransferPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter1To7Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter1To8Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter2To1Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter2To8Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter7To1Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Counter7To2Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeOfTransactionComboBox1To7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfTransactionComboBox1To7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfTransactionComboBox1To7ActionPerformed

    private void BackButton1To7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1To7ActionPerformed
        Counter1TransferPanel.setVisible(true);
        Counter1To7Panel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter7TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
    }//GEN-LAST:event_BackButton1To7ActionPerformed

    private void ConfirmButton1To7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton1To7ActionPerformed
       
        if(numberOfCopiesField1To7.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Input Number of Copies!");
        }else{
            
            int parsing = Integer.parseInt(numberOfCopiesField1To7.getText());
            Counter7.numberOfCopiesPrice.add(parsing);
            Counter7.certificateData.add(documentTypeComboBox1To7.getSelectedItem().toString());
            Counter7.transactionData.add(typeOfTransactionComboBox1To7.getSelectedItem().toString());
            
          if(Counter1.counter1Data.contains(Counter1.currentNumberField.getText())){
            
            Counter1.counter1Data.poll();
            Counter1.transactionData.poll();
            Counter1.certificateData.poll();
            
            Counter1.transactionTypeLabel.setText("");
            Counter1.documentTypeLabel.setText("");
            Counter1.currentNumberField.setText("");
            Counter1.numberOfCopiesField.setText("");
          }else{
           Counter1.transactionTypeLabel.setText("");
           Counter1.documentTypeLabel.setText("");
           Counter1.currentNumberField.setText("");
           Counter1.numberOfCopiesField.setText("");
          }
            
            
            counter5Queue.add(counter5Basis);
                    DefaultTableModel counter = (DefaultTableModel)Counter7.WaitingTable.getModel();
                    counter5Number.add("E-"+counter5Queue.peek().toString());
                    Counter7.counter7Data.add(counter5Number.peek());
                    Object[]counterRow7 = {counter5Number.peek()};
                    counter.addRow(counterRow7);
       
                    counter5Queue.poll();
                    counter5Number.poll();
                    counter5Basis++;
                    Counter1.stopTimer();
                    ScreenNumbers.counter1Screen.setText("--");
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_ConfirmButton1To7ActionPerformed

    private void typeOfTransactionComboBox1To8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfTransactionComboBox1To8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfTransactionComboBox1To8ActionPerformed

    private void ConfirmButton1To8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton1To8ActionPerformed
        if(numberOfCopiesField1To8.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Input Number of Copies!");
        }else{
            Counter8.numberOfCopiesPrice.add(numberOfCopiesField1To8.getText());
            Counter8.certificateData.add(documentTypeComboBox1To8.getSelectedItem().toString());
            Counter8.transactionData.add(typeOfTransactionComboBox1To8.getSelectedItem().toString());
            
             if(Counter1.counter1Data.contains(Counter1.currentNumberField.getText())){
            
             Counter1.counter1Data.poll();
             Counter1.transactionData.poll();
             Counter1.certificateData.poll();
            
             Counter1.transactionTypeLabel.setText("");
             Counter1.documentTypeLabel.setText("");
             Counter1.currentNumberField.setText("");
             Counter1.numberOfCopiesField.setText("");
            }else{
             Counter1.transactionTypeLabel.setText("");
             Counter1.documentTypeLabel.setText("");
             Counter1.currentNumberField.setText("");
             Counter1.numberOfCopiesField.setText("");
          }
            
            counter7Queue.add(counter7Basis);
                        DefaultTableModel counter = (DefaultTableModel)Counter8.WaitingTable.getModel();
                        counter7Number.add("G-"+counter7Queue.peek().toString());
                        Counter8.counter8Data.add(counter7Number.peek());
                        Object[]counterRow8 = {counter7Number.peek()};
                        counter.addRow(counterRow8);

                        counter7Queue.poll();
                        counter7Number.poll();
                        counter7Basis++;
                        ScreenNumbers.counter1Screen.setText("--");
                        Counter1.stopTimer();
                        this.setVisible(false);
        }
    }//GEN-LAST:event_ConfirmButton1To8ActionPerformed

    private void BackButton1To8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1To8ActionPerformed
        Counter1TransferPanel.setVisible(true);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter7TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
    }//GEN-LAST:event_BackButton1To8ActionPerformed

    private void counter1To7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counter1To7ButtonActionPerformed
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(true);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(true);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
        }
    }//GEN-LAST:event_counter1To7ButtonActionPerformed

    private void ConfirmButton2To1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton2To1ActionPerformed
           
            
            Counter1.certificateData.add(documentTypeComboBox2To1.getSelectedItem().toString());
            Counter1.transactionData.add(typeOfTransactionComboBox2To1.getSelectedItem().toString());
            
             if(Counter2.counter2Data.contains(Counter2.currentNumberField.getText())){
            
             Counter2.counter2Data.poll();
             Counter2.transactionData.poll();
             Counter2.certificateData.poll();
            
             Counter2.transactionTypeLabel.setText("");
             Counter2.documentTypeLabel.setText("");
             Counter2.currentNumberField.setText("");
             Counter2.numberOfCopiesLabel.setText("");
             
            }else{
             Counter2.transactionTypeLabel.setText("");
             Counter2.documentTypeLabel.setText("");
             Counter2.currentNumberField.setText("");
             Counter2.numberOfCopiesLabel.setText("");
          }
                    TicketNumber.counter1Queue.add(counter1Basis);
                    String ticket = "A-"+counter1Queue.peek().toString();
                    Counter1.counter1Data.add(ticket);
                    String ticketNumbers = ticket;
                    Object[]row = {ticketNumbers};
                    DefaultTableModel model = (DefaultTableModel)Counter1.WaitingTable.getModel();
                    model.addRow(row);
                    counter1Queue.poll();
                    counter1Basis++;
                    ScreenNumbers.counter2Screen.setText("--");
        Counter2.stopTimer();
        this.setVisible(false);
    }//GEN-LAST:event_ConfirmButton2To1ActionPerformed

    private void BackButton2To1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton2To1ActionPerformed
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(true);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components0 = Counter1TransferPanel.getComponents();
         for (Component component : components0) {
            component.setVisible(true);
        }
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(true);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
          }
    }//GEN-LAST:event_BackButton2To1ActionPerformed

    private void typeOfTransactionComboBox2To1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfTransactionComboBox2To1ActionPerformed
        
    }//GEN-LAST:event_typeOfTransactionComboBox2To1ActionPerformed

    private void typeOfTransactionComboBox2To8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfTransactionComboBox2To8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfTransactionComboBox2To8ActionPerformed

    private void ConfirmButton2To8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton2To8ActionPerformed
        if(numberOfCopiesField2To8.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Input Number of Copies!");
        }else{
            Counter8.numberOfCopiesPrice.add(numberOfCopiesField2To8.getText());
            Counter8.certificateData.add(documentTypeComboBox2To8.getSelectedItem().toString());
            Counter8.transactionData.add(typeOfTransactionComboBox2To8.getSelectedItem().toString());
            
             if(Counter2.counter2Data.contains(Counter2.currentNumberField.getText())){
            
             Counter2.counter2Data.poll();
             Counter2.transactionData.poll();
             Counter2.certificateData.poll();
            
             Counter2.transactionTypeLabel.setText("");
             Counter2.documentTypeLabel.setText("");
             Counter2.currentNumberField.setText("");
             Counter2.numberOfCopiesLabel.setText("");
            }else{
             Counter2.transactionTypeLabel.setText("");
             Counter2.documentTypeLabel.setText("");
             Counter2.currentNumberField.setText("");
             Counter2.numberOfCopiesLabel.setText("");
          }
            
            counter7Queue.add(counter7Basis);
                        DefaultTableModel counter = (DefaultTableModel)Counter8.WaitingTable.getModel();
                        counter7Number.add("G-"+counter7Queue.peek().toString());
                        Counter8.counter8Data.add(counter7Number.peek());
                        Object[]counterRow8 = {counter7Number.peek()};
                        counter.addRow(counterRow8);

                        counter7Queue.poll();
                        counter7Number.poll();
                        counter7Basis++;
                        ScreenNumbers.counter2Screen.setText("--");
                        Counter2.stopTimer();
                     this.setVisible(false);
        }
    }//GEN-LAST:event_ConfirmButton2To8ActionPerformed

    private void BackButton2To8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton2To8ActionPerformed
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(true);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components0 = Counter1TransferPanel.getComponents();
         for (Component component : components0) {
            component.setVisible(false);
        }
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(true);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
          }
    }//GEN-LAST:event_BackButton2To8ActionPerformed

    private void typeOfTransactionComboBox7To1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfTransactionComboBox7To1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfTransactionComboBox7To1ActionPerformed

    private void ConfirmButton7To1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton7To1ActionPerformed
       if(numberOfCopiesField7To1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Input Number of Copies!");
        }else{
            Counter1.certificateData.add(documentTypeComboBox2To8.getSelectedItem().toString());
            Counter1.transactionData.add(typeOfTransactionComboBox2To8.getSelectedItem().toString());
            
             if(Counter7.counter7Data.contains(Counter7.currentNumberField.getText())){
            
             Counter7.counter7Data.poll();
             Counter7.transactionData.poll();
             Counter7.certificateData.poll();
            
             Counter7.transactionTypeLabel.setText("");
             Counter7.documentTypeLabel.setText("");
             Counter7.currentNumberField.setText("");
             Counter7.numberOfCopiesLabel.setText("");
             Counter7.totalAmountLabel.setText("");
            }else{
             Counter7.transactionTypeLabel.setText("");
             Counter7.documentTypeLabel.setText("");
             Counter7.currentNumberField.setText("");
             Counter7.numberOfCopiesLabel.setText("");
             Counter7.totalAmountLabel.setText("");
          }
            TicketNumber.counter1Queue.add(counter1Basis);
            String ticket = "A-"+counter1Queue.peek().toString();
                    Counter1.counter1Data.add(ticket);
                    String ticketNumbers = ticket;
                    Object[]row = {ticketNumbers};
                    DefaultTableModel model = (DefaultTableModel)Counter1.WaitingTable.getModel();
                    model.addRow(row);
                    counter1Queue.poll();
                    counter1Basis++;
                    ScreenNumbers.counter7Screen.setText("--");
                    Counter7.stopTimer();
                    this.setVisible(false);
        }
    }//GEN-LAST:event_ConfirmButton7To1ActionPerformed

    private void BackButton7To1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton7To1ActionPerformed
        
        Counter7TransferPanel.setVisible(true);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components0 = Counter1TransferPanel.getComponents();
         for (Component component : components0) {
            component.setVisible(false);
        }
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(true);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
          }
    }//GEN-LAST:event_BackButton7To1ActionPerformed

    private void typeOfTransactionComboBox7To2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfTransactionComboBox7To2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfTransactionComboBox7To2ActionPerformed

    private void ConfirmButton7To2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton7To2ActionPerformed
    
        if(numberOfCopiesField7To2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Input Number of Copies!");
        }else{
            int parsing = Integer.parseInt(numberOfCopiesField7To2.getText());
            Counter2.numberOfCopies.add(parsing);
            Counter2.certificateData.add(documentTypeComboBox7To2.getSelectedItem().toString());
            Counter2.transactionData.add(typeOfTransactionComboBox7To2.getSelectedItem().toString());
            
             if(Counter7.counter7Data.contains(Counter7.currentNumberField.getText())){
            
             Counter7.counter7Data.poll();
             Counter7.transactionData.poll();
             Counter7.certificateData.poll();
            
             Counter7.transactionTypeLabel.setText("");
             Counter7.documentTypeLabel.setText("");
             Counter7.currentNumberField.setText("");
             Counter7.numberOfCopiesLabel.setText("");
            }else{
             Counter7.transactionTypeLabel.setText("");
             Counter7.documentTypeLabel.setText("");
             Counter7.currentNumberField.setText("");
             Counter7.numberOfCopiesLabel.setText("");
          }
            
            counter2Queue.add(counter2Basis);
               DefaultTableModel counter = (DefaultTableModel)Counter2.WaitingTable.getModel();
               counter2Number.add("B-"+counter2Queue.peek().toString());
               Counter2.counter2Data.add(counter2Number.peek());
               Object[]counterRow4 = {counter2Number.peek()};
               counter.addRow(counterRow4);
               
               counter2Queue.poll();
               counter2Number.poll();
               counter2Basis++;
                ScreenNumbers.counter7Screen.setText("--");
               Counter7.stopTimer();
               this.setVisible(false);
        }
    }//GEN-LAST:event_ConfirmButton7To2ActionPerformed

    private void BackButton7To2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton7To2ActionPerformed
        
       Counter7TransferPanel.setVisible(true);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components0 = Counter1TransferPanel.getComponents();
         for (Component component : components0) {
            component.setVisible(true);
        }
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(true);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
          }
    }//GEN-LAST:event_BackButton7To2ActionPerformed

    private void typeOfTransactionComboBox8To7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfTransactionComboBox8To7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfTransactionComboBox8To7ActionPerformed

    private void ConfirmButton8To7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton8To7ActionPerformed
         if(numberOfCopiesField8To7.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Input Number of Copies!");
        }else{
            
            int parsing = Integer.parseInt(numberOfCopiesField8To7.getText());
            Counter7.numberOfCopiesPrice.add(parsing);
            Counter7.certificateData.add(documentTypeComboBox8To7.getSelectedItem().toString());
            Counter7.transactionData.add(typeOfTransactionComboBox8To7.getSelectedItem().toString());
            
          if(Counter8.counter8Data.contains(Counter8.currentNumberField.getText())){
            
            Counter8.counter8Data.poll();
            Counter8.transactionData.poll();
            Counter8.certificateData.poll();
            
            Counter8.transactionTypeLabel.setText("");
            Counter8.documentTypeLabel.setText("");
            Counter8.currentNumberField.setText("");
            Counter8.numberOfCopiesLabel.setText("");
          }else{
           Counter8.transactionTypeLabel.setText("");
           Counter8.documentTypeLabel.setText("");
           Counter8.currentNumberField.setText("");
           Counter8.numberOfCopiesLabel.setText("");
          }
            
            
            counter5Queue.add(counter5Basis);
                    DefaultTableModel counter = (DefaultTableModel)Counter7.WaitingTable.getModel();
                    counter5Number.add("E-"+counter5Queue.peek().toString());
                    Counter7.counter7Data.add(counter5Number.peek());
                    Object[]counterRow7 = {counter5Number.peek()};
                    counter.addRow(counterRow7);
       
                    counter5Queue.poll();
                    counter5Number.poll();
                    counter5Basis++;
            ScreenNumbers.counter7Screen.setText("--");
            Counter8.stopTimer();
            this.setVisible(false);
        }
    }//GEN-LAST:event_ConfirmButton8To7ActionPerformed

    private void CancelButton8To7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButton8To7ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_CancelButton8To7ActionPerformed

    private void counter1To8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counter1To8ButtonActionPerformed
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(true);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(true);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
        }
    }//GEN-LAST:event_counter1To8ButtonActionPerformed

    private void counter1CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counter1CancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_counter1CancelButtonActionPerformed

    private void counter2To1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counter2To1ButtonActionPerformed
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(true);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(true);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
        }
    }//GEN-LAST:event_counter2To1ButtonActionPerformed

    private void counter2To8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counter2To8ButtonActionPerformed
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(true);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(true);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
        }
    }//GEN-LAST:event_counter2To8ButtonActionPerformed

    private void counter2CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counter2CancelButtonActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_counter2CancelButtonActionPerformed

    private void counter7To1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counter7To1ButtonActionPerformed
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(true);
        Counter7To2Panel.setVisible(false);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components0 = Counter1TransferPanel.getComponents();
         for (Component component : components0) {
            component.setVisible(false);
        }
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(true);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(false);
          }
    }//GEN-LAST:event_counter7To1ButtonActionPerformed

    private void counter7To2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counter7To2ButtonActionPerformed
        Counter7TransferPanel.setVisible(false);
        Counter1To7Panel.setVisible(false);
        Counter1To8Panel.setVisible(false);
        Counter2To1Panel.setVisible(false);
        Counter2To8Panel.setVisible(false);
        Counter7To1Panel.setVisible(false);
        Counter7To2Panel.setVisible(true);
        Counter1TransferPanel.setVisible(false);
        Counter2TransferPanel.setVisible(false);
        Counter8TransferPanel.setVisible(false);
        
        Component[] components1 = Counter1To7Panel.getComponents();
         for (Component component : components1) {
            component.setVisible(false);
        }
         Component[] components2 = Counter2TransferPanel.getComponents();
         for (Component component : components2) {
            component.setVisible(false);
        }
         Component[] components3 = Counter7TransferPanel.getComponents();
         for (Component component : components3) {
            component.setVisible(false);
        }
         Component[] components4 = Counter8TransferPanel.getComponents();
         for (Component component : components4) {
            component.setVisible(false);
        }
         Component[] components5 = Counter1To8Panel.getComponents();
         for (Component component : components5) {
            component.setVisible(false);
        }
         
        Component[] components6 = Counter2To1Panel.getComponents();
         for (Component component : components6) {
            component.setVisible(false);
        }
         
        Component[] components7 = Counter2To8Panel.getComponents();
         for (Component component : components7) {
            component.setVisible(false);
        }
         
         Component[] components8 = Counter7To1Panel.getComponents();
         for (Component component : components8) {
            component.setVisible(false);
        }
         
        Component[] components9 = Counter7To2Panel.getComponents();
         for (Component component : components9) {
            component.setVisible(true);
        }
    }//GEN-LAST:event_counter7To2ButtonActionPerformed

    private void counter7CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counter7CancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_counter7CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton1To7;
    private javax.swing.JButton BackButton1To8;
    private javax.swing.JButton BackButton2To1;
    private javax.swing.JButton BackButton2To8;
    private javax.swing.JButton BackButton7To1;
    private javax.swing.JButton BackButton7To2;
    private javax.swing.JButton CancelButton8To7;
    private javax.swing.JButton ConfirmButton1To7;
    private javax.swing.JButton ConfirmButton1To8;
    private javax.swing.JButton ConfirmButton2To1;
    private javax.swing.JButton ConfirmButton2To8;
    private javax.swing.JButton ConfirmButton7To1;
    private javax.swing.JButton ConfirmButton7To2;
    private javax.swing.JButton ConfirmButton8To7;
    public static javax.swing.JPanel Counter1To7Panel;
    public static javax.swing.JPanel Counter1To8Panel;
    public static javax.swing.JPanel Counter1TransferPanel;
    public static javax.swing.JPanel Counter2To1Panel;
    public static javax.swing.JPanel Counter2To8Panel;
    public static javax.swing.JPanel Counter2TransferPanel;
    public static javax.swing.JPanel Counter7To1Panel;
    public static javax.swing.JPanel Counter7To2Panel;
    public static javax.swing.JPanel Counter7TransferPanel;
    public static javax.swing.JPanel Counter8TransferPanel;
    private javax.swing.JButton counter1CancelButton;
    private javax.swing.JButton counter1To7Button;
    private javax.swing.JButton counter1To8Button;
    private javax.swing.JButton counter2CancelButton;
    private javax.swing.JButton counter2To1Button;
    private javax.swing.JButton counter2To8Button;
    private javax.swing.JButton counter7CancelButton;
    private javax.swing.JButton counter7To1Button;
    private javax.swing.JButton counter7To2Button;
    private javax.swing.JComboBox<String> documentTypeComboBox1To7;
    private javax.swing.JComboBox<String> documentTypeComboBox1To8;
    private javax.swing.JComboBox<String> documentTypeComboBox2To1;
    private javax.swing.JComboBox<String> documentTypeComboBox2To8;
    private javax.swing.JComboBox<String> documentTypeComboBox7To1;
    private javax.swing.JComboBox<String> documentTypeComboBox7To2;
    private javax.swing.JComboBox<String> documentTypeComboBox8To7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numberOfCopiesField1To7;
    private javax.swing.JTextField numberOfCopiesField1To8;
    private javax.swing.JTextField numberOfCopiesField2To8;
    private javax.swing.JTextField numberOfCopiesField7To1;
    private javax.swing.JTextField numberOfCopiesField7To2;
    private javax.swing.JTextField numberOfCopiesField8To7;
    private javax.swing.JComboBox<String> typeOfTransactionComboBox1To7;
    private javax.swing.JComboBox<String> typeOfTransactionComboBox1To8;
    private javax.swing.JComboBox<String> typeOfTransactionComboBox2To1;
    private javax.swing.JComboBox<String> typeOfTransactionComboBox2To8;
    private javax.swing.JComboBox<String> typeOfTransactionComboBox7To1;
    private javax.swing.JComboBox<String> typeOfTransactionComboBox7To2;
    private javax.swing.JComboBox<String> typeOfTransactionComboBox8To7;
    // End of variables declaration//GEN-END:variables
}

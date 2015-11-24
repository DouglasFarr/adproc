/*
 */
package adproccw;

import javax.swing.JOptionPane;
import javax.swing.JDialog;

/**
 *
 * @author Compaq
 */
public class PipeUI extends javax.swing.JFrame {

    /**
     * Creates new form PipeUI
     */
    public PipeUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrder = new javax.swing.JButton();
        txtLength = new javax.swing.JTextField();
        txtRad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lstOrder = new java.awt.List();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        cbxInsulation = new javax.swing.JCheckBox();
        cbxReinforce = new javax.swing.JCheckBox();
        cbxResistant = new javax.swing.JCheckBox();
        BtnNew = new javax.swing.JButton();
        cmbGrade = new javax.swing.JComboBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rdbNone = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOrder.setText("Add to Order");
        btnOrder.setName("btnOrder"); // NOI18N
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        txtLength.setName("txtLength"); // NOI18N
        txtLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLengthActionPerformed(evt);
            }
        });

        txtRad.setName("txtRad"); // NOI18N

        jLabel1.setText("Plastic Grade:");

        jLabel2.setText("Length (m):");

        jLabel3.setText("Radius (Inch)");

        jLabel4.setText("Cost: £");

        lblCost.setText("0000.00");
        lblCost.setName("lblCost"); // NOI18N

        jLabel5.setText("Total: £");

        lblTotal.setText("0000.00");
        lblTotal.setName("lblCost"); // NOI18N

        cbxInsulation.setText("Insulation");

        cbxReinforce.setText("Reinforcement");

        cbxResistant.setText("ChemicalResist");

        BtnNew.setText("New Order");
        BtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewActionPerformed(evt);
            }
        });

        cmbGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        cmbGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGradeActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Two");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("One");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("PipesR’us");

        rdbNone.setText("None");

        jLabel7.setText("Colours:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(lstOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotal)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbxInsulation)
                        .addComponent(cbxResistant)
                        .addComponent(cbxReinforce)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCost)))
                    .addComponent(btnOrder)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(12, 12, 12))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtLength)
                                        .addComponent(txtRad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(rdbNone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton2)
                                    .addGap(2, 2, 2))))
                        .addGap(2, 2, 2)))
                .addGap(256, 256, 256))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(rdbNone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxInsulation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxReinforce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxResistant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnOrder)
                .addGap(26, 26, 26)
                .addComponent(lstOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTotal)
                    .addComponent(BtnNew))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        
        //set varibles 
        double total;
        double cost;
        int newGrade;
        int newRadius;
        double newLength;
        String lstEntry;
        
         
        try {

        
        //convert to correct type from string
        newGrade = 1; //cmbGrade.getSelectedItem(); 
        newRadius = Integer.parseInt(txtLength.getText()); 
        newLength = Double.parseDouble(txtRad.getText());
        
        boolean insulation, reinforcement, chemicalResist;
        //get check box values
        insulation = cbxInsulation.isSelected();
        reinforcement = cbxReinforce.isSelected();
        chemicalResist = cbxResistant.isSelected();
        
        
        //creates new object
        //Pipe testPipe = new Pipe(newLength, newRadius, newGrade, 1, insulation, 
        //      reinforcement, chemicalResist);
       
        
        
        PipeChecker cPipe = new PipeChecker();
        

        switch (cPipe.check(newGrade, 1, insulation, reinforcement)) {
            case 0:  
                     break;
            case 1:  Pipe1 aPipe1 =  new Pipe1(newLength, newRadius, newGrade, chemicalResist);
                     break;
            case 2:  Pipe2 aPipe2 =  new Pipe2(newLength, newRadius, newGrade, chemicalResist);
                     break;
            case 3:  Pipe3 aPipe3 =  new Pipe3(newLength, newRadius, newGrade, chemicalResist);
                     break;
            case 4:  Pipe4 aPipe4 =  new Pipe4(newLength, newRadius, newGrade, chemicalResist);
                     break;
            case 5:  Pipe5 aPipe5 =  new Pipe5(newLength, newRadius, newGrade, chemicalResist);
                     break;
        }
        
        //work out total then puts to sting for lable
        
        //cost = aPipe.getPrice();  // need to round, worth doing in function?
        
        cost = 10;
        
        //sets cost lable
        //lblCost.setText(String.valueOf(aPipe.getPrice)); ??????????????
        //sets lable
        lblCost.setText(String.valueOf(cost));
   
        JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "This pipe costs :£" + cost + 
            ". Would you like to add to order?", "Add to order",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   
    if (response == JOptionPane.YES_OPTION) {
      
        
        //add cost to total 
        total = Double.parseDouble(lblTotal.getText()); //use lbl as varible? 
        total = total + cost;
        lblTotal.setText(String.valueOf(total));
        
        // list item
        lstEntry = ("Pipe grade: " + newGrade + " Radius: " + newRadius +
                " Lenght: " + newLength + " Cost: " + cost);
        
        lstOrder.add(lstEntry); // adds to list
        clear();
    }  
        
    } catch (Exception exRef) {
                    // catch block, or exception handler, could have more than one handler
                    JOptionPane.showMessageDialog(null, exRef);
 }
    
    }//GEN-LAST:event_btnOrderActionPerformed

    private void txtLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLengthActionPerformed

    private void BtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewActionPerformed
        // TODO add your handling code here:
         clear();
         lstOrder.clear(); //???
        
        lblCost.setText("");
        lblTotal.setText("");
       
    }//GEN-LAST:event_BtnNewActionPerformed

    private void cmbGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGradeActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void clear()
    {
        //cmbGrade.setSelectedItem(1);  
        txtLength.setText(""); 
        txtRad.setText("");
        
        
        cbxInsulation.setSelected(false);
        cbxReinforce.setSelected(false);
        cbxResistant.setSelected(false);
    }
    
    
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
            java.util.logging.Logger.getLogger(PipeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PipeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PipeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PipeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PipeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNew;
    private javax.swing.JButton btnOrder;
    private javax.swing.JCheckBox cbxInsulation;
    private javax.swing.JCheckBox cbxReinforce;
    private javax.swing.JCheckBox cbxResistant;
    private javax.swing.JComboBox cmbGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblTotal;
    private java.awt.List lstOrder;
    private javax.swing.JRadioButton rdbNone;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtRad;
    // End of variables declaration//GEN-END:variables
}

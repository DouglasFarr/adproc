/*
 */
package adproccw;


//import javax.swing.*; //??????????????????????

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

        BtnOrder = new javax.swing.JButton();
        txtGrade = new javax.swing.JTextField();
        txtLength = new javax.swing.JTextField();
        txtRad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        list1 = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnOrder.setText("Add to Order");
        BtnOrder.setName("BtnOrder"); // NOI18N
        BtnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderActionPerformed(evt);
            }
        });

        txtGrade.setName("TxtGrade"); // NOI18N
        txtGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradeActionPerformed(evt);
            }
        });

        txtLength.setName("txtLength"); // NOI18N
        txtLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLengthActionPerformed(evt);
            }
        });

        txtRad.setName("txtRad"); // NOI18N

        jLabel1.setText("Grade");

        jLabel2.setText("Length");

        jLabel3.setText("Rad");

        jLabel4.setText("Cost: £");

        lblCost.setText("0000.00");
        lblCost.setName("lblCost"); // NOI18N

        jLabel5.setText("Total: £");

        lblTotal.setText("0000.00");
        lblTotal.setName("lblCost"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCost)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnOrder)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtGrade)
                                        .addComponent(txtLength)
                                        .addComponent(txtRad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotal)
                                .addGap(23, 23, 23)))))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(BtnOrder)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTotal))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderActionPerformed
        // TODO add your handling code here:
        
        //set varibles 
        double total;
        double cost;
        int newGrade;
        int newRadius;
        double newLength;
        String lstEntry;
         
        
        
        //convert to correct type from string
        newGrade = Integer.parseInt(txtGrade.getText()); 
        newRadius = Integer.parseInt(txtLength.getText()); 
        newLength = Double.parseDouble(txtRad.getText());
        
        //creates new object
        Pipe aPipe = new Pipe(newGrade, newLength, newRadius, true, true, true);
        
        //work out total then puts to sting for lable
        cost = aPipe.getPrice();  // need to round, worth doing in function?
        
        //sets cost lable
        //lblCost.setText(String.valueOf(aPipe.getPrice)); ??????????????
        //sets lable
        lblCost.setText(String.valueOf(cost));
   
        //add cost to total 
        total = Double.parseDouble(lblTotal.getText()); //use lbl as varible? 
        total = total + cost;
        lblTotal.setText(String.valueOf(total));
        
        // list item
        lstEntry = ("Pipe grade: " + newGrade + " Radius: " + newRadius +
                " Lenght: " + newLength + " Cost: " + cost);
        
        list1.add(lstEntry); // adds to list
        
        
    }//GEN-LAST:event_BtnOrderActionPerformed

    private void txtGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGradeActionPerformed

    private void txtLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLengthActionPerformed

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
    private javax.swing.JButton BtnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblTotal;
    private java.awt.List list1;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtRad;
    // End of variables declaration//GEN-END:variables
}


package adproccw;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.*;
import java.util.ArrayList;
// for the image
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Main UI Class
 * 
 * @author James Taylor <up368574@myport.ac.uk>, Douglas Farr <> 
 */
public class PipeUI extends javax.swing.JFrame {

    
    private final  ArrayList<Order> orderList = new ArrayList<>(); 
    private double total, newLength, newRadius;
    private String cost;
    private int newGrade, type, colour, quantity;  
    private  boolean insulation, reinforcement, chemicalResist;
    private Pipe aPipe;
    private Order newOrder;
    private final PipeChecker cPipe = new PipeChecker();
    
    /**
     * Creates new form PipeUI
     */
    public PipeUI() {
        
        initComponents();
        groupRadioButtons();
        //txtQuantity.setText("1"); Done now in initComponents();
        ImageIcon img = new ImageIcon("pipes.png");
        setIconImage(img.getImage());
        
        }
    

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstbxOrder = new java.awt.List();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        BtnNew = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnTables = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtLength = new javax.swing.JTextField();
        txtRad = new javax.swing.JTextField();
        cmbGrade = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rdbNone = new javax.swing.JRadioButton();
        rdbOne = new javax.swing.JRadioButton();
        rdbTwo = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        cbxInsulation = new javax.swing.JCheckBox();
        cbxReinforce = new javax.swing.JCheckBox();
        cbxResistant = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pipes'R'Us");

        jLabel5.setText("Total: £");

        lblTotal.setText("0");
        lblTotal.setToolTipText("Total cost");
        lblTotal.setName("lblCost"); // NOI18N

        BtnNew.setText("Reset Order");
        BtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Pipes'Я’us");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        BtnEdit.setText("Edit");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnTables.setText("Info");
        BtnTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTablesActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtLength.setName("txtLength"); // NOI18N

        txtRad.setName("txtRad"); // NOI18N

        cmbGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel1.setText("Plastic Grade:");

        jLabel2.setText("Length (Meters):");

        jLabel3.setText("Diameter (Inches):");

        txtQuantity.setText("1");

        jLabel8.setText("Quantity:");

        btnOrder.setText("Get Price");
        btnOrder.setName("btnOrder"); // NOI18N
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Colours"));
        jPanel3.setToolTipText("");

        rdbNone.setSelected(true);
        rdbNone.setText("None");
        rdbNone.setToolTipText("No additional costs.");

        rdbOne.setText("One");
        rdbOne.setToolTipText("12% extra cost");

        rdbTwo.setText("Two");
        rdbTwo.setToolTipText("17% extra cost");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbNone)
                .addGap(10, 10, 10)
                .addComponent(rdbOne)
                .addGap(10, 10, 10)
                .addComponent(rdbTwo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNone)
                    .addComponent(rdbOne)
                    .addComponent(rdbTwo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        cbxInsulation.setText("Insulation");
        cbxInsulation.setToolTipText("14% extra cost");

        cbxReinforce.setText("Reinforcement");
        cbxReinforce.setToolTipText("15% extra cost");

        cbxResistant.setText("Chemical Resistance");
        cbxResistant.setToolTipText("12% extra cost");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxInsulation)
                    .addComponent(cbxReinforce)
                    .addComponent(cbxResistant))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxInsulation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxReinforce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxResistant)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtRad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLength)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnOrder)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnOrder)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel4.setText("Products in Order:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(BtnTables, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(BtnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstbxOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnTables)
                            .addComponent(BtnNew))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstbxOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemove)
                            .addComponent(BtnEdit)
                            .addComponent(jLabel5)
                            .addComponent(lblTotal))))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        
        if (getInputs()) {           
            if (validInput()) {
                type = cPipe.check(newGrade, colour, insulation, reinforcement);
                if (type != 0) {  
                    initPipe(type);        //initialize the correct pipe
                    newOrder = new Order(aPipe , quantity);
                    cost = new DecimalFormat("0.00").format(newOrder.getOrderPrice());

                    //Yes or no option message box asked if theyd like to add to order
                    JDialog.setDefaultLookAndFeelDecorated(true);
                    int response = JOptionPane.showConfirmDialog(null, "You require a type " + type + ". This pipe costs £" + cost +
                            ". Would you like to add to order?", "Add to order",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                    if (response == JOptionPane.YES_OPTION) {
                        addToOrder();
                    }
                } else {
                    msg("Your chosen options do not create a pipe of a valid type");
                }
            } 
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void BtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewActionPerformed

        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you"
        + " would like to reset? All Orders will be lost.", "Reset",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            //clears inputs
            clearText();

            //empties lists
            lstbxOrder.removeAll(); 
            orderList.clear();

            //resets lables
            lblTotal.setText("0");
            txtQuantity.setText("1");
        }
    }//GEN-LAST:event_BtnNewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        //gets selected item
        int index = lstbxOrder.getSelectedIndex();
        
        // if an item is slected remove it 
        if(validSelected() == true) {
            lstbxOrder.remove(index);
            orderList.remove(index);
            updateTotal();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
                
        int index = lstbxOrder.getSelectedIndex();
        
        if(validSelected() == true) {
            Order xOrder = orderList.get(index);
            Pipe xPipe = xOrder.getPipe();

            txtLength.setText(Double.toString(xPipe.getPipeLength()));
            txtRad.setText(Double.toString(xPipe.getPipeDiameter()));
            txtQuantity.setText(Integer.toString(xOrder.getQuantity()));

            cmbGrade.setSelectedIndex(xPipe.getPipeGrade() -1);
                    
            //getPipeGrade()
            switch (xPipe.getPipeColours()) {
                case 0:
                    rdbNone.setSelected(true);
                    break;
                case 1:
                    rdbOne.setSelected(true);
                    break;
                default:
                    rdbTwo.setSelected(true);
                    break;
            }

            cbxInsulation.setSelected(xPipe.isPipeInsulation());
            cbxReinforce.setSelected(xPipe.isPipeReinforcement());
            cbxResistant.setSelected(xPipe.isPipeChemicalRes());

            btnRemove.doClick();
        }   
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTablesActionPerformed
       
        try {
            BufferedImage myPicture = ImageIO.read(new File("JavaCW-Tables.png"));
            ImageIcon icon = new ImageIcon(myPicture);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException | HeadlessException exRef) {
            //catch block, or exception handler 
            JOptionPane.showMessageDialog(null, exRef);
        } 
    }//GEN-LAST:event_BtnTablesActionPerformed

    private void clearText() {
        
        cmbGrade.setSelectedIndex(0);
        txtLength.setText(""); 
        txtRad.setText("");
        //txtQuantity.setText("");
        txtQuantity.setText("1"); 
        
        //unticks boxes
        cbxInsulation.setSelected(false);
        cbxReinforce.setSelected(false);
        cbxResistant.setSelected(false);
        
        //sets defualt radio button 
        rdbNone.setSelected(true);
    }
    
    private void updateTotal() {
        
        total = 0;
        
        //for each pipe in list add the price 
        for(Order aOrder:  orderList){ 
           total += aOrder.getOrderPrice();
        }
 
        //updates lable
        String totalCost = new DecimalFormat("0.00").format(total);
        lblTotal.setText(totalCost);
    }
    
    private boolean getInputs() {
        
        double r = 0, l = 0;
        int q = 0;
        
        //get number values
        boolean numberFormats = true;  
        try {
            r = Double.parseDouble(txtRad.getText()) / 2;
        } catch (NumberFormatException e) {
            msg("Diameter should be a numeric value");
            numberFormats = false;
        }
        try {
            l = Double.parseDouble(txtLength.getText());
        } catch (NumberFormatException e) {
            msg("Length should be a numeric value");
            numberFormats = false;
        }
        try {
            q = Integer.parseInt(txtQuantity.getText());
        } catch (NumberFormatException e) {
            msg("Quantity should be an integer value");
            numberFormats = false;
        }
        
        if (numberFormats) {
            //set attributes to valid numbers
            newRadius = r;
            newLength = l;
            quantity = q;
            //get plastic grade
            newGrade = cmbGrade.getSelectedIndex() + 1;
            //get radio value
            if (rdbNone.isSelected()) {
                colour = 0;
            } else if (rdbOne.isSelected()) {
                colour = 1;
            } else {
                colour = 2;
            }
            //get check box values
            insulation = cbxInsulation.isSelected();
            reinforcement = cbxReinforce.isSelected();
            chemicalResist = cbxResistant.isSelected();
            return true;
        } else {
            return false;
        }     
    }
    
    private boolean validInput() {
        
        boolean quantityCheck;
        boolean lengthCheck;
        boolean radiusCheck;
        
        lengthCheck = rangeCheck("Length", newLength, 0.1, 6.0);
        radiusCheck = rangeCheck("Diameter", newRadius*2, 1, 20.0);
        quantityCheck = rangeCheck("Quantity", quantity, 1, 100);
        
        return(quantityCheck & lengthCheck & radiusCheck);
    }
    
    private boolean rangeCheck(String name,double testValue, double min, double max) {
        
        String message = name + " ";
        if (testValue < min) {
            message += "is to small. Must be atleast " + min;             
        } else if  (testValue > max) {
            message += "is to big. Cannot be greater than " + max; 
        } else {
            return true; 
        }
     
        msg(message);  
        return false;
    }
        
    private void addToOrder() {

        newOrder = new Order(aPipe, quantity);
        orderList.add(newOrder);

        updateTotal();
        String lstEntry;    // list item
        lstEntry = ("Type:" + type + " " + newOrder.valuesToString());
        lstbxOrder.add(lstEntry); // adds to list
        clearText();
    }
    
    private void initPipe(int type) {
        
        switch (type) {
            case 1:
                aPipe = new Pipe1(newLength, newRadius, newGrade, chemicalResist);
                break;
            case 2:
                aPipe = new Pipe2(newLength, newRadius, newGrade, chemicalResist);
                break;
            case 3:
                aPipe = new Pipe3(newLength, newRadius, newGrade, chemicalResist);
                break;
            case 4:
                aPipe = new Pipe4(newLength, newRadius, newGrade, chemicalResist);
                break;
            case 5:
                aPipe = new Pipe5(newLength, newRadius, newGrade, chemicalResist);
                break;
        }
    }
    
    private boolean validSelected() {
        
        boolean valid = false;
        int index = lstbxOrder.getSelectedIndex();
        if (index != -1) {
            valid = true;
        } else if (orderList.isEmpty()) {
            msg("You have no items in the list");
        } else {
            msg("Please select an item");
        }
     
        return valid;
    }
    
    private void groupRadioButtons() {
        ButtonGroup group = new ButtonGroup();
        group.add(rdbNone);
        group.add(rdbOne);
        group.add(rdbTwo);
    }
    
    private void msg(String s) {
        JOptionPane.showMessageDialog(null, s);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PipeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PipeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnNew;
    private javax.swing.JButton BtnTables;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnRemove;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTotal;
    private java.awt.List lstbxOrder;
    private javax.swing.JRadioButton rdbNone;
    private javax.swing.JRadioButton rdbOne;
    private javax.swing.JRadioButton rdbTwo;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRad;
    // End of variables declaration//GEN-END:variables

}

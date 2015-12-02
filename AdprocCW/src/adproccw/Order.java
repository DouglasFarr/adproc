
package adproccw;

import java.text.DecimalFormat;

/**
 * An order, contains a pipe and a quantity
 * 
 * @author UP368574 <up368574@myport.ac.uk>, UP730691 <up730691@myport.ac.uk>
 */
public class Order {
    
    private Pipe orderPipe;
    private int orderQuantity;
    
    /**
     * Creates a new order, containing a pipe and a quantity
     * 
     * @param pipe
     * @param quantity 
     */
    public Order(Pipe pipe, int quantity) {
        orderPipe = pipe;
        orderQuantity = quantity;
    }
    
    /**
     * 
     * @return string with pipe details
     */
    public String valuesToString() {
        
        String s;
        String cost = new DecimalFormat("0.00").format(getOrderPrice());
        String options = "";
        
        if (orderPipe.isPipeInsulation()) 
            {options += "Insulation, ";}
        if (orderPipe.isPipeReinforcement())
            {options += "Reinforcement, ";}
        if (orderPipe.isPipeChemicalRes()) 
            {options += "Chemical Resistance, ";} 
        if (options.isEmpty())
            options = "None, ";
        
        s = "Plastic Grade: " + orderPipe.getPipeGrade() + " Diameter: " + orderPipe.getPipeDiameter() +
                " Length: " + orderPipe.getPipeLength() + " Colours: " + orderPipe.getPipeColours() +
                " Options: " + options + " Quantity: " + orderQuantity + " Cost: £" + cost ;               
        return s;
    }
    
    /**
     * sets quantity
     * @param quantity 
     */
    public void setQuantity(int quantity) {
        orderQuantity = quantity;
    }
    
    /**
     * 
     * @return quantity 
     */
    public int getQuantity() {
        return orderQuantity;
    }
    
    /**
     * sets a new pipe
     * @param pipe 
     */
    public void setPipe(Pipe pipe) {
        orderPipe = pipe;
    }
    
    /**
     * 
     * @return Pipe
     */
    public Pipe getPipe() {
        return orderPipe;
    }

    /**
     * 
     * @return price of pipe
     */
    public double getPipePrice() {
        return orderPipe.getPrice();
    }
    
    /**
     * 
     * @return price of entire order
     */
    public double getOrderPrice() {
        double x = orderPipe.getPrice() *  orderQuantity;
        return (x);      
    }
    
}


/*
 */
package adproccw;

import java.text.DecimalFormat;

/**
 *
 * @author James Taylor <up368574@myport.ac.uk>
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
        
        
        s = "Plastic Grade: " + orderPipe.getPipeGrade() + " Radius: " + orderPipe.getPipeRadius() +
                " Length: " + orderPipe.getPipeLength() + " Colours: " + orderPipe.getPipeColours() +
                " Options: " + options + " Quantity: "  + " Cost: £" + cost ; 
                      
        return s;            
    }
    
    public void setQuantity(int quantity) {
        orderQuantity = quantity;
    }
    
    public int getQuantity() {
        return orderQuantity;
    }
    
    public void setPipe(Pipe pipe) {
        orderPipe = pipe;
    }
    
    public Pipe getPipe() {
        return orderPipe;
    }

    public double getPipePrice() {
        return orderPipe.getPrice();
    }
    
    public double getOrderPrice() {
       
        
        double x = orderPipe.getPrice() *  orderQuantity;
        
        return (x);
          
                
    }
    
}


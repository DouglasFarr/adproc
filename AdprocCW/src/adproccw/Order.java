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
        
        s = "Pipe grade: " + orderPipe.getPipeGrade() + " Radius: " + orderPipe.getPipeRadius() +
                " Length: " + orderPipe.getPipeLength() + " colours: " + orderPipe.getPipeColours() + 
                " Insulation: " + orderPipe.isPipeInsulation() + " Reinforcement: " + orderPipe.isPipeReinforcement() +
                " ChemicalRes: " + orderPipe.isPipeChemicalRes()+ " quantity: "  + " cost: £" + cost ; 
                      
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


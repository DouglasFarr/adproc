/*
 */
package adproccw;

/**
 *
 * @author James Taylor <up368574@myport.ac.uk>
 */
public class PipeOrder {
    
    private Pipe orderPipe;
    private int orderQuantity;
    
    /**
     * Creates a new order, containing a pipe and a quantity
     * 
     * @param pipe
     * @param quantity 
     */
    public void PipeOrder(Pipe pipe, int quantity) {
        orderPipe = pipe;
        orderQuantity = quantity;
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
        return orderPipe.getPrice() * orderQuantity;
    }
    
}

/*
 */
package adproccw;

/**
 * Contains list of prices based on grade
 * @author James Taylor <up368574@myport.ac.uk>
 */
public class PriceList {
    double[] prices = {0.3, 0.32, 0.35, 0.4, 0.46};
    
    public PriceList() {
        
    }
    
    
    /**
     * 
     * @param grade
     * @return price per cubic inch of requested plastic grade
     */
    public double getPrice(int grade) {
        return prices[grade-1];
    }
    
}

package adproccw;

/**
 * Type 4 Pipe
 * 
 * @author UP368574 <up368574@myport.ac.uk>, UP730691 <up730691@myport.ac.uk>
 */
public class Pipe4 extends Pipe {
    
    
    /**
     * Creates a new Type 4 Pipe
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe4(double length, double radius, int grade, boolean chemicalResist) {
        super(length, radius, grade, 2, true, false, chemicalResist);
        priceMultiplier = 0.31;
    }
}


package adproccw;

/**
 * Type 4 Pipe
 * 
 * @author James Taylor <up368574@myport.ac.uk>, Douglas Farr <>
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

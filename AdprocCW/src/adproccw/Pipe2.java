
package adproccw;

/**
 * Type 2 Pipe
 * 
 * @author James Taylor <up368574@myport.ac.uk>, Douglas Farr <>
 */
public class Pipe2 extends Pipe {
    
    
    /**
     * Creates a new Type 2 Pipe
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe2(double length, double radius, int grade, boolean chemicalResist) {
        super(length, radius, grade, 1, false, false, chemicalResist);
        priceMultiplier = 0.12;
    }
}


package adproccw;

/**
 * Type 1 Pipe
 * 
 * @author UP368574, UP730691
 */
public class Pipe1 extends Pipe {
    
    
    /**
     * Creates a new Type 1 Pipe
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe1(double length, double radius, int grade, 
            boolean chemicalResist) {
        
        super(length, radius, grade, 0, false, false, chemicalResist);
        priceMultiplier = 0;
    }
}

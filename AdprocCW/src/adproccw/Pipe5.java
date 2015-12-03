
package adproccw;

/**
 * Type 5 Pipe
 * 
 * @author UP368574, UP730691
 */
public class Pipe5 extends Pipe {
    

    /**
     * Creates a new Type 5 Pipe
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe5(double length, double radius, int grade, 
            boolean chemicalResist) {
        
        super(length, radius, grade, 2, true, true, chemicalResist);
        priceMultiplier = 0.46;
    }    
}

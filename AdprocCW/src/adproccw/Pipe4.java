/*
 */
package adproccw;

/**
 *
 * @author jtayl
 */
public class Pipe4 extends Pipe {
    
    private double priceMultiplier = 0.31;
    
    /**
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe4(double length, double radius, int grade, boolean chemicalResist) {
        super(length, radius, grade, 2, true, false, chemicalResist);
    }
}

/*
 */
package adproccw;

/**
 *
 * @author jtayl
 */
public class Pipe2 extends Pipe {
    
    private double priceMultiplier = 0.12;
    
    /**
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe2(double length, double radius, int grade, boolean chemicalResist) {
        super(length, radius, grade, 1, false, false, chemicalResist);
    }
}

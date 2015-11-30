/*
 */
package adproccw;

/**
 *
 * @author jtayl
 */
public class Pipe3 extends Pipe{
    
    //protected double priceMultiplier = 0.17;
    
    /**
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe3(double length, double radius, int grade, boolean chemicalResist) {
        super(length, radius, grade, 2, false, false, chemicalResist);
        priceMultiplier = 0.17;
    }
}

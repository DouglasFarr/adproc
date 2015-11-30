/*
 */
package adproccw;

/**
 *
 * @author jtayl
 */
public class Pipe1 extends Pipe {
    
    
    /**
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe1(double length, double radius, int grade, boolean chemicalResist) {
        super(length, radius, grade, 0, false, false, chemicalResist);
        priceMultiplier = 0;
    }
}

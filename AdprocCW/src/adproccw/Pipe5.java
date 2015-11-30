/*
 */
package adproccw;

/**
 *
 * @author jtayl
 */
public class Pipe5 extends Pipe {
    
    //double priceMultiplier = 0.46;

    /**
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe5(double length, double radius, int grade, boolean chemicalResist) {
        super(length, radius, grade, 2, true, true, chemicalResist);
        priceMultiplier = 0.46;
    }    
}

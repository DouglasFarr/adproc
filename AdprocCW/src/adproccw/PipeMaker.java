/*
 */
package adproccw;

/**
 *
 * @author jtayl
 */
public class PipeMaker {
     
    /**
     * A class to validate and create pipes
     */
    PipeMaker() {}
    
    /**
     * @param type
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist
     * @return Specified pipe type
     */
    public Pipe makePipe(int type, double length, double radius, int grade, boolean chemicalResist) {
        Pipe retPipe = null;
        switch (type){
            case 1: retPipe = new Pipe1(length, radius, grade, chemicalResist);
                    break;
            case 2: retPipe = new Pipe2(length, radius, grade, chemicalResist);
                    break;
            case 3: retPipe = new Pipe3(length, radius, grade, chemicalResist);
                    break;
            case 4: retPipe = new Pipe4(length, radius, grade, chemicalResist);
                    break;
            case 5: retPipe = new Pipe5(length, radius, grade, chemicalResist);
                    break;
        }
        return retPipe;
    }
    
}

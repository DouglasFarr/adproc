/*
 */
package adproccw;

/**
 *
 * @author jtayl
 */
public class PipeMaker {
    
    PipeChecker checker = new PipeChecker();
    
    /**
     * A class to validate and create pipes
     */
    PipeMaker() {}
    
    /**
     * 
     * @param length
     * @param radius
     * @param grade
     * @param colours
     * @param insulation
     * @param reinforcement
     * @param chemicalResist
     * @return 
     */
    public Pipe makePipe(double length, double radius, int grade, int colours, 
            boolean insulation, boolean reinforcement, boolean chemicalResist) {
        int type = checker.check(length, radius, grade, colours, insulation, reinforcement);
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

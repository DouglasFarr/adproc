/*
 */
package adproccw;

/**
 *
 * @author James Taylor <up368574@myport.ac.uk>
 */
public class PipeChecker {
    
    
    /**
     * Can be used to validate pipes
     */
    public PipeChecker() {}
    
    /**
     * 
     * @param length
     * @param radius
     * @param grade
     * @param colours
     * @param insulation
     * @param reinforcement
     * @return Int with pipe type, 0 if not valid
     */
    public int check(int grade, int colours, 
            boolean insulation, boolean reinforcement) {
        int type = checkTypes(grade, colours, insulation, reinforcement);
        return type;
    }
    
    /*
    private boolean checkMeasures(double length, double radius) {
        if (length < 0.1 || length > 6.0)
            return false;
        if (radius < 1.0 || radius > 10.0)
            return false;
        else
            return true;
    }
    */
    

    private int checkTypes(int grade, int colours, boolean insulation, boolean reinforcement) {
        if (reinforcement) {
            if (check5(grade, colours, insulation))
                return 5;
        } else if (insulation) {
            if (check4(grade, colours))
                return 4;
        } else if (colours == 2) {
            if (grade < 2 || grade > 5)
                return 3;
            return 0;
        } else if (colours == 1) {
            if (grade < 2 || grade > 4)
                return 2;
        } else if (colours == 0) {
            if (grade < 1 || grade > 3)
                return 1;
        }
        return 0;
    }
    
    private boolean check5(int grade, int colours, boolean insulation) {
        if (!insulation)
            return false;
        if (colours != 2)
            return false;
        return (grade < 3 || grade > 5);
    } 
    
    private boolean check4(int grade, int colours) {
        if (colours != 2)
            return false;
        return (grade < 2 || grade > 5);
    }
    
}

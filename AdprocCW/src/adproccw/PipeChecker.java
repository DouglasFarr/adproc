
package adproccw;

/**
 * An object to validate pipes
 * 
 * @author UP368574 <up368574@myport.ac.uk>, UP730691 <up730691@myport.ac.uk>
 */
public class PipeChecker {
    
    
    /**
     * Creates a new object to validate pipes
     */
    public PipeChecker() {}
        
    
    /**
     * Checks if options make a pipe of a valid type
     * 
     * @param grade
     * @param colours
     * @param insulation
     * @param reinforcement
     * @return Type of pipe as integer, 0 if invalid
     */
    public int check(int grade, int colours, boolean insulation, boolean reinforcement) {
        if (reinforcement) {
            if (check5(grade, colours, insulation))
                return 5;
        } else if (insulation) {
            if (check4(grade, colours))
                return 4;
        } else if (colours == 2) {
            if (grade >= 2 && grade <= 5)
                return 3;
        } else if (colours == 1) {
            if (grade >= 2 && grade <= 4)
                return 2;
        } else if (colours == 0) {
            if (grade >= 1 && grade <= 3)
                return 1;
        }
        return 0;
    }
    
    private boolean check5(int grade, int colours, boolean insulation) {
        if (!insulation)
            return false;
        if (colours != 2)
            return false;
        return (grade >= 3 && grade <= 5);
    } 
    
    private boolean check4(int grade, int colours) {
        if (colours != 2)
            return false;
        return (grade >= 2 && grade <= 5);
    }
    
}

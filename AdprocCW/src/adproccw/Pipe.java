
package adproccw;

/**
 * The pipe object
 * 
 * @author James Taylor <up368574@myport.ac.uk>
 */
public class Pipe {
    
    private int pipeGrade;
    private double pipeLength; //in meters, volume calculations are in inches;
    //1 inch = 0.0254 meters
    private double pipeRadius; //in inches
    private double pipePrice;
    private boolean pipeInsulation;
    private boolean pipeReinforcement;
    private boolean pipeChemicalRes;
    
    /**
     * Creates a new pipe
     * 
     * @param grade
     * @param length
     * @param radius
     * @param insulation
     * @param renforcement
     * @param chemeicalResist 
     */
    public Pipe (int grade, double length, double radius, boolean insulation, boolean reinforcement, boolean chemicalResist){
        pipeGrade = grade;
        pipeRadius = radius;
        pipeLength = length;
        pipeInsulation = insulation;
        pipeReinforcement = reinforcement;
        pipeChemicalRes = chemicalResist;
        calcPrice();
    }
    
    /**
     * Calculates the price based on the volume and grade of the pipe
     */
    private void calcPrice () {
        double[] prices = {0.3, 0.32, 0.35, 0.4, 0.46};
        double innerRadius = pipeRadius - pipeRadius/10;
        double pipeArea = (Math.PI * Math.pow(pipeRadius, 2.0)) 
                        - (Math.PI * Math.pow(innerRadius, 2.0));
        pipePrice = pipeArea * pipeLength * 0.0254 * prices[pipeGrade-1]; 
    }
    
    /**
     * @return price
     */
    public double getPrice () {
        return pipePrice;
    }
    
    
    
}
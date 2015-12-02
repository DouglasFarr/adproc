
package adproccw;

/**
 * The abstract pipe object
 * Superclass for all other Pipes
 * 
 * @author UP368574 <up368574@myport.ac.uk>, UP730691 <up730691@myport.ac.uk>
 */
public abstract class Pipe {
    
    private final double pipeLength; //in meters, volume calculations are in inches;
    //1 inch = 0.0254 meters
    //1 meter = 39.37 inches
    private final double pipeRadius; //in inches
    private final int pipeGrade;
    private final int pipeColours;
    private final boolean pipeInsulation;
    private final boolean pipeReinforcement;
    private final boolean pipeChemicalRes;
    
    private double pipePrice;
    
    protected double priceMultiplier;
            
    /**
     * Creates a new pipe
     * 
     * @param length pipe length in meters
     * @param radius pipe radius in inches
     * @param grade plastic grade
     * @param colours number of colours required
     * @param insulation inner insulation
     * @param reinforcement outer reinforcement
     * @param chemicalResist chemical resistance
     */
    public Pipe (double length, double radius, int grade, int colours, 
            boolean insulation, boolean reinforcement, boolean chemicalResist) {
        pipeLength = length;
        pipeRadius = radius;
        pipeGrade = grade;
        pipeColours = colours;
        pipeInsulation = insulation;
        pipeReinforcement = reinforcement;
        pipeChemicalRes = chemicalResist;
    }
    
    /**
     * Calculates the price based on the volume and grade of the pipe
     */
    private void calcPrice () {
        double[] prices = {0.3, 0.32, 0.35, 0.4, 0.46};
        double innerRadius = pipeRadius - pipeRadius/10;
        double pipeArea = (Math.PI * Math.pow(pipeRadius, 2.0)) 
                        - (Math.PI * Math.pow(innerRadius, 2.0));
        double pipeLengthI = pipeLength * 39.37;
        double basicPrice = pipeArea * pipeLengthI * prices[pipeGrade-1];
        //System.out.println("basic Price: " + basicPrice);
        //System.out.println("Multiplier: " + priceMultiplier);
        pipePrice = basicPrice + (basicPrice * priceMultiplier);
        if (pipeChemicalRes)
            pipePrice += basicPrice * 0.12; 
    }
    
    /**
     * 
     * @return pipe length
     */
    public double getPipeLength() {
        return pipeLength;
    }
    
    /**
     * 
     * @return pipe radius
     */
    public double getPipeRadius() {
        return pipeRadius;
    }
    
    /**
     * 
     * @return pipe diameter
     */
    public double getPipeDiameter() {
        return pipeRadius * 2;
    }

    /**
     * 
     * @return plastic grade 
     */
    public int getPipeGrade() {
        return pipeGrade;
    }

    /**
     * 
     * @return number of colours
     */
    public int getPipeColours() {
        return pipeColours;
    }

    /**
     * 
     * @return true if insulated
     */
    public boolean isPipeInsulation() {
        return pipeInsulation;
    }

    /**
     * 
     * @return true if reinforced 
     */
    public boolean isPipeReinforcement() {
        return pipeReinforcement;
    }

    /**
     * 
     * @return true if chemical resistant
     */
    public boolean isPipeChemicalRes() {
        return pipeChemicalRes;
    }
    
    /**
     * 
     * @return price
     */
    public double getPrice () {
        calcPrice();
        return pipePrice;
    }
   
    
    
}
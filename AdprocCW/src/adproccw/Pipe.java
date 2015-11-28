
package adproccw;

/**
 * The pipe object
 * 
 * @author James Taylor <up368574@myport.ac.uk>
 */
public abstract class Pipe {
    
    private double pipeLength; //in meters, volume calculations are in inches;
    //1 inch = 0.0254 meters
    //1 meter = 39.37 inches
    private double pipeRadius; //in inches
    private int pipeGrade;
    private int pipeColours;
    private boolean pipeInsulation;
    private boolean pipeReinforcement;
    private boolean pipeChemicalRes;
    
    private double pipePrice;
    
    private double priceMultiplier = 0;
            
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
            boolean insulation, boolean reinforcement, boolean chemicalResist){
        pipeLength = length;
        pipeRadius = radius;
        pipeGrade = grade;
        pipeColours = colours;
        pipeInsulation = insulation;
        pipeReinforcement = reinforcement;
        pipeChemicalRes = chemicalResist;
        calcPrice();
        System.out.println("pipe price" + pipePrice);
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
                System.out.println("basic Price" + basicPrice);
        pipePrice = basicPrice + (basicPrice * priceMultiplier);
        if (pipeChemicalRes)
            pipePrice += basicPrice * 0.12; 
    }

    public double getPipeLength() {
        return pipeLength;
    }

    public double getPipeRadius() {
        return pipeRadius;
    }
    
    public double getPipeDiameter() {
        return pipeRadius * 2;
    }

    public int getPipeGrade() {
        return pipeGrade;
    }

    public int getPipeColours() {
        return pipeColours;
    }

    public boolean isPipeInsulation() {
        return pipeInsulation;
    }

    public boolean isPipeReinforcement() {
        return pipeReinforcement;
    }

    public boolean isPipeChemicalRes() {
        return pipeChemicalRes;
    }
    
    /**
     * @return price
     */
    public double getPrice () {
        return pipePrice;
    }
   
    
    
}
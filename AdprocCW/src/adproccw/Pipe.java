
package adproccw;

/**
 * The basic pipe object
 * 
 * @author James Taylor <up368574@myport.ac.uk>
 */
public class Pipe {
    
    int grade;
    double length; //in meters, volume calculations are in inches;
    //1 inch = 0.0254 meters
    double outerRadius; //in inches
    double price;
    boolean insulation;
    boolean reinforcement;
    boolean chemicalRes;
    
    /**
     * 
     * @param newGrade
     * @param newRadius
     * @param newLength 
     */
    public Pipe (int newGrade, double newRadius, double newLength){
        grade = newGrade;
        outerRadius = newRadius;
        length = newLength;
        calcPrice();
    }
    
    /**
     * Calculates the price based on the volume and grade of the pipe
     */
    private void calcPrice () {
        PriceList prices = new PriceList();
        double innerRadius = outerRadius - outerRadius/10;
        double pipeArea = (Math.PI * Math.pow(outerRadius, 2.0)) 
                        - (Math.PI * Math.pow(innerRadius, 2.0));
        price = pipeArea * length * 0.0254 * prices.getPrice(grade); 
    }
    
    
}


package adproccw;

/**
 *
 * @author James Taylor <up368574@myport.ac.uk>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pipe pipe = new Pipe(1, 10.0, 10.0);
        System.out.println(pipe.price);
        
        PipeUI form = new PipeUI();
        
        form.setVisible(true);
        
        
    }
    
    //GIT HUB TEST :D
    
}

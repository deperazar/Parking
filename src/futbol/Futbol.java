
package futbol;
import becker.robots.*;

public class Futbol {
    private Robot joe;
    private Thing balon;
    private City unal;
    
    public Futbol() {
        
        unal= new City(10,10);
        joe=new Robot(unal, 9, 9, Direction.WEST);
        balon= new Thing(unal, 9, 9);
        
    }
    public void advance(int i){
        for ( int j = 0; j < i; j++) {
            joe.move();    
        }
        
    }
    public void advanceLeft(){
        joe.turnLeft();
        joe.move();
    }
    public void advanceRight(){
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.move();
    }
}

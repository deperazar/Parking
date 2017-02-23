
package futbol;

import becker.robots.Thing.*;

public class Main{
    
    public static void main(String[] args){
        
        Futbol futbol= new Futbol();
        futbol.advance(2);
        futbol.advanceRight();
        futbol.advanceLeft();
        futbol.advance(1);
        futbol.advanceRight();
        futbol.advanceLeft();
        futbol.advance(1);
        futbol.advanceLeft();
        futbol.advanceRight();
        futbol.advance(1);
        
    }
    
}
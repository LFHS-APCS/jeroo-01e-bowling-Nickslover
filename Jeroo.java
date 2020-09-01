/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    // Put your own methods here    
public void hopPlanteother(){
hop();
hopPlant();  
}

public void hopPlant(){
  hop();
  plant();  
}

public void hopTurnR(){
  hop();
  turn(RIGHT);  
}

public void hopTurnL(){
  hop();
  turn(LEFT);
}

public void hopPlanteother3(){
  hopPlanteother();
  hopPlanteother();
  hopPlanteother();
}

public void hopPlanteother2(){
   hopPlanteother();
   hopPlanteother();
}

public void line1(){
  hopTurnR();
  hopPlant();
  turn(LEFT);
  hopPlanteother3();
  turn(RIGHT);
}

public void line2(){
  hopTurnR();
  hopPlant();
  hopPlanteother2();
  turn(LEFT);
}

public void line3(){
  hopTurnL();
  hopPlant();
  hopPlanteother();
  turn(RIGHT);
}

public void line4(){
  hopTurnR();
  hopPlant();
  hop(3);
}

public void setupBowling(){
  line1();
  line2();
  line3();
  line4(); 
}
    


    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}

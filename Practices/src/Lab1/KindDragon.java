package Lab1;

public class KindDragon extends Dragon {

	public KindDragon() {
		// override wiil
	}
    public boolean willDragonEatOrNot() {
    	for (Person i: students) {
    		if (i instanceof Superman) {
    			Superman s = (Superman)i;
    			s.killDragon();
    		}
    		if (i.age > 18){
    			return true;
    		    		}
    	}
    	return false;
    }

}

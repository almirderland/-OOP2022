package Lab1;

public class Superman extends Person {
  int killedCnt;
	public Superman() {
		// TODO Auto-generated constructor stub
	}
	public void killDragon() {
		killedCnt++;
		System.out.println("Dragon is killed");
	}
	public String toString() {
		return super.toString() + "I have killed " + killedCnt;
	}

}

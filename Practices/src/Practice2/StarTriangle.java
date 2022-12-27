package Practice2;

public class StarTriangle {
	private int width;
	StarTriangle (int width){
		this.width = width;
	}

	public int getWidth(){
		return this.width;
	}
	public void setWidth(int width){
		this.width = width;
	}
	
    public String toString(){
    	String s = "";
    	for (int i = 1; i<=this.width; i++) {
    		s = s + "[*]".repeat(i) + "\n";
    	}
    	return s;
    }
}

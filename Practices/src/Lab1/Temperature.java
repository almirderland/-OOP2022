package Lab1;

public class Temperature {
	private double temp;
    private Character scale;
    Temperature(){
        temp = 0;
        scale = 'C';
    }
    Temperature(double temp){
        this.temp = temp;
        this.scale = 'C';
    }
    Temperature(Character scale){
        this.temp = 0;
        this.scale = scale;
    }
    Temperature(double temp, Character scale) {
        this.temp = temp;
        this.scale = scale;
    }
    
    public double getCelciusTemp(){
        if(scale == 'C'){
            return temp;
        } 
        return (temp - 32) * 5 / 9;
        
    }
    
    public double getFarenheitTemp(){
        if(scale == 'F'){
            return temp;
        }
        return (temp * 9 / 5) + 32;
    }
    
    public void setTemp(double temp){
        this.temp = temp;
    }
    
    public void setScale(Character scale){
        this.scale = scale;
    }
    
    public void setTempAndScale(double temp, Character scale){
        this.temp = temp;
        this.scale = scale;
    }
    
    public Character getScale(){
        return scale;
    }
}

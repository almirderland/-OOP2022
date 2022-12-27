package Lab1;

public class Data {
    private double avg;
    private double max;
    private int cnt;
    Data() {
        avg = 0;
        max = -1111111;
        cnt = 0;
    }
    public void add(int n){
        if(n > this.max){
            this.max = n;
        }
        avg = (avg*cnt + n)/(cnt+1);
        cnt++;
    }
    public double getAvg(){
        return avg;
    }
    public double getMax(){
        return max;
    }
}

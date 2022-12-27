package PracticeLec;

public abstract class Shape {
    public int x;
    public Color color;
    
    public Shape() {}
    
    public Shape(Color color, int x) {
        this.color = color;
        this.x = x;
    }
    
    public abstract void draw();
    
}
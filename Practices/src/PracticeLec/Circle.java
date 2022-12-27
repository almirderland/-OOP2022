package PracticeLec;

public class Circle extends Shape {
    int radius;
    
    public Circle() {
        super();
    }
    
    public Circle(Color color, int x, int radius) {
        super(color, x);
        this.radius = radius;
    }
    
    public void draw() {
        for (int i = 0; i < x; i++)
            System.out.print(" ");
        if (color == Color.RED)
            System.err.print("O");
        else 
            System.out.print("O");
    }
    
    public void draw(int number) {
        for (int i = 0; i < number; i++) {
            if (color == Color.BLACK)
                System.out.print("O");
            else
                System.err.print("O");
        }
    }
}
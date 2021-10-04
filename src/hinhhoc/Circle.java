package hinhhoc;

public class Circle extends Shape implements Resizeable {
    private double radius=1.0;

    public Circle(){

    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double Perimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle Wich radius="
                + getRadius()
                +",wich is a subclass of"
                +super.toString();

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",false,3.5);
        System.out.println(circle);
        circle.resize(60);
        circle.howToColor();
        System.out.println(circle);
    }

    @Override
    public void resize(double percent) {
        setRadius(this.radius+percent);
    }

    @Override
    public void howToColor() {
        setColor("không gần ăn cứt");
    }
}

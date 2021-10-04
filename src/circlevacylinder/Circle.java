package circlevacylinder;

public class Circle {
    private String color = "yellow";
    private double radius = 1.0;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    public Circle(){

    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle wich radius ="+
                getRadius()+
                ",wich color ="+
                getColor()+
                ",Area = "+getArea();
    }

    public static void main(String[] args) {
        Circle circle =new Circle("blue",2.0);
        System.out.println(circle.toString());
    }
}

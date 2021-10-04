package hinhhoc;

public class Rectangle extends Shape {
    double width=1.0;
     double length =1.0;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.length = height;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(){

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length=length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }

    @Override
    public String toString() {
        return "A Rectangl with width="
                +getWidth()
                +"and length="
                +getLength()
                +",wich is a subclass off"
                +super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.5,3.8);
        System.out.println(rectangle);
    }
}

package hinhhoc;

public class Square extends Rectangle{

    public Square() {
    }
    public Square(double side){
        super(side,side);
    }

    public Square(double side,String color, boolean filled) {
        super(color,filled,side,side);
    }

    public Square(double width, double length) {
        super(width, length);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square width side"
                +getSide()
                +",wich is a subclass off "
                +super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8,"yellow",true);
        System.out.println(square);
    }
}

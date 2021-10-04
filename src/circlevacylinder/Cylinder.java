package circlevacylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(String color, double radius,double height){
        super(color,radius);
        this.height=height;
    }
    public Cylinder(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.height*this.getRadius()*this.getRadius()*Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinde wich" +
                "height=" +getHeight() +
                ",Area ="+getArea()+
                super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder("blue",2,6);
        System.out.println(cylinder1.toString());
        Cylinder cylinder2 = new Cylinder(8);
        System.out.println(cylinder2.toString());
    }
}

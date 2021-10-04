package triangle;

public class Shape {
   private String color = "red";

    public Shape(String color) {
        this.color = color;
    }
    public Shape(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}

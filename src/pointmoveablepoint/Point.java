package pointmoveablepoint;

public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        setX(x);
        setY(y);
    }
    public float [] getXY(){
        float [] arr = {getX(),getY()};
        return arr;
    }

    @Override
    public String toString() {
        float [] a = getXY();
        String show = "";
        for (float b:a
             ) {
            show+=b;
        }
        return show;
    }

    public static void main(String[] args) {
        Point point = new Point(4,5);
        System.out.println(point.toString());
    }
}

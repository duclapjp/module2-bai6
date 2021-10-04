package point;

public class Point2d {
    private  float x = 0.0f;
    private  float y = 0.0f;

    public Point2d(){
    }
    public Point2d(float x, float y){
        this.x = x;
        this.y = y;
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
        float arr []= {getX(),getY()};
       return arr;
    }

    @Override
    public String toString() {
        float [] array = getXY();
        String show = "";
        for (float a:array
             ) {
            show+=a;
        }
        return show;
    }

    public static void main(String[] args) {
        Point2d point2d = new Point2d(5,7);
        System.out.println(point2d.toString());
    }
}

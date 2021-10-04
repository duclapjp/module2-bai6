package pointmoveablepoint;

public class Movablepoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public Movablepoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movablepoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movablepoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float x,float y){
        setxSpeed(x);
        setySpeed(y);
    }
    public float [] getSpeed(){
        float [] arr = {getxSpeed(),getySpeed()};
                return arr;
    }

    @Override
    public String toString() {
        float [] a = getSpeed();
        String show = "";
        for (float b:a
             ) {
            show+=b;
        }
        return super.toString()+",speed="+show;
    }

    public static void main(String[] args) {
        Movablepoint movablepoint = new Movablepoint(1,2,10,5);
//        Point point = new Point(3,5);
        System.out.println(movablepoint.toString());
    }
}

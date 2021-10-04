package point;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3d(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.setXY(x,y);
        this.z = z;
    }
    public float [] getXYZ(){
        float [] arr = {super.getX(),super.getY(),this.z};
        return arr;
    }

    @Override
    public String toString() {
        float [] arr2 = getXYZ();
        String show= "";
        for (float a :arr2
             ) {
            show+=a;
        }
        return show;
    }

    public static void main(String[] args) {
        Point3d point3d = new Point3d();
        point3d.setZ(9);
        System.out.println(point3d.toString());
    }
}

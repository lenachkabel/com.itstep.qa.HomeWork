package CircleWork;

public class Circle {
    private double radius;

    public double getRadius (){
        return radius;
    }
    public void setRadius (double Radius){
        radius = Radius;
    }

    public double getSquare() {
        return radius * radius * Math.PI;
    }

}

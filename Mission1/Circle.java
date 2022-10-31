package Mission1;

public class Circle {
    private double r;
    private static final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return r*r*PI;
    }
    public double getPerimeter(){
        return 2*PI*r;
    }

    @Override
    public String toString() {
        return "圆的面积是"+getArea()+" 圆的周长是："+getPerimeter()+"圆的半径是"+r;
    }
}

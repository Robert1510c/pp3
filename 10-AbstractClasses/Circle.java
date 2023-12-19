public class Circle extends Shape{
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public void area() {
        double area = r*r*Math.PI;
        // TODO Auto-generated method stub
        System.out.println(area);
    }
    @Override
    public double peramiter() {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        Circle c = new Circle(3);
        c.area();
    }
}

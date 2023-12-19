public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double h;
    
    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    @Override
    public void area() {
        double area = 0.5*a*h;
        // TODO Auto-generated method stub
        System.out.println(area);
    }
    @Override
    public double peramiter() {
        // TODO Auto-generated method stub
        return a+b+c;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(4, 6, 9, 6);
        t.area();
        System.out.println(t.peramiter());
    }
    

}

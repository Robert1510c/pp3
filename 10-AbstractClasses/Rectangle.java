public class Rectangle extends Shape{
    private double a;
    private double b;

    
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void area() {
        double area = a*b;
        // TODO Auto-generated method stub
        System.out.println(area);
    }

    

    @Override
    public double peramiter() {
        // TODO Auto-generated method stub
        return 2*a+2*b;
    }


    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        r.area();
        System.out.println(r.peramiter());
    }
    
}

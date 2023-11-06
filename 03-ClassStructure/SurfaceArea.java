public class SurfaceArea {
    public static double calcCuboid(double lenght, double width, double height){
        return 2 *(lenght*width+lenght*height+width*height);
    }

    public static double calcSphere(double radius){
        return 4 * Math.PI * Math.pow(radius,2);
    }
    
    public static double calcCone(double radius, double slantHeight){
        double baseArea = Math.PI * Math.pow(radius, 2);
        double bok = Math.PI * radius * slantHeight;
        return baseArea + bok;
    }

}

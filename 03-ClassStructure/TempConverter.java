public class TempConverter {
    public static double celToKel(double c){
        return c+273.15;
    }

    public static double kelToCel(double k){
        return k - 273.15;
    }

    public static double celToFahr(double c){
        return (c*1.8)+32;
    }

    public static double fahrToCel(double f){
        return (f-32)* 5/9;
    }

    public static double kelToFahr(double k){
        return (k-273.15)*1.8+32;
    }

    public static double fahrToKel(double f){
        return (f-32)*5/9+273.15;
    }

    public static void main(String[] args){
        double c1=25.0;
        double f1=celToFahr(c1);
        double k1=celToKel(c1);

        double f2=100;
        double c2=fahrToCel(f2);
        double k2=fahrToKel(f2);

        double k3=0;
        double c3=kelToCel(k3);
        double f3=kelToFahr(k3);


        System.out.println(f1);
        System.out.println(k1);

        System.out.println(c2);
        System.out.println(k2);

        System.out.println(c3);
        System.out.println(f3);
    }
    
}

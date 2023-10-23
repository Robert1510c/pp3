public class Height {
    public static void main(String[] args) {
        int height = 179;
        int feet = (int)(height / 30.48);
        int inches =(int)((height % 30.48)/ 2.54);
        System.out.println("Height in cm: "+height+".\n"+"Height in feet and inches: "+ feet+"'"+inches);
    }
}

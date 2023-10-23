public class SpeedTest{
    public static void main(String[] args) {
        Speed s = new Speed();
        Speed s1 = new Speed();
        s.speed = 70;
        s1.speed = 160;

        s.VehicleSpeed();
        s.CheckSpeed();
        s1.VehicleSpeed();
        s1.CheckSpeed();

    }
}
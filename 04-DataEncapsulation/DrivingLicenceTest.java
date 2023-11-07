public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence("Jack","J","Jana Pawła","Kraków","B1",2003);

        dl.setName("paul");

        System.out.println(dl.toString());
        dl.display();
        
    }
}

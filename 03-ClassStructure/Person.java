public class Person {
    private String name;
    private double weight;
    private double height;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        double heightInMeters = height /100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    public void displayRecord() {
        double bmi = calculateBMI();
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");

        if (bmi < 18.5) {
            System.out.println("BMI: " + bmi + " (BMI too low)");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI: " + bmi);
        } else {
            System.out.println("BMI: " + bmi + " (BMI too high)");
        }
    }

    public static void main(String[] args) {
        // Create three Person objects and display their records
        Person person1 = new Person("Alice");
        person1.setWeightAndHeight(55.0, 165.0);

        Person person2 = new Person("Bob", 70.0, 180.0);

        Person person3 = new Person("Charlie", 45.0, 160.0);

        System.out.println("Person 1's Record:");
        person1.displayRecord();

        System.out.println("\nPerson 2's Record:");
        person2.displayRecord();

        System.out.println("\nPerson 3's Record:");
        person3.displayRecord();
    }

}

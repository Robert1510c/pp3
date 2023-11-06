import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;
    double[] grades;

    public StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        Random random = new Random();
        for (int i = 0; i < numberOfGrades; i++) {
            this.grades[i] = (random.nextInt(7)+4) * 0.5;
        }
    }

    public StudentGrades(String name, int numberOfGrades, boolean fromKeyboard) {
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        if (fromKeyboard) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < numberOfGrades; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                this.grades[i] = scanner.nextDouble();
            }
        }
    }

    public double calcLowGrade(){
        if (grades.length ==0){
            return 0.0;
        }
        double lowest = grades[0];
        for (double grade : grades){
            if (grade <lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

    public double calcHighGrade() {
        if (grades.length == 0) {
            return 0.0;
        }
        double highest = grades[0];
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public int numOfGrades() {
        return grades.length;
    }

    public double calcGradePointAvarage() {
        if (grades.length == 0) {
            return 0.0;
        }
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    public void displayStudentRecord() {
        System.out.println("Student's Name: " + studentName);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("\nNumber of Grades: " + numOfGrades());
        System.out.println("Lowest Grade: " + calcLowGrade());
        System.out.println("Highest Grade: " + calcHighGrade());
        System.out.println("Grade Point Average: " + calcGradePointAvarage());
    }

    public static void main(String[] args) {
        StudentGrades amandaRandom = new StudentGrades("Bravo (Random)", 7);
        StudentGrades amandaKeyboard = new StudentGrades("Johny (Keyboard)", 4, true);

        System.out.println("Bravo's Record (Random Grades):");
        amandaRandom.displayStudentRecord();

        System.out.println("\nJohny's Record (Keyboard Input):");
        amandaKeyboard.displayStudentRecord();
    }

}
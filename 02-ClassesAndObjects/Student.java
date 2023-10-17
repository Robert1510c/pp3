public class Student {
    String name;
    int age;
    String studentid;
    boolean studentIdisvalid;
    int semester;
    double avarageGrade;

    void sayHello(){
        System.out.println("Hello from "+name);
    }

    void displayName(){
        System.out.println("The name is: "+name);
    }

    void displayAge(){
        System.out.println("The age is: "+age);
    }

    void studentData(){
        System.out.println(name+""+semester+""+avarageGrade);
    }

    void changeStatus(){
        studentIdisvalid = !studentIdisvalid;
    }

    void studentId(){
        String valid = (studentIdisvalid) ? "Card is valid" : "Card is invalid";
        System.out.println(name+""+studentid+"-is valid? "+valid);
    }
}

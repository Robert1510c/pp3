public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Peter";
        s.age = 21;
        s.studentid= "222222";
        s.studentIdisvalid= true;
        s.semester= 2;
        s.avarageGrade= 3;
        System.out.println(s.name + "" + s.age);

        Student s1= new Student();
        s1.name = "Jake";
        s1.age = 23;
        s1.studentid= "111111";
        s1.studentIdisvalid= false;
        s1.semester= 3;
        s1.avarageGrade= 4;
        System.out.println(s1.name+ "" + s1.age);

        s.sayHello();
        s.displayName();
        s.displayAge();
        s1.sayHello();
        s1.displayName();
        s1.displayAge();
    }    
}

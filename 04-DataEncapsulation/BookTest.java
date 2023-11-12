public class BookTest {
    public static void main(String[] agrs){
        Book b = new Book("LOTR", 350);
        System.out.println(b.getPages());
        b.setPages(400);
        System.out.println(b.getPages());
        b.setPages(-500);
        System.out.println(b.getPages());
    }
    
}

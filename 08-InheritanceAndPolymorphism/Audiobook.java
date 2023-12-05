public class Audiobook extends Book {
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void display(){
        System.out.println("Audiobook info: "+ getTitle()+" "+getAuthor()+" "+minutes+"minutes "+seconds+"seconds.");
    }
    
    public static void main(String[] args) {
        Book b1 = new Book("HP", "Rowling");
        Audiobook ab1 = new Audiobook("PJ", "Riordan", 30, 15);
        Audiobook ab2 = new Audiobook("lotr", "Tolkien", 75, 46);
        b1.display();
        ab1.display();
        ab2.display();
    }
}
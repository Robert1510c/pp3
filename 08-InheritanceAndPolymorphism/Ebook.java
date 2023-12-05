public class Ebook extends Book {
    private int length;
    
    public Ebook(String title, String author, int length) {
        super(title, author);
        this.length = length;
    }



    public void display(){
        System.out.println("Ebook info: "+ getTitle()+" "+getAuthor()+" "+length);
    }

    public static void main(String[] args) {
        Book b1 = new Book("HP", "Rowling");
        Ebook eb1 = new Ebook("PJ", "Riordan", 170);
        Ebook eb2 = new Ebook("lotr", "Tolkien", 300);
        b1.display();
        eb1.display();
        eb2.display();
        
    }



    public int getLength() {
        return length;
    }



    public void setLength(int length) {
        this.length = length;
    }
}

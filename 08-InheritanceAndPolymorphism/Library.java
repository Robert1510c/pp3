import java.util.ArrayList;

public class Library {
    static ArrayList<Book> books = new ArrayList<Book>();
    
    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public static void main(String[] args) {
        Book b1 = new Book("HP", "Rowling");
        Ebook eb2 = new Ebook("ZP", "Riordan",210);
        Ebook eb1 = new Ebook("MP", "Riordan", 250);
        Audiobook ab1 = new Audiobook("LOTR", "Tolkien", 110, 34);
        Audiobook ab2 = new Audiobook("DW", "Tolkien", 79, 0);

        books.add(b1);
        books.add(eb1);
        books.add(eb2);
        books.add(ab1);
        books.add(ab2);

        for(Book i: books){
            i.display();
        }
    }
    
}

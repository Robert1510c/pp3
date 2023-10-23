public class BookTest {
    public static void  main(String[] args){
        Books b = new Books();
        Books b1 = new Books();

        b.AuthorName="Rowling";
        b.BookName="The boy who died";
        b.publishYear= 2020;
        b.ranking= 4;
        b.monthlyNumOfBuyers= 100000;

        b1.AuthorName="Sapkowski";
        b1.BookName="Withcer: Origins";
        b1.publishYear= 2022;
        b1.ranking= 1;
        b1.monthlyNumOfBuyers= 250000;



        b.BookInfo();
        b.showRanking();
        b.Buyers();

        b1.BookInfo();
        b1.showRanking();
        b1.Buyers();

    }
    
}

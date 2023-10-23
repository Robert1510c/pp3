public class Books {
    String BookName;
    String AuthorName;
    int publishYear;
    int ranking;
    int monthlyNumOfBuyers;

    void BookInfo(){
        System.out.println("The book named: '"+BookName+"' was published in "+publishYear+" by "+AuthorName);
    };

    void showRanking(){
        System.out.println("Book is placed "+ranking+" in the ranking");
    };

    void Buyers(){
        System.out.println("There was "+monthlyNumOfBuyers+" buyers of this book last month");
    };
    
}

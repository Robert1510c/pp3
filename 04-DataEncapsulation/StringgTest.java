public class StringgTest {
    public static void main(String[] args){
        Stringg t= new Stringg();
        t.setText("Have a nice day!");
        t.getText();
        System.out.println(t.numOfChar());
        System.out.println(t.firstNChar(17));
        System.out.println(t.endsWith("day!"));
        System.out.println(t.isNotEmpty());
        System.out.println(t.lastOccurence('e'));
        System.out.println(t.replaceSpaces());
        System.out.println(t.toUpperCase());
    }
    
}

public class Stringg {
    private String text;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int numOfChar(){
        return text.length();
    }

    public String firstNChar(int n){
        if (n>text.length()){
            String alert = "Invalid value for N.";
            return alert;
        } else{
            return text.substring(0, n);
        }
    }

    public boolean endsWith(String suffix){
        return text.endsWith(suffix);
    }

    public boolean isNotEmpty(){
        return !text.isEmpty();
    }

    public int lastOccurence(char character){
        return text.lastIndexOf(character);
    }

    public String replaceSpaces(){
        return text.replace(' ','-');
    }

    public String toUpperCase(){
        return text.toUpperCase();
    }
}

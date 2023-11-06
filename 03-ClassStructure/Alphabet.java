public class Alphabet {
    public static boolean isAlphabet(String t){
        for (int i=1; i<t.length();i++){
            if(t.charAt(i)<t.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String text1 = "abegsw";
        String text2 = "abcmhsw";

        System.out.println(text1+" is "+isAlphabet(text1));
        System.out.println(text2+" is "+isAlphabet(text2));
    }
    
}

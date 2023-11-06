public class MyArray {
    public static int even(int[] array){
        int count=0;
        for (int i=0; i<=array.length; i++){
            if (i%2==0){
                count++;
            }
        }
        return count;
    }
    
    public static int positiveOdd(int[] array){
        int count = 0;
        for (int i=0; i<=array.length;i++){
            if (i%2 !=0 && i>0){
                count++;
            }
        }
        return count;
    }

    public static int[] reverse(int[] array){
        int[] reversed = new int[array.length];
        for (int i=0; i<array.length;i++){
            reversed[i]=array[array.length -1-i];
        }
        return reversed;
    }
}

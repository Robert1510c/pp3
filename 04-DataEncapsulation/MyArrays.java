public class MyArrays {
  
    public static int odd(int[] array){
        int count=0;

        for (int i=0; i<array.length; i++){
            if (array[i]>0 && array[i] % 2 !=0){
                count++;
            }
        }

        return count;
    }

    public static int above(int[] array){
        if (array.length==0){
            return 0;
        }
        int sum=0;
        for (int i : array){
            sum+=i;
        }
        int mean = sum/ array.length;

        int aboveSum=0;
        for (int i: array){
            if (i>mean){
                aboveSum+=i;
            }
        }
        return aboveSum;
    }
}

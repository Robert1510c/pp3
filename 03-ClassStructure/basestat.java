public class basestat {
    public static int countItems(int x, int y){
        int count=0;
        for (int number =x; number<=y; number++) {
            count++;
        }
        return count;
    }

    public static int sumNumbers(int x, int y) {
        int sum = 0;
        for (int number = x; number <= y; number++) {
            sum += number;
        }
        return sum;
    }

    public static double calcMean(int x, int y) {
        int count = countItems(x, y);
        int sum = sumNumbers(x, y);
        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int count = countItems(x, y);
        int sum = sumNumbers(x, y);
        double mean = calcMean(x, y);

        System.out.println(count);
        System.out.println(sum);
        System.out.println(mean);
    }
}


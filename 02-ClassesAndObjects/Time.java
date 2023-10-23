public class Time {
    public static void main(String[] args){
        int hours = 14;
        int minutes = 27;

        System.out.printf("hours= %d\nminutes= %d\n",hours,minutes);
        System.out.printf("Time: %d:%d\n",hours,minutes);
        System.out.printf("Minutes from midnight:%d\n",hours*60+minutes);
        System.out.printf("Second from midnight:%d",hours*3600+minutes*60);

    }
    
}

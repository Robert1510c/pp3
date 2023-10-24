public class MyCalendar {
    static int year= 2023;
    static int month= 4;
    static int day= 9;

    static String MyDate(){
        String date = Integer.toString(year)+"-"+Integer.toString(month)+"-"+Integer.toString(day);
        return date;
    }

    static int days(){
        int[] monthsDays = {31,28,31,30,31,30,31,31,30,31,30,31};
            int a = 0;
            for (int i = 0; i < month-1; i++) {
                a+=monthsDays[i];
            }
            return a+day;
        }
    }
    
    /*static String monthName(){
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","","","","","",}
    }*/

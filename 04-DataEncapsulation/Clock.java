public class Clock {
    private int hour;
    private int minute;
    
    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour>=0 && hour<=23){
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute>=0 && minute<=59){
            this.minute = minute;
        }
    }

    public void addMinute(){
        if (minute==59){
            minute=0;
            if (hour==23){
                hour=0;
            } else{
                hour++;
            }
        }else{
            minute++;
        }
    }

    
    
}

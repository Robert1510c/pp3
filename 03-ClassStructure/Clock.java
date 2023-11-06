public class Clock {
    private int hour;
    private int minute;

    public Clock() {
        this.hour = 0;
        this.minute = 0;
    }

    public Clock(int hour, int minute) {
        setClock(hour, minute);
    }

    public void setClock(int hour, int minute) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) {
            this.hour = hour;
            this.minute = minute;
        } else {
            System.out.println("Invalid time. Clock not set.");
        }
    }

    public void setClock() {
        this.hour = 0;
        this.minute = 0;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d%n", hour, minute);
    }

    public void addOneMinute() {
        if (minute < 59) {
            minute++;
        } else {
            minute = 0;
            if (hour < 23) {
                hour++;
            } else {
                hour = 0;
            }
        }
    }
}
public class CounterTest {
    public static void main(String[] args){
        Counter c = new Counter();
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());c.value();
    }
    
}

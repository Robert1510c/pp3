public class Counter {
    private int counter;

    public Counter(){
        counter=0;
    }

    public void increase(){
        counter++;
    }

    public void increase(int n){
        counter+=n;
    }

    public void decrease(){
        counter--;
    }

    public void decrease(int n){
        counter-=n;
    }

    public int value(){
        return counter;
    }
    
}

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX(){
        return y==0;
    }
    
    public boolean isY(){
        return x==0;
    }

    @Override
    public String toString() {
        return "P("+ x + "," + y + ")";
    }

    
}

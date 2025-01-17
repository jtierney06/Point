public class Point {
    private int x;
    private int y;

    
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

   
    public int getX() {
        return x;
    }

 
    public int getY() {
        return y;
    }

  
    public void setX(int x) {
        this.x = x;
    }

   
    public void setY(int y) {
        this.y = y;
    }

    
    public int manhattanDistance(Point other) {
        return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }

   
    public boolean isCollinear(Point p1, Point p2) {
        
        if (this.x == p1.x && this.x == p2.x) {
            return true;
        }

     
        if (this.x == p1.x || this.x == p2.x || p1.x == p2.x) {
            return false;
        }

       
        double slope1 = (double) (p1.y - this.y) / (p1.x - this.x);
        double slope2 = (double) (p2.y - this.y) / (p2.x - this.x);
        return Math.abs(slope1 - slope2) < 0.01;
    }

    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

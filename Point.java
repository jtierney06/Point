public class Point{
    private int X;
    private int Y;

    public Point(){
        X = 0;
        Y = 0;
    }

    public Point(int x, int y){
       X = x;
       Y = y;
    }

    public int getX(){
        return X;
    }

    public int getY(){
        return Y;
    }

    public void setX(int x){
        X = x;
    }

    public void setY(int y){
        Y = y;
    }

    public int manhattanDistance(Point other){
        int distance = Math.abs((this.X - other.X)) + Math.abs((this.Y - other.Y));
        return distance;
    }

    public boolean isCollinear(Point p1, Point p2){
        
    }
}
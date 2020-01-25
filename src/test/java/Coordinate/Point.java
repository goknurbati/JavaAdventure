package Coordinate;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        //eğer p1 ==p1 / gelen object objecte eşitti mi? gelirse ilk buna bak, extra işlem yapma. Bu performansımı artırıyor.
        if(this == obj)
            return true;
        if(!((obj) instanceof Point)){
            return false;
        }
        //downcasting yapmam gerek Object --> Point
        Point other = (Point)obj;
        return this.x == other.x && other.y == this.y;
    }
}




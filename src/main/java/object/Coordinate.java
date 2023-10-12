package object;

/**
 * Created by gujarat on 10/10/16.
 */
public class Coordinate {
    private int x;
    private int y;

    /**
     * remaping the coordinate x and y in positive so we can check the possible number
     * @param x
     * @param y
     */
    public Coordinate(int x, int y) {
        this.x =x;
        this.y =y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

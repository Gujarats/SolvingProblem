package object;

import java.util.ArrayList;


/**
 * Created by gujarat on 10/10/16.
 */
public class Square{
    private Coordinate coordinate1;
    private Coordinate coordinate2;
    private Coordinate coordinate3;
    private Coordinate coordinate4;

    private ArrayList<Coordinate> coordinates;

    public Square(Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3, Coordinate coordinate4) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
        this.coordinate3 = coordinate3;
        this.coordinate4 = coordinate4;
    }

    public Square(ArrayList<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinate getCoordinate1() {
        return coordinate1;
    }

    public void setCoordinate1(Coordinate coordinate1) {
        this.coordinate1 = coordinate1;
    }

    public Coordinate getCoordinate2() {
        return coordinate2;
    }

    public void setCoordinate2(Coordinate coordinate2) {
        this.coordinate2 = coordinate2;
    }

    public Coordinate getCoordinate3() {
        return coordinate3;
    }

    public void setCoordinate3(Coordinate coordinate3) {
        this.coordinate3 = coordinate3;
    }

    public Coordinate getCoordinate4() {
        return coordinate4;
    }

    public void setCoordinate4(Coordinate coordinate4) {
        this.coordinate4 = coordinate4;
    }
}


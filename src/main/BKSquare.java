import object.Square;

/**
 * Created by gujarat on 10/10/16.
 */
public class BKSquare {
    /**
     * 4 coordinate that will create long square
     *
     * compare 2 long sqaure from 8 coordinate given :
     * 1. equal
     * 2. stack
     * 3. separate
     */
    public String getStatusSquare(Square square1, Square square2){
        return "";
    }

    /**
     *
      * @param square
     * @return boolean determing the square is valid or not
     */
    public boolean isValidSquare(Square square){
        boolean isValid;
        if(square.getCoordinate1().getX() == square.getCoordinate4().getX()){
            isValid = true;
        }else{
            isValid = false;
        }

        if(isValid){
            if(square.getCoordinate2().getX() == square.getCoordinate3().getX()){
                isValid = true;
            }else{
                isValid = false;
            }
            return isValid;
        }

        return isValid;
    }

    /**
     * STACK SQUARE
     */
    public boolean isStacked(Square square1, Square square2){
        if(isSquareBiggner(square1, square2)){
           return getCheckStacked(square1, square2);
        }else{
           return getCheckStacked(square2, square1);

        }
    }

    private boolean getCheckStacked(Square square1, Square square2){
        int a = square1.getCoordinate1().getX();
            int b = square1.getCoordinate1().getY();
            int c = square1.getCoordinate2().getX();
            int d = square1.getCoordinate2().getY();
            int e = square1.getCoordinate3().getX();
            int f = square1.getCoordinate3().getY();
            int g = square1.getCoordinate4().getX();
            int h = square1.getCoordinate4().getY();


            int x1 = square2.getCoordinate1().getX();
            int y1 = square2.getCoordinate1().getY();
            int x2 = square2.getCoordinate2().getX();
            int y2 = square2.getCoordinate2().getY();
            int x3 = square2.getCoordinate3().getX();
            int y3 = square2.getCoordinate3().getY();
            int x4 = square2.getCoordinate4().getX();
            int y4 = square2.getCoordinate4().getY();


            int[] swapValue = swapValue(a,c);
            a = swapValue[1];
            c = swapValue[0];

            swapValue = swapValue(f,b);
            b = swapValue[0];
            f = swapValue[1];

            boolean isX1 = isPointStacked(a,c,x1);
            boolean isY1 = isPointStacked(f,b,y1);

            boolean isX2 = isPointStacked(a,c,x2);
            boolean isY2 = isPointStacked(f,b,y2);

            boolean isX3 = isPointStacked(a,c,x3);
            boolean isY3 = isPointStacked(f,b,y3);

            boolean isX4 = isPointStacked(a,c,x4);
            boolean isY4 = isPointStacked(f,b,y4);

            if((isX1 && isX2 && isX3 && isX4) && (isY1 && isY2 && isY3 && isY4))
                return true;
            else
                return false;
    }

    /**
     * isStacked mini point
     */
    private boolean isPointStacked(int point1, int point2, int target){
        if(point1<= target && target <= point2)
            return true;
        else
            return false;
    }

    /**
     * is Square1 bigger
     */
    private boolean isSquareBiggner(Square square1, Square square2){
        int widthSquare1 = getLength(square1.getCoordinate1().getX() , square1.getCoordinate2().getX());
        int heighSquare1 = getLength(square1.getCoordinate2().getY() , square1.getCoordinate3().getY());
        int square1area = widthSquare1*heighSquare1;

        int widthSquare2 = getLength(square2.getCoordinate1().getX() , square2.getCoordinate2().getX());
        int heighSquare2 = getLength(square2.getCoordinate2().getY() , square2.getCoordinate3().getY());
        int square2area = widthSquare2*heighSquare2;

        if(square1area >= square2area)
            return true;
        else
            return false;
    }


    /**
     * calculate length of the given node
     */
    private int getLength(int a, int b){
        // swap so  variable a always bigger
        int [] swapValue = swapValue(a,b);
        a = swapValue[0];
        b = swapValue[1];

        return a-b;
    }

    /**
     * INTERSECT SQUARE
     **/
    public boolean isIntersect(Square square1, Square square2){
        // coordinate square 1
        int a = square1.getCoordinate1().getX();
        int b = square1.getCoordinate2().getX();
        int c = square1.getCoordinate1().getY();
        int d = square1.getCoordinate3().getY();

        // coordinate square 2
        int x = square2.getCoordinate1().getX();
        int y = square2.getCoordinate1().getY();

        //swap between so a and c will always be highest number
        int[] swapValue = swapValue(a,b);
        a = swapValue[0];
        b = swapValue[1];

        swapValue = swapValue(c,d);
        c = swapValue[0];
        d = swapValue[1];

        if((a >= x && b <= x) && (c >= y && d <= y)){
            return true;
        }else{
            return false;
        }

    }

    /**
     * swap value between varibale in java
     * http://stackoverflow.com/questions/1363186/is-it-possible-to-write-swap-method-in-java
     */
    private int [] swapValue(int a,int b){
        if(a<b){
            return new int[]{b,a};
        }else{
            return new int[]{a,b};
        }
    }
}

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
        int x11= square1.getCoordinate1().getX();
        int y11 = square1.getCoordinate1().getY();
        int x12 = square1.getCoordinate2().getX();
        int y13 = square1.getCoordinate3().getY();


        int x21 = square2.getCoordinate1().getX();
        int y21 = square2.getCoordinate1().getY();
        int x22 = square2.getCoordinate2().getX();
        int y22 = square2.getCoordinate2().getY();
        int x23 = square2.getCoordinate3().getX();
        int y23 = square2.getCoordinate3().getY();
        int x24 = square2.getCoordinate4().getX();
        int y24 = square2.getCoordinate4().getY();


        int[] swapValue = swapValue(x11,x12);
        x11 = swapValue[1];
        x12 = swapValue[0];

        swapValue = swapValue(y13,y11);
        y11 = swapValue[0];
        y13 = swapValue[1];

        boolean isX1 = isPointStacked(x11,x12,x21);
        boolean isY1 = isPointStacked(y13,y11,y21);

        boolean isX2 = isPointStacked(x11,x12,x22);
        boolean isY2 = isPointStacked(y13,y11,y22);

        boolean isX3 = isPointStacked(x11,x12,x23);
        boolean isY3 = isPointStacked(y13,y11,y23);

        boolean isX4 = isPointStacked(x11,x12,x24);
        boolean isY4 = isPointStacked(y13,y11,y24);

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
            return true; else
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
        int x11= square1.getCoordinate1().getX();
        int y11 = square1.getCoordinate1().getY();
        int x12 = square1.getCoordinate2().getX();
        int y13 = square1.getCoordinate3().getY();


        int x21 = square2.getCoordinate1().getX();
        int y21 = square2.getCoordinate1().getY();
        int x22 = square2.getCoordinate2().getX();
        int y22 = square2.getCoordinate2().getY();
        int x23 = square2.getCoordinate3().getX();
        int y23 = square2.getCoordinate3().getY();
        int x24 = square2.getCoordinate4().getX();
        int y24 = square2.getCoordinate4().getY();


        int[] swapValue = swapValue(x11,x12);
        x11 = swapValue[1];
        x12 = swapValue[0];

        swapValue = swapValue(y13,y11);
        y11 = swapValue[0];
        y13 = swapValue[1];

        boolean isX1 = isPointStacked(x11,x12,x21);
        boolean isY1 = isPointStacked(y13,y11,y21);

        boolean isX2 = isPointStacked(x11,x12,x22);
        boolean isY2 = isPointStacked(y13,y11,y22);

        boolean isX3 = isPointStacked(x11,x12,x23);
        boolean isY3 = isPointStacked(y13,y11,y23);

        boolean isX4 = isPointStacked(x11,x12,x24);
        boolean isY4 = isPointStacked(y13,y11,y24);

        System.out.println("isX1 = "+isX1);
        System.out.println("isY1 = "+isY1);
        System.out.println("isX2 = "+isX2);
        System.out.println("isY2 = "+isY2);
        System.out.println("isX3 = "+isX3);
        System.out.println("isY3 = "+isY3);
        System.out.println("isX4 = "+isX4);
        System.out.println("isY4 = "+isY4);

        if(isStacked(square1,square2))
            return false;
        else if(isSeparate(square1,square2))
            return false;
        else{
            if((isX1 || isY1) || (isX2 || isY2) || (isX3 || isY3) || (isX4 || isY4))
                return true;
            else
                return false;
        }


    }

    /**
     * checking if given square is separate
     */
    public boolean isSeparate(Square square1, Square square2){
        int x11= square1.getCoordinate1().getX();
        int y11 = square1.getCoordinate1().getY();
        int x12 = square1.getCoordinate2().getX();
        int y13 = square1.getCoordinate3().getY();


        int x21 = square2.getCoordinate1().getX();
        int y21 = square2.getCoordinate1().getY();
        int x22 = square2.getCoordinate2().getX();
        int y22 = square2.getCoordinate2().getY();
        int x23 = square2.getCoordinate3().getX();
        int y23 = square2.getCoordinate3().getY();
        int x24 = square2.getCoordinate4().getX();
        int y24 = square2.getCoordinate4().getY();


        int[] swapValue = swapValue(x11,x12);
        x11 = swapValue[1];
        x12 = swapValue[0];

        swapValue = swapValue(y13,y11);
        y11 = swapValue[0];
        y13 = swapValue[1];

        boolean isX1 = isPointStacked(x11,x12,x21);
        boolean isY1 = isPointStacked(y13,y11,y21);

        boolean isX2 = isPointStacked(x11,x12,x22);
        boolean isY2 = isPointStacked(y13,y11,y22);

        boolean isX3 = isPointStacked(x11,x12,x23);
        boolean isY3 = isPointStacked(y13,y11,y23);

        boolean isX4 = isPointStacked(x11,x12,x24);
        boolean isY4 = isPointStacked(y13,y11,y24);

        if(isX1 && isX2){
            if(isX3 && isY3)
                return false;
            else
                return true;
        }else
            return true;
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

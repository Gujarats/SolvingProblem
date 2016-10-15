import object.Coordinate;
import object.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 10/10/16.
 */
public class BKSquareTesting {
    @Test
    public void TestIsValidSquareTrue1(){
        Coordinate c1 = new Coordinate(0,0);
        Coordinate c2 = new Coordinate(5,0);
        Coordinate c3 = new Coordinate(5,4);

        Coordinate c4 = new Coordinate(0,4);

        Square square =new Square(c1,c2,c3,c4);

        BKSquare bkSquare = new BKSquare();

        assertEquals(true,bkSquare.isValidSquare(square));
    }

    @Test
    public void TestIsValidSquareTrue2(){
        Coordinate c1 = new Coordinate(0,0);
        Coordinate c2 = new Coordinate(5,0);
        Coordinate c3 = new Coordinate(5,-4);

        Coordinate c4 = new Coordinate(0,-4);

        Square square =new Square(c1,c2,c3,c4);

        BKSquare bkSquare = new BKSquare();

        assertEquals(true,bkSquare.isValidSquare(square));
    }

    @Test
    public void testSwapValue(){
        int a = -5;
        int b = -1;

        BKSquare bkSquare = new BKSquare();
        //int [] swapValue = bkSquare.swapValue(a,b);
        //a = swapValue[0];
        //b = swapValue[1];

        //assertEquals(-1,a);
        //assertEquals(-5,b);
    }

    /**
     * square1 smaller
     * square2 bigger
     */
    @Test
    public void testIsBiggerFalse(){
        Coordinate c1 ;
        Coordinate c2 ;
        Coordinate c3 ;
        Coordinate c4 ;
        Square square;
        Square square2;
        BKSquare bkSquare = new BKSquare();

        c1 = new Coordinate(5,-1);
        c2 = new Coordinate(7,-1);
        c3 = new Coordinate(7,-3);
        c4 = new Coordinate(5,-3);
        square = new Square(c1,c2,c3,c4);

        c1 = new Coordinate(-4,1);
        c2 = new Coordinate(8, 1);
        c3 = new Coordinate(8,-4);
        c4 = new Coordinate(-4,-4);
        square2 = new Square(c1,c2,c3,c4);


        //assertEquals(false,bkSquare.isSquareBiggner(square, square2));

    }
    /**
     *using the same coordinate square1 and square 2
     */
    @Test
    public void isSquareBiggerTrue(){

        Coordinate c1 = new Coordinate(0,0);
        Coordinate c2 = new Coordinate(5,0);
        Coordinate c3 = new Coordinate(5,-4);
        Coordinate c4 = new Coordinate(0,-4);

        Square square =new Square(c1,c2,c3,c4);
        Square square2 =new Square(c1,c2,c3,c4);

        BKSquare bkSquare = new BKSquare();
        //assertEquals(true,bkSquare.isSquareBiggner(square, square2));
    }

    /**
     *using the same coordinate square1 and square 2
     */
    @Test
    public void testStackedSquareTrue(){
        Coordinate c1 = new Coordinate(0,0);
        Coordinate c2 = new Coordinate(5,0);
        Coordinate c3 = new Coordinate(5,-4);
        Coordinate c4 = new Coordinate(0,-4);

        Square square =new Square(c1,c2,c3,c4);
        Square square2 =new Square(c1,c2,c3,c4);

        BKSquare bkSquare = new BKSquare();
        assertEquals(true,bkSquare.isStacked(square, square2));

    }

    /**
     * 1 square ,  2 long square
     * square 1 is smaller than long-square 2
     */
    @Test
    public void testIsStackedTrue2(){
        Coordinate c1 ;
        Coordinate c2 ;
        Coordinate c3 ;
        Coordinate c4 ;
        Square square;
        Square square2;
        BKSquare bkSquare = new BKSquare();

        c1 = new Coordinate(5,-1);
        c2 = new Coordinate(7,-1);
        c3 = new Coordinate(7,-3);
        c4 = new Coordinate(5,-3);
        square = new Square(c1,c2,c3,c4);
        assertEquals(true,bkSquare.isValidSquare(square));

        c1 = new Coordinate(-4,1);
        c2 = new Coordinate(8, 1);
        c3 = new Coordinate(8,-4);
        c4 = new Coordinate(-4,-4);
        square2 = new Square(c1,c2,c3,c4);
        assertEquals(true,bkSquare.isValidSquare(square2));


        assertEquals(true,bkSquare.isStacked(square, square2));

    }

    @Test
    public void testIsStackedFalse(){

        Coordinate c1 ;
        Coordinate c2 ;
        Coordinate c3 ;
        Coordinate c4 ;
        Square square;
        Square square2;
        BKSquare bkSquare = new BKSquare();

        //square 1
        c1 = new Coordinate(-1,-1);
        c2 = new Coordinate(3,-1);
        c3 = new Coordinate(3,-5);
        c4 = new Coordinate(-1,-5);
        square = new Square(c1,c2,c3,c4);
        assertEquals(true,bkSquare.isValidSquare(square));

        //square2
        c1 = new Coordinate(2,-2);
        c2 = new Coordinate(5,-2);
        c3 = new Coordinate(5,-5);
        c4 = new Coordinate(2,-5);
        square2 = new Square(c1,c2,c3,c4);
        assertEquals(true,bkSquare.isValidSquare(square2));

        assertEquals(false,bkSquare.isStacked(square, square2));
    }

    /**
     * 1 square ,2 square
     * 1 square bigger than 2 square
     */
    @Test
    public void testIsStackedFalse2(){
        Coordinate c1 ;
        Coordinate c2 ;
        Coordinate c3 ;
        Coordinate c4 ;
        Square square;
        Square square2;
        BKSquare bkSquare = new BKSquare();
        //square 1
        c1 = new Coordinate(2,-2);
        c2 = new Coordinate(5,-2);
        c3 = new Coordinate(5,-5);
        c4 = new Coordinate(2,-5);
        square = new Square(c1,c2,c3,c4);
        assertEquals(true,bkSquare.isValidSquare(square));


        c1 = new Coordinate(3,-3);
        c2 = new Coordinate(4,-3);
        c3 = new Coordinate(4,-4);
        c4 = new Coordinate(3,-4);
        square2 = new Square(c1,c2,c3,c4);
        assertEquals(true,bkSquare.isValidSquare(square2));

        assertEquals(false,bkSquare.isStacked(square, square2));
    }

    @Test
    public void testStackedUsingSquareTilt(){
        Coordinate c1 = new Coordinate(2,-2);
        Coordinate c2 = new Coordinate(-2,2);
        Coordinate c3 = new Coordinate(5,9);
        Coordinate c4 = new Coordinate(9,5);

        Square square = new Square(c1,c2,c3,c4);
        Square square2 = new Square(c1,c2,c3,c4);

        BKSquare bkSquare = new BKSquare();
        //assertEquals(true, bkSquare.isValidSquare(square));

        assertEquals(false,bkSquare.isStacked(square, square2));


    }
}

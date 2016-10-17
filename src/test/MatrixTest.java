import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static java.util.Random.*;

/**
 * Created by gujarat on 12/10/16.
 */
public class MatrixTest extends Random{
    @Test
    public void testMatrix(){
        int [][] matrixA = new int[][]{{2,3,4} , {3,1,3}};
        int [][] matrixB = new int[][]{{1,3,4,2} , {1,6,5,1},{4,8,2,2}};
        int [][] expected = {{21,56,31,15},{16,39,23,13}};
        Matrix matrix = new Matrix();

        System.out.println("matrix 1 : ");
        matrix.printMatrix(matrixA);

        System.out.println("matrix 2 : ");
        matrix.printMatrix(matrixB);


        int [][] resulMatrix = matrix.getCalculation(matrixA,matrixB);
        System.out.println("matrix result : ");
        matrix.printMatrix(resulMatrix);
        assertArrayEquals(expected,resulMatrix);
    }

    @Test
    public void testMatrix2(){
        int [][] matrixA = new int[][]{{2,3,4} , {3,1,3}};
        int [][] matrixB = new int[][]{{1,3,4,2} , {1,6,5,1},{4,8,2,2}};
        int [][] expected = {{21,56,31,15},{16,39,23,13}};
        Matrix matrix = new Matrix();

        System.out.println("matrix 1 : ");
        matrix.printMatrix(matrixA);

        System.out.println("matrix 2 : ");
        matrix.printMatrix(matrixB);


        int [][] resulMatrix = matrix.multiplication(matrixA,matrixB);
        System.out.println("matrix result : ");
        matrix.printMatrix(resulMatrix);
        assertArrayEquals(expected,resulMatrix);

    }

    @Test
    public void testRandomNumber(){
        int min = 10;
        int max = 25;
        int randomNumber = nextInt((max-min)+1)+min;

        System.out.println("Random number : "+ randomNumber);
    }
}

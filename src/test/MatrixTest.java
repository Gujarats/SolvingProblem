import org.junit.Test;

/**
 * Created by gujarat on 12/10/16.
 */
public class MatrixTest {
    @Test
    public void testMatrix(){
        int [][] matrixA = new int[][]{{2,3,4} , {3,1,3}};
        int [][] matrixB = new int[][]{{1,3,4,2} , {1,6,5,1},{4,8,2,2}};
        Matrix matrix = new Matrix();

        System.out.println("matrix 1 : ");
        matrix.printMatrix(matrixA);

        System.out.println("matrix 2 : ");
        matrix.printMatrix(matrixB);


        int [][] resulMatrix = matrix.getCalculation(matrixA,matrixB);
        System.out.println("matrix result : ");
        matrix.printMatrix(resulMatrix);

    }
}

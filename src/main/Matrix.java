/**
 * Created by gujarat on 12/10/16.
 */
public class Matrix {

    /**
     * get calculation from 1 row and 1 column matrixA and matrixB
     * @param matrixA
     * @param matrixB
     * @return result of multiplication matrix a and b
     */
   public int[][] getCalculation(int [][] matrixA,int [][] matrixB){
       int [][] resultMatrix = new int[matrixA.length][matrixB[0].length];
       for (int mAr = 0; mAr < matrixA.length; mAr++) {

           // getting element row of matrix A
           int [] mAre = new int[matrixA[mAr].length];
           for (int mAc = 0; mAc < matrixA[mAr].length; mAc++) {
               mAre[mAc] = matrixA[mAr][mAc];
           }

           //get MatrixB
           for (int mBc = 0; mBc < matrixB[0].length; mBc++) {
               int resultNode=0;
               for (int mBr = 0; mBr < matrixB.length; mBr++) {
                  resultNode = resultNode+ (mAre[mBr] * matrixB[mBr][mBc]);
               }
               resultMatrix[mAr][mBc] = resultNode;
           }

       }
       return resultMatrix;
   }

    public void printMatrix(int [][] matrixResult){
        for (int row = 0; row < matrixResult.length; row++) {
            System.out.print("|");
            for (int column = 0; column < matrixResult[row].length; column++) {
                System.out.print(String.valueOf(matrixResult[row][column])+" ");

            }
            System.out.print("|");
            System.out.println();
        }
    }


}

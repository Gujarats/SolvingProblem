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
       // go loop for row matrixA
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
               // result matrix row MatrixA and column MatrixB
               resultMatrix[mAr][mBc] = resultNode;
           }

       }
       return resultMatrix;
   }

   public int [][] multiplication(int [][] matrixA, int [][] matrixB){
       int aRow = matrixA.length;
       int aColumn = matrixA[0].length;
       int bRow = matrixB.length;
       int bColumn = matrixB[0].length;

       if(aColumn!= bRow) throw new IllegalArgumentException("A column "+aColumn+" did not macth B row "+bRow);

       int [][] result = new int[aRow][bColumn];
       for (int i = 0; i < aRow; i++) {
           for (int j = 0; j < aColumn; j++) {
               for (int k = 0; k < bColumn; k++) {
                  result[i][k] += matrixA[i][j] * matrixB[j][k];
               }
           }

       }

       return result;
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

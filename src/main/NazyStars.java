/**
 * Created by gujarat on 18/10/16.
 */
public class NazyStars {
    public static void main(String [] args){
        printNazyStars(9);
    }

    static void printNazyStars(int number){
        String [][] nazyStars = new String[number][number];
        nazyStars = assignNazyWithEmptySpace(nazyStars);
        // finding the middle matrix index
        int middle = ((number %2) + (number /2))-1;

        //first line above
        for (int i = 0; i <=middle; i++) {
           nazyStars[0] [i] = "*";
        }

        // middle line to below
        for (int i = 0; i < number; i++) {
           nazyStars[i] [middle] = "*";
        }

        // second line to finish
        for (int i = middle; i <  number; i++) {
           nazyStars[nazyStars.length-1] [i] = "*";
        }

        //=================Second Line ==============//

//        //first LIne
        for (int i = nazyStars.length-1; i >=middle ; i--) {
            nazyStars[i] [0] = "*";
        }
//
        //middle line
        for (int i = 0; i < number; i++) {
            nazyStars[middle] [i] = "*";
        }

        // last line
        for (int i = number - middle-2; i >=0 ; i--) {
            nazyStars[i] [number-1] = "*";
        }

        print2DArray(nazyStars);
    }

    static void print2DArray(String [][] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[0].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static String[][] assignNazyWithEmptySpace(String [][] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[0].length; j++) {
                inputArray[i][j] = " ";
            }
        }
        return inputArray;
    }

}

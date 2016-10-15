/**
 * Created by gujarat on 12/10/16.
 */
public class DigitExercise {

    //================================================================================


    // determine the number is palindormic or not
    // do not convert input number to String
    public boolean isPalindormic(int inputNumber){
        int reverse = 0;
        int palindormic = inputNumber;

        while(inputNumber>0){
            int getOneLastDigit = inputNumber%10;
            inputNumber = inputNumber/10;
            reverse = (reverse*10)+getOneLastDigit;
        }

        if(reverse == palindormic)
            return true;
        else
            return false;
    }

    public int firstDigit(int inputNumber){
        while(inputNumber > 9){
            inputNumber = inputNumber/10;
        }
        return inputNumber;
    }


    public int secondDigit(int inputNumber){
        while(inputNumber >100 ){
            inputNumber = inputNumber/10;
        }
        int firstDigit = firstDigit(inputNumber) * 10;
        return  inputNumber - firstDigit;
    }


    public int thirdDigit(int inputNumber){
        while(inputNumber > 1000){
            inputNumber = inputNumber/10;
        }

        int firstDigit = firstDigit(inputNumber)*100;
        int secondDigit = secondDigit(inputNumber)*10;

        return inputNumber-(firstDigit+secondDigit);
    }

    public int lastDigit(int inputNumber){
        while(inputNumber > 9){
            inputNumber = inputNumber %10;
        }
        return inputNumber;
    }

    public int getDigit(int inputNumber) {
        // 5 or less
        if (inputNumber < 100000) {
            // 2 or 1
            if (inputNumber < 100) {
                if (inputNumber < 10) {
                    return 1;
                } else {
                    return 2;
                }
            }

            //3,4,5
            if (inputNumber < 100000) {
                if (inputNumber < 1000) {
                    return 3;
                } else {
                    if (inputNumber < 10000) {
                        return 4;
                    } else {
                        return 5;
                    }
                }

            }
        } else {

            //6,7
            if (inputNumber < 10000000) {
                if (inputNumber < 1000000)
                    return 6;
                else
                    return 7;
            } else {
                //8
                if(inputNumber<100000000){
                    return 8;
                }else{
                    if(inputNumber<1000000000){
                        return 9;
                    }else{
                        return 10;
                    }
                }

            }
        }
        return 0;
    }

    public int getDigit2(int n){
        if (n < 100000){
            // 5 or less
            if (n < 100){
                // 1 or 2
                if (n < 10)
                    return 1;
                else
                    return 2;
            }else{
                // 3 or 4 or 5
                if (n < 1000)
                    return 3;
                else{
                    // 4 or 5
                    if (n < 10000)
                        return 4;
                    else
                        return 5;
                }
            }
        } else {
            // 6 or more
            if (n < 10000000) {
                // 6 or 7
                if (n < 1000000)
                    return 6;
                else
                    return 7;
            } else {
                // 8 to 10
                if (n < 100000000)
                    return 8;
                else {
                    // 9 or 10
                    if (n < 1000000000)
                        return 9;
                    else
                        return 10;
                }
            }
        }
    }

}

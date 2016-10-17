package maharishi;

/**
 * Created by gujarat on 17/10/16.
 */
public class DigitIncreasing {
    public boolean isDigitIncreasing(int n){
        int n1 = 1;
        int power = 0;
        int result =0;

            for (int i = 1; i <=9; i++) {
                do{

                    result += n1*i;
                    if(result == n){
                        return true;
                    }
                    power++;
                    n1 += Math.pow(10,power);

                }while(result <= n);
                result=0;
                n1=1;
                power=0;
            }



        return false;
    }
}

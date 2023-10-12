package maharishi;

/**
 * Created by gujarat on 17/10/16.
 */
public class SameFactorNumber {
    public int sameNumberOfFactor(int n1, int n2){
        if(n1 <0 || n2 <0)
            return -1;
        else if(n1==n2)
            return 1;
       //get factorial number
        int numberFactorN1=getFactorNumber(n1);
        int numberFactorN2=getFactorNumber(n2);

        if(numberFactorN1 == numberFactorN2)
            return 1;
        else
            return 0;
    }

    // I create another function here to avoid duplicate code
    private int getFactorNumber(int number){
       int totalFactor=0;
        for (int i = 1; i <= number; i++) {
            if(number%i==0)
                totalFactor++;
        }

        return totalFactor;
    }
}

package maharishi;

/**
 * Created by gujarat on 17/10/16.
 */
public class EquivalentArrays {
    public int equivalentArrays(int [] a1, int [] a2){
        boolean isArray1Exist = isValidArray(a1,a2) ;
        boolean isArray2Exist = isValidArray(a2,a1) ;

        if(isArray1Exist && isArray2Exist)
            return 1;
        else
            return 0;
    }

    // create another function to avoid duplicate code
    private boolean isValidArray(int []a1, int[]a2){
        boolean isExist = true;
        if(a1.length == 0 && a2.length==0)
            return true;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
               if(a1[i] == a2[j]){
                   return true;
               }
               if(j==a1.length-1 && a1[i]!=a2[j]){
                   isExist = false;
               }
            }
            if(!isExist)
                return false;
        }

        return false;
    }
}

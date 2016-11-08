package BKMainTest;

import java.util.HashMap;

/**
 * Created by gujarat on 03/11/16.
 */
public class CheckPassword {

    public int solution(String S) {
       int index = getIndexUpperCase(S);

        if(index>=0){
           return countPassword(index,S);
        }else{
            return -1;
        }
    }



    public int countPassword(int index, String S){
        char [] sChars = S.toCharArray();
        String combination = "";
        int result = 0;
        for (int i = index; i < sChars.length; i++) {
            combination += sChars[i];
            if(isCorrect(combination))
                result++;

        }

        return result;
    }

    // check valid password
    public boolean isCorrect (String password){
        boolean hasNumber = password.matches(".*\\d+.*");
        boolean hasUppercase = !password.equals(password.toLowerCase());
        if(!hasNumber && hasUppercase){
            return true;
        }else
            return false;
    }

    public int getIndexUpperCase(String s){
        char [] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            if(Character.isUpperCase(sChars[i])){
                return i;
            }
        }

        return -1;
    }
}

import java.util.Arrays;

/**
 * Created by gujarat on 19/10/16.
 */
public class EqualPlayer {
    public String getPlayerEqual(int numberPlayers){
        return "";
    }

    private boolean isEven(int numberPlayers){
        return (numberPlayers%2==0);
    }

    private String equalOdd(int numberPlayers){
        int nPDevided = numberPlayers/2;
        int oddPlayer = 0;
        int evenPlayer = 0;
        if(isEven(nPDevided)){
            oddPlayer = numberPlayers-nPDevided;
            evenPlayer = nPDevided;

        }else{
            evenPlayer = numberPlayers-nPDevided;
            evenPlayer = nPDevided;
        }

        return "";

    }

    private char[] getPlayersId(int numberPlayers){
        char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return  Arrays.copyOfRange(alphabet,0,numberPlayers-1);
    }

}

/**
 * Created by gujarat on 19/10/16.
 */
public class EqualPlayer {
    private int index=0;

    public static void main(String[] args){
        EqualPlayer equalPlayer = new EqualPlayer();
        System.out.println(equalPlayer.getEqualPlayer(10));
    }


    public String getEqualPlayer(int numberPlayers){
        int nPDevided = numberPlayers/2;
        int B = numberPlayers-nPDevided;
        int A = nPDevided;
        String result="";

        if(A>2 || B > 2)
            return "( "+ getEqualPlayer(A)+" )"+" vs "+ "( "+ getEqualPlayer(B)+" )";

        result  = getPlayerDisplay(B,result);
        result  = getPlayerDisplay(A,result);

        return result;

    }

    private String getPlayerDisplay(int dividedPlayer, String result){
        if (dividedPlayer == 2) {
            result = getPlayerVersus2(result);
            index += 2;
        }else if(dividedPlayer == 1){
            result = getPlayerVersus1(result);
            index += 1;
        }
        return result;
    }

    private String getPlayerVersus2(String result){
        if(result.isEmpty()){
            result = "( "+ getPlayerId(index) +" vs " +getPlayerId(index+1) +" )";
        }
        else{
            result =  result+" vs ( "+getPlayerId(index)+" vs "+ getPlayerId(index+1) +" )";
        }
        return result;
    }

    private String getPlayerVersus1(String result) {
        if (result.isEmpty()) {
            result = "" + getPlayerId(index);
        } else {
            result = result + " vs " + getPlayerId(index);
        }

        return result;
    }


    private char getPlayerId(int index){
        char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return  alphabet[index];
    }

}

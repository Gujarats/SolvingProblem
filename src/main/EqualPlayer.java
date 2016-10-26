import java.util.Arrays;

/**
 * Created by gujarat on 19/10/16.
 */
public class EqualPlayer {
    private int index=0;
    public static void main(String[] args){
        EqualPlayer equalPlayer = new EqualPlayer();
        System.out.println(equalPlayer.getEqualPlayer(10));
        System.out.println(equalPlayer.getEqualPlayerID(26));
    }
    public String getPlayerEqual(int numberPlayers){
        return "";
    }

    private boolean isEven(int numberPlayers){
        return (numberPlayers%2==0);
    }

    private String getEqualPlayer(int numberPlayers){
        int nPDevided = numberPlayers/2;
        int A = numberPlayers-nPDevided;
        int B = nPDevided;
        String result="";
        if(A>2 || B>2)
            return "( "+getEqualPlayer(A)+" )"+" vs "+ "( "+getEqualPlayer(B)+" )";

        if(A==2)
            if(result.isEmpty())
                result = "( 1A vs 1A )";
            else
                result =  result+" vs ( 1A vs 1A )";
        else if(A==1)
            if(result.isEmpty())
                result = "1A";
            else
                result = result+" vs 1A";

        if(B==2)
            result = result+ " vs ( 1B vs 1B )";
        else if(B==1)
            result = result+" vs 1B";

        return result;

    }

    private String getEqualPlayerID(int numberPlayers){
        int nPDevided = numberPlayers/2;
        int A = numberPlayers-nPDevided;
        int B = nPDevided;
        String result="";

        if(A>2 || B > 2)
            return "( "+getEqualPlayerID(A)+" )"+" vs "+ "( "+getEqualPlayerID(B)+" )";

        if(A==2)
            if(result.isEmpty()){
                result = "( "+ getPlayerId(index) +" vs " +getPlayerId(index+1) +" )";
                index+=2;
            }
            else{
                result =  result+" vs ( "+getPlayerId(index)+" vs "+ getPlayerId(index+1) +" )";
                index+=2;
            }
        else if(A==1)
            if(result.isEmpty()){
                result = ""+getPlayerId(index);
                index+=1;
            }
            else{
                result = result+" vs "+ getPlayerId(index);
                index+=1;
            }

        if(B==2)
            if(result.isEmpty()){
                result = "( "+ getPlayerId(index) +" vs " +getPlayerId(index+1) +" )";
                index+=2;
            }
            else{
                result =  result+" vs ( "+getPlayerId(index)+" vs "+ getPlayerId(index+1) +" )";
                index+=2;
            }
        else if(B ==1)
            if(result.isEmpty()){
                result = ""+getPlayerId(index);
                index+=1;
            }
            else{
                result = result+" vs "+ getPlayerId(index);
                index+=1;
            }


        return result;

    }


    private char getPlayerId(int index){
        char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return  alphabet[index];
    }

}

package LinkListExercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by gujarat on 29/10/16.
 */
public class Link {

    public String bookName;
    public int millionSold;

    public Link(String bookName, int millionSold) {
        this.bookName = bookName;
        this.millionSold = millionSold;
    }

    public void array(){
        int [] arraySample = {99,1,34,200,5,6,};
        Arrays.sort(arraySample);
        System.out.println(Arrays.toString(arraySample));
    }

    //reference for the next link
    Link next;

    public void display(){
        System.out.println(this.bookName + " sold "+this.millionSold+"000.000");
    }

    public int solution(int N){
        return
                Stream.of(
                        Integer.toBinaryString(N)
                                .replaceAll("0+$","")
                                .split("1+")
                ).filter(a -> a != null)
                .max((a,b)->Integer.compare(a.length(),b.length()))
                .map(String::length)
                .orElse(0);

    }
}

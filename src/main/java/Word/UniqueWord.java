package Word;

import java.util.*;

/**
 * Created by gujarat on 09/11/16.
 */
public class UniqueWord {
    public static void main(String[] args){
        UniqueWord n = new UniqueWord();
        int [] inputArray = {1,2,3,4,5,6,7,8,10};
        int [] result = n.shffule(inputArray);
        System.out.println("Fisher-Yates Shuffle");
        n.print5Array(result);

        result = n.naiveShuffle(inputArray);
        System.out.println("naive shuffle");
        n.print5Array(result);
    }

    public void printUniqueWord(){
        List<String> words = new ArrayList<String>();

        List<String> word10 = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            int randomIndex = new Random().nextInt(words.size());
            if (word10.contains(words.get(randomIndex))) {
                word10.remove(words.get(randomIndex));
                i--;
            }
            word10.add(words.get(randomIndex));
        }
        System.out.println("word10 List: " + word10);
    }

    public void test(){
        Random randomPosition = new Random();  // Random number generator
        Integer[] nums = new Integer[10000];
        for (int i=0; i<nums.length; i++) {
            nums[i] = i;
        }

        print5Array(nums);
        Collections.shuffle(Arrays.asList(nums),randomPosition); // do not bother to reinvent

        print5Array(nums);
    }

    // Fishers-Yates Shuffle
    public int [] shffule(int[] input){
        for (int i = input.length-1; i >0 ; i--) {
            int randomIndex = new Random().nextInt(i+1);
            int tempValue = input[randomIndex];
            input[randomIndex] = input[i];
            input[i] = tempValue;
        }

        return input;
    }

    // naive Shuffle
    public int [] naiveShuffle(int[] input){

        for (int i = 0; i < input.length; i++) {
           int randomIndex = new Random().nextInt(input.length);
            int tempValue = input[randomIndex];
            input[randomIndex] = input[i];
            input[i] = tempValue;

        }

        return input;
    }




    public void print5Array(int[] input){
        for (int i = 0; i <4 ; i++) {
            System.out.println("Index "+i +"= "+input[i]);
        }
        System.out.println("=============");
    }
    public void print5Array(Integer[] input){
        for (int i = 0; i <4 ; i++) {
            System.out.println("Index "+i +"= "+input[i]);
        }
        System.out.println("=============");
    }
}

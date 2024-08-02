import java.util.Arrays;

// Reverse Words in a String

class Solution {

    public static void main(String[] args) {

        String str = "One Two Three Four"; // sentence of four words
        String[] words = str.split(" "); // spilitting words by space
        int n = words.length;
        
        for (int i = 0; i < n/2 ; i++){
            String temp = words[i];
            words [i] = words [n-i-1];
            words[n-i-1] = temp;
        }
        
        System.out.print("Reversed String is -> ");
        for (String reversedStr : words){
            System.out.print(reversedStr + " ");
        } // printing the Reversed String
        
        
    }
}
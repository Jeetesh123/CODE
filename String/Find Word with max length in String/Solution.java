public class Solution {
	
	// Find Word with max length in String

    public static void main(String[] args) {

        String str = "word string jeeteshab";

        String[] words = str.split(" ");
        String longestWord = " ";

        for (String word : words){
            if (word.length() > longestWord.length()){
                    longestWord = word;
            }
        }
    
        System.out.println('\n' + "Word with maximum length in string -> " + longestWord);
        
    }
}
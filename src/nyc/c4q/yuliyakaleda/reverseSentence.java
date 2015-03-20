package nyc.c4q.yuliyakaleda;

/**
 * Yuliya Kaleda
 * C4Q Access Code
 * Twenty Questions Game
 * Created on 03-18-2015
 */

public class reverseSentence {

    public static String reverse(String text) {

        String[] wordsList = text.toLowerCase().split(" ");
        String finalSentence = "";
        int len = wordsList.length;

        for (int i = len-1; i >=0; i--) {
            //cut off punctuation marks
            if (wordsList[i].contains(".") || wordsList[i].contains(",") || wordsList[i].contains("!") || wordsList[i].contains("?")) {
                wordsList[i] = wordsList[i].substring(0, wordsList[i].length() - 1);
            }
            finalSentence += wordsList[i] + ' ';
        }
        //capitalize the first letter of a reverse string, add the punctuation mark
        return finalSentence.toUpperCase().substring(0,1) + finalSentence.substring(1,text.length()-1) + text.charAt(text.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverse("You miss 100% of the shots you don’t take."));
    }
}

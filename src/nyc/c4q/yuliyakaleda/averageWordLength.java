package nyc.c4q.yuliyakaleda;

/**
 * Yuliya Kaleda
 * C4Q Access Code
 * Average Word Length
 * Created on 03-18-2015
 */

public class averageWordLength {

    public static int lettersNumber (String text) {
        int totalLetters = 0;
        for (int i = 0; i < text.length(); i ++ ) {
            //exclude punctuation marks
            if (text.charAt(i) == '.' || text.charAt(i) == ',' || text.charAt(i) == '?' || text.charAt(i) == '!' || text.charAt(i) == ':' || text.charAt(i) == ';')
            continue;
            //exclude whitespaces
            if (text.charAt(i) != ' ')
                totalLetters += 1;
        }
        return totalLetters;
    }
    //calculate average word length
    public static double averageLength (String text) {
        return (lettersNumber(text)) / ((double) countWords.counter(text));
    }

    public static void main (String[] args) {
        System.out.println(averageLength("Eighty percent of success is showing up. "));
    }
}

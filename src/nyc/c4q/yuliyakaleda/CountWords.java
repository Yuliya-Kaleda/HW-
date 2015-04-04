package nyc.c4q.yuliyakaleda;

/**
 * Yuliya Kaleda
 * C4Q Access Code
 * Count Words
 * Created on 03-18-2015
 */
public class CountWords {

    public static int counter(String text) {
        int total = 0;
        for (int i = 0; i < text.length(); i++) {

            //check whether the first char is not a whitespace
            if (i == 0 && text.charAt(i) != ' ')
                total += 1;

            //eliminate the case when there are more than 1 whitespaces in a row or punctuation marks
            if (i > 0 && text.charAt(i) != ' ' && text.charAt(i - 1) == ' ') {
                total += 1;
                    }

            }
            return total;
        }

    public static void main(String[] args) {
        System.out.println(counter("Eighty percent of success is showing up."));
    }
}


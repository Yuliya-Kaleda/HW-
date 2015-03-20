package nyc.c4q.yuliyakaleda;

/**
 * Yuliya Kaleda
 * C4Q Access Code
 * Pretty Title
 * Created on 03-18-2015
 */

public class prettyTitle {

    public static void printTitle(String text, char symbol) {
        int len = text.length();
        String underline;
        String newTitle = text.substring(0,1).toUpperCase();

        // check the case when string begins with a whitespace
        if (text.charAt(0)==' ') {
            underline=" ";
        }
        else {
            underline = "" + symbol;
        }

        for (int i = 1; i < len; i++) {
            //check if the character is whitespace -> not adding underline symbol
            if (text.charAt(i) == ' ') {
                newTitle += text.charAt(i);
                underline += ' ';
            }
            //check if the previous character is a whitespace -> change the letter to uppercase, add the underline symbol
            else if (text.charAt(i-1) == ' ') {
                //not capitalize the preposition of
                if (text.charAt(i) == 'o' && text.charAt(i+1) == 'f'){
                    newTitle += text.charAt(i);
                }
                else {
                    newTitle += text.substring(i,i+1).toUpperCase();
                }
                underline +=symbol;
            }
            //if the previous character is not a whitespace -> add the low case letter, add the underline symbol
            else {
                newTitle += text.charAt(i);
                underline +=  symbol;
            }
        }
        System.out.println(newTitle);
        System.out.println(underline);
    }

    public static void main(String[] args) {
        printTitle("a tale of two cities", '*');

    }
}


package nyc.c4q.yuliyakaleda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;

/**Yuliya Kaleda
 * Verbosity Calculator
 * 03-18-2015
 */
public class Main {

    public static void main(String[] args) {

        //built-in java method to get a decimal format
        DecimalFormat df = new DecimalFormat("##.##");

        try {
            String Dickens = new Scanner(new File("/Users/olgakoleda/desktop/accesscode/HW-20150320/VerbosityCalculator/resources/pg98.txt")).useDelimiter("\\Z").next();
            String Melville = new Scanner(new File("/Users/olgakoleda/desktop/accesscode/HW-20150320/VerbosityCalculator/resources/pg2701.txt")).useDelimiter("\\Z").next();

            //count the number of words in both files
            double totalWordsMelv = countWords(Melville);
            double totalWordsDickens = countWords(Dickens);
            double totalSentencesDick = countSentences(Dickens);
            double totalSentencesMelv = countSentences(Melville);

            //calculate verbosity
            double verbosityDickens = totalWordsDickens / totalSentencesDick;
            double verbosityMelville = totalWordsMelv / totalSentencesMelv;
            System.out.println("Dickens' verbosity is " + df.format(verbosityDickens) + ".");
            System.out.println("Melville's verbosity is " + df.format(verbosityMelville) + ".");

            //compare verbosity of the writers
            if (verbosityDickens > verbosityMelville) {
                System.out.println("Dickens as a writer is more verbose!");
            } else {
                System.out.println("Melville as a writer is more verbose!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //count the number of words
    public static int countWords(String text) {
        int total = 0;
        //loop through each char in a string
        for (int i = 0; i < text.length(); i++) {
            //the first char is not a whitespace, increment count
            if (i == 0 && text.charAt(i) != ' ')
                total += 1;
                //check the previous char and the following char to eliminate the case of consecutive following whitespaces
            else {
                if (i > 0 && text.charAt(i - 1) == ' ' && text.charAt(i + 1) != ' ')
                    total += 1;
            }
        }
        return total;
    }

    //count the number of sentences
    public static int countSentences(String text) {
        int totalSentences = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                totalSentences++;
            }
        }
        return  totalSentences;
    }
}






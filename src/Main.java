import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ScreenMatch!");

        System.out.println("Track films you’ve watched");

        //Declaracion de variables
        int release = 1999;
        double rate = 4.5;
        boolean standardPlan = true;
        String movieName = "Matrix";
        String plot = "Set in the 22nd century, The Matrix tells the story of a computer hacker who joins a group of underground insurgents fighting the vast and powerful computers who now rule the earth.";

        double ratings = 0;

        //Configuracion formato 1 decimal


        DecimalFormat df = new DecimalFormat("#.#");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(decimalFormatSymbols);


        System.out.println("Movie: " + movieName);
        System.out.println(plot);
        System.out.println("Release date: " + release);

        System.out.println("Your rate: " + rate);
        System.out.println("Included in the standard plan: " + standardPlan);

        if (release >= 2024) {
            System.out.println("Category List: New & Upcoming Movies");

        } else {
            System.out.println("Category List: Popular Movies");
        }

        double yourRating = 0;
        for (int i = 0; i < 3; i++) {
            Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Rate this movie");
            yourRating = keyboard.nextDouble();

            ratings = ratings + yourRating;

        }
        double averageRate = ratings / 3;
        System.out.println("Ratings: " + df.format(averageRate));

        while (averageRate > 4 && averageRate <=5) {
            System.out.println("One of your Top Rated Movies");
            averageRate++;
        }
    }

}
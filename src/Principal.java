import Models.Movie;
import Models.Series;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    ArrayList moviesList = new ArrayList<>();
    ArrayList<Series> seriesList = new ArrayList<Series>();

    public void showMenu() {
        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        while (option != 9) {
            String menu = """
                    Welcome to ScreenMatch!!!
                    1) Add new movie
                    2) Add new series
                    3) Series Binge Calculator(Hours per day)
                    4) Series Binge Calculator(Episodes per day)
                                        
                                        
                                        
                    9) Exit!
                    """;

            System.out.println(menu);
            option = keyboard.nextInt();
            keyboard.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Type the name of the movie");
                    String name = keyboard.nextLine();
                    System.out.println("Type the release date of the movie");
                    int release = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Type the running time of the movie in minutes");
                    int runningTime = keyboard.nextInt();
                    keyboard.nextLine();

                    Movie userMovie = new Movie(name, release, runningTime);

                    userMovie.showDetails();
                    moviesList.add(userMovie);
                   // System.out.println(moviesList);
                    break;


                case 2:
                    System.out.println("Type the name of the series");
                    String nameSeries = keyboard.nextLine();
                    System.out.println("Type the release date of the series");
                    int releaseSeries = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Type the numbers of seasons of the series");
                    int seasons = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Type the episodes per season of the series");
                    int episodesSeries = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Type the running time per episode in minutes");
                    int runningTimeSeries = keyboard.nextInt();
                    keyboard.nextLine();

                    Series userSeries = new Series(nameSeries, releaseSeries, runningTimeSeries, seasons, episodesSeries);

                    userSeries.showDetails();
                    seriesList.add(userSeries);
                    //System.out.println(seriesList);
                    break;
                case 3:
                    System.out.println("Binge watch your favorite show");
                    System.out.println("Write the number of daily hours available to see your series");
                    int hours = keyboard.nextInt();
                    keyboard.nextLine();
                    calculateMarathonHours(hours);


                    break;
                case 4:
                    System.out.println("Binge watch your favorite show");
                    System.out.println("Write down how many episodes would you see per day");
                    int episodes = keyboard.nextInt();
                    keyboard.nextLine();
                    calculateMarathonEpisodes(episodes);


                    break;
                case 9:
                    System.out.println("Closing ScreenMatch...................\nCome back soon!!!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }

    private void calculateMarathonHours(int hours) {
       for(Series serie:seriesList){
          int toHours=  serie.getRunningTimeInMinutes() /60;
          int marathonH = toHours / hours;
           System.out.println("You will finish your series in "  + marathonH + " days");
           System.out.println("-------------------------------------------------------");

       }
    }
    private void calculateMarathonEpisodes(int episodes){
        for(Series serie:seriesList){
            int totalEpisodes = serie.getSeasons() * serie.getEpisodesPerSeason();
            int marathonE = totalEpisodes / episodes;
            System.out.println("You will finish your series in " + marathonE + " days");
            System.out.println("-------------------------------------------------------");

        }
    }


}
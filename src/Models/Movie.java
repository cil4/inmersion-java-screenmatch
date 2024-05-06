package Models;

import java.sql.SQLOutput;

public class Movie extends Title{

    private String director;



    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Movie() {
    }

    public Movie(String name, int release, int runningTimeInMinutes) {
        super(name, release, runningTimeInMinutes);
    }


}

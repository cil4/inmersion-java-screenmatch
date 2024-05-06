package Models;

public class Series extends Title{

    private int seasons;

    private int episodesPerSeason;

    private int runningTimeInMinutesPerEpisode;


    @Override
    public int getRunningTimeInMinutes() {
        return runningTimeInMinutesPerEpisode * episodesPerSeason * seasons;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getRunningTimeInMinutesPerEpisode() {
        return runningTimeInMinutesPerEpisode;
    }

    public void setRunningTimeInMinutesPerEpisode(int runningTimeInMinutesPerEpisode) {
        this.runningTimeInMinutesPerEpisode = runningTimeInMinutesPerEpisode;
    }


    public Series() {
    }

    public Series(String name, int release, int seasons, int episodesPerSeason, int runningTimeInMinutesPerEpisode) {
        super(name, release);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.runningTimeInMinutesPerEpisode = runningTimeInMinutesPerEpisode;
    }

   
}

package Models;

public class Title {
    private String name;

    private int release;

    private double rate;

    private boolean standardPlan;

    private String plot;

    private int runningTimeInMinutes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }


    public boolean isStandardPlan() {
        return standardPlan;
    }

    public void setStandardPlan(boolean standardPlan) {
        this.standardPlan = standardPlan;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public int getRunningTimeInMinutes() {
        return runningTimeInMinutes;
    }

    public void setRunningTimeInMinutes(int runningTimeInMinutes) {
        this.runningTimeInMinutes = runningTimeInMinutes;
    }

    public Title() {
    }

    public Title(String name, int release) {
        this.name = name;
        this.release = release;
    }

    public Title(String name, int release, int runningTimeInMinutes) {
        this.name = name;
        this.release = release;
        this.runningTimeInMinutes = runningTimeInMinutes;
    }

    public void showDetails(){
        System.out.println("***INFO***");
        System.out.println("Title: " + name);
        System.out.println("Release date: "+ release);
        System.out.println("Running time: " + getRunningTimeInMinutes() + " minutes");
        System.out.println("-------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", release=" + release +
                ", runningTimeInMinutes=" + getRunningTimeInMinutes() +
                '}';
    }
}

package timing;

public class Time {
    private int currentTime = 0;
    private int endOfTime;
    private static Time theTime = null;

    public static Time getInstance() {
        return theTime;
    }

    public static void init(int endOfTime) {
        if (theTime == null)
            theTime = new Time(endOfTime);
    }

    private Time(int endOfTime){
        this.endOfTime = endOfTime;
    }

    public static int getCurrentTime() {
        return theTime.currentTime;
    }


    public void run() {
        for (int i = 0;i<endOfTime;i++) {}
    }

}

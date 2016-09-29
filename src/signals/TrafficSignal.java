package signals;

public abstract class TrafficSignal {
    private boolean passageRequested = false;
    protected final int STOP = 0;
    protected final int CAUTION = 1;
    protected final int GO = 2;
    protected int state = STOP;

    public void changeState() {
        state++;
        if (state == 3) state = STOP;
        if (state == GO) passageRequested = false;
    }

    public int getState() {
        return this.state;
    }

    public boolean getPassageRequested() {
        return this.passageRequested;
    }

    public void requestPassage() {
        this.passageRequested = true;
    }


    public void passageGranted() {
        this.passageRequested = false;
    }

    public abstract String getMessage();
}

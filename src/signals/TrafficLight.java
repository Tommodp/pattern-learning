package signals;

/**
 * Created by ds on 2016/09/14.
 */
public class TrafficLight extends TrafficSignal {
    @Override
    public String getMessage() {
        switch (state) {
            case STOP       : return "Stop";
            case CAUTION    : return "Caution";
            case GO         : return "Go";
        }
        return null;
    }
}

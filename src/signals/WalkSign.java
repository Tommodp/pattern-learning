package signals;

import signals.TrafficSignal;

public class WalkSign extends TrafficSignal {
    @Override
    public String getMessage() {
        switch (state) {
            case STOP       : return "Stop";
            case CAUTION    : return "Wait";
            case GO         : return "Walk";
        }
        return null;
    }
}

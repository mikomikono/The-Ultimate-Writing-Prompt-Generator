package writingprompts.promptgenerator;

import java.util.Random;

public enum PlotDevice {
    FRIENDSHIP, ALIENS, APOCALYPSE, ZOMBIES, SPORTS, UNIVERSITY
    ;
        
    public static PlotDevice generate() {
        int random = new Random().nextInt(PlotDevice.values().length);
        return PlotDevice.values()[random];
    }
}

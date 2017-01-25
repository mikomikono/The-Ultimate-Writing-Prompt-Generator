package writingprompts.promptgenerator;

import java.util.Random;

public enum Genre {
    FANTASY, SCIFI, ROMCOM, THRILLER, WHODUNIT, ROMANCE, PWP, HISTORICAL, DRAMA, SPACEOPERA
    ;

    public static Genre generate() {
        int random = new Random().nextInt(Genre.values().length);
        return Genre.values()[random];
    }
}

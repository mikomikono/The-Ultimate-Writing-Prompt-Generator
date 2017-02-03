package writingprompts.promptgenerator.logic;

import java.util.List;

public interface Generateable {
    String generate();
    List<String> all();
}

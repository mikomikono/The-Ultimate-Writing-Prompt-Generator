package writingprompts.promptgenerator.logic;

import java.util.List;
import java.util.Random;

public class Setting implements Generateable {
    private List<String> settings;
    private FileReader reader;
    
    public Setting() {
        this.reader = new FileReader("setting.txt");
        this.settings = this.reader.read();
        if (this.settings == null) {
            System.out.println("No settings found.");
        }
    }
    
    public Setting(String file) {
        this.reader = new FileReader(file);
        this.settings = this.reader.read();
        if (this.settings == null) {
            System.out.println("No settings found.");
        }
    }

    @Override
    public String generate() {
        if (this.settings == null) {
            return null;
        }
        int random = new Random().nextInt(this.settings.size() - 1);
        return this.settings.get(random);
    }

    @Override
    public List<String> all() {
        return this.settings;
    }
    
}

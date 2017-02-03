package writingprompts.promptgenerator.logic;

import java.util.List;
import java.util.Random;

public class Genre implements Generateable {
    private List<String> genres;
    private FileReader reader;
    
    public Genre() {
        this.reader = new FileReader("genres.txt");
        this.genres = this.reader.read();
        if (this.genres == null) {
            System.out.println("No genres found.");
        }
    }
    
    public Genre(String file) {
        this.reader = new FileReader(file);
        this.genres = this.reader.read();
        if (this.genres == null) {
            System.out.println("No genres found.");
        }
    }

    @Override
    public String generate() {
        if (this.genres == null) {
            return null;
        }
        int random = new Random().nextInt(this.genres.size());
        return this.genres.get(random);
    }

    @Override
    public List<String> all() {
        return this.genres;
    }
}

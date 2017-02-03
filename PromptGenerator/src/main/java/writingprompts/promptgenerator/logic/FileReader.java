package writingprompts.promptgenerator.logic;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private File file;

    public FileReader(String file) {
        this.file = new File(file);
    }
    
    public List<String> read() {
        List<String> read = new ArrayList<>();
        Scanner reader = null;
        try {
            reader = new Scanner(this.file);
        } catch (Exception e) {
            System.out.println("Could not find file.");
            return null;
        }
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            read.add(line);
        }
        return read;
    }
}

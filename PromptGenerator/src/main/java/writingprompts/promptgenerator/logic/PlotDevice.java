package writingprompts.promptgenerator.logic;

import java.util.List;
import java.util.Random;

public class PlotDevice implements Generateable {
    private List<String> plotDevices;
    private FileReader reader;
    
    public PlotDevice() {
        this.reader = new FileReader("plotpoints.txt");
        this.plotDevices = this.reader.read();
        if (this.plotDevices == null) {
            System.out.println("No plotpoints found.");
        }
    }
    
    public PlotDevice(String file) {
        this.reader = new FileReader(file);
        this.plotDevices = this.reader.read();
        if (this.plotDevices == null) {
            System.out.println("No plotpoints found.");
        }
    }

    @Override
    public String generate() {
        if (this.plotDevices == null) {
            return null;
        }
        int random = new Random().nextInt(this.plotDevices.size());
        return this.plotDevices.get(random);
    }

    @Override
    public List<String> all() {
        return this.plotDevices;
    }
}

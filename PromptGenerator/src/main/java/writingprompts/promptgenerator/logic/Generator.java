package writingprompts.promptgenerator.logic;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private List<Genre> genres;
    private List<PlotDevice> plotDevices;
    
    public Generator() {
        this.genres = new ArrayList<>();
        this.plotDevices = new ArrayList<>();
    }
    
    public void generateGenre() {
        Genre g = Genre.generate();
        while (this.genres.contains(g)) {
            if (Genre.values().length <= this.genres.size()) {
                break;
            }
            g = Genre.generate();
        }
        this.genres.add(g);
    }
    
    public void generatePlotDevice() {
        PlotDevice p = PlotDevice.generate();
        while (this.plotDevices.contains(p)) {
            if (PlotDevice.values().length <= this.plotDevices.size()) {
                break;
            }
            p = PlotDevice.generate();
        }
        this.plotDevices.add(p);
    }
    
    public List<Genre> returnGenres() {
        for (Genre g : genres) {
            System.out.println(g);
        }
        return this.genres;
    }
    
    public List<PlotDevice> returnPlotDevices() {
        for (PlotDevice p : plotDevices) {
            System.out.println(p);
        }
        return this.plotDevices;
    }
    
    public void resetGenres() {
        this.genres = new ArrayList<>();
    }
    
    public void resetPlotDevices() {
        this.plotDevices = new ArrayList<>();
    }
}

package writingprompts.promptgenerator;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import writingprompts.promptgenerator.logic.*;

public class GeneratorTest {
    
    Generator g;
    
    public GeneratorTest() {
    }
    
    @Before
    public void setUp() {
        g = new Generator();
    }

    @Test
    public void createsGenreList() {
        assertEquals(0, g.returnGenres().size());
    }
    
    @Test
    public void createsPlotDeviceList() {
        assertEquals(0, g.returnPlotDevices().size());
    }
    
    @Test
    public void generatesOneGenre() {
        g.generateGenre();
        assertEquals(1, g.returnGenres().size());
    }
    
    @Test
    public void generatesOnePlotDevice() {
        g.generatePlotDevice();
        assertEquals(1, g.returnPlotDevices().size());
    }
    
    @Test
    public void generatesSeveralGenres() {
        g.generateGenre();
        g.generateGenre();
        g.generateGenre();
        g.generateGenre();
        assertEquals(4, g.returnGenres().size());
    }
    
    @Test
    public void generatesSeveralPlotDevices() {
        g.generatePlotDevice();
        g.generatePlotDevice();
        g.generatePlotDevice();
        g.generatePlotDevice();
        g.generatePlotDevice();
        assertEquals(5, g.returnPlotDevices().size());
    }
    
    @Test
    public void resetsGenres() {
        g.generateGenre();
        g.generateGenre();
        g.generateGenre();
        g.resetGenres();
        assertEquals(0, g.returnGenres().size());
    }
    
    @Test
    public void resetsPlotDevices() {
        g.generatePlotDevice();
        g.generatePlotDevice();
        g.generatePlotDevice();
        g.resetPlotDevices();
        assertEquals(0, g.returnPlotDevices().size());
    }
    
    @Test
    public void noSameGenre() {
        g.generateGenre();
        g.generateGenre();
        g.generateGenre();
        g.generateGenre();
        boolean noneSame = true;
        List<Genre> genres = g.returnGenres();
        for (int i = 0; i < genres.size(); i++) {
            for (int x = i+1; x < genres.size(); x++) {
                if (genres.get(i).equals(genres.get(x))) {
                    noneSame = false;
                }
            }
        }
        assertEquals(true, noneSame);
    }
    
    @Test
    public void noSamePlotDevice() {
        g.generatePlotDevice();
        g.generatePlotDevice();
        g.generatePlotDevice();
        g.generatePlotDevice();
        List<PlotDevice> plotDevices = g.returnPlotDevices();
        boolean noneSame = true;
        for (int i = 0; i < plotDevices.size(); i++) {
            for (int x = i+1; x < plotDevices.size(); x++) {
                if (plotDevices.get(i).equals(plotDevices.get(x))) {
                    noneSame = false;
                }
            }
        }
        assertEquals(true, noneSame);
    }
}

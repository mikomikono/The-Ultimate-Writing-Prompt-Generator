package writingprompts.promptgenerator;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import writingprompts.promptgenerator.logic.*;

public class GeneratorTest {
    
    Generator gg;
    Generator gp;
    Generator gs;
    
    public GeneratorTest() {
    }
    
    @Before
    public void setUp() {
        gg = new Generator(new Genre());
        gp = new Generator(new PlotDevice());
        gs = new Generator(new Setting());
    }

    @Test
    public void createsGenreList() {
        assertEquals(0, gg.returnGenerated().size());
    }
    
    @Test
    public void createsPlotDeviceList() {
        assertEquals(0, gp.returnGenerated().size());
    }
    
    @Test
    public void createsSettingList() {
        assertEquals(0, gs.returnGenerated().size());
    }
    
    @Test
    public void generatesOneGenre() {
        gg.generate();
        assertEquals(1, gg.returnGenerated().size());
    }
    
    @Test
    public void generatesOnePlotDevice() {
        gp.generate();
        assertEquals(1, gp.returnGenerated().size());
    }
    
    @Test
    public void generatesOneSetting() {
        gs.generate();
        assertEquals(1, gs.returnGenerated().size());
    }
    
    @Test
    public void generatesSeveralGenres() {
        gg.generate();
        gg.generate();
        gg.generate();
        gg.generate();
        assertEquals(4, gg.returnGenerated().size());
    }
    
    @Test
    public void generatesSeveralPlotDevices() {
        gp.generate();
        gp.generate();
        gp.generate();
        gp.generate();
        gp.generate();
        assertEquals(5, gp.returnGenerated().size());
    }
    
    @Test
    public void generatesSeveralSettings() {
        gs.generate();
        gs.generate();
        gs.generate();
        assertEquals(3, gs.returnGenerated().size());
    }
    
    @Test
    public void doesntGeneratePastNumberOfGenres() {
        for (int i = 0; i <= new Genre().all().size(); i++) {
            gg.generate();
        }
        assertEquals(new Genre().all().size(), gg.returnGenerated().size());
    }
    
    @Test
    public void doesntGeneratePastNumberOfPlotDevices() {
        for (int i = 0; i <= new PlotDevice().all().size()+10; i++) {
            gp.generate();
        }
        assertEquals(new PlotDevice().all().size(), gp.returnGenerated().size());
    }
    
//    @Test
//    public void doesntGeneratePastNumberOfSettings() {
//        for (int i = 0; i <= new Setting().all().size(); i++) {
//            gs.generate();
//        }
//        assertEquals(new Setting().all().size(), gs.returnGenerated().size());
//    }
    
    @Test
    public void returnsAllGenres() {
        List<String> genres = new Genre().all();
        assertNotEquals(null, genres);
    }
    
    @Test
    public void returnsAllPlotDevices() {
        List<String> plotdevices = new PlotDevice().all();
        assertNotEquals(null, plotdevices);
    }
    
    @Test
    public void returnsAllSettings() {
        List<String> settings = new Setting().all();
        assertNotEquals(null, settings);
    }
    
    @Test
    public void resetsGenres() {
        gg.generate();
        gg.generate();
        gg.generate();
        gg.resetGenerated();
        assertEquals(0, gg.returnGenerated().size());
    }
    
    @Test
    public void resetsPlotDevices() {
        gp.generate();
        gp.generate();
        gp.generate();
        gp.resetGenerated();
        assertEquals(0, gp.returnGenerated().size());
    }
    
    @Test
    public void resetsSettings() {
        gs.generate();
        gs.generate();
        gs.generate();
        gs.generate();
        gs.resetGenerated();
        assertEquals(0, gs.returnGenerated().size());
    }
    
    @Test
    public void noSameGenre() {
        for (int i = 0; i < new Genre().all().size()-1; i++) {
            gg.generate();
        }
        boolean noneSame = true;
        List<String> genres = gg.returnGenerated();
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
        for (int i = 0; i < new PlotDevice().all().size()-1; i++) {
            gp.generate();
        }
        List<String> plotDevices = gp.returnGenerated();
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
    
    @Test
    public void noSameSetting() {
        for (int i = 0; i < new Setting().all().size()-1; i++) {
            gs.generate();
        }
        List<String> settings = gs.returnGenerated();
        boolean noneSame = true;
        for (int i = 0; i < settings.size(); i++) {
            for (int x = i+1; x < settings.size(); x++) {
                if (settings.get(i).equals(settings.get(x))) {
                    noneSame = false;
                }
            }
        }
        assertEquals(true, noneSame);
    }
}

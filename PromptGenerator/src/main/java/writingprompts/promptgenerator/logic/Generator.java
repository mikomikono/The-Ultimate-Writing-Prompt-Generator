package writingprompts.promptgenerator.logic;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private Generateable generatee;
    private List<String> generated;
    private List<PlotDevice> plotDevices;

    
    public Generator(Generateable generatee) {
        this.generatee = generatee;
        this.generated = new ArrayList<>();
        this.plotDevices = new ArrayList<>();
    }
    
    public void generate() {
        if (this.generated.size() < this.generatee.all().size()) {
            String g = this.generatee.generate();
            while (this.generated.contains(g)) {
                g = this.generatee.generate();
            }
            this.generated.add(g);
        }
    }
    
    public List<String> returnGenerated() {
        return this.generated;
    }
    
    public void resetGenerated() {
        this.generated = new ArrayList<>();
    }
}

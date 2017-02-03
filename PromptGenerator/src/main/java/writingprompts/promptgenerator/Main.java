package writingprompts.promptgenerator;

import java.util.List;
import writingprompts.promptgenerator.logic.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Just keep writing");
        Generator generator = new Generator(new PlotDevice());
        generator.generate();
        generator.generate();
        generator.generate();
        List<String> returned = generator.returnGenerated();
        for (String g : returned) {
            System.out.println(g);
        }
        generator.resetGenerated();
        System.out.println("");
        generator.generate();
        System.out.println(generator.returnGenerated());
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.generateGenre();
//        generator.returnGenres();
//        System.out.println("");
//        generator.generatePlotDevice();
//        generator.generatePlotDevice();
//        generator.generatePlotDevice();
//        generator.generatePlotDevice();
//        generator.generatePlotDevice();
//        generator.generatePlotDevice();
//        generator.generatePlotDevice();
//        generator.returnPlotDevices();
    }
    
}

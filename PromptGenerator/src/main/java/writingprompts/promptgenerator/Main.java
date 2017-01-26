package writingprompts.promptgenerator;

import writingprompts.promptgenerator.logic.Generator;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Just keep writing");
        Generator generator = new Generator();
        generator.generateGenre();
        generator.generateGenre();
        generator.generateGenre();
        generator.generateGenre();
        generator.generateGenre();
        generator.generateGenre();
        generator.generateGenre();
        generator.generateGenre();
        generator.generateGenre();
        generator.generateGenre();
        generator.generateGenre();
        generator.returnGenres();
        System.out.println("");
        generator.generatePlotDevice();
        generator.generatePlotDevice();
        generator.generatePlotDevice();
        generator.generatePlotDevice();
        generator.generatePlotDevice();
        generator.generatePlotDevice();
        generator.generatePlotDevice();
        generator.returnPlotDevices();
    }
    
}

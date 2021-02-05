package com.csi5325.kwick;

import com.csi5325.kwick.impl.*;

import java.io.File;
import java.io.IOException;
/*
 * @author Rofiq
 * @author Maruf
 */

public class MaaterControl {

    public static Input input;
    public static Lines lines;
    public static Lines shiftedLines;
    public static Alphabetizer alphabetizer;
    public static CircularShift circularShift;
    public static Output output;


    public static void main(String[] args) {
        intialize();
        lines.addObserver(circularShift);
        shiftedLines.addObserver(alphabetizer);

        try {
            input.readFile(lines, new File(args[0]));
            output.writeFile(shiftedLines, new File("output.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void intialize(){
        input = new Input();
        shiftedLines = new Lines();
        lines = new Lines();
        circularShift = new CircularShift(shiftedLines);
        alphabetizer = new Alphabetizer();
        output = new Output();
    }
}

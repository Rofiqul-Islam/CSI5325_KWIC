package com.csi5325.kwick.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * @author Rofiq
 * @author Maruf
 */

public class Input {
    public void readFile(Lines lines, File file) throws IOException {
        for (String line : Files.readAllLines(Paths.get(file.getName()))) {
            lines.insert(line);
        }
    }
}
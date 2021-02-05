package com.csi5325.kwick.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * @author Rofiq
 * @author Maruf
 */

public class Output {
    public void writeFile(Lines lines, File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (String line : lines.getLineList()) {
            fileWriter.append(line).append('\n');
        }
        fileWriter.flush();
    }
}

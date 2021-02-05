package com.csi5325.kwick.impl;

import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

/*
 * @author Rofiq
 * @author Maruf
 */

public class Alphabetizer implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Lines lines = (Lines) o;
        String str  = (String)arg;
        Collections.sort(lines.getLineList());
    }
}

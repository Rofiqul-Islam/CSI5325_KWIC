package com.csi5325.kwick.impl;

import java.util.*;

/*
 * @author Rofiq
 * @author Maruf
 */

public class CircularShift implements Observer {

    private Lines shiftedLine;

    public CircularShift(Lines lines) {
        this.shiftedLine = lines;
    }


    @Override
    public void update(Observable o, Object arg) {
        Lines lines = (Lines) o;
        String event = (String) arg;

        List<String> result = new LinkedList<>();
        List<String> words = new ArrayList<>(Arrays.asList(event.split(" ")));
        int lastIndex = words.size() - 1;
        for (int i = 0; i < words.size(); ++i) {
            words.add(0, words.remove(lastIndex));
            result.add(Utils.arrToString(words));
        }

        for (String shift : result) {
            shiftedLine.insert(shift);
        }
    }


}
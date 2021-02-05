package com.csi5325.kwick.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

/*
 * @author Rofiq
 * @author Maruf
 */

public class Lines extends Observable {
    private List<String> lineList  =  new LinkedList<>();

    public List<String> getLineList() {
        return lineList;
    }

    public void setLineList(List<String> lineList) {
        this.lineList = lineList;
    }

    void insert(String line) {
        lineList.add(line);
        setChanged();
        notifyObservers(line);
    }
}

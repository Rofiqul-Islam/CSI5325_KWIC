package com.csi5325.kwick.impl;

import java.util.List;

/*
 * @author Rofiq
 * @author Maruf
 */

public class Utils {
    public static String arrToString(List<String> arr) {
        StringBuilder builder = new StringBuilder();
        for (String str : arr) {
            builder.append(str);
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}

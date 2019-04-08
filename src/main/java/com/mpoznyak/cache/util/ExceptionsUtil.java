package com.mpoznyak.cache.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by mpoznyak on 08.04.2019
 */

public class ExceptionsUtil {

    public static String exceptionToString(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.getBuffer().toString();
    }
}

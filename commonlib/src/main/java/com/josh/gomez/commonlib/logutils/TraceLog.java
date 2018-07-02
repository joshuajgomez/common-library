package com.josh.gomez.commonlib.logutils;

import android.util.Log;

public class TraceLog {


    public static void entryLog() {
        StackTraceElement element = Thread.currentThread().getStackTrace()[3];
        String className = element.getClassName();
        className = className.substring(className.lastIndexOf(".") + 1, className.length());
        String methodName = element.getMethodName();
        Log.i(className, methodName + " >>> Entry");
    }

    public static void exitLog() {
        StackTraceElement element = Thread.currentThread().getStackTrace()[3];
        String className = element.getClassName();
        className = className.substring(className.lastIndexOf(".") + 1, className.length());
        String methodName = element.getMethodName();
        Log.i(className, methodName + " <<< Exit");
    }

}

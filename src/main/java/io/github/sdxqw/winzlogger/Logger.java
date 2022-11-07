package io.github.sdxqw.winzlogger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Logger {

    private static final SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    private static final String GETDATE = date.format(new Date());

    /**
     * Basic logger that can be used everywhere
     *
     * @param toPrint <T> Object to print
     * @param level LogLevel level of the logger
     * @param <T> Can be anything you want from string
     *           to an int or a class
     */
    public static <T> void print(T toPrint, LogLevel level) {
        switch (level) {
            case INFO:
                System.out.println("[" + GETDATE + "]" + " [" + Thread.currentThread().getName().toUpperCase() + "/INFO] > " + toPrint);
                break;
            case WARN:
                System.out.println("[" + GETDATE + "]" + " [" + Thread.currentThread().getName().toUpperCase() + "/WARNING] > " + toPrint);
                break;
            case ERROR:
                System.out.println("[" + GETDATE + "]" + " [" + Thread.currentThread().getName().toUpperCase() + "/ERROR] > " + toPrint);
                break;
            default:
                System.out.println("[" + GETDATE + "]" + " [" + Thread.currentThread().getName().toUpperCase() + "/???] > How?");
                break;
        }
    }
}

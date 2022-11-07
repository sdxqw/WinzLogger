package io.github.sdxqw.winzlogger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Logger {

    private static final SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    private static final String GETDATE = date.format(new Date());

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

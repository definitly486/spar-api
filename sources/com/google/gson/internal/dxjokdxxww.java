package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {
    private static String iobyxmoadg(int i13) {
        if (i13 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i13 == 1) {
            return "MMMM d, yyyy";
        }
        if (i13 == 2) {
            return "MMM d, yyyy";
        }
        if (i13 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i13);
    }

    public static DateFormat ppxfxbqfkf(int i13, int i14) {
        return new SimpleDateFormat(iobyxmoadg(i13) + " " + zoijcleaow(i14), Locale.US);
    }

    private static String zoijcleaow(int i13) {
        if (i13 == 0 || i13 == 1) {
            return "h:mm:ss a z";
        }
        if (i13 == 2) {
            return "h:mm:ss a";
        }
        if (i13 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i13);
    }
}

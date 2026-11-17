package com.google.android.gms.internal.identity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeo {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j13) {
        return j13 >= 0 ? zza.format(new Date(j13)) : Long.toString(j13);
    }

    public static String zzb(long j13) {
        String string;
        StringBuilder sb3 = zzc;
        synchronized (sb3) {
            sb3.setLength(0);
            zzc(j13, sb3);
            string = sb3.toString();
        }
        return string;
    }

    public static StringBuilder zzc(long j13, StringBuilder sb3) {
        if (j13 == 0) {
            sb3.append("0s");
            return sb3;
        }
        sb3.ensureCapacity(sb3.length() + 27);
        boolean z13 = false;
        if (j13 < 0) {
            sb3.append("-");
            if (j13 != Long.MIN_VALUE) {
                j13 = -j13;
            } else {
                j13 = Long.MAX_VALUE;
                z13 = true;
            }
        }
        if (j13 >= 86400000) {
            sb3.append(j13 / 86400000);
            sb3.append("d");
            j13 %= 86400000;
        }
        if (true == z13) {
            j13 = 25975808;
        }
        if (j13 >= 3600000) {
            sb3.append(j13 / 3600000);
            sb3.append("h");
            j13 %= 3600000;
        }
        if (j13 >= 60000) {
            sb3.append(j13 / 60000);
            sb3.append("m");
            j13 %= 60000;
        }
        if (j13 >= 1000) {
            sb3.append(j13 / 1000);
            sb3.append("s");
            j13 %= 1000;
        }
        if (j13 > 0) {
            sb3.append(j13);
            sb3.append("ms");
        }
        return sb3;
    }
}

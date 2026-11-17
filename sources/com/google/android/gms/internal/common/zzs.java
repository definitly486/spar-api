package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes2.dex */
@NullMarked
public final class zzs {
    public static int zza(int i13, int i14, String str) {
        String strZza;
        if (i13 >= 0 && i13 < i14) {
            return i13;
        }
        if (i13 < 0) {
            strZza = zzy.zza("%s (%s) must not be negative", "index", Integer.valueOf(i13));
        } else {
            if (i14 < 0) {
                throw new IllegalArgumentException("negative size: " + i14);
            }
            strZza = zzy.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i13, int i14, String str) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(zzd(i13, i14, "index"));
        }
        return i13;
    }

    public static void zzc(int i13, int i14, int i15) {
        String strZzd;
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            if (i13 < 0 || i13 > i15) {
                strZzd = zzd(i13, i15, "start index");
            } else {
                strZzd = (i14 < 0 || i14 > i15) ? zzd(i14, i15, "end index") : zzy.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strZzd);
        }
    }

    private static String zzd(int i13, int i14, String str) {
        if (i13 < 0) {
            return zzy.zza("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return zzy.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException("negative size: " + i14);
    }
}

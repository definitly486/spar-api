package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt {
    public static int zza(int i13, int i14, String str) {
        String strZza;
        if (i13 >= 0 && i13 < i14) {
            return i13;
        }
        if (i13 < 0) {
            strZza = zzu.zza("%s (%s) must not be negative", "index", Integer.valueOf(i13));
        } else {
            if (i14 < 0) {
                throw new IllegalArgumentException("negative size: " + i14);
            }
            strZza = zzu.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i13, int i14, String str) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(zzf(i13, i14, "index"));
        }
        return i13;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(int i13, int i14, int i15) {
        String strZzf;
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            if (i13 < 0 || i13 > i15) {
                strZzf = zzf(i13, i15, "start index");
            } else {
                strZzf = (i14 < 0 || i14 > i15) ? zzf(i14, i15, "end index") : zzu.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    public static void zze(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalStateException("A SourcePolicy can only set internal() or external() once.");
        }
    }

    private static String zzf(int i13, int i14, String str) {
        if (i13 < 0) {
            return zzu.zza("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return zzu.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException("negative size: " + i14);
    }
}

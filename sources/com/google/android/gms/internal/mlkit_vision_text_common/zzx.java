package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes2.dex */
public final class zzx {
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
            throw new IndexOutOfBoundsException(zze(i13, i14, "index"));
        }
        return i13;
    }

    public static void zzc(int i13, int i14, int i15) {
        String strZze;
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            if (i13 < 0 || i13 > i15) {
                strZze = zze(i13, i15, "start index");
            } else {
                strZze = (i14 < 0 || i14 > i15) ? zze(i14, i15, "end index") : zzy.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strZze);
        }
    }

    public static void zzd(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zze(int i13, int i14, String str) {
        if (i13 < 0) {
            return zzy.zza("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return zzy.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException("negative size: " + i14);
    }
}

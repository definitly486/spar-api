package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes2.dex */
public final class zzam {
    public static int zza(int i13, int i14, String str) {
        String strZza;
        if (i13 >= 0 && i13 < i14) {
            return i13;
        }
        if (i13 < 0) {
            strZza = zzan.zza("%s (%s) must not be negative", "index", Integer.valueOf(i13));
        } else {
            if (i14 < 0) {
                throw new IllegalArgumentException("negative size: " + i14);
            }
            strZza = zzan.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i13, int i14, String str) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(zzf(i13, i14, "index"));
        }
        return i13;
    }

    public static void zzc(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z13, String str, char c13) {
        if (!z13) {
            throw new IllegalArgumentException(zzan.zza(str, Character.valueOf(c13)));
        }
    }

    public static void zze(int i13, int i14, int i15) {
        String strZzf;
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            if (i13 < 0 || i13 > i15) {
                strZzf = zzf(i13, i15, "start index");
            } else {
                strZzf = (i14 < 0 || i14 > i15) ? zzf(i14, i15, "end index") : zzan.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    private static String zzf(int i13, int i14, String str) {
        if (i13 < 0) {
            return zzan.zza("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return zzan.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException("negative size: " + i14);
    }
}

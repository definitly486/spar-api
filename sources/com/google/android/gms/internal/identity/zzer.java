package com.google.android.gms.internal.identity;

/* JADX INFO: loaded from: classes2.dex */
public final class zzer {
    public static void zza(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static int zzc(int i13, int i14, String str) {
        String strZza;
        if (i13 >= 0 && i13 < i14) {
            return i13;
        }
        if (i13 < 0) {
            strZza = zzes.zza("%s (%s) must not be negative", "index", Integer.valueOf(i13));
        } else {
            if (i14 < 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 15);
                sb3.append("negative size: ");
                sb3.append(i14);
                throw new IllegalArgumentException(sb3.toString());
            }
            strZza = zzes.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzd(int i13, int i14, String str) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(zzf(i13, i14, "index"));
        }
        return i13;
    }

    public static void zze(int i13, int i14, int i15) {
        String strZzf;
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            if (i13 < 0 || i13 > i15) {
                strZzf = zzf(i13, i15, "start index");
            } else {
                strZzf = (i14 < 0 || i14 > i15) ? zzf(i14, i15, "end index") : zzes.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    private static String zzf(int i13, int i14, String str) {
        if (i13 < 0) {
            return zzes.zza("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return zzes.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 15);
        sb3.append("negative size: ");
        sb3.append(i14);
        throw new IllegalArgumentException(sb3.toString());
    }
}

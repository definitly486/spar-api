package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaz {
    public static int zza(int i13, int i14, String str) {
        String strZzb;
        if (i13 >= 0 && i13 < i14) {
            return i13;
        }
        if (i13 < 0) {
            strZzb = zzba.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i13));
        } else {
            if (i14 < 0) {
                throw new IllegalArgumentException("negative size: " + i14);
            }
            strZzb = zzba.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i13, int i14, String str) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(zzg(i13, i14, "index"));
        }
        return i13;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Executor was null.");
    }

    public static void zzd(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(int i13, int i14, int i15) {
        String strZzg;
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            if (i13 < 0 || i13 > i15) {
                strZzg = zzg(i13, i15, "start index");
            } else {
                strZzg = (i14 < 0 || i14 > i15) ? zzg(i14, i15, "end index") : zzba.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strZzg);
        }
    }

    public static void zzf(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzg(int i13, int i14, String str) {
        if (i13 < 0) {
            return zzba.zzb("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return zzba.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException("negative size: " + i14);
    }
}

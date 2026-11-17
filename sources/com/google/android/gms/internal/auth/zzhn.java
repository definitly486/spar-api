package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhl zzb;

    static {
        if (zzhj.zzu() && zzhj.zzv()) {
            int i13 = zzds.zza;
        }
        zzb = new zzhm();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i13, int i14) {
        int i15 = i14 - i13;
        byte b13 = bArr[i13 - 1];
        if (i15 != 0) {
            if (i15 == 1) {
                byte b14 = bArr[i13];
                if (b13 <= -12 && b14 <= -65) {
                    return b13 ^ (b14 << 8);
                }
            } else {
                if (i15 != 2) {
                    throw new AssertionError();
                }
                byte b15 = bArr[i13];
                byte b16 = bArr[i13 + 1];
                if (b13 <= -12 && b15 <= -65 && b16 <= -65) {
                    return ((b15 << 8) ^ b13) ^ (b16 << 16);
                }
            }
        } else if (b13 <= -12) {
            return b13;
        }
        return -1;
    }

    static boolean zzb(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    static boolean zzc(byte[] bArr, int i13, int i14) {
        return zzb.zzb(bArr, i13, i14);
    }
}

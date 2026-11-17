package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class zzhk {
    static /* bridge */ /* synthetic */ void zza(byte b13, byte b14, byte b15, byte b16, char[] cArr, int i13) throws zzfb {
        if (zze(b14) || (((b13 << 28) + (b14 + 112)) >> 30) != 0 || zze(b15) || zze(b16)) {
            throw zzfb.zzb();
        }
        int i14 = ((b13 & 7) << 18) | ((b14 & 63) << 12) | ((b15 & 63) << 6) | (b16 & 63);
        cArr[i13] = (char) ((i14 >>> 10) + 55232);
        cArr[i13 + 1] = (char) ((i14 & 1023) + 56320);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    static /* bridge */ /* synthetic */ void zzb(byte b13, byte b14, byte b15, char[] cArr, int i13) throws zzfb {
        if (!zze(b14)) {
            if (b13 != -32) {
                if (b13 != -19) {
                    if (!zze(b15)) {
                        cArr[i13] = (char) (((b13 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                        return;
                    }
                } else if (b14 < -96) {
                    b13 = -19;
                    if (!zze(b15)) {
                        cArr[i13] = (char) (((b13 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                        return;
                    }
                }
            } else if (b14 >= -96) {
                b13 = -32;
                if (b13 != -19) {
                    if (!zze(b15)) {
                        cArr[i13] = (char) (((b13 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                        return;
                    }
                } else if (b14 < -96) {
                    b13 = -19;
                    if (!zze(b15)) {
                        cArr[i13] = (char) (((b13 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                        return;
                    }
                }
            }
        }
        throw zzfb.zzb();
    }

    static /* bridge */ /* synthetic */ void zzc(byte b13, byte b14, char[] cArr, int i13) throws zzfb {
        if (b13 < -62 || zze(b14)) {
            throw zzfb.zzb();
        }
        cArr[i13] = (char) (((b13 & 31) << 6) | (b14 & 63));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b13) {
        return b13 >= 0;
    }

    private static boolean zze(byte b13) {
        return b13 > -65;
    }
}

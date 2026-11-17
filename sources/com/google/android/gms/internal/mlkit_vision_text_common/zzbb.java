package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes2.dex */
final class zzbb {
    static int zza(int i13) {
        return (i13 < 32 ? 4 : 2) * (i13 + 1);
    }

    static int zzb(Object obj, Object obj2, int i13, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZza = zzbc.zza(obj);
        int i14 = iZza & i13;
        int iZzc = zzc(obj3, i14);
        if (iZzc != 0) {
            int i15 = ~i13;
            int i16 = iZza & i15;
            int i17 = -1;
            while (true) {
                int i18 = iZzc - 1;
                int i19 = iArr[i18];
                int i23 = i19 & i13;
                if ((i19 & i15) != i16 || !zzw.zza(obj, objArr[i18]) || (objArr2 != null && !zzw.zza(obj2, objArr2[i18]))) {
                    if (i23 == 0) {
                        break;
                    }
                    i17 = i18;
                    iZzc = i23;
                } else {
                    if (i17 == -1) {
                        zze(obj3, i14, i23);
                    } else {
                        iArr[i17] = (iArr[i17] & i15) | (i23 & i13);
                    }
                    return i18;
                }
            }
        }
        return -1;
    }

    static int zzc(Object obj, int i13) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i13] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i13] : ((int[]) obj)[i13];
    }

    static Object zzd(int i13) {
        if (i13 >= 2 && i13 <= 1073741824 && Integer.highestOneBit(i13) == i13) {
            if (i13 <= 256) {
                return new byte[i13];
            }
            return i13 <= 65536 ? new short[i13] : new int[i13];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i13);
    }

    static void zze(Object obj, int i13, int i14) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i13] = (byte) i14;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i13] = (short) i14;
        } else {
            ((int[]) obj)[i13] = i14;
        }
    }
}

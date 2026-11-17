package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class zzhm extends zzhl {
    zzhm() {
    }

    @Override // com.google.android.gms.internal.auth.zzhl
    final int zza(int i13, byte[] bArr, int i14, int i15) {
        while (i14 < i15 && bArr[i14] >= 0) {
            i14++;
        }
        if (i14 >= i15) {
            return 0;
        }
        while (i14 < i15) {
            int i16 = i14 + 1;
            byte b13 = bArr[i14];
            if (b13 < 0) {
                if (b13 < -32) {
                    if (i16 >= i15) {
                        return b13;
                    }
                    if (b13 >= -62) {
                        i14 += 2;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                if (b13 >= -16) {
                    if (i16 >= i15 - 2) {
                        return zzhn.zza(bArr, i16, i15);
                    }
                    int i17 = i14 + 2;
                    byte b14 = bArr[i16];
                    if (b14 <= -65 && (((b13 << 28) + (b14 + 112)) >> 30) == 0) {
                        int i18 = i14 + 3;
                        if (bArr[i17] <= -65) {
                            i14 += 4;
                            if (bArr[i18] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i16 >= i15 - 1) {
                    return zzhn.zza(bArr, i16, i15);
                }
                int i19 = i14 + 2;
                byte b15 = bArr[i16];
                if (b15 <= -65 && ((b13 != -32 || b15 >= -96) && (b13 != -19 || b15 < -96))) {
                    i14 += 3;
                    if (bArr[i19] > -65) {
                    }
                }
                return -1;
            }
            i14 = i16;
        }
        return 0;
    }
}

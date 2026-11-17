package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i13, int i14, int i15) {
        int i16;
        int i17 = i13;
        while (true) {
            i16 = (i14 & (-4)) + i13;
            if (i17 >= i16) {
                break;
            }
            int i18 = ((bArr[i17] & KotlinVersion.MAX_COMPONENT_VALUE) | ((bArr[i17 + 1] & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | ((bArr[i17 + 2] & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (bArr[i17 + 3] << 24)) * (-862048943);
            int i19 = i15 ^ (((i18 >>> 17) | (i18 << 15)) * 461845907);
            i15 = (((i19 >>> 19) | (i19 << 13)) * 5) - 430675100;
            i17 += 4;
        }
        int i23 = i14 & 3;
        int i24 = 0;
        if (i23 == 1) {
            int i25 = ((bArr[i16] & KotlinVersion.MAX_COMPONENT_VALUE) | i24) * (-862048943);
            i15 ^= ((i25 >>> 17) | (i25 << 15)) * 461845907;
        } else {
            if (i23 != 2) {
                i24 = i23 == 3 ? (bArr[i16 + 2] & KotlinVersion.MAX_COMPONENT_VALUE) << 16 : 0;
            }
            i24 |= (bArr[i16 + 1] & KotlinVersion.MAX_COMPONENT_VALUE) << 8;
            int i26 = ((bArr[i16] & KotlinVersion.MAX_COMPONENT_VALUE) | i24) * (-862048943);
            i15 ^= ((i26 >>> 17) | (i26 << 15)) * 461845907;
        }
        int i27 = i15 ^ i14;
        int i28 = (i27 ^ (i27 >>> 16)) * (-2048144789);
        int i29 = (i28 ^ (i28 >>> 13)) * (-1028477387);
        return i29 ^ (i29 >>> 16);
    }
}

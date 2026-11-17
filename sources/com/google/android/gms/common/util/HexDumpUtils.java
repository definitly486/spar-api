package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class HexDumpUtils {
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static String dump(byte[] bArr, int i13, int i14, boolean z13) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i13 < 0 || i14 <= 0 || i13 + i14 > length) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder((z13 ? 75 : 57) * ((i14 + 15) / 16));
        int i15 = i14;
        int i16 = 0;
        int i17 = 0;
        while (i15 > 0) {
            if (i16 == 0) {
                if (i14 < 65536) {
                    sb3.append(String.format("%04X:", Integer.valueOf(i13)));
                } else {
                    sb3.append(String.format("%08X:", Integer.valueOf(i13)));
                }
                i17 = i13;
            } else if (i16 == 8) {
                sb3.append(" -");
            }
            sb3.append(String.format(" %02X", Integer.valueOf(bArr[i13] & 255)));
            i15--;
            i16++;
            if (z13 && (i16 == 16 || i15 == 0)) {
                int i18 = 16 - i16;
                if (i18 > 0) {
                    for (int i19 = 0; i19 < i18; i19++) {
                        sb3.append("   ");
                    }
                }
                if (i18 >= 8) {
                    sb3.append("  ");
                }
                sb3.append("  ");
                for (int i23 = 0; i23 < i16; i23++) {
                    char c13 = (char) bArr[i17 + i23];
                    if (c13 < ' ' || c13 > '~') {
                        c13 = '.';
                    }
                    sb3.append(c13);
                }
            }
            if (i16 == 16 || i15 == 0) {
                sb3.append('\n');
                i16 = 0;
            }
            i13++;
        }
        return sb3.toString();
    }
}

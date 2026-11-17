package oj;

import mj.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
abstract class wkgbmnqykc extends ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(long j13, byte[] bArr, int i13, int i14) {
        int i15 = i13 + (i14 * 2);
        for (int i16 = 0; i16 < i14; i16++) {
            int i17 = gxszxtbevo.wkgbmnqykc()[(int) (255 & j13)];
            bArr[i15 - 1] = (byte) i17;
            i15 -= 2;
            bArr[i15] = (byte) (i17 >> 8);
            j13 >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(String str, int i13) {
        if (str.charAt(i13) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i13 + ", but was '" + str.charAt(i13) + '\'').toString());
    }
}

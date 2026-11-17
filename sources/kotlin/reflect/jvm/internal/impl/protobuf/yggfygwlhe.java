package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class yggfygwlhe {
    private static int dxjokdxxww(byte[] bArr, int i13, int i14) {
        while (i13 < i14) {
            int i15 = i13 + 1;
            byte b13 = bArr[i13];
            if (b13 < 0) {
                if (b13 < -32) {
                    if (i15 >= i14) {
                        return b13;
                    }
                    if (b13 >= -62) {
                        i13 += 2;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                if (b13 >= -16) {
                    if (i15 >= i14 - 2) {
                        return wkgbmnqykc(bArr, i15, i14);
                    }
                    int i16 = i13 + 2;
                    byte b14 = bArr[i15];
                    if (b14 <= -65 && (((b13 << 28) + (b14 + 112)) >> 30) == 0) {
                        int i17 = i13 + 3;
                        if (bArr[i16] <= -65) {
                            i13 += 4;
                            if (bArr[i17] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i15 >= i14 - 1) {
                    return wkgbmnqykc(bArr, i15, i14);
                }
                int i18 = i13 + 2;
                byte b15 = bArr[i15];
                if (b15 <= -65 && ((b13 != -32 || b15 >= -96) && (b13 != -19 || b15 < -96))) {
                    i13 += 3;
                    if (bArr[i18] > -65) {
                    }
                }
                return -1;
            }
            i13 = i15;
        }
        return 0;
    }

    public static boolean eablkybsjg(byte[] bArr) {
        return gxszxtbevo(bArr, 0, bArr.length);
    }

    public static boolean gxszxtbevo(byte[] bArr, int i13, int i14) {
        return nufgyqmvbu(bArr, i13, i14) == 0;
    }

    private static int iobyxmoadg(int i13) {
        if (i13 > -12) {
            return -1;
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        if (r7[r8] > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
    
        if (r7[r6] > (-65)) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int lqeggnwhkg(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L86
            if (r8 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r6 = -62
            if (r0 < r6) goto L1b
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
            goto L1b
        L18:
            r8 = r6
            goto L86
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L34
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L31
            int r6 = zoijcleaow(r0, r8)
            return r6
        L31:
            r5 = r8
            r8 = r6
            r6 = r5
        L34:
            if (r6 > r3) goto L48
            r4 = -96
            if (r0 != r1) goto L3c
            if (r6 < r4) goto L48
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r6 >= r4) goto L48
        L42:
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
        L48:
            return r2
        L49:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5c
            int r6 = r8 + 1
            r1 = r7[r8]
            if (r6 < r9) goto L5a
            int r6 = zoijcleaow(r0, r1)
            return r6
        L5a:
            r8 = 0
            goto L62
        L5c:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
            r5 = r8
            r8 = r6
            r6 = r5
        L62:
            if (r8 != 0) goto L72
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r8 < r9) goto L6f
            int r6 = ppxfxbqfkf(r0, r1, r6)
            return r6
        L6f:
            r5 = r8
            r8 = r6
            r6 = r5
        L72:
            if (r1 > r3) goto L85
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L85
            if (r8 > r3) goto L85
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r6 <= r3) goto L86
        L85:
            return r2
        L86:
            int r6 = nufgyqmvbu(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.yggfygwlhe.lqeggnwhkg(int, byte[], int, int):int");
    }

    public static int nufgyqmvbu(byte[] bArr, int i13, int i14) {
        while (i13 < i14 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 >= i14) {
            return 0;
        }
        return dxjokdxxww(bArr, i13, i14);
    }

    private static int ppxfxbqfkf(int i13, int i14, int i15) {
        if (i13 > -12 || i14 > -65 || i15 > -65) {
            return -1;
        }
        return (i13 ^ (i14 << 8)) ^ (i15 << 16);
    }

    private static int wkgbmnqykc(byte[] bArr, int i13, int i14) {
        byte b13 = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            return iobyxmoadg(b13);
        }
        if (i15 == 1) {
            return zoijcleaow(b13, bArr[i13]);
        }
        if (i15 == 2) {
            return ppxfxbqfkf(b13, bArr[i13], bArr[i13 + 1]);
        }
        throw new AssertionError();
    }

    private static int zoijcleaow(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }
}

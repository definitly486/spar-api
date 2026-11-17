package ob;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Charset f72485iobyxmoadg = Charset.forName("UTF-8");

    static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public byte[] f72486iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f72487zoijcleaow;

        iobyxmoadg() {
        }
    }

    static class ppxfxbqfkf extends iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private static final byte[] f72488btonecajqb = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private static final byte[] f72489gtknphoqwx = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final byte[] f72490dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f72491eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final boolean f72492gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final boolean f72493lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public final boolean f72494nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final byte[] f72495ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f72496wkgbmnqykc;

        public ppxfxbqfkf(int i13, byte[] bArr) {
            this.f72486iobyxmoadg = bArr;
            this.f72492gxszxtbevo = (i13 & 1) == 0;
            boolean z13 = (i13 & 2) == 0;
            this.f72493lqeggnwhkg = z13;
            this.f72494nufgyqmvbu = (i13 & 4) != 0;
            this.f72490dxjokdxxww = (i13 & 8) == 0 ? f72488btonecajqb : f72489gtknphoqwx;
            this.f72495ppxfxbqfkf = new byte[2];
            this.f72496wkgbmnqykc = 0;
            this.f72491eablkybsjg = z13 ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd A[EDGE_INSN: B:32:0x00dd->B:22:0x008a BREAK  A[LOOP:0: B:25:0x0090->B:33:0x00e3]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[LOOP:0: B:25:0x0090->B:33:0x00e3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:89:0x00d4 A[SYNTHETIC] */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        public boolean iobyxmoadg(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instruction units count: 481
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ob.eablkybsjg.ppxfxbqfkf.iobyxmoadg(byte[], int, int, boolean):boolean");
        }
    }

    static class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final int[] f72497gxszxtbevo = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private static final int[] f72498lqeggnwhkg = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int[] f72499eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f72500ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f72501wkgbmnqykc;

        public zoijcleaow(int i13, byte[] bArr) {
            this.f72486iobyxmoadg = bArr;
            this.f72499eablkybsjg = (i13 & 8) == 0 ? f72497gxszxtbevo : f72498lqeggnwhkg;
            this.f72500ppxfxbqfkf = 0;
            this.f72501wkgbmnqykc = 0;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        public boolean iobyxmoadg(byte[] bArr, int i13, int i14, boolean z13) {
            int i15 = this.f72500ppxfxbqfkf;
            if (i15 == 6) {
                return false;
            }
            int i16 = i14 + i13;
            int i17 = this.f72501wkgbmnqykc;
            byte[] bArr2 = this.f72486iobyxmoadg;
            int[] iArr = this.f72499eablkybsjg;
            int i18 = 0;
            int i19 = i17;
            int i23 = i15;
            int i24 = i13;
            while (i24 < i16) {
                if (i23 == 0) {
                    while (true) {
                        int i25 = i24 + 4;
                        if (i25 > i16 || (i19 = (iArr[bArr[i24] & 255] << 18) | (iArr[bArr[i24 + 1] & 255] << 12) | (iArr[bArr[i24 + 2] & 255] << 6) | iArr[bArr[i24 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i18 + 2] = (byte) i19;
                        bArr2[i18 + 1] = (byte) (i19 >> 8);
                        bArr2[i18] = (byte) (i19 >> 16);
                        i18 += 3;
                        i24 = i25;
                    }
                    if (i24 >= i16) {
                        break;
                    }
                }
                int i26 = i24 + 1;
                int i27 = iArr[bArr[i24] & 255];
                if (i23 != 0) {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            if (i23 != 3) {
                                if (i23 != 4) {
                                    if (i23 == 5 && i27 != -1) {
                                        this.f72500ppxfxbqfkf = 6;
                                        return false;
                                    }
                                } else if (i27 == -2) {
                                    i23++;
                                } else if (i27 != -1) {
                                    this.f72500ppxfxbqfkf = 6;
                                    return false;
                                }
                            } else if (i27 >= 0) {
                                int i28 = i27 | (i19 << 6);
                                bArr2[i18 + 2] = (byte) i28;
                                bArr2[i18 + 1] = (byte) (i28 >> 8);
                                bArr2[i18] = (byte) (i28 >> 16);
                                i18 += 3;
                                i19 = i28;
                                i23 = 0;
                            } else if (i27 == -2) {
                                bArr2[i18 + 1] = (byte) (i19 >> 2);
                                bArr2[i18] = (byte) (i19 >> 10);
                                i18 += 2;
                                i23 = 5;
                            } else if (i27 != -1) {
                                this.f72500ppxfxbqfkf = 6;
                                return false;
                            }
                        } else if (i27 >= 0) {
                            i27 |= i19 << 6;
                            i23++;
                            i19 = i27;
                        } else if (i27 == -2) {
                            bArr2[i18] = (byte) (i19 >> 4);
                            i18++;
                            i23 = 4;
                        } else if (i27 != -1) {
                            this.f72500ppxfxbqfkf = 6;
                            return false;
                        }
                    } else if (i27 >= 0) {
                        i27 |= i19 << 6;
                        i23++;
                        i19 = i27;
                    } else if (i27 != -1) {
                        this.f72500ppxfxbqfkf = 6;
                        return false;
                    }
                } else if (i27 >= 0) {
                    i23++;
                    i19 = i27;
                } else if (i27 != -1) {
                    this.f72500ppxfxbqfkf = 6;
                    return false;
                }
                i24 = i26;
            }
            if (!z13) {
                this.f72500ppxfxbqfkf = i23;
                this.f72501wkgbmnqykc = i19;
                this.f72487zoijcleaow = i18;
                return true;
            }
            if (i23 == 1) {
                this.f72500ppxfxbqfkf = 6;
                return false;
            }
            if (i23 == 2) {
                bArr2[i18] = (byte) (i19 >> 4);
                i18++;
            } else if (i23 == 3) {
                int i29 = i18 + 1;
                bArr2[i18] = (byte) (i19 >> 10);
                i18 += 2;
                bArr2[i29] = (byte) (i19 >> 2);
            } else if (i23 == 4) {
                this.f72500ppxfxbqfkf = 6;
                return false;
            }
            this.f72500ppxfxbqfkf = i23;
            this.f72487zoijcleaow = i18;
            return true;
        }
    }

    public static byte[] eablkybsjg(byte[] bArr, int i13) {
        return gxszxtbevo(bArr, 0, bArr.length, i13);
    }

    public static byte[] gxszxtbevo(byte[] bArr, int i13, int i14, int i15) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(i15, null);
        int i16 = (i14 / 3) * 4;
        if (!ppxfxbqfkfVar.f72492gxszxtbevo) {
            int i17 = i14 % 3;
            if (i17 == 1) {
                i16 += 2;
            } else if (i17 == 2) {
                i16 += 3;
            }
        } else if (i14 % 3 > 0) {
            i16 += 4;
        }
        if (ppxfxbqfkfVar.f72493lqeggnwhkg && i14 > 0) {
            i16 += (((i14 - 1) / 57) + 1) * (ppxfxbqfkfVar.f72494nufgyqmvbu ? 2 : 1);
        }
        ppxfxbqfkfVar.f72486iobyxmoadg = new byte[i16];
        ppxfxbqfkfVar.iobyxmoadg(bArr, i13, i14, true);
        return ppxfxbqfkfVar.f72486iobyxmoadg;
    }

    public static byte[] iobyxmoadg(String str, int i13) {
        return zoijcleaow(str.getBytes(f72485iobyxmoadg), i13);
    }

    public static String lqeggnwhkg(byte[] bArr, int i13) {
        try {
            return new String(eablkybsjg(bArr, i13), "US-ASCII");
        } catch (UnsupportedEncodingException e13) {
            throw new AssertionError(e13);
        }
    }

    public static byte[] ppxfxbqfkf(byte[] bArr, int i13, int i14, int i15) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(i15, new byte[(i14 * 3) / 4]);
        if (!zoijcleaowVar.iobyxmoadg(bArr, i13, i14, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i16 = zoijcleaowVar.f72487zoijcleaow;
        byte[] bArr2 = zoijcleaowVar.f72486iobyxmoadg;
        if (i16 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i16];
        System.arraycopy(bArr2, 0, bArr3, 0, i16);
        return bArr3;
    }

    public static String wkgbmnqykc(byte[] bArr) {
        return lqeggnwhkg(bArr, 2);
    }

    public static byte[] zoijcleaow(byte[] bArr, int i13) {
        return ppxfxbqfkf(bArr, 0, bArr.length, i13);
    }
}

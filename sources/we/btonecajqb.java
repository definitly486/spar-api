package we;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb {
    static int agtfadlqog(CharSequence charSequence, int i13, int i14) {
        float[] fArr;
        int i15;
        int i16;
        if (i13 >= charSequence.length()) {
            return i14;
        }
        float f13 = 2.0f;
        int i17 = 6;
        int i18 = 4;
        int i19 = 3;
        if (i14 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i14] = 0.0f;
        }
        int i23 = 0;
        while (true) {
            int i24 = i13 + i23;
            if (i24 == charSequence.length()) {
                byte[] bArr = new byte[i17];
                int[] iArr = new int[i17];
                int iPpxfxbqfkf = ppxfxbqfkf(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iWkgbmnqykc = wkgbmnqykc(bArr);
                if (iArr[0] == iPpxfxbqfkf) {
                    return 0;
                }
                if (iWkgbmnqykc == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (iWkgbmnqykc == 1 && bArr[i18] > 0) {
                    return i18;
                }
                if (iWkgbmnqykc == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (iWkgbmnqykc != 1 || bArr[i19] <= 0) {
                    return 1;
                }
                return i19;
            }
            char cCharAt = charSequence.charAt(i24);
            i23++;
            if (gxszxtbevo(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (lqeggnwhkg(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f13;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (nufgyqmvbu(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (lqeggnwhkg(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (btonecajqb(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (lqeggnwhkg(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (gtknphoqwx(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (lqeggnwhkg(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (dxjokdxxww(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (lqeggnwhkg(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (draadjrbmk(cCharAt)) {
                fArr[5] = fArr[5] + 4.0f;
            } else {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i23 >= 4) {
                int[] iArr2 = new int[i17];
                byte[] bArr2 = new byte[i17];
                ppxfxbqfkf(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iWkgbmnqykc2 = wkgbmnqykc(bArr2);
                int i25 = iArr2[0];
                int i26 = iArr2[5];
                if (i25 < i26 && i25 < iArr2[1] && i25 < iArr2[2] && i25 < iArr2[3] && i25 < iArr2[4]) {
                    return 0;
                }
                if (i26 >= i25) {
                    byte b13 = bArr2[1];
                    byte b14 = bArr2[2];
                    byte b15 = bArr2[3];
                    byte b16 = bArr2[4];
                    if (b13 + b14 + b15 + b16 != 0) {
                        if (iWkgbmnqykc2 == 1 && b16 > 0) {
                            return 4;
                        }
                        if (iWkgbmnqykc2 == 1 && b14 > 0) {
                            return 2;
                        }
                        if (iWkgbmnqykc2 == 1 && b15 > 0) {
                            return 3;
                        }
                        int i27 = iArr2[1];
                        if (i27 + 1 >= i25 || i27 + 1 >= i26) {
                            i16 = 3;
                            i15 = 4;
                        } else {
                            i15 = 4;
                            if (i27 + 1 < iArr2[4] && i27 + 1 < iArr2[2]) {
                                int i28 = iArr2[3];
                                if (i27 < i28) {
                                    return 1;
                                }
                                if (i27 == i28) {
                                    for (int i29 = i13 + i23 + 1; i29 < charSequence.length(); i29++) {
                                        char cCharAt2 = charSequence.charAt(i29);
                                        if (wflxmlrfwp(cCharAt2)) {
                                            return 3;
                                        }
                                        if (!gtknphoqwx(cCharAt2)) {
                                            break;
                                        }
                                    }
                                    return 1;
                                }
                            }
                        }
                        i18 = i15;
                        i17 = 6;
                        i19 = i16;
                        f13 = 2.0f;
                    }
                }
                return 5;
            }
            i15 = 4;
            i16 = 3;
            i18 = i15;
            i17 = 6;
            i19 = i16;
            f13 = 2.0f;
        }
    }

    private static boolean btonecajqb(char c13) {
        if (c13 == ' ') {
            return true;
        }
        if (c13 < '0' || c13 > '9') {
            return c13 >= 'a' && c13 <= 'z';
        }
        return true;
    }

    private static boolean draadjrbmk(char c13) {
        return false;
    }

    private static boolean dxjokdxxww(char c13) {
        return c13 >= ' ' && c13 <= '^';
    }

    static void eablkybsjg(char c13) {
        String hexString = Integer.toHexString(c13);
        throw new IllegalArgumentException("Illegal character: " + c13 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    private static boolean gtknphoqwx(char c13) {
        if (wflxmlrfwp(c13) || c13 == ' ') {
            return true;
        }
        if (c13 < '0' || c13 > '9') {
            return c13 >= 'A' && c13 <= 'Z';
        }
        return true;
    }

    static boolean gxszxtbevo(char c13) {
        return c13 >= '0' && c13 <= '9';
    }

    public static int iobyxmoadg(CharSequence charSequence, int i13) {
        int length = charSequence.length();
        int i14 = 0;
        if (i13 < length) {
            char cCharAt = charSequence.charAt(i13);
            while (gxszxtbevo(cCharAt) && i13 < length) {
                i14++;
                i13++;
                if (i13 < length) {
                    cCharAt = charSequence.charAt(i13);
                }
            }
        }
        return i14;
    }

    static boolean lqeggnwhkg(char c13) {
        return c13 >= 128 && c13 <= 255;
    }

    private static boolean nufgyqmvbu(char c13) {
        if (c13 == ' ') {
            return true;
        }
        if (c13 < '0' || c13 > '9') {
            return c13 >= 'A' && c13 <= 'Z';
        }
        return true;
    }

    private static char ojitshcjhn(int i13) {
        int i14 = (i13 * 149) % 253;
        int i15 = i14 + 130;
        if (i15 > 254) {
            i15 = i14 - 124;
        }
        return (char) i15;
    }

    private static int ppxfxbqfkf(float[] fArr, int[] iArr, int i13, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i14 = 0; i14 < 6; i14++) {
            int iCeil = (int) Math.ceil(fArr[i14]);
            iArr[i14] = iCeil;
            if (i13 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i13 = iCeil;
            }
            if (i13 == iCeil) {
                bArr[i14] = (byte) (bArr[i14] + 1);
            }
        }
        return i13;
    }

    private static boolean wflxmlrfwp(char c13) {
        return c13 == '\r' || c13 == '*' || c13 == '>';
    }

    private static int wkgbmnqykc(byte[] bArr) {
        int i13 = 0;
        for (int i14 = 0; i14 < 6; i14++) {
            i13 += bArr[i14];
        }
        return i13;
    }

    public static String zoijcleaow(String str, draadjrbmk draadjrbmkVar, com.google.zxing.zoijcleaow zoijcleaowVar, com.google.zxing.zoijcleaow zoijcleaowVar2) {
        int iEablkybsjg = 0;
        lqeggnwhkg[] lqeggnwhkgVarArr = {new iobyxmoadg(), new ppxfxbqfkf(), new wflxmlrfwp(), new agtfadlqog(), new gxszxtbevo(), new zoijcleaow()};
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(str);
        nufgyqmvbuVar.agtfadlqog(draadjrbmkVar);
        nufgyqmvbuVar.draadjrbmk(zoijcleaowVar, zoijcleaowVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            nufgyqmvbuVar.oxmwwwfdhm((char) 236);
            nufgyqmvbuVar.wflxmlrfwp(2);
            nufgyqmvbuVar.f119448wkgbmnqykc += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            nufgyqmvbuVar.oxmwwwfdhm((char) 237);
            nufgyqmvbuVar.wflxmlrfwp(2);
            nufgyqmvbuVar.f119448wkgbmnqykc += 7;
        }
        while (nufgyqmvbuVar.dxjokdxxww()) {
            lqeggnwhkgVarArr[iEablkybsjg].iobyxmoadg(nufgyqmvbuVar);
            if (nufgyqmvbuVar.eablkybsjg() >= 0) {
                iEablkybsjg = nufgyqmvbuVar.eablkybsjg();
                nufgyqmvbuVar.btonecajqb();
            }
        }
        int iIobyxmoadg = nufgyqmvbuVar.iobyxmoadg();
        nufgyqmvbuVar.rgvfuqvkyq();
        int iIobyxmoadg2 = nufgyqmvbuVar.lqeggnwhkg().iobyxmoadg();
        if (iIobyxmoadg < iIobyxmoadg2 && iEablkybsjg != 0 && iEablkybsjg != 5 && iEablkybsjg != 4) {
            nufgyqmvbuVar.oxmwwwfdhm((char) 254);
        }
        StringBuilder sbZoijcleaow = nufgyqmvbuVar.zoijcleaow();
        if (sbZoijcleaow.length() < iIobyxmoadg2) {
            sbZoijcleaow.append((char) 129);
        }
        while (sbZoijcleaow.length() < iIobyxmoadg2) {
            sbZoijcleaow.append(ojitshcjhn(sbZoijcleaow.length() + 1));
        }
        return nufgyqmvbuVar.zoijcleaow().toString();
    }
}

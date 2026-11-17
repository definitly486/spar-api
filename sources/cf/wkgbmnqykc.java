package cf;

/* JADX INFO: loaded from: classes2.dex */
abstract class wkgbmnqykc {
    static int eablkybsjg(zoijcleaow zoijcleaowVar) {
        byte[][] bArrPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
        int iEablkybsjg = zoijcleaowVar.eablkybsjg();
        int iWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
        int i13 = 0;
        for (int i14 = 0; i14 < iWkgbmnqykc; i14++) {
            byte[] bArr = bArrPpxfxbqfkf[i14];
            for (int i15 = 0; i15 < iEablkybsjg; i15++) {
                if (bArr[i15] == 1) {
                    i13++;
                }
            }
        }
        int iWkgbmnqykc2 = zoijcleaowVar.wkgbmnqykc() * zoijcleaowVar.eablkybsjg();
        return ((Math.abs((i13 << 1) - iWkgbmnqykc2) * 10) / iWkgbmnqykc2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[RETURN] */
    static boolean gxszxtbevo(int i13, int i14, int i15) {
        int i16;
        int i17;
        switch (i13) {
            case 0:
                i15 += i14;
                i16 = i15 & 1;
                if (i16 == 0) {
                    return true;
                }
                return false;
            case 1:
                i16 = i15 & 1;
                if (i16 == 0) {
                    return true;
                }
                return false;
            case 2:
                i16 = i14 % 3;
                if (i16 == 0) {
                    return true;
                }
                return false;
            case 3:
                i16 = (i15 + i14) % 3;
                if (i16 == 0) {
                    return true;
                }
                return false;
            case 4:
                i15 /= 2;
                i14 /= 3;
                i15 += i14;
                i16 = i15 & 1;
                if (i16 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i18 = i15 * i14;
                i16 = (i18 & 1) + (i18 % 3);
                if (i16 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i19 = i15 * i14;
                i17 = (i19 & 1) + (i19 % 3);
                i16 = i17 & 1;
                if (i16 == 0) {
                    return true;
                }
                return false;
            case 7:
                i17 = ((i15 * i14) % 3) + ((i15 + i14) & 1);
                i16 = i17 & 1;
                if (i16 == 0) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i13)));
        }
    }

    static int iobyxmoadg(zoijcleaow zoijcleaowVar) {
        return zoijcleaow(zoijcleaowVar, true) + zoijcleaow(zoijcleaowVar, false);
    }

    private static boolean lqeggnwhkg(byte[] bArr, int i13, int i14) {
        int iMin = Math.min(i14, bArr.length);
        for (int iMax = Math.max(i13, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean nufgyqmvbu(byte[][] bArr, int i13, int i14, int i15) {
        int iMin = Math.min(i15, bArr.length);
        for (int iMax = Math.max(i14, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i13] == 1) {
                return false;
            }
        }
        return true;
    }

    static int ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        byte[][] bArrPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
        int iEablkybsjg = zoijcleaowVar.eablkybsjg();
        int iWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
        int i13 = 0;
        for (int i14 = 0; i14 < iWkgbmnqykc - 1; i14++) {
            byte[] bArr = bArrPpxfxbqfkf[i14];
            int i15 = 0;
            while (i15 < iEablkybsjg - 1) {
                byte b13 = bArr[i15];
                int i16 = i15 + 1;
                if (b13 == bArr[i16]) {
                    byte[] bArr2 = bArrPpxfxbqfkf[i14 + 1];
                    if (b13 == bArr2[i15] && b13 == bArr2[i16]) {
                        i13++;
                    }
                }
                i15 = i16;
            }
        }
        return i13 * 3;
    }

    static int wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        byte[][] bArrPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
        int iEablkybsjg = zoijcleaowVar.eablkybsjg();
        int iWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
        int i13 = 0;
        for (int i14 = 0; i14 < iWkgbmnqykc; i14++) {
            for (int i15 = 0; i15 < iEablkybsjg; i15++) {
                byte[] bArr = bArrPpxfxbqfkf[i14];
                int i16 = i15 + 6;
                if (i16 < iEablkybsjg && bArr[i15] == 1 && bArr[i15 + 1] == 0 && bArr[i15 + 2] == 1 && bArr[i15 + 3] == 1 && bArr[i15 + 4] == 1 && bArr[i15 + 5] == 0 && bArr[i16] == 1 && (lqeggnwhkg(bArr, i15 - 4, i15) || lqeggnwhkg(bArr, i15 + 7, i15 + 11))) {
                    i13++;
                }
                int i17 = i14 + 6;
                if (i17 < iWkgbmnqykc && bArrPpxfxbqfkf[i14][i15] == 1 && bArrPpxfxbqfkf[i14 + 1][i15] == 0 && bArrPpxfxbqfkf[i14 + 2][i15] == 1 && bArrPpxfxbqfkf[i14 + 3][i15] == 1 && bArrPpxfxbqfkf[i14 + 4][i15] == 1 && bArrPpxfxbqfkf[i14 + 5][i15] == 0 && bArrPpxfxbqfkf[i17][i15] == 1 && (nufgyqmvbu(bArrPpxfxbqfkf, i15, i14 - 4, i14) || nufgyqmvbu(bArrPpxfxbqfkf, i15, i14 + 7, i14 + 11))) {
                    i13++;
                }
            }
        }
        return i13 * 40;
    }

    private static int zoijcleaow(zoijcleaow zoijcleaowVar, boolean z13) {
        int iWkgbmnqykc = z13 ? zoijcleaowVar.wkgbmnqykc() : zoijcleaowVar.eablkybsjg();
        int iEablkybsjg = z13 ? zoijcleaowVar.eablkybsjg() : zoijcleaowVar.wkgbmnqykc();
        byte[][] bArrPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
        int i13 = 0;
        for (int i14 = 0; i14 < iWkgbmnqykc; i14++) {
            byte b13 = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < iEablkybsjg; i16++) {
                byte b14 = z13 ? bArrPpxfxbqfkf[i14][i16] : bArrPpxfxbqfkf[i16][i14];
                if (b14 == b13) {
                    i15++;
                } else {
                    if (i15 >= 5) {
                        i13 += i15 - 2;
                    }
                    i15 = 1;
                    b13 = b14;
                }
            }
            if (i15 >= 5) {
                i13 += i15 - 2;
            }
        }
        return i13;
    }
}

package se;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f106041iobyxmoadg = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int dxjokdxxww(int i13, boolean z13) {
        return ((z13 ? 88 : 112) + (i13 << 4)) * i13;
    }

    private static te.iobyxmoadg eablkybsjg(te.iobyxmoadg iobyxmoadgVar, int i13, int i14) {
        int iLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg() / i14;
        ue.ppxfxbqfkf ppxfxbqfkfVar = new ue.ppxfxbqfkf(lqeggnwhkg(i14));
        int i15 = i13 / i14;
        int[] iArrIobyxmoadg = iobyxmoadg(iobyxmoadgVar, i14, i15);
        ppxfxbqfkfVar.zoijcleaow(iArrIobyxmoadg, i15 - iLqeggnwhkg);
        te.iobyxmoadg iobyxmoadgVar2 = new te.iobyxmoadg();
        iobyxmoadgVar2.ppxfxbqfkf(0, i13 % i14);
        for (int i16 : iArrIobyxmoadg) {
            iobyxmoadgVar2.ppxfxbqfkf(i16, i14);
        }
        return iobyxmoadgVar2;
    }

    static te.iobyxmoadg gxszxtbevo(boolean z13, int i13, int i14) {
        te.iobyxmoadg iobyxmoadgVar = new te.iobyxmoadg();
        if (z13) {
            iobyxmoadgVar.ppxfxbqfkf(i13 - 1, 2);
            iobyxmoadgVar.ppxfxbqfkf(i14 - 1, 6);
            return eablkybsjg(iobyxmoadgVar, 28, 4);
        }
        iobyxmoadgVar.ppxfxbqfkf(i13 - 1, 5);
        iobyxmoadgVar.ppxfxbqfkf(i14 - 1, 11);
        return eablkybsjg(iobyxmoadgVar, 40, 4);
    }

    private static int[] iobyxmoadg(te.iobyxmoadg iobyxmoadgVar, int i13, int i14) {
        int[] iArr = new int[i14];
        int iLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg() / i13;
        for (int i15 = 0; i15 < iLqeggnwhkg; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 |= iobyxmoadgVar.gxszxtbevo((i15 * i13) + i17) ? 1 << ((i13 - i17) - 1) : 0;
            }
            iArr[i15] = i16;
        }
        return iArr;
    }

    private static ue.iobyxmoadg lqeggnwhkg(int i13) {
        if (i13 == 4) {
            return ue.iobyxmoadg.f113495gtknphoqwx;
        }
        if (i13 == 6) {
            return ue.iobyxmoadg.f113492btonecajqb;
        }
        if (i13 == 8) {
            return ue.iobyxmoadg.f113491agtfadlqog;
        }
        if (i13 == 10) {
            return ue.iobyxmoadg.f113494dxjokdxxww;
        }
        if (i13 == 12) {
            return ue.iobyxmoadg.f113496nufgyqmvbu;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i13)));
    }

    static te.iobyxmoadg nufgyqmvbu(te.iobyxmoadg iobyxmoadgVar, int i13) {
        te.iobyxmoadg iobyxmoadgVar2 = new te.iobyxmoadg();
        int iLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg();
        int i14 = (1 << i13) - 2;
        int i15 = 0;
        while (i15 < iLqeggnwhkg) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = i15 + i17;
                if (i18 >= iLqeggnwhkg || iobyxmoadgVar.gxszxtbevo(i18)) {
                    i16 |= 1 << ((i13 - 1) - i17);
                }
            }
            int i19 = i16 & i14;
            if (i19 == i14) {
                iobyxmoadgVar2.ppxfxbqfkf(i19, i13);
            } else {
                if (i19 == 0) {
                    iobyxmoadgVar2.ppxfxbqfkf(i16 | 1, i13);
                } else {
                    iobyxmoadgVar2.ppxfxbqfkf(i16, i13);
                }
                i15 += i13;
            }
            i15--;
            i15 += i13;
        }
        return iobyxmoadgVar2;
    }

    private static void ppxfxbqfkf(te.zoijcleaow zoijcleaowVar, boolean z13, int i13, te.iobyxmoadg iobyxmoadgVar) {
        int i14 = i13 / 2;
        int i15 = 0;
        if (z13) {
            while (i15 < 7) {
                int i16 = (i14 - 3) + i15;
                if (iobyxmoadgVar.gxszxtbevo(i15)) {
                    zoijcleaowVar.lqeggnwhkg(i16, i14 - 5);
                }
                if (iobyxmoadgVar.gxszxtbevo(i15 + 7)) {
                    zoijcleaowVar.lqeggnwhkg(i14 + 5, i16);
                }
                if (iobyxmoadgVar.gxszxtbevo(20 - i15)) {
                    zoijcleaowVar.lqeggnwhkg(i16, i14 + 5);
                }
                if (iobyxmoadgVar.gxszxtbevo(27 - i15)) {
                    zoijcleaowVar.lqeggnwhkg(i14 - 5, i16);
                }
                i15++;
            }
            return;
        }
        while (i15 < 10) {
            int i17 = (i14 - 5) + i15 + (i15 / 5);
            if (iobyxmoadgVar.gxszxtbevo(i15)) {
                zoijcleaowVar.lqeggnwhkg(i17, i14 - 7);
            }
            if (iobyxmoadgVar.gxszxtbevo(i15 + 10)) {
                zoijcleaowVar.lqeggnwhkg(i14 + 7, i17);
            }
            if (iobyxmoadgVar.gxszxtbevo(29 - i15)) {
                zoijcleaowVar.lqeggnwhkg(i17, i14 + 7);
            }
            if (iobyxmoadgVar.gxszxtbevo(39 - i15)) {
                zoijcleaowVar.lqeggnwhkg(i14 - 7, i17);
            }
            i15++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static iobyxmoadg wkgbmnqykc(byte[] bArr, int i13, int i14) {
        te.iobyxmoadg iobyxmoadgVarNufgyqmvbu;
        int i15;
        boolean z13;
        int iAbs;
        int iDxjokdxxww;
        int i16;
        te.iobyxmoadg iobyxmoadgVarIobyxmoadg = new wkgbmnqykc(bArr).iobyxmoadg();
        int iLqeggnwhkg = ((iobyxmoadgVarIobyxmoadg.lqeggnwhkg() * i13) / 100) + 11;
        int iLqeggnwhkg2 = iobyxmoadgVarIobyxmoadg.lqeggnwhkg() + iLqeggnwhkg;
        int i17 = 1;
        if (i14 != 0) {
            boolean z14 = i14 < 0;
            iAbs = Math.abs(i14);
            if (iAbs > (z14 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i14)));
            }
            iDxjokdxxww = dxjokdxxww(iAbs, z14);
            i15 = f106041iobyxmoadg[iAbs];
            int i18 = iDxjokdxxww - (iDxjokdxxww % i15);
            iobyxmoadgVarNufgyqmvbu = nufgyqmvbu(iobyxmoadgVarIobyxmoadg, i15);
            if (iobyxmoadgVarNufgyqmvbu.lqeggnwhkg() + iLqeggnwhkg > i18) {
                z13 = z14;
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z14) {
                z13 = z14;
                if (iobyxmoadgVarNufgyqmvbu.lqeggnwhkg() > (i15 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            }
        } else {
            te.iobyxmoadg iobyxmoadgVarNufgyqmvbu2 = null;
            int i19 = 0;
            int i23 = 0;
            while (true) {
                if (i19 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z15 = i19 <= 3 ? i17 : 0;
                int i24 = z15 != 0 ? i19 + 1 : i19;
                int iDxjokdxxww2 = dxjokdxxww(i24, z15);
                if (iLqeggnwhkg2 <= iDxjokdxxww2) {
                    if (iobyxmoadgVarNufgyqmvbu2 == null || i23 != f106041iobyxmoadg[i24]) {
                        int i25 = f106041iobyxmoadg[i24];
                        i23 = i25;
                        iobyxmoadgVarNufgyqmvbu2 = nufgyqmvbu(iobyxmoadgVarIobyxmoadg, i25);
                    }
                    int i26 = iDxjokdxxww2 - (iDxjokdxxww2 % i23);
                    if ((z15 == 0 || iobyxmoadgVarNufgyqmvbu2.lqeggnwhkg() <= (i23 << 6)) && iobyxmoadgVarNufgyqmvbu2.lqeggnwhkg() + iLqeggnwhkg <= i26) {
                        iobyxmoadgVarNufgyqmvbu = iobyxmoadgVarNufgyqmvbu2;
                        i15 = i23;
                        z13 = z15;
                        iAbs = i24;
                        iDxjokdxxww = iDxjokdxxww2;
                        break;
                    }
                }
                i19++;
                i17 = i17;
            }
        }
        te.iobyxmoadg iobyxmoadgVarEablkybsjg = eablkybsjg(iobyxmoadgVarNufgyqmvbu, iDxjokdxxww, i15);
        int iLqeggnwhkg3 = iobyxmoadgVarNufgyqmvbu.lqeggnwhkg() / i15;
        te.iobyxmoadg iobyxmoadgVarGxszxtbevo = gxszxtbevo(z13, iAbs, iLqeggnwhkg3);
        int i27 = (z13 ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i27];
        int i28 = 2;
        if (z13) {
            for (int i29 = 0; i29 < i27; i29++) {
                iArr[i29] = i29;
            }
            i16 = i27;
        } else {
            int i33 = i27 / 2;
            i16 = i27 + 1 + (((i33 - 1) / 15) * 2);
            int i34 = i16 / 2;
            for (int i35 = 0; i35 < i33; i35++) {
                int i36 = (i35 / 15) + i35;
                iArr[(i33 - i35) - i17] = (i34 - i36) - 1;
                iArr[i33 + i35] = i36 + i34 + i17;
            }
        }
        te.zoijcleaow zoijcleaowVar = new te.zoijcleaow(i16);
        int i37 = 0;
        int i38 = 0;
        while (i37 < iAbs) {
            int i39 = ((iAbs - i37) << i28) + (z13 ? 9 : 12);
            int i43 = 0;
            while (i43 < i39) {
                int i44 = i43 << 1;
                int i45 = 0;
                while (i45 < i28) {
                    if (iobyxmoadgVarEablkybsjg.gxszxtbevo(i38 + i44 + i45)) {
                        int i46 = i37 << 1;
                        zoijcleaowVar.lqeggnwhkg(iArr[i46 + i45], iArr[i46 + i43]);
                    }
                    if (iobyxmoadgVarEablkybsjg.gxszxtbevo((i39 << 1) + i38 + i44 + i45)) {
                        int i47 = i37 << 1;
                        zoijcleaowVar.lqeggnwhkg(iArr[i47 + i43], iArr[((i27 - 1) - i47) - i45]);
                    }
                    if (iobyxmoadgVarEablkybsjg.gxszxtbevo((i39 << 2) + i38 + i44 + i45)) {
                        int i48 = (i27 - 1) - (i37 << 1);
                        zoijcleaowVar.lqeggnwhkg(iArr[i48 - i45], iArr[i48 - i43]);
                    }
                    if (iobyxmoadgVarEablkybsjg.gxszxtbevo((i39 * 6) + i38 + i44 + i45)) {
                        int i49 = i37 << 1;
                        zoijcleaowVar.lqeggnwhkg(iArr[((i27 - 1) - i49) - i43], iArr[i49 + i45]);
                    }
                    i45++;
                    i28 = 2;
                }
                i43++;
                i28 = 2;
            }
            i38 += i39 << 3;
            i37++;
            i28 = 2;
        }
        ppxfxbqfkf(zoijcleaowVar, z13, i16, iobyxmoadgVarGxszxtbevo);
        if (z13) {
            zoijcleaow(zoijcleaowVar, i16 / 2, 5);
        } else {
            int i53 = i16 / 2;
            zoijcleaow(zoijcleaowVar, i53, 7);
            int i54 = 0;
            int i55 = 0;
            while (i55 < (i27 / 2) - 1) {
                for (int i56 = i53 & 1; i56 < i16; i56 += 2) {
                    int i57 = i53 - i54;
                    zoijcleaowVar.lqeggnwhkg(i57, i56);
                    int i58 = i53 + i54;
                    zoijcleaowVar.lqeggnwhkg(i58, i56);
                    zoijcleaowVar.lqeggnwhkg(i56, i57);
                    zoijcleaowVar.lqeggnwhkg(i56, i58);
                }
                i55 += 15;
                i54 += 16;
            }
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        iobyxmoadgVar.ppxfxbqfkf(z13);
        iobyxmoadgVar.gxszxtbevo(i16);
        iobyxmoadgVar.wkgbmnqykc(iAbs);
        iobyxmoadgVar.zoijcleaow(iLqeggnwhkg3);
        iobyxmoadgVar.eablkybsjg(zoijcleaowVar);
        return iobyxmoadgVar;
    }

    private static void zoijcleaow(te.zoijcleaow zoijcleaowVar, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15 += 2) {
            int i16 = i13 - i15;
            int i17 = i16;
            while (true) {
                int i18 = i13 + i15;
                if (i17 <= i18) {
                    zoijcleaowVar.lqeggnwhkg(i17, i16);
                    zoijcleaowVar.lqeggnwhkg(i17, i18);
                    zoijcleaowVar.lqeggnwhkg(i16, i17);
                    zoijcleaowVar.lqeggnwhkg(i18, i17);
                    i17++;
                }
            }
        }
        int i19 = i13 - i14;
        zoijcleaowVar.lqeggnwhkg(i19, i19);
        int i23 = i19 + 1;
        zoijcleaowVar.lqeggnwhkg(i23, i19);
        zoijcleaowVar.lqeggnwhkg(i19, i23);
        int i24 = i13 + i14;
        zoijcleaowVar.lqeggnwhkg(i24, i19);
        zoijcleaowVar.lqeggnwhkg(i24, i23);
        zoijcleaowVar.lqeggnwhkg(i24, i24 - 1);
    }
}

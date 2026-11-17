package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class ikoacuggdj {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(int[] iArr, int i13, int i14) {
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
    }

    public static final void eablkybsjg(int i13, int i14, vdvldrhtss vdvldrhtssVar) {
        zoijcleaow(wkgbmnqykc(i13, i14, vdvldrhtssVar), vdvldrhtssVar);
    }

    public static final void gxszxtbevo(int i13, int i14, int i15, int i16, boolean z13, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i13;
        iArr[1] = i14;
        iArr[2] = i15;
        iArr[3] = i16;
        iArr[4] = z13 ? 1 : 0;
    }

    private static final boolean lqeggnwhkg(int i13, int i14, int i15, int i16, vdvldrhtss vdvldrhtssVar, int[] iArr, int[] iArr2, int i17, int[] iArr3) {
        int iZoijcleaow;
        int i18;
        int i19;
        int i23 = (i14 - i13) - (i16 - i15);
        boolean z13 = (Math.abs(i23) & 1) == 1;
        int i24 = -i17;
        for (int i25 = i24; i25 <= i17; i25 += 2) {
            if (i25 == i24 || (i25 != i17 && gxszxtbevo.zoijcleaow(iArr, i25 + 1) > gxszxtbevo.zoijcleaow(iArr, i25 - 1))) {
                iZoijcleaow = gxszxtbevo.zoijcleaow(iArr, i25 + 1);
                i18 = iZoijcleaow;
            } else {
                iZoijcleaow = gxszxtbevo.zoijcleaow(iArr, i25 - 1);
                i18 = iZoijcleaow + 1;
            }
            int i26 = (i15 + (i18 - i13)) - i25;
            int i27 = i26 - ((i17 != 0 ? 1 : 0) & (i18 == iZoijcleaow ? 1 : 0));
            while (true) {
                if (i18 >= i14 || i26 >= i16) {
                    break;
                }
                if (!vdvldrhtssVar.iobyxmoadg(i18, i26)) {
                    break;
                }
                i18++;
                i26++;
            }
            gxszxtbevo.wkgbmnqykc(iArr, i25, i18);
            if (z13 && (i19 = i23 - i25) >= i24 + 1 && i19 <= i17 - 1) {
                if (gxszxtbevo.zoijcleaow(iArr2, i19) <= i18) {
                    gxszxtbevo(iZoijcleaow, i27, i18, i26, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean nufgyqmvbu(int i13, int i14, int i15, int i16, vdvldrhtss vdvldrhtssVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i17 = i14 - i13;
        int i18 = i16 - i15;
        if (i17 >= 1 && i18 >= 1) {
            int i19 = ((i17 + i18) + 1) / 2;
            gxszxtbevo.wkgbmnqykc(iArr, 1, i13);
            gxszxtbevo.wkgbmnqykc(iArr2, 1, i14);
            int i23 = 0;
            while (i23 < i19) {
                int i24 = i23;
                if (lqeggnwhkg(i13, i14, i15, i16, vdvldrhtssVar, iArr, iArr2, i23, iArr3) || ppxfxbqfkf(i13, i14, i15, i16, vdvldrhtssVar, iArr, iArr2, i24, iArr3)) {
                    return true;
                }
                i23 = i24 + 1;
            }
        }
        return false;
    }

    private static final boolean ppxfxbqfkf(int i13, int i14, int i15, int i16, vdvldrhtss vdvldrhtssVar, int[] iArr, int[] iArr2, int i17, int[] iArr3) {
        int iZoijcleaow;
        int i18;
        int i19;
        int i23 = (i14 - i13) - (i16 - i15);
        boolean z13 = (i23 & 1) == 0;
        int i24 = -i17;
        for (int i25 = i24; i25 <= i17; i25 += 2) {
            if (i25 == i24 || (i25 != i17 && gxszxtbevo.zoijcleaow(iArr2, i25 + 1) < gxszxtbevo.zoijcleaow(iArr2, i25 - 1))) {
                iZoijcleaow = gxszxtbevo.zoijcleaow(iArr2, i25 + 1);
                i18 = iZoijcleaow;
            } else {
                iZoijcleaow = gxszxtbevo.zoijcleaow(iArr2, i25 - 1);
                i18 = iZoijcleaow - 1;
            }
            int i26 = i16 - ((i14 - i18) - i25);
            int i27 = ((i17 != 0 ? 1 : 0) & (i18 == iZoijcleaow ? 1 : 0)) + i26;
            while (true) {
                if (i18 <= i13 || i26 <= i15) {
                    break;
                }
                if (!vdvldrhtssVar.iobyxmoadg(i18 - 1, i26 - 1)) {
                    break;
                }
                i18--;
                i26--;
            }
            gxszxtbevo.wkgbmnqykc(iArr2, i25, i18);
            if (z13 && (i19 = i23 - i25) >= i24 && i19 <= i17) {
                if (gxszxtbevo.zoijcleaow(iArr, i19) >= i18) {
                    gxszxtbevo(i18, i26, iZoijcleaow, i27, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final lereixgezr wkgbmnqykc(int i13, int i14, vdvldrhtss vdvldrhtssVar) {
        int[] iArr;
        int i15 = ((i13 + i14) + 1) / 2;
        lereixgezr lereixgezrVar = new lereixgezr(i15 * 3);
        lereixgezr lereixgezrVar2 = new lereixgezr(i15 * 4);
        lereixgezrVar2.nufgyqmvbu(0, i13, 0, i14);
        int i16 = (i15 * 2) + 1;
        int[] iArrIobyxmoadg = gxszxtbevo.iobyxmoadg(new int[i16]);
        int[] iArrIobyxmoadg2 = gxszxtbevo.iobyxmoadg(new int[i16]);
        int[] iArrZoijcleaow = skhdrjzrfn.zoijcleaow(new int[5]);
        while (lereixgezrVar2.wkgbmnqykc()) {
            int iGxszxtbevo = lereixgezrVar2.gxszxtbevo();
            int iGxszxtbevo2 = lereixgezrVar2.gxszxtbevo();
            int iGxszxtbevo3 = lereixgezrVar2.gxszxtbevo();
            int iGxszxtbevo4 = lereixgezrVar2.gxszxtbevo();
            int[] iArr2 = iArrZoijcleaow;
            if (nufgyqmvbu(iGxszxtbevo4, iGxszxtbevo3, iGxszxtbevo2, iGxszxtbevo, vdvldrhtssVar, iArrIobyxmoadg, iArrIobyxmoadg2, iArr2)) {
                if (Math.min(iArr2[2] - iArr2[0], iArr2[3] - iArr2[1]) > 0) {
                    iArr = iArr2;
                    skhdrjzrfn.iobyxmoadg(iArr, lereixgezrVar);
                } else {
                    iArr = iArr2;
                }
                lereixgezrVar2.nufgyqmvbu(iGxszxtbevo4, iArr[0], iGxszxtbevo2, iArr[1]);
                lereixgezrVar2.nufgyqmvbu(iArr[2], iGxszxtbevo3, iArr[3], iGxszxtbevo);
                iArrZoijcleaow = iArr;
            } else {
                iArrZoijcleaow = iArr2;
            }
        }
        lereixgezrVar.gtknphoqwx();
        lereixgezrVar.lqeggnwhkg(i13, i14, 0);
        return lereixgezrVar;
    }

    private static final void zoijcleaow(lereixgezr lereixgezrVar, vdvldrhtss vdvldrhtssVar) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < lereixgezrVar.ppxfxbqfkf()) {
            int i16 = i13 + 2;
            int iZoijcleaow = lereixgezrVar.zoijcleaow(i13) - lereixgezrVar.zoijcleaow(i16);
            int iZoijcleaow2 = lereixgezrVar.zoijcleaow(i13 + 1) - lereixgezrVar.zoijcleaow(i16);
            int iZoijcleaow3 = lereixgezrVar.zoijcleaow(i16);
            i13 += 3;
            while (i14 < iZoijcleaow) {
                vdvldrhtssVar.zoijcleaow(i15, i14);
                i14++;
            }
            while (i15 < iZoijcleaow2) {
                vdvldrhtssVar.ppxfxbqfkf(i15);
                i15++;
            }
            while (true) {
                int i17 = iZoijcleaow3 - 1;
                if (iZoijcleaow3 > 0) {
                    vdvldrhtssVar.wkgbmnqykc(i14, i15);
                    i14++;
                    i15++;
                    iZoijcleaow3 = i17;
                }
            }
        }
    }
}

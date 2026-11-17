package czzsidtyhn;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class iyctptxqzt {
    public static final x.istkbnxepw iobyxmoadg(opjhrmiecq opjhrmiecqVar, int i13, int i14, int i15, int i16, int i17, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, androidx.compose.ui.layout.kcexrzcfyt[] kcexrzcfytVarArr, int i18, int i19, int[] iArr, int i23) {
        int i24;
        int i25;
        int i26;
        int iMax;
        int i27;
        long j13 = i17;
        int i28 = i19 - i18;
        int[] iArr2 = new int[i28];
        int i29 = 0;
        int i33 = i18;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        float f13 = 0.0f;
        while (i33 < i19) {
            x.pmvmpeiblj pmvmpeibljVar = (x.pmvmpeiblj) list.get(i33);
            weqkydbzbr weqkydbzbrVarWkgbmnqykc = bfopjjpdmp.wkgbmnqykc(pmvmpeibljVar);
            float fEablkybsjg = bfopjjpdmp.eablkybsjg(weqkydbzbrVarWkgbmnqykc);
            i37 = (i37 != 0 || bfopjjpdmp.gxszxtbevo(weqkydbzbrVarWkgbmnqykc)) ? 1 : i29;
            if (fEablkybsjg > 0.0f) {
                f13 += fEablkybsjg;
                i36++;
                i33 = i33;
                i28 = i28;
            } else {
                if (i16 != Integer.MAX_VALUE && weqkydbzbrVarWkgbmnqykc != null) {
                    weqkydbzbrVarWkgbmnqykc.ppxfxbqfkf();
                }
                int i39 = i15 - i38;
                androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = kcexrzcfytVarArr[i33];
                if (kcexrzcfytVarSflfametgt == null) {
                    kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(opjhrmiecq.ojitshcjhn(opjhrmiecqVar, 0, 0, i15 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i39 < 0 ? i29 : i39, i16, false, 16, null));
                }
                int iDxjokdxxww = opjhrmiecqVar.dxjokdxxww(kcexrzcfytVarSflfametgt);
                int iGtknphoqwx = opjhrmiecqVar.gtknphoqwx(kcexrzcfytVarSflfametgt);
                iArr2 = iArr2;
                iArr2[i33 - i18] = iDxjokdxxww;
                int i43 = i39 - iDxjokdxxww;
                if (i43 < 0) {
                    i43 = 0;
                }
                int iMin = Math.min(i17, i43);
                i38 += iDxjokdxxww + iMin;
                int iMax2 = Math.max(i35, iGtknphoqwx);
                kcexrzcfytVarArr[i33] = kcexrzcfytVarSflfametgt;
                i34 = iMin;
                i35 = iMax2;
            }
            i33++;
            i28 = i28;
            i29 = 0;
        }
        int i44 = i35;
        int i45 = i28;
        if (i36 == 0) {
            i38 -= i34;
            i25 = i44;
            i24 = 0;
        } else {
            long j14 = j13 * ((long) (i36 - 1));
            long jRound = ((long) ((i15 != Integer.MAX_VALUE ? i15 : i13) - i38)) - j14;
            if (jRound < 0) {
                jRound = 0;
            }
            float f14 = jRound / f13;
            for (int i46 = i18; i46 < i19; i46++) {
                jRound -= (long) Math.round(bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc((x.pmvmpeiblj) list.get(i46))) * f14);
            }
            int i47 = i18;
            int i48 = 0;
            while (i47 < i19) {
                if (kcexrzcfytVarArr[i47] == null) {
                    x.pmvmpeiblj pmvmpeibljVar2 = (x.pmvmpeiblj) list.get(i47);
                    weqkydbzbr weqkydbzbrVarWkgbmnqykc2 = bfopjjpdmp.wkgbmnqykc(pmvmpeibljVar2);
                    float fEablkybsjg2 = bfopjjpdmp.eablkybsjg(weqkydbzbrVarWkgbmnqykc2);
                    if (i16 != Integer.MAX_VALUE && weqkydbzbrVarWkgbmnqykc2 != null) {
                        weqkydbzbrVarWkgbmnqykc2.ppxfxbqfkf();
                    }
                    if (!(fEablkybsjg2 > 0.0f)) {
                        uwvvkdfqfp.iobyxmoadg.zoijcleaow("All weights <= 0 should have placeables");
                    }
                    int iZoijcleaow = vg.iobyxmoadg.zoijcleaow(jRound);
                    int i49 = i47;
                    long j15 = jRound - ((long) iZoijcleaow);
                    int iMax3 = Math.max(0, Math.round(fEablkybsjg2 * f14) + iZoijcleaow);
                    i26 = i49;
                    androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt2 = pmvmpeibljVar2.sflfametgt(opjhrmiecqVar.ppxfxbqfkf((!bfopjjpdmp.zoijcleaow(weqkydbzbrVarWkgbmnqykc2) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, 0, iMax3, i16, true));
                    int iDxjokdxxww2 = opjhrmiecqVar.dxjokdxxww(kcexrzcfytVarSflfametgt2);
                    int iGtknphoqwx2 = opjhrmiecqVar.gtknphoqwx(kcexrzcfytVarSflfametgt2);
                    iArr2[i26 - i18] = iDxjokdxxww2;
                    i48 += iDxjokdxxww2;
                    int iMax4 = Math.max(i44, iGtknphoqwx2);
                    kcexrzcfytVarArr[i26] = kcexrzcfytVarSflfametgt2;
                    i44 = iMax4;
                    jRound = j15;
                } else {
                    i26 = i47;
                }
                i47 = i26 + 1;
                f14 = f14;
            }
            int i53 = i44;
            i24 = (int) (((long) i48) + j14);
            int i54 = i15 - i38;
            if (i24 < 0) {
                i24 = 0;
            }
            if (i24 > i54) {
                i24 = i54;
            }
            i25 = i53;
        }
        if (i37 != 0) {
            int iMax5 = 0;
            iMax = 0;
            for (int i55 = i18; i55 < i19; i55++) {
                androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = kcexrzcfytVarArr[i55];
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar);
                zdlpuopuiu zdlpuopuiuVarIobyxmoadg = bfopjjpdmp.iobyxmoadg(bfopjjpdmp.ppxfxbqfkf(kcexrzcfytVar));
                Integer numZoijcleaow = zdlpuopuiuVarIobyxmoadg != null ? zdlpuopuiuVarIobyxmoadg.zoijcleaow(kcexrzcfytVar) : null;
                if (numZoijcleaow != null) {
                    int iIntValue = numZoijcleaow.intValue();
                    int iGtknphoqwx3 = opjhrmiecqVar.gtknphoqwx(kcexrzcfytVar);
                    iMax5 = Math.max(iMax5, iIntValue != Integer.MIN_VALUE ? numZoijcleaow.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iGtknphoqwx3;
                    }
                    iMax = Math.max(iMax, iGtknphoqwx3 - iIntValue);
                }
            }
            i27 = iMax5;
        } else {
            iMax = 0;
            i27 = 0;
        }
        int i56 = i38 + i24;
        if (i56 < 0) {
            i56 = 0;
        }
        int iMax6 = Math.max(i56, i13);
        int iMax7 = Math.max(i25, Math.max(i14, iMax + i27));
        int[] iArr3 = new int[i45];
        opjhrmiecqVar.eablkybsjg(iMax6, iArr2, iArr3, draadjrbmkVar);
        return opjhrmiecqVar.nufgyqmvbu(kcexrzcfytVarArr, draadjrbmkVar, i27, iArr3, iMax6, iMax7, iArr, i23, i18, i19);
    }
}

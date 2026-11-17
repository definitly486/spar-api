package igdgnonuha;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
final class m6 implements x.zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f43417iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final czzsidtyhn.ydmasvzmpa f43418ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f43419zoijcleaow;

    public m6(boolean z13, float f13, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar) {
        this.f43417iobyxmoadg = z13;
        this.f43419zoijcleaow = f13;
        this.f43418ppxfxbqfkf = ydmasvzmpaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int agtfadlqog(x.draadjrbmk draadjrbmkVar, int i13) {
        return draadjrbmkVar.ydmasvzmpa(i13);
    }

    private final int draadjrbmk(List list, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj5 = list.get(i14);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj5), "TextField")) {
                int iIntValue = ((Number) rgvfuqvkyqVar.invoke(obj5, Integer.valueOf(i13))).intValue();
                int size2 = list.size();
                int i15 = 0;
                while (true) {
                    obj = null;
                    if (i15 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i15);
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj2), "Label")) {
                        break;
                    }
                    i15++;
                }
                x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) obj2;
                int iIntValue2 = draadjrbmkVar != null ? ((Number) rgvfuqvkyqVar.invoke(draadjrbmkVar, Integer.valueOf(i13))).intValue() : 0;
                int size3 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i16);
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj3), "Trailing")) {
                        break;
                    }
                    i16++;
                }
                x.draadjrbmk draadjrbmkVar2 = (x.draadjrbmk) obj3;
                int iIntValue3 = draadjrbmkVar2 != null ? ((Number) rgvfuqvkyqVar.invoke(draadjrbmkVar2, Integer.valueOf(i13))).intValue() : 0;
                int size4 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i17);
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj4), "Leading")) {
                        break;
                    }
                    i17++;
                }
                x.draadjrbmk draadjrbmkVar3 = (x.draadjrbmk) obj4;
                int iIntValue4 = draadjrbmkVar3 != null ? ((Number) rgvfuqvkyqVar.invoke(draadjrbmkVar3, Integer.valueOf(i13))).intValue() : 0;
                int size5 = list.size();
                for (int i18 = 0; i18 < size5; i18++) {
                    Object obj6 = list.get(i18);
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                }
                x.draadjrbmk draadjrbmkVar4 = (x.draadjrbmk) obj;
                return g6.wflxmlrfwp(iIntValue4, iIntValue3, iIntValue, iIntValue2, draadjrbmkVar4 != null ? ((Number) rgvfuqvkyqVar.invoke(draadjrbmkVar4, Integer.valueOf(i13))).intValue() : 0, w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null));
            }
        }
        y0.ppxfxbqfkf.gxszxtbevo("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    private final int gtknphoqwx(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        Object obj;
        Object obj2;
        int iIntValue;
        int iIobyxmoadg;
        Object obj3;
        int iIntValue2;
        Object obj4;
        int size = list.size();
        int i14 = 0;
        while (true) {
            obj = null;
            if (i14 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj2), "Leading")) {
                break;
            }
            i14++;
        }
        x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) obj2;
        if (draadjrbmkVar != null) {
            iIobyxmoadg = hszhottldk.iobyxmoadg.iobyxmoadg(i13, draadjrbmkVar.ydmasvzmpa(Integer.MAX_VALUE));
            iIntValue = ((Number) rgvfuqvkyqVar.invoke(draadjrbmkVar, Integer.valueOf(i13))).intValue();
        } else {
            iIntValue = 0;
            iIobyxmoadg = i13;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i15);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj3), "Trailing")) {
                break;
            }
            i15++;
        }
        x.draadjrbmk draadjrbmkVar2 = (x.draadjrbmk) obj3;
        if (draadjrbmkVar2 != null) {
            iIobyxmoadg = hszhottldk.iobyxmoadg.iobyxmoadg(iIobyxmoadg, draadjrbmkVar2.ydmasvzmpa(Integer.MAX_VALUE));
            iIntValue2 = ((Number) rgvfuqvkyqVar.invoke(draadjrbmkVar2, Integer.valueOf(i13))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i16);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj4), "Label")) {
                break;
            }
            i16++;
        }
        Object obj5 = (x.draadjrbmk) obj4;
        int iIntValue3 = obj5 != null ? ((Number) rgvfuqvkyqVar.invoke(obj5, Integer.valueOf(iIobyxmoadg))).intValue() : 0;
        int size4 = list.size();
        for (int i17 = 0; i17 < size4; i17++) {
            Object obj6 = list.get(i17);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj6), "TextField")) {
                int iIntValue4 = ((Number) rgvfuqvkyqVar.invoke(obj6, Integer.valueOf(iIobyxmoadg))).intValue();
                int size5 = list.size();
                for (int i18 = 0; i18 < size5; i18++) {
                    Object obj7 = list.get(i18);
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c6.gtknphoqwx((x.draadjrbmk) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                }
                Object obj8 = (x.draadjrbmk) obj;
                return g6.draadjrbmk(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, obj8 != null ? ((Number) rgvfuqvkyqVar.invoke(obj8, Integer.valueOf(iIobyxmoadg))).intValue() : 0, w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null), wflxmlrfwpVar.getDensity(), this.f43418ppxfxbqfkf);
            }
        }
        y0.ppxfxbqfkf.gxszxtbevo("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ojitshcjhn(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i13, int i14, int i15, int i16, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar2, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar3, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar4, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar5, m6 m6Var, int i17, int i18, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        if (kcexrzcfytVar != null) {
            g6.kcexrzcfyt(iobyxmoadgVar, i15, i16, kcexrzcfytVar2, kcexrzcfytVar, kcexrzcfytVar3, kcexrzcfytVar4, kcexrzcfytVar5, m6Var.f43417iobyxmoadg, zg.gtknphoqwx.gxszxtbevo(i13 - i14, 0), i17 + i18, m6Var.f43419zoijcleaow, draadjrbmkVar.getDensity());
        } else {
            g6.zdlpuopuiu(iobyxmoadgVar, i15, i16, kcexrzcfytVar2, kcexrzcfytVar3, kcexrzcfytVar4, kcexrzcfytVar5, m6Var.f43417iobyxmoadg, draadjrbmkVar.getDensity(), m6Var.f43418ppxfxbqfkf);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rgvfuqvkyq(x.draadjrbmk draadjrbmkVar, int i13) {
        return draadjrbmkVar.wypolnanlu(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int vdvldrhtss(x.draadjrbmk draadjrbmkVar, int i13) {
        return draadjrbmkVar.czzsidtyhn(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int wflxmlrfwp(x.draadjrbmk draadjrbmkVar, int i13) {
        return draadjrbmkVar.yggfygwlhe(i13);
    }

    @Override // x.zynmafqrjb
    public int btonecajqb(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        return gtknphoqwx(wflxmlrfwpVar, list, i13, new tg.rgvfuqvkyq() { // from class: igdgnonuha.j6
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(m6.rgvfuqvkyq((x.draadjrbmk) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // x.zynmafqrjb
    public int gxszxtbevo(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        return gtknphoqwx(wflxmlrfwpVar, list, i13, new tg.rgvfuqvkyq() { // from class: igdgnonuha.k6
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(m6.wflxmlrfwp((x.draadjrbmk) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // x.zynmafqrjb
    public int iobyxmoadg(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        return draadjrbmk(list, i13, new tg.rgvfuqvkyq() { // from class: igdgnonuha.l6
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(m6.vdvldrhtss((x.draadjrbmk) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // x.zynmafqrjb
    public x.istkbnxepw lqeggnwhkg(final androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13) {
        Object obj;
        Object obj2;
        Object obj3;
        int iCllcsxoeiz;
        Object obj4;
        List list2 = list;
        final int iHszhottldk = draadjrbmkVar.hszhottldk(this.f43418ppxfxbqfkf.wkgbmnqykc());
        int iHszhottldk2 = draadjrbmkVar.hszhottldk(this.f43418ppxfxbqfkf.iobyxmoadg());
        final int iHszhottldk3 = draadjrbmkVar.hszhottldk(g6.oxmwwwfdhm());
        long jWkgbmnqykc = w0.zoijcleaow.wkgbmnqykc(j13, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i13);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg((x.pmvmpeiblj) obj), "Leading")) {
                break;
            }
            i13++;
        }
        x.pmvmpeiblj pmvmpeibljVar = (x.pmvmpeiblj) obj;
        androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar != null ? pmvmpeibljVar.sflfametgt(jWkgbmnqykc) : null;
        int iAgtfadlqog = c6.agtfadlqog(kcexrzcfytVarSflfametgt);
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i14);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg((x.pmvmpeiblj) obj2), "Trailing")) {
                break;
            }
            i14++;
        }
        x.pmvmpeiblj pmvmpeibljVar2 = (x.pmvmpeiblj) obj2;
        androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt2 = pmvmpeibljVar2 != null ? pmvmpeibljVar2.sflfametgt(w0.ppxfxbqfkf.btonecajqb(jWkgbmnqykc, -iAgtfadlqog, 0, 2, null)) : null;
        int i15 = -iHszhottldk2;
        int i16 = -(iAgtfadlqog + c6.agtfadlqog(kcexrzcfytVarSflfametgt2));
        long jDxjokdxxww = w0.ppxfxbqfkf.dxjokdxxww(jWkgbmnqykc, i16, i15);
        int size3 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i17);
            int i18 = size3;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg((x.pmvmpeiblj) obj3), "Label")) {
                break;
            }
            i17++;
            size3 = i18;
        }
        x.pmvmpeiblj pmvmpeibljVar3 = (x.pmvmpeiblj) obj3;
        androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt3 = pmvmpeibljVar3 != null ? pmvmpeibljVar3.sflfametgt(jDxjokdxxww) : null;
        if (kcexrzcfytVarSflfametgt3 != null) {
            iCllcsxoeiz = kcexrzcfytVarSflfametgt3.cllcsxoeiz(x.zoijcleaow.zoijcleaow());
            if (iCllcsxoeiz == Integer.MIN_VALUE) {
                iCllcsxoeiz = kcexrzcfytVarSflfametgt3.ipoelvxyzq();
            }
        } else {
            iCllcsxoeiz = 0;
        }
        final int iMax = Math.max(iCllcsxoeiz, iHszhottldk);
        long jDxjokdxxww2 = w0.ppxfxbqfkf.dxjokdxxww(w0.zoijcleaow.wkgbmnqykc(j13, 0, 0, 0, 0, 11, null), i16, kcexrzcfytVarSflfametgt3 != null ? (i15 - iHszhottldk3) - iMax : (-iHszhottldk) - iHszhottldk2);
        int size4 = list.size();
        int i19 = 0;
        while (i19 < size4) {
            x.pmvmpeiblj pmvmpeibljVar4 = (x.pmvmpeiblj) list2.get(i19);
            int i23 = size4;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg(pmvmpeibljVar4), "TextField")) {
                final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt4 = pmvmpeibljVar4.sflfametgt(jDxjokdxxww2);
                long jWkgbmnqykc2 = w0.zoijcleaow.wkgbmnqykc(jDxjokdxxww2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i24);
                    int i25 = size5;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg((x.pmvmpeiblj) obj4), "Hint")) {
                        break;
                    }
                    i24++;
                    list2 = list;
                    size5 = i25;
                }
                x.pmvmpeiblj pmvmpeibljVar5 = (x.pmvmpeiblj) obj4;
                androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt5 = pmvmpeibljVar5 != null ? pmvmpeibljVar5.sflfametgt(jWkgbmnqykc2) : null;
                final int iWflxmlrfwp = g6.wflxmlrfwp(c6.agtfadlqog(kcexrzcfytVarSflfametgt), c6.agtfadlqog(kcexrzcfytVarSflfametgt2), kcexrzcfytVarSflfametgt4.eslsurpljm(), c6.agtfadlqog(kcexrzcfytVarSflfametgt3), c6.agtfadlqog(kcexrzcfytVarSflfametgt5), j13);
                final int iDraadjrbmk = g6.draadjrbmk(kcexrzcfytVarSflfametgt4.ipoelvxyzq(), kcexrzcfytVarSflfametgt3 != null, iMax, c6.wflxmlrfwp(kcexrzcfytVarSflfametgt), c6.wflxmlrfwp(kcexrzcfytVarSflfametgt2), c6.wflxmlrfwp(kcexrzcfytVarSflfametgt5), j13, draadjrbmkVar.getDensity(), this.f43418ppxfxbqfkf);
                final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = kcexrzcfytVarSflfametgt3;
                final int i26 = iCllcsxoeiz;
                final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar2 = kcexrzcfytVarSflfametgt5;
                final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar3 = kcexrzcfytVarSflfametgt;
                final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar4 = kcexrzcfytVarSflfametgt2;
                return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iWflxmlrfwp, iDraadjrbmk, null, new tg.draadjrbmk() { // from class: igdgnonuha.i6
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj5) {
                        return m6.ojitshcjhn(kcexrzcfytVar, iHszhottldk, i26, iWflxmlrfwp, iDraadjrbmk, kcexrzcfytVarSflfametgt4, kcexrzcfytVar2, kcexrzcfytVar3, kcexrzcfytVar4, this, iMax, iHszhottldk3, draadjrbmkVar, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj5);
                    }
                }, 4, null);
            }
            i19++;
            list2 = list;
            size4 = i23;
        }
        y0.ppxfxbqfkf.gxszxtbevo("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // x.zynmafqrjb
    public int zoijcleaow(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        return draadjrbmk(list, i13, new tg.rgvfuqvkyq() { // from class: igdgnonuha.h6
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(m6.agtfadlqog((x.draadjrbmk) obj, ((Integer) obj2).intValue()));
            }
        });
    }
}

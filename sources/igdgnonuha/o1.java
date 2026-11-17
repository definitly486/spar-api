package igdgnonuha;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
final class o1 implements x.zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f43489iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f43490ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final czzsidtyhn.ydmasvzmpa f43491wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f43492zoijcleaow;

    public o1(tg.draadjrbmk draadjrbmkVar, boolean z13, float f13, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar) {
        this.f43489iobyxmoadg = draadjrbmkVar;
        this.f43492zoijcleaow = z13;
        this.f43490ppxfxbqfkf = f13;
        this.f43491wkgbmnqykc = ydmasvzmpaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int agtfadlqog(x.draadjrbmk draadjrbmkVar, int i13) {
        return draadjrbmkVar.ydmasvzmpa(i13);
    }

    private final int draadjrbmk(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
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
                return i1.agtfadlqog(iIntValue4, iIntValue3, iIntValue, iIntValue2, draadjrbmkVar4 != null ? ((Number) rgvfuqvkyqVar.invoke(draadjrbmkVar4, Integer.valueOf(i13))).intValue() : 0, this.f43490ppxfxbqfkf, w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null), wflxmlrfwpVar.getDensity(), this.f43491wkgbmnqykc);
            }
        }
        y0.ppxfxbqfkf.gxszxtbevo("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    private final int gtknphoqwx(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        Object obj;
        Object obj2;
        int iIobyxmoadg;
        int iIntValue;
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
            iIobyxmoadg = i13;
            iIntValue = 0;
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
        int iIntValue3 = obj5 != null ? ((Number) rgvfuqvkyqVar.invoke(obj5, Integer.valueOf(y0.wkgbmnqykc.ppxfxbqfkf(iIobyxmoadg, i13, this.f43490ppxfxbqfkf)))).intValue() : 0;
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
                return i1.wflxmlrfwp(iIntValue, iIntValue2, iIntValue4, iIntValue3, obj8 != null ? ((Number) rgvfuqvkyqVar.invoke(obj8, Integer.valueOf(iIobyxmoadg))).intValue() : 0, this.f43490ppxfxbqfkf, w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null), wflxmlrfwpVar.getDensity(), this.f43491wkgbmnqykc);
            }
        }
        y0.ppxfxbqfkf.gxszxtbevo("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ojitshcjhn(int i13, int i14, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar2, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar3, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar4, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar5, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar6, o1 o1Var, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        i1.vdvldrhtss(iobyxmoadgVar, i13, i14, kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVar3, kcexrzcfytVar4, kcexrzcfytVar5, kcexrzcfytVar6, o1Var.f43490ppxfxbqfkf, o1Var.f43492zoijcleaow, draadjrbmkVar.getDensity(), draadjrbmkVar.getLayoutDirection(), o1Var.f43491wkgbmnqykc);
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
        return gtknphoqwx(wflxmlrfwpVar, list, i13, new tg.rgvfuqvkyq() { // from class: igdgnonuha.j1
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(o1.rgvfuqvkyq((x.draadjrbmk) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // x.zynmafqrjb
    public int gxszxtbevo(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        return gtknphoqwx(wflxmlrfwpVar, list, i13, new tg.rgvfuqvkyq() { // from class: igdgnonuha.n1
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(o1.wflxmlrfwp((x.draadjrbmk) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // x.zynmafqrjb
    public int iobyxmoadg(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        return draadjrbmk(wflxmlrfwpVar, list, i13, new tg.rgvfuqvkyq() { // from class: igdgnonuha.m1
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(o1.vdvldrhtss((x.draadjrbmk) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // x.zynmafqrjb
    public x.istkbnxepw lqeggnwhkg(final androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int iHszhottldk = draadjrbmkVar.hszhottldk(this.f43491wkgbmnqykc.iobyxmoadg());
        long jWkgbmnqykc = w0.zoijcleaow.wkgbmnqykc(j13, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
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
            obj2 = list.get(i14);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg((x.pmvmpeiblj) obj2), "Trailing")) {
                break;
            }
            i14++;
        }
        x.pmvmpeiblj pmvmpeibljVar2 = (x.pmvmpeiblj) obj2;
        androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt2 = pmvmpeibljVar2 != null ? pmvmpeibljVar2.sflfametgt(w0.ppxfxbqfkf.btonecajqb(jWkgbmnqykc, -iAgtfadlqog, 0, 2, null)) : null;
        int iAgtfadlqog2 = iAgtfadlqog + c6.agtfadlqog(kcexrzcfytVarSflfametgt2);
        int iHszhottldk2 = draadjrbmkVar.hszhottldk(this.f43491wkgbmnqykc.ppxfxbqfkf(draadjrbmkVar.getLayoutDirection())) + draadjrbmkVar.hszhottldk(this.f43491wkgbmnqykc.zoijcleaow(draadjrbmkVar.getLayoutDirection()));
        int i15 = -iAgtfadlqog2;
        int i16 = -iHszhottldk;
        long jDxjokdxxww = w0.ppxfxbqfkf.dxjokdxxww(jWkgbmnqykc, y0.wkgbmnqykc.ppxfxbqfkf(i15 - iHszhottldk2, -iHszhottldk2, this.f43490ppxfxbqfkf), i16);
        int size3 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i17);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg((x.pmvmpeiblj) obj3), "Label")) {
                break;
            }
            i17++;
        }
        x.pmvmpeiblj pmvmpeibljVar3 = (x.pmvmpeiblj) obj3;
        androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt3 = pmvmpeibljVar3 != null ? pmvmpeibljVar3.sflfametgt(jDxjokdxxww) : null;
        this.f43489iobyxmoadg.invoke(g.gtknphoqwx.ppxfxbqfkf(kcexrzcfytVarSflfametgt3 != null ? g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(kcexrzcfytVarSflfametgt3.ipoelvxyzq())) & 4294967295L) | (((long) Float.floatToRawIntBits(kcexrzcfytVarSflfametgt3.eslsurpljm())) << 32)) : g.gtknphoqwx.f35588zoijcleaow.zoijcleaow()));
        long jWkgbmnqykc2 = w0.zoijcleaow.wkgbmnqykc(w0.ppxfxbqfkf.dxjokdxxww(j13, i15, i16 - Math.max(c6.wflxmlrfwp(kcexrzcfytVarSflfametgt3) / 2, draadjrbmkVar.hszhottldk(this.f43491wkgbmnqykc.wkgbmnqykc()))), 0, 0, 0, 0, 11, null);
        int size4 = list.size();
        for (int i18 = 0; i18 < size4; i18++) {
            x.pmvmpeiblj pmvmpeibljVar4 = (x.pmvmpeiblj) list.get(i18);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg(pmvmpeibljVar4), "TextField")) {
                final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt4 = pmvmpeibljVar4.sflfametgt(jWkgbmnqykc2);
                long jWkgbmnqykc3 = w0.zoijcleaow.wkgbmnqykc(jWkgbmnqykc2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i19);
                    int i23 = size5;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg((x.pmvmpeiblj) obj4), "Hint")) {
                        break;
                    }
                    i19++;
                    size5 = i23;
                }
                x.pmvmpeiblj pmvmpeibljVar5 = (x.pmvmpeiblj) obj4;
                final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt5 = pmvmpeibljVar5 != null ? pmvmpeibljVar5.sflfametgt(jWkgbmnqykc3) : null;
                final int iAgtfadlqog3 = i1.agtfadlqog(c6.agtfadlqog(kcexrzcfytVarSflfametgt), c6.agtfadlqog(kcexrzcfytVarSflfametgt2), kcexrzcfytVarSflfametgt4.eslsurpljm(), c6.agtfadlqog(kcexrzcfytVarSflfametgt3), c6.agtfadlqog(kcexrzcfytVarSflfametgt5), this.f43490ppxfxbqfkf, j13, draadjrbmkVar.getDensity(), this.f43491wkgbmnqykc);
                final int iWflxmlrfwp = i1.wflxmlrfwp(c6.wflxmlrfwp(kcexrzcfytVarSflfametgt), c6.wflxmlrfwp(kcexrzcfytVarSflfametgt2), kcexrzcfytVarSflfametgt4.ipoelvxyzq(), c6.wflxmlrfwp(kcexrzcfytVarSflfametgt3), c6.wflxmlrfwp(kcexrzcfytVarSflfametgt5), this.f43490ppxfxbqfkf, j13, draadjrbmkVar.getDensity(), this.f43491wkgbmnqykc);
                int size6 = list.size();
                for (int i24 = 0; i24 < size6; i24++) {
                    x.pmvmpeiblj pmvmpeibljVar6 = (x.pmvmpeiblj) list.get(i24);
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg(pmvmpeibljVar6), "border")) {
                        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt6 = pmvmpeibljVar6.sflfametgt(w0.ppxfxbqfkf.iobyxmoadg(iAgtfadlqog3 != Integer.MAX_VALUE ? iAgtfadlqog3 : 0, iAgtfadlqog3, iWflxmlrfwp != Integer.MAX_VALUE ? iWflxmlrfwp : 0, iWflxmlrfwp));
                        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = kcexrzcfytVarSflfametgt;
                        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar2 = kcexrzcfytVarSflfametgt2;
                        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar3 = kcexrzcfytVarSflfametgt3;
                        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iAgtfadlqog3, iWflxmlrfwp, null, new tg.draadjrbmk() { // from class: igdgnonuha.l1
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj5) {
                                return o1.ojitshcjhn(iWflxmlrfwp, iAgtfadlqog3, kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVarSflfametgt4, kcexrzcfytVar3, kcexrzcfytVarSflfametgt5, kcexrzcfytVarSflfametgt6, this, draadjrbmkVar, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj5);
                            }
                        }, 4, null);
                    }
                }
                y0.ppxfxbqfkf.gxszxtbevo("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        y0.ppxfxbqfkf.gxszxtbevo("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // x.zynmafqrjb
    public int zoijcleaow(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        return draadjrbmk(wflxmlrfwpVar, list, i13, new tg.rgvfuqvkyq() { // from class: igdgnonuha.k1
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(o1.agtfadlqog((x.draadjrbmk) obj, ((Integer) obj2).intValue()));
            }
        });
    }
}

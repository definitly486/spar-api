package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float[] f22397eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float f22398gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f22399iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final float f22400lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f22401ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float[] f22402wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f22403zoijcleaow;

    private lqeggnwhkg(gxszxtbevo gxszxtbevoVar, List list, List list2) {
        this.f22399iobyxmoadg = gxszxtbevoVar;
        this.f22403zoijcleaow = Collections.unmodifiableList(list);
        this.f22401ppxfxbqfkf = Collections.unmodifiableList(list2);
        float f13 = ((gxszxtbevo) list.get(list.size() - 1)).ppxfxbqfkf().f22374iobyxmoadg - gxszxtbevoVar.ppxfxbqfkf().f22374iobyxmoadg;
        this.f22398gxszxtbevo = f13;
        float f14 = gxszxtbevoVar.btonecajqb().f22374iobyxmoadg - ((gxszxtbevo) list2.get(list2.size() - 1)).btonecajqb().f22374iobyxmoadg;
        this.f22400lqeggnwhkg = f14;
        this.f22402wkgbmnqykc = wflxmlrfwp(f13, list, true);
        this.f22397eablkybsjg = wflxmlrfwp(f14, list2, false);
    }

    private static List agtfadlqog(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar, float f13, float f14) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(gxszxtbevoVar);
        int iEablkybsjg = eablkybsjg(gxszxtbevoVar);
        float fEablkybsjg = zoijcleaowVar.wkgbmnqykc() ? zoijcleaowVar.eablkybsjg() : zoijcleaowVar.gxszxtbevo();
        if (oxmwwwfdhm(zoijcleaowVar, gxszxtbevoVar) || iEablkybsjg == -1) {
            if (f14 > 0.0f) {
                arrayList.add(yggfygwlhe(gxszxtbevoVar, f14, fEablkybsjg, false, f13));
            }
            return arrayList;
        }
        int iDxjokdxxww = iEablkybsjg - gxszxtbevoVar.dxjokdxxww();
        float f15 = gxszxtbevoVar.ppxfxbqfkf().f22379zoijcleaow - (gxszxtbevoVar.ppxfxbqfkf().f22378wkgbmnqykc / 2.0f);
        if (iDxjokdxxww <= 0 && gxszxtbevoVar.nufgyqmvbu().f22373gxszxtbevo > 0.0f) {
            arrayList.add(jyumaefscl(gxszxtbevoVar, f15 - gxszxtbevoVar.nufgyqmvbu().f22373gxszxtbevo, fEablkybsjg));
            return arrayList;
        }
        float f16 = 0.0f;
        int i13 = 0;
        while (i13 < iDxjokdxxww) {
            gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) arrayList.get(arrayList.size() - 1);
            int i14 = iEablkybsjg - i13;
            float f17 = f16 + ((gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar.lqeggnwhkg().get(i14)).f22373gxszxtbevo;
            int i15 = i14 + 1;
            int i16 = i13;
            gxszxtbevo gxszxtbevoVarZdlpuopuiu = zdlpuopuiu(gxszxtbevoVar2, iEablkybsjg, i15 < gxszxtbevoVar.lqeggnwhkg().size() ? wkgbmnqykc(gxszxtbevoVar2, ((gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar.lqeggnwhkg().get(i15)).f22377ppxfxbqfkf) + 1 : 0, f15 - f17, gxszxtbevoVar.zoijcleaow() + i13 + 1, gxszxtbevoVar.dxjokdxxww() + i13 + 1, fEablkybsjg);
            if (i16 == iDxjokdxxww - 1 && f14 > 0.0f) {
                gxszxtbevoVarZdlpuopuiu = yggfygwlhe(gxszxtbevoVarZdlpuopuiu, f14, fEablkybsjg, false, f13);
            }
            arrayList.add(gxszxtbevoVarZdlpuopuiu);
            i13 = i16 + 1;
            f16 = f17;
        }
        return arrayList;
    }

    private static int eablkybsjg(gxszxtbevo gxszxtbevoVar) {
        for (int size = gxszxtbevoVar.lqeggnwhkg().size() - 1; size >= 0; size--) {
            if (!((gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar.lqeggnwhkg().get(size)).f22372eablkybsjg) {
                return size;
            }
        }
        return -1;
    }

    static lqeggnwhkg gxszxtbevo(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar, float f13, float f14, float f15) {
        return new lqeggnwhkg(gxszxtbevoVar, rgvfuqvkyq(zoijcleaowVar, gxszxtbevoVar, f13, f14), agtfadlqog(zoijcleaowVar, gxszxtbevoVar, f13, f15));
    }

    private gxszxtbevo iobyxmoadg(List list, float f13, float[] fArr) {
        float[] fArrOjitshcjhn = ojitshcjhn(list, f13, fArr);
        return fArrOjitshcjhn[0] >= 0.5f ? (gxszxtbevo) list.get((int) fArrOjitshcjhn[2]) : (gxszxtbevo) list.get((int) fArrOjitshcjhn[1]);
    }

    private static gxszxtbevo jyumaefscl(gxszxtbevo gxszxtbevoVar, float f13, float f14) {
        return zdlpuopuiu(gxszxtbevoVar, 0, 0, f13, gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.dxjokdxxww(), f14);
    }

    private static gxszxtbevo kcexrzcfyt(List list, float f13, float[] fArr) {
        float[] fArrOjitshcjhn = ojitshcjhn(list, f13, fArr);
        return gxszxtbevo.wflxmlrfwp((gxszxtbevo) list.get((int) fArrOjitshcjhn[1]), (gxszxtbevo) list.get((int) fArrOjitshcjhn[2]), fArrOjitshcjhn[0]);
    }

    private static float[] ojitshcjhn(List list, float f13, float[] fArr) {
        int size = list.size();
        float f14 = fArr[0];
        int i13 = 1;
        while (i13 < size) {
            float f15 = fArr[i13];
            if (f13 <= f15) {
                return new float[]{ea.iobyxmoadg.zoijcleaow(0.0f, 1.0f, f14, f15, f13), i13 - 1, i13};
            }
            i13++;
            f14 = f15;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static boolean oxmwwwfdhm(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        int iGxszxtbevo = zoijcleaowVar.gxszxtbevo();
        if (zoijcleaowVar.wkgbmnqykc()) {
            iGxszxtbevo = zoijcleaowVar.eablkybsjg();
        }
        return gxszxtbevoVar.nufgyqmvbu().f22379zoijcleaow + (gxszxtbevoVar.nufgyqmvbu().f22378wkgbmnqykc / 2.0f) <= ((float) iGxszxtbevo) && gxszxtbevoVar.nufgyqmvbu() == gxszxtbevoVar.gtknphoqwx();
    }

    private static int ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        for (int i13 = 0; i13 < gxszxtbevoVar.lqeggnwhkg().size(); i13++) {
            if (!((gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar.lqeggnwhkg().get(i13)).f22372eablkybsjg) {
                return i13;
            }
        }
        return -1;
    }

    private static List rgvfuqvkyq(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar, float f13, float f14) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(gxszxtbevoVar);
        int iPpxfxbqfkf = ppxfxbqfkf(gxszxtbevoVar);
        float fEablkybsjg = zoijcleaowVar.wkgbmnqykc() ? zoijcleaowVar.eablkybsjg() : zoijcleaowVar.gxszxtbevo();
        int i13 = 1;
        if (vdvldrhtss(gxszxtbevoVar) || iPpxfxbqfkf == -1) {
            if (f14 > 0.0f) {
                arrayList.add(yggfygwlhe(gxszxtbevoVar, f14, fEablkybsjg, true, f13));
            }
            return arrayList;
        }
        int iZoijcleaow = gxszxtbevoVar.zoijcleaow() - iPpxfxbqfkf;
        float f15 = gxszxtbevoVar.ppxfxbqfkf().f22379zoijcleaow - (gxszxtbevoVar.ppxfxbqfkf().f22378wkgbmnqykc / 2.0f);
        if (iZoijcleaow <= 0 && gxszxtbevoVar.iobyxmoadg().f22373gxszxtbevo > 0.0f) {
            arrayList.add(jyumaefscl(gxszxtbevoVar, f15 + gxszxtbevoVar.iobyxmoadg().f22373gxszxtbevo, fEablkybsjg));
            return arrayList;
        }
        int i14 = 0;
        float f16 = 0.0f;
        while (i14 < iZoijcleaow) {
            gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) arrayList.get(arrayList.size() - i13);
            int i15 = iPpxfxbqfkf + i14;
            int size = gxszxtbevoVar.lqeggnwhkg().size() - i13;
            float f17 = f16 + ((gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar.lqeggnwhkg().get(i15)).f22373gxszxtbevo;
            int i16 = i15 - i13;
            int iZoijcleaow2 = i16 >= 0 ? zoijcleaow(gxszxtbevoVar2, ((gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar.lqeggnwhkg().get(i16)).f22377ppxfxbqfkf) - i13 : size;
            int i17 = i14;
            gxszxtbevo gxszxtbevoVarZdlpuopuiu = zdlpuopuiu(gxszxtbevoVar2, iPpxfxbqfkf, iZoijcleaow2, f15 + f17, (gxszxtbevoVar.zoijcleaow() - i14) - 1, (gxszxtbevoVar.dxjokdxxww() - i14) - 1, fEablkybsjg);
            if (i17 == iZoijcleaow - 1 && f14 > 0.0f) {
                gxszxtbevoVarZdlpuopuiu = yggfygwlhe(gxszxtbevoVarZdlpuopuiu, f14, fEablkybsjg, true, f13);
            }
            arrayList.add(gxszxtbevoVarZdlpuopuiu);
            i14 = i17 + 1;
            f16 = f17;
            i13 = 1;
        }
        return arrayList;
    }

    private static boolean vdvldrhtss(gxszxtbevo gxszxtbevoVar) {
        return gxszxtbevoVar.iobyxmoadg().f22379zoijcleaow - (gxszxtbevoVar.iobyxmoadg().f22378wkgbmnqykc / 2.0f) >= 0.0f && gxszxtbevoVar.iobyxmoadg() == gxszxtbevoVar.wkgbmnqykc();
    }

    private static float[] wflxmlrfwp(float f13, List list, boolean z13) {
        int size = list.size();
        float[] fArr = new float[size];
        int i13 = 1;
        while (i13 < size) {
            int i14 = i13 - 1;
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) list.get(i14);
            gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) list.get(i13);
            fArr[i13] = i13 == size + (-1) ? 1.0f : fArr[i14] + ((z13 ? gxszxtbevoVar2.ppxfxbqfkf().f22374iobyxmoadg - gxszxtbevoVar.ppxfxbqfkf().f22374iobyxmoadg : gxszxtbevoVar.btonecajqb().f22374iobyxmoadg - gxszxtbevoVar2.btonecajqb().f22374iobyxmoadg) / f13);
            i13++;
        }
        return fArr;
    }

    private static int wkgbmnqykc(gxszxtbevo gxszxtbevoVar, float f13) {
        for (int iZoijcleaow = gxszxtbevoVar.zoijcleaow() - 1; iZoijcleaow >= 0; iZoijcleaow--) {
            if (f13 == ((gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar.lqeggnwhkg().get(iZoijcleaow)).f22377ppxfxbqfkf) {
                return iZoijcleaow;
            }
        }
        return 0;
    }

    private static gxszxtbevo yggfygwlhe(gxszxtbevo gxszxtbevoVar, float f13, float f14, boolean z13, float f15) {
        ArrayList arrayList = new ArrayList(gxszxtbevoVar.lqeggnwhkg());
        gxszxtbevo.zoijcleaow zoijcleaowVar = new gxszxtbevo.zoijcleaow(gxszxtbevoVar.gxszxtbevo(), f14);
        float fDraadjrbmk = f13 / gxszxtbevoVar.draadjrbmk();
        float f16 = z13 ? f13 : 0.0f;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) arrayList.get(i13);
            if (ppxfxbqfkfVar.f22372eablkybsjg) {
                zoijcleaowVar.eablkybsjg(ppxfxbqfkfVar.f22379zoijcleaow, ppxfxbqfkfVar.f22377ppxfxbqfkf, ppxfxbqfkfVar.f22378wkgbmnqykc, false, true, ppxfxbqfkfVar.f22373gxszxtbevo);
            } else {
                boolean z14 = i13 >= gxszxtbevoVar.zoijcleaow() && i13 <= gxszxtbevoVar.dxjokdxxww();
                float f17 = ppxfxbqfkfVar.f22378wkgbmnqykc - fDraadjrbmk;
                float fZoijcleaow = wkgbmnqykc.zoijcleaow(f17, gxszxtbevoVar.gxszxtbevo(), f15);
                float f18 = (f17 / 2.0f) + f16;
                float f19 = f18 - ppxfxbqfkfVar.f22379zoijcleaow;
                zoijcleaowVar.gxszxtbevo(f18, fZoijcleaow, f17, z14, false, ppxfxbqfkfVar.f22373gxszxtbevo, z13 ? f19 : 0.0f, z13 ? 0.0f : f19);
                f16 += f17;
            }
            i13++;
        }
        return zoijcleaowVar.dxjokdxxww();
    }

    private static gxszxtbevo zdlpuopuiu(gxszxtbevo gxszxtbevoVar, int i13, int i14, float f13, int i15, int i16, float f14) {
        ArrayList arrayList = new ArrayList(gxszxtbevoVar.lqeggnwhkg());
        arrayList.add(i14, (gxszxtbevo.ppxfxbqfkf) arrayList.remove(i13));
        gxszxtbevo.zoijcleaow zoijcleaowVar = new gxszxtbevo.zoijcleaow(gxszxtbevoVar.gxszxtbevo(), f14);
        int i17 = 0;
        while (i17 < arrayList.size()) {
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) arrayList.get(i17);
            float f15 = ppxfxbqfkfVar.f22378wkgbmnqykc;
            zoijcleaowVar.eablkybsjg(f13 + (f15 / 2.0f), ppxfxbqfkfVar.f22377ppxfxbqfkf, f15, i17 >= i15 && i17 <= i16, ppxfxbqfkfVar.f22372eablkybsjg, ppxfxbqfkfVar.f22373gxszxtbevo);
            f13 += ppxfxbqfkfVar.f22378wkgbmnqykc;
            i17++;
        }
        return zoijcleaowVar.dxjokdxxww();
    }

    private static int zoijcleaow(gxszxtbevo gxszxtbevoVar, float f13) {
        for (int iDxjokdxxww = gxszxtbevoVar.dxjokdxxww(); iDxjokdxxww < gxszxtbevoVar.lqeggnwhkg().size(); iDxjokdxxww++) {
            if (f13 == ((gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar.lqeggnwhkg().get(iDxjokdxxww)).f22377ppxfxbqfkf) {
                return iDxjokdxxww;
            }
        }
        return gxszxtbevoVar.lqeggnwhkg().size() - 1;
    }

    public gxszxtbevo btonecajqb(float f13, float f14, float f15) {
        return gtknphoqwx(f13, f14, f15, false);
    }

    gxszxtbevo draadjrbmk() {
        List list = this.f22403zoijcleaow;
        return (gxszxtbevo) list.get(list.size() - 1);
    }

    Map dxjokdxxww(int i13, int i14, int i15, boolean z13) {
        float fGxszxtbevo = this.f22399iobyxmoadg.gxszxtbevo();
        HashMap map = new HashMap();
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i16 >= i13) {
                break;
            }
            int i18 = z13 ? (i13 - i16) - 1 : i16;
            if (i18 * fGxszxtbevo * (z13 ? -1 : 1) > i15 - this.f22400lqeggnwhkg || i16 >= i13 - this.f22401ppxfxbqfkf.size()) {
                Integer numValueOf = Integer.valueOf(i18);
                List list = this.f22401ppxfxbqfkf;
                map.put(numValueOf, (gxszxtbevo) list.get(o1.iobyxmoadg.zoijcleaow(i17, 0, list.size() - 1)));
                i17++;
            }
            i16++;
        }
        int i19 = 0;
        for (int i23 = i13 - 1; i23 >= 0; i23--) {
            int i24 = z13 ? (i13 - i23) - 1 : i23;
            if (i24 * fGxszxtbevo * (z13 ? -1 : 1) < i14 + this.f22398gxszxtbevo || i23 < this.f22403zoijcleaow.size()) {
                Integer numValueOf2 = Integer.valueOf(i24);
                List list2 = this.f22403zoijcleaow;
                map.put(numValueOf2, (gxszxtbevo) list2.get(o1.iobyxmoadg.zoijcleaow(i19, 0, list2.size() - 1)));
                i19++;
            }
        }
        return map;
    }

    gxszxtbevo gtknphoqwx(float f13, float f14, float f15, boolean z13) {
        float fZoijcleaow;
        List list;
        float[] fArr;
        float f16 = this.f22398gxszxtbevo + f14;
        float f17 = f15 - this.f22400lqeggnwhkg;
        float f18 = draadjrbmk().iobyxmoadg().f22375lqeggnwhkg;
        float f19 = nufgyqmvbu().nufgyqmvbu().f22376nufgyqmvbu;
        if (this.f22398gxszxtbevo == f18) {
            f16 += f18;
        }
        if (this.f22400lqeggnwhkg == f19) {
            f17 -= f19;
        }
        if (f13 < f16) {
            fZoijcleaow = ea.iobyxmoadg.zoijcleaow(1.0f, 0.0f, f14, f16, f13);
            list = this.f22403zoijcleaow;
            fArr = this.f22402wkgbmnqykc;
        } else {
            if (f13 <= f17) {
                return this.f22399iobyxmoadg;
            }
            fZoijcleaow = ea.iobyxmoadg.zoijcleaow(0.0f, 1.0f, f17, f15, f13);
            list = this.f22401ppxfxbqfkf;
            fArr = this.f22397eablkybsjg;
        }
        return z13 ? iobyxmoadg(list, fZoijcleaow, fArr) : kcexrzcfyt(list, fZoijcleaow, fArr);
    }

    gxszxtbevo lqeggnwhkg() {
        return this.f22399iobyxmoadg;
    }

    gxszxtbevo nufgyqmvbu() {
        List list = this.f22401ppxfxbqfkf;
        return (gxszxtbevo) list.get(list.size() - 1);
    }
}

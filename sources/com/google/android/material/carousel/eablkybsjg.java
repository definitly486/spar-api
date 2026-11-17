package com.google.android.material.carousel;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg {
    static float btonecajqb(float f13, float f14, float f15, int i13) {
        return i13 > 0 ? f14 + (f15 / 2.0f) : f13;
    }

    static int dxjokdxxww(int[] iArr) {
        int i13 = Integer.MIN_VALUE;
        for (int i14 : iArr) {
            if (i14 > i13) {
                i13 = i14;
            }
        }
        return i13;
    }

    static gxszxtbevo eablkybsjg(Context context, float f13, float f14, iobyxmoadg iobyxmoadgVar) {
        float fMin = Math.min(gxszxtbevo(context) + f13, iobyxmoadgVar.f22390gxszxtbevo);
        float f15 = fMin / 2.0f;
        float f16 = 0.0f - f15;
        float fZoijcleaow = zoijcleaow(0.0f, iobyxmoadgVar.f22390gxszxtbevo, iobyxmoadgVar.f22392lqeggnwhkg);
        float fBtonecajqb = btonecajqb(0.0f, iobyxmoadg(fZoijcleaow, iobyxmoadgVar.f22390gxszxtbevo, iobyxmoadgVar.f22392lqeggnwhkg), iobyxmoadgVar.f22390gxszxtbevo, iobyxmoadgVar.f22392lqeggnwhkg);
        float fZoijcleaow2 = zoijcleaow(fBtonecajqb, iobyxmoadgVar.f22389eablkybsjg, iobyxmoadgVar.f22395wkgbmnqykc);
        float fZoijcleaow3 = zoijcleaow(btonecajqb(fBtonecajqb, fZoijcleaow2, iobyxmoadgVar.f22389eablkybsjg, iobyxmoadgVar.f22395wkgbmnqykc), iobyxmoadgVar.f22396zoijcleaow, iobyxmoadgVar.f22394ppxfxbqfkf);
        float f17 = f15 + f14;
        float fZoijcleaow4 = wkgbmnqykc.zoijcleaow(fMin, iobyxmoadgVar.f22390gxszxtbevo, f13);
        float fZoijcleaow5 = wkgbmnqykc.zoijcleaow(iobyxmoadgVar.f22396zoijcleaow, iobyxmoadgVar.f22390gxszxtbevo, f13);
        float fZoijcleaow6 = wkgbmnqykc.zoijcleaow(iobyxmoadgVar.f22389eablkybsjg, iobyxmoadgVar.f22390gxszxtbevo, f13);
        gxszxtbevo.zoijcleaow zoijcleaowVarNufgyqmvbu = new gxszxtbevo.zoijcleaow(iobyxmoadgVar.f22390gxszxtbevo, f14).iobyxmoadg(f16, fZoijcleaow4, fMin).nufgyqmvbu(fZoijcleaow, 0.0f, iobyxmoadgVar.f22390gxszxtbevo, iobyxmoadgVar.f22392lqeggnwhkg, true);
        if (iobyxmoadgVar.f22395wkgbmnqykc > 0) {
            zoijcleaowVarNufgyqmvbu.zoijcleaow(fZoijcleaow2, fZoijcleaow6, iobyxmoadgVar.f22389eablkybsjg);
        }
        int i13 = iobyxmoadgVar.f22394ppxfxbqfkf;
        if (i13 > 0) {
            zoijcleaowVarNufgyqmvbu.lqeggnwhkg(fZoijcleaow3, fZoijcleaow5, iobyxmoadgVar.f22396zoijcleaow, i13);
        }
        zoijcleaowVarNufgyqmvbu.iobyxmoadg(f17, fZoijcleaow4, fMin);
        return zoijcleaowVarNufgyqmvbu.dxjokdxxww();
    }

    static float gxszxtbevo(Context context) {
        return context.getResources().getDimension(da.wkgbmnqykc.m3_carousel_gone_size);
    }

    static float iobyxmoadg(float f13, float f14, int i13) {
        return f13 + (Math.max(0, i13 - 1) * f14);
    }

    static float lqeggnwhkg(Context context) {
        return context.getResources().getDimension(da.wkgbmnqykc.m3_carousel_small_item_size_max);
    }

    static float nufgyqmvbu(Context context) {
        return context.getResources().getDimension(da.wkgbmnqykc.m3_carousel_small_item_size_min);
    }

    static gxszxtbevo ppxfxbqfkf(Context context, float f13, float f14, iobyxmoadg iobyxmoadgVar) {
        float f15;
        float fMin = Math.min(gxszxtbevo(context) + f13, iobyxmoadgVar.f22390gxszxtbevo);
        float f16 = fMin / 2.0f;
        float f17 = 0.0f - f16;
        float fZoijcleaow = zoijcleaow(0.0f, iobyxmoadgVar.f22396zoijcleaow, iobyxmoadgVar.f22394ppxfxbqfkf);
        float fBtonecajqb = btonecajqb(0.0f, iobyxmoadg(fZoijcleaow, iobyxmoadgVar.f22396zoijcleaow, (int) Math.floor(iobyxmoadgVar.f22394ppxfxbqfkf / 2.0f)), iobyxmoadgVar.f22396zoijcleaow, iobyxmoadgVar.f22394ppxfxbqfkf);
        float fZoijcleaow2 = zoijcleaow(fBtonecajqb, iobyxmoadgVar.f22389eablkybsjg, iobyxmoadgVar.f22395wkgbmnqykc);
        float fBtonecajqb2 = btonecajqb(fBtonecajqb, iobyxmoadg(fZoijcleaow2, iobyxmoadgVar.f22389eablkybsjg, (int) Math.floor(iobyxmoadgVar.f22395wkgbmnqykc / 2.0f)), iobyxmoadgVar.f22389eablkybsjg, iobyxmoadgVar.f22395wkgbmnqykc);
        float fZoijcleaow3 = zoijcleaow(fBtonecajqb2, iobyxmoadgVar.f22390gxszxtbevo, iobyxmoadgVar.f22392lqeggnwhkg);
        float fBtonecajqb3 = btonecajqb(fBtonecajqb2, iobyxmoadg(fZoijcleaow3, iobyxmoadgVar.f22390gxszxtbevo, iobyxmoadgVar.f22392lqeggnwhkg), iobyxmoadgVar.f22390gxszxtbevo, iobyxmoadgVar.f22392lqeggnwhkg);
        float fZoijcleaow4 = zoijcleaow(fBtonecajqb3, iobyxmoadgVar.f22389eablkybsjg, iobyxmoadgVar.f22395wkgbmnqykc);
        float fZoijcleaow5 = zoijcleaow(btonecajqb(fBtonecajqb3, iobyxmoadg(fZoijcleaow4, iobyxmoadgVar.f22389eablkybsjg, (int) Math.ceil(iobyxmoadgVar.f22395wkgbmnqykc / 2.0f)), iobyxmoadgVar.f22389eablkybsjg, iobyxmoadgVar.f22395wkgbmnqykc), iobyxmoadgVar.f22396zoijcleaow, iobyxmoadgVar.f22394ppxfxbqfkf);
        float f18 = f16 + f14;
        float fZoijcleaow6 = wkgbmnqykc.zoijcleaow(fMin, iobyxmoadgVar.f22390gxszxtbevo, f13);
        float fZoijcleaow7 = wkgbmnqykc.zoijcleaow(iobyxmoadgVar.f22396zoijcleaow, iobyxmoadgVar.f22390gxszxtbevo, f13);
        float fZoijcleaow8 = wkgbmnqykc.zoijcleaow(iobyxmoadgVar.f22389eablkybsjg, iobyxmoadgVar.f22390gxszxtbevo, f13);
        gxszxtbevo.zoijcleaow zoijcleaowVarIobyxmoadg = new gxszxtbevo.zoijcleaow(iobyxmoadgVar.f22390gxszxtbevo, f14).iobyxmoadg(f17, fZoijcleaow6, fMin);
        int i13 = iobyxmoadgVar.f22394ppxfxbqfkf;
        if (i13 > 0) {
            zoijcleaowVarIobyxmoadg.lqeggnwhkg(fZoijcleaow, fZoijcleaow7, iobyxmoadgVar.f22396zoijcleaow, (int) Math.floor(i13 / 2.0f));
        }
        int i14 = iobyxmoadgVar.f22395wkgbmnqykc;
        if (i14 > 0) {
            zoijcleaowVarIobyxmoadg.lqeggnwhkg(fZoijcleaow2, fZoijcleaow8, iobyxmoadgVar.f22389eablkybsjg, (int) Math.floor(i14 / 2.0f));
        }
        zoijcleaowVarIobyxmoadg.nufgyqmvbu(fZoijcleaow3, 0.0f, iobyxmoadgVar.f22390gxszxtbevo, iobyxmoadgVar.f22392lqeggnwhkg, true);
        int i15 = iobyxmoadgVar.f22395wkgbmnqykc;
        if (i15 > 0) {
            f15 = 2.0f;
            zoijcleaowVarIobyxmoadg.lqeggnwhkg(fZoijcleaow4, fZoijcleaow8, iobyxmoadgVar.f22389eablkybsjg, (int) Math.ceil(i15 / 2.0f));
        } else {
            f15 = 2.0f;
        }
        int i16 = iobyxmoadgVar.f22394ppxfxbqfkf;
        if (i16 > 0) {
            zoijcleaowVarIobyxmoadg.lqeggnwhkg(fZoijcleaow5, fZoijcleaow7, iobyxmoadgVar.f22396zoijcleaow, (int) Math.ceil(i16 / f15));
        }
        zoijcleaowVarIobyxmoadg.iobyxmoadg(f18, fZoijcleaow6, fMin);
        return zoijcleaowVarIobyxmoadg.dxjokdxxww();
    }

    static gxszxtbevo wkgbmnqykc(Context context, float f13, float f14, iobyxmoadg iobyxmoadgVar, int i13) {
        return i13 == 1 ? ppxfxbqfkf(context, f13, f14, iobyxmoadgVar) : eablkybsjg(context, f13, f14, iobyxmoadgVar);
    }

    static float zoijcleaow(float f13, float f14, int i13) {
        return i13 > 0 ? f13 + (f14 / 2.0f) : f13;
    }
}

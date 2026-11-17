package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f22368iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f22369ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f22370wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f22371zoijcleaow;

    static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final boolean f22372eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final float f22373gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final float f22374iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        final float f22375lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        final float f22376nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final float f22377ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final float f22378wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final float f22379zoijcleaow;

        ppxfxbqfkf(float f13, float f14, float f15, float f16) {
            this(f13, f14, f15, f16, false, 0.0f, 0.0f, 0.0f);
        }

        static ppxfxbqfkf iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, float f13) {
            return new ppxfxbqfkf(ea.iobyxmoadg.iobyxmoadg(ppxfxbqfkfVar.f22374iobyxmoadg, ppxfxbqfkfVar2.f22374iobyxmoadg, f13), ea.iobyxmoadg.iobyxmoadg(ppxfxbqfkfVar.f22379zoijcleaow, ppxfxbqfkfVar2.f22379zoijcleaow, f13), ea.iobyxmoadg.iobyxmoadg(ppxfxbqfkfVar.f22377ppxfxbqfkf, ppxfxbqfkfVar2.f22377ppxfxbqfkf, f13), ea.iobyxmoadg.iobyxmoadg(ppxfxbqfkfVar.f22378wkgbmnqykc, ppxfxbqfkfVar2.f22378wkgbmnqykc, f13));
        }

        ppxfxbqfkf(float f13, float f14, float f15, float f16, boolean z13, float f17, float f18, float f19) {
            this.f22374iobyxmoadg = f13;
            this.f22379zoijcleaow = f14;
            this.f22377ppxfxbqfkf = f15;
            this.f22378wkgbmnqykc = f16;
            this.f22372eablkybsjg = z13;
            this.f22373gxszxtbevo = f17;
            this.f22375lqeggnwhkg = f18;
            this.f22376nufgyqmvbu = f19;
        }
    }

    static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private ppxfxbqfkf f22381eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f22383iobyxmoadg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private ppxfxbqfkf f22387wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final float f22388zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f22386ppxfxbqfkf = new ArrayList();

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f22382gxszxtbevo = -1;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f22384lqeggnwhkg = -1;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private float f22385nufgyqmvbu = 0.0f;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f22380dxjokdxxww = -1;

        zoijcleaow(float f13, float f14) {
            this.f22383iobyxmoadg = f13;
            this.f22388zoijcleaow = f14;
        }

        private static float btonecajqb(float f13, float f14, int i13, int i14) {
            return (f13 - (i13 * f14)) + (i14 * f14);
        }

        gxszxtbevo dxjokdxxww() {
            if (this.f22387wkgbmnqykc == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < this.f22386ppxfxbqfkf.size(); i13++) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f22386ppxfxbqfkf.get(i13);
                arrayList.add(new ppxfxbqfkf(btonecajqb(this.f22387wkgbmnqykc.f22379zoijcleaow, this.f22383iobyxmoadg, this.f22382gxszxtbevo, i13), ppxfxbqfkfVar.f22379zoijcleaow, ppxfxbqfkfVar.f22377ppxfxbqfkf, ppxfxbqfkfVar.f22378wkgbmnqykc, ppxfxbqfkfVar.f22372eablkybsjg, ppxfxbqfkfVar.f22373gxszxtbevo, ppxfxbqfkfVar.f22375lqeggnwhkg, ppxfxbqfkfVar.f22376nufgyqmvbu));
            }
            return new gxszxtbevo(this.f22383iobyxmoadg, arrayList, this.f22382gxszxtbevo, this.f22384lqeggnwhkg);
        }

        zoijcleaow eablkybsjg(float f13, float f14, float f15, boolean z13, boolean z14, float f16) {
            return gxszxtbevo(f13, f14, f15, z13, z14, f16, 0.0f, 0.0f);
        }

        zoijcleaow gxszxtbevo(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17, float f18) {
            if (f15 <= 0.0f) {
                return this;
            }
            if (z14) {
                if (z13) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i13 = this.f22380dxjokdxxww;
                if (i13 != -1 && i13 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f22380dxjokdxxww = this.f22386ppxfxbqfkf.size();
            }
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(Float.MIN_VALUE, f13, f14, f15, z14, f16, f17, f18);
            if (z13) {
                if (this.f22387wkgbmnqykc == null) {
                    this.f22387wkgbmnqykc = ppxfxbqfkfVar;
                    this.f22382gxszxtbevo = this.f22386ppxfxbqfkf.size();
                }
                if (this.f22384lqeggnwhkg != -1 && this.f22386ppxfxbqfkf.size() - this.f22384lqeggnwhkg > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f15 != this.f22387wkgbmnqykc.f22378wkgbmnqykc) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f22381eablkybsjg = ppxfxbqfkfVar;
                this.f22384lqeggnwhkg = this.f22386ppxfxbqfkf.size();
            } else {
                if (this.f22387wkgbmnqykc == null && ppxfxbqfkfVar.f22378wkgbmnqykc < this.f22385nufgyqmvbu) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f22381eablkybsjg != null && ppxfxbqfkfVar.f22378wkgbmnqykc > this.f22385nufgyqmvbu) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f22385nufgyqmvbu = ppxfxbqfkfVar.f22378wkgbmnqykc;
            this.f22386ppxfxbqfkf.add(ppxfxbqfkfVar);
            return this;
        }

        zoijcleaow iobyxmoadg(float f13, float f14, float f15) {
            return wkgbmnqykc(f13, f14, f15, false, true);
        }

        zoijcleaow lqeggnwhkg(float f13, float f14, float f15, int i13) {
            return nufgyqmvbu(f13, f14, f15, i13, false);
        }

        zoijcleaow nufgyqmvbu(float f13, float f14, float f15, int i13, boolean z13) {
            if (i13 > 0 && f15 > 0.0f) {
                for (int i14 = 0; i14 < i13; i14++) {
                    ppxfxbqfkf((i14 * f15) + f13, f14, f15, z13);
                }
            }
            return this;
        }

        zoijcleaow ppxfxbqfkf(float f13, float f14, float f15, boolean z13) {
            return wkgbmnqykc(f13, f14, f15, z13, false);
        }

        zoijcleaow wkgbmnqykc(float f13, float f14, float f15, boolean z13, boolean z14) {
            float fAbs;
            float f16 = f15 / 2.0f;
            float f17 = f13 - f16;
            float f18 = f16 + f13;
            float f19 = this.f22388zoijcleaow;
            if (f18 > f19) {
                fAbs = Math.abs(f18 - Math.max(f18 - f15, f19));
            } else {
                fAbs = 0.0f;
                if (f17 < 0.0f) {
                    fAbs = Math.abs(f17 - Math.min(f17 + f15, 0.0f));
                }
            }
            return eablkybsjg(f13, f14, f15, z13, z14, fAbs);
        }

        zoijcleaow zoijcleaow(float f13, float f14, float f15) {
            return ppxfxbqfkf(f13, f14, f15, false);
        }
    }

    static gxszxtbevo agtfadlqog(gxszxtbevo gxszxtbevoVar, float f13) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(gxszxtbevoVar.gxszxtbevo(), f13);
        float f14 = (f13 - gxszxtbevoVar.btonecajqb().f22379zoijcleaow) - (gxszxtbevoVar.btonecajqb().f22378wkgbmnqykc / 2.0f);
        int size = gxszxtbevoVar.lqeggnwhkg().size() - 1;
        while (size >= 0) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar.lqeggnwhkg().get(size);
            zoijcleaowVar.wkgbmnqykc(f14 + (ppxfxbqfkfVar.f22378wkgbmnqykc / 2.0f), ppxfxbqfkfVar.f22377ppxfxbqfkf, ppxfxbqfkfVar.f22378wkgbmnqykc, size >= gxszxtbevoVar.zoijcleaow() && size <= gxszxtbevoVar.dxjokdxxww(), ppxfxbqfkfVar.f22372eablkybsjg);
            f14 += ppxfxbqfkfVar.f22378wkgbmnqykc;
            size--;
        }
        return zoijcleaowVar.dxjokdxxww();
    }

    static gxszxtbevo wflxmlrfwp(gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2, float f13) {
        if (gxszxtbevoVar.gxszxtbevo() != gxszxtbevoVar2.gxszxtbevo()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg();
        List listLqeggnwhkg2 = gxszxtbevoVar2.lqeggnwhkg();
        if (listLqeggnwhkg.size() != listLqeggnwhkg2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < gxszxtbevoVar.lqeggnwhkg().size(); i13++) {
            arrayList.add(ppxfxbqfkf.iobyxmoadg((ppxfxbqfkf) listLqeggnwhkg.get(i13), (ppxfxbqfkf) listLqeggnwhkg2.get(i13), f13));
        }
        return new gxszxtbevo(gxszxtbevoVar.gxszxtbevo(), arrayList, ea.iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar2.zoijcleaow(), f13), ea.iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar.dxjokdxxww(), gxszxtbevoVar2.dxjokdxxww(), f13));
    }

    ppxfxbqfkf btonecajqb() {
        List list = this.f22371zoijcleaow;
        return (ppxfxbqfkf) list.get(list.size() - 1);
    }

    int draadjrbmk() {
        Iterator it = this.f22371zoijcleaow.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((ppxfxbqfkf) it.next()).f22372eablkybsjg) {
                i13++;
            }
        }
        return this.f22371zoijcleaow.size() - i13;
    }

    int dxjokdxxww() {
        return this.f22370wkgbmnqykc;
    }

    List eablkybsjg() {
        return this.f22371zoijcleaow.subList(this.f22369ppxfxbqfkf, this.f22370wkgbmnqykc + 1);
    }

    ppxfxbqfkf gtknphoqwx() {
        for (int size = this.f22371zoijcleaow.size() - 1; size >= 0; size--) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f22371zoijcleaow.get(size);
            if (!ppxfxbqfkfVar.f22372eablkybsjg) {
                return ppxfxbqfkfVar;
            }
        }
        return null;
    }

    float gxszxtbevo() {
        return this.f22368iobyxmoadg;
    }

    ppxfxbqfkf iobyxmoadg() {
        return (ppxfxbqfkf) this.f22371zoijcleaow.get(this.f22369ppxfxbqfkf);
    }

    List lqeggnwhkg() {
        return this.f22371zoijcleaow;
    }

    ppxfxbqfkf nufgyqmvbu() {
        return (ppxfxbqfkf) this.f22371zoijcleaow.get(this.f22370wkgbmnqykc);
    }

    ppxfxbqfkf ppxfxbqfkf() {
        return (ppxfxbqfkf) this.f22371zoijcleaow.get(0);
    }

    ppxfxbqfkf wkgbmnqykc() {
        for (int i13 = 0; i13 < this.f22371zoijcleaow.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f22371zoijcleaow.get(i13);
            if (!ppxfxbqfkfVar.f22372eablkybsjg) {
                return ppxfxbqfkfVar;
            }
        }
        return null;
    }

    int zoijcleaow() {
        return this.f22369ppxfxbqfkf;
    }

    private gxszxtbevo(float f13, List list, int i13, int i14) {
        this.f22368iobyxmoadg = f13;
        this.f22371zoijcleaow = Collections.unmodifiableList(list);
        this.f22369ppxfxbqfkf = i13;
        this.f22370wkgbmnqykc = i14;
    }
}

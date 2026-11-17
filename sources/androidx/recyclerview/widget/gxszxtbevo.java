package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private View f13002eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final zoijcleaow f13003iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f13005wkgbmnqykc = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final iobyxmoadg f13006zoijcleaow = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final List f13004ppxfxbqfkf = new ArrayList();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        long f13007iobyxmoadg = 0;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        iobyxmoadg f13008zoijcleaow;

        iobyxmoadg() {
        }

        private void ppxfxbqfkf() {
            if (this.f13008zoijcleaow == null) {
                this.f13008zoijcleaow = new iobyxmoadg();
            }
        }

        void eablkybsjg(int i13, boolean z13) {
            if (i13 >= 64) {
                ppxfxbqfkf();
                this.f13008zoijcleaow.eablkybsjg(i13 - 64, z13);
                return;
            }
            long j13 = this.f13007iobyxmoadg;
            boolean z14 = (Long.MIN_VALUE & j13) != 0;
            long j14 = (1 << i13) - 1;
            this.f13007iobyxmoadg = ((j13 & (~j14)) << 1) | (j13 & j14);
            if (z13) {
                nufgyqmvbu(i13);
            } else {
                iobyxmoadg(i13);
            }
            if (z14 || this.f13008zoijcleaow != null) {
                ppxfxbqfkf();
                this.f13008zoijcleaow.eablkybsjg(0, z14);
            }
        }

        boolean gxszxtbevo(int i13) {
            if (i13 >= 64) {
                ppxfxbqfkf();
                return this.f13008zoijcleaow.gxszxtbevo(i13 - 64);
            }
            long j13 = 1 << i13;
            long j14 = this.f13007iobyxmoadg;
            boolean z13 = (j14 & j13) != 0;
            long j15 = j14 & (~j13);
            this.f13007iobyxmoadg = j15;
            long j16 = j13 - 1;
            this.f13007iobyxmoadg = (j15 & j16) | Long.rotateRight((~j16) & j15, 1);
            iobyxmoadg iobyxmoadgVar = this.f13008zoijcleaow;
            if (iobyxmoadgVar != null) {
                if (iobyxmoadgVar.wkgbmnqykc(0)) {
                    nufgyqmvbu(63);
                }
                this.f13008zoijcleaow.gxszxtbevo(0);
            }
            return z13;
        }

        void iobyxmoadg(int i13) {
            if (i13 < 64) {
                this.f13007iobyxmoadg &= ~(1 << i13);
                return;
            }
            iobyxmoadg iobyxmoadgVar = this.f13008zoijcleaow;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.iobyxmoadg(i13 - 64);
            }
        }

        void lqeggnwhkg() {
            this.f13007iobyxmoadg = 0L;
            iobyxmoadg iobyxmoadgVar = this.f13008zoijcleaow;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.lqeggnwhkg();
            }
        }

        void nufgyqmvbu(int i13) {
            if (i13 < 64) {
                this.f13007iobyxmoadg |= 1 << i13;
            } else {
                ppxfxbqfkf();
                this.f13008zoijcleaow.nufgyqmvbu(i13 - 64);
            }
        }

        public String toString() {
            if (this.f13008zoijcleaow == null) {
                return Long.toBinaryString(this.f13007iobyxmoadg);
            }
            return this.f13008zoijcleaow.toString() + "xx" + Long.toBinaryString(this.f13007iobyxmoadg);
        }

        boolean wkgbmnqykc(int i13) {
            if (i13 < 64) {
                return (this.f13007iobyxmoadg & (1 << i13)) != 0;
            }
            ppxfxbqfkf();
            return this.f13008zoijcleaow.wkgbmnqykc(i13 - 64);
        }

        int zoijcleaow(int i13) {
            iobyxmoadg iobyxmoadgVar = this.f13008zoijcleaow;
            if (iobyxmoadgVar == null) {
                return i13 >= 64 ? Long.bitCount(this.f13007iobyxmoadg) : Long.bitCount(this.f13007iobyxmoadg & ((1 << i13) - 1));
            }
            return i13 < 64 ? Long.bitCount(this.f13007iobyxmoadg & ((1 << i13) - 1)) : iobyxmoadgVar.zoijcleaow(i13 - 64) + Long.bitCount(this.f13007iobyxmoadg);
        }
    }

    interface zoijcleaow {
        void btonecajqb(int i13);

        void dxjokdxxww(View view);

        void eablkybsjg(int i13);

        void gtknphoqwx(View view, int i13, ViewGroup.LayoutParams layoutParams);

        void gxszxtbevo(View view, int i13);

        View iobyxmoadg(int i13);

        void lqeggnwhkg();

        int nufgyqmvbu(View view);

        int ppxfxbqfkf();

        RecyclerView.iozdgvuglv wkgbmnqykc(View view);

        void zoijcleaow(View view);
    }

    gxszxtbevo(zoijcleaow zoijcleaowVar) {
        this.f13003iobyxmoadg = zoijcleaowVar;
    }

    private void draadjrbmk(View view) {
        this.f13004ppxfxbqfkf.add(view);
        this.f13003iobyxmoadg.zoijcleaow(view);
    }

    private int nufgyqmvbu(int i13) {
        if (i13 < 0) {
            return -1;
        }
        int iPpxfxbqfkf = this.f13003iobyxmoadg.ppxfxbqfkf();
        int i14 = i13;
        while (i14 < iPpxfxbqfkf) {
            int iZoijcleaow = i13 - (i14 - this.f13006zoijcleaow.zoijcleaow(i14));
            if (iZoijcleaow == 0) {
                while (this.f13006zoijcleaow.wkgbmnqykc(i14)) {
                    i14++;
                }
                return i14;
            }
            i14 += iZoijcleaow;
        }
        return -1;
    }

    private boolean zdlpuopuiu(View view) {
        if (!this.f13004ppxfxbqfkf.remove(view)) {
            return false;
        }
        this.f13003iobyxmoadg.dxjokdxxww(view);
        return true;
    }

    boolean agtfadlqog(View view) {
        return this.f13004ppxfxbqfkf.contains(view);
    }

    int btonecajqb() {
        return this.f13003iobyxmoadg.ppxfxbqfkf();
    }

    View dxjokdxxww(int i13) {
        return this.f13003iobyxmoadg.iobyxmoadg(i13);
    }

    View eablkybsjg(int i13) {
        int size = this.f13004ppxfxbqfkf.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f13004ppxfxbqfkf.get(i14);
            RecyclerView.iozdgvuglv iozdgvuglvVarWkgbmnqykc = this.f13003iobyxmoadg.wkgbmnqykc(view);
            if (iozdgvuglvVarWkgbmnqykc.getLayoutPosition() == i13 && !iozdgvuglvVarWkgbmnqykc.isInvalid() && !iozdgvuglvVarWkgbmnqykc.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    void gtknphoqwx(View view) {
        int iNufgyqmvbu = this.f13003iobyxmoadg.nufgyqmvbu(view);
        if (iNufgyqmvbu >= 0) {
            this.f13006zoijcleaow.nufgyqmvbu(iNufgyqmvbu);
            draadjrbmk(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    View gxszxtbevo(int i13) {
        return this.f13003iobyxmoadg.iobyxmoadg(nufgyqmvbu(i13));
    }

    void iobyxmoadg(View view, int i13, boolean z13) {
        int iPpxfxbqfkf = i13 < 0 ? this.f13003iobyxmoadg.ppxfxbqfkf() : nufgyqmvbu(i13);
        this.f13006zoijcleaow.eablkybsjg(iPpxfxbqfkf, z13);
        if (z13) {
            draadjrbmk(view);
        }
        this.f13003iobyxmoadg.gxszxtbevo(view, iPpxfxbqfkf);
    }

    void kcexrzcfyt(View view) {
        int iNufgyqmvbu = this.f13003iobyxmoadg.nufgyqmvbu(view);
        if (iNufgyqmvbu < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f13006zoijcleaow.wkgbmnqykc(iNufgyqmvbu)) {
            this.f13006zoijcleaow.iobyxmoadg(iNufgyqmvbu);
            zdlpuopuiu(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    int lqeggnwhkg() {
        return this.f13003iobyxmoadg.ppxfxbqfkf() - this.f13004ppxfxbqfkf.size();
    }

    void ojitshcjhn() {
        this.f13006zoijcleaow.lqeggnwhkg();
        for (int size = this.f13004ppxfxbqfkf.size() - 1; size >= 0; size--) {
            this.f13003iobyxmoadg.dxjokdxxww((View) this.f13004ppxfxbqfkf.get(size));
            this.f13004ppxfxbqfkf.remove(size);
        }
        this.f13003iobyxmoadg.lqeggnwhkg();
    }

    boolean oxmwwwfdhm(View view) {
        int i13 = this.f13005wkgbmnqykc;
        if (i13 == 1) {
            if (this.f13002eablkybsjg == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i13 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f13005wkgbmnqykc = 2;
            int iNufgyqmvbu = this.f13003iobyxmoadg.nufgyqmvbu(view);
            if (iNufgyqmvbu == -1) {
                zdlpuopuiu(view);
                return true;
            }
            if (!this.f13006zoijcleaow.wkgbmnqykc(iNufgyqmvbu)) {
                return false;
            }
            this.f13006zoijcleaow.gxszxtbevo(iNufgyqmvbu);
            zdlpuopuiu(view);
            this.f13003iobyxmoadg.btonecajqb(iNufgyqmvbu);
            return true;
        } finally {
            this.f13005wkgbmnqykc = 0;
        }
    }

    void ppxfxbqfkf(View view, int i13, ViewGroup.LayoutParams layoutParams, boolean z13) {
        int iPpxfxbqfkf = i13 < 0 ? this.f13003iobyxmoadg.ppxfxbqfkf() : nufgyqmvbu(i13);
        this.f13006zoijcleaow.eablkybsjg(iPpxfxbqfkf, z13);
        if (z13) {
            draadjrbmk(view);
        }
        this.f13003iobyxmoadg.gtknphoqwx(view, iPpxfxbqfkf, layoutParams);
    }

    void rgvfuqvkyq(View view) {
        int i13 = this.f13005wkgbmnqykc;
        if (i13 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i13 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f13005wkgbmnqykc = 1;
            this.f13002eablkybsjg = view;
            int iNufgyqmvbu = this.f13003iobyxmoadg.nufgyqmvbu(view);
            if (iNufgyqmvbu < 0) {
                return;
            }
            if (this.f13006zoijcleaow.gxszxtbevo(iNufgyqmvbu)) {
                zdlpuopuiu(view);
            }
            this.f13003iobyxmoadg.btonecajqb(iNufgyqmvbu);
        } finally {
            this.f13005wkgbmnqykc = 0;
            this.f13002eablkybsjg = null;
        }
    }

    public String toString() {
        return this.f13006zoijcleaow.toString() + ", hidden list:" + this.f13004ppxfxbqfkf.size();
    }

    void vdvldrhtss(int i13) {
        int i14 = this.f13005wkgbmnqykc;
        if (i14 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i14 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iNufgyqmvbu = nufgyqmvbu(i13);
            View viewIobyxmoadg = this.f13003iobyxmoadg.iobyxmoadg(iNufgyqmvbu);
            if (viewIobyxmoadg == null) {
                return;
            }
            this.f13005wkgbmnqykc = 1;
            this.f13002eablkybsjg = viewIobyxmoadg;
            if (this.f13006zoijcleaow.gxszxtbevo(iNufgyqmvbu)) {
                zdlpuopuiu(viewIobyxmoadg);
            }
            this.f13003iobyxmoadg.btonecajqb(iNufgyqmvbu);
        } finally {
            this.f13005wkgbmnqykc = 0;
            this.f13002eablkybsjg = null;
        }
    }

    int wflxmlrfwp(View view) {
        int iNufgyqmvbu = this.f13003iobyxmoadg.nufgyqmvbu(view);
        if (iNufgyqmvbu == -1 || this.f13006zoijcleaow.wkgbmnqykc(iNufgyqmvbu)) {
            return -1;
        }
        return iNufgyqmvbu - this.f13006zoijcleaow.zoijcleaow(iNufgyqmvbu);
    }

    void wkgbmnqykc(int i13) {
        int iNufgyqmvbu = nufgyqmvbu(i13);
        this.f13006zoijcleaow.gxszxtbevo(iNufgyqmvbu);
        this.f13003iobyxmoadg.eablkybsjg(iNufgyqmvbu);
    }

    void zoijcleaow(View view, boolean z13) {
        iobyxmoadg(view, -1, z13);
    }
}

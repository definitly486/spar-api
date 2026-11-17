package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class pmvmpeiblj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final zoijcleaow f13119iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    iobyxmoadg f13120zoijcleaow = new iobyxmoadg();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f13121eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f13122iobyxmoadg = 0;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f13123ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f13124wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f13125zoijcleaow;

        iobyxmoadg() {
        }

        void eablkybsjg(int i13, int i14, int i15, int i16) {
            this.f13125zoijcleaow = i13;
            this.f13123ppxfxbqfkf = i14;
            this.f13124wkgbmnqykc = i15;
            this.f13121eablkybsjg = i16;
        }

        void iobyxmoadg(int i13) {
            this.f13122iobyxmoadg = i13 | this.f13122iobyxmoadg;
        }

        int ppxfxbqfkf(int i13, int i14) {
            if (i13 > i14) {
                return 1;
            }
            return i13 == i14 ? 2 : 4;
        }

        void wkgbmnqykc() {
            this.f13122iobyxmoadg = 0;
        }

        boolean zoijcleaow() {
            int i13 = this.f13122iobyxmoadg;
            if ((i13 & 7) != 0 && (i13 & ppxfxbqfkf(this.f13124wkgbmnqykc, this.f13125zoijcleaow)) == 0) {
                return false;
            }
            int i14 = this.f13122iobyxmoadg;
            if ((i14 & 112) != 0 && (i14 & (ppxfxbqfkf(this.f13124wkgbmnqykc, this.f13123ppxfxbqfkf) << 4)) == 0) {
                return false;
            }
            int i15 = this.f13122iobyxmoadg;
            if ((i15 & 1792) != 0 && (i15 & (ppxfxbqfkf(this.f13121eablkybsjg, this.f13125zoijcleaow) << 8)) == 0) {
                return false;
            }
            int i16 = this.f13122iobyxmoadg;
            return (i16 & 28672) == 0 || (i16 & (ppxfxbqfkf(this.f13121eablkybsjg, this.f13123ppxfxbqfkf) << 12)) != 0;
        }
    }

    interface zoijcleaow {
        int eablkybsjg(View view);

        View iobyxmoadg(int i13);

        int ppxfxbqfkf();

        int wkgbmnqykc();

        int zoijcleaow(View view);
    }

    pmvmpeiblj(zoijcleaow zoijcleaowVar) {
        this.f13119iobyxmoadg = zoijcleaowVar;
    }

    View iobyxmoadg(int i13, int i14, int i15, int i16) {
        int iPpxfxbqfkf = this.f13119iobyxmoadg.ppxfxbqfkf();
        int iWkgbmnqykc = this.f13119iobyxmoadg.wkgbmnqykc();
        int i17 = i14 > i13 ? 1 : -1;
        View view = null;
        while (i13 != i14) {
            View viewIobyxmoadg = this.f13119iobyxmoadg.iobyxmoadg(i13);
            this.f13120zoijcleaow.eablkybsjg(iPpxfxbqfkf, iWkgbmnqykc, this.f13119iobyxmoadg.zoijcleaow(viewIobyxmoadg), this.f13119iobyxmoadg.eablkybsjg(viewIobyxmoadg));
            if (i15 != 0) {
                this.f13120zoijcleaow.wkgbmnqykc();
                this.f13120zoijcleaow.iobyxmoadg(i15);
                if (this.f13120zoijcleaow.zoijcleaow()) {
                    return viewIobyxmoadg;
                }
            }
            if (i16 != 0) {
                this.f13120zoijcleaow.wkgbmnqykc();
                this.f13120zoijcleaow.iobyxmoadg(i16);
                if (this.f13120zoijcleaow.zoijcleaow()) {
                    view = viewIobyxmoadg;
                }
            }
            i13 += i17;
        }
        return view;
    }

    boolean zoijcleaow(View view, int i13) {
        this.f13120zoijcleaow.eablkybsjg(this.f13119iobyxmoadg.ppxfxbqfkf(), this.f13119iobyxmoadg.wkgbmnqykc(), this.f13119iobyxmoadg.zoijcleaow(view), this.f13119iobyxmoadg.eablkybsjg(view));
        if (i13 == 0) {
            return false;
        }
        this.f13120zoijcleaow.wkgbmnqykc();
        this.f13120zoijcleaow.iobyxmoadg(i13);
        return this.f13120zoijcleaow.zoijcleaow();
    }
}

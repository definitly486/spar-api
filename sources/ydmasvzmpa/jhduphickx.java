package ydmasvzmpa;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jhduphickx {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f124466dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f124467eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f124468gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ojitshcjhn f124469iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f124470lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private List f124471nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f124472ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f124473wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ArrayList f124474zoijcleaow;

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f124477iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f124478zoijcleaow;

        public ppxfxbqfkf(int i13, List list) {
            this.f124477iobyxmoadg = i13;
            this.f124478zoijcleaow = list;
        }

        public final int iobyxmoadg() {
            return this.f124477iobyxmoadg;
        }

        public final List zoijcleaow() {
            return this.f124478zoijcleaow;
        }
    }

    private static final class zoijcleaow implements esjtqupxsv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f124479iobyxmoadg = new zoijcleaow();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static int f124480ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static int f124481zoijcleaow;

        private zoijcleaow() {
        }

        @Override // ydmasvzmpa.esjtqupxsv
        public int iobyxmoadg() {
            return f124480ppxfxbqfkf;
        }

        public void ppxfxbqfkf(int i13) {
            f124480ppxfxbqfkf = i13;
        }

        public void zoijcleaow(int i13) {
            f124481zoijcleaow = i13;
        }
    }

    public jhduphickx(ojitshcjhn ojitshcjhnVar) {
        this.f124469iobyxmoadg = ojitshcjhnVar;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        arrayList.add(new iobyxmoadg(i13, i13, 2, null));
        this.f124474zoijcleaow = arrayList;
        this.f124468gxszxtbevo = -1;
        this.f124470lqeggnwhkg = new ArrayList();
        this.f124471nufgyqmvbu = hg.jyumaefscl.wflxmlrfwp();
    }

    private final void dxjokdxxww() {
        this.f124474zoijcleaow.clear();
        int i13 = 0;
        this.f124474zoijcleaow.add(new iobyxmoadg(i13, i13, 2, null));
        this.f124472ppxfxbqfkf = 0;
        this.f124473wkgbmnqykc = 0;
        this.f124467eablkybsjg = 0;
        this.f124468gxszxtbevo = -1;
        this.f124470lqeggnwhkg.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gxszxtbevo(int i13, iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar.iobyxmoadg() - i13;
    }

    private final List ppxfxbqfkf(int i13) {
        if (i13 == this.f124471nufgyqmvbu.size()) {
            return this.f124471nufgyqmvbu;
        }
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(ydmasvzmpa.ppxfxbqfkf.iobyxmoadg(ribwqtqdhb.iobyxmoadg(1)));
        }
        this.f124471nufgyqmvbu = arrayList;
        return arrayList;
    }

    private final int zoijcleaow() {
        return ((int) Math.sqrt((((double) nufgyqmvbu()) * 1.0d) / ((double) this.f124466dxjokdxxww))) + 1;
    }

    public final void btonecajqb(int i13) {
        if (i13 != this.f124466dxjokdxxww) {
            this.f124466dxjokdxxww = i13;
            dxjokdxxww();
        }
    }

    public final int eablkybsjg(final int i13) {
        int i14 = 0;
        if (nufgyqmvbu() <= 0) {
            return 0;
        }
        if (!(i13 < nufgyqmvbu())) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("ItemIndex > total count");
        }
        if (!this.f124469iobyxmoadg.kcexrzcfyt()) {
            return i13 / this.f124466dxjokdxxww;
        }
        int iGtknphoqwx = hg.jyumaefscl.gtknphoqwx(this.f124474zoijcleaow, 0, 0, new tg.draadjrbmk() { // from class: ydmasvzmpa.vipkmwdibw
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Integer.valueOf(jhduphickx.gxszxtbevo(i13, (jhduphickx.iobyxmoadg) obj));
            }
        }, 3, null);
        int i15 = 2;
        if (iGtknphoqwx < 0) {
            iGtknphoqwx = (-iGtknphoqwx) - 2;
        }
        int iZoijcleaow = zoijcleaow() * iGtknphoqwx;
        int iIobyxmoadg = ((iobyxmoadg) this.f124474zoijcleaow.get(iGtknphoqwx)).iobyxmoadg();
        if (!(iIobyxmoadg <= i13)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("currentItemIndex > itemIndex");
        }
        int i16 = 0;
        while (iIobyxmoadg < i13) {
            int i17 = iIobyxmoadg + 1;
            int iGtknphoqwx2 = gtknphoqwx(iIobyxmoadg, this.f124466dxjokdxxww - i16);
            i16 += iGtknphoqwx2;
            int i18 = this.f124466dxjokdxxww;
            if (i16 >= i18) {
                if (i16 == i18) {
                    iZoijcleaow++;
                    i16 = 0;
                } else {
                    iZoijcleaow++;
                    i16 = iGtknphoqwx2;
                }
            }
            if (iZoijcleaow % zoijcleaow() == 0 && iZoijcleaow / zoijcleaow() >= this.f124474zoijcleaow.size()) {
                this.f124474zoijcleaow.add(new iobyxmoadg(i17 - (i16 > 0 ? 1 : 0), i14, i15, null));
            }
            iIobyxmoadg = i17;
        }
        return i16 + gtknphoqwx(i13, this.f124466dxjokdxxww - i16) > this.f124466dxjokdxxww ? iZoijcleaow + 1 : iZoijcleaow;
    }

    public final int gtknphoqwx(int i13, int i14) {
        zoijcleaow zoijcleaowVar = zoijcleaow.f124479iobyxmoadg;
        zoijcleaowVar.zoijcleaow(i14);
        zoijcleaowVar.ppxfxbqfkf(this.f124466dxjokdxxww);
        androidx.compose.foundation.lazy.layout.gxszxtbevo.iobyxmoadg iobyxmoadgVar = this.f124469iobyxmoadg.gtknphoqwx().get(i13);
        return ydmasvzmpa.ppxfxbqfkf.wkgbmnqykc(((ydmasvzmpa.ppxfxbqfkf) ((btonecajqb) iobyxmoadgVar.ppxfxbqfkf()).zoijcleaow().invoke(zoijcleaowVar, Integer.valueOf(i13 - iobyxmoadgVar.zoijcleaow()))).lqeggnwhkg());
    }

    public final int lqeggnwhkg() {
        return this.f124466dxjokdxxww;
    }

    public final int nufgyqmvbu() {
        return this.f124469iobyxmoadg.gtknphoqwx().getSize();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    public final ppxfxbqfkf wkgbmnqykc(int i13) {
        int i14;
        boolean z13;
        int i15;
        int i16;
        if (!this.f124469iobyxmoadg.kcexrzcfyt()) {
            int i17 = i13 * this.f124466dxjokdxxww;
            return new ppxfxbqfkf(i17, ppxfxbqfkf(zg.gtknphoqwx.gxszxtbevo(zg.gtknphoqwx.btonecajqb(this.f124466dxjokdxxww, nufgyqmvbu() - i17), 0)));
        }
        int iMin = Math.min(i13 / zoijcleaow(), this.f124474zoijcleaow.size() - 1);
        int iZoijcleaow = zoijcleaow() * iMin;
        int iIobyxmoadg = ((iobyxmoadg) this.f124474zoijcleaow.get(iMin)).iobyxmoadg();
        int iZoijcleaow2 = ((iobyxmoadg) this.f124474zoijcleaow.get(iMin)).zoijcleaow();
        int i18 = this.f124472ppxfxbqfkf;
        if (iZoijcleaow <= i18 && i18 <= i13) {
            iIobyxmoadg = this.f124473wkgbmnqykc;
            iZoijcleaow2 = this.f124467eablkybsjg;
            iZoijcleaow = i18;
        } else if (iMin == this.f124468gxszxtbevo && (i14 = i13 - iZoijcleaow) < this.f124470lqeggnwhkg.size()) {
            iIobyxmoadg = ((Number) this.f124470lqeggnwhkg.get(i14)).intValue();
            iZoijcleaow = i13;
            iZoijcleaow2 = 0;
        }
        if (iZoijcleaow % zoijcleaow() == 0) {
            int iZoijcleaow3 = zoijcleaow();
            int i19 = i13 - iZoijcleaow;
            if (2 > i19 || i19 >= iZoijcleaow3) {
                z13 = false;
            } else {
                z13 = true;
            }
        } else {
            z13 = false;
        }
        if (z13) {
            this.f124468gxszxtbevo = iMin;
            this.f124470lqeggnwhkg.clear();
        }
        if (!(iZoijcleaow <= i13)) {
            rlfsiqarku.eablkybsjg.ppxfxbqfkf("currentLine (" + iZoijcleaow + ") > lineIndex (" + i13 + ')');
        }
        while (iZoijcleaow < i13 && iIobyxmoadg < nufgyqmvbu()) {
            if (z13) {
                this.f124470lqeggnwhkg.add(Integer.valueOf(iIobyxmoadg));
            }
            int i23 = 0;
            while (i23 < this.f124466dxjokdxxww && iIobyxmoadg < nufgyqmvbu()) {
                if (iZoijcleaow2 == 0) {
                    i16 = iZoijcleaow2;
                    iZoijcleaow2 = gtknphoqwx(iIobyxmoadg, this.f124466dxjokdxxww - i23);
                } else {
                    i16 = 0;
                }
                i23 += iZoijcleaow2;
                if (i23 > this.f124466dxjokdxxww) {
                    break;
                }
                iIobyxmoadg++;
                iZoijcleaow2 = i16;
            }
            iZoijcleaow++;
            if (iZoijcleaow % zoijcleaow() == 0 && iIobyxmoadg < nufgyqmvbu()) {
                if (!(this.f124474zoijcleaow.size() == iZoijcleaow / zoijcleaow())) {
                    rlfsiqarku.eablkybsjg.ppxfxbqfkf("invalid starting point");
                }
                this.f124474zoijcleaow.add(new iobyxmoadg(iIobyxmoadg, iZoijcleaow2));
            }
        }
        this.f124472ppxfxbqfkf = i13;
        this.f124473wkgbmnqykc = iIobyxmoadg;
        this.f124467eablkybsjg = iZoijcleaow2;
        ArrayList arrayList = new ArrayList();
        int i24 = 0;
        int i25 = iIobyxmoadg;
        while (i24 < this.f124466dxjokdxxww && i25 < nufgyqmvbu()) {
            if (iZoijcleaow2 == 0) {
                int i26 = iZoijcleaow2;
                iZoijcleaow2 = gtknphoqwx(i25, this.f124466dxjokdxxww - i24);
                i15 = i26;
            } else {
                i15 = 0;
            }
            i24 += iZoijcleaow2;
            if (i24 > this.f124466dxjokdxxww) {
                break;
            }
            i25++;
            arrayList.add(ydmasvzmpa.ppxfxbqfkf.iobyxmoadg(ribwqtqdhb.iobyxmoadg(iZoijcleaow2)));
            iZoijcleaow2 = i15;
        }
        return new ppxfxbqfkf(iIobyxmoadg, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f124475iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f124476zoijcleaow;

        public iobyxmoadg(int i13, int i14) {
            this.f124475iobyxmoadg = i13;
            this.f124476zoijcleaow = i14;
        }

        public final int iobyxmoadg() {
            return this.f124475iobyxmoadg;
        }

        public final int zoijcleaow() {
            return this.f124476zoijcleaow;
        }

        public /* synthetic */ iobyxmoadg(int i13, int i14, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(i13, (i15 & 2) != 0 ? 0 : i14);
        }
    }
}

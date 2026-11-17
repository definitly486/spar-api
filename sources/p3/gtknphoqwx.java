package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f75464eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f75465gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75466iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f75467lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Comparator f75463nufgyqmvbu = new Comparator() { // from class: p3.dxjokdxxww
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return gtknphoqwx.lqeggnwhkg((gtknphoqwx.zoijcleaow) obj, (gtknphoqwx.zoijcleaow) obj2);
        }
    };

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final Comparator f75462dxjokdxxww = new Comparator() { // from class: p3.btonecajqb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return gtknphoqwx.nufgyqmvbu((gtknphoqwx.zoijcleaow) obj, (gtknphoqwx.zoijcleaow) obj2);
        }
    };

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow[] f75468ppxfxbqfkf = new zoijcleaow[5];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ArrayList f75470zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f75469wkgbmnqykc = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f75471iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public float f75472ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f75473zoijcleaow;

        private zoijcleaow() {
        }
    }

    public gtknphoqwx(int i13) {
        this.f75466iobyxmoadg = i13;
    }

    private void eablkybsjg() {
        if (this.f75469wkgbmnqykc != 0) {
            Collections.sort(this.f75470zoijcleaow, f75462dxjokdxxww);
            this.f75469wkgbmnqykc = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lqeggnwhkg(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2) {
        return zoijcleaowVar.f75471iobyxmoadg - zoijcleaowVar2.f75471iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int nufgyqmvbu(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2) {
        return Float.compare(zoijcleaowVar.f75472ppxfxbqfkf, zoijcleaowVar2.f75472ppxfxbqfkf);
    }

    private void wkgbmnqykc() {
        if (this.f75469wkgbmnqykc != 1) {
            Collections.sort(this.f75470zoijcleaow, f75463nufgyqmvbu);
            this.f75469wkgbmnqykc = 1;
        }
    }

    public void dxjokdxxww() {
        this.f75470zoijcleaow.clear();
        this.f75469wkgbmnqykc = -1;
        this.f75464eablkybsjg = 0;
        this.f75465gxszxtbevo = 0;
    }

    public float gxszxtbevo(float f13) {
        eablkybsjg();
        float f14 = f13 * this.f75465gxszxtbevo;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f75470zoijcleaow.size(); i14++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f75470zoijcleaow.get(i14);
            i13 += zoijcleaowVar.f75473zoijcleaow;
            if (i13 >= f14) {
                return zoijcleaowVar.f75472ppxfxbqfkf;
            }
        }
        if (this.f75470zoijcleaow.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f75470zoijcleaow;
        return ((zoijcleaow) arrayList.get(arrayList.size() - 1)).f75472ppxfxbqfkf;
    }

    public void ppxfxbqfkf(int i13, float f13) {
        zoijcleaow zoijcleaowVar;
        wkgbmnqykc();
        int i14 = this.f75467lqeggnwhkg;
        if (i14 > 0) {
            zoijcleaow[] zoijcleaowVarArr = this.f75468ppxfxbqfkf;
            int i15 = i14 - 1;
            this.f75467lqeggnwhkg = i15;
            zoijcleaowVar = zoijcleaowVarArr[i15];
        } else {
            zoijcleaowVar = new zoijcleaow();
        }
        int i16 = this.f75464eablkybsjg;
        this.f75464eablkybsjg = i16 + 1;
        zoijcleaowVar.f75471iobyxmoadg = i16;
        zoijcleaowVar.f75473zoijcleaow = i13;
        zoijcleaowVar.f75472ppxfxbqfkf = f13;
        this.f75470zoijcleaow.add(zoijcleaowVar);
        this.f75465gxszxtbevo += i13;
        while (true) {
            int i17 = this.f75465gxszxtbevo;
            int i18 = this.f75466iobyxmoadg;
            if (i17 <= i18) {
                return;
            }
            int i19 = i17 - i18;
            zoijcleaow zoijcleaowVar2 = (zoijcleaow) this.f75470zoijcleaow.get(0);
            int i23 = zoijcleaowVar2.f75473zoijcleaow;
            if (i23 <= i19) {
                this.f75465gxszxtbevo -= i23;
                this.f75470zoijcleaow.remove(0);
                int i24 = this.f75467lqeggnwhkg;
                if (i24 < 5) {
                    zoijcleaow[] zoijcleaowVarArr2 = this.f75468ppxfxbqfkf;
                    this.f75467lqeggnwhkg = i24 + 1;
                    zoijcleaowVarArr2[i24] = zoijcleaowVar2;
                }
            } else {
                zoijcleaowVar2.f75473zoijcleaow = i23 - i19;
                this.f75465gxszxtbevo -= i19;
            }
        }
    }
}

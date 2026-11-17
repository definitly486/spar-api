package k7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class rgvfuqvkyq implements eablkybsjg, wflxmlrfwp, btonecajqb, l7.iobyxmoadg.zoijcleaow, gtknphoqwx {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private wkgbmnqykc f54064btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final l7.rgvfuqvkyq f54065dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f54066eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f54067gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final l7.iobyxmoadg f54069lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final l7.iobyxmoadg f54070nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hcddaimhww f54071ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final r7.zoijcleaow f54072wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Matrix f54068iobyxmoadg = new Matrix();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Path f54073zoijcleaow = new Path();

    public rgvfuqvkyq(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.wflxmlrfwp wflxmlrfwpVar) {
        this.f54071ppxfxbqfkf = hcddaimhwwVar;
        this.f54072wkgbmnqykc = zoijcleaowVar;
        this.f54066eablkybsjg = wflxmlrfwpVar.ppxfxbqfkf();
        this.f54067gxszxtbevo = wflxmlrfwpVar.gxszxtbevo();
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg = wflxmlrfwpVar.zoijcleaow().eablkybsjg();
        this.f54069lqeggnwhkg = iobyxmoadgVarEablkybsjg;
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg);
        iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg2 = wflxmlrfwpVar.wkgbmnqykc().eablkybsjg();
        this.f54070nufgyqmvbu = iobyxmoadgVarEablkybsjg2;
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg2);
        iobyxmoadgVarEablkybsjg2.iobyxmoadg(this);
        l7.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = wflxmlrfwpVar.eablkybsjg().zoijcleaow();
        this.f54065dxjokdxxww = rgvfuqvkyqVarZoijcleaow;
        rgvfuqvkyqVarZoijcleaow.iobyxmoadg(zoijcleaowVar);
        rgvfuqvkyqVarZoijcleaow.zoijcleaow(this);
    }

    @Override // k7.eablkybsjg
    public void dxjokdxxww(Canvas canvas, Matrix matrix, int i13) {
        float fFloatValue = ((Float) this.f54069lqeggnwhkg.nufgyqmvbu()).floatValue();
        float fFloatValue2 = ((Float) this.f54070nufgyqmvbu.nufgyqmvbu()).floatValue();
        float fFloatValue3 = ((Float) this.f54065dxjokdxxww.dxjokdxxww().nufgyqmvbu()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) this.f54065dxjokdxxww.eablkybsjg().nufgyqmvbu()).floatValue() / 100.0f;
        for (int i14 = ((int) fFloatValue) - 1; i14 >= 0; i14--) {
            this.f54068iobyxmoadg.set(matrix);
            float f13 = i14;
            this.f54068iobyxmoadg.preConcat(this.f54065dxjokdxxww.lqeggnwhkg(f13 + fFloatValue2));
            this.f54064btonecajqb.dxjokdxxww(canvas, this.f54068iobyxmoadg, (int) (i13 * v7.dxjokdxxww.dxjokdxxww(fFloatValue3, fFloatValue4, f13 / fFloatValue)));
        }
    }

    @Override // k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        this.f54064btonecajqb.eablkybsjg(rectF, matrix, z13);
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f54066eablkybsjg;
    }

    @Override // k7.wflxmlrfwp
    public Path gxszxtbevo() {
        Path pathGxszxtbevo = this.f54064btonecajqb.gxszxtbevo();
        this.f54073zoijcleaow.reset();
        float fFloatValue = ((Float) this.f54069lqeggnwhkg.nufgyqmvbu()).floatValue();
        float fFloatValue2 = ((Float) this.f54070nufgyqmvbu.nufgyqmvbu()).floatValue();
        for (int i13 = ((int) fFloatValue) - 1; i13 >= 0; i13--) {
            this.f54068iobyxmoadg.set(this.f54065dxjokdxxww.lqeggnwhkg(i13 + fFloatValue2));
            this.f54073zoijcleaow.addPath(pathGxszxtbevo, this.f54068iobyxmoadg);
        }
        return this.f54073zoijcleaow;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        this.f54071ppxfxbqfkf.invalidateSelf();
    }

    @Override // k7.btonecajqb
    public void lqeggnwhkg(ListIterator listIterator) {
        if (this.f54064btonecajqb != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((ppxfxbqfkf) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f54064btonecajqb = new wkgbmnqykc(this.f54071ppxfxbqfkf, this.f54072wkgbmnqykc, "Repeater", this.f54067gxszxtbevo, arrayList, null);
    }

    @Override // o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        if (this.f54065dxjokdxxww.ppxfxbqfkf(obj, ppxfxbqfkfVar)) {
            return;
        }
        if (obj == dsvhmnatus.f20392yggfygwlhe) {
            this.f54069lqeggnwhkg.ojitshcjhn(ppxfxbqfkfVar);
        } else if (obj == dsvhmnatus.f20374jyumaefscl) {
            this.f54070nufgyqmvbu.ojitshcjhn(ppxfxbqfkfVar);
        }
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        v7.dxjokdxxww.gtknphoqwx(eablkybsjgVar, i13, list, eablkybsjgVar2, this);
        for (int i14 = 0; i14 < this.f54064btonecajqb.gtknphoqwx().size(); i14++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f54064btonecajqb.gtknphoqwx().get(i14);
            if (ppxfxbqfkfVar instanceof gtknphoqwx) {
                v7.dxjokdxxww.gtknphoqwx(eablkybsjgVar, i13, list, eablkybsjgVar2, (gtknphoqwx) ppxfxbqfkfVar);
            }
        }
    }

    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        this.f54064btonecajqb.zoijcleaow(list, list2);
    }
}

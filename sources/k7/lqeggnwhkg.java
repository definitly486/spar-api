package k7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg implements eablkybsjg, l7.iobyxmoadg.zoijcleaow, gtknphoqwx {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final hcddaimhww f54012btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    float f54013draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private l7.iobyxmoadg f54014dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f54015eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private l7.iobyxmoadg f54016gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f54017gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Path f54018iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final l7.iobyxmoadg f54019lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final l7.iobyxmoadg f54020nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final r7.zoijcleaow f54021ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private l7.ppxfxbqfkf f54022wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f54023wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Paint f54024zoijcleaow;

    public lqeggnwhkg(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.rgvfuqvkyq rgvfuqvkyqVar) {
        Path path = new Path();
        this.f54018iobyxmoadg = path;
        j7.iobyxmoadg iobyxmoadgVar = new j7.iobyxmoadg(1);
        this.f54024zoijcleaow = iobyxmoadgVar;
        this.f54017gxszxtbevo = new ArrayList();
        this.f54021ppxfxbqfkf = zoijcleaowVar;
        this.f54023wkgbmnqykc = rgvfuqvkyqVar.wkgbmnqykc();
        this.f54015eablkybsjg = rgvfuqvkyqVar.gxszxtbevo();
        this.f54012btonecajqb = hcddaimhwwVar;
        if (zoijcleaowVar.cqumvgiudr() != null) {
            l7.iobyxmoadg iobyxmoadgVarEablkybsjg = zoijcleaowVar.cqumvgiudr().iobyxmoadg().eablkybsjg();
            this.f54016gtknphoqwx = iobyxmoadgVarEablkybsjg;
            iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
            zoijcleaowVar.btonecajqb(this.f54016gtknphoqwx);
        }
        if (zoijcleaowVar.lereixgezr() != null) {
            this.f54022wflxmlrfwp = new l7.ppxfxbqfkf(this, zoijcleaowVar, zoijcleaowVar.lereixgezr());
        }
        if (rgvfuqvkyqVar.zoijcleaow() == null || rgvfuqvkyqVar.eablkybsjg() == null) {
            this.f54019lqeggnwhkg = null;
            this.f54020nufgyqmvbu = null;
            return;
        }
        j1.eablkybsjg.iobyxmoadg(iobyxmoadgVar, zoijcleaowVar.iwizpuwonk().wkgbmnqykc());
        path.setFillType(rgvfuqvkyqVar.ppxfxbqfkf());
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg2 = rgvfuqvkyqVar.zoijcleaow().eablkybsjg();
        this.f54019lqeggnwhkg = iobyxmoadgVarEablkybsjg2;
        iobyxmoadgVarEablkybsjg2.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg2);
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg3 = rgvfuqvkyqVar.eablkybsjg().eablkybsjg();
        this.f54020nufgyqmvbu = iobyxmoadgVarEablkybsjg3;
        iobyxmoadgVarEablkybsjg3.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg3);
    }

    @Override // k7.eablkybsjg
    public void dxjokdxxww(Canvas canvas, Matrix matrix, int i13) {
        if (this.f54015eablkybsjg) {
            return;
        }
        com.airbnb.lottie.eablkybsjg.zoijcleaow("FillContent#draw");
        this.f54024zoijcleaow.setColor((v7.dxjokdxxww.ppxfxbqfkf((int) ((((i13 / 255.0f) * ((Integer) this.f54020nufgyqmvbu.nufgyqmvbu()).intValue()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((l7.zoijcleaow) this.f54019lqeggnwhkg).vdvldrhtss() & 16777215));
        l7.iobyxmoadg iobyxmoadgVar = this.f54014dxjokdxxww;
        if (iobyxmoadgVar != null) {
            this.f54024zoijcleaow.setColorFilter((ColorFilter) iobyxmoadgVar.nufgyqmvbu());
        }
        l7.iobyxmoadg iobyxmoadgVar2 = this.f54016gtknphoqwx;
        if (iobyxmoadgVar2 != null) {
            float fFloatValue = ((Float) iobyxmoadgVar2.nufgyqmvbu()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f54024zoijcleaow.setMaskFilter(null);
            } else if (fFloatValue != this.f54013draadjrbmk) {
                this.f54024zoijcleaow.setMaskFilter(this.f54021ppxfxbqfkf.esjtqupxsv(fFloatValue));
            }
            this.f54013draadjrbmk = fFloatValue;
        }
        l7.ppxfxbqfkf ppxfxbqfkfVar = this.f54022wflxmlrfwp;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow(this.f54024zoijcleaow);
        }
        this.f54018iobyxmoadg.reset();
        for (int i14 = 0; i14 < this.f54017gxszxtbevo.size(); i14++) {
            this.f54018iobyxmoadg.addPath(((wflxmlrfwp) this.f54017gxszxtbevo.get(i14)).gxszxtbevo(), matrix);
        }
        canvas.drawPath(this.f54018iobyxmoadg, this.f54024zoijcleaow);
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("FillContent#draw");
    }

    @Override // k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        this.f54018iobyxmoadg.reset();
        for (int i13 = 0; i13 < this.f54017gxszxtbevo.size(); i13++) {
            this.f54018iobyxmoadg.addPath(((wflxmlrfwp) this.f54017gxszxtbevo.get(i13)).gxszxtbevo(), matrix);
        }
        this.f54018iobyxmoadg.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f54023wkgbmnqykc;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        this.f54012btonecajqb.invalidateSelf();
    }

    @Override // o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        l7.ppxfxbqfkf ppxfxbqfkfVar2;
        l7.ppxfxbqfkf ppxfxbqfkfVar3;
        l7.ppxfxbqfkf ppxfxbqfkfVar4;
        l7.ppxfxbqfkf ppxfxbqfkfVar5;
        l7.ppxfxbqfkf ppxfxbqfkfVar6;
        if (obj == dsvhmnatus.f20369iobyxmoadg) {
            this.f54019lqeggnwhkg.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20388wkgbmnqykc) {
            this.f54020nufgyqmvbu.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20367hcddaimhww) {
            l7.iobyxmoadg iobyxmoadgVar = this.f54014dxjokdxxww;
            if (iobyxmoadgVar != null) {
                this.f54021ppxfxbqfkf.ylkuphrtab(iobyxmoadgVar);
            }
            if (ppxfxbqfkfVar == null) {
                this.f54014dxjokdxxww = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f54014dxjokdxxww = vdvldrhtssVar;
            vdvldrhtssVar.iobyxmoadg(this);
            this.f54021ppxfxbqfkf.btonecajqb(this.f54014dxjokdxxww);
            return;
        }
        if (obj == dsvhmnatus.f20356btonecajqb) {
            l7.iobyxmoadg iobyxmoadgVar2 = this.f54016gtknphoqwx;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.ojitshcjhn(ppxfxbqfkfVar);
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar2 = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f54016gtknphoqwx = vdvldrhtssVar2;
            vdvldrhtssVar2.iobyxmoadg(this);
            this.f54021ppxfxbqfkf.btonecajqb(this.f54016gtknphoqwx);
            return;
        }
        if (obj == dsvhmnatus.f20363eablkybsjg && (ppxfxbqfkfVar6 = this.f54022wflxmlrfwp) != null) {
            ppxfxbqfkfVar6.ppxfxbqfkf(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20377lmojexxdyd && (ppxfxbqfkfVar5 = this.f54022wflxmlrfwp) != null) {
            ppxfxbqfkfVar5.gxszxtbevo(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20389wwaezpbzkn && (ppxfxbqfkfVar4 = this.f54022wflxmlrfwp) != null) {
            ppxfxbqfkfVar4.wkgbmnqykc(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20393ylkuphrtab && (ppxfxbqfkfVar3 = this.f54022wflxmlrfwp) != null) {
            ppxfxbqfkfVar3.eablkybsjg(ppxfxbqfkfVar);
        } else {
            if (obj != dsvhmnatus.f20382pkzmftpjix || (ppxfxbqfkfVar2 = this.f54022wflxmlrfwp) == null) {
                return;
            }
            ppxfxbqfkfVar2.lqeggnwhkg(ppxfxbqfkfVar);
        }
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        v7.dxjokdxxww.gtknphoqwx(eablkybsjgVar, i13, list, eablkybsjgVar2, this);
    }

    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        for (int i13 = 0; i13 < list2.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list2.get(i13);
            if (ppxfxbqfkfVar instanceof wflxmlrfwp) {
                this.f54017gxszxtbevo.add((wflxmlrfwp) ppxfxbqfkfVar);
            }
        }
    }
}

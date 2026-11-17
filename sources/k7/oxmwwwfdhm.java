package k7;

import android.graphics.Path;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class oxmwwwfdhm implements wflxmlrfwp, l7.iobyxmoadg.zoijcleaow, gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final l7.wflxmlrfwp f54057eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f54058gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Path f54059iobyxmoadg = new Path();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zoijcleaow f54060lqeggnwhkg = new zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f54061ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final hcddaimhww f54062wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f54063zoijcleaow;

    public oxmwwwfdhm(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f54063zoijcleaow = oxmwwwfdhmVar.zoijcleaow();
        this.f54061ppxfxbqfkf = oxmwwwfdhmVar.wkgbmnqykc();
        this.f54062wkgbmnqykc = hcddaimhwwVar;
        l7.wflxmlrfwp wflxmlrfwpVarEablkybsjg = oxmwwwfdhmVar.ppxfxbqfkf().eablkybsjg();
        this.f54057eablkybsjg = wflxmlrfwpVarEablkybsjg;
        zoijcleaowVar.btonecajqb(wflxmlrfwpVarEablkybsjg);
        wflxmlrfwpVarEablkybsjg.iobyxmoadg(this);
    }

    private void lqeggnwhkg() {
        this.f54058gxszxtbevo = false;
        this.f54062wkgbmnqykc.invalidateSelf();
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f54063zoijcleaow;
    }

    @Override // k7.wflxmlrfwp
    public Path gxszxtbevo() {
        if (this.f54058gxszxtbevo && !this.f54057eablkybsjg.gtknphoqwx()) {
            return this.f54059iobyxmoadg;
        }
        this.f54059iobyxmoadg.reset();
        if (this.f54061ppxfxbqfkf) {
            this.f54058gxszxtbevo = true;
            return this.f54059iobyxmoadg;
        }
        Path path = (Path) this.f54057eablkybsjg.nufgyqmvbu();
        if (path == null) {
            return this.f54059iobyxmoadg;
        }
        this.f54059iobyxmoadg.set(path);
        this.f54059iobyxmoadg.setFillType(Path.FillType.EVEN_ODD);
        this.f54060lqeggnwhkg.zoijcleaow(this.f54059iobyxmoadg);
        this.f54058gxszxtbevo = true;
        return this.f54059iobyxmoadg;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        lqeggnwhkg();
    }

    @Override // o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        if (obj == dsvhmnatus.f20390wypolnanlu) {
            this.f54057eablkybsjg.ojitshcjhn(ppxfxbqfkfVar);
        }
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        v7.dxjokdxxww.gtknphoqwx(eablkybsjgVar, i13, list, eablkybsjgVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        ArrayList arrayList = null;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list.get(i13);
            if (ppxfxbqfkfVar instanceof yggfygwlhe) {
                yggfygwlhe yggfygwlheVar = (yggfygwlhe) ppxfxbqfkfVar;
                if (yggfygwlheVar.gtknphoqwx() == q7.zdlpuopuiu.iobyxmoadg.SIMULTANEOUSLY) {
                    this.f54060lqeggnwhkg.iobyxmoadg(yggfygwlheVar);
                    yggfygwlheVar.ppxfxbqfkf(this);
                } else if (!(ppxfxbqfkfVar instanceof kcexrzcfyt)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((kcexrzcfyt) ppxfxbqfkfVar);
                }
            } else if (!(ppxfxbqfkfVar instanceof kcexrzcfyt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((kcexrzcfyt) ppxfxbqfkfVar);
            }
        }
        this.f54057eablkybsjg.oxmwwwfdhm(arrayList);
    }
}

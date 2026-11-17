package sflfametgt;

import androidx.compose.runtime.ezmngbhpjk;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.roivzttewh;
import androidx.compose.runtime.uawqvzlxes;

/* JADX INFO: loaded from: classes.dex */
public final class tzroggbefp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Object f106335eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.kegysxyocb f106336gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ikoacuggdj f106337iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final roivzttewh f106338ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f106339wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final uawqvzlxes f106340zoijcleaow;

    public tzroggbefp(int i13, float f13, ikoacuggdj ikoacuggdjVar) {
        this.f106337iobyxmoadg = ikoacuggdjVar;
        this.f106340zoijcleaow = j0.iobyxmoadg(i13);
        this.f106338ppxfxbqfkf = ezmngbhpjk.iobyxmoadg(f13);
        this.f106336gxszxtbevo = new androidx.compose.foundation.lazy.layout.kegysxyocb(i13, 30, 100);
    }

    private final void dxjokdxxww(int i13, float f13) {
        lqeggnwhkg(i13);
        this.f106336gxszxtbevo.draadjrbmk(i13);
        nufgyqmvbu(f13);
    }

    private final void lqeggnwhkg(int i13) {
        this.f106340zoijcleaow.btonecajqb(i13);
    }

    private final void nufgyqmvbu(float f13) {
        this.f106338ppxfxbqfkf.pkzmftpjix(f13);
    }

    public final void btonecajqb(float f13) {
        nufgyqmvbu(f13);
    }

    public final int eablkybsjg(lmojexxdyd lmojexxdydVar, int i13) {
        int iIobyxmoadg = androidx.compose.foundation.lazy.layout.istkbnxepw.iobyxmoadg(lmojexxdydVar, this.f106335eablkybsjg, i13);
        if (i13 != iIobyxmoadg) {
            lqeggnwhkg(iIobyxmoadg);
            this.f106336gxszxtbevo.draadjrbmk(i13);
        }
        return iIobyxmoadg;
    }

    public final void gtknphoqwx(wypolnanlu wypolnanluVar) {
        wflxmlrfwp wflxmlrfwpVarKcexrzcfyt = wypolnanluVar.kcexrzcfyt();
        this.f106335eablkybsjg = wflxmlrfwpVarKcexrzcfyt != null ? wflxmlrfwpVarKcexrzcfyt.wkgbmnqykc() : null;
        if (this.f106339wkgbmnqykc || !wypolnanluVar.nufgyqmvbu().isEmpty()) {
            this.f106339wkgbmnqykc = true;
            wflxmlrfwp wflxmlrfwpVarKcexrzcfyt2 = wypolnanluVar.kcexrzcfyt();
            dxjokdxxww(wflxmlrfwpVarKcexrzcfyt2 != null ? wflxmlrfwpVarKcexrzcfyt2.getIndex() : 0, wypolnanluVar.zdlpuopuiu());
        }
    }

    public final void gxszxtbevo(int i13, float f13) {
        dxjokdxxww(i13, f13);
        this.f106335eablkybsjg = null;
    }

    public final void iobyxmoadg(int i13) {
        nufgyqmvbu(ppxfxbqfkf() + (this.f106337iobyxmoadg.jpowsppfya() == 0 ? 0.0f : i13 / this.f106337iobyxmoadg.jpowsppfya()));
    }

    public final float ppxfxbqfkf() {
        return this.f106338ppxfxbqfkf.zoijcleaow();
    }

    public final androidx.compose.foundation.lazy.layout.kegysxyocb wkgbmnqykc() {
        return this.f106336gxszxtbevo;
    }

    public final int zoijcleaow() {
        return this.f106340zoijcleaow.gxszxtbevo();
    }
}

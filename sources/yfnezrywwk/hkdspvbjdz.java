package yfnezrywwk;

import androidx.compose.runtime.j0;
import androidx.compose.runtime.uawqvzlxes;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.kegysxyocb f124753eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final uawqvzlxes f124754iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f124755ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Object f124756wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final uawqvzlxes f124757zoijcleaow;

    public hkdspvbjdz(int i13, int i14) {
        this.f124754iobyxmoadg = j0.iobyxmoadg(i13);
        this.f124757zoijcleaow = j0.iobyxmoadg(i14);
        this.f124753eablkybsjg = new androidx.compose.foundation.lazy.layout.kegysxyocb(i13, 30, 100);
    }

    private final void gxszxtbevo(int i13) {
        this.f124757zoijcleaow.btonecajqb(i13);
    }

    private final void lqeggnwhkg(int i13, int i14) {
        if (!(((float) i13) >= 0.0f)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("Index should be non-negative (" + i13 + ')');
        }
        eablkybsjg(i13);
        this.f124753eablkybsjg.draadjrbmk(i13);
        gxszxtbevo(i14);
    }

    public final int btonecajqb(ojitshcjhn ojitshcjhnVar, int i13) {
        int iIobyxmoadg = androidx.compose.foundation.lazy.layout.istkbnxepw.iobyxmoadg(ojitshcjhnVar, this.f124756wkgbmnqykc, i13);
        if (i13 != iIobyxmoadg) {
            eablkybsjg(iIobyxmoadg);
            this.f124753eablkybsjg.draadjrbmk(i13);
        }
        return iIobyxmoadg;
    }

    public final void dxjokdxxww(int i13) {
        if (!(((float) i13) >= 0.0f)) {
            rlfsiqarku.eablkybsjg.ppxfxbqfkf("scrollOffset should be non-negative");
        }
        gxszxtbevo(i13);
    }

    public final void eablkybsjg(int i13) {
        this.f124754iobyxmoadg.btonecajqb(i13);
    }

    public final int iobyxmoadg() {
        return this.f124754iobyxmoadg.gxszxtbevo();
    }

    public final void nufgyqmvbu(yadqdtsiqt yadqdtsiqtVar) {
        iozdgvuglv iozdgvuglvVarKcexrzcfyt = yadqdtsiqtVar.kcexrzcfyt();
        this.f124756wkgbmnqykc = iozdgvuglvVarKcexrzcfyt != null ? iozdgvuglvVarKcexrzcfyt.getKey() : null;
        if (this.f124755ppxfxbqfkf || yadqdtsiqtVar.gxszxtbevo() > 0) {
            this.f124755ppxfxbqfkf = true;
            int iZdlpuopuiu = yadqdtsiqtVar.zdlpuopuiu();
            if (!(((float) iZdlpuopuiu) >= 0.0f)) {
                rlfsiqarku.eablkybsjg.ppxfxbqfkf("scrollOffset should be non-negative");
            }
            iozdgvuglv iozdgvuglvVarKcexrzcfyt2 = yadqdtsiqtVar.kcexrzcfyt();
            lqeggnwhkg(iozdgvuglvVarKcexrzcfyt2 != null ? iozdgvuglvVarKcexrzcfyt2.getIndex() : 0, iZdlpuopuiu);
        }
    }

    public final int ppxfxbqfkf() {
        return this.f124757zoijcleaow.gxszxtbevo();
    }

    public final void wkgbmnqykc(int i13, int i14) {
        lqeggnwhkg(i13, i14);
        this.f124756wkgbmnqykc = null;
    }

    public final androidx.compose.foundation.lazy.layout.kegysxyocb zoijcleaow() {
        return this.f124753eablkybsjg;
    }
}

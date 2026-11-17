package ydmasvzmpa;

import androidx.compose.runtime.j0;
import androidx.compose.runtime.uawqvzlxes;

/* JADX INFO: loaded from: classes.dex */
public final class ulzqkzuiru {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.kegysxyocb f124611eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final uawqvzlxes f124612iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f124613ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Object f124614wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final uawqvzlxes f124615zoijcleaow;

    public ulzqkzuiru(int i13, int i14) {
        this.f124612iobyxmoadg = j0.iobyxmoadg(i13);
        this.f124615zoijcleaow = j0.iobyxmoadg(i14);
        this.f124611eablkybsjg = new androidx.compose.foundation.lazy.layout.kegysxyocb(i13, 90, 200);
    }

    private final void eablkybsjg(int i13) {
        this.f124612iobyxmoadg.btonecajqb(i13);
    }

    private final void gxszxtbevo(int i13) {
        this.f124615zoijcleaow.btonecajqb(i13);
    }

    private final void lqeggnwhkg(int i13, int i14) {
        if (!(((float) i13) >= 0.0f)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("Index should be non-negative");
        }
        eablkybsjg(i13);
        this.f124611eablkybsjg.draadjrbmk(i13);
        gxszxtbevo(i14);
    }

    public final int btonecajqb(vdvldrhtss vdvldrhtssVar, int i13) {
        int iIobyxmoadg = androidx.compose.foundation.lazy.layout.istkbnxepw.iobyxmoadg(vdvldrhtssVar, this.f124614wkgbmnqykc, i13);
        if (i13 != iIobyxmoadg) {
            eablkybsjg(iIobyxmoadg);
            this.f124611eablkybsjg.draadjrbmk(i13);
        }
        return iIobyxmoadg;
    }

    public final void dxjokdxxww(int i13) {
        if (!(((float) i13) >= 0.0f)) {
            rlfsiqarku.eablkybsjg.ppxfxbqfkf("scrollOffset should be non-negative");
        }
        gxszxtbevo(i13);
    }

    public final int iobyxmoadg() {
        return this.f124612iobyxmoadg.gxszxtbevo();
    }

    public final void nufgyqmvbu(jpowsppfya jpowsppfyaVar) {
        hkdspvbjdz[] hkdspvbjdzVarArrZoijcleaow;
        hkdspvbjdz hkdspvbjdzVar;
        hkdspvbjdz[] hkdspvbjdzVarArrZoijcleaow2;
        hkdspvbjdz hkdspvbjdzVar2;
        dsvhmnatus dsvhmnatusVarOxmwwwfdhm = jpowsppfyaVar.oxmwwwfdhm();
        this.f124614wkgbmnqykc = (dsvhmnatusVarOxmwwwfdhm == null || (hkdspvbjdzVarArrZoijcleaow2 = dsvhmnatusVarOxmwwwfdhm.zoijcleaow()) == null || (hkdspvbjdzVar2 = (hkdspvbjdz) hg.agtfadlqog.ydmasvzmpa(hkdspvbjdzVarArrZoijcleaow2)) == null) ? null : hkdspvbjdzVar2.getKey();
        if (this.f124613ppxfxbqfkf || jpowsppfyaVar.gxszxtbevo() > 0) {
            this.f124613ppxfxbqfkf = true;
            int iKcexrzcfyt = jpowsppfyaVar.kcexrzcfyt();
            int index = 0;
            if (!(((float) iKcexrzcfyt) >= 0.0f)) {
                rlfsiqarku.eablkybsjg.ppxfxbqfkf("scrollOffset should be non-negative (" + iKcexrzcfyt + ')');
            }
            dsvhmnatus dsvhmnatusVarOxmwwwfdhm2 = jpowsppfyaVar.oxmwwwfdhm();
            if (dsvhmnatusVarOxmwwwfdhm2 != null && (hkdspvbjdzVarArrZoijcleaow = dsvhmnatusVarOxmwwwfdhm2.zoijcleaow()) != null && (hkdspvbjdzVar = (hkdspvbjdz) hg.agtfadlqog.ydmasvzmpa(hkdspvbjdzVarArrZoijcleaow)) != null) {
                index = hkdspvbjdzVar.getIndex();
            }
            lqeggnwhkg(index, iKcexrzcfyt);
        }
    }

    public final int ppxfxbqfkf() {
        return this.f124615zoijcleaow.gxszxtbevo();
    }

    public final void wkgbmnqykc(int i13, int i14) {
        lqeggnwhkg(i13, i14);
        this.f124614wkgbmnqykc = null;
    }

    public final androidx.compose.foundation.lazy.layout.kegysxyocb zoijcleaow() {
        return this.f124611eablkybsjg;
    }
}

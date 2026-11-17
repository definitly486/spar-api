package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.c1;

/* JADX INFO: loaded from: classes.dex */
final class tzroggbefp implements x.hcddaimhww, x.hcddaimhww.iobyxmoadg, sopmlzcsov.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private x.hcddaimhww.iobyxmoadg f5130eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f5131gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f5132iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f5135wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final sopmlzcsov f5136zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f5134ppxfxbqfkf = -1;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f5133lqeggnwhkg = c1.ppxfxbqfkf(null, null, 2, null);

    public tzroggbefp(Object obj, sopmlzcsov sopmlzcsovVar) {
        this.f5132iobyxmoadg = obj;
        this.f5136zoijcleaow = sopmlzcsovVar;
    }

    private final void lqeggnwhkg(x.hcddaimhww hcddaimhwwVar) {
        this.f5133lqeggnwhkg.setValue(hcddaimhwwVar);
    }

    private final x.hcddaimhww ppxfxbqfkf() {
        return (x.hcddaimhww) this.f5133lqeggnwhkg.getValue();
    }

    public void eablkybsjg(int i13) {
        this.f5134ppxfxbqfkf = i13;
    }

    @Override // androidx.compose.foundation.lazy.layout.sopmlzcsov.iobyxmoadg
    public int getIndex() {
        return this.f5134ppxfxbqfkf;
    }

    @Override // androidx.compose.foundation.lazy.layout.sopmlzcsov.iobyxmoadg
    public Object getKey() {
        return this.f5132iobyxmoadg;
    }

    public final void gxszxtbevo(x.hcddaimhww hcddaimhwwVar) {
        androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        tg.draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkgVarWkgbmnqykc != null ? lqeggnwhkgVarWkgbmnqykc.lqeggnwhkg() : null;
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(lqeggnwhkgVarWkgbmnqykc);
        try {
            if (hcddaimhwwVar != ppxfxbqfkf()) {
                lqeggnwhkg(hcddaimhwwVar);
                if (this.f5135wkgbmnqykc > 0) {
                    x.hcddaimhww.iobyxmoadg iobyxmoadgVar2 = this.f5130eablkybsjg;
                    if (iobyxmoadgVar2 != null) {
                        iobyxmoadgVar2.release();
                    }
                    this.f5130eablkybsjg = hcddaimhwwVar != null ? hcddaimhwwVar.iobyxmoadg() : null;
                }
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
        }
    }

    @Override // x.hcddaimhww
    public x.hcddaimhww.iobyxmoadg iobyxmoadg() {
        if (this.f5131gxszxtbevo) {
            rlfsiqarku.eablkybsjg.ppxfxbqfkf("Pin should not be called on an already disposed item ");
        }
        if (this.f5135wkgbmnqykc == 0) {
            this.f5136zoijcleaow.gxszxtbevo(this);
            x.hcddaimhww hcddaimhwwVarZoijcleaow = zoijcleaow();
            this.f5130eablkybsjg = hcddaimhwwVarZoijcleaow != null ? hcddaimhwwVarZoijcleaow.iobyxmoadg() : null;
        }
        this.f5135wkgbmnqykc++;
        return this;
    }

    @Override // x.hcddaimhww.iobyxmoadg
    public void release() {
        if (this.f5131gxszxtbevo) {
            return;
        }
        if (!(this.f5135wkgbmnqykc > 0)) {
            rlfsiqarku.eablkybsjg.ppxfxbqfkf("Release should only be called once");
        }
        int i13 = this.f5135wkgbmnqykc - 1;
        this.f5135wkgbmnqykc = i13;
        if (i13 == 0) {
            this.f5136zoijcleaow.dxjokdxxww(this);
            x.hcddaimhww.iobyxmoadg iobyxmoadgVar = this.f5130eablkybsjg;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.release();
            }
            this.f5130eablkybsjg = null;
        }
    }

    public final void wkgbmnqykc() {
        this.f5131gxszxtbevo = true;
    }

    public final x.hcddaimhww zoijcleaow() {
        return ppxfxbqfkf();
    }
}

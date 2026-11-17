package c9;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww implements wkgbmnqykc, ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private wkgbmnqykc.iobyxmoadg f19252eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private wkgbmnqykc.iobyxmoadg f19253gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f19254iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f19255lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private volatile ppxfxbqfkf f19256ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile ppxfxbqfkf f19257wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f19258zoijcleaow;

    public dxjokdxxww(Object obj, wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.iobyxmoadg.CLEARED;
        this.f19252eablkybsjg = iobyxmoadgVar;
        this.f19253gxszxtbevo = iobyxmoadgVar;
        this.f19258zoijcleaow = obj;
        this.f19254iobyxmoadg = wkgbmnqykcVar;
    }

    private boolean draadjrbmk() {
        wkgbmnqykc wkgbmnqykcVar = this.f19254iobyxmoadg;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.dxjokdxxww(this);
    }

    private boolean gtknphoqwx() {
        wkgbmnqykc wkgbmnqykcVar = this.f19254iobyxmoadg;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.gxszxtbevo(this);
    }

    private boolean wflxmlrfwp() {
        wkgbmnqykc wkgbmnqykcVar = this.f19254iobyxmoadg;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.wkgbmnqykc(this);
    }

    public void agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        this.f19256ppxfxbqfkf = ppxfxbqfkfVar;
        this.f19257wkgbmnqykc = ppxfxbqfkfVar2;
    }

    @Override // c9.ppxfxbqfkf
    public void btonecajqb() {
        synchronized (this.f19258zoijcleaow) {
            try {
                this.f19255lqeggnwhkg = true;
                try {
                    if (this.f19252eablkybsjg != wkgbmnqykc.iobyxmoadg.SUCCESS) {
                        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f19253gxszxtbevo;
                        wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.RUNNING;
                        if (iobyxmoadgVar != iobyxmoadgVar2) {
                            this.f19253gxszxtbevo = iobyxmoadgVar2;
                            this.f19257wkgbmnqykc.btonecajqb();
                        }
                    }
                    if (this.f19255lqeggnwhkg) {
                        wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = this.f19252eablkybsjg;
                        wkgbmnqykc.iobyxmoadg iobyxmoadgVar4 = wkgbmnqykc.iobyxmoadg.RUNNING;
                        if (iobyxmoadgVar3 != iobyxmoadgVar4) {
                            this.f19252eablkybsjg = iobyxmoadgVar4;
                            this.f19256ppxfxbqfkf.btonecajqb();
                        }
                    }
                    this.f19255lqeggnwhkg = false;
                } catch (Throwable th2) {
                    this.f19255lqeggnwhkg = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // c9.ppxfxbqfkf
    public void clear() {
        synchronized (this.f19258zoijcleaow) {
            this.f19255lqeggnwhkg = false;
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.iobyxmoadg.CLEARED;
            this.f19252eablkybsjg = iobyxmoadgVar;
            this.f19253gxszxtbevo = iobyxmoadgVar;
            this.f19257wkgbmnqykc.clear();
            this.f19256ppxfxbqfkf.clear();
        }
    }

    @Override // c9.wkgbmnqykc
    public boolean dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13;
        synchronized (this.f19258zoijcleaow) {
            try {
                z13 = draadjrbmk() && ppxfxbqfkfVar.equals(this.f19256ppxfxbqfkf) && !zoijcleaow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // c9.ppxfxbqfkf
    public boolean eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar) {
        if (!(ppxfxbqfkfVar instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) ppxfxbqfkfVar;
        if (this.f19256ppxfxbqfkf == null) {
            if (dxjokdxxwwVar.f19256ppxfxbqfkf != null) {
                return false;
            }
        } else if (!this.f19256ppxfxbqfkf.eablkybsjg(dxjokdxxwwVar.f19256ppxfxbqfkf)) {
            return false;
        }
        if (this.f19257wkgbmnqykc == null) {
            if (dxjokdxxwwVar.f19257wkgbmnqykc != null) {
                return false;
            }
        } else if (!this.f19257wkgbmnqykc.eablkybsjg(dxjokdxxwwVar.f19257wkgbmnqykc)) {
            return false;
        }
        return true;
    }

    @Override // c9.wkgbmnqykc
    public wkgbmnqykc getRoot() {
        wkgbmnqykc root;
        synchronized (this.f19258zoijcleaow) {
            try {
                wkgbmnqykc wkgbmnqykcVar = this.f19254iobyxmoadg;
                root = wkgbmnqykcVar != null ? wkgbmnqykcVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // c9.wkgbmnqykc
    public boolean gxszxtbevo(ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13;
        synchronized (this.f19258zoijcleaow) {
            try {
                z13 = gtknphoqwx() && ppxfxbqfkfVar.equals(this.f19256ppxfxbqfkf) && this.f19252eablkybsjg != wkgbmnqykc.iobyxmoadg.PAUSED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // c9.ppxfxbqfkf
    public boolean iobyxmoadg() {
        boolean z13;
        synchronized (this.f19258zoijcleaow) {
            z13 = this.f19252eablkybsjg == wkgbmnqykc.iobyxmoadg.SUCCESS;
        }
        return z13;
    }

    @Override // c9.ppxfxbqfkf
    public boolean isRunning() {
        boolean z13;
        synchronized (this.f19258zoijcleaow) {
            z13 = this.f19252eablkybsjg == wkgbmnqykc.iobyxmoadg.RUNNING;
        }
        return z13;
    }

    @Override // c9.wkgbmnqykc
    public void lqeggnwhkg(ppxfxbqfkf ppxfxbqfkfVar) {
        synchronized (this.f19258zoijcleaow) {
            try {
                if (ppxfxbqfkfVar.equals(this.f19257wkgbmnqykc)) {
                    this.f19253gxszxtbevo = wkgbmnqykc.iobyxmoadg.SUCCESS;
                    return;
                }
                this.f19252eablkybsjg = wkgbmnqykc.iobyxmoadg.SUCCESS;
                wkgbmnqykc wkgbmnqykcVar = this.f19254iobyxmoadg;
                if (wkgbmnqykcVar != null) {
                    wkgbmnqykcVar.lqeggnwhkg(this);
                }
                if (!this.f19253gxszxtbevo.wkgbmnqykc()) {
                    this.f19257wkgbmnqykc.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.ppxfxbqfkf
    public boolean nufgyqmvbu() {
        boolean z13;
        synchronized (this.f19258zoijcleaow) {
            z13 = this.f19252eablkybsjg == wkgbmnqykc.iobyxmoadg.CLEARED;
        }
        return z13;
    }

    @Override // c9.ppxfxbqfkf
    public void pause() {
        synchronized (this.f19258zoijcleaow) {
            try {
                if (!this.f19253gxszxtbevo.wkgbmnqykc()) {
                    this.f19253gxszxtbevo = wkgbmnqykc.iobyxmoadg.PAUSED;
                    this.f19257wkgbmnqykc.pause();
                }
                if (!this.f19252eablkybsjg.wkgbmnqykc()) {
                    this.f19252eablkybsjg = wkgbmnqykc.iobyxmoadg.PAUSED;
                    this.f19256ppxfxbqfkf.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.wkgbmnqykc
    public void ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        synchronized (this.f19258zoijcleaow) {
            try {
                if (!ppxfxbqfkfVar.equals(this.f19256ppxfxbqfkf)) {
                    this.f19253gxszxtbevo = wkgbmnqykc.iobyxmoadg.FAILED;
                    return;
                }
                this.f19252eablkybsjg = wkgbmnqykc.iobyxmoadg.FAILED;
                wkgbmnqykc wkgbmnqykcVar = this.f19254iobyxmoadg;
                if (wkgbmnqykcVar != null) {
                    wkgbmnqykcVar.ppxfxbqfkf(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.wkgbmnqykc
    public boolean wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13;
        synchronized (this.f19258zoijcleaow) {
            try {
                z13 = wflxmlrfwp() && (ppxfxbqfkfVar.equals(this.f19256ppxfxbqfkf) || this.f19252eablkybsjg != wkgbmnqykc.iobyxmoadg.SUCCESS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // c9.wkgbmnqykc, c9.ppxfxbqfkf
    public boolean zoijcleaow() {
        boolean z13;
        synchronized (this.f19258zoijcleaow) {
            try {
                z13 = this.f19257wkgbmnqykc.zoijcleaow() || this.f19256ppxfxbqfkf.zoijcleaow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }
}

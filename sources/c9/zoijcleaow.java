package c9;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements wkgbmnqykc, ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private wkgbmnqykc.iobyxmoadg f19330eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private wkgbmnqykc.iobyxmoadg f19331gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f19332iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private volatile ppxfxbqfkf f19333ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile ppxfxbqfkf f19334wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f19335zoijcleaow;

    public zoijcleaow(Object obj, wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.iobyxmoadg.CLEARED;
        this.f19330eablkybsjg = iobyxmoadgVar;
        this.f19331gxszxtbevo = iobyxmoadgVar;
        this.f19332iobyxmoadg = obj;
        this.f19335zoijcleaow = wkgbmnqykcVar;
    }

    private boolean agtfadlqog() {
        wkgbmnqykc wkgbmnqykcVar = this.f19335zoijcleaow;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.wkgbmnqykc(this);
    }

    private boolean draadjrbmk() {
        wkgbmnqykc wkgbmnqykcVar = this.f19335zoijcleaow;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.gxszxtbevo(this);
    }

    private boolean gtknphoqwx(ppxfxbqfkf ppxfxbqfkfVar) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar;
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = this.f19330eablkybsjg;
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = wkgbmnqykc.iobyxmoadg.FAILED;
        if (iobyxmoadgVar2 != iobyxmoadgVar3) {
            return ppxfxbqfkfVar.equals(this.f19333ppxfxbqfkf);
        }
        return ppxfxbqfkfVar.equals(this.f19334wkgbmnqykc) && ((iobyxmoadgVar = this.f19331gxszxtbevo) == wkgbmnqykc.iobyxmoadg.SUCCESS || iobyxmoadgVar == iobyxmoadgVar3);
    }

    private boolean wflxmlrfwp() {
        wkgbmnqykc wkgbmnqykcVar = this.f19335zoijcleaow;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.dxjokdxxww(this);
    }

    @Override // c9.ppxfxbqfkf
    public void btonecajqb() {
        synchronized (this.f19332iobyxmoadg) {
            try {
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f19330eablkybsjg;
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.RUNNING;
                if (iobyxmoadgVar != iobyxmoadgVar2) {
                    this.f19330eablkybsjg = iobyxmoadgVar2;
                    this.f19333ppxfxbqfkf.btonecajqb();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.ppxfxbqfkf
    public void clear() {
        synchronized (this.f19332iobyxmoadg) {
            try {
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.iobyxmoadg.CLEARED;
                this.f19330eablkybsjg = iobyxmoadgVar;
                this.f19333ppxfxbqfkf.clear();
                if (this.f19331gxszxtbevo != iobyxmoadgVar) {
                    this.f19331gxszxtbevo = iobyxmoadgVar;
                    this.f19334wkgbmnqykc.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.wkgbmnqykc
    public boolean dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13;
        synchronized (this.f19332iobyxmoadg) {
            try {
                z13 = wflxmlrfwp() && gtknphoqwx(ppxfxbqfkfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // c9.ppxfxbqfkf
    public boolean eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar) {
        if (!(ppxfxbqfkfVar instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) ppxfxbqfkfVar;
        return this.f19333ppxfxbqfkf.eablkybsjg(zoijcleaowVar.f19333ppxfxbqfkf) && this.f19334wkgbmnqykc.eablkybsjg(zoijcleaowVar.f19334wkgbmnqykc);
    }

    @Override // c9.wkgbmnqykc
    public wkgbmnqykc getRoot() {
        wkgbmnqykc root;
        synchronized (this.f19332iobyxmoadg) {
            try {
                wkgbmnqykc wkgbmnqykcVar = this.f19335zoijcleaow;
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
        synchronized (this.f19332iobyxmoadg) {
            try {
                z13 = draadjrbmk() && ppxfxbqfkfVar.equals(this.f19333ppxfxbqfkf);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // c9.ppxfxbqfkf
    public boolean iobyxmoadg() {
        boolean z13;
        synchronized (this.f19332iobyxmoadg) {
            try {
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f19330eablkybsjg;
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.SUCCESS;
                z13 = iobyxmoadgVar == iobyxmoadgVar2 || this.f19331gxszxtbevo == iobyxmoadgVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // c9.ppxfxbqfkf
    public boolean isRunning() {
        boolean z13;
        synchronized (this.f19332iobyxmoadg) {
            try {
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f19330eablkybsjg;
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.RUNNING;
                z13 = iobyxmoadgVar == iobyxmoadgVar2 || this.f19331gxszxtbevo == iobyxmoadgVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // c9.wkgbmnqykc
    public void lqeggnwhkg(ppxfxbqfkf ppxfxbqfkfVar) {
        synchronized (this.f19332iobyxmoadg) {
            try {
                if (ppxfxbqfkfVar.equals(this.f19333ppxfxbqfkf)) {
                    this.f19330eablkybsjg = wkgbmnqykc.iobyxmoadg.SUCCESS;
                } else if (ppxfxbqfkfVar.equals(this.f19334wkgbmnqykc)) {
                    this.f19331gxszxtbevo = wkgbmnqykc.iobyxmoadg.SUCCESS;
                }
                wkgbmnqykc wkgbmnqykcVar = this.f19335zoijcleaow;
                if (wkgbmnqykcVar != null) {
                    wkgbmnqykcVar.lqeggnwhkg(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.ppxfxbqfkf
    public boolean nufgyqmvbu() {
        boolean z13;
        synchronized (this.f19332iobyxmoadg) {
            try {
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f19330eablkybsjg;
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.CLEARED;
                z13 = iobyxmoadgVar == iobyxmoadgVar2 && this.f19331gxszxtbevo == iobyxmoadgVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    public void ojitshcjhn(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        this.f19333ppxfxbqfkf = ppxfxbqfkfVar;
        this.f19334wkgbmnqykc = ppxfxbqfkfVar2;
    }

    @Override // c9.ppxfxbqfkf
    public void pause() {
        synchronized (this.f19332iobyxmoadg) {
            try {
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f19330eablkybsjg;
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.RUNNING;
                if (iobyxmoadgVar == iobyxmoadgVar2) {
                    this.f19330eablkybsjg = wkgbmnqykc.iobyxmoadg.PAUSED;
                    this.f19333ppxfxbqfkf.pause();
                }
                if (this.f19331gxszxtbevo == iobyxmoadgVar2) {
                    this.f19331gxszxtbevo = wkgbmnqykc.iobyxmoadg.PAUSED;
                    this.f19334wkgbmnqykc.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.wkgbmnqykc
    public void ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        synchronized (this.f19332iobyxmoadg) {
            try {
                if (ppxfxbqfkfVar.equals(this.f19334wkgbmnqykc)) {
                    this.f19331gxszxtbevo = wkgbmnqykc.iobyxmoadg.FAILED;
                    wkgbmnqykc wkgbmnqykcVar = this.f19335zoijcleaow;
                    if (wkgbmnqykcVar != null) {
                        wkgbmnqykcVar.ppxfxbqfkf(this);
                    }
                    return;
                }
                this.f19330eablkybsjg = wkgbmnqykc.iobyxmoadg.FAILED;
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f19331gxszxtbevo;
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.RUNNING;
                if (iobyxmoadgVar != iobyxmoadgVar2) {
                    this.f19331gxszxtbevo = iobyxmoadgVar2;
                    this.f19334wkgbmnqykc.btonecajqb();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c9.wkgbmnqykc
    public boolean wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
        boolean zAgtfadlqog;
        synchronized (this.f19332iobyxmoadg) {
            zAgtfadlqog = agtfadlqog();
        }
        return zAgtfadlqog;
    }

    @Override // c9.wkgbmnqykc, c9.ppxfxbqfkf
    public boolean zoijcleaow() {
        boolean z13;
        synchronized (this.f19332iobyxmoadg) {
            try {
                z13 = this.f19333ppxfxbqfkf.zoijcleaow() || this.f19334wkgbmnqykc.zoijcleaow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }
}

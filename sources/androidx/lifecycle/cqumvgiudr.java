package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class cqumvgiudr {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    static final Object f9425gtknphoqwx = new Object();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final Runnable f9426btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f9427dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private volatile Object f9428eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    volatile Object f9429gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Object f9430iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f9431lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f9432nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f9433ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f9434wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private agtfadlqog.zoijcleaow f9435zoijcleaow;

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (cqumvgiudr.this.f9430iobyxmoadg) {
                obj = cqumvgiudr.this.f9429gxszxtbevo;
                cqumvgiudr.this.f9429gxszxtbevo = cqumvgiudr.f9425gtknphoqwx;
            }
            cqumvgiudr.this.ojitshcjhn(obj);
        }
    }

    class ppxfxbqfkf extends wkgbmnqykc implements agtfadlqog {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final vdvldrhtss f9437cqumvgiudr;

        ppxfxbqfkf(vdvldrhtss vdvldrhtssVar, zynmafqrjb zynmafqrjbVar) {
            super(zynmafqrjbVar);
            this.f9437cqumvgiudr = vdvldrhtssVar;
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(vdvldrhtss vdvldrhtssVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwx.zoijcleaow zoijcleaowVarZoijcleaow = this.f9437cqumvgiudr.getLifecycle().zoijcleaow();
            if (zoijcleaowVarZoijcleaow == gtknphoqwx.zoijcleaow.DESTROYED) {
                cqumvgiudr.this.agtfadlqog(this.f9442zdlpuopuiu);
                return;
            }
            gtknphoqwx.zoijcleaow zoijcleaowVar = null;
            while (zoijcleaowVar != zoijcleaowVarZoijcleaow) {
                iobyxmoadg(wkgbmnqykc());
                zoijcleaowVar = zoijcleaowVarZoijcleaow;
                zoijcleaowVarZoijcleaow = this.f9437cqumvgiudr.getLifecycle().zoijcleaow();
            }
        }

        @Override // androidx.lifecycle.cqumvgiudr.wkgbmnqykc
        boolean ppxfxbqfkf(vdvldrhtss vdvldrhtssVar) {
            return this.f9437cqumvgiudr == vdvldrhtssVar;
        }

        @Override // androidx.lifecycle.cqumvgiudr.wkgbmnqykc
        boolean wkgbmnqykc() {
            return this.f9437cqumvgiudr.getLifecycle().zoijcleaow().wkgbmnqykc(gtknphoqwx.zoijcleaow.STARTED);
        }

        @Override // androidx.lifecycle.cqumvgiudr.wkgbmnqykc
        void zoijcleaow() {
            this.f9437cqumvgiudr.getLifecycle().wkgbmnqykc(this);
        }
    }

    private abstract class wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f9440jyumaefscl = -1;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f9441yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final zynmafqrjb f9442zdlpuopuiu;

        wkgbmnqykc(zynmafqrjb zynmafqrjbVar) {
            this.f9442zdlpuopuiu = zynmafqrjbVar;
        }

        void iobyxmoadg(boolean z13) {
            if (z13 == this.f9441yggfygwlhe) {
                return;
            }
            this.f9441yggfygwlhe = z13;
            cqumvgiudr.this.ppxfxbqfkf(z13 ? 1 : -1);
            if (this.f9441yggfygwlhe) {
                cqumvgiudr.this.eablkybsjg(this);
            }
        }

        boolean ppxfxbqfkf(vdvldrhtss vdvldrhtssVar) {
            return false;
        }

        abstract boolean wkgbmnqykc();

        void zoijcleaow() {
        }
    }

    private class zoijcleaow extends wkgbmnqykc {
        zoijcleaow(zynmafqrjb zynmafqrjbVar) {
            super(zynmafqrjbVar);
        }

        @Override // androidx.lifecycle.cqumvgiudr.wkgbmnqykc
        boolean wkgbmnqykc() {
            return true;
        }
    }

    public cqumvgiudr(Object obj) {
        this.f9430iobyxmoadg = new Object();
        this.f9435zoijcleaow = new agtfadlqog.zoijcleaow();
        this.f9433ppxfxbqfkf = 0;
        this.f9429gxszxtbevo = f9425gtknphoqwx;
        this.f9426btonecajqb = new iobyxmoadg();
        this.f9428eablkybsjg = obj;
        this.f9431lqeggnwhkg = 0;
    }

    private void wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar.f9441yggfygwlhe) {
            if (!wkgbmnqykcVar.wkgbmnqykc()) {
                wkgbmnqykcVar.iobyxmoadg(false);
                return;
            }
            int i13 = wkgbmnqykcVar.f9440jyumaefscl;
            int i14 = this.f9431lqeggnwhkg;
            if (i13 >= i14) {
                return;
            }
            wkgbmnqykcVar.f9440jyumaefscl = i14;
            wkgbmnqykcVar.f9442zdlpuopuiu.iobyxmoadg(this.f9428eablkybsjg);
        }
    }

    static void zoijcleaow(String str) {
        if (wflxmlrfwp.ppxfxbqfkf.nufgyqmvbu().ppxfxbqfkf()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void agtfadlqog(zynmafqrjb zynmafqrjbVar) {
        zoijcleaow("removeObserver");
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f9435zoijcleaow.dxjokdxxww(zynmafqrjbVar);
        if (wkgbmnqykcVar == null) {
            return;
        }
        wkgbmnqykcVar.zoijcleaow();
        wkgbmnqykcVar.iobyxmoadg(false);
    }

    public void btonecajqb(zynmafqrjb zynmafqrjbVar) {
        zoijcleaow("observeForever");
        zoijcleaow zoijcleaowVar = new zoijcleaow(zynmafqrjbVar);
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f9435zoijcleaow.gxszxtbevo(zynmafqrjbVar, zoijcleaowVar);
        if (wkgbmnqykcVar instanceof ppxfxbqfkf) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (wkgbmnqykcVar != null) {
            return;
        }
        zoijcleaowVar.iobyxmoadg(true);
    }

    protected void draadjrbmk() {
    }

    public void dxjokdxxww(vdvldrhtss vdvldrhtssVar, zynmafqrjb zynmafqrjbVar) {
        zoijcleaow("observe");
        if (vdvldrhtssVar.getLifecycle().zoijcleaow() == gtknphoqwx.zoijcleaow.DESTROYED) {
            return;
        }
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(vdvldrhtssVar, zynmafqrjbVar);
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f9435zoijcleaow.gxszxtbevo(zynmafqrjbVar, ppxfxbqfkfVar);
        if (wkgbmnqykcVar != null && !wkgbmnqykcVar.ppxfxbqfkf(vdvldrhtssVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (wkgbmnqykcVar != null) {
            return;
        }
        vdvldrhtssVar.getLifecycle().iobyxmoadg(ppxfxbqfkfVar);
    }

    void eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
        if (this.f9432nufgyqmvbu) {
            this.f9427dxjokdxxww = true;
            return;
        }
        this.f9432nufgyqmvbu = true;
        do {
            this.f9427dxjokdxxww = false;
            if (wkgbmnqykcVar != null) {
                wkgbmnqykc(wkgbmnqykcVar);
                wkgbmnqykcVar = null;
            } else {
                agtfadlqog.zoijcleaow.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = this.f9435zoijcleaow.ppxfxbqfkf();
                while (wkgbmnqykcVarPpxfxbqfkf.hasNext()) {
                    wkgbmnqykc((wkgbmnqykc) ((Map.Entry) wkgbmnqykcVarPpxfxbqfkf.next()).getValue());
                    if (this.f9427dxjokdxxww) {
                        break;
                    }
                }
            }
        } while (this.f9427dxjokdxxww);
        this.f9432nufgyqmvbu = false;
    }

    protected void gtknphoqwx() {
    }

    public Object gxszxtbevo() {
        Object obj = this.f9428eablkybsjg;
        if (obj != f9425gtknphoqwx) {
            return obj;
        }
        return null;
    }

    int lqeggnwhkg() {
        return this.f9431lqeggnwhkg;
    }

    public boolean nufgyqmvbu() {
        return this.f9433ppxfxbqfkf > 0;
    }

    protected void ojitshcjhn(Object obj) {
        zoijcleaow("setValue");
        this.f9431lqeggnwhkg++;
        this.f9428eablkybsjg = obj;
        eablkybsjg(null);
    }

    void ppxfxbqfkf(int i13) {
        int i14 = this.f9433ppxfxbqfkf;
        this.f9433ppxfxbqfkf = i13 + i14;
        if (this.f9434wkgbmnqykc) {
            return;
        }
        this.f9434wkgbmnqykc = true;
        while (true) {
            try {
                int i15 = this.f9433ppxfxbqfkf;
                if (i14 == i15) {
                    this.f9434wkgbmnqykc = false;
                    return;
                }
                boolean z13 = i14 == 0 && i15 > 0;
                boolean z14 = i14 > 0 && i15 == 0;
                if (z13) {
                    gtknphoqwx();
                } else if (z14) {
                    draadjrbmk();
                }
                i14 = i15;
            } catch (Throwable th2) {
                this.f9434wkgbmnqykc = false;
                throw th2;
            }
        }
    }

    protected void wflxmlrfwp(Object obj) {
        boolean z13;
        synchronized (this.f9430iobyxmoadg) {
            z13 = this.f9429gxszxtbevo == f9425gtknphoqwx;
            this.f9429gxszxtbevo = obj;
        }
        if (z13) {
            wflxmlrfwp.ppxfxbqfkf.nufgyqmvbu().wkgbmnqykc(this.f9426btonecajqb);
        }
    }

    public cqumvgiudr() {
        this.f9430iobyxmoadg = new Object();
        this.f9435zoijcleaow = new agtfadlqog.zoijcleaow();
        this.f9433ppxfxbqfkf = 0;
        Object obj = f9425gtknphoqwx;
        this.f9429gxszxtbevo = obj;
        this.f9426btonecajqb = new iobyxmoadg();
        this.f9428eablkybsjg = obj;
        this.f9431lqeggnwhkg = -1;
    }
}

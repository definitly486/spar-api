package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
class gtknphoqwx implements nufgyqmvbu.zoijcleaow, h9.iobyxmoadg.gxszxtbevo {

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private static final ppxfxbqfkf f20844tzroggbefp = new ppxfxbqfkf();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final AtomicInteger f20845cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f20846cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ppxfxbqfkf f20847cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    ojitshcjhn f20848dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final draadjrbmk f20849esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    l8.iobyxmoadg f20850hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    GlideException f20851hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f20852iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final q8.iobyxmoadg f20853istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final u1.eablkybsjg f20854iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f20855jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ojitshcjhn.iobyxmoadg f20856jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f20857kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final q8.iobyxmoadg f20858lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f20859lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private n8.ppxfxbqfkf f20860pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final q8.iobyxmoadg f20861pmvmpeiblj;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private volatile boolean f20862stevsuqkhv;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f20863wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private nufgyqmvbu f20864wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private l8.eablkybsjg f20865yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final h9.ppxfxbqfkf f20866yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private boolean f20867ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final eablkybsjg f20868zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final q8.iobyxmoadg f20869zynmafqrjb;

    static final class eablkybsjg implements Iterable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final List f20870zdlpuopuiu;

        eablkybsjg() {
            this(new ArrayList(2));
        }

        private static wkgbmnqykc wkgbmnqykc(c9.lqeggnwhkg lqeggnwhkgVar) {
            return new wkgbmnqykc(lqeggnwhkgVar, g9.eablkybsjg.iobyxmoadg());
        }

        void clear() {
            this.f20870zdlpuopuiu.clear();
        }

        void eablkybsjg(c9.lqeggnwhkg lqeggnwhkgVar) {
            this.f20870zdlpuopuiu.remove(wkgbmnqykc(lqeggnwhkgVar));
        }

        void iobyxmoadg(c9.lqeggnwhkg lqeggnwhkgVar, Executor executor) {
            this.f20870zdlpuopuiu.add(new wkgbmnqykc(lqeggnwhkgVar, executor));
        }

        boolean isEmpty() {
            return this.f20870zdlpuopuiu.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f20870zdlpuopuiu.iterator();
        }

        eablkybsjg ppxfxbqfkf() {
            return new eablkybsjg(new ArrayList(this.f20870zdlpuopuiu));
        }

        int size() {
            return this.f20870zdlpuopuiu.size();
        }

        boolean zoijcleaow(c9.lqeggnwhkg lqeggnwhkgVar) {
            return this.f20870zdlpuopuiu.contains(wkgbmnqykc(lqeggnwhkgVar));
        }

        eablkybsjg(List list) {
            this.f20870zdlpuopuiu = list;
        }
    }

    private class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final c9.lqeggnwhkg f20872zdlpuopuiu;

        iobyxmoadg(c9.lqeggnwhkg lqeggnwhkgVar) {
            this.f20872zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f20872zdlpuopuiu.lqeggnwhkg()) {
                synchronized (gtknphoqwx.this) {
                    try {
                        if (gtknphoqwx.this.f20868zdlpuopuiu.zoijcleaow(this.f20872zdlpuopuiu)) {
                            gtknphoqwx.this.gxszxtbevo(this.f20872zdlpuopuiu);
                        }
                        gtknphoqwx.this.dxjokdxxww();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    static class ppxfxbqfkf {
        ppxfxbqfkf() {
        }

        public ojitshcjhn iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, l8.eablkybsjg eablkybsjgVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar) {
            return new ojitshcjhn(ppxfxbqfkfVar, z13, true, eablkybsjgVar, iobyxmoadgVar);
        }
    }

    static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final c9.lqeggnwhkg f20873iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Executor f20874zoijcleaow;

        wkgbmnqykc(c9.lqeggnwhkg lqeggnwhkgVar, Executor executor) {
            this.f20873iobyxmoadg = lqeggnwhkgVar;
            this.f20874zoijcleaow = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof wkgbmnqykc) {
                return this.f20873iobyxmoadg.equals(((wkgbmnqykc) obj).f20873iobyxmoadg);
            }
            return false;
        }

        public int hashCode() {
            return this.f20873iobyxmoadg.hashCode();
        }
    }

    private class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final c9.lqeggnwhkg f20876zdlpuopuiu;

        zoijcleaow(c9.lqeggnwhkg lqeggnwhkgVar) {
            this.f20876zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f20876zdlpuopuiu.lqeggnwhkg()) {
                synchronized (gtknphoqwx.this) {
                    try {
                        if (gtknphoqwx.this.f20868zdlpuopuiu.zoijcleaow(this.f20876zdlpuopuiu)) {
                            gtknphoqwx.this.f20848dsvhmnatus.iobyxmoadg();
                            gtknphoqwx.this.lqeggnwhkg(this.f20876zdlpuopuiu);
                            gtknphoqwx.this.oxmwwwfdhm(this.f20876zdlpuopuiu);
                        }
                        gtknphoqwx.this.dxjokdxxww();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    gtknphoqwx(q8.iobyxmoadg iobyxmoadgVar, q8.iobyxmoadg iobyxmoadgVar2, q8.iobyxmoadg iobyxmoadgVar3, q8.iobyxmoadg iobyxmoadgVar4, draadjrbmk draadjrbmkVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar5, u1.eablkybsjg eablkybsjgVar) {
        this(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, draadjrbmkVar, iobyxmoadgVar5, eablkybsjgVar, f20844tzroggbefp);
    }

    private q8.iobyxmoadg btonecajqb() {
        if (this.f20859lmojexxdyd) {
            return this.f20869zynmafqrjb;
        }
        return this.f20863wwaezpbzkn ? this.f20853istkbnxepw : this.f20861pmvmpeiblj;
    }

    private synchronized void vdvldrhtss() {
        if (this.f20865yadqdtsiqt == null) {
            throw new IllegalArgumentException();
        }
        this.f20868zdlpuopuiu.clear();
        this.f20865yadqdtsiqt = null;
        this.f20848dsvhmnatus = null;
        this.f20860pkzmftpjix = null;
        this.f20846cllcsxoeiz = false;
        this.f20862stevsuqkhv = false;
        this.f20855jpowsppfya = false;
        this.f20857kegysxyocb = false;
        this.f20864wypolnanlu.cqumvgiudr(false);
        this.f20864wypolnanlu = null;
        this.f20851hkdspvbjdz = null;
        this.f20850hcddaimhww = null;
        this.f20854iwizpuwonk.iobyxmoadg(this);
    }

    private boolean wflxmlrfwp() {
        return this.f20846cllcsxoeiz || this.f20855jpowsppfya || this.f20862stevsuqkhv;
    }

    void agtfadlqog() {
        synchronized (this) {
            try {
                this.f20866yggfygwlhe.ppxfxbqfkf();
                if (this.f20862stevsuqkhv) {
                    vdvldrhtss();
                    return;
                }
                if (this.f20868zdlpuopuiu.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f20846cllcsxoeiz) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f20846cllcsxoeiz = true;
                l8.eablkybsjg eablkybsjgVar = this.f20865yadqdtsiqt;
                eablkybsjg<wkgbmnqykc> eablkybsjgVarPpxfxbqfkf = this.f20868zdlpuopuiu.ppxfxbqfkf();
                gtknphoqwx(eablkybsjgVarPpxfxbqfkf.size() + 1);
                this.f20849esjtqupxsv.ppxfxbqfkf(this, eablkybsjgVar, null);
                for (wkgbmnqykc wkgbmnqykcVar : eablkybsjgVarPpxfxbqfkf) {
                    wkgbmnqykcVar.f20874zoijcleaow.execute(new iobyxmoadg(wkgbmnqykcVar.f20873iobyxmoadg));
                }
                dxjokdxxww();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    synchronized gtknphoqwx draadjrbmk(l8.eablkybsjg eablkybsjgVar, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f20865yadqdtsiqt = eablkybsjgVar;
        this.f20852iozdgvuglv = z13;
        this.f20859lmojexxdyd = z14;
        this.f20863wwaezpbzkn = z15;
        this.f20867ylkuphrtab = z16;
        return this;
    }

    void dxjokdxxww() {
        ojitshcjhn ojitshcjhnVar;
        synchronized (this) {
            try {
                this.f20866yggfygwlhe.ppxfxbqfkf();
                g9.gtknphoqwx.zoijcleaow(wflxmlrfwp(), "Not yet complete!");
                int iDecrementAndGet = this.f20845cdpycssgdh.decrementAndGet();
                g9.gtknphoqwx.zoijcleaow(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    ojitshcjhnVar = this.f20848dsvhmnatus;
                    vdvldrhtss();
                } else {
                    ojitshcjhnVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.gxszxtbevo();
        }
    }

    @Override // h9.iobyxmoadg.gxszxtbevo
    public h9.ppxfxbqfkf eablkybsjg() {
        return this.f20866yggfygwlhe;
    }

    synchronized void gtknphoqwx(int i13) {
        ojitshcjhn ojitshcjhnVar;
        g9.gtknphoqwx.zoijcleaow(wflxmlrfwp(), "Not yet complete!");
        if (this.f20845cdpycssgdh.getAndAdd(i13) == 0 && (ojitshcjhnVar = this.f20848dsvhmnatus) != null) {
            ojitshcjhnVar.iobyxmoadg();
        }
    }

    void gxszxtbevo(c9.lqeggnwhkg lqeggnwhkgVar) {
        try {
            lqeggnwhkgVar.ppxfxbqfkf(this.f20851hkdspvbjdz);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.zoijcleaow(th2);
        }
    }

    @Override // com.bumptech.glide.load.engine.nufgyqmvbu.zoijcleaow
    public void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        btonecajqb().execute(nufgyqmvbuVar);
    }

    public synchronized void kcexrzcfyt(nufgyqmvbu nufgyqmvbuVar) {
        try {
            this.f20864wypolnanlu = nufgyqmvbuVar;
            (nufgyqmvbuVar.yadqdtsiqt() ? this.f20858lereixgezr : btonecajqb()).execute(nufgyqmvbuVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void lqeggnwhkg(c9.lqeggnwhkg lqeggnwhkgVar) {
        try {
            lqeggnwhkgVar.wkgbmnqykc(this.f20848dsvhmnatus, this.f20850hcddaimhww, this.f20857kegysxyocb);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.zoijcleaow(th2);
        }
    }

    void nufgyqmvbu() {
        if (wflxmlrfwp()) {
            return;
        }
        this.f20862stevsuqkhv = true;
        this.f20864wypolnanlu.zoijcleaow();
        this.f20849esjtqupxsv.zoijcleaow(this, this.f20865yadqdtsiqt);
    }

    void ojitshcjhn() {
        synchronized (this) {
            try {
                this.f20866yggfygwlhe.ppxfxbqfkf();
                if (this.f20862stevsuqkhv) {
                    this.f20860pkzmftpjix.zoijcleaow();
                    vdvldrhtss();
                    return;
                }
                if (this.f20868zdlpuopuiu.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f20855jpowsppfya) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f20848dsvhmnatus = this.f20847cqumvgiudr.iobyxmoadg(this.f20860pkzmftpjix, this.f20852iozdgvuglv, this.f20865yadqdtsiqt, this.f20856jyumaefscl);
                this.f20855jpowsppfya = true;
                eablkybsjg<wkgbmnqykc> eablkybsjgVarPpxfxbqfkf = this.f20868zdlpuopuiu.ppxfxbqfkf();
                gtknphoqwx(eablkybsjgVarPpxfxbqfkf.size() + 1);
                this.f20849esjtqupxsv.ppxfxbqfkf(this, this.f20865yadqdtsiqt, this.f20848dsvhmnatus);
                for (wkgbmnqykc wkgbmnqykcVar : eablkybsjgVarPpxfxbqfkf) {
                    wkgbmnqykcVar.f20874zoijcleaow.execute(new zoijcleaow(wkgbmnqykcVar.f20873iobyxmoadg));
                }
                dxjokdxxww();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    synchronized void oxmwwwfdhm(c9.lqeggnwhkg lqeggnwhkgVar) {
        try {
            this.f20866yggfygwlhe.ppxfxbqfkf();
            this.f20868zdlpuopuiu.eablkybsjg(lqeggnwhkgVar);
            if (this.f20868zdlpuopuiu.isEmpty()) {
                nufgyqmvbu();
                if (this.f20855jpowsppfya || this.f20846cllcsxoeiz) {
                    if (this.f20845cdpycssgdh.get() == 0) {
                        vdvldrhtss();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.nufgyqmvbu.zoijcleaow
    public void ppxfxbqfkf(GlideException glideException) {
        synchronized (this) {
            this.f20851hkdspvbjdz = glideException;
        }
        agtfadlqog();
    }

    boolean rgvfuqvkyq() {
        return this.f20867ylkuphrtab;
    }

    @Override // com.bumptech.glide.load.engine.nufgyqmvbu.zoijcleaow
    public void wkgbmnqykc(n8.ppxfxbqfkf ppxfxbqfkfVar, l8.iobyxmoadg iobyxmoadgVar, boolean z13) {
        synchronized (this) {
            this.f20860pkzmftpjix = ppxfxbqfkfVar;
            this.f20850hcddaimhww = iobyxmoadgVar;
            this.f20857kegysxyocb = z13;
        }
        ojitshcjhn();
    }

    synchronized void zoijcleaow(c9.lqeggnwhkg lqeggnwhkgVar, Executor executor) {
        try {
            this.f20866yggfygwlhe.ppxfxbqfkf();
            this.f20868zdlpuopuiu.iobyxmoadg(lqeggnwhkgVar, executor);
            if (this.f20855jpowsppfya) {
                gtknphoqwx(1);
                executor.execute(new zoijcleaow(lqeggnwhkgVar));
            } else if (this.f20846cllcsxoeiz) {
                gtknphoqwx(1);
                executor.execute(new iobyxmoadg(lqeggnwhkgVar));
            } else {
                g9.gtknphoqwx.zoijcleaow(!this.f20862stevsuqkhv, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    gtknphoqwx(q8.iobyxmoadg iobyxmoadgVar, q8.iobyxmoadg iobyxmoadgVar2, q8.iobyxmoadg iobyxmoadgVar3, q8.iobyxmoadg iobyxmoadgVar4, draadjrbmk draadjrbmkVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar5, u1.eablkybsjg eablkybsjgVar, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f20868zdlpuopuiu = new eablkybsjg();
        this.f20866yggfygwlhe = h9.ppxfxbqfkf.iobyxmoadg();
        this.f20845cdpycssgdh = new AtomicInteger();
        this.f20858lereixgezr = iobyxmoadgVar;
        this.f20861pmvmpeiblj = iobyxmoadgVar2;
        this.f20869zynmafqrjb = iobyxmoadgVar3;
        this.f20853istkbnxepw = iobyxmoadgVar4;
        this.f20849esjtqupxsv = draadjrbmkVar;
        this.f20856jyumaefscl = iobyxmoadgVar5;
        this.f20854iwizpuwonk = eablkybsjgVar;
        this.f20847cqumvgiudr = ppxfxbqfkfVar;
    }
}

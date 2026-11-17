package com.bumptech.glide.load.engine;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb implements draadjrbmk, p8.nufgyqmvbu.iobyxmoadg, ojitshcjhn.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final boolean f20810dxjokdxxww = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yggfygwlhe f20811eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ppxfxbqfkf f20812gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rgvfuqvkyq f20813iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final iobyxmoadg f20814lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.iobyxmoadg f20815nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final p8.nufgyqmvbu f20816ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f20817wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final agtfadlqog f20818zoijcleaow;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final nufgyqmvbu.eablkybsjg f20819iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f20820ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final u1.eablkybsjg f20821zoijcleaow = h9.iobyxmoadg.wkgbmnqykc(150, new C0382iobyxmoadg());

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.btonecajqb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C0382iobyxmoadg implements h9.iobyxmoadg.wkgbmnqykc {
            C0382iobyxmoadg() {
            }

            @Override // h9.iobyxmoadg.wkgbmnqykc
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public nufgyqmvbu iobyxmoadg() {
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                return new nufgyqmvbu(iobyxmoadgVar.f20819iobyxmoadg, iobyxmoadgVar.f20821zoijcleaow);
            }
        }

        iobyxmoadg(nufgyqmvbu.eablkybsjg eablkybsjgVar) {
            this.f20819iobyxmoadg = eablkybsjgVar;
        }

        nufgyqmvbu iobyxmoadg(com.bumptech.glide.wkgbmnqykc wkgbmnqykcVar, Object obj, wflxmlrfwp wflxmlrfwpVar, l8.eablkybsjg eablkybsjgVar, int i13, int i14, Class cls, Class cls2, com.bumptech.glide.btonecajqb btonecajqbVar, n8.iobyxmoadg iobyxmoadgVar, Map map, boolean z13, boolean z14, boolean z15, l8.lqeggnwhkg lqeggnwhkgVar, nufgyqmvbu.zoijcleaow zoijcleaowVar) {
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) g9.gtknphoqwx.eablkybsjg((nufgyqmvbu) this.f20821zoijcleaow.zoijcleaow());
            int i15 = this.f20820ppxfxbqfkf;
            this.f20820ppxfxbqfkf = i15 + 1;
            return nufgyqmvbuVar.agtfadlqog(wkgbmnqykcVar, obj, wflxmlrfwpVar, eablkybsjgVar, i13, i14, cls, cls2, btonecajqbVar, iobyxmoadgVar, map, z13, z14, z15, lqeggnwhkgVar, zoijcleaowVar, i15);
        }
    }

    private static class ppxfxbqfkf implements nufgyqmvbu.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final p8.iobyxmoadg.InterfaceC1675iobyxmoadg f20823iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private volatile p8.iobyxmoadg f20824zoijcleaow;

        ppxfxbqfkf(p8.iobyxmoadg.InterfaceC1675iobyxmoadg interfaceC1675iobyxmoadg) {
            this.f20823iobyxmoadg = interfaceC1675iobyxmoadg;
        }

        @Override // com.bumptech.glide.load.engine.nufgyqmvbu.eablkybsjg
        public p8.iobyxmoadg iobyxmoadg() {
            if (this.f20824zoijcleaow == null) {
                synchronized (this) {
                    try {
                        if (this.f20824zoijcleaow == null) {
                            this.f20824zoijcleaow = this.f20823iobyxmoadg.build();
                        }
                        if (this.f20824zoijcleaow == null) {
                            this.f20824zoijcleaow = new p8.zoijcleaow();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f20824zoijcleaow;
        }
    }

    public class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gtknphoqwx f20825iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final c9.lqeggnwhkg f20827zoijcleaow;

        wkgbmnqykc(c9.lqeggnwhkg lqeggnwhkgVar, gtknphoqwx gtknphoqwxVar) {
            this.f20827zoijcleaow = lqeggnwhkgVar;
            this.f20825iobyxmoadg = gtknphoqwxVar;
        }

        public void iobyxmoadg() {
            synchronized (btonecajqb.this) {
                this.f20825iobyxmoadg.oxmwwwfdhm(this.f20827zoijcleaow);
            }
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final draadjrbmk f20828eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final ojitshcjhn.iobyxmoadg f20829gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final q8.iobyxmoadg f20830iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        final u1.eablkybsjg f20831lqeggnwhkg = h9.iobyxmoadg.wkgbmnqykc(150, new iobyxmoadg());

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final q8.iobyxmoadg f20832ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final q8.iobyxmoadg f20833wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final q8.iobyxmoadg f20834zoijcleaow;

        class iobyxmoadg implements h9.iobyxmoadg.wkgbmnqykc {
            iobyxmoadg() {
            }

            @Override // h9.iobyxmoadg.wkgbmnqykc
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public gtknphoqwx iobyxmoadg() {
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                return new gtknphoqwx(zoijcleaowVar.f20830iobyxmoadg, zoijcleaowVar.f20834zoijcleaow, zoijcleaowVar.f20832ppxfxbqfkf, zoijcleaowVar.f20833wkgbmnqykc, zoijcleaowVar.f20828eablkybsjg, zoijcleaowVar.f20829gxszxtbevo, zoijcleaowVar.f20831lqeggnwhkg);
            }
        }

        zoijcleaow(q8.iobyxmoadg iobyxmoadgVar, q8.iobyxmoadg iobyxmoadgVar2, q8.iobyxmoadg iobyxmoadgVar3, q8.iobyxmoadg iobyxmoadgVar4, draadjrbmk draadjrbmkVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar5) {
            this.f20830iobyxmoadg = iobyxmoadgVar;
            this.f20834zoijcleaow = iobyxmoadgVar2;
            this.f20832ppxfxbqfkf = iobyxmoadgVar3;
            this.f20833wkgbmnqykc = iobyxmoadgVar4;
            this.f20828eablkybsjg = draadjrbmkVar;
            this.f20829gxszxtbevo = iobyxmoadgVar5;
        }

        gtknphoqwx iobyxmoadg(l8.eablkybsjg eablkybsjgVar, boolean z13, boolean z14, boolean z15, boolean z16) {
            return ((gtknphoqwx) g9.gtknphoqwx.eablkybsjg((gtknphoqwx) this.f20831lqeggnwhkg.zoijcleaow())).draadjrbmk(eablkybsjgVar, z13, z14, z15, z16);
        }
    }

    public btonecajqb(p8.nufgyqmvbu nufgyqmvbuVar, p8.iobyxmoadg.InterfaceC1675iobyxmoadg interfaceC1675iobyxmoadg, q8.iobyxmoadg iobyxmoadgVar, q8.iobyxmoadg iobyxmoadgVar2, q8.iobyxmoadg iobyxmoadgVar3, q8.iobyxmoadg iobyxmoadgVar4, boolean z13) {
        this(nufgyqmvbuVar, interfaceC1675iobyxmoadg, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, null, null, null, null, null, null, z13);
    }

    private static void btonecajqb(String str, long j13, l8.eablkybsjg eablkybsjgVar) {
        Log.v("Engine", str + " in " + g9.lqeggnwhkg.iobyxmoadg(j13) + "ms, key: " + eablkybsjgVar);
    }

    private wkgbmnqykc draadjrbmk(com.bumptech.glide.wkgbmnqykc wkgbmnqykcVar, Object obj, l8.eablkybsjg eablkybsjgVar, int i13, int i14, Class cls, Class cls2, com.bumptech.glide.btonecajqb btonecajqbVar, n8.iobyxmoadg iobyxmoadgVar, Map map, boolean z13, boolean z14, l8.lqeggnwhkg lqeggnwhkgVar, boolean z15, boolean z16, boolean z17, boolean z18, c9.lqeggnwhkg lqeggnwhkgVar2, Executor executor, wflxmlrfwp wflxmlrfwpVar, long j13) {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = this.f20813iobyxmoadg.iobyxmoadg(wflxmlrfwpVar, z18);
        if (gtknphoqwxVarIobyxmoadg != null) {
            gtknphoqwxVarIobyxmoadg.zoijcleaow(lqeggnwhkgVar2, executor);
            if (f20810dxjokdxxww) {
                btonecajqb("Added to existing load", j13, wflxmlrfwpVar);
            }
            return new wkgbmnqykc(lqeggnwhkgVar2, gtknphoqwxVarIobyxmoadg);
        }
        gtknphoqwx gtknphoqwxVarIobyxmoadg2 = this.f20817wkgbmnqykc.iobyxmoadg(wflxmlrfwpVar, z15, z16, z17, z18);
        nufgyqmvbu nufgyqmvbuVarIobyxmoadg = this.f20814lqeggnwhkg.iobyxmoadg(wkgbmnqykcVar, obj, wflxmlrfwpVar, eablkybsjgVar, i13, i14, cls, cls2, btonecajqbVar, iobyxmoadgVar, map, z13, z14, z18, lqeggnwhkgVar, gtknphoqwxVarIobyxmoadg2);
        this.f20813iobyxmoadg.ppxfxbqfkf(wflxmlrfwpVar, gtknphoqwxVarIobyxmoadg2);
        gtknphoqwxVarIobyxmoadg2.zoijcleaow(lqeggnwhkgVar2, executor);
        gtknphoqwxVarIobyxmoadg2.kcexrzcfyt(nufgyqmvbuVarIobyxmoadg);
        if (f20810dxjokdxxww) {
            btonecajqb("Started new load", j13, wflxmlrfwpVar);
        }
        return new wkgbmnqykc(lqeggnwhkgVar2, gtknphoqwxVarIobyxmoadg2);
    }

    private ojitshcjhn dxjokdxxww(wflxmlrfwp wflxmlrfwpVar, boolean z13, long j13) {
        if (!z13) {
            return null;
        }
        ojitshcjhn ojitshcjhnVarLqeggnwhkg = lqeggnwhkg(wflxmlrfwpVar);
        if (ojitshcjhnVarLqeggnwhkg != null) {
            if (f20810dxjokdxxww) {
                btonecajqb("Loaded resource from active resources", j13, wflxmlrfwpVar);
            }
            return ojitshcjhnVarLqeggnwhkg;
        }
        ojitshcjhn ojitshcjhnVarNufgyqmvbu = nufgyqmvbu(wflxmlrfwpVar);
        if (ojitshcjhnVarNufgyqmvbu == null) {
            return null;
        }
        if (f20810dxjokdxxww) {
            btonecajqb("Loaded resource from cache", j13, wflxmlrfwpVar);
        }
        return ojitshcjhnVarNufgyqmvbu;
    }

    private ojitshcjhn eablkybsjg(l8.eablkybsjg eablkybsjgVar) {
        n8.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = this.f20816ppxfxbqfkf.wkgbmnqykc(eablkybsjgVar);
        if (ppxfxbqfkfVarWkgbmnqykc == null) {
            return null;
        }
        return ppxfxbqfkfVarWkgbmnqykc instanceof ojitshcjhn ? (ojitshcjhn) ppxfxbqfkfVarWkgbmnqykc : new ojitshcjhn(ppxfxbqfkfVarWkgbmnqykc, true, true, eablkybsjgVar, this);
    }

    private ojitshcjhn lqeggnwhkg(l8.eablkybsjg eablkybsjgVar) {
        ojitshcjhn ojitshcjhnVarEablkybsjg = this.f20815nufgyqmvbu.eablkybsjg(eablkybsjgVar);
        if (ojitshcjhnVarEablkybsjg != null) {
            ojitshcjhnVarEablkybsjg.iobyxmoadg();
        }
        return ojitshcjhnVarEablkybsjg;
    }

    private ojitshcjhn nufgyqmvbu(l8.eablkybsjg eablkybsjgVar) {
        ojitshcjhn ojitshcjhnVarEablkybsjg = eablkybsjg(eablkybsjgVar);
        if (ojitshcjhnVarEablkybsjg != null) {
            ojitshcjhnVarEablkybsjg.iobyxmoadg();
            this.f20815nufgyqmvbu.iobyxmoadg(eablkybsjgVar, ojitshcjhnVarEablkybsjg);
        }
        return ojitshcjhnVarEablkybsjg;
    }

    public void gtknphoqwx(n8.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!(ppxfxbqfkfVar instanceof ojitshcjhn)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((ojitshcjhn) ppxfxbqfkfVar).gxszxtbevo();
    }

    public wkgbmnqykc gxszxtbevo(com.bumptech.glide.wkgbmnqykc wkgbmnqykcVar, Object obj, l8.eablkybsjg eablkybsjgVar, int i13, int i14, Class cls, Class cls2, com.bumptech.glide.btonecajqb btonecajqbVar, n8.iobyxmoadg iobyxmoadgVar, Map map, boolean z13, boolean z14, l8.lqeggnwhkg lqeggnwhkgVar, boolean z15, boolean z16, boolean z17, boolean z18, c9.lqeggnwhkg lqeggnwhkgVar2, Executor executor) {
        long jZoijcleaow = f20810dxjokdxxww ? g9.lqeggnwhkg.zoijcleaow() : 0L;
        wflxmlrfwp wflxmlrfwpVarIobyxmoadg = this.f20818zoijcleaow.iobyxmoadg(obj, eablkybsjgVar, i13, i14, map, cls, cls2, lqeggnwhkgVar);
        synchronized (this) {
            try {
                ojitshcjhn ojitshcjhnVarDxjokdxxww = dxjokdxxww(wflxmlrfwpVarIobyxmoadg, z15, jZoijcleaow);
                if (ojitshcjhnVarDxjokdxxww == null) {
                    return draadjrbmk(wkgbmnqykcVar, obj, eablkybsjgVar, i13, i14, cls, cls2, btonecajqbVar, iobyxmoadgVar, map, z13, z14, lqeggnwhkgVar, z15, z16, z17, z18, lqeggnwhkgVar2, executor, wflxmlrfwpVarIobyxmoadg, jZoijcleaow);
                }
                lqeggnwhkgVar2.wkgbmnqykc(ojitshcjhnVarDxjokdxxww, l8.iobyxmoadg.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.nufgyqmvbu.iobyxmoadg
    public void iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f20811eablkybsjg.iobyxmoadg(ppxfxbqfkfVar, true);
    }

    @Override // com.bumptech.glide.load.engine.draadjrbmk
    public synchronized void ppxfxbqfkf(gtknphoqwx gtknphoqwxVar, l8.eablkybsjg eablkybsjgVar, ojitshcjhn ojitshcjhnVar) {
        if (ojitshcjhnVar != null) {
            try {
                if (ojitshcjhnVar.eablkybsjg()) {
                    this.f20815nufgyqmvbu.iobyxmoadg(eablkybsjgVar, ojitshcjhnVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20813iobyxmoadg.wkgbmnqykc(eablkybsjgVar, gtknphoqwxVar);
    }

    @Override // com.bumptech.glide.load.engine.ojitshcjhn.iobyxmoadg
    public void wkgbmnqykc(l8.eablkybsjg eablkybsjgVar, ojitshcjhn ojitshcjhnVar) {
        this.f20815nufgyqmvbu.wkgbmnqykc(eablkybsjgVar);
        if (ojitshcjhnVar.eablkybsjg()) {
            this.f20816ppxfxbqfkf.ppxfxbqfkf(eablkybsjgVar, ojitshcjhnVar);
        } else {
            this.f20811eablkybsjg.iobyxmoadg(ojitshcjhnVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.draadjrbmk
    public synchronized void zoijcleaow(gtknphoqwx gtknphoqwxVar, l8.eablkybsjg eablkybsjgVar) {
        this.f20813iobyxmoadg.wkgbmnqykc(eablkybsjgVar, gtknphoqwxVar);
    }

    btonecajqb(p8.nufgyqmvbu nufgyqmvbuVar, p8.iobyxmoadg.InterfaceC1675iobyxmoadg interfaceC1675iobyxmoadg, q8.iobyxmoadg iobyxmoadgVar, q8.iobyxmoadg iobyxmoadgVar2, q8.iobyxmoadg iobyxmoadgVar3, q8.iobyxmoadg iobyxmoadgVar4, rgvfuqvkyq rgvfuqvkyqVar, agtfadlqog agtfadlqogVar, com.bumptech.glide.load.engine.iobyxmoadg iobyxmoadgVar5, zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar6, yggfygwlhe yggfygwlheVar, boolean z13) {
        this.f20816ppxfxbqfkf = nufgyqmvbuVar;
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(interfaceC1675iobyxmoadg);
        this.f20812gxszxtbevo = ppxfxbqfkfVar;
        com.bumptech.glide.load.engine.iobyxmoadg iobyxmoadgVar7 = iobyxmoadgVar5 == null ? new com.bumptech.glide.load.engine.iobyxmoadg(z13) : iobyxmoadgVar5;
        this.f20815nufgyqmvbu = iobyxmoadgVar7;
        iobyxmoadgVar7.gxszxtbevo(this);
        this.f20818zoijcleaow = agtfadlqogVar == null ? new agtfadlqog() : agtfadlqogVar;
        this.f20813iobyxmoadg = rgvfuqvkyqVar == null ? new rgvfuqvkyq() : rgvfuqvkyqVar;
        this.f20817wkgbmnqykc = zoijcleaowVar == null ? new zoijcleaow(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, this, this) : zoijcleaowVar;
        this.f20814lqeggnwhkg = iobyxmoadgVar6 == null ? new iobyxmoadg(ppxfxbqfkfVar) : iobyxmoadgVar6;
        this.f20811eablkybsjg = yggfygwlheVar == null ? new yggfygwlhe() : yggfygwlheVar;
        nufgyqmvbuVar.eablkybsjg(this);
    }
}

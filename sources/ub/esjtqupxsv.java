package ub;

/* JADX INFO: loaded from: classes2.dex */
class esjtqupxsv implements tc.zoijcleaow, tc.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final tc.iobyxmoadg.InterfaceC2704iobyxmoadg f113133ppxfxbqfkf = new tc.iobyxmoadg.InterfaceC2704iobyxmoadg() { // from class: ub.jyumaefscl
        @Override // tc.iobyxmoadg.InterfaceC2704iobyxmoadg
        public final void iobyxmoadg(tc.zoijcleaow zoijcleaowVar) {
            esjtqupxsv.gxszxtbevo(zoijcleaowVar);
        }
    };

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final tc.zoijcleaow f113134wkgbmnqykc = new tc.zoijcleaow() { // from class: ub.iwizpuwonk
        @Override // tc.zoijcleaow
        public final Object get() {
            return esjtqupxsv.lqeggnwhkg();
        }
    };

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private tc.iobyxmoadg.InterfaceC2704iobyxmoadg f113135iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile tc.zoijcleaow f113136zoijcleaow;

    private esjtqupxsv(tc.iobyxmoadg.InterfaceC2704iobyxmoadg interfaceC2704iobyxmoadg, tc.zoijcleaow zoijcleaowVar) {
        this.f113135iobyxmoadg = interfaceC2704iobyxmoadg;
        this.f113136zoijcleaow = zoijcleaowVar;
    }

    static esjtqupxsv dxjokdxxww(tc.zoijcleaow zoijcleaowVar) {
        return new esjtqupxsv(null, zoijcleaowVar);
    }

    static esjtqupxsv eablkybsjg() {
        return new esjtqupxsv(f113133ppxfxbqfkf, f113134wkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void gxszxtbevo(tc.zoijcleaow zoijcleaowVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lqeggnwhkg() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void nufgyqmvbu(tc.iobyxmoadg.InterfaceC2704iobyxmoadg interfaceC2704iobyxmoadg, tc.iobyxmoadg.InterfaceC2704iobyxmoadg interfaceC2704iobyxmoadg2, tc.zoijcleaow zoijcleaowVar) {
        interfaceC2704iobyxmoadg.iobyxmoadg(zoijcleaowVar);
        interfaceC2704iobyxmoadg2.iobyxmoadg(zoijcleaowVar);
    }

    void btonecajqb(tc.zoijcleaow zoijcleaowVar) {
        tc.iobyxmoadg.InterfaceC2704iobyxmoadg interfaceC2704iobyxmoadg;
        if (this.f113136zoijcleaow != f113134wkgbmnqykc) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC2704iobyxmoadg = this.f113135iobyxmoadg;
            this.f113135iobyxmoadg = null;
            this.f113136zoijcleaow = zoijcleaowVar;
        }
        interfaceC2704iobyxmoadg.iobyxmoadg(zoijcleaowVar);
    }

    @Override // tc.zoijcleaow
    public Object get() {
        return this.f113136zoijcleaow.get();
    }

    @Override // tc.iobyxmoadg
    public void iobyxmoadg(final tc.iobyxmoadg.InterfaceC2704iobyxmoadg interfaceC2704iobyxmoadg) {
        tc.zoijcleaow zoijcleaowVar;
        tc.zoijcleaow zoijcleaowVar2;
        tc.zoijcleaow zoijcleaowVar3 = this.f113136zoijcleaow;
        tc.zoijcleaow zoijcleaowVar4 = f113134wkgbmnqykc;
        if (zoijcleaowVar3 != zoijcleaowVar4) {
            interfaceC2704iobyxmoadg.iobyxmoadg(zoijcleaowVar3);
            return;
        }
        synchronized (this) {
            zoijcleaowVar = this.f113136zoijcleaow;
            if (zoijcleaowVar != zoijcleaowVar4) {
                zoijcleaowVar2 = zoijcleaowVar;
            } else {
                final tc.iobyxmoadg.InterfaceC2704iobyxmoadg interfaceC2704iobyxmoadg2 = this.f113135iobyxmoadg;
                this.f113135iobyxmoadg = new tc.iobyxmoadg.InterfaceC2704iobyxmoadg() { // from class: ub.cqumvgiudr
                    @Override // tc.iobyxmoadg.InterfaceC2704iobyxmoadg
                    public final void iobyxmoadg(tc.zoijcleaow zoijcleaowVar5) {
                        esjtqupxsv.nufgyqmvbu(interfaceC2704iobyxmoadg2, interfaceC2704iobyxmoadg, zoijcleaowVar5);
                    }
                };
                zoijcleaowVar2 = null;
            }
        }
        if (zoijcleaowVar2 != null) {
            interfaceC2704iobyxmoadg.iobyxmoadg(zoijcleaowVar);
        }
    }
}

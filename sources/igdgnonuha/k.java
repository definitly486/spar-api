package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
final class k {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vipkmwdibw.zoijcleaow f43209eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private metgxyhuhe.dxjokdxxww f43210gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f43211iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private metgxyhuhe.dxjokdxxww f43212lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f43213ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f43214wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f43215zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f43216iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f43218yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f43219zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f43218yggfygwlhe = obj;
            this.f43216iwizpuwonk |= Integer.MIN_VALUE;
            return k.this.zoijcleaow(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f43220jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f43222zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f43222zdlpuopuiu = obj;
            this.f43220jyumaefscl |= Integer.MIN_VALUE;
            return k.this.eablkybsjg(this);
        }
    }

    public /* synthetic */ k(float f13, float f14, float f15, float f16, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f43220jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f43220jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f43222zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f43220jyumaefscl;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                float fWkgbmnqykc = wkgbmnqykc(this.f43212lqeggnwhkg);
                if (!w0.nufgyqmvbu.dxjokdxxww(((w0.nufgyqmvbu) this.f43209eablkybsjg.gtknphoqwx()).draadjrbmk(), fWkgbmnqykc)) {
                    vipkmwdibw.zoijcleaow zoijcleaowVar2 = this.f43209eablkybsjg;
                    w0.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = w0.nufgyqmvbu.wkgbmnqykc(fWkgbmnqykc);
                    zoijcleaowVar.f43220jyumaefscl = 1;
                    if (zoijcleaowVar2.zdlpuopuiu(nufgyqmvbuVarWkgbmnqykc, zoijcleaowVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            this.f43210gxszxtbevo = this.f43212lqeggnwhkg;
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th2) {
            this.f43210gxszxtbevo = this.f43212lqeggnwhkg;
            throw th2;
        }
    }

    private final float wkgbmnqykc(metgxyhuhe.dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.zoijcleaow) {
            return this.f43215zoijcleaow;
        }
        if (dxjokdxxwwVar instanceof metgxyhuhe.lqeggnwhkg) {
            return this.f43213ppxfxbqfkf;
        }
        return dxjokdxxwwVar instanceof metgxyhuhe.wkgbmnqykc ? this.f43214wkgbmnqykc : this.f43211iobyxmoadg;
    }

    public final Object gxszxtbevo(float f13, float f14, float f15, float f16, lg.gxszxtbevo gxszxtbevoVar) {
        this.f43211iobyxmoadg = f13;
        this.f43215zoijcleaow = f14;
        this.f43213ppxfxbqfkf = f15;
        this.f43214wkgbmnqykc = f16;
        Object objEablkybsjg = eablkybsjg(gxszxtbevoVar);
        return objEablkybsjg == mg.zoijcleaow.gxszxtbevo() ? objEablkybsjg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final androidx.compose.runtime.i1 ppxfxbqfkf() {
        return this.f43209eablkybsjg.lqeggnwhkg();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, metgxyhuhe.dxjokdxxww] */
    /* JADX WARN: Type inference failed for: r6v1, types: [metgxyhuhe.dxjokdxxww] */
    /* JADX WARN: Type inference failed for: r6v2, types: [metgxyhuhe.dxjokdxxww] */
    /* JADX WARN: Type inference failed for: r6v3, types: [gg.wwaezpbzkn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object zoijcleaow(metgxyhuhe.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ?? r13;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f43216iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f43216iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f43218yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f43216iwizpuwonk;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                float fWkgbmnqykc = wkgbmnqykc(dxjokdxxwwVar);
                this.f43212lqeggnwhkg = dxjokdxxwwVar;
                r13 = dxjokdxxwwVar;
                if (!w0.nufgyqmvbu.dxjokdxxww(((w0.nufgyqmvbu) this.f43209eablkybsjg.gtknphoqwx()).draadjrbmk(), fWkgbmnqykc)) {
                    vipkmwdibw.zoijcleaow zoijcleaowVar = this.f43209eablkybsjg;
                    metgxyhuhe.dxjokdxxww dxjokdxxwwVar2 = this.f43210gxszxtbevo;
                    iobyxmoadgVar.f43219zdlpuopuiu = dxjokdxxwwVar;
                    iobyxmoadgVar.f43216iwizpuwonk = 1;
                    if (eslsurpljm.wkgbmnqykc(zoijcleaowVar, fWkgbmnqykc, dxjokdxxwwVar2, dxjokdxxwwVar, iobyxmoadgVar) == objGxszxtbevo) {
                        r13 = dxjokdxxwwVar;
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                metgxyhuhe.dxjokdxxww dxjokdxxwwVar3 = (metgxyhuhe.dxjokdxxww) iobyxmoadgVar.f43219zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                r13 = dxjokdxxwwVar3;
            }
            r13 = dxjokdxxwwVar;
            this.f43210gxszxtbevo = r13;
            dxjokdxxwwVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            return dxjokdxxwwVar;
        } catch (Throwable th2) {
            this.f43210gxszxtbevo = dxjokdxxwwVar;
            throw th2;
        }
    }

    private k(float f13, float f14, float f15, float f16) {
        this.f43211iobyxmoadg = f13;
        this.f43215zoijcleaow = f14;
        this.f43213ppxfxbqfkf = f15;
        this.f43214wkgbmnqykc = f16;
        this.f43209eablkybsjg = new vipkmwdibw.zoijcleaow(w0.nufgyqmvbu.wkgbmnqykc(this.f43211iobyxmoadg), vipkmwdibw.p.stevsuqkhv(w0.nufgyqmvbu.f118267yggfygwlhe), null, null, 12, null);
    }
}

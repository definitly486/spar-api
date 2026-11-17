package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class w implements pj.cllcsxoeiz, u {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f6061cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f6062esjtqupxsv = 8;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final lg.btonecajqb f6063lereixgezr = new gxszxtbevo();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile lg.btonecajqb f6064iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f6065jyumaefscl = this;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lg.btonecajqb f6066yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lg.btonecajqb f6067zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow extends lg.iobyxmoadg implements pj.hcddaimhww {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ w f6068yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ krqnebusok.nufgyqmvbu f6069zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(pj.hcddaimhww.zoijcleaow zoijcleaowVar, krqnebusok.nufgyqmvbu nufgyqmvbuVar, w wVar) {
            super(zoijcleaowVar);
            this.f6069zdlpuopuiu = nufgyqmvbuVar;
            this.f6068yggfygwlhe = wVar;
        }

        @Override // pj.hcddaimhww
        public void handleException(lg.btonecajqb btonecajqbVar, Throwable th2) throws Throwable {
            this.f6069zdlpuopuiu.zoijcleaow(th2, this.f6068yggfygwlhe);
            lg.btonecajqb btonecajqbVar2 = this.f6068yggfygwlhe.f6066yggfygwlhe;
            pj.hcddaimhww.zoijcleaow zoijcleaowVar = pj.hcddaimhww.f76711btonecajqb;
            pj.hcddaimhww hcddaimhwwVar = (pj.hcddaimhww) btonecajqbVar2.get(zoijcleaowVar);
            if (hcddaimhwwVar != null) {
                hcddaimhwwVar.handleException(btonecajqbVar, th2);
                return;
            }
            pj.hcddaimhww hcddaimhwwVar2 = (pj.hcddaimhww) this.f6068yggfygwlhe.f6067zdlpuopuiu.get(zoijcleaowVar);
            if (hcddaimhwwVar2 == null) {
                throw th2;
            }
            hcddaimhwwVar2.handleException(btonecajqbVar, th2);
        }
    }

    public w(lg.btonecajqb btonecajqbVar, lg.btonecajqb btonecajqbVar2) {
        this.f6067zdlpuopuiu = btonecajqbVar;
        this.f6066yggfygwlhe = btonecajqbVar2;
    }

    @Override // androidx.compose.runtime.u
    public void eablkybsjg() {
        gxszxtbevo();
    }

    @Override // pj.cllcsxoeiz
    public lg.btonecajqb getCoroutineContext() {
        lg.btonecajqb btonecajqbVarPlus;
        lg.btonecajqb btonecajqbVar = this.f6064iwizpuwonk;
        if (btonecajqbVar == null || btonecajqbVar == f6063lereixgezr) {
            krqnebusok.nufgyqmvbu nufgyqmvbuVar = (krqnebusok.nufgyqmvbu) this.f6067zdlpuopuiu.get(krqnebusok.nufgyqmvbu.f60489yggfygwlhe);
            lg.btonecajqb zoijcleaowVar = nufgyqmvbuVar != null ? new zoijcleaow(pj.hcddaimhww.f76711btonecajqb, nufgyqmvbuVar, this) : lg.gtknphoqwx.f62507zdlpuopuiu;
            synchronized (this.f6065jyumaefscl) {
                try {
                    btonecajqbVarPlus = this.f6064iwizpuwonk;
                    if (btonecajqbVarPlus == null) {
                        lg.btonecajqb btonecajqbVar2 = this.f6067zdlpuopuiu;
                        btonecajqbVarPlus = btonecajqbVar2.plus(pj.dvvnrvtcbc.iobyxmoadg((pj.auzgnhcxok) btonecajqbVar2.get(pj.auzgnhcxok.f76671gtknphoqwx))).plus(this.f6066yggfygwlhe).plus(zoijcleaowVar);
                    } else if (btonecajqbVarPlus == f6063lereixgezr) {
                        lg.btonecajqb btonecajqbVar3 = this.f6067zdlpuopuiu;
                        pj.pmvmpeiblj pmvmpeibljVarIobyxmoadg = pj.dvvnrvtcbc.iobyxmoadg((pj.auzgnhcxok) btonecajqbVar3.get(pj.auzgnhcxok.f76671gtknphoqwx));
                        pmvmpeibljVarIobyxmoadg.nufgyqmvbu(new vipkmwdibw());
                        btonecajqbVarPlus = btonecajqbVar3.plus(pmvmpeibljVarIobyxmoadg).plus(this.f6066yggfygwlhe).plus(zoijcleaowVar);
                    }
                    this.f6064iwizpuwonk = btonecajqbVarPlus;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            btonecajqbVar = btonecajqbVarPlus;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(btonecajqbVar);
        return btonecajqbVar;
    }

    public final void gxszxtbevo() {
        synchronized (this.f6065jyumaefscl) {
            try {
                lg.btonecajqb btonecajqbVar = this.f6064iwizpuwonk;
                if (btonecajqbVar == null) {
                    this.f6064iwizpuwonk = f6063lereixgezr;
                } else {
                    pj.dvvnrvtcbc.ppxfxbqfkf(btonecajqbVar, new vipkmwdibw());
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.u
    public void ppxfxbqfkf() {
        gxszxtbevo();
    }

    @Override // androidx.compose.runtime.u
    public void zoijcleaow() {
    }
}

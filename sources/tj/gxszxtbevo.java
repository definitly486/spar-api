package tj;

import gg.wwaezpbzkn;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.dvvnrvtcbc;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f110668cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final sj.lqeggnwhkg f110669iwizpuwonk;

    static final class iobyxmoadg implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ esjtqupxsv f110670iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ rj.zdlpuopuiu f110671jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ yj.nufgyqmvbu f110672yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ auzgnhcxok f110673zdlpuopuiu;

        /* JADX INFO: renamed from: tj.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2727iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ yj.nufgyqmvbu f110674iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ esjtqupxsv f110675jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f110676yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f110677zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2727iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar, esjtqupxsv esjtqupxsvVar, yj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f110676yggfygwlhe = lqeggnwhkgVar;
                this.f110675jyumaefscl = esjtqupxsvVar;
                this.f110674iwizpuwonk = nufgyqmvbuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C2727iobyxmoadg(this.f110676yggfygwlhe, this.f110675jyumaefscl, this.f110674iwizpuwonk, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f110677zdlpuopuiu;
                try {
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        sj.lqeggnwhkg lqeggnwhkgVar = this.f110676yggfygwlhe;
                        esjtqupxsv esjtqupxsvVar = this.f110675jyumaefscl;
                        this.f110677zdlpuopuiu = 1;
                        if (lqeggnwhkgVar.collect(esjtqupxsvVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    this.f110674iwizpuwonk.release();
                    return wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    this.f110674iwizpuwonk.release();
                    throw th2;
                }
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2727iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            int f110678cqumvgiudr;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f110680jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Object f110681yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f110682zdlpuopuiu;

            zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f110680jyumaefscl = obj;
                this.f110678cqumvgiudr |= Integer.MIN_VALUE;
                return iobyxmoadg.this.emit(null, this);
            }
        }

        iobyxmoadg(auzgnhcxok auzgnhcxokVar, yj.nufgyqmvbu nufgyqmvbuVar, rj.zdlpuopuiu zdlpuopuiuVar, esjtqupxsv esjtqupxsvVar) {
            this.f110673zdlpuopuiu = auzgnhcxokVar;
            this.f110672yggfygwlhe = nufgyqmvbuVar;
            this.f110671jyumaefscl = zdlpuopuiuVar;
            this.f110670iwizpuwonk = esjtqupxsvVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar;
            iobyxmoadg iobyxmoadgVar;
            if (gxszxtbevoVar instanceof zoijcleaow) {
                zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
                int i13 = zoijcleaowVar.f110678cqumvgiudr;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    zoijcleaowVar.f110678cqumvgiudr = i13 - Integer.MIN_VALUE;
                } else {
                    zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
                }
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
            Object obj = zoijcleaowVar.f110680jyumaefscl;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = zoijcleaowVar.f110678cqumvgiudr;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                auzgnhcxok auzgnhcxokVar = this.f110673zdlpuopuiu;
                if (auzgnhcxokVar != null) {
                    dvvnrvtcbc.btonecajqb(auzgnhcxokVar);
                }
                yj.nufgyqmvbu nufgyqmvbuVar = this.f110672yggfygwlhe;
                zoijcleaowVar.f110682zdlpuopuiu = this;
                zoijcleaowVar.f110681yggfygwlhe = lqeggnwhkgVar;
                zoijcleaowVar.f110678cqumvgiudr = 1;
                if (nufgyqmvbuVar.zoijcleaow(zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lqeggnwhkgVar = (sj.lqeggnwhkg) zoijcleaowVar.f110681yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f110682zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.f110671jyumaefscl, null, null, new C2727iobyxmoadg(lqeggnwhkgVar, iobyxmoadgVar.f110670iwizpuwonk, iobyxmoadgVar.f110672yggfygwlhe, null), 3, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar, int i13, lg.btonecajqb btonecajqbVar, int i14, rj.iobyxmoadg iobyxmoadgVar, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(lqeggnwhkgVar, i13, (i15 & 4) != 0 ? lg.gtknphoqwx.f62507zdlpuopuiu : btonecajqbVar, (i15 & 8) != 0 ? -2 : i14, (i15 & 16) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar);
    }

    @Override // tj.wkgbmnqykc
    public rj.jyumaefscl draadjrbmk(cllcsxoeiz cllcsxoeizVar) {
        return rj.oxmwwwfdhm.ppxfxbqfkf(cllcsxoeizVar, this.f110704zdlpuopuiu, this.f110703yggfygwlhe, dxjokdxxww());
    }

    @Override // tj.wkgbmnqykc
    protected Object eablkybsjg(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f110669iwizpuwonk.collect(new iobyxmoadg((auzgnhcxok) gxszxtbevoVar.getContext().get(auzgnhcxok.f76671gtknphoqwx), yj.draadjrbmk.zoijcleaow(this.f110668cqumvgiudr, 0, 2, null), zdlpuopuiuVar, new esjtqupxsv(zdlpuopuiuVar)), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tj.wkgbmnqykc
    protected wkgbmnqykc gxszxtbevo(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return new gxszxtbevo(this.f110669iwizpuwonk, this.f110668cqumvgiudr, btonecajqbVar, i13, iobyxmoadgVar);
    }

    @Override // tj.wkgbmnqykc
    protected String ppxfxbqfkf() {
        return "concurrency=" + this.f110668cqumvgiudr;
    }

    public gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar, int i13, lg.btonecajqb btonecajqbVar, int i14, rj.iobyxmoadg iobyxmoadgVar) {
        super(btonecajqbVar, i14, iobyxmoadgVar);
        this.f110669iwizpuwonk = lqeggnwhkgVar;
        this.f110668cqumvgiudr = i13;
    }
}

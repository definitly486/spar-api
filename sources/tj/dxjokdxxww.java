package tj;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends lqeggnwhkg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final tg.vdvldrhtss f110586cqumvgiudr;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ sj.nufgyqmvbu f110587iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f110589yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110590zdlpuopuiu;

        /* JADX INFO: renamed from: tj.dxjokdxxww$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2718iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f110591iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ dxjokdxxww f110592jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ cllcsxoeiz f110593yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ hkdspvbjdz f110594zdlpuopuiu;

            /* JADX INFO: renamed from: tj.dxjokdxxww$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C2719iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                final /* synthetic */ Object f110595iwizpuwonk;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f110596jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ dxjokdxxww f110597yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f110598zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2719iobyxmoadg(dxjokdxxww dxjokdxxwwVar, sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f110597yggfygwlhe = dxjokdxxwwVar;
                    this.f110596jyumaefscl = nufgyqmvbuVar;
                    this.f110595iwizpuwonk = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new C2719iobyxmoadg(this.f110597yggfygwlhe, this.f110596jyumaefscl, this.f110595iwizpuwonk, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f110598zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        tg.vdvldrhtss vdvldrhtssVar = this.f110597yggfygwlhe.f110586cqumvgiudr;
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f110596jyumaefscl;
                        Object obj2 = this.f110595iwizpuwonk;
                        this.f110598zdlpuopuiu = 1;
                        if (vdvldrhtssVar.invoke(nufgyqmvbuVar, obj2, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.rgvfuqvkyq
                public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                    return ((C2719iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX INFO: renamed from: tj.dxjokdxxww$iobyxmoadg$iobyxmoadg$zoijcleaow */
            static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
                int f110600esjtqupxsv;

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                /* synthetic */ Object f110601iwizpuwonk;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                Object f110602jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                Object f110603yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                Object f110604zdlpuopuiu;

                zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f110601iwizpuwonk = obj;
                    this.f110600esjtqupxsv |= Integer.MIN_VALUE;
                    return C2718iobyxmoadg.this.emit(null, this);
                }
            }

            C2718iobyxmoadg(hkdspvbjdz hkdspvbjdzVar, cllcsxoeiz cllcsxoeizVar, dxjokdxxww dxjokdxxwwVar, sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f110594zdlpuopuiu = hkdspvbjdzVar;
                this.f110593yggfygwlhe = cllcsxoeizVar;
                this.f110592jyumaefscl = dxjokdxxwwVar;
                this.f110591iwizpuwonk = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar;
                C2718iobyxmoadg c2718iobyxmoadg;
                if (gxszxtbevoVar instanceof zoijcleaow) {
                    zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
                    int i13 = zoijcleaowVar.f110600esjtqupxsv;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        zoijcleaowVar.f110600esjtqupxsv = i13 - Integer.MIN_VALUE;
                    } else {
                        zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
                    }
                } else {
                    zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
                }
                Object obj2 = zoijcleaowVar.f110601iwizpuwonk;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = zoijcleaowVar.f110600esjtqupxsv;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    auzgnhcxok auzgnhcxokVar = (auzgnhcxok) this.f110594zdlpuopuiu.f60015zdlpuopuiu;
                    if (auzgnhcxokVar != null) {
                        auzgnhcxokVar.nufgyqmvbu(new ChildCancelledException());
                        zoijcleaowVar.f110604zdlpuopuiu = this;
                        zoijcleaowVar.f110603yggfygwlhe = obj;
                        zoijcleaowVar.f110602jyumaefscl = auzgnhcxokVar;
                        zoijcleaowVar.f110600esjtqupxsv = 1;
                        if (auzgnhcxokVar.wypolnanlu(zoijcleaowVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    c2718iobyxmoadg = this;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = zoijcleaowVar.f110603yggfygwlhe;
                    c2718iobyxmoadg = (C2718iobyxmoadg) zoijcleaowVar.f110604zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                c2718iobyxmoadg.f110594zdlpuopuiu.f60015zdlpuopuiu = pj.gtknphoqwx.wkgbmnqykc(c2718iobyxmoadg.f110593yggfygwlhe, null, wypolnanlu.UNDISPATCHED, new C2719iobyxmoadg(c2718iobyxmoadg.f110592jyumaefscl, c2718iobyxmoadg.f110591iwizpuwonk, obj, null), 1, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f110587iwizpuwonk = nufgyqmvbuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = dxjokdxxww.this.new iobyxmoadg(this.f110587iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f110589yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f110590zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f110589yggfygwlhe;
                hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
                dxjokdxxww dxjokdxxwwVar = dxjokdxxww.this;
                sj.lqeggnwhkg lqeggnwhkgVar = dxjokdxxwwVar.f110695iwizpuwonk;
                C2718iobyxmoadg c2718iobyxmoadg = new C2718iobyxmoadg(hkdspvbjdzVar, cllcsxoeizVar, dxjokdxxwwVar, this.f110587iwizpuwonk);
                this.f110590zdlpuopuiu = 1;
                if (lqeggnwhkgVar.collect(c2718iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ dxjokdxxww(tg.vdvldrhtss vdvldrhtssVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(vdvldrhtssVar, lqeggnwhkgVar, (i14 & 4) != 0 ? lg.gtknphoqwx.f62507zdlpuopuiu : btonecajqbVar, (i14 & 8) != 0 ? -2 : i13, (i14 & 16) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar);
    }

    @Override // tj.wkgbmnqykc
    protected wkgbmnqykc gxszxtbevo(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return new dxjokdxxww(this.f110586cqumvgiudr, this.f110695iwizpuwonk, btonecajqbVar, i13, iobyxmoadgVar);
    }

    @Override // tj.lqeggnwhkg
    protected Object rgvfuqvkyq(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = dsvhmnatus.gxszxtbevo(new iobyxmoadg(nufgyqmvbuVar, null), gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
    }

    public dxjokdxxww(tg.vdvldrhtss vdvldrhtssVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        super(lqeggnwhkgVar, btonecajqbVar, i13, iobyxmoadgVar);
        this.f110586cqumvgiudr = vdvldrhtssVar;
    }
}

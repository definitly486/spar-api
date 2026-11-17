package h61;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.esjtqupxsv;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;
import ru.myspar.proloyalty.domain.feature.promotion.store.State;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final esjtqupxsv f39689eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final i01.eablkybsjg f39690gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dr0.iobyxmoadg f39691ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final h11.zoijcleaow f39692wkgbmnqykc;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f39693iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f39695yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f39696zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39695yggfygwlhe = obj;
            this.f39693iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.sflfametgt(null, this);
        }
    }

    /* JADX INFO: renamed from: h61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0911iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f39697iobyxmoadg;

        static {
            int[] iArr = new int[Promotion.zoijcleaow.values().length];
            try {
                iArr[Promotion.zoijcleaow.CARD_OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Promotion.zoijcleaow.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39697iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f39698jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ h61.wkgbmnqykc f39699yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f39700zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(h61.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f39699yggfygwlhe = wkgbmnqykcVar;
            this.f39698jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f39699yggfygwlhe, this.f39698jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f39700zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                h61.wkgbmnqykc wkgbmnqykcVar = this.f39699yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, h61.wkgbmnqykc.zoijcleaow.f39730iobyxmoadg)) {
                    this.f39698jyumaefscl.crxdokpmqz(h61.eablkybsjg.iobyxmoadg.f39680iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, h61.wkgbmnqykc.C0918wkgbmnqykc.f39729iobyxmoadg)) {
                    this.f39698jyumaefscl.bfopjjpdmp();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, h61.wkgbmnqykc.eablkybsjg.f39726iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f39698jyumaefscl;
                    this.f39700zdlpuopuiu = 1;
                    if (iobyxmoadgVar.iyctptxqzt(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof h61.wkgbmnqykc.iobyxmoadg) {
                    iobyxmoadg iobyxmoadgVar2 = this.f39698jyumaefscl;
                    Promotion.PromotionItem promotionItemIobyxmoadg = ((h61.wkgbmnqykc.iobyxmoadg) this.f39699yggfygwlhe).iobyxmoadg();
                    this.f39700zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.oipsdeybqn(promotionItemIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(wkgbmnqykcVar instanceof h61.wkgbmnqykc.ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f39698jyumaefscl.weqkydbzbr(((h61.wkgbmnqykc.ppxfxbqfkf) this.f39699yggfygwlhe).iobyxmoadg());
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f39702zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f39702zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                i01.eablkybsjg eablkybsjgVar = iobyxmoadg.this.f39690gxszxtbevo;
                this.f39702zdlpuopuiu = 1;
                if (eablkybsjgVar.btonecajqb(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f39703jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ h61.ppxfxbqfkf f39704yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f39705zdlpuopuiu;

        /* JADX INFO: renamed from: h61.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        static final class C0912iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f39706yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f39707zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0912iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f39706yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C0912iobyxmoadg(this.f39706yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f39707zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f39706yggfygwlhe;
                    this.f39707zdlpuopuiu = 1;
                    if (iobyxmoadgVar.iyctptxqzt(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i01.eablkybsjg.iobyxmoadg.C0972iobyxmoadg c0972iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0912iobyxmoadg) create(c0972iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f39708yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f39709zdlpuopuiu;

            /* JADX INFO: renamed from: h61.iobyxmoadg$zoijcleaow$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0913iobyxmoadg implements nufgyqmvbu {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ iobyxmoadg f39710yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ nufgyqmvbu f39711zdlpuopuiu;

                /* JADX INFO: renamed from: h61.iobyxmoadg$zoijcleaow$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C0914iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f39713yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f39714zdlpuopuiu;

                    public C0914iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f39714zdlpuopuiu = obj;
                        this.f39713yggfygwlhe |= Integer.MIN_VALUE;
                        return C0913iobyxmoadg.this.emit(null, this);
                    }
                }

                public C0913iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                    this.f39711zdlpuopuiu = nufgyqmvbuVar;
                    this.f39710yggfygwlhe = iobyxmoadgVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C0914iobyxmoadg c0914iobyxmoadg;
                    if (gxszxtbevoVar instanceof C0914iobyxmoadg) {
                        c0914iobyxmoadg = (C0914iobyxmoadg) gxszxtbevoVar;
                        int i13 = c0914iobyxmoadg.f39713yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c0914iobyxmoadg.f39713yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c0914iobyxmoadg = new C0914iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c0914iobyxmoadg = new C0914iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c0914iobyxmoadg.f39714zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c0914iobyxmoadg.f39713yggfygwlhe;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.f39711zdlpuopuiu;
                        if (!iobyxmoadg.czzsidtyhn(this.f39710yggfygwlhe).getIsLoading()) {
                            c0914iobyxmoadg.f39713yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c0914iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            public ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
                this.f39709zdlpuopuiu = lqeggnwhkgVar;
                this.f39708yggfygwlhe = iobyxmoadgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f39709zdlpuopuiu.collect(new C0913iobyxmoadg(nufgyqmvbuVar, this.f39708yggfygwlhe), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public static final class wkgbmnqykc implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f39715zdlpuopuiu;

            /* JADX INFO: renamed from: h61.iobyxmoadg$zoijcleaow$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0915iobyxmoadg implements nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ nufgyqmvbu f39716zdlpuopuiu;

                /* JADX INFO: renamed from: h61.iobyxmoadg$zoijcleaow$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C0916iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f39718yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f39719zdlpuopuiu;

                    public C0916iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f39719zdlpuopuiu = obj;
                        this.f39718yggfygwlhe |= Integer.MIN_VALUE;
                        return C0915iobyxmoadg.this.emit(null, this);
                    }
                }

                public C0915iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                    this.f39716zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C0916iobyxmoadg c0916iobyxmoadg;
                    if (gxszxtbevoVar instanceof C0916iobyxmoadg) {
                        c0916iobyxmoadg = (C0916iobyxmoadg) gxszxtbevoVar;
                        int i13 = c0916iobyxmoadg.f39718yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c0916iobyxmoadg.f39718yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c0916iobyxmoadg = new C0916iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c0916iobyxmoadg = new C0916iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c0916iobyxmoadg.f39719zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c0916iobyxmoadg.f39718yggfygwlhe;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.f39716zdlpuopuiu;
                        if (obj instanceof i01.eablkybsjg.iobyxmoadg.C0972iobyxmoadg) {
                            c0916iobyxmoadg.f39718yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c0916iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            public wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f39715zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f39715zdlpuopuiu.collect(new C0915iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX INFO: renamed from: h61.iobyxmoadg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        static final class C0917zoijcleaow extends draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f39720yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f39721zdlpuopuiu;

            C0917zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f39721zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f39720yggfygwlhe, new CrashlyticsKey[0]);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                C0917zoijcleaow c0917zoijcleaow = new C0917zoijcleaow(gxszxtbevoVar);
                c0917zoijcleaow.f39720yggfygwlhe = th2;
                return c0917zoijcleaow.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(h61.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f39704yggfygwlhe = ppxfxbqfkfVar;
            this.f39703jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f39704yggfygwlhe, this.f39703jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f39705zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                h61.ppxfxbqfkf ppxfxbqfkfVar = this.f39704yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, h61.ppxfxbqfkf.iobyxmoadg.f39724iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f39703jyumaefscl;
                    this.f39705zdlpuopuiu = 1;
                    if (iobyxmoadg.zfvoamnweg(iobyxmoadgVar, null, this, 1, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, h61.ppxfxbqfkf.zoijcleaow.f39725iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dxjokdxxww.hkdspvbjdz(dxjokdxxww.gxszxtbevo(dxjokdxxww.kegysxyocb(new ppxfxbqfkf(new wkgbmnqykc(this.f39703jyumaefscl.f39690gxszxtbevo.nufgyqmvbu()), this.f39703jyumaefscl), new C0912iobyxmoadg(this.f39703jyumaefscl, null)), new C0917zoijcleaow(null)), this.f39703jyumaefscl.sopmlzcsov());
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, h11.zoijcleaow getPromoUseCase, esjtqupxsv isAuthUseCase, i01.eablkybsjg changePromotionObserver) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPromoUseCase, "getPromoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changePromotionObserver, "changePromotionObserver");
        this.f39691ppxfxbqfkf = dispatchersProvider;
        this.f39692wkgbmnqykc = getPromoUseCase;
        this.f39689eablkybsjg = isAuthUseCase;
        this.f39690gxszxtbevo = changePromotionObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp() {
        if (((State) jlmebxxoox()).getIsLoggedIn()) {
            crxdokpmqz(h61.eablkybsjg.gxszxtbevo.f39679iobyxmoadg);
        } else {
            crxdokpmqz(h61.eablkybsjg.zoijcleaow.f39683iobyxmoadg);
        }
    }

    public static final /* synthetic */ State czzsidtyhn(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object iyctptxqzt(lg.gxszxtbevo gxszxtbevoVar) {
        Object objSflfametgt = sflfametgt(((State) jlmebxxoox()).getSelectedItemId(), gxszxtbevoVar);
        return objSflfametgt == mg.zoijcleaow.gxszxtbevo() ? objSflfametgt : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object oipsdeybqn(Promotion.PromotionItem promotionItem, lg.gxszxtbevo gxszxtbevoVar) {
        int i13 = C0911iobyxmoadg.f39697iobyxmoadg[((State) jlmebxxoox()).getType().ordinal()];
        if (i13 == 1) {
            Object objSflfametgt = sflfametgt(promotionItem.getId(), gxszxtbevoVar);
            return objSflfametgt == mg.zoijcleaow.gxszxtbevo() ? objSflfametgt : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        crxdokpmqz(new h61.eablkybsjg.C0910eablkybsjg(promotionItem.getQrCode()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sflfametgt(String str, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f39693iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f39693iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f39695yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f39693iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(str));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                h11.zoijcleaow zoijcleaowVar = this.f39692wkgbmnqykc;
                h11.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new h11.zoijcleaow.iobyxmoadg(false, str);
                eablkybsjgVar.f39696zdlpuopuiu = this;
                eablkybsjgVar.f39693iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar3, eablkybsjgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f39696zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Promotion) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ydmasvzmpa((Promotion) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.opjhrmiecq(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weqkydbzbr(Promotion.PromotionItem promotionItem) {
        if (promotionItem.getIsOpen()) {
            String image = promotionItem.getImage();
            if (image == null) {
                image = "";
            }
            crxdokpmqz(new h61.eablkybsjg.wkgbmnqykc(new vz0.iobyxmoadg(image, promotionItem.getName(), promotionItem.getDescription())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa(Promotion promotion) {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(promotion, ((Boolean) this.f39689eablkybsjg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue(), ((State) jlmebxxoox()).getSelectedItemId()));
    }

    static /* synthetic */ Object zfvoamnweg(iobyxmoadg iobyxmoadgVar, String str, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        return iobyxmoadgVar.sflfametgt(str, gxszxtbevoVar);
    }

    public final void opjhrmiecq(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
        crxdokpmqz(new h61.eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(h61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(h61.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }
}

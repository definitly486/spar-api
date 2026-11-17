package w70;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.core.domain.models.promo.Promotion;
import ru.myspar.domain.feature.promotion.store.State;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final u10.eablkybsjg f118944eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final c30.zoijcleaow f118945ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c20.eablkybsjg f118946wkgbmnqykc;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f118947iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f118949yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118950zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118949yggfygwlhe = obj;
            this.f118947iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.sflfametgt(null, this);
        }
    }

    /* JADX INFO: renamed from: w70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2960iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f118951iobyxmoadg;

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
            f118951iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f118952jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ w70.wkgbmnqykc f118953yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f118954zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(w70.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f118953yggfygwlhe = wkgbmnqykcVar;
            this.f118952jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f118953yggfygwlhe, this.f118952jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f118954zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                w70.wkgbmnqykc wkgbmnqykcVar = this.f118953yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, w70.wkgbmnqykc.zoijcleaow.f118984iobyxmoadg)) {
                    this.f118952jyumaefscl.crxdokpmqz(w70.eablkybsjg.iobyxmoadg.f118935iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, w70.wkgbmnqykc.C2967wkgbmnqykc.f118983iobyxmoadg)) {
                    this.f118952jyumaefscl.bfopjjpdmp();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, w70.wkgbmnqykc.eablkybsjg.f118980iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f118952jyumaefscl;
                    this.f118954zdlpuopuiu = 1;
                    if (iobyxmoadgVar.iyctptxqzt(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof w70.wkgbmnqykc.iobyxmoadg) {
                    iobyxmoadg iobyxmoadgVar2 = this.f118952jyumaefscl;
                    Promotion.PromotionItem promotionItemIobyxmoadg = ((w70.wkgbmnqykc.iobyxmoadg) this.f118953yggfygwlhe).iobyxmoadg();
                    this.f118954zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.oipsdeybqn(promotionItemIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(wkgbmnqykcVar instanceof w70.wkgbmnqykc.ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f118952jyumaefscl.weqkydbzbr(((w70.wkgbmnqykc.ppxfxbqfkf) this.f118953yggfygwlhe).iobyxmoadg());
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
        int f118956zdlpuopuiu;

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
            int i13 = this.f118956zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                u10.eablkybsjg eablkybsjgVar = iobyxmoadg.this.f118944eablkybsjg;
                this.f118956zdlpuopuiu = 1;
                if (eablkybsjgVar.gtknphoqwx(this) == objGxszxtbevo) {
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
        final /* synthetic */ iobyxmoadg f118957jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ w70.ppxfxbqfkf f118958yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f118959zdlpuopuiu;

        /* JADX INFO: renamed from: w70.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        static final class C2961iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f118960yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f118961zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2961iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f118960yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C2961iobyxmoadg(this.f118960yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f118961zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f118960yggfygwlhe;
                    this.f118961zdlpuopuiu = 1;
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
            public final Object invoke(u10.eablkybsjg.iobyxmoadg.C2773iobyxmoadg c2773iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2961iobyxmoadg) create(c2773iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f118962yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f118963zdlpuopuiu;

            /* JADX INFO: renamed from: w70.iobyxmoadg$zoijcleaow$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2962iobyxmoadg implements nufgyqmvbu {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ iobyxmoadg f118964yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ nufgyqmvbu f118965zdlpuopuiu;

                /* JADX INFO: renamed from: w70.iobyxmoadg$zoijcleaow$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2963iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f118967yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f118968zdlpuopuiu;

                    public C2963iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f118968zdlpuopuiu = obj;
                        this.f118967yggfygwlhe |= Integer.MIN_VALUE;
                        return C2962iobyxmoadg.this.emit(null, this);
                    }
                }

                public C2962iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                    this.f118965zdlpuopuiu = nufgyqmvbuVar;
                    this.f118964yggfygwlhe = iobyxmoadgVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2963iobyxmoadg c2963iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2963iobyxmoadg) {
                        c2963iobyxmoadg = (C2963iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2963iobyxmoadg.f118967yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2963iobyxmoadg.f118967yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2963iobyxmoadg = new C2963iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2963iobyxmoadg = new C2963iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2963iobyxmoadg.f118968zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2963iobyxmoadg.f118967yggfygwlhe;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.f118965zdlpuopuiu;
                        if (!iobyxmoadg.czzsidtyhn(this.f118964yggfygwlhe).getIsLoading()) {
                            c2963iobyxmoadg.f118967yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2963iobyxmoadg) == objGxszxtbevo) {
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
                this.f118963zdlpuopuiu = lqeggnwhkgVar;
                this.f118962yggfygwlhe = iobyxmoadgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f118963zdlpuopuiu.collect(new C2962iobyxmoadg(nufgyqmvbuVar, this.f118962yggfygwlhe), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public static final class wkgbmnqykc implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f118969zdlpuopuiu;

            /* JADX INFO: renamed from: w70.iobyxmoadg$zoijcleaow$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2964iobyxmoadg implements nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ nufgyqmvbu f118970zdlpuopuiu;

                /* JADX INFO: renamed from: w70.iobyxmoadg$zoijcleaow$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2965iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f118972yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f118973zdlpuopuiu;

                    public C2965iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f118973zdlpuopuiu = obj;
                        this.f118972yggfygwlhe |= Integer.MIN_VALUE;
                        return C2964iobyxmoadg.this.emit(null, this);
                    }
                }

                public C2964iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                    this.f118970zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2965iobyxmoadg c2965iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2965iobyxmoadg) {
                        c2965iobyxmoadg = (C2965iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2965iobyxmoadg.f118972yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2965iobyxmoadg.f118972yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2965iobyxmoadg = new C2965iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2965iobyxmoadg = new C2965iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2965iobyxmoadg.f118973zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2965iobyxmoadg.f118972yggfygwlhe;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.f118970zdlpuopuiu;
                        if (obj instanceof u10.eablkybsjg.iobyxmoadg.C2773iobyxmoadg) {
                            c2965iobyxmoadg.f118972yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2965iobyxmoadg) == objGxszxtbevo) {
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
                this.f118969zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f118969zdlpuopuiu.collect(new C2964iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX INFO: renamed from: w70.iobyxmoadg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        static final class C2966zoijcleaow extends draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f118974yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f118975zdlpuopuiu;

            C2966zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f118975zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f118974yggfygwlhe, new CrashlyticsKey[0]);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                C2966zoijcleaow c2966zoijcleaow = new C2966zoijcleaow(gxszxtbevoVar);
                c2966zoijcleaow.f118974yggfygwlhe = th2;
                return c2966zoijcleaow.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(w70.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f118958yggfygwlhe = ppxfxbqfkfVar;
            this.f118957jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f118958yggfygwlhe, this.f118957jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f118959zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                w70.ppxfxbqfkf ppxfxbqfkfVar = this.f118958yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, w70.ppxfxbqfkf.iobyxmoadg.f118978iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f118957jyumaefscl;
                    this.f118959zdlpuopuiu = 1;
                    if (iobyxmoadg.zfvoamnweg(iobyxmoadgVar, null, this, 1, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, w70.ppxfxbqfkf.zoijcleaow.f118979iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dxjokdxxww.hkdspvbjdz(dxjokdxxww.gxszxtbevo(dxjokdxxww.kegysxyocb(new ppxfxbqfkf(new wkgbmnqykc(this.f118957jyumaefscl.f118944eablkybsjg.btonecajqb()), this.f118957jyumaefscl), new C2961iobyxmoadg(this.f118957jyumaefscl, null)), new C2966zoijcleaow(null)), this.f118957jyumaefscl.sopmlzcsov());
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
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, c30.zoijcleaow getPromoUseCase, c20.eablkybsjg isLoggedInUseCase, u10.eablkybsjg changePromotionObserver) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPromoUseCase, "getPromoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changePromotionObserver, "changePromotionObserver");
        this.f118945ppxfxbqfkf = getPromoUseCase;
        this.f118946wkgbmnqykc = isLoggedInUseCase;
        this.f118944eablkybsjg = changePromotionObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp() {
        if (((State) jlmebxxoox()).getIsLoggedIn()) {
            crxdokpmqz(w70.eablkybsjg.gxszxtbevo.f118934iobyxmoadg);
        } else {
            crxdokpmqz(new w70.eablkybsjg.zoijcleaow(NonAuthorizedPayload.zoijcleaow.PROMO));
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
        int i13 = C2960iobyxmoadg.f118951iobyxmoadg[((State) jlmebxxoox()).getType().ordinal()];
        if (i13 == 1) {
            Object objSflfametgt = sflfametgt(promotionItem.getId(), gxszxtbevoVar);
            return objSflfametgt == mg.zoijcleaow.gxszxtbevo() ? objSflfametgt : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        crxdokpmqz(new w70.eablkybsjg.C2959eablkybsjg(promotionItem.getQrCode()));
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
            int i13 = eablkybsjgVar.f118947iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f118947iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f118949yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f118947iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(str));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                c30.zoijcleaow zoijcleaowVar = this.f118945ppxfxbqfkf;
                c30.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new c30.zoijcleaow.iobyxmoadg(false, str);
                eablkybsjgVar.f118950zdlpuopuiu = this;
                eablkybsjgVar.f118947iwizpuwonk = 1;
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
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f118950zdlpuopuiu;
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
            crxdokpmqz(new w70.eablkybsjg.wkgbmnqykc(new f10.iobyxmoadg(image, promotionItem.getName(), promotionItem.getDescription())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa(Promotion promotion) {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(promotion, ((Boolean) this.f118946wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue(), ((State) jlmebxxoox()).getSelectedItemId()));
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
        crxdokpmqz(new w70.eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(w70.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(w70.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }
}

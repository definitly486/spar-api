package ru.myspar.proloyalty.cart.impl.domain.store;

import gg.wwaezpbzkn;
import j0.l;
import j0.m;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.hkdspvbjdz;
import ow1.jpowsppfya;
import p0.tzroggbefp;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartBonuses;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBar;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBarDeliveryTerms;
import ru.myspar.proloyalty.core.domain.models.cart.CartReceiver;
import ru.myspar.proloyalty.core.domain.models.cart.CartSum;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.proloyalty.core.error_handler.exceptions.DeliveryIntervalNotValidException;
import ru.myspar.proloyalty.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.promocode.Promocode;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;
import ru.myspar.proloyalty.payment.api.model.PaymentType;
import ru.myspar.proloyalty.user.domain.model.UserState;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final C2165iobyxmoadg f92737kcexrzcfyt = new C2165iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final int f92738zdlpuopuiu = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final dl0.iobyxmoadg f92739agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final dr0.iobyxmoadg f92740btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final p01.gxszxtbevo f92741draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final p01.dxjokdxxww f92742dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final m11.iobyxmoadg f92743eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final dz0.gtknphoqwx f92744gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final p01.ppxfxbqfkf f92745gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ow1.esjtqupxsv f92746lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final jpowsppfya f92747nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final vm0.zoijcleaow f92748ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final gg.gtknphoqwx f92749oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f92750ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private auzgnhcxok f92751rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private auzgnhcxok f92752vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final r01.dxjokdxxww f92753wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cz0.iobyxmoadg f92754wkgbmnqykc;

    public static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f92755iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f92756jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f92757yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92758zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(lg.gxszxtbevo gxszxtbevoVar, iobyxmoadg iobyxmoadgVar) {
            super(3, gxszxtbevoVar);
            this.f92755iwizpuwonk = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92758zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f92757yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((Boolean) this.f92756jyumaefscl).booleanValue() ? this.f92755iwizpuwonk.krqnebusok().zoijcleaow() : sj.dxjokdxxww.cqumvgiudr();
                this.f92758zdlpuopuiu = 1;
                if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarZoijcleaow, this) == objGxszxtbevo) {
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

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            agtfadlqog agtfadlqogVar = new agtfadlqog(gxszxtbevoVar, this.f92755iwizpuwonk);
            agtfadlqogVar.f92757yggfygwlhe = nufgyqmvbuVar;
            agtfadlqogVar.f92756jyumaefscl = obj;
            return agtfadlqogVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f92759iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92761yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92762zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92761yggfygwlhe = obj;
            this.f92759iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.q(null, this);
        }
    }

    static final class cqumvgiudr implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$cqumvgiudr$iobyxmoadg, reason: collision with other inner class name */
        static final class C2160iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f92764iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f92766yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f92767zdlpuopuiu;

            C2160iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f92766yggfygwlhe = obj;
                this.f92764iwizpuwonk |= Integer.MIN_VALUE;
                return cqumvgiudr.this.emit(null, this);
            }
        }

        cqumvgiudr() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(kz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            C2160iobyxmoadg c2160iobyxmoadg;
            cqumvgiudr cqumvgiudrVar;
            if (gxszxtbevoVar instanceof C2160iobyxmoadg) {
                c2160iobyxmoadg = (C2160iobyxmoadg) gxszxtbevoVar;
                int i13 = c2160iobyxmoadg.f92764iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c2160iobyxmoadg.f92764iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    c2160iobyxmoadg = new C2160iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                c2160iobyxmoadg = new C2160iobyxmoadg(gxszxtbevoVar);
            }
            C2160iobyxmoadg c2160iobyxmoadg2 = c2160iobyxmoadg;
            Object obj = c2160iobyxmoadg2.f92766yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = c2160iobyxmoadg2.f92764iwizpuwonk;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (eablkybsjgVar instanceof kz0.eablkybsjg.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    Cart cartIobyxmoadg = ((kz0.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg();
                    c2160iobyxmoadg2.f92767zdlpuopuiu = this;
                    c2160iobyxmoadg2.f92764iwizpuwonk = 1;
                    if (iobyxmoadg.e(iobyxmoadgVar, cartIobyxmoadg, false, c2160iobyxmoadg2, 2, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(eablkybsjgVar instanceof kz0.eablkybsjg.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg.this.w();
                }
                cqumvgiudrVar = this;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cqumvgiudrVar = (cqumvgiudr) c2160iobyxmoadg2.f92767zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.f92748ojitshcjhn.zoijcleaow(ym0.iobyxmoadg.C3205iobyxmoadg.f125945gxszxtbevo);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92769zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new draadjrbmk(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92769zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                dl0.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f92739agtfadlqog;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f92769zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            dl0.iobyxmoadg.C0579iobyxmoadg c0579iobyxmoadg = (dl0.iobyxmoadg.C0579iobyxmoadg) obj;
            iobyxmoadg.this.crxdokpmqz(new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.nufgyqmvbu(c0579iobyxmoadg.zoijcleaow(), c0579iobyxmoadg.iobyxmoadg()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f92770iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92772yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92773zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92772yggfygwlhe = obj;
            this.f92770iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.h(null, this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f92774jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.cart.impl.domain.store.ppxfxbqfkf f92775yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92776zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(ru.myspar.proloyalty.cart.impl.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f92775yggfygwlhe = ppxfxbqfkfVar;
            this.f92774jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f92775yggfygwlhe, this.f92774jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92776zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.proloyalty.cart.impl.domain.store.ppxfxbqfkf ppxfxbqfkfVar = this.f92775yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.cart.impl.domain.store.ppxfxbqfkf.iobyxmoadg.f92878iobyxmoadg)) {
                    this.f92774jyumaefscl.f();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.cart.impl.domain.store.ppxfxbqfkf.zoijcleaow.f92881iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f92774jyumaefscl;
                    this.f92776zdlpuopuiu = 1;
                    if (iobyxmoadgVar.G(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.cart.impl.domain.store.ppxfxbqfkf.wkgbmnqykc.f92880iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar2 = this.f92774jyumaefscl;
                    this.f92776zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.H(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.cart.impl.domain.store.ppxfxbqfkf.eablkybsjg.f92877iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar3 = this.f92774jyumaefscl;
                    this.f92776zdlpuopuiu = 3;
                    if (iobyxmoadgVar3.I(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.cart.impl.domain.store.ppxfxbqfkf.C2174ppxfxbqfkf.f92879iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f92774jyumaefscl.F();
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class esjtqupxsv implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f92777zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$esjtqupxsv$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2161iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f92778zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$esjtqupxsv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2162iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f92780yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f92781zdlpuopuiu;

                public C2162iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f92781zdlpuopuiu = obj;
                    this.f92780yggfygwlhe |= Integer.MIN_VALUE;
                    return C2161iobyxmoadg.this.emit(null, this);
                }
            }

            public C2161iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f92778zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2162iobyxmoadg c2162iobyxmoadg;
                if (gxszxtbevoVar instanceof C2162iobyxmoadg) {
                    c2162iobyxmoadg = (C2162iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2162iobyxmoadg.f92780yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2162iobyxmoadg.f92780yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2162iobyxmoadg = new C2162iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2162iobyxmoadg = new C2162iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2162iobyxmoadg.f92781zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2162iobyxmoadg.f92780yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f92778zdlpuopuiu;
                    if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                        c2162iobyxmoadg.f92780yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2162iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public esjtqupxsv(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f92777zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f92777zdlpuopuiu.collect(new C2161iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f92782iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92784yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92785zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92784yggfygwlhe = obj;
            this.f92782iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.t(this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f92786jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc f92787yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92788zdlpuopuiu;

        static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc f92789jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f92790yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f92791zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            eablkybsjg(iobyxmoadg iobyxmoadgVar, ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f92790yggfygwlhe = iobyxmoadgVar;
                this.f92789jyumaefscl = wkgbmnqykcVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new eablkybsjg(this.f92790yggfygwlhe, this.f92789jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f92791zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f92790yggfygwlhe;
                    boolean zIobyxmoadg = ((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.lqeggnwhkg) this.f92789jyumaefscl).iobyxmoadg();
                    State stateHszhottldk = iobyxmoadg.hszhottldk(this.f92790yggfygwlhe);
                    this.f92791zdlpuopuiu = 1;
                    if (iobyxmoadgVar.i(zIobyxmoadg, stateHszhottldk, this) == objGxszxtbevo) {
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

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((eablkybsjg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
        static final class C2163gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f92792yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f92793zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2163gxszxtbevo(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f92792yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new C2163gxszxtbevo(this.f92792yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f92793zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f92792yggfygwlhe;
                    State stateHszhottldk = iobyxmoadg.hszhottldk(iobyxmoadgVar);
                    this.f92793zdlpuopuiu = 1;
                    if (iobyxmoadgVar.h(stateHszhottldk, this) == objGxszxtbevo) {
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

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2163gxszxtbevo) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$gxszxtbevo$iobyxmoadg, reason: collision with other inner class name */
        static final class C2164iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc f92794jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f92795yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f92796zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2164iobyxmoadg(iobyxmoadg iobyxmoadgVar, ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f92795yggfygwlhe = iobyxmoadgVar;
                this.f92794jyumaefscl = wkgbmnqykcVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new C2164iobyxmoadg(this.f92795yggfygwlhe, this.f92794jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f92796zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f92795yggfygwlhe;
                    String strIobyxmoadg = ((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.oxmwwwfdhm) this.f92794jyumaefscl).iobyxmoadg();
                    this.f92796zdlpuopuiu = 1;
                    if (iobyxmoadgVar.q(strIobyxmoadg, this) == objGxszxtbevo) {
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

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2164iobyxmoadg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f92797yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f92798zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            lqeggnwhkg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f92797yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new lqeggnwhkg(this.f92797yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f92798zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f92797yggfygwlhe;
                    this.f92798zdlpuopuiu = 1;
                    if (iobyxmoadgVar.mhtqkkgtqm(this) == objGxszxtbevo) {
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

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((lqeggnwhkg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc f92799jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f92800yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f92801zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f92800yggfygwlhe = iobyxmoadgVar;
                this.f92799jyumaefscl = wkgbmnqykcVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new ppxfxbqfkf(this.f92800yggfygwlhe, this.f92799jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f92801zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f92800yggfygwlhe;
                    go0.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.zdlpuopuiu) this.f92799jyumaefscl).iobyxmoadg();
                    this.f92801zdlpuopuiu = 1;
                    if (iobyxmoadgVar.s(ppxfxbqfkfVarIobyxmoadg, this) == objGxszxtbevo) {
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

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((ppxfxbqfkf) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f92802yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f92803zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            wkgbmnqykc(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f92802yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new wkgbmnqykc(this.f92802yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f92803zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f92802yggfygwlhe;
                    State stateHszhottldk = iobyxmoadg.hszhottldk(iobyxmoadgVar);
                    this.f92803zdlpuopuiu = 1;
                    if (iobyxmoadgVar.g(stateHszhottldk, this) == objGxszxtbevo) {
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

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((wkgbmnqykc) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc f92804jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f92805yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f92806zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(iobyxmoadg iobyxmoadgVar, ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f92805yggfygwlhe = iobyxmoadgVar;
                this.f92804jyumaefscl = wkgbmnqykcVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f92805yggfygwlhe, this.f92804jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f92806zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f92805yggfygwlhe;
                    go0.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.eablkybsjg) this.f92804jyumaefscl).iobyxmoadg();
                    this.f92806zdlpuopuiu = 1;
                    if (iobyxmoadgVar.o(ppxfxbqfkfVarIobyxmoadg, this) == objGxszxtbevo) {
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

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f92787yggfygwlhe = wkgbmnqykcVar;
            this.f92786jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f92787yggfygwlhe, this.f92786jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Unexpected iteration count in SwitchBreakVisitor. Please report as an issue */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            CartProgressBarDeliveryTerms deliveryTerms;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            switch (this.f92788zdlpuopuiu) {
                case 0:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar = this.f92787yggfygwlhe;
                    if (!(wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.draadjrbmk)) {
                        if (!(wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.iwizpuwonk)) {
                            if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.cqumvgiudr) {
                                iobyxmoadg.yzdjzghtvl(this.f92786jyumaefscl, false, 1, null);
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.gxszxtbevo) {
                                iobyxmoadg.K(this.f92786jyumaefscl, AnalyticsPage.Catalog.f92304iwizpuwonk, null, null, 6, null);
                                this.f92786jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.C2158eablkybsjg.f92701iobyxmoadg);
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.wflxmlrfwp) {
                                this.f92786jyumaefscl.l(((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.wflxmlrfwp) wkgbmnqykcVar).ppxfxbqfkf(), ((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.wflxmlrfwp) this.f92787yggfygwlhe).iobyxmoadg(), ((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.wflxmlrfwp) this.f92787yggfygwlhe).zoijcleaow());
                            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.C2175wkgbmnqykc.f92908iobyxmoadg)) {
                                this.f92786jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.iobyxmoadg.f92707iobyxmoadg);
                            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.ojitshcjhn.f92898iobyxmoadg)) {
                                iobyxmoadg.K(this.f92786jyumaefscl, AnalyticsPage.Comments.f92311iwizpuwonk, null, null, 6, null);
                                this.f92786jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.btonecajqb.f92698iobyxmoadg);
                            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.rgvfuqvkyq.f92901iobyxmoadg)) {
                                this.f92786jyumaefscl.n();
                            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.lereixgezr.f92895iobyxmoadg)) {
                                iobyxmoadg.K(this.f92786jyumaefscl, AnalyticsPage.DeliveryTerms.f92318iwizpuwonk, null, null, 6, null);
                                CartProgressBar progressBar = iobyxmoadg.hszhottldk(this.f92786jyumaefscl).getCart().getProgressBar();
                                if (progressBar != null && (deliveryTerms = progressBar.getDeliveryTerms()) != null) {
                                    this.f92786jyumaefscl.crxdokpmqz(new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.agtfadlqog(deliveryTerms));
                                }
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.gtknphoqwx) {
                                this.f92786jyumaefscl.k(((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.gtknphoqwx) this.f92787yggfygwlhe).iobyxmoadg());
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.jyumaefscl) {
                                this.f92786jyumaefscl.u();
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.agtfadlqog) {
                                this.f92786jyumaefscl.m();
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.vdvldrhtss) {
                                this.f92786jyumaefscl.p(((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.vdvldrhtss) this.f92787yggfygwlhe).ppxfxbqfkf(), ((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.vdvldrhtss) this.f92787yggfygwlhe).iobyxmoadg(), ((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.vdvldrhtss) this.f92787yggfygwlhe).zoijcleaow());
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.oxmwwwfdhm) {
                                iobyxmoadg iobyxmoadgVar = this.f92786jyumaefscl;
                                C2164iobyxmoadg c2164iobyxmoadg = new C2164iobyxmoadg(iobyxmoadgVar, this.f92787yggfygwlhe, null);
                                this.f92788zdlpuopuiu = 1;
                                if (iobyxmoadgVar.C(c2164iobyxmoadg, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.eablkybsjg) {
                                iobyxmoadg iobyxmoadgVar2 = this.f92786jyumaefscl;
                                zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadgVar2, this.f92787yggfygwlhe, null);
                                this.f92788zdlpuopuiu = 2;
                                if (iobyxmoadgVar2.C(zoijcleaowVar, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.zdlpuopuiu) {
                                iobyxmoadg iobyxmoadgVar3 = this.f92786jyumaefscl;
                                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(iobyxmoadgVar3, this.f92787yggfygwlhe, null);
                                this.f92788zdlpuopuiu = 3;
                                if (iobyxmoadgVar3.C(ppxfxbqfkfVar, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.yggfygwlhe) {
                                iobyxmoadg iobyxmoadgVar4 = this.f92786jyumaefscl;
                                this.f92788zdlpuopuiu = 4;
                                if (iobyxmoadgVar4.t(this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.kcexrzcfyt) {
                                iobyxmoadg iobyxmoadgVar5 = this.f92786jyumaefscl;
                                iobyxmoadgVar5.r(iobyxmoadg.hszhottldk(iobyxmoadgVar5), ((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.kcexrzcfyt) this.f92787yggfygwlhe).iobyxmoadg());
                            } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.ppxfxbqfkf) {
                                iobyxmoadg iobyxmoadgVar6 = this.f92786jyumaefscl;
                                wkgbmnqykc wkgbmnqykcVar2 = new wkgbmnqykc(iobyxmoadgVar6, null);
                                this.f92788zdlpuopuiu = 5;
                                if (iobyxmoadgVar6.C(wkgbmnqykcVar2, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            } else if (!(wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.dxjokdxxww)) {
                                if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.nufgyqmvbu) {
                                    this.f92786jyumaefscl.j(((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.nufgyqmvbu) this.f92787yggfygwlhe).iobyxmoadg());
                                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.lqeggnwhkg) {
                                    iobyxmoadg iobyxmoadgVar7 = this.f92786jyumaefscl;
                                    eablkybsjg eablkybsjgVar = new eablkybsjg(iobyxmoadgVar7, this.f92787yggfygwlhe, null);
                                    this.f92788zdlpuopuiu = 6;
                                    if (iobyxmoadgVar7.C(eablkybsjgVar, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.zoijcleaow) {
                                    iobyxmoadg iobyxmoadgVar8 = this.f92786jyumaefscl;
                                    C2163gxszxtbevo c2163gxszxtbevo = new C2163gxszxtbevo(iobyxmoadgVar8, null);
                                    this.f92788zdlpuopuiu = 7;
                                    if (iobyxmoadgVar8.C(c2163gxszxtbevo, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.iobyxmoadg) {
                                    this.f92786jyumaefscl.ulzqkzuiru(ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.btonecajqb.f92719iobyxmoadg);
                                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.esjtqupxsv) {
                                    this.f92786jyumaefscl.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.draadjrbmk(CartStore$CartDialogType.ClearCart.f92680zdlpuopuiu));
                                } else {
                                    if (!(wkgbmnqykcVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.btonecajqb)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    iobyxmoadg iobyxmoadgVar9 = this.f92786jyumaefscl;
                                    lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(iobyxmoadgVar9, null);
                                    this.f92788zdlpuopuiu = 8;
                                    if (iobyxmoadgVar9.C(lqeggnwhkgVar, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                }
                            }
                            break;
                        } else {
                            this.f92786jyumaefscl.E(((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.iwizpuwonk) wkgbmnqykcVar).iobyxmoadg());
                            break;
                        }
                    } else {
                        this.f92786jyumaefscl.D(((ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.draadjrbmk) wkgbmnqykcVar).iobyxmoadg());
                        break;
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2165iobyxmoadg {
        public /* synthetic */ C2165iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2165iobyxmoadg() {
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92808yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92809zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f92809zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.x((Throwable) this.f92808yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            iwizpuwonk iwizpuwonkVar = iobyxmoadg.this.new iwizpuwonk(gxszxtbevoVar);
            iwizpuwonkVar.f92808yggfygwlhe = th2;
            return iwizpuwonkVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ boolean f92810jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92811yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92812zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn((kz0.eablkybsjg) obj, ((Boolean) obj2).booleanValue(), (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f92812zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return gg.cqumvgiudr.iobyxmoadg((kz0.eablkybsjg) this.f92811yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f92810jyumaefscl));
        }

        public final Object ojitshcjhn(kz0.eablkybsjg eablkybsjgVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f92811yggfygwlhe = eablkybsjgVar;
            jyumaefsclVar.f92810jyumaefscl = z13;
            return jyumaefsclVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class kcexrzcfyt implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f92813yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f92814zdlpuopuiu;

        kcexrzcfyt(hkdspvbjdz hkdspvbjdzVar, iobyxmoadg iobyxmoadgVar) {
            this.f92814zdlpuopuiu = hkdspvbjdzVar;
            this.f92813yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(go0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            boolean z13;
            boolean zIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            boolean zZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zIobyxmoadg), this.f92814zdlpuopuiu.f60015zdlpuopuiu)) {
                z13 = false;
            } else {
                this.f92814zdlpuopuiu.f60015zdlpuopuiu = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zIobyxmoadg);
                z13 = true;
            }
            if (zZoijcleaow ? true : z13) {
                this.f92813yggfygwlhe.rhgxfdycjh(zIobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ boolean f92815jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92816yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92817zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn((List) obj, ((Boolean) obj2).booleanValue(), (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f92817zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return gg.cqumvgiudr.iobyxmoadg((List) this.f92816yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f92815jyumaefscl));
        }

        public final Object ojitshcjhn(List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            lereixgezr lereixgezrVar = new lereixgezr(gxszxtbevoVar);
            lereixgezrVar.f92816yggfygwlhe = list;
            lereixgezrVar.f92815jyumaefscl = z13;
            return lereixgezrVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f92819esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f92820iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f92821jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f92822yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92823zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92820iwizpuwonk = obj;
            this.f92819esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.d(null, false, this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f92824iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92826yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92827zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92826yggfygwlhe = obj;
            this.f92824iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.g(null, this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92829yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92830zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ojitshcjhn ojitshcjhnVar = iobyxmoadg.this.new ojitshcjhn(gxszxtbevoVar);
            ojitshcjhnVar.f92829yggfygwlhe = obj;
            return ojitshcjhnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f92830zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            dz0.eablkybsjg eablkybsjgVar = (dz0.eablkybsjg) this.f92829yggfygwlhe;
            if (eablkybsjgVar instanceof dz0.eablkybsjg.iobyxmoadg) {
                iobyxmoadg.this.x(((dz0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof dz0.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.this.z(((dz0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ boolean f92831iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ boolean f92832jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f92833yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92834zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f92834zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return new go0.iobyxmoadg(this.f92833yggfygwlhe, this.f92832jyumaefscl, this.f92831iwizpuwonk);
        }

        public final Object ojitshcjhn(boolean z13, boolean z14, boolean z15, lg.gxszxtbevo gxszxtbevoVar) {
            oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            oxmwwwfdhmVar.f92833yggfygwlhe = z13;
            oxmwwwfdhmVar.f92832jyumaefscl = z14;
            oxmwwwfdhmVar.f92831iwizpuwonk = z15;
            return oxmwwwfdhmVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class pmvmpeiblj implements sj.nufgyqmvbu {
        pmvmpeiblj() {
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.ojitshcjhn((List) vdvldrhtssVar.iobyxmoadg()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f92836iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92838yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92839zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92838yggfygwlhe = obj;
            this.f92836iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ixidwrxhsl(this);
        }
    }

    public static final class rgvfuqvkyq implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f92840zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$rgvfuqvkyq$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2166iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f92841zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2167iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f92843yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f92844zdlpuopuiu;

                public C2167iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f92844zdlpuopuiu = obj;
                    this.f92843yggfygwlhe |= Integer.MIN_VALUE;
                    return C2166iobyxmoadg.this.emit(null, this);
                }
            }

            public C2166iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f92841zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2167iobyxmoadg c2167iobyxmoadg;
                if (gxszxtbevoVar instanceof C2167iobyxmoadg) {
                    c2167iobyxmoadg = (C2167iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2167iobyxmoadg.f92843yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2167iobyxmoadg.f92843yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2167iobyxmoadg = new C2167iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2167iobyxmoadg = new C2167iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2167iobyxmoadg.f92844zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2167iobyxmoadg.f92843yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f92841zdlpuopuiu;
                    if (((go0.iobyxmoadg) obj).ppxfxbqfkf()) {
                        c2167iobyxmoadg.f92843yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2167iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public rgvfuqvkyq(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f92840zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f92840zdlpuopuiu.collect(new C2166iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class vdvldrhtss implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f92845zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$vdvldrhtss$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2168iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f92846zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$vdvldrhtss$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2169iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f92848yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f92849zdlpuopuiu;

                public C2169iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f92849zdlpuopuiu = obj;
                    this.f92848yggfygwlhe |= Integer.MIN_VALUE;
                    return C2168iobyxmoadg.this.emit(null, this);
                }
            }

            public C2168iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f92846zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2169iobyxmoadg c2169iobyxmoadg;
                if (gxszxtbevoVar instanceof C2169iobyxmoadg) {
                    c2169iobyxmoadg = (C2169iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2169iobyxmoadg.f92848yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2169iobyxmoadg.f92848yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2169iobyxmoadg = new C2169iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2169iobyxmoadg = new C2169iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2169iobyxmoadg.f92849zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2169iobyxmoadg.f92848yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f92846zdlpuopuiu;
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((UserState) obj).rgvfuqvkyq());
                    c2169iobyxmoadg.f92848yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c2169iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public vdvldrhtss(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f92845zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f92845zdlpuopuiu.collect(new C2168iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f92851yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92852zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wflxmlrfwp(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0090 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92851yggfygwlhe;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else if (i13 == 2) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc = (Cart) obj;
                        this.f92852zdlpuopuiu = objWkgbmnqykc;
                        this.f92851yggfygwlhe = 3;
                        if (iobyxmoadg.this.d((Cart) objWkgbmnqykc, true, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.nufgyqmvbu(true));
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
                    iobyxmoadg.this.f92748ojitshcjhn.zoijcleaow(ym0.iobyxmoadg.zoijcleaow.f125946gxszxtbevo);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.nufgyqmvbu(false));
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                cz0.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f92754wkgbmnqykc;
                this.f92851yggfygwlhe = 1;
                obj = iobyxmoadgVar3.cdpycssgdh(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                if (!(thDxjokdxxww instanceof CancellationException)) {
                    iobyxmoadgVar5.v(thDxjokdxxww);
                }
                cz0.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar5.f92754wkgbmnqykc;
                this.f92851yggfygwlhe = 2;
                obj = iobyxmoadgVar6.zynmafqrjb(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = (Cart) obj;
            }
            this.f92852zdlpuopuiu = objWkgbmnqykc;
            this.f92851yggfygwlhe = 3;
            if (iobyxmoadg.this.d((Cart) objWkgbmnqykc, true, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.nufgyqmvbu(true));
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
            iobyxmoadg.this.f92748ojitshcjhn.zoijcleaow(ym0.iobyxmoadg.zoijcleaow.f125946gxszxtbevo);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f92853iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92855yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92856zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92855yggfygwlhe = obj;
            this.f92853iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jrbgnlbqoe(0, this);
        }
    }

    public static final class yggfygwlhe implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f92857zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$yggfygwlhe$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2170iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f92858zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2171iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f92860yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f92861zdlpuopuiu;

                public C2171iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f92861zdlpuopuiu = obj;
                    this.f92860yggfygwlhe |= Integer.MIN_VALUE;
                    return C2170iobyxmoadg.this.emit(null, this);
                }
            }

            public C2170iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f92858zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2171iobyxmoadg c2171iobyxmoadg;
                if (gxszxtbevoVar instanceof C2171iobyxmoadg) {
                    c2171iobyxmoadg = (C2171iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2171iobyxmoadg.f92860yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2171iobyxmoadg.f92860yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2171iobyxmoadg = new C2171iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2171iobyxmoadg = new C2171iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2171iobyxmoadg.f92861zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2171iobyxmoadg.f92860yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f92858zdlpuopuiu;
                    kz0.eablkybsjg eablkybsjgVar = (kz0.eablkybsjg) ((gg.vdvldrhtss) obj).iobyxmoadg();
                    c2171iobyxmoadg.f92860yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(eablkybsjgVar, c2171iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public yggfygwlhe(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f92857zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f92857zdlpuopuiu.collect(new C2170iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f92862zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$zdlpuopuiu$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2172iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f92863zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg$zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2173iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f92865yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f92866zdlpuopuiu;

                public C2173iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f92866zdlpuopuiu = obj;
                    this.f92865yggfygwlhe |= Integer.MIN_VALUE;
                    return C2172iobyxmoadg.this.emit(null, this);
                }
            }

            public C2172iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f92863zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2173iobyxmoadg c2173iobyxmoadg;
                if (gxszxtbevoVar instanceof C2173iobyxmoadg) {
                    c2173iobyxmoadg = (C2173iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2173iobyxmoadg.f92865yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2173iobyxmoadg.f92865yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2173iobyxmoadg = new C2173iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2173iobyxmoadg = new C2173iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2173iobyxmoadg.f92866zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2173iobyxmoadg.f92865yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f92863zdlpuopuiu;
                    if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                        c2173iobyxmoadg.f92865yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2173iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public zdlpuopuiu(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f92862zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f92862zdlpuopuiu.collect(new C2172iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f92867cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f92869jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f92870yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92871zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92869jyumaefscl = obj;
            this.f92867cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.mhtqkkgtqm(this);
        }
    }

    static final class zynmafqrjb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92873zdlpuopuiu;

        zynmafqrjb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zynmafqrjb(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92873zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    r01.dxjokdxxww dxjokdxxwwVar = iobyxmoadgVar.f92753wflxmlrfwp;
                    this.f92873zdlpuopuiu = 1;
                    obj = dxjokdxxwwVar.gxszxtbevo(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            List listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = listWflxmlrfwp;
            }
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.C2159gxszxtbevo((List) objWkgbmnqykc));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zynmafqrjb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(cz0.iobyxmoadg cartInteractor, m11.iobyxmoadg getRestaurantDetailsUseCase, p01.ppxfxbqfkf clearCartUseCase, ow1.esjtqupxsv isAuthUseCase, jpowsppfya subscribeUserStateUseCase, p01.dxjokdxxww subscribeToCartStateUseCase, dr0.iobyxmoadg dispatchersProvider, dz0.gtknphoqwx productChangesSourceProvider, p01.gxszxtbevo subscribeCartCompoundStateUseCase, r01.dxjokdxxww getProductRecommendationsUseCase, dl0.iobyxmoadg getUserAddressFlowInfo, vm0.zoijcleaow analyticsTracker) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRestaurantDetailsUseCase, "getRestaurantDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserStateUseCase, "subscribeUserStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartStateUseCase, "subscribeToCartStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeCartCompoundStateUseCase, "subscribeCartCompoundStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductRecommendationsUseCase, "getProductRecommendationsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f92750ppxfxbqfkf = new pw0.ppxfxbqfkf();
        this.f92754wkgbmnqykc = cartInteractor;
        this.f92743eablkybsjg = getRestaurantDetailsUseCase;
        this.f92745gxszxtbevo = clearCartUseCase;
        this.f92746lqeggnwhkg = isAuthUseCase;
        this.f92747nufgyqmvbu = subscribeUserStateUseCase;
        this.f92742dxjokdxxww = subscribeToCartStateUseCase;
        this.f92740btonecajqb = dispatchersProvider;
        this.f92744gtknphoqwx = productChangesSourceProvider;
        this.f92741draadjrbmk = subscribeCartCompoundStateUseCase;
        this.f92753wflxmlrfwp = getProductRecommendationsUseCase;
        this.f92739agtfadlqog = getUserAddressFlowInfo;
        this.f92748ojitshcjhn = analyticsTracker;
        this.f92749oxmwwwfdhm = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: go0.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.cart.impl.domain.store.iobyxmoadg.A(this.f38000zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dz0.btonecajqb A(iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar.f92744gtknphoqwx.iobyxmoadg(dz0.btonecajqb.iobyxmoadg.C0620iobyxmoadg.f29970iobyxmoadg);
    }

    private final void B() {
        auzgnhcxok auzgnhcxokVar = this.f92751rgvfuqvkyq;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f92751rgvfuqvkyq = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wflxmlrfwp(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        this.f92748ojitshcjhn.ppxfxbqfkf(ym0.iobyxmoadg.C3205iobyxmoadg.f125945gxszxtbevo);
        Object objInvoke = draadjrbmkVar.invoke(gxszxtbevoVar);
        return objInvoke == mg.zoijcleaow.gxszxtbevo() ? objInvoke : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ikoacuggdj(c(), new agtfadlqog(null, this)), new ojitshcjhn(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(lg.gxszxtbevo gxszxtbevoVar) {
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        jpowsppfya jpowsppfyaVar = this.f92747nufgyqmvbu;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objCollect = new rgvfuqvkyq(sj.dxjokdxxww.draadjrbmk(new vdvldrhtss((sj.lqeggnwhkg) jpowsppfyaVar.zoijcleaow(wwaezpbzknVar)), this.f92741draadjrbmk.zoijcleaow(wwaezpbzknVar), c(), new oxmwwwfdhm(null))).collect(new kcexrzcfyt(hkdspvbjdzVar, this), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(lg.gxszxtbevo gxszxtbevoVar) {
        p01.dxjokdxxww dxjokdxxwwVar = this.f92742dxjokdxxww;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objCollect = sj.dxjokdxxww.vdvldrhtss(new yggfygwlhe(sj.dxjokdxxww.gxszxtbevo(new zdlpuopuiu(sj.dxjokdxxww.wflxmlrfwp(dxjokdxxwwVar.zoijcleaow(wwaezpbzknVar), c(), new jyumaefscl(null))), new iwizpuwonk(null)))).collect(new cqumvgiudr(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = new esjtqupxsv(sj.dxjokdxxww.wflxmlrfwp(krqnebusok().iobyxmoadg(), c(), new lereixgezr(null))).collect(new pmvmpeiblj(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void J(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f92748ojitshcjhn.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Basket.f92301iwizpuwonk, analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void K(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.J(analyticsPage, analyticElement, analyticsLocation);
    }

    private final void L() {
        auzgnhcxok auzgnhcxokVar = this.f92752vdvldrhtss;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f92752vdvldrhtss = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zynmafqrjb(null), 3, null);
    }

    private final PromoCodeEditorState a(Promocode promocode, boolean z13) {
        String value = z13 ? promocode != null ? promocode.getValue() : null : null;
        if (value == null) {
            value = "";
        }
        pt0.btonecajqb btonecajqbVarB = b(promocode);
        return new PromoCodeEditorState(new tzroggbefp(value, 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null), value, btonecajqbVarB, btonecajqbVarB);
    }

    private final pt0.btonecajqb b(Promocode promocode) {
        if (promocode == null || mj.kcexrzcfyt.zfvoamnweg(promocode.getValue())) {
            return pt0.btonecajqb.NOT_ENTERED;
        }
        if (promocode.getStatus()) {
            return pt0.btonecajqb.APPLIED;
        }
        return !promocode.getStatus() ? pt0.btonecajqb.NOT_APPLIED : pt0.btonecajqb.NOT_ENTERED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Cart cart, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f92819esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f92819esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objZoijcleaow = lqeggnwhkgVar.f92820iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f92819esjtqupxsv;
        RestaurantDetails restaurantDetails = null;
        Object obj = null;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            z(cart.getWarning());
            String partnerCode = cart.getPartnerCode();
            boolean z14 = cart.dxjokdxxww() == DeliveryCode.PICKUP;
            if (partnerCode == null || partnerCode.length() == 0 || !z14) {
                iobyxmoadgVar = this;
            } else {
                m11.iobyxmoadg.zoijcleaow zoijcleaowVar = new m11.iobyxmoadg.zoijcleaow(partnerCode, null, 0, 6, null);
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    m11.iobyxmoadg iobyxmoadgVar3 = this.f92743eablkybsjg;
                    lqeggnwhkgVar.f92823zdlpuopuiu = this;
                    lqeggnwhkgVar.f92822yggfygwlhe = cart;
                    lqeggnwhkgVar.f92821jyumaefscl = z13;
                    lqeggnwhkgVar.f92819esjtqupxsv = 1;
                    objZoijcleaow = iobyxmoadgVar3.zoijcleaow(zoijcleaowVar, lqeggnwhkgVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar = this;
                } catch (Throwable th2) {
                    th = th2;
                    iobyxmoadgVar = this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            }
            PromoCodeEditorState promoCodeEditorStateA = iobyxmoadgVar.a(cart.getPromocode(), cart.getIsMappedValid());
            if (z13) {
                iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.zoijcleaow(cart.getLoadInfo()));
            }
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.iobyxmoadg(cart, restaurantDetails, promoCodeEditorStateA, iobyxmoadgVar.eslsurpljm((State) iobyxmoadgVar.jlmebxxoox(), cart.getBasket())));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z13 = lqeggnwhkgVar.f92821jyumaefscl;
        cart = (Cart) lqeggnwhkgVar.f92822yggfygwlhe;
        iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f92823zdlpuopuiu;
        try {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        } catch (Throwable th3) {
            th = th3;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((RestaurantDetails) objZoijcleaow);
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww == null) {
            obj = objWkgbmnqykc;
        } else {
            iobyxmoadgVar.x(thDxjokdxxww);
        }
        restaurantDetails = (RestaurantDetails) obj;
        PromoCodeEditorState promoCodeEditorStateA2 = iobyxmoadgVar.a(cart.getPromocode(), cart.getIsMappedValid());
        if (z13) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.zoijcleaow(cart.getLoadInfo()));
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.iobyxmoadg(cart, restaurantDetails, promoCodeEditorStateA2, iobyxmoadgVar.eslsurpljm((State) iobyxmoadgVar.jlmebxxoox(), cart.getBasket())));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ Object e(iobyxmoadg iobyxmoadgVar, Cart cart, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return iobyxmoadgVar.d(cart, z13, gxszxtbevoVar);
    }

    private final kz0.nufgyqmvbu eslsurpljm(State state, List list) {
        if (state.getIsCartFetched() && (list == null || list.isEmpty())) {
            return kz0.nufgyqmvbu.EMPTY;
        }
        if (!state.getIsCartFetched() || list == null || list.isEmpty()) {
            return null;
        }
        return kz0.nufgyqmvbu.HIDE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(State state, lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f92824iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f92824iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object obj = nufgyqmvbuVar.f92826yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f92824iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            PromoCodeEditorState promoCodeEditorState = state.getPromoCodeEditorState();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(promoCodeEditorState.getPromoCodeFromInput().draadjrbmk(), promoCodeEditorState.getPromoCodeFromServer())) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
            cz0.iobyxmoadg iobyxmoadgVar2 = this.f92754wkgbmnqykc;
            String strDraadjrbmk = promoCodeEditorState.getPromoCodeFromInput().draadjrbmk();
            nufgyqmvbuVar.f92827zdlpuopuiu = this;
            nufgyqmvbuVar.f92824iwizpuwonk = 1;
            if (iobyxmoadgVar2.oxmwwwfdhm(strDraadjrbmk, nufgyqmvbuVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) nufgyqmvbuVar.f92827zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    private final Object grlcpdaxtj(boolean z13, String str, Integer num, Integer num2, Integer num3, lg.gxszxtbevo gxszxtbevoVar) {
        boolean z14;
        Object objJrbgnlbqoe;
        Integer numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(str);
        if (z13 && (numVdvldrhtss == null || numVdvldrhtss.intValue() != 0)) {
            if ((num != null ? num.intValue() : 0) != 0) {
                if (str.length() == 0) {
                    z14 = true;
                }
            }
            z14 = false;
        } else {
            z14 = true;
        }
        int iMin = Math.min(num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
        int iIntValue = numVdvldrhtss != null ? numVdvldrhtss.intValue() : iMin;
        if (z14) {
            Object objIxidwrxhsl = ixidwrxhsl(gxszxtbevoVar);
            return objIxidwrxhsl == mg.zoijcleaow.gxszxtbevo() ? objIxidwrxhsl : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (numVdvldrhtss == null) {
            if (str.length() > 0) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }
        if (numVdvldrhtss != null && numVdvldrhtss.intValue() > iMin) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (iMin == 0) {
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.wkgbmnqykc(true));
        } else if (iIntValue == 0) {
            Object objIxidwrxhsl2 = ixidwrxhsl(gxszxtbevoVar);
            return objIxidwrxhsl2 == mg.zoijcleaow.gxszxtbevo() ? objIxidwrxhsl2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        String strValueOf = String.valueOf(iIntValue);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, strValueOf)) {
            strValueOf = null;
        }
        String str2 = strValueOf;
        if (str2 != null) {
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.eablkybsjg(new tzroggbefp(str2, m.iobyxmoadg(str2.length()), (l) null, 4, (kotlin.jvm.internal.gtknphoqwx) null)));
        }
        return ((num != null && num.intValue() == iIntValue) || (objJrbgnlbqoe = jrbgnlbqoe(iIntValue, gxszxtbevoVar)) != mg.zoijcleaow.gxszxtbevo()) ? wwaezpbzkn.f37140iobyxmoadg : objJrbgnlbqoe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(State state, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f92770iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f92770iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        dxjokdxxww dxjokdxxwwVar2 = dxjokdxxwwVar;
        Object obj = dxjokdxxwwVar2.f92772yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar2.f92770iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            CartBonuses cartBonuses = state.getCart().getCartBonuses();
            if (cartBonuses != null) {
                boolean isEnabled = state.getBonusesEditorState().getIsEnabled();
                String strDraadjrbmk = state.getBonusesEditorState().getValue().draadjrbmk();
                Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getApplied());
                Integer numWkgbmnqykc2 = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getBalance());
                Integer numWkgbmnqykc3 = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getAvailable());
                dxjokdxxwwVar2.f92773zdlpuopuiu = cartBonuses;
                dxjokdxxwwVar2.f92770iwizpuwonk = 1;
                if (grlcpdaxtj(isEnabled, strDraadjrbmk, numWkgbmnqykc, numWkgbmnqykc2, numWkgbmnqykc3, dxjokdxxwwVar2) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final /* synthetic */ State hszhottldk(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(boolean z13, State state, lg.gxszxtbevo gxszxtbevoVar) {
        String strDraadjrbmk = state.getBonusesEditorState().getValue().draadjrbmk();
        CartBonuses cartBonuses = state.getCart().getCartBonuses();
        Integer numWkgbmnqykc = cartBonuses != null ? kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getApplied()) : null;
        CartBonuses cartBonuses2 = state.getCart().getCartBonuses();
        Integer numWkgbmnqykc2 = cartBonuses2 != null ? kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses2.getBalance()) : null;
        CartBonuses cartBonuses3 = state.getCart().getCartBonuses();
        Object objGrlcpdaxtj = grlcpdaxtj(z13, strDraadjrbmk, numWkgbmnqykc, numWkgbmnqykc2, cartBonuses3 != null ? kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses3.getAvailable()) : null, gxszxtbevoVar);
        return objGrlcpdaxtj == mg.zoijcleaow.gxszxtbevo() ? objGrlcpdaxtj : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ixidwrxhsl(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f92836iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f92836iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f92838yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f92836iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.ppxfxbqfkf(0));
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.wkgbmnqykc(false));
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.eablkybsjg(new tzroggbefp((String) null, 0L, (l) null, 7, (kotlin.jvm.internal.gtknphoqwx) null)));
            cz0.iobyxmoadg iobyxmoadgVar2 = this.f92754wkgbmnqykc;
            Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(0);
            ppxfxbqfkfVar.f92839zdlpuopuiu = this;
            ppxfxbqfkfVar.f92836iwizpuwonk = 1;
            if (iobyxmoadgVar2.vdvldrhtss(numWkgbmnqykc, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f92839zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(tzroggbefp tzroggbefpVar) {
        ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.eablkybsjg(tzroggbefpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jrbgnlbqoe(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i14 = wkgbmnqykcVar.f92853iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f92853iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f92855yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = wkgbmnqykcVar.f92853iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.ppxfxbqfkf(i13));
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.wkgbmnqykc(true));
            cz0.iobyxmoadg iobyxmoadgVar2 = this.f92754wkgbmnqykc;
            Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13);
            wkgbmnqykcVar.f92856zdlpuopuiu = this;
            wkgbmnqykcVar.f92853iwizpuwonk = 1;
            if (iobyxmoadgVar2.vdvldrhtss(numWkgbmnqykc, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f92856zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(wo0.ojitshcjhn ojitshcjhnVar) {
        k21.ojitshcjhn ojitshcjhnVarGxszxtbevo = ojitshcjhnVar.gxszxtbevo();
        if (ojitshcjhnVarGxszxtbevo == null) {
            return;
        }
        crxdokpmqz(new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.lqeggnwhkg(new NavigationPayload(ojitshcjhnVarGxszxtbevo, ojitshcjhnVar.lqeggnwhkg(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.Basket.f92301iwizpuwonk, AnalyticsLocation.LoadInfoBanner.f92279iwizpuwonk, new AnalyticElement.LoadInfoElement(ojitshcjhnVar.nufgyqmvbu())), false, 188, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dz0.btonecajqb krqnebusok() {
        return (dz0.btonecajqb) this.f92749oxmwwwfdhm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(HintUiModel hintUiModel, AnalyticElement.ProductItemElement productItemElement, AnalyticsLocation analyticsLocation) {
        crxdokpmqz(new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.gxszxtbevo(hintUiModel, new HintDialogAnalyticsInfo(productItemElement, AnalyticsPage.Basket.f92301iwizpuwonk, analyticsLocation)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        K(this, AnalyticsPage.ChoosingDateInterval.f92308iwizpuwonk, null, null, 6, null);
        crxdokpmqz(ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.dxjokdxxww.f92700iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object mhtqkkgtqm(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        Object obj;
        iobyxmoadg iobyxmoadgVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f92867cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f92867cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f92869jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f92867cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f92871zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                } catch (Throwable th2) {
                    th = th2;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = zoijcleaowVar.f92870yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f92871zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.x(thDxjokdxxww);
            }
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.btonecajqb.f92719iobyxmoadg);
        ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
        p01.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar4 = new p01.ppxfxbqfkf.iobyxmoadg(((State) jlmebxxoox()).getCart().getPartnerCode());
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
            p01.ppxfxbqfkf ppxfxbqfkfVar = this.f92745gxszxtbevo;
            zoijcleaowVar.f92871zdlpuopuiu = this;
            zoijcleaowVar.f92867cqumvgiudr = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar4, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } catch (Throwable th3) {
            th = th3;
            iobyxmoadgVar = this;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Cart) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            zoijcleaowVar.f92871zdlpuopuiu = iobyxmoadgVar;
            zoijcleaowVar.f92870yggfygwlhe = objWkgbmnqykc;
            zoijcleaowVar.f92867cqumvgiudr = 2;
            if (iobyxmoadgVar.d((Cart) objWkgbmnqykc, true, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj = objWkgbmnqykc;
            iobyxmoadgVar2 = iobyxmoadgVar;
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
        }
        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.x(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        K(this, AnalyticsPage.Receiver.f92368iwizpuwonk, null, null, 6, null);
        CartReceiver receiver = ((State) jlmebxxoox()).getCart().getReceiver();
        String name = receiver != null ? receiver.getName() : null;
        if (name == null) {
            name = "";
        }
        String phone = receiver != null ? receiver.getPhone() : null;
        crxdokpmqz(new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.gtknphoqwx(name, phone != null ? phone : ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(go0.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object next;
        List basket = ((State) jlmebxxoox()).getCart().getBasket();
        if (basket == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Iterator it = basket.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) next).getId(), ppxfxbqfkfVar.zoijcleaow()));
        CartProduct cartProduct = (CartProduct) next;
        if (cartProduct != null) {
            ChangeProductParams changeProductParamsIobyxmoadg = ChangeProductParams.INSTANCE.iobyxmoadg(cartProduct, ppxfxbqfkfVar.iobyxmoadg(), new ChangeProductAnalyticParams(AnalyticsPage.Basket.f92301iwizpuwonk, null, cartProduct.getName()));
            if (changeProductParamsIobyxmoadg != null) {
                Object objPpxfxbqfkf = krqnebusok().ppxfxbqfkf(changeProductParamsIobyxmoadg, gxszxtbevoVar);
                return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(String str, AnalyticElement.ProductItemElement productItemElement, AnalyticsLocation.ItemFeed itemFeed) {
        if (((State) jlmebxxoox()).getIsPartnerCart()) {
            return;
        }
        J(new AnalyticsPage.ItemDetail(productItemElement.getId(), productItemElement.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String()), productItemElement, itemFeed);
        crxdokpmqz(new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.draadjrbmk(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object q(String str, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        CartProduct cartProduct;
        iobyxmoadg iobyxmoadgVar;
        Object next;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f92759iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f92759iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        btonecajqb btonecajqbVar2 = btonecajqbVar;
        Object objYadqdtsiqt = btonecajqbVar2.f92761yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar2.f92759iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objYadqdtsiqt);
            Cart cart = ((State) jlmebxxoox()).getCart();
            List basket = cart.getBasket();
            if (basket != null) {
                Iterator it = basket.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) next).getId(), str));
                cartProduct = (CartProduct) next;
            } else {
                cartProduct = null;
            }
            if (cart.getBasket() == null || cartProduct == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.lqeggnwhkg(true));
            this.f92748ojitshcjhn.wkgbmnqykc(new xm0.ppxfxbqfkf.C3094ppxfxbqfkf(new xm0.iobyxmoadg(AnalyticsPage.Basket.f92301iwizpuwonk, null, new AnalyticElement.ChangeItemElement(cartProduct.getArticle(), cartProduct.getName(), 0.0d, cartProduct.getMeasureTypeModel().getCurrentMeasure().getValue()))));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                cz0.iobyxmoadg iobyxmoadgVar3 = this.f92754wkgbmnqykc;
                MeasureType currentMeasure = cartProduct.getMeasureTypeModel().getCurrentMeasure();
                btonecajqbVar2.f92762zdlpuopuiu = this;
                btonecajqbVar2.f92759iwizpuwonk = 1;
                objYadqdtsiqt = iobyxmoadgVar3.yadqdtsiqt(str, 0.0d, currentMeasure, btonecajqbVar2);
                if (objYadqdtsiqt == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) btonecajqbVar2.f92762zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objYadqdtsiqt);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Cart) objYadqdtsiqt);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.lqeggnwhkg(false));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.lqeggnwhkg(false));
            iobyxmoadgVar.v(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(State state, tzroggbefp tzroggbefpVar) {
        PromoCodeEditorState promoCodeEditorState = state.getPromoCodeEditorState();
        pt0.btonecajqb stateFromServer = (!mj.kcexrzcfyt.zfvoamnweg(tzroggbefpVar.draadjrbmk()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(promoCodeEditorState.getPromoCodeFromServer(), tzroggbefpVar.draadjrbmk())) ? promoCodeEditorState.getStateFromServer() : pt0.btonecajqb.NOT_ENTERED;
        ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.agtfadlqog(tzroggbefpVar, stateFromServer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rhgxfdycjh(boolean z13) {
        if (z13) {
            B();
            L();
        } else {
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.C2159gxszxtbevo(hg.jyumaefscl.wflxmlrfwp()));
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(go0.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        List recommendations = ((State) jlmebxxoox()).getRecommendations();
        if (recommendations.isEmpty()) {
            recommendations = null;
        }
        if (recommendations == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Product productIobyxmoadg = mz0.zoijcleaow.iobyxmoadg(recommendations, ppxfxbqfkfVar.zoijcleaow());
        if (productIobyxmoadg != null) {
            ChangeProductParams changeProductParamsZoijcleaow = ChangeProductParams.INSTANCE.zoijcleaow(productIobyxmoadg, ppxfxbqfkfVar.iobyxmoadg(), new ChangeProductAnalyticParams(AnalyticsPage.Basket.f92301iwizpuwonk, new AnalyticsLocation.ItemFeed(null, ppxfxbqfkfVar.ppxfxbqfkf(), 1, null), productIobyxmoadg.getName()));
            if (changeProductParamsZoijcleaow != null) {
                Object objPpxfxbqfkf = krqnebusok().ppxfxbqfkf(changeProductParamsZoijcleaow, gxszxtbevoVar);
                return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f92782iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f92782iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object objCdpycssgdh = gtknphoqwxVar.f92784yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f92782iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objCdpycssgdh);
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.wflxmlrfwp(true));
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                cz0.iobyxmoadg iobyxmoadgVar3 = this.f92754wkgbmnqykc;
                gtknphoqwxVar.f92785zdlpuopuiu = this;
                gtknphoqwxVar.f92782iwizpuwonk = 1;
                objCdpycssgdh = iobyxmoadgVar3.cdpycssgdh(gtknphoqwxVar);
                if (objCdpycssgdh == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) gtknphoqwxVar.f92785zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objCdpycssgdh);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Cart) objCdpycssgdh);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.y((Cart) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.x(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.wflxmlrfwp(false));
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new draadjrbmk(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Throwable th2) {
        if (!(th2 instanceof DeliveryIntervalNotValidException)) {
            x(th2);
        } else {
            ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.draadjrbmk(new CartStore$CartDialogType.DeliveryIntervalErrorDialog(((DeliveryIntervalNotValidException) th2).getMessage())));
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        this.f92748ojitshcjhn.wkgbmnqykc(new xm0.wkgbmnqykc());
        crxdokpmqz(ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.zoijcleaow.f92716iobyxmoadg);
        ulzqkzuiru(ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.dxjokdxxww.f92721iobyxmoadg);
        ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.rgvfuqvkyq(eslsurpljm((State) jlmebxxoox(), null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Cart cart) {
        z(cart.getWarning());
        K(this, AnalyticsPage.PaymentMethods.f92348iwizpuwonk, null, null, 6, null);
        PaymentType.Cart cart2 = new PaymentType.Cart(cart.dxjokdxxww());
        List payments = cart.getPayments();
        CartSum sum = cart.getSum();
        crxdokpmqz(new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.wkgbmnqykc(new PaymentMethodsArgs(cart2, sum != null ? Double.valueOf(sum.getTotal()) : null, payments, cart.getCartBonuses() != null, cart.getChange())));
    }

    static /* synthetic */ void yzdjzghtvl(iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = ((Boolean) iobyxmoadgVar.f92746lqeggnwhkg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        }
        iobyxmoadgVar.rhgxfdycjh(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Warning warning) {
        if (new ah.wkgbmnqykc[]{kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class)}[0].zdlpuopuiu(warning)) {
            return;
        }
        crxdokpmqz(new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.ojitshcjhn(warning.getMessage()));
    }

    public void D(boolean z13) {
        this.f92750ppxfxbqfkf.eablkybsjg(z13);
    }

    public void E(boolean z13) {
        this.f92750ppxfxbqfkf.gxszxtbevo(z13);
    }

    public sj.lqeggnwhkg c() {
        return this.f92750ppxfxbqfkf.ppxfxbqfkf();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ezmngbhpjk, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(intent, this, null), 3, null);
    }

    public final void f() {
        this.f92748ojitshcjhn.ppxfxbqfkf(ym0.iobyxmoadg.zoijcleaow.f125946gxszxtbevo);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: fmlbqenlif, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.proloyalty.cart.impl.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(action, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    public void iobyxmoadg() {
        auzgnhcxok auzgnhcxokVar = this.f92751rgvfuqvkyq;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        auzgnhcxok auzgnhcxokVar2 = this.f92752vdvldrhtss;
        if (auzgnhcxokVar2 != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar2);
        }
        super.iobyxmoadg();
    }

    public final void x(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        crxdokpmqz(error instanceof ProductDailyLimitException ? new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.ojitshcjhn(((ProductDailyLimitException) error).getMessage()) : new ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.wflxmlrfwp(error));
    }
}

package ru.myspar.cart.impl.domain.store;

import gg.wwaezpbzkn;
import j0.l;
import j0.m;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.hkdspvbjdz;
import p0.tzroggbefp;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.CartBonuses;
import ru.myspar.core.domain.models.cart.CartProduct;
import ru.myspar.core.domain.models.cart.CartProgressBar;
import ru.myspar.core.domain.models.cart.CartProgressBarDeliveryTerms;
import ru.myspar.core.domain.models.cart.CartReceiver;
import ru.myspar.core.domain.models.cart.CartSum;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.core.error_handler.exceptions.DeliveryIntervalNotValidException;
import ru.myspar.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.promocode.Promocode;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.payment.api.model.PaymentMethodsArgs;
import ru.myspar.payment.api.model.PaymentType;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final zoijcleaow f84808kcexrzcfyt = new zoijcleaow(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final int f84809zdlpuopuiu = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final sm.iobyxmoadg f84810agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final l00.gtknphoqwx f84811btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final f20.gxszxtbevo f84812draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final f20.dxjokdxxww f84813dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final g30.iobyxmoadg f84814eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final z10.nufgyqmvbu f84815gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final f20.ppxfxbqfkf f84816gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final c20.eablkybsjg f84817lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final c20.dxjokdxxww f84818nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final lo.zoijcleaow f84819ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final gg.gtknphoqwx f84820oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f84821ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private auzgnhcxok f84822rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private auzgnhcxok f84823vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final h20.draadjrbmk f84824wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final k00.iobyxmoadg f84825wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84827zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new agtfadlqog(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f84827zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f84810agtfadlqog;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f84827zdlpuopuiu = 1;
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
            sm.iobyxmoadg.C2644iobyxmoadg c2644iobyxmoadg = (sm.iobyxmoadg.C2644iobyxmoadg) obj;
            iobyxmoadg.this.crxdokpmqz(new ru.myspar.cart.impl.domain.store.eablkybsjg.btonecajqb(c2644iobyxmoadg.zoijcleaow(), c2644iobyxmoadg.iobyxmoadg()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f84828iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84830yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84831zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f84830yggfygwlhe = obj;
            this.f84828iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.f(null, this);
        }
    }

    static final class cqumvgiudr implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$cqumvgiudr$iobyxmoadg, reason: collision with other inner class name */
        static final class C1921iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f84833iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f84835yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f84836zdlpuopuiu;

            C1921iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f84835yggfygwlhe = obj;
                this.f84833iwizpuwonk |= Integer.MIN_VALUE;
                return cqumvgiudr.this.emit(null, this);
            }
        }

        cqumvgiudr() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(t00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            C1921iobyxmoadg c1921iobyxmoadg;
            cqumvgiudr cqumvgiudrVar;
            if (gxszxtbevoVar instanceof C1921iobyxmoadg) {
                c1921iobyxmoadg = (C1921iobyxmoadg) gxszxtbevoVar;
                int i13 = c1921iobyxmoadg.f84833iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c1921iobyxmoadg.f84833iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    c1921iobyxmoadg = new C1921iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                c1921iobyxmoadg = new C1921iobyxmoadg(gxszxtbevoVar);
            }
            C1921iobyxmoadg c1921iobyxmoadg2 = c1921iobyxmoadg;
            Object obj = c1921iobyxmoadg2.f84835yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = c1921iobyxmoadg2.f84833iwizpuwonk;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (eablkybsjgVar instanceof t00.eablkybsjg.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    Cart cartIobyxmoadg = ((t00.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg();
                    c1921iobyxmoadg2.f84836zdlpuopuiu = this;
                    c1921iobyxmoadg2.f84833iwizpuwonk = 1;
                    if (iobyxmoadg.d(iobyxmoadgVar, cartIobyxmoadg, false, c1921iobyxmoadg2, 2, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(eablkybsjgVar instanceof t00.eablkybsjg.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg.this.v();
                }
                cqumvgiudrVar = this;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cqumvgiudrVar = (cqumvgiudr) c1921iobyxmoadg2.f84836zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.f84819ojitshcjhn.zoijcleaow(oo.iobyxmoadg.C1597iobyxmoadg.f73283gxszxtbevo);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f84837iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84839yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84840zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f84839yggfygwlhe = obj;
            this.f84837iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.p(null, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f84842esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f84843iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f84844jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f84845yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84846zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f84843iwizpuwonk = obj;
            this.f84842esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.c(null, false, this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f84847iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84849yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84850zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f84849yggfygwlhe = obj;
            this.f84847iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.mhtqkkgtqm(this);
        }
    }

    public static final class esjtqupxsv implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f84851zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$esjtqupxsv$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1922iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f84852zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$esjtqupxsv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1923iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f84854yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f84855zdlpuopuiu;

                public C1923iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f84855zdlpuopuiu = obj;
                    this.f84854yggfygwlhe |= Integer.MIN_VALUE;
                    return C1922iobyxmoadg.this.emit(null, this);
                }
            }

            public C1922iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f84852zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1923iobyxmoadg c1923iobyxmoadg;
                if (gxszxtbevoVar instanceof C1923iobyxmoadg) {
                    c1923iobyxmoadg = (C1923iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1923iobyxmoadg.f84854yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1923iobyxmoadg.f84854yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1923iobyxmoadg = new C1923iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1923iobyxmoadg = new C1923iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1923iobyxmoadg.f84855zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1923iobyxmoadg.f84854yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f84852zdlpuopuiu;
                    if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                        c1923iobyxmoadg.f84854yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1923iobyxmoadg) == objGxszxtbevo) {
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
            this.f84851zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f84851zdlpuopuiu.collect(new C1922iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f84856iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84858yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84859zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f84858yggfygwlhe = obj;
            this.f84856iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.g(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f84860iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84862yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84863zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f84862yggfygwlhe = obj;
            this.f84860iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ixidwrxhsl(0, this);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1924iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gg.vdvldrhtss f84864iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f84865ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f84866wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final y00.iobyxmoadg f84867zoijcleaow;

        public C1924iobyxmoadg(gg.vdvldrhtss isLoggedState, y00.iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedState, "isLoggedState");
            this.f84864iobyxmoadg = isLoggedState;
            this.f84867zoijcleaow = iobyxmoadgVar;
            this.f84865ppxfxbqfkf = z13;
            this.f84866wkgbmnqykc = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1924iobyxmoadg)) {
                return false;
            }
            C1924iobyxmoadg c1924iobyxmoadg = (C1924iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84864iobyxmoadg, c1924iobyxmoadg.f84864iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84867zoijcleaow, c1924iobyxmoadg.f84867zoijcleaow) && this.f84865ppxfxbqfkf == c1924iobyxmoadg.f84865ppxfxbqfkf && this.f84866wkgbmnqykc == c1924iobyxmoadg.f84866wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = this.f84864iobyxmoadg.hashCode() * 31;
            y00.iobyxmoadg iobyxmoadgVar = this.f84867zoijcleaow;
            return ((((iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode())) * 31) + Boolean.hashCode(this.f84865ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f84866wkgbmnqykc);
        }

        public final gg.vdvldrhtss iobyxmoadg() {
            return this.f84864iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f84865ppxfxbqfkf;
        }

        public String toString() {
            return "CartCombineState(isLoggedState=" + this.f84864iobyxmoadg + ", deliveryData=" + this.f84867zoijcleaow + ", isCartCompoundChanged=" + this.f84865ppxfxbqfkf + ", isScreenVisible=" + this.f84866wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f84866wkgbmnqykc;
        }

        public final y00.iobyxmoadg zoijcleaow() {
            return this.f84867zoijcleaow;
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84869yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84870zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f84870zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.w((Throwable) this.f84869yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            iwizpuwonk iwizpuwonkVar = iobyxmoadg.this.new iwizpuwonk(gxszxtbevoVar);
            iwizpuwonkVar.f84869yggfygwlhe = th2;
            return iwizpuwonkVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ boolean f84871jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84872yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84873zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn((t00.eablkybsjg) obj, ((Boolean) obj2).booleanValue(), (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f84873zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return gg.cqumvgiudr.iobyxmoadg((t00.eablkybsjg) this.f84872yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f84871jyumaefscl));
        }

        public final Object ojitshcjhn(t00.eablkybsjg eablkybsjgVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f84872yggfygwlhe = eablkybsjgVar;
            jyumaefsclVar.f84871jyumaefscl = z13;
            return jyumaefsclVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class kcexrzcfyt implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f84874jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f84875yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f84876zdlpuopuiu;

        kcexrzcfyt(hkdspvbjdz hkdspvbjdzVar, hkdspvbjdz hkdspvbjdzVar2, iobyxmoadg iobyxmoadgVar) {
            this.f84876zdlpuopuiu = hkdspvbjdzVar;
            this.f84875yggfygwlhe = hkdspvbjdzVar2;
            this.f84874jyumaefscl = iobyxmoadgVar;
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(C1924iobyxmoadg c1924iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            boolean z13;
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = c1924iobyxmoadg.iobyxmoadg();
            y00.iobyxmoadg iobyxmoadgVarZoijcleaow = c1924iobyxmoadg.zoijcleaow();
            boolean zPpxfxbqfkf = c1924iobyxmoadg.ppxfxbqfkf();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vdvldrhtssVarIobyxmoadg, this.f84876zdlpuopuiu.f60015zdlpuopuiu)) {
                z13 = false;
            } else {
                this.f84876zdlpuopuiu.f60015zdlpuopuiu = vdvldrhtssVarIobyxmoadg;
                z13 = true;
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84875yggfygwlhe.f60015zdlpuopuiu, iobyxmoadgVarZoijcleaow)) {
                this.f84875yggfygwlhe.f60015zdlpuopuiu = iobyxmoadgVarZoijcleaow;
                z13 = true;
            }
            if (zPpxfxbqfkf ? true : z13) {
                this.f84874jyumaefscl.ezmngbhpjk(((Boolean) vdvldrhtssVarIobyxmoadg.lqeggnwhkg()).booleanValue());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ boolean f84877jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84878yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84879zdlpuopuiu;

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
            if (this.f84879zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return gg.cqumvgiudr.iobyxmoadg((List) this.f84878yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f84877jyumaefscl));
        }

        public final Object ojitshcjhn(List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            lereixgezr lereixgezrVar = new lereixgezr(gxszxtbevoVar);
            lereixgezrVar.f84878yggfygwlhe = list;
            lereixgezrVar.f84877jyumaefscl = z13;
            return lereixgezrVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f84880jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.cart.impl.domain.store.ppxfxbqfkf f84881yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84882zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(ru.myspar.cart.impl.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f84881yggfygwlhe = ppxfxbqfkfVar;
            this.f84880jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new lqeggnwhkg(this.f84881yggfygwlhe, this.f84880jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f84882zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.cart.impl.domain.store.ppxfxbqfkf ppxfxbqfkfVar = this.f84881yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.cart.impl.domain.store.ppxfxbqfkf.iobyxmoadg.f84946iobyxmoadg)) {
                    this.f84880jyumaefscl.e();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.cart.impl.domain.store.ppxfxbqfkf.zoijcleaow.f84949iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f84880jyumaefscl;
                    this.f84882zdlpuopuiu = 1;
                    if (iobyxmoadgVar.F(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.cart.impl.domain.store.ppxfxbqfkf.wkgbmnqykc.f84948iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar2 = this.f84880jyumaefscl;
                    this.f84882zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.G(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.cart.impl.domain.store.ppxfxbqfkf.eablkybsjg.f84945iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar3 = this.f84880jyumaefscl;
                    this.f84882zdlpuopuiu = 3;
                    if (iobyxmoadgVar3.H(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.cart.impl.domain.store.ppxfxbqfkf.C1932ppxfxbqfkf.f84947iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar4 = this.f84880jyumaefscl;
                    this.f84882zdlpuopuiu = 4;
                    if (iobyxmoadgVar4.E(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f84883jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.cart.impl.domain.store.wkgbmnqykc f84884yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84885zdlpuopuiu;

        static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ru.myspar.cart.impl.domain.store.wkgbmnqykc f84886jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f84887yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f84888zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            eablkybsjg(iobyxmoadg iobyxmoadgVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f84887yggfygwlhe = iobyxmoadgVar;
                this.f84886jyumaefscl = wkgbmnqykcVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new eablkybsjg(this.f84887yggfygwlhe, this.f84886jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f84888zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f84887yggfygwlhe;
                    boolean zIobyxmoadg = ((ru.myspar.cart.impl.domain.store.wkgbmnqykc.lqeggnwhkg) this.f84886jyumaefscl).iobyxmoadg();
                    State stateWizcaqwiak = iobyxmoadg.wizcaqwiak(this.f84887yggfygwlhe);
                    this.f84888zdlpuopuiu = 1;
                    if (iobyxmoadgVar.h(zIobyxmoadg, stateWizcaqwiak, this) == objGxszxtbevo) {
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

        static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f84889yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f84890zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            gxszxtbevo(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f84889yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new gxszxtbevo(this.f84889yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f84890zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f84889yggfygwlhe;
                    State stateWizcaqwiak = iobyxmoadg.wizcaqwiak(iobyxmoadgVar);
                    this.f84890zdlpuopuiu = 1;
                    if (iobyxmoadgVar.g(stateWizcaqwiak, this) == objGxszxtbevo) {
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
                return ((gxszxtbevo) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$nufgyqmvbu$iobyxmoadg, reason: collision with other inner class name */
        static final class C1925iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ru.myspar.cart.impl.domain.store.wkgbmnqykc f84891jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f84892yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f84893zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1925iobyxmoadg(iobyxmoadg iobyxmoadgVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f84892yggfygwlhe = iobyxmoadgVar;
                this.f84891jyumaefscl = wkgbmnqykcVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new C1925iobyxmoadg(this.f84892yggfygwlhe, this.f84891jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f84893zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f84892yggfygwlhe;
                    String strIobyxmoadg = ((ru.myspar.cart.impl.domain.store.wkgbmnqykc.zdlpuopuiu) this.f84891jyumaefscl).iobyxmoadg();
                    this.f84893zdlpuopuiu = 1;
                    if (iobyxmoadgVar.p(strIobyxmoadg, this) == objGxszxtbevo) {
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
                return ((C1925iobyxmoadg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f84894yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f84895zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            lqeggnwhkg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f84894yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new lqeggnwhkg(this.f84894yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f84895zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f84894yggfygwlhe;
                    this.f84895zdlpuopuiu = 1;
                    if (iobyxmoadgVar.grlcpdaxtj(this) == objGxszxtbevo) {
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
            final /* synthetic */ ru.myspar.cart.impl.domain.store.wkgbmnqykc f84896jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f84897yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f84898zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f84897yggfygwlhe = iobyxmoadgVar;
                this.f84896jyumaefscl = wkgbmnqykcVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new ppxfxbqfkf(this.f84897yggfygwlhe, this.f84896jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f84898zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f84897yggfygwlhe;
                    ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ((ru.myspar.cart.impl.domain.store.wkgbmnqykc.jyumaefscl) this.f84896jyumaefscl).iobyxmoadg();
                    this.f84898zdlpuopuiu = 1;
                    if (iobyxmoadgVar.r(ppxfxbqfkfVarIobyxmoadg, this) == objGxszxtbevo) {
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
            final /* synthetic */ iobyxmoadg f84899yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f84900zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            wkgbmnqykc(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f84899yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new wkgbmnqykc(this.f84899yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f84900zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f84899yggfygwlhe;
                    State stateWizcaqwiak = iobyxmoadg.wizcaqwiak(iobyxmoadgVar);
                    this.f84900zdlpuopuiu = 1;
                    if (iobyxmoadgVar.f(stateWizcaqwiak, this) == objGxszxtbevo) {
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
            final /* synthetic */ ru.myspar.cart.impl.domain.store.wkgbmnqykc f84901jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f84902yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f84903zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(iobyxmoadg iobyxmoadgVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f84902yggfygwlhe = iobyxmoadgVar;
                this.f84901jyumaefscl = wkgbmnqykcVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f84902yggfygwlhe, this.f84901jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f84903zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = this.f84902yggfygwlhe;
                    ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ((ru.myspar.cart.impl.domain.store.wkgbmnqykc.eablkybsjg) this.f84901jyumaefscl).iobyxmoadg();
                    this.f84903zdlpuopuiu = 1;
                    if (iobyxmoadgVar.n(ppxfxbqfkfVarIobyxmoadg, this) == objGxszxtbevo) {
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
        nufgyqmvbu(ru.myspar.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f84884yggfygwlhe = wkgbmnqykcVar;
            this.f84883jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f84884yggfygwlhe, this.f84883jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Unexpected iteration count in SwitchBreakVisitor. Please report as an issue */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            CartProgressBarDeliveryTerms deliveryTerms;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            switch (this.f84885zdlpuopuiu) {
                case 0:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ru.myspar.cart.impl.domain.store.wkgbmnqykc wkgbmnqykcVar = this.f84884yggfygwlhe;
                    if (!(wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.wflxmlrfwp)) {
                        if (!(wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.lereixgezr)) {
                            if (!(wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.pmvmpeiblj)) {
                                if (!(wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.gxszxtbevo)) {
                                    if (!(wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.agtfadlqog)) {
                                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc.C1933wkgbmnqykc.f84978iobyxmoadg)) {
                                            this.f84883jyumaefscl.crxdokpmqz(ru.myspar.cart.impl.domain.store.eablkybsjg.iobyxmoadg.f84774iobyxmoadg);
                                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc.rgvfuqvkyq.f84975iobyxmoadg)) {
                                            this.f84883jyumaefscl.crxdokpmqz(ru.myspar.cart.impl.domain.store.eablkybsjg.ppxfxbqfkf.f84781iobyxmoadg);
                                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc.iwizpuwonk.f84963iobyxmoadg)) {
                                            this.f84883jyumaefscl.crxdokpmqz(ru.myspar.cart.impl.domain.store.eablkybsjg.gxszxtbevo.f84773iobyxmoadg);
                                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc.draadjrbmk.f84955iobyxmoadg)) {
                                            this.f84883jyumaefscl.crxdokpmqz(ru.myspar.cart.impl.domain.store.eablkybsjg.wkgbmnqykc.f84786iobyxmoadg);
                                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc.vdvldrhtss.f84976iobyxmoadg)) {
                                            iobyxmoadg.J(this.f84883jyumaefscl, AnalyticsPage.Comments.f84283iwizpuwonk, null, null, 6, null);
                                            this.f84883jyumaefscl.crxdokpmqz(ru.myspar.cart.impl.domain.store.eablkybsjg.draadjrbmk.f84768iobyxmoadg);
                                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc.oxmwwwfdhm.f84972iobyxmoadg)) {
                                            this.f84883jyumaefscl.m();
                                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.cart.impl.domain.store.wkgbmnqykc.istkbnxepw.f84962iobyxmoadg)) {
                                            iobyxmoadg.J(this.f84883jyumaefscl, AnalyticsPage.DeliveryTerms.f84290iwizpuwonk, null, null, 6, null);
                                            CartProgressBar progressBar = iobyxmoadg.wizcaqwiak(this.f84883jyumaefscl).getCart().getProgressBar();
                                            if (progressBar != null && (deliveryTerms = progressBar.getDeliveryTerms()) != null) {
                                                this.f84883jyumaefscl.crxdokpmqz(new ru.myspar.cart.impl.domain.store.eablkybsjg.rgvfuqvkyq(deliveryTerms));
                                            }
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.gtknphoqwx) {
                                            this.f84883jyumaefscl.j(((ru.myspar.cart.impl.domain.store.wkgbmnqykc.gtknphoqwx) this.f84884yggfygwlhe).iobyxmoadg());
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.esjtqupxsv) {
                                            this.f84883jyumaefscl.t();
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.ojitshcjhn) {
                                            this.f84883jyumaefscl.l();
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.kcexrzcfyt) {
                                            this.f84883jyumaefscl.o(((ru.myspar.cart.impl.domain.store.wkgbmnqykc.kcexrzcfyt) this.f84884yggfygwlhe).ppxfxbqfkf(), ((ru.myspar.cart.impl.domain.store.wkgbmnqykc.kcexrzcfyt) this.f84884yggfygwlhe).iobyxmoadg(), ((ru.myspar.cart.impl.domain.store.wkgbmnqykc.kcexrzcfyt) this.f84884yggfygwlhe).zoijcleaow());
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.zdlpuopuiu) {
                                            iobyxmoadg iobyxmoadgVar = this.f84883jyumaefscl;
                                            C1925iobyxmoadg c1925iobyxmoadg = new C1925iobyxmoadg(iobyxmoadgVar, this.f84884yggfygwlhe, null);
                                            this.f84885zdlpuopuiu = 1;
                                            if (iobyxmoadgVar.B(c1925iobyxmoadg, this) == objGxszxtbevo) {
                                                return objGxszxtbevo;
                                            }
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.eablkybsjg) {
                                            iobyxmoadg iobyxmoadgVar2 = this.f84883jyumaefscl;
                                            zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadgVar2, this.f84884yggfygwlhe, null);
                                            this.f84885zdlpuopuiu = 2;
                                            if (iobyxmoadgVar2.B(zoijcleaowVar, this) == objGxszxtbevo) {
                                                return objGxszxtbevo;
                                            }
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.jyumaefscl) {
                                            iobyxmoadg iobyxmoadgVar3 = this.f84883jyumaefscl;
                                            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(iobyxmoadgVar3, this.f84884yggfygwlhe, null);
                                            this.f84885zdlpuopuiu = 3;
                                            if (iobyxmoadgVar3.B(ppxfxbqfkfVar, this) == objGxszxtbevo) {
                                                return objGxszxtbevo;
                                            }
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.cqumvgiudr) {
                                            iobyxmoadg iobyxmoadgVar4 = this.f84883jyumaefscl;
                                            this.f84885zdlpuopuiu = 4;
                                            if (iobyxmoadgVar4.s(this) == objGxszxtbevo) {
                                                return objGxszxtbevo;
                                            }
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.yggfygwlhe) {
                                            iobyxmoadg iobyxmoadgVar5 = this.f84883jyumaefscl;
                                            iobyxmoadgVar5.q(iobyxmoadg.wizcaqwiak(iobyxmoadgVar5), ((ru.myspar.cart.impl.domain.store.wkgbmnqykc.yggfygwlhe) this.f84884yggfygwlhe).iobyxmoadg());
                                        } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.ppxfxbqfkf) {
                                            iobyxmoadg iobyxmoadgVar6 = this.f84883jyumaefscl;
                                            wkgbmnqykc wkgbmnqykcVar2 = new wkgbmnqykc(iobyxmoadgVar6, null);
                                            this.f84885zdlpuopuiu = 5;
                                            if (iobyxmoadgVar6.B(wkgbmnqykcVar2, this) == objGxszxtbevo) {
                                                return objGxszxtbevo;
                                            }
                                        } else if (!(wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.dxjokdxxww)) {
                                            if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.nufgyqmvbu) {
                                                this.f84883jyumaefscl.i(((ru.myspar.cart.impl.domain.store.wkgbmnqykc.nufgyqmvbu) this.f84884yggfygwlhe).iobyxmoadg());
                                            } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.lqeggnwhkg) {
                                                iobyxmoadg iobyxmoadgVar7 = this.f84883jyumaefscl;
                                                eablkybsjg eablkybsjgVar = new eablkybsjg(iobyxmoadgVar7, this.f84884yggfygwlhe, null);
                                                this.f84885zdlpuopuiu = 6;
                                                if (iobyxmoadgVar7.B(eablkybsjgVar, this) == objGxszxtbevo) {
                                                    return objGxszxtbevo;
                                                }
                                            } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.zoijcleaow) {
                                                iobyxmoadg iobyxmoadgVar8 = this.f84883jyumaefscl;
                                                gxszxtbevo gxszxtbevoVar = new gxszxtbevo(iobyxmoadgVar8, null);
                                                this.f84885zdlpuopuiu = 7;
                                                if (iobyxmoadgVar8.B(gxszxtbevoVar, this) == objGxszxtbevo) {
                                                    return objGxszxtbevo;
                                                }
                                            } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.iobyxmoadg) {
                                                this.f84883jyumaefscl.ulzqkzuiru(ru.myspar.cart.impl.domain.store.gxszxtbevo.btonecajqb.f84790iobyxmoadg);
                                            } else if (wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.zynmafqrjb) {
                                                this.f84883jyumaefscl.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.draadjrbmk(CartStore$CartDialogType.ClearCart.f84748zdlpuopuiu));
                                            } else {
                                                if (!(wkgbmnqykcVar instanceof ru.myspar.cart.impl.domain.store.wkgbmnqykc.btonecajqb)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                iobyxmoadg iobyxmoadgVar9 = this.f84883jyumaefscl;
                                                lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(iobyxmoadgVar9, null);
                                                this.f84885zdlpuopuiu = 8;
                                                if (iobyxmoadgVar9.B(lqeggnwhkgVar, this) == objGxszxtbevo) {
                                                    return objGxszxtbevo;
                                                }
                                            }
                                        }
                                        break;
                                    } else {
                                        this.f84883jyumaefscl.k(((ru.myspar.cart.impl.domain.store.wkgbmnqykc.agtfadlqog) wkgbmnqykcVar).ppxfxbqfkf(), ((ru.myspar.cart.impl.domain.store.wkgbmnqykc.agtfadlqog) this.f84884yggfygwlhe).iobyxmoadg(), ((ru.myspar.cart.impl.domain.store.wkgbmnqykc.agtfadlqog) this.f84884yggfygwlhe).zoijcleaow());
                                        break;
                                    }
                                } else {
                                    iobyxmoadg.J(this.f84883jyumaefscl, AnalyticsPage.Catalog.f84276iwizpuwonk, null, null, 6, null);
                                    this.f84883jyumaefscl.crxdokpmqz(ru.myspar.cart.impl.domain.store.eablkybsjg.lqeggnwhkg.f84775iobyxmoadg);
                                    break;
                                }
                            } else {
                                iobyxmoadg.rhgxfdycjh(this.f84883jyumaefscl, false, 1, null);
                                break;
                            }
                        } else {
                            this.f84883jyumaefscl.D(((ru.myspar.cart.impl.domain.store.wkgbmnqykc.lereixgezr) wkgbmnqykcVar).iobyxmoadg());
                            break;
                        }
                    } else {
                        this.f84883jyumaefscl.C(((ru.myspar.cart.impl.domain.store.wkgbmnqykc.wflxmlrfwp) wkgbmnqykcVar).iobyxmoadg());
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
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f84905yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84906zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ojitshcjhn(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0091 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f84905yggfygwlhe;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else if (i13 == 2) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc = (Cart) obj;
                        this.f84906zdlpuopuiu = objWkgbmnqykc;
                        this.f84905yggfygwlhe = 3;
                        if (iobyxmoadg.this.c((Cart) objWkgbmnqykc, true, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.nufgyqmvbu(true));
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
                    iobyxmoadg.this.f84819ojitshcjhn.zoijcleaow(oo.iobyxmoadg.zoijcleaow.f73284gxszxtbevo);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.nufgyqmvbu(false));
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                k00.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f84825wkgbmnqykc;
                this.f84905yggfygwlhe = 1;
                obj = k00.iobyxmoadg.yadqdtsiqt(iobyxmoadgVar3, false, this, 1, null);
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
                    iobyxmoadgVar5.u(thDxjokdxxww);
                }
                k00.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar5.f84825wkgbmnqykc;
                this.f84905yggfygwlhe = 2;
                obj = iobyxmoadgVar6.pmvmpeiblj(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = (Cart) obj;
            }
            this.f84906zdlpuopuiu = objWkgbmnqykc;
            this.f84905yggfygwlhe = 3;
            if (iobyxmoadg.this.c((Cart) objWkgbmnqykc, true, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.nufgyqmvbu(true));
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
            iobyxmoadg.this.f84819ojitshcjhn.zoijcleaow(oo.iobyxmoadg.zoijcleaow.f73284gxszxtbevo);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.kcexrzcfyt {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ boolean f84907cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ boolean f84908iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f84909jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84910yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84911zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(5, gxszxtbevoVar);
        }

        @Override // tg.kcexrzcfyt
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return ojitshcjhn((gg.vdvldrhtss) obj, (y00.iobyxmoadg) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (lg.gxszxtbevo) obj5);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f84911zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return new C1924iobyxmoadg((gg.vdvldrhtss) this.f84910yggfygwlhe, (y00.iobyxmoadg) this.f84909jyumaefscl, this.f84908iwizpuwonk, this.f84907cqumvgiudr);
        }

        public final Object ojitshcjhn(gg.vdvldrhtss vdvldrhtssVar, y00.iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
            oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            oxmwwwfdhmVar.f84910yggfygwlhe = vdvldrhtssVar;
            oxmwwwfdhmVar.f84909jyumaefscl = iobyxmoadgVar;
            oxmwwwfdhmVar.f84908iwizpuwonk = z13;
            oxmwwwfdhmVar.f84907cqumvgiudr = z14;
            return oxmwwwfdhmVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class pmvmpeiblj implements sj.nufgyqmvbu {
        pmvmpeiblj() {
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.ojitshcjhn((List) vdvldrhtssVar.iobyxmoadg()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class rgvfuqvkyq implements sj.nufgyqmvbu {
        rgvfuqvkyq() {
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(l00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            if (eablkybsjgVar instanceof l00.eablkybsjg.iobyxmoadg) {
                iobyxmoadg.this.w(((l00.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof l00.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.this.y(((l00.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class vdvldrhtss implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f84917zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$vdvldrhtss$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1926iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f84918zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$vdvldrhtss$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1927iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f84920yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f84921zdlpuopuiu;

                public C1927iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f84921zdlpuopuiu = obj;
                    this.f84920yggfygwlhe |= Integer.MIN_VALUE;
                    return C1926iobyxmoadg.this.emit(null, this);
                }
            }

            public C1926iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f84918zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1927iobyxmoadg c1927iobyxmoadg;
                if (gxszxtbevoVar instanceof C1927iobyxmoadg) {
                    c1927iobyxmoadg = (C1927iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1927iobyxmoadg.f84920yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1927iobyxmoadg.f84920yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1927iobyxmoadg = new C1927iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1927iobyxmoadg = new C1927iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1927iobyxmoadg.f84921zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1927iobyxmoadg.f84920yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f84918zdlpuopuiu;
                    if (((C1924iobyxmoadg) obj).wkgbmnqykc()) {
                        c1927iobyxmoadg.f84920yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1927iobyxmoadg) == objGxszxtbevo) {
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

        public vdvldrhtss(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f84917zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f84917zdlpuopuiu.collect(new C1926iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f84922iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84924yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84925zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f84924yggfygwlhe = obj;
            this.f84922iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.s(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f84926cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f84928jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f84929yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84930zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f84928jyumaefscl = obj;
            this.f84926cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.grlcpdaxtj(this);
        }
    }

    public static final class yggfygwlhe implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f84931zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$yggfygwlhe$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1928iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f84932zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1929iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f84934yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f84935zdlpuopuiu;

                public C1929iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f84935zdlpuopuiu = obj;
                    this.f84934yggfygwlhe |= Integer.MIN_VALUE;
                    return C1928iobyxmoadg.this.emit(null, this);
                }
            }

            public C1928iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f84932zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1929iobyxmoadg c1929iobyxmoadg;
                if (gxszxtbevoVar instanceof C1929iobyxmoadg) {
                    c1929iobyxmoadg = (C1929iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1929iobyxmoadg.f84934yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1929iobyxmoadg.f84934yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1929iobyxmoadg = new C1929iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1929iobyxmoadg = new C1929iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1929iobyxmoadg.f84935zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1929iobyxmoadg.f84934yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f84932zdlpuopuiu;
                    t00.eablkybsjg eablkybsjgVar = (t00.eablkybsjg) ((gg.vdvldrhtss) obj).iobyxmoadg();
                    c1929iobyxmoadg.f84934yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(eablkybsjgVar, c1929iobyxmoadg) == objGxszxtbevo) {
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
            this.f84931zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f84931zdlpuopuiu.collect(new C1928iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f84936zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$zdlpuopuiu$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1930iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f84937zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.iobyxmoadg$zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1931iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f84939yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f84940zdlpuopuiu;

                public C1931iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f84940zdlpuopuiu = obj;
                    this.f84939yggfygwlhe |= Integer.MIN_VALUE;
                    return C1930iobyxmoadg.this.emit(null, this);
                }
            }

            public C1930iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f84937zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1931iobyxmoadg c1931iobyxmoadg;
                if (gxszxtbevoVar instanceof C1931iobyxmoadg) {
                    c1931iobyxmoadg = (C1931iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1931iobyxmoadg.f84939yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1931iobyxmoadg.f84939yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1931iobyxmoadg = new C1931iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1931iobyxmoadg = new C1931iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1931iobyxmoadg.f84940zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1931iobyxmoadg.f84939yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f84937zdlpuopuiu;
                    if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                        c1931iobyxmoadg.f84939yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1931iobyxmoadg) == objGxszxtbevo) {
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
            this.f84936zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f84936zdlpuopuiu.collect(new C1930iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    private static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    static final class zynmafqrjb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84942zdlpuopuiu;

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
            int i13 = this.f84942zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    h20.draadjrbmk draadjrbmkVar = iobyxmoadgVar.f84824wflxmlrfwp;
                    this.f84942zdlpuopuiu = 1;
                    obj = draadjrbmkVar.gxszxtbevo(this);
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
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.C1920gxszxtbevo((List) objWkgbmnqykc));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zynmafqrjb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k00.iobyxmoadg cartInteractor, g30.iobyxmoadg getRestaurantDetailsUseCase, f20.ppxfxbqfkf clearCartUseCase, c20.eablkybsjg isLoggedInUseCase, c20.dxjokdxxww subscribeToLoggedInUseCase, f20.dxjokdxxww subscribeToCartStateUseCase, l00.gtknphoqwx productChangesSourceProvider, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, f20.gxszxtbevo subscribeCartCompoundStateUseCase, h20.draadjrbmk getProductRecommendationsUseCase, sm.iobyxmoadg getUserAddressFlowInfo, lo.zoijcleaow analyticsTracker, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRestaurantDetailsUseCase, "getRestaurantDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartStateUseCase, "subscribeToCartStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeCartCompoundStateUseCase, "subscribeCartCompoundStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductRecommendationsUseCase, "getProductRecommendationsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f84821ppxfxbqfkf = new sx.ppxfxbqfkf();
        this.f84825wkgbmnqykc = cartInteractor;
        this.f84814eablkybsjg = getRestaurantDetailsUseCase;
        this.f84816gxszxtbevo = clearCartUseCase;
        this.f84817lqeggnwhkg = isLoggedInUseCase;
        this.f84818nufgyqmvbu = subscribeToLoggedInUseCase;
        this.f84813dxjokdxxww = subscribeToCartStateUseCase;
        this.f84811btonecajqb = productChangesSourceProvider;
        this.f84815gtknphoqwx = subscribeToCurrentDeliveryDataUseCase;
        this.f84812draadjrbmk = subscribeCartCompoundStateUseCase;
        this.f84824wflxmlrfwp = getProductRecommendationsUseCase;
        this.f84810agtfadlqog = getUserAddressFlowInfo;
        this.f84819ojitshcjhn = analyticsTracker;
        this.f84820oxmwwwfdhm = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: vp.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.cart.impl.domain.store.iobyxmoadg.z(this.f117619zdlpuopuiu);
            }
        });
    }

    private final void A() {
        auzgnhcxok auzgnhcxokVar = this.f84822rgvfuqvkyq;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f84822rgvfuqvkyq = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        this.f84819ojitshcjhn.wkgbmnqykc(oo.iobyxmoadg.C1597iobyxmoadg.f73283gxszxtbevo);
        Object objInvoke = draadjrbmkVar.invoke(gxszxtbevoVar);
        return objInvoke == mg.zoijcleaow.gxszxtbevo() ? objInvoke : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = eslsurpljm().zoijcleaow().collect(new rgvfuqvkyq(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(lg.gxszxtbevo gxszxtbevoVar) {
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        hkdspvbjdz hkdspvbjdzVar2 = new hkdspvbjdz();
        sj.lqeggnwhkg lqeggnwhkgVarVdvldrhtss = sj.dxjokdxxww.vdvldrhtss(this.f84818nufgyqmvbu.wkgbmnqykc());
        z10.nufgyqmvbu nufgyqmvbuVar = this.f84815gtknphoqwx;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objCollect = new vdvldrhtss(sj.dxjokdxxww.gtknphoqwx(lqeggnwhkgVarVdvldrhtss, nufgyqmvbuVar.zoijcleaow(wwaezpbzknVar), this.f84812draadjrbmk.zoijcleaow(wwaezpbzknVar), b(), new oxmwwwfdhm(null))).collect(new kcexrzcfyt(hkdspvbjdzVar, hkdspvbjdzVar2, this), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(lg.gxszxtbevo gxszxtbevoVar) {
        f20.dxjokdxxww dxjokdxxwwVar = this.f84813dxjokdxxww;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objCollect = sj.dxjokdxxww.vdvldrhtss(new yggfygwlhe(sj.dxjokdxxww.gxszxtbevo(new zdlpuopuiu(sj.dxjokdxxww.wflxmlrfwp(dxjokdxxwwVar.zoijcleaow(wwaezpbzknVar), b(), new jyumaefscl(null))), new iwizpuwonk(null)))).collect(new cqumvgiudr(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = new esjtqupxsv(sj.dxjokdxxww.wflxmlrfwp(eslsurpljm().iobyxmoadg(), b(), new lereixgezr(null))).collect(new pmvmpeiblj(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void I(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f84819ojitshcjhn.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Basket.f84273iwizpuwonk, analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void J(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.I(analyticsPage, analyticElement, analyticsLocation);
    }

    private final void K() {
        auzgnhcxok auzgnhcxokVar = this.f84823vdvldrhtss;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f84823vdvldrhtss = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zynmafqrjb(null), 3, null);
    }

    private final vu.btonecajqb a(Promocode promocode) {
        if (promocode == null || mj.kcexrzcfyt.zfvoamnweg(promocode.getValue())) {
            return vu.btonecajqb.NOT_ENTERED;
        }
        if (promocode.getStatus()) {
            return vu.btonecajqb.APPLIED;
        }
        return !promocode.getStatus() ? vu.btonecajqb.NOT_APPLIED : vu.btonecajqb.NOT_ENTERED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Cart cart, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f84842esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f84842esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object objZoijcleaow = dxjokdxxwwVar.f84843iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar.f84842esjtqupxsv;
        RestaurantDetails restaurantDetails = null;
        Object obj = null;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            y(cart.getWarning());
            String partnerCode = cart.getPartnerCode();
            boolean z14 = cart.dxjokdxxww() == DeliveryCode.PICKUP;
            if (partnerCode == null || partnerCode.length() == 0 || !z14) {
                iobyxmoadgVar = this;
            } else {
                g30.iobyxmoadg.zoijcleaow zoijcleaowVar = new g30.iobyxmoadg.zoijcleaow(partnerCode, null, 0, 6, null);
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    g30.iobyxmoadg iobyxmoadgVar3 = this.f84814eablkybsjg;
                    dxjokdxxwwVar.f84846zdlpuopuiu = this;
                    dxjokdxxwwVar.f84845yggfygwlhe = cart;
                    dxjokdxxwwVar.f84844jyumaefscl = z13;
                    dxjokdxxwwVar.f84842esjtqupxsv = 1;
                    objZoijcleaow = iobyxmoadgVar3.zoijcleaow(zoijcleaowVar, dxjokdxxwwVar);
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
            PromoCodeEditorState promoCodeEditorStateKrqnebusok = iobyxmoadgVar.krqnebusok(cart.getPromocode(), cart.getIsMappedValid());
            if (z13) {
                iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.zoijcleaow(cart.getLoadInfo()));
            }
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.iobyxmoadg(cart, restaurantDetails, promoCodeEditorStateKrqnebusok, iobyxmoadgVar.yzdjzghtvl((State) iobyxmoadgVar.jlmebxxoox(), cart.getBasket())));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z13 = dxjokdxxwwVar.f84844jyumaefscl;
        cart = (Cart) dxjokdxxwwVar.f84845yggfygwlhe;
        iobyxmoadgVar = (iobyxmoadg) dxjokdxxwwVar.f84846zdlpuopuiu;
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
            iobyxmoadgVar.w(thDxjokdxxww);
        }
        restaurantDetails = (RestaurantDetails) obj;
        PromoCodeEditorState promoCodeEditorStateKrqnebusok2 = iobyxmoadgVar.krqnebusok(cart.getPromocode(), cart.getIsMappedValid());
        if (z13) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.zoijcleaow(cart.getLoadInfo()));
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.iobyxmoadg(cart, restaurantDetails, promoCodeEditorStateKrqnebusok2, iobyxmoadgVar.yzdjzghtvl((State) iobyxmoadgVar.jlmebxxoox(), cart.getBasket())));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ Object d(iobyxmoadg iobyxmoadgVar, Cart cart, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return iobyxmoadgVar.c(cart, z13, gxszxtbevoVar);
    }

    private final l00.btonecajqb eslsurpljm() {
        return (l00.btonecajqb) this.f84820oxmwwwfdhm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ezmngbhpjk(boolean z13) {
        if (z13) {
            A();
            K();
        } else {
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.rgvfuqvkyq(t00.dxjokdxxww.UNAUTHORIZED));
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.C1920gxszxtbevo(hg.jyumaefscl.wflxmlrfwp()));
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(State state, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f84828iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f84828iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object obj = btonecajqbVar.f84830yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f84828iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            PromoCodeEditorState promoCodeEditorState = state.getPromoCodeEditorState();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(promoCodeEditorState.getPromoCodeFromInput().draadjrbmk(), promoCodeEditorState.getPromoCodeFromServer())) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
            k00.iobyxmoadg iobyxmoadgVar2 = this.f84825wkgbmnqykc;
            String strDraadjrbmk = promoCodeEditorState.getPromoCodeFromInput().draadjrbmk();
            btonecajqbVar.f84831zdlpuopuiu = this;
            btonecajqbVar.f84828iwizpuwonk = 1;
            if (iobyxmoadgVar2.yggfygwlhe(strDraadjrbmk, btonecajqbVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) btonecajqbVar.f84831zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(State state, lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f84856iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f84856iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        gtknphoqwx gtknphoqwxVar2 = gtknphoqwxVar;
        Object obj = gtknphoqwxVar2.f84858yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar2.f84856iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            CartBonuses cartBonuses = state.getCart().getCartBonuses();
            if (cartBonuses != null) {
                boolean isEnabled = state.getBonusesEditorState().getIsEnabled();
                String strDraadjrbmk = state.getBonusesEditorState().getValue().draadjrbmk();
                Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getApplied());
                Integer numWkgbmnqykc2 = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getBalance());
                Integer numWkgbmnqykc3 = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getAvailable());
                gtknphoqwxVar2.f84859zdlpuopuiu = cartBonuses;
                gtknphoqwxVar2.f84856iwizpuwonk = 1;
                if (ipoelvxyzq(isEnabled, strDraadjrbmk, numWkgbmnqykc, numWkgbmnqykc2, numWkgbmnqykc3, gtknphoqwxVar2) == objGxszxtbevo) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object grlcpdaxtj(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        Object obj;
        iobyxmoadg iobyxmoadgVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f84926cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f84926cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f84928jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f84926cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f84930zdlpuopuiu;
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
                obj = wkgbmnqykcVar.f84929yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) wkgbmnqykcVar.f84930zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.w(thDxjokdxxww);
            }
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(ru.myspar.cart.impl.domain.store.gxszxtbevo.btonecajqb.f84790iobyxmoadg);
        ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
        f20.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar4 = new f20.ppxfxbqfkf.iobyxmoadg(((State) jlmebxxoox()).getCart().getPartnerCode());
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
            f20.ppxfxbqfkf ppxfxbqfkfVar = this.f84816gxszxtbevo;
            wkgbmnqykcVar.f84930zdlpuopuiu = this;
            wkgbmnqykcVar.f84926cqumvgiudr = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar4, wkgbmnqykcVar);
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
            wkgbmnqykcVar.f84930zdlpuopuiu = iobyxmoadgVar;
            wkgbmnqykcVar.f84929yggfygwlhe = objWkgbmnqykc;
            wkgbmnqykcVar.f84926cqumvgiudr = 2;
            if (iobyxmoadgVar.c((Cart) objWkgbmnqykc, true, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj = objWkgbmnqykc;
            iobyxmoadgVar2 = iobyxmoadgVar;
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
        }
        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.w(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(boolean z13, State state, lg.gxszxtbevo gxszxtbevoVar) {
        String strDraadjrbmk = state.getBonusesEditorState().getValue().draadjrbmk();
        CartBonuses cartBonuses = state.getCart().getCartBonuses();
        Integer numWkgbmnqykc = cartBonuses != null ? kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getApplied()) : null;
        CartBonuses cartBonuses2 = state.getCart().getCartBonuses();
        Integer numWkgbmnqykc2 = cartBonuses2 != null ? kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses2.getBalance()) : null;
        CartBonuses cartBonuses3 = state.getCart().getCartBonuses();
        Object objIpoelvxyzq = ipoelvxyzq(z13, strDraadjrbmk, numWkgbmnqykc, numWkgbmnqykc2, cartBonuses3 != null ? kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses3.getAvailable()) : null, gxszxtbevoVar);
        return objIpoelvxyzq == mg.zoijcleaow.gxszxtbevo() ? objIpoelvxyzq : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(tzroggbefp tzroggbefpVar) {
        ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.eablkybsjg(tzroggbefpVar));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    private final Object ipoelvxyzq(boolean z13, String str, Integer num, Integer num2, Integer num3, lg.gxszxtbevo gxszxtbevoVar) {
        boolean z14;
        Object objIxidwrxhsl;
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
            Object objMhtqkkgtqm = mhtqkkgtqm(gxszxtbevoVar);
            return objMhtqkkgtqm == mg.zoijcleaow.gxszxtbevo() ? objMhtqkkgtqm : wwaezpbzkn.f37140iobyxmoadg;
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
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.wkgbmnqykc(true));
        } else if (iIntValue == 0) {
            Object objMhtqkkgtqm2 = mhtqkkgtqm(gxszxtbevoVar);
            return objMhtqkkgtqm2 == mg.zoijcleaow.gxszxtbevo() ? objMhtqkkgtqm2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        String strValueOf = String.valueOf(iIntValue);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, strValueOf)) {
            strValueOf = null;
        }
        String str2 = strValueOf;
        if (str2 != null) {
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.eablkybsjg(new tzroggbefp(str2, m.iobyxmoadg(str2.length()), (l) null, 4, (kotlin.jvm.internal.gtknphoqwx) null)));
        }
        return ((num != null && num.intValue() == iIntValue) || (objIxidwrxhsl = ixidwrxhsl(iIntValue, gxszxtbevoVar)) != mg.zoijcleaow.gxszxtbevo()) ? wwaezpbzkn.f37140iobyxmoadg : objIxidwrxhsl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ixidwrxhsl(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i14 = gxszxtbevoVar2.f84860iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f84860iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object obj = gxszxtbevoVar2.f84862yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = gxszxtbevoVar2.f84860iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.ppxfxbqfkf(i13));
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.wkgbmnqykc(true));
            k00.iobyxmoadg iobyxmoadgVar2 = this.f84825wkgbmnqykc;
            Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13);
            gxszxtbevoVar2.f84863zdlpuopuiu = this;
            gxszxtbevoVar2.f84860iwizpuwonk = 1;
            if (iobyxmoadgVar2.zdlpuopuiu(numWkgbmnqykc, gxszxtbevoVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar2.f84863zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(kq.agtfadlqog agtfadlqogVar) {
        f40.zoijcleaow zoijcleaowVarGxszxtbevo = agtfadlqogVar.gxszxtbevo();
        if (zoijcleaowVarGxszxtbevo == null) {
            return;
        }
        crxdokpmqz(new ru.myspar.cart.impl.domain.store.eablkybsjg.dxjokdxxww(new NavigationPayload(zoijcleaowVarGxszxtbevo, agtfadlqogVar.lqeggnwhkg(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.Basket.f84273iwizpuwonk, AnalyticsLocation.LoadInfoBanner.f84253iwizpuwonk, new AnalyticElement.LoadInfoElement(agtfadlqogVar.nufgyqmvbu())), false, 188, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(HintUiModel hintUiModel, AnalyticElement.ProductItemElement productItemElement, AnalyticsLocation analyticsLocation) {
        crxdokpmqz(new ru.myspar.cart.impl.domain.store.eablkybsjg.nufgyqmvbu(hintUiModel, new HintDialogAnalyticsInfo(productItemElement, AnalyticsPage.Basket.f84273iwizpuwonk, analyticsLocation)));
    }

    private final PromoCodeEditorState krqnebusok(Promocode promocode, boolean z13) {
        String value = z13 ? promocode != null ? promocode.getValue() : null : null;
        if (value == null) {
            value = "";
        }
        vu.btonecajqb btonecajqbVarA = a(promocode);
        return new PromoCodeEditorState(new tzroggbefp(value, 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null), value, btonecajqbVarA, btonecajqbVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        J(this, AnalyticsPage.ChoosingDateInterval.f84280iwizpuwonk, null, null, 6, null);
        crxdokpmqz(ru.myspar.cart.impl.domain.store.eablkybsjg.gtknphoqwx.f84772iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        J(this, AnalyticsPage.Receiver.f84340iwizpuwonk, null, null, 6, null);
        CartReceiver receiver = ((State) jlmebxxoox()).getCart().getReceiver();
        String name = receiver != null ? receiver.getName() : null;
        if (name == null) {
            name = "";
        }
        String phone = receiver != null ? receiver.getPhone() : null;
        crxdokpmqz(new ru.myspar.cart.impl.domain.store.eablkybsjg.wflxmlrfwp(name, phone != null ? phone : ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object mhtqkkgtqm(lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f84847iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f84847iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj = eablkybsjgVar.f84849yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f84847iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.ppxfxbqfkf(0));
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.wkgbmnqykc(false));
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.eablkybsjg(new tzroggbefp((String) null, 0L, (l) null, 7, (kotlin.jvm.internal.gtknphoqwx) null)));
            k00.iobyxmoadg iobyxmoadgVar2 = this.f84825wkgbmnqykc;
            Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(0);
            eablkybsjgVar.f84850zdlpuopuiu = this;
            eablkybsjgVar.f84847iwizpuwonk = 1;
            if (iobyxmoadgVar2.zdlpuopuiu(numWkgbmnqykc, eablkybsjgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f84850zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
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
            ChangeProductParams changeProductParamsIobyxmoadg = ChangeProductParams.INSTANCE.iobyxmoadg(cartProduct, ppxfxbqfkfVar.iobyxmoadg(), new ChangeProductAnalyticParams(AnalyticsPage.Basket.f84273iwizpuwonk, null, cartProduct.getName()));
            if (changeProductParamsIobyxmoadg != null) {
                Object objPpxfxbqfkf = eslsurpljm().ppxfxbqfkf(changeProductParamsIobyxmoadg, gxszxtbevoVar);
                return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(String str, AnalyticElement.ProductItemElement productItemElement, AnalyticsLocation.ItemFeed itemFeed) {
        if (((State) jlmebxxoox()).getIsPartnerCart()) {
            return;
        }
        I(new AnalyticsPage.ItemDetail(productItemElement.getId(), productItemElement.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String()), productItemElement, itemFeed);
        crxdokpmqz(new ru.myspar.cart.impl.domain.store.eablkybsjg.agtfadlqog(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object p(String str, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        CartProduct cartProduct;
        iobyxmoadg iobyxmoadgVar;
        Object next;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f84837iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f84837iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        draadjrbmk draadjrbmkVar2 = draadjrbmkVar;
        Object objLmojexxdyd = draadjrbmkVar2.f84839yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar2.f84837iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLmojexxdyd);
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
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.lqeggnwhkg(true));
            this.f84819ojitshcjhn.ppxfxbqfkf(new no.ppxfxbqfkf.C1521ppxfxbqfkf(new no.iobyxmoadg(AnalyticsPage.Basket.f84273iwizpuwonk, null, new AnalyticElement.ChangeItemElement(cartProduct.getArticle(), cartProduct.getName(), 0.0d, cartProduct.getMeasureTypeModel().getCurrentMeasure().getValue()))));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                k00.iobyxmoadg iobyxmoadgVar3 = this.f84825wkgbmnqykc;
                MeasureType currentMeasure = cartProduct.getMeasureTypeModel().getCurrentMeasure();
                draadjrbmkVar2.f84840zdlpuopuiu = this;
                draadjrbmkVar2.f84837iwizpuwonk = 1;
                objLmojexxdyd = iobyxmoadgVar3.lmojexxdyd(str, 0.0d, currentMeasure, draadjrbmkVar2);
                if (objLmojexxdyd == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) draadjrbmkVar2.f84840zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objLmojexxdyd);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Cart) objLmojexxdyd);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.lqeggnwhkg(false));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.lqeggnwhkg(false));
            iobyxmoadgVar.u(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(State state, tzroggbefp tzroggbefpVar) {
        PromoCodeEditorState promoCodeEditorState = state.getPromoCodeEditorState();
        vu.btonecajqb stateFromServer = (!mj.kcexrzcfyt.zfvoamnweg(tzroggbefpVar.draadjrbmk()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(promoCodeEditorState.getPromoCodeFromServer(), tzroggbefpVar.draadjrbmk())) ? promoCodeEditorState.getStateFromServer() : vu.btonecajqb.NOT_ENTERED;
        ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.agtfadlqog(tzroggbefpVar, stateFromServer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        List recommendations = ((State) jlmebxxoox()).getRecommendations();
        if (recommendations.isEmpty()) {
            recommendations = null;
        }
        if (recommendations == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Product productIobyxmoadg = v00.zoijcleaow.iobyxmoadg(recommendations, ppxfxbqfkfVar.zoijcleaow());
        if (productIobyxmoadg != null) {
            ChangeProductParams changeProductParamsZoijcleaow = ChangeProductParams.INSTANCE.zoijcleaow(productIobyxmoadg, ppxfxbqfkfVar.iobyxmoadg(), new ChangeProductAnalyticParams(AnalyticsPage.Basket.f84273iwizpuwonk, new AnalyticsLocation.ItemFeed(null, ppxfxbqfkfVar.ppxfxbqfkf(), 1, null), productIobyxmoadg.getName()));
            if (changeProductParamsZoijcleaow != null) {
                Object objPpxfxbqfkf = eslsurpljm().ppxfxbqfkf(changeProductParamsZoijcleaow, gxszxtbevoVar);
                return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ void rhgxfdycjh(iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = ((Boolean) iobyxmoadgVar.f84817lqeggnwhkg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        }
        iobyxmoadgVar.ezmngbhpjk(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(lg.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wflxmlrfwp) {
            wflxmlrfwpVar = (wflxmlrfwp) gxszxtbevoVar;
            int i13 = wflxmlrfwpVar.f84922iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wflxmlrfwpVar.f84922iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            }
        } else {
            wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
        }
        Object objYadqdtsiqt = wflxmlrfwpVar.f84924yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wflxmlrfwpVar.f84922iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objYadqdtsiqt);
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.wflxmlrfwp(true));
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                k00.iobyxmoadg iobyxmoadgVar3 = this.f84825wkgbmnqykc;
                wflxmlrfwpVar.f84925zdlpuopuiu = this;
                wflxmlrfwpVar.f84922iwizpuwonk = 1;
                objYadqdtsiqt = k00.iobyxmoadg.yadqdtsiqt(iobyxmoadgVar3, false, wflxmlrfwpVar, 1, null);
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
            iobyxmoadgVar = (iobyxmoadg) wflxmlrfwpVar.f84925zdlpuopuiu;
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
            iobyxmoadgVar.x((Cart) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.w(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.wflxmlrfwp(false));
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new agtfadlqog(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Throwable th2) {
        if (!(th2 instanceof DeliveryIntervalNotValidException)) {
            w(th2);
        } else {
            ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.draadjrbmk(new CartStore$CartDialogType.DeliveryIntervalErrorDialog(((DeliveryIntervalNotValidException) th2).getMessage())));
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        this.f84819ojitshcjhn.ppxfxbqfkf(new no.wkgbmnqykc());
        crxdokpmqz(ru.myspar.cart.impl.domain.store.eablkybsjg.zoijcleaow.f84787iobyxmoadg);
        ulzqkzuiru(ru.myspar.cart.impl.domain.store.gxszxtbevo.dxjokdxxww.f84792iobyxmoadg);
        ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.rgvfuqvkyq(yzdjzghtvl((State) jlmebxxoox(), null)));
    }

    public static final /* synthetic */ State wizcaqwiak(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(Cart cart) {
        y(cart.getWarning());
        J(this, AnalyticsPage.PaymentMethods.f84320iwizpuwonk, null, null, 6, null);
        PaymentType.Cart cart2 = new PaymentType.Cart(cart.dxjokdxxww());
        List payments = cart.getPayments();
        CartSum sum = cart.getSum();
        crxdokpmqz(new ru.myspar.cart.impl.domain.store.eablkybsjg.C1919eablkybsjg(new PaymentMethodsArgs(cart2, sum != null ? Double.valueOf(sum.getTotal()) : null, payments, cart.getCartBonuses() != null, cart.getChange())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Warning warning) {
        if (warning instanceof Warning.Empty) {
            return;
        }
        if (warning instanceof Warning.WithCodeAndMessage) {
            crxdokpmqz(new ru.myspar.cart.impl.domain.store.eablkybsjg.vdvldrhtss(((Warning.WithCodeAndMessage) warning).getMessage()));
        } else {
            if (!(warning instanceof Warning.DailyLimit) && !(warning instanceof Warning.Interval) && !(warning instanceof Warning.AvailableOnlyForPickup)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new ru.myspar.cart.impl.domain.store.eablkybsjg.oxmwwwfdhm(warning.getMessage()));
        }
    }

    private final t00.dxjokdxxww yzdjzghtvl(State state, List list) {
        if (!((Boolean) this.f84817lqeggnwhkg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            return t00.dxjokdxxww.UNAUTHORIZED;
        }
        if (state.getIsCartFetched() && (list == null || list.isEmpty())) {
            return t00.dxjokdxxww.EMPTY;
        }
        if (!state.getIsCartFetched() || list == null || list.isEmpty()) {
            return null;
        }
        return t00.dxjokdxxww.HIDE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l00.btonecajqb z(iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar.f84811btonecajqb.iobyxmoadg(l00.btonecajqb.iobyxmoadg.C1234iobyxmoadg.f61217iobyxmoadg);
    }

    public void C(boolean z13) {
        this.f84821ppxfxbqfkf.eablkybsjg(z13);
    }

    public void D(boolean z13) {
        this.f84821ppxfxbqfkf.gxszxtbevo(z13);
    }

    public sj.lqeggnwhkg b() {
        return this.f84821ppxfxbqfkf.ppxfxbqfkf();
    }

    public final void e() {
        this.f84819ojitshcjhn.wkgbmnqykc(oo.iobyxmoadg.zoijcleaow.f73284gxszxtbevo);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: fmlbqenlif, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.cart.impl.domain.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    public void iobyxmoadg() {
        auzgnhcxok auzgnhcxokVar = this.f84822rgvfuqvkyq;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        auzgnhcxok auzgnhcxokVar2 = this.f84823vdvldrhtss;
        if (auzgnhcxokVar2 != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar2);
        }
        super.iobyxmoadg();
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jrbgnlbqoe, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.cart.impl.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(action, this, null), 3, null);
    }

    public final void w(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new ru.myspar.cart.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        crxdokpmqz(error instanceof ProductDailyLimitException ? new ru.myspar.cart.impl.domain.store.eablkybsjg.oxmwwwfdhm(((ProductDailyLimitException) error).getMessage()) : new ru.myspar.cart.impl.domain.store.eablkybsjg.ojitshcjhn(error));
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84913iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f84914ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f84915zoijcleaow;

        public ppxfxbqfkf(String productId, ProductCardEvent productCardEvent, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f84913iobyxmoadg = productId;
            this.f84915zoijcleaow = productCardEvent;
            this.f84914ppxfxbqfkf = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84913iobyxmoadg, ppxfxbqfkfVar.f84913iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84915zoijcleaow, ppxfxbqfkfVar.f84915zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84914ppxfxbqfkf, ppxfxbqfkfVar.f84914ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f84913iobyxmoadg.hashCode() * 31) + this.f84915zoijcleaow.hashCode()) * 31;
            String str = this.f84914ppxfxbqfkf;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f84915zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f84914ppxfxbqfkf;
        }

        public String toString() {
            return "OnProductChangeParams(productId=" + this.f84913iobyxmoadg + ", productCardEvent=" + this.f84915zoijcleaow + ", sectionId=" + this.f84914ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f84913iobyxmoadg;
        }

        public /* synthetic */ ppxfxbqfkf(String str, ProductCardEvent productCardEvent, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, productCardEvent, (i13 & 4) != 0 ? null : str2);
        }
    }
}

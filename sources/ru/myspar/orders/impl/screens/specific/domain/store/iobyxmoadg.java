package ru.myspar.orders.impl.screens.specific.domain.store;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.common.models.LocationData;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.components.payment.api.models.PaymentCode;
import ru.myspar.core.domain.models.order.Order;
import ru.myspar.core.domain.models.order.OrderPickupStatus;
import ru.myspar.core.domain.models.order.OrderProduct;
import ru.myspar.core.domain.models.order.OrderStatus;
import ru.myspar.core.domain.models.order.productreplacement.ProductReplaceModel;
import ru.myspar.core.domain.models.order.productreplacement.ProductsForReplaceModel;
import ru.myspar.core.domain.models.payload.EditOrderPayload;
import ru.myspar.core.domain.models.tracking.TrackingOrderPayload;
import ru.myspar.core.models.Warning;
import ru.myspar.payment.api.model.PaymentMethodsArgs;
import ru.myspar.payment.api.model.PaymentType;
import ru.myspar.payment.api.model.PaymentWebArgs;
import ru.myspar.rate.rate_order.api.models.RateOrderPayload;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final int f91115cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final int f91116iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final int f91117istkbnxepw;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final int f91119lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private static final int f91120pkzmftpjix;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final int f91122wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final int f91123yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private static final int f91124ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final int f91125zynmafqrjb;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final j00.wkgbmnqykc f91126agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final oa0.nufgyqmvbu f91127btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private OrderStatus f91128cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final j82.iobyxmoadg f91129draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final oa0.draadjrbmk f91130dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final x20.btonecajqb f91131eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private auzgnhcxok f91132esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final u10.wkgbmnqykc f91133gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final x20.draadjrbmk f91134gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final at.iobyxmoadg f91135iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final lo.zoijcleaow f91136jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final f20.iobyxmoadg f91137kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final x20.zoijcleaow f91138lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final oa0.oxmwwwfdhm f91139nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final j00.lqeggnwhkg f91140ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final u10.ppxfxbqfkf f91141oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o20.btonecajqb f91142ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final dt.zoijcleaow f91143rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final b30.iobyxmoadg f91144vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final j42.zoijcleaow f91145wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final x20.eablkybsjg f91146wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final cw.ppxfxbqfkf f91147yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final cw.zoijcleaow f91148zdlpuopuiu;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final C2114iobyxmoadg f91118lereixgezr = new C2114iobyxmoadg(null);

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final int f91121pmvmpeiblj = 8;

    /* synthetic */ class agtfadlqog extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        agtfadlqog(Object obj) {
            super(1, obj, iobyxmoadg.class, "onCompletionTimerAction", "onCompletionTimerAction(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) this.receiver).A(gxszxtbevoVar);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f91149cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f91151jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f91152yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91153zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91151jyumaefscl = obj;
            this.f91149cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.m(null, this);
        }
    }

    static final class cdpycssgdh extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91154iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91156yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91157zdlpuopuiu;

        cdpycssgdh(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91156yggfygwlhe = obj;
            this.f91154iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.V(null, this);
        }
    }

    /* synthetic */ class cqumvgiudr extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        cqumvgiudr(Object obj) {
            super(2, obj, iobyxmoadg.class, "setOnMyWayStatus", "setOnMyWayStatus(Lru/myspar/common/models/LocationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) this.receiver).Z(locationData, gxszxtbevoVar);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f91158cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        /* synthetic */ Object f91159esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f91160iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f91161jyumaefscl;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        int f91163pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f91164yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91165zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91159esjtqupxsv = obj;
            this.f91163pmvmpeiblj |= Integer.MIN_VALUE;
            return iobyxmoadg.this.r(null, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ LocationData f91166jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ah.lqeggnwhkg f91167yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91168zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(ah.lqeggnwhkg lqeggnwhkgVar, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f91167yggfygwlhe = lqeggnwhkgVar;
            this.f91166jyumaefscl = locationData;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new dxjokdxxww(this.f91167yggfygwlhe, this.f91166jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91168zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) this.f91167yggfygwlhe;
                LocationData locationData = this.f91166jyumaefscl;
                this.f91168zdlpuopuiu = 1;
                if (rgvfuqvkyqVar.invoke(locationData, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ OrderPickupStatus f91169jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91171zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(OrderPickupStatus orderPickupStatus, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f91169jyumaefscl = orderPickupStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f91169jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91171zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            at.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f91135iwizpuwonk;
            String name = iobyxmoadg.this.getClass().getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            List listI = hg.agtfadlqog.i(iobyxmoadg.this.f91145wflxmlrfwp.zoijcleaow());
            this.f91171zdlpuopuiu = 1;
            obj = iobyxmoadgVar.ppxfxbqfkf(name, listI, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f91171zdlpuopuiu = 2;
            if (iobyxmoadg.this.Q(this.f91169jyumaefscl, ((at.ppxfxbqfkf) obj) instanceof at.ppxfxbqfkf.iobyxmoadg, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class esjtqupxsv extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        esjtqupxsv(Object obj) {
            super(2, obj, iobyxmoadg.class, "onInCarClicked", "onInCarClicked(Lru/myspar/common/models/LocationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) this.receiver).D(locationData, gxszxtbevoVar);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f91172cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f91174jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f91175yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91176zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91174jyumaefscl = obj;
            this.f91172cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.n(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f91177jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.orders.impl.screens.specific.domain.store.ppxfxbqfkf f91178yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91179zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(ru.myspar.orders.impl.screens.specific.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f91178yggfygwlhe = ppxfxbqfkfVar;
            this.f91177jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f91178yggfygwlhe, this.f91177jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91179zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91178yggfygwlhe, ru.myspar.orders.impl.screens.specific.domain.store.ppxfxbqfkf.iobyxmoadg.f91275iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f91177jyumaefscl.j0();
                this.f91177jyumaefscl.i0();
                iobyxmoadg iobyxmoadgVar = this.f91177jyumaefscl;
                this.f91179zdlpuopuiu = 1;
                if (iobyxmoadgVar.X(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class hcddaimhww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91180yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91181zdlpuopuiu;

        hcddaimhww(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f91181zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f91180yggfygwlhe, new CrashlyticsKey[0]);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            hcddaimhww hcddaimhwwVar = new hcddaimhww(gxszxtbevoVar);
            hcddaimhwwVar.f91180yggfygwlhe = th2;
            return hcddaimhwwVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class hkdspvbjdz extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91182yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91183zdlpuopuiu;

        hkdspvbjdz(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f91183zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f91182yggfygwlhe, new CrashlyticsKey[0]);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz(gxszxtbevoVar);
            hkdspvbjdzVar.f91182yggfygwlhe = th2;
            return hkdspvbjdzVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2114iobyxmoadg {
        public /* synthetic */ C2114iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2114iobyxmoadg() {
        }
    }

    static final class iozdgvuglv extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91184iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91186yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91187zdlpuopuiu;

        iozdgvuglv(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91186yggfygwlhe = obj;
            this.f91184iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.Z(null, this);
        }
    }

    /* synthetic */ class istkbnxepw extends kotlin.jvm.internal.iobyxmoadg implements tg.rgvfuqvkyq {
        istkbnxepw(Object obj) {
            super(2, obj, iobyxmoadg.class, "changeProductReplacementTimer", "changeProductReplacementTimer(I)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (lg.gxszxtbevo) obj2);
        }

        public final Object iobyxmoadg(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.U((iobyxmoadg) this.f60022zdlpuopuiu, i13, gxszxtbevoVar);
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91188iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91190yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91191zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91190yggfygwlhe = obj;
            this.f91188iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.N(this);
        }
    }

    static final class jpowsppfya extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91193zdlpuopuiu;

        jpowsppfya(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new jpowsppfya(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91193zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f91193zdlpuopuiu = 1;
                if (iobyxmoadgVar.X(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((jpowsppfya) create(wwaezpbzknVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f91194jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91196zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        jyumaefscl(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f91194jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new jyumaefscl(this.f91194jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91196zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                boolean isNeededOpenPaymentScreen = iobyxmoadg.eslsurpljm(iobyxmoadg.this).getIsNeededOpenPaymentScreen();
                if (!this.f91194jyumaefscl) {
                    if (isNeededOpenPaymentScreen) {
                        iobyxmoadg.M(iobyxmoadg.this);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!isNeededOpenPaymentScreen) {
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(false));
                iobyxmoadg.M(iobyxmoadg.this);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f91196zdlpuopuiu = 1;
                if (iobyxmoadgVar.v(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((jyumaefscl) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91197iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91199yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91200zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91199yggfygwlhe = obj;
            this.f91197iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.B(this);
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91201iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91203yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91204zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91203yggfygwlhe = obj;
            this.f91201iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.R(this);
        }
    }

    public static final class lmojexxdyd implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f91205zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg$lmojexxdyd$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2115iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f91206zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg$lmojexxdyd$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2116iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f91208yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f91209zdlpuopuiu;

                public C2116iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f91209zdlpuopuiu = obj;
                    this.f91208yggfygwlhe |= Integer.MIN_VALUE;
                    return C2115iobyxmoadg.this.emit(null, this);
                }
            }

            public C2115iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f91206zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2116iobyxmoadg c2116iobyxmoadg;
                if (gxszxtbevoVar instanceof C2116iobyxmoadg) {
                    c2116iobyxmoadg = (C2116iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2116iobyxmoadg.f91208yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2116iobyxmoadg.f91208yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2116iobyxmoadg = new C2116iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2116iobyxmoadg = new C2116iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2116iobyxmoadg.f91209zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2116iobyxmoadg.f91208yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f91206zdlpuopuiu;
                    Long lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(((Number) obj).longValue() / 1000);
                    c2116iobyxmoadg.f91208yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(lEablkybsjg, c2116iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public lmojexxdyd(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f91205zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f91205zdlpuopuiu.collect(new C2115iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f91210jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc f91211yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91212zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f91211yggfygwlhe = wkgbmnqykcVar;
            this.f91210jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new lqeggnwhkg(this.f91211yggfygwlhe, this.f91210jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            switch (this.f91212zdlpuopuiu) {
                case 0:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc wkgbmnqykcVar = this.f91211yggfygwlhe;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.ppxfxbqfkf.f91296iobyxmoadg)) {
                        this.f91210jyumaefscl.crxdokpmqz(ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.iobyxmoadg.f91074iobyxmoadg);
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.eablkybsjg.f91282iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar = this.f91210jyumaefscl;
                        this.f91212zdlpuopuiu = 1;
                        if (iobyxmoadgVar.x(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.oxmwwwfdhm.f91294iobyxmoadg)) {
                        this.f91210jyumaefscl.G();
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.iwizpuwonk.f91287iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar2 = this.f91210jyumaefscl;
                        this.f91212zdlpuopuiu = 2;
                        if (iobyxmoadgVar2.Y(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.zdlpuopuiu.f91304iobyxmoadg)) {
                        this.f91210jyumaefscl.I();
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.draadjrbmk.f91280iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar3 = this.f91210jyumaefscl;
                        this.f91212zdlpuopuiu = 3;
                        if (iobyxmoadgVar3.B(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (wkgbmnqykcVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.vdvldrhtss) {
                        this.f91210jyumaefscl.F(((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.vdvldrhtss) this.f91211yggfygwlhe).iobyxmoadg(), ((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.vdvldrhtss) this.f91211yggfygwlhe).zoijcleaow());
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.C2117wkgbmnqykc.f91302iobyxmoadg)) {
                        this.f91210jyumaefscl.crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.lqeggnwhkg(iobyxmoadg.eslsurpljm(this.f91210jyumaefscl).getDeliveryPhone()));
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.rgvfuqvkyq.f91297iobyxmoadg)) {
                        this.f91210jyumaefscl.e(OrderPickupStatus.ON_MY_WAY);
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.gxszxtbevo.f91285iobyxmoadg)) {
                        this.f91210jyumaefscl.e(OrderPickupStatus.IN_CAR);
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.lereixgezr.f91290iobyxmoadg)) {
                        this.f91210jyumaefscl.K();
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.ojitshcjhn.f91293iobyxmoadg)) {
                        this.f91210jyumaefscl.crxdokpmqz(ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.C2112eablkybsjg.f91069iobyxmoadg);
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.agtfadlqog.f91276iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar4 = this.f91210jyumaefscl;
                        this.f91212zdlpuopuiu = 4;
                        if (iobyxmoadgVar4.E(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (wkgbmnqykcVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.iobyxmoadg) {
                        this.f91210jyumaefscl.crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.lqeggnwhkg(((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.iobyxmoadg) this.f91211yggfygwlhe).iobyxmoadg()));
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.jyumaefscl.f91288iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar5 = this.f91210jyumaefscl;
                        this.f91212zdlpuopuiu = 5;
                        if (iobyxmoadgVar5.X(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (wkgbmnqykcVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.yggfygwlhe) {
                        this.f91210jyumaefscl.J(((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.yggfygwlhe) this.f91211yggfygwlhe).iobyxmoadg());
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.nufgyqmvbu.f91292iobyxmoadg)) {
                        this.f91210jyumaefscl.a0();
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.dxjokdxxww.f91281iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar6 = this.f91210jyumaefscl;
                        this.f91212zdlpuopuiu = 6;
                        if (iobyxmoadgVar6.R(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.zoijcleaow.f91305iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar7 = this.f91210jyumaefscl;
                        this.f91212zdlpuopuiu = 7;
                        if (iobyxmoadgVar7.N(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.lqeggnwhkg.f91291iobyxmoadg)) {
                        this.f91210jyumaefscl.f();
                        break;
                    } else if (wkgbmnqykcVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.btonecajqb) {
                        this.f91210jyumaefscl.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.nufgyqmvbu(((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.btonecajqb) this.f91211yggfygwlhe).iobyxmoadg(), null));
                        break;
                    } else if (wkgbmnqykcVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.cqumvgiudr) {
                        this.f91210jyumaefscl.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.nufgyqmvbu(((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.cqumvgiudr) this.f91211yggfygwlhe).iobyxmoadg(), ((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.cqumvgiudr) this.f91211yggfygwlhe).zoijcleaow()));
                        break;
                    } else if (wkgbmnqykcVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.wflxmlrfwp) {
                        this.f91210jyumaefscl.C(((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.wflxmlrfwp) this.f91211yggfygwlhe).zoijcleaow(), ((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.wflxmlrfwp) this.f91211yggfygwlhe).iobyxmoadg());
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.pmvmpeiblj.f91295iobyxmoadg)) {
                        iobyxmoadg.l0(this.f91210jyumaefscl, AnalyticsPage.Tips.f84363iwizpuwonk, null, null, 6, null);
                        this.f91210jyumaefscl.crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.oxmwwwfdhm(iobyxmoadg.eslsurpljm(this.f91210jyumaefscl).getId()));
                        break;
                    } else if (wkgbmnqykcVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.gtknphoqwx) {
                        iobyxmoadg iobyxmoadgVar8 = this.f91210jyumaefscl;
                        h10.iobyxmoadg iobyxmoadgVarIobyxmoadg = ((ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.gtknphoqwx) this.f91211yggfygwlhe).iobyxmoadg();
                        this.f91212zdlpuopuiu = 8;
                        if (iobyxmoadgVar8.n(iobyxmoadgVarIobyxmoadg, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (wkgbmnqykcVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.kcexrzcfyt) {
                        iobyxmoadg iobyxmoadgVar9 = this.f91210jyumaefscl;
                        this.f91212zdlpuopuiu = 9;
                        if (iobyxmoadgVar9.H(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.esjtqupxsv.f91283iobyxmoadg)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iobyxmoadg iobyxmoadgVar10 = this.f91210jyumaefscl;
                        this.f91212zdlpuopuiu = 10;
                        if (iobyxmoadgVar10.X(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
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
                case 9:
                case 10:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        boolean f91213cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        /* synthetic */ Object f91214esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f91215iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f91216jyumaefscl;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        int f91218pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f91219yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91220zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91214esjtqupxsv = obj;
            this.f91218pmvmpeiblj |= Integer.MIN_VALUE;
            return iobyxmoadg.this.i(this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91221iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91223yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91224zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91223yggfygwlhe = obj;
            this.f91221iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.v(this);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91225iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91227yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91228zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91227yggfygwlhe = obj;
            this.f91225iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.A(this);
        }
    }

    static final class pkzmftpjix extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91230zdlpuopuiu;

        pkzmftpjix(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new pkzmftpjix(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91230zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (iobyxmoadg.eslsurpljm(iobyxmoadg.this).getPayment().getIsCanBePaid()) {
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.iobyxmoadg(true));
                }
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f91230zdlpuopuiu = 1;
                if (iobyxmoadgVar.X(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((pkzmftpjix) create(wwaezpbzknVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class pmvmpeiblj extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f91231jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f91233zdlpuopuiu;

        pmvmpeiblj(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91233zdlpuopuiu = obj;
            this.f91231jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.T(0, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f91234jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f91236zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91236zdlpuopuiu = obj;
            this.f91234jyumaefscl |= Integer.MIN_VALUE;
            Object objB = iobyxmoadg.this.b(null, null, null, this);
            return objB == mg.zoijcleaow.gxszxtbevo() ? objB : gg.kcexrzcfyt.iobyxmoadg(objB);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f91237cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f91239iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f91240jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f91241lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f91242yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91243zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91237cqumvgiudr = obj;
            this.f91241lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.x(this);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91244iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91246yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91247zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91246yggfygwlhe = obj;
            this.f91244iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.z(this);
        }
    }

    /* synthetic */ class wflxmlrfwp extends kotlin.jvm.internal.iobyxmoadg implements tg.rgvfuqvkyq {
        wflxmlrfwp(Object obj) {
            super(2, obj, iobyxmoadg.class, "onCollectTimerAction", "onCollectTimerAction(I)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (lg.gxszxtbevo) obj2);
        }

        public final Object iobyxmoadg(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.s((iobyxmoadg) this.f60022zdlpuopuiu, i13, gxszxtbevoVar);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f91248cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f91250jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f91251yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91252zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91250jyumaefscl = obj;
            this.f91248cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.c(this);
        }
    }

    static final class wwaezpbzkn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f91253yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91254zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wwaezpbzkn(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
            this.f91253yggfygwlhe = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91254zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                tg.draadjrbmk draadjrbmkVar = this.f91253yggfygwlhe;
                this.f91254zdlpuopuiu = 1;
                if (draadjrbmkVar.invoke(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return new wwaezpbzkn(this.f91253yggfygwlhe, gxszxtbevoVar).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class yadqdtsiqt extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f91256esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f91257iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f91258jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f91259yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91260zdlpuopuiu;

        yadqdtsiqt(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91257iwizpuwonk = obj;
            this.f91256esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.Y(this);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91261iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91263yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91264zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91263yggfygwlhe = obj;
            this.f91261iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.E(this);
        }
    }

    static final class ylkuphrtab extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f91265jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ long f91266yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91267zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ylkuphrtab(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f91265jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ylkuphrtab ylkuphrtabVar = new ylkuphrtab(this.f91265jyumaefscl, gxszxtbevoVar);
            ylkuphrtabVar.f91266yggfygwlhe = ((Number) obj).longValue();
            return ylkuphrtabVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ojitshcjhn(((Number) obj).longValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91267zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                long j13 = this.f91266yggfygwlhe;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f91265jyumaefscl;
                Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc((int) j13);
                this.f91267zdlpuopuiu = 1;
                if (rgvfuqvkyqVar.invoke(numWkgbmnqykc, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object ojitshcjhn(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ylkuphrtab) create(Long.valueOf(j13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91268iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91270yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91271zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91270yggfygwlhe = obj;
            this.f91268iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.D(null, this);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f91272iobyxmoadg;

        static {
            int[] iArr = new int[OrderPickupStatus.values().length];
            try {
                iArr[OrderPickupStatus.ON_MY_WAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPickupStatus.IN_CAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91272iobyxmoadg = iArr;
        }
    }

    /* synthetic */ class zynmafqrjb extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        zynmafqrjb(Object obj) {
            super(1, obj, iobyxmoadg.class, "onCompletionTimeoutAction", "onCompletionTimeoutAction(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) this.receiver).z(gxszxtbevoVar);
        }
    }

    static {
        int i13 = xi0.lqeggnwhkg.attention;
        f91125zynmafqrjb = i13;
        f91117istkbnxepw = xi0.lqeggnwhkg.two_minutes_left_replaces_notification;
        f91115cdpycssgdh = xi0.lqeggnwhkg.time_is_over;
        f91123yadqdtsiqt = xi0.lqeggnwhkg.no_replaces_notification;
        f91116iozdgvuglv = xi0.lqeggnwhkg.are_you_sure;
        f91119lmojexxdyd = xi0.lqeggnwhkg.delete_all_replacements_notification;
        f91122wwaezpbzkn = i13;
        f91124ylkuphrtab = xi0.lqeggnwhkg.no_available_replaces_notification;
        f91120pkzmftpjix = xi0.lqeggnwhkg.partly_replaces_notification;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(o20.btonecajqb getEditOrderUseCase, x20.eablkybsjg getOrderUseCase, x20.btonecajqb repeatOrderUseCase, x20.draadjrbmk updatePickupStatusUseCase, x20.zoijcleaow checkOrderPhoneCallEnabledUseCase, oa0.oxmwwwfdhm isTrackOrderEnabledUseCase, oa0.draadjrbmk isPickupStatusButtonEnabledUseCase, oa0.nufgyqmvbu isCancelOrderReasonEnabledUseCase, u10.wkgbmnqykc changeOrdersObserver, j82.iobyxmoadg changeSubscribeTicketsObserver, j42.zoijcleaow locationProvider, j00.wkgbmnqykc optionsInteractor, j00.lqeggnwhkg rateOrderInteractor, dt.zoijcleaow dateUtils, b30.iobyxmoadg confirmProductReplacesUseCase, u10.ppxfxbqfkf changeNotificationObserver, f20.iobyxmoadg changeCartCompoundStateUseCase, cw.zoijcleaow getOrderPaymentsInfoUseCase, cw.ppxfxbqfkf markOrderAsPaymentSuccessUseCase, lo.zoijcleaow analyticsTracker, at.iobyxmoadg permissionManager, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderUseCase, "getOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(repeatOrderUseCase, "repeatOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updatePickupStatusUseCase, "updatePickupStatusUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkOrderPhoneCallEnabledUseCase, "checkOrderPhoneCallEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isTrackOrderEnabledUseCase, "isTrackOrderEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isPickupStatusButtonEnabledUseCase, "isPickupStatusButtonEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isCancelOrderReasonEnabledUseCase, "isCancelOrderReasonEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeOrdersObserver, "changeOrdersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeSubscribeTicketsObserver, "changeSubscribeTicketsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(locationProvider, "locationProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(optionsInteractor, "optionsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rateOrderInteractor, "rateOrderInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(confirmProductReplacesUseCase, "confirmProductReplacesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeNotificationObserver, "changeNotificationObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartCompoundStateUseCase, "changeCartCompoundStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderPaymentsInfoUseCase, "getOrderPaymentsInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(markOrderAsPaymentSuccessUseCase, "markOrderAsPaymentSuccessUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f91142ppxfxbqfkf = getEditOrderUseCase;
        this.f91146wkgbmnqykc = getOrderUseCase;
        this.f91131eablkybsjg = repeatOrderUseCase;
        this.f91134gxszxtbevo = updatePickupStatusUseCase;
        this.f91138lqeggnwhkg = checkOrderPhoneCallEnabledUseCase;
        this.f91139nufgyqmvbu = isTrackOrderEnabledUseCase;
        this.f91130dxjokdxxww = isPickupStatusButtonEnabledUseCase;
        this.f91127btonecajqb = isCancelOrderReasonEnabledUseCase;
        this.f91133gtknphoqwx = changeOrdersObserver;
        this.f91129draadjrbmk = changeSubscribeTicketsObserver;
        this.f91145wflxmlrfwp = locationProvider;
        this.f91126agtfadlqog = optionsInteractor;
        this.f91140ojitshcjhn = rateOrderInteractor;
        this.f91143rgvfuqvkyq = dateUtils;
        this.f91144vdvldrhtss = confirmProductReplacesUseCase;
        this.f91141oxmwwwfdhm = changeNotificationObserver;
        this.f91137kcexrzcfyt = changeCartCompoundStateUseCase;
        this.f91148zdlpuopuiu = getOrderPaymentsInfoUseCase;
        this.f91147yggfygwlhe = markOrderAsPaymentSuccessUseCase;
        this.f91136jyumaefscl = analyticsTracker;
        this.f91135iwizpuwonk = permissionManager;
        this.f91128cqumvgiudr = OrderStatus.UNDEFINED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(lg.gxszxtbevo gxszxtbevoVar) {
        oxmwwwfdhm oxmwwwfdhmVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof oxmwwwfdhm) {
            oxmwwwfdhmVar = (oxmwwwfdhm) gxszxtbevoVar;
            int i13 = oxmwwwfdhmVar.f91225iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oxmwwwfdhmVar.f91225iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            }
        } else {
            oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
        }
        Object obj = oxmwwwfdhmVar.f91227yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = oxmwwwfdhmVar.f91225iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            auzgnhcxok auzgnhcxokVar = this.f91132esjtqupxsv;
            if (auzgnhcxokVar == null || auzgnhcxokVar.isCancelled()) {
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            oxmwwwfdhmVar.f91228zdlpuopuiu = this;
            oxmwwwfdhmVar.f91225iwizpuwonk = 1;
            if (c(oxmwwwfdhmVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) oxmwwwfdhmVar.f91228zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.g0();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(lg.gxszxtbevo gxszxtbevoVar) {
        kcexrzcfyt kcexrzcfytVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof kcexrzcfyt) {
            kcexrzcfytVar = (kcexrzcfyt) gxszxtbevoVar;
            int i13 = kcexrzcfytVar.f91197iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kcexrzcfytVar.f91197iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                kcexrzcfytVar = new kcexrzcfyt(gxszxtbevoVar);
            }
        } else {
            kcexrzcfytVar = new kcexrzcfyt(gxszxtbevoVar);
        }
        Object objZoijcleaow = kcexrzcfytVar.f91199yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = kcexrzcfytVar.f91197iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
            o20.btonecajqb.iobyxmoadg iobyxmoadgVar2 = new o20.btonecajqb.iobyxmoadg(((State) jlmebxxoox()).getId());
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                o20.btonecajqb btonecajqbVar = this.f91142ppxfxbqfkf;
                kcexrzcfytVar.f91200zdlpuopuiu = this;
                kcexrzcfytVar.f91197iwizpuwonk = 1;
                objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar2, kcexrzcfytVar);
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
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) kcexrzcfytVar.f91200zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((e10.iobyxmoadg) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.O((e10.iobyxmoadg) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.P(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.rgvfuqvkyq(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.Order(((State) jlmebxxoox()).getId()), null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu zdlpuopuiuVar;
        Object objB;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zdlpuopuiu) {
            zdlpuopuiuVar = (zdlpuopuiu) gxszxtbevoVar;
            int i13 = zdlpuopuiuVar.f91268iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zdlpuopuiuVar.f91268iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zdlpuopuiuVar = new zdlpuopuiu(gxszxtbevoVar);
            }
        } else {
            zdlpuopuiuVar = new zdlpuopuiu(gxszxtbevoVar);
        }
        Object obj = zdlpuopuiuVar.f91270yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zdlpuopuiuVar.f91268iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            State state = (State) jlmebxxoox();
            ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
            String id2 = state.getId();
            OrderPickupStatus orderPickupStatus = OrderPickupStatus.IN_CAR;
            zdlpuopuiuVar.f91271zdlpuopuiu = this;
            zdlpuopuiuVar.f91268iwizpuwonk = 1;
            objB = b(id2, orderPickupStatus, locationData, zdlpuopuiuVar);
            if (objB == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zdlpuopuiuVar.f91271zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objB = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objB)) {
            iobyxmoadgVar.o((OrderPickupStatus) objB);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objB);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.P(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVar;
        Object objB;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof yggfygwlhe) {
            yggfygwlheVar = (yggfygwlhe) gxszxtbevoVar;
            int i13 = yggfygwlheVar.f91261iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                yggfygwlheVar.f91261iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                yggfygwlheVar = new yggfygwlhe(gxszxtbevoVar);
            }
        } else {
            yggfygwlheVar = new yggfygwlhe(gxszxtbevoVar);
        }
        Object obj = yggfygwlheVar.f91263yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = yggfygwlheVar.f91261iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            State state = (State) jlmebxxoox();
            ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
            String id2 = state.getId();
            OrderPickupStatus orderPickupStatus = OrderPickupStatus.IN_SHOP;
            yggfygwlheVar.f91264zdlpuopuiu = this;
            yggfygwlheVar.f91261iwizpuwonk = 1;
            objB = b(id2, orderPickupStatus, null, yggfygwlheVar);
            if (objB == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) yggfygwlheVar.f91264zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objB = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objB)) {
            iobyxmoadgVar.p((OrderPickupStatus) objB);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objB);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.P(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String str, AnalyticElement.ProductItemElement productItemElement) {
        if (((State) jlmebxxoox()).getIsProductsClickable()) {
            l0(this, new AnalyticsPage.ItemDetail(productItemElement.getId(), productItemElement.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String()), productItemElement, null, 4, null);
            crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.wflxmlrfwp(new ProductPayload(new ProductPayload.Type.Article(str), null, 2, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        State state = (State) jlmebxxoox();
        List payments = state.getPayments();
        String id2 = state.getId();
        PaymentCode code = state.getPayment().getCode();
        if (code == PaymentCode.UNDEFINED) {
            code = null;
        }
        String serverValue = code != null ? code.getServerValue() : null;
        if (serverValue == null) {
            serverValue = "";
        }
        PaymentMethodsArgs paymentMethodsArgs = new PaymentMethodsArgs(new PaymentType.Order(id2, serverValue), Double.valueOf(state.getTotalPrice()), payments, false, state.getPayment().getChange());
        l0(this, AnalyticsPage.PaymentMethods.f84320iwizpuwonk, null, null, 6, null);
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.btonecajqb(paymentMethodsArgs));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(lg.gxszxtbevo gxszxtbevoVar) {
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.iobyxmoadg(true));
        Object objX = X(gxszxtbevoVar);
        return objX == mg.zoijcleaow.gxszxtbevo() ? objX : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        State state = (State) jlmebxxoox();
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.gtknphoqwx(new RateOrderPayload(null, RateOrderPayload.ppxfxbqfkf.ACTUAL, state.getId(), state.getDomainData().getDeliveryCode(), 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean z13) {
        if (z13) {
            crxdokpmqz(ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.agtfadlqog.f91063iobyxmoadg);
        } else {
            crxdokpmqz(ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.nufgyqmvbu.f91084iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.ojitshcjhn(new TrackingOrderPayload(((State) jlmebxxoox()).getId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new jyumaefscl(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.iobyxmoadg(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(lg.gxszxtbevo gxszxtbevoVar) {
        iwizpuwonk iwizpuwonkVar;
        iobyxmoadg iobyxmoadgVar;
        Object next;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof iwizpuwonk) {
            iwizpuwonkVar = (iwizpuwonk) gxszxtbevoVar;
            int i13 = iwizpuwonkVar.f91188iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iwizpuwonkVar.f91188iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iwizpuwonkVar = new iwizpuwonk(gxszxtbevoVar);
            }
        } else {
            iwizpuwonkVar = new iwizpuwonk(gxszxtbevoVar);
        }
        Object objZoijcleaow = iwizpuwonkVar.f91190yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iwizpuwonkVar.f91188iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) iwizpuwonkVar.f91191zdlpuopuiu;
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
                iobyxmoadgVar2 = (iobyxmoadg) iwizpuwonkVar.f91191zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
        List<ProductReplaceModel> products = ((State) jlmebxxoox()).getProducts();
        ArrayList arrayList = new ArrayList();
        for (ProductReplaceModel productReplaceModel : products) {
            boolean isDeleted = productReplaceModel.getProductToReplace().getIsDeleted();
            Iterator it = productReplaceModel.getProductsForReplace().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ProductsForReplaceModel) next).getIsChecked());
            if (isDeleted) {
                next = null;
            }
            ProductsForReplaceModel productsForReplaceModel = (ProductsForReplaceModel) next;
            b30.iobyxmoadg.zoijcleaow zoijcleaowVar = (isDeleted || productsForReplaceModel != null) ? new b30.iobyxmoadg.zoijcleaow(productReplaceModel.getProductToReplace().getArticle(), productsForReplaceModel != null ? productsForReplaceModel.getArticle() : null) : null;
            if (zoijcleaowVar != null) {
                arrayList.add(zoijcleaowVar);
            }
        }
        b30.iobyxmoadg.C0255iobyxmoadg c0255iobyxmoadg = new b30.iobyxmoadg.C0255iobyxmoadg(((State) jlmebxxoox()).getId(), arrayList);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            b30.iobyxmoadg iobyxmoadgVar5 = this.f91144vdvldrhtss;
            iwizpuwonkVar.f91191zdlpuopuiu = this;
            iwizpuwonkVar.f91188iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar5.zoijcleaow(c0255iobyxmoadg, iwizpuwonkVar);
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
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) objZoijcleaow);
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.P(thDxjokdxxww);
        }
        iwizpuwonkVar.f91191zdlpuopuiu = iobyxmoadgVar;
        iwizpuwonkVar.f91188iwizpuwonk = 2;
        if (iobyxmoadgVar.X(iwizpuwonkVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(e10.iobyxmoadg iobyxmoadgVar) {
        W(iobyxmoadgVar.oxmwwwfdhm());
        boolean z13 = !((State) jlmebxxoox()).getIsOrderBlockedForEdit();
        l0(this, new AnalyticsPage.OrderEdit(iobyxmoadgVar.nufgyqmvbu()), null, null, 6, null);
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.gxszxtbevo(new EditOrderPayload(iobyxmoadgVar.nufgyqmvbu(), z13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [ah.lqeggnwhkg, tg.rgvfuqvkyq] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final Object Q(OrderPickupStatus orderPickupStatus, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        cqumvgiudr cqumvgiudrVar;
        ?? r13;
        esjtqupxsv esjtqupxsvVar;
        int i13 = zoijcleaow.f91272iobyxmoadg[orderPickupStatus.ordinal()];
        if (i13 == 1) {
            cqumvgiudrVar = new cqumvgiudr(this);
        } else if (i13 != 2) {
            r13 = 0;
        } else {
            esjtqupxsvVar = new esjtqupxsv(this);
        }
        if (z13) {
            if (r13 != 0) {
                Object objInvoke = r13.invoke(null, gxszxtbevoVar);
                return objInvoke == mg.zoijcleaow.gxszxtbevo() ? objInvoke : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        } else if (r13 != 0) {
            j(r13);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(lg.gxszxtbevo gxszxtbevoVar) {
        lereixgezr lereixgezrVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof lereixgezr) {
            lereixgezrVar = (lereixgezr) gxszxtbevoVar;
            int i13 = lereixgezrVar.f91201iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lereixgezrVar.f91201iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                lereixgezrVar = new lereixgezr(gxszxtbevoVar);
            }
        } else {
            lereixgezrVar = new lereixgezr(gxszxtbevoVar);
        }
        Object objZoijcleaow = lereixgezrVar.f91203yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lereixgezrVar.f91201iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) lereixgezrVar.f91204zdlpuopuiu;
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
                iobyxmoadgVar2 = (iobyxmoadg) lereixgezrVar.f91204zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
        b30.iobyxmoadg.C0255iobyxmoadg c0255iobyxmoadg = new b30.iobyxmoadg.C0255iobyxmoadg(((State) jlmebxxoox()).getId(), null);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            b30.iobyxmoadg iobyxmoadgVar5 = this.f91144vdvldrhtss;
            lereixgezrVar.f91204zdlpuopuiu = this;
            lereixgezrVar.f91201iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar5.zoijcleaow(c0255iobyxmoadg, lereixgezrVar);
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
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) objZoijcleaow);
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.P(thDxjokdxxww);
        }
        lereixgezrVar.f91204zdlpuopuiu = iobyxmoadgVar;
        lereixgezrVar.f91201iwizpuwonk = 2;
        if (iobyxmoadgVar.X(lereixgezrVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S(Warning warning, lg.gxszxtbevo gxszxtbevoVar) {
        this.f91137kcexrzcfyt.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warning, Warning.Empty.f87479jyumaefscl)) {
            if (warning instanceof Warning.WithCodeAndMessage) {
                W(warning);
            } else if (warning instanceof Warning.DailyLimit) {
                crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.pmvmpeiblj(((Warning.DailyLimit) warning).getMessage()));
            }
        }
        crxdokpmqz(ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.dxjokdxxww.f91068iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        pmvmpeiblj pmvmpeibljVar;
        if (gxszxtbevoVar instanceof pmvmpeiblj) {
            pmvmpeibljVar = (pmvmpeiblj) gxszxtbevoVar;
            int i14 = pmvmpeibljVar.f91231jyumaefscl;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pmvmpeibljVar.f91231jyumaefscl = i14 - Integer.MIN_VALUE;
            } else {
                pmvmpeibljVar = new pmvmpeiblj(gxszxtbevoVar);
            }
        } else {
            pmvmpeibljVar = new pmvmpeiblj(gxszxtbevoVar);
        }
        Object obj = pmvmpeibljVar.f91233zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = pmvmpeibljVar.f91231jyumaefscl;
        boolean z13 = true;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (-59 <= i13 && i13 < 1) {
                u(i13 + 60, new zynmafqrjb(this), new istkbnxepw(this));
            } else if (i13 <= -60) {
                pmvmpeibljVar.f91231jyumaefscl = 1;
                if (e0(false, pmvmpeibljVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                z13 = false;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object U(iobyxmoadg iobyxmoadgVar, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.d(i13);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V(String str, lg.gxszxtbevo gxszxtbevoVar) {
        cdpycssgdh cdpycssgdhVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof cdpycssgdh) {
            cdpycssgdhVar = (cdpycssgdh) gxszxtbevoVar;
            int i13 = cdpycssgdhVar.f91154iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cdpycssgdhVar.f91154iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                cdpycssgdhVar = new cdpycssgdh(gxszxtbevoVar);
            }
        } else {
            cdpycssgdhVar = new cdpycssgdh(gxszxtbevoVar);
        }
        Object obj = cdpycssgdhVar.f91156yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = cdpycssgdhVar.f91154iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            b30.iobyxmoadg.C0255iobyxmoadg c0255iobyxmoadg = new b30.iobyxmoadg.C0255iobyxmoadg(str, null);
            b30.iobyxmoadg iobyxmoadgVar2 = this.f91144vdvldrhtss;
            cdpycssgdhVar.f91157zdlpuopuiu = this;
            cdpycssgdhVar.f91154iwizpuwonk = 1;
            if (iobyxmoadgVar2.zoijcleaow(c0255iobyxmoadg, cdpycssgdhVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) cdpycssgdhVar.f91157zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv(f91122wwaezpbzkn, f91124ylkuphrtab));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void W(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.iwizpuwonk(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X(lg.gxszxtbevo gxszxtbevoVar) {
        h0();
        Object objI = i(gxszxtbevoVar);
        return objI == mg.zoijcleaow.gxszxtbevo() ? objI : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(lg.gxszxtbevo gxszxtbevoVar) {
        yadqdtsiqt yadqdtsiqtVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        Object obj;
        iobyxmoadg iobyxmoadgVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof yadqdtsiqt) {
            yadqdtsiqtVar = (yadqdtsiqt) gxszxtbevoVar;
            int i13 = yadqdtsiqtVar.f91256esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                yadqdtsiqtVar.f91256esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                yadqdtsiqtVar = new yadqdtsiqt(gxszxtbevoVar);
            }
        } else {
            yadqdtsiqtVar = new yadqdtsiqt(gxszxtbevoVar);
        }
        Object objZoijcleaow = yadqdtsiqtVar.f91257iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = yadqdtsiqtVar.f91256esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) yadqdtsiqtVar.f91260zdlpuopuiu;
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
                obj = yadqdtsiqtVar.f91259yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) yadqdtsiqtVar.f91260zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.P(thDxjokdxxww);
            }
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            x20.btonecajqb btonecajqbVar = this.f91131eablkybsjg;
            x20.btonecajqb.iobyxmoadg iobyxmoadgVar5 = new x20.btonecajqb.iobyxmoadg(((State) jlmebxxoox()).getId());
            yadqdtsiqtVar.f91260zdlpuopuiu = this;
            yadqdtsiqtVar.f91256esjtqupxsv = 1;
            objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar5, yadqdtsiqtVar);
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
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            yadqdtsiqtVar.f91260zdlpuopuiu = iobyxmoadgVar;
            yadqdtsiqtVar.f91259yggfygwlhe = objWkgbmnqykc;
            yadqdtsiqtVar.f91258jyumaefscl = objWkgbmnqykc;
            yadqdtsiqtVar.f91256esjtqupxsv = 2;
            if (iobyxmoadgVar.S((Warning) objWkgbmnqykc, yadqdtsiqtVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj = objWkgbmnqykc;
            iobyxmoadgVar2 = iobyxmoadgVar;
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
        }
        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.P(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
        iozdgvuglv iozdgvuglvVar;
        Object objB;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iozdgvuglv) {
            iozdgvuglvVar = (iozdgvuglv) gxszxtbevoVar;
            int i13 = iozdgvuglvVar.f91184iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iozdgvuglvVar.f91184iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iozdgvuglvVar = new iozdgvuglv(gxszxtbevoVar);
            }
        } else {
            iozdgvuglvVar = new iozdgvuglv(gxszxtbevoVar);
        }
        Object obj = iozdgvuglvVar.f91186yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iozdgvuglvVar.f91184iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            State state = (State) jlmebxxoox();
            ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
            String id2 = state.getId();
            OrderPickupStatus orderPickupStatus = OrderPickupStatus.ON_MY_WAY;
            iozdgvuglvVar.f91187zdlpuopuiu = this;
            iozdgvuglvVar.f91184iwizpuwonk = 1;
            objB = b(id2, orderPickupStatus, locationData, iozdgvuglvVar);
            if (objB == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) iozdgvuglvVar.f91187zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objB = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objB)) {
            iobyxmoadgVar.q((OrderPickupStatus) objB);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objB);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.P(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.yggfygwlhe(f91116iozdgvuglv, f91119lmojexxdyd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, OrderPickupStatus orderPickupStatus, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f91234jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f91234jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f91236zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f91234jyumaefscl;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                x20.draadjrbmk draadjrbmkVar = this.f91134gxszxtbevo;
                x20.draadjrbmk.iobyxmoadg iobyxmoadgVar2 = new x20.draadjrbmk.iobyxmoadg(str, orderPickupStatus, locationData);
                ppxfxbqfkfVar.f91234jyumaefscl = 1;
                objZoijcleaow = draadjrbmkVar.zoijcleaow(iobyxmoadgVar2, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return gg.kcexrzcfyt.wkgbmnqykc((OrderPickupStatus) objZoijcleaow);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
            return gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    private final void b0(int i13, int i14) {
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.cqumvgiudr(i13, i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar;
        iobyxmoadg iobyxmoadgVar;
        Object next;
        String article;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f91248cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f91248cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f91250jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f91248cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                ylkuphrtabVar = (kotlin.jvm.internal.ylkuphrtab) wkgbmnqykcVar.f91251yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f91252zdlpuopuiu;
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
                iobyxmoadgVar2 = (iobyxmoadg) wkgbmnqykcVar.f91252zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
        ArrayList arrayList = new ArrayList();
        ylkuphrtabVar = new kotlin.jvm.internal.ylkuphrtab();
        for (ProductReplaceModel productReplaceModel : ((State) jlmebxxoox()).getProducts()) {
            if (productReplaceModel.getProductToReplace().getIsDeleted()) {
                ylkuphrtabVar.f60038zdlpuopuiu = true;
                article = null;
            } else {
                Iterator it = productReplaceModel.getProductsForReplace().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((ProductsForReplaceModel) next).getIsChecked());
                ProductsForReplaceModel productsForReplaceModel = (ProductsForReplaceModel) next;
                article = productsForReplaceModel != null ? productsForReplaceModel.getArticle() : null;
                if (article != null) {
                    ylkuphrtabVar.f60038zdlpuopuiu = true;
                }
            }
            arrayList.add(new b30.iobyxmoadg.zoijcleaow(productReplaceModel.getProductToReplace().getArticle(), article));
        }
        b30.iobyxmoadg.C0255iobyxmoadg c0255iobyxmoadg = new b30.iobyxmoadg.C0255iobyxmoadg(((State) jlmebxxoox()).getId(), arrayList);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            b30.iobyxmoadg iobyxmoadgVar5 = this.f91144vdvldrhtss;
            wkgbmnqykcVar.f91252zdlpuopuiu = this;
            wkgbmnqykcVar.f91251yggfygwlhe = ylkuphrtabVar;
            wkgbmnqykcVar.f91248cqumvgiudr = 1;
            objZoijcleaow = iobyxmoadgVar5.zoijcleaow(c0255iobyxmoadg, wkgbmnqykcVar);
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
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) objZoijcleaow);
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.P(thDxjokdxxww);
        }
        boolean z13 = ylkuphrtabVar.f60038zdlpuopuiu;
        wkgbmnqykcVar.f91252zdlpuopuiu = iobyxmoadgVar;
        wkgbmnqykcVar.f91251yggfygwlhe = null;
        wkgbmnqykcVar.f91248cqumvgiudr = 2;
        if (iobyxmoadgVar.e0(z13, wkgbmnqykcVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void c0(int i13, int i14) {
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv(i13, i14));
    }

    private final void d(int i13) {
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.ppxfxbqfkf(i13));
    }

    private final Object d0(lg.gxszxtbevo gxszxtbevoVar) {
        if (this.f91126agtfadlqog.dxjokdxxww() == null || this.f91126agtfadlqog.draadjrbmk()) {
            this.f91126agtfadlqog.oxmwwwfdhm();
            this.f91126agtfadlqog.vdvldrhtss();
            crxdokpmqz(ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.zdlpuopuiu.f91097iobyxmoadg);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(OrderPickupStatus orderPickupStatus) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(orderPickupStatus, null), 3, null);
    }

    private final Object e0(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        c0(f91115cdpycssgdh, z13 ? f91120pkzmftpjix : f91123yadqdtsiqt);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final /* synthetic */ State eslsurpljm(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.zoijcleaow(((State) jlmebxxoox()).getId()));
    }

    private final void f0(int i13, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f91132esjtqupxsv = sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.stevsuqkhv(sj.dxjokdxxww.vdvldrhtss(new lmojexxdyd(k30.wflxmlrfwp.nufgyqmvbu(((long) i13) * 1000, 0L, 2, null))), new wwaezpbzkn(draadjrbmkVar, null)), new ylkuphrtab(rgvfuqvkyqVar, null)), sopmlzcsov());
    }

    private final void g0() {
        h0();
        ulzqkzuiru(ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.dxjokdxxww.f91100iobyxmoadg);
    }

    private final void h0() {
        auzgnhcxok auzgnhcxokVar = this.f91132esjtqupxsv;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x012b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0155 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0156  */
    /* JADX WARN: Code duplicated, block: B:63:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final Object i(lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        Object objWkgbmnqykc;
        ?? r13;
        c10.iobyxmoadg iobyxmoadgVar;
        Order orderIobyxmoadg;
        Object obj;
        ?? r14;
        Object obj2;
        ?? r15;
        ?? r16;
        Throwable thDxjokdxxww;
        iobyxmoadg iobyxmoadgVar2;
        Order order;
        iobyxmoadg iobyxmoadgVar3;
        boolean zBooleanValue;
        Object objZoijcleaow;
        boolean z13;
        Order order2;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f91218pmvmpeiblj;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f91218pmvmpeiblj = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object objZoijcleaow2 = nufgyqmvbuVar.f91214esjtqupxsv;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f91218pmvmpeiblj;
        ?? r17 = 2;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    iobyxmoadgVar2 = (iobyxmoadg) nufgyqmvbuVar.f91220zdlpuopuiu;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                    } catch (Throwable th2) {
                        th = th2;
                        r17 = iobyxmoadgVar2;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                        r13 = r17;
                    }
                } else {
                    if (i14 == 2) {
                        order = (Order) nufgyqmvbuVar.f91219yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar5 = (iobyxmoadg) nufgyqmvbuVar.f91220zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                        iobyxmoadgVar3 = iobyxmoadgVar5;
                        zBooleanValue = ((Boolean) objZoijcleaow2).booleanValue();
                        oa0.draadjrbmk draadjrbmkVar = iobyxmoadgVar3.f91130dxjokdxxww;
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        nufgyqmvbuVar.f91220zdlpuopuiu = iobyxmoadgVar3;
                        nufgyqmvbuVar.f91219yggfygwlhe = order;
                        nufgyqmvbuVar.f91213cqumvgiudr = zBooleanValue;
                        nufgyqmvbuVar.f91218pmvmpeiblj = 3;
                        objZoijcleaow = draadjrbmkVar.zoijcleaow(wwaezpbzknVar, nufgyqmvbuVar);
                        if (objZoijcleaow == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        Order order3 = order;
                        z13 = zBooleanValue;
                        objZoijcleaow2 = objZoijcleaow;
                        order2 = order3;
                        r17 = iobyxmoadgVar3;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new c10.iobyxmoadg(order2, z13, ((Boolean) objZoijcleaow2).booleanValue()));
                        r13 = r17;
                        r16 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            iobyxmoadgVar = (c10.iobyxmoadg) objWkgbmnqykc;
                            r13.t(iobyxmoadgVar.iobyxmoadg().getOrdersStatus(), iobyxmoadgVar.iobyxmoadg().getId());
                            orderIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                            nufgyqmvbuVar.f91220zdlpuopuiu = r13;
                            nufgyqmvbuVar.f91219yggfygwlhe = objWkgbmnqykc;
                            nufgyqmvbuVar.f91216jyumaefscl = objWkgbmnqykc;
                            nufgyqmvbuVar.f91215iwizpuwonk = iobyxmoadgVar;
                            nufgyqmvbuVar.f91218pmvmpeiblj = 4;
                            if (r13.r(orderIobyxmoadg, nufgyqmvbuVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj = objWkgbmnqykc;
                            r14 = r13;
                            r14.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
                            r14.L(iobyxmoadgVar.iobyxmoadg().getPayment().getIsCanBePaid());
                            nufgyqmvbuVar.f91220zdlpuopuiu = r14;
                            nufgyqmvbuVar.f91219yggfygwlhe = objWkgbmnqykc;
                            nufgyqmvbuVar.f91216jyumaefscl = obj;
                            nufgyqmvbuVar.f91215iwizpuwonk = null;
                            nufgyqmvbuVar.f91218pmvmpeiblj = 5;
                            if (r14.m(iobyxmoadgVar, nufgyqmvbuVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj2 = objWkgbmnqykc;
                            r15 = r14;
                        }
                        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww != null) {
                            r16.P(thDxjokdxxww);
                        }
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i14 == 3) {
                        z13 = nufgyqmvbuVar.f91213cqumvgiudr;
                        order2 = (Order) nufgyqmvbuVar.f91219yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar6 = (iobyxmoadg) nufgyqmvbuVar.f91220zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                        r17 = iobyxmoadgVar6;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new c10.iobyxmoadg(order2, z13, ((Boolean) objZoijcleaow2).booleanValue()));
                        r13 = r17;
                        r16 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            iobyxmoadgVar = (c10.iobyxmoadg) objWkgbmnqykc;
                            r13.t(iobyxmoadgVar.iobyxmoadg().getOrdersStatus(), iobyxmoadgVar.iobyxmoadg().getId());
                            orderIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                            nufgyqmvbuVar.f91220zdlpuopuiu = r13;
                            nufgyqmvbuVar.f91219yggfygwlhe = objWkgbmnqykc;
                            nufgyqmvbuVar.f91216jyumaefscl = objWkgbmnqykc;
                            nufgyqmvbuVar.f91215iwizpuwonk = iobyxmoadgVar;
                            nufgyqmvbuVar.f91218pmvmpeiblj = 4;
                            if (r13.r(orderIobyxmoadg, nufgyqmvbuVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj = objWkgbmnqykc;
                            r14 = r13;
                            r14.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
                            r14.L(iobyxmoadgVar.iobyxmoadg().getPayment().getIsCanBePaid());
                            nufgyqmvbuVar.f91220zdlpuopuiu = r14;
                            nufgyqmvbuVar.f91219yggfygwlhe = objWkgbmnqykc;
                            nufgyqmvbuVar.f91216jyumaefscl = obj;
                            nufgyqmvbuVar.f91215iwizpuwonk = null;
                            nufgyqmvbuVar.f91218pmvmpeiblj = 5;
                            if (r14.m(iobyxmoadgVar, nufgyqmvbuVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj2 = objWkgbmnqykc;
                            r15 = r14;
                        }
                        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww != null) {
                            r16.P(thDxjokdxxww);
                        }
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i14 == 4) {
                        iobyxmoadgVar = (c10.iobyxmoadg) nufgyqmvbuVar.f91215iwizpuwonk;
                        obj = nufgyqmvbuVar.f91216jyumaefscl;
                        Object obj3 = nufgyqmvbuVar.f91219yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar7 = (iobyxmoadg) nufgyqmvbuVar.f91220zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                        objWkgbmnqykc = obj3;
                        r14 = iobyxmoadgVar7;
                        r14.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
                        r14.L(iobyxmoadgVar.iobyxmoadg().getPayment().getIsCanBePaid());
                        nufgyqmvbuVar.f91220zdlpuopuiu = r14;
                        nufgyqmvbuVar.f91219yggfygwlhe = objWkgbmnqykc;
                        nufgyqmvbuVar.f91216jyumaefscl = obj;
                        nufgyqmvbuVar.f91215iwizpuwonk = null;
                        nufgyqmvbuVar.f91218pmvmpeiblj = 5;
                        if (r14.m(iobyxmoadgVar, nufgyqmvbuVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        obj2 = objWkgbmnqykc;
                        r15 = r14;
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = nufgyqmvbuVar.f91219yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar8 = (iobyxmoadg) nufgyqmvbuVar.f91220zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                        r15 = iobyxmoadgVar8;
                    }
                }
                r16 = r15;
                objWkgbmnqykc = obj2;
                thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    r16.P(thDxjokdxxww);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow2);
            ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar9 = gg.kcexrzcfyt.f37117yggfygwlhe;
                x20.eablkybsjg eablkybsjgVar = this.f91146wkgbmnqykc;
                x20.eablkybsjg.zoijcleaow zoijcleaowVar = new x20.eablkybsjg.zoijcleaow(((State) jlmebxxoox()).getId());
                nufgyqmvbuVar.f91220zdlpuopuiu = this;
                nufgyqmvbuVar.f91218pmvmpeiblj = 1;
                objZoijcleaow2 = eablkybsjgVar.zoijcleaow(zoijcleaowVar, nufgyqmvbuVar);
                if (objZoijcleaow2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = this;
            } catch (Throwable th3) {
                th = th3;
                r17 = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar10 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                r13 = r17;
            }
            Order order4 = (Order) objZoijcleaow2;
            oa0.oxmwwwfdhm oxmwwwfdhmVar = iobyxmoadgVar2.f91139nufgyqmvbu;
            gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
            nufgyqmvbuVar.f91220zdlpuopuiu = iobyxmoadgVar2;
            nufgyqmvbuVar.f91219yggfygwlhe = order4;
            nufgyqmvbuVar.f91218pmvmpeiblj = 2;
            Object objZoijcleaow3 = oxmwwwfdhmVar.zoijcleaow(wwaezpbzknVar2, nufgyqmvbuVar);
            if (objZoijcleaow3 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg iobyxmoadgVar11 = iobyxmoadgVar2;
            order = order4;
            objZoijcleaow2 = objZoijcleaow3;
            iobyxmoadgVar3 = iobyxmoadgVar11;
            zBooleanValue = ((Boolean) objZoijcleaow2).booleanValue();
            oa0.draadjrbmk draadjrbmkVar2 = iobyxmoadgVar3.f91130dxjokdxxww;
            gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
            nufgyqmvbuVar.f91220zdlpuopuiu = iobyxmoadgVar3;
            nufgyqmvbuVar.f91219yggfygwlhe = order;
            nufgyqmvbuVar.f91213cqumvgiudr = zBooleanValue;
            nufgyqmvbuVar.f91218pmvmpeiblj = 3;
            objZoijcleaow = draadjrbmkVar2.zoijcleaow(wwaezpbzknVar3, nufgyqmvbuVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            Order order5 = order;
            z13 = zBooleanValue;
            objZoijcleaow2 = objZoijcleaow;
            order2 = order5;
            r17 = iobyxmoadgVar3;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new c10.iobyxmoadg(order2, z13, ((Boolean) objZoijcleaow2).booleanValue()));
            r13 = r17;
            r16 = r13;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar = (c10.iobyxmoadg) objWkgbmnqykc;
                r13.t(iobyxmoadgVar.iobyxmoadg().getOrdersStatus(), iobyxmoadgVar.iobyxmoadg().getId());
                orderIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                nufgyqmvbuVar.f91220zdlpuopuiu = r13;
                nufgyqmvbuVar.f91219yggfygwlhe = objWkgbmnqykc;
                nufgyqmvbuVar.f91216jyumaefscl = objWkgbmnqykc;
                nufgyqmvbuVar.f91215iwizpuwonk = iobyxmoadgVar;
                nufgyqmvbuVar.f91218pmvmpeiblj = 4;
                if (r13.r(orderIobyxmoadg, nufgyqmvbuVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj = objWkgbmnqykc;
                r14 = r13;
                r14.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
                r14.L(iobyxmoadgVar.iobyxmoadg().getPayment().getIsCanBePaid());
                nufgyqmvbuVar.f91220zdlpuopuiu = r14;
                nufgyqmvbuVar.f91219yggfygwlhe = objWkgbmnqykc;
                nufgyqmvbuVar.f91216jyumaefscl = obj;
                nufgyqmvbuVar.f91215iwizpuwonk = null;
                nufgyqmvbuVar.f91218pmvmpeiblj = 5;
                if (r14.m(iobyxmoadgVar, nufgyqmvbuVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = objWkgbmnqykc;
                r15 = r14;
                r16 = r15;
                objWkgbmnqykc = obj2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                r16.P(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f91133gtknphoqwx.btonecajqb(), new pkzmftpjix(null)), new hcddaimhww(null)), sopmlzcsov());
    }

    private final void j(final ah.lqeggnwhkg lqeggnwhkgVar) {
        j42.zoijcleaow.wkgbmnqykc(this.f91145wflxmlrfwp, new tg.draadjrbmk() { // from class: ej0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg.k(this.f31395zdlpuopuiu, lqeggnwhkgVar, (LocationData) obj);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f91129draadjrbmk.btonecajqb(), new jpowsppfya(null)), new hkdspvbjdz(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn k(iobyxmoadg iobyxmoadgVar, ah.lqeggnwhkg lqeggnwhkgVar, LocationData locationData) {
        pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, new dxjokdxxww(lqeggnwhkgVar, locationData, null), 3, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void k0(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f91136jyumaefscl.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(new AnalyticsPage.Order(((State) jlmebxxoox()).getId()), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void l0(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.k0(analyticsPage, analyticElement, analyticsLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(c10.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f91149cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f91149cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object objZoijcleaow = btonecajqbVar.f91151jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f91149cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (c10.iobyxmoadg) btonecajqbVar.f91152yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) btonecajqbVar.f91153zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar3 = (iobyxmoadg) btonecajqbVar.f91153zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar3.f91126agtfadlqog.rgvfuqvkyq(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        x20.zoijcleaow.iobyxmoadg iobyxmoadgVar4 = new x20.zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), ((State) jlmebxxoox()).getOrderServerStatus());
        x20.zoijcleaow zoijcleaowVar = this.f91138lqeggnwhkg;
        btonecajqbVar.f91153zdlpuopuiu = this;
        btonecajqbVar.f91152yggfygwlhe = iobyxmoadgVar;
        btonecajqbVar.f91149cqumvgiudr = 1;
        objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar4, btonecajqbVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = this;
        iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.eablkybsjg(iobyxmoadgVar.iobyxmoadg(), ((Boolean) objZoijcleaow).booleanValue(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow()));
        if (iobyxmoadgVar2.f91126agtfadlqog.wflxmlrfwp()) {
            btonecajqbVar.f91153zdlpuopuiu = iobyxmoadgVar2;
            btonecajqbVar.f91152yggfygwlhe = null;
            btonecajqbVar.f91149cqumvgiudr = 2;
            if (iobyxmoadgVar2.d0(btonecajqbVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar3 = iobyxmoadgVar2;
            iobyxmoadgVar3.f91126agtfadlqog.rgvfuqvkyq(false);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(h10.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        iobyxmoadg iobyxmoadgVar2;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar3;
        Object obj;
        iobyxmoadg iobyxmoadgVar4;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f91172cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f91172cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object obj2 = gtknphoqwxVar.f91174jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f91172cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) gtknphoqwxVar.f91176zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                } catch (Throwable th2) {
                    th = th2;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = gtknphoqwxVar.f91175yggfygwlhe;
                iobyxmoadgVar4 = (iobyxmoadg) gtknphoqwxVar.f91176zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
            }
            iobyxmoadgVar3 = iobyxmoadgVar4;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar3.P(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj2);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, h10.iobyxmoadg.ppxfxbqfkf.f39072iobyxmoadg)) {
            ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(false));
            cw.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar6 = new cw.ppxfxbqfkf.iobyxmoadg(((State) jlmebxxoox()).getId());
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = gg.kcexrzcfyt.f37117yggfygwlhe;
                cw.ppxfxbqfkf ppxfxbqfkfVar = this.f91147yggfygwlhe;
                gtknphoqwxVar.f91176zdlpuopuiu = this;
                gtknphoqwxVar.f91172cqumvgiudr = 1;
                if (ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar6, gtknphoqwxVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = this;
            } catch (Throwable th3) {
                th = th3;
                iobyxmoadgVar2 = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, h10.iobyxmoadg.C0896iobyxmoadg.f39071iobyxmoadg) && !(iobyxmoadgVar instanceof h10.iobyxmoadg.zoijcleaow) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, h10.iobyxmoadg.wkgbmnqykc.f39073iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(true));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
        Object obj3 = objWkgbmnqykc;
        iobyxmoadgVar3 = iobyxmoadgVar2;
        obj = obj3;
        if (gg.kcexrzcfyt.agtfadlqog(obj)) {
            gtknphoqwxVar.f91176zdlpuopuiu = iobyxmoadgVar3;
            gtknphoqwxVar.f91175yggfygwlhe = obj;
            gtknphoqwxVar.f91172cqumvgiudr = 2;
            if (iobyxmoadgVar3.X(gtknphoqwxVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar4 = iobyxmoadgVar3;
            iobyxmoadgVar3 = iobyxmoadgVar4;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar3.P(thDxjokdxxww);
            }
        } else {
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar3.P(thDxjokdxxww);
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(OrderPickupStatus orderPickupStatus) {
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.ppxfxbqfkf(((State) jlmebxxoox()).getDeliveryPhone()));
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.lqeggnwhkg(orderPickupStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(OrderPickupStatus orderPickupStatus) {
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.wkgbmnqykc(((State) jlmebxxoox()).getDeliveryPhone()));
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.lqeggnwhkg(orderPickupStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(OrderPickupStatus orderPickupStatus) {
        crxdokpmqz(ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.vdvldrhtss.f91092iobyxmoadg);
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.lqeggnwhkg(orderPickupStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(Order order, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar;
        iobyxmoadg iobyxmoadgVar;
        Order order2;
        int i13;
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar2;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i14 = draadjrbmkVar.f91163pmvmpeiblj;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f91163pmvmpeiblj = i14 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object obj = draadjrbmkVar.f91159esjtqupxsv;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = draadjrbmkVar.f91163pmvmpeiblj;
        if (i15 != 0) {
            if (i15 == 1) {
                i13 = draadjrbmkVar.f91158cqumvgiudr;
                ylkuphrtabVar = (kotlin.jvm.internal.ylkuphrtab) draadjrbmkVar.f91160iwizpuwonk;
                ylkuphrtabVar2 = (kotlin.jvm.internal.ylkuphrtab) draadjrbmkVar.f91161jyumaefscl;
                order2 = (Order) draadjrbmkVar.f91164yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) draadjrbmkVar.f91165zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar3 = new kotlin.jvm.internal.ylkuphrtab();
        ylkuphrtabVar = new kotlin.jvm.internal.ylkuphrtab();
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar4 = new kotlin.jvm.internal.ylkuphrtab();
        List<OrderProduct> basket = order.getBasket();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(basket, 10));
        for (OrderProduct orderProduct : basket) {
            if (!orderProduct.getAvailable() && !orderProduct.getReplaces().isEmpty()) {
                ylkuphrtabVar3.f60038zdlpuopuiu = true;
            }
            if (!orderProduct.getAvailable() && orderProduct.getReplaces().isEmpty()) {
                ylkuphrtabVar.f60038zdlpuopuiu = true;
            }
            if (orderProduct.getAvailable()) {
                ylkuphrtabVar4.f60038zdlpuopuiu = true;
            }
            arrayList.add(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.wkgbmnqykc(ylkuphrtabVar3.f60038zdlpuopuiu, ylkuphrtabVar.f60038zdlpuopuiu, ylkuphrtabVar4.f60038zdlpuopuiu));
        if (order.getCurrentTime().length() == 0 || order.getWaitTime().length() == 0) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        int iL = l(order.getCurrentTime(), order.getWaitTime());
        draadjrbmkVar.f91165zdlpuopuiu = this;
        draadjrbmkVar.f91164yggfygwlhe = order;
        draadjrbmkVar.f91161jyumaefscl = ylkuphrtabVar3;
        draadjrbmkVar.f91160iwizpuwonk = ylkuphrtabVar;
        draadjrbmkVar.f91158cqumvgiudr = iL;
        draadjrbmkVar.f91163pmvmpeiblj = 1;
        Object objT = T(iL, draadjrbmkVar);
        if (objT == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        order2 = order;
        i13 = iL;
        ylkuphrtabVar2 = ylkuphrtabVar3;
        obj = objT;
        if (((Boolean) obj).booleanValue()) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (ylkuphrtabVar2.f60038zdlpuopuiu) {
            iobyxmoadgVar.u(i13, new agtfadlqog(iobyxmoadgVar), new wflxmlrfwp(iobyxmoadgVar));
        } else if (ylkuphrtabVar.f60038zdlpuopuiu) {
            String id2 = order2.getId();
            draadjrbmkVar.f91165zdlpuopuiu = null;
            draadjrbmkVar.f91164yggfygwlhe = null;
            draadjrbmkVar.f91161jyumaefscl = null;
            draadjrbmkVar.f91160iwizpuwonk = null;
            draadjrbmkVar.f91163pmvmpeiblj = 2;
            if (iobyxmoadgVar.V(id2, draadjrbmkVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object s(iobyxmoadg iobyxmoadgVar, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.y(i13);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(OrderStatus orderStatus, String str) {
        OrderStatus orderStatus2 = this.f91128cqumvgiudr;
        OrderStatus orderStatus3 = OrderStatus.CANCEL;
        if (orderStatus2 == orderStatus3 || orderStatus2 == OrderStatus.UNDEFINED || orderStatus != orderStatus3) {
            this.f91128cqumvgiudr = orderStatus;
        } else {
            this.f91128cqumvgiudr = orderStatus;
            crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.lereixgezr(str));
        }
    }

    private final void u(int i13, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (i13 <= 0) {
            return;
        }
        h0();
        f0(i13, draadjrbmkVar, rgvfuqvkyqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(lg.gxszxtbevo gxszxtbevoVar) {
        ojitshcjhn ojitshcjhnVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ojitshcjhn) {
            ojitshcjhnVar = (ojitshcjhn) gxszxtbevoVar;
            int i13 = ojitshcjhnVar.f91221iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ojitshcjhnVar.f91221iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
            }
        } else {
            ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
        }
        Object objZoijcleaow = ojitshcjhnVar.f91223yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ojitshcjhnVar.f91221iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(true));
            cw.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new cw.zoijcleaow.iobyxmoadg(((State) jlmebxxoox()).getId());
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                cw.zoijcleaow zoijcleaowVar = this.f91148zdlpuopuiu;
                ojitshcjhnVar.f91224zdlpuopuiu = this;
                ojitshcjhnVar.f91221iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar2, ojitshcjhnVar);
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
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ojitshcjhnVar.f91224zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((ew.ppxfxbqfkf) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(false));
            iobyxmoadgVar.w((ew.ppxfxbqfkf) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.P(thDxjokdxxww);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void w(ew.ppxfxbqfkf ppxfxbqfkfVar) {
        Object istkbnxepwVar;
        boolean z13 = true;
        if (ppxfxbqfkfVar instanceof ew.ppxfxbqfkf.iobyxmoadg) {
            istkbnxepwVar = new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.zynmafqrjb(((ew.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).ppxfxbqfkf());
        } else if (ppxfxbqfkfVar instanceof ew.ppxfxbqfkf.zoijcleaow) {
            ew.ppxfxbqfkf.zoijcleaow zoijcleaowVar = (ew.ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar;
            istkbnxepwVar = new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.jyumaefscl(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.zoijcleaow());
            z13 = false;
        } else if (ppxfxbqfkfVar instanceof ew.ppxfxbqfkf.wkgbmnqykc) {
            istkbnxepwVar = new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.istkbnxepw(new PaymentWebArgs(((State) jlmebxxoox()).getId()));
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ew.ppxfxbqfkf.C0695ppxfxbqfkf.f32232iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            istkbnxepwVar = null;
        }
        if (istkbnxepwVar != null) {
            crxdokpmqz(istkbnxepwVar);
        }
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0115  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133 A[PHI: r5 r15
      0x0133: PHI (r5v10 ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg) = 
      (r5v8 ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg)
      (r5v11 ru.myspar.orders.impl.screens.specific.domain.store.iobyxmoadg)
     binds: [B:39:0x00fd, B:44:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r15v22 java.lang.Object) = (r15v18 java.lang.Object), (r15v26 java.lang.Object) binds: [B:39:0x00fd, B:44:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(lg.gxszxtbevo gxszxtbevoVar) {
        rgvfuqvkyq rgvfuqvkyqVar;
        RateOrderPayload rateOrderPayload;
        iobyxmoadg iobyxmoadgVar;
        State state;
        State state2;
        iobyxmoadg iobyxmoadgVar2;
        Object objWkgbmnqykc;
        u10.ppxfxbqfkf ppxfxbqfkfVar;
        Object obj;
        State state3;
        iobyxmoadg iobyxmoadgVar3;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof rgvfuqvkyq) {
            rgvfuqvkyqVar = (rgvfuqvkyq) gxszxtbevoVar;
            int i13 = rgvfuqvkyqVar.f91241lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                rgvfuqvkyqVar.f91241lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar);
            }
        } else {
            rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar);
        }
        Object obj2 = rgvfuqvkyqVar.f91237cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = rgvfuqvkyqVar.f91241lereixgezr;
        if (i14 != 0) {
            if (i14 == 1) {
                rateOrderPayload = (RateOrderPayload) rgvfuqvkyqVar.f91240jyumaefscl;
                state = (State) rgvfuqvkyqVar.f91242yggfygwlhe;
                iobyxmoadg iobyxmoadgVar4 = (iobyxmoadg) rgvfuqvkyqVar.f91243zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
                iobyxmoadgVar = iobyxmoadgVar4;
            } else {
                if (i14 == 2) {
                    rateOrderPayload = (RateOrderPayload) rgvfuqvkyqVar.f91240jyumaefscl;
                    state2 = (State) rgvfuqvkyqVar.f91242yggfygwlhe;
                    iobyxmoadgVar2 = (iobyxmoadg) rgvfuqvkyqVar.f91243zdlpuopuiu;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
                    } catch (Throwable th2) {
                        th = th2;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                    }
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        ppxfxbqfkfVar = iobyxmoadgVar2.f91141oxmwwwfdhm;
                        rgvfuqvkyqVar.f91243zdlpuopuiu = iobyxmoadgVar2;
                        rgvfuqvkyqVar.f91242yggfygwlhe = state2;
                        rgvfuqvkyqVar.f91240jyumaefscl = rateOrderPayload;
                        rgvfuqvkyqVar.f91239iwizpuwonk = objWkgbmnqykc;
                        rgvfuqvkyqVar.f91241lereixgezr = 3;
                        if (ppxfxbqfkfVar.gtknphoqwx(rgvfuqvkyqVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        obj = objWkgbmnqykc;
                        state3 = state2;
                        iobyxmoadgVar3 = iobyxmoadgVar2;
                    } else {
                        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww != null) {
                            iobyxmoadgVar2.P(thDxjokdxxww);
                        }
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = rgvfuqvkyqVar.f91239iwizpuwonk;
                rateOrderPayload = (RateOrderPayload) rgvfuqvkyqVar.f91240jyumaefscl;
                state3 = (State) rgvfuqvkyqVar.f91242yggfygwlhe;
                iobyxmoadgVar3 = (iobyxmoadg) rgvfuqvkyqVar.f91243zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
            }
            l0(iobyxmoadgVar3, new AnalyticsPage.OrderCancel(state3.getId()), null, null, 6, null);
            iobyxmoadgVar3.crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.draadjrbmk(rateOrderPayload));
            iobyxmoadgVar2 = iobyxmoadgVar3;
            objWkgbmnqykc = obj;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar2.P(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj2);
        State state4 = (State) jlmebxxoox();
        rateOrderPayload = new RateOrderPayload(null, RateOrderPayload.ppxfxbqfkf.CANCEL, state4.getId(), state4.getDomainData().getDeliveryCode(), 1, null);
        oa0.nufgyqmvbu nufgyqmvbuVar = this.f91127btonecajqb;
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        rgvfuqvkyqVar.f91243zdlpuopuiu = this;
        rgvfuqvkyqVar.f91242yggfygwlhe = state4;
        rgvfuqvkyqVar.f91240jyumaefscl = rateOrderPayload;
        rgvfuqvkyqVar.f91241lereixgezr = 1;
        Object objZoijcleaow = nufgyqmvbuVar.zoijcleaow(wwaezpbzknVar, rgvfuqvkyqVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        state = state4;
        obj2 = objZoijcleaow;
        if (((Boolean) obj2).booleanValue()) {
            l0(iobyxmoadgVar, new AnalyticsPage.OrderCancel(state.getId()), null, null, 6, null);
            iobyxmoadgVar.crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.gtknphoqwx(rateOrderPayload));
        } else {
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                j00.lqeggnwhkg lqeggnwhkgVar = iobyxmoadgVar.f91140ojitshcjhn;
                String id2 = ((State) iobyxmoadgVar.jlmebxxoox()).getId();
                rgvfuqvkyqVar.f91243zdlpuopuiu = iobyxmoadgVar;
                rgvfuqvkyqVar.f91242yggfygwlhe = state;
                rgvfuqvkyqVar.f91240jyumaefscl = rateOrderPayload;
                rgvfuqvkyqVar.f91241lereixgezr = 2;
                if (lqeggnwhkgVar.dxjokdxxww(id2, null, rgvfuqvkyqVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                state2 = state;
                iobyxmoadgVar2 = iobyxmoadgVar;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
                if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    ppxfxbqfkfVar = iobyxmoadgVar2.f91141oxmwwwfdhm;
                    rgvfuqvkyqVar.f91243zdlpuopuiu = iobyxmoadgVar2;
                    rgvfuqvkyqVar.f91242yggfygwlhe = state2;
                    rgvfuqvkyqVar.f91240jyumaefscl = rateOrderPayload;
                    rgvfuqvkyqVar.f91239iwizpuwonk = objWkgbmnqykc;
                    rgvfuqvkyqVar.f91241lereixgezr = 3;
                    if (ppxfxbqfkfVar.gtknphoqwx(rgvfuqvkyqVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    obj = objWkgbmnqykc;
                    state3 = state2;
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    l0(iobyxmoadgVar3, new AnalyticsPage.OrderCancel(state3.getId()), null, null, 6, null);
                    iobyxmoadgVar3.crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.draadjrbmk(rateOrderPayload));
                    iobyxmoadgVar2 = iobyxmoadgVar3;
                    objWkgbmnqykc = obj;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar2.P(thDxjokdxxww);
                    }
                } else {
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar2.P(thDxjokdxxww);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                state2 = state;
                iobyxmoadgVar2 = iobyxmoadgVar;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void y(int i13) {
        d(i13);
        if (i13 == 120) {
            b0(f91125zynmafqrjb, f91117istkbnxepw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(lg.gxszxtbevo gxszxtbevoVar) {
        vdvldrhtss vdvldrhtssVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof vdvldrhtss) {
            vdvldrhtssVar = (vdvldrhtss) gxszxtbevoVar;
            int i13 = vdvldrhtssVar.f91244iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vdvldrhtssVar.f91244iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar);
            }
        } else {
            vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar);
        }
        Object obj = vdvldrhtssVar.f91246yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = vdvldrhtssVar.f91244iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            auzgnhcxok auzgnhcxokVar = this.f91132esjtqupxsv;
            if (auzgnhcxokVar == null || auzgnhcxokVar.isCancelled()) {
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            vdvldrhtssVar.f91247zdlpuopuiu = this;
            vdvldrhtssVar.f91244iwizpuwonk = 1;
            if (e0(false, vdvldrhtssVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) vdvldrhtssVar.f91247zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.g0();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void P(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo.C2113gxszxtbevo(false));
        crxdokpmqz(new ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.kcexrzcfyt(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.orders.impl.screens.specific.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(intent, this, null), 3, null);
    }

    public final int l(String currentTime, String waitTime) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(currentTime, "currentTime");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(waitTime, "waitTime");
        return (int) ChronoUnit.SECONDS.between(this.f91143rgvfuqvkyq.gxszxtbevo(currentTime), this.f91143rgvfuqvkyq.gxszxtbevo(waitTime));
    }
}

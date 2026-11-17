package ru.myspar.proloyalty.orders.impl.screens.specific.domain.store;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.components.payment.api.models.PaymentCode;
import ru.myspar.proloyalty.core.domain.models.order.OrderDetail;
import ru.myspar.proloyalty.core.domain.models.order.OrderPickupStatus;
import ru.myspar.proloyalty.core.domain.models.order.OrderProduct;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import ru.myspar.proloyalty.core.domain.models.order.productreplacement.ProductReplaceModel;
import ru.myspar.proloyalty.core.domain.models.order.productreplacement.ProductsForReplaceModel;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import ru.myspar.proloyalty.core.domain.models.tracking.TrackingOrderPayload;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;
import ru.myspar.proloyalty.payment.api.model.PaymentType;
import ru.myspar.proloyalty.payment.api.model.PaymentWebArgs;
import ru.myspar.proloyalty.rate.rate_order.api.models.RateOrderPayload;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final int f98769cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final C2361iobyxmoadg f98770cqumvgiudr = new C2361iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f98771esjtqupxsv = 8;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final int f98772iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final int f98773istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final int f98774lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final int f98775lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final int f98776pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final int f98777wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final int f98778yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final int f98779zynmafqrjb;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final g11.iobyxmoadg f98780agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final eq1.zoijcleaow f98781btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final bz0.gxszxtbevo f98782draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final cu1.iobyxmoadg f98783dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final c11.btonecajqb f98784eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final bz0.ppxfxbqfkf f98785gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final c11.draadjrbmk f98786gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private auzgnhcxok f98787iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private OrderStatus f98788jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final vm0.zoijcleaow f98789kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final c11.zoijcleaow f98790lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final i01.wkgbmnqykc f98791nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final i01.ppxfxbqfkf f98792ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final wu0.ppxfxbqfkf f98793oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w01.gtknphoqwx f98794ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final p01.iobyxmoadg f98795rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final wu0.zoijcleaow f98796vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final xr0.zoijcleaow f98797wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c11.eablkybsjg f98798wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final t81.iobyxmoadg f98799yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ur0.iobyxmoadg f98800zdlpuopuiu;

    /* synthetic */ class agtfadlqog extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        agtfadlqog(Object obj) {
            super(1, obj, iobyxmoadg.class, "onCompletionTimerAction", "onCompletionTimerAction(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) this.receiver).z(gxszxtbevoVar);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98801iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98803yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98804zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98803yggfygwlhe = obj;
            this.f98801iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.l(null, this);
        }
    }

    static final class cdpycssgdh extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98805iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98807yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98808zdlpuopuiu;

        cdpycssgdh(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98807yggfygwlhe = obj;
            this.f98805iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.Y(null, this);
        }
    }

    /* synthetic */ class cqumvgiudr extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        cqumvgiudr(Object obj) {
            super(2, obj, iobyxmoadg.class, "onInCarClicked", "onInCarClicked(Lru/myspar/proloyalty/common/models/LocationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) this.receiver).C(locationData, gxszxtbevoVar);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f98809cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        /* synthetic */ Object f98810esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f98811iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f98812jyumaefscl;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        int f98814pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f98815yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98816zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98810esjtqupxsv = obj;
            this.f98814pmvmpeiblj |= Integer.MIN_VALUE;
            return iobyxmoadg.this.q(null, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ LocationData f98817jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ah.lqeggnwhkg f98818yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98819zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(ah.lqeggnwhkg lqeggnwhkgVar, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98818yggfygwlhe = lqeggnwhkgVar;
            this.f98817jyumaefscl = locationData;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new dxjokdxxww(this.f98818yggfygwlhe, this.f98817jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98819zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) this.f98818yggfygwlhe;
                LocationData locationData = this.f98817jyumaefscl;
                this.f98819zdlpuopuiu = 1;
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
        final /* synthetic */ OrderPickupStatus f98820jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98822zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(OrderPickupStatus orderPickupStatus, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98820jyumaefscl = orderPickupStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f98820jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98822zdlpuopuiu;
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
            ur0.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f98800zdlpuopuiu;
            String name = iobyxmoadg.this.getClass().getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            List listI = hg.agtfadlqog.i(iobyxmoadg.this.f98781btonecajqb.zoijcleaow());
            this.f98822zdlpuopuiu = 1;
            obj = iobyxmoadgVar.ppxfxbqfkf(name, listI, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f98822zdlpuopuiu = 2;
            if (iobyxmoadg.this.P(this.f98820jyumaefscl, ((ur0.ppxfxbqfkf) obj) instanceof ur0.ppxfxbqfkf.iobyxmoadg, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98823iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98825yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98826zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98825yggfygwlhe = obj;
            this.f98823iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.Q(this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f98827cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f98829jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f98830yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98831zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98829jyumaefscl = obj;
            this.f98827cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.m(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f98832jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.ppxfxbqfkf f98833yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98834zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98833yggfygwlhe = ppxfxbqfkfVar;
            this.f98832jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f98833yggfygwlhe, this.f98832jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98834zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98833yggfygwlhe, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.ppxfxbqfkf.iobyxmoadg.f98920iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f98832jyumaefscl.i0();
                this.f98832jyumaefscl.h0();
                iobyxmoadg iobyxmoadgVar = this.f98832jyumaefscl;
                this.f98834zdlpuopuiu = 1;
                if (iobyxmoadgVar.W(this) == objGxszxtbevo) {
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
        /* synthetic */ Object f98835yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98836zdlpuopuiu;

        hcddaimhww(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98836zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f98835yggfygwlhe, new CrashlyticsKey[0]);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            hcddaimhww hcddaimhwwVar = new hcddaimhww(gxszxtbevoVar);
            hcddaimhwwVar.f98835yggfygwlhe = th2;
            return hcddaimhwwVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2361iobyxmoadg {
        public /* synthetic */ C2361iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2361iobyxmoadg() {
        }
    }

    static final class iozdgvuglv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f98837yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98838zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iozdgvuglv(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
            this.f98837yggfygwlhe = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98838zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                tg.draadjrbmk draadjrbmkVar = this.f98837yggfygwlhe;
                this.f98838zdlpuopuiu = 1;
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
            return new iozdgvuglv(this.f98837yggfygwlhe, gxszxtbevoVar).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class istkbnxepw extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f98840esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f98841iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f98842jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f98843yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98844zdlpuopuiu;

        istkbnxepw(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98841iwizpuwonk = obj;
            this.f98840esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.X(this);
        }
    }

    /* synthetic */ class iwizpuwonk extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        iwizpuwonk(Object obj) {
            super(2, obj, iobyxmoadg.class, "setOnMyWayStatus", "setOnMyWayStatus(Lru/myspar/proloyalty/common/models/LocationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) this.receiver).Y(locationData, gxszxtbevoVar);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98845iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98847yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98848zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98847yggfygwlhe = obj;
            this.f98845iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.M(this);
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98849iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98851yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98852zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98851yggfygwlhe = obj;
            this.f98849iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.C(null, this);
        }
    }

    /* synthetic */ class lereixgezr extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        lereixgezr(Object obj) {
            super(1, obj, iobyxmoadg.class, "onCompletionTimeoutAction", "onCompletionTimeoutAction(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) this.receiver).y(gxszxtbevoVar);
        }
    }

    static final class lmojexxdyd extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f98853jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ long f98854yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98855zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lmojexxdyd(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98853jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lmojexxdyd lmojexxdydVar = new lmojexxdyd(this.f98853jyumaefscl, gxszxtbevoVar);
            lmojexxdydVar.f98854yggfygwlhe = ((Number) obj).longValue();
            return lmojexxdydVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ojitshcjhn(((Number) obj).longValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98855zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                long j13 = this.f98854yggfygwlhe;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f98853jyumaefscl;
                Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc((int) j13);
                this.f98855zdlpuopuiu = 1;
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
            return ((lmojexxdyd) create(Long.valueOf(j13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f98856jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc f98857yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98858zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98857yggfygwlhe = wkgbmnqykcVar;
            this.f98856jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new lqeggnwhkg(this.f98857yggfygwlhe, this.f98856jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            switch (this.f98858zdlpuopuiu) {
                case 0:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc wkgbmnqykcVar = this.f98857yggfygwlhe;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.ppxfxbqfkf.f98941iobyxmoadg)) {
                        this.f98856jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.iobyxmoadg.f98728iobyxmoadg);
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.eablkybsjg.f98927iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar = this.f98856jyumaefscl;
                        this.f98858zdlpuopuiu = 1;
                        if (iobyxmoadgVar.w(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.oxmwwwfdhm.f98939iobyxmoadg)) {
                        this.f98856jyumaefscl.F();
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.iwizpuwonk.f98932iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar2 = this.f98856jyumaefscl;
                        this.f98858zdlpuopuiu = 2;
                        if (iobyxmoadgVar2.X(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.zdlpuopuiu.f98949iobyxmoadg)) {
                        this.f98856jyumaefscl.H();
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.draadjrbmk.f98925iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar3 = this.f98856jyumaefscl;
                        this.f98858zdlpuopuiu = 3;
                        if (iobyxmoadgVar3.A(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.vdvldrhtss) {
                        this.f98856jyumaefscl.E(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.vdvldrhtss) this.f98857yggfygwlhe).iobyxmoadg(), ((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.vdvldrhtss) this.f98857yggfygwlhe).zoijcleaow());
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.C2364wkgbmnqykc.f98947iobyxmoadg)) {
                        this.f98856jyumaefscl.crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.lqeggnwhkg(iobyxmoadg.yzdjzghtvl(this.f98856jyumaefscl).getDeliveryPhone()));
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.rgvfuqvkyq.f98942iobyxmoadg)) {
                        this.f98856jyumaefscl.d(OrderPickupStatus.ON_MY_WAY);
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.gxszxtbevo.f98930iobyxmoadg)) {
                        this.f98856jyumaefscl.d(OrderPickupStatus.IN_CAR);
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.lereixgezr.f98935iobyxmoadg)) {
                        this.f98856jyumaefscl.J();
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.ojitshcjhn.f98938iobyxmoadg)) {
                        this.f98856jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.C2359eablkybsjg.f98723iobyxmoadg);
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.agtfadlqog.f98921iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar4 = this.f98856jyumaefscl;
                        this.f98858zdlpuopuiu = 4;
                        if (iobyxmoadgVar4.D(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.iobyxmoadg) {
                        this.f98856jyumaefscl.crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.lqeggnwhkg(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.iobyxmoadg) this.f98857yggfygwlhe).iobyxmoadg()));
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.jyumaefscl.f98933iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar5 = this.f98856jyumaefscl;
                        this.f98858zdlpuopuiu = 5;
                        if (iobyxmoadgVar5.W(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.yggfygwlhe) {
                        this.f98856jyumaefscl.I(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.yggfygwlhe) this.f98857yggfygwlhe).iobyxmoadg());
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.nufgyqmvbu.f98937iobyxmoadg)) {
                        this.f98856jyumaefscl.Z();
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.dxjokdxxww.f98926iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar6 = this.f98856jyumaefscl;
                        this.f98858zdlpuopuiu = 6;
                        if (iobyxmoadgVar6.Q(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.zoijcleaow.f98950iobyxmoadg)) {
                        iobyxmoadg iobyxmoadgVar7 = this.f98856jyumaefscl;
                        this.f98858zdlpuopuiu = 7;
                        if (iobyxmoadgVar7.M(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.lqeggnwhkg.f98936iobyxmoadg)) {
                        this.f98856jyumaefscl.e();
                        break;
                    } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.btonecajqb) {
                        this.f98856jyumaefscl.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.nufgyqmvbu(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.btonecajqb) this.f98857yggfygwlhe).iobyxmoadg(), null));
                        break;
                    } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.cqumvgiudr) {
                        this.f98856jyumaefscl.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.nufgyqmvbu(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.cqumvgiudr) this.f98857yggfygwlhe).iobyxmoadg(), ((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.cqumvgiudr) this.f98857yggfygwlhe).zoijcleaow()));
                        break;
                    } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.wflxmlrfwp) {
                        this.f98856jyumaefscl.B(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.wflxmlrfwp) this.f98857yggfygwlhe).zoijcleaow(), ((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.wflxmlrfwp) this.f98857yggfygwlhe).iobyxmoadg());
                        break;
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.pmvmpeiblj.f98940iobyxmoadg)) {
                        iobyxmoadg.k0(this.f98856jyumaefscl, AnalyticsPage.Tips.f92391iwizpuwonk, null, null, 6, null);
                        this.f98856jyumaefscl.crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.oxmwwwfdhm(iobyxmoadg.yzdjzghtvl(this.f98856jyumaefscl).getId()));
                        break;
                    } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.gtknphoqwx) {
                        iobyxmoadg iobyxmoadgVar8 = this.f98856jyumaefscl;
                        xz0.iobyxmoadg iobyxmoadgVarIobyxmoadg = ((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.gtknphoqwx) this.f98857yggfygwlhe).iobyxmoadg();
                        this.f98858zdlpuopuiu = 8;
                        if (iobyxmoadgVar8.m(iobyxmoadgVarIobyxmoadg, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.kcexrzcfyt) {
                        iobyxmoadg iobyxmoadgVar9 = this.f98856jyumaefscl;
                        this.f98858zdlpuopuiu = 9;
                        if (iobyxmoadgVar9.G(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.esjtqupxsv.f98928iobyxmoadg)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iobyxmoadg iobyxmoadgVar10 = this.f98856jyumaefscl;
                        this.f98858zdlpuopuiu = 10;
                        if (iobyxmoadgVar10.W(this) == objGxszxtbevo) {
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
        boolean f98859cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        /* synthetic */ Object f98860esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f98861iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f98862jyumaefscl;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        int f98864pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f98865yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98866zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98860esjtqupxsv = obj;
            this.f98864pmvmpeiblj |= Integer.MIN_VALUE;
            return iobyxmoadg.this.h(this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98867iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98869yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98870zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98869yggfygwlhe = obj;
            this.f98867iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.u(this);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98871iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98873yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98874zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98873yggfygwlhe = obj;
            this.f98871iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.A(this);
        }
    }

    static final class pkzmftpjix extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98876zdlpuopuiu;

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
            int i13 = this.f98876zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f98876zdlpuopuiu = 1;
                if (iobyxmoadgVar.W(this) == objGxszxtbevo) {
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

    /* synthetic */ class pmvmpeiblj extends kotlin.jvm.internal.iobyxmoadg implements tg.rgvfuqvkyq {
        pmvmpeiblj(Object obj) {
            super(2, obj, iobyxmoadg.class, "changeProductReplacementTimer", "changeProductReplacementTimer(I)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (lg.gxszxtbevo) obj2);
        }

        public final Object iobyxmoadg(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.T((iobyxmoadg) this.f60022zdlpuopuiu, i13, gxszxtbevoVar);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f98877jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f98879zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98879zdlpuopuiu = obj;
            this.f98877jyumaefscl |= Integer.MIN_VALUE;
            Object objA = iobyxmoadg.this.a(null, null, null, this);
            return objA == mg.zoijcleaow.gxszxtbevo() ? objA : gg.kcexrzcfyt.iobyxmoadg(objA);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f98880cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f98882iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f98883jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f98884lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f98885yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98886zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98880cqumvgiudr = obj;
            this.f98884lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.w(this);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98887iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98889yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98890zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98889yggfygwlhe = obj;
            this.f98887iwizpuwonk |= Integer.MIN_VALUE;
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
            return iobyxmoadg.r((iobyxmoadg) this.f60022zdlpuopuiu, i13, gxszxtbevoVar);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f98891cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f98893jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f98894yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98895zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98893jyumaefscl = obj;
            this.f98891cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.b(this);
        }
    }

    static final class wwaezpbzkn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98897zdlpuopuiu;

        wwaezpbzkn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wwaezpbzkn(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98897zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (iobyxmoadg.yzdjzghtvl(iobyxmoadg.this).getPayment().getIsCanBePaid()) {
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.iobyxmoadg(true));
                }
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f98897zdlpuopuiu = 1;
                if (iobyxmoadgVar.W(this) == objGxszxtbevo) {
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
            return ((wwaezpbzkn) create(wwaezpbzknVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class yadqdtsiqt implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98898zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg$yadqdtsiqt$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2362iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98899zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg$yadqdtsiqt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2363iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98901yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98902zdlpuopuiu;

                public C2363iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98902zdlpuopuiu = obj;
                    this.f98901yggfygwlhe |= Integer.MIN_VALUE;
                    return C2362iobyxmoadg.this.emit(null, this);
                }
            }

            public C2362iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98899zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2363iobyxmoadg c2363iobyxmoadg;
                if (gxszxtbevoVar instanceof C2363iobyxmoadg) {
                    c2363iobyxmoadg = (C2363iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2363iobyxmoadg.f98901yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2363iobyxmoadg.f98901yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2363iobyxmoadg = new C2363iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2363iobyxmoadg = new C2363iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2363iobyxmoadg.f98902zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2363iobyxmoadg.f98901yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98899zdlpuopuiu;
                    Long lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(((Number) obj).longValue() / 1000);
                    c2363iobyxmoadg.f98901yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(lEablkybsjg, c2363iobyxmoadg) == objGxszxtbevo) {
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

        public yadqdtsiqt(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98898zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98898zdlpuopuiu.collect(new C2362iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f98903jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98905zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        yggfygwlhe(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98903jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new yggfygwlhe(this.f98903jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98905zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                boolean isNeededOpenPaymentScreen = iobyxmoadg.yzdjzghtvl(iobyxmoadg.this).getIsNeededOpenPaymentScreen();
                if (!this.f98903jyumaefscl) {
                    if (isNeededOpenPaymentScreen) {
                        iobyxmoadg.L(iobyxmoadg.this);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!isNeededOpenPaymentScreen) {
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(false));
                iobyxmoadg.L(iobyxmoadg.this);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f98905zdlpuopuiu = 1;
                if (iobyxmoadgVar.u(this) == objGxszxtbevo) {
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
            return ((yggfygwlhe) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ylkuphrtab extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98906yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98907zdlpuopuiu;

        ylkuphrtab(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98907zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f98906yggfygwlhe, new CrashlyticsKey[0]);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            ylkuphrtab ylkuphrtabVar = new ylkuphrtab(gxszxtbevoVar);
            ylkuphrtabVar.f98906yggfygwlhe = th2;
            return ylkuphrtabVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98908iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98910yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98911zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98910yggfygwlhe = obj;
            this.f98908iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.D(this);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f98912iobyxmoadg;

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
            f98912iobyxmoadg = iArr;
        }
    }

    static final class zynmafqrjb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f98913iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98915yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98916zdlpuopuiu;

        zynmafqrjb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98915yggfygwlhe = obj;
            this.f98913iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.U(null, this);
        }
    }

    static {
        int i13 = xf1.lqeggnwhkg.proloyalty_attention;
        f98774lereixgezr = i13;
        f98776pmvmpeiblj = xf1.lqeggnwhkg.proloyalty_two_minutes_left_replaces_notification;
        f98779zynmafqrjb = xf1.lqeggnwhkg.proloyalty_time_is_over;
        f98773istkbnxepw = xf1.lqeggnwhkg.proloyalty_no_replaces_notification;
        f98769cdpycssgdh = xf1.lqeggnwhkg.proloyalty_are_you_sure;
        f98778yadqdtsiqt = xf1.lqeggnwhkg.proloyalty_delete_all_replacements_notification;
        f98772iozdgvuglv = i13;
        f98775lmojexxdyd = xf1.lqeggnwhkg.proloyalty_no_available_replaces_notification;
        f98777wwaezpbzkn = xf1.lqeggnwhkg.proloyalty_partly_replaces_notification;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, w01.gtknphoqwx getEditOrderUseCase, c11.eablkybsjg getOrderUseCase, c11.btonecajqb repeatOrderUseCase, c11.draadjrbmk updatePickupStatusUseCase, c11.zoijcleaow checkOrderPhoneCallEnabledUseCase, i01.wkgbmnqykc changeOrdersObserver, cu1.iobyxmoadg changeSubscribeTicketsObserver, eq1.zoijcleaow locationProvider, bz0.ppxfxbqfkf optionsInteractor, bz0.gxszxtbevo rateOrderInteractor, xr0.zoijcleaow dateUtils, g11.iobyxmoadg confirmProductReplacesUseCase, i01.ppxfxbqfkf changeNotificationObserver, p01.iobyxmoadg changeCartCompoundStateUseCase, wu0.zoijcleaow getOrderPaymentsInfoUseCase, wu0.ppxfxbqfkf markOrderAsPaymentSuccessUseCase, vm0.zoijcleaow analyticsTracker, ur0.iobyxmoadg permissionManager, t81.iobyxmoadg featureManager) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderUseCase, "getOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(repeatOrderUseCase, "repeatOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updatePickupStatusUseCase, "updatePickupStatusUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkOrderPhoneCallEnabledUseCase, "checkOrderPhoneCallEnabledUseCase");
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
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        this.f98794ppxfxbqfkf = getEditOrderUseCase;
        this.f98798wkgbmnqykc = getOrderUseCase;
        this.f98784eablkybsjg = repeatOrderUseCase;
        this.f98786gxszxtbevo = updatePickupStatusUseCase;
        this.f98790lqeggnwhkg = checkOrderPhoneCallEnabledUseCase;
        this.f98791nufgyqmvbu = changeOrdersObserver;
        this.f98783dxjokdxxww = changeSubscribeTicketsObserver;
        this.f98781btonecajqb = locationProvider;
        this.f98785gtknphoqwx = optionsInteractor;
        this.f98782draadjrbmk = rateOrderInteractor;
        this.f98797wflxmlrfwp = dateUtils;
        this.f98780agtfadlqog = confirmProductReplacesUseCase;
        this.f98792ojitshcjhn = changeNotificationObserver;
        this.f98795rgvfuqvkyq = changeCartCompoundStateUseCase;
        this.f98796vdvldrhtss = getOrderPaymentsInfoUseCase;
        this.f98793oxmwwwfdhm = markOrderAsPaymentSuccessUseCase;
        this.f98789kcexrzcfyt = analyticsTracker;
        this.f98800zdlpuopuiu = permissionManager;
        this.f98799yggfygwlhe = featureManager;
        this.f98788jyumaefscl = OrderStatus.UNDEFINED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(lg.gxszxtbevo gxszxtbevoVar) {
        oxmwwwfdhm oxmwwwfdhmVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof oxmwwwfdhm) {
            oxmwwwfdhmVar = (oxmwwwfdhm) gxszxtbevoVar;
            int i13 = oxmwwwfdhmVar.f98871iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oxmwwwfdhmVar.f98871iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            }
        } else {
            oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
        }
        Object objZoijcleaow = oxmwwwfdhmVar.f98873yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = oxmwwwfdhmVar.f98871iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
            w01.gtknphoqwx.iobyxmoadg iobyxmoadgVar2 = new w01.gtknphoqwx.iobyxmoadg(((State) jlmebxxoox()).getId());
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                w01.gtknphoqwx gtknphoqwxVar = this.f98794ppxfxbqfkf;
                oxmwwwfdhmVar.f98874zdlpuopuiu = this;
                oxmwwwfdhmVar.f98871iwizpuwonk = 1;
                objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar2, oxmwwwfdhmVar);
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
            iobyxmoadgVar = (iobyxmoadg) oxmwwwfdhmVar.f98874zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((uz0.iobyxmoadg) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.N((uz0.iobyxmoadg) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.O(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.rgvfuqvkyq(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.Order(((State) jlmebxxoox()).getId()), null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
        kcexrzcfyt kcexrzcfytVar;
        Object objA;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof kcexrzcfyt) {
            kcexrzcfytVar = (kcexrzcfyt) gxszxtbevoVar;
            int i13 = kcexrzcfytVar.f98849iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kcexrzcfytVar.f98849iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                kcexrzcfytVar = new kcexrzcfyt(gxszxtbevoVar);
            }
        } else {
            kcexrzcfytVar = new kcexrzcfyt(gxszxtbevoVar);
        }
        Object obj = kcexrzcfytVar.f98851yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = kcexrzcfytVar.f98849iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            State state = (State) jlmebxxoox();
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
            String id2 = state.getId();
            OrderPickupStatus orderPickupStatus = OrderPickupStatus.IN_CAR;
            kcexrzcfytVar.f98852zdlpuopuiu = this;
            kcexrzcfytVar.f98849iwizpuwonk = 1;
            objA = a(id2, orderPickupStatus, locationData, kcexrzcfytVar);
            if (objA == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) kcexrzcfytVar.f98852zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objA = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objA)) {
            iobyxmoadgVar.n((OrderPickupStatus) objA);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objA);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.O(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(lg.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu zdlpuopuiuVar;
        Object objA;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zdlpuopuiu) {
            zdlpuopuiuVar = (zdlpuopuiu) gxszxtbevoVar;
            int i13 = zdlpuopuiuVar.f98908iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zdlpuopuiuVar.f98908iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zdlpuopuiuVar = new zdlpuopuiu(gxszxtbevoVar);
            }
        } else {
            zdlpuopuiuVar = new zdlpuopuiu(gxszxtbevoVar);
        }
        Object obj = zdlpuopuiuVar.f98910yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zdlpuopuiuVar.f98908iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            State state = (State) jlmebxxoox();
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
            String id2 = state.getId();
            OrderPickupStatus orderPickupStatus = OrderPickupStatus.IN_SHOP;
            zdlpuopuiuVar.f98911zdlpuopuiu = this;
            zdlpuopuiuVar.f98908iwizpuwonk = 1;
            objA = a(id2, orderPickupStatus, null, zdlpuopuiuVar);
            if (objA == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zdlpuopuiuVar.f98911zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objA = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objA)) {
            iobyxmoadgVar.o((OrderPickupStatus) objA);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objA);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.O(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(String str, AnalyticElement.ProductItemElement productItemElement) {
        if (((State) jlmebxxoox()).getIsProductsClickable()) {
            k0(this, new AnalyticsPage.ItemDetail(productItemElement.getId(), productItemElement.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String()), productItemElement, null, 4, null);
            crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.wflxmlrfwp(new ProductPayload(new ProductPayload.Type.Article(str), null, 2, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
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
        k0(this, AnalyticsPage.PaymentMethods.f92348iwizpuwonk, null, null, 6, null);
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.btonecajqb(paymentMethodsArgs));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(lg.gxszxtbevo gxszxtbevoVar) {
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.iobyxmoadg(true));
        Object objW = W(gxszxtbevoVar);
        return objW == mg.zoijcleaow.gxszxtbevo() ? objW : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        State state = (State) jlmebxxoox();
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.gtknphoqwx(new RateOrderPayload(null, RateOrderPayload.ppxfxbqfkf.ACTUAL, state.getId(), state.getDomainData().getDeliveryCode(), 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(boolean z13) {
        if (z13) {
            crxdokpmqz(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.agtfadlqog.f98717iobyxmoadg);
        } else {
            crxdokpmqz(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.nufgyqmvbu.f98738iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.ojitshcjhn(new TrackingOrderPayload(((State) jlmebxxoox()).getId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new yggfygwlhe(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.iobyxmoadg(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(lg.gxszxtbevo gxszxtbevoVar) {
        jyumaefscl jyumaefsclVar;
        iobyxmoadg iobyxmoadgVar;
        Object next;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof jyumaefscl) {
            jyumaefsclVar = (jyumaefscl) gxszxtbevoVar;
            int i13 = jyumaefsclVar.f98845iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jyumaefsclVar.f98845iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            }
        } else {
            jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
        }
        Object objZoijcleaow = jyumaefsclVar.f98847yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = jyumaefsclVar.f98845iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) jyumaefsclVar.f98848zdlpuopuiu;
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
                iobyxmoadgVar2 = (iobyxmoadg) jyumaefsclVar.f98848zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
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
            g11.iobyxmoadg.zoijcleaow zoijcleaowVar = (isDeleted || productsForReplaceModel != null) ? new g11.iobyxmoadg.zoijcleaow(productReplaceModel.getProductToReplace().getArticle(), productsForReplaceModel != null ? productsForReplaceModel.getArticle() : null) : null;
            if (zoijcleaowVar != null) {
                arrayList.add(zoijcleaowVar);
            }
        }
        g11.iobyxmoadg.C0808iobyxmoadg c0808iobyxmoadg = new g11.iobyxmoadg.C0808iobyxmoadg(((State) jlmebxxoox()).getId(), arrayList);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            g11.iobyxmoadg iobyxmoadgVar5 = this.f98780agtfadlqog;
            jyumaefsclVar.f98848zdlpuopuiu = this;
            jyumaefsclVar.f98845iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar5.zoijcleaow(c0808iobyxmoadg, jyumaefsclVar);
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
            iobyxmoadgVar.O(thDxjokdxxww);
        }
        jyumaefsclVar.f98848zdlpuopuiu = iobyxmoadgVar;
        jyumaefsclVar.f98845iwizpuwonk = 2;
        if (iobyxmoadgVar.W(jyumaefsclVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(uz0.iobyxmoadg iobyxmoadgVar) {
        V(iobyxmoadgVar.oxmwwwfdhm());
        boolean z13 = !((State) jlmebxxoox()).getIsOrderBlockedForEdit();
        k0(this, new AnalyticsPage.OrderEdit(iobyxmoadgVar.nufgyqmvbu()), null, null, 6, null);
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.gxszxtbevo(new EditOrderPayload(iobyxmoadgVar.nufgyqmvbu(), z13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [ah.lqeggnwhkg, tg.rgvfuqvkyq] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final Object P(OrderPickupStatus orderPickupStatus, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        iwizpuwonk iwizpuwonkVar;
        ?? r13;
        cqumvgiudr cqumvgiudrVar;
        int i13 = zoijcleaow.f98912iobyxmoadg[orderPickupStatus.ordinal()];
        if (i13 == 1) {
            iwizpuwonkVar = new iwizpuwonk(this);
        } else if (i13 != 2) {
            r13 = 0;
        } else {
            cqumvgiudrVar = new cqumvgiudr(this);
        }
        if (z13) {
            if (r13 != 0) {
                Object objInvoke = r13.invoke(null, gxszxtbevoVar);
                return objInvoke == mg.zoijcleaow.gxszxtbevo() ? objInvoke : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        } else if (r13 != 0) {
            i(r13);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(lg.gxszxtbevo gxszxtbevoVar) {
        esjtqupxsv esjtqupxsvVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof esjtqupxsv) {
            esjtqupxsvVar = (esjtqupxsv) gxszxtbevoVar;
            int i13 = esjtqupxsvVar.f98823iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                esjtqupxsvVar.f98823iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
            }
        } else {
            esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
        }
        Object objZoijcleaow = esjtqupxsvVar.f98825yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = esjtqupxsvVar.f98823iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) esjtqupxsvVar.f98826zdlpuopuiu;
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
                iobyxmoadgVar2 = (iobyxmoadg) esjtqupxsvVar.f98826zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
        g11.iobyxmoadg.C0808iobyxmoadg c0808iobyxmoadg = new g11.iobyxmoadg.C0808iobyxmoadg(((State) jlmebxxoox()).getId(), null);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            g11.iobyxmoadg iobyxmoadgVar5 = this.f98780agtfadlqog;
            esjtqupxsvVar.f98826zdlpuopuiu = this;
            esjtqupxsvVar.f98823iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar5.zoijcleaow(c0808iobyxmoadg, esjtqupxsvVar);
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
            iobyxmoadgVar.O(thDxjokdxxww);
        }
        esjtqupxsvVar.f98826zdlpuopuiu = iobyxmoadgVar;
        esjtqupxsvVar.f98823iwizpuwonk = 2;
        if (iobyxmoadgVar.W(esjtqupxsvVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R(Warning warning, lg.gxszxtbevo gxszxtbevoVar) {
        this.f98795rgvfuqvkyq.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warning, Warning.Empty.f95255jyumaefscl)) {
            if (warning instanceof Warning.WithCodeAndMessage) {
                V(warning);
            } else if (warning instanceof Warning.DailyLimit) {
                crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.pmvmpeiblj(((Warning.DailyLimit) warning).getMessage()));
            }
        }
        crxdokpmqz(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.dxjokdxxww.f98722iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final Object S(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        boolean z13 = true;
        if (-59 <= i13 && i13 < 1) {
            t(i13 + 60, new lereixgezr(this), new pmvmpeiblj(this));
        } else if (i13 <= -60) {
            d0(false);
        } else {
            z13 = false;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object T(iobyxmoadg iobyxmoadgVar, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.c(i13);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zynmafqrjb zynmafqrjbVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zynmafqrjb) {
            zynmafqrjbVar = (zynmafqrjb) gxszxtbevoVar;
            int i13 = zynmafqrjbVar.f98913iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zynmafqrjbVar.f98913iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zynmafqrjbVar = new zynmafqrjb(gxszxtbevoVar);
            }
        } else {
            zynmafqrjbVar = new zynmafqrjb(gxszxtbevoVar);
        }
        Object obj = zynmafqrjbVar.f98915yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zynmafqrjbVar.f98913iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            g11.iobyxmoadg.C0808iobyxmoadg c0808iobyxmoadg = new g11.iobyxmoadg.C0808iobyxmoadg(str, null);
            g11.iobyxmoadg iobyxmoadgVar2 = this.f98780agtfadlqog;
            zynmafqrjbVar.f98916zdlpuopuiu = this;
            zynmafqrjbVar.f98913iwizpuwonk = 1;
            if (iobyxmoadgVar2.zoijcleaow(c0808iobyxmoadg, zynmafqrjbVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zynmafqrjbVar.f98916zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv(f98772iozdgvuglv, f98775lmojexxdyd));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void V(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.iwizpuwonk(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W(lg.gxszxtbevo gxszxtbevoVar) {
        g0();
        Object objH = h(gxszxtbevoVar);
        return objH == mg.zoijcleaow.gxszxtbevo() ? objH : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(lg.gxszxtbevo gxszxtbevoVar) {
        istkbnxepw istkbnxepwVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        Object obj;
        iobyxmoadg iobyxmoadgVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof istkbnxepw) {
            istkbnxepwVar = (istkbnxepw) gxszxtbevoVar;
            int i13 = istkbnxepwVar.f98840esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                istkbnxepwVar.f98840esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                istkbnxepwVar = new istkbnxepw(gxszxtbevoVar);
            }
        } else {
            istkbnxepwVar = new istkbnxepw(gxszxtbevoVar);
        }
        Object objZoijcleaow = istkbnxepwVar.f98841iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = istkbnxepwVar.f98840esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) istkbnxepwVar.f98844zdlpuopuiu;
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
                obj = istkbnxepwVar.f98843yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) istkbnxepwVar.f98844zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.O(thDxjokdxxww);
            }
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            c11.btonecajqb btonecajqbVar = this.f98784eablkybsjg;
            c11.btonecajqb.iobyxmoadg iobyxmoadgVar5 = new c11.btonecajqb.iobyxmoadg(((State) jlmebxxoox()).getId());
            istkbnxepwVar.f98844zdlpuopuiu = this;
            istkbnxepwVar.f98840esjtqupxsv = 1;
            objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar5, istkbnxepwVar);
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
            istkbnxepwVar.f98844zdlpuopuiu = iobyxmoadgVar;
            istkbnxepwVar.f98843yggfygwlhe = objWkgbmnqykc;
            istkbnxepwVar.f98842jyumaefscl = objWkgbmnqykc;
            istkbnxepwVar.f98840esjtqupxsv = 2;
            if (iobyxmoadgVar.R((Warning) objWkgbmnqykc, istkbnxepwVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj = objWkgbmnqykc;
            iobyxmoadgVar2 = iobyxmoadgVar;
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
        }
        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.O(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
        cdpycssgdh cdpycssgdhVar;
        Object objA;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof cdpycssgdh) {
            cdpycssgdhVar = (cdpycssgdh) gxszxtbevoVar;
            int i13 = cdpycssgdhVar.f98805iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cdpycssgdhVar.f98805iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                cdpycssgdhVar = new cdpycssgdh(gxszxtbevoVar);
            }
        } else {
            cdpycssgdhVar = new cdpycssgdh(gxszxtbevoVar);
        }
        Object obj = cdpycssgdhVar.f98807yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = cdpycssgdhVar.f98805iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            State state = (State) jlmebxxoox();
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
            String id2 = state.getId();
            OrderPickupStatus orderPickupStatus = OrderPickupStatus.ON_MY_WAY;
            cdpycssgdhVar.f98808zdlpuopuiu = this;
            cdpycssgdhVar.f98805iwizpuwonk = 1;
            objA = a(id2, orderPickupStatus, locationData, cdpycssgdhVar);
            if (objA == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) cdpycssgdhVar.f98808zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objA = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objA)) {
            iobyxmoadgVar.p((OrderPickupStatus) objA);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objA);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.O(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.yggfygwlhe(f98769cdpycssgdh, f98778yadqdtsiqt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, OrderPickupStatus orderPickupStatus, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f98877jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f98877jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f98879zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f98877jyumaefscl;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                c11.draadjrbmk draadjrbmkVar = this.f98786gxszxtbevo;
                c11.draadjrbmk.iobyxmoadg iobyxmoadgVar2 = new c11.draadjrbmk.iobyxmoadg(str, orderPickupStatus, locationData);
                ppxfxbqfkfVar.f98877jyumaefscl = 1;
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

    private final void a0(int i13, int i14) {
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.cqumvgiudr(i13, i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar;
        Object next;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f98891cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f98891cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f98893jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f98891cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
            ArrayList arrayList = new ArrayList();
            kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar2 = new kotlin.jvm.internal.ylkuphrtab();
            for (ProductReplaceModel productReplaceModel : ((State) jlmebxxoox()).getProducts()) {
                String article = null;
                if (productReplaceModel.getProductToReplace().getIsDeleted()) {
                    ylkuphrtabVar2.f60038zdlpuopuiu = true;
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
                        ylkuphrtabVar2.f60038zdlpuopuiu = true;
                    }
                }
                arrayList.add(new g11.iobyxmoadg.zoijcleaow(productReplaceModel.getProductToReplace().getArticle(), article));
            }
            g11.iobyxmoadg.C0808iobyxmoadg c0808iobyxmoadg = new g11.iobyxmoadg.C0808iobyxmoadg(((State) jlmebxxoox()).getId(), arrayList);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                g11.iobyxmoadg iobyxmoadgVar3 = this.f98780agtfadlqog;
                wkgbmnqykcVar.f98895zdlpuopuiu = this;
                wkgbmnqykcVar.f98894yggfygwlhe = ylkuphrtabVar2;
                wkgbmnqykcVar.f98891cqumvgiudr = 1;
                objZoijcleaow = iobyxmoadgVar3.zoijcleaow(c0808iobyxmoadg, wkgbmnqykcVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
                ylkuphrtabVar = ylkuphrtabVar2;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                ylkuphrtabVar = ylkuphrtabVar2;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ylkuphrtabVar = (kotlin.jvm.internal.ylkuphrtab) wkgbmnqykcVar.f98894yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f98895zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) objZoijcleaow);
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.O(thDxjokdxxww);
        }
        iobyxmoadgVar.d0(ylkuphrtabVar.f60038zdlpuopuiu);
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void b0(int i13, int i14) {
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv(i13, i14));
    }

    private final void c(int i13) {
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.ppxfxbqfkf(i13));
    }

    private final Object c0(lg.gxszxtbevo gxszxtbevoVar) {
        if (this.f98785gtknphoqwx.nufgyqmvbu() == null || this.f98785gtknphoqwx.gtknphoqwx()) {
            this.f98785gtknphoqwx.vdvldrhtss();
            this.f98785gtknphoqwx.rgvfuqvkyq();
            crxdokpmqz(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.zdlpuopuiu.f98751iobyxmoadg);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(OrderPickupStatus orderPickupStatus) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(orderPickupStatus, null), 3, null);
    }

    private final void d0(boolean z13) {
        b0(f98779zynmafqrjb, z13 ? f98777wwaezpbzkn : f98773istkbnxepw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.zoijcleaow(((State) jlmebxxoox()).getId()));
    }

    private final void e0(int i13, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f98787iwizpuwonk = sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.stevsuqkhv(sj.dxjokdxxww.vdvldrhtss(new yadqdtsiqt(q11.btonecajqb.nufgyqmvbu(((long) i13) * 1000, 0L, 2, null))), new iozdgvuglv(draadjrbmkVar, null)), new lmojexxdyd(rgvfuqvkyqVar, null)), sopmlzcsov());
    }

    private final void f0() {
        g0();
        ulzqkzuiru(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.dxjokdxxww.f98754iobyxmoadg);
    }

    private final void g0() {
        auzgnhcxok auzgnhcxokVar = this.f98787iwizpuwonk;
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
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final Object h(lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        Object objWkgbmnqykc;
        ?? r13;
        sz0.iobyxmoadg iobyxmoadgVar;
        OrderDetail orderDetailIobyxmoadg;
        Object obj;
        ?? r14;
        Object obj2;
        ?? r15;
        ?? r16;
        Throwable thDxjokdxxww;
        iobyxmoadg iobyxmoadgVar2;
        OrderDetail orderDetail;
        iobyxmoadg iobyxmoadgVar3;
        boolean zBooleanValue;
        Object objPpxfxbqfkf;
        boolean z13;
        OrderDetail orderDetail2;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f98864pmvmpeiblj;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f98864pmvmpeiblj = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object objZoijcleaow = nufgyqmvbuVar.f98860esjtqupxsv;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f98864pmvmpeiblj;
        ?? r17 = 2;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    iobyxmoadgVar2 = (iobyxmoadg) nufgyqmvbuVar.f98866zdlpuopuiu;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    } catch (Throwable th2) {
                        th = th2;
                        r17 = iobyxmoadgVar2;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                        r13 = r17;
                    }
                } else {
                    if (i14 == 2) {
                        orderDetail = (OrderDetail) nufgyqmvbuVar.f98865yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar5 = (iobyxmoadg) nufgyqmvbuVar.f98866zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                        iobyxmoadgVar3 = iobyxmoadgVar5;
                        zBooleanValue = ((Boolean) objZoijcleaow).booleanValue();
                        t81.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar3.f98799yggfygwlhe;
                        s81.iobyxmoadg iobyxmoadgVar7 = s81.iobyxmoadg.f105747wwaezpbzkn;
                        nufgyqmvbuVar.f98866zdlpuopuiu = iobyxmoadgVar3;
                        nufgyqmvbuVar.f98865yggfygwlhe = orderDetail;
                        nufgyqmvbuVar.f98859cqumvgiudr = zBooleanValue;
                        nufgyqmvbuVar.f98864pmvmpeiblj = 3;
                        objPpxfxbqfkf = iobyxmoadgVar6.ppxfxbqfkf(iobyxmoadgVar7, nufgyqmvbuVar);
                        if (objPpxfxbqfkf == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        OrderDetail orderDetail3 = orderDetail;
                        z13 = zBooleanValue;
                        objZoijcleaow = objPpxfxbqfkf;
                        orderDetail2 = orderDetail3;
                        r17 = iobyxmoadgVar3;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new sz0.iobyxmoadg(orderDetail2, z13, ((Boolean) objZoijcleaow).booleanValue()));
                        r13 = r17;
                        r16 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            iobyxmoadgVar = (sz0.iobyxmoadg) objWkgbmnqykc;
                            r13.s(iobyxmoadgVar.iobyxmoadg().getOrdersStatus(), iobyxmoadgVar.iobyxmoadg().getId());
                            orderDetailIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                            nufgyqmvbuVar.f98866zdlpuopuiu = r13;
                            nufgyqmvbuVar.f98865yggfygwlhe = objWkgbmnqykc;
                            nufgyqmvbuVar.f98862jyumaefscl = objWkgbmnqykc;
                            nufgyqmvbuVar.f98861iwizpuwonk = iobyxmoadgVar;
                            nufgyqmvbuVar.f98864pmvmpeiblj = 4;
                            if (r13.q(orderDetailIobyxmoadg, nufgyqmvbuVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj = objWkgbmnqykc;
                            r14 = r13;
                            r14.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
                            r14.K(iobyxmoadgVar.iobyxmoadg().getPayment().getIsCanBePaid());
                            nufgyqmvbuVar.f98866zdlpuopuiu = r14;
                            nufgyqmvbuVar.f98865yggfygwlhe = objWkgbmnqykc;
                            nufgyqmvbuVar.f98862jyumaefscl = obj;
                            nufgyqmvbuVar.f98861iwizpuwonk = null;
                            nufgyqmvbuVar.f98864pmvmpeiblj = 5;
                            if (r14.l(iobyxmoadgVar, nufgyqmvbuVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj2 = objWkgbmnqykc;
                            r15 = r14;
                        }
                        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww != null) {
                            r16.O(thDxjokdxxww);
                        }
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i14 == 3) {
                        z13 = nufgyqmvbuVar.f98859cqumvgiudr;
                        orderDetail2 = (OrderDetail) nufgyqmvbuVar.f98865yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar8 = (iobyxmoadg) nufgyqmvbuVar.f98866zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                        r17 = iobyxmoadgVar8;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new sz0.iobyxmoadg(orderDetail2, z13, ((Boolean) objZoijcleaow).booleanValue()));
                        r13 = r17;
                        r16 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            iobyxmoadgVar = (sz0.iobyxmoadg) objWkgbmnqykc;
                            r13.s(iobyxmoadgVar.iobyxmoadg().getOrdersStatus(), iobyxmoadgVar.iobyxmoadg().getId());
                            orderDetailIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                            nufgyqmvbuVar.f98866zdlpuopuiu = r13;
                            nufgyqmvbuVar.f98865yggfygwlhe = objWkgbmnqykc;
                            nufgyqmvbuVar.f98862jyumaefscl = objWkgbmnqykc;
                            nufgyqmvbuVar.f98861iwizpuwonk = iobyxmoadgVar;
                            nufgyqmvbuVar.f98864pmvmpeiblj = 4;
                            if (r13.q(orderDetailIobyxmoadg, nufgyqmvbuVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj = objWkgbmnqykc;
                            r14 = r13;
                            r14.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
                            r14.K(iobyxmoadgVar.iobyxmoadg().getPayment().getIsCanBePaid());
                            nufgyqmvbuVar.f98866zdlpuopuiu = r14;
                            nufgyqmvbuVar.f98865yggfygwlhe = objWkgbmnqykc;
                            nufgyqmvbuVar.f98862jyumaefscl = obj;
                            nufgyqmvbuVar.f98861iwizpuwonk = null;
                            nufgyqmvbuVar.f98864pmvmpeiblj = 5;
                            if (r14.l(iobyxmoadgVar, nufgyqmvbuVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj2 = objWkgbmnqykc;
                            r15 = r14;
                        }
                        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww != null) {
                            r16.O(thDxjokdxxww);
                        }
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i14 == 4) {
                        iobyxmoadgVar = (sz0.iobyxmoadg) nufgyqmvbuVar.f98861iwizpuwonk;
                        obj = nufgyqmvbuVar.f98862jyumaefscl;
                        Object obj3 = nufgyqmvbuVar.f98865yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar9 = (iobyxmoadg) nufgyqmvbuVar.f98866zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                        objWkgbmnqykc = obj3;
                        r14 = iobyxmoadgVar9;
                        r14.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
                        r14.K(iobyxmoadgVar.iobyxmoadg().getPayment().getIsCanBePaid());
                        nufgyqmvbuVar.f98866zdlpuopuiu = r14;
                        nufgyqmvbuVar.f98865yggfygwlhe = objWkgbmnqykc;
                        nufgyqmvbuVar.f98862jyumaefscl = obj;
                        nufgyqmvbuVar.f98861iwizpuwonk = null;
                        nufgyqmvbuVar.f98864pmvmpeiblj = 5;
                        if (r14.l(iobyxmoadgVar, nufgyqmvbuVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        obj2 = objWkgbmnqykc;
                        r15 = r14;
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = nufgyqmvbuVar.f98865yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar10 = (iobyxmoadg) nufgyqmvbuVar.f98866zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                        r15 = iobyxmoadgVar10;
                    }
                }
                r16 = r15;
                objWkgbmnqykc = obj2;
                thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    r16.O(thDxjokdxxww);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar11 = gg.kcexrzcfyt.f37117yggfygwlhe;
                c11.eablkybsjg eablkybsjgVar = this.f98798wkgbmnqykc;
                c11.eablkybsjg.zoijcleaow zoijcleaowVar = new c11.eablkybsjg.zoijcleaow(((State) jlmebxxoox()).getId());
                nufgyqmvbuVar.f98866zdlpuopuiu = this;
                nufgyqmvbuVar.f98864pmvmpeiblj = 1;
                objZoijcleaow = eablkybsjgVar.zoijcleaow(zoijcleaowVar, nufgyqmvbuVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = this;
            } catch (Throwable th3) {
                th = th3;
                r17 = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar12 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                r13 = r17;
            }
            OrderDetail orderDetail4 = (OrderDetail) objZoijcleaow;
            t81.iobyxmoadg iobyxmoadgVar13 = iobyxmoadgVar2.f98799yggfygwlhe;
            s81.iobyxmoadg iobyxmoadgVar14 = s81.iobyxmoadg.f105736lmojexxdyd;
            nufgyqmvbuVar.f98866zdlpuopuiu = iobyxmoadgVar2;
            nufgyqmvbuVar.f98865yggfygwlhe = orderDetail4;
            nufgyqmvbuVar.f98864pmvmpeiblj = 2;
            Object objPpxfxbqfkf2 = iobyxmoadgVar13.ppxfxbqfkf(iobyxmoadgVar14, nufgyqmvbuVar);
            if (objPpxfxbqfkf2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg iobyxmoadgVar15 = iobyxmoadgVar2;
            orderDetail = orderDetail4;
            objZoijcleaow = objPpxfxbqfkf2;
            iobyxmoadgVar3 = iobyxmoadgVar15;
            zBooleanValue = ((Boolean) objZoijcleaow).booleanValue();
            t81.iobyxmoadg iobyxmoadgVar16 = iobyxmoadgVar3.f98799yggfygwlhe;
            s81.iobyxmoadg iobyxmoadgVar17 = s81.iobyxmoadg.f105747wwaezpbzkn;
            nufgyqmvbuVar.f98866zdlpuopuiu = iobyxmoadgVar3;
            nufgyqmvbuVar.f98865yggfygwlhe = orderDetail;
            nufgyqmvbuVar.f98859cqumvgiudr = zBooleanValue;
            nufgyqmvbuVar.f98864pmvmpeiblj = 3;
            objPpxfxbqfkf = iobyxmoadgVar16.ppxfxbqfkf(iobyxmoadgVar17, nufgyqmvbuVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            OrderDetail orderDetail5 = orderDetail;
            z13 = zBooleanValue;
            objZoijcleaow = objPpxfxbqfkf;
            orderDetail2 = orderDetail5;
            r17 = iobyxmoadgVar3;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new sz0.iobyxmoadg(orderDetail2, z13, ((Boolean) objZoijcleaow).booleanValue()));
            r13 = r17;
            r16 = r13;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar = (sz0.iobyxmoadg) objWkgbmnqykc;
                r13.s(iobyxmoadgVar.iobyxmoadg().getOrdersStatus(), iobyxmoadgVar.iobyxmoadg().getId());
                orderDetailIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                nufgyqmvbuVar.f98866zdlpuopuiu = r13;
                nufgyqmvbuVar.f98865yggfygwlhe = objWkgbmnqykc;
                nufgyqmvbuVar.f98862jyumaefscl = objWkgbmnqykc;
                nufgyqmvbuVar.f98861iwizpuwonk = iobyxmoadgVar;
                nufgyqmvbuVar.f98864pmvmpeiblj = 4;
                if (r13.q(orderDetailIobyxmoadg, nufgyqmvbuVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj = objWkgbmnqykc;
                r14 = r13;
                r14.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
                r14.K(iobyxmoadgVar.iobyxmoadg().getPayment().getIsCanBePaid());
                nufgyqmvbuVar.f98866zdlpuopuiu = r14;
                nufgyqmvbuVar.f98865yggfygwlhe = objWkgbmnqykc;
                nufgyqmvbuVar.f98862jyumaefscl = obj;
                nufgyqmvbuVar.f98861iwizpuwonk = null;
                nufgyqmvbuVar.f98864pmvmpeiblj = 5;
                if (r14.l(iobyxmoadgVar, nufgyqmvbuVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = objWkgbmnqykc;
                r15 = r14;
                r16 = r15;
                objWkgbmnqykc = obj2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                r16.O(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f98791nufgyqmvbu.nufgyqmvbu(), new wwaezpbzkn(null)), new ylkuphrtab(null)), sopmlzcsov());
    }

    private final void i(final ah.lqeggnwhkg lqeggnwhkgVar) {
        eq1.zoijcleaow.gxszxtbevo(this.f98781btonecajqb, new tg.draadjrbmk() { // from class: eg1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg.j(this.f31289zdlpuopuiu, lqeggnwhkgVar, (LocationData) obj);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f98783dxjokdxxww.nufgyqmvbu(), new pkzmftpjix(null)), new hcddaimhww(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn j(iobyxmoadg iobyxmoadgVar, ah.lqeggnwhkg lqeggnwhkgVar, LocationData locationData) {
        pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, new dxjokdxxww(lqeggnwhkgVar, locationData, null), 3, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void j0(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f98789kcexrzcfyt.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(new AnalyticsPage.Order(((State) jlmebxxoox()).getId()), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void k0(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.j0(analyticsPage, analyticElement, analyticsLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(sz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f98801iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f98801iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object obj = btonecajqbVar.f98803yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f98801iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.eablkybsjg(iobyxmoadgVar.iobyxmoadg(), ((Boolean) this.f98790lqeggnwhkg.zoijcleaow(new c11.zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg().getDelivery().getPhone(), iobyxmoadgVar.iobyxmoadg().getDelivery().getCode(), iobyxmoadgVar.iobyxmoadg().getOrdersStatus(), ((State) jlmebxxoox()).getOrderServerStatus()))).booleanValue(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow()));
            if (this.f98785gtknphoqwx.draadjrbmk()) {
                btonecajqbVar.f98804zdlpuopuiu = this;
                btonecajqbVar.f98801iwizpuwonk = 1;
                if (c0(btonecajqbVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = this;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iobyxmoadgVar2 = (iobyxmoadg) btonecajqbVar.f98804zdlpuopuiu;
        gg.zdlpuopuiu.zoijcleaow(obj);
        iobyxmoadgVar2.f98785gtknphoqwx.ojitshcjhn(false);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(xz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        iobyxmoadg iobyxmoadgVar2;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar3;
        Object obj;
        iobyxmoadg iobyxmoadgVar4;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f98827cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f98827cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object obj2 = gtknphoqwxVar.f98829jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f98827cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) gtknphoqwxVar.f98831zdlpuopuiu;
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
                obj = gtknphoqwxVar.f98830yggfygwlhe;
                iobyxmoadgVar4 = (iobyxmoadg) gtknphoqwxVar.f98831zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
            }
            iobyxmoadgVar3 = iobyxmoadgVar4;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar3.O(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj2);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, xz0.iobyxmoadg.ppxfxbqfkf.f123478iobyxmoadg)) {
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(false));
            wu0.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar6 = new wu0.ppxfxbqfkf.iobyxmoadg(((State) jlmebxxoox()).getId());
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = gg.kcexrzcfyt.f37117yggfygwlhe;
                wu0.ppxfxbqfkf ppxfxbqfkfVar = this.f98793oxmwwwfdhm;
                gtknphoqwxVar.f98831zdlpuopuiu = this;
                gtknphoqwxVar.f98827cqumvgiudr = 1;
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
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, xz0.iobyxmoadg.C3118iobyxmoadg.f123477iobyxmoadg) && !(iobyxmoadgVar instanceof xz0.iobyxmoadg.zoijcleaow) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, xz0.iobyxmoadg.wkgbmnqykc.f123479iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(true));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
        Object obj3 = objWkgbmnqykc;
        iobyxmoadgVar3 = iobyxmoadgVar2;
        obj = obj3;
        if (gg.kcexrzcfyt.agtfadlqog(obj)) {
            gtknphoqwxVar.f98831zdlpuopuiu = iobyxmoadgVar3;
            gtknphoqwxVar.f98830yggfygwlhe = obj;
            gtknphoqwxVar.f98827cqumvgiudr = 2;
            if (iobyxmoadgVar3.W(gtknphoqwxVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar4 = iobyxmoadgVar3;
            iobyxmoadgVar3 = iobyxmoadgVar4;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar3.O(thDxjokdxxww);
            }
        } else {
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar3.O(thDxjokdxxww);
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(OrderPickupStatus orderPickupStatus) {
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.ppxfxbqfkf(((State) jlmebxxoox()).getDeliveryPhone()));
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.lqeggnwhkg(orderPickupStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(OrderPickupStatus orderPickupStatus) {
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.wkgbmnqykc(((State) jlmebxxoox()).getDeliveryPhone()));
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.lqeggnwhkg(orderPickupStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(OrderPickupStatus orderPickupStatus) {
        crxdokpmqz(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.vdvldrhtss.f98746iobyxmoadg);
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.lqeggnwhkg(orderPickupStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(OrderDetail orderDetail, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar;
        iobyxmoadg iobyxmoadgVar;
        OrderDetail orderDetail2;
        int i13;
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar2;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i14 = draadjrbmkVar.f98814pmvmpeiblj;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f98814pmvmpeiblj = i14 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object obj = draadjrbmkVar.f98810esjtqupxsv;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = draadjrbmkVar.f98814pmvmpeiblj;
        if (i15 != 0) {
            if (i15 == 1) {
                i13 = draadjrbmkVar.f98809cqumvgiudr;
                ylkuphrtabVar = (kotlin.jvm.internal.ylkuphrtab) draadjrbmkVar.f98811iwizpuwonk;
                ylkuphrtabVar2 = (kotlin.jvm.internal.ylkuphrtab) draadjrbmkVar.f98812jyumaefscl;
                orderDetail2 = (OrderDetail) draadjrbmkVar.f98815yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) draadjrbmkVar.f98816zdlpuopuiu;
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
        for (OrderProduct orderProduct : orderDetail.getBasket()) {
            if (!orderProduct.getAvailable() && !orderProduct.getReplaces().isEmpty()) {
                ylkuphrtabVar3.f60038zdlpuopuiu = true;
            }
            if (!orderProduct.getAvailable() && orderProduct.getReplaces().isEmpty()) {
                ylkuphrtabVar.f60038zdlpuopuiu = true;
            }
            if (orderProduct.getAvailable()) {
                ylkuphrtabVar4.f60038zdlpuopuiu = true;
            }
        }
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.wkgbmnqykc(ylkuphrtabVar3.f60038zdlpuopuiu, ylkuphrtabVar.f60038zdlpuopuiu, ylkuphrtabVar4.f60038zdlpuopuiu));
        if (orderDetail.getCurrentTime().length() == 0 || orderDetail.getWaitTime().length() == 0) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        int iK = k(orderDetail.getCurrentTime(), orderDetail.getWaitTime());
        draadjrbmkVar.f98816zdlpuopuiu = this;
        draadjrbmkVar.f98815yggfygwlhe = orderDetail;
        draadjrbmkVar.f98812jyumaefscl = ylkuphrtabVar3;
        draadjrbmkVar.f98811iwizpuwonk = ylkuphrtabVar;
        draadjrbmkVar.f98809cqumvgiudr = iK;
        draadjrbmkVar.f98814pmvmpeiblj = 1;
        Object objS = S(iK, draadjrbmkVar);
        if (objS == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        orderDetail2 = orderDetail;
        i13 = iK;
        ylkuphrtabVar2 = ylkuphrtabVar3;
        obj = objS;
        if (((Boolean) obj).booleanValue()) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (ylkuphrtabVar2.f60038zdlpuopuiu) {
            iobyxmoadgVar.t(i13, new agtfadlqog(iobyxmoadgVar), new wflxmlrfwp(iobyxmoadgVar));
        } else if (ylkuphrtabVar.f60038zdlpuopuiu) {
            String id2 = orderDetail2.getId();
            draadjrbmkVar.f98816zdlpuopuiu = null;
            draadjrbmkVar.f98815yggfygwlhe = null;
            draadjrbmkVar.f98812jyumaefscl = null;
            draadjrbmkVar.f98811iwizpuwonk = null;
            draadjrbmkVar.f98814pmvmpeiblj = 2;
            if (iobyxmoadgVar.U(id2, draadjrbmkVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object r(iobyxmoadg iobyxmoadgVar, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.x(i13);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(OrderStatus orderStatus, String str) {
        OrderStatus orderStatus2 = this.f98788jyumaefscl;
        OrderStatus orderStatus3 = OrderStatus.CANCEL;
        if (orderStatus2 == orderStatus3 || orderStatus2 == OrderStatus.UNDEFINED || orderStatus != orderStatus3) {
            this.f98788jyumaefscl = orderStatus;
        } else {
            this.f98788jyumaefscl = orderStatus;
            crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.lereixgezr(str));
        }
    }

    private final void t(int i13, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (i13 <= 0) {
            return;
        }
        g0();
        e0(i13, draadjrbmkVar, rgvfuqvkyqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(lg.gxszxtbevo gxszxtbevoVar) {
        ojitshcjhn ojitshcjhnVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ojitshcjhn) {
            ojitshcjhnVar = (ojitshcjhn) gxszxtbevoVar;
            int i13 = ojitshcjhnVar.f98867iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ojitshcjhnVar.f98867iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
            }
        } else {
            ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
        }
        Object objZoijcleaow = ojitshcjhnVar.f98869yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ojitshcjhnVar.f98867iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(true));
            wu0.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new wu0.zoijcleaow.iobyxmoadg(((State) jlmebxxoox()).getId());
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                wu0.zoijcleaow zoijcleaowVar = this.f98796vdvldrhtss;
                ojitshcjhnVar.f98870zdlpuopuiu = this;
                ojitshcjhnVar.f98867iwizpuwonk = 1;
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
            iobyxmoadgVar = (iobyxmoadg) ojitshcjhnVar.f98870zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((yu0.ppxfxbqfkf) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(false));
            iobyxmoadgVar.v((yu0.ppxfxbqfkf) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.O(thDxjokdxxww);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void v(yu0.ppxfxbqfkf ppxfxbqfkfVar) {
        Object istkbnxepwVar;
        boolean z13 = true;
        if (ppxfxbqfkfVar instanceof yu0.ppxfxbqfkf.iobyxmoadg) {
            istkbnxepwVar = new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.zynmafqrjb(((yu0.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).ppxfxbqfkf());
        } else if (ppxfxbqfkfVar instanceof yu0.ppxfxbqfkf.zoijcleaow) {
            yu0.ppxfxbqfkf.zoijcleaow zoijcleaowVar = (yu0.ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar;
            istkbnxepwVar = new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.jyumaefscl(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.zoijcleaow());
            z13 = false;
        } else if (ppxfxbqfkfVar instanceof yu0.ppxfxbqfkf.wkgbmnqykc) {
            istkbnxepwVar = new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.istkbnxepw(new PaymentWebArgs(((State) jlmebxxoox()).getId()));
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, yu0.ppxfxbqfkf.C3229ppxfxbqfkf.f126675iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            istkbnxepwVar = null;
        }
        if (istkbnxepwVar != null) {
            crxdokpmqz(istkbnxepwVar);
        }
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.zoijcleaow(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0115  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133 A[PHI: r5 r15
      0x0133: PHI (r5v10 ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg) = 
      (r5v8 ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg)
      (r5v11 ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.iobyxmoadg)
     binds: [B:39:0x00fd, B:44:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r15v22 java.lang.Object) = (r15v18 java.lang.Object), (r15v26 java.lang.Object) binds: [B:39:0x00fd, B:44:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(lg.gxszxtbevo gxszxtbevoVar) {
        rgvfuqvkyq rgvfuqvkyqVar;
        RateOrderPayload rateOrderPayload;
        iobyxmoadg iobyxmoadgVar;
        State state;
        State state2;
        iobyxmoadg iobyxmoadgVar2;
        Object objWkgbmnqykc;
        i01.ppxfxbqfkf ppxfxbqfkfVar;
        Object obj;
        State state3;
        iobyxmoadg iobyxmoadgVar3;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof rgvfuqvkyq) {
            rgvfuqvkyqVar = (rgvfuqvkyq) gxszxtbevoVar;
            int i13 = rgvfuqvkyqVar.f98884lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                rgvfuqvkyqVar.f98884lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar);
            }
        } else {
            rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar);
        }
        Object obj2 = rgvfuqvkyqVar.f98880cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = rgvfuqvkyqVar.f98884lereixgezr;
        if (i14 != 0) {
            if (i14 == 1) {
                rateOrderPayload = (RateOrderPayload) rgvfuqvkyqVar.f98883jyumaefscl;
                state = (State) rgvfuqvkyqVar.f98885yggfygwlhe;
                iobyxmoadg iobyxmoadgVar4 = (iobyxmoadg) rgvfuqvkyqVar.f98886zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
                iobyxmoadgVar = iobyxmoadgVar4;
            } else {
                if (i14 == 2) {
                    rateOrderPayload = (RateOrderPayload) rgvfuqvkyqVar.f98883jyumaefscl;
                    state2 = (State) rgvfuqvkyqVar.f98885yggfygwlhe;
                    iobyxmoadgVar2 = (iobyxmoadg) rgvfuqvkyqVar.f98886zdlpuopuiu;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
                    } catch (Throwable th2) {
                        th = th2;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                    }
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        ppxfxbqfkfVar = iobyxmoadgVar2.f98792ojitshcjhn;
                        rgvfuqvkyqVar.f98886zdlpuopuiu = iobyxmoadgVar2;
                        rgvfuqvkyqVar.f98885yggfygwlhe = state2;
                        rgvfuqvkyqVar.f98883jyumaefscl = rateOrderPayload;
                        rgvfuqvkyqVar.f98882iwizpuwonk = objWkgbmnqykc;
                        rgvfuqvkyqVar.f98884lereixgezr = 3;
                        if (ppxfxbqfkfVar.btonecajqb(rgvfuqvkyqVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        obj = objWkgbmnqykc;
                        state3 = state2;
                        iobyxmoadgVar3 = iobyxmoadgVar2;
                    } else {
                        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww != null) {
                            iobyxmoadgVar2.O(thDxjokdxxww);
                        }
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = rgvfuqvkyqVar.f98882iwizpuwonk;
                rateOrderPayload = (RateOrderPayload) rgvfuqvkyqVar.f98883jyumaefscl;
                state3 = (State) rgvfuqvkyqVar.f98885yggfygwlhe;
                iobyxmoadgVar3 = (iobyxmoadg) rgvfuqvkyqVar.f98886zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
            }
            k0(iobyxmoadgVar3, new AnalyticsPage.OrderCancel(state3.getId()), null, null, 6, null);
            iobyxmoadgVar3.crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.draadjrbmk(rateOrderPayload));
            iobyxmoadgVar2 = iobyxmoadgVar3;
            objWkgbmnqykc = obj;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar2.O(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj2);
        State state4 = (State) jlmebxxoox();
        rateOrderPayload = new RateOrderPayload(null, RateOrderPayload.ppxfxbqfkf.CANCEL, state4.getId(), state4.getDomainData().getDeliveryCode(), 1, null);
        t81.iobyxmoadg iobyxmoadgVar6 = this.f98799yggfygwlhe;
        s81.iobyxmoadg iobyxmoadgVar7 = s81.iobyxmoadg.f105743stevsuqkhv;
        rgvfuqvkyqVar.f98886zdlpuopuiu = this;
        rgvfuqvkyqVar.f98885yggfygwlhe = state4;
        rgvfuqvkyqVar.f98883jyumaefscl = rateOrderPayload;
        rgvfuqvkyqVar.f98884lereixgezr = 1;
        Object objPpxfxbqfkf = iobyxmoadgVar6.ppxfxbqfkf(iobyxmoadgVar7, rgvfuqvkyqVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        state = state4;
        obj2 = objPpxfxbqfkf;
        if (((Boolean) obj2).booleanValue()) {
            k0(iobyxmoadgVar, new AnalyticsPage.OrderCancel(state.getId()), null, null, 6, null);
            iobyxmoadgVar.crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.gtknphoqwx(rateOrderPayload));
        } else {
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = gg.kcexrzcfyt.f37117yggfygwlhe;
                bz0.gxszxtbevo gxszxtbevoVar2 = iobyxmoadgVar.f98782draadjrbmk;
                String id2 = ((State) iobyxmoadgVar.jlmebxxoox()).getId();
                rgvfuqvkyqVar.f98886zdlpuopuiu = iobyxmoadgVar;
                rgvfuqvkyqVar.f98885yggfygwlhe = state;
                rgvfuqvkyqVar.f98883jyumaefscl = rateOrderPayload;
                rgvfuqvkyqVar.f98884lereixgezr = 2;
                if (gxszxtbevoVar2.dxjokdxxww(id2, null, rgvfuqvkyqVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                state2 = state;
                iobyxmoadgVar2 = iobyxmoadgVar;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
                if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    ppxfxbqfkfVar = iobyxmoadgVar2.f98792ojitshcjhn;
                    rgvfuqvkyqVar.f98886zdlpuopuiu = iobyxmoadgVar2;
                    rgvfuqvkyqVar.f98885yggfygwlhe = state2;
                    rgvfuqvkyqVar.f98883jyumaefscl = rateOrderPayload;
                    rgvfuqvkyqVar.f98882iwizpuwonk = objWkgbmnqykc;
                    rgvfuqvkyqVar.f98884lereixgezr = 3;
                    if (ppxfxbqfkfVar.btonecajqb(rgvfuqvkyqVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    obj = objWkgbmnqykc;
                    state3 = state2;
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    k0(iobyxmoadgVar3, new AnalyticsPage.OrderCancel(state3.getId()), null, null, 6, null);
                    iobyxmoadgVar3.crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.draadjrbmk(rateOrderPayload));
                    iobyxmoadgVar2 = iobyxmoadgVar3;
                    objWkgbmnqykc = obj;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar2.O(thDxjokdxxww);
                    }
                } else {
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar2.O(thDxjokdxxww);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                state2 = state;
                iobyxmoadgVar2 = iobyxmoadgVar;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar9 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void x(int i13) {
        c(i13);
        if (i13 == 120) {
            a0(f98774lereixgezr, f98776pmvmpeiblj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(lg.gxszxtbevo gxszxtbevoVar) {
        auzgnhcxok auzgnhcxokVar = this.f98787iwizpuwonk;
        if (auzgnhcxokVar == null || auzgnhcxokVar.isCancelled()) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        d0(false);
        f0();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final /* synthetic */ State yzdjzghtvl(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(lg.gxszxtbevo gxszxtbevoVar) {
        vdvldrhtss vdvldrhtssVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof vdvldrhtss) {
            vdvldrhtssVar = (vdvldrhtss) gxszxtbevoVar;
            int i13 = vdvldrhtssVar.f98887iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vdvldrhtssVar.f98887iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar);
            }
        } else {
            vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar);
        }
        Object obj = vdvldrhtssVar.f98889yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = vdvldrhtssVar.f98887iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            auzgnhcxok auzgnhcxokVar = this.f98787iwizpuwonk;
            if (auzgnhcxokVar == null || auzgnhcxokVar.isCancelled()) {
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            vdvldrhtssVar.f98890zdlpuopuiu = this;
            vdvldrhtssVar.f98887iwizpuwonk = 1;
            if (b(vdvldrhtssVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) vdvldrhtssVar.f98890zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.f0();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void O(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo.C2360gxszxtbevo(false));
        crxdokpmqz(new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.kcexrzcfyt(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(intent, this, null), 3, null);
    }

    public final int k(String currentTime, String waitTime) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(currentTime, "currentTime");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(waitTime, "waitTime");
        return (int) ChronoUnit.SECONDS.between(this.f98797wflxmlrfwp.gxszxtbevo(currentTime), this.f98797wflxmlrfwp.gxszxtbevo(waitTime));
    }
}

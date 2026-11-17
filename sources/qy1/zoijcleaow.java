package qy1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.wypolnanlu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.CartProduct;
import ru.myspar.core.domain.models.order.FutureProduct;
import ru.myspar.core.domain.models.order.Purchase;
import ru.myspar.core.domain.models.order.PurchaseFuture;
import ru.myspar.core.domain.models.order.PurchaseHistoryProduct;
import ru.myspar.core.domain.models.order.Purchases;
import ru.myspar.core.error_handler.exceptions.AvailableOnlyForPickupException;
import ru.myspar.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.purchases.impl.specific.domain.store.SpecificPurchaseArgs;
import ru.myspar.purchases.impl.specific.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final iobyxmoadg f81014ojitshcjhn = new iobyxmoadg(null);

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final int f81015rgvfuqvkyq = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private auzgnhcxok f81016agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final f20.ppxfxbqfkf f81017btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final lo.zoijcleaow f81018draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final f20.dxjokdxxww f81019dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final x20.nufgyqmvbu f81020eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final y02.iobyxmoadg f81021gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final x20.gtknphoqwx f81022gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final z10.nufgyqmvbu f81023lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final x20.iobyxmoadg f81024nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k00.iobyxmoadg f81025ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final sm.iobyxmoadg f81026wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final x20.dxjokdxxww f81027wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ int f81028cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ PurchaseHistoryProduct f81029iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f81030jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81032zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(String str, PurchaseHistoryProduct purchaseHistoryProduct, int i13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f81030jyumaefscl = str;
            this.f81029iwizpuwonk = purchaseHistoryProduct;
            this.f81028cqumvgiudr = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new agtfadlqog(this.f81030jyumaefscl, this.f81029iwizpuwonk, this.f81028cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81032zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(true));
                zoijcleaow.this.crxdokpmqz(new qy1.dxjokdxxww.C1803dxjokdxxww(this.f81030jyumaefscl, this.f81029iwizpuwonk.getName(), this.f81028cqumvgiudr, null));
                this.f81032zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(1000L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ qy1.iobyxmoadg.zoijcleaow f81033jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81035zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(qy1.iobyxmoadg.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f81033jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new btonecajqb(this.f81033jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81035zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    qy1.iobyxmoadg.zoijcleaow zoijcleaowVar2 = this.f81033jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    k00.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f81025ppxfxbqfkf;
                    String strIobyxmoadg = zoijcleaowVar2.iobyxmoadg();
                    double dPpxfxbqfkf = zoijcleaowVar2.ppxfxbqfkf();
                    MeasureType measureTypeZoijcleaow = zoijcleaowVar2.zoijcleaow();
                    boolean isFutureBasket = zoijcleaow.zeieaojujs(zoijcleaowVar).getArgs().getIsFutureBasket();
                    this.f81035zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.oxmwwwfdhm((16 & 1) != 0 ? null : null, (16 & 2) != 0 ? null : strIobyxmoadg, dPpxfxbqfkf, measureTypeZoijcleaow, (16 & 16) != 0 ? false : isFutureBasket, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((t00.ppxfxbqfkf) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar3 = zoijcleaow.this;
            qy1.iobyxmoadg.zoijcleaow zoijcleaowVar4 = this.f81033jyumaefscl;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                t00.ppxfxbqfkf ppxfxbqfkfVar = (t00.ppxfxbqfkf) objWkgbmnqykc;
                if (ppxfxbqfkfVar.ppxfxbqfkf() != null) {
                    Warning.DailyLimit dailyLimitPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
                    String message = dailyLimitPpxfxbqfkf != null ? dailyLimitPpxfxbqfkf.getMessage() : null;
                    if (message == null) {
                        message = "";
                    }
                    zoijcleaowVar3.crxdokpmqz(new qy1.dxjokdxxww.lqeggnwhkg(message));
                }
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar3.fyldjkxazc(zoijcleaowVar4, thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f81037esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f81038iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f81039jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f81040yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81041zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81038iwizpuwonk = obj;
            this.f81037esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.jrbgnlbqoe(null, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f81042iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ qy1.iobyxmoadg f81043jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81045zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(qy1.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f81043jyumaefscl = iobyxmoadgVar;
            this.f81042iwizpuwonk = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new dxjokdxxww(this.f81043jyumaefscl, this.f81042iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81045zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                qy1.iobyxmoadg iobyxmoadgVar = this.f81043jyumaefscl;
                tg.iobyxmoadg iobyxmoadgVar2 = this.f81042iwizpuwonk;
                this.f81045zdlpuopuiu = 1;
                if (zoijcleaowVar.roivzttewh(iobyxmoadgVar, true, iobyxmoadgVar2, this) == objGxszxtbevo) {
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
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f81046iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f81048yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81049zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81048yggfygwlhe = obj;
            this.f81046iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iwxlajgraz(this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ MeasureType f81050iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ CartProduct f81051jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81053zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(CartProduct cartProduct, MeasureType measureType, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f81051jyumaefscl = cartProduct;
            this.f81050iwizpuwonk = measureType;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new gtknphoqwx(this.f81051jyumaefscl, this.f81050iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81053zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    CartProduct cartProduct = this.f81051jyumaefscl;
                    MeasureType measureType = this.f81050iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    k00.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f81025ppxfxbqfkf;
                    String id2 = cartProduct.getId();
                    this.f81053zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.lmojexxdyd(id2, 0.0d, measureType, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.mhtqkkgtqm(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f81054jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81056zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f81054jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new gxszxtbevo(this.f81054jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81056zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(true));
                    String str = this.f81054jyumaefscl;
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    x20.nufgyqmvbu.iobyxmoadg iobyxmoadgVar2 = new x20.nufgyqmvbu.iobyxmoadg(str);
                    x20.nufgyqmvbu nufgyqmvbuVar = zoijcleaowVar.f81020eablkybsjg;
                    this.f81056zdlpuopuiu = 1;
                    obj = nufgyqmvbuVar.zoijcleaow(iobyxmoadgVar2, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Purchase) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                zoijcleaowVar2.ulzqkzuiru(new qy1.btonecajqb.eablkybsjg((Purchase) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.mhtqkkgtqm(thDxjokdxxww);
            }
            zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f81058yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81059zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f81059zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.mhtqkkgtqm((Throwable) this.f81058yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            kcexrzcfyt kcexrzcfytVar = zoijcleaow.this.new kcexrzcfyt(gxszxtbevoVar);
            kcexrzcfytVar.f81058yggfygwlhe = th2;
            return kcexrzcfytVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Boolean f81060iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ qy1.iobyxmoadg f81061jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81063zdlpuopuiu;

        public /* synthetic */ class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f81064iobyxmoadg;

            static {
                int[] iArr = new int[g10.iobyxmoadg.values().length];
                try {
                    iArr[g10.iobyxmoadg.COMPILATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g10.iobyxmoadg.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g10.iobyxmoadg.SHOW_ONLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f81064iobyxmoadg = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(qy1.iobyxmoadg iobyxmoadgVar, Boolean bool, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f81061jyumaefscl = iobyxmoadgVar;
            this.f81060iwizpuwonk = bool;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn cqumvgiudr(zoijcleaow zoijcleaowVar) {
            zoijcleaowVar.fmlbqenlif();
            zoijcleaowVar.f81016agtfadlqog = null;
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn jyumaefscl(zoijcleaow zoijcleaowVar) {
            zoijcleaowVar.nuxfzjnpeb();
            zoijcleaowVar.f81016agtfadlqog = null;
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn yggfygwlhe(zoijcleaow zoijcleaowVar, qy1.iobyxmoadg iobyxmoadgVar) {
            zoijcleaowVar.tbqsvytpvh((qy1.iobyxmoadg.zoijcleaow) iobyxmoadgVar);
            zoijcleaowVar.f81016agtfadlqog = null;
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new lqeggnwhkg(this.f81061jyumaefscl, this.f81060iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            boolean z13;
            boolean z14;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81063zdlpuopuiu;
            boolean zBooleanValue = true;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                State stateZeieaojujs = zoijcleaow.zeieaojujs(zoijcleaow.this);
                qy1.iobyxmoadg iobyxmoadgVar = this.f81061jyumaefscl;
                if (iobyxmoadgVar instanceof qy1.iobyxmoadg.zoijcleaow) {
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    Boolean bool = this.f81060iwizpuwonk;
                    boolean zBooleanValue2 = bool != null ? bool.booleanValue() : ((qy1.iobyxmoadg.zoijcleaow) iobyxmoadgVar).wkgbmnqykc();
                    final zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
                    final qy1.iobyxmoadg iobyxmoadgVar2 = this.f81061jyumaefscl;
                    tg.iobyxmoadg iobyxmoadgVar3 = new tg.iobyxmoadg() { // from class: qy1.ppxfxbqfkf
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return zoijcleaow.lqeggnwhkg.yggfygwlhe(zoijcleaowVar2, iobyxmoadgVar2);
                        }
                    };
                    this.f81063zdlpuopuiu = 1;
                    if (zoijcleaowVar.roivzttewh(iobyxmoadgVar, zBooleanValue2, iobyxmoadgVar3, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(iobyxmoadgVar instanceof qy1.iobyxmoadg.C1804iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i14 = iobyxmoadg.f81064iobyxmoadg[zoijcleaow.zeieaojujs(zoijcleaow.this).getArgs().getFlow().ordinal()];
                    if (i14 == 1) {
                        PurchaseFuture futurePurchases = stateZeieaojujs.getFuturePurchases();
                        if (futurePurchases == null) {
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        List basket = futurePurchases.getBasket();
                        if (basket != null && basket.isEmpty()) {
                            z13 = false;
                            break;
                        }
                        Iterator it = basket.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z13 = false;
                                break;
                            }
                            if (((FutureProduct) it.next()).getIsOnlyPickup()) {
                                z13 = true;
                                break;
                            }
                        }
                        zoijcleaow zoijcleaowVar3 = zoijcleaow.this;
                        qy1.iobyxmoadg.C1804iobyxmoadg c1804iobyxmoadg = qy1.iobyxmoadg.C1804iobyxmoadg.f80995iobyxmoadg;
                        Boolean bool2 = this.f81060iwizpuwonk;
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        } else if (!z13) {
                            zBooleanValue = false;
                        }
                        final zoijcleaow zoijcleaowVar4 = zoijcleaow.this;
                        tg.iobyxmoadg iobyxmoadgVar4 = new tg.iobyxmoadg() { // from class: qy1.wkgbmnqykc
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return zoijcleaow.lqeggnwhkg.jyumaefscl(zoijcleaowVar4);
                            }
                        };
                        this.f81063zdlpuopuiu = 2;
                        if (zoijcleaowVar3.roivzttewh(c1804iobyxmoadg, zBooleanValue, iobyxmoadgVar4, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i14 != 2 && i14 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Purchase purchase = stateZeieaojujs.getPurchase();
                        List basket2 = purchase != null ? purchase.getBasket() : null;
                        if (basket2 == null) {
                            basket2 = jyumaefscl.wflxmlrfwp();
                        }
                        if (basket2 != null && basket2.isEmpty()) {
                            z14 = false;
                            break;
                        }
                        Iterator it2 = basket2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z14 = false;
                                break;
                            }
                            if (((PurchaseHistoryProduct) it2.next()).getIsOnlyPickup()) {
                                z14 = true;
                                break;
                            }
                        }
                        zoijcleaow zoijcleaowVar5 = zoijcleaow.this;
                        qy1.iobyxmoadg.C1804iobyxmoadg c1804iobyxmoadg2 = qy1.iobyxmoadg.C1804iobyxmoadg.f80995iobyxmoadg;
                        Boolean bool3 = this.f81060iwizpuwonk;
                        if (bool3 != null) {
                            zBooleanValue = bool3.booleanValue();
                        } else if (!z14) {
                            zBooleanValue = false;
                        }
                        final zoijcleaow zoijcleaowVar6 = zoijcleaow.this;
                        tg.iobyxmoadg iobyxmoadgVar5 = new tg.iobyxmoadg() { // from class: qy1.eablkybsjg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return zoijcleaow.lqeggnwhkg.cqumvgiudr(zoijcleaowVar6);
                            }
                        };
                        this.f81063zdlpuopuiu = 3;
                        if (zoijcleaowVar5.roivzttewh(c1804iobyxmoadg2, zBooleanValue, iobyxmoadgVar5, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
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
        final /* synthetic */ qy1.iobyxmoadg f81065jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81067zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(qy1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f81065jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new nufgyqmvbu(this.f81065jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81067zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    f20.ppxfxbqfkf ppxfxbqfkfVar = zoijcleaowVar.f81017btonecajqb;
                    f20.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new f20.ppxfxbqfkf.iobyxmoadg(zoijcleaow.zeieaojujs(zoijcleaowVar).getCartPartnerCode());
                    this.f81067zdlpuopuiu = 1;
                    obj = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar2, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            qy1.iobyxmoadg iobyxmoadgVar4 = this.f81065jyumaefscl;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                zoijcleaow.lxfrhoxuzk(zoijcleaowVar2, iobyxmoadgVar4, null, 2, null);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.mhtqkkgtqm(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81069zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f81070jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f81071yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f81072zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f81070jyumaefscl = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f81072zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                this.f81070jyumaefscl.mhtqkkgtqm((Throwable) this.f81071yggfygwlhe);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f81070jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f81071yggfygwlhe = th2;
                return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: qy1.zoijcleaow$ojitshcjhn$zoijcleaow, reason: collision with other inner class name */
        /* synthetic */ class C1806zoijcleaow implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f81073zdlpuopuiu;

            C1806zoijcleaow(zoijcleaow zoijcleaowVar) {
                this.f81073zdlpuopuiu = zoijcleaowVar;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                    return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
                }
                return false;
            }

            public final int hashCode() {
                return zoijcleaow().hashCode();
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public final Object emit(t00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objKcexrzcfyt = ojitshcjhn.kcexrzcfyt(this.f81073zdlpuopuiu, eablkybsjgVar, gxszxtbevoVar);
                return objKcexrzcfyt == mg.zoijcleaow.gxszxtbevo() ? objKcexrzcfyt : wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // kotlin.jvm.internal.agtfadlqog
            public final gg.dxjokdxxww zoijcleaow() {
                return new kotlin.jvm.internal.iobyxmoadg(2, this.f81073zdlpuopuiu, zoijcleaow.class, "processCartState", "processCartState(Lru/myspar/core/domain/models/cart/CartState;)V", 4);
            }
        }

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object kcexrzcfyt(zoijcleaow zoijcleaowVar, t00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaowVar.ipoelvxyzq(eablkybsjgVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ojitshcjhn(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81069zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo(zoijcleaow.this.f81019dxjokdxxww.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new iobyxmoadg(zoijcleaow.this, null));
                C1806zoijcleaow c1806zoijcleaow = new C1806zoijcleaow(zoijcleaow.this);
                this.f81069zdlpuopuiu = 1;
                if (lqeggnwhkgVarGxszxtbevo.collect(c1806zoijcleaow, this) == objGxszxtbevo) {
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
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81075zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new oxmwwwfdhm(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81075zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                this.f81075zdlpuopuiu = 1;
                if (zoijcleaowVar.iwxlajgraz(this) == objGxszxtbevo) {
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
        public final Object invoke(y00.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ qy1.iobyxmoadg.zoijcleaow f81076jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81078zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(qy1.iobyxmoadg.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f81076jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ppxfxbqfkf(this.f81076jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            List basket;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81078zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(true));
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    k00.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f81025ppxfxbqfkf;
                    this.f81078zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.pmvmpeiblj(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            CartProduct cartProduct = null;
            Object obj2 = null;
            cartProduct = null;
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            Cart cart = (Cart) objWkgbmnqykc;
            if (cart != null && (basket = cart.getBasket()) != null) {
                qy1.iobyxmoadg.zoijcleaow zoijcleaowVar2 = this.f81076jyumaefscl;
                for (Object obj3 : basket) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) obj3).getArticle(), zoijcleaowVar2.iobyxmoadg())) {
                        obj2 = obj3;
                        break;
                    }
                }
                cartProduct = (CartProduct) obj2;
            }
            if (cartProduct != null) {
                zoijcleaow.this.grlcpdaxtj(cartProduct, this.f81076jyumaefscl.zoijcleaow());
            } else {
                zoijcleaow.this.ageimvtcrz(this.f81076jyumaefscl);
            }
            zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class rgvfuqvkyq implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f81079yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f81080zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f81081yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f81082zdlpuopuiu;

            /* JADX INFO: renamed from: qy1.zoijcleaow$rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1807iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f81084yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f81085zdlpuopuiu;

                public C1807iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f81085zdlpuopuiu = obj;
                    this.f81084yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f81082zdlpuopuiu = nufgyqmvbuVar;
                this.f81081yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1807iobyxmoadg c1807iobyxmoadg;
                if (gxszxtbevoVar instanceof C1807iobyxmoadg) {
                    c1807iobyxmoadg = (C1807iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1807iobyxmoadg.f81084yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1807iobyxmoadg.f81084yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1807iobyxmoadg = new C1807iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1807iobyxmoadg = new C1807iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1807iobyxmoadg.f81085zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1807iobyxmoadg.f81084yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f81082zdlpuopuiu;
                    y02.iobyxmoadg.C3119iobyxmoadg c3119iobyxmoadg = (y02.iobyxmoadg.C3119iobyxmoadg) obj;
                    Purchase purchase = zoijcleaow.zeieaojujs(this.f81081yggfygwlhe).getPurchase();
                    List basket = purchase != null ? purchase.getBasket() : null;
                    if (basket == null) {
                        basket = jyumaefscl.wflxmlrfwp();
                    }
                    if (basket == null || !basket.isEmpty()) {
                        Iterator it = basket.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PurchaseHistoryProduct) it.next()).getArticle(), c3119iobyxmoadg.iobyxmoadg())) {
                                c1807iobyxmoadg.f81084yggfygwlhe = 1;
                                if (nufgyqmvbuVar.emit(obj, c1807iobyxmoadg) != objGxszxtbevo) {
                                    break;
                                }
                                return objGxszxtbevo;
                            }
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

        public rgvfuqvkyq(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f81080zdlpuopuiu = lqeggnwhkgVar;
            this.f81079yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f81080zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f81079yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81087zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new vdvldrhtss(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f81087zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            zoijcleaowVar.dvvnrvtcbc(zoijcleaow.zeieaojujs(zoijcleaowVar).getArgs().getOrderId());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y02.iobyxmoadg.C3119iobyxmoadg c3119iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(c3119iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f81089iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f81090jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f81091yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81092zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ String f81093jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f81094yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f81095zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, String str, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f81094yggfygwlhe = zoijcleaowVar;
                this.f81093jyumaefscl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f81094yggfygwlhe, this.f81093jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f81095zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.a(this.f81094yggfygwlhe, new AnalyticsPage.PurchaseSuccessRetry(this.f81093jyumaefscl), null, 2, null);
                this.f81094yggfygwlhe.crxdokpmqz(qy1.dxjokdxxww.zoijcleaow.f80991iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new wflxmlrfwp(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x009a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            ?? r13;
            Object obj2;
            zoijcleaow zoijcleaowVar;
            zoijcleaow zoijcleaowVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            ?? r14 = this.f81089iwizpuwonk;
            try {
                if (r14 != 0) {
                    if (r14 == 1) {
                        String str = (String) this.f81092zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                        r14 = str;
                    } else {
                        if (r14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zoijcleaowVar2 = (zoijcleaow) this.f81091yggfygwlhe;
                        obj2 = this.f81092zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    zoijcleaowVar = zoijcleaowVar2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        zoijcleaowVar.mhtqkkgtqm(thDxjokdxxww);
                    }
                    zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(true));
                String id2 = zoijcleaow.zeieaojujs(zoijcleaow.this).getId();
                zoijcleaow zoijcleaowVar3 = zoijcleaow.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                x20.gtknphoqwx gtknphoqwxVar = zoijcleaowVar3.f81022gxszxtbevo;
                x20.gtknphoqwx.iobyxmoadg iobyxmoadgVar2 = new x20.gtknphoqwx.iobyxmoadg(id2);
                this.f81092zdlpuopuiu = id2;
                this.f81089iwizpuwonk = 1;
                obj = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar2, this);
                r14 = id2;
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) obj);
                r13 = r14;
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                r13 = r14;
            }
            ?? r15 = r13;
            obj2 = objWkgbmnqykc;
            zoijcleaowVar = zoijcleaow.this;
            if (gg.kcexrzcfyt.agtfadlqog(obj2)) {
                zoijcleaowVar.ixidwrxhsl((Warning) obj2);
                iobyxmoadg iobyxmoadgVar4 = new iobyxmoadg(zoijcleaowVar, r15, null);
                this.f81092zdlpuopuiu = obj2;
                this.f81091yggfygwlhe = zoijcleaowVar;
                this.f81090jyumaefscl = obj2;
                this.f81089iwizpuwonk = 2;
                if (zoijcleaowVar.jrbgnlbqoe(iobyxmoadgVar4, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar2 = zoijcleaowVar;
                zoijcleaowVar = zoijcleaowVar2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                zoijcleaowVar.mhtqkkgtqm(thDxjokdxxww);
            }
            zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f81096cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f81098iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f81099jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f81100lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f81101yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81102zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81096cqumvgiudr = obj;
            this.f81100lereixgezr |= Integer.MIN_VALUE;
            return zoijcleaow.this.roivzttewh(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: qy1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1808zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f81104iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f81105jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f81106yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81107zdlpuopuiu;

        C1808zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new C1808zoijcleaow(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x007f  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            zoijcleaow zoijcleaowVar;
            zoijcleaow zoijcleaowVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81104iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zoijcleaowVar2 = (zoijcleaow) this.f81106yggfygwlhe;
                        obj2 = this.f81107zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    zoijcleaowVar = zoijcleaowVar2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        zoijcleaowVar.mhtqkkgtqm(thDxjokdxxww);
                    }
                    zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(true));
                zoijcleaow zoijcleaowVar3 = zoijcleaow.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                x20.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar3.f81024nufgyqmvbu;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f81104iwizpuwonk = 1;
                obj = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            obj2 = objWkgbmnqykc;
            zoijcleaowVar = zoijcleaow.this;
            if (gg.kcexrzcfyt.agtfadlqog(obj2)) {
                zoijcleaowVar.ixidwrxhsl((Warning) obj2);
                this.f81107zdlpuopuiu = obj2;
                this.f81106yggfygwlhe = zoijcleaowVar;
                this.f81105jyumaefscl = obj2;
                this.f81104iwizpuwonk = 2;
                if (zoijcleaowVar.jrbgnlbqoe(null, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar2 = zoijcleaowVar;
                zoijcleaowVar = zoijcleaowVar2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                zoijcleaowVar.mhtqkkgtqm(thDxjokdxxww);
            }
            zoijcleaow.this.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1808zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(ns.iobyxmoadg dispatchersProvider, k00.iobyxmoadg cartInteractor, x20.dxjokdxxww getPurchasesHistoryUseCase, x20.nufgyqmvbu getPurchasesHistoryDetailsUseCase, x20.gtknphoqwx repeatPurchaseUseCase, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, x20.iobyxmoadg addFutureBasketToCartUseCase, f20.dxjokdxxww subscribeToCartStateUseCase, f20.ppxfxbqfkf clearCartUseCase, y02.iobyxmoadg changeProductReviewObserver, lo.zoijcleaow analyticsTracker, sm.iobyxmoadg getUserAddressFlowInfo) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPurchasesHistoryUseCase, "getPurchasesHistoryUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPurchasesHistoryDetailsUseCase, "getPurchasesHistoryDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(repeatPurchaseUseCase, "repeatPurchaseUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addFutureBasketToCartUseCase, "addFutureBasketToCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartStateUseCase, "subscribeToCartStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductReviewObserver, "changeProductReviewObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        this.f81025ppxfxbqfkf = cartInteractor;
        this.f81027wkgbmnqykc = getPurchasesHistoryUseCase;
        this.f81020eablkybsjg = getPurchasesHistoryDetailsUseCase;
        this.f81022gxszxtbevo = repeatPurchaseUseCase;
        this.f81023lqeggnwhkg = subscribeToCurrentDeliveryDataUseCase;
        this.f81024nufgyqmvbu = addFutureBasketToCartUseCase;
        this.f81019dxjokdxxww = subscribeToCartStateUseCase;
        this.f81017btonecajqb = clearCartUseCase;
        this.f81021gtknphoqwx = changeProductReviewObserver;
        this.f81018draadjrbmk = analyticsTracker;
        this.f81026wflxmlrfwp = getUserAddressFlowInfo;
    }

    static /* synthetic */ void a(zoijcleaow zoijcleaowVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        zoijcleaowVar.krqnebusok(analyticsPage, analyticElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok ageimvtcrz(qy1.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new btonecajqb(zoijcleaowVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok dvvnrvtcbc(String str) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(str, null), 3, null);
    }

    private final void eslsurpljm() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f81023lqeggnwhkg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new oxmwwwfdhm(null)), new kcexrzcfyt(null)), sopmlzcsov());
    }

    private final void ezmngbhpjk(String str, int i13) {
        Purchase purchase = ((State) jlmebxxoox()).getPurchase();
        Object obj = null;
        List basket = purchase != null ? purchase.getBasket() : null;
        if (basket == null) {
            basket = jyumaefscl.wflxmlrfwp();
        }
        for (Object obj2 : basket) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PurchaseHistoryProduct) obj2).getArticle(), str)) {
                obj = obj2;
                break;
            }
        }
        PurchaseHistoryProduct purchaseHistoryProduct = (PurchaseHistoryProduct) obj;
        if (purchaseHistoryProduct == null) {
            return;
        }
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new agtfadlqog(str, purchaseHistoryProduct, i13, null), 3, null);
    }

    private final void fiwbwshyhd(boolean z13, qy1.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
        if (this.f81016agtfadlqog != null) {
            this.f81016agtfadlqog = null;
        } else {
            this.f81016agtfadlqog = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, wypolnanlu.LAZY, new dxjokdxxww(iobyxmoadgVar, iobyxmoadgVar2, null), 1, null);
            crxdokpmqz(new qy1.dxjokdxxww.ppxfxbqfkf(z13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok fmlbqenlif() {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wflxmlrfwp(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fyldjkxazc(qy1.iobyxmoadg iobyxmoadgVar, Throwable th2) {
        if (th2 instanceof AvailableOnlyForPickupException) {
            crxdokpmqz(new qy1.dxjokdxxww.gxszxtbevo(iobyxmoadgVar, ((AvailableOnlyForPickupException) th2).getMessage()));
        } else {
            mhtqkkgtqm(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok grlcpdaxtj(CartProduct cartProduct, MeasureType measureType) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(cartProduct, measureType, null), 3, null);
    }

    private final void hszhottldk(qy1.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(iobyxmoadgVar, null), 3, null);
    }

    private final void igdgnonuha(qy1.iobyxmoadg iobyxmoadgVar, Boolean bool) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(iobyxmoadgVar, bool, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ipoelvxyzq(t00.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof t00.eablkybsjg.iobyxmoadg) {
            ulzqkzuiru(qy1.btonecajqb.iobyxmoadg.f80976iobyxmoadg);
            this.f81016agtfadlqog = null;
        } else {
            if (!(eablkybsjgVar instanceof t00.eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            ulzqkzuiru(new qy1.btonecajqb.zoijcleaow(((t00.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
            auzgnhcxok auzgnhcxokVar = this.f81016agtfadlqog;
            if (auzgnhcxokVar != null) {
                auzgnhcxokVar.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iwxlajgraz(lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f81046iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f81046iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f81048yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f81046iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(true));
            x20.dxjokdxxww.iobyxmoadg iobyxmoadgVar = new x20.dxjokdxxww.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(1));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                x20.dxjokdxxww dxjokdxxwwVar = this.f81027wkgbmnqykc;
                eablkybsjgVar.f81049zdlpuopuiu = this;
                eablkybsjgVar.f81046iwizpuwonk = 1;
                objZoijcleaow = dxjokdxxwwVar.zoijcleaow(iobyxmoadgVar, eablkybsjgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) eablkybsjgVar.f81049zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Purchases) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            zoijcleaowVar.ulzqkzuiru(new qy1.btonecajqb.wkgbmnqykc(((Purchases) objWkgbmnqykc).getFuture()));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.mhtqkkgtqm(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ixidwrxhsl(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new qy1.dxjokdxxww.nufgyqmvbu(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jrbgnlbqoe(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar2;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        Object obj;
        zoijcleaow zoijcleaowVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar2 = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar2.f81037esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar2.f81037esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar2 = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar2 = new draadjrbmk(gxszxtbevoVar);
        }
        Object objYadqdtsiqt = draadjrbmkVar2.f81038iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar2.f81037esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                draadjrbmkVar = (tg.draadjrbmk) draadjrbmkVar2.f81040yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) draadjrbmkVar2.f81041zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(objYadqdtsiqt);
                } catch (Throwable th2) {
                    th = th2;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = draadjrbmkVar2.f81040yggfygwlhe;
                zoijcleaowVar2 = (zoijcleaow) draadjrbmkVar2.f81041zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objYadqdtsiqt);
            }
            zoijcleaowVar = zoijcleaowVar2;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                zoijcleaowVar.mhtqkkgtqm(thDxjokdxxww);
            }
            zoijcleaowVar.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objYadqdtsiqt);
        ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(true));
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            k00.iobyxmoadg iobyxmoadgVar3 = this.f81025ppxfxbqfkf;
            draadjrbmkVar2.f81041zdlpuopuiu = this;
            draadjrbmkVar2.f81040yggfygwlhe = draadjrbmkVar;
            draadjrbmkVar2.f81037esjtqupxsv = 1;
            objYadqdtsiqt = k00.iobyxmoadg.yadqdtsiqt(iobyxmoadgVar3, false, draadjrbmkVar2, 1, null);
            if (objYadqdtsiqt == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } catch (Throwable th3) {
            th = th3;
            zoijcleaowVar = this;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(((Cart) objYadqdtsiqt).getWarning());
        Object obj2 = objWkgbmnqykc;
        tg.draadjrbmk draadjrbmkVar3 = draadjrbmkVar;
        obj = obj2;
        if (gg.kcexrzcfyt.agtfadlqog(obj)) {
            Warning warning = (Warning) obj;
            if (warning instanceof Warning.WithCodeAndMessage) {
                zoijcleaowVar.crxdokpmqz(new qy1.dxjokdxxww.nufgyqmvbu(((Warning.WithCodeAndMessage) warning).getMessage()));
            } else if (warning instanceof Warning.DailyLimit) {
                zoijcleaowVar.crxdokpmqz(new qy1.dxjokdxxww.lqeggnwhkg(((Warning.DailyLimit) warning).getMessage()));
            }
            if (draadjrbmkVar3 != null) {
                draadjrbmkVar2.f81041zdlpuopuiu = zoijcleaowVar;
                draadjrbmkVar2.f81040yggfygwlhe = obj;
                draadjrbmkVar2.f81039jyumaefscl = obj;
                draadjrbmkVar2.f81037esjtqupxsv = 2;
                if (draadjrbmkVar3.invoke(draadjrbmkVar2) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar2 = zoijcleaowVar;
                zoijcleaowVar = zoijcleaowVar2;
            }
        }
        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.mhtqkkgtqm(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void krqnebusok(AnalyticsPage analyticsPage, AnalyticElement analyticElement) {
        this.f81018draadjrbmk.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(new AnalyticsPage.PurchaseDetail(((State) jlmebxxoox()).getId()), analyticsPage, null, analyticElement, null, 20, null)));
    }

    static /* synthetic */ void lxfrhoxuzk(zoijcleaow zoijcleaowVar, qy1.iobyxmoadg iobyxmoadgVar, Boolean bool, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            bool = null;
        }
        zoijcleaowVar.igdgnonuha(iobyxmoadgVar, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok nuxfzjnpeb() {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1808zoijcleaow(null), 3, null);
    }

    private final void rhgxfdycjh() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object roivzttewh(qy1.iobyxmoadg iobyxmoadgVar, boolean z13, tg.iobyxmoadg iobyxmoadgVar2, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f81100lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f81100lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f81096cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f81100lereixgezr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            sm.iobyxmoadg iobyxmoadgVar3 = this.f81026wflxmlrfwp;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            wkgbmnqykcVar.f81102zdlpuopuiu = this;
            wkgbmnqykcVar.f81101yggfygwlhe = iobyxmoadgVar;
            wkgbmnqykcVar.f81099jyumaefscl = iobyxmoadgVar2;
            wkgbmnqykcVar.f81098iwizpuwonk = z13;
            wkgbmnqykcVar.f81100lereixgezr = 1;
            objZoijcleaow = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, wkgbmnqykcVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = wkgbmnqykcVar.f81098iwizpuwonk;
            iobyxmoadgVar2 = (tg.iobyxmoadg) wkgbmnqykcVar.f81099jyumaefscl;
            iobyxmoadgVar = (qy1.iobyxmoadg) wkgbmnqykcVar.f81101yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f81102zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        sm.iobyxmoadg.C2644iobyxmoadg c2644iobyxmoadg = (sm.iobyxmoadg.C2644iobyxmoadg) objZoijcleaow;
        if (c2644iobyxmoadg.iobyxmoadg() == rm.zoijcleaow.Delivery && z13) {
            zoijcleaowVar.fiwbwshyhd(c2644iobyxmoadg.zoijcleaow(), iobyxmoadgVar, iobyxmoadgVar2);
        } else {
            iobyxmoadgVar2.invoke();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void skhdrjzrfn() {
        rhgxfdycjh();
        yzdjzghtvl();
        SpecificPurchaseArgs args = ((State) jlmebxxoox()).getArgs();
        if (args.gxszxtbevo()) {
            dvvnrvtcbc(args.getOrderId());
        } else {
            eslsurpljm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok tbqsvytpvh(qy1.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(zoijcleaowVar, null), 3, null);
    }

    private final void wizcaqwiak(qy1.iobyxmoadg iobyxmoadgVar) {
        igdgnonuha(iobyxmoadgVar, Boolean.TRUE);
    }

    private final void yzdjzghtvl() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new rgvfuqvkyq(this.f81021gtknphoqwx.btonecajqb(), this), new vdvldrhtss(null)), sopmlzcsov());
    }

    public static final /* synthetic */ State zeieaojujs(zoijcleaow zoijcleaowVar) {
        return (State) zoijcleaowVar.jlmebxxoox();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: auzgnhcxok, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(qy1.nufgyqmvbu intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, qy1.nufgyqmvbu.wkgbmnqykc.f81009iobyxmoadg)) {
            crxdokpmqz(qy1.dxjokdxxww.iobyxmoadg.f80986iobyxmoadg);
            return;
        }
        if (intent instanceof qy1.nufgyqmvbu.zoijcleaow) {
            lxfrhoxuzk(this, ((qy1.nufgyqmvbu.zoijcleaow) intent).iobyxmoadg(), null, 2, null);
            return;
        }
        if (intent instanceof qy1.nufgyqmvbu.eablkybsjg) {
            hszhottldk(((qy1.nufgyqmvbu.eablkybsjg) intent).iobyxmoadg());
            return;
        }
        if (!(intent instanceof qy1.nufgyqmvbu.iobyxmoadg)) {
            if (!(intent instanceof qy1.nufgyqmvbu.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            wizcaqwiak(((qy1.nufgyqmvbu.ppxfxbqfkf) intent).iobyxmoadg());
            return;
        }
        if (((State) jlmebxxoox()).getIsLoading()) {
            return;
        }
        qy1.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = (qy1.nufgyqmvbu.iobyxmoadg) intent;
        if (iobyxmoadgVar instanceof qy1.nufgyqmvbu.iobyxmoadg.C1805iobyxmoadg) {
            qy1.nufgyqmvbu.iobyxmoadg.C1805iobyxmoadg c1805iobyxmoadg = (qy1.nufgyqmvbu.iobyxmoadg.C1805iobyxmoadg) intent;
            krqnebusok(new AnalyticsPage.ItemDetail(c1805iobyxmoadg.zoijcleaow().getId(), c1805iobyxmoadg.zoijcleaow().getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String()), c1805iobyxmoadg.zoijcleaow());
            crxdokpmqz(new qy1.dxjokdxxww.wkgbmnqykc(c1805iobyxmoadg.iobyxmoadg()));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, qy1.nufgyqmvbu.iobyxmoadg.zoijcleaow.f81007iobyxmoadg)) {
            lxfrhoxuzk(this, qy1.iobyxmoadg.C1804iobyxmoadg.f80995iobyxmoadg, null, 2, null);
        } else {
            if (!(iobyxmoadgVar instanceof qy1.nufgyqmvbu.iobyxmoadg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            qy1.nufgyqmvbu.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = (qy1.nufgyqmvbu.iobyxmoadg.ppxfxbqfkf) intent;
            ezmngbhpjk(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
        }
    }

    public final void mhtqkkgtqm(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new qy1.btonecajqb.ppxfxbqfkf(false));
        if (error instanceof ProductDailyLimitException) {
            crxdokpmqz(new qy1.dxjokdxxww.lqeggnwhkg(((ProductDailyLimitException) error).getMessage()));
        } else {
            crxdokpmqz(new qy1.dxjokdxxww.eablkybsjg(error));
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: uawqvzlxes, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(qy1.lqeggnwhkg action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, qy1.lqeggnwhkg.iobyxmoadg.f81001iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        skhdrjzrfn();
    }
}

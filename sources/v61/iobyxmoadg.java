package v61;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.esjtqupxsv;
import p01.dxjokdxxww;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.IntervalInfo;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantProductDetails;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.domain.feature.specificrestaurantproduct.store.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final dxjokdxxww f116212eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cz0.iobyxmoadg f116213gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private auzgnhcxok f116214lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final esjtqupxsv f116215ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final m11.zoijcleaow f116216wkgbmnqykc;

    /* synthetic */ class eablkybsjg extends kotlin.jvm.internal.iobyxmoadg implements rgvfuqvkyq {
        eablkybsjg(Object obj) {
            super(2, obj, iobyxmoadg.class, "processCartState", "processCartState(Lru/myspar/proloyalty/core/domain/models/cart/CartState;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.uawqvzlxes((iobyxmoadg) this.f60022zdlpuopuiu, eablkybsjgVar, gxszxtbevoVar);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f116218yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116219zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f116219zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.zeieaojujs((Throwable) this.f116218yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = iobyxmoadg.this.new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f116218yggfygwlhe = th2;
            return gxszxtbevoVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: v61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2891iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f116220iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f116222yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f116223zdlpuopuiu;

        C2891iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116222yggfygwlhe = obj;
            this.f116220iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.uwvvkdfqfp(this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f116224jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ v61.wkgbmnqykc f116225yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116226zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(v61.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116225yggfygwlhe = wkgbmnqykcVar;
            this.f116224jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f116225yggfygwlhe, this.f116224jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116226zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                v61.wkgbmnqykc wkgbmnqykcVar = this.f116225yggfygwlhe;
                if (wkgbmnqykcVar instanceof v61.wkgbmnqykc.iobyxmoadg) {
                    this.f116224jyumaefscl.bfopjjpdmp(((v61.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, v61.wkgbmnqykc.zoijcleaow.f116240iobyxmoadg)) {
                    this.f116224jyumaefscl.crxdokpmqz(v61.eablkybsjg.iobyxmoadg.f116197iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, v61.wkgbmnqykc.ppxfxbqfkf.f116238iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f116224jyumaefscl;
                    this.f116226zdlpuopuiu = 1;
                    if (iobyxmoadgVar.opjhrmiecq(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, v61.wkgbmnqykc.C2892wkgbmnqykc.f116239iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f116224jyumaefscl.ulzqkzuiru(new v61.gxszxtbevo.zoijcleaow(gz0.zoijcleaow.READY));
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f116227iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f116229yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f116230zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116229yggfygwlhe = obj;
            this.f116227iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.oipsdeybqn(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f116231jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ v61.ppxfxbqfkf f116232yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116233zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(v61.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116232yggfygwlhe = ppxfxbqfkfVar;
            this.f116231jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f116232yggfygwlhe, this.f116231jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116233zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116232yggfygwlhe, v61.ppxfxbqfkf.iobyxmoadg.f116236iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f116231jyumaefscl.roivzttewh();
                iobyxmoadg iobyxmoadgVar = this.f116231jyumaefscl;
                this.f116233zdlpuopuiu = 1;
                if (iobyxmoadgVar.oipsdeybqn(this) == objGxszxtbevo) {
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(esjtqupxsv isAuthUseCase, m11.zoijcleaow getRestaurantProductDetailsUseCase, dxjokdxxww subscribeToCartStateUseCase, cz0.iobyxmoadg cartInteractor, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRestaurantProductDetailsUseCase, "getRestaurantProductDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartStateUseCase, "subscribeToCartStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f116215ppxfxbqfkf = isAuthUseCase;
        this.f116216wkgbmnqykc = getRestaurantProductDetailsUseCase;
        this.f116212eablkybsjg = subscribeToCartStateUseCase;
        this.f116213gxszxtbevo = cartInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp(double d13) {
        ulzqkzuiru(new v61.gxszxtbevo.iobyxmoadg(d13));
    }

    private final void iyctptxqzt() {
        ulzqkzuiru(v61.gxszxtbevo.C2890gxszxtbevo.f116202iobyxmoadg);
    }

    private final void lrnfpwlwnk(Cart cart) {
        DeliveryCode deliveryCodeDxjokdxxww = cart.dxjokdxxww();
        List basket = cart.getBasket();
        String partnerCode = cart.getPartnerCode();
        IntervalInfo intervalInfo = cart.getIntervalInfo();
        ulzqkzuiru(new v61.gxszxtbevo.ppxfxbqfkf(deliveryCodeDxjokdxxww, basket, partnerCode, intervalInfo != null ? intervalInfo.getDate() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nuxfzjnpeb() {
        crxdokpmqz(v61.eablkybsjg.wkgbmnqykc.f116199iobyxmoadg);
        ulzqkzuiru(new v61.gxszxtbevo.iobyxmoadg(1.0d));
        tbqsvytpvh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object oipsdeybqn(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f116227iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f116227iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f116229yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f116227iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            State state = (State) jlmebxxoox();
            ulzqkzuiru(new v61.gxszxtbevo.eablkybsjg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                m11.zoijcleaow zoijcleaowVar = this.f116216wkgbmnqykc;
                m11.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new m11.zoijcleaow.iobyxmoadg(state.getPartnerCode(), state.getArticle());
                wkgbmnqykcVar.f116230zdlpuopuiu = this;
                wkgbmnqykcVar.f116227iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar3, wkgbmnqykcVar);
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
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f116230zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((RestaurantProductDetails) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.zfvoamnweg((RestaurantProductDetails) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.zeieaojujs(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object opjhrmiecq(lg.gxszxtbevo gxszxtbevoVar) {
        esjtqupxsv esjtqupxsvVar = this.f116215ppxfxbqfkf;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        if (!((Boolean) esjtqupxsvVar.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
            crxdokpmqz(v61.eablkybsjg.zoijcleaow.f116200iobyxmoadg);
            yfnezrywwk();
            return wwaezpbzknVar;
        }
        if (this.f116214lqeggnwhkg == null) {
            ulzqkzuiru(new v61.gxszxtbevo.zoijcleaow(gz0.zoijcleaow.PROGRESS));
        }
        Object objUwvvkdfqfp = uwvvkdfqfp(gxszxtbevoVar);
        return objUwvvkdfqfp == mg.zoijcleaow.gxszxtbevo() ? objUwvvkdfqfp : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void roivzttewh() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f116212eablkybsjg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new eablkybsjg(this)), new gxszxtbevo(null)), sopmlzcsov());
    }

    private final void tbqsvytpvh() {
        ulzqkzuiru(new v61.gxszxtbevo.nufgyqmvbu(((State) jlmebxxoox()).getProductDetails().getMeasureTypeModel().getCurrentMeasure()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object uawqvzlxes(iobyxmoadg iobyxmoadgVar, kz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.weqkydbzbr(eablkybsjgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object uwvvkdfqfp(lg.gxszxtbevo gxszxtbevoVar) {
        C2891iobyxmoadg c2891iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C2891iobyxmoadg) {
            c2891iobyxmoadg = (C2891iobyxmoadg) gxszxtbevoVar;
            int i13 = c2891iobyxmoadg.f116220iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2891iobyxmoadg.f116220iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2891iobyxmoadg = new C2891iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2891iobyxmoadg = new C2891iobyxmoadg(gxszxtbevoVar);
        }
        C2891iobyxmoadg c2891iobyxmoadg2 = c2891iobyxmoadg;
        Object objOjitshcjhn = c2891iobyxmoadg2.f116222yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2891iobyxmoadg2.f116220iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objOjitshcjhn);
            State state = (State) jlmebxxoox();
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                cz0.iobyxmoadg iobyxmoadgVar3 = this.f116213gxszxtbevo;
                String id2 = state.getProductDetails().getId();
                double currentAmount = state.getCurrentAmount();
                MeasureType currentMeasure = state.getProductDetails().getMeasureTypeModel().getCurrentMeasure();
                c2891iobyxmoadg2.f116223zdlpuopuiu = this;
                c2891iobyxmoadg2.f116220iwizpuwonk = 1;
                objOjitshcjhn = iobyxmoadgVar3.ojitshcjhn((16 & 1) != 0 ? null : id2, (16 & 2) != 0 ? null : null, currentAmount, currentMeasure, (16 & 16) != 0 ? false : false, c2891iobyxmoadg2);
                if (objOjitshcjhn == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) c2891iobyxmoadg2.f116223zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objOjitshcjhn);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((kz0.ppxfxbqfkf) objOjitshcjhn);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.nuxfzjnpeb();
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.zeieaojujs(thDxjokdxxww);
        }
        iobyxmoadgVar.yfnezrywwk();
        iobyxmoadgVar.f116214lqeggnwhkg = null;
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void weqkydbzbr(kz0.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof kz0.eablkybsjg.iobyxmoadg) {
            iyctptxqzt();
        } else {
            if (!(eablkybsjgVar instanceof kz0.eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            lrnfpwlwnk(((kz0.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
        }
    }

    private final void yfnezrywwk() {
        ulzqkzuiru(new v61.gxszxtbevo.zoijcleaow(gz0.zoijcleaow.READY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg(RestaurantProductDetails restaurantProductDetails) {
        ulzqkzuiru(new v61.gxszxtbevo.lqeggnwhkg(restaurantProductDetails));
        tbqsvytpvh();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(v61.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(v61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }

    public final void zeieaojujs(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new v61.gxszxtbevo.eablkybsjg(false));
        crxdokpmqz(new v61.eablkybsjg.ppxfxbqfkf(error));
    }
}

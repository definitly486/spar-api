package l80;

import f20.dxjokdxxww;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.IntervalInfo;
import ru.myspar.core.domain.models.restaurants.RestaurantProductDetails;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.domain.feature.specificrestaurantproduct.store.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final dxjokdxxww f61868eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final k00.iobyxmoadg f61869gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private auzgnhcxok f61870lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final c20.eablkybsjg f61871ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final g30.zoijcleaow f61872wkgbmnqykc;

    /* synthetic */ class eablkybsjg extends kotlin.jvm.internal.iobyxmoadg implements rgvfuqvkyq {
        eablkybsjg(Object obj) {
            super(2, obj, iobyxmoadg.class, "processCartState", "processCartState(Lru/myspar/core/domain/models/cart/CartState;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.uawqvzlxes((iobyxmoadg) this.f60022zdlpuopuiu, eablkybsjgVar, gxszxtbevoVar);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f61874yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61875zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f61875zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.zeieaojujs((Throwable) this.f61874yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = iobyxmoadg.this.new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f61874yggfygwlhe = th2;
            return gxszxtbevoVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: l80.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1255iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f61876iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f61878yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f61879zdlpuopuiu;

        C1255iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f61878yggfygwlhe = obj;
            this.f61876iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.uwvvkdfqfp(this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f61880jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ l80.wkgbmnqykc f61881yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61882zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(l80.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61881yggfygwlhe = wkgbmnqykcVar;
            this.f61880jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f61881yggfygwlhe, this.f61880jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61882zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                l80.wkgbmnqykc wkgbmnqykcVar = this.f61881yggfygwlhe;
                if (wkgbmnqykcVar instanceof l80.wkgbmnqykc.iobyxmoadg) {
                    this.f61880jyumaefscl.bfopjjpdmp(((l80.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, l80.wkgbmnqykc.zoijcleaow.f61896iobyxmoadg)) {
                    this.f61880jyumaefscl.crxdokpmqz(l80.eablkybsjg.iobyxmoadg.f61853iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, l80.wkgbmnqykc.ppxfxbqfkf.f61894iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f61880jyumaefscl;
                    this.f61882zdlpuopuiu = 1;
                    if (iobyxmoadgVar.opjhrmiecq(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, l80.wkgbmnqykc.C1256wkgbmnqykc.f61895iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f61880jyumaefscl.ulzqkzuiru(new l80.gxszxtbevo.zoijcleaow(o00.zoijcleaow.READY));
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
        int f61883iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f61885yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f61886zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f61885yggfygwlhe = obj;
            this.f61883iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.oipsdeybqn(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f61887jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ l80.ppxfxbqfkf f61888yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61889zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(l80.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61888yggfygwlhe = ppxfxbqfkfVar;
            this.f61887jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f61888yggfygwlhe, this.f61887jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61889zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f61888yggfygwlhe, l80.ppxfxbqfkf.iobyxmoadg.f61892iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f61887jyumaefscl.roivzttewh();
                iobyxmoadg iobyxmoadgVar = this.f61887jyumaefscl;
                this.f61889zdlpuopuiu = 1;
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
    public iobyxmoadg(c20.eablkybsjg isLoggedInUseCase, g30.zoijcleaow getRestaurantProductDetailsUseCase, dxjokdxxww subscribeToCartStateUseCase, k00.iobyxmoadg cartInteractor, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRestaurantProductDetailsUseCase, "getRestaurantProductDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartStateUseCase, "subscribeToCartStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f61871ppxfxbqfkf = isLoggedInUseCase;
        this.f61872wkgbmnqykc = getRestaurantProductDetailsUseCase;
        this.f61868eablkybsjg = subscribeToCartStateUseCase;
        this.f61869gxszxtbevo = cartInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp(double d13) {
        ulzqkzuiru(new l80.gxszxtbevo.iobyxmoadg(d13));
    }

    private final void iyctptxqzt() {
        ulzqkzuiru(l80.gxszxtbevo.C1254gxszxtbevo.f61858iobyxmoadg);
    }

    private final void lrnfpwlwnk(Cart cart) {
        DeliveryCode deliveryCodeDxjokdxxww = cart.dxjokdxxww();
        List basket = cart.getBasket();
        String partnerCode = cart.getPartnerCode();
        IntervalInfo intervalInfo = cart.getIntervalInfo();
        ulzqkzuiru(new l80.gxszxtbevo.ppxfxbqfkf(deliveryCodeDxjokdxxww, basket, partnerCode, intervalInfo != null ? intervalInfo.getDate() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nuxfzjnpeb() {
        crxdokpmqz(l80.eablkybsjg.wkgbmnqykc.f61855iobyxmoadg);
        ulzqkzuiru(new l80.gxszxtbevo.iobyxmoadg(1.0d));
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
            int i13 = wkgbmnqykcVar.f61883iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f61883iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f61885yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f61883iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            State state = (State) jlmebxxoox();
            ulzqkzuiru(new l80.gxszxtbevo.eablkybsjg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                g30.zoijcleaow zoijcleaowVar = this.f61872wkgbmnqykc;
                g30.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new g30.zoijcleaow.iobyxmoadg(state.getPartnerCode(), state.getArticle());
                wkgbmnqykcVar.f61886zdlpuopuiu = this;
                wkgbmnqykcVar.f61883iwizpuwonk = 1;
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
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f61886zdlpuopuiu;
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
        c20.eablkybsjg eablkybsjgVar = this.f61871ppxfxbqfkf;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        if (!((Boolean) eablkybsjgVar.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
            crxdokpmqz(l80.eablkybsjg.zoijcleaow.f61856iobyxmoadg);
            yfnezrywwk();
            return wwaezpbzknVar;
        }
        if (this.f61870lqeggnwhkg == null) {
            ulzqkzuiru(new l80.gxszxtbevo.zoijcleaow(o00.zoijcleaow.PROGRESS));
        }
        Object objUwvvkdfqfp = uwvvkdfqfp(gxszxtbevoVar);
        return objUwvvkdfqfp == mg.zoijcleaow.gxszxtbevo() ? objUwvvkdfqfp : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void roivzttewh() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f61868eablkybsjg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new eablkybsjg(this)), new gxszxtbevo(null)), sopmlzcsov());
    }

    private final void tbqsvytpvh() {
        ulzqkzuiru(new l80.gxszxtbevo.nufgyqmvbu(((State) jlmebxxoox()).getProductDetails().getMeasureTypeModel().getCurrentMeasure()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object uawqvzlxes(iobyxmoadg iobyxmoadgVar, t00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.weqkydbzbr(eablkybsjgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object uwvvkdfqfp(lg.gxszxtbevo gxszxtbevoVar) {
        C1255iobyxmoadg c1255iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C1255iobyxmoadg) {
            c1255iobyxmoadg = (C1255iobyxmoadg) gxszxtbevoVar;
            int i13 = c1255iobyxmoadg.f61876iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1255iobyxmoadg.f61876iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1255iobyxmoadg = new C1255iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1255iobyxmoadg = new C1255iobyxmoadg(gxszxtbevoVar);
        }
        C1255iobyxmoadg c1255iobyxmoadg2 = c1255iobyxmoadg;
        Object objOxmwwwfdhm = c1255iobyxmoadg2.f61878yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1255iobyxmoadg2.f61876iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objOxmwwwfdhm);
            State state = (State) jlmebxxoox();
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                k00.iobyxmoadg iobyxmoadgVar3 = this.f61869gxszxtbevo;
                String id2 = state.getProductDetails().getId();
                double currentAmount = state.getCurrentAmount();
                MeasureType currentMeasure = state.getProductDetails().getMeasureTypeModel().getCurrentMeasure();
                c1255iobyxmoadg2.f61879zdlpuopuiu = this;
                c1255iobyxmoadg2.f61876iwizpuwonk = 1;
                objOxmwwwfdhm = iobyxmoadgVar3.oxmwwwfdhm((16 & 1) != 0 ? null : id2, (16 & 2) != 0 ? null : null, currentAmount, currentMeasure, (16 & 16) != 0 ? false : false, c1255iobyxmoadg2);
                if (objOxmwwwfdhm == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) c1255iobyxmoadg2.f61879zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objOxmwwwfdhm);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((t00.ppxfxbqfkf) objOxmwwwfdhm);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.nuxfzjnpeb();
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.zeieaojujs(thDxjokdxxww);
        }
        iobyxmoadgVar.yfnezrywwk();
        iobyxmoadgVar.f61870lqeggnwhkg = null;
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void weqkydbzbr(t00.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof t00.eablkybsjg.iobyxmoadg) {
            iyctptxqzt();
        } else {
            if (!(eablkybsjgVar instanceof t00.eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            lrnfpwlwnk(((t00.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
        }
    }

    private final void yfnezrywwk() {
        ulzqkzuiru(new l80.gxszxtbevo.zoijcleaow(o00.zoijcleaow.READY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg(RestaurantProductDetails restaurantProductDetails) {
        ulzqkzuiru(new l80.gxszxtbevo.lqeggnwhkg(restaurantProductDetails));
        tbqsvytpvh();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(l80.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(l80.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }

    public final void zeieaojujs(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new l80.gxszxtbevo.eablkybsjg(false));
        crxdokpmqz(new l80.eablkybsjg.ppxfxbqfkf(error));
    }
}

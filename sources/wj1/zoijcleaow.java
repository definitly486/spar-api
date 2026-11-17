package wj1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import ru.myspar.proloyalty.core.domain.models.order.Purchase;
import ru.myspar.proloyalty.core.domain.models.order.PurchaseHistoryProduct;
import ru.myspar.proloyalty.core.domain.models.order.Purchases;
import ru.myspar.proloyalty.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.purchases.impl.specific.domain.store.SpecificPurchaseArgs;
import ru.myspar.proloyalty.purchases.impl.specific.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final iobyxmoadg f120024agtfadlqog = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final int f120025ojitshcjhn = 8;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final p01.ppxfxbqfkf f120026btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final vm0.zoijcleaow f120027draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final p01.dxjokdxxww f120028dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final c11.nufgyqmvbu f120029eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final pm1.iobyxmoadg f120030gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final c11.gtknphoqwx f120031gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final m01.nufgyqmvbu f120032lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final c11.iobyxmoadg f120033nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cz0.iobyxmoadg f120034ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private auzgnhcxok f120035wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c11.dxjokdxxww f120036wkgbmnqykc;

    public static final class agtfadlqog implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f120037yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f120038zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f120039yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f120040zdlpuopuiu;

            /* JADX INFO: renamed from: wj1.zoijcleaow$agtfadlqog$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C3003iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f120042yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f120043zdlpuopuiu;

                public C3003iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f120043zdlpuopuiu = obj;
                    this.f120042yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f120040zdlpuopuiu = nufgyqmvbuVar;
                this.f120039yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C3003iobyxmoadg c3003iobyxmoadg;
                if (gxszxtbevoVar instanceof C3003iobyxmoadg) {
                    c3003iobyxmoadg = (C3003iobyxmoadg) gxszxtbevoVar;
                    int i13 = c3003iobyxmoadg.f120042yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c3003iobyxmoadg.f120042yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c3003iobyxmoadg = new C3003iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c3003iobyxmoadg = new C3003iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c3003iobyxmoadg.f120043zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c3003iobyxmoadg.f120042yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f120040zdlpuopuiu;
                    pm1.iobyxmoadg.C1703iobyxmoadg c1703iobyxmoadg = (pm1.iobyxmoadg.C1703iobyxmoadg) obj;
                    Purchase purchase = zoijcleaow.weqkydbzbr(this.f120039yggfygwlhe).getPurchase();
                    List basket = purchase != null ? purchase.getBasket() : null;
                    if (basket == null) {
                        basket = jyumaefscl.wflxmlrfwp();
                    }
                    if (basket == null || !basket.isEmpty()) {
                        Iterator it = basket.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PurchaseHistoryProduct) it.next()).getArticle(), c1703iobyxmoadg.iobyxmoadg())) {
                                c3003iobyxmoadg.f120042yggfygwlhe = 1;
                                if (nufgyqmvbuVar.emit(obj, c3003iobyxmoadg) != objGxszxtbevo) {
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

        public agtfadlqog(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f120038zdlpuopuiu = lqeggnwhkgVar;
            this.f120037yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f120038zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f120037yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f120045esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f120046iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f120047jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f120048yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f120049zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f120046iwizpuwonk = obj;
            this.f120045esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.fiwbwshyhd(null, this);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ int f120050cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ PurchaseHistoryProduct f120051iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f120052jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120054zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(String str, PurchaseHistoryProduct purchaseHistoryProduct, int i13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f120052jyumaefscl = str;
            this.f120051iwizpuwonk = purchaseHistoryProduct;
            this.f120050cqumvgiudr = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new draadjrbmk(this.f120052jyumaefscl, this.f120051iwizpuwonk, this.f120050cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f120054zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(true));
                zoijcleaow.this.crxdokpmqz(new wj1.gxszxtbevo.lqeggnwhkg(this.f120052jyumaefscl, this.f120051iwizpuwonk.getName(), this.f120050cqumvgiudr, null));
                this.f120054zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(1000L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ MeasureType f120055iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ CartProduct f120056jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120058zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(CartProduct cartProduct, MeasureType measureType, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f120056jyumaefscl = cartProduct;
            this.f120055iwizpuwonk = measureType;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new dxjokdxxww(this.f120056jyumaefscl, this.f120055iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f120058zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    CartProduct cartProduct = this.f120056jyumaefscl;
                    MeasureType measureType = this.f120055iwizpuwonk;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    cz0.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f120034ppxfxbqfkf;
                    String id2 = cartProduct.getId();
                    this.f120058zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.yadqdtsiqt(id2, 0.0d, measureType, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.wizcaqwiak(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f120059jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120061zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f120059jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new eablkybsjg(this.f120059jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f120061zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(true));
                    String str = this.f120059jyumaefscl;
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    c11.nufgyqmvbu.iobyxmoadg iobyxmoadgVar2 = new c11.nufgyqmvbu.iobyxmoadg(str);
                    c11.nufgyqmvbu nufgyqmvbuVar = zoijcleaowVar.f120029eablkybsjg;
                    this.f120061zdlpuopuiu = 1;
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
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Purchase) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                zoijcleaowVar2.ulzqkzuiru(new wj1.lqeggnwhkg.eablkybsjg((Purchase) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.wizcaqwiak(thDxjokdxxww);
            }
            zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f120063iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f120064jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f120065yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f120066zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ String f120067jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f120068yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f120069zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, String str, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f120068yggfygwlhe = zoijcleaowVar;
                this.f120067jyumaefscl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f120068yggfygwlhe, this.f120067jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f120069zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.jrbgnlbqoe(this.f120068yggfygwlhe, new AnalyticsPage.PurchaseSuccessRetry(this.f120067jyumaefscl), null, 2, null);
                this.f120068yggfygwlhe.crxdokpmqz(wj1.gxszxtbevo.zoijcleaow.f120011iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new gtknphoqwx(gxszxtbevoVar);
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
            ?? r14 = this.f120063iwizpuwonk;
            try {
                if (r14 != 0) {
                    if (r14 == 1) {
                        String str = (String) this.f120066zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                        r14 = str;
                    } else {
                        if (r14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zoijcleaowVar2 = (zoijcleaow) this.f120065yggfygwlhe;
                        obj2 = this.f120066zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    zoijcleaowVar = zoijcleaowVar2;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        zoijcleaowVar.wizcaqwiak(thDxjokdxxww);
                    }
                    zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(true));
                String id2 = zoijcleaow.weqkydbzbr(zoijcleaow.this).getId();
                zoijcleaow zoijcleaowVar3 = zoijcleaow.this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                c11.gtknphoqwx gtknphoqwxVar = zoijcleaowVar3.f120031gxszxtbevo;
                c11.gtknphoqwx.iobyxmoadg iobyxmoadgVar2 = new c11.gtknphoqwx.iobyxmoadg(id2);
                this.f120066zdlpuopuiu = id2;
                this.f120063iwizpuwonk = 1;
                obj = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar2, this);
                r14 = id2;
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Warning) obj);
                r13 = r14;
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                r13 = r14;
            }
            ?? r15 = r13;
            obj2 = objWkgbmnqykc;
            zoijcleaowVar = zoijcleaow.this;
            if (kcexrzcfyt.agtfadlqog(obj2)) {
                zoijcleaowVar.hszhottldk((Warning) obj2);
                iobyxmoadg iobyxmoadgVar4 = new iobyxmoadg(zoijcleaowVar, r15, null);
                this.f120066zdlpuopuiu = obj2;
                this.f120065yggfygwlhe = zoijcleaowVar;
                this.f120064jyumaefscl = obj2;
                this.f120063iwizpuwonk = 2;
                if (zoijcleaowVar.fiwbwshyhd(iobyxmoadgVar4, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar2 = zoijcleaowVar;
                zoijcleaowVar = zoijcleaowVar2;
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                zoijcleaowVar.wizcaqwiak(thDxjokdxxww);
            }
            zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f120070jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wj1.iobyxmoadg f120071yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120072zdlpuopuiu;

        public /* synthetic */ class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f120073iobyxmoadg;

            static {
                int[] iArr = new int[wz0.iobyxmoadg.values().length];
                try {
                    iArr[wz0.iobyxmoadg.COMPILATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[wz0.iobyxmoadg.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[wz0.iobyxmoadg.SHOW_ONLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f120073iobyxmoadg = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(wj1.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f120071yggfygwlhe = iobyxmoadgVar;
            this.f120070jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f120071yggfygwlhe, this.f120070jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f120072zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            wj1.iobyxmoadg iobyxmoadgVar = this.f120071yggfygwlhe;
            if (iobyxmoadgVar instanceof wj1.iobyxmoadg.zoijcleaow) {
                this.f120070jyumaefscl.zeieaojujs((wj1.iobyxmoadg.zoijcleaow) iobyxmoadgVar);
            } else {
                if (!(iobyxmoadgVar instanceof wj1.iobyxmoadg.C3002iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i13 = iobyxmoadg.f120073iobyxmoadg[zoijcleaow.weqkydbzbr(this.f120070jyumaefscl).getArgs().getFlow().ordinal()];
                if (i13 == 1) {
                    this.f120070jyumaefscl.lrnfpwlwnk();
                } else {
                    if (i13 != 2 && i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f120070jyumaefscl.ageimvtcrz();
                }
            }
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

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wj1.iobyxmoadg f120074jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120076zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(wj1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f120074jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new lqeggnwhkg(this.f120074jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f120076zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    p01.ppxfxbqfkf ppxfxbqfkfVar = zoijcleaowVar.f120026btonecajqb;
                    p01.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new p01.ppxfxbqfkf.iobyxmoadg(zoijcleaow.weqkydbzbr(zoijcleaowVar).getCartPartnerCode());
                    this.f120076zdlpuopuiu = 1;
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
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            wj1.iobyxmoadg iobyxmoadgVar4 = this.f120074jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                zoijcleaowVar2.iwxlajgraz(iobyxmoadgVar4);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.wizcaqwiak(thDxjokdxxww);
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
        final /* synthetic */ wj1.iobyxmoadg.zoijcleaow f120077jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120079zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(wj1.iobyxmoadg.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f120077jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new nufgyqmvbu(this.f120077jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f120079zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    wj1.iobyxmoadg.zoijcleaow zoijcleaowVar2 = this.f120077jyumaefscl;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    cz0.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f120034ppxfxbqfkf;
                    String strIobyxmoadg = zoijcleaowVar2.iobyxmoadg();
                    double dPpxfxbqfkf = zoijcleaowVar2.ppxfxbqfkf();
                    MeasureType measureTypeZoijcleaow = zoijcleaowVar2.zoijcleaow();
                    boolean isFutureBasket = zoijcleaow.weqkydbzbr(zoijcleaowVar).getArgs().getIsFutureBasket();
                    this.f120079zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.ojitshcjhn((16 & 1) != 0 ? null : null, (16 & 2) != 0 ? null : strIobyxmoadg, dPpxfxbqfkf, measureTypeZoijcleaow, (16 & 16) != 0 ? false : isFutureBasket, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((kz0.ppxfxbqfkf) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar3 = zoijcleaow.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                kz0.ppxfxbqfkf ppxfxbqfkfVar = (kz0.ppxfxbqfkf) objWkgbmnqykc;
                if (ppxfxbqfkfVar.ppxfxbqfkf() != null) {
                    Warning.DailyLimit dailyLimitPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
                    String message = dailyLimitPpxfxbqfkf != null ? dailyLimitPpxfxbqfkf.getMessage() : null;
                    if (message == null) {
                        message = "";
                    }
                    zoijcleaowVar3.crxdokpmqz(new wj1.gxszxtbevo.eablkybsjg(message));
                }
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar3.wizcaqwiak(thDxjokdxxww);
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
        int f120081zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ojitshcjhn(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f120081zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            zoijcleaowVar.uawqvzlxes(zoijcleaow.weqkydbzbr(zoijcleaowVar).getArgs().getOrderId());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pm1.iobyxmoadg.C1703iobyxmoadg c1703iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(c1703iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wj1.iobyxmoadg.zoijcleaow f120082jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120084zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(wj1.iobyxmoadg.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f120082jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ppxfxbqfkf(this.f120082jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            List basket;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f120084zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(true));
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    cz0.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f120034ppxfxbqfkf;
                    this.f120084zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.zynmafqrjb(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            CartProduct cartProduct = null;
            Object obj2 = null;
            cartProduct = null;
            if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            Cart cart = (Cart) objWkgbmnqykc;
            if (cart != null && (basket = cart.getBasket()) != null) {
                wj1.iobyxmoadg.zoijcleaow zoijcleaowVar2 = this.f120082jyumaefscl;
                for (Object obj3 : basket) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) obj3).getArticle(), zoijcleaowVar2.iobyxmoadg())) {
                        obj2 = obj3;
                        break;
                    }
                }
                cartProduct = (CartProduct) obj2;
            }
            if (cartProduct != null) {
                zoijcleaow.this.lxfrhoxuzk(cartProduct, this.f120082jyumaefscl.zoijcleaow());
            } else {
                zoijcleaow.this.skhdrjzrfn(this.f120082jyumaefscl);
            }
            zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120086zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new rgvfuqvkyq(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f120086zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                this.f120086zdlpuopuiu = 1;
                if (zoijcleaowVar.roivzttewh(this) == objGxszxtbevo) {
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
        public final Object invoke(pz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f120088yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120089zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f120089zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.wizcaqwiak((Throwable) this.f120088yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            vdvldrhtss vdvldrhtssVar = zoijcleaow.this.new vdvldrhtss(gxszxtbevoVar);
            vdvldrhtssVar.f120088yggfygwlhe = th2;
            return vdvldrhtssVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120091zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f120092jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f120093yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f120094zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f120092jyumaefscl = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f120094zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                this.f120092jyumaefscl.wizcaqwiak((Throwable) this.f120093yggfygwlhe);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f120092jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f120093yggfygwlhe = th2;
                return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: wj1.zoijcleaow$wflxmlrfwp$zoijcleaow, reason: collision with other inner class name */
        /* synthetic */ class C3004zoijcleaow implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f120095zdlpuopuiu;

            C3004zoijcleaow(zoijcleaow zoijcleaowVar) {
                this.f120095zdlpuopuiu = zoijcleaowVar;
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
            public final Object emit(kz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objKcexrzcfyt = wflxmlrfwp.kcexrzcfyt(this.f120095zdlpuopuiu, eablkybsjgVar, gxszxtbevoVar);
                return objKcexrzcfyt == mg.zoijcleaow.gxszxtbevo() ? objKcexrzcfyt : wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // kotlin.jvm.internal.agtfadlqog
            public final gg.dxjokdxxww zoijcleaow() {
                return new kotlin.jvm.internal.iobyxmoadg(2, this.f120095zdlpuopuiu, zoijcleaow.class, "processCartState", "processCartState(Lru/myspar/proloyalty/core/domain/models/cart/CartState;)V", 4);
            }
        }

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object kcexrzcfyt(zoijcleaow zoijcleaowVar, kz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaowVar.igdgnonuha(eablkybsjgVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new wflxmlrfwp(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f120091zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo(zoijcleaow.this.f120028dxjokdxxww.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new iobyxmoadg(zoijcleaow.this, null));
                C3004zoijcleaow c3004zoijcleaow = new C3004zoijcleaow(zoijcleaow.this);
                this.f120091zdlpuopuiu = 1;
                if (lqeggnwhkgVarGxszxtbevo.collect(c3004zoijcleaow, this) == objGxszxtbevo) {
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
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f120096iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f120098yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f120099zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f120098yggfygwlhe = obj;
            this.f120096iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.roivzttewh(this);
        }
    }

    /* JADX INFO: renamed from: wj1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C3005zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f120101iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f120102jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f120103yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f120104zdlpuopuiu;

        C3005zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new C3005zoijcleaow(gxszxtbevoVar);
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
            int i13 = this.f120101iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zoijcleaowVar2 = (zoijcleaow) this.f120103yggfygwlhe;
                        obj2 = this.f120104zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    zoijcleaowVar = zoijcleaowVar2;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        zoijcleaowVar.wizcaqwiak(thDxjokdxxww);
                    }
                    zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(true));
                zoijcleaow zoijcleaowVar3 = zoijcleaow.this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                c11.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar3.f120033nufgyqmvbu;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f120101iwizpuwonk = 1;
                obj = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Warning) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            obj2 = objWkgbmnqykc;
            zoijcleaowVar = zoijcleaow.this;
            if (kcexrzcfyt.agtfadlqog(obj2)) {
                zoijcleaowVar.hszhottldk((Warning) obj2);
                this.f120104zdlpuopuiu = obj2;
                this.f120103yggfygwlhe = zoijcleaowVar;
                this.f120102jyumaefscl = obj2;
                this.f120101iwizpuwonk = 2;
                if (zoijcleaowVar.fiwbwshyhd(null, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar2 = zoijcleaowVar;
                zoijcleaowVar = zoijcleaowVar2;
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                zoijcleaowVar.wizcaqwiak(thDxjokdxxww);
            }
            zoijcleaow.this.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C3005zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(dr0.iobyxmoadg dispatchersProvider, cz0.iobyxmoadg cartInteractor, c11.dxjokdxxww getPurchasesHistoryUseCase, c11.nufgyqmvbu getPurchasesHistoryDetailsUseCase, c11.gtknphoqwx repeatPurchaseUseCase, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, c11.iobyxmoadg addFutureBasketToCartUseCase, p01.dxjokdxxww subscribeToCartStateUseCase, p01.ppxfxbqfkf clearCartUseCase, pm1.iobyxmoadg changeProductReviewObserver, vm0.zoijcleaow analyticsTracker) {
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
        this.f120034ppxfxbqfkf = cartInteractor;
        this.f120036wkgbmnqykc = getPurchasesHistoryUseCase;
        this.f120029eablkybsjg = getPurchasesHistoryDetailsUseCase;
        this.f120031gxszxtbevo = repeatPurchaseUseCase;
        this.f120032lqeggnwhkg = subscribeToCurrentDeliveryDataUseCase;
        this.f120033nufgyqmvbu = addFutureBasketToCartUseCase;
        this.f120028dxjokdxxww = subscribeToCartStateUseCase;
        this.f120026btonecajqb = clearCartUseCase;
        this.f120030gtknphoqwx = changeProductReviewObserver;
        this.f120027draadjrbmk = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok ageimvtcrz() {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(null), 3, null);
    }

    private final void auzgnhcxok() {
        ipoelvxyzq();
        grlcpdaxtj();
        SpecificPurchaseArgs args = ((State) jlmebxxoox()).getArgs();
        if (args.gxszxtbevo()) {
            uawqvzlxes(args.getOrderId());
        } else {
            mhtqkkgtqm();
        }
    }

    private final void dvvnrvtcbc(wj1.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(iobyxmoadgVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fiwbwshyhd(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        Object obj;
        zoijcleaow zoijcleaowVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f120045esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f120045esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object objCdpycssgdh = btonecajqbVar.f120046iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f120045esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                draadjrbmkVar = (tg.draadjrbmk) btonecajqbVar.f120048yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) btonecajqbVar.f120049zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(objCdpycssgdh);
                } catch (Throwable th2) {
                    th = th2;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = btonecajqbVar.f120048yggfygwlhe;
                zoijcleaowVar2 = (zoijcleaow) btonecajqbVar.f120049zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objCdpycssgdh);
            }
            zoijcleaowVar = zoijcleaowVar2;
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                zoijcleaowVar.wizcaqwiak(thDxjokdxxww);
            }
            zoijcleaowVar.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objCdpycssgdh);
        ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(true));
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            cz0.iobyxmoadg iobyxmoadgVar3 = this.f120034ppxfxbqfkf;
            btonecajqbVar.f120049zdlpuopuiu = this;
            btonecajqbVar.f120048yggfygwlhe = draadjrbmkVar;
            btonecajqbVar.f120045esjtqupxsv = 1;
            objCdpycssgdh = iobyxmoadgVar3.cdpycssgdh(btonecajqbVar);
            if (objCdpycssgdh == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } catch (Throwable th3) {
            th = th3;
            zoijcleaowVar = this;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(((Cart) objCdpycssgdh).getWarning());
        Object obj2 = objWkgbmnqykc;
        tg.draadjrbmk draadjrbmkVar2 = draadjrbmkVar;
        obj = obj2;
        if (kcexrzcfyt.agtfadlqog(obj)) {
            Warning warning = (Warning) obj;
            if (warning instanceof Warning.WithCodeAndMessage) {
                zoijcleaowVar.crxdokpmqz(new wj1.gxszxtbevo.C3001gxszxtbevo(((Warning.WithCodeAndMessage) warning).getMessage()));
            } else if (warning instanceof Warning.DailyLimit) {
                zoijcleaowVar.crxdokpmqz(new wj1.gxszxtbevo.eablkybsjg(((Warning.DailyLimit) warning).getMessage()));
            }
            if (draadjrbmkVar2 != null) {
                btonecajqbVar.f120049zdlpuopuiu = zoijcleaowVar;
                btonecajqbVar.f120048yggfygwlhe = obj;
                btonecajqbVar.f120047jyumaefscl = obj;
                btonecajqbVar.f120045esjtqupxsv = 2;
                if (draadjrbmkVar2.invoke(btonecajqbVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar2 = zoijcleaowVar;
                zoijcleaowVar = zoijcleaowVar2;
            }
        }
        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.wizcaqwiak(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void fyldjkxazc(String str, int i13) {
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
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new draadjrbmk(str, purchaseHistoryProduct, i13, null), 3, null);
    }

    private final void grlcpdaxtj() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new agtfadlqog(this.f120030gtknphoqwx.nufgyqmvbu(), this), new ojitshcjhn(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hszhottldk(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new wj1.gxszxtbevo.C3001gxszxtbevo(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void igdgnonuha(kz0.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof kz0.eablkybsjg.iobyxmoadg) {
            ulzqkzuiru(wj1.lqeggnwhkg.iobyxmoadg.f120017iobyxmoadg);
            this.f120035wflxmlrfwp = null;
        } else {
            if (!(eablkybsjgVar instanceof kz0.eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            ulzqkzuiru(new wj1.lqeggnwhkg.zoijcleaow(((kz0.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
            auzgnhcxok auzgnhcxokVar = this.f120035wflxmlrfwp;
            if (auzgnhcxokVar != null) {
                auzgnhcxokVar.start();
            }
        }
    }

    private final void ipoelvxyzq() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wflxmlrfwp(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwxlajgraz(wj1.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(iobyxmoadgVar, this, null), 3, null);
    }

    private final void ixidwrxhsl(AnalyticsPage analyticsPage, AnalyticElement analyticElement) {
        this.f120027draadjrbmk.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(new AnalyticsPage.PurchaseDetail(((State) jlmebxxoox()).getId()), analyticsPage, null, analyticElement, null, 20, null)));
    }

    static /* synthetic */ void jrbgnlbqoe(zoijcleaow zoijcleaowVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        zoijcleaowVar.ixidwrxhsl(analyticsPage, analyticElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok lrnfpwlwnk() {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C3005zoijcleaow(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok lxfrhoxuzk(CartProduct cartProduct, MeasureType measureType) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(cartProduct, measureType, null), 3, null);
    }

    private final void mhtqkkgtqm() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f120032lqeggnwhkg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new rgvfuqvkyq(null)), new vdvldrhtss(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object roivzttewh(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f120096iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f120096iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f120098yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f120096iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(true));
            c11.dxjokdxxww.iobyxmoadg iobyxmoadgVar = new c11.dxjokdxxww.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(1));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                c11.dxjokdxxww dxjokdxxwwVar = this.f120036wkgbmnqykc;
                wkgbmnqykcVar.f120099zdlpuopuiu = this;
                wkgbmnqykcVar.f120096iwizpuwonk = 1;
                objZoijcleaow = dxjokdxxwwVar.zoijcleaow(iobyxmoadgVar, wkgbmnqykcVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f120099zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Purchases) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            zoijcleaowVar.ulzqkzuiru(new wj1.lqeggnwhkg.wkgbmnqykc(((Purchases) objWkgbmnqykc).getFuture()));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.wizcaqwiak(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok skhdrjzrfn(wj1.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(zoijcleaowVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok uawqvzlxes(String str) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(str, null), 3, null);
    }

    public static final /* synthetic */ State weqkydbzbr(zoijcleaow zoijcleaowVar) {
        return (State) zoijcleaowVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok zeieaojujs(wj1.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(zoijcleaowVar, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: nuxfzjnpeb, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(wj1.wkgbmnqykc action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, wj1.wkgbmnqykc.iobyxmoadg.f120023iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        auzgnhcxok();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wj1.eablkybsjg intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wj1.eablkybsjg.ppxfxbqfkf.f120000iobyxmoadg)) {
            crxdokpmqz(wj1.gxszxtbevo.iobyxmoadg.f120005iobyxmoadg);
            return;
        }
        if (intent instanceof wj1.eablkybsjg.zoijcleaow) {
            iwxlajgraz(((wj1.eablkybsjg.zoijcleaow) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof wj1.eablkybsjg.wkgbmnqykc) {
            dvvnrvtcbc(((wj1.eablkybsjg.wkgbmnqykc) intent).iobyxmoadg());
            return;
        }
        if (!(intent instanceof wj1.eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((State) jlmebxxoox()).getIsLoading()) {
            return;
        }
        wj1.eablkybsjg.iobyxmoadg iobyxmoadgVar = (wj1.eablkybsjg.iobyxmoadg) intent;
        if (iobyxmoadgVar instanceof wj1.eablkybsjg.iobyxmoadg.C3000iobyxmoadg) {
            wj1.eablkybsjg.iobyxmoadg.C3000iobyxmoadg c3000iobyxmoadg = (wj1.eablkybsjg.iobyxmoadg.C3000iobyxmoadg) intent;
            ixidwrxhsl(new AnalyticsPage.ItemDetail(c3000iobyxmoadg.zoijcleaow().getId(), c3000iobyxmoadg.zoijcleaow().getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String()), c3000iobyxmoadg.zoijcleaow());
            crxdokpmqz(new wj1.gxszxtbevo.ppxfxbqfkf(c3000iobyxmoadg.iobyxmoadg()));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, wj1.eablkybsjg.iobyxmoadg.zoijcleaow.f119999iobyxmoadg)) {
            iwxlajgraz(wj1.iobyxmoadg.C3002iobyxmoadg.f120012iobyxmoadg);
        } else {
            if (!(iobyxmoadgVar instanceof wj1.eablkybsjg.iobyxmoadg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            wj1.eablkybsjg.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = (wj1.eablkybsjg.iobyxmoadg.ppxfxbqfkf) intent;
            fyldjkxazc(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
        }
    }

    public final void wizcaqwiak(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new wj1.lqeggnwhkg.ppxfxbqfkf(false));
        if (error instanceof ProductDailyLimitException) {
            crxdokpmqz(new wj1.gxszxtbevo.eablkybsjg(((ProductDailyLimitException) error).getMessage()));
        } else {
            crxdokpmqz(new wj1.gxszxtbevo.wkgbmnqykc(error));
        }
    }
}

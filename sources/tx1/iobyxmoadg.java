package tx1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.core.domain.models.order.Purchase;
import ru.myspar.core.domain.models.order.Purchases;
import ru.myspar.purchases.impl.history.domain.store.State;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import x20.dxjokdxxww;
import z10.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C2747iobyxmoadg f111763lqeggnwhkg = new C2747iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final int f111764nufgyqmvbu = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lo.zoijcleaow f111765eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private auzgnhcxok f111766gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dxjokdxxww f111767ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nufgyqmvbu f111768wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111770zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f111770zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.crxdokpmqz(tx1.eablkybsjg.lqeggnwhkg.f111752iobyxmoadg);
                this.f111770zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(1000L, this) == objGxszxtbevo) {
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
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111772yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111773zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f111773zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.iyctptxqzt((Throwable) this.f111772yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = iobyxmoadg.this.new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f111772yggfygwlhe = th2;
            return gxszxtbevoVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: tx1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2747iobyxmoadg {
        public /* synthetic */ C2747iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2747iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg implements sj.nufgyqmvbu {
        lqeggnwhkg() {
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(y00.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objYdmasvzmpa = iobyxmoadg.this.ydmasvzmpa(1, gxszxtbevoVar);
            return objYdmasvzmpa == mg.zoijcleaow.gxszxtbevo() ? objYdmasvzmpa : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f111775jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tx1.wkgbmnqykc f111776yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111777zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(tx1.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f111776yggfygwlhe = wkgbmnqykcVar;
            this.f111775jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f111776yggfygwlhe, this.f111775jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f111777zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                tx1.wkgbmnqykc wkgbmnqykcVar = this.f111776yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, tx1.wkgbmnqykc.iobyxmoadg.f111791iobyxmoadg)) {
                    this.f111775jyumaefscl.crxdokpmqz(tx1.eablkybsjg.iobyxmoadg.f111751iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, tx1.wkgbmnqykc.ppxfxbqfkf.f111794iobyxmoadg)) {
                    this.f111775jyumaefscl.crxdokpmqz(tx1.eablkybsjg.zoijcleaow.f111758iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof tx1.wkgbmnqykc.C2748wkgbmnqykc) {
                    this.f111775jyumaefscl.zfvoamnweg();
                } else if (wkgbmnqykcVar instanceof tx1.wkgbmnqykc.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f111775jyumaefscl;
                    this.f111777zdlpuopuiu = 1;
                    if (iobyxmoadgVar.sflfametgt(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof tx1.wkgbmnqykc.eablkybsjg) {
                    this.f111775jyumaefscl.oipsdeybqn(((tx1.wkgbmnqykc.eablkybsjg) this.f111776yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof tx1.wkgbmnqykc.lqeggnwhkg) {
                    this.f111775jyumaefscl.opjhrmiecq(((tx1.wkgbmnqykc.lqeggnwhkg) this.f111776yggfygwlhe).iobyxmoadg());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, tx1.wkgbmnqykc.gxszxtbevo.f111790iobyxmoadg)) {
                    this.f111775jyumaefscl.bfopjjpdmp();
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, tx1.wkgbmnqykc.nufgyqmvbu.f111793iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar2 = this.f111775jyumaefscl;
                    this.f111777zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.ydmasvzmpa(1, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
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

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f111778cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f111780jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f111781yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111782zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111780jyumaefscl = obj;
            this.f111778cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ydmasvzmpa(0, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f111783jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tx1.ppxfxbqfkf f111784yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111785zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(tx1.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f111784yggfygwlhe = ppxfxbqfkfVar;
            this.f111783jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f111784yggfygwlhe, this.f111783jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f111785zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f111784yggfygwlhe, tx1.ppxfxbqfkf.iobyxmoadg.f111788iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f111783jyumaefscl;
                this.f111785zdlpuopuiu = 1;
                if (iobyxmoadgVar.zeieaojujs(this) == objGxszxtbevo) {
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
    public iobyxmoadg(dxjokdxxww getPurchasesHistoryUseCase, nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, lo.zoijcleaow analyticsTracker, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPurchasesHistoryUseCase, "getPurchasesHistoryUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f111767ppxfxbqfkf = getPurchasesHistoryUseCase;
        this.f111768wkgbmnqykc = subscribeToCurrentDeliveryDataUseCase;
        this.f111765eablkybsjg = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp() {
        Purchases purchaseInfo = ((State) jlmebxxoox()).getPurchaseInfo();
        if (purchaseInfo != null && !purchaseInfo.getIsReviewsAvailable()) {
            crxdokpmqz(tx1.eablkybsjg.gxszxtbevo.f111750iobyxmoadg);
            return;
        }
        auzgnhcxok auzgnhcxokVar = this.f111766gxszxtbevo;
        if (auzgnhcxokVar == null || !auzgnhcxokVar.isActive()) {
            this.f111766gxszxtbevo = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lrnfpwlwnk(Throwable th2) {
        iyctptxqzt(th2);
        ulzqkzuiru(new tx1.gxszxtbevo.ppxfxbqfkf(false));
    }

    private final void nuxfzjnpeb(AnalyticsPage analyticsPage) {
        this.f111765eablkybsjg.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.PurchasesHistory.f84337iwizpuwonk, analyticsPage, null, null, null, 28, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oipsdeybqn(String str) {
        nuxfzjnpeb(new AnalyticsPage.PurchaseDetail(str));
        crxdokpmqz(new tx1.eablkybsjg.ppxfxbqfkf(((State) jlmebxxoox()).getFlow(), str, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void opjhrmiecq(String str) {
        List purchases;
        Object next;
        String npsUrl;
        Purchases purchaseInfo = ((State) jlmebxxoox()).getPurchaseInfo();
        if (purchaseInfo == null || (purchases = purchaseInfo.getPurchases()) == null) {
            return;
        }
        Iterator it = purchases.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Purchase) next).getId(), str));
        Purchase purchase = (Purchase) next;
        if (purchase == null || (npsUrl = purchase.getNpsUrl()) == null) {
            return;
        }
        crxdokpmqz(new tx1.eablkybsjg.wkgbmnqykc(npsUrl, AnalyticsPage.PurchasesHistory.f84337iwizpuwonk));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sflfametgt(lg.gxszxtbevo gxszxtbevoVar) {
        Object objYdmasvzmpa;
        State state = (State) jlmebxxoox();
        if (state.getIsLoading() || state.getPurchaseInfo() == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        return (state.getCurrentPage() >= state.getPurchaseInfo().getPaging().getPagesCount() || (objYdmasvzmpa = ydmasvzmpa(state.getCurrentPage() + 1, gxszxtbevoVar)) != mg.zoijcleaow.gxszxtbevo()) ? wwaezpbzkn.f37140iobyxmoadg : objYdmasvzmpa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weqkydbzbr(Purchases purchases, int i13) {
        ulzqkzuiru(new tx1.gxszxtbevo.zoijcleaow(i13, purchases));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ydmasvzmpa(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i14 = wkgbmnqykcVar.f111778cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f111778cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f111780jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = wkgbmnqykcVar.f111778cqumvgiudr;
        if (i15 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new tx1.gxszxtbevo.ppxfxbqfkf(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                dxjokdxxww dxjokdxxwwVar = this.f111767ppxfxbqfkf;
                dxjokdxxww.iobyxmoadg iobyxmoadgVar3 = new dxjokdxxww.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13));
                wkgbmnqykcVar.f111782zdlpuopuiu = this;
                wkgbmnqykcVar.f111781yggfygwlhe = i13;
                wkgbmnqykcVar.f111778cqumvgiudr = 1;
                objZoijcleaow = dxjokdxxwwVar.zoijcleaow(iobyxmoadgVar3, wkgbmnqykcVar);
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
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = wkgbmnqykcVar.f111781yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f111782zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Purchases) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.weqkydbzbr((Purchases) objWkgbmnqykc, i13);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.lrnfpwlwnk(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zeieaojujs(lg.gxszxtbevo gxszxtbevoVar) {
        ulzqkzuiru(new tx1.gxszxtbevo.iobyxmoadg(((State) jlmebxxoox()).getFlow() == g10.iobyxmoadg.SHOW_ONLY));
        nufgyqmvbu nufgyqmvbuVar = this.f111768wkgbmnqykc;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objCollect = sj.dxjokdxxww.gxszxtbevo(nufgyqmvbuVar.zoijcleaow(wwaezpbzknVar), new gxszxtbevo(null)).collect(new lqeggnwhkg(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg() {
        nuxfzjnpeb(AnalyticsPage.FutureBasket.f84298iwizpuwonk);
        crxdokpmqz(new tx1.eablkybsjg.ppxfxbqfkf(g10.iobyxmoadg.COMPILATION, null, true, 2, null));
    }

    public final void iyctptxqzt(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new tx1.eablkybsjg.C2746eablkybsjg(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(tx1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(tx1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }
}

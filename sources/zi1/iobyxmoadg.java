package zi1;

import c11.dxjokdxxww;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import m01.nufgyqmvbu;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.core.domain.models.order.Purchase;
import ru.myspar.proloyalty.core.domain.models.order.Purchases;
import ru.myspar.proloyalty.purchases.impl.history.domain.store.State;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C3321iobyxmoadg f130238lqeggnwhkg = new C3321iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final int f130239nufgyqmvbu = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vm0.zoijcleaow f130240eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private auzgnhcxok f130241gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dxjokdxxww f130242ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nufgyqmvbu f130243wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130245zdlpuopuiu;

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
            int i13 = this.f130245zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.crxdokpmqz(zi1.eablkybsjg.lqeggnwhkg.f130227iobyxmoadg);
                this.f130245zdlpuopuiu = 1;
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
        /* synthetic */ Object f130247yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130248zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f130248zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.iyctptxqzt((Throwable) this.f130247yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = iobyxmoadg.this.new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f130247yggfygwlhe = th2;
            return gxszxtbevoVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: zi1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3321iobyxmoadg {
        public /* synthetic */ C3321iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C3321iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg implements sj.nufgyqmvbu {
        lqeggnwhkg() {
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(pz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objYdmasvzmpa = iobyxmoadg.this.ydmasvzmpa(1, gxszxtbevoVar);
            return objYdmasvzmpa == mg.zoijcleaow.gxszxtbevo() ? objYdmasvzmpa : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f130250jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zi1.wkgbmnqykc f130251yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130252zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(zi1.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f130251yggfygwlhe = wkgbmnqykcVar;
            this.f130250jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f130251yggfygwlhe, this.f130250jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f130252zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zi1.wkgbmnqykc wkgbmnqykcVar = this.f130251yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, zi1.wkgbmnqykc.iobyxmoadg.f130266iobyxmoadg)) {
                    this.f130250jyumaefscl.crxdokpmqz(zi1.eablkybsjg.iobyxmoadg.f130226iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, zi1.wkgbmnqykc.ppxfxbqfkf.f130269iobyxmoadg)) {
                    this.f130250jyumaefscl.crxdokpmqz(zi1.eablkybsjg.zoijcleaow.f130233iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof zi1.wkgbmnqykc.C3322wkgbmnqykc) {
                    this.f130250jyumaefscl.zfvoamnweg();
                } else if (wkgbmnqykcVar instanceof zi1.wkgbmnqykc.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f130250jyumaefscl;
                    this.f130252zdlpuopuiu = 1;
                    if (iobyxmoadgVar.sflfametgt(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof zi1.wkgbmnqykc.eablkybsjg) {
                    this.f130250jyumaefscl.oipsdeybqn(((zi1.wkgbmnqykc.eablkybsjg) this.f130251yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof zi1.wkgbmnqykc.lqeggnwhkg) {
                    this.f130250jyumaefscl.opjhrmiecq(((zi1.wkgbmnqykc.lqeggnwhkg) this.f130251yggfygwlhe).iobyxmoadg());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, zi1.wkgbmnqykc.gxszxtbevo.f130265iobyxmoadg)) {
                    this.f130250jyumaefscl.bfopjjpdmp();
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, zi1.wkgbmnqykc.nufgyqmvbu.f130268iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar2 = this.f130250jyumaefscl;
                    this.f130252zdlpuopuiu = 2;
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
        int f130253cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f130255jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f130256yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f130257zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f130255jyumaefscl = obj;
            this.f130253cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ydmasvzmpa(0, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f130258jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zi1.ppxfxbqfkf f130259yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130260zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(zi1.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f130259yggfygwlhe = ppxfxbqfkfVar;
            this.f130258jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f130259yggfygwlhe, this.f130258jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f130260zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f130259yggfygwlhe, zi1.ppxfxbqfkf.iobyxmoadg.f130263iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f130258jyumaefscl;
                this.f130260zdlpuopuiu = 1;
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
    public iobyxmoadg(dxjokdxxww getPurchasesHistoryUseCase, nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, vm0.zoijcleaow analyticsTracker, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPurchasesHistoryUseCase, "getPurchasesHistoryUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f130242ppxfxbqfkf = getPurchasesHistoryUseCase;
        this.f130243wkgbmnqykc = subscribeToCurrentDeliveryDataUseCase;
        this.f130240eablkybsjg = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp() {
        Purchases purchaseInfo = ((State) jlmebxxoox()).getPurchaseInfo();
        if (purchaseInfo != null && !purchaseInfo.getIsReviewsAvailable()) {
            crxdokpmqz(zi1.eablkybsjg.gxszxtbevo.f130225iobyxmoadg);
            return;
        }
        auzgnhcxok auzgnhcxokVar = this.f130241gxszxtbevo;
        if (auzgnhcxokVar == null || !auzgnhcxokVar.isActive()) {
            this.f130241gxszxtbevo = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lrnfpwlwnk(Throwable th2) {
        iyctptxqzt(th2);
        ulzqkzuiru(new zi1.gxszxtbevo.ppxfxbqfkf(false));
    }

    private final void nuxfzjnpeb(AnalyticsPage analyticsPage) {
        this.f130240eablkybsjg.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.PurchasesHistory.f92365iwizpuwonk, analyticsPage, null, null, null, 28, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oipsdeybqn(String str) {
        nuxfzjnpeb(new AnalyticsPage.PurchaseDetail(str));
        crxdokpmqz(new zi1.eablkybsjg.ppxfxbqfkf(((State) jlmebxxoox()).getFlow(), str, true));
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
        crxdokpmqz(new zi1.eablkybsjg.wkgbmnqykc(npsUrl, AnalyticsPage.PurchasesHistory.f92365iwizpuwonk));
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
        ulzqkzuiru(new zi1.gxszxtbevo.zoijcleaow(i13, purchases));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ydmasvzmpa(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i14 = wkgbmnqykcVar.f130253cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f130253cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f130255jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = wkgbmnqykcVar.f130253cqumvgiudr;
        if (i15 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new zi1.gxszxtbevo.ppxfxbqfkf(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                dxjokdxxww dxjokdxxwwVar = this.f130242ppxfxbqfkf;
                dxjokdxxww.iobyxmoadg iobyxmoadgVar3 = new dxjokdxxww.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13));
                wkgbmnqykcVar.f130257zdlpuopuiu = this;
                wkgbmnqykcVar.f130256yggfygwlhe = i13;
                wkgbmnqykcVar.f130253cqumvgiudr = 1;
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
            i13 = wkgbmnqykcVar.f130256yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f130257zdlpuopuiu;
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
        ulzqkzuiru(new zi1.gxszxtbevo.iobyxmoadg(((State) jlmebxxoox()).getFlow() == wz0.iobyxmoadg.SHOW_ONLY));
        nufgyqmvbu nufgyqmvbuVar = this.f130243wkgbmnqykc;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objCollect = sj.dxjokdxxww.gxszxtbevo(nufgyqmvbuVar.zoijcleaow(wwaezpbzknVar), new gxszxtbevo(null)).collect(new lqeggnwhkg(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg() {
        nuxfzjnpeb(AnalyticsPage.FutureBasket.f92326iwizpuwonk);
        crxdokpmqz(new zi1.eablkybsjg.ppxfxbqfkf(wz0.iobyxmoadg.COMPILATION, null, true, 2, null));
    }

    public final void iyctptxqzt(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new zi1.eablkybsjg.C3320eablkybsjg(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(zi1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(zi1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }
}

package sj1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.purchases.impl.lists.presentation.model.PurchaseListUiModel;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vm0.zoijcleaow f107161eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dr0.iobyxmoadg f107162ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ek1.iobyxmoadg f107163wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f107164jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f107166zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f107164jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f107164jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f107166zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.zoijcleaow(true, this.f107164jyumaefscl));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    ek1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f107163wkgbmnqykc;
                    this.f107166zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.oipsdeybqn((List) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.bfopjjpdmp(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: sj1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2630iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f107167iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f107169yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107170zdlpuopuiu;

        C2630iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107169yggfygwlhe = obj;
            this.f107167iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.metgxyhuhe(null, this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f107172yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f107173zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f107173zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.zfvoamnweg((Throwable) this.f107172yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f107172yggfygwlhe = th2;
            return ppxfxbqfkfVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f107174jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ sj1.wkgbmnqykc f107175yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f107176zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(sj1.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f107175yggfygwlhe = wkgbmnqykcVar;
            this.f107174jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f107175yggfygwlhe, this.f107174jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f107176zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj1.wkgbmnqykc wkgbmnqykcVar = this.f107175yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, sj1.wkgbmnqykc.iobyxmoadg.f107184iobyxmoadg)) {
                    this.f107174jyumaefscl.crxdokpmqz(sj1.eablkybsjg.iobyxmoadg.f107152iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, sj1.wkgbmnqykc.zoijcleaow.f107187iobyxmoadg)) {
                    this.f107174jyumaefscl.ydmasvzmpa();
                } else if (wkgbmnqykcVar instanceof sj1.wkgbmnqykc.C2631wkgbmnqykc) {
                    this.f107174jyumaefscl.crxdokpmqz(new sj1.eablkybsjg.C2629eablkybsjg(((sj1.wkgbmnqykc.C2631wkgbmnqykc) this.f107175yggfygwlhe).iobyxmoadg()));
                } else if (wkgbmnqykcVar instanceof sj1.wkgbmnqykc.eablkybsjg) {
                    iobyxmoadg iobyxmoadgVar = this.f107174jyumaefscl;
                    String strIobyxmoadg = ((sj1.wkgbmnqykc.eablkybsjg) this.f107175yggfygwlhe).iobyxmoadg();
                    this.f107176zdlpuopuiu = 1;
                    if (iobyxmoadgVar.metgxyhuhe(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof sj1.wkgbmnqykc.ppxfxbqfkf) {
                    this.f107174jyumaefscl.sflfametgt(((sj1.wkgbmnqykc.ppxfxbqfkf) this.f107175yggfygwlhe).iobyxmoadg());
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, sj1.wkgbmnqykc.gxszxtbevo.f107183iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg.yfnezrywwk(this.f107174jyumaefscl, false, 1, null);
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
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f107178zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f107178zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.yfnezrywwk(iobyxmoadg.this, false, 1, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fk1.iobyxmoadg.InterfaceC0752iobyxmoadg interfaceC0752iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(interfaceC0752iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, ek1.iobyxmoadg purchasesListComponentApi, vm0.zoijcleaow analyticsTracker) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f107162ppxfxbqfkf = dispatchersProvider;
        this.f107163wkgbmnqykc = purchasesListComponentApi;
        this.f107161eablkybsjg = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp(Throwable th2) {
        zfvoamnweg(th2);
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(false, false, 2, null));
    }

    static /* synthetic */ void iyctptxqzt(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.opjhrmiecq(analyticsPage, analyticElement, analyticsLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oipsdeybqn(List list) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false, list));
    }

    private final void opjhrmiecq(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f107161eablkybsjg.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.ShoppingLists.f92378iwizpuwonk, analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sflfametgt(PurchaseListUiModel purchaseListUiModel) {
        iyctptxqzt(this, new AnalyticsPage.ShoppingList(purchaseListUiModel.getId(), purchaseListUiModel.getName()), null, null, 6, null);
        crxdokpmqz(new sj1.eablkybsjg.zoijcleaow(purchaseListUiModel.getId(), purchaseListUiModel.getName()));
    }

    private final void uwvvkdfqfp(boolean z13) {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa() {
        iyctptxqzt(this, AnalyticsPage.CreatePurchaseList.f92313iwizpuwonk, null, null, 6, null);
        crxdokpmqz(sj1.eablkybsjg.ppxfxbqfkf.f107153iobyxmoadg);
    }

    static /* synthetic */ void yfnezrywwk(iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.uwvvkdfqfp(z13);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(sj1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(intent, this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [sj1.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final Object metgxyhuhe(String str, lg.gxszxtbevo gxszxtbevoVar) {
        C2630iobyxmoadg c2630iobyxmoadg;
        Object objWkgbmnqykc;
        ?? r13;
        Throwable thDxjokdxxww;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C2630iobyxmoadg) {
            c2630iobyxmoadg = (C2630iobyxmoadg) gxszxtbevoVar;
            int i13 = c2630iobyxmoadg.f107167iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2630iobyxmoadg.f107167iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2630iobyxmoadg = new C2630iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2630iobyxmoadg = new C2630iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c2630iobyxmoadg.f107169yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2630iobyxmoadg.f107167iwizpuwonk;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) c2630iobyxmoadg.f107170zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    iobyxmoadgVar = iobyxmoadgVar2;
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) c2630iobyxmoadg.f107170zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    str = iobyxmoadgVar3;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
                r13 = str;
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    r13.oipsdeybqn((List) objWkgbmnqykc);
                }
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    r13.bfopjjpdmp(thDxjokdxxww);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(true, false, 2, null));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                ek1.iobyxmoadg iobyxmoadgVar5 = this.f107163wkgbmnqykc;
                c2630iobyxmoadg.f107170zdlpuopuiu = this;
                c2630iobyxmoadg.f107167iwizpuwonk = 1;
                if (iobyxmoadgVar5.iobyxmoadg(str, c2630iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                str = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                r13 = str;
            }
            ek1.iobyxmoadg iobyxmoadgVar7 = iobyxmoadgVar.f107163wkgbmnqykc;
            c2630iobyxmoadg.f107170zdlpuopuiu = iobyxmoadgVar;
            c2630iobyxmoadg.f107167iwizpuwonk = 2;
            objZoijcleaow = iobyxmoadgVar7.zoijcleaow(c2630iobyxmoadg);
            str = iobyxmoadgVar;
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
            r13 = str;
        } catch (Throwable th3) {
            th = th3;
        }
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            r13.oipsdeybqn((List) objWkgbmnqykc);
        }
        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            r13.bfopjjpdmp(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(sj1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, sj1.ppxfxbqfkf.iobyxmoadg.f107181iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.gxszxtbevo(dxjokdxxww.kegysxyocb(this.f107163wkgbmnqykc.eablkybsjg().eablkybsjg(), new zoijcleaow(null)), new ppxfxbqfkf(null)), sopmlzcsov());
        uwvvkdfqfp(true);
    }

    public final void zfvoamnweg(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new sj1.eablkybsjg.wkgbmnqykc(error));
    }
}

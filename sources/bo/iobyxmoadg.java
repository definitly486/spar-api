package bo;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import h20.gtknphoqwx;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import ru.myspar.ads.impl.domain.productday.store.State;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.models.delivery.DeliveryCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f16853ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final z10.iobyxmoadg f16854wkgbmnqykc;

    /* JADX INFO: renamed from: bo.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0302iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f16855jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ bo.ppxfxbqfkf f16856yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f16857zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0302iobyxmoadg(bo.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f16856yggfygwlhe = ppxfxbqfkfVar;
            this.f16855jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C0302iobyxmoadg(this.f16856yggfygwlhe, this.f16855jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f16857zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f16856yggfygwlhe, bo.ppxfxbqfkf.iobyxmoadg.f16868iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f16855jyumaefscl;
                this.f16857zdlpuopuiu = 1;
                if (iobyxmoadgVar.rlfsiqarku(this) == objGxszxtbevo) {
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
            return ((C0302iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f16858iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f16860yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f16861zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f16860yggfygwlhe = obj;
            this.f16858iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.czzsidtyhn(null, null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f16862iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f16864yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f16865zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f16864yggfygwlhe = obj;
            this.f16862iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gtknphoqwx getProductDetailsUseCase, z10.iobyxmoadg getCurrentDeliveryDataUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductDetailsUseCase, "getProductDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f16853ppxfxbqfkf = getProductDetailsUseCase;
        this.f16854wkgbmnqykc = getCurrentDeliveryDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object czzsidtyhn(String str, String str2, DeliveryCode deliveryCode, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f16858iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f16858iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f16860yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f16858iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                gtknphoqwx gtknphoqwxVar = this.f16853ppxfxbqfkf;
                ppxfxbqfkfVar.f16861zdlpuopuiu = this;
                ppxfxbqfkfVar.f16858iwizpuwonk = 1;
                objPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf(str2, str, deliveryCode, ppxfxbqfkfVar);
                if (objPpxfxbqfkf == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f16861zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Product) objPpxfxbqfkf);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.zfvoamnweg((Product) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.sflfametgt(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ void jztzpxfvev(iobyxmoadg iobyxmoadgVar, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        iobyxmoadgVar.okpsazkaxt(str);
    }

    private final void okpsazkaxt(String str) {
        crxdokpmqz(new eablkybsjg.iobyxmoadg(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f16862iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f16862iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f16864yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f16862iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f16865zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objZoijcleaow);
        z10.iobyxmoadg iobyxmoadgVar2 = this.f16854wkgbmnqykc;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        zoijcleaowVar.f16865zdlpuopuiu = this;
        zoijcleaowVar.f16862iwizpuwonk = 1;
        objZoijcleaow = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        zoijcleaowVar.f16865zdlpuopuiu = null;
        zoijcleaowVar.f16862iwizpuwonk = 2;
        if (iobyxmoadgVar.ydmasvzmpa((y00.iobyxmoadg) objZoijcleaow, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sflfametgt(Throwable th2) {
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(th2));
        jztzpxfvev(this, null, 1, null);
    }

    private final void uwvvkdfqfp() {
        okpsazkaxt(((State) jlmebxxoox()).getProductId());
    }

    private final Object ydmasvzmpa(y00.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (iobyxmoadgVar.wkgbmnqykc().length() == 0) {
            jztzpxfvev(this, null, 1, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Object objCzzsidtyhn = czzsidtyhn(iobyxmoadgVar.wkgbmnqykc(), ((State) jlmebxxoox()).getProductId(), iobyxmoadgVar.ppxfxbqfkf(), gxszxtbevoVar);
        return objCzzsidtyhn == mg.zoijcleaow.gxszxtbevo() ? objCzzsidtyhn : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yfnezrywwk(HintUiModel hintUiModel) {
        crxdokpmqz(new eablkybsjg.zoijcleaow(hintUiModel, new HintDialogAnalyticsInfo(new AnalyticElement.ProductItemElement(((State) jlmebxxoox()).getProductDay().getName(), ((State) jlmebxxoox()).getProductDay().getName()), AnalyticsPage.ProductDayPopup.f84322iwizpuwonk, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg(Product product) {
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(product, true));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f16869iobyxmoadg)) {
            jztzpxfvev(this, null, 1, null);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f16871iobyxmoadg)) {
            uwvvkdfqfp();
        } else {
            if (!(intent instanceof wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            yfnezrywwk(((wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(bo.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0302iobyxmoadg(action, this, null), 3, null);
    }
}

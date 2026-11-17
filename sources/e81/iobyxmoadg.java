package e81;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import ow1.esjtqupxsv;
import pj.cllcsxoeiz;
import pj.ikoacuggdj;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.evropolis.impl.gift.domain.mvi.State;
import ru.myspar.proloyalty.legacy.presentation.model.AddProductParams;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg implements zb1.iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final C0649iobyxmoadg f30934gxszxtbevo = new C0649iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Runnable f30935eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cz0.iobyxmoadg f30936ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final esjtqupxsv f30937wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ProductUiModel f30938jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30940zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(ProductUiModel productUiModel, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30938jyumaefscl = productUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f30938jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f30940zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            ProductUiModel productUiModel = this.f30938jyumaefscl;
            iobyxmoadgVar.esjtqupxsv(new AddProductParams(productUiModel, iobyxmoadg.this.metgxyhuhe(productUiModel.getIsDispPer100()), this.f30938jyumaefscl.getMeasureTypeModel().getCurrentMeasure()));
            iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: e81.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0649iobyxmoadg {
        public /* synthetic */ C0649iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0649iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30942zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f30942zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.crxdokpmqz(e81.eablkybsjg.ppxfxbqfkf.f30929iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ kz0.zoijcleaow f30943jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30945zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(kz0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30943jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(this.f30943jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            e81.eablkybsjg c0648eablkybsjg;
            mg.zoijcleaow.gxszxtbevo();
            if (this.f30945zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            if (this.f30943jyumaefscl.iobyxmoadg() != null) {
                Warning.DailyLimit dailyLimitIobyxmoadg = this.f30943jyumaefscl.iobyxmoadg();
                String message = dailyLimitIobyxmoadg != null ? dailyLimitIobyxmoadg.getMessage() : null;
                if (message == null) {
                    message = "";
                }
                c0648eablkybsjg = new e81.eablkybsjg.C0648eablkybsjg(message);
            } else {
                c0648eablkybsjg = e81.eablkybsjg.lqeggnwhkg.f30928iobyxmoadg;
            }
            iobyxmoadgVar.crxdokpmqz(c0648eablkybsjg);
            iobyxmoadg.this.crxdokpmqz(e81.eablkybsjg.zoijcleaow.f30931iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ AddProductParams f30946iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f30948yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f30949zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(AddProductParams addProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30946iwizpuwonk = addProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f30946iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            AddProductParams addProductParams;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f30948yggfygwlhe;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    AddProductParams addProductParams2 = this.f30946iwizpuwonk;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    cz0.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f30936ppxfxbqfkf;
                    String productId = addProductParams2.getProductId();
                    double quantity = addProductParams2.getQuantity();
                    MeasureType measureType = addProductParams2.getMeasureType();
                    this.f30949zdlpuopuiu = addProductParams2;
                    this.f30948yggfygwlhe = 1;
                    obj = iobyxmoadgVar3.ojitshcjhn((16 & 1) != 0 ? null : productId, (16 & 2) != 0 ? null : null, quantity, measureType, (16 & 16) != 0 ? false : false, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    addProductParams = addProductParams2;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    addProductParams = (AddProductParams) this.f30949zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(new kz0.zoijcleaow(((kz0.ppxfxbqfkf) obj).ppxfxbqfkf(), addProductParams.getProductId()));
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.czzsidtyhn((kz0.zoijcleaow) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.yfnezrywwk(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, cz0.iobyxmoadg cartInteractor, esjtqupxsv authUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authUseCase, "authUseCase");
        this.f30936ppxfxbqfkf = cartInteractor;
        this.f30937wkgbmnqykc = authUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn(kz0.zoijcleaow zoijcleaowVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(zoijcleaowVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double metgxyhuhe(boolean z13) {
        return z13 ? 0.1d : 1.0d;
    }

    private final void rlfsiqarku(ojitshcjhn ojitshcjhnVar, String str) {
        if (ojitshcjhnVar.nufgyqmvbu()) {
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(ojitshcjhnVar, str, null, null, false, null, null, false, 248, null));
            crxdokpmqz(e81.eablkybsjg.zoijcleaow.f30931iobyxmoadg);
        }
    }

    private final void sflfametgt() {
        EvropolisGift.TextWithTab coupon = ((State) jlmebxxoox()).getGift().getCoupon();
        if (coupon != null) {
            crxdokpmqz(new e81.eablkybsjg.iobyxmoadg(coupon.getText()));
        }
    }

    private final void uwvvkdfqfp(EvropolisGift.Button.zoijcleaow zoijcleaowVar) {
        Object next;
        EvropolisGift.Tab.zoijcleaow selectedTab = ((State) jlmebxxoox()).getSelectedTab();
        List buttons = ((State) jlmebxxoox()).getGift().getButtons();
        if (buttons != null) {
            Iterator it = buttons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                EvropolisGift.Button button = (EvropolisGift.Button) next;
                if (button.getType() == zoijcleaowVar && (selectedTab == null || button.getTab() == selectedTab)) {
                    break;
                }
            }
            EvropolisGift.Button button2 = (EvropolisGift.Button) next;
            if (button2 == null) {
                return;
            }
            rlfsiqarku(button2.getNavLink(), button2.getReference());
        }
    }

    private final void ydmasvzmpa(ProductUiModel productUiModel) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(productUiModel, null), 3, null);
    }

    private final void zfvoamnweg(String str) {
        Object next;
        List tabs = ((State) jlmebxxoox()).getGift().getTabs();
        if (tabs != null) {
            Iterator it = tabs.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((EvropolisGift.Tab) next).getType().name(), str));
            EvropolisGift.Tab tab = (EvropolisGift.Tab) next;
            if (tab == null) {
                return;
            }
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(tab.getType()));
        }
    }

    @Override // zb1.iobyxmoadg
    public void draadjrbmk(Runnable runnable) {
        this.f30935eablkybsjg = runnable;
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(e81.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, e81.ppxfxbqfkf.iobyxmoadg.f30952iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // zb1.iobyxmoadg
    public void mbcevpiqjq(AddProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), ikoacuggdj.zoijcleaow(), null, new zoijcleaow(params, null), 2, null);
    }

    @Override // zb1.iobyxmoadg
    public esjtqupxsv wkgbmnqykc() {
        return this.f30937wkgbmnqykc;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(e81.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, e81.wkgbmnqykc.iobyxmoadg.f30954iobyxmoadg)) {
            uwvvkdfqfp(EvropolisGift.Button.zoijcleaow.PRIMARY);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, e81.wkgbmnqykc.C0650wkgbmnqykc.f30956iobyxmoadg)) {
            uwvvkdfqfp(EvropolisGift.Button.zoijcleaow.SECONDARY);
            return;
        }
        if (intent instanceof e81.wkgbmnqykc.zoijcleaow) {
            ydmasvzmpa(((e81.wkgbmnqykc.zoijcleaow) intent).iobyxmoadg());
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, e81.wkgbmnqykc.ppxfxbqfkf.f30955iobyxmoadg)) {
            sflfametgt();
        } else {
            if (!(intent instanceof e81.wkgbmnqykc.eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            zfvoamnweg(((e81.wkgbmnqykc.eablkybsjg) intent).iobyxmoadg());
        }
    }

    public final void yfnezrywwk(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
        if (error instanceof ProductDailyLimitException) {
            crxdokpmqz(new e81.eablkybsjg.C0648eablkybsjg(((ProductDailyLimitException) error).getMessage()));
        } else {
            crxdokpmqz(new e81.eablkybsjg.wkgbmnqykc(error));
        }
    }

    @Override // zb1.iobyxmoadg
    public void zoijcleaow() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(null), 3, null);
    }
}

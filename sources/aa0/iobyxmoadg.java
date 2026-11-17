package aa0;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.cllcsxoeiz;
import pj.ikoacuggdj;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.error_handler.exceptions.AvailableOnlyForPickupException;
import ru.myspar.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.evropolis.impl.gift.domain.mvi.State;
import ru.myspar.legacy.presentation.model.AddProductParams;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg implements de0.ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C0022iobyxmoadg f1215lqeggnwhkg = new C0022iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final sm.iobyxmoadg f1216eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Runnable f1217gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k00.iobyxmoadg f1218ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c20.eablkybsjg f1219wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ t00.zoijcleaow f1220jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1222zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(t00.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f1220jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f1220jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            aa0.eablkybsjg lqeggnwhkgVar;
            mg.zoijcleaow.gxszxtbevo();
            if (this.f1222zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            if (this.f1220jyumaefscl.iobyxmoadg() != null) {
                Warning.DailyLimit dailyLimitIobyxmoadg = this.f1220jyumaefscl.iobyxmoadg();
                String message = dailyLimitIobyxmoadg != null ? dailyLimitIobyxmoadg.getMessage() : null;
                if (message == null) {
                    message = "";
                }
                lqeggnwhkgVar = new aa0.eablkybsjg.lqeggnwhkg(message);
            } else {
                lqeggnwhkgVar = aa0.eablkybsjg.dxjokdxxww.f1203iobyxmoadg;
            }
            iobyxmoadgVar.crxdokpmqz(lqeggnwhkgVar);
            iobyxmoadg.this.crxdokpmqz(aa0.eablkybsjg.zoijcleaow.f1212iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ AddProductParams f1223iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f1224jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Throwable f1225yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1226zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(Throwable th2, iobyxmoadg iobyxmoadgVar, AddProductParams addProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f1225yggfygwlhe = th2;
            this.f1224jyumaefscl = iobyxmoadgVar;
            this.f1223iwizpuwonk = addProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f1225yggfygwlhe, this.f1224jyumaefscl, this.f1223iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f1226zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            Throwable th2 = this.f1225yggfygwlhe;
            if (th2 instanceof AvailableOnlyForPickupException) {
                this.f1224jyumaefscl.crxdokpmqz(new aa0.eablkybsjg.gxszxtbevo(this.f1223iwizpuwonk, ((AvailableOnlyForPickupException) th2).getMessage()));
            } else {
                this.f1224jyumaefscl.zfvoamnweg(th2);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: aa0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0022iobyxmoadg {
        public /* synthetic */ C0022iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0022iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ProductUiModel f1227jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1229zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(ProductUiModel productUiModel, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f1227jyumaefscl = productUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(this.f1227jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f1229zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new aa0.gxszxtbevo.iobyxmoadg(true));
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            ProductUiModel productUiModel = this.f1227jyumaefscl;
            iobyxmoadgVar.cllcsxoeiz(new AddProductParams(productUiModel, iobyxmoadg.this.czzsidtyhn(productUiModel.getIsDispPer100()), this.f1227jyumaefscl.getMeasureTypeModel().getCurrentMeasure()));
            iobyxmoadg.this.ulzqkzuiru(new aa0.gxszxtbevo.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1231zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f1231zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f1216eablkybsjg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f1231zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(new aa0.eablkybsjg.wkgbmnqykc(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1233zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f1233zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.crxdokpmqz(aa0.eablkybsjg.ppxfxbqfkf.f1210iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ AddProductParams f1234iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f1236yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f1237zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(AddProductParams addProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f1234iwizpuwonk = addProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f1234iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            AddProductParams addProductParams;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f1236yggfygwlhe;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new aa0.gxszxtbevo.iobyxmoadg(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    AddProductParams addProductParams2 = this.f1234iwizpuwonk;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    k00.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f1218ppxfxbqfkf;
                    String productId = addProductParams2.getProductId();
                    double quantity = addProductParams2.getQuantity();
                    MeasureType measureType = addProductParams2.getMeasureType();
                    this.f1237zdlpuopuiu = addProductParams2;
                    this.f1236yggfygwlhe = 1;
                    obj = iobyxmoadgVar3.oxmwwwfdhm((16 & 1) != 0 ? null : productId, (16 & 2) != 0 ? null : null, quantity, measureType, (16 & 16) != 0 ? false : false, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    addProductParams = addProductParams2;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    addProductParams = (AddProductParams) this.f1237zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(new t00.zoijcleaow(((t00.ppxfxbqfkf) obj).ppxfxbqfkf(), addProductParams.getProductId()));
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            AddProductParams addProductParams3 = this.f1234iwizpuwonk;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.yfnezrywwk((t00.zoijcleaow) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ydmasvzmpa(addProductParams3, thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new aa0.gxszxtbevo.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, k00.iobyxmoadg cartInteractor, c20.eablkybsjg loggedInUseCase, sm.iobyxmoadg getUserAddressFlowInfo) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loggedInUseCase, "loggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        this.f1218ppxfxbqfkf = cartInteractor;
        this.f1219wkgbmnqykc = loggedInUseCase;
        this.f1216eablkybsjg = getUserAddressFlowInfo;
    }

    private final void bfopjjpdmp() {
        EvropolisGift.TextWithTab coupon = ((State) jlmebxxoox()).getGift().getCoupon();
        if (coupon != null) {
            crxdokpmqz(new aa0.eablkybsjg.iobyxmoadg(coupon.getText()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double czzsidtyhn(boolean z13) {
        return z13 ? 0.1d : 1.0d;
    }

    private final void oipsdeybqn(ProductUiModel productUiModel) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(productUiModel, null), 3, null);
    }

    private final void opjhrmiecq(String str) {
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
            ulzqkzuiru(new aa0.gxszxtbevo.zoijcleaow(tab.getType()));
        }
    }

    private final void sflfametgt(EvropolisGift.Button.zoijcleaow zoijcleaowVar) {
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
            uwvvkdfqfp(button2.getNavLink(), button2.getReference());
        }
    }

    private final void uwvvkdfqfp(f40.zoijcleaow zoijcleaowVar, String str) {
        if (zoijcleaowVar.lqeggnwhkg()) {
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(zoijcleaowVar, str, null, null, false, null, null, false, 248, null));
            crxdokpmqz(aa0.eablkybsjg.zoijcleaow.f1212iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa(AddProductParams addProductParams, Throwable th2) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(th2, this, addProductParams, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yfnezrywwk(t00.zoijcleaow zoijcleaowVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(zoijcleaowVar, null), 3, null);
    }

    @Override // de0.ppxfxbqfkf
    public Runnable cdpycssgdh() {
        return this.f1217gxszxtbevo;
    }

    @Override // de0.ppxfxbqfkf
    public void draadjrbmk(Runnable runnable) {
        this.f1217gxszxtbevo = runnable;
    }

    @Override // de0.ppxfxbqfkf
    public c20.eablkybsjg eablkybsjg() {
        return this.f1219wkgbmnqykc;
    }

    @Override // de0.ppxfxbqfkf
    public void gxszxtbevo() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(aa0.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aa0.ppxfxbqfkf.iobyxmoadg.f1240iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(aa0.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, aa0.wkgbmnqykc.zoijcleaow.f1246iobyxmoadg)) {
            sflfametgt(EvropolisGift.Button.zoijcleaow.PRIMARY);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, aa0.wkgbmnqykc.eablkybsjg.f1241iobyxmoadg)) {
            sflfametgt(EvropolisGift.Button.zoijcleaow.SECONDARY);
            return;
        }
        if (intent instanceof aa0.wkgbmnqykc.ppxfxbqfkf) {
            oipsdeybqn(((aa0.wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, aa0.wkgbmnqykc.C0023wkgbmnqykc.f1245iobyxmoadg)) {
            bfopjjpdmp();
        } else if (intent instanceof aa0.wkgbmnqykc.gxszxtbevo) {
            opjhrmiecq(((aa0.wkgbmnqykc.gxszxtbevo) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof aa0.wkgbmnqykc.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            cqumvgiudr(((aa0.wkgbmnqykc.iobyxmoadg) intent).iobyxmoadg());
        }
    }

    @Override // de0.ppxfxbqfkf
    public void zdlpuopuiu(AddProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), ikoacuggdj.zoijcleaow(), null, new zoijcleaow(params, null), 2, null);
    }

    public final void zfvoamnweg(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new aa0.gxszxtbevo.iobyxmoadg(false));
        if (error instanceof ProductDailyLimitException) {
            crxdokpmqz(new aa0.eablkybsjg.lqeggnwhkg(((ProductDailyLimitException) error).getMessage()));
        } else {
            crxdokpmqz(new aa0.eablkybsjg.C0021eablkybsjg(error));
        }
    }

    @Override // de0.ppxfxbqfkf
    public void zoijcleaow() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
    }
}

package ru.myspar.proloyalty.cart.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.cart.impl.domain.store.lqeggnwhkg;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.delivery.api.model.DeliveryIntervalPayload;
import ru.myspar.proloyalty.delivery.api.model.DeliveryOptionsArgs;
import ru.myspar.proloyalty.delivery.api.model.DeliveryOptionsScreenMode;
import ru.myspar.proloyalty.delivery.api.model.OrderFlowType;
import ru.myspar.proloyalty.payment.api.PaymentMethodResultHelper;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import vo0.eablkybsjg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final PaymentMethodResultHelper f92931agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final c51.iobyxmoadg f92932btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final eablkybsjg f92933draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final xo0.iobyxmoadg f92934gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final bl0.iobyxmoadg f92935ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final draadjrbmk f92936rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final draadjrbmk f92937vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final rg1.iobyxmoadg f92938wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2176iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f92939iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92941yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92942zdlpuopuiu;

        C2176iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92941yggfygwlhe = obj;
            this.f92939iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f92943jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92945zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f92943jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f92943jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92945zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.draadjrbmk draadjrbmkVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.draadjrbmk(this.f92943jyumaefscl);
                this.f92945zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(draadjrbmkVar, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f92946jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92948zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f92946jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(this.f92946jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92948zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.iwizpuwonk iwizpuwonkVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.iwizpuwonk(this.f92946jyumaefscl);
                this.f92948zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(iwizpuwonkVar, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92950zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92950zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.cqumvgiudr cqumvgiudrVar = ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.cqumvgiudr.f92884iobyxmoadg;
                this.f92950zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(cqumvgiudrVar, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, vo0.ppxfxbqfkf uiMapper, c51.iobyxmoadg deliveryFeatureApi, xo0.iobyxmoadg catalogFeatureApi, eablkybsjg deliveryTermsUiMapper, rg1.iobyxmoadg paymentFeatureApi, PaymentMethodResultHelper paymentMethodResultHelper, bl0.iobyxmoadg addressFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiMapper, "uiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryFeatureApi, "deliveryFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryTermsUiMapper, "deliveryTermsUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentMethodResultHelper, "paymentMethodResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        this.f92932btonecajqb = deliveryFeatureApi;
        this.f92934gtknphoqwx = catalogFeatureApi;
        this.f92933draadjrbmk = deliveryTermsUiMapper;
        this.f92938wflxmlrfwp = paymentFeatureApi;
        this.f92931agtfadlqog = paymentMethodResultHelper;
        this.f92935ojitshcjhn = addressFeatureApi;
        this.f92936rgvfuqvkyq = uiMapper;
        this.f92937vdvldrhtss = new draadjrbmk() { // from class: ho0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.cart.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc ntlheqmsrt(ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow zoijcleaowVar) {
        ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc gtknphoqwxVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.wkgbmnqykc.f93011iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.C2175wkgbmnqykc.f92908iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.zdlpuopuiu.f93013iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.yggfygwlhe.f92909iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.gxszxtbevo.f92996iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.gxszxtbevo.f92890iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.btonecajqb.f92989iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.btonecajqb.f92883iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.iwizpuwonk.f92998iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.esjtqupxsv.f92888iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.ppxfxbqfkf.f93005iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.ppxfxbqfkf.f92900iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.yggfygwlhe.f93012iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.jyumaefscl.f92893iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.wflxmlrfwp.f93010iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.agtfadlqog.f92882iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.agtfadlqog.f92988iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.ojitshcjhn.f92898iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.ojitshcjhn.f93003iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.rgvfuqvkyq.f92901iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.jyumaefscl.f92999iobyxmoadg)) {
            return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.cqumvgiudr.f92884iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.oxmwwwfdhm) {
            gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.kcexrzcfyt(((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.oxmwwwfdhm) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.dxjokdxxww) {
            gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.dxjokdxxww(((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.rgvfuqvkyq) {
            ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.rgvfuqvkyq rgvfuqvkyqVar = (ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.rgvfuqvkyq) zoijcleaowVar;
            gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.vdvldrhtss(rgvfuqvkyqVar.ppxfxbqfkf(), rgvfuqvkyqVar.iobyxmoadg(), rgvfuqvkyqVar.zoijcleaow());
        } else if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.lqeggnwhkg) {
            gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.lqeggnwhkg(((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.lqeggnwhkg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.nufgyqmvbu) {
            gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.nufgyqmvbu(((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.nufgyqmvbu) zoijcleaowVar).iobyxmoadg());
        } else {
            if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.C2178zoijcleaow) {
                return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.zoijcleaow.f92911iobyxmoadg;
            }
            if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.eablkybsjg) {
                gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.eablkybsjg(((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.kcexrzcfyt) {
                gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.zdlpuopuiu(((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.kcexrzcfyt) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.vdvldrhtss) {
                gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.oxmwwwfdhm(((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.vdvldrhtss) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.draadjrbmk) {
                ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.draadjrbmk draadjrbmkVar = (ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.draadjrbmk) zoijcleaowVar;
                gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.wflxmlrfwp(draadjrbmkVar.ppxfxbqfkf(), draadjrbmkVar.iobyxmoadg(), draadjrbmkVar.zoijcleaow());
            } else {
                if (!(zoijcleaowVar instanceof ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.gtknphoqwx)) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.iobyxmoadg.f92997iobyxmoadg)) {
                        return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.iobyxmoadg.f92891iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.cqumvgiudr.f92990iobyxmoadg)) {
                        return ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.lereixgezr.f92895iobyxmoadg;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                gtknphoqwxVar = new ru.myspar.proloyalty.cart.impl.domain.store.wkgbmnqykc.gtknphoqwx(((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.gtknphoqwx) zoijcleaowVar).iobyxmoadg());
            }
        }
        return gtknphoqwxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sopmlzcsov(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.f92931agtfadlqog.ppxfxbqfkf(it)) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new zoijcleaow(null), 3, null);
    }

    public final void crxdokpmqz(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new ppxfxbqfkf(z13, null), 3, null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f92936rgvfuqvkyq;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f92937vdvldrhtss;
    }

    public final void jlmebxxoox(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new wkgbmnqykc(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        C2176iobyxmoadg c2176iobyxmoadg;
        if (gxszxtbevoVar instanceof C2176iobyxmoadg) {
            c2176iobyxmoadg = (C2176iobyxmoadg) gxszxtbevoVar;
            int i13 = c2176iobyxmoadg.f92939iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2176iobyxmoadg.f92939iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2176iobyxmoadg = new C2176iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2176iobyxmoadg = new C2176iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2176iobyxmoadg.f92941yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (c2176iobyxmoadg.f92939iwizpuwonk) {
            case 0:
                zdlpuopuiu.zoijcleaow(obj);
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.wflxmlrfwp) {
                    Object eablkybsjgVar2 = new ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.eablkybsjg(((ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg());
                    c2176iobyxmoadg.f92939iwizpuwonk = 1;
                    if (cllcsxoeiz(eablkybsjgVar2, c2176iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.ojitshcjhn) {
                    Object gxszxtbevoVar2 = new ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.gxszxtbevo(((ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.ojitshcjhn) eablkybsjgVar).iobyxmoadg());
                    c2176iobyxmoadg.f92939iwizpuwonk = 2;
                    if (cllcsxoeiz(gxszxtbevoVar2, c2176iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.iobyxmoadg.f92707iobyxmoadg)) {
                    i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.dxjokdxxww.f92700iobyxmoadg)) {
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f92932btonecajqb.zoijcleaow(new DeliveryIntervalPayload(OrderFlowType.Cart.f95404zdlpuopuiu)));
                } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.draadjrbmk) {
                    i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f92934gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(((ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.draadjrbmk) eablkybsjgVar).iobyxmoadg()), null, 2, null)));
                } else {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.zoijcleaow.f92716iobyxmoadg)) {
                        Object obj2 = ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.iobyxmoadg.f92980iobyxmoadg;
                        c2176iobyxmoadg.f92939iwizpuwonk = 3;
                        if (cllcsxoeiz(obj2, c2176iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.C2158eablkybsjg.f92701iobyxmoadg)) {
                        i21.iobyxmoadg.iozdgvuglv(i21.iobyxmoadg.f41720iobyxmoadg, MainTab.CATALOG, false, 2, null);
                    } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.nufgyqmvbu) {
                        ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.nufgyqmvbu nufgyqmvbuVar = (ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.nufgyqmvbu) eablkybsjgVar;
                        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f92935ojitshcjhn.ppxfxbqfkf(new cl0.wkgbmnqykc.iobyxmoadg(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg())));
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.btonecajqb.f92698iobyxmoadg)) {
                        i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f92932btonecajqb.iobyxmoadg(new DeliveryOptionsArgs(DeliveryOptionsScreenMode.BASKET.f95402zdlpuopuiu)));
                    } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.gtknphoqwx) {
                        ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.gtknphoqwx gtknphoqwxVar = (ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.gtknphoqwx) eablkybsjgVar;
                        Object c2177ppxfxbqfkf = new ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.C2177ppxfxbqfkf(gtknphoqwxVar.iobyxmoadg(), gtknphoqwxVar.zoijcleaow());
                        c2176iobyxmoadg.f92942zdlpuopuiu = c2177ppxfxbqfkf;
                        c2176iobyxmoadg.f92939iwizpuwonk = 4;
                        if (cllcsxoeiz(c2177ppxfxbqfkf, c2176iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (eablkybsjgVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.gxszxtbevo) {
                            ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.gxszxtbevo gxszxtbevoVar3 = (ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.gxszxtbevo) eablkybsjgVar;
                            Object zoijcleaowVar = new ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.zoijcleaow(gxszxtbevoVar3.zoijcleaow(), gxszxtbevoVar3.iobyxmoadg());
                            c2176iobyxmoadg.f92939iwizpuwonk = 5;
                            if (cllcsxoeiz(zoijcleaowVar, c2176iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.ppxfxbqfkf.f92713iobyxmoadg)) {
                            i21.iobyxmoadg.iozdgvuglv(i21.iobyxmoadg.f41720iobyxmoadg, MainTab.MY_SPAR, false, 2, null);
                        } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.wkgbmnqykc) {
                            m9.wkgbmnqykc wkgbmnqykcVarZoijcleaow = this.f92938wflxmlrfwp.zoijcleaow(((ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg());
                            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
                            iobyxmoadgVar.oxmwwwfdhm().wkgbmnqykc(this.f92931agtfadlqog.zoijcleaow(), new l9.draadjrbmk() { // from class: ho0.zoijcleaow
                                @Override // l9.draadjrbmk
                                public final void iobyxmoadg(Object obj3) {
                                    ru.myspar.proloyalty.cart.impl.presentation.iobyxmoadg.sopmlzcsov(this.f40840iobyxmoadg, obj3);
                                }
                            });
                            iobyxmoadgVar.oxmwwwfdhm().lqeggnwhkg(wkgbmnqykcVarZoijcleaow);
                        } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.agtfadlqog) {
                            Object wkgbmnqykcVar = new ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.wkgbmnqykc(this.f92933draadjrbmk.invoke(((ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.agtfadlqog) eablkybsjgVar).iobyxmoadg()));
                            c2176iobyxmoadg.f92942zdlpuopuiu = wkgbmnqykcVar;
                            c2176iobyxmoadg.f92939iwizpuwonk = 6;
                            if (cllcsxoeiz(wkgbmnqykcVar, c2176iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else {
                            if (!(eablkybsjgVar instanceof ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.lqeggnwhkg)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(((ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg());
                        }
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 1:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 2:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 3:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 4:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 5:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 6:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

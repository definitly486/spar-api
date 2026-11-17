package ru.myspar.cart.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import jq.eablkybsjg;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.auth.api.model.AuthorizationArgs;
import ru.myspar.auth.api.model.RegistrationVerificationArgs;
import ru.myspar.cart.impl.domain.store.lqeggnwhkg;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.delivery.api.model.DeliveryIntervalPayload;
import ru.myspar.delivery.api.model.DeliveryOptionsArgs;
import ru.myspar.delivery.api.model.DeliveryOptionsScreenMode;
import ru.myspar.delivery.api.model.OrderFlowType;
import ru.myspar.payment.api.PaymentMethodResultHelper;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final PaymentMethodResultHelper f85002agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final n60.iobyxmoadg f85003btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final eablkybsjg f85004draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lq.iobyxmoadg f85005gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final ro.iobyxmoadg f85006ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final draadjrbmk f85007oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final qm.iobyxmoadg f85008rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final draadjrbmk f85009vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final qj0.iobyxmoadg f85010wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.cart.impl.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1934iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f85011iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f85013yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85014zdlpuopuiu;

        C1934iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f85013yggfygwlhe = obj;
            this.f85011iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f85015jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85017zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85015jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f85015jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85017zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.cart.impl.domain.store.wkgbmnqykc.wflxmlrfwp wflxmlrfwpVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.wflxmlrfwp(this.f85015jyumaefscl);
                this.f85017zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(wflxmlrfwpVar, this) == objGxszxtbevo) {
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
        final /* synthetic */ boolean f85018jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85020zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85018jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(this.f85018jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85020zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.cart.impl.domain.store.wkgbmnqykc.lereixgezr lereixgezrVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.lereixgezr(this.f85018jyumaefscl);
                this.f85020zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(lereixgezrVar, this) == objGxszxtbevo) {
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
        int f85022zdlpuopuiu;

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
            int i13 = this.f85022zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.cart.impl.domain.store.wkgbmnqykc.pmvmpeiblj pmvmpeibljVar = ru.myspar.cart.impl.domain.store.wkgbmnqykc.pmvmpeiblj.f84973iobyxmoadg;
                this.f85022zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(pmvmpeibljVar, this) == objGxszxtbevo) {
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
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, jq.ppxfxbqfkf uiMapper, n60.iobyxmoadg deliveryFeatureApi, lq.iobyxmoadg catalogFeatureApi, eablkybsjg deliveryTermsUiMapper, qj0.iobyxmoadg paymentFeatureApi, PaymentMethodResultHelper paymentMethodResultHelper, ro.iobyxmoadg authFeatureApi, qm.iobyxmoadg addressFeatureApi) {
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
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        this.f85003btonecajqb = deliveryFeatureApi;
        this.f85005gtknphoqwx = catalogFeatureApi;
        this.f85004draadjrbmk = deliveryTermsUiMapper;
        this.f85010wflxmlrfwp = paymentFeatureApi;
        this.f85002agtfadlqog = paymentMethodResultHelper;
        this.f85006ojitshcjhn = authFeatureApi;
        this.f85008rgvfuqvkyq = addressFeatureApi;
        this.f85009vdvldrhtss = uiMapper;
        this.f85007oxmwwwfdhm = new draadjrbmk() { // from class: wp.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.cart.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.cart.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.cart.impl.domain.store.wkgbmnqykc ntlheqmsrt(ru.myspar.cart.impl.presentation.zoijcleaow zoijcleaowVar) {
        ru.myspar.cart.impl.domain.store.wkgbmnqykc gtknphoqwxVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.wkgbmnqykc.f85087iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.C1933wkgbmnqykc.f84978iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.iwizpuwonk.f85070iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.cqumvgiudr.f84954iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.gxszxtbevo.f85068iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.gxszxtbevo.f84960iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.btonecajqb.f85062iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.btonecajqb.f84953iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.lereixgezr.f85073iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.zynmafqrjb.f84982iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.ppxfxbqfkf.f85081iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.ppxfxbqfkf.f84974iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.cqumvgiudr.f85063iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.esjtqupxsv.f84958iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.agtfadlqog.f85061iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.ojitshcjhn.f84971iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.rgvfuqvkyq.f85082iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.vdvldrhtss.f84976iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.vdvldrhtss.f85083iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.oxmwwwfdhm.f84972iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.esjtqupxsv.f85066iobyxmoadg)) {
            return ru.myspar.cart.impl.domain.store.wkgbmnqykc.pmvmpeiblj.f84973iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.zdlpuopuiu) {
            gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.yggfygwlhe(((ru.myspar.cart.impl.presentation.zoijcleaow.zdlpuopuiu) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.dxjokdxxww) {
            gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.dxjokdxxww(((ru.myspar.cart.impl.presentation.zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.oxmwwwfdhm) {
            ru.myspar.cart.impl.presentation.zoijcleaow.oxmwwwfdhm oxmwwwfdhmVar = (ru.myspar.cart.impl.presentation.zoijcleaow.oxmwwwfdhm) zoijcleaowVar;
            gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.kcexrzcfyt(oxmwwwfdhmVar.ppxfxbqfkf(), oxmwwwfdhmVar.iobyxmoadg(), oxmwwwfdhmVar.zoijcleaow());
        } else if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.lqeggnwhkg) {
            gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.lqeggnwhkg(((ru.myspar.cart.impl.presentation.zoijcleaow.lqeggnwhkg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.nufgyqmvbu) {
            gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.nufgyqmvbu(((ru.myspar.cart.impl.presentation.zoijcleaow.nufgyqmvbu) zoijcleaowVar).iobyxmoadg());
        } else {
            if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.C1936zoijcleaow) {
                return ru.myspar.cart.impl.domain.store.wkgbmnqykc.zoijcleaow.f84981iobyxmoadg;
            }
            if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.eablkybsjg) {
                gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.eablkybsjg(((ru.myspar.cart.impl.presentation.zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.yggfygwlhe) {
                gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.jyumaefscl(((ru.myspar.cart.impl.presentation.zoijcleaow.yggfygwlhe) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.kcexrzcfyt) {
                gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.zdlpuopuiu(((ru.myspar.cart.impl.presentation.zoijcleaow.kcexrzcfyt) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.wflxmlrfwp) {
                ru.myspar.cart.impl.presentation.zoijcleaow.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.cart.impl.presentation.zoijcleaow.wflxmlrfwp) zoijcleaowVar;
                gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.agtfadlqog(wflxmlrfwpVar.ppxfxbqfkf(), wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.zoijcleaow());
            } else {
                if (!(zoijcleaowVar instanceof ru.myspar.cart.impl.presentation.zoijcleaow.gtknphoqwx)) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.ojitshcjhn.f85076iobyxmoadg)) {
                        return ru.myspar.cart.impl.domain.store.wkgbmnqykc.rgvfuqvkyq.f84975iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.jyumaefscl.f85071iobyxmoadg)) {
                        return ru.myspar.cart.impl.domain.store.wkgbmnqykc.iwizpuwonk.f84963iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.draadjrbmk.f85064iobyxmoadg)) {
                        return ru.myspar.cart.impl.domain.store.wkgbmnqykc.draadjrbmk.f84955iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.iobyxmoadg.f85069iobyxmoadg)) {
                        return ru.myspar.cart.impl.domain.store.wkgbmnqykc.iobyxmoadg.f84961iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.cart.impl.presentation.zoijcleaow.pmvmpeiblj.f85080iobyxmoadg)) {
                        return ru.myspar.cart.impl.domain.store.wkgbmnqykc.istkbnxepw.f84962iobyxmoadg;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                gtknphoqwxVar = new ru.myspar.cart.impl.domain.store.wkgbmnqykc.gtknphoqwx(((ru.myspar.cart.impl.presentation.zoijcleaow.gtknphoqwx) zoijcleaowVar).iobyxmoadg());
            }
        }
        return gtknphoqwxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sopmlzcsov(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.f85002agtfadlqog.ppxfxbqfkf(it)) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new zoijcleaow(null), 3, null);
    }

    public final void crxdokpmqz(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new ppxfxbqfkf(z13, null), 3, null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f85009vdvldrhtss;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f85007oxmwwwfdhm;
    }

    public final void jlmebxxoox(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new wkgbmnqykc(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.cart.impl.domain.store.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        C1934iobyxmoadg c1934iobyxmoadg;
        if (gxszxtbevoVar instanceof C1934iobyxmoadg) {
            c1934iobyxmoadg = (C1934iobyxmoadg) gxszxtbevoVar;
            int i13 = c1934iobyxmoadg.f85011iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1934iobyxmoadg.f85011iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1934iobyxmoadg = new C1934iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1934iobyxmoadg = new C1934iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1934iobyxmoadg.f85013yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (c1934iobyxmoadg.f85011iwizpuwonk) {
            case 0:
                zdlpuopuiu.zoijcleaow(obj);
                if (eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.ojitshcjhn) {
                    Object eablkybsjgVar2 = new ru.myspar.cart.impl.presentation.ppxfxbqfkf.eablkybsjg(((ru.myspar.cart.impl.domain.store.eablkybsjg.ojitshcjhn) eablkybsjgVar).iobyxmoadg());
                    c1934iobyxmoadg.f85011iwizpuwonk = 1;
                    if (cllcsxoeiz(eablkybsjgVar2, c1934iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.vdvldrhtss) {
                    Object gxszxtbevoVar2 = new ru.myspar.cart.impl.presentation.ppxfxbqfkf.gxszxtbevo(((ru.myspar.cart.impl.domain.store.eablkybsjg.vdvldrhtss) eablkybsjgVar).iobyxmoadg());
                    c1934iobyxmoadg.f85011iwizpuwonk = 2;
                    if (cllcsxoeiz(gxszxtbevoVar2, c1934iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.oxmwwwfdhm) {
                    Object lqeggnwhkgVar = new ru.myspar.cart.impl.presentation.ppxfxbqfkf.lqeggnwhkg(((ru.myspar.cart.impl.domain.store.eablkybsjg.oxmwwwfdhm) eablkybsjgVar).iobyxmoadg());
                    c1934iobyxmoadg.f85011iwizpuwonk = 3;
                    if (cllcsxoeiz(lqeggnwhkgVar, c1934iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.cart.impl.domain.store.eablkybsjg.iobyxmoadg.f84774iobyxmoadg)) {
                    d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.cart.impl.domain.store.eablkybsjg.gtknphoqwx.f84772iobyxmoadg)) {
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85003btonecajqb.iobyxmoadg(new DeliveryIntervalPayload(OrderFlowType.Cart.f87622zdlpuopuiu)));
                } else if (eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.agtfadlqog) {
                    d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f85005gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(((ru.myspar.cart.impl.domain.store.eablkybsjg.agtfadlqog) eablkybsjgVar).iobyxmoadg()), null, 2, null)));
                } else {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.cart.impl.domain.store.eablkybsjg.zoijcleaow.f84787iobyxmoadg)) {
                        Object obj2 = ru.myspar.cart.impl.presentation.ppxfxbqfkf.iobyxmoadg.f85052iobyxmoadg;
                        c1934iobyxmoadg.f85011iwizpuwonk = 4;
                        if (cllcsxoeiz(obj2, c1934iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.cart.impl.domain.store.eablkybsjg.lqeggnwhkg.f84775iobyxmoadg)) {
                        d40.iobyxmoadg.iozdgvuglv(d40.iobyxmoadg.f26931iobyxmoadg, MainTab.CATALOG, false, 2, null);
                    } else if (eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.btonecajqb) {
                        ru.myspar.cart.impl.domain.store.eablkybsjg.btonecajqb btonecajqbVar = (ru.myspar.cart.impl.domain.store.eablkybsjg.btonecajqb) eablkybsjgVar;
                        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85008rgvfuqvkyq.ppxfxbqfkf(new rm.wkgbmnqykc.iobyxmoadg(btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg())));
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.cart.impl.domain.store.eablkybsjg.draadjrbmk.f84768iobyxmoadg)) {
                        d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f85003btonecajqb.zoijcleaow(new DeliveryOptionsArgs(DeliveryOptionsScreenMode.BASKET.f87620zdlpuopuiu)));
                    } else if (eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.wflxmlrfwp) {
                        ru.myspar.cart.impl.domain.store.eablkybsjg.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.cart.impl.domain.store.eablkybsjg.wflxmlrfwp) eablkybsjgVar;
                        Object c1935ppxfxbqfkf = new ru.myspar.cart.impl.presentation.ppxfxbqfkf.C1935ppxfxbqfkf(wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.zoijcleaow());
                        c1934iobyxmoadg.f85014zdlpuopuiu = c1935ppxfxbqfkf;
                        c1934iobyxmoadg.f85011iwizpuwonk = 5;
                        if (cllcsxoeiz(c1935ppxfxbqfkf, c1934iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.nufgyqmvbu) {
                            ru.myspar.cart.impl.domain.store.eablkybsjg.nufgyqmvbu nufgyqmvbuVar = (ru.myspar.cart.impl.domain.store.eablkybsjg.nufgyqmvbu) eablkybsjgVar;
                            Object zoijcleaowVar = new ru.myspar.cart.impl.presentation.ppxfxbqfkf.zoijcleaow(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg());
                            c1934iobyxmoadg.f85011iwizpuwonk = 6;
                            if (cllcsxoeiz(zoijcleaowVar, c1934iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.cart.impl.domain.store.eablkybsjg.wkgbmnqykc.f84786iobyxmoadg)) {
                            d40.iobyxmoadg.iozdgvuglv(d40.iobyxmoadg.f26931iobyxmoadg, MainTab.MY_SPAR, false, 2, null);
                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.cart.impl.domain.store.eablkybsjg.ppxfxbqfkf.f84781iobyxmoadg)) {
                            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85006ojitshcjhn.eablkybsjg(new AuthorizationArgs(null, null, 2, null)));
                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.cart.impl.domain.store.eablkybsjg.gxszxtbevo.f84773iobyxmoadg)) {
                            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85006ojitshcjhn.gxszxtbevo(new RegistrationVerificationArgs(null, null, 1, null)));
                        } else if (eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.C1919eablkybsjg) {
                            m9.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = this.f85010wflxmlrfwp.ppxfxbqfkf(((ru.myspar.cart.impl.domain.store.eablkybsjg.C1919eablkybsjg) eablkybsjgVar).iobyxmoadg());
                            d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
                            iobyxmoadgVar.oxmwwwfdhm().wkgbmnqykc(this.f85002agtfadlqog.zoijcleaow(), new l9.draadjrbmk() { // from class: wp.zoijcleaow
                                @Override // l9.draadjrbmk
                                public final void iobyxmoadg(Object obj3) {
                                    ru.myspar.cart.impl.presentation.iobyxmoadg.sopmlzcsov(this.f120351iobyxmoadg, obj3);
                                }
                            });
                            iobyxmoadgVar.oxmwwwfdhm().lqeggnwhkg(wkgbmnqykcVarPpxfxbqfkf);
                        } else if (eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.rgvfuqvkyq) {
                            Object wkgbmnqykcVar = new ru.myspar.cart.impl.presentation.ppxfxbqfkf.wkgbmnqykc(this.f85004draadjrbmk.invoke(((ru.myspar.cart.impl.domain.store.eablkybsjg.rgvfuqvkyq) eablkybsjgVar).iobyxmoadg()));
                            c1934iobyxmoadg.f85014zdlpuopuiu = wkgbmnqykcVar;
                            c1934iobyxmoadg.f85011iwizpuwonk = 7;
                            if (cllcsxoeiz(wkgbmnqykcVar, c1934iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else {
                            if (!(eablkybsjgVar instanceof ru.myspar.cart.impl.domain.store.eablkybsjg.dxjokdxxww)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(((ru.myspar.cart.impl.domain.store.eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg());
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
            case 7:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

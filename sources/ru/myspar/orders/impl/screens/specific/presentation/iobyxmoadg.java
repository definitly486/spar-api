package ru.myspar.orders.impl.screens.specific.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import pm.dxjokdxxww;
import ru.myspar.components.payment.api.models.SbpRecurringBankAppModel;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.payment.api.PaymentMethodResultHelper;
import ru.myspar.payment.api.WebViewPaymentResultHelper;
import ru.myspar.sbp_recurring.api.model.BankModel;
import ru.myspar.tipsorder.api.model.TipsOrderArgs;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ya2.iobyxmoadg f91400agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f91401btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final lq.iobyxmoadg f91402draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final m92.iobyxmoadg f91403gtknphoqwx;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final draadjrbmk f91404kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final kz1.iobyxmoadg f91405ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final WebViewPaymentResultHelper f91406oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final qj0.iobyxmoadg f91407rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final PaymentMethodResultHelper f91408vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final d02.iobyxmoadg f91409wflxmlrfwp;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final draadjrbmk f91410zdlpuopuiu;

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2121iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91411iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91413yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91414zdlpuopuiu;

        C2121iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91413yggfygwlhe = obj;
            this.f91411iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91416zdlpuopuiu;

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
            int i13 = this.f91416zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.kcexrzcfyt kcexrzcfytVar = ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.kcexrzcfyt.f91289iobyxmoadg;
                this.f91416zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(kcexrzcfytVar, this) == objGxszxtbevo) {
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91418zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91418zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.esjtqupxsv esjtqupxsvVar = ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.esjtqupxsv.f91283iobyxmoadg;
                this.f91418zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(esjtqupxsvVar, this) == objGxszxtbevo) {
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
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91420zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91420zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.jyumaefscl jyumaefsclVar = ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.jyumaefscl.f91288iobyxmoadg;
                this.f91420zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(jyumaefsclVar, this) == objGxszxtbevo) {
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
    public iobyxmoadg(ru.myspar.orders.impl.screens.specific.domain.store.lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ij0.gxszxtbevo stateToUiModelMapper, d60.iobyxmoadg resourcesManager, m92.iobyxmoadg tipsOrderFeatureApi, lq.iobyxmoadg catalogFeatureApi, d02.iobyxmoadg rateOrderFeatureApi, ya2.iobyxmoadg webViewScreenFeatureApi, kz1.iobyxmoadg feedbackFeatureApi, qj0.iobyxmoadg paymentFeatureApi, PaymentMethodResultHelper paymentMethodResultHelper, WebViewPaymentResultHelper webViewPaymentResultHelper) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tipsOrderFeatureApi, "tipsOrderFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rateOrderFeatureApi, "rateOrderFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feedbackFeatureApi, "feedbackFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentMethodResultHelper, "paymentMethodResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(webViewPaymentResultHelper, "webViewPaymentResultHelper");
        this.f91401btonecajqb = resourcesManager;
        this.f91403gtknphoqwx = tipsOrderFeatureApi;
        this.f91402draadjrbmk = catalogFeatureApi;
        this.f91409wflxmlrfwp = rateOrderFeatureApi;
        this.f91400agtfadlqog = webViewScreenFeatureApi;
        this.f91405ojitshcjhn = feedbackFeatureApi;
        this.f91407rgvfuqvkyq = paymentFeatureApi;
        this.f91408vdvldrhtss = paymentMethodResultHelper;
        this.f91406oxmwwwfdhm = webViewPaymentResultHelper;
        this.f91404kcexrzcfyt = stateToUiModelMapper;
        this.f91410zdlpuopuiu = new draadjrbmk() { // from class: fj0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.orders.impl.screens.specific.presentation.iobyxmoadg.ulzqkzuiru((ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.f91408vdvldrhtss.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new ppxfxbqfkf(null), 3, null);
        } else {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new zoijcleaow(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jlmebxxoox(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.f91406oxmwwwfdhm.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new wkgbmnqykc(null), 3, null);
        }
    }

    private final void ribwqtqdhb() {
        d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
        iobyxmoadgVar.oxmwwwfdhm().eablkybsjg(null);
        d40.iobyxmoadg.iozdgvuglv(iobyxmoadgVar, MainTab.CART, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc ulzqkzuiru(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf ppxfxbqfkfVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar instanceof ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.iobyxmoadg) {
            return new ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.iobyxmoadg(((ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.zoijcleaow.f91449iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.ppxfxbqfkf.f91296iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.C2122ppxfxbqfkf.f91441iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.C2117wkgbmnqykc.f91302iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.wkgbmnqykc.f91446iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.eablkybsjg.f91282iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.draadjrbmk.f91425iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.draadjrbmk.f91280iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.agtfadlqog.f91422iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.agtfadlqog.f91276iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.ojitshcjhn.f91438iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.ojitshcjhn.f91293iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.rgvfuqvkyq.f91442iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.rgvfuqvkyq.f91297iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.oxmwwwfdhm) {
            ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.oxmwwwfdhm oxmwwwfdhmVar = (ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.oxmwwwfdhm) ppxfxbqfkfVar;
            return new ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.vdvldrhtss(oxmwwwfdhmVar.iobyxmoadg(), oxmwwwfdhmVar.zoijcleaow());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.vdvldrhtss.f91443iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.oxmwwwfdhm.f91294iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.kcexrzcfyt.f91435iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.zdlpuopuiu.f91304iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.jyumaefscl.f91434iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.iwizpuwonk.f91287iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.esjtqupxsv.f91428iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.lereixgezr.f91290iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.yggfygwlhe.f91447iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.jyumaefscl.f91288iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.zdlpuopuiu) {
            return new ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.yggfygwlhe(((ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.zdlpuopuiu) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.nufgyqmvbu.f91437iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.nufgyqmvbu.f91292iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.dxjokdxxww.f91426iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.dxjokdxxww.f91281iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.gxszxtbevo.f91430iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.zoijcleaow.f91305iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.cqumvgiudr.f91424iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.pmvmpeiblj.f91295iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.lqeggnwhkg.f91436iobyxmoadg)) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.lqeggnwhkg.f91291iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.btonecajqb) {
            return new ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.btonecajqb(((ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.btonecajqb) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.iwizpuwonk) {
            ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.iwizpuwonk iwizpuwonkVar = (ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.iwizpuwonk) ppxfxbqfkfVar;
            return new ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.cqumvgiudr(iwizpuwonkVar.iobyxmoadg(), iwizpuwonkVar.zoijcleaow());
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp) {
            ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp) ppxfxbqfkfVar;
            return new ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.wflxmlrfwp(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.gtknphoqwx) {
            return new ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.gtknphoqwx(((ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.gtknphoqwx) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.eablkybsjg) {
            return ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc.gxszxtbevo.f91285iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f91404kcexrzcfyt;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f91410zdlpuopuiu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C2121iobyxmoadg c2121iobyxmoadg;
        if (gxszxtbevoVar instanceof C2121iobyxmoadg) {
            c2121iobyxmoadg = (C2121iobyxmoadg) gxszxtbevoVar;
            int i13 = c2121iobyxmoadg.f91411iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2121iobyxmoadg.f91411iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2121iobyxmoadg = new C2121iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2121iobyxmoadg = new C2121iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2121iobyxmoadg.f91413yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (c2121iobyxmoadg.f91411iwizpuwonk) {
            case 0:
                zdlpuopuiu.zoijcleaow(obj);
                if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.kcexrzcfyt) {
                    Object dxjokdxxwwVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.dxjokdxxww(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.kcexrzcfyt) eablkybsjgVar).iobyxmoadg());
                    c2121iobyxmoadg.f91411iwizpuwonk = 1;
                    if (cllcsxoeiz(dxjokdxxwwVar, c2121iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.iwizpuwonk) {
                    Object gtknphoqwxVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.gtknphoqwx(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.iwizpuwonk) eablkybsjgVar).iobyxmoadg());
                    c2121iobyxmoadg.f91411iwizpuwonk = 2;
                    if (cllcsxoeiz(gtknphoqwxVar, c2121iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.lereixgezr) {
                    Object gtknphoqwxVar2 = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.gtknphoqwx(this.f91401btonecajqb.getString(dxjokdxxww.order_edit_canceled, ((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.lereixgezr) eablkybsjgVar).iobyxmoadg()));
                    c2121iobyxmoadg.f91411iwizpuwonk = 3;
                    if (cllcsxoeiz(gtknphoqwxVar2, c2121iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.ppxfxbqfkf) {
                    Object zoijcleaowVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.zoijcleaow(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
                    c2121iobyxmoadg.f91411iwizpuwonk = 4;
                    if (cllcsxoeiz(zoijcleaowVar, c2121iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.wkgbmnqykc) {
                    Object ppxfxbqfkfVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.ppxfxbqfkf(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg());
                    c2121iobyxmoadg.f91411iwizpuwonk = 5;
                    if (cllcsxoeiz(ppxfxbqfkfVar, c2121iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.C2112eablkybsjg.f91069iobyxmoadg)) {
                    Object obj2 = ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.btonecajqb.f91451iobyxmoadg;
                    c2121iobyxmoadg.f91411iwizpuwonk = 6;
                    if (cllcsxoeiz(obj2, c2121iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.vdvldrhtss.f91092iobyxmoadg)) {
                    Object obj3 = ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.eablkybsjg.f91455iobyxmoadg;
                    c2121iobyxmoadg.f91411iwizpuwonk = 7;
                    if (cllcsxoeiz(obj3, c2121iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.iobyxmoadg.f91074iobyxmoadg)) {
                    d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
                } else if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.gxszxtbevo) {
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(yggfygwlhe.zoijcleaow(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()));
                } else if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.lqeggnwhkg) {
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.dxjokdxxww(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.dxjokdxxww.f91068iobyxmoadg)) {
                    ribwqtqdhb();
                } else if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.btonecajqb) {
                    m9.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = this.f91407rgvfuqvkyq.ppxfxbqfkf(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.btonecajqb) eablkybsjgVar).iobyxmoadg());
                    d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
                    iobyxmoadgVar.oxmwwwfdhm().wkgbmnqykc(this.f91408vdvldrhtss.zoijcleaow(), new l9.draadjrbmk() { // from class: fj0.zoijcleaow
                        @Override // l9.draadjrbmk
                        public final void iobyxmoadg(Object obj4) {
                            ru.myspar.orders.impl.screens.specific.presentation.iobyxmoadg.crxdokpmqz(this.f34093iobyxmoadg, obj4);
                        }
                    });
                    iobyxmoadgVar.oxmwwwfdhm().lqeggnwhkg(wkgbmnqykcVarPpxfxbqfkf);
                } else if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.gtknphoqwx) {
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f91409wflxmlrfwp.iobyxmoadg(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()));
                } else if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.draadjrbmk) {
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f91409wflxmlrfwp.zoijcleaow(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.draadjrbmk) eablkybsjgVar).iobyxmoadg()));
                } else if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.wflxmlrfwp) {
                    d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f91402draadjrbmk.gxszxtbevo(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg()));
                } else if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.ojitshcjhn) {
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f91400agtfadlqog.wkgbmnqykc(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.ojitshcjhn) eablkybsjgVar).iobyxmoadg().getOrderId()));
                } else {
                    if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.zdlpuopuiu) {
                        Object obj4 = ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.gxszxtbevo.f91457iobyxmoadg;
                        c2121iobyxmoadg.f91411iwizpuwonk = 8;
                        if (cllcsxoeiz(obj4, c2121iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.agtfadlqog) {
                        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.kcexrzcfyt());
                    } else if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.nufgyqmvbu) {
                        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(kz1.iobyxmoadg.zoijcleaow(this.f91405ojitshcjhn, null, 1, null));
                    } else {
                        if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.pmvmpeiblj) {
                            Object agtfadlqogVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.agtfadlqog(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.pmvmpeiblj) eablkybsjgVar).iobyxmoadg());
                            c2121iobyxmoadg.f91411iwizpuwonk = 9;
                            if (cllcsxoeiz(agtfadlqogVar, c2121iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.cqumvgiudr) {
                            ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.cqumvgiudr cqumvgiudrVar = (ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.cqumvgiudr) eablkybsjgVar;
                            Object draadjrbmkVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.draadjrbmk(cqumvgiudrVar.zoijcleaow(), cqumvgiudrVar.iobyxmoadg());
                            c2121iobyxmoadg.f91411iwizpuwonk = 10;
                            if (cllcsxoeiz(draadjrbmkVar, c2121iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.yggfygwlhe) {
                            ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.yggfygwlhe yggfygwlheVar = (ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.yggfygwlhe) eablkybsjgVar;
                            Object lqeggnwhkgVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.lqeggnwhkg(yggfygwlheVar.zoijcleaow(), yggfygwlheVar.iobyxmoadg());
                            c2121iobyxmoadg.f91411iwizpuwonk = 11;
                            if (cllcsxoeiz(lqeggnwhkgVar, c2121iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv) {
                            ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv esjtqupxsvVar = (ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv) eablkybsjgVar;
                            Object wflxmlrfwpVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.wflxmlrfwp(esjtqupxsvVar.zoijcleaow(), esjtqupxsvVar.iobyxmoadg());
                            c2121iobyxmoadg.f91411iwizpuwonk = 12;
                            if (cllcsxoeiz(wflxmlrfwpVar, c2121iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.zoijcleaow) {
                            Object iobyxmoadgVar2 = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.iobyxmoadg(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
                            c2121iobyxmoadg.f91411iwizpuwonk = 13;
                            if (cllcsxoeiz(iobyxmoadgVar2, c2121iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.rgvfuqvkyq) {
                            ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.rgvfuqvkyq rgvfuqvkyqVar = (ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.rgvfuqvkyq) eablkybsjgVar;
                            Object c2123wkgbmnqykc = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.C2123wkgbmnqykc(rgvfuqvkyqVar.zoijcleaow(), rgvfuqvkyqVar.iobyxmoadg());
                            c2121iobyxmoadg.f91411iwizpuwonk = 14;
                            if (cllcsxoeiz(c2123wkgbmnqykc, c2121iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.oxmwwwfdhm) {
                            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f91403gtknphoqwx.iobyxmoadg(new TipsOrderArgs(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.oxmwwwfdhm) eablkybsjgVar).iobyxmoadg())));
                        } else if (eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.zynmafqrjb) {
                            List<SbpRecurringBankAppModel> listIobyxmoadg = ((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.zynmafqrjb) eablkybsjgVar).iobyxmoadg();
                            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
                            for (SbpRecurringBankAppModel sbpRecurringBankAppModel : listIobyxmoadg) {
                                arrayList.add(new BankModel(sbpRecurringBankAppModel.getBankName(), sbpRecurringBankAppModel.getLogoUrl(), sbpRecurringBankAppModel.getSchema(), sbpRecurringBankAppModel.getPackageName()));
                            }
                            Object ojitshcjhnVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.ojitshcjhn(arrayList);
                            c2121iobyxmoadg.f91414zdlpuopuiu = ojitshcjhnVar;
                            c2121iobyxmoadg.f91411iwizpuwonk = 15;
                            if (cllcsxoeiz(ojitshcjhnVar, c2121iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else {
                            if (!(eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.istkbnxepw)) {
                                if (!(eablkybsjgVar instanceof ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.jyumaefscl)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.jyumaefscl jyumaefsclVar = (ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.jyumaefscl) eablkybsjgVar;
                                Object nufgyqmvbuVar = new ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc.nufgyqmvbu(jyumaefsclVar.ppxfxbqfkf(), jyumaefsclVar.iobyxmoadg(), jyumaefsclVar.wkgbmnqykc(), jyumaefsclVar.zoijcleaow());
                                c2121iobyxmoadg.f91411iwizpuwonk = 16;
                                if (cllcsxoeiz(nufgyqmvbuVar, c2121iobyxmoadg) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                return wwaezpbzkn.f37140iobyxmoadg;
                            }
                            d40.iobyxmoadg iobyxmoadgVar3 = d40.iobyxmoadg.f26931iobyxmoadg;
                            iobyxmoadgVar3.oxmwwwfdhm().wkgbmnqykc(this.f91406oxmwwwfdhm.zoijcleaow(), new l9.draadjrbmk() { // from class: fj0.ppxfxbqfkf
                                @Override // l9.draadjrbmk
                                public final void iobyxmoadg(Object obj5) {
                                    ru.myspar.orders.impl.screens.specific.presentation.iobyxmoadg.jlmebxxoox(this.f34042iobyxmoadg, obj5);
                                }
                            });
                            iobyxmoadgVar3.oxmwwwfdhm().lqeggnwhkg(this.f91407rgvfuqvkyq.zoijcleaow(((ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg.istkbnxepw) eablkybsjgVar).iobyxmoadg()));
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
            case 8:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 9:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 10:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 11:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 12:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 13:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 14:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 15:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 16:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

package ru.myspar.proloyalty.orders.impl.screens.specific.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m21.dxjokdxxww;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.components.payment.api.models.SbpRecurringBankAppModel;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.proloyalty.payment.api.PaymentMethodResultHelper;
import ru.myspar.proloyalty.payment.api.WebViewPaymentResultHelper;
import ru.myspar.proloyalty.sbp_recurring.api.model.BankModel;
import ru.myspar.proloyalty.tipsorder.api.model.TipsOrderArgs;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final vw1.iobyxmoadg f99049agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f99050btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final xo0.iobyxmoadg f99051draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final gv1.iobyxmoadg f99052gtknphoqwx;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final draadjrbmk f99053kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final rg1.iobyxmoadg f99054ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final bl1.iobyxmoadg f99055oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final PaymentMethodResultHelper f99056rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final WebViewPaymentResultHelper f99057vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ul1.iobyxmoadg f99058wflxmlrfwp;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final draadjrbmk f99059zdlpuopuiu;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2368iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f99060iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f99062yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f99063zdlpuopuiu;

        C2368iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f99062yggfygwlhe = obj;
            this.f99060iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f99065zdlpuopuiu;

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
            int i13 = this.f99065zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.kcexrzcfyt kcexrzcfytVar = ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.kcexrzcfyt.f98934iobyxmoadg;
                this.f99065zdlpuopuiu = 1;
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
        int f99067zdlpuopuiu;

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
            int i13 = this.f99067zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.esjtqupxsv esjtqupxsvVar = ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.esjtqupxsv.f98928iobyxmoadg;
                this.f99067zdlpuopuiu = 1;
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
        int f99069zdlpuopuiu;

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
            int i13 = this.f99069zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.jyumaefscl jyumaefsclVar = ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.jyumaefscl.f98933iobyxmoadg;
                this.f99069zdlpuopuiu = 1;
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
    public iobyxmoadg(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, jg1.gxszxtbevo stateToUiModelMapper, q41.iobyxmoadg resourcesManager, gv1.iobyxmoadg tipsOrderFeatureApi, xo0.iobyxmoadg catalogFeatureApi, ul1.iobyxmoadg rateOrderFeatureApi, vw1.iobyxmoadg webViewScreenFeatureApi, rg1.iobyxmoadg paymentFeatureApi, PaymentMethodResultHelper paymentMethodResultHelper, WebViewPaymentResultHelper webViewPaymentResultHelper, bl1.iobyxmoadg feedbackFeatureApi) {
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
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentMethodResultHelper, "paymentMethodResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(webViewPaymentResultHelper, "webViewPaymentResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feedbackFeatureApi, "feedbackFeatureApi");
        this.f99050btonecajqb = resourcesManager;
        this.f99052gtknphoqwx = tipsOrderFeatureApi;
        this.f99051draadjrbmk = catalogFeatureApi;
        this.f99058wflxmlrfwp = rateOrderFeatureApi;
        this.f99049agtfadlqog = webViewScreenFeatureApi;
        this.f99054ojitshcjhn = paymentFeatureApi;
        this.f99056rgvfuqvkyq = paymentMethodResultHelper;
        this.f99057vdvldrhtss = webViewPaymentResultHelper;
        this.f99055oxmwwwfdhm = feedbackFeatureApi;
        this.f99053kcexrzcfyt = stateToUiModelMapper;
        this.f99059zdlpuopuiu = new draadjrbmk() { // from class: fg1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.orders.impl.screens.specific.presentation.iobyxmoadg.ulzqkzuiru((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.f99056rgvfuqvkyq.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new ppxfxbqfkf(null), 3, null);
        } else {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new zoijcleaow(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jlmebxxoox(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.f99057vdvldrhtss.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new wkgbmnqykc(null), 3, null);
        }
    }

    private final void ribwqtqdhb() {
        i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
        iobyxmoadgVar.oxmwwwfdhm().eablkybsjg(null);
        i21.iobyxmoadg.iozdgvuglv(iobyxmoadgVar, MainTab.CART, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc ulzqkzuiru(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf ppxfxbqfkfVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.iobyxmoadg) {
            return new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.iobyxmoadg(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.zoijcleaow.f99099iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.ppxfxbqfkf.f98941iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.C2369ppxfxbqfkf.f99091iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.C2364wkgbmnqykc.f98947iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.wkgbmnqykc.f99096iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.eablkybsjg.f98927iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.draadjrbmk.f99075iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.draadjrbmk.f98925iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.agtfadlqog.f99072iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.agtfadlqog.f98921iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.ojitshcjhn.f99088iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.ojitshcjhn.f98938iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.rgvfuqvkyq.f99092iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.rgvfuqvkyq.f98942iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.oxmwwwfdhm) {
            ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.oxmwwwfdhm oxmwwwfdhmVar = (ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.oxmwwwfdhm) ppxfxbqfkfVar;
            return new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.vdvldrhtss(oxmwwwfdhmVar.iobyxmoadg(), oxmwwwfdhmVar.zoijcleaow());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.vdvldrhtss.f99093iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.oxmwwwfdhm.f98939iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.kcexrzcfyt.f99085iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.zdlpuopuiu.f98949iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.jyumaefscl.f99084iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.iwizpuwonk.f98932iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.esjtqupxsv.f99078iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.lereixgezr.f98935iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.yggfygwlhe.f99097iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.jyumaefscl.f98933iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.zdlpuopuiu) {
            return new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.yggfygwlhe(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.zdlpuopuiu) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.nufgyqmvbu.f99087iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.nufgyqmvbu.f98937iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.dxjokdxxww.f99076iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.dxjokdxxww.f98926iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.gxszxtbevo.f99080iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.zoijcleaow.f98950iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.cqumvgiudr.f99074iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.pmvmpeiblj.f98940iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.lqeggnwhkg.f99086iobyxmoadg)) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.lqeggnwhkg.f98936iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.btonecajqb) {
            return new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.btonecajqb(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.btonecajqb) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.iwizpuwonk) {
            ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.iwizpuwonk iwizpuwonkVar = (ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.iwizpuwonk) ppxfxbqfkfVar;
            return new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.cqumvgiudr(iwizpuwonkVar.iobyxmoadg(), iwizpuwonkVar.zoijcleaow());
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp) {
            ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp) ppxfxbqfkfVar;
            return new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.wflxmlrfwp(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.gtknphoqwx) {
            return new ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.gtknphoqwx(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.gtknphoqwx) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.eablkybsjg) {
            return ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc.gxszxtbevo.f98930iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99053kcexrzcfyt;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99059zdlpuopuiu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C2368iobyxmoadg c2368iobyxmoadg;
        if (gxszxtbevoVar instanceof C2368iobyxmoadg) {
            c2368iobyxmoadg = (C2368iobyxmoadg) gxszxtbevoVar;
            int i13 = c2368iobyxmoadg.f99060iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2368iobyxmoadg.f99060iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2368iobyxmoadg = new C2368iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2368iobyxmoadg = new C2368iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2368iobyxmoadg.f99062yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (c2368iobyxmoadg.f99060iwizpuwonk) {
            case 0:
                zdlpuopuiu.zoijcleaow(obj);
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.kcexrzcfyt) {
                    Object dxjokdxxwwVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.dxjokdxxww(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.kcexrzcfyt) eablkybsjgVar).iobyxmoadg());
                    c2368iobyxmoadg.f99060iwizpuwonk = 1;
                    if (cllcsxoeiz(dxjokdxxwwVar, c2368iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.iwizpuwonk) {
                    Object gtknphoqwxVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.gtknphoqwx(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.iwizpuwonk) eablkybsjgVar).iobyxmoadg());
                    c2368iobyxmoadg.f99060iwizpuwonk = 2;
                    if (cllcsxoeiz(gtknphoqwxVar, c2368iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.lereixgezr) {
                    Object gtknphoqwxVar2 = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.gtknphoqwx(this.f99050btonecajqb.getString(vk0.lqeggnwhkg.proloyalty_order_edit_canceled, ((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.lereixgezr) eablkybsjgVar).iobyxmoadg()));
                    c2368iobyxmoadg.f99060iwizpuwonk = 3;
                    if (cllcsxoeiz(gtknphoqwxVar2, c2368iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.ppxfxbqfkf) {
                    Object zoijcleaowVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.zoijcleaow(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
                    c2368iobyxmoadg.f99060iwizpuwonk = 4;
                    if (cllcsxoeiz(zoijcleaowVar, c2368iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.wkgbmnqykc) {
                    Object ppxfxbqfkfVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.ppxfxbqfkf(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg());
                    c2368iobyxmoadg.f99060iwizpuwonk = 5;
                    if (cllcsxoeiz(ppxfxbqfkfVar, c2368iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.C2359eablkybsjg.f98723iobyxmoadg)) {
                    Object obj2 = ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.btonecajqb.f99101iobyxmoadg;
                    c2368iobyxmoadg.f99060iwizpuwonk = 6;
                    if (cllcsxoeiz(obj2, c2368iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.vdvldrhtss.f98746iobyxmoadg)) {
                    Object obj3 = ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.eablkybsjg.f99105iobyxmoadg;
                    c2368iobyxmoadg.f99060iwizpuwonk = 7;
                    if (cllcsxoeiz(obj3, c2368iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.iobyxmoadg.f98728iobyxmoadg)) {
                    i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
                } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.gxszxtbevo) {
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(yggfygwlhe.zoijcleaow(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()));
                } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.lqeggnwhkg) {
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.dxjokdxxww(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.dxjokdxxww.f98722iobyxmoadg)) {
                    ribwqtqdhb();
                } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.btonecajqb) {
                    m9.wkgbmnqykc wkgbmnqykcVarZoijcleaow = this.f99054ojitshcjhn.zoijcleaow(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.btonecajqb) eablkybsjgVar).iobyxmoadg());
                    i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
                    iobyxmoadgVar.oxmwwwfdhm().wkgbmnqykc(this.f99056rgvfuqvkyq.zoijcleaow(), new l9.draadjrbmk() { // from class: fg1.zoijcleaow
                        @Override // l9.draadjrbmk
                        public final void iobyxmoadg(Object obj4) {
                            ru.myspar.proloyalty.orders.impl.screens.specific.presentation.iobyxmoadg.crxdokpmqz(this.f33811iobyxmoadg, obj4);
                        }
                    });
                    iobyxmoadgVar.oxmwwwfdhm().lqeggnwhkg(wkgbmnqykcVarZoijcleaow);
                } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.gtknphoqwx) {
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f99058wflxmlrfwp.zoijcleaow(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()));
                } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.draadjrbmk) {
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f99058wflxmlrfwp.iobyxmoadg(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.draadjrbmk) eablkybsjgVar).iobyxmoadg()));
                } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.wflxmlrfwp) {
                    i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f99051draadjrbmk.gxszxtbevo(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg()));
                } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.ojitshcjhn) {
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f99049agtfadlqog.wkgbmnqykc(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.ojitshcjhn) eablkybsjgVar).iobyxmoadg().getOrderId()));
                } else {
                    if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.zdlpuopuiu) {
                        Object obj4 = ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.gxszxtbevo.f99107iobyxmoadg;
                        c2368iobyxmoadg.f99060iwizpuwonk = 8;
                        if (cllcsxoeiz(obj4, c2368iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.agtfadlqog) {
                        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.kcexrzcfyt());
                    } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.nufgyqmvbu) {
                        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(bl1.iobyxmoadg.zoijcleaow(this.f99055oxmwwwfdhm, null, 1, null));
                    } else {
                        if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.pmvmpeiblj) {
                            Object agtfadlqogVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.agtfadlqog(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.pmvmpeiblj) eablkybsjgVar).iobyxmoadg());
                            c2368iobyxmoadg.f99060iwizpuwonk = 9;
                            if (cllcsxoeiz(agtfadlqogVar, c2368iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.cqumvgiudr) {
                            ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.cqumvgiudr cqumvgiudrVar = (ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.cqumvgiudr) eablkybsjgVar;
                            Object draadjrbmkVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.draadjrbmk(cqumvgiudrVar.zoijcleaow(), cqumvgiudrVar.iobyxmoadg());
                            c2368iobyxmoadg.f99060iwizpuwonk = 10;
                            if (cllcsxoeiz(draadjrbmkVar, c2368iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.yggfygwlhe) {
                            ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.yggfygwlhe yggfygwlheVar = (ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.yggfygwlhe) eablkybsjgVar;
                            Object lqeggnwhkgVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.lqeggnwhkg(yggfygwlheVar.zoijcleaow(), yggfygwlheVar.iobyxmoadg());
                            c2368iobyxmoadg.f99060iwizpuwonk = 11;
                            if (cllcsxoeiz(lqeggnwhkgVar, c2368iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv) {
                            ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv esjtqupxsvVar = (ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.esjtqupxsv) eablkybsjgVar;
                            Object wflxmlrfwpVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.wflxmlrfwp(esjtqupxsvVar.zoijcleaow(), esjtqupxsvVar.iobyxmoadg());
                            c2368iobyxmoadg.f99060iwizpuwonk = 12;
                            if (cllcsxoeiz(wflxmlrfwpVar, c2368iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.zoijcleaow) {
                            Object iobyxmoadgVar2 = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.iobyxmoadg(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
                            c2368iobyxmoadg.f99060iwizpuwonk = 13;
                            if (cllcsxoeiz(iobyxmoadgVar2, c2368iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.rgvfuqvkyq) {
                            ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.rgvfuqvkyq rgvfuqvkyqVar = (ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.rgvfuqvkyq) eablkybsjgVar;
                            Object c2370wkgbmnqykc = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.C2370wkgbmnqykc(rgvfuqvkyqVar.zoijcleaow(), rgvfuqvkyqVar.iobyxmoadg());
                            c2368iobyxmoadg.f99060iwizpuwonk = 14;
                            if (cllcsxoeiz(c2370wkgbmnqykc, c2368iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.oxmwwwfdhm) {
                            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f99052gtknphoqwx.iobyxmoadg(new TipsOrderArgs(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.oxmwwwfdhm) eablkybsjgVar).iobyxmoadg())));
                        } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.zynmafqrjb) {
                            List<SbpRecurringBankAppModel> listIobyxmoadg = ((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.zynmafqrjb) eablkybsjgVar).iobyxmoadg();
                            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
                            for (SbpRecurringBankAppModel sbpRecurringBankAppModel : listIobyxmoadg) {
                                arrayList.add(new BankModel(sbpRecurringBankAppModel.getBankName(), sbpRecurringBankAppModel.getLogoUrl(), sbpRecurringBankAppModel.getSchema(), sbpRecurringBankAppModel.getPackageName()));
                            }
                            Object ojitshcjhnVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.ojitshcjhn(arrayList);
                            c2368iobyxmoadg.f99063zdlpuopuiu = ojitshcjhnVar;
                            c2368iobyxmoadg.f99060iwizpuwonk = 15;
                            if (cllcsxoeiz(ojitshcjhnVar, c2368iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else {
                            if (!(eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.istkbnxepw)) {
                                if (!(eablkybsjgVar instanceof ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.jyumaefscl)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.jyumaefscl jyumaefsclVar = (ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.jyumaefscl) eablkybsjgVar;
                                Object nufgyqmvbuVar = new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.nufgyqmvbu(jyumaefsclVar.ppxfxbqfkf(), jyumaefsclVar.iobyxmoadg(), jyumaefsclVar.wkgbmnqykc(), jyumaefsclVar.zoijcleaow());
                                c2368iobyxmoadg.f99060iwizpuwonk = 16;
                                if (cllcsxoeiz(nufgyqmvbuVar, c2368iobyxmoadg) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                return wwaezpbzkn.f37140iobyxmoadg;
                            }
                            i21.iobyxmoadg iobyxmoadgVar3 = i21.iobyxmoadg.f41720iobyxmoadg;
                            iobyxmoadgVar3.oxmwwwfdhm().wkgbmnqykc(this.f99057vdvldrhtss.zoijcleaow(), new l9.draadjrbmk() { // from class: fg1.ppxfxbqfkf
                                @Override // l9.draadjrbmk
                                public final void iobyxmoadg(Object obj5) {
                                    ru.myspar.proloyalty.orders.impl.screens.specific.presentation.iobyxmoadg.jlmebxxoox(this.f33759iobyxmoadg, obj5);
                                }
                            });
                            iobyxmoadgVar3.oxmwwwfdhm().lqeggnwhkg(this.f99054ojitshcjhn.ppxfxbqfkf(((ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg.istkbnxepw) eablkybsjgVar).iobyxmoadg()));
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

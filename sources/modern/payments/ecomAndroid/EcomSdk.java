package modern.payments.ecomAndroid;

import android.content.Context;
import android.content.Intent;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mg.zoijcleaow;
import modern.payments.ExtensionKt;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig;
import modern.payments.ecomAndroid.api.EcomSdkSetupConfig;
import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager;
import modern.payments.ecomAndroid.di.component.DaggerEcomSdkFlowComponent;
import modern.payments.ecomAndroid.di.component.EcomSdkFlowComponent;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.domain.externalMetrics.ExternalMetricsManager;
import modern.payments.ecomAndroid.domain.model.MerchantInitialDataKt;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.tracker.Tracker;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.ikoacuggdj;
import pj.skhdrjzrfn;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 @2\u00020\u0001:\u0001@B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0011\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Lmodern/payments/ecomAndroid/EcomSdk;", "", "<init>", "()V", "Lgg/wwaezpbzkn;", "clearCustomCoroutineScope", "initCustomCoroutineScope", "startCollectingMetricsForMerchant", "Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "config", "initSdkFlowComponent", "(Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;)V", "initPaymentFlowSubcomponent", "Landroid/content/Context;", "context", "launchEcomScenario", "(Landroid/content/Context;)V", "ecomSdkSetupConfig", "Lgg/kcexrzcfyt;", "setup-IoAF18A", "(Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;)Ljava/lang/Object;", "setup", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "ecomSdkMerchantOptionsConfig", "pay", "(Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;)V", "Lmodern/payments/ecomAndroid/domain/externalMetrics/ExternalMetricsManager;", "externalMetricsManager", "Lmodern/payments/ecomAndroid/domain/externalMetrics/ExternalMetricsManager;", "getExternalMetricsManager$ecomAndroid_release", "()Lmodern/payments/ecomAndroid/domain/externalMetrics/ExternalMetricsManager;", "setExternalMetricsManager$ecomAndroid_release", "(Lmodern/payments/ecomAndroid/domain/externalMetrics/ExternalMetricsManager;)V", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "getConfigRepository$ecomAndroid_release", "()Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "setConfigRepository$ecomAndroid_release", "(Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;)V", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "merchantDataProvider", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "getMerchantDataProvider$ecomAndroid_release", "()Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "setMerchantDataProvider$ecomAndroid_release", "(Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;)V", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "getMerchantAnalyticRepository$ecomAndroid_release", "()Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "setMerchantAnalyticRepository$ecomAndroid_release", "(Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;)V", "Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;", "merchantAnalyticManager", "Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;", "getMerchantAnalyticManager$ecomAndroid_release", "()Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;", "setMerchantAnalyticManager$ecomAndroid_release", "(Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;)V", "Lpj/cllcsxoeiz;", "customScope", "Lpj/cllcsxoeiz;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomSdk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile EcomSdkFlowComponent ecomSdkFlowComponent;
    private static volatile EcomSdk instance;
    private static volatile PaymentFlowSubcomponent paymentFlowSubcomponent;
    public ConfigRepository configRepository;
    private cllcsxoeiz customScope;
    public ExternalMetricsManager externalMetricsManager;
    public MerchantAnalyticManager merchantAnalyticManager;
    public MerchantAnalyticRepository merchantAnalyticRepository;
    public MerchantDataProvider merchantDataProvider;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/EcomSdk$Companion;", "", "()V", "ecomSdkFlowComponent", "Lmodern/payments/ecomAndroid/di/component/EcomSdkFlowComponent;", "getEcomSdkFlowComponent$ecomAndroid_release", "()Lmodern/payments/ecomAndroid/di/component/EcomSdkFlowComponent;", "setEcomSdkFlowComponent$ecomAndroid_release", "(Lmodern/payments/ecomAndroid/di/component/EcomSdkFlowComponent;)V", "instance", "Lmodern/payments/ecomAndroid/EcomSdk;", "paymentFlowSubcomponent", "Lmodern/payments/ecomAndroid/di/component/PaymentFlowSubcomponent;", "getPaymentFlowSubcomponent$ecomAndroid_release", "()Lmodern/payments/ecomAndroid/di/component/PaymentFlowSubcomponent;", "setPaymentFlowSubcomponent$ecomAndroid_release", "(Lmodern/payments/ecomAndroid/di/component/PaymentFlowSubcomponent;)V", "getInstance", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EcomSdkFlowComponent getEcomSdkFlowComponent$ecomAndroid_release() {
            return EcomSdk.ecomSdkFlowComponent;
        }

        public final synchronized EcomSdk getInstance() {
            EcomSdk ecomSdk;
            ecomSdk = EcomSdk.instance;
            if (ecomSdk == null) {
                EcomSdk.instance = new EcomSdk(null);
                ecomSdk = EcomSdk.instance;
                zdlpuopuiu.lqeggnwhkg(ecomSdk);
            }
            return ecomSdk;
        }

        public final PaymentFlowSubcomponent getPaymentFlowSubcomponent$ecomAndroid_release() {
            return EcomSdk.paymentFlowSubcomponent;
        }

        public final void setEcomSdkFlowComponent$ecomAndroid_release(EcomSdkFlowComponent ecomSdkFlowComponent) {
            EcomSdk.ecomSdkFlowComponent = ecomSdkFlowComponent;
        }

        public final void setPaymentFlowSubcomponent$ecomAndroid_release(PaymentFlowSubcomponent paymentFlowSubcomponent) {
            EcomSdk.paymentFlowSubcomponent = paymentFlowSubcomponent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.EcomSdk$startCollectingMetricsForMerchant$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.EcomSdk$startCollectingMetricsForMerchant$1", f = "EcomSdk.kt", l = {85}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomSdk.this.new AnonymousClass1(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticManager merchantAnalyticManager$ecomAndroid_release = EcomSdk.this.getMerchantAnalyticManager$ecomAndroid_release();
                tg.draadjrbmk metricCallback = EcomSdk.this.getConfigRepository$ecomAndroid_release().getEcomSdkSetupConfig().getMetricCallback();
                this.label = 1;
                if (merchantAnalyticManager$ecomAndroid_release.collectMetrics(metricCallback, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ EcomSdk(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private final void clearCustomCoroutineScope() {
        cllcsxoeiz cllcsxoeizVar = this.customScope;
        if (cllcsxoeizVar != null) {
            dsvhmnatus.eablkybsjg(cllcsxoeizVar, null, 1, null);
        }
        this.customScope = null;
    }

    private final void initCustomCoroutineScope() {
        clearCustomCoroutineScope();
        this.customScope = dsvhmnatus.iobyxmoadg(skhdrjzrfn.zoijcleaow(null, 1, null));
    }

    private final synchronized void initPaymentFlowSubcomponent() {
        PaymentFlowSubcomponent.Builder paymentFlowSubcomponent2;
        try {
            if (paymentFlowSubcomponent == null) {
                EcomSdkFlowComponent ecomSdkFlowComponent2 = ecomSdkFlowComponent;
                paymentFlowSubcomponent = (ecomSdkFlowComponent2 == null || (paymentFlowSubcomponent2 = ecomSdkFlowComponent2.getPaymentFlowSubcomponent()) == null) ? null : paymentFlowSubcomponent2.build();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void initSdkFlowComponent(EcomSdkSetupConfig config) {
        if (ecomSdkFlowComponent == null) {
            Tracker.Companion companion = Tracker.INSTANCE;
            companion.getInstance().initialize(config.getContext());
            ecomSdkFlowComponent = DaggerEcomSdkFlowComponent.builder().trackerComponent(companion.getTrackerComponent()).context(config.getContext()).build();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    private final void launchEcomScenario(Context context) {
        context.startActivity(new Intent(context, (Class<?>) EcomActivity.class));
    }

    private final void startCollectingMetricsForMerchant() {
        cllcsxoeiz cllcsxoeizVar = this.customScope;
        if (cllcsxoeizVar != null) {
            pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, ikoacuggdj.zoijcleaow(), null, new AnonymousClass1(null), 2, null);
        }
    }

    public final ConfigRepository getConfigRepository$ecomAndroid_release() {
        ConfigRepository configRepository = this.configRepository;
        if (configRepository != null) {
            return configRepository;
        }
        zdlpuopuiu.pmvmpeiblj("configRepository");
        return null;
    }

    public final ExternalMetricsManager getExternalMetricsManager$ecomAndroid_release() {
        ExternalMetricsManager externalMetricsManager = this.externalMetricsManager;
        if (externalMetricsManager != null) {
            return externalMetricsManager;
        }
        zdlpuopuiu.pmvmpeiblj("externalMetricsManager");
        return null;
    }

    public final MerchantAnalyticManager getMerchantAnalyticManager$ecomAndroid_release() {
        MerchantAnalyticManager merchantAnalyticManager = this.merchantAnalyticManager;
        if (merchantAnalyticManager != null) {
            return merchantAnalyticManager;
        }
        zdlpuopuiu.pmvmpeiblj("merchantAnalyticManager");
        return null;
    }

    public final MerchantAnalyticRepository getMerchantAnalyticRepository$ecomAndroid_release() {
        MerchantAnalyticRepository merchantAnalyticRepository = this.merchantAnalyticRepository;
        if (merchantAnalyticRepository != null) {
            return merchantAnalyticRepository;
        }
        zdlpuopuiu.pmvmpeiblj("merchantAnalyticRepository");
        return null;
    }

    public final MerchantDataProvider getMerchantDataProvider$ecomAndroid_release() {
        MerchantDataProvider merchantDataProvider = this.merchantDataProvider;
        if (merchantDataProvider != null) {
            return merchantDataProvider;
        }
        zdlpuopuiu.pmvmpeiblj("merchantDataProvider");
        return null;
    }

    public final void pay(EcomSdkMerchantOptionsConfig ecomSdkMerchantOptionsConfig) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(ecomSdkMerchantOptionsConfig, "ecomSdkMerchantOptionsConfig");
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            initPaymentFlowSubcomponent();
            getExternalMetricsManager$ecomAndroid_release().startCollectingMetrics();
            getConfigRepository$ecomAndroid_release().setEcomSdkMerchantOptionsConfig(ecomSdkMerchantOptionsConfig);
            launchEcomScenario(getConfigRepository$ecomAndroid_release().getEcomSdkMerchantOptions().getContext());
            getMerchantDataProvider$ecomAndroid_release().updateMerchant(MerchantInitialDataKt.toMerchantData(ecomSdkMerchantOptionsConfig));
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            ecomSdkMerchantOptionsConfig.getCallback().invoke(new EcomSdkMerchantOptionsConfig.EcomSdkResult.Error(null, null, "Error when starting payment : " + thDxjokdxxww, null, null, 27, null));
        }
    }

    public final void setConfigRepository$ecomAndroid_release(ConfigRepository configRepository) {
        zdlpuopuiu.btonecajqb(configRepository, "<set-?>");
        this.configRepository = configRepository;
    }

    public final void setExternalMetricsManager$ecomAndroid_release(ExternalMetricsManager externalMetricsManager) {
        zdlpuopuiu.btonecajqb(externalMetricsManager, "<set-?>");
        this.externalMetricsManager = externalMetricsManager;
    }

    public final void setMerchantAnalyticManager$ecomAndroid_release(MerchantAnalyticManager merchantAnalyticManager) {
        zdlpuopuiu.btonecajqb(merchantAnalyticManager, "<set-?>");
        this.merchantAnalyticManager = merchantAnalyticManager;
    }

    public final void setMerchantAnalyticRepository$ecomAndroid_release(MerchantAnalyticRepository merchantAnalyticRepository) {
        zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "<set-?>");
        this.merchantAnalyticRepository = merchantAnalyticRepository;
    }

    public final void setMerchantDataProvider$ecomAndroid_release(MerchantDataProvider merchantDataProvider) {
        zdlpuopuiu.btonecajqb(merchantDataProvider, "<set-?>");
        this.merchantDataProvider = merchantDataProvider;
    }

    /* JADX INFO: renamed from: setup-IoAF18A, reason: not valid java name */
    public final Object m12setupIoAF18A(EcomSdkSetupConfig ecomSdkSetupConfig) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(ecomSdkSetupConfig, "ecomSdkSetupConfig");
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            initCustomCoroutineScope();
            initSdkFlowComponent(ecomSdkSetupConfig);
            EcomSdkFlowComponent ecomSdkFlowComponent2 = ecomSdkFlowComponent;
            if (ecomSdkFlowComponent2 != null) {
                ecomSdkFlowComponent2.inject(this);
            }
            gf.iobyxmoadg.iobyxmoadg(ecomSdkSetupConfig.getContext());
            ExtensionKt.processStageMode(ecomSdkSetupConfig.getStage());
            getConfigRepository$ecomAndroid_release().setEcomSdkSetupConfig(ecomSdkSetupConfig);
            startCollectingMetricsForMerchant();
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            ecomSdkSetupConfig.getCallback().invoke(Boolean.TRUE);
            cllcsxoeiz cllcsxoeizVar = this.customScope;
            if (cllcsxoeizVar != null) {
                pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, ikoacuggdj.zoijcleaow(), null, new EcomSdk$setup$1$2$1(this, null), 2, null);
            }
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            ecomSdkSetupConfig.getCallback().invoke(Boolean.FALSE);
            cllcsxoeiz cllcsxoeizVar2 = this.customScope;
            if (cllcsxoeizVar2 != null) {
                pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar2, ikoacuggdj.zoijcleaow(), null, new EcomSdk$setup$1$3$1(this, thDxjokdxxww, null), 2, null);
            }
        }
        return objWkgbmnqykc;
    }

    private EcomSdk() {
    }
}

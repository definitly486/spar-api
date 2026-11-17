package modern.payments.ecomAndroid.di.module;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.externalMetrics.ExternalMetricsManager;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkFlowModule_ProvideExternalMetricsManagerFactory implements wkgbmnqykc {
    private final SdkFlowModule module;

    public SdkFlowModule_ProvideExternalMetricsManagerFactory(SdkFlowModule sdkFlowModule) {
        this.module = sdkFlowModule;
    }

    public static SdkFlowModule_ProvideExternalMetricsManagerFactory create(SdkFlowModule sdkFlowModule) {
        return new SdkFlowModule_ProvideExternalMetricsManagerFactory(sdkFlowModule);
    }

    public static ExternalMetricsManager provideExternalMetricsManager(SdkFlowModule sdkFlowModule) {
        return (ExternalMetricsManager) dxjokdxxww.eablkybsjg(sdkFlowModule.provideExternalMetricsManager());
    }

    @Override // fg.iobyxmoadg
    public ExternalMetricsManager get() {
        return provideExternalMetricsManager(this.module);
    }
}

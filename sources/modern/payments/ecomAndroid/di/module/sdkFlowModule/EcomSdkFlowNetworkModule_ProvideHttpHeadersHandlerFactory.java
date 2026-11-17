package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.util.ResourceManager;
import modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler;
import modern.payments.ecomAndroid.util.headersHandler.HttpHeadersHandler;
import modern.payments.ecomAndroid.util.headersHandler.headerBuilder.B3HeaderBuilder;
import modern.payments.ecomAndroid.util.headersHandler.headerBuilder.XPodStickyHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSdkFlowNetworkModule_ProvideHttpHeadersHandlerFactory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg b3HeaderBuilderProvider;
    private final iobyxmoadg ipAddressProvider;
    private final iobyxmoadg merchantDataProvider;
    private final EcomSdkFlowNetworkModule module;
    private final iobyxmoadg resourceManagerProvider;
    private final iobyxmoadg setCookieHandlerProvider;
    private final iobyxmoadg xPodStickyHandlerProvider;

    public EcomSdkFlowNetworkModule_ProvideHttpHeadersHandlerFactory(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7) {
        this.module = ecomSdkFlowNetworkModule;
        this.b3HeaderBuilderProvider = iobyxmoadgVar;
        this.resourceManagerProvider = iobyxmoadgVar2;
        this.setCookieHandlerProvider = iobyxmoadgVar3;
        this.merchantDataProvider = iobyxmoadgVar4;
        this.appDataRepositoryProvider = iobyxmoadgVar5;
        this.xPodStickyHandlerProvider = iobyxmoadgVar6;
        this.ipAddressProvider = iobyxmoadgVar7;
    }

    public static EcomSdkFlowNetworkModule_ProvideHttpHeadersHandlerFactory create(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7) {
        return new EcomSdkFlowNetworkModule_ProvideHttpHeadersHandlerFactory(ecomSdkFlowNetworkModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7);
    }

    public static HttpHeadersHandler provideHttpHeadersHandler(EcomSdkFlowNetworkModule ecomSdkFlowNetworkModule, B3HeaderBuilder b3HeaderBuilder, ResourceManager resourceManager, SetCookieHandler setCookieHandler, MerchantDataProvider merchantDataProvider, AppDataRepository appDataRepository, XPodStickyHandler xPodStickyHandler, IpAddressProvider ipAddressProvider) {
        return (HttpHeadersHandler) dxjokdxxww.eablkybsjg(ecomSdkFlowNetworkModule.provideHttpHeadersHandler(b3HeaderBuilder, resourceManager, setCookieHandler, merchantDataProvider, appDataRepository, xPodStickyHandler, ipAddressProvider));
    }

    @Override // fg.iobyxmoadg
    public HttpHeadersHandler get() {
        return provideHttpHeadersHandler(this.module, (B3HeaderBuilder) this.b3HeaderBuilderProvider.get(), (ResourceManager) this.resourceManagerProvider.get(), (SetCookieHandler) this.setCookieHandlerProvider.get(), (MerchantDataProvider) this.merchantDataProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (XPodStickyHandler) this.xPodStickyHandlerProvider.get(), (IpAddressProvider) this.ipAddressProvider.get());
    }
}

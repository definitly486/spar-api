package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.util.clearSdkUtil.ClearSdkUtil;
import modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilModule_ProvideClearSdkUtilFactory implements wkgbmnqykc {
    private final iobyxmoadg ipAddressProvider;
    private final iobyxmoadg merchantDataProvider;
    private final UtilModule module;
    private final iobyxmoadg setCookieHandlerProvider;

    public UtilModule_ProvideClearSdkUtilFactory(UtilModule utilModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        this.module = utilModule;
        this.setCookieHandlerProvider = iobyxmoadgVar;
        this.ipAddressProvider = iobyxmoadgVar2;
        this.merchantDataProvider = iobyxmoadgVar3;
    }

    public static UtilModule_ProvideClearSdkUtilFactory create(UtilModule utilModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        return new UtilModule_ProvideClearSdkUtilFactory(utilModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static ClearSdkUtil provideClearSdkUtil(UtilModule utilModule, SetCookieHandler setCookieHandler, IpAddressProvider ipAddressProvider, MerchantDataProvider merchantDataProvider) {
        return (ClearSdkUtil) dxjokdxxww.eablkybsjg(utilModule.provideClearSdkUtil(setCookieHandler, ipAddressProvider, merchantDataProvider));
    }

    @Override // fg.iobyxmoadg
    public ClearSdkUtil get() {
        return provideClearSdkUtil(this.module, (SetCookieHandler) this.setCookieHandlerProvider.get(), (IpAddressProvider) this.ipAddressProvider.get(), (MerchantDataProvider) this.merchantDataProvider.get());
    }
}

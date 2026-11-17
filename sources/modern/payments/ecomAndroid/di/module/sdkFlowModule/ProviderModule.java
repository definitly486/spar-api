package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import kotlin.Metadata;
import modern.payments.ecomAndroid.data.provider.IpAddressProviderImpl;
import modern.payments.ecomAndroid.data.provider.MerchantDataProviderImpl;
import modern.payments.ecomAndroid.di.scope.SdkFlowScope;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/sdkFlowModule/ProviderModule;", "", "()V", "provideIpAddressProvider", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "provideMerchantDataProvider", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProviderModule {
    @SdkFlowScope
    public final IpAddressProvider provideIpAddressProvider() {
        return new IpAddressProviderImpl();
    }

    @SdkFlowScope
    public final MerchantDataProvider provideMerchantDataProvider() {
        return new MerchantDataProviderImpl();
    }
}

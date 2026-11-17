package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkErrorHandlerModule_ProvideOrderServiceErrorHandlerFactory implements wkgbmnqykc {
    private final NetworkErrorHandlerModule module;

    public NetworkErrorHandlerModule_ProvideOrderServiceErrorHandlerFactory(NetworkErrorHandlerModule networkErrorHandlerModule) {
        this.module = networkErrorHandlerModule;
    }

    public static NetworkErrorHandlerModule_ProvideOrderServiceErrorHandlerFactory create(NetworkErrorHandlerModule networkErrorHandlerModule) {
        return new NetworkErrorHandlerModule_ProvideOrderServiceErrorHandlerFactory(networkErrorHandlerModule);
    }

    public static NetworkErrorHandler<EcomApiError> provideOrderServiceErrorHandler(NetworkErrorHandlerModule networkErrorHandlerModule) {
        return (NetworkErrorHandler) dxjokdxxww.eablkybsjg(networkErrorHandlerModule.provideOrderServiceErrorHandler());
    }

    @Override // fg.iobyxmoadg
    public NetworkErrorHandler<EcomApiError> get() {
        return provideOrderServiceErrorHandler(this.module);
    }
}

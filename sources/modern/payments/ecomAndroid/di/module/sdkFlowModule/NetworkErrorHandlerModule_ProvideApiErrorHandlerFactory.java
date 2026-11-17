package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkErrorHandlerModule_ProvideApiErrorHandlerFactory implements wkgbmnqykc {
    private final NetworkErrorHandlerModule module;

    public NetworkErrorHandlerModule_ProvideApiErrorHandlerFactory(NetworkErrorHandlerModule networkErrorHandlerModule) {
        this.module = networkErrorHandlerModule;
    }

    public static NetworkErrorHandlerModule_ProvideApiErrorHandlerFactory create(NetworkErrorHandlerModule networkErrorHandlerModule) {
        return new NetworkErrorHandlerModule_ProvideApiErrorHandlerFactory(networkErrorHandlerModule);
    }

    public static NetworkErrorHandler<EcomApiError> provideApiErrorHandler(NetworkErrorHandlerModule networkErrorHandlerModule) {
        return (NetworkErrorHandler) dxjokdxxww.eablkybsjg(networkErrorHandlerModule.provideApiErrorHandler());
    }

    @Override // fg.iobyxmoadg
    public NetworkErrorHandler<EcomApiError> get() {
        return provideApiErrorHandler(this.module);
    }
}

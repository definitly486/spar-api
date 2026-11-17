package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkErrorHandlerModule_ProvideOkHttpErrorHandlerFactory implements wkgbmnqykc {
    private final NetworkErrorHandlerModule module;

    public NetworkErrorHandlerModule_ProvideOkHttpErrorHandlerFactory(NetworkErrorHandlerModule networkErrorHandlerModule) {
        this.module = networkErrorHandlerModule;
    }

    public static NetworkErrorHandlerModule_ProvideOkHttpErrorHandlerFactory create(NetworkErrorHandlerModule networkErrorHandlerModule) {
        return new NetworkErrorHandlerModule_ProvideOkHttpErrorHandlerFactory(networkErrorHandlerModule);
    }

    public static NetworkErrorHandler<Throwable> provideOkHttpErrorHandler(NetworkErrorHandlerModule networkErrorHandlerModule) {
        return (NetworkErrorHandler) dxjokdxxww.eablkybsjg(networkErrorHandlerModule.provideOkHttpErrorHandler());
    }

    @Override // fg.iobyxmoadg
    public NetworkErrorHandler<Throwable> get() {
        return provideOkHttpErrorHandler(this.module);
    }
}

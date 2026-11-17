package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import kotlin.Metadata;
import modern.payments.ecomAndroid.di.qualifier.errorHandler.ApiErrorHandler;
import modern.payments.ecomAndroid.di.qualifier.errorHandler.OkHttpErrorHandler;
import modern.payments.ecomAndroid.di.qualifier.errorHandler.OrderServiceErrorHandler;
import modern.payments.ecomAndroid.di.scope.SdkFlowScope;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.ApiErrorHandlerImpl;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/sdkFlowModule/NetworkErrorHandlerModule;", "", "()V", "provideApiErrorHandler", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "provideOkHttpErrorHandler", "", "provideOrderServiceErrorHandler", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NetworkErrorHandlerModule {
    @SdkFlowScope
    @ApiErrorHandler
    public final NetworkErrorHandler<EcomApiError> provideApiErrorHandler() {
        return new ApiErrorHandlerImpl();
    }

    @SdkFlowScope
    @OkHttpErrorHandler
    public final NetworkErrorHandler<Throwable> provideOkHttpErrorHandler() {
        return new OkHttpErrorHandlerImpl();
    }

    @SdkFlowScope
    @OrderServiceErrorHandler
    public final NetworkErrorHandler<EcomApiError> provideOrderServiceErrorHandler() {
        return new OrderServiceErrorHandlerImpl();
    }
}

package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.data.api.UnsafeCallEcomApi;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository;
import modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryModule_ProvideThreeDSecureRepositoryFactory implements wkgbmnqykc {
    private final iobyxmoadg apiErrorHandlerImplProvider;
    private final iobyxmoadg contextProvider;
    private final iobyxmoadg ecomMetricUtilProvider;
    private final iobyxmoadg ecomSdkOptionsRepositoryProvider;
    private final RepositoryModule module;
    private final iobyxmoadg okHttpErrorHandlerImplProvider;
    private final iobyxmoadg storageProvider;
    private final iobyxmoadg trackerProvider;
    private final iobyxmoadg unsafeCallEcomApiProvider;

    public RepositoryModule_ProvideThreeDSecureRepositoryFactory(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        this.module = repositoryModule;
        this.storageProvider = iobyxmoadgVar;
        this.unsafeCallEcomApiProvider = iobyxmoadgVar2;
        this.trackerProvider = iobyxmoadgVar3;
        this.okHttpErrorHandlerImplProvider = iobyxmoadgVar4;
        this.apiErrorHandlerImplProvider = iobyxmoadgVar5;
        this.ecomMetricUtilProvider = iobyxmoadgVar6;
        this.ecomSdkOptionsRepositoryProvider = iobyxmoadgVar7;
        this.contextProvider = iobyxmoadgVar8;
    }

    public static RepositoryModule_ProvideThreeDSecureRepositoryFactory create(RepositoryModule repositoryModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5, iobyxmoadg iobyxmoadgVar6, iobyxmoadg iobyxmoadgVar7, iobyxmoadg iobyxmoadgVar8) {
        return new RepositoryModule_ProvideThreeDSecureRepositoryFactory(repositoryModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7, iobyxmoadgVar8);
    }

    public static ThreeDSecureRepository provideThreeDSecureRepository(RepositoryModule repositoryModule, CustomSharedPreferences customSharedPreferences, UnsafeCallEcomApi unsafeCallEcomApi, ITracker iTracker, NetworkErrorHandler<Throwable> networkErrorHandler, NetworkErrorHandler<EcomApiError> networkErrorHandler2, EcomMetricUtil ecomMetricUtil, EcomSdkOptionsRepository ecomSdkOptionsRepository, Context context) {
        return (ThreeDSecureRepository) dxjokdxxww.eablkybsjg(repositoryModule.provideThreeDSecureRepository(customSharedPreferences, unsafeCallEcomApi, iTracker, networkErrorHandler, networkErrorHandler2, ecomMetricUtil, ecomSdkOptionsRepository, context));
    }

    @Override // fg.iobyxmoadg
    public ThreeDSecureRepository get() {
        return provideThreeDSecureRepository(this.module, (CustomSharedPreferences) this.storageProvider.get(), (UnsafeCallEcomApi) this.unsafeCallEcomApiProvider.get(), (ITracker) this.trackerProvider.get(), (NetworkErrorHandler) this.okHttpErrorHandlerImplProvider.get(), (NetworkErrorHandler) this.apiErrorHandlerImplProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get(), (EcomSdkOptionsRepository) this.ecomSdkOptionsRepositoryProvider.get(), (Context) this.contextProvider.get());
    }
}

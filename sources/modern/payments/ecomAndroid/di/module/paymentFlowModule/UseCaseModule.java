package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.DeactivateBindingUseCase;
import modern.payments.ecomAndroid.domain.useCase.DeactivateBindingUseCaseImpl;
import modern.payments.ecomAndroid.domain.useCase.Finish3dsMethodUseCase;
import modern.payments.ecomAndroid.domain.useCase.FinishPaymentUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetIpAddressUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCaseImpl;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCaseImpl;
import modern.payments.ecomAndroid.domain.useCase.initialData.GetLocalSessionIdUseCase;
import modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCase;
import modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCaseImpl;
import modern.payments.ecomAndroid.secureChapter.EncryptedDataHandler;
import modern.payments.ecomAndroid.util.jsonParamHelper.JsonParamHelperUtil;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J0\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J0\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\nH\u0007JP\u0010#\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007JH\u0010)\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0007¨\u0006/"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/UseCaseModule;", "", "()V", "provideDeactivateBindingUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/DeactivateBindingUseCase;", "appDataRepository", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "ecomApiRepository", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "stateHandler", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "tracker", "Lmodern/payments/tracker/ITracker;", "reducer", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "provideFinish3dsMethodUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/Finish3dsMethodUseCase;", "provideFinishPaymentUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/FinishPaymentUseCase;", "provideGetIpAddressUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/GetIpAddressUseCase;", "unsafeEcomApiRepository", "Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "ipAddressProvider", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "provideGetLocalSessionIdUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetLocalSessionIdUseCase;", "provideGetPaymentOrderUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentOrderUseCase;", "merchantDataProvider", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "jsonParamHelperUtil", "Lmodern/payments/ecomAndroid/util/jsonParamHelper/JsonParamHelperUtil;", "provideGetPaymentTokenUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentTokenUseCase;", "encryptedDataHandler", "Lmodern/payments/ecomAndroid/secureChapter/EncryptedDataHandler;", "merchantAnalyticRepository", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "provideGetSessionIdUseCaseImpl", "Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetSessionIdUseCase;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "configRepository", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UseCaseModule {
    public final DeactivateBindingUseCase provideDeactivateBindingUseCase(AppDataRepository appDataRepository, SafeEcomApiRepository ecomApiRepository, StateHandler stateHandler, ITracker tracker, Reducer reducer, EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        return new DeactivateBindingUseCaseImpl(appDataRepository, ecomApiRepository, stateHandler, tracker, reducer, optionsRepository);
    }

    public final Finish3dsMethodUseCase provideFinish3dsMethodUseCase(SafeEcomApiRepository ecomApiRepository, Reducer reducer, StateHandler stateHandler, ITracker tracker, EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        return new Finish3dsMethodUseCase(ecomApiRepository, reducer, stateHandler, tracker, optionsRepository);
    }

    public final FinishPaymentUseCase provideFinishPaymentUseCase(SafeEcomApiRepository ecomApiRepository, Reducer reducer, StateHandler stateHandler, ITracker tracker, EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        return new FinishPaymentUseCase(ecomApiRepository, reducer, stateHandler, tracker, optionsRepository);
    }

    public final GetIpAddressUseCase provideGetIpAddressUseCase(UnsafeEcomApiRepository unsafeEcomApiRepository, IpAddressProvider ipAddressProvider) {
        zdlpuopuiu.btonecajqb(unsafeEcomApiRepository, "unsafeEcomApiRepository");
        zdlpuopuiu.btonecajqb(ipAddressProvider, "ipAddressProvider");
        return new GetIpAddressUseCase(unsafeEcomApiRepository, ipAddressProvider);
    }

    public final GetLocalSessionIdUseCase provideGetLocalSessionIdUseCase(AppDataRepository appDataRepository) {
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        return new GetLocalSessionIdUseCase(appDataRepository);
    }

    public final GetPaymentOrderUseCase provideGetPaymentOrderUseCase(SafeEcomApiRepository ecomApiRepository, Reducer reducer, MerchantDataProvider merchantDataProvider, JsonParamHelperUtil jsonParamHelperUtil, StateHandler stateHandler) {
        zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        zdlpuopuiu.btonecajqb(jsonParamHelperUtil, "jsonParamHelperUtil");
        zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        return new GetPaymentOrderUseCaseImpl(ecomApiRepository, reducer, merchantDataProvider, jsonParamHelperUtil, stateHandler);
    }

    public final GetPaymentTokenUseCase provideGetPaymentTokenUseCase(SafeEcomApiRepository ecomApiRepository, Reducer reducer, MerchantDataProvider merchantDataProvider, StateHandler stateHandler, ITracker tracker, AppDataRepository appDataRepository, EncryptedDataHandler encryptedDataHandler, MerchantAnalyticRepository merchantAnalyticRepository, EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(encryptedDataHandler, "encryptedDataHandler");
        zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        return new GetPaymentTokenUseCaseImpl(ecomApiRepository, reducer, merchantDataProvider, stateHandler, tracker, appDataRepository, encryptedDataHandler, merchantAnalyticRepository, optionsRepository);
    }

    public final GetSessionIdUseCase provideGetSessionIdUseCaseImpl(UnsafeEcomApiRepository unsafeEcomApiRepository, SafeEcomApiRepository ecomApiRepository, Reducer reducer, MerchantDataProvider merchantDataProvider, StateHandler stateHandler, AppDataRepository appDataRepository, EcomMetricUtil ecomMetricUtil, ConfigRepository configRepository) {
        zdlpuopuiu.btonecajqb(unsafeEcomApiRepository, "unsafeEcomApiRepository");
        zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        return new GetSessionIdUseCaseImpl(ecomApiRepository, reducer, merchantDataProvider, stateHandler, appDataRepository, ecomMetricUtil, configRepository);
    }
}

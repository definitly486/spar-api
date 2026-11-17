package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.lereixgezr;
import modern.payments.ecomAndroid.di.qualifier.sslInteractor.CustomSslInteractor;
import modern.payments.ecomAndroid.di.scope.PaymentFlowScope;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.ssl.CustomSslInteractorImpl;
import modern.payments.ecomAndroid.util.ssl.SSLInteractor;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/PaymentFlowNetworkModule;", "", "<init>", "()V", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Llk/lereixgezr$iobyxmoadg;", "okHttpBuilder", "Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "sslInteractor", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;", "provideLazyNetworkModule", "(Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Llk/lereixgezr$iobyxmoadg;Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;Lmodern/payments/tracker/ITracker;)Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "provideCustomSslInteractor", "(Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;)Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentFlowNetworkModule {
    @PaymentFlowScope
    @CustomSslInteractor
    public final SSLInteractor provideCustomSslInteractor(ConfigRepository configRepository) {
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        return new CustomSslInteractorImpl(configRepository);
    }

    @PaymentFlowScope
    public final LazyNetworkModule provideLazyNetworkModule(EcomSdkOptionsRepository optionsRepository, lereixgezr.iobyxmoadg okHttpBuilder, @CustomSslInteractor SSLInteractor sslInteractor, ITracker tracker) {
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        zdlpuopuiu.btonecajqb(okHttpBuilder, "okHttpBuilder");
        zdlpuopuiu.btonecajqb(sslInteractor, "sslInteractor");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        return new LazyNetworkModule(optionsRepository, okHttpBuilder, sslInteractor, tracker);
    }
}

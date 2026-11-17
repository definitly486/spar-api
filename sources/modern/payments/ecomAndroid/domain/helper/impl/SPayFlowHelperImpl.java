package modern.payments.ecomAndroid.domain.helper.impl;

import android.app.Activity;
import android.app.Application;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ExtensionKt;
import modern.payments.ecomAndroid.api.EcomSPayMethod;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.data.api.SPayPaymentResult;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.helper.SPayFlowHelper;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.ITracker;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.api.SPayStage;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001d"}, d2 = {"Lmodern/payments/ecomAndroid/domain/helper/impl/SPayFlowHelperImpl;", "Lmodern/payments/ecomAndroid/domain/helper/SPayFlowHelper;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "Lspay/sdk/api/SPayMethod;", "toSPayMethod", "(Lmodern/payments/ecomAndroid/api/EcomSPayMethod;)Lspay/sdk/api/SPayMethod;", "Lspay/sdk/api/PaymentResult;", "paymentResult", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "processSPaymentResult", "(Lspay/sdk/api/PaymentResult;)Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "Landroid/app/Activity;", "context", "Lkotlin/Function1;", "Lgg/wwaezpbzkn;", "callback", "pay", "(Landroid/app/Activity;Ltg/draadjrbmk;)V", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SPayFlowHelperImpl implements SPayFlowHelper {
    private final ConfigRepository configRepository;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final ITracker tracker;

    public SPayFlowHelperImpl(ConfigRepository configRepository, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.configRepository = configRepository;
        this.tracker = tracker;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SPayPaymentResult processSPaymentResult(PaymentResult paymentResult) {
        ErrorEntity unknown;
        if (paymentResult instanceof PaymentResult.Cancel) {
            ITracker.DefaultImpls.track$default(this.tracker, "SDK SPay operation canceled (" + ((PaymentResult.Cancel) paymentResult).getLocalSessionId() + ')', null, ITracker.Priority.INFO, null, 10, null);
            return SPayPaymentResult.Canceled.INSTANCE;
        }
        if (!(paymentResult instanceof PaymentResult.Error)) {
            if (paymentResult instanceof PaymentResult.Processing) {
                ITracker.DefaultImpls.track$default(this.tracker, "SDK SPay operation processing: " + ((PaymentResult.Processing) paymentResult).getLocalSessionId(), null, ITracker.Priority.INFO, null, 10, null);
                return SPayPaymentResult.Processing.INSTANCE;
            }
            if (!(paymentResult instanceof PaymentResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ITracker.DefaultImpls.track$default(this.tracker, "SDK SPay operation success (" + ((PaymentResult.Success) paymentResult).getLocalSessionId() + ')', null, ITracker.Priority.INFO, null, 10, null);
            return SPayPaymentResult.Success.INSTANCE;
        }
        ITracker iTracker = this.tracker;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SDK SPay operation error: ");
        PaymentResult.Error error = (PaymentResult.Error) paymentResult;
        sb3.append(error.getMerchantError());
        sb3.append(", ");
        sb3.append(error.getLocalSessionId());
        ITracker.DefaultImpls.track$default(iTracker, sb3.toString(), null, null, null, 14, null);
        MerchantError merchantError = error.getMerchantError();
        if (merchantError instanceof MerchantError.NoInternetConnection) {
            MerchantError merchantError2 = error.getMerchantError();
            unknown = new ErrorEntity.SPayError.NoInternet(merchantError2 != null ? merchantError2.getDescription() : null);
        } else if (merchantError instanceof MerchantError.RequiredDataNotSent) {
            MerchantError merchantError3 = error.getMerchantError();
            unknown = new ErrorEntity.SPayError.RequiredDataNotSent(merchantError3 != null ? merchantError3.getDescription() : null);
        } else if (merchantError instanceof MerchantError.TimeoutException) {
            MerchantError merchantError4 = error.getMerchantError();
            unknown = new ErrorEntity.SPayError.Timeout(merchantError4 != null ? merchantError4.getDescription() : null);
        } else {
            MerchantError merchantError5 = error.getMerchantError();
            unknown = new ErrorEntity.SPayError.Unknown(merchantError5 != null ? merchantError5.getDescription() : null);
        }
        return new SPayPaymentResult.Error(new State.Error.DefaultException.WhilePayment(unknown, false, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SPayMethod toSPayMethod(EcomSPayMethod ecomSPayMethod) {
        if (zdlpuopuiu.eablkybsjg(ecomSPayMethod, EcomSPayMethod.WithBankInvoiceId.INSTANCE)) {
            return SPayMethod.WithBankInvoiceId.INSTANCE;
        }
        if (ecomSPayMethod instanceof EcomSPayMethod.WithBinding) {
            return new SPayMethod.WithBinding(((EcomSPayMethod.WithBinding) ecomSPayMethod).getBindingId());
        }
        if (zdlpuopuiu.eablkybsjg(ecomSPayMethod, EcomSPayMethod.WithBonuses.INSTANCE)) {
            return SPayMethod.WithBonuses.INSTANCE;
        }
        if (zdlpuopuiu.eablkybsjg(ecomSPayMethod, EcomSPayMethod.WithPartPay.INSTANCE)) {
            return SPayMethod.WithPartPay.INSTANCE;
        }
        if (zdlpuopuiu.eablkybsjg(ecomSPayMethod, EcomSPayMethod.WithPaymentAccount.INSTANCE)) {
            return SPayMethod.WithPaymentAccount.INSTANCE;
        }
        if (ecomSPayMethod instanceof EcomSPayMethod.WithPhoneNumber) {
            return SPayMethod.WithPhoneNumber.INSTANCE;
        }
        return zdlpuopuiu.eablkybsjg(ecomSPayMethod, EcomSPayMethod.WithoutRefresh.INSTANCE) ? SPayMethod.WithoutRefresh.INSTANCE : SPayMethod.Default.INSTANCE;
    }

    @Override // modern.payments.ecomAndroid.domain.helper.SPayFlowHelper
    public void pay(Activity context, draadjrbmk callback) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(callback, "callback");
        SPaySdkApp companion = SPaySdkApp.INSTANCE.getInstance();
        SPaySdkInitConfig sPaySdkInitConfig = new SPaySdkInitConfig(true, SPayStage.Prod, null, true, true, false, false, new SPayFlowHelperImpl$pay$1$config$1(this, callback, companion, this.configRepository.getEcomSdkSetupConfig().getContext(), context), 68, null);
        ITracker.DefaultImpls.track$default(this.tracker, "SPayFlowHelper.pay() " + sPaySdkInitConfig, null, null, null, 14, null);
        ExtensionKt.mapToSPaySdkStage(EcomStagingConfig.INSTANCE);
        Application application = context.getApplication();
        zdlpuopuiu.dxjokdxxww(application, "getApplication(...)");
        companion.initialize(application, sPaySdkInitConfig);
    }
}

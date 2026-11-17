package modern.payments.ecomAndroid.domain.helper.impl;

import android.app.Activity;
import android.content.Context;
import gg.wwaezpbzkn;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomSPayMethod;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.data.api.SPayPaymentResult;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.extension.OrderIdExtensionsKt;
import modern.payments.tracker.ITracker;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.InitializationResult;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.SdkReadyCheckResult;
import spay.sdk.api.model.SPaymentRequest;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lspay/sdk/api/InitializationResult;", "result", "Lgg/wwaezpbzkn;", "invoke", "(Lspay/sdk/api/InitializationResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class SPayFlowHelperImpl$pay$1$config$1 extends jyumaefscl implements draadjrbmk {
    final /* synthetic */ Context $application;
    final /* synthetic */ draadjrbmk $callback;
    final /* synthetic */ Activity $context;
    final /* synthetic */ SPaySdkApp $this_with;
    final /* synthetic */ SPayFlowHelperImpl this$0;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.helper.impl.SPayFlowHelperImpl$pay$1$config$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lspay/sdk/api/SdkReadyCheckResult;", "checkResult", "Lgg/wwaezpbzkn;", "invoke", "(Lspay/sdk/api/SdkReadyCheckResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass1 extends jyumaefscl implements draadjrbmk {
        final /* synthetic */ draadjrbmk $callback;
        final /* synthetic */ Activity $context;
        final /* synthetic */ SPaySdkApp $this_with;
        final /* synthetic */ SPayFlowHelperImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(draadjrbmk draadjrbmkVar, SPayFlowHelperImpl sPayFlowHelperImpl, Activity activity, SPaySdkApp sPaySdkApp) {
            super(1);
            this.$callback = draadjrbmkVar;
            this.this$0 = sPayFlowHelperImpl;
            this.$context = activity;
            this.$this_with = sPaySdkApp;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            invoke((SdkReadyCheckResult) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(SdkReadyCheckResult checkResult) throws IOException {
            zdlpuopuiu.btonecajqb(checkResult, "checkResult");
            if (checkResult instanceof SdkReadyCheckResult.NotReady) {
                this.$callback.invoke(new SPayPaymentResult.Error(new State.Error.PayWithSPayFail(new ErrorEntity.SPayError.Unknown("Попробуйте повторить оплату"), false, 2, null)));
                return;
            }
            if (zdlpuopuiu.eablkybsjg(checkResult, SdkReadyCheckResult.Ready.INSTANCE)) {
                SPayFlowHelperImpl sPayFlowHelperImpl = this.this$0;
                SPayMethod sPayMethod = sPayFlowHelperImpl.toSPayMethod(sPayFlowHelperImpl.ecomSdkOptionsRepository.getEcomSdkMerchantOptions().getPreferredSPayMethod());
                String apiKey = this.this$0.configRepository.getEcomSdkMerchantOptions().getApiKey();
                String merchantLogin = this.this$0.configRepository.getEcomSdkMerchantOptions().getMerchantLogin();
                String toShortOrderId = OrderIdExtensionsKt.formatToShortOrderId(this.this$0.configRepository.getEcomSdkMerchantOptions().getBankInvoiceId());
                String str = toShortOrderId == null ? "" : toShortOrderId;
                String orderNumber = this.this$0.configRepository.getEcomSdkMerchantOptions().getOrderNumber();
                String appPackageName = this.this$0.configRepository.getEcomSdkMerchantOptions().getAppPackageName();
                EcomSPayMethod preferredSPayMethod = this.this$0.ecomSdkOptionsRepository.getEcomSdkMerchantOptions().getPreferredSPayMethod();
                EcomSPayMethod.WithPhoneNumber withPhoneNumber = preferredSPayMethod instanceof EcomSPayMethod.WithPhoneNumber ? (EcomSPayMethod.WithPhoneNumber) preferredSPayMethod : null;
                String phoneNumber = withPhoneNumber != null ? withPhoneNumber.getPhoneNumber() : null;
                SPaymentRequest sPaymentRequest = new SPaymentRequest(this.$context, apiKey, str, orderNumber, merchantLogin, appPackageName, phoneNumber == null ? "" : phoneNumber, new SPayFlowHelperImpl$pay$1$config$1$1$payRequest$1(this.this$0, this.$callback));
                ITracker.DefaultImpls.track$default(this.this$0.tracker, "SPay SDK is ready. Method: " + sPayMethod + ". Request: " + sPaymentRequest, null, null, null, 14, null);
                this.$this_with.pay(sPayMethod, sPaymentRequest);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SPayFlowHelperImpl$pay$1$config$1(SPayFlowHelperImpl sPayFlowHelperImpl, draadjrbmk draadjrbmkVar, SPaySdkApp sPaySdkApp, Context context, Activity activity) {
        super(1);
        this.this$0 = sPayFlowHelperImpl;
        this.$callback = draadjrbmkVar;
        this.$this_with = sPaySdkApp;
        this.$application = context;
        this.$context = activity;
    }

    @Override // tg.draadjrbmk
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InitializationResult) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void invoke(InitializationResult result) {
        zdlpuopuiu.btonecajqb(result, "result");
        if (!(result instanceof InitializationResult.ConfigError)) {
            if (zdlpuopuiu.eablkybsjg(result, InitializationResult.Success.INSTANCE)) {
                SPaySdkApp sPaySdkApp = this.$this_with;
                sPaySdkApp.isReadyForSPaySdk(this.$application, new AnonymousClass1(this.$callback, this.this$0, this.$context, sPaySdkApp));
                return;
            }
            return;
        }
        ITracker iTracker = this.this$0.tracker;
        EcomSdkOptionsRepository ecomSdkOptionsRepository = this.this$0.ecomSdkOptionsRepository;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Initialization Failed: ");
        InitializationResult.ConfigError configError = (InitializationResult.ConfigError) result;
        sb3.append(configError.getMessage());
        FeatureExtensionsKt.track$default(iTracker, ecomSdkOptionsRepository, sb3.toString(), null, null, null, 28, null);
        this.$callback.invoke(new SPayPaymentResult.Error(new State.Error.PayWithSPayFail(new ErrorEntity.SPayError.ConfigIsEmpty(configError.getMessage()), false, 2, null)));
    }
}

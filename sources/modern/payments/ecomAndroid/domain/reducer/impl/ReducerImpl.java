package modern.payments.ecomAndroid.domain.reducer.impl;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.data.api.SPayPaymentResult;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.PaymentMethod;
import modern.payments.ecomAndroid.domain.model.response.FinishMethodResponseBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentOrderResponseBody;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.util.clearSdkUtil.ClearSdkUtil;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import pj.ikoacuggdj;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010%\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020#H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00122\u0006\u00102\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0012H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0012H\u0002¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u0012H\u0002¢\u0006\u0004\b;\u00109J\u000f\u0010<\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u00109J\u0017\u0010=\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b?\u0010>J\u001b\u0010@\u001a\u00020\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b@\u0010>J\u000f\u0010A\u001a\u00020\u0012H\u0002¢\u0006\u0004\bA\u00109J\u0018\u0010C\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020BH\u0096\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010J¨\u0006K"}, d2 = {"Lmodern/payments/ecomAndroid/domain/reducer/impl/ReducerImpl;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "stateHandler", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/util/clearSdkUtil/ClearSdkUtil;", "clearSdkUtil", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "sdkOptionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/StateHandler;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/util/clearSdkUtil/ClearSdkUtil;Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;)V", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "sPayPaymentResult", "Lgg/wwaezpbzkn;", "handleSPaySdkResult", "(Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;)V", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "responseBody", "handleSessionIdResponse", "(Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;)V", "", "Lmodern/payments/ecomAndroid/domain/model/PaymentMethod;", "getAvailablePaymentMethodsCount", "(Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;)Ljava/util/List;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment;", "action", "handleStartPayment", "(Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment;)V", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "paymentOrderResponseBody", "Lpj/cllcsxoeiz;", "coroutineScope", "handlePaymentOrder", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;Lpj/cllcsxoeiz;)V", "Lmodern/payments/ecomAndroid/presentation/Action$Handle3dsMethodRedirect;", "handle3dsMethodRedirect", "(Lmodern/payments/ecomAndroid/presentation/Action$Handle3dsMethodRedirect;)V", "Lmodern/payments/ecomAndroid/domain/model/response/FinishMethodResponseBody;", "body", "handle3dsMethodResult", "(Lmodern/payments/ecomAndroid/domain/model/response/FinishMethodResponseBody;)V", "scope", "handleCloseAction", "(Lpj/cllcsxoeiz;)V", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "screenState", "navigateToLoadingScreen", "(Lmodern/payments/ecomAndroid/domain/State$Loading;)V", "Lmodern/payments/ecomAndroid/domain/State$Error;", "navigateToErrorScreen", "(Lmodern/payments/ecomAndroid/domain/State$Error;)V", "navigateToPaymentModeScreen", "()V", "updateSession", "navigateToAddNewCardScreen", "navigateToSbpPayScreen", "navigateToThreeDSWebViewChallengeScreen", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;)V", "navigateToThreeDSMethodWebViewScreen", "navigateToSuccessfulPaymentScreen", "closeSdkWithWaitingStatus", "Lmodern/payments/ecomAndroid/presentation/Action;", "invoke", "(Lmodern/payments/ecomAndroid/presentation/Action;)V", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Lmodern/payments/ecomAndroid/util/clearSdkUtil/ClearSdkUtil;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReducerImpl implements Reducer {
    private final AppDataRepository appDataRepository;
    private final ClearSdkUtil clearSdkUtil;
    private final ConfigRepository configRepository;
    private final MerchantAnalyticRepository merchantAnalyticRepository;
    private final EcomSdkOptionsRepository sdkOptionsRepository;
    private final StateHandler stateHandler;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.reducer.impl.ReducerImpl$handleCloseAction$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.reducer.impl.ReducerImpl$handleCloseAction$1", f = "ReducerImpl.kt", l = {239}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return ReducerImpl.this.new AnonymousClass1(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ClearSdkUtil clearSdkUtil = ReducerImpl.this.clearSdkUtil;
                this.label = 1;
                if (clearSdkUtil.clearSdkCache(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            ReducerImpl.this.stateHandler.setState(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ReducerImpl(StateHandler stateHandler, AppDataRepository appDataRepository, ClearSdkUtil clearSdkUtil, ConfigRepository configRepository, EcomSdkOptionsRepository sdkOptionsRepository, MerchantAnalyticRepository merchantAnalyticRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearSdkUtil, "clearSdkUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sdkOptionsRepository, "sdkOptionsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        this.stateHandler = stateHandler;
        this.appDataRepository = appDataRepository;
        this.clearSdkUtil = clearSdkUtil;
        this.configRepository = configRepository;
        this.sdkOptionsRepository = sdkOptionsRepository;
        this.merchantAnalyticRepository = merchantAnalyticRepository;
    }

    private final void closeSdkWithWaitingStatus() {
        this.stateHandler.setState(State.PaymentResult.Waiting.INSTANCE);
    }

    private final List<PaymentMethod> getAvailablePaymentMethodsCount(SessionIdResponseBody responseBody) {
        ArrayList arrayList = new ArrayList();
        String sbpPayload = responseBody.getSbpPayload();
        if (sbpPayload != null && sbpPayload.length() != 0 && this.configRepository.getSbpConfig().getValue() != null && FeatureExtensionsKt.isSbpEnabled(this.sdkOptionsRepository)) {
            arrayList.add(PaymentMethod.Sbp.INSTANCE);
        }
        if (FeatureExtensionsKt.isSpayEnable(this.sdkOptionsRepository)) {
            arrayList.add(PaymentMethod.Spay.INSTANCE);
        }
        if (FeatureExtensionsKt.isBindingEnable(this.sdkOptionsRepository)) {
            arrayList.add(PaymentMethod.Binding.INSTANCE);
        }
        if (FeatureExtensionsKt.isNewCardEnable(this.sdkOptionsRepository)) {
            arrayList.add(PaymentMethod.NewCard.INSTANCE);
        }
        return arrayList;
    }

    private final void handle3dsMethodRedirect(Action.Handle3dsMethodRedirect action) {
        this.stateHandler.setState(new State.Loading.Finish3dsMethod(action.getTransactionId(), action.getHasRedirect()));
    }

    private final void handle3dsMethodResult(FinishMethodResponseBody body) {
        if (body.getErrorCode() == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(body.getErrorCode(), CommonUrlParts.Values.FALSE_INTEGER)) {
            if (body.getAcsUrl() == null || body.getCReq() == null) {
                navigateToSuccessfulPaymentScreen$default(this, null, 1, null);
                return;
            } else {
                navigateToThreeDSWebViewChallengeScreen(new PaymentOrderResponseBody(body.getOperationId(), null, null, body.getInfo(), null, body.getRedirect(), body.getTermUrl(), body.getAcsUrl(), null, body.getCReq(), null, null, null, null, null, null, 64790, null));
                return;
            }
        }
        String errorCode = body.getErrorCode();
        if (errorCode == null) {
            errorCode = "";
        }
        String errorMessage = body.getErrorMessage();
        navigateToErrorScreen(new State.Error.DefaultException.WhilePayment(new ErrorEntity.EcomServiceApiError.SuccessfulError(errorCode, errorMessage != null ? errorMessage : ""), false, 2, null));
    }

    private final void handleCloseAction(cllcsxoeiz scope) {
        gtknphoqwx.wkgbmnqykc(scope, null, null, new AnonymousClass1(null), 3, null);
    }

    private final void handlePaymentOrder(PaymentOrderResponseBody paymentOrderResponseBody, cllcsxoeiz coroutineScope) {
        String paReq;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.appDataRepository.get_paymentMode(), AppDataRepository.PaymentMode.NewCardPaymentMode.INSTANCE) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.appDataRepository.get_paymentMode(), AppDataRepository.PaymentMode.BindingCardPaymentMode.INSTANCE)) {
            navigateToSuccessfulPaymentScreen(paymentOrderResponseBody);
            return;
        }
        boolean z13 = (paymentOrderResponseBody.getThreeDSMethodData() == null || paymentOrderResponseBody.getThreeDSServerTransId() == null || paymentOrderResponseBody.getThreeDSMethodUrl() == null || paymentOrderResponseBody.getThreeDSMethodNotificationUrl() == null) ? false : true;
        String cReq = paymentOrderResponseBody.getCReq();
        boolean z14 = ((cReq == null || cReq.length() == 0) && ((paReq = paymentOrderResponseBody.getPaReq()) == null || paReq.length() == 0)) ? false : true;
        boolean z15 = (paymentOrderResponseBody.getErrorCode() == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(paymentOrderResponseBody.getErrorCode(), CommonUrlParts.Values.FALSE_INTEGER)) ? false : true;
        if ((z13 || z14) && coroutineScope != null) {
            gtknphoqwx.wkgbmnqykc(coroutineScope, ikoacuggdj.zoijcleaow(), null, new ReducerImpl$handlePaymentOrder$1$1(this, null), 2, null);
        }
        if (z14) {
            navigateToThreeDSWebViewChallengeScreen(paymentOrderResponseBody);
            return;
        }
        if (z13) {
            navigateToThreeDSMethodWebViewScreen(paymentOrderResponseBody);
            return;
        }
        if (!z15) {
            navigateToSuccessfulPaymentScreen(paymentOrderResponseBody);
            return;
        }
        String errorCode = paymentOrderResponseBody.getErrorCode();
        if (errorCode == null) {
            errorCode = "";
        }
        String description = paymentOrderResponseBody.getDescription();
        navigateToErrorScreen(new State.Error.DefaultException.WhilePayment(new ErrorEntity.EcomServiceApiError.SuccessfulError(errorCode, description != null ? description : ""), false, 2, null));
    }

    private final void handleSPaySdkResult(SPayPaymentResult sPayPaymentResult) {
        this.stateHandler.setState(new State.SPaySdk.FinishPayment(sPayPaymentResult));
    }

    private final void handleSessionIdResponse(SessionIdResponseBody responseBody) {
        List<PaymentMethod> availablePaymentMethodsCount = getAvailablePaymentMethodsCount(responseBody);
        if (availablePaymentMethodsCount.size() > 1) {
            navigateToPaymentModeScreen();
            return;
        }
        if (availablePaymentMethodsCount.size() != 1) {
            navigateToErrorScreen(new State.Error.DefaultException.WhilePayment(new ErrorEntity.EcomSdkError.NoPaymentMethodsAvailable(null, 1, null), false, 2, null));
            return;
        }
        PaymentMethod paymentMethod = (PaymentMethod) jyumaefscl.opjhrmiecq(availablePaymentMethodsCount);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(paymentMethod, PaymentMethod.Binding.INSTANCE)) {
            navigateToPaymentModeScreen();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(paymentMethod, PaymentMethod.NewCard.INSTANCE)) {
            navigateToAddNewCardScreen();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(paymentMethod, PaymentMethod.Sbp.INSTANCE)) {
            navigateToSbpPayScreen();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(paymentMethod, PaymentMethod.Spay.INSTANCE)) {
            this.stateHandler.setState(State.SPaySdk.StartPayment.INSTANCE);
        }
    }

    private final void handleStartPayment(Action.HandleStartPayment action) {
        if (action instanceof Action.HandleStartPayment.SPay) {
            this.stateHandler.setState(State.SPaySdk.StartPayment.INSTANCE);
            return;
        }
        boolean z13 = action instanceof Action.HandleStartPayment.BindingCard;
        if (z13 ? true : action instanceof Action.HandleStartPayment.NewCard) {
            Action.HandleStartPayment.BindingCard bindingCard = z13 ? (Action.HandleStartPayment.BindingCard) action : null;
            this.stateHandler.setState(new State.Loading.PaymentToken(bindingCard != null ? bindingCard.getBindingId() : null));
        }
    }

    private final void navigateToAddNewCardScreen() {
        this.stateHandler.setState(State.AddNewCard.INSTANCE);
    }

    private final void navigateToErrorScreen(State.Error screenState) {
        this.stateHandler.setState(screenState);
    }

    private final void navigateToLoadingScreen(State.Loading screenState) {
        this.stateHandler.setState(screenState);
    }

    private final void navigateToPaymentModeScreen() {
        this.stateHandler.setState(State.PaymentMethodScreen.INSTANCE);
    }

    private final void navigateToSbpPayScreen() {
        this.stateHandler.setState(State.SbpPay.INSTANCE);
    }

    private final void navigateToSuccessfulPaymentScreen(PaymentOrderResponseBody paymentOrderResponseBody) {
        this.stateHandler.setState(new State.PaymentResult.Success(paymentOrderResponseBody));
    }

    static /* synthetic */ void navigateToSuccessfulPaymentScreen$default(ReducerImpl reducerImpl, PaymentOrderResponseBody paymentOrderResponseBody, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            paymentOrderResponseBody = null;
        }
        reducerImpl.navigateToSuccessfulPaymentScreen(paymentOrderResponseBody);
    }

    private final void navigateToThreeDSMethodWebViewScreen(PaymentOrderResponseBody paymentOrderResponseBody) {
        this.stateHandler.setState(new State.ThreeDSMethodWebView(paymentOrderResponseBody));
    }

    private final void navigateToThreeDSWebViewChallengeScreen(PaymentOrderResponseBody paymentOrderResponseBody) {
        this.stateHandler.setState(new State.ThreeDSWebViewChallenge(paymentOrderResponseBody));
    }

    private final void updateSession() {
        this.stateHandler.setState(State.Loading.UpdateSessionId.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.domain.reducer.Reducer
    public void invoke(Action action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (action instanceof Action.HandleInit) {
            navigateToLoadingScreen(State.Loading.Initial.INSTANCE);
            return;
        }
        if (action instanceof Action.HandleSessionId) {
            handleSessionIdResponse(((Action.HandleSessionId) action).getSessionIdResponseBody());
            return;
        }
        if (action instanceof Action.HandleBackToPaymentMode) {
            navigateToPaymentModeScreen();
            return;
        }
        if (action instanceof Action.HandleAddNewCard) {
            navigateToAddNewCardScreen();
            return;
        }
        if (action instanceof Action.HandleDeactivateBinding) {
            navigateToLoadingScreen(new State.Loading.DeactivateBinding(((Action.HandleDeactivateBinding) action).getBindingId()));
            return;
        }
        if (action instanceof Action.HandleSuccessBindingDeactivation) {
            updateSession();
            return;
        }
        if (action instanceof Action.HandleSbpPay) {
            navigateToSbpPayScreen();
            return;
        }
        if (action instanceof Action.HandleStartPayment) {
            handleStartPayment((Action.HandleStartPayment) action);
            return;
        }
        if (action instanceof Action.HandlePaymentToken) {
            navigateToLoadingScreen(new State.Loading.PaymentOrder(((Action.HandlePaymentToken) action).getPaymentTokenResponseBody()));
            return;
        }
        if (action instanceof Action.HandleException) {
            navigateToErrorScreen(((Action.HandleException) action).getException());
            return;
        }
        if (action instanceof Action.HandlePaymentOrder) {
            Action.HandlePaymentOrder handlePaymentOrder = (Action.HandlePaymentOrder) action;
            handlePaymentOrder(handlePaymentOrder.getPaymentOrderResponseBody(), handlePaymentOrder.getCoroutineScope());
            return;
        }
        if (action instanceof Action.HandleFinishChallenge) {
            Action.HandleFinishChallenge handleFinishChallenge = (Action.HandleFinishChallenge) action;
            navigateToLoadingScreen(new State.Loading.FinishPayment(handleFinishChallenge.getCRes(), handleFinishChallenge.getPaRes()));
            return;
        }
        if (action instanceof Action.Handle3dsMethodRedirect) {
            handle3dsMethodRedirect((Action.Handle3dsMethodRedirect) action);
            return;
        }
        if (action instanceof Action.HandlePaymentResult) {
            Action.HandlePaymentResult handlePaymentResult = (Action.HandlePaymentResult) action;
            if (handlePaymentResult.getFinishPaymentResponseBody() == null || handlePaymentResult.getProcessing()) {
                closeSdkWithWaitingStatus();
                return;
            } else {
                navigateToSuccessfulPaymentScreen$default(this, null, 1, null);
                return;
            }
        }
        if (action instanceof Action.Handle3dsMethodResult) {
            handle3dsMethodResult(((Action.Handle3dsMethodResult) action).getFinish3dsMethodResponseBody());
        } else if (action instanceof Action.HandleCloseAction) {
            handleCloseAction(((Action.HandleCloseAction) action).getScope());
        } else if (action instanceof Action.HandleSPaySdkResult) {
            handleSPaySdkResult(((Action.HandleSPaySdkResult) action).getSPayPaymentResult());
        }
    }
}

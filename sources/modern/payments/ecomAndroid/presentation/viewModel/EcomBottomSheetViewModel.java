package modern.payments.ecomAndroid.presentation.viewModel;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.lifecycle.ulzqkzuiru;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.LazyNetworkModule;
import modern.payments.ecomAndroid.di.qualifier.sslInteractor.CustomSslInteractor;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.MerchantInitialData;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsMethodRequestBody;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsPaymentRequestBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentTokenResponseBody;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.useCase.DeactivateBindingUseCase;
import modern.payments.ecomAndroid.domain.useCase.Finish3dsMethodUseCase;
import modern.payments.ecomAndroid.domain.useCase.FinishPaymentUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetIpAddressUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCase;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCase;
import modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase;
import modern.payments.ecomAndroid.domain.useCase.base.BaseUseCaseWithoutParamNoResponse;
import modern.payments.ecomAndroid.domain.useCase.initialData.GetLocalSessionIdUseCase;
import modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCase;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;
import modern.payments.ecomAndroid.util.event.Event;
import modern.payments.ecomAndroid.util.extension.SPayPaymentResultExtentionsKt;
import modern.payments.ecomAndroid.util.ssl.CustomSslInteractorImpl;
import modern.payments.ecomAndroid.util.ssl.SSLInteractor;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.util.logging.LogFileManager;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import pj.ikoacuggdj;
import sj.dxjokdxxww;
import sj.jpowsppfya;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.wypolnanlu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B«\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0019\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020/H\u0002¢\u0006\u0004\b4\u00103J\u0018\u00107\u001a\u00020/2\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020/H\u0082@¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020/H\u0002¢\u0006\u0004\b;\u00103J\u000f\u0010<\u001a\u00020/H\u0002¢\u0006\u0004\b<\u00103J\u0019\u0010?\u001a\u00020/2\b\u0010>\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020/2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020/2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bE\u0010@J#\u0010H\u001a\u00020/2\b\u0010F\u001a\u0004\u0018\u00010=2\b\u0010G\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\bH\u0010IJ!\u0010M\u001a\u00020/2\b\u0010J\u001a\u0004\u0018\u00010=2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020/2\u0006\u0010O\u001a\u00020\u0002H\u0016¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020/¢\u0006\u0004\bR\u00103R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010SR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010VR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010WR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010XR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010YR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010ZR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010[R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\\R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010]R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010^R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010_R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010`R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010aR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010bR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010cR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010dR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010eR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010fR+\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010i0h0g8\u0006¢\u0006\u0012\n\u0004\b6\u0010j\u0012\u0004\bm\u00103\u001a\u0004\bk\u0010lR\u001c\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010i0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010jR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006r"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetViewModel;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "stateHandler", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "merchantDataProvider", "Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetSessionIdUseCase;", "getSessionIdUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentTokenUseCase;", "getPaymentTokenUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentOrderUseCase;", "getPaymentOrderUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/FinishPaymentUseCase;", "finishPaymentUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/Finish3dsMethodUseCase;", "finish3dsMethodUseCase", "Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetLocalSessionIdUseCase;", "getLocalSessionIdUseCase", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/domain/useCase/GetIpAddressUseCase;", "getIpAddressUseCase", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/useCase/DeactivateBindingUseCase;", "deactivateBindingUseCase", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;", "lazyNetworkModule", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "sslInteractor", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Lmodern/payments/tracker/util/logging/LogFileManager;", "logFileManager", "Lmodern/payments/tracker/ITracker;", "tracker", "<init>", "(Lmodern/payments/ecomAndroid/domain/StateHandler;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetSessionIdUseCase;Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentTokenUseCase;Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentOrderUseCase;Lmodern/payments/ecomAndroid/domain/useCase/FinishPaymentUseCase;Lmodern/payments/ecomAndroid/domain/useCase/Finish3dsMethodUseCase;Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetLocalSessionIdUseCase;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/domain/useCase/GetIpAddressUseCase;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/useCase/DeactivateBindingUseCase;Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Lmodern/payments/tracker/util/logging/LogFileManager;Lmodern/payments/tracker/ITracker;)V", "Landroid/content/ClipboardManager;", "clipboardManager", "Lgg/wwaezpbzkn;", "copyLogToClipboard", "(Landroid/content/ClipboardManager;)V", "sendCallback", "()V", "handleState", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "state", "handleLoadingState", "(Lmodern/payments/ecomAndroid/domain/State$Loading;Llg/gxszxtbevo;)Ljava/lang/Object;", "handleInitialLoading", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "getLocalSessionId", "requestSessionId", "", "bindingId", "requestPaymentToken", "(Ljava/lang/String;)V", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "paymentTokenResponse", "requestPaymentOrder", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;)V", "requestDeactivateBinding", "cRes", "paRes", "requestFinishPayment", "(Ljava/lang/String;Ljava/lang/String;)V", "transactionId", "", "hasRedirect", "requestFinishMethod", "(Ljava/lang/String;Z)V", "event", "handleEvent", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent;)V", "sendAnalytic", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetSessionIdUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentTokenUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentOrderUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/FinishPaymentUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/Finish3dsMethodUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetLocalSessionIdUseCase;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Lmodern/payments/ecomAndroid/domain/useCase/GetIpAddressUseCase;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/useCase/DeactivateBindingUseCase;", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lmodern/payments/tracker/util/logging/LogFileManager;", "Lmodern/payments/tracker/ITracker;", "Lsj/wypolnanlu;", "Lmodern/payments/ecomAndroid/util/event/Event;", "Lmodern/payments/ecomAndroid/domain/State;", "Lsj/wypolnanlu;", "getState", "()Lsj/wypolnanlu;", "getState$annotations", "currentEcomState", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "ecomSdkResult", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomBottomSheetViewModel extends BaseViewModel<EcomBottomSheetDialogEvent> {
    private final AppDataRepository appDataRepository;
    private final ConfigRepository configRepository;
    private final wypolnanlu currentEcomState;
    private final DeactivateBindingUseCase deactivateBindingUseCase;
    private final EcomMetricUtil ecomMetricUtil;
    private volatile EcomSdkMerchantOptionsConfig.EcomSdkResult ecomSdkResult;
    private final Finish3dsMethodUseCase finish3dsMethodUseCase;
    private final FinishPaymentUseCase finishPaymentUseCase;
    private final GetIpAddressUseCase getIpAddressUseCase;
    private final GetLocalSessionIdUseCase getLocalSessionIdUseCase;
    private final GetPaymentOrderUseCase getPaymentOrderUseCase;
    private final GetPaymentTokenUseCase getPaymentTokenUseCase;
    private final GetSessionIdUseCase getSessionIdUseCase;
    private final LazyNetworkModule lazyNetworkModule;
    private final LogFileManager logFileManager;
    private final MerchantAnalyticRepository merchantAnalyticRepository;
    private final MerchantDataProvider merchantDataProvider;
    private final EcomSdkOptionsRepository optionsRepository;
    private final Reducer reducer;
    private final SSLInteractor sslInteractor;
    private final wypolnanlu state;
    private final StateHandler stateHandler;
    private final ITracker tracker;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$copyLogToClipboard$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$copyLogToClipboard$1", f = "EcomBottomSheetViewModel.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ ClipboardManager $clipboardManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ClipboardManager clipboardManager, lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$clipboardManager = clipboardManager;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new AnonymousClass1(this.$clipboardManager, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                LogFileManager logFileManager = EcomBottomSheetViewModel.this.logFileManager;
                this.label = 1;
                obj = logFileManager.getCurrentLogFileContent(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            String str = (String) obj;
            if (str != null) {
                this.$clipboardManager.setPrimaryClip(ClipData.newPlainText("Log", str));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$getLocalSessionId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$getLocalSessionId$1", f = "EcomBottomSheetViewModel.kt", l = {232}, m = "invokeSuspend")
    static final class C40771 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40771(lg.gxszxtbevo<? super C40771> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new C40771(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                GetLocalSessionIdUseCase getLocalSessionIdUseCase = EcomBottomSheetViewModel.this.getLocalSessionIdUseCase;
                this.label = 1;
                if (BaseUseCaseWithoutParamNoResponse.invoke$default(getLocalSessionIdUseCase, null, this, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40771) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$handleEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$handleEvent$1", f = "EcomBottomSheetViewModel.kt", l = {116}, m = "invokeSuspend")
    static final class C40781 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ EcomBottomSheetDialogEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40781(EcomBottomSheetDialogEvent ecomBottomSheetDialogEvent, lg.gxszxtbevo<? super C40781> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$event = ecomBottomSheetDialogEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new C40781(this.$event, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomBottomSheetViewModel.this.merchantAnalyticRepository;
                String string = ((EcomBottomSheetDialogEvent.HandleSPaySdkResult) this.$event).getResult().toString();
                this.label = 1;
                if (merchantAnalyticRepository.onSPayResult(string, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40781) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$handleInitialLoading$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel", f = "EcomBottomSheetViewModel.kt", l = {220, 224, 225}, m = "handleInitialLoading")
    static final class C40791 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40791(lg.gxszxtbevo<? super C40791> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcomBottomSheetViewModel.this.handleInitialLoading(this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$handleState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State;", "ecomState", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lmodern/payments/ecomAndroid/domain/State;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$handleState$1", f = "EcomBottomSheetViewModel.kt", l = {156}, m = "invokeSuspend")
    static final class C40801 extends draadjrbmk implements rgvfuqvkyq {
        /* synthetic */ Object L$0;
        int label;

        C40801(lg.gxszxtbevo<? super C40801> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            C40801 c40801 = EcomBottomSheetViewModel.this.new C40801(gxszxtbevoVar);
            c40801.L$0 = obj;
            return c40801;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                State state = (State) this.L$0;
                ITracker.DefaultImpls.track$default(EcomBottomSheetViewModel.this.tracker, "sendCallback (HS): " + state, null, null, null, 14, null);
                if (state instanceof State.Loading) {
                    this.label = 1;
                    if (EcomBottomSheetViewModel.this.handleLoadingState((State.Loading) state, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (state instanceof State.Error) {
                    ErrorEntity error = ((State.Error) state).getError();
                    EcomBottomSheetViewModel ecomBottomSheetViewModel = EcomBottomSheetViewModel.this;
                    ecomBottomSheetViewModel.ecomSdkResult = new EcomSdkMerchantOptionsConfig.EcomSdkResult.Error(error.getHttpCode(), error.getErrorCode(), error.getDescription(), ecomBottomSheetViewModel.configRepository.getEcomSdkMerchantOptions().getBankInvoiceId(), null, 16, null);
                } else if (!(state instanceof State.PaymentMethodScreen) && !(state instanceof State.AddNewCard) && !(state instanceof State.ThreeDSWebViewChallenge)) {
                    if (state instanceof State.PaymentResult.Success) {
                        EcomBottomSheetViewModel ecomBottomSheetViewModel2 = EcomBottomSheetViewModel.this;
                        ecomBottomSheetViewModel2.ecomSdkResult = new EcomSdkMerchantOptionsConfig.EcomSdkResult.Success((String) ecomBottomSheetViewModel2.appDataRepository.getLocalSessionId().getValue());
                    } else if (state instanceof State.PaymentResult.Waiting) {
                        EcomBottomSheetViewModel ecomBottomSheetViewModel3 = EcomBottomSheetViewModel.this;
                        ecomBottomSheetViewModel3.ecomSdkResult = new EcomSdkMerchantOptionsConfig.EcomSdkResult.Waiting(null, null, null, null, (String) ecomBottomSheetViewModel3.appDataRepository.getLocalSessionId().getValue(), 15, null);
                        EcomBottomSheetViewModel.this.stateHandler.setState(null);
                    } else if (state instanceof State.SPaySdk.FinishPayment) {
                        EcomBottomSheetViewModel.this.ecomSdkResult = SPayPaymentResultExtentionsKt.mapToEcomSdkResult(((State.SPaySdk.FinishPayment) state).getSPayPaymentResult(), (String) EcomBottomSheetViewModel.this.appDataRepository.getLocalSessionId().getValue());
                        EcomBottomSheetViewModel.this.closeSdk();
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(State state, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40801) create(state, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestDeactivateBinding$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestDeactivateBinding$1", f = "EcomBottomSheetViewModel.kt", l = {263, 262}, m = "invokeSuspend")
    static final class C40811 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ String $bindingId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40811(String str, lg.gxszxtbevo<? super C40811> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$bindingId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new C40811(this.$bindingId, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            BaseUseCase baseUseCase;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    baseUseCase = (BaseUseCase) this.L$0;
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            baseUseCase = EcomBottomSheetViewModel.this.deactivateBindingUseCase;
            DeactivateBindingUseCase deactivateBindingUseCase = EcomBottomSheetViewModel.this.deactivateBindingUseCase;
            String str = this.$bindingId;
            this.L$0 = baseUseCase;
            this.label = 1;
            obj = deactivateBindingUseCase.getRequest(str, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            Object obj2 = obj;
            BaseUseCase baseUseCase2 = baseUseCase;
            this.L$0 = null;
            this.label = 2;
            if (BaseUseCase.DefaultImpls.invoke$default(baseUseCase2, obj2, null, this, 2, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40811) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestFinishMethod$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestFinishMethod$1", f = "EcomBottomSheetViewModel.kt", l = {289, 290}, m = "invokeSuspend")
    static final class C40821 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ boolean $hasRedirect;
        final /* synthetic */ String $transactionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40821(String str, boolean z13, lg.gxszxtbevo<? super C40821> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$transactionId = str;
            this.$hasRedirect = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new C40821(this.$transactionId, this.$hasRedirect, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(EcomBottomSheetViewModel.this.merchantDataProvider.getMerchantData());
            this.label = 1;
            obj = dxjokdxxww.pmvmpeiblj(lqeggnwhkgVarLereixgezr, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            Finish3dsMethodUseCase finish3dsMethodUseCase = EcomBottomSheetViewModel.this.finish3dsMethodUseCase;
            String bankInvoiceId = ((MerchantInitialData) obj).getBankInvoiceId();
            String str = this.$transactionId;
            if (str == null) {
                str = "";
            }
            Finish3dsMethodRequestBody finish3dsMethodRequestBody = new Finish3dsMethodRequestBody(bankInvoiceId, str, this.$hasRedirect ? "Y" : "N");
            this.label = 2;
            if (BaseUseCase.DefaultImpls.invoke$default(finish3dsMethodUseCase, finish3dsMethodRequestBody, null, this, 2, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40821) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestFinishPayment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestFinishPayment$1", f = "EcomBottomSheetViewModel.kt", l = {273, 274}, m = "invokeSuspend")
    static final class C40831 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ String $cRes;
        final /* synthetic */ String $paRes;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40831(String str, String str2, lg.gxszxtbevo<? super C40831> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$cRes = str;
            this.$paRes = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new C40831(this.$cRes, this.$paRes, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(EcomBottomSheetViewModel.this.merchantDataProvider.getMerchantData());
            this.label = 1;
            obj = dxjokdxxww.pmvmpeiblj(lqeggnwhkgVarLereixgezr, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            FinishPaymentUseCase finishPaymentUseCase = EcomBottomSheetViewModel.this.finishPaymentUseCase;
            Finish3dsPaymentRequestBody finish3dsPaymentRequestBody = new Finish3dsPaymentRequestBody(((MerchantInitialData) obj).getBankInvoiceId(), this.$cRes, this.$paRes);
            this.label = 2;
            if (BaseUseCase.DefaultImpls.invoke$default(finishPaymentUseCase, finish3dsPaymentRequestBody, null, this, 2, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40831) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestPaymentOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestPaymentOrder$1", f = "EcomBottomSheetViewModel.kt", l = {KotlinVersion.MAX_COMPONENT_VALUE, 254}, m = "invokeSuspend")
    static final class C40841 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ PaymentTokenResponseBody $paymentTokenResponse;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40841(PaymentTokenResponseBody paymentTokenResponseBody, lg.gxszxtbevo<? super C40841> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$paymentTokenResponse = paymentTokenResponseBody;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new C40841(this.$paymentTokenResponse, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            BaseUseCase baseUseCase;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    baseUseCase = (BaseUseCase) this.L$0;
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            baseUseCase = EcomBottomSheetViewModel.this.getPaymentOrderUseCase;
            GetPaymentOrderUseCase getPaymentOrderUseCase = EcomBottomSheetViewModel.this.getPaymentOrderUseCase;
            PaymentTokenResponseBody paymentTokenResponseBody = this.$paymentTokenResponse;
            cllcsxoeiz cllcsxoeizVarIobyxmoadg = ulzqkzuiru.iobyxmoadg(EcomBottomSheetViewModel.this);
            this.L$0 = baseUseCase;
            this.label = 1;
            obj = getPaymentOrderUseCase.getRequest(paymentTokenResponseBody, cllcsxoeizVarIobyxmoadg, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            Object obj2 = obj;
            BaseUseCase baseUseCase2 = baseUseCase;
            this.L$0 = null;
            this.label = 2;
            if (BaseUseCase.DefaultImpls.invoke$default(baseUseCase2, obj2, null, this, 2, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40841) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestPaymentToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestPaymentToken$1", f = "EcomBottomSheetViewModel.kt", l = {247, 246}, m = "invokeSuspend")
    static final class C40851 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ String $bindingId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40851(String str, lg.gxszxtbevo<? super C40851> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$bindingId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new C40851(this.$bindingId, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            BaseUseCase baseUseCase;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    baseUseCase = (BaseUseCase) this.L$0;
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            baseUseCase = EcomBottomSheetViewModel.this.getPaymentTokenUseCase;
            GetPaymentTokenUseCase getPaymentTokenUseCase = EcomBottomSheetViewModel.this.getPaymentTokenUseCase;
            String str = this.$bindingId;
            this.L$0 = baseUseCase;
            this.label = 1;
            obj = getPaymentTokenUseCase.getRequest(str, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            Object obj2 = obj;
            BaseUseCase baseUseCase2 = baseUseCase;
            this.L$0 = null;
            this.label = 2;
            if (BaseUseCase.DefaultImpls.invoke$default(baseUseCase2, obj2, null, this, 2, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40851) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestSessionId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestSessionId$1", f = "EcomBottomSheetViewModel.kt", l = {239, 240, 240}, m = "invokeSuspend")
    static final class C40861 extends draadjrbmk implements rgvfuqvkyq {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestSessionId$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$requestSessionId$1$1", f = "EcomBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
        static final class C14251 extends draadjrbmk implements rgvfuqvkyq {
            /* synthetic */ Object L$0;
            int label;

            C14251(lg.gxszxtbevo<? super C14251> gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
                C14251 c14251 = new C14251(gxszxtbevoVar);
                c14251.L$0 = obj;
                return c14251;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                zoijcleaow.gxszxtbevo();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((String) this.L$0) != null);
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(String str, lg.gxszxtbevo<? super Boolean> gxszxtbevoVar) {
                return ((C14251) create(str, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        C40861(lg.gxszxtbevo<? super C40861> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new C40861(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            BaseUseCase baseUseCase;
            Object obj2;
            BaseUseCase baseUseCase2;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else if (i13 == 2) {
                    baseUseCase = (BaseUseCase) this.L$0;
                    zdlpuopuiu.zoijcleaow(obj);
                    obj2 = obj;
                    baseUseCase2 = baseUseCase;
                    this.L$0 = null;
                    this.label = 3;
                    if (BaseUseCase.DefaultImpls.invoke$default(baseUseCase2, obj2, null, this, 2, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            wypolnanlu localSessionId = EcomBottomSheetViewModel.this.appDataRepository.getLocalSessionId();
            C14251 c14251 = new C14251(null);
            this.label = 1;
            if (dxjokdxxww.zynmafqrjb(localSessionId, c14251, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            baseUseCase = EcomBottomSheetViewModel.this.getSessionIdUseCase;
            GetSessionIdUseCase getSessionIdUseCase = EcomBottomSheetViewModel.this.getSessionIdUseCase;
            this.L$0 = baseUseCase;
            this.label = 2;
            obj = getSessionIdUseCase.getRequest(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj2 = obj;
            baseUseCase2 = baseUseCase;
            this.L$0 = null;
            this.label = 3;
            if (BaseUseCase.DefaultImpls.invoke$default(baseUseCase2, obj2, null, this, 2, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40861) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$sendAnalytic$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$sendAnalytic$1", f = "EcomBottomSheetViewModel.kt", l = {303, 307, 308, 309, 313, 314}, m = "invokeSuspend")
    static final class C40871 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40871(lg.gxszxtbevo<? super C40871> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomBottomSheetViewModel.this.new C40871(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            switch (this.label) {
                case 0:
                    zdlpuopuiu.zoijcleaow(obj);
                    State state = (State) EcomBottomSheetViewModel.this.currentEcomState.getValue();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(state, State.AddNewCard.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository = EcomBottomSheetViewModel.this.merchantAnalyticRepository;
                        this.label = 1;
                        if (merchantAnalyticRepository.onPaymentViewSwipe(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (!(state instanceof State.Error)) {
                        if (state instanceof State.Loading) {
                            MerchantAnalyticRepository merchantAnalyticRepository2 = EcomBottomSheetViewModel.this.merchantAnalyticRepository;
                            this.label = 2;
                            if (merchantAnalyticRepository2.onAuthViewSwipe(this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(state, State.PaymentMethodScreen.INSTANCE)) {
                            MerchantAnalyticRepository merchantAnalyticRepository3 = EcomBottomSheetViewModel.this.merchantAnalyticRepository;
                            this.label = 3;
                            if (merchantAnalyticRepository3.onPaymentMethodViewSwipe(this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(state, State.SbpPay.INSTANCE)) {
                            MerchantAnalyticRepository merchantAnalyticRepository4 = EcomBottomSheetViewModel.this.merchantAnalyticRepository;
                            this.label = 4;
                            if (merchantAnalyticRepository4.onSbpViewSwipe(this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else if (!(state instanceof State.PaymentResult)) {
                            if (state instanceof State.ThreeDSMethodWebView) {
                                MerchantAnalyticRepository merchantAnalyticRepository5 = EcomBottomSheetViewModel.this.merchantAnalyticRepository;
                                this.label = 5;
                                if (merchantAnalyticRepository5.on3dsViewSwipe(this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            } else if (state instanceof State.ThreeDSWebViewChallenge) {
                                MerchantAnalyticRepository merchantAnalyticRepository6 = EcomBottomSheetViewModel.this.merchantAnalyticRepository;
                                this.label = 6;
                                if (merchantAnalyticRepository6.on3dsViewSwipe(this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zdlpuopuiu.zoijcleaow(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40871) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomBottomSheetViewModel(StateHandler stateHandler, Reducer reducer, ConfigRepository configRepository, MerchantDataProvider merchantDataProvider, GetSessionIdUseCase getSessionIdUseCase, GetPaymentTokenUseCase getPaymentTokenUseCase, GetPaymentOrderUseCase getPaymentOrderUseCase, FinishPaymentUseCase finishPaymentUseCase, Finish3dsMethodUseCase finish3dsMethodUseCase, GetLocalSessionIdUseCase getLocalSessionIdUseCase, AppDataRepository appDataRepository, GetIpAddressUseCase getIpAddressUseCase, EcomMetricUtil ecomMetricUtil, DeactivateBindingUseCase deactivateBindingUseCase, LazyNetworkModule lazyNetworkModule, MerchantAnalyticRepository merchantAnalyticRepository, @CustomSslInteractor SSLInteractor sslInteractor, EcomSdkOptionsRepository optionsRepository, LogFileManager logFileManager, ITracker tracker) {
        super(configRepository, reducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getSessionIdUseCase, "getSessionIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPaymentTokenUseCase, "getPaymentTokenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPaymentOrderUseCase, "getPaymentOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(finishPaymentUseCase, "finishPaymentUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(finish3dsMethodUseCase, "finish3dsMethodUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getLocalSessionIdUseCase, "getLocalSessionIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIpAddressUseCase, "getIpAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deactivateBindingUseCase, "deactivateBindingUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lazyNetworkModule, "lazyNetworkModule");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sslInteractor, "sslInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logFileManager, "logFileManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tracker, "tracker");
        this.stateHandler = stateHandler;
        this.reducer = reducer;
        this.configRepository = configRepository;
        this.merchantDataProvider = merchantDataProvider;
        this.getSessionIdUseCase = getSessionIdUseCase;
        this.getPaymentTokenUseCase = getPaymentTokenUseCase;
        this.getPaymentOrderUseCase = getPaymentOrderUseCase;
        this.finishPaymentUseCase = finishPaymentUseCase;
        this.finish3dsMethodUseCase = finish3dsMethodUseCase;
        this.getLocalSessionIdUseCase = getLocalSessionIdUseCase;
        this.appDataRepository = appDataRepository;
        this.getIpAddressUseCase = getIpAddressUseCase;
        this.ecomMetricUtil = ecomMetricUtil;
        this.deactivateBindingUseCase = deactivateBindingUseCase;
        this.lazyNetworkModule = lazyNetworkModule;
        this.merchantAnalyticRepository = merchantAnalyticRepository;
        this.sslInteractor = sslInteractor;
        this.optionsRepository = optionsRepository;
        this.logFileManager = logFileManager;
        this.tracker = tracker;
        final lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = dxjokdxxww.cllcsxoeiz(stateHandler.getState(), new EcomBottomSheetViewModel$state$1(this, null));
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$special$$inlined$filter$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;
                final /* synthetic */ EcomBottomSheetViewModel this$0;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$special$$inlined$filter$1$2", f = "EcomBottomSheetViewModel.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends wkgbmnqykc {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(nufgyqmvbu nufgyqmvbuVar, EcomBottomSheetViewModel ecomBottomSheetViewModel) {
                    this.$this_unsafeFlow = nufgyqmvbuVar;
                    this.this$0 = ecomBottomSheetViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
                    if (gxszxtbevoVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        Event event = (Event) obj;
                        if (this.this$0.optionsRepository.isFeatureEnabled(Constants.FeatureName.RESULT_VIEW) || (!(event.peek() instanceof State.Error) && !(event.peek() instanceof State.PaymentResult))) {
                            anonymousClass1.label = 1;
                            if (nufgyqmvbuVar.emit(obj, anonymousClass1) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = lqeggnwhkgVarCllcsxoeiz.collect(new AnonymousClass2(nufgyqmvbuVar, this), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        cllcsxoeiz cllcsxoeizVarIobyxmoadg = ulzqkzuiru.iobyxmoadg(this);
        jpowsppfya.iobyxmoadg iobyxmoadgVar = jpowsppfya.f106926iobyxmoadg;
        this.state = dxjokdxxww.ribwqtqdhb(lqeggnwhkgVar, cllcsxoeizVarIobyxmoadg, jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), new Event(State.Loading.Initial.INSTANCE));
        final wypolnanlu state = stateHandler.getState();
        this.currentEcomState = dxjokdxxww.ribwqtqdhb(new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$special$$inlined$map$1$2", f = "EcomBottomSheetViewModel.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends wkgbmnqykc {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(nufgyqmvbu nufgyqmvbuVar) {
                    this.$this_unsafeFlow = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
                    if (gxszxtbevoVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        Object objPeek = ((Event) obj).peek();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(objPeek, anonymousClass1) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = state.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }, ulzqkzuiru.iobyxmoadg(this), jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        handleState();
        getLocalSessionId();
        reducer.invoke(Action.HandleInit.INSTANCE);
    }

    private final void copyLogToClipboard(ClipboardManager clipboardManager) {
        if (this.optionsRepository.isFeatureEnabled(Constants.FeatureName.RESULT_VIEW) || clipboardManager == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new AnonymousClass1(clipboardManager, null), 3, null);
    }

    private final void getLocalSessionId() {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new C40771(null), 3, null);
    }

    public static /* synthetic */ void getState$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handleInitialLoading(lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        C40791 c40791;
        EcomBottomSheetViewModel ecomBottomSheetViewModel;
        GetIpAddressUseCase getIpAddressUseCase;
        EcomBottomSheetViewModel ecomBottomSheetViewModel2;
        if (gxszxtbevoVar instanceof C40791) {
            c40791 = (C40791) gxszxtbevoVar;
            int i13 = c40791.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40791.label = i13 - Integer.MIN_VALUE;
            } else {
                c40791 = new C40791(gxszxtbevoVar);
            }
        } else {
            c40791 = new C40791(gxszxtbevoVar);
        }
        Object obj = c40791.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40791.label;
        if (i14 != 0) {
            if (i14 == 1) {
                ecomBottomSheetViewModel = (EcomBottomSheetViewModel) c40791.L$0;
                zdlpuopuiu.zoijcleaow(obj);
            } else if (i14 == 2) {
                ecomBottomSheetViewModel = (EcomBottomSheetViewModel) c40791.L$0;
                zdlpuopuiu.zoijcleaow(obj);
                getIpAddressUseCase = ecomBottomSheetViewModel.getIpAddressUseCase;
                c40791.L$0 = ecomBottomSheetViewModel;
                c40791.label = 3;
                if (BaseUseCaseWithoutParamNoResponse.invoke$default(getIpAddressUseCase, null, c40791, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ecomBottomSheetViewModel2 = ecomBottomSheetViewModel;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ecomBottomSheetViewModel2 = (EcomBottomSheetViewModel) c40791.L$0;
                zdlpuopuiu.zoijcleaow(obj);
            }
            ecomBottomSheetViewModel2.requestSessionId();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(obj);
        ConfigRepository configRepository = this.configRepository;
        c40791.L$0 = this;
        c40791.label = 1;
        if (configRepository.requestConfig(c40791) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ecomBottomSheetViewModel = this;
        SSLInteractor sSLInteractor = ecomBottomSheetViewModel.sslInteractor;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(sSLInteractor, "null cannot be cast to non-null type modern.payments.ecomAndroid.util.ssl.CustomSslInteractorImpl");
        ((CustomSslInteractorImpl) sSLInteractor).initSslInteractor();
        ecomBottomSheetViewModel.lazyNetworkModule.init();
        ecomBottomSheetViewModel.ecomMetricUtil.initializeWithConfig(ecomBottomSheetViewModel.lazyNetworkModule.getNetworkClientBuilder());
        ConfigRepository configRepository2 = ecomBottomSheetViewModel.configRepository;
        c40791.L$0 = ecomBottomSheetViewModel;
        c40791.label = 2;
        if (configRepository2.requestSbpConfig(c40791) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        getIpAddressUseCase = ecomBottomSheetViewModel.getIpAddressUseCase;
        c40791.L$0 = ecomBottomSheetViewModel;
        c40791.label = 3;
        if (BaseUseCaseWithoutParamNoResponse.invoke$default(getIpAddressUseCase, null, c40791, 1, null) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ecomBottomSheetViewModel2 = ecomBottomSheetViewModel;
        ecomBottomSheetViewModel2.requestSessionId();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleLoadingState(State.Loading loading, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(loading, State.Loading.Initial.INSTANCE)) {
            Object objHandleInitialLoading = handleInitialLoading(gxszxtbevoVar);
            return objHandleInitialLoading == zoijcleaow.gxszxtbevo() ? objHandleInitialLoading : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(loading, State.Loading.UpdateSessionId.INSTANCE)) {
            requestSessionId();
        } else if (loading instanceof State.Loading.PaymentToken) {
            requestPaymentToken(((State.Loading.PaymentToken) loading).getBindingId());
        } else if (loading instanceof State.Loading.PaymentOrder) {
            requestPaymentOrder(((State.Loading.PaymentOrder) loading).getPaymentTokenResponseBody());
        } else if (loading instanceof State.Loading.FinishPayment) {
            State.Loading.FinishPayment finishPayment = (State.Loading.FinishPayment) loading;
            requestFinishPayment(finishPayment.getCRes(), finishPayment.getPaRes());
        } else if (loading instanceof State.Loading.DeactivateBinding) {
            requestDeactivateBinding(((State.Loading.DeactivateBinding) loading).getBindingId());
        } else if (loading instanceof State.Loading.Finish3dsMethod) {
            State.Loading.Finish3dsMethod finish3dsMethod = (State.Loading.Finish3dsMethod) loading;
            requestFinishMethod(finish3dsMethod.getTransactionId(), finish3dsMethod.getHasRedirect());
        } else {
            boolean z13 = loading instanceof State.Loading.JustASecond;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void handleState() {
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb(this.currentEcomState, new C40801(null)), ulzqkzuiru.iobyxmoadg(this));
    }

    private final void requestDeactivateBinding(String bindingId) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40811(bindingId, null), 2, null);
    }

    private final void requestFinishMethod(String transactionId, boolean hasRedirect) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40821(transactionId, hasRedirect, null), 2, null);
    }

    private final void requestFinishPayment(String cRes, String paRes) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40831(cRes, paRes, null), 2, null);
    }

    private final void requestPaymentOrder(PaymentTokenResponseBody paymentTokenResponse) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40841(paymentTokenResponse, null), 2, null);
    }

    private final void requestPaymentToken(String bindingId) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40851(bindingId, null), 2, null);
    }

    private final void requestSessionId() {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40861(null), 2, null);
    }

    private final void sendCallback() {
        Object cancel = this.ecomSdkResult;
        if (cancel == null) {
            cancel = new EcomSdkMerchantOptionsConfig.EcomSdkResult.Cancel(null, 1, null);
        }
        this.configRepository.getEcomSdkMerchantOptions().getCallback().invoke(cancel);
        ITracker.DefaultImpls.track$default(this.tracker, "sendCallback: " + cancel + " (" + this.ecomSdkResult + ')', null, null, null, 14, null);
    }

    public final wypolnanlu getState() {
        return this.state;
    }

    public final void sendAnalytic() {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new C40871(null), 3, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleEvent(EcomBottomSheetDialogEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof EcomBottomSheetDialogEvent.HandleSPaySdkResult) {
            this.reducer.invoke(new Action.HandleSPaySdkResult(((EcomBottomSheetDialogEvent.HandleSPaySdkResult) event).getResult()));
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40781(event, null), 2, null);
        } else if (event instanceof EcomBottomSheetDialogEvent.SendCallback) {
            sendCallback();
        } else if (event instanceof EcomBottomSheetDialogEvent.CopyLogToClipboard) {
            copyLogToClipboard(((EcomBottomSheetDialogEvent.CopyLogToClipboard) event).getClipboardManager());
        }
    }
}

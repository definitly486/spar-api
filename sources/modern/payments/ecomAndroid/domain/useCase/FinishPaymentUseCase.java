package modern.payments.ecomAndroid.domain.useCase;

import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import io.appmetrica.analytics.impl.C4007z9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.jvm.internal.gtknphoqwx;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsPaymentRequestBody;
import modern.payments.ecomAndroid.domain.model.response.FinishPaymentResponseBody;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.tracker.ITracker;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.krqnebusok;
import pj.pkzmftpjix;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006 "}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/FinishPaymentUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/base/BaseUseCase;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "ecomApiRepository", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "stateHandler", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/StateHandler;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "params", "Lpj/pkzmftpjix;", "dispatcher", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "errorEntity", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "getDefaultException", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;)Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FinishPaymentUseCase implements BaseUseCase<Finish3dsPaymentRequestBody> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TRACKER_TAG = "FinishPaymentUseCase";
    private final SafeEcomApiRepository ecomApiRepository;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final Reducer reducer;
    private final StateHandler stateHandler;
    private final ITracker tracker;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/FinishPaymentUseCase$Companion;", "", "()V", "TRACKER_TAG", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.FinishPaymentUseCase$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.FinishPaymentUseCase$invoke$2", f = "FinishPaymentUseCase.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, C4007z9.K, 51}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ pkzmftpjix $dispatcher;
        final /* synthetic */ Finish3dsPaymentRequestBody $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$params = finish3dsPaymentRequestBody;
            this.$dispatcher = pkzmftpjixVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return FinishPaymentUseCase.this.new AnonymousClass2(this.$params, this.$dispatcher, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Action handlePaymentResult;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                FinishPaymentUseCase.this.stateHandler.setState(new State.Loading.JustASecond(null, 1, null));
                SafeEcomApiRepository safeEcomApiRepository = FinishPaymentUseCase.this.ecomApiRepository;
                Finish3dsPaymentRequestBody finish3dsPaymentRequestBody = this.$params;
                this.label = 1;
                obj = safeEcomApiRepository.finish3dsPayment(finish3dsPaymentRequestBody, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    if (i13 == 2) {
                        zdlpuopuiu.zoijcleaow(obj);
                        handlePaymentResult = new Action.HandleException((State.Error) obj);
                        FinishPaymentUseCase.this.reducer.invoke(handlePaymentResult);
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                    handlePaymentResult = new Action.HandleException((State.Error) obj);
                    FinishPaymentUseCase.this.reducer.invoke(handlePaymentResult);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            ContentResponse contentResponse = (ContentResponse) obj;
            if (contentResponse instanceof ContentResponse.Failure) {
                FeatureExtensionsKt.track$default(FinishPaymentUseCase.this.tracker, FinishPaymentUseCase.this.ecomSdkOptionsRepository, "invoke(): response failure: " + contentResponse, null, null, FinishPaymentUseCase.TRACKER_TAG, 12, null);
                FinishPaymentUseCase finishPaymentUseCase = FinishPaymentUseCase.this;
                Finish3dsPaymentRequestBody finish3dsPaymentRequestBody2 = this.$params;
                ErrorEntity error = ((ContentResponse.Failure) contentResponse).getError();
                pkzmftpjix pkzmftpjixVar = this.$dispatcher;
                this.label = 2;
                obj = finishPaymentUseCase.handleFailureResponse(finish3dsPaymentRequestBody2, error, pkzmftpjixVar, (lg.gxszxtbevo) this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                handlePaymentResult = new Action.HandleException((State.Error) obj);
            } else {
                if (!(contentResponse instanceof ContentResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                ITracker iTracker = FinishPaymentUseCase.this.tracker;
                EcomSdkOptionsRepository ecomSdkOptionsRepository = FinishPaymentUseCase.this.ecomSdkOptionsRepository;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("invoke(): response success: ");
                sb3.append(contentResponse);
                sb3.append(", error: ");
                ContentResponse.Success success = (ContentResponse.Success) contentResponse;
                sb3.append(((FinishPaymentResponseBody) success.getData()).getErrorCode());
                FeatureExtensionsKt.track$default(iTracker, ecomSdkOptionsRepository, sb3.toString(), null, null, FinishPaymentUseCase.TRACKER_TAG, 12, null);
                String errorCode = ((FinishPaymentResponseBody) success.getData()).getErrorCode();
                if (errorCode == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(errorCode, CommonUrlParts.Values.FALSE_INTEGER)) {
                    handlePaymentResult = new Action.HandlePaymentResult((FinishPaymentResponseBody) success.getData(), false, 2, null);
                } else {
                    FinishPaymentUseCase finishPaymentUseCase2 = FinishPaymentUseCase.this;
                    Finish3dsPaymentRequestBody finish3dsPaymentRequestBody3 = this.$params;
                    String errorCode2 = ((FinishPaymentResponseBody) success.getData()).getErrorCode();
                    String errorMessage = ((FinishPaymentResponseBody) success.getData()).getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = "";
                    }
                    ErrorEntity.EcomServiceApiError.SuccessfulError successfulError = new ErrorEntity.EcomServiceApiError.SuccessfulError(errorCode2, errorMessage);
                    pkzmftpjix pkzmftpjixVar2 = this.$dispatcher;
                    this.label = 3;
                    obj = finishPaymentUseCase2.handleFailureResponse(finish3dsPaymentRequestBody3, (ErrorEntity) successfulError, pkzmftpjixVar2, (lg.gxszxtbevo) this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    handlePaymentResult = new Action.HandleException((State.Error) obj);
                }
            }
            FinishPaymentUseCase.this.reducer.invoke(handlePaymentResult);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public FinishPaymentUseCase(SafeEcomApiRepository ecomApiRepository, Reducer reducer, StateHandler stateHandler, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tracker, "tracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.ecomApiRepository = ecomApiRepository;
        this.reducer = reducer;
        this.stateHandler = stateHandler;
        this.tracker = tracker;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public State.Error.DefaultException getDefaultException(ErrorEntity errorEntity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorEntity, "errorEntity");
        return new State.Error.DefaultException.WhilePayment(errorEntity, false, 2, null);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object handleFailureResponse(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return handleFailureResponse2(finish3dsPaymentRequestBody, errorEntity, pkzmftpjixVar, (lg.gxszxtbevo<? super State.Error>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object invoke(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return invoke2(finish3dsPaymentRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object retry(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return retry2(finish3dsPaymentRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: handleFailureResponse, reason: avoid collision after fix types in other method */
    public Object handleFailureResponse2(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super State.Error> gxszxtbevoVar) {
        return BaseUseCase.DefaultImpls.handleFailureResponse(this, finish3dsPaymentRequestBody, errorEntity, pkzmftpjixVar, gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public Object invoke2(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(krqnebusok.zoijcleaow(null, 1, null)), new AnonymousClass2(finish3dsPaymentRequestBody, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: renamed from: retry, reason: avoid collision after fix types in other method */
    public Object retry2(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        return BaseUseCase.DefaultImpls.retry(this, finish3dsPaymentRequestBody, pkzmftpjixVar, gxszxtbevoVar);
    }
}

package modern.payments.ecomAndroid.domain.useCase;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.api.ContentResponseKt;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.request.DeactivateBindingRequestBody;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.tracker.ITracker;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.krqnebusok;
import pj.pkzmftpjix;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/DeactivateBindingUseCaseImpl;", "Lmodern/payments/ecomAndroid/domain/useCase/DeactivateBindingUseCase;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "ecomApiRepository", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "stateHandler", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;Lmodern/payments/ecomAndroid/domain/StateHandler;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "", "bindingId", "Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;", "getRequest", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "params", "Lpj/pkzmftpjix;", "dispatcher", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "errorEntity", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "getDefaultException", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;)Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeactivateBindingUseCaseImpl implements DeactivateBindingUseCase {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TRACKER_TAG = "DeactivateBindingUseCase";
    private final AppDataRepository appDataRepository;
    private final SafeEcomApiRepository ecomApiRepository;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final Reducer reducer;
    private final StateHandler stateHandler;
    private final ITracker tracker;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/DeactivateBindingUseCaseImpl$Companion;", "", "()V", "TRACKER_TAG", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.DeactivateBindingUseCaseImpl$getRequest$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "data", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends jyumaefscl implements draadjrbmk {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public final String invoke(SessionIdResponseBody data) {
            zdlpuopuiu.btonecajqb(data, "data");
            return data.getSessionId();
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.DeactivateBindingUseCaseImpl$invoke$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.DeactivateBindingUseCaseImpl$invoke$2", f = "DeactivateBindingUseCaseImpl.kt", l = {46, 50}, m = "invokeSuspend")
    static final class C40642 extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ pkzmftpjix $dispatcher;
        final /* synthetic */ DeactivateBindingRequestBody $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40642(DeactivateBindingRequestBody deactivateBindingRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super C40642> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$params = deactivateBindingRequestBody;
            this.$dispatcher = pkzmftpjixVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return DeactivateBindingUseCaseImpl.this.new C40642(this.$params, this.$dispatcher, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Action handleException;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                handleException = new Action.HandleException((State.Error) obj);
                DeactivateBindingUseCaseImpl.this.reducer.invoke(handleException);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            DeactivateBindingUseCaseImpl.this.stateHandler.setState(new State.Loading.JustASecond(null, 1, null));
            SafeEcomApiRepository safeEcomApiRepository = DeactivateBindingUseCaseImpl.this.ecomApiRepository;
            DeactivateBindingRequestBody deactivateBindingRequestBody = this.$params;
            this.label = 1;
            obj = safeEcomApiRepository.deactivateBinding(deactivateBindingRequestBody, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ContentResponse contentResponse = (ContentResponse) obj;
            if (contentResponse instanceof ContentResponse.Failure) {
                FeatureExtensionsKt.track$default(DeactivateBindingUseCaseImpl.this.tracker, DeactivateBindingUseCaseImpl.this.ecomSdkOptionsRepository, "invoke(): response failure: " + contentResponse, null, null, DeactivateBindingUseCaseImpl.TRACKER_TAG, 12, null);
                DeactivateBindingUseCaseImpl deactivateBindingUseCaseImpl = DeactivateBindingUseCaseImpl.this;
                DeactivateBindingRequestBody deactivateBindingRequestBody2 = this.$params;
                ErrorEntity error = ((ContentResponse.Failure) contentResponse).getError();
                pkzmftpjix pkzmftpjixVar = this.$dispatcher;
                this.label = 2;
                obj = deactivateBindingUseCaseImpl.handleFailureResponse(deactivateBindingRequestBody2, error, pkzmftpjixVar, (lg.gxszxtbevo) this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                handleException = new Action.HandleException((State.Error) obj);
            } else {
                if (!(contentResponse instanceof ContentResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                FeatureExtensionsKt.track$default(DeactivateBindingUseCaseImpl.this.tracker, DeactivateBindingUseCaseImpl.this.ecomSdkOptionsRepository, "invoke(): response success: " + contentResponse, null, null, DeactivateBindingUseCaseImpl.TRACKER_TAG, 12, null);
                handleException = Action.HandleSuccessBindingDeactivation.INSTANCE;
            }
            DeactivateBindingUseCaseImpl.this.reducer.invoke(handleException);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40642) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public DeactivateBindingUseCaseImpl(AppDataRepository appDataRepository, SafeEcomApiRepository ecomApiRepository, StateHandler stateHandler, ITracker tracker, Reducer reducer, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.appDataRepository = appDataRepository;
        this.ecomApiRepository = ecomApiRepository;
        this.stateHandler = stateHandler;
        this.tracker = tracker;
        this.reducer = reducer;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public State.Error.DefaultException getDefaultException(ErrorEntity errorEntity) {
        zdlpuopuiu.btonecajqb(errorEntity, "errorEntity");
        return new State.Error.DefaultException.WhileDeactivateBinding(errorEntity, false, 2, null);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.DeactivateBindingUseCase
    public Object getRequest(String str, lg.gxszxtbevo<? super DeactivateBindingRequestBody> gxszxtbevoVar) {
        String str2;
        ContentResponse contentResponse = (ContentResponse) this.appDataRepository.getSessionIdResponse().getValue();
        String str3 = "";
        if (contentResponse != null && (str2 = (String) ContentResponseKt.getOrDefault(contentResponse, AnonymousClass2.INSTANCE, "")) != null) {
            str3 = str2;
        }
        return new DeactivateBindingRequestBody(str, str3);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object handleFailureResponse(DeactivateBindingRequestBody deactivateBindingRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return handleFailureResponse2(deactivateBindingRequestBody, errorEntity, pkzmftpjixVar, (lg.gxszxtbevo<? super State.Error>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object invoke(DeactivateBindingRequestBody deactivateBindingRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return invoke2(deactivateBindingRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object retry(DeactivateBindingRequestBody deactivateBindingRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return retry2(deactivateBindingRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: handleFailureResponse, reason: avoid collision after fix types in other method */
    public Object handleFailureResponse2(DeactivateBindingRequestBody deactivateBindingRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super State.Error> gxszxtbevoVar) {
        return DeactivateBindingUseCase.DefaultImpls.handleFailureResponse(this, deactivateBindingRequestBody, errorEntity, pkzmftpjixVar, gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public Object invoke2(DeactivateBindingRequestBody deactivateBindingRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(krqnebusok.zoijcleaow(null, 1, null)), new C40642(deactivateBindingRequestBody, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: renamed from: retry, reason: avoid collision after fix types in other method */
    public Object retry2(DeactivateBindingRequestBody deactivateBindingRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        return DeactivateBindingUseCase.DefaultImpls.retry(this, deactivateBindingRequestBody, pkzmftpjixVar, gxszxtbevoVar);
    }
}

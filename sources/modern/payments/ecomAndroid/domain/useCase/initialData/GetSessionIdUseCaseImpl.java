package modern.payments.ecomAndroid.domain.useCase.initialData;

import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.MerchantInitialData;
import modern.payments.ecomAndroid.domain.model.request.SessionIdRequestBody;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.AuthViewAction;
import pj.cllcsxoeiz;
import pj.krqnebusok;
import pj.pkzmftpjix;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetSessionIdUseCaseImpl;", "Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetSessionIdUseCase;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "ecomApiRepository", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "merchantDataProvider", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "stateHandler", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;Lmodern/payments/ecomAndroid/domain/StateHandler;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;)V", "Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;", "getRequest", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "params", "Lpj/pkzmftpjix;", "dispatcher", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "errorEntity", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "getDefaultException", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;)Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetSessionIdUseCaseImpl implements GetSessionIdUseCase {
    private final AppDataRepository appDataRepository;
    private final ConfigRepository configRepository;
    private final SafeEcomApiRepository ecomApiRepository;
    private final EcomMetricUtil ecomMetricUtil;
    private final MerchantDataProvider merchantDataProvider;
    private final Reducer reducer;
    private final StateHandler stateHandler;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCaseImpl$getRequest$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCaseImpl", f = "GetSessionIdUseCaseImpl.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "getRequest")
    static final class AnonymousClass1 extends wkgbmnqykc {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetSessionIdUseCaseImpl.this.getRequest(this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCaseImpl$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCaseImpl$invoke$2", f = "GetSessionIdUseCaseImpl.kt", l = {59, 60, 67}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ pkzmftpjix $dispatcher;
        final /* synthetic */ SessionIdRequestBody $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SessionIdRequestBody sessionIdRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$params = sessionIdRequestBody;
            this.$dispatcher = pkzmftpjixVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return GetSessionIdUseCaseImpl.this.new AnonymousClass2(this.$params, this.$dispatcher, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0090  */
        /* JADX WARN: Code duplicated, block: B:22:0x00a5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object sessionId;
            ContentResponse<SessionIdResponseBody> contentResponse;
            Action handleSessionId;
            Object objHandleFailureResponse;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 == 2) {
                        zdlpuopuiu.zoijcleaow(obj);
                        sessionId = obj;
                        contentResponse = (ContentResponse) sessionId;
                        GetSessionIdUseCaseImpl.this.appDataRepository.setSessionIdResponse(contentResponse);
                        if (contentResponse instanceof ContentResponse.Failure) {
                            GetSessionIdUseCaseImpl getSessionIdUseCaseImpl = GetSessionIdUseCaseImpl.this;
                            SessionIdRequestBody sessionIdRequestBody = this.$params;
                            ErrorEntity error = ((ContentResponse.Failure) contentResponse).getError();
                            pkzmftpjix pkzmftpjixVar = this.$dispatcher;
                            this.label = 3;
                            objHandleFailureResponse = getSessionIdUseCaseImpl.handleFailureResponse(sessionIdRequestBody, error, pkzmftpjixVar, (lg.gxszxtbevo) this);
                            if (objHandleFailureResponse == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else {
                            if (contentResponse instanceof ContentResponse.Success) {
                                throw new NoWhenBranchMatchedException();
                            }
                            handleSessionId = new Action.HandleSessionId((SessionIdResponseBody) ((ContentResponse.Success) contentResponse).getData());
                        }
                        GetSessionIdUseCaseImpl.this.reducer.invoke(handleSessionId);
                        GetSessionIdUseCaseImpl.this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(AuthViewAction.AUTH_VIEW_DISAPPEARED, Views.AUTH_VIEW, ActionType.LC, null, null, null, null, null, 248, null));
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                    objHandleFailureResponse = obj;
                }
                handleSessionId = new Action.HandleException((State.Error) objHandleFailureResponse);
                GetSessionIdUseCaseImpl.this.reducer.invoke(handleSessionId);
                GetSessionIdUseCaseImpl.this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(AuthViewAction.AUTH_VIEW_DISAPPEARED, Views.AUTH_VIEW, ActionType.LC, null, null, null, null, null, 248, null));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            GetSessionIdUseCaseImpl.this.stateHandler.setState(new State.Loading.JustASecond(null, 1, null));
            GetSessionIdUseCaseImpl.this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(AuthViewAction.AUTH_VIEW_APPEARED, Views.AUTH_VIEW, ActionType.LC, null, null, null, null, null, 248, null));
            ConfigRepository configRepository = GetSessionIdUseCaseImpl.this.configRepository;
            this.label = 1;
            if (configRepository.requestSbpConfig(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            SafeEcomApiRepository safeEcomApiRepository = GetSessionIdUseCaseImpl.this.ecomApiRepository;
            SessionIdRequestBody sessionIdRequestBody2 = this.$params;
            this.label = 2;
            sessionId = safeEcomApiRepository.getSessionId(sessionIdRequestBody2, this);
            if (sessionId == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            contentResponse = (ContentResponse) sessionId;
            GetSessionIdUseCaseImpl.this.appDataRepository.setSessionIdResponse(contentResponse);
            if (contentResponse instanceof ContentResponse.Failure) {
                GetSessionIdUseCaseImpl getSessionIdUseCaseImpl2 = GetSessionIdUseCaseImpl.this;
                SessionIdRequestBody sessionIdRequestBody3 = this.$params;
                ErrorEntity error2 = ((ContentResponse.Failure) contentResponse).getError();
                pkzmftpjix pkzmftpjixVar2 = this.$dispatcher;
                this.label = 3;
                objHandleFailureResponse = getSessionIdUseCaseImpl2.handleFailureResponse(sessionIdRequestBody3, error2, pkzmftpjixVar2, (lg.gxszxtbevo) this);
                if (objHandleFailureResponse == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                handleSessionId = new Action.HandleException((State.Error) objHandleFailureResponse);
            } else {
                if (contentResponse instanceof ContentResponse.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                handleSessionId = new Action.HandleSessionId((SessionIdResponseBody) ((ContentResponse.Success) contentResponse).getData());
            }
            GetSessionIdUseCaseImpl.this.reducer.invoke(handleSessionId);
            GetSessionIdUseCaseImpl.this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(AuthViewAction.AUTH_VIEW_DISAPPEARED, Views.AUTH_VIEW, ActionType.LC, null, null, null, null, null, 248, null));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public GetSessionIdUseCaseImpl(SafeEcomApiRepository ecomApiRepository, Reducer reducer, MerchantDataProvider merchantDataProvider, StateHandler stateHandler, AppDataRepository appDataRepository, EcomMetricUtil ecomMetricUtil, ConfigRepository configRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        this.ecomApiRepository = ecomApiRepository;
        this.reducer = reducer;
        this.merchantDataProvider = merchantDataProvider;
        this.stateHandler = stateHandler;
        this.appDataRepository = appDataRepository;
        this.ecomMetricUtil = ecomMetricUtil;
        this.configRepository = configRepository;
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public State.Error.DefaultException getDefaultException(ErrorEntity errorEntity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorEntity, "errorEntity");
        return new State.Error.DefaultException.WhileSessionId(errorEntity, false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.useCase.initialData.GetSessionIdUseCase
    public Object getRequest(lg.gxszxtbevo<? super SessionIdRequestBody> gxszxtbevoVar) {
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
        Object objPmvmpeiblj = anonymousClass1.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = anonymousClass1.label;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objPmvmpeiblj);
            lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(this.merchantDataProvider.getMerchantData());
            anonymousClass1.label = 1;
            objPmvmpeiblj = dxjokdxxww.pmvmpeiblj(lqeggnwhkgVarLereixgezr, anonymousClass1);
            if (objPmvmpeiblj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objPmvmpeiblj);
        }
        MerchantInitialData merchantInitialData = (MerchantInitialData) objPmvmpeiblj;
        return new SessionIdRequestBody(merchantInitialData.getMerchantLogin(), merchantInitialData.getBankInvoiceId());
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object handleFailureResponse(SessionIdRequestBody sessionIdRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return handleFailureResponse2(sessionIdRequestBody, errorEntity, pkzmftpjixVar, (lg.gxszxtbevo<? super State.Error>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object invoke(SessionIdRequestBody sessionIdRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return invoke2(sessionIdRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object retry(SessionIdRequestBody sessionIdRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return retry2(sessionIdRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: handleFailureResponse, reason: avoid collision after fix types in other method */
    public Object handleFailureResponse2(SessionIdRequestBody sessionIdRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super State.Error> gxszxtbevoVar) {
        return GetSessionIdUseCase.DefaultImpls.handleFailureResponse(this, sessionIdRequestBody, errorEntity, pkzmftpjixVar, gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public Object invoke2(SessionIdRequestBody sessionIdRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(krqnebusok.zoijcleaow(null, 1, null)), new AnonymousClass2(sessionIdRequestBody, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: renamed from: retry, reason: avoid collision after fix types in other method */
    public Object retry2(SessionIdRequestBody sessionIdRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        return GetSessionIdUseCase.DefaultImpls.retry(this, sessionIdRequestBody, pkzmftpjixVar, gxszxtbevoVar);
    }
}

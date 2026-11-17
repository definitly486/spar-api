package modern.payments.ecomAndroid.data.repository;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lm.kcexrzcfyt;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.data.dto.EcomSbpConfigDto;
import modern.payments.ecomAndroid.data.dto.EcomSdkConfigDto;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;
import modern.payments.ecomAndroid.domain.model.response.EcomSdkConfig;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.StatusType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.AuthViewAction;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.MerchantViewAction;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.SbpViewAction;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.extension.ResponseExtensionKt;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017H\u0096@¢\u0006\u0004\b\u001c\u0010\u001aJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/UnsafeEcomApiRepositoryImpl;", "Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "Lmodern/payments/ecomAndroid/domain/repository/BaseNetworkRepository;", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "", "okHttpErrorHandlerImpl", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "apiErrorHandlerImpl", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "ipAddressProvider", "Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;", "unsafeEcomMockDataSource", "unsafeEcomNetworkDataSource", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "getUnsafeEcomDataSource", "()Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "getConfig", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig;", "getSbpConfig", "", "serviceUrl", "getIpAddress", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UnsafeEcomApiRepositoryImpl extends BaseNetworkRepository implements UnsafeEcomApiRepository {
    private final EcomMetricUtil ecomMetricUtil;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final IpAddressProvider ipAddressProvider;
    private final NetworkErrorHandler<Throwable> okHttpErrorHandlerImpl;
    private final ITracker tracker;
    private final UnsafeEcomDataSource unsafeEcomMockDataSource;
    private final UnsafeEcomDataSource unsafeEcomNetworkDataSource;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.UnsafeEcomApiRepositoryImpl$getConfig$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto;", "<anonymous>", "()Llm/kcexrzcfyt;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.UnsafeEcomApiRepositoryImpl$getConfig$2", f = "UnsafeEcomApiRepositoryImpl.kt", l = {52}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements tg.draadjrbmk {
        int label;

        AnonymousClass2(lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(lg.gxszxtbevo<?> gxszxtbevoVar) {
            return UnsafeEcomApiRepositoryImpl.this.new AnonymousClass2(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                UnsafeEcomDataSource unsafeEcomDataSource = UnsafeEcomApiRepositoryImpl.this.getUnsafeEcomDataSource();
                this.label = 1;
                obj = unsafeEcomDataSource.getConfig(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo<? super kcexrzcfyt<EcomSdkConfigDto>> gxszxtbevoVar) {
            return ((AnonymousClass2) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.UnsafeEcomApiRepositoryImpl$getIpAddress$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.UnsafeEcomApiRepositoryImpl", f = "UnsafeEcomApiRepositoryImpl.kt", l = {72}, m = "getIpAddress")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnsafeEcomApiRepositoryImpl.this.getIpAddress(null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.UnsafeEcomApiRepositoryImpl$getSbpConfig$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomSbpConfigDto;", "<anonymous>", "()Llm/kcexrzcfyt;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.UnsafeEcomApiRepositoryImpl$getSbpConfig$2", f = "UnsafeEcomApiRepositoryImpl.kt", l = {59}, m = "invokeSuspend")
    static final class C40622 extends draadjrbmk implements tg.draadjrbmk {
        int label;

        C40622(lg.gxszxtbevo<? super C40622> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(lg.gxszxtbevo<?> gxszxtbevoVar) {
            return UnsafeEcomApiRepositoryImpl.this.new C40622(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                UnsafeEcomDataSource unsafeEcomDataSource = UnsafeEcomApiRepositoryImpl.this.getUnsafeEcomDataSource();
                this.label = 1;
                obj = unsafeEcomDataSource.getSbpConfig(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo<? super kcexrzcfyt<EcomSbpConfigDto>> gxszxtbevoVar) {
            return ((C40622) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsafeEcomApiRepositoryImpl(NetworkErrorHandler<Throwable> okHttpErrorHandlerImpl, NetworkErrorHandler<EcomApiError> apiErrorHandlerImpl, ITracker tracker, IpAddressProvider ipAddressProvider, UnsafeEcomDataSource unsafeEcomMockDataSource, UnsafeEcomDataSource unsafeEcomNetworkDataSource, EcomMetricUtil ecomMetricUtil, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        super(okHttpErrorHandlerImpl, apiErrorHandlerImpl, tracker, ecomMetricUtil, ecomSdkOptionsRepository);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(okHttpErrorHandlerImpl, "okHttpErrorHandlerImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiErrorHandlerImpl, "apiErrorHandlerImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tracker, "tracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ipAddressProvider, "ipAddressProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(unsafeEcomMockDataSource, "unsafeEcomMockDataSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(unsafeEcomNetworkDataSource, "unsafeEcomNetworkDataSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.okHttpErrorHandlerImpl = okHttpErrorHandlerImpl;
        this.tracker = tracker;
        this.ipAddressProvider = ipAddressProvider;
        this.unsafeEcomMockDataSource = unsafeEcomMockDataSource;
        this.unsafeEcomNetworkDataSource = unsafeEcomNetworkDataSource;
        this.ecomMetricUtil = ecomMetricUtil;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnsafeEcomDataSource getUnsafeEcomDataSource() {
        return EcomStagingConfig.INSTANCE.isLocalMocksMode() ? this.unsafeEcomMockDataSource : this.unsafeEcomNetworkDataSource;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository
    public Object getConfig(lg.gxszxtbevo<? super ContentResponse<EcomSdkConfig>> gxszxtbevoVar) {
        return BaseNetworkRepository.callWithResponse$default(this, MerchantViewAction.REMOTE_CONFIG, Views.MERCHANT_VIEW, new AnonymousClass2(null), null, gxszxtbevoVar, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:12:0x002d, B:30:0x0074, B:32:0x007c, B:36:0x00aa, B:38:0x00af, B:41:0x00b6, B:43:0x00f4, B:42:0x00da, B:44:0x00ff, B:46:0x0129, B:49:0x0131), top: B:57:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:12:0x002d, B:30:0x0074, B:32:0x007c, B:36:0x00aa, B:38:0x00af, B:41:0x00b6, B:43:0x00f4, B:42:0x00da, B:44:0x00ff, B:46:0x0129, B:49:0x0131), top: B:57:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:12:0x002d, B:30:0x0074, B:32:0x007c, B:36:0x00aa, B:38:0x00af, B:41:0x00b6, B:43:0x00f4, B:42:0x00da, B:44:0x00ff, B:46:0x0129, B:49:0x0131), top: B:57:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0129 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:12:0x002d, B:30:0x0074, B:32:0x007c, B:36:0x00aa, B:38:0x00af, B:41:0x00b6, B:43:0x00f4, B:42:0x00da, B:44:0x00ff, B:46:0x0129, B:49:0x0131), top: B:57:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository
    public Object getIpAddress(String str, lg.gxszxtbevo<? super ContentResponse<String>> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        UnsafeEcomApiRepositoryImpl unsafeEcomApiRepositoryImpl;
        kcexrzcfyt kcexrzcfytVar;
        EcomApiError errorBody;
        String errorCode;
        AuthViewAction authViewAction;
        Views views;
        String str2;
        String str3;
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
        Object ipAddress = anonymousClass1.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = anonymousClass1.label;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            unsafeEcomApiRepositoryImpl = (UnsafeEcomApiRepositoryImpl) anonymousClass1.L$0;
            try {
                zdlpuopuiu.zoijcleaow(ipAddress);
                kcexrzcfytVar = (kcexrzcfyt) ipAddress;
                if (ResponseExtensionKt.isContentSuccessful(kcexrzcfytVar)) {
                    errorBody = ResponseExtensionKt.readErrorBody(kcexrzcfytVar.eablkybsjg(), String.valueOf(kcexrzcfytVar.zoijcleaow()));
                    ErrorEntity errorEntityProcessErrorBody = unsafeEcomApiRepositoryImpl.processErrorBody(kcexrzcfytVar, errorBody);
                    EcomMetricUtil ecomMetricUtil = unsafeEcomApiRepositoryImpl.ecomMetricUtil;
                    AuthViewAction authViewAction2 = AuthViewAction.IP;
                    Views views2 = Views.AUTH_VIEW;
                    ActionType actionType = ActionType.RQ;
                    StatusType statusType = StatusType.FAIL;
                    Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow());
                    if (errorBody != null) {
                        errorCode = errorBody.getErrorCode();
                    } else {
                        errorCode = null;
                    }
                    ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(authViewAction2, views2, actionType, statusType, null, numWkgbmnqykc, errorCode, null, 144, null));
                    FeatureExtensionsKt.track$default(unsafeEcomApiRepositoryImpl.tracker, unsafeEcomApiRepositoryImpl.ecomSdkOptionsRepository, String.valueOf(errorBody), null, ITracker.Priority.WARNING, null, 20, null);
                    return new ContentResponse.Failure(errorEntityProcessErrorBody);
                }
                EcomMetricUtil ecomMetricUtil2 = unsafeEcomApiRepositoryImpl.ecomMetricUtil;
                authViewAction = AuthViewAction.IP;
                views = Views.AUTH_VIEW;
                ActionType actionType2 = ActionType.RQ;
                StatusType statusType2 = StatusType.GOOD;
                ecomMetricUtil2.report(new EcomMetricUtil.MetricEvent(authViewAction, views, actionType2, statusType2, null, null, null, null, 240, null));
                str2 = (String) kcexrzcfytVar.iobyxmoadg();
                IpAddressProvider ipAddressProvider = unsafeEcomApiRepositoryImpl.ipAddressProvider;
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                ipAddressProvider.updateIpAddress(str3);
                if (str2 != null || mj.kcexrzcfyt.zfvoamnweg(str2)) {
                    unsafeEcomApiRepositoryImpl.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(authViewAction, views, ActionType.RS, StatusType.FAIL, null, null, null, null, 240, null));
                } else {
                    unsafeEcomApiRepositoryImpl.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(authViewAction, views, ActionType.RS, statusType2, null, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow()), null, null, OrderServiceErrorHandlerImpl.ORDER_STATUS_INCORRECT, null));
                }
                return new ContentResponse.Success(String.valueOf(str2));
            } catch (Exception e13) {
                e = e13;
                FeatureExtensionsKt.track$default(unsafeEcomApiRepositoryImpl.tracker, unsafeEcomApiRepositoryImpl.ecomSdkOptionsRepository, null, e, ITracker.Priority.ERROR, null, 16, null);
                return new ContentResponse.Failure(unsafeEcomApiRepositoryImpl.okHttpErrorHandlerImpl.getError(e));
            }
        }
        zdlpuopuiu.zoijcleaow(ipAddress);
        this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(AuthViewAction.IP, Views.AUTH_VIEW, ActionType.RQ, null, null, null, null, null, 248, null));
        try {
            UnsafeEcomDataSource unsafeEcomDataSource = getUnsafeEcomDataSource();
            String str4 = str == null ? Constants.GET_IP_DEFAULT_URL : str;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            ipAddress = unsafeEcomDataSource.getIpAddress(str4, anonymousClass1);
            if (ipAddress == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            unsafeEcomApiRepositoryImpl = this;
            kcexrzcfytVar = (kcexrzcfyt) ipAddress;
            if (ResponseExtensionKt.isContentSuccessful(kcexrzcfytVar)) {
                errorBody = ResponseExtensionKt.readErrorBody(kcexrzcfytVar.eablkybsjg(), String.valueOf(kcexrzcfytVar.zoijcleaow()));
                ErrorEntity errorEntityProcessErrorBody2 = unsafeEcomApiRepositoryImpl.processErrorBody(kcexrzcfytVar, errorBody);
                EcomMetricUtil ecomMetricUtil3 = unsafeEcomApiRepositoryImpl.ecomMetricUtil;
                AuthViewAction authViewAction3 = AuthViewAction.IP;
                Views views3 = Views.AUTH_VIEW;
                ActionType actionType3 = ActionType.RQ;
                StatusType statusType3 = StatusType.FAIL;
                Integer numWkgbmnqykc2 = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow());
                if (errorBody != null) {
                    errorCode = errorBody.getErrorCode();
                } else {
                    errorCode = null;
                }
                ecomMetricUtil3.report(new EcomMetricUtil.MetricEvent(authViewAction3, views3, actionType3, statusType3, null, numWkgbmnqykc2, errorCode, null, 144, null));
                FeatureExtensionsKt.track$default(unsafeEcomApiRepositoryImpl.tracker, unsafeEcomApiRepositoryImpl.ecomSdkOptionsRepository, String.valueOf(errorBody), null, ITracker.Priority.WARNING, null, 20, null);
                return new ContentResponse.Failure(errorEntityProcessErrorBody2);
            }
            EcomMetricUtil ecomMetricUtil4 = unsafeEcomApiRepositoryImpl.ecomMetricUtil;
            authViewAction = AuthViewAction.IP;
            views = Views.AUTH_VIEW;
            ActionType actionType4 = ActionType.RQ;
            StatusType statusType4 = StatusType.GOOD;
            ecomMetricUtil4.report(new EcomMetricUtil.MetricEvent(authViewAction, views, actionType4, statusType4, null, null, null, null, 240, null));
            str2 = (String) kcexrzcfytVar.iobyxmoadg();
            IpAddressProvider ipAddressProvider2 = unsafeEcomApiRepositoryImpl.ipAddressProvider;
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            ipAddressProvider2.updateIpAddress(str3);
            if (str2 != null) {
                unsafeEcomApiRepositoryImpl.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(authViewAction, views, ActionType.RS, StatusType.FAIL, null, null, null, null, 240, null));
            } else {
                unsafeEcomApiRepositoryImpl.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(authViewAction, views, ActionType.RS, StatusType.FAIL, null, null, null, null, 240, null));
            }
            return new ContentResponse.Success(String.valueOf(str2));
        } catch (Exception e14) {
            e = e14;
            unsafeEcomApiRepositoryImpl = this;
            FeatureExtensionsKt.track$default(unsafeEcomApiRepositoryImpl.tracker, unsafeEcomApiRepositoryImpl.ecomSdkOptionsRepository, null, e, ITracker.Priority.ERROR, null, 16, null);
            return new ContentResponse.Failure(unsafeEcomApiRepositoryImpl.okHttpErrorHandlerImpl.getError(e));
        }
    }

    @Override // modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository
    public Object getSbpConfig(lg.gxszxtbevo<? super ContentResponse<EcomSbpConfig>> gxszxtbevoVar) {
        return BaseNetworkRepository.callWithResponse$default(this, SbpViewAction.SBP_CONFIG, Views.SBP_VIEW, new C40622(null), null, gxszxtbevoVar, 8, null);
    }
}

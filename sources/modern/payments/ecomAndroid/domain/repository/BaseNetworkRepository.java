package modern.payments.ecomAndroid.domain.repository;

import gg.cqumvgiudr;
import gg.wwaezpbzkn;
import hg.tzroggbefp;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lm.kcexrzcfyt;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.data.dto.base.DataDtoInterface;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.util.analytics.metrics.Action;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.StatusType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.exception.NullRequiredBodyException;
import modern.payments.ecomAndroid.util.exception.NullRequiredFieldException;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.extension.ResponseExtensionKt;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import modern.payments.tracker.ITracker;
import retrofit2.HttpException;
import tg.draadjrbmk;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0082\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001326\b\u0002\u0010\u001b\u001a0\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0098\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\"\u000e\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00010\u001f\"\u0004\b\u0001\u0010!2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001326\b\u0002\u0010\u001b\u001a0\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b\"\u0010\u001eJE\u0010#\u001a\u00028\u0001\"\u000e\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00010\u001f\"\u0004\b\u0001\u0010!*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J+\u0010(\u001a\u00020'\"\u0004\b\u0000\u0010!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-¨\u0006."}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/BaseNetworkRepository;", "", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "", "networkErrorHandlerImpl", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "apiResponseErrorHandlerImpl", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;", "requestAction", "Lmodern/payments/ecomAndroid/util/analytics/metrics/Views;", "view", "Lkotlin/Function1;", "Llg/gxszxtbevo;", "Llm/kcexrzcfyt;", "Lgg/wwaezpbzkn;", "block", "Lkotlin/Function4;", "", "", "analyticData", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "call", "(Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;Lmodern/payments/ecomAndroid/util/analytics/metrics/Views;Ltg/draadjrbmk;Ltg/oxmwwwfdhm;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "Dto", "Model", "callWithResponse", "mapDtoToModel", "(Llm/kcexrzcfyt;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;Lmodern/payments/ecomAndroid/util/analytics/metrics/Views;)Ljava/lang/Object;", "raw", "errorBody", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "processErrorBody", "(Llm/kcexrzcfyt;Lmodern/payments/ecomAndroid/domain/model/EcomApiError;)Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseNetworkRepository {
    private final NetworkErrorHandler<EcomApiError> apiResponseErrorHandlerImpl;
    private final EcomMetricUtil ecomMetricUtil;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final NetworkErrorHandler<Throwable> networkErrorHandlerImpl;
    private final ITracker tracker;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository$call$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository", f = "BaseNetworkRepository.kt", l = {48, 59, 74}, m = "call")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseNetworkRepository.this.call(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository$callWithResponse$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository", f = "BaseNetworkRepository.kt", l = {108, 119, 140}, m = "callWithResponse")
    static final class C40631<Dto extends DataDtoInterface<Model>, Model> extends wkgbmnqykc {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C40631(lg.gxszxtbevo<? super C40631> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseNetworkRepository.this.callWithResponse(null, null, null, null, this);
        }
    }

    public BaseNetworkRepository(NetworkErrorHandler<Throwable> networkErrorHandlerImpl, NetworkErrorHandler<EcomApiError> apiResponseErrorHandlerImpl, ITracker tracker, EcomMetricUtil ecomMetricUtil, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.networkErrorHandlerImpl = networkErrorHandlerImpl;
        this.apiResponseErrorHandlerImpl = apiResponseErrorHandlerImpl;
        this.tracker = tracker;
        this.ecomMetricUtil = ecomMetricUtil;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    public static /* synthetic */ Object call$default(BaseNetworkRepository baseNetworkRepository, Action action, Views views, draadjrbmk draadjrbmkVar, oxmwwwfdhm oxmwwwfdhmVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: call");
        }
        if ((i13 & 8) != 0) {
            oxmwwwfdhmVar = null;
        }
        return baseNetworkRepository.call(action, views, draadjrbmkVar, oxmwwwfdhmVar, gxszxtbevoVar);
    }

    public static /* synthetic */ Object callWithResponse$default(BaseNetworkRepository baseNetworkRepository, Action action, Views views, draadjrbmk draadjrbmkVar, oxmwwwfdhm oxmwwwfdhmVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callWithResponse");
        }
        if ((i13 & 8) != 0) {
            oxmwwwfdhmVar = null;
        }
        return baseNetworkRepository.callWithResponse(action, views, draadjrbmkVar, oxmwwwfdhmVar, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0171 A[Catch: Exception -> 0x0136, TryCatch #8 {Exception -> 0x0136, blocks: (B:49:0x0123, B:63:0x0155, B:65:0x0171, B:69:0x017e, B:73:0x0188, B:75:0x01bf, B:77:0x01cb, B:80:0x01d4, B:82:0x01db), top: B:116:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e A[Catch: Exception -> 0x0136, TryCatch #8 {Exception -> 0x0136, blocks: (B:49:0x0123, B:63:0x0155, B:65:0x0171, B:69:0x017e, B:73:0x0188, B:75:0x01bf, B:77:0x01cb, B:80:0x01d4, B:82:0x01db), top: B:116:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf A[Catch: Exception -> 0x0136, TryCatch #8 {Exception -> 0x0136, blocks: (B:49:0x0123, B:63:0x0155, B:65:0x0171, B:69:0x017e, B:73:0x0188, B:75:0x01bf, B:77:0x01cb, B:80:0x01d4, B:82:0x01db), top: B:116:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01cb A[Catch: Exception -> 0x0136, TryCatch #8 {Exception -> 0x0136, blocks: (B:49:0x0123, B:63:0x0155, B:65:0x0171, B:69:0x017e, B:73:0x0188, B:75:0x01bf, B:77:0x01cb, B:80:0x01d4, B:82:0x01db), top: B:116:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d4 A[Catch: Exception -> 0x0136, TryCatch #8 {Exception -> 0x0136, blocks: (B:49:0x0123, B:63:0x0155, B:65:0x0171, B:69:0x017e, B:73:0x0188, B:75:0x01bf, B:77:0x01cb, B:80:0x01d4, B:82:0x01db), top: B:116:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21, types: [modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r30v0, types: [tg.draadjrbmk] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final Object call(Action action, Views views, draadjrbmk draadjrbmkVar, oxmwwwfdhm oxmwwwfdhmVar, lg.gxszxtbevo<? super ContentResponse<wwaezpbzkn>> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        Action action2;
        Views views2;
        Exception exc;
        ?? r13;
        Action action3;
        Views views3;
        oxmwwwfdhm oxmwwwfdhmVar2;
        BaseNetworkRepository baseNetworkRepository;
        Object obj;
        Views views4;
        kcexrzcfyt kcexrzcfytVar;
        BaseNetworkRepository baseNetworkRepository2;
        EcomApiError errorBody;
        String errorCode;
        String description;
        BaseNetworkRepository baseNetworkRepository3;
        Views views5;
        EcomApiError ecomApiError;
        kcexrzcfyt kcexrzcfytVar2;
        Integer numWkgbmnqykc;
        String errorCode2;
        String description2;
        Action action4;
        kcexrzcfyt kcexrzcfytVar3;
        BaseNetworkRepository baseNetworkRepository4;
        BaseNetworkRepository baseNetworkRepository5;
        Views views6;
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
        ?? r14 = 2;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            try {
                this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(action, views, ActionType.RQ, null, null, null, null, null, 248, null));
                anonymousClass1.L$0 = this;
                action2 = action;
                try {
                    anonymousClass1.L$1 = action2;
                    views2 = views;
                    try {
                        anonymousClass1.L$2 = views2;
                        oxmwwwfdhmVar2 = oxmwwwfdhmVar;
                        anonymousClass1.L$3 = oxmwwwfdhmVar2;
                        anonymousClass1.label = 1;
                        Object objInvoke = draadjrbmkVar.invoke(anonymousClass1);
                        if (objInvoke == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        baseNetworkRepository = this;
                        obj = objInvoke;
                        views4 = views2;
                        kcexrzcfytVar = (kcexrzcfyt) obj;
                        if (kcexrzcfytVar.gxszxtbevo()) {
                        }
                        baseNetworkRepository2 = baseNetworkRepository;
                        errorBody = ResponseExtensionKt.readErrorBody(kcexrzcfytVar.eablkybsjg(), String.valueOf(kcexrzcfytVar.zoijcleaow()));
                        EcomMetricUtil ecomMetricUtil = baseNetworkRepository2.ecomMetricUtil;
                        ActionType actionType = ActionType.RQ;
                        StatusType statusType = StatusType.FAIL;
                        int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                        if (errorBody != null) {
                            errorCode = errorBody.getErrorCode();
                        } else {
                            errorCode = null;
                        }
                        if (errorBody != null) {
                            description = errorBody.getDescription();
                        } else {
                            description = null;
                        }
                        if (description == null) {
                            description = "";
                        }
                        ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(action2, null, actionType, statusType, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 130, null));
                        if (oxmwwwfdhmVar2 != null) {
                            numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow());
                            if (errorBody != null) {
                                errorCode2 = errorBody.getErrorCode();
                            } else {
                                errorCode2 = null;
                            }
                            if (errorBody != null) {
                                description2 = errorBody.getDescription();
                            } else {
                                description2 = null;
                            }
                            anonymousClass1.L$0 = baseNetworkRepository2;
                            anonymousClass1.L$1 = action2;
                            anonymousClass1.L$2 = views4;
                            anonymousClass1.L$3 = kcexrzcfytVar;
                            anonymousClass1.L$4 = errorBody;
                            anonymousClass1.label = 3;
                            if (oxmwwwfdhmVar2.invoke(numWkgbmnqykc, errorCode2, description2, anonymousClass1) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            baseNetworkRepository3 = baseNetworkRepository2;
                            views5 = views4;
                            ecomApiError = errorBody;
                            action4 = action2;
                            kcexrzcfytVar3 = kcexrzcfytVar;
                            kcexrzcfytVar2 = kcexrzcfytVar3;
                            action2 = action4;
                        } else {
                            baseNetworkRepository3 = baseNetworkRepository2;
                            views5 = views4;
                            ecomApiError = errorBody;
                            kcexrzcfytVar2 = kcexrzcfytVar;
                        }
                        return new ContentResponse.Failure(baseNetworkRepository3.processErrorBody(kcexrzcfytVar2, ecomApiError));
                    } catch (Exception e13) {
                        e = e13;
                        exc = e;
                        r13 = this;
                        action3 = action2;
                        views3 = views2;
                    }
                } catch (Exception e14) {
                    e = e14;
                    views2 = views;
                    exc = e;
                    r13 = this;
                    action3 = action2;
                    views3 = views2;
                    r13.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(action3, views3, ActionType.RQ, StatusType.FAIL, null, null, null, null, 240, null));
                    return new ContentResponse.Failure(r13.networkErrorHandlerImpl.getError(exc));
                }
            } catch (Exception e15) {
                e = e15;
                action2 = action;
            }
        } else if (i14 == 1) {
            oxmwwwfdhm oxmwwwfdhmVar3 = (oxmwwwfdhm) anonymousClass1.L$3;
            views4 = (Views) anonymousClass1.L$2;
            Action action5 = (Action) anonymousClass1.L$1;
            BaseNetworkRepository baseNetworkRepository6 = (BaseNetworkRepository) anonymousClass1.L$0;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj2);
                baseNetworkRepository = baseNetworkRepository6;
                obj = obj2;
                oxmwwwfdhmVar2 = oxmwwwfdhmVar3;
                action2 = action5;
                try {
                    kcexrzcfytVar = (kcexrzcfyt) obj;
                    try {
                        if (kcexrzcfytVar.gxszxtbevo() || kcexrzcfytVar.eablkybsjg() != null) {
                            baseNetworkRepository2 = baseNetworkRepository;
                            errorBody = ResponseExtensionKt.readErrorBody(kcexrzcfytVar.eablkybsjg(), String.valueOf(kcexrzcfytVar.zoijcleaow()));
                            EcomMetricUtil ecomMetricUtil2 = baseNetworkRepository2.ecomMetricUtil;
                            ActionType actionType2 = ActionType.RQ;
                            StatusType statusType2 = StatusType.FAIL;
                            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
                            if (errorBody != null) {
                                errorCode = errorBody.getErrorCode();
                            } else {
                                errorCode = null;
                            }
                            if (errorBody != null) {
                                description = errorBody.getDescription();
                            } else {
                                description = null;
                            }
                            if (description == null) {
                                description = "";
                            }
                            ecomMetricUtil2.report(new EcomMetricUtil.MetricEvent(action2, null, actionType2, statusType2, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 130, null));
                            if (oxmwwwfdhmVar2 != null) {
                                numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow());
                                if (errorBody != null) {
                                    errorCode2 = errorBody.getErrorCode();
                                } else {
                                    errorCode2 = null;
                                }
                                if (errorBody != null) {
                                    description2 = errorBody.getDescription();
                                } else {
                                    description2 = null;
                                }
                                anonymousClass1.L$0 = baseNetworkRepository2;
                                anonymousClass1.L$1 = action2;
                                anonymousClass1.L$2 = views4;
                                anonymousClass1.L$3 = kcexrzcfytVar;
                                anonymousClass1.L$4 = errorBody;
                                anonymousClass1.label = 3;
                                if (oxmwwwfdhmVar2.invoke(numWkgbmnqykc, errorCode2, description2, anonymousClass1) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                baseNetworkRepository3 = baseNetworkRepository2;
                                views5 = views4;
                                ecomApiError = errorBody;
                                action4 = action2;
                                kcexrzcfytVar3 = kcexrzcfytVar;
                                kcexrzcfytVar2 = kcexrzcfytVar3;
                                action2 = action4;
                            } else {
                                baseNetworkRepository3 = baseNetworkRepository2;
                                views5 = views4;
                                ecomApiError = errorBody;
                                kcexrzcfytVar2 = kcexrzcfytVar;
                            }
                            return new ContentResponse.Failure(baseNetworkRepository3.processErrorBody(kcexrzcfytVar2, ecomApiError));
                        }
                        BaseNetworkRepository baseNetworkRepository7 = baseNetworkRepository;
                        try {
                            baseNetworkRepository.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(action2, null, ActionType.RQ, StatusType.GOOD, null, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow()), null, null, OrderServiceErrorHandlerImpl.ORDER_IN_PROGRESS, null));
                            if (oxmwwwfdhmVar2 != null) {
                                Integer numWkgbmnqykc2 = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow());
                                baseNetworkRepository4 = baseNetworkRepository7;
                                anonymousClass1.L$0 = baseNetworkRepository4;
                                anonymousClass1.L$1 = action2;
                                anonymousClass1.L$2 = views4;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.label = 2;
                                if (oxmwwwfdhmVar2.invoke(numWkgbmnqykc2, null, null, anonymousClass1) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            } else {
                                baseNetworkRepository4 = baseNetworkRepository7;
                            }
                            baseNetworkRepository5 = baseNetworkRepository4;
                            views6 = views4;
                            return new ContentResponse.Success(wwaezpbzkn.f37140iobyxmoadg);
                        } catch (Exception e16) {
                            e = e16;
                            r14 = baseNetworkRepository7;
                        }
                    } catch (Exception e17) {
                        e = e17;
                    }
                } catch (Exception e18) {
                    e = e18;
                    r14 = baseNetworkRepository;
                }
                exc = e;
                action3 = action2;
                r13 = r14;
                views3 = views4;
            } catch (Exception e19) {
                exc = e19;
                views3 = views4;
                action3 = action5;
                r13 = baseNetworkRepository6;
            }
        } else if (i14 == 2) {
            views6 = (Views) anonymousClass1.L$2;
            action2 = (Action) anonymousClass1.L$1;
            baseNetworkRepository5 = (BaseNetworkRepository) anonymousClass1.L$0;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj2);
                return new ContentResponse.Success(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Exception e23) {
                exc = e23;
                r13 = baseNetworkRepository5;
                Action action6 = action2;
                views3 = views6;
                action3 = action6;
            }
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ecomApiError = (EcomApiError) anonymousClass1.L$4;
            kcexrzcfytVar3 = (kcexrzcfyt) anonymousClass1.L$3;
            views5 = (Views) anonymousClass1.L$2;
            action4 = (Action) anonymousClass1.L$1;
            baseNetworkRepository3 = (BaseNetworkRepository) anonymousClass1.L$0;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj2);
                kcexrzcfytVar2 = kcexrzcfytVar3;
                action2 = action4;
                try {
                    return new ContentResponse.Failure(baseNetworkRepository3.processErrorBody(kcexrzcfytVar2, ecomApiError));
                } catch (Exception e24) {
                    exc = e24;
                    r13 = baseNetworkRepository3;
                    action3 = action2;
                    views3 = views5;
                }
            } catch (Exception e25) {
                exc = e25;
                r13 = baseNetworkRepository3;
                views3 = views5;
                action3 = action4;
            }
        }
        r13.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(action3, views3, ActionType.RQ, StatusType.FAIL, null, null, null, null, 240, null));
        return new ContentResponse.Failure(r13.networkErrorHandlerImpl.getError(exc));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[Catch: Exception -> 0x0142, TRY_LEAVE, TryCatch #5 {Exception -> 0x0142, blocks: (B:33:0x00c0, B:35:0x00ca), top: B:95:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0102 A[Catch: Exception -> 0x012b, TRY_LEAVE, TryCatch #3 {Exception -> 0x012b, blocks: (B:37:0x00fa, B:39:0x0102), top: B:92:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x0164 A[Catch: Exception -> 0x0127, TryCatch #4 {Exception -> 0x0127, blocks: (B:41:0x010c, B:56:0x0148, B:58:0x0164, B:62:0x0171, B:66:0x017b, B:68:0x01ad, B:70:0x01b7, B:73:0x01bf, B:75:0x01c5), top: B:94:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0171 A[Catch: Exception -> 0x0127, TryCatch #4 {Exception -> 0x0127, blocks: (B:41:0x010c, B:56:0x0148, B:58:0x0164, B:62:0x0171, B:66:0x017b, B:68:0x01ad, B:70:0x01b7, B:73:0x01bf, B:75:0x01c5), top: B:94:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ad A[Catch: Exception -> 0x0127, TryCatch #4 {Exception -> 0x0127, blocks: (B:41:0x010c, B:56:0x0148, B:58:0x0164, B:62:0x0171, B:66:0x017b, B:68:0x01ad, B:70:0x01b7, B:73:0x01bf, B:75:0x01c5), top: B:94:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01b7 A[Catch: Exception -> 0x0127, TryCatch #4 {Exception -> 0x0127, blocks: (B:41:0x010c, B:56:0x0148, B:58:0x0164, B:62:0x0171, B:66:0x017b, B:68:0x01ad, B:70:0x01b7, B:73:0x01bf, B:75:0x01c5), top: B:94:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bf A[Catch: Exception -> 0x0127, TryCatch #4 {Exception -> 0x0127, blocks: (B:41:0x010c, B:56:0x0148, B:58:0x0164, B:62:0x0171, B:66:0x017b, B:68:0x01ad, B:70:0x01b7, B:73:0x01bf, B:75:0x01c5), top: B:94:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x01da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [tg.draadjrbmk] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository$callWithResponse$1] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [tg.oxmwwwfdhm] */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final <Dto extends DataDtoInterface<Model>, Model> Object callWithResponse(Action action, Views views, draadjrbmk draadjrbmkVar, oxmwwwfdhm oxmwwwfdhmVar, lg.gxszxtbevo<? super ContentResponse<Model>> gxszxtbevoVar) {
        ?? c40631;
        Action action2;
        Views views2;
        BaseNetworkRepository baseNetworkRepository;
        Object obj;
        ?? r13;
        kcexrzcfyt<Model> kcexrzcfytVar;
        BaseNetworkRepository baseNetworkRepository2;
        EcomApiError errorBody;
        String errorCode;
        String description;
        BaseNetworkRepository baseNetworkRepository3;
        kcexrzcfyt<Model> kcexrzcfytVar2;
        Integer numWkgbmnqykc;
        String errorCode2;
        String description2;
        EcomApiError ecomApiError;
        kcexrzcfyt<Model> kcexrzcfytVar3;
        BaseNetworkRepository baseNetworkRepository4;
        BaseNetworkRepository baseNetworkRepository5;
        kcexrzcfyt<Model> kcexrzcfytVar4;
        Integer numWkgbmnqykc2;
        Action action3;
        kcexrzcfyt<Model> kcexrzcfytVar5;
        if (gxszxtbevoVar instanceof C40631) {
            C40631 c40632 = (C40631) gxszxtbevoVar;
            int i13 = c40632.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40632.label = i13 - Integer.MIN_VALUE;
                c40631 = c40632;
            } else {
                c40631 = new C40631(gxszxtbevoVar);
            }
        } else {
            c40631 = new C40631(gxszxtbevoVar);
        }
        Object obj2 = c40631.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40631.label;
        ?? r14 = 2;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        kcexrzcfytVar5 = (kcexrzcfyt) c40631.L$3;
                        views2 = (Views) c40631.L$2;
                        action3 = (Action) c40631.L$1;
                        baseNetworkRepository5 = (BaseNetworkRepository) c40631.L$0;
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        kcexrzcfytVar4 = kcexrzcfytVar5;
                        action2 = action3;
                        return new ContentResponse.Success(baseNetworkRepository5.mapDtoToModel(kcexrzcfytVar4, baseNetworkRepository5.ecomMetricUtil, action2, views2));
                    }
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ecomApiError = (EcomApiError) c40631.L$2;
                    kcexrzcfytVar3 = (kcexrzcfyt) c40631.L$1;
                    baseNetworkRepository3 = (BaseNetworkRepository) c40631.L$0;
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    kcexrzcfytVar2 = kcexrzcfytVar3;
                    errorBody = ecomApiError;
                    return new ContentResponse.Failure(baseNetworkRepository3.processErrorBody(kcexrzcfytVar2, errorBody));
                }
                oxmwwwfdhm oxmwwwfdhmVar2 = (oxmwwwfdhm) c40631.L$3;
                Views views3 = (Views) c40631.L$2;
                Action action4 = (Action) c40631.L$1;
                BaseNetworkRepository baseNetworkRepository6 = (BaseNetworkRepository) c40631.L$0;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    baseNetworkRepository = baseNetworkRepository6;
                    obj = obj2;
                    action2 = action4;
                    r13 = oxmwwwfdhmVar2;
                    views2 = views3;
                    try {
                        kcexrzcfytVar = (kcexrzcfyt) obj;
                        try {
                            if (!ResponseExtensionKt.isContentSuccessful(kcexrzcfytVar)) {
                                baseNetworkRepository2 = baseNetworkRepository;
                                errorBody = ResponseExtensionKt.readErrorBody(kcexrzcfytVar.eablkybsjg(), String.valueOf(kcexrzcfytVar.zoijcleaow()));
                                EcomMetricUtil ecomMetricUtil = baseNetworkRepository2.ecomMetricUtil;
                                ActionType actionType = ActionType.RQ;
                                StatusType statusType = StatusType.FAIL;
                                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                                if (errorBody != null) {
                                    errorCode = errorBody.getErrorCode();
                                } else {
                                    errorCode = null;
                                }
                                if (errorBody != null) {
                                    description = errorBody.getDescription();
                                } else {
                                    description = null;
                                }
                                if (description == null) {
                                    description = "";
                                }
                                ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(action2, null, actionType, statusType, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 130, null));
                                if (r13 != 0) {
                                    numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow());
                                    if (errorBody != null) {
                                        errorCode2 = errorBody.getErrorCode();
                                    } else {
                                        errorCode2 = null;
                                    }
                                    if (errorBody != null) {
                                        description2 = errorBody.getDescription();
                                    } else {
                                        description2 = null;
                                    }
                                    c40631.L$0 = baseNetworkRepository2;
                                    c40631.L$1 = kcexrzcfytVar;
                                    c40631.L$2 = errorBody;
                                    c40631.L$3 = null;
                                    c40631.label = 3;
                                    if (r13.invoke(numWkgbmnqykc, errorCode2, description2, c40631) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                    ecomApiError = errorBody;
                                    baseNetworkRepository3 = baseNetworkRepository2;
                                    kcexrzcfytVar3 = kcexrzcfytVar;
                                    kcexrzcfytVar2 = kcexrzcfytVar3;
                                    errorBody = ecomApiError;
                                } else {
                                    baseNetworkRepository3 = baseNetworkRepository2;
                                    kcexrzcfytVar2 = kcexrzcfytVar;
                                }
                                return new ContentResponse.Failure(baseNetworkRepository3.processErrorBody(kcexrzcfytVar2, errorBody));
                            }
                            baseNetworkRepository4 = baseNetworkRepository;
                            try {
                                baseNetworkRepository.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(action2, null, ActionType.RQ, StatusType.GOOD, null, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow()), null, null, OrderServiceErrorHandlerImpl.ORDER_IN_PROGRESS, null));
                                if (r13 != 0) {
                                    numWkgbmnqykc2 = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow());
                                    c40631.L$0 = baseNetworkRepository4;
                                    c40631.L$1 = action2;
                                    c40631.L$2 = views2;
                                    c40631.L$3 = kcexrzcfytVar;
                                    c40631.label = 2;
                                    if (r13.invoke(numWkgbmnqykc2, null, null, c40631) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                    action3 = action2;
                                    baseNetworkRepository5 = baseNetworkRepository4;
                                    kcexrzcfytVar5 = kcexrzcfytVar;
                                    kcexrzcfytVar4 = kcexrzcfytVar5;
                                    action2 = action3;
                                } else {
                                    baseNetworkRepository5 = baseNetworkRepository4;
                                    kcexrzcfytVar4 = kcexrzcfytVar;
                                }
                                return new ContentResponse.Success(baseNetworkRepository5.mapDtoToModel(kcexrzcfytVar4, baseNetworkRepository5.ecomMetricUtil, action2, views2));
                            } catch (Exception e13) {
                                e = e13;
                                r14 = baseNetworkRepository4;
                            }
                        } catch (Exception e14) {
                            e = e14;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        r14 = baseNetworkRepository;
                    }
                    c40631 = r14;
                } catch (Exception e16) {
                    e = e16;
                    c40631 = baseNetworkRepository6;
                }
                FeatureExtensionsKt.track$default(c40631.tracker, c40631.ecomSdkOptionsRepository, null, e, ITracker.Priority.ERROR, null, 16, null);
                return new ContentResponse.Failure(c40631.networkErrorHandlerImpl.getError(e));
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
            try {
                this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(action, views, ActionType.RQ, null, null, null, null, null, 248, null));
                c40631.L$0 = this;
                action2 = action;
                c40631.L$1 = action2;
                views2 = views;
                c40631.L$2 = views2;
                c40631.L$3 = oxmwwwfdhmVar;
                c40631.label = 1;
                Object objInvoke = draadjrbmkVar.invoke(c40631);
                if (objInvoke == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                baseNetworkRepository = this;
                obj = objInvoke;
                r13 = oxmwwwfdhmVar;
                kcexrzcfytVar = (kcexrzcfyt) obj;
                if (!ResponseExtensionKt.isContentSuccessful(kcexrzcfytVar)) {
                    baseNetworkRepository4 = baseNetworkRepository;
                    baseNetworkRepository.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(action2, null, ActionType.RQ, StatusType.GOOD, null, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow()), null, null, OrderServiceErrorHandlerImpl.ORDER_IN_PROGRESS, null));
                    if (r13 != 0) {
                        numWkgbmnqykc2 = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow());
                        c40631.L$0 = baseNetworkRepository4;
                        c40631.L$1 = action2;
                        c40631.L$2 = views2;
                        c40631.L$3 = kcexrzcfytVar;
                        c40631.label = 2;
                        if (r13.invoke(numWkgbmnqykc2, null, null, c40631) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        action3 = action2;
                        baseNetworkRepository5 = baseNetworkRepository4;
                        kcexrzcfytVar5 = kcexrzcfytVar;
                        kcexrzcfytVar4 = kcexrzcfytVar5;
                        action2 = action3;
                    } else {
                        baseNetworkRepository5 = baseNetworkRepository4;
                        kcexrzcfytVar4 = kcexrzcfytVar;
                    }
                    return new ContentResponse.Success(baseNetworkRepository5.mapDtoToModel(kcexrzcfytVar4, baseNetworkRepository5.ecomMetricUtil, action2, views2));
                }
                baseNetworkRepository2 = baseNetworkRepository;
                errorBody = ResponseExtensionKt.readErrorBody(kcexrzcfytVar.eablkybsjg(), String.valueOf(kcexrzcfytVar.zoijcleaow()));
                EcomMetricUtil ecomMetricUtil2 = baseNetworkRepository2.ecomMetricUtil;
                ActionType actionType2 = ActionType.RQ;
                StatusType statusType2 = StatusType.FAIL;
                int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
                if (errorBody != null) {
                    errorCode = errorBody.getErrorCode();
                } else {
                    errorCode = null;
                }
                if (errorBody != null) {
                    description = errorBody.getDescription();
                } else {
                    description = null;
                }
                if (description == null) {
                    description = "";
                }
                ecomMetricUtil2.report(new EcomMetricUtil.MetricEvent(action2, null, actionType2, statusType2, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 130, null));
                if (r13 != 0) {
                    numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow());
                    if (errorBody != null) {
                        errorCode2 = errorBody.getErrorCode();
                    } else {
                        errorCode2 = null;
                    }
                    if (errorBody != null) {
                        description2 = errorBody.getDescription();
                    } else {
                        description2 = null;
                    }
                    c40631.L$0 = baseNetworkRepository2;
                    c40631.L$1 = kcexrzcfytVar;
                    c40631.L$2 = errorBody;
                    c40631.L$3 = null;
                    c40631.label = 3;
                    if (r13.invoke(numWkgbmnqykc, errorCode2, description2, c40631) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    ecomApiError = errorBody;
                    baseNetworkRepository3 = baseNetworkRepository2;
                    kcexrzcfytVar3 = kcexrzcfytVar;
                    kcexrzcfytVar2 = kcexrzcfytVar3;
                    errorBody = ecomApiError;
                } else {
                    baseNetworkRepository3 = baseNetworkRepository2;
                    kcexrzcfytVar2 = kcexrzcfytVar;
                }
                return new ContentResponse.Failure(baseNetworkRepository3.processErrorBody(kcexrzcfytVar2, errorBody));
                c40631 = r14;
                FeatureExtensionsKt.track$default(c40631.tracker, c40631.ecomSdkOptionsRepository, null, e, ITracker.Priority.ERROR, null, 16, null);
                return new ContentResponse.Failure(c40631.networkErrorHandlerImpl.getError(e));
            } catch (Exception e17) {
                e = e17;
                c40631 = this;
            }
        } catch (Exception e18) {
            e = e18;
        }
    }

    public final <Dto extends DataDtoInterface<Model>, Model> Model mapDtoToModel(kcexrzcfyt<Dto> kcexrzcfytVar, EcomMetricUtil ecomMetricUtil, Action requestAction, Views view) {
        Model model;
        zdlpuopuiu.btonecajqb(kcexrzcfytVar, "<this>");
        zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        zdlpuopuiu.btonecajqb(requestAction, "requestAction");
        zdlpuopuiu.btonecajqb(view, "view");
        try {
            DataDtoInterface dataDtoInterface = (DataDtoInterface) kcexrzcfytVar.iobyxmoadg();
            if (dataDtoInterface != null && (model = (Model) dataDtoInterface.toModel()) != null) {
                ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(requestAction, view, ActionType.RS, StatusType.GOOD, null, null, null, null, 240, null));
                return model;
            }
            cdpycssgdh cdpycssgdhVarNufgyqmvbu = kcexrzcfytVar.nufgyqmvbu();
            zdlpuopuiu.dxjokdxxww(cdpycssgdhVarNufgyqmvbu, "raw(...)");
            throw new NullRequiredBodyException(ResponseExtensionKt.shortPath(cdpycssgdhVarNufgyqmvbu));
        } catch (NullRequiredFieldException e13) {
            ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(requestAction, view, ActionType.RS, StatusType.FAIL, null, null, null, e13.getField(), 112, null));
            throw e13;
        }
    }

    public final <Model> ErrorEntity processErrorBody(kcexrzcfyt<Model> raw, EcomApiError errorBody) {
        zdlpuopuiu.btonecajqb(raw, "raw");
        if (raw.iobyxmoadg() == null && errorBody == null) {
            return this.networkErrorHandlerImpl.getError(new HttpException(raw));
        }
        if (raw.iobyxmoadg() == null || errorBody == null) {
            if (raw.iobyxmoadg() != null || errorBody == null) {
                return (raw.iobyxmoadg() == null || errorBody != null) ? new ErrorEntity.HttpError.Unknown(null, null, "Unknown Exception", 3, null) : new ErrorEntity.HttpError.Unknown(String.valueOf(raw.zoijcleaow()), null, raw.lqeggnwhkg(), 2, null);
            }
            return this.apiResponseErrorHandlerImpl.getError(errorBody);
        }
        String httpCode = errorBody.getHttpCode();
        String errorCode = errorBody.getErrorCode();
        String info = errorBody.getInfo();
        if (info == null) {
            info = errorBody.getDescription();
        }
        return new ErrorEntity.HttpError.Unknown(httpCode, errorCode, info);
    }
}

package modern.payments.ecomAndroid.data.repository;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import lm.kcexrzcfyt;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.data.dto.EcomPaymentOrderResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.EcomPaymentTokenResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.EcomSessionIdResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.FinishMethodResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.FinishPaymentResponseBodyDto;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.domain.model.request.DeactivateBindingRequestBody;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsMethodRequestBody;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsPaymentRequestBody;
import modern.payments.ecomAndroid.domain.model.request.PaymentOrderRequestBody;
import modern.payments.ecomAndroid.domain.model.request.PaymentTokenRequestBody;
import modern.payments.ecomAndroid.domain.model.request.SessionIdRequestBody;
import modern.payments.ecomAndroid.domain.model.response.FinishMethodResponseBody;
import modern.payments.ecomAndroid.domain.model.response.FinishPaymentResponseBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentOrderResponseBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentTokenResponseBody;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.AuthViewAction;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.PayViewAction;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.PaymentMethodViewAction;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.tracker.ITracker;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b \u0010!J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00192\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b%\u0010&J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00192\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b*\u0010+J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00192\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b/\u00100J\u001e\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00192\u0006\u00102\u001a\u000201H\u0096@¢\u0006\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00108¨\u00069"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/SafeEcomApiRepositoryImpl;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "Lmodern/payments/ecomAndroid/domain/repository/BaseNetworkRepository;", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "", "okHttpErrorHandlerImpl", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "apiErrorHandlerImpl", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/dataSource/SafeEcomDataSource;", "safeEcomMockDataSource", "safeEcomNetworkDataSource", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/dataSource/SafeEcomDataSource;Lmodern/payments/ecomAndroid/domain/dataSource/SafeEcomDataSource;Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "getSafeEcomDataSourceInstance", "()Lmodern/payments/ecomAndroid/domain/dataSource/SafeEcomDataSource;", "Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;", "sessionIdRequestBody", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "getSessionId", "(Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;", "deactivateBindingRequestBody", "Lgg/wwaezpbzkn;", "deactivateBinding", "(Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;", "paymentTokenRequestBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "getPaymentToken", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;", "paymentOrderRequestBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "getPaymentOrder", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;", "finishPaymentRequestBody", "Lmodern/payments/ecomAndroid/domain/model/response/FinishPaymentResponseBody;", "finish3dsPayment", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;", "finishMethodRequestBody", "Lmodern/payments/ecomAndroid/domain/model/response/FinishMethodResponseBody;", "finish3dsMethod", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/dataSource/SafeEcomDataSource;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SafeEcomApiRepositoryImpl extends BaseNetworkRepository implements SafeEcomApiRepository {
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final MerchantAnalyticRepository merchantAnalyticRepository;
    private final SafeEcomDataSource safeEcomMockDataSource;
    private final SafeEcomDataSource safeEcomNetworkDataSource;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$deactivateBinding$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llm/kcexrzcfyt;", "Lgg/wwaezpbzkn;", "<anonymous>", "()Llm/kcexrzcfyt;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$deactivateBinding$2", f = "SafeEcomApiRepositoryImpl.kt", l = {72}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements tg.draadjrbmk {
        final /* synthetic */ DeactivateBindingRequestBody $deactivateBindingRequestBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DeactivateBindingRequestBody deactivateBindingRequestBody, lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.$deactivateBindingRequestBody = deactivateBindingRequestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(lg.gxszxtbevo<?> gxszxtbevoVar) {
            return SafeEcomApiRepositoryImpl.this.new AnonymousClass2(this.$deactivateBindingRequestBody, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                SafeEcomDataSource safeEcomDataSourceInstance = SafeEcomApiRepositoryImpl.this.getSafeEcomDataSourceInstance();
                DeactivateBindingRequestBody deactivateBindingRequestBody = this.$deactivateBindingRequestBody;
                this.label = 1;
                obj = safeEcomDataSourceInstance.deactivateBinding(deactivateBindingRequestBody, this);
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
        public final Object invoke(lg.gxszxtbevo<? super kcexrzcfyt<wwaezpbzkn>> gxszxtbevoVar) {
            return ((AnonymousClass2) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$deactivateBinding$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "httpCode", "", "errorCode", "description", "Lgg/wwaezpbzkn;", "<anonymous>", "(ILjava/lang/String;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$deactivateBinding$3", f = "SafeEcomApiRepositoryImpl.kt", l = {74}, m = "invokeSuspend")
    static final class AnonymousClass3 extends draadjrbmk implements oxmwwwfdhm {
        /* synthetic */ int I$0;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass3(lg.gxszxtbevo<? super AnonymousClass3> gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
        }

        public final Object invoke(int i13, String str, String str2, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            AnonymousClass3 anonymousClass3 = SafeEcomApiRepositoryImpl.this.new AnonymousClass3(gxszxtbevoVar);
            anonymousClass3.I$0 = i13;
            anonymousClass3.L$0 = str;
            anonymousClass3.L$1 = str2;
            return anonymousClass3.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                int i14 = this.I$0;
                String str = (String) this.L$0;
                String str2 = (String) this.L$1;
                MerchantAnalyticRepository merchantAnalyticRepository = SafeEcomApiRepositoryImpl.this.merchantAnalyticRepository;
                this.L$0 = null;
                this.label = 1;
                if (merchantAnalyticRepository.onDeactivateBindingResult(i14, str, str2, this) == objGxszxtbevo) {
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

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke(((Number) obj).intValue(), (String) obj2, (String) obj3, (lg.gxszxtbevo<? super wwaezpbzkn>) obj4);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$finish3dsMethod$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/FinishMethodResponseBodyDto;", "<anonymous>", "()Llm/kcexrzcfyt;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$finish3dsMethod$2", f = "SafeEcomApiRepositoryImpl.kt", l = {111}, m = "invokeSuspend")
    static final class C40562 extends draadjrbmk implements tg.draadjrbmk {
        final /* synthetic */ Finish3dsMethodRequestBody $finishMethodRequestBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40562(Finish3dsMethodRequestBody finish3dsMethodRequestBody, lg.gxszxtbevo<? super C40562> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.$finishMethodRequestBody = finish3dsMethodRequestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(lg.gxszxtbevo<?> gxszxtbevoVar) {
            return SafeEcomApiRepositoryImpl.this.new C40562(this.$finishMethodRequestBody, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                SafeEcomDataSource safeEcomDataSourceInstance = SafeEcomApiRepositoryImpl.this.getSafeEcomDataSourceInstance();
                Finish3dsMethodRequestBody finish3dsMethodRequestBody = this.$finishMethodRequestBody;
                this.label = 1;
                obj = safeEcomDataSourceInstance.finish3dsMethod(finish3dsMethodRequestBody, this);
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
        public final Object invoke(lg.gxszxtbevo<? super kcexrzcfyt<FinishMethodResponseBodyDto>> gxszxtbevoVar) {
            return ((C40562) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$finish3dsPayment$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/FinishPaymentResponseBodyDto;", "<anonymous>", "()Llm/kcexrzcfyt;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$finish3dsPayment$2", f = "SafeEcomApiRepositoryImpl.kt", l = {102}, m = "invokeSuspend")
    static final class C40572 extends draadjrbmk implements tg.draadjrbmk {
        final /* synthetic */ Finish3dsPaymentRequestBody $finishPaymentRequestBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40572(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, lg.gxszxtbevo<? super C40572> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.$finishPaymentRequestBody = finish3dsPaymentRequestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(lg.gxszxtbevo<?> gxszxtbevoVar) {
            return SafeEcomApiRepositoryImpl.this.new C40572(this.$finishPaymentRequestBody, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                SafeEcomDataSource safeEcomDataSourceInstance = SafeEcomApiRepositoryImpl.this.getSafeEcomDataSourceInstance();
                Finish3dsPaymentRequestBody finish3dsPaymentRequestBody = this.$finishPaymentRequestBody;
                this.label = 1;
                obj = safeEcomDataSourceInstance.finish3dsPayment(finish3dsPaymentRequestBody, this);
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
        public final Object invoke(lg.gxszxtbevo<? super kcexrzcfyt<FinishPaymentResponseBodyDto>> gxszxtbevoVar) {
            return ((C40572) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$getPaymentOrder$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomPaymentOrderResponseBodyDto;", "<anonymous>", "()Llm/kcexrzcfyt;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$getPaymentOrder$2", f = "SafeEcomApiRepositoryImpl.kt", l = {93}, m = "invokeSuspend")
    static final class C40582 extends draadjrbmk implements tg.draadjrbmk {
        final /* synthetic */ PaymentOrderRequestBody $paymentOrderRequestBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40582(PaymentOrderRequestBody paymentOrderRequestBody, lg.gxszxtbevo<? super C40582> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.$paymentOrderRequestBody = paymentOrderRequestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(lg.gxszxtbevo<?> gxszxtbevoVar) {
            return SafeEcomApiRepositoryImpl.this.new C40582(this.$paymentOrderRequestBody, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                SafeEcomDataSource safeEcomDataSourceInstance = SafeEcomApiRepositoryImpl.this.getSafeEcomDataSourceInstance();
                PaymentOrderRequestBody paymentOrderRequestBody = this.$paymentOrderRequestBody;
                this.label = 1;
                obj = safeEcomDataSourceInstance.getPaymentOrder(paymentOrderRequestBody, this);
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
        public final Object invoke(lg.gxszxtbevo<? super kcexrzcfyt<EcomPaymentOrderResponseBodyDto>> gxszxtbevoVar) {
            return ((C40582) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$getPaymentToken$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomPaymentTokenResponseBodyDto;", "<anonymous>", "()Llm/kcexrzcfyt;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$getPaymentToken$2", f = "SafeEcomApiRepositoryImpl.kt", l = {86}, m = "invokeSuspend")
    static final class C40592 extends draadjrbmk implements tg.draadjrbmk {
        final /* synthetic */ PaymentTokenRequestBody $paymentTokenRequestBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40592(PaymentTokenRequestBody paymentTokenRequestBody, lg.gxszxtbevo<? super C40592> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.$paymentTokenRequestBody = paymentTokenRequestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(lg.gxszxtbevo<?> gxszxtbevoVar) {
            return SafeEcomApiRepositoryImpl.this.new C40592(this.$paymentTokenRequestBody, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                SafeEcomDataSource safeEcomDataSourceInstance = SafeEcomApiRepositoryImpl.this.getSafeEcomDataSourceInstance();
                PaymentTokenRequestBody paymentTokenRequestBody = this.$paymentTokenRequestBody;
                this.label = 1;
                obj = safeEcomDataSourceInstance.getPaymentToken(paymentTokenRequestBody, this);
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
        public final Object invoke(lg.gxszxtbevo<? super kcexrzcfyt<EcomPaymentTokenResponseBodyDto>> gxszxtbevoVar) {
            return ((C40592) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$getSessionId$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomSessionIdResponseBodyDto;", "<anonymous>", "()Llm/kcexrzcfyt;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$getSessionId$2", f = "SafeEcomApiRepositoryImpl.kt", l = {58}, m = "invokeSuspend")
    static final class C40602 extends draadjrbmk implements tg.draadjrbmk {
        final /* synthetic */ SessionIdRequestBody $sessionIdRequestBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40602(SessionIdRequestBody sessionIdRequestBody, lg.gxszxtbevo<? super C40602> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.$sessionIdRequestBody = sessionIdRequestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(lg.gxszxtbevo<?> gxszxtbevoVar) {
            return SafeEcomApiRepositoryImpl.this.new C40602(this.$sessionIdRequestBody, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                SafeEcomDataSource safeEcomDataSourceInstance = SafeEcomApiRepositoryImpl.this.getSafeEcomDataSourceInstance();
                SessionIdRequestBody sessionIdRequestBody = this.$sessionIdRequestBody;
                this.label = 1;
                obj = safeEcomDataSourceInstance.getSessionId(sessionIdRequestBody, this);
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
        public final Object invoke(lg.gxszxtbevo<? super kcexrzcfyt<EcomSessionIdResponseBodyDto>> gxszxtbevoVar) {
            return ((C40602) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$getSessionId$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "httpCode", "", "errorCode", "description", "Lgg/wwaezpbzkn;", "<anonymous>", "(ILjava/lang/String;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.SafeEcomApiRepositoryImpl$getSessionId$3", f = "SafeEcomApiRepositoryImpl.kt", l = {60}, m = "invokeSuspend")
    static final class C40613 extends draadjrbmk implements oxmwwwfdhm {
        /* synthetic */ int I$0;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C40613(lg.gxszxtbevo<? super C40613> gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
        }

        public final Object invoke(int i13, String str, String str2, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            C40613 c40613 = SafeEcomApiRepositoryImpl.this.new C40613(gxszxtbevoVar);
            c40613.I$0 = i13;
            c40613.L$0 = str;
            c40613.L$1 = str2;
            return c40613.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                int i14 = this.I$0;
                String str = (String) this.L$0;
                String str2 = (String) this.L$1;
                MerchantAnalyticRepository merchantAnalyticRepository = SafeEcomApiRepositoryImpl.this.merchantAnalyticRepository;
                this.L$0 = null;
                this.label = 1;
                if (merchantAnalyticRepository.onCreateSessionResult(i14, str, str2, this) == objGxszxtbevo) {
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

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke(((Number) obj).intValue(), (String) obj2, (String) obj3, (lg.gxszxtbevo<? super wwaezpbzkn>) obj4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeEcomApiRepositoryImpl(NetworkErrorHandler<Throwable> okHttpErrorHandlerImpl, NetworkErrorHandler<EcomApiError> apiErrorHandlerImpl, ITracker tracker, EcomMetricUtil ecomMetricUtil, SafeEcomDataSource safeEcomMockDataSource, SafeEcomDataSource safeEcomNetworkDataSource, MerchantAnalyticRepository merchantAnalyticRepository, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        super(okHttpErrorHandlerImpl, apiErrorHandlerImpl, tracker, ecomMetricUtil, ecomSdkOptionsRepository);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(okHttpErrorHandlerImpl, "okHttpErrorHandlerImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiErrorHandlerImpl, "apiErrorHandlerImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tracker, "tracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(safeEcomMockDataSource, "safeEcomMockDataSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(safeEcomNetworkDataSource, "safeEcomNetworkDataSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.safeEcomMockDataSource = safeEcomMockDataSource;
        this.safeEcomNetworkDataSource = safeEcomNetworkDataSource;
        this.merchantAnalyticRepository = merchantAnalyticRepository;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SafeEcomDataSource getSafeEcomDataSourceInstance() {
        return EcomStagingConfig.INSTANCE.isLocalMocksMode() ? this.safeEcomMockDataSource : this.safeEcomNetworkDataSource;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository
    public Object deactivateBinding(DeactivateBindingRequestBody deactivateBindingRequestBody, lg.gxszxtbevo<? super ContentResponse<wwaezpbzkn>> gxszxtbevoVar) {
        return call(PaymentMethodViewAction.DEACTIVATE_BINDING, Views.PAYMENT_METHOD, new AnonymousClass2(deactivateBindingRequestBody, null), new AnonymousClass3(null), gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository
    public Object finish3dsMethod(Finish3dsMethodRequestBody finish3dsMethodRequestBody, lg.gxszxtbevo<? super ContentResponse<FinishMethodResponseBody>> gxszxtbevoVar) {
        return BaseNetworkRepository.callWithResponse$default(this, PayViewAction.FINISH_3DS_METHOD, Views.PAYMENT_VIEW, new C40562(finish3dsMethodRequestBody, null), null, gxszxtbevoVar, 8, null);
    }

    @Override // modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository
    public Object finish3dsPayment(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, lg.gxszxtbevo<? super ContentResponse<FinishPaymentResponseBody>> gxszxtbevoVar) {
        return BaseNetworkRepository.callWithResponse$default(this, PayViewAction.FINISH_3DS_PAYMENT, Views.PAYMENT_VIEW, new C40572(finish3dsPaymentRequestBody, null), null, gxszxtbevoVar, 8, null);
    }

    @Override // modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository
    public Object getPaymentOrder(PaymentOrderRequestBody paymentOrderRequestBody, lg.gxszxtbevo<? super ContentResponse<PaymentOrderResponseBody>> gxszxtbevoVar) {
        return BaseNetworkRepository.callWithResponse$default(this, PayViewAction.PAYMENT_ORDER, Views.PAYMENT_VIEW, new C40582(paymentOrderRequestBody, null), null, gxszxtbevoVar, 8, null);
    }

    @Override // modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository
    public Object getPaymentToken(PaymentTokenRequestBody paymentTokenRequestBody, lg.gxszxtbevo<? super ContentResponse<PaymentTokenResponseBody>> gxszxtbevoVar) {
        return BaseNetworkRepository.callWithResponse$default(this, PayViewAction.PAYMENT_TOKEN, Views.PAYMENT_VIEW, new C40592(paymentTokenRequestBody, null), null, gxszxtbevoVar, 8, null);
    }

    @Override // modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository
    public Object getSessionId(SessionIdRequestBody sessionIdRequestBody, lg.gxszxtbevo<? super ContentResponse<SessionIdResponseBody>> gxszxtbevoVar) {
        return callWithResponse(AuthViewAction.SESSION_ID, Views.AUTH_VIEW, new C40602(sessionIdRequestBody, null), new C40613(null), gxszxtbevoVar);
    }
}

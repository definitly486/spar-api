package modern.payments.ecomAndroid.data.dataSource;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import lm.kcexrzcfyt;
import modern.payments.ecomAndroid.data.dto.EcomPaymentOrderResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.EcomPaymentTokenResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.EcomSessionIdResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.FinishMethodResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.FinishPaymentResponseBodyDto;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.LazyNetworkModule;
import modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource;
import modern.payments.ecomAndroid.domain.model.request.DeactivateBindingRequestBody;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsMethodRequestBody;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsPaymentRequestBody;
import modern.payments.ecomAndroid.domain.model.request.PaymentOrderRequestBody;
import modern.payments.ecomAndroid.domain.model.request.PaymentTokenRequestBody;
import modern.payments.ecomAndroid.domain.model.request.SessionIdRequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%¨\u0006&"}, d2 = {"Lmodern/payments/ecomAndroid/data/dataSource/SafeEcomNetworkDataSourceImpl;", "Lmodern/payments/ecomAndroid/domain/dataSource/SafeEcomDataSource;", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;", "lazyNetworkModule", "<init>", "(Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;)V", "Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;", "sessionIdRequestBody", "Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomSessionIdResponseBodyDto;", "getSessionId", "(Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;", "deactivateBindingRequestBody", "Lgg/wwaezpbzkn;", "deactivateBinding", "(Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;", "paymentTokenRequestBody", "Lmodern/payments/ecomAndroid/data/dto/EcomPaymentTokenResponseBodyDto;", "getPaymentToken", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;", "paymentOrderRequestBody", "Lmodern/payments/ecomAndroid/data/dto/EcomPaymentOrderResponseBodyDto;", "getPaymentOrder", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;", "finishPaymentRequestBody", "Lmodern/payments/ecomAndroid/data/dto/FinishPaymentResponseBodyDto;", "finish3dsPayment", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;", "finishMethodRequestBody", "Lmodern/payments/ecomAndroid/data/dto/FinishMethodResponseBodyDto;", "finish3dsMethod", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SafeEcomNetworkDataSourceImpl implements SafeEcomDataSource {
    private final LazyNetworkModule lazyNetworkModule;

    public SafeEcomNetworkDataSourceImpl(LazyNetworkModule lazyNetworkModule) {
        zdlpuopuiu.btonecajqb(lazyNetworkModule, "lazyNetworkModule");
        this.lazyNetworkModule = lazyNetworkModule;
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object deactivateBinding(DeactivateBindingRequestBody deactivateBindingRequestBody, gxszxtbevo<? super kcexrzcfyt<wwaezpbzkn>> gxszxtbevoVar) {
        return this.lazyNetworkModule.getEcomApi().deactivateBinding(deactivateBindingRequestBody, gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object finish3dsMethod(Finish3dsMethodRequestBody finish3dsMethodRequestBody, gxszxtbevo<? super kcexrzcfyt<FinishMethodResponseBodyDto>> gxszxtbevoVar) {
        return this.lazyNetworkModule.getEcomApi().finish3dsMethod(finish3dsMethodRequestBody, gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object finish3dsPayment(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, gxszxtbevo<? super kcexrzcfyt<FinishPaymentResponseBodyDto>> gxszxtbevoVar) {
        return this.lazyNetworkModule.getEcomApi().finish3dsPayment(finish3dsPaymentRequestBody, gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object getPaymentOrder(PaymentOrderRequestBody paymentOrderRequestBody, gxszxtbevo<? super kcexrzcfyt<EcomPaymentOrderResponseBodyDto>> gxszxtbevoVar) {
        return this.lazyNetworkModule.getEcomApi().getPaymentOrder(paymentOrderRequestBody, gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object getPaymentToken(PaymentTokenRequestBody paymentTokenRequestBody, gxszxtbevo<? super kcexrzcfyt<EcomPaymentTokenResponseBodyDto>> gxszxtbevoVar) {
        return this.lazyNetworkModule.getEcomApi().getPaymentToken(paymentTokenRequestBody, gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object getSessionId(SessionIdRequestBody sessionIdRequestBody, gxszxtbevo<? super kcexrzcfyt<EcomSessionIdResponseBodyDto>> gxszxtbevoVar) {
        return this.lazyNetworkModule.getEcomApi().getSessionId(sessionIdRequestBody, gxszxtbevoVar);
    }
}

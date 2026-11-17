package modern.payments.ecomAndroid.domain.repository;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import modern.payments.ecomAndroid.data.api.ContentResponse;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0018\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u001d\u001a\u00020\u001cH¦@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "", "Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;", "sessionIdRequestBody", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "getSessionId", "(Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;", "deactivateBindingRequestBody", "Lgg/wwaezpbzkn;", "deactivateBinding", "(Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;", "paymentTokenRequestBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "getPaymentToken", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;", "paymentOrderRequestBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "getPaymentOrder", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;", "finishPaymentRequestBody", "Lmodern/payments/ecomAndroid/domain/model/response/FinishPaymentResponseBody;", "finish3dsPayment", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;", "finishMethodRequestBody", "Lmodern/payments/ecomAndroid/domain/model/response/FinishMethodResponseBody;", "finish3dsMethod", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SafeEcomApiRepository {
    Object deactivateBinding(DeactivateBindingRequestBody deactivateBindingRequestBody, gxszxtbevo<? super ContentResponse<wwaezpbzkn>> gxszxtbevoVar);

    Object finish3dsMethod(Finish3dsMethodRequestBody finish3dsMethodRequestBody, gxszxtbevo<? super ContentResponse<FinishMethodResponseBody>> gxszxtbevoVar);

    Object finish3dsPayment(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, gxszxtbevo<? super ContentResponse<FinishPaymentResponseBody>> gxszxtbevoVar);

    Object getPaymentOrder(PaymentOrderRequestBody paymentOrderRequestBody, gxszxtbevo<? super ContentResponse<PaymentOrderResponseBody>> gxszxtbevoVar);

    Object getPaymentToken(PaymentTokenRequestBody paymentTokenRequestBody, gxszxtbevo<? super ContentResponse<PaymentTokenResponseBody>> gxszxtbevoVar);

    Object getSessionId(SessionIdRequestBody sessionIdRequestBody, gxszxtbevo<? super ContentResponse<SessionIdResponseBody>> gxszxtbevoVar);
}

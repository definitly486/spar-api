package modern.payments.ecomAndroid.data.api;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import lm.kcexrzcfyt;
import modern.payments.ecomAndroid.data.dto.EcomPaymentOrderResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.EcomPaymentTokenResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.EcomSessionIdResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.FinishMethodResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.FinishPaymentResponseBodyDto;
import modern.payments.ecomAndroid.domain.model.request.DeactivateBindingRequestBody;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsMethodRequestBody;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsPaymentRequestBody;
import modern.payments.ecomAndroid.domain.model.request.PaymentOrderRequestBody;
import modern.payments.ecomAndroid.domain.model.request.PaymentTokenRequestBody;
import modern.payments.ecomAndroid.domain.model.request.SessionIdRequestBody;
import om.iobyxmoadg;
import om.ojitshcjhn;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/EcomApi;", "", "Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;", "sessionIdRequestBody", "Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomSessionIdResponseBodyDto;", "getSessionId", "(Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;", "deactivateBindingRequestBody", "Lgg/wwaezpbzkn;", "deactivateBinding", "(Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;", "paymentTokenRequestBody", "Lmodern/payments/ecomAndroid/data/dto/EcomPaymentTokenResponseBodyDto;", "getPaymentToken", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;", "paymentOrderRequestBody", "Lmodern/payments/ecomAndroid/data/dto/EcomPaymentOrderResponseBodyDto;", "getPaymentOrder", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;", "finish3dsPaymentRequestBody", "Lmodern/payments/ecomAndroid/data/dto/FinishPaymentResponseBodyDto;", "finish3dsPayment", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;", "finish3dsMethodRequestBody", "Lmodern/payments/ecomAndroid/data/dto/FinishMethodResponseBodyDto;", "finish3dsMethod", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EcomApi {
    @ojitshcjhn("sberpayEcomToken/v1/deactivateBinding")
    Object deactivateBinding(@iobyxmoadg DeactivateBindingRequestBody deactivateBindingRequestBody, gxszxtbevo<? super kcexrzcfyt<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("sdk-gateway/v1/finish3dsMethodSdk")
    Object finish3dsMethod(@iobyxmoadg Finish3dsMethodRequestBody finish3dsMethodRequestBody, gxszxtbevo<? super kcexrzcfyt<FinishMethodResponseBodyDto>> gxszxtbevoVar);

    @ojitshcjhn("sdk-gateway/v1/finish3dsPaymentSdk")
    Object finish3dsPayment(@iobyxmoadg Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, gxszxtbevo<? super kcexrzcfyt<FinishPaymentResponseBodyDto>> gxszxtbevoVar);

    @ojitshcjhn("sdk-gateway/v1/paymentOrder")
    Object getPaymentOrder(@iobyxmoadg PaymentOrderRequestBody paymentOrderRequestBody, gxszxtbevo<? super kcexrzcfyt<EcomPaymentOrderResponseBodyDto>> gxszxtbevoVar);

    @ojitshcjhn("sberpayEcomToken/v1/paymentToken")
    Object getPaymentToken(@iobyxmoadg PaymentTokenRequestBody paymentTokenRequestBody, gxszxtbevo<? super kcexrzcfyt<EcomPaymentTokenResponseBodyDto>> gxszxtbevoVar);

    @ojitshcjhn("sberpayEcomSession/v1/sessionId")
    Object getSessionId(@iobyxmoadg SessionIdRequestBody sessionIdRequestBody, gxszxtbevo<? super kcexrzcfyt<EcomSessionIdResponseBodyDto>> gxszxtbevoVar);
}

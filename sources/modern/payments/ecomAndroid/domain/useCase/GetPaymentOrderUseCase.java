package modern.payments.ecomAndroid.domain.useCase;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.model.request.PaymentOrderRequestBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentTokenResponseBody;
import modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase;
import pj.cllcsxoeiz;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentOrderUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/base/BaseUseCase;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "paymentTokenResponse", "Lpj/cllcsxoeiz;", "coroutineScope", "getRequest", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;Lpj/cllcsxoeiz;Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface GetPaymentOrderUseCase extends BaseUseCase<PaymentOrderRequestBody> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object handleFailureResponse(GetPaymentOrderUseCase getPaymentOrderUseCase, PaymentOrderRequestBody paymentOrderRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super State.Error> gxszxtbevoVar) {
            return BaseUseCase.DefaultImpls.handleFailureResponse(getPaymentOrderUseCase, paymentOrderRequestBody, errorEntity, pkzmftpjixVar, gxszxtbevoVar);
        }

        public static Object retry(GetPaymentOrderUseCase getPaymentOrderUseCase, PaymentOrderRequestBody paymentOrderRequestBody, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            Object objRetry = BaseUseCase.DefaultImpls.retry(getPaymentOrderUseCase, paymentOrderRequestBody, pkzmftpjixVar, gxszxtbevoVar);
            return objRetry == zoijcleaow.gxszxtbevo() ? objRetry : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    Object getRequest(PaymentTokenResponseBody paymentTokenResponseBody, cllcsxoeiz cllcsxoeizVar, gxszxtbevo<? super PaymentOrderRequestBody> gxszxtbevoVar);
}

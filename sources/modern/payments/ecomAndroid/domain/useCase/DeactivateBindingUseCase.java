package modern.payments.ecomAndroid.domain.useCase;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.model.request.DeactivateBindingRequestBody;
import modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/DeactivateBindingUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/base/BaseUseCase;", "Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;", "", "bindingId", "getRequest", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DeactivateBindingUseCase extends BaseUseCase<DeactivateBindingRequestBody> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object handleFailureResponse(DeactivateBindingUseCase deactivateBindingUseCase, DeactivateBindingRequestBody deactivateBindingRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super State.Error> gxszxtbevoVar) {
            return BaseUseCase.DefaultImpls.handleFailureResponse(deactivateBindingUseCase, deactivateBindingRequestBody, errorEntity, pkzmftpjixVar, gxszxtbevoVar);
        }

        public static Object retry(DeactivateBindingUseCase deactivateBindingUseCase, DeactivateBindingRequestBody deactivateBindingRequestBody, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            Object objRetry = BaseUseCase.DefaultImpls.retry(deactivateBindingUseCase, deactivateBindingRequestBody, pkzmftpjixVar, gxszxtbevoVar);
            return objRetry == zoijcleaow.gxszxtbevo() ? objRetry : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    Object getRequest(String str, gxszxtbevo<? super DeactivateBindingRequestBody> gxszxtbevoVar);
}

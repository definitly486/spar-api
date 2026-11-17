package modern.payments.ecomAndroid.domain.useCase.initialData;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.model.request.SessionIdRequestBody;
import modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetSessionIdUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/base/BaseUseCase;", "Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;", "getRequest", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface GetSessionIdUseCase extends BaseUseCase<SessionIdRequestBody> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object handleFailureResponse(GetSessionIdUseCase getSessionIdUseCase, SessionIdRequestBody sessionIdRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super State.Error> gxszxtbevoVar) {
            return BaseUseCase.DefaultImpls.handleFailureResponse(getSessionIdUseCase, sessionIdRequestBody, errorEntity, pkzmftpjixVar, gxszxtbevoVar);
        }

        public static Object retry(GetSessionIdUseCase getSessionIdUseCase, SessionIdRequestBody sessionIdRequestBody, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            Object objRetry = BaseUseCase.DefaultImpls.retry(getSessionIdUseCase, sessionIdRequestBody, pkzmftpjixVar, gxszxtbevoVar);
            return objRetry == zoijcleaow.gxszxtbevo() ? objRetry : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    Object getRequest(gxszxtbevo<? super SessionIdRequestBody> gxszxtbevoVar);
}

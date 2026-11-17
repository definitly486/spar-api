package modern.payments.ecomAndroid.domain.useCase.base;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import pj.ikoacuggdj;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/base/BaseUseCaseWithoutParamNoResponse;", "", "<init>", "()V", "Lpj/pkzmftpjix;", "dispatcher", "Lgg/wwaezpbzkn;", "invoke", "(Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "retry", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseUseCaseWithoutParamNoResponse {
    public static /* synthetic */ Object invoke$default(BaseUseCaseWithoutParamNoResponse baseUseCaseWithoutParamNoResponse, pkzmftpjix pkzmftpjixVar, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i13 & 1) != 0) {
            pkzmftpjixVar = ikoacuggdj.zoijcleaow();
        }
        return baseUseCaseWithoutParamNoResponse.invoke(pkzmftpjixVar, gxszxtbevoVar);
    }

    public abstract Object invoke(pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    public final Object retry(pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objInvoke = invoke(pkzmftpjixVar, gxszxtbevoVar);
        return objInvoke == zoijcleaow.gxszxtbevo() ? objInvoke : wwaezpbzkn.f37140iobyxmoadg;
    }
}

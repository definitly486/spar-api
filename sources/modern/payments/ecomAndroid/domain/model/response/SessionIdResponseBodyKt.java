package modern.payments.ecomAndroid.domain.model.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.model.EcomBindingInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"bindingNotEmpty", "", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "payloadNotEmpty", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SessionIdResponseBodyKt {
    public static final boolean bindingNotEmpty(SessionIdResponseBody sessionIdResponseBody) {
        zdlpuopuiu.btonecajqb(sessionIdResponseBody, "<this>");
        List<EcomBindingInfo> bindings = sessionIdResponseBody.getBindings();
        return !(bindings == null || bindings.isEmpty());
    }

    public static final boolean payloadNotEmpty(SessionIdResponseBody sessionIdResponseBody) {
        zdlpuopuiu.btonecajqb(sessionIdResponseBody, "<this>");
        String sbpPayload = sessionIdResponseBody.getSbpPayload();
        return !(sbpPayload == null || sbpPayload.length() == 0);
    }
}

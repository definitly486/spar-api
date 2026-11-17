package ki0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.networkpanel.impl.domain.model.NetworkPayload;
import ru.myspar.networkpanel.impl.domain.model.PayloadHolder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wflxmlrfwp {
    public static final draadjrbmk iobyxmoadg(PayloadHolder payloadHolder) {
        zdlpuopuiu.btonecajqb(payloadHolder, "<this>");
        String id2 = payloadHolder.getNetworkItem().getId();
        String url = payloadHolder.getNetworkItem().getUrl();
        nufgyqmvbu nufgyqmvbuVarZoijcleaow = dxjokdxxww.zoijcleaow(payloadHolder.getType());
        NetworkPayload payload = payloadHolder.getPayload();
        return new draadjrbmk(id2, url, payload != null ? gtknphoqwx.iobyxmoadg(payload, payloadHolder.getHeadersEnabled(), payloadHolder.getBodyEnabled()) : null, nufgyqmvbuVarZoijcleaow);
    }
}

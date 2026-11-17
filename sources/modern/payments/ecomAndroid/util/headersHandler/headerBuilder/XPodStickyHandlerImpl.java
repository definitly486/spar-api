package modern.payments.ecomAndroid.util.headersHandler.headerBuilder;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandlerImpl;", "Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandler;", "<init>", "()V", "Llk/cdpycssgdh;", "response", "Lgg/wwaezpbzkn;", "saveHeader", "(Llk/cdpycssgdh;)V", "", "takeHeader", "()Ljava/lang/String;", "header", "Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class XPodStickyHandlerImpl implements XPodStickyHandler {
    private String header;

    @Override // modern.payments.ecomAndroid.util.headersHandler.headerBuilder.XPodStickyHandler
    public void saveHeader(cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(response, "response");
        String strIobyxmoadg = response.kcexrzcfyt().iobyxmoadg("x-pod-sticky");
        if (strIobyxmoadg != null) {
            this.header = strIobyxmoadg;
        }
    }

    @Override // modern.payments.ecomAndroid.util.headersHandler.headerBuilder.XPodStickyHandler
    public String takeHeader() {
        String str = this.header;
        return str == null ? "" : str;
    }
}

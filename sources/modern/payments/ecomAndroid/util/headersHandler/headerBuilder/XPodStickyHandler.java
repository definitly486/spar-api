package modern.payments.ecomAndroid.util.headersHandler.headerBuilder;

import kotlin.Metadata;
import lk.cdpycssgdh;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandler;", "", "Llk/cdpycssgdh;", "response", "Lgg/wwaezpbzkn;", "saveHeader", "(Llk/cdpycssgdh;)V", "", "takeHeader", "()Ljava/lang/String;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface XPodStickyHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String X_POD_STICKY = "x-pod-sticky";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandler$Companion;", "", "()V", "X_POD_STICKY", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String X_POD_STICKY = "x-pod-sticky";

        private Companion() {
        }
    }

    void saveHeader(cdpycssgdh response);

    String takeHeader();
}

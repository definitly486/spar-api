package modern.payments.tracker.util.logging;

import android.util.Log;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.util.extension.StringExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lmodern/payments/tracker/util/logging/ReleaseTree;", "Lmodern/payments/tracker/util/logging/ILogTree;", "<init>", "()V", "", "event", "", "exception", "Lmodern/payments/tracker/ITracker$Priority;", "priority", "tag", "Lgg/wwaezpbzkn;", "log", "(Ljava/lang/String;Ljava/lang/Throwable;Lmodern/payments/tracker/ITracker$Priority;Ljava/lang/String;)V", "", "restrictedPriority", "Ljava/util/List;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReleaseTree implements ILogTree {
    private static final String SDK_LOG_TAG = "EcomSdk";
    private final List<ITracker.Priority> restrictedPriority = jyumaefscl.eablkybsjg(ITracker.Priority.DEBUG);
    private static final List<String> paramsToMask = jyumaefscl.rgvfuqvkyq("authCode", "clientId", "dynatraceApplicationId", "client_id");

    @Override // modern.payments.tracker.util.logging.ILogTree
    public void log(String event, Throwable exception, ITracker.Priority priority, String tag) {
        zdlpuopuiu.btonecajqb(priority, "priority");
        PrettyLogFormatter prettyLogFormatter = PrettyLogFormatter.INSTANCE;
        if (event == null) {
            event = "";
        }
        Iterator<T> it = prettyLogFormatter.makeLogLines(tag, event, exception).iterator();
        while (it.hasNext()) {
            String strMaskData = StringExtensionsKt.maskData((String) it.next(), paramsToMask);
            if (!this.restrictedPriority.contains(priority)) {
                Log.println(priority.getValue(), SDK_LOG_TAG, strMaskData);
            }
        }
    }
}

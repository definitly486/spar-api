package modern.payments.tracker.util.logging;

import kotlin.Metadata;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmodern/payments/tracker/util/logging/ILogTree;", "", "", "event", "", "exception", "Lmodern/payments/tracker/ITracker$Priority;", "priority", "tag", "Lgg/wwaezpbzkn;", "log", "(Ljava/lang/String;Ljava/lang/Throwable;Lmodern/payments/tracker/ITracker$Priority;Ljava/lang/String;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ILogTree {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void log$default(ILogTree iLogTree, String str, Throwable th2, ITracker.Priority priority, String str2, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            if ((i13 & 4) != 0) {
                priority = ITracker.Priority.INFO;
            }
            iLogTree.log(str, th2, priority, str2);
        }
    }

    void log(String event, Throwable exception, ITracker.Priority priority, String tag);
}

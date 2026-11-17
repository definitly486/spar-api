package modern.payments.tracker;

import kotlin.Metadata;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \f2\u00020\u0001:\u0002\f\rJ9\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lmodern/payments/tracker/ITracker;", "", "", "event", "", "exception", "Lmodern/payments/tracker/ITracker$Priority;", "priority", "tag", "Lgg/wwaezpbzkn;", "track", "(Ljava/lang/String;Ljava/lang/Throwable;Lmodern/payments/tracker/ITracker$Priority;Ljava/lang/String;)V", "Companion", "Priority", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ITracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String TAG = "Ecom Tracker";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/tracker/ITracker$Companion;", "", "()V", "TAG", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String TAG = "Ecom Tracker";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void track$default(ITracker iTracker, String str, Throwable th2, Priority priority, String str2, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
            }
            if ((i13 & 2) != 0) {
                th2 = null;
            }
            if ((i13 & 4) != 0) {
                priority = Priority.DEBUG;
            }
            if ((i13 & 8) != 0) {
                str2 = "Ecom Tracker";
            }
            iTracker.track(str, th2, priority, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lmodern/payments/tracker/ITracker$Priority;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "VERBOSE", "DEBUG", "INFO", "WARNING", "ERROR", "ASSERT", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Priority {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARNING(5),
        ERROR(6),
        ASSERT(7);

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
        private final int value;

        Priority(int i13) {
            this.value = i13;
        }

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    void track(String event, Throwable exception, Priority priority, String tag);
}

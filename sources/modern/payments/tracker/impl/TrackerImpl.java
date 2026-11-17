package modern.payments.tracker.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.util.logging.ILogTree;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmodern/payments/tracker/impl/TrackerImpl;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/tracker/util/logging/ILogTree;", "logTree", "<init>", "(Lmodern/payments/tracker/util/logging/ILogTree;)V", "", "event", "", "exception", "Lmodern/payments/tracker/ITracker$Priority;", "priority", "tag", "Lgg/wwaezpbzkn;", "track", "(Ljava/lang/String;Ljava/lang/Throwable;Lmodern/payments/tracker/ITracker$Priority;Ljava/lang/String;)V", "Lmodern/payments/tracker/util/logging/ILogTree;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TrackerImpl implements ITracker {
    private final ILogTree logTree;

    public TrackerImpl(ILogTree iLogTree) {
        this.logTree = iLogTree;
    }

    @Override // modern.payments.tracker.ITracker
    public void track(String event, Throwable exception, ITracker.Priority priority, String tag) {
        zdlpuopuiu.btonecajqb(priority, "priority");
        zdlpuopuiu.btonecajqb(tag, "tag");
        ILogTree iLogTree = this.logTree;
        if (iLogTree != null) {
            iLogTree.log(event, exception, priority, tag);
        }
    }
}

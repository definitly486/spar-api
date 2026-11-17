package modern.payments.tracker.di.component;

import android.content.Context;
import kotlin.Metadata;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.di.scope.TrackerComponentScope;
import modern.payments.tracker.util.contract.LoggingContract;
import modern.payments.tracker.util.logging.ILogTree;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
@TrackerComponentScope
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lmodern/payments/tracker/di/component/TrackerComponent;", "", "getITracker", "Lmodern/payments/tracker/ITracker;", "getLoggingContract", "Lmodern/payments/tracker/util/contract/LoggingContract;", "getPrettyLogFormatterTree", "Lmodern/payments/tracker/util/logging/ILogTree;", "Builder", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TrackerComponent {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmodern/payments/tracker/di/component/TrackerComponent$Builder;", "", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Lmodern/payments/tracker/di/component/TrackerComponent$Builder;", "Lpj/cllcsxoeiz;", "coroutineScope", "(Lpj/cllcsxoeiz;)Lmodern/payments/tracker/di/component/TrackerComponent$Builder;", "Lmodern/payments/tracker/di/component/TrackerComponent;", "build", "()Lmodern/payments/tracker/di/component/TrackerComponent;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Builder {
        TrackerComponent build();

        Builder context(Context context);

        Builder coroutineScope(cllcsxoeiz coroutineScope);
    }

    ITracker getITracker();

    LoggingContract getLoggingContract();

    ILogTree getPrettyLogFormatterTree();
}

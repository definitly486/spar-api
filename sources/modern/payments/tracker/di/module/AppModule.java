package modern.payments.tracker.di.module;

import kotlin.Metadata;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.Tracker;
import modern.payments.tracker.di.scope.TrackerComponentScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lmodern/payments/tracker/di/module/AppModule;", "", "()V", "provideTracker", "Lmodern/payments/tracker/ITracker;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppModule {
    @TrackerComponentScope
    public final ITracker provideTracker() {
        return Tracker.INSTANCE.getInstance().getTracker();
    }
}

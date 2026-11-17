package modern.payments.tracker.di.module;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.tracker.di.scope.TrackerComponentScope;
import modern.payments.tracker.util.logging.ExternalLogFileStorage;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lmodern/payments/tracker/di/module/StorageModule;", "", "()V", "provideStorageModule", "Lmodern/payments/tracker/util/logging/ExternalLogFileStorage;", "context", "Landroid/content/Context;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StorageModule {
    @TrackerComponentScope
    public final ExternalLogFileStorage provideStorageModule(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return new ExternalLogFileStorage(context);
    }
}

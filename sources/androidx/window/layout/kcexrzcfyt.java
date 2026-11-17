package androidx.window.layout;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public interface kcexrzcfyt {
    void registerLayoutChangeCallback(Activity activity, Executor executor, u1.iobyxmoadg iobyxmoadgVar);

    void unregisterLayoutChangeCallback(u1.iobyxmoadg iobyxmoadgVar);
}

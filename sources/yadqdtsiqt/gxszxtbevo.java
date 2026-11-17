package yadqdtsiqt;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static volatile ScheduledExecutorService f124295iobyxmoadg;

    static ScheduledExecutorService iobyxmoadg() {
        if (f124295iobyxmoadg != null) {
            return f124295iobyxmoadg;
        }
        synchronized (gxszxtbevo.class) {
            try {
                if (f124295iobyxmoadg == null) {
                    f124295iobyxmoadg = new ppxfxbqfkf(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f124295iobyxmoadg;
    }
}

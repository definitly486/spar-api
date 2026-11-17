package cdpycssgdh;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static volatile Handler f19684iobyxmoadg;

    public static Handler iobyxmoadg() {
        if (f19684iobyxmoadg != null) {
            return f19684iobyxmoadg;
        }
        synchronized (draadjrbmk.class) {
            try {
                if (f19684iobyxmoadg == null) {
                    f19684iobyxmoadg = q1.lqeggnwhkg.iobyxmoadg(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f19684iobyxmoadg;
    }
}

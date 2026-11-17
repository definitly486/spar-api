package uf;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static Thread f113526iobyxmoadg;

    public static void iobyxmoadg() {
        if (!zoijcleaow()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static boolean zoijcleaow() {
        if (f113526iobyxmoadg == null) {
            f113526iobyxmoadg = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f113526iobyxmoadg;
    }
}

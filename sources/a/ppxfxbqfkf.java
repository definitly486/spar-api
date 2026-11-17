package a;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Handler f67iobyxmoadg = new Handler(Looper.getMainLooper());

    public static final void eablkybsjg(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        f67iobyxmoadg.removeCallbacks((Runnable) obj);
    }

    public static final Object ppxfxbqfkf(long j13, final tg.iobyxmoadg iobyxmoadgVar) {
        Runnable runnable = new Runnable() { // from class: a.zoijcleaow
            @Override // java.lang.Runnable
            public final void run() {
                ppxfxbqfkf.wkgbmnqykc(iobyxmoadgVar);
            }
        };
        f67iobyxmoadg.postDelayed(runnable, j13);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
    }

    public static final long zoijcleaow() {
        return System.currentTimeMillis();
    }
}

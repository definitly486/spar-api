package h6;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements g6.wwaezpbzkn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Handler f39548iobyxmoadg = q1.lqeggnwhkg.iobyxmoadg(Looper.getMainLooper());

    @Override // g6.wwaezpbzkn
    public void iobyxmoadg(Runnable runnable) {
        this.f39548iobyxmoadg.removeCallbacks(runnable);
    }

    @Override // g6.wwaezpbzkn
    public void zoijcleaow(long j13, Runnable runnable) {
        this.f39548iobyxmoadg.postDelayed(runnable, j13);
    }
}

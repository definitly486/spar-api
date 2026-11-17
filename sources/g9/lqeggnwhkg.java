package g9;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final double f36697iobyxmoadg = 1.0d / Math.pow(10.0d, 6.0d);

    public static double iobyxmoadg(long j13) {
        return (zoijcleaow() - j13) * f36697iobyxmoadg;
    }

    public static long zoijcleaow() {
        return SystemClock.elapsedRealtimeNanos();
    }
}

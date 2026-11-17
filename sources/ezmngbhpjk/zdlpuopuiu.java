package ezmngbhpjk;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final long f32470iobyxmoadg;

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f32470iobyxmoadg = id2;
    }

    public static final long iobyxmoadg() {
        return f32470iobyxmoadg;
    }
}

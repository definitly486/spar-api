package y2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static Executor f123593iobyxmoadg;

    public static synchronized Executor iobyxmoadg() {
        try {
            if (f123593iobyxmoadg == null) {
                f123593iobyxmoadg = stevsuqkhv.jrbgnlbqoe("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f123593iobyxmoadg;
    }
}

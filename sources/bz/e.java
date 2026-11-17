package bz;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends t6.agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final Executor f17409iobyxmoadg = Executors.newSingleThreadExecutor();

    public static abstract class iobyxmoadg implements Runnable {
    }

    iobyxmoadg agtfadlqog(kc2.gxszxtbevo gxszxtbevoVar);

    default void ojitshcjhn(kc2.gxszxtbevo gxszxtbevoVar) {
        f17409iobyxmoadg.execute(agtfadlqog(gxszxtbevoVar));
    }
}

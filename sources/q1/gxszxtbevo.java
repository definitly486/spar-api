package q1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {

    private static class iobyxmoadg implements Executor {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Handler f77639zdlpuopuiu;

        iobyxmoadg(Handler handler) {
            this.f77639zdlpuopuiu = (Handler) u1.nufgyqmvbu.gxszxtbevo(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f77639zdlpuopuiu.post((Runnable) u1.nufgyqmvbu.gxszxtbevo(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f77639zdlpuopuiu + " is shutting down");
        }
    }

    public static Executor iobyxmoadg(Handler handler) {
        return new iobyxmoadg(handler);
    }
}

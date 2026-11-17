package cd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final cd.iobyxmoadg f19648iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static volatile cd.iobyxmoadg f19649zoijcleaow;

    /* JADX INFO: renamed from: cd.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static class C0354zoijcleaow implements cd.iobyxmoadg {
        private C0354zoijcleaow() {
        }

        @Override // cd.iobyxmoadg
        public ExecutorService iobyxmoadg(ThreadFactory threadFactory, ppxfxbqfkf ppxfxbqfkfVar) {
            return zoijcleaow(1, threadFactory, ppxfxbqfkfVar);
        }

        public ExecutorService zoijcleaow(int i13, ThreadFactory threadFactory, ppxfxbqfkf ppxfxbqfkfVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0354zoijcleaow c0354zoijcleaow = new C0354zoijcleaow();
        f19648iobyxmoadg = c0354zoijcleaow;
        f19649zoijcleaow = c0354zoijcleaow;
    }

    public static cd.iobyxmoadg iobyxmoadg() {
        return f19649zoijcleaow;
    }
}

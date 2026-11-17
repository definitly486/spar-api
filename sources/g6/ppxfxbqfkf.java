package g6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import pj.iyctptxqzt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg implements ThreadFactory {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicInteger f36453iobyxmoadg = new AtomicInteger(0);

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ boolean f36454zoijcleaow;

        iobyxmoadg(boolean z13) {
            this.f36454zoijcleaow = z13;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(runnable, "runnable");
            return new Thread(runnable, (this.f36454zoijcleaow ? "WM.task-" : "androidx.work-") + this.f36453iobyxmoadg.incrementAndGet());
        }
    }

    public static final class zoijcleaow implements pkzmftpjix {
        zoijcleaow() {
        }

        @Override // g6.pkzmftpjix
        public void iobyxmoadg(String label) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(label, "label");
            y5.iobyxmoadg.ppxfxbqfkf(label);
        }

        @Override // g6.pkzmftpjix
        public boolean isEnabled() {
            return y5.iobyxmoadg.nufgyqmvbu();
        }

        @Override // g6.pkzmftpjix
        public void ppxfxbqfkf(String methodName, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(methodName, "methodName");
            y5.iobyxmoadg.iobyxmoadg(methodName, i13);
        }

        @Override // g6.pkzmftpjix
        public void wkgbmnqykc() {
            y5.iobyxmoadg.gxszxtbevo();
        }

        @Override // g6.pkzmftpjix
        public void zoijcleaow(String methodName, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(methodName, "methodName");
            y5.iobyxmoadg.wkgbmnqykc(methodName, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor eablkybsjg(boolean z13) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new iobyxmoadg(z13));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pkzmftpjix gxszxtbevo() {
        return new zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor wkgbmnqykc(lg.btonecajqb btonecajqbVar) {
        lg.lqeggnwhkg lqeggnwhkgVar = btonecajqbVar != null ? (lg.lqeggnwhkg) btonecajqbVar.get(lg.lqeggnwhkg.f62508dxjokdxxww) : null;
        pj.pkzmftpjix pkzmftpjixVar = lqeggnwhkgVar instanceof pj.pkzmftpjix ? (pj.pkzmftpjix) lqeggnwhkgVar : null;
        if (pkzmftpjixVar != null) {
            return iyctptxqzt.iobyxmoadg(pkzmftpjixVar);
        }
        return null;
    }
}

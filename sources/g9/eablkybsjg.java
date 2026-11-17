package g9;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Executor f36687iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Executor f36688zoijcleaow = new zoijcleaow();

    class iobyxmoadg implements Executor {
        iobyxmoadg() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            draadjrbmk.yggfygwlhe(runnable);
        }
    }

    class zoijcleaow implements Executor {
        zoijcleaow() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor iobyxmoadg() {
        return f36688zoijcleaow;
    }

    public static Executor zoijcleaow() {
        return f36687iobyxmoadg;
    }
}

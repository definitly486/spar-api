package vb;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    private enum iobyxmoadg implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor iobyxmoadg() {
        return iobyxmoadg.INSTANCE;
    }

    public static Executor zoijcleaow(Executor executor) {
        return new btonecajqb(executor);
    }
}

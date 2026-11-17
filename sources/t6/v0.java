package t6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        try {
            runnable.run();
        } catch (NullPointerException unused) {
        }
    }
}

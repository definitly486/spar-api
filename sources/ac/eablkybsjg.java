package ac;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg implements Runnable {
    protected abstract void iobyxmoadg();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        iobyxmoadg();
    }
}

package v7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements ThreadFactory {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final AtomicInteger f116251wkgbmnqykc = new AtomicInteger(1);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ThreadGroup f116252iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f116253ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicInteger f116254zoijcleaow = new AtomicInteger(1);

    public eablkybsjg() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f116252iobyxmoadg = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f116253ppxfxbqfkf = "lottie-" + f116251wkgbmnqykc.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f116252iobyxmoadg, runnable, this.f116253ppxfxbqfkf + this.f116254zoijcleaow.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}

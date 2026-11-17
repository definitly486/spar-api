package uj;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Collection f113642iobyxmoadg = lj.wflxmlrfwp.crxdokpmqz(lj.wflxmlrfwp.lqeggnwhkg(ServiceLoader.load(pj.hcddaimhww.class, pj.hcddaimhww.class.getClassLoader()).iterator()));

    public static final Collection iobyxmoadg() {
        return f113642iobyxmoadg;
    }

    public static final void zoijcleaow(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}

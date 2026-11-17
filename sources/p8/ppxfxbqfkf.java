package p8;

import g9.gtknphoqwx;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f76002iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f76003zoijcleaow = new zoijcleaow();

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Lock f76004iobyxmoadg = new ReentrantLock();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f76005zoijcleaow;

        iobyxmoadg() {
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Queue f76006iobyxmoadg = new ArrayDeque();

        zoijcleaow() {
        }

        iobyxmoadg iobyxmoadg() {
            iobyxmoadg iobyxmoadgVar;
            synchronized (this.f76006iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) this.f76006iobyxmoadg.poll();
            }
            return iobyxmoadgVar == null ? new iobyxmoadg() : iobyxmoadgVar;
        }

        void zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            synchronized (this.f76006iobyxmoadg) {
                try {
                    if (this.f76006iobyxmoadg.size() < 10) {
                        this.f76006iobyxmoadg.offer(iobyxmoadgVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    ppxfxbqfkf() {
    }

    void iobyxmoadg(String str) {
        iobyxmoadg iobyxmoadgVarIobyxmoadg;
        synchronized (this) {
            try {
                iobyxmoadgVarIobyxmoadg = (iobyxmoadg) this.f76002iobyxmoadg.get(str);
                if (iobyxmoadgVarIobyxmoadg == null) {
                    iobyxmoadgVarIobyxmoadg = this.f76003zoijcleaow.iobyxmoadg();
                    this.f76002iobyxmoadg.put(str, iobyxmoadgVarIobyxmoadg);
                }
                iobyxmoadgVarIobyxmoadg.f76005zoijcleaow++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        iobyxmoadgVarIobyxmoadg.f76004iobyxmoadg.lock();
    }

    void zoijcleaow(String str) {
        iobyxmoadg iobyxmoadgVar;
        synchronized (this) {
            try {
                iobyxmoadgVar = (iobyxmoadg) gtknphoqwx.eablkybsjg((iobyxmoadg) this.f76002iobyxmoadg.get(str));
                int i13 = iobyxmoadgVar.f76005zoijcleaow;
                if (i13 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + iobyxmoadgVar.f76005zoijcleaow);
                }
                int i14 = i13 - 1;
                iobyxmoadgVar.f76005zoijcleaow = i14;
                if (i14 == 0) {
                    iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f76002iobyxmoadg.remove(str);
                    if (!iobyxmoadgVar2.equals(iobyxmoadgVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + iobyxmoadgVar + ", but actually removed: " + iobyxmoadgVar2 + ", safeKey: " + str);
                    }
                    this.f76003zoijcleaow.zoijcleaow(iobyxmoadgVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        iobyxmoadgVar.f76004iobyxmoadg.unlock();
    }
}

package yi;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public class wkgbmnqykc implements gtknphoqwx {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Lock f125334zoijcleaow;

    public wkgbmnqykc(Lock lock) {
        zdlpuopuiu.btonecajqb(lock, "lock");
        this.f125334zoijcleaow = lock;
    }

    protected final Lock iobyxmoadg() {
        return this.f125334zoijcleaow;
    }

    @Override // yi.gtknphoqwx
    public void lock() {
        this.f125334zoijcleaow.lock();
    }

    @Override // yi.gtknphoqwx
    public void unlock() {
        this.f125334zoijcleaow.unlock();
    }

    public /* synthetic */ wkgbmnqykc(Lock lock, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new ReentrantLock() : lock);
    }
}

package yi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf extends wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Runnable f125332ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.draadjrbmk f125333wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(Lock lock, Runnable checkCancelled, tg.draadjrbmk interruptedExceptionHandler) {
        super(lock);
        zdlpuopuiu.btonecajqb(lock, "lock");
        zdlpuopuiu.btonecajqb(checkCancelled, "checkCancelled");
        zdlpuopuiu.btonecajqb(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f125332ppxfxbqfkf = checkCancelled;
        this.f125333wkgbmnqykc = interruptedExceptionHandler;
    }

    @Override // yi.wkgbmnqykc, yi.gtknphoqwx
    public void lock() {
        while (!iobyxmoadg().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f125332ppxfxbqfkf.run();
            } catch (InterruptedException e13) {
                this.f125333wkgbmnqykc.invoke(e13);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(Runnable checkCancelled, tg.draadjrbmk interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        zdlpuopuiu.btonecajqb(checkCancelled, "checkCancelled");
        zdlpuopuiu.btonecajqb(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}

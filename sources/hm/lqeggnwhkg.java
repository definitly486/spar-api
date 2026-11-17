package hm;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lqeggnwhkg f40780iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final AtomicBoolean f40782zoijcleaow = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final AtomicReference f40781ppxfxbqfkf = new AtomicReference();

    static class iobyxmoadg extends lqeggnwhkg {
        iobyxmoadg() {
        }

        @Override // hm.lqeggnwhkg
        protected void zoijcleaow() {
        }
    }

    static class zoijcleaow extends lqeggnwhkg {
        zoijcleaow() {
        }

        @Override // hm.lqeggnwhkg
        protected void zoijcleaow() {
            Iterator it = ServiceLoader.load(nufgyqmvbu.class, nufgyqmvbu.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    nufgyqmvbu.eablkybsjg((nufgyqmvbu) it.next());
                } catch (ServiceConfigurationError e13) {
                    if (!(e13.getCause() instanceof SecurityException)) {
                        throw e13;
                    }
                }
            }
        }
    }

    static void iobyxmoadg() {
        if (f40782zoijcleaow.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference atomicReference = f40781ppxfxbqfkf;
        mbcevpiqjq.wkgbmnqykc.iobyxmoadg(atomicReference, null, new zoijcleaow());
        ((lqeggnwhkg) atomicReference.get()).zoijcleaow();
    }

    public static void ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar) {
        if (f40782zoijcleaow.get()) {
            throw new IllegalStateException("Already initialized");
        }
        if (!mbcevpiqjq.wkgbmnqykc.iobyxmoadg(f40781ppxfxbqfkf, null, lqeggnwhkgVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    protected abstract void zoijcleaow();
}

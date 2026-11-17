package wflxmlrfwp;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf extends eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static volatile ppxfxbqfkf f119558ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private eablkybsjg f119560iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f119561zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Executor f119559wkgbmnqykc = new Executor() { // from class: wflxmlrfwp.iobyxmoadg
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ppxfxbqfkf.dxjokdxxww(runnable);
        }
    };

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Executor f119557eablkybsjg = new Executor() { // from class: wflxmlrfwp.zoijcleaow
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ppxfxbqfkf.btonecajqb(runnable);
        }
    };

    private ppxfxbqfkf() {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        this.f119561zoijcleaow = wkgbmnqykcVar;
        this.f119560iobyxmoadg = wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void btonecajqb(Runnable runnable) {
        nufgyqmvbu().iobyxmoadg(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void dxjokdxxww(Runnable runnable) {
        nufgyqmvbu().wkgbmnqykc(runnable);
    }

    public static Executor lqeggnwhkg() {
        return f119557eablkybsjg;
    }

    public static ppxfxbqfkf nufgyqmvbu() {
        if (f119558ppxfxbqfkf != null) {
            return f119558ppxfxbqfkf;
        }
        synchronized (ppxfxbqfkf.class) {
            try {
                if (f119558ppxfxbqfkf == null) {
                    f119558ppxfxbqfkf = new ppxfxbqfkf();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f119558ppxfxbqfkf;
    }

    @Override // wflxmlrfwp.eablkybsjg
    public void iobyxmoadg(Runnable runnable) {
        this.f119560iobyxmoadg.iobyxmoadg(runnable);
    }

    @Override // wflxmlrfwp.eablkybsjg
    public boolean ppxfxbqfkf() {
        return this.f119560iobyxmoadg.ppxfxbqfkf();
    }

    @Override // wflxmlrfwp.eablkybsjg
    public void wkgbmnqykc(Runnable runnable) {
        this.f119560iobyxmoadg.wkgbmnqykc(runnable);
    }
}

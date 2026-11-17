package androidx.recyclerview.widget;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Executor f13126iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final nufgyqmvbu.gxszxtbevo f13127ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f13128zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static Executor f13129eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final Object f13130wkgbmnqykc = new Object();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Executor f13131iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final nufgyqmvbu.gxszxtbevo f13132ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Executor f13133zoijcleaow;

        public iobyxmoadg(nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
            this.f13132ppxfxbqfkf = gxszxtbevoVar;
        }

        public ppxfxbqfkf iobyxmoadg() {
            if (this.f13133zoijcleaow == null) {
                synchronized (f13130wkgbmnqykc) {
                    try {
                        if (f13129eablkybsjg == null) {
                            f13129eablkybsjg = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f13133zoijcleaow = f13129eablkybsjg;
            }
            return new ppxfxbqfkf(this.f13131iobyxmoadg, this.f13133zoijcleaow, this.f13132ppxfxbqfkf);
        }
    }

    ppxfxbqfkf(Executor executor, Executor executor2, nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
        this.f13126iobyxmoadg = executor;
        this.f13128zoijcleaow = executor2;
        this.f13127ppxfxbqfkf = gxszxtbevoVar;
    }

    public Executor iobyxmoadg() {
        return this.f13128zoijcleaow;
    }

    public Executor ppxfxbqfkf() {
        return this.f13126iobyxmoadg;
    }

    public nufgyqmvbu.gxszxtbevo zoijcleaow() {
        return this.f13127ppxfxbqfkf;
    }
}

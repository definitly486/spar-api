package lereixgezr;

/* JADX INFO: loaded from: classes.dex */
public interface czzsidtyhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final czzsidtyhn f62252iobyxmoadg = new czzsidtyhn() { // from class: lereixgezr.rlfsiqarku
        @Override // lereixgezr.czzsidtyhn
        public final czzsidtyhn.ppxfxbqfkf gxszxtbevo(czzsidtyhn.zoijcleaow zoijcleaowVar) {
            return czzsidtyhn.ppxfxbqfkf(zoijcleaowVar);
        }
    };

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final czzsidtyhn f62254zoijcleaow = new androidx.camera.core.impl.nufgyqmvbu.zoijcleaow(eablkybsjg());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final czzsidtyhn f62253ppxfxbqfkf = new androidx.camera.core.impl.nufgyqmvbu(eablkybsjg());

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final czzsidtyhn f62255iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f62256zoijcleaow;

        public iobyxmoadg(czzsidtyhn czzsidtyhnVar) {
            this.f62255iobyxmoadg = czzsidtyhnVar;
            this.f62256zoijcleaow = czzsidtyhnVar.iobyxmoadg();
        }

        public czzsidtyhn iobyxmoadg() {
            czzsidtyhn czzsidtyhnVar = this.f62255iobyxmoadg;
            return czzsidtyhnVar instanceof istkbnxepw.czzsidtyhn ? ((istkbnxepw.czzsidtyhn) czzsidtyhnVar).wkgbmnqykc(this.f62256zoijcleaow) : new istkbnxepw.iyctptxqzt(this.f62256zoijcleaow, this.f62255iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long f62261iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f62262ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f62263zoijcleaow;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final ppxfxbqfkf f62260wkgbmnqykc = new ppxfxbqfkf(false, 0);

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final ppxfxbqfkf f62257eablkybsjg = new ppxfxbqfkf(true);

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final ppxfxbqfkf f62258gxszxtbevo = new ppxfxbqfkf(true, 100);

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public static ppxfxbqfkf f62259lqeggnwhkg = new ppxfxbqfkf(false, 0, true);

        private ppxfxbqfkf(boolean z13) {
            this(z13, iobyxmoadg());
        }

        public static long iobyxmoadg() {
            return 500L;
        }

        public boolean ppxfxbqfkf() {
            return this.f62262ppxfxbqfkf;
        }

        public boolean wkgbmnqykc() {
            return this.f62263zoijcleaow;
        }

        public long zoijcleaow() {
            return this.f62261iobyxmoadg;
        }

        private ppxfxbqfkf(boolean z13, long j13) {
            this(z13, j13, false);
        }

        private ppxfxbqfkf(boolean z13, long j13, boolean z14) {
            this.f62263zoijcleaow = z13;
            this.f62261iobyxmoadg = j13;
            if (z14) {
                u1.nufgyqmvbu.zoijcleaow(!z13, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f62262ppxfxbqfkf = z14;
        }
    }

    public interface zoijcleaow {
        int getStatus();

        Throwable iobyxmoadg();

        long zoijcleaow();
    }

    static long eablkybsjg() {
        return 6000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ ppxfxbqfkf ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        return ppxfxbqfkf.f62260wkgbmnqykc;
    }

    ppxfxbqfkf gxszxtbevo(zoijcleaow zoijcleaowVar);

    default long iobyxmoadg() {
        return 0L;
    }
}

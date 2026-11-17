package t9;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final eablkybsjg f110064ppxfxbqfkf = new iobyxmoadg().iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f110065iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f110066zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f110067iobyxmoadg = 0;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f110068zoijcleaow = 0;

        iobyxmoadg() {
        }

        public eablkybsjg iobyxmoadg() {
            return new eablkybsjg(this.f110067iobyxmoadg, this.f110068zoijcleaow);
        }

        public iobyxmoadg ppxfxbqfkf(long j13) {
            this.f110068zoijcleaow = j13;
            return this;
        }

        public iobyxmoadg zoijcleaow(long j13) {
            this.f110067iobyxmoadg = j13;
            return this;
        }
    }

    eablkybsjg(long j13, long j14) {
        this.f110065iobyxmoadg = j13;
        this.f110066zoijcleaow = j14;
    }

    public static iobyxmoadg ppxfxbqfkf() {
        return new iobyxmoadg();
    }

    public long iobyxmoadg() {
        return this.f110065iobyxmoadg;
    }

    public long zoijcleaow() {
        return this.f110066zoijcleaow;
    }
}

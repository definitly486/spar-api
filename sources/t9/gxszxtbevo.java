package t9;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final gxszxtbevo f110069ppxfxbqfkf = new iobyxmoadg().iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f110070iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f110071zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f110072iobyxmoadg = 0;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f110073zoijcleaow = 0;

        iobyxmoadg() {
        }

        public gxszxtbevo iobyxmoadg() {
            return new gxszxtbevo(this.f110072iobyxmoadg, this.f110073zoijcleaow);
        }

        public iobyxmoadg ppxfxbqfkf(long j13) {
            this.f110072iobyxmoadg = j13;
            return this;
        }

        public iobyxmoadg zoijcleaow(long j13) {
            this.f110073zoijcleaow = j13;
            return this;
        }
    }

    gxszxtbevo(long j13, long j14) {
        this.f110070iobyxmoadg = j13;
        this.f110071zoijcleaow = j14;
    }

    public static iobyxmoadg ppxfxbqfkf() {
        return new iobyxmoadg();
    }

    public long iobyxmoadg() {
        return this.f110071zoijcleaow;
    }

    public long zoijcleaow() {
        return this.f110070iobyxmoadg;
    }
}

package t9;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final ppxfxbqfkf f110083ppxfxbqfkf = new iobyxmoadg().iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f110084iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f110085zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f110086iobyxmoadg = 0;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private zoijcleaow f110087zoijcleaow = zoijcleaow.REASON_UNKNOWN;

        iobyxmoadg() {
        }

        public ppxfxbqfkf iobyxmoadg() {
            return new ppxfxbqfkf(this.f110086iobyxmoadg, this.f110087zoijcleaow);
        }

        public iobyxmoadg ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
            this.f110087zoijcleaow = zoijcleaowVar;
            return this;
        }

        public iobyxmoadg zoijcleaow(long j13) {
            this.f110086iobyxmoadg = j13;
            return this;
        }
    }

    public enum zoijcleaow implements pc.ppxfxbqfkf {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f110096zdlpuopuiu;

        zoijcleaow(int i13) {
            this.f110096zdlpuopuiu = i13;
        }

        @Override // pc.ppxfxbqfkf
        public int getNumber() {
            return this.f110096zdlpuopuiu;
        }
    }

    ppxfxbqfkf(long j13, zoijcleaow zoijcleaowVar) {
        this.f110084iobyxmoadg = j13;
        this.f110085zoijcleaow = zoijcleaowVar;
    }

    public static iobyxmoadg ppxfxbqfkf() {
        return new iobyxmoadg();
    }

    public long iobyxmoadg() {
        return this.f110084iobyxmoadg;
    }

    public zoijcleaow zoijcleaow() {
        return this.f110085zoijcleaow;
    }
}

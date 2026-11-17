package y2;

/* JADX INFO: loaded from: classes.dex */
public final class hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long f123553iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f123554ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ThreadLocal f123555wkgbmnqykc = new ThreadLocal();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f123556zoijcleaow;

    public hcddaimhww(long j13) {
        dxjokdxxww(j13);
    }

    public static long btonecajqb(long j13) {
        return stevsuqkhv.b(j13, 90000L, 1000000L);
    }

    public static long nufgyqmvbu(long j13) {
        return stevsuqkhv.b(j13, 1000000L, 90000L);
    }

    public synchronized void dxjokdxxww(long j13) {
        this.f123553iobyxmoadg = j13;
        this.f123556zoijcleaow = j13 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f123554ppxfxbqfkf = -9223372036854775807L;
    }

    public synchronized long eablkybsjg() {
        long j13;
        try {
            j13 = this.f123554ppxfxbqfkf;
        } catch (Throwable th2) {
            throw th2;
        }
        return j13 != -9223372036854775807L ? j13 + this.f123556zoijcleaow : wkgbmnqykc();
    }

    public synchronized long gxszxtbevo() {
        return this.f123556zoijcleaow;
    }

    public synchronized long iobyxmoadg(long j13) {
        if (j13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!lqeggnwhkg()) {
                long jLongValue = this.f123553iobyxmoadg;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) iobyxmoadg.eablkybsjg((Long) this.f123555wkgbmnqykc.get())).longValue();
                }
                this.f123556zoijcleaow = jLongValue - j13;
                notifyAll();
            }
            this.f123554ppxfxbqfkf = j13;
            return j13 + this.f123556zoijcleaow;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean lqeggnwhkg() {
        return this.f123556zoijcleaow != -9223372036854775807L;
    }

    public synchronized long ppxfxbqfkf(long j13) {
        if (j13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j14 = this.f123554ppxfxbqfkf;
            if (j14 != -9223372036854775807L) {
                long jBtonecajqb = btonecajqb(j14);
                long j15 = jBtonecajqb / 8589934592L;
                long j16 = (j15 * 8589934592L) + j13;
                j13 += (j15 + 1) * 8589934592L;
                if (j16 >= jBtonecajqb) {
                    j13 = j16;
                }
            }
            return iobyxmoadg(nufgyqmvbu(j13));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long wkgbmnqykc() {
        long j13;
        j13 = this.f123553iobyxmoadg;
        if (j13 == Long.MAX_VALUE || j13 == 9223372036854775806L) {
            j13 = -9223372036854775807L;
        }
        return j13;
    }

    public synchronized long zoijcleaow(long j13) {
        if (j13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j14 = this.f123554ppxfxbqfkf;
            if (j14 != -9223372036854775807L) {
                long jBtonecajqb = btonecajqb(j14);
                long j15 = (4294967296L + jBtonecajqb) / 8589934592L;
                long j16 = ((j15 - 1) * 8589934592L) + j13;
                j13 += j15 * 8589934592L;
                if (Math.abs(j16 - jBtonecajqb) < Math.abs(j13 - jBtonecajqb)) {
                    j13 = j16;
                }
            }
            return iobyxmoadg(nufgyqmvbu(j13));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

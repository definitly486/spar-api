package t3;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu implements pkzmftpjix {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f109503eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f109504gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f109505iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f109506lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f109507ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f109508wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f109509zoijcleaow;

    public nufgyqmvbu(long j13, long j14, int i13, int i14, boolean z13) {
        this.f109505iobyxmoadg = j13;
        this.f109509zoijcleaow = j14;
        this.f109507ppxfxbqfkf = i14 == -1 ? 1 : i14;
        this.f109503eablkybsjg = i13;
        this.f109506lqeggnwhkg = z13;
        if (j13 == -1) {
            this.f109508wkgbmnqykc = -1L;
            this.f109504gxszxtbevo = -9223372036854775807L;
        } else {
            this.f109508wkgbmnqykc = j13 - j14;
            this.f109504gxszxtbevo = ppxfxbqfkf(j13, j14, i13);
        }
    }

    private long iobyxmoadg(long j13) {
        long j14 = (j13 * ((long) this.f109503eablkybsjg)) / 8000000;
        int i13 = this.f109507ppxfxbqfkf;
        long jMin = (j14 / ((long) i13)) * ((long) i13);
        long j15 = this.f109508wkgbmnqykc;
        if (j15 != -1) {
            jMin = Math.min(jMin, j15 - ((long) i13));
        }
        return this.f109509zoijcleaow + Math.max(jMin, 0L);
    }

    private static long ppxfxbqfkf(long j13, long j14, int i13) {
        return (Math.max(0L, j13 - j14) * 8000000) / ((long) i13);
    }

    @Override // t3.pkzmftpjix
    public long gtknphoqwx() {
        return this.f109504gxszxtbevo;
    }

    @Override // t3.pkzmftpjix
    public boolean lqeggnwhkg() {
        return this.f109508wkgbmnqykc != -1 || this.f109506lqeggnwhkg;
    }

    @Override // t3.pkzmftpjix
    public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
        if (this.f109508wkgbmnqykc == -1 && !this.f109506lqeggnwhkg) {
            return new pkzmftpjix.iobyxmoadg(new hcddaimhww(0L, this.f109509zoijcleaow));
        }
        long jIobyxmoadg = iobyxmoadg(j13);
        long jZoijcleaow = zoijcleaow(jIobyxmoadg);
        hcddaimhww hcddaimhwwVar = new hcddaimhww(jZoijcleaow, jIobyxmoadg);
        if (this.f109508wkgbmnqykc != -1 && jZoijcleaow < j13) {
            int i13 = this.f109507ppxfxbqfkf;
            if (((long) i13) + jIobyxmoadg < this.f109505iobyxmoadg) {
                long j14 = jIobyxmoadg + ((long) i13);
                return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar, new hcddaimhww(zoijcleaow(j14), j14));
            }
        }
        return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar);
    }

    public long zoijcleaow(long j13) {
        return ppxfxbqfkf(j13, this.f109509zoijcleaow, this.f109503eablkybsjg);
    }
}

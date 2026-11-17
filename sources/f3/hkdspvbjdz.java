package f3;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final hkdspvbjdz f32667eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final hkdspvbjdz f32668gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final hkdspvbjdz f32669lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final hkdspvbjdz f32670ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final hkdspvbjdz f32671wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f32672iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f32673zoijcleaow;

    static {
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz(0L, 0L);
        f32670ppxfxbqfkf = hkdspvbjdzVar;
        f32671wkgbmnqykc = new hkdspvbjdz(Long.MAX_VALUE, Long.MAX_VALUE);
        f32667eablkybsjg = new hkdspvbjdz(Long.MAX_VALUE, 0L);
        f32668gxszxtbevo = new hkdspvbjdz(0L, Long.MAX_VALUE);
        f32669lqeggnwhkg = hkdspvbjdzVar;
    }

    public hkdspvbjdz(long j13, long j14) {
        y2.iobyxmoadg.iobyxmoadg(j13 >= 0);
        y2.iobyxmoadg.iobyxmoadg(j14 >= 0);
        this.f32672iobyxmoadg = j13;
        this.f32673zoijcleaow = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hkdspvbjdz.class != obj.getClass()) {
            return false;
        }
        hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) obj;
        return this.f32672iobyxmoadg == hkdspvbjdzVar.f32672iobyxmoadg && this.f32673zoijcleaow == hkdspvbjdzVar.f32673zoijcleaow;
    }

    public int hashCode() {
        return (((int) this.f32672iobyxmoadg) * 31) + ((int) this.f32673zoijcleaow);
    }

    public long iobyxmoadg(long j13, long j14, long j15) {
        long j16 = this.f32672iobyxmoadg;
        if (j16 == 0 && this.f32673zoijcleaow == 0) {
            return j13;
        }
        long jN = stevsuqkhv.n(j13, j16, Long.MIN_VALUE);
        long jPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(j13, this.f32673zoijcleaow, Long.MAX_VALUE);
        boolean z13 = false;
        boolean z14 = jN <= j14 && j14 <= jPpxfxbqfkf;
        if (jN <= j15 && j15 <= jPpxfxbqfkf) {
            z13 = true;
        }
        if (z14 && z13) {
            return Math.abs(j14 - j13) <= Math.abs(j15 - j13) ? j14 : j15;
        }
        if (z14) {
            return j14;
        }
        return z13 ? j15 : jN;
    }
}

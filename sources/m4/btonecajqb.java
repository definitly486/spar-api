package m4;

import t3.hcddaimhww;
import t3.iozdgvuglv;
import t3.pkzmftpjix;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class btonecajqb implements lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f65091eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f65092gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f65093iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final long[] f65094lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f65095ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f65096wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f65097zoijcleaow;

    private btonecajqb(long j13, int i13, long j14, int i14) {
        this(j13, i13, j14, i14, -1L, null);
    }

    public static btonecajqb iobyxmoadg(dxjokdxxww dxjokdxxwwVar, long j13) {
        long[] jArr;
        long jIobyxmoadg = dxjokdxxwwVar.iobyxmoadg();
        if (jIobyxmoadg == -9223372036854775807L) {
            return null;
        }
        long j14 = dxjokdxxwwVar.f65101ppxfxbqfkf;
        if (j14 == -1 || (jArr = dxjokdxxwwVar.f65099gxszxtbevo) == null) {
            iozdgvuglv.iobyxmoadg iobyxmoadgVar = dxjokdxxwwVar.f65100iobyxmoadg;
            return new btonecajqb(j13, iobyxmoadgVar.f109452ppxfxbqfkf, jIobyxmoadg, iobyxmoadgVar.f109449gxszxtbevo);
        }
        iozdgvuglv.iobyxmoadg iobyxmoadgVar2 = dxjokdxxwwVar.f65100iobyxmoadg;
        return new btonecajqb(j13, iobyxmoadgVar2.f109452ppxfxbqfkf, jIobyxmoadg, iobyxmoadgVar2.f109449gxszxtbevo, j14, jArr);
    }

    private long zoijcleaow(int i13) {
        return (this.f65095ppxfxbqfkf * ((long) i13)) / 100;
    }

    @Override // m4.lqeggnwhkg
    public int btonecajqb() {
        return this.f65096wkgbmnqykc;
    }

    @Override // t3.pkzmftpjix
    public long gtknphoqwx() {
        return this.f65095ppxfxbqfkf;
    }

    @Override // m4.lqeggnwhkg
    public long gxszxtbevo() {
        return this.f65092gxszxtbevo;
    }

    @Override // t3.pkzmftpjix
    public boolean lqeggnwhkg() {
        return this.f65094lqeggnwhkg != null;
    }

    @Override // m4.lqeggnwhkg
    public long nufgyqmvbu(long j13) {
        long j14 = j13 - this.f65093iobyxmoadg;
        if (!lqeggnwhkg() || j14 <= this.f65097zoijcleaow) {
            return 0L;
        }
        long[] jArr = (long[]) y2.iobyxmoadg.dxjokdxxww(this.f65094lqeggnwhkg);
        double d13 = (j14 * 256.0d) / this.f65091eablkybsjg;
        int iLqeggnwhkg = stevsuqkhv.lqeggnwhkg(jArr, (long) d13, true, true);
        long jZoijcleaow = zoijcleaow(iLqeggnwhkg);
        long j15 = jArr[iLqeggnwhkg];
        int i13 = iLqeggnwhkg + 1;
        long jZoijcleaow2 = zoijcleaow(i13);
        long j16 = iLqeggnwhkg == 99 ? 256L : jArr[i13];
        return jZoijcleaow + Math.round((j15 == j16 ? 0.0d : (d13 - j15) / (j16 - j15)) * (jZoijcleaow2 - jZoijcleaow));
    }

    @Override // t3.pkzmftpjix
    public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
        if (!lqeggnwhkg()) {
            return new pkzmftpjix.iobyxmoadg(new hcddaimhww(0L, this.f65093iobyxmoadg + ((long) this.f65097zoijcleaow)));
        }
        long jRgvfuqvkyq = stevsuqkhv.rgvfuqvkyq(j13, 0L, this.f65095ppxfxbqfkf);
        double d13 = (jRgvfuqvkyq * 100.0d) / this.f65095ppxfxbqfkf;
        double d14 = 0.0d;
        if (d13 > 0.0d) {
            if (d13 >= 100.0d) {
                d14 = 256.0d;
            } else {
                int i13 = (int) d13;
                long[] jArr = (long[]) y2.iobyxmoadg.dxjokdxxww(this.f65094lqeggnwhkg);
                double d15 = jArr[i13];
                d14 = d15 + ((d13 - ((double) i13)) * ((i13 == 99 ? 256.0d : jArr[i13 + 1]) - d15));
            }
        }
        return new pkzmftpjix.iobyxmoadg(new hcddaimhww(jRgvfuqvkyq, this.f65093iobyxmoadg + stevsuqkhv.rgvfuqvkyq(Math.round((d14 / 256.0d) * this.f65091eablkybsjg), this.f65097zoijcleaow, this.f65091eablkybsjg - 1)));
    }

    private btonecajqb(long j13, int i13, long j14, int i14, long j15, long[] jArr) {
        this.f65093iobyxmoadg = j13;
        this.f65097zoijcleaow = i13;
        this.f65095ppxfxbqfkf = j14;
        this.f65096wkgbmnqykc = i14;
        this.f65091eablkybsjg = j15;
        this.f65094lqeggnwhkg = jArr;
        this.f65092gxszxtbevo = j15 != -1 ? j13 + j15 : -1L;
    }
}

package b5;

import t3.hcddaimhww;
import t3.pkzmftpjix;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg implements pkzmftpjix {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f15208eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f15209iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f15210ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f15211wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f15212zoijcleaow;

    public eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, int i13, long j13, long j14) {
        this.f15209iobyxmoadg = ppxfxbqfkfVar;
        this.f15212zoijcleaow = i13;
        this.f15210ppxfxbqfkf = j13;
        long j15 = (j14 - j13) / ((long) ppxfxbqfkfVar.f15213eablkybsjg);
        this.f15211wkgbmnqykc = j15;
        this.f15208eablkybsjg = iobyxmoadg(j15);
    }

    private long iobyxmoadg(long j13) {
        return stevsuqkhv.b(j13 * ((long) this.f15212zoijcleaow), 1000000L, this.f15209iobyxmoadg.f15217ppxfxbqfkf);
    }

    @Override // t3.pkzmftpjix
    public long gtknphoqwx() {
        return this.f15208eablkybsjg;
    }

    @Override // t3.pkzmftpjix
    public boolean lqeggnwhkg() {
        return true;
    }

    @Override // t3.pkzmftpjix
    public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
        long jRgvfuqvkyq = stevsuqkhv.rgvfuqvkyq((((long) this.f15209iobyxmoadg.f15217ppxfxbqfkf) * j13) / (((long) this.f15212zoijcleaow) * 1000000), 0L, this.f15211wkgbmnqykc - 1);
        long j14 = this.f15210ppxfxbqfkf + (((long) this.f15209iobyxmoadg.f15213eablkybsjg) * jRgvfuqvkyq);
        long jIobyxmoadg = iobyxmoadg(jRgvfuqvkyq);
        hcddaimhww hcddaimhwwVar = new hcddaimhww(jIobyxmoadg, j14);
        if (jIobyxmoadg >= j13 || jRgvfuqvkyq == this.f15211wkgbmnqykc - 1) {
            return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar);
        }
        long j15 = jRgvfuqvkyq + 1;
        return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar, new hcddaimhww(iobyxmoadg(j15), this.f15210ppxfxbqfkf + (((long) this.f15209iobyxmoadg.f15213eablkybsjg) * j15)));
    }
}

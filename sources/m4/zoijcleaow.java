package m4;

import java.math.RoundingMode;
import t3.pkzmftpjix;
import t3.yadqdtsiqt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow implements lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f65140iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f65141ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f65142zoijcleaow;

    public zoijcleaow(long j13, long j14, long j15) {
        this.f65141ppxfxbqfkf = new yadqdtsiqt(new long[]{j14}, new long[]{0}, j13);
        this.f65140iobyxmoadg = j15;
        int i13 = -2147483647;
        if (j13 == -9223372036854775807L) {
            this.f65142zoijcleaow = -2147483647;
            return;
        }
        long jD = stevsuqkhv.d(j14 - j15, 8L, j13, RoundingMode.HALF_UP);
        if (jD > 0 && jD <= 2147483647L) {
            i13 = (int) jD;
        }
        this.f65142zoijcleaow = i13;
    }

    @Override // m4.lqeggnwhkg
    public int btonecajqb() {
        return this.f65142zoijcleaow;
    }

    @Override // t3.pkzmftpjix
    public long gtknphoqwx() {
        return this.f65141ppxfxbqfkf.gtknphoqwx();
    }

    @Override // m4.lqeggnwhkg
    public long gxszxtbevo() {
        return this.f65140iobyxmoadg;
    }

    public boolean iobyxmoadg(long j13) {
        return this.f65141ppxfxbqfkf.zoijcleaow(j13, 100000L);
    }

    @Override // t3.pkzmftpjix
    public boolean lqeggnwhkg() {
        return this.f65141ppxfxbqfkf.lqeggnwhkg();
    }

    @Override // m4.lqeggnwhkg
    public long nufgyqmvbu(long j13) {
        return this.f65141ppxfxbqfkf.nufgyqmvbu(j13);
    }

    void ppxfxbqfkf(long j13) {
        this.f65141ppxfxbqfkf.ppxfxbqfkf(j13);
    }

    @Override // t3.pkzmftpjix
    public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
        return this.f65141ppxfxbqfkf.wkgbmnqykc(j13);
    }

    public void zoijcleaow(long j13, long j14) {
        if (iobyxmoadg(j13)) {
            return;
        }
        this.f65141ppxfxbqfkf.iobyxmoadg(j13, j14);
    }
}

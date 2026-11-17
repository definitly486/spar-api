package o4;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import t3.hcddaimhww;
import t3.kcexrzcfyt;
import t3.pkzmftpjix;
import t3.vdvldrhtss;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg implements lqeggnwhkg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private long f71974btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f71975draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f71976dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f71977eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f71978gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f71979gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f71980iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f71981lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f71982nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f71983ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f71984wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f71985zoijcleaow;

    private final class zoijcleaow implements pkzmftpjix {
        private zoijcleaow() {
        }

        @Override // t3.pkzmftpjix
        public long gtknphoqwx() {
            return iobyxmoadg.this.f71984wkgbmnqykc.zoijcleaow(iobyxmoadg.this.f71979gxszxtbevo);
        }

        @Override // t3.pkzmftpjix
        public boolean lqeggnwhkg() {
            return true;
        }

        @Override // t3.pkzmftpjix
        public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
            return new pkzmftpjix.iobyxmoadg(new hcddaimhww(j13, stevsuqkhv.rgvfuqvkyq((iobyxmoadg.this.f71985zoijcleaow + BigInteger.valueOf(iobyxmoadg.this.f71984wkgbmnqykc.ppxfxbqfkf(j13)).multiply(BigInteger.valueOf(iobyxmoadg.this.f71983ppxfxbqfkf - iobyxmoadg.this.f71985zoijcleaow)).divide(BigInteger.valueOf(iobyxmoadg.this.f71979gxszxtbevo)).longValue()) - 30000, iobyxmoadg.this.f71985zoijcleaow, iobyxmoadg.this.f71983ppxfxbqfkf - 1)));
        }
    }

    public iobyxmoadg(dxjokdxxww dxjokdxxwwVar, long j13, long j14, long j15, long j16, boolean z13) {
        y2.iobyxmoadg.iobyxmoadg(j13 >= 0 && j14 > j13);
        this.f71984wkgbmnqykc = dxjokdxxwwVar;
        this.f71985zoijcleaow = j13;
        this.f71983ppxfxbqfkf = j14;
        if (j15 == j14 - j13 || z13) {
            this.f71979gxszxtbevo = j16;
            this.f71977eablkybsjg = 4;
        } else {
            this.f71977eablkybsjg = 0;
        }
        this.f71980iobyxmoadg = new gxszxtbevo();
    }

    private long dxjokdxxww(vdvldrhtss vdvldrhtssVar) throws IOException {
        if (this.f71976dxjokdxxww == this.f71974btonecajqb) {
            return -1L;
        }
        long position = vdvldrhtssVar.getPosition();
        if (!this.f71980iobyxmoadg.wkgbmnqykc(vdvldrhtssVar, this.f71974btonecajqb)) {
            long j13 = this.f71976dxjokdxxww;
            if (j13 != position) {
                return j13;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f71980iobyxmoadg.iobyxmoadg(vdvldrhtssVar, false);
        vdvldrhtssVar.gxszxtbevo();
        long j14 = this.f71982nufgyqmvbu;
        gxszxtbevo gxszxtbevoVar = this.f71980iobyxmoadg;
        long j15 = gxszxtbevoVar.f71971ppxfxbqfkf;
        long j16 = j14 - j15;
        int i13 = gxszxtbevoVar.f71970nufgyqmvbu + gxszxtbevoVar.f71964dxjokdxxww;
        if (0 <= j16 && j16 < 72000) {
            return -1L;
        }
        if (j16 < 0) {
            this.f71974btonecajqb = position;
            this.f71975draadjrbmk = j15;
        } else {
            this.f71976dxjokdxxww = vdvldrhtssVar.getPosition() + ((long) i13);
            this.f71978gtknphoqwx = this.f71980iobyxmoadg.f71971ppxfxbqfkf;
        }
        long j17 = this.f71974btonecajqb;
        long j18 = this.f71976dxjokdxxww;
        if (j17 - j18 < 100000) {
            this.f71974btonecajqb = j18;
            return j18;
        }
        long position2 = vdvldrhtssVar.getPosition() - (((long) i13) * (j16 <= 0 ? 2L : 1L));
        long j19 = this.f71974btonecajqb;
        long j23 = this.f71976dxjokdxxww;
        return stevsuqkhv.rgvfuqvkyq(position2 + ((j16 * (j19 - j23)) / (this.f71975draadjrbmk - this.f71978gtknphoqwx)), j23, j19 - 1);
    }

    private void gtknphoqwx(vdvldrhtss vdvldrhtssVar) throws ParserException {
        while (true) {
            this.f71980iobyxmoadg.ppxfxbqfkf(vdvldrhtssVar);
            this.f71980iobyxmoadg.iobyxmoadg(vdvldrhtssVar, false);
            gxszxtbevo gxszxtbevoVar = this.f71980iobyxmoadg;
            if (gxszxtbevoVar.f71971ppxfxbqfkf > this.f71982nufgyqmvbu) {
                vdvldrhtssVar.gxszxtbevo();
                return;
            } else {
                vdvldrhtssVar.draadjrbmk(gxszxtbevoVar.f71970nufgyqmvbu + gxszxtbevoVar.f71964dxjokdxxww);
                this.f71976dxjokdxxww = vdvldrhtssVar.getPosition();
                this.f71978gtknphoqwx = this.f71980iobyxmoadg.f71971ppxfxbqfkf;
            }
        }
    }

    long btonecajqb(vdvldrhtss vdvldrhtssVar) throws ParserException, EOFException {
        this.f71980iobyxmoadg.zoijcleaow();
        if (!this.f71980iobyxmoadg.ppxfxbqfkf(vdvldrhtssVar)) {
            throw new EOFException();
        }
        this.f71980iobyxmoadg.iobyxmoadg(vdvldrhtssVar, false);
        gxszxtbevo gxszxtbevoVar = this.f71980iobyxmoadg;
        vdvldrhtssVar.draadjrbmk(gxszxtbevoVar.f71970nufgyqmvbu + gxszxtbevoVar.f71964dxjokdxxww);
        long j13 = this.f71980iobyxmoadg.f71971ppxfxbqfkf;
        while (true) {
            gxszxtbevo gxszxtbevoVar2 = this.f71980iobyxmoadg;
            if ((gxszxtbevoVar2.f71973zoijcleaow & 4) == 4 || !gxszxtbevoVar2.ppxfxbqfkf(vdvldrhtssVar) || vdvldrhtssVar.getPosition() >= this.f71983ppxfxbqfkf || !this.f71980iobyxmoadg.iobyxmoadg(vdvldrhtssVar, true)) {
                break;
            }
            gxszxtbevo gxszxtbevoVar3 = this.f71980iobyxmoadg;
            if (!kcexrzcfyt.eablkybsjg(vdvldrhtssVar, gxszxtbevoVar3.f71970nufgyqmvbu + gxszxtbevoVar3.f71964dxjokdxxww)) {
                break;
            }
            j13 = this.f71980iobyxmoadg.f71971ppxfxbqfkf;
        }
        return j13;
    }

    @Override // o4.lqeggnwhkg
    public long iobyxmoadg(vdvldrhtss vdvldrhtssVar) throws IOException {
        int i13 = this.f71977eablkybsjg;
        if (i13 == 0) {
            long position = vdvldrhtssVar.getPosition();
            this.f71981lqeggnwhkg = position;
            this.f71977eablkybsjg = 1;
            long j13 = this.f71983ppxfxbqfkf - 65307;
            if (j13 > position) {
                return j13;
            }
        } else if (i13 != 1) {
            if (i13 == 2) {
                long jDxjokdxxww = dxjokdxxww(vdvldrhtssVar);
                if (jDxjokdxxww != -1) {
                    return jDxjokdxxww;
                }
                this.f71977eablkybsjg = 3;
            } else if (i13 != 3) {
                if (i13 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            gtknphoqwx(vdvldrhtssVar);
            this.f71977eablkybsjg = 4;
            return -(this.f71978gtknphoqwx + 2);
        }
        this.f71979gxszxtbevo = btonecajqb(vdvldrhtssVar);
        this.f71977eablkybsjg = 4;
        return this.f71981lqeggnwhkg;
    }

    @Override // o4.lqeggnwhkg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public zoijcleaow zoijcleaow() {
        if (this.f71979gxszxtbevo != 0) {
            return new zoijcleaow();
        }
        return null;
    }

    @Override // o4.lqeggnwhkg
    public void ppxfxbqfkf(long j13) {
        this.f71982nufgyqmvbu = stevsuqkhv.rgvfuqvkyq(j13, 0L, this.f71979gxszxtbevo - 1);
        this.f71977eablkybsjg = 2;
        this.f71976dxjokdxxww = this.f71985zoijcleaow;
        this.f71974btonecajqb = this.f71983ppxfxbqfkf;
        this.f71978gtknphoqwx = 0L;
        this.f71975draadjrbmk = this.f71979gxszxtbevo;
    }
}

package o4;

import androidx.media3.common.ParserException;
import kotlin.KotlinVersion;
import t3.kcexrzcfyt;
import t3.vdvldrhtss;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public int f71964dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public long f71965eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public long f71967gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int f71968iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public int f71969lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public int f71970nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public long f71971ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public long f71972wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int f71973zoijcleaow;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final int[] f71963btonecajqb = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final yadqdtsiqt f71966gtknphoqwx = new yadqdtsiqt(KotlinVersion.MAX_COMPONENT_VALUE);

    gxszxtbevo() {
    }

    public boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar, boolean z13) throws ParserException {
        zoijcleaow();
        this.f71966gtknphoqwx.tzroggbefp(27);
        if (!kcexrzcfyt.zoijcleaow(vdvldrhtssVar, this.f71966gtknphoqwx.eablkybsjg(), 0, 27, z13) || this.f71966gtknphoqwx.pkzmftpjix() != 1332176723) {
            return false;
        }
        int iWwaezpbzkn = this.f71966gtknphoqwx.wwaezpbzkn();
        this.f71968iobyxmoadg = iWwaezpbzkn;
        if (iWwaezpbzkn != 0) {
            if (z13) {
                return false;
            }
            throw ParserException.lqeggnwhkg("unsupported bit stream revision");
        }
        this.f71973zoijcleaow = this.f71966gtknphoqwx.wwaezpbzkn();
        this.f71971ppxfxbqfkf = this.f71966gtknphoqwx.jyumaefscl();
        this.f71972wkgbmnqykc = this.f71966gtknphoqwx.cqumvgiudr();
        this.f71965eablkybsjg = this.f71966gtknphoqwx.cqumvgiudr();
        this.f71967gxszxtbevo = this.f71966gtknphoqwx.cqumvgiudr();
        int iWwaezpbzkn2 = this.f71966gtknphoqwx.wwaezpbzkn();
        this.f71969lqeggnwhkg = iWwaezpbzkn2;
        this.f71970nufgyqmvbu = iWwaezpbzkn2 + 27;
        this.f71966gtknphoqwx.tzroggbefp(iWwaezpbzkn2);
        if (!kcexrzcfyt.zoijcleaow(vdvldrhtssVar, this.f71966gtknphoqwx.eablkybsjg(), 0, this.f71969lqeggnwhkg, z13)) {
            return false;
        }
        for (int i13 = 0; i13 < this.f71969lqeggnwhkg; i13++) {
            this.f71963btonecajqb[i13] = this.f71966gtknphoqwx.wwaezpbzkn();
            this.f71964dxjokdxxww += this.f71963btonecajqb[i13];
        }
        return true;
    }

    public boolean ppxfxbqfkf(vdvldrhtss vdvldrhtssVar) {
        return wkgbmnqykc(vdvldrhtssVar, -1L);
    }

    public boolean wkgbmnqykc(vdvldrhtss vdvldrhtssVar, long j13) {
        y2.iobyxmoadg.iobyxmoadg(vdvldrhtssVar.getPosition() == vdvldrhtssVar.nufgyqmvbu());
        this.f71966gtknphoqwx.tzroggbefp(4);
        while (true) {
            if ((j13 != -1 && vdvldrhtssVar.getPosition() + 4 >= j13) || !kcexrzcfyt.zoijcleaow(vdvldrhtssVar, this.f71966gtknphoqwx.eablkybsjg(), 0, 4, true)) {
                break;
            }
            this.f71966gtknphoqwx.sopmlzcsov(0);
            if (this.f71966gtknphoqwx.pkzmftpjix() == 1332176723) {
                vdvldrhtssVar.gxszxtbevo();
                return true;
            }
            vdvldrhtssVar.draadjrbmk(1);
        }
        do {
            if (j13 != -1 && vdvldrhtssVar.getPosition() >= j13) {
                break;
            }
        } while (vdvldrhtssVar.btonecajqb(1) != -1);
        return false;
    }

    public void zoijcleaow() {
        this.f71968iobyxmoadg = 0;
        this.f71973zoijcleaow = 0;
        this.f71971ppxfxbqfkf = 0L;
        this.f71972wkgbmnqykc = 0L;
        this.f71965eablkybsjg = 0L;
        this.f71967gxszxtbevo = 0L;
        this.f71969lqeggnwhkg = 0;
        this.f71970nufgyqmvbu = 0;
        this.f71964dxjokdxxww = 0;
    }
}

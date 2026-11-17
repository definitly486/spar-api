package b4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import n4.agtfadlqog;
import t3.oxmwwwfdhm;
import t3.pkzmftpjix;
import t3.rgvfuqvkyq;
import t3.vdvldrhtss;
import t3.ylkuphrtab;
import v2.jyumaefscl;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow implements rgvfuqvkyq {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private agtfadlqog f15109btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private wkgbmnqykc f15110dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f15111eablkybsjg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private i4.iobyxmoadg f15114lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private vdvldrhtss f15115nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f15116ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f15117wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private oxmwwwfdhm f15118zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f15113iobyxmoadg = new yadqdtsiqt(6);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f15112gxszxtbevo = -1;

    private void agtfadlqog(vdvldrhtss vdvldrhtssVar) {
        this.f15113iobyxmoadg.tzroggbefp(2);
        vdvldrhtssVar.readFully(this.f15113iobyxmoadg.eablkybsjg(), 0, 2);
        this.f15111eablkybsjg = this.f15113iobyxmoadg.wypolnanlu() - 2;
        this.f15116ppxfxbqfkf = 2;
    }

    private int btonecajqb(vdvldrhtss vdvldrhtssVar) {
        this.f15113iobyxmoadg.tzroggbefp(2);
        vdvldrhtssVar.ojitshcjhn(this.f15113iobyxmoadg.eablkybsjg(), 0, 2);
        return this.f15113iobyxmoadg.wypolnanlu();
    }

    private void gtknphoqwx(vdvldrhtss vdvldrhtssVar) {
        this.f15113iobyxmoadg.tzroggbefp(2);
        vdvldrhtssVar.readFully(this.f15113iobyxmoadg.eablkybsjg(), 0, 2);
        int iWypolnanlu = this.f15113iobyxmoadg.wypolnanlu();
        this.f15117wkgbmnqykc = iWypolnanlu;
        if (iWypolnanlu == 65498) {
            if (this.f15112gxszxtbevo != -1) {
                this.f15116ppxfxbqfkf = 4;
                return;
            } else {
                gxszxtbevo();
                return;
            }
        }
        if ((iWypolnanlu < 65488 || iWypolnanlu > 65497) && iWypolnanlu != 65281) {
            this.f15116ppxfxbqfkf = 1;
        }
    }

    private void gxszxtbevo() {
        ((oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f15118zoijcleaow)).agtfadlqog();
        this.f15118zoijcleaow.gxszxtbevo(new pkzmftpjix.zoijcleaow(-9223372036854775807L));
        this.f15116ppxfxbqfkf = 6;
    }

    private static i4.iobyxmoadg lqeggnwhkg(String str, long j13) {
        ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg;
        if (j13 == -1 || (ppxfxbqfkfVarIobyxmoadg = gxszxtbevo.iobyxmoadg(str)) == null) {
            return null;
        }
        return ppxfxbqfkfVarIobyxmoadg.iobyxmoadg(j13);
    }

    private void nufgyqmvbu(i4.iobyxmoadg iobyxmoadgVar) {
        ((oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f15118zoijcleaow)).kcexrzcfyt(UserVerificationMethods.USER_VERIFY_ALL, 4).iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt("image/jpeg").zfvoamnweg(new jyumaefscl(iobyxmoadgVar)).cllcsxoeiz());
    }

    private void ojitshcjhn(vdvldrhtss vdvldrhtssVar) {
        if (!vdvldrhtssVar.ppxfxbqfkf(this.f15113iobyxmoadg.eablkybsjg(), 0, 1, true)) {
            gxszxtbevo();
            return;
        }
        vdvldrhtssVar.gxszxtbevo();
        if (this.f15109btonecajqb == null) {
            this.f15109btonecajqb = new agtfadlqog(q4.oxmwwwfdhm.iobyxmoadg.f77831iobyxmoadg, 8);
        }
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(vdvldrhtssVar, this.f15112gxszxtbevo);
        this.f15110dxjokdxxww = wkgbmnqykcVar;
        if (!this.f15109btonecajqb.draadjrbmk(wkgbmnqykcVar)) {
            gxszxtbevo();
        } else {
            this.f15109btonecajqb.ppxfxbqfkf(new eablkybsjg(this.f15112gxszxtbevo, (oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f15118zoijcleaow)));
            rgvfuqvkyq();
        }
    }

    private void rgvfuqvkyq() {
        nufgyqmvbu((i4.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f15114lqeggnwhkg));
        this.f15116ppxfxbqfkf = 5;
    }

    private void wflxmlrfwp(vdvldrhtss vdvldrhtssVar) {
        String strZynmafqrjb;
        if (this.f15117wkgbmnqykc == 65505) {
            yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(this.f15111eablkybsjg);
            vdvldrhtssVar.readFully(yadqdtsiqtVar.eablkybsjg(), 0, this.f15111eablkybsjg);
            if (this.f15114lqeggnwhkg == null && "http://ns.adobe.com/xap/1.0/".equals(yadqdtsiqtVar.zynmafqrjb()) && (strZynmafqrjb = yadqdtsiqtVar.zynmafqrjb()) != null) {
                i4.iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg(strZynmafqrjb, vdvldrhtssVar.getLength());
                this.f15114lqeggnwhkg = iobyxmoadgVarLqeggnwhkg;
                if (iobyxmoadgVarLqeggnwhkg != null) {
                    this.f15112gxszxtbevo = iobyxmoadgVarLqeggnwhkg.f41948wkgbmnqykc;
                }
            }
        } else {
            vdvldrhtssVar.draadjrbmk(this.f15111eablkybsjg);
        }
        this.f15116ppxfxbqfkf = 0;
    }

    private void wkgbmnqykc(vdvldrhtss vdvldrhtssVar) {
        this.f15113iobyxmoadg.tzroggbefp(2);
        vdvldrhtssVar.ojitshcjhn(this.f15113iobyxmoadg.eablkybsjg(), 0, 2);
        vdvldrhtssVar.dxjokdxxww(this.f15113iobyxmoadg.wypolnanlu() - 2);
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(vdvldrhtss vdvldrhtssVar) {
        if (btonecajqb(vdvldrhtssVar) != 65496) {
            return false;
        }
        int iBtonecajqb = btonecajqb(vdvldrhtssVar);
        this.f15117wkgbmnqykc = iBtonecajqb;
        if (iBtonecajqb == 65504) {
            wkgbmnqykc(vdvldrhtssVar);
            this.f15117wkgbmnqykc = btonecajqb(vdvldrhtssVar);
        }
        if (this.f15117wkgbmnqykc != 65505) {
            return false;
        }
        vdvldrhtssVar.dxjokdxxww(2);
        this.f15113iobyxmoadg.tzroggbefp(6);
        vdvldrhtssVar.ojitshcjhn(this.f15113iobyxmoadg.eablkybsjg(), 0, 6);
        return this.f15113iobyxmoadg.pkzmftpjix() == 1165519206 && this.f15113iobyxmoadg.wypolnanlu() == 0;
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        if (j13 == 0) {
            this.f15116ppxfxbqfkf = 0;
            this.f15109btonecajqb = null;
        } else if (this.f15116ppxfxbqfkf == 5) {
            ((agtfadlqog) y2.iobyxmoadg.eablkybsjg(this.f15109btonecajqb)).iobyxmoadg(j13, j14);
        }
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f15118zoijcleaow = oxmwwwfdhmVar;
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
        agtfadlqog agtfadlqogVar = this.f15109btonecajqb;
        if (agtfadlqogVar != null) {
            agtfadlqogVar.release();
        }
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        int i13 = this.f15116ppxfxbqfkf;
        if (i13 == 0) {
            gtknphoqwx(vdvldrhtssVar);
            return 0;
        }
        if (i13 == 1) {
            agtfadlqog(vdvldrhtssVar);
            return 0;
        }
        if (i13 == 2) {
            wflxmlrfwp(vdvldrhtssVar);
            return 0;
        }
        if (i13 == 4) {
            long position = vdvldrhtssVar.getPosition();
            long j13 = this.f15112gxszxtbevo;
            if (position != j13) {
                ylkuphrtabVar.f109571iobyxmoadg = j13;
                return 1;
            }
            ojitshcjhn(vdvldrhtssVar);
            return 0;
        }
        if (i13 != 5) {
            if (i13 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f15110dxjokdxxww == null || vdvldrhtssVar != this.f15115nufgyqmvbu) {
            this.f15115nufgyqmvbu = vdvldrhtssVar;
            this.f15110dxjokdxxww = new wkgbmnqykc(vdvldrhtssVar, this.f15112gxszxtbevo);
        }
        int iZoijcleaow = ((agtfadlqog) y2.iobyxmoadg.eablkybsjg(this.f15109btonecajqb)).zoijcleaow(this.f15110dxjokdxxww, ylkuphrtabVar);
        if (iZoijcleaow == 1) {
            ylkuphrtabVar.f109571iobyxmoadg += this.f15112gxszxtbevo;
        }
        return iZoijcleaow;
    }
}

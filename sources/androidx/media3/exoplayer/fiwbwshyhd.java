package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class fiwbwshyhd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wizcaqwiak f10545iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wizcaqwiak f10546ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f10548zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f10547wkgbmnqykc = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f10543eablkybsjg = false;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f10544gxszxtbevo = false;

    public fiwbwshyhd(wizcaqwiak wizcaqwiakVar, wizcaqwiak wizcaqwiakVar2, int i13) {
        this.f10545iobyxmoadg = wizcaqwiakVar;
        this.f10548zoijcleaow = i13;
        this.f10546ppxfxbqfkf = wizcaqwiakVar2;
    }

    private void crxdokpmqz(boolean z13) {
        if (z13) {
            ((wizcaqwiak) y2.iobyxmoadg.eablkybsjg(this.f10546ppxfxbqfkf)).cqumvgiudr(17, this.f10545iobyxmoadg);
        } else {
            this.f10545iobyxmoadg.cqumvgiudr(17, y2.iobyxmoadg.eablkybsjg(this.f10546ppxfxbqfkf));
        }
    }

    private wizcaqwiak draadjrbmk(yfnezrywwk yfnezrywwkVar) {
        if (yfnezrywwkVar != null && yfnezrywwkVar.f11646ppxfxbqfkf[this.f10548zoijcleaow] != null) {
            if (this.f10545iobyxmoadg.gtknphoqwx() == yfnezrywwkVar.f11646ppxfxbqfkf[this.f10548zoijcleaow]) {
                return this.f10545iobyxmoadg;
            }
            wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
            if (wizcaqwiakVar != null && wizcaqwiakVar.gtknphoqwx() == yfnezrywwkVar.f11646ppxfxbqfkf[this.f10548zoijcleaow]) {
                return this.f10546ppxfxbqfkf;
            }
        }
        return null;
    }

    private static androidx.media3.common.iobyxmoadg[] dxjokdxxww(o3.esjtqupxsv esjtqupxsvVar) {
        int length = esjtqupxsvVar != null ? esjtqupxsvVar.length() : 0;
        androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr = new androidx.media3.common.iobyxmoadg[length];
        for (int i13 = 0; i13 < length; i13++) {
            iobyxmoadgVarArr[i13] = ((o3.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(esjtqupxsvVar)).zoijcleaow(i13);
        }
        return iobyxmoadgVarArr;
    }

    private static boolean esjtqupxsv(wizcaqwiak wizcaqwiakVar) {
        return wizcaqwiakVar.getState() != 0;
    }

    private int hcddaimhww(wizcaqwiak wizcaqwiakVar, yfnezrywwk yfnezrywwkVar, o3.yadqdtsiqt yadqdtsiqtVar, gtknphoqwx gtknphoqwxVar) {
        if (wizcaqwiakVar == null || !esjtqupxsv(wizcaqwiakVar) || ((wizcaqwiakVar == this.f10545iobyxmoadg && jyumaefscl()) || (wizcaqwiakVar == this.f10546ppxfxbqfkf && pmvmpeiblj()))) {
            return 1;
        }
        m3.oxmwwwfdhm oxmwwwfdhmVarGtknphoqwx = wizcaqwiakVar.gtknphoqwx();
        m3.oxmwwwfdhm[] oxmwwwfdhmVarArr = yfnezrywwkVar.f11646ppxfxbqfkf;
        int i13 = this.f10548zoijcleaow;
        boolean z13 = oxmwwwfdhmVarGtknphoqwx != oxmwwwfdhmVarArr[i13];
        boolean zPpxfxbqfkf = yadqdtsiqtVar.ppxfxbqfkf(i13);
        if (zPpxfxbqfkf && !z13) {
            return 1;
        }
        if (!wizcaqwiakVar.istkbnxepw()) {
            wizcaqwiakVar.oxmwwwfdhm(dxjokdxxww(yadqdtsiqtVar.f71903ppxfxbqfkf[this.f10548zoijcleaow]), (m3.oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(yfnezrywwkVar.f11646ppxfxbqfkf[this.f10548zoijcleaow]), yfnezrywwkVar.agtfadlqog(), yfnezrywwkVar.wflxmlrfwp(), yfnezrywwkVar.f11644nufgyqmvbu.f11629iobyxmoadg);
            return 3;
        }
        if (!wizcaqwiakVar.wkgbmnqykc()) {
            return 0;
        }
        wkgbmnqykc(wizcaqwiakVar, gtknphoqwxVar);
        if (!zPpxfxbqfkf || yggfygwlhe()) {
            yadqdtsiqt(wizcaqwiakVar == this.f10545iobyxmoadg);
        }
        return 1;
    }

    private void istkbnxepw(wizcaqwiak wizcaqwiakVar, m3.oxmwwwfdhm oxmwwwfdhmVar, gtknphoqwx gtknphoqwxVar, long j13, boolean z13) {
        if (esjtqupxsv(wizcaqwiakVar)) {
            if (oxmwwwfdhmVar != wizcaqwiakVar.gtknphoqwx()) {
                wkgbmnqykc(wizcaqwiakVar, gtknphoqwxVar);
            } else if (z13) {
                wizcaqwiakVar.stevsuqkhv(j13);
            }
        }
    }

    private boolean jyumaefscl() {
        int i13 = this.f10547wkgbmnqykc;
        return i13 == 2 || i13 == 4;
    }

    private void lqeggnwhkg(wizcaqwiak wizcaqwiakVar) {
        if (wizcaqwiakVar.getState() == 2) {
            wizcaqwiakVar.stop();
        }
    }

    private boolean pmvmpeiblj() {
        return this.f10547wkgbmnqykc == 3;
    }

    private boolean rgvfuqvkyq(yfnezrywwk yfnezrywwkVar, wizcaqwiak wizcaqwiakVar) {
        if (wizcaqwiakVar == null) {
            return true;
        }
        m3.oxmwwwfdhm oxmwwwfdhmVar = yfnezrywwkVar.f11646ppxfxbqfkf[this.f10548zoijcleaow];
        if (wizcaqwiakVar.gtknphoqwx() == null) {
            return true;
        }
        if (wizcaqwiakVar.gtknphoqwx() == oxmwwwfdhmVar && (oxmwwwfdhmVar == null || wizcaqwiakVar.wflxmlrfwp() || vdvldrhtss(wizcaqwiakVar, yfnezrywwkVar))) {
            return true;
        }
        yfnezrywwk yfnezrywwkVarGtknphoqwx = yfnezrywwkVar.gtknphoqwx();
        return yfnezrywwkVarGtknphoqwx != null && yfnezrywwkVarGtknphoqwx.f11646ppxfxbqfkf[this.f10548zoijcleaow] == wizcaqwiakVar.gtknphoqwx();
    }

    private boolean vdvldrhtss(wizcaqwiak wizcaqwiakVar, yfnezrywwk yfnezrywwkVar) {
        yfnezrywwk yfnezrywwkVarGtknphoqwx = yfnezrywwkVar.gtknphoqwx();
        return yfnezrywwkVar.f11644nufgyqmvbu.f11630lqeggnwhkg && yfnezrywwkVarGtknphoqwx != null && yfnezrywwkVarGtknphoqwx.f11641gxszxtbevo && ((wizcaqwiakVar instanceof n3.dxjokdxxww) || (wizcaqwiakVar instanceof l3.ppxfxbqfkf) || wizcaqwiakVar.wypolnanlu() >= yfnezrywwkVarGtknphoqwx.agtfadlqog());
    }

    private void wkgbmnqykc(wizcaqwiak wizcaqwiakVar, gtknphoqwx gtknphoqwxVar) {
        y2.iobyxmoadg.lqeggnwhkg(this.f10545iobyxmoadg == wizcaqwiakVar || this.f10546ppxfxbqfkf == wizcaqwiakVar);
        if (esjtqupxsv(wizcaqwiakVar)) {
            gtknphoqwxVar.iobyxmoadg(wizcaqwiakVar);
            lqeggnwhkg(wizcaqwiakVar);
            wizcaqwiakVar.gxszxtbevo();
        }
    }

    private void wypolnanlu(wizcaqwiak wizcaqwiakVar, long j13) {
        wizcaqwiakVar.rgvfuqvkyq();
        if (wizcaqwiakVar instanceof n3.dxjokdxxww) {
            ((n3.dxjokdxxww) wizcaqwiakVar).fyldjkxazc(j13);
        }
    }

    private void yadqdtsiqt(boolean z13) {
        if (z13) {
            if (this.f10543eablkybsjg) {
                this.f10545iobyxmoadg.zoijcleaow();
                this.f10543eablkybsjg = false;
                return;
            }
            return;
        }
        if (this.f10544gxszxtbevo) {
            ((wizcaqwiak) y2.iobyxmoadg.eablkybsjg(this.f10546ppxfxbqfkf)).zoijcleaow();
            this.f10544gxszxtbevo = false;
        }
    }

    public void agtfadlqog(int i13, Object obj, yfnezrywwk yfnezrywwkVar) {
        ((wizcaqwiak) y2.iobyxmoadg.eablkybsjg(draadjrbmk(yfnezrywwkVar))).cqumvgiudr(i13, obj);
    }

    public long btonecajqb(long j13, long j14) {
        long jIozdgvuglv = esjtqupxsv(this.f10545iobyxmoadg) ? this.f10545iobyxmoadg.iozdgvuglv(j13, j14) : Long.MAX_VALUE;
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        return (wizcaqwiakVar == null || !esjtqupxsv(wizcaqwiakVar)) ? jIozdgvuglv : Math.min(jIozdgvuglv, this.f10546ppxfxbqfkf.iozdgvuglv(j13, j14));
    }

    public void cdpycssgdh() {
        int i13 = this.f10547wkgbmnqykc;
        if (i13 == 3 || i13 == 4) {
            crxdokpmqz(i13 == 4);
            this.f10547wkgbmnqykc = this.f10547wkgbmnqykc != 4 ? 1 : 0;
        } else if (i13 == 2) {
            this.f10547wkgbmnqykc = 0;
        }
    }

    public void cllcsxoeiz(long j13) {
        int i13;
        if (esjtqupxsv(this.f10545iobyxmoadg) && (i13 = this.f10547wkgbmnqykc) != 4 && i13 != 2) {
            wypolnanlu(this.f10545iobyxmoadg, j13);
        }
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar == null || !esjtqupxsv(wizcaqwiakVar) || this.f10547wkgbmnqykc == 3) {
            return;
        }
        wypolnanlu(this.f10546ppxfxbqfkf, j13);
    }

    public boolean cqumvgiudr() {
        int i13 = this.f10547wkgbmnqykc;
        return (i13 == 0 || i13 == 2 || i13 == 4) ? esjtqupxsv(this.f10545iobyxmoadg) : esjtqupxsv((wizcaqwiak) y2.iobyxmoadg.eablkybsjg(this.f10546ppxfxbqfkf));
    }

    public void dsvhmnatus(yfnezrywwk yfnezrywwkVar, long j13) {
        wypolnanlu((wizcaqwiak) y2.iobyxmoadg.eablkybsjg(draadjrbmk(yfnezrywwkVar)), j13);
    }

    public void eablkybsjg(f3.hcddaimhww hcddaimhwwVar, o3.esjtqupxsv esjtqupxsvVar, m3.oxmwwwfdhm oxmwwwfdhmVar, long j13, boolean z13, boolean z14, long j14, long j15, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, gtknphoqwx gtknphoqwxVar) throws ExoPlaybackException {
        androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArrDxjokdxxww = dxjokdxxww(esjtqupxsvVar);
        int i13 = this.f10547wkgbmnqykc;
        if (i13 == 0 || i13 == 2 || i13 == 4) {
            this.f10543eablkybsjg = true;
            this.f10545iobyxmoadg.esjtqupxsv(hcddaimhwwVar, iobyxmoadgVarArrDxjokdxxww, oxmwwwfdhmVar, j13, z13, z14, j14, j15, zoijcleaowVar);
            gtknphoqwxVar.zoijcleaow(this.f10545iobyxmoadg);
        } else {
            this.f10544gxszxtbevo = true;
            ((wizcaqwiak) y2.iobyxmoadg.eablkybsjg(this.f10546ppxfxbqfkf)).esjtqupxsv(hcddaimhwwVar, iobyxmoadgVarArrDxjokdxxww, oxmwwwfdhmVar, j13, z13, z14, j14, j15, zoijcleaowVar);
            gtknphoqwxVar.zoijcleaow(this.f10546ppxfxbqfkf);
        }
    }

    public long gtknphoqwx(yfnezrywwk yfnezrywwkVar) {
        wizcaqwiak wizcaqwiakVarDraadjrbmk = draadjrbmk(yfnezrywwkVar);
        Objects.requireNonNull(wizcaqwiakVarDraadjrbmk);
        return wizcaqwiakVarDraadjrbmk.wypolnanlu();
    }

    public void gxszxtbevo() {
        if (esjtqupxsv(this.f10545iobyxmoadg)) {
            this.f10545iobyxmoadg.nufgyqmvbu();
            return;
        }
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar == null || !esjtqupxsv(wizcaqwiakVar)) {
            return;
        }
        this.f10546ppxfxbqfkf.nufgyqmvbu();
    }

    public void hkdspvbjdz(yfnezrywwk yfnezrywwkVar, long j13) {
        wizcaqwiak wizcaqwiakVarDraadjrbmk = draadjrbmk(yfnezrywwkVar);
        if (wizcaqwiakVarDraadjrbmk != null) {
            wizcaqwiakVarDraadjrbmk.stevsuqkhv(j13);
        }
    }

    public boolean iobyxmoadg(yfnezrywwk yfnezrywwkVar) {
        wizcaqwiak wizcaqwiakVarDraadjrbmk = draadjrbmk(yfnezrywwkVar);
        return wizcaqwiakVarDraadjrbmk == null || wizcaqwiakVarDraadjrbmk.wflxmlrfwp() || wizcaqwiakVarDraadjrbmk.ppxfxbqfkf() || wizcaqwiakVarDraadjrbmk.wkgbmnqykc();
    }

    public void iozdgvuglv(o3.yadqdtsiqt yadqdtsiqtVar, o3.yadqdtsiqt yadqdtsiqtVar2, long j13) {
        int i13;
        boolean zPpxfxbqfkf = yadqdtsiqtVar.ppxfxbqfkf(this.f10548zoijcleaow);
        boolean zPpxfxbqfkf2 = yadqdtsiqtVar2.ppxfxbqfkf(this.f10548zoijcleaow);
        wizcaqwiak wizcaqwiakVar = (this.f10546ppxfxbqfkf == null || (i13 = this.f10547wkgbmnqykc) == 3 || (i13 == 0 && esjtqupxsv(this.f10545iobyxmoadg))) ? this.f10545iobyxmoadg : (wizcaqwiak) y2.iobyxmoadg.eablkybsjg(this.f10546ppxfxbqfkf);
        if (!zPpxfxbqfkf || wizcaqwiakVar.istkbnxepw()) {
            return;
        }
        boolean z13 = wflxmlrfwp() == -2;
        f3.hcddaimhww[] hcddaimhwwVarArr = yadqdtsiqtVar.f71905zoijcleaow;
        int i14 = this.f10548zoijcleaow;
        f3.hcddaimhww hcddaimhwwVar = hcddaimhwwVarArr[i14];
        f3.hcddaimhww hcddaimhwwVar2 = yadqdtsiqtVar2.f71905zoijcleaow[i14];
        if (!zPpxfxbqfkf2 || !Objects.equals(hcddaimhwwVar2, hcddaimhwwVar) || z13 || yggfygwlhe()) {
            wypolnanlu(wizcaqwiakVar, j13);
        }
    }

    public boolean iwizpuwonk(yfnezrywwk yfnezrywwkVar) {
        return draadjrbmk(yfnezrywwkVar) != null;
    }

    public void jpowsppfya() {
        if (!esjtqupxsv(this.f10545iobyxmoadg)) {
            yadqdtsiqt(true);
        }
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar == null || esjtqupxsv(wizcaqwiakVar)) {
            return;
        }
        yadqdtsiqt(false);
    }

    public boolean kcexrzcfyt() {
        return this.f10546ppxfxbqfkf != null;
    }

    public void kegysxyocb(v2.cdpycssgdh cdpycssgdhVar) {
        this.f10545iobyxmoadg.dsvhmnatus(cdpycssgdhVar);
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar != null) {
            wizcaqwiakVar.dsvhmnatus(cdpycssgdhVar);
        }
    }

    public boolean lereixgezr(int i13) {
        return (jyumaefscl() && i13 == this.f10548zoijcleaow) || (pmvmpeiblj() && i13 != this.f10548zoijcleaow);
    }

    public void lmojexxdyd(yfnezrywwk yfnezrywwkVar) {
        ((wizcaqwiak) y2.iobyxmoadg.eablkybsjg(draadjrbmk(yfnezrywwkVar))).lereixgezr();
    }

    public void mbcevpiqjq(float f13) {
        if (wflxmlrfwp() != 1) {
            return;
        }
        this.f10545iobyxmoadg.cqumvgiudr(2, Float.valueOf(f13));
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar != null) {
            wizcaqwiakVar.cqumvgiudr(2, Float.valueOf(f13));
        }
    }

    public void ntlheqmsrt() {
        if (this.f10545iobyxmoadg.getState() == 1 && this.f10547wkgbmnqykc != 4) {
            this.f10545iobyxmoadg.start();
            return;
        }
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar == null || wizcaqwiakVar.getState() != 1 || this.f10547wkgbmnqykc == 3) {
            return;
        }
        this.f10546ppxfxbqfkf.start();
    }

    public int nufgyqmvbu() {
        boolean zEsjtqupxsv = esjtqupxsv(this.f10545iobyxmoadg);
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        return (zEsjtqupxsv ? 1 : 0) + ((wizcaqwiakVar == null || !esjtqupxsv(wizcaqwiakVar)) ? 0 : 1);
    }

    public boolean ojitshcjhn(yfnezrywwk yfnezrywwkVar) {
        return rgvfuqvkyq(yfnezrywwkVar, this.f10545iobyxmoadg) && rgvfuqvkyq(yfnezrywwkVar, this.f10546ppxfxbqfkf);
    }

    public boolean oxmwwwfdhm(yfnezrywwk yfnezrywwkVar) {
        return ((wizcaqwiak) y2.iobyxmoadg.eablkybsjg(draadjrbmk(yfnezrywwkVar))).wflxmlrfwp();
    }

    public int pkzmftpjix(yfnezrywwk yfnezrywwkVar, o3.yadqdtsiqt yadqdtsiqtVar, gtknphoqwx gtknphoqwxVar) {
        int iHcddaimhww = hcddaimhww(this.f10545iobyxmoadg, yfnezrywwkVar, yadqdtsiqtVar, gtknphoqwxVar);
        return iHcddaimhww == 1 ? hcddaimhww(this.f10546ppxfxbqfkf, yfnezrywwkVar, yadqdtsiqtVar, gtknphoqwxVar) : iHcddaimhww;
    }

    public void ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        if (yggfygwlhe()) {
            int i13 = this.f10547wkgbmnqykc;
            boolean z13 = i13 == 4 || i13 == 2;
            int i14 = i13 != 4 ? 0 : 1;
            wkgbmnqykc(z13 ? this.f10545iobyxmoadg : (wizcaqwiak) y2.iobyxmoadg.eablkybsjg(this.f10546ppxfxbqfkf), gtknphoqwxVar);
            yadqdtsiqt(z13);
            this.f10547wkgbmnqykc = i14;
        }
    }

    public void sopmlzcsov() {
        if (esjtqupxsv(this.f10545iobyxmoadg)) {
            lqeggnwhkg(this.f10545iobyxmoadg);
        }
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar == null || !esjtqupxsv(wizcaqwiakVar)) {
            return;
        }
        lqeggnwhkg(this.f10546ppxfxbqfkf);
    }

    public void stevsuqkhv(float f13, float f14) {
        this.f10545iobyxmoadg.jpowsppfya(f13, f14);
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar != null) {
            wizcaqwiakVar.jpowsppfya(f13, f14);
        }
    }

    public void tzroggbefp(Object obj) {
        if (wflxmlrfwp() != 2) {
            return;
        }
        int i13 = this.f10547wkgbmnqykc;
        if (i13 == 4 || i13 == 1) {
            ((wizcaqwiak) y2.iobyxmoadg.eablkybsjg(this.f10546ppxfxbqfkf)).cqumvgiudr(1, obj);
        } else {
            this.f10545iobyxmoadg.cqumvgiudr(1, obj);
        }
    }

    public void ulzqkzuiru() {
        int i13;
        y2.iobyxmoadg.lqeggnwhkg(!yggfygwlhe());
        if (esjtqupxsv(this.f10545iobyxmoadg)) {
            i13 = 3;
        } else {
            wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
            i13 = (wizcaqwiakVar == null || !esjtqupxsv(wizcaqwiakVar)) ? 2 : 4;
        }
        this.f10547wkgbmnqykc = i13;
    }

    public int wflxmlrfwp() {
        return this.f10545iobyxmoadg.dxjokdxxww();
    }

    public void wwaezpbzkn() {
        this.f10545iobyxmoadg.release();
        this.f10543eablkybsjg = false;
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar != null) {
            wizcaqwiakVar.release();
            this.f10544gxszxtbevo = false;
        }
    }

    public boolean yggfygwlhe() {
        return jyumaefscl() || pmvmpeiblj();
    }

    public void ylkuphrtab(long j13, long j14) {
        if (esjtqupxsv(this.f10545iobyxmoadg)) {
            this.f10545iobyxmoadg.btonecajqb(j13, j14);
        }
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar == null || !esjtqupxsv(wizcaqwiakVar)) {
            return;
        }
        this.f10546ppxfxbqfkf.btonecajqb(j13, j14);
    }

    public boolean zdlpuopuiu() {
        boolean zWkgbmnqykc = esjtqupxsv(this.f10545iobyxmoadg) ? this.f10545iobyxmoadg.wkgbmnqykc() : true;
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        return (wizcaqwiakVar == null || !esjtqupxsv(wizcaqwiakVar)) ? zWkgbmnqykc : zWkgbmnqykc & this.f10546ppxfxbqfkf.wkgbmnqykc();
    }

    public void zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        wkgbmnqykc(this.f10545iobyxmoadg, gtknphoqwxVar);
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar != null) {
            boolean z13 = esjtqupxsv(wizcaqwiakVar) && this.f10547wkgbmnqykc != 3;
            wkgbmnqykc(this.f10546ppxfxbqfkf, gtknphoqwxVar);
            yadqdtsiqt(false);
            if (z13) {
                crxdokpmqz(true);
            }
        }
        this.f10547wkgbmnqykc = 0;
    }

    public void zynmafqrjb(m3.oxmwwwfdhm oxmwwwfdhmVar, gtknphoqwx gtknphoqwxVar, long j13, boolean z13) {
        istkbnxepw(this.f10545iobyxmoadg, oxmwwwfdhmVar, gtknphoqwxVar, j13, z13);
        wizcaqwiak wizcaqwiakVar = this.f10546ppxfxbqfkf;
        if (wizcaqwiakVar != null) {
            istkbnxepw(wizcaqwiakVar, oxmwwwfdhmVar, gtknphoqwxVar, j13, z13);
        }
    }
}

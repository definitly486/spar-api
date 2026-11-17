package a5;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class ylkuphrtab {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f785eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f786gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f787iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f791wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.hcddaimhww f792zoijcleaow = new y2.hcddaimhww(0);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f788lqeggnwhkg = -9223372036854775807L;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f789nufgyqmvbu = -9223372036854775807L;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f784dxjokdxxww = -9223372036854775807L;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.yadqdtsiqt f790ppxfxbqfkf = new y2.yadqdtsiqt();

    ylkuphrtab(int i13) {
        this.f787iobyxmoadg = i13;
    }

    private long dxjokdxxww(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        for (int i14 = iLqeggnwhkg - 188; i14 >= iGxszxtbevo; i14--) {
            if (hkdspvbjdz.zoijcleaow(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo, iLqeggnwhkg, i14)) {
                long jPpxfxbqfkf = hkdspvbjdz.ppxfxbqfkf(yadqdtsiqtVar, i14, i13);
                if (jPpxfxbqfkf != -9223372036854775807L) {
                    return jPpxfxbqfkf;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int gxszxtbevo(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar, int i13) {
        int iMin = (int) Math.min(this.f787iobyxmoadg, vdvldrhtssVar.getLength());
        long j13 = 0;
        if (vdvldrhtssVar.getPosition() != j13) {
            ylkuphrtabVar.f109571iobyxmoadg = j13;
            return 1;
        }
        this.f790ppxfxbqfkf.tzroggbefp(iMin);
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.ojitshcjhn(this.f790ppxfxbqfkf.eablkybsjg(), 0, iMin);
        this.f788lqeggnwhkg = lqeggnwhkg(this.f790ppxfxbqfkf, i13);
        this.f785eablkybsjg = true;
        return 0;
    }

    private int iobyxmoadg(t3.vdvldrhtss vdvldrhtssVar) {
        this.f790ppxfxbqfkf.mbcevpiqjq(stevsuqkhv.f123601gxszxtbevo);
        this.f791wkgbmnqykc = true;
        vdvldrhtssVar.gxszxtbevo();
        return 0;
    }

    private long lqeggnwhkg(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        for (int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo(); iGxszxtbevo < iLqeggnwhkg; iGxszxtbevo++) {
            if (yadqdtsiqtVar.eablkybsjg()[iGxszxtbevo] == 71) {
                long jPpxfxbqfkf = hkdspvbjdz.ppxfxbqfkf(yadqdtsiqtVar, iGxszxtbevo, i13);
                if (jPpxfxbqfkf != -9223372036854775807L) {
                    return jPpxfxbqfkf;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int nufgyqmvbu(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar, int i13) {
        long length = vdvldrhtssVar.getLength();
        int iMin = (int) Math.min(this.f787iobyxmoadg, length);
        long j13 = length - ((long) iMin);
        if (vdvldrhtssVar.getPosition() != j13) {
            ylkuphrtabVar.f109571iobyxmoadg = j13;
            return 1;
        }
        this.f790ppxfxbqfkf.tzroggbefp(iMin);
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.ojitshcjhn(this.f790ppxfxbqfkf.eablkybsjg(), 0, iMin);
        this.f789nufgyqmvbu = dxjokdxxww(this.f790ppxfxbqfkf, i13);
        this.f786gxszxtbevo = true;
        return 0;
    }

    public int eablkybsjg(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar, int i13) {
        if (i13 <= 0) {
            return iobyxmoadg(vdvldrhtssVar);
        }
        if (!this.f786gxszxtbevo) {
            return nufgyqmvbu(vdvldrhtssVar, ylkuphrtabVar, i13);
        }
        if (this.f789nufgyqmvbu == -9223372036854775807L) {
            return iobyxmoadg(vdvldrhtssVar);
        }
        if (!this.f785eablkybsjg) {
            return gxszxtbevo(vdvldrhtssVar, ylkuphrtabVar, i13);
        }
        long j13 = this.f788lqeggnwhkg;
        if (j13 == -9223372036854775807L) {
            return iobyxmoadg(vdvldrhtssVar);
        }
        this.f784dxjokdxxww = this.f792zoijcleaow.ppxfxbqfkf(this.f789nufgyqmvbu) - this.f792zoijcleaow.zoijcleaow(j13);
        return iobyxmoadg(vdvldrhtssVar);
    }

    public y2.hcddaimhww ppxfxbqfkf() {
        return this.f792zoijcleaow;
    }

    public boolean wkgbmnqykc() {
        return this.f791wkgbmnqykc;
    }

    public long zoijcleaow() {
        return this.f784dxjokdxxww;
    }
}

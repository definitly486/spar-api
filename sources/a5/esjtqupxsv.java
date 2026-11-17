package a5;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv implements jpowsppfya {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f456btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f457draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f458dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private y2.hcddaimhww f459eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f460gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f461gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wflxmlrfwp f462iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f463lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f464nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f466wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.cdpycssgdh f467zoijcleaow = new y2.cdpycssgdh(new byte[10]);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f465ppxfxbqfkf = 0;

    public esjtqupxsv(wflxmlrfwp wflxmlrfwpVar) {
        this.f462iobyxmoadg = wflxmlrfwpVar;
    }

    private boolean eablkybsjg(y2.yadqdtsiqt yadqdtsiqtVar, byte[] bArr, int i13) {
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), i13 - this.f466wkgbmnqykc);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            yadqdtsiqtVar.crxdokpmqz(iMin);
        } else {
            yadqdtsiqtVar.draadjrbmk(bArr, this.f466wkgbmnqykc, iMin);
        }
        int i14 = this.f466wkgbmnqykc + iMin;
        this.f466wkgbmnqykc = i14;
        return i14 == i13;
    }

    private boolean gxszxtbevo() {
        this.f467zoijcleaow.rgvfuqvkyq(0);
        int iNufgyqmvbu = this.f467zoijcleaow.nufgyqmvbu(24);
        if (iNufgyqmvbu != 1) {
            y2.kcexrzcfyt.nufgyqmvbu("PesReader", "Unexpected start code prefix: " + iNufgyqmvbu);
            this.f456btonecajqb = -1;
            return false;
        }
        this.f467zoijcleaow.oxmwwwfdhm(8);
        int iNufgyqmvbu2 = this.f467zoijcleaow.nufgyqmvbu(16);
        this.f467zoijcleaow.oxmwwwfdhm(5);
        this.f460gtknphoqwx = this.f467zoijcleaow.lqeggnwhkg();
        this.f467zoijcleaow.oxmwwwfdhm(2);
        this.f461gxszxtbevo = this.f467zoijcleaow.lqeggnwhkg();
        this.f463lqeggnwhkg = this.f467zoijcleaow.lqeggnwhkg();
        this.f467zoijcleaow.oxmwwwfdhm(6);
        int iNufgyqmvbu3 = this.f467zoijcleaow.nufgyqmvbu(8);
        this.f458dxjokdxxww = iNufgyqmvbu3;
        if (iNufgyqmvbu2 == 0) {
            this.f456btonecajqb = -1;
        } else {
            int i13 = (iNufgyqmvbu2 - 3) - iNufgyqmvbu3;
            this.f456btonecajqb = i13;
            if (i13 < 0) {
                y2.kcexrzcfyt.nufgyqmvbu("PesReader", "Found negative packet payload size: " + this.f456btonecajqb);
                this.f456btonecajqb = -1;
            }
        }
        return true;
    }

    private void lqeggnwhkg() {
        this.f467zoijcleaow.rgvfuqvkyq(0);
        this.f457draadjrbmk = -9223372036854775807L;
        if (this.f461gxszxtbevo) {
            this.f467zoijcleaow.oxmwwwfdhm(4);
            long jNufgyqmvbu = ((long) this.f467zoijcleaow.nufgyqmvbu(3)) << 30;
            this.f467zoijcleaow.oxmwwwfdhm(1);
            long jNufgyqmvbu2 = jNufgyqmvbu | ((long) (this.f467zoijcleaow.nufgyqmvbu(15) << 15));
            this.f467zoijcleaow.oxmwwwfdhm(1);
            long jNufgyqmvbu3 = jNufgyqmvbu2 | ((long) this.f467zoijcleaow.nufgyqmvbu(15));
            this.f467zoijcleaow.oxmwwwfdhm(1);
            if (!this.f464nufgyqmvbu && this.f463lqeggnwhkg) {
                this.f467zoijcleaow.oxmwwwfdhm(4);
                long jNufgyqmvbu4 = ((long) this.f467zoijcleaow.nufgyqmvbu(3)) << 30;
                this.f467zoijcleaow.oxmwwwfdhm(1);
                long jNufgyqmvbu5 = jNufgyqmvbu4 | ((long) (this.f467zoijcleaow.nufgyqmvbu(15) << 15));
                this.f467zoijcleaow.oxmwwwfdhm(1);
                long jNufgyqmvbu6 = jNufgyqmvbu5 | ((long) this.f467zoijcleaow.nufgyqmvbu(15));
                this.f467zoijcleaow.oxmwwwfdhm(1);
                this.f459eablkybsjg.zoijcleaow(jNufgyqmvbu6);
                this.f464nufgyqmvbu = true;
            }
            this.f457draadjrbmk = this.f459eablkybsjg.zoijcleaow(jNufgyqmvbu3);
        }
    }

    private void nufgyqmvbu(int i13) {
        this.f465ppxfxbqfkf = i13;
        this.f466wkgbmnqykc = 0;
    }

    @Override // a5.jpowsppfya
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        y2.iobyxmoadg.dxjokdxxww(this.f459eablkybsjg);
        if ((i13 & 1) != 0) {
            int i14 = this.f465ppxfxbqfkf;
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    y2.kcexrzcfyt.nufgyqmvbu("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f456btonecajqb != -1) {
                        y2.kcexrzcfyt.nufgyqmvbu("PesReader", "Unexpected start indicator: expected " + this.f456btonecajqb + " more bytes");
                    }
                    this.f462iobyxmoadg.wkgbmnqykc(yadqdtsiqtVar.lqeggnwhkg() == 0);
                }
            }
            nufgyqmvbu(1);
        }
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i15 = this.f465ppxfxbqfkf;
            if (i15 == 0) {
                yadqdtsiqtVar.crxdokpmqz(yadqdtsiqtVar.iobyxmoadg());
            } else if (i15 != 1) {
                if (i15 == 2) {
                    if (eablkybsjg(yadqdtsiqtVar, this.f467zoijcleaow.f123526iobyxmoadg, Math.min(10, this.f458dxjokdxxww)) && eablkybsjg(yadqdtsiqtVar, null, this.f458dxjokdxxww)) {
                        lqeggnwhkg();
                        i13 |= this.f460gtknphoqwx ? 4 : 0;
                        this.f462iobyxmoadg.eablkybsjg(this.f457draadjrbmk, i13);
                        nufgyqmvbu(3);
                    }
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg();
                    int i16 = this.f456btonecajqb;
                    int i17 = i16 == -1 ? 0 : iIobyxmoadg - i16;
                    if (i17 > 0) {
                        iIobyxmoadg -= i17;
                        yadqdtsiqtVar.ulzqkzuiru(yadqdtsiqtVar.gxszxtbevo() + iIobyxmoadg);
                    }
                    this.f462iobyxmoadg.iobyxmoadg(yadqdtsiqtVar);
                    int i18 = this.f456btonecajqb;
                    if (i18 != -1) {
                        int i19 = i18 - iIobyxmoadg;
                        this.f456btonecajqb = i19;
                        if (i19 == 0) {
                            this.f462iobyxmoadg.wkgbmnqykc(false);
                            nufgyqmvbu(1);
                        }
                    }
                }
            } else if (eablkybsjg(yadqdtsiqtVar, this.f467zoijcleaow.f123526iobyxmoadg, 9)) {
                nufgyqmvbu(gxszxtbevo() ? 2 : 0);
            }
        }
    }

    @Override // a5.jpowsppfya
    public void ppxfxbqfkf() {
        this.f465ppxfxbqfkf = 0;
        this.f466wkgbmnqykc = 0;
        this.f464nufgyqmvbu = false;
        this.f462iobyxmoadg.ppxfxbqfkf();
    }

    public boolean wkgbmnqykc(boolean z13) {
        return this.f465ppxfxbqfkf == 3 && this.f456btonecajqb == -1 && !(z13 && (this.f462iobyxmoadg instanceof agtfadlqog)) && (!z13 || gxszxtbevo());
    }

    @Override // a5.jpowsppfya
    public void zoijcleaow(y2.hcddaimhww hcddaimhwwVar, t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        this.f459eablkybsjg = hcddaimhwwVar;
        this.f462iobyxmoadg.gxszxtbevo(oxmwwwfdhmVar, wkgbmnqykcVar);
    }
}

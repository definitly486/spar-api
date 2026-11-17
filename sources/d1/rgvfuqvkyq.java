package d1;

/* JADX INFO: loaded from: classes.dex */
public abstract class rgvfuqvkyq implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int f26645iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    wflxmlrfwp f26648ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected c1.eablkybsjg.zoijcleaow f26649wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    c1.eablkybsjg f26650zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    lqeggnwhkg f26643eablkybsjg = new lqeggnwhkg(this);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public int f26644gxszxtbevo = 0;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    boolean f26646lqeggnwhkg = false;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public gxszxtbevo f26647nufgyqmvbu = new gxszxtbevo(this);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public gxszxtbevo f26642dxjokdxxww = new gxszxtbevo(this);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    protected zoijcleaow f26641btonecajqb = zoijcleaow.NONE;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f26651iobyxmoadg;

        static {
            int[] iArr = new int[c1.wkgbmnqykc.iobyxmoadg.values().length];
            f26651iobyxmoadg = iArr;
            try {
                iArr[c1.wkgbmnqykc.iobyxmoadg.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26651iobyxmoadg[c1.wkgbmnqykc.iobyxmoadg.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26651iobyxmoadg[c1.wkgbmnqykc.iobyxmoadg.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26651iobyxmoadg[c1.wkgbmnqykc.iobyxmoadg.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26651iobyxmoadg[c1.wkgbmnqykc.iobyxmoadg.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum zoijcleaow {
        NONE,
        START,
        END,
        CENTER
    }

    public rgvfuqvkyq(c1.eablkybsjg eablkybsjgVar) {
        this.f26650zoijcleaow = eablkybsjgVar;
    }

    private void draadjrbmk(int i13, int i14) {
        int i15 = this.f26645iobyxmoadg;
        if (i15 == 0) {
            this.f26643eablkybsjg.wkgbmnqykc(lqeggnwhkg(i14, i13));
            return;
        }
        if (i15 == 1) {
            this.f26643eablkybsjg.wkgbmnqykc(Math.min(lqeggnwhkg(this.f26643eablkybsjg.f26621wflxmlrfwp, i13), i14));
            return;
        }
        if (i15 == 2) {
            c1.eablkybsjg eablkybsjgVarHkdspvbjdz = this.f26650zoijcleaow.hkdspvbjdz();
            if (eablkybsjgVarHkdspvbjdz != null) {
                lqeggnwhkg lqeggnwhkgVar = (i13 == 0 ? eablkybsjgVarHkdspvbjdz.f18245eablkybsjg : eablkybsjgVarHkdspvbjdz.f18254gxszxtbevo).f26643eablkybsjg;
                if (lqeggnwhkgVar.f26600btonecajqb) {
                    this.f26643eablkybsjg.wkgbmnqykc(lqeggnwhkg((int) ((lqeggnwhkgVar.f26607lqeggnwhkg * (i13 == 0 ? this.f26650zoijcleaow.f18328zynmafqrjb : this.f26650zoijcleaow.f18318yadqdtsiqt)) + 0.5f), i13));
                    return;
                }
                return;
            }
            return;
        }
        if (i15 != 3) {
            return;
        }
        c1.eablkybsjg eablkybsjgVar = this.f26650zoijcleaow;
        rgvfuqvkyq rgvfuqvkyqVar = eablkybsjgVar.f18245eablkybsjg;
        c1.eablkybsjg.zoijcleaow zoijcleaowVar = rgvfuqvkyqVar.f26649wkgbmnqykc;
        c1.eablkybsjg.zoijcleaow zoijcleaowVar2 = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
        if (zoijcleaowVar == zoijcleaowVar2 && rgvfuqvkyqVar.f26645iobyxmoadg == 3) {
            agtfadlqog agtfadlqogVar = eablkybsjgVar.f18254gxszxtbevo;
            if (agtfadlqogVar.f26649wkgbmnqykc == zoijcleaowVar2 && agtfadlqogVar.f26645iobyxmoadg == 3) {
                return;
            }
        }
        if (i13 == 0) {
            rgvfuqvkyqVar = eablkybsjgVar.f18254gxszxtbevo;
        }
        if (rgvfuqvkyqVar.f26643eablkybsjg.f26600btonecajqb) {
            float fCqumvgiudr = eablkybsjgVar.cqumvgiudr();
            this.f26643eablkybsjg.wkgbmnqykc(i13 == 1 ? (int) ((rgvfuqvkyqVar.f26643eablkybsjg.f26607lqeggnwhkg / fCqumvgiudr) + 0.5f) : (int) ((fCqumvgiudr * rgvfuqvkyqVar.f26643eablkybsjg.f26607lqeggnwhkg) + 0.5f));
        }
    }

    protected void agtfadlqog(wkgbmnqykc wkgbmnqykcVar, c1.wkgbmnqykc wkgbmnqykcVar2, c1.wkgbmnqykc wkgbmnqykcVar3, int i13) {
        gxszxtbevo gxszxtbevoVarNufgyqmvbu = nufgyqmvbu(wkgbmnqykcVar2);
        gxszxtbevo gxszxtbevoVarNufgyqmvbu2 = nufgyqmvbu(wkgbmnqykcVar3);
        if (gxszxtbevoVarNufgyqmvbu.f26600btonecajqb && gxszxtbevoVarNufgyqmvbu2.f26600btonecajqb) {
            int iGxszxtbevo = gxszxtbevoVarNufgyqmvbu.f26607lqeggnwhkg + wkgbmnqykcVar2.gxszxtbevo();
            int iGxszxtbevo2 = gxszxtbevoVarNufgyqmvbu2.f26607lqeggnwhkg - wkgbmnqykcVar3.gxszxtbevo();
            int i14 = iGxszxtbevo2 - iGxszxtbevo;
            if (!this.f26643eablkybsjg.f26600btonecajqb && this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                draadjrbmk(i13, i14);
            }
            lqeggnwhkg lqeggnwhkgVar = this.f26643eablkybsjg;
            if (lqeggnwhkgVar.f26600btonecajqb) {
                if (lqeggnwhkgVar.f26607lqeggnwhkg == i14) {
                    this.f26647nufgyqmvbu.wkgbmnqykc(iGxszxtbevo);
                    this.f26642dxjokdxxww.wkgbmnqykc(iGxszxtbevo2);
                    return;
                }
                float fPmvmpeiblj = i13 == 0 ? this.f26650zoijcleaow.pmvmpeiblj() : this.f26650zoijcleaow.mbcevpiqjq();
                if (gxszxtbevoVarNufgyqmvbu == gxszxtbevoVarNufgyqmvbu2) {
                    iGxszxtbevo = gxszxtbevoVarNufgyqmvbu.f26607lqeggnwhkg;
                    iGxszxtbevo2 = gxszxtbevoVarNufgyqmvbu2.f26607lqeggnwhkg;
                    fPmvmpeiblj = 0.5f;
                }
                this.f26647nufgyqmvbu.wkgbmnqykc((int) (iGxszxtbevo + 0.5f + (((iGxszxtbevo2 - iGxszxtbevo) - this.f26643eablkybsjg.f26607lqeggnwhkg) * fPmvmpeiblj)));
                this.f26642dxjokdxxww.wkgbmnqykc(this.f26647nufgyqmvbu.f26607lqeggnwhkg + this.f26643eablkybsjg.f26607lqeggnwhkg);
            }
        }
    }

    public long btonecajqb() {
        lqeggnwhkg lqeggnwhkgVar = this.f26643eablkybsjg;
        if (lqeggnwhkgVar.f26600btonecajqb) {
            return lqeggnwhkgVar.f26607lqeggnwhkg;
        }
        return 0L;
    }

    protected final gxszxtbevo dxjokdxxww(c1.wkgbmnqykc wkgbmnqykcVar, int i13) {
        c1.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar.f18440gxszxtbevo;
        if (wkgbmnqykcVar2 == null) {
            return null;
        }
        c1.eablkybsjg eablkybsjgVar = wkgbmnqykcVar2.f18445wkgbmnqykc;
        rgvfuqvkyq rgvfuqvkyqVar = i13 == 0 ? eablkybsjgVar.f18245eablkybsjg : eablkybsjgVar.f18254gxszxtbevo;
        int i14 = iobyxmoadg.f26651iobyxmoadg[wkgbmnqykcVar2.f18439eablkybsjg.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 != 5) {
                        return null;
                    }
                }
            }
            return rgvfuqvkyqVar.f26642dxjokdxxww;
        }
        return rgvfuqvkyqVar.f26647nufgyqmvbu;
    }

    abstract void eablkybsjg();

    public boolean gtknphoqwx() {
        return this.f26646lqeggnwhkg;
    }

    abstract void gxszxtbevo();

    @Override // d1.wkgbmnqykc
    public abstract void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar);

    protected final int lqeggnwhkg(int i13, int i14) {
        int iMax;
        if (i14 == 0) {
            c1.eablkybsjg eablkybsjgVar = this.f26650zoijcleaow;
            int i15 = eablkybsjgVar.f18293pmvmpeiblj;
            iMax = Math.max(eablkybsjgVar.f18276lereixgezr, i13);
            if (i15 > 0) {
                iMax = Math.min(i15, i13);
            }
            if (iMax == i13) {
                return i13;
            }
        } else {
            c1.eablkybsjg eablkybsjgVar2 = this.f26650zoijcleaow;
            int i16 = eablkybsjgVar2.f18236cdpycssgdh;
            iMax = Math.max(eablkybsjgVar2.f18263istkbnxepw, i13);
            if (i16 > 0) {
                iMax = Math.min(i16, i13);
            }
            if (iMax == i13) {
                return i13;
            }
        }
        return iMax;
    }

    protected final gxszxtbevo nufgyqmvbu(c1.wkgbmnqykc wkgbmnqykcVar) {
        c1.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar.f18440gxszxtbevo;
        if (wkgbmnqykcVar2 == null) {
            return null;
        }
        c1.eablkybsjg eablkybsjgVar = wkgbmnqykcVar2.f18445wkgbmnqykc;
        int i13 = iobyxmoadg.f26651iobyxmoadg[wkgbmnqykcVar2.f18439eablkybsjg.ordinal()];
        if (i13 == 1) {
            return eablkybsjgVar.f18245eablkybsjg.f26647nufgyqmvbu;
        }
        if (i13 == 2) {
            return eablkybsjgVar.f18245eablkybsjg.f26642dxjokdxxww;
        }
        if (i13 == 3) {
            return eablkybsjgVar.f18254gxszxtbevo.f26647nufgyqmvbu;
        }
        if (i13 == 4) {
            return eablkybsjgVar.f18254gxszxtbevo.f26587gtknphoqwx;
        }
        if (i13 != 5) {
            return null;
        }
        return eablkybsjgVar.f18254gxszxtbevo.f26642dxjokdxxww;
    }

    protected void ojitshcjhn(wkgbmnqykc wkgbmnqykcVar) {
    }

    protected final void ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2, int i13, lqeggnwhkg lqeggnwhkgVar) {
        gxszxtbevoVar.f26601draadjrbmk.add(gxszxtbevoVar2);
        gxszxtbevoVar.f26601draadjrbmk.add(this.f26643eablkybsjg);
        gxszxtbevoVar.f26608nufgyqmvbu = i13;
        gxszxtbevoVar.f26602dxjokdxxww = lqeggnwhkgVar;
        gxszxtbevoVar2.f26604gtknphoqwx.add(gxszxtbevoVar);
        lqeggnwhkgVar.f26604gtknphoqwx.add(gxszxtbevoVar);
    }

    protected void rgvfuqvkyq(wkgbmnqykc wkgbmnqykcVar) {
    }

    abstract boolean wflxmlrfwp();

    abstract void wkgbmnqykc();

    protected final void zoijcleaow(gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2, int i13) {
        gxszxtbevoVar.f26601draadjrbmk.add(gxszxtbevoVar2);
        gxszxtbevoVar.f26605gxszxtbevo = i13;
        gxszxtbevoVar2.f26604gtknphoqwx.add(gxszxtbevoVar);
    }
}

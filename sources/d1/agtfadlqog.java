package d1;

/* JADX INFO: loaded from: classes.dex */
public class agtfadlqog extends rgvfuqvkyq {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    lqeggnwhkg f26586draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public gxszxtbevo f26587gtknphoqwx;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f26588iobyxmoadg;

        static {
            int[] iArr = new int[rgvfuqvkyq.zoijcleaow.values().length];
            f26588iobyxmoadg = iArr;
            try {
                iArr[rgvfuqvkyq.zoijcleaow.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26588iobyxmoadg[rgvfuqvkyq.zoijcleaow.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26588iobyxmoadg[rgvfuqvkyq.zoijcleaow.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public agtfadlqog(c1.eablkybsjg eablkybsjgVar) {
        super(eablkybsjgVar);
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(this);
        this.f26587gtknphoqwx = gxszxtbevoVar;
        this.f26586draadjrbmk = null;
        this.f26647nufgyqmvbu.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.TOP;
        this.f26642dxjokdxxww.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.BOTTOM;
        gxszxtbevoVar.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.BASELINE;
        this.f26644gxszxtbevo = 1;
    }

    @Override // d1.rgvfuqvkyq
    public void eablkybsjg() {
        gxszxtbevo gxszxtbevoVar = this.f26647nufgyqmvbu;
        if (gxszxtbevoVar.f26600btonecajqb) {
            this.f26650zoijcleaow.x(gxszxtbevoVar.f26607lqeggnwhkg);
        }
    }

    @Override // d1.rgvfuqvkyq
    void gxszxtbevo() {
        this.f26648ppxfxbqfkf = null;
        this.f26647nufgyqmvbu.ppxfxbqfkf();
        this.f26642dxjokdxxww.ppxfxbqfkf();
        this.f26587gtknphoqwx.ppxfxbqfkf();
        this.f26643eablkybsjg.ppxfxbqfkf();
        this.f26646lqeggnwhkg = false;
    }

    @Override // d1.rgvfuqvkyq, d1.wkgbmnqykc
    public void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        float f13;
        float fCqumvgiudr;
        float fCqumvgiudr2;
        int i13;
        int i14 = iobyxmoadg.f26588iobyxmoadg[this.f26641btonecajqb.ordinal()];
        if (i14 == 1) {
            rgvfuqvkyq(wkgbmnqykcVar);
        } else if (i14 == 2) {
            ojitshcjhn(wkgbmnqykcVar);
        } else if (i14 == 3) {
            c1.eablkybsjg eablkybsjgVar = this.f26650zoijcleaow;
            agtfadlqog(wkgbmnqykcVar, eablkybsjgVar.f18275kegysxyocb, eablkybsjgVar.f18281mbcevpiqjq, 1);
            return;
        }
        lqeggnwhkg lqeggnwhkgVar = this.f26643eablkybsjg;
        if (lqeggnwhkgVar.f26609ppxfxbqfkf && !lqeggnwhkgVar.f26600btonecajqb && this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
            c1.eablkybsjg eablkybsjgVar2 = this.f26650zoijcleaow;
            int i15 = eablkybsjgVar2.f18238cqumvgiudr;
            if (i15 == 2) {
                c1.eablkybsjg eablkybsjgVarHkdspvbjdz = eablkybsjgVar2.hkdspvbjdz();
                if (eablkybsjgVarHkdspvbjdz != null) {
                    lqeggnwhkg lqeggnwhkgVar2 = eablkybsjgVarHkdspvbjdz.f18254gxszxtbevo.f26643eablkybsjg;
                    if (lqeggnwhkgVar2.f26600btonecajqb) {
                        this.f26643eablkybsjg.wkgbmnqykc((int) ((lqeggnwhkgVar2.f26607lqeggnwhkg * this.f26650zoijcleaow.f18318yadqdtsiqt) + 0.5f));
                    }
                }
            } else if (i15 == 3 && eablkybsjgVar2.f18245eablkybsjg.f26643eablkybsjg.f26600btonecajqb) {
                int iEsjtqupxsv = eablkybsjgVar2.esjtqupxsv();
                if (iEsjtqupxsv != -1) {
                    if (iEsjtqupxsv == 0) {
                        c1.eablkybsjg eablkybsjgVar3 = this.f26650zoijcleaow;
                        fCqumvgiudr2 = eablkybsjgVar3.f18245eablkybsjg.f26643eablkybsjg.f26607lqeggnwhkg * eablkybsjgVar3.cqumvgiudr();
                        i13 = (int) (fCqumvgiudr2 + 0.5f);
                    } else if (iEsjtqupxsv != 1) {
                        i13 = 0;
                    } else {
                        c1.eablkybsjg eablkybsjgVar4 = this.f26650zoijcleaow;
                        f13 = eablkybsjgVar4.f18245eablkybsjg.f26643eablkybsjg.f26607lqeggnwhkg;
                        fCqumvgiudr = eablkybsjgVar4.cqumvgiudr();
                    }
                    this.f26643eablkybsjg.wkgbmnqykc(i13);
                } else {
                    c1.eablkybsjg eablkybsjgVar5 = this.f26650zoijcleaow;
                    f13 = eablkybsjgVar5.f18245eablkybsjg.f26643eablkybsjg.f26607lqeggnwhkg;
                    fCqumvgiudr = eablkybsjgVar5.cqumvgiudr();
                }
                fCqumvgiudr2 = f13 / fCqumvgiudr;
                i13 = (int) (fCqumvgiudr2 + 0.5f);
                this.f26643eablkybsjg.wkgbmnqykc(i13);
            }
        }
        gxszxtbevo gxszxtbevoVar = this.f26647nufgyqmvbu;
        if (gxszxtbevoVar.f26609ppxfxbqfkf) {
            gxszxtbevo gxszxtbevoVar2 = this.f26642dxjokdxxww;
            if (gxszxtbevoVar2.f26609ppxfxbqfkf) {
                if (gxszxtbevoVar.f26600btonecajqb && gxszxtbevoVar2.f26600btonecajqb && this.f26643eablkybsjg.f26600btonecajqb) {
                    return;
                }
                if (!this.f26643eablkybsjg.f26600btonecajqb && this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                    c1.eablkybsjg eablkybsjgVar6 = this.f26650zoijcleaow;
                    if (eablkybsjgVar6.f18264iwizpuwonk == 0 && !eablkybsjgVar6.sflfametgt()) {
                        gxszxtbevo gxszxtbevoVar3 = (gxszxtbevo) this.f26647nufgyqmvbu.f26601draadjrbmk.get(0);
                        gxszxtbevo gxszxtbevoVar4 = (gxszxtbevo) this.f26642dxjokdxxww.f26601draadjrbmk.get(0);
                        int i16 = gxszxtbevoVar3.f26607lqeggnwhkg;
                        gxszxtbevo gxszxtbevoVar5 = this.f26647nufgyqmvbu;
                        int i17 = i16 + gxszxtbevoVar5.f26605gxszxtbevo;
                        int i18 = gxszxtbevoVar4.f26607lqeggnwhkg + this.f26642dxjokdxxww.f26605gxszxtbevo;
                        gxszxtbevoVar5.wkgbmnqykc(i17);
                        this.f26642dxjokdxxww.wkgbmnqykc(i18);
                        this.f26643eablkybsjg.wkgbmnqykc(i18 - i17);
                        return;
                    }
                }
                if (!this.f26643eablkybsjg.f26600btonecajqb && this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && this.f26645iobyxmoadg == 1 && this.f26647nufgyqmvbu.f26601draadjrbmk.size() > 0 && this.f26642dxjokdxxww.f26601draadjrbmk.size() > 0) {
                    gxszxtbevo gxszxtbevoVar6 = (gxszxtbevo) this.f26647nufgyqmvbu.f26601draadjrbmk.get(0);
                    int i19 = (((gxszxtbevo) this.f26642dxjokdxxww.f26601draadjrbmk.get(0)).f26607lqeggnwhkg + this.f26642dxjokdxxww.f26605gxszxtbevo) - (gxszxtbevoVar6.f26607lqeggnwhkg + this.f26647nufgyqmvbu.f26605gxszxtbevo);
                    lqeggnwhkg lqeggnwhkgVar3 = this.f26643eablkybsjg;
                    int i23 = lqeggnwhkgVar3.f26621wflxmlrfwp;
                    if (i19 < i23) {
                        lqeggnwhkgVar3.wkgbmnqykc(i19);
                    } else {
                        lqeggnwhkgVar3.wkgbmnqykc(i23);
                    }
                }
                if (this.f26643eablkybsjg.f26600btonecajqb && this.f26647nufgyqmvbu.f26601draadjrbmk.size() > 0 && this.f26642dxjokdxxww.f26601draadjrbmk.size() > 0) {
                    gxszxtbevo gxszxtbevoVar7 = (gxszxtbevo) this.f26647nufgyqmvbu.f26601draadjrbmk.get(0);
                    gxszxtbevo gxszxtbevoVar8 = (gxszxtbevo) this.f26642dxjokdxxww.f26601draadjrbmk.get(0);
                    int i24 = gxszxtbevoVar7.f26607lqeggnwhkg + this.f26647nufgyqmvbu.f26605gxszxtbevo;
                    int i25 = gxszxtbevoVar8.f26607lqeggnwhkg + this.f26642dxjokdxxww.f26605gxszxtbevo;
                    float fMbcevpiqjq = this.f26650zoijcleaow.mbcevpiqjq();
                    if (gxszxtbevoVar7 == gxszxtbevoVar8) {
                        i24 = gxszxtbevoVar7.f26607lqeggnwhkg;
                        i25 = gxszxtbevoVar8.f26607lqeggnwhkg;
                        fMbcevpiqjq = 0.5f;
                    }
                    this.f26647nufgyqmvbu.wkgbmnqykc((int) (i24 + 0.5f + (((i25 - i24) - this.f26643eablkybsjg.f26607lqeggnwhkg) * fMbcevpiqjq)));
                    this.f26642dxjokdxxww.wkgbmnqykc(this.f26647nufgyqmvbu.f26607lqeggnwhkg + this.f26643eablkybsjg.f26607lqeggnwhkg);
                }
            }
        }
    }

    public String toString() {
        return "VerticalRun " + this.f26650zoijcleaow.jyumaefscl();
    }

    void vdvldrhtss() {
        this.f26646lqeggnwhkg = false;
        this.f26647nufgyqmvbu.ppxfxbqfkf();
        this.f26647nufgyqmvbu.f26600btonecajqb = false;
        this.f26642dxjokdxxww.ppxfxbqfkf();
        this.f26642dxjokdxxww.f26600btonecajqb = false;
        this.f26587gtknphoqwx.ppxfxbqfkf();
        this.f26587gtknphoqwx.f26600btonecajqb = false;
        this.f26643eablkybsjg.f26600btonecajqb = false;
    }

    @Override // d1.rgvfuqvkyq
    boolean wflxmlrfwp() {
        return this.f26649wkgbmnqykc != c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT || this.f26650zoijcleaow.f18238cqumvgiudr == 0;
    }

    @Override // d1.rgvfuqvkyq
    void wkgbmnqykc() {
        c1.eablkybsjg eablkybsjgVarHkdspvbjdz;
        c1.eablkybsjg eablkybsjgVarHkdspvbjdz2;
        c1.eablkybsjg eablkybsjgVar = this.f26650zoijcleaow;
        if (eablkybsjgVar.f18260iobyxmoadg) {
            this.f26643eablkybsjg.wkgbmnqykc(eablkybsjgVar.lereixgezr());
        }
        if (!this.f26643eablkybsjg.f26600btonecajqb) {
            this.f26649wkgbmnqykc = this.f26650zoijcleaow.ulzqkzuiru();
            if (this.f26650zoijcleaow.jhduphickx()) {
                this.f26586draadjrbmk = new d1.iobyxmoadg(this);
            }
            c1.eablkybsjg.zoijcleaow zoijcleaowVar = this.f26649wkgbmnqykc;
            if (zoijcleaowVar != c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                if (zoijcleaowVar == c1.eablkybsjg.zoijcleaow.MATCH_PARENT && (eablkybsjgVarHkdspvbjdz2 = this.f26650zoijcleaow.hkdspvbjdz()) != null && eablkybsjgVarHkdspvbjdz2.ulzqkzuiru() == c1.eablkybsjg.zoijcleaow.FIXED) {
                    int iLereixgezr = (eablkybsjgVarHkdspvbjdz2.lereixgezr() - this.f26650zoijcleaow.f18275kegysxyocb.gxszxtbevo()) - this.f26650zoijcleaow.f18281mbcevpiqjq.gxszxtbevo();
                    zoijcleaow(this.f26647nufgyqmvbu, eablkybsjgVarHkdspvbjdz2.f18254gxszxtbevo.f26647nufgyqmvbu, this.f26650zoijcleaow.f18275kegysxyocb.gxszxtbevo());
                    zoijcleaow(this.f26642dxjokdxxww, eablkybsjgVarHkdspvbjdz2.f18254gxszxtbevo.f26642dxjokdxxww, -this.f26650zoijcleaow.f18281mbcevpiqjq.gxszxtbevo());
                    this.f26643eablkybsjg.wkgbmnqykc(iLereixgezr);
                    return;
                }
                if (this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.FIXED) {
                    this.f26643eablkybsjg.wkgbmnqykc(this.f26650zoijcleaow.lereixgezr());
                }
            }
        } else if (this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_PARENT && (eablkybsjgVarHkdspvbjdz = this.f26650zoijcleaow.hkdspvbjdz()) != null && eablkybsjgVarHkdspvbjdz.ulzqkzuiru() == c1.eablkybsjg.zoijcleaow.FIXED) {
            zoijcleaow(this.f26647nufgyqmvbu, eablkybsjgVarHkdspvbjdz.f18254gxszxtbevo.f26647nufgyqmvbu, this.f26650zoijcleaow.f18275kegysxyocb.gxszxtbevo());
            zoijcleaow(this.f26642dxjokdxxww, eablkybsjgVarHkdspvbjdz.f18254gxszxtbevo.f26642dxjokdxxww, -this.f26650zoijcleaow.f18281mbcevpiqjq.gxszxtbevo());
            return;
        }
        lqeggnwhkg lqeggnwhkgVar = this.f26643eablkybsjg;
        boolean z13 = lqeggnwhkgVar.f26600btonecajqb;
        if (z13) {
            c1.eablkybsjg eablkybsjgVar2 = this.f26650zoijcleaow;
            if (eablkybsjgVar2.f18260iobyxmoadg) {
                c1.wkgbmnqykc[] wkgbmnqykcVarArr = eablkybsjgVar2.f18269jlmebxxoox;
                c1.wkgbmnqykc wkgbmnqykcVar = wkgbmnqykcVarArr[2];
                c1.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar.f18440gxszxtbevo;
                if (wkgbmnqykcVar2 != null && wkgbmnqykcVarArr[3].f18440gxszxtbevo != null) {
                    if (eablkybsjgVar2.sflfametgt()) {
                        this.f26647nufgyqmvbu.f26605gxszxtbevo = this.f26650zoijcleaow.f18269jlmebxxoox[2].gxszxtbevo();
                        this.f26642dxjokdxxww.f26605gxszxtbevo = -this.f26650zoijcleaow.f18269jlmebxxoox[3].gxszxtbevo();
                    } else {
                        gxszxtbevo gxszxtbevoVarNufgyqmvbu = nufgyqmvbu(this.f26650zoijcleaow.f18269jlmebxxoox[2]);
                        if (gxszxtbevoVarNufgyqmvbu != null) {
                            zoijcleaow(this.f26647nufgyqmvbu, gxszxtbevoVarNufgyqmvbu, this.f26650zoijcleaow.f18269jlmebxxoox[2].gxszxtbevo());
                        }
                        gxszxtbevo gxszxtbevoVarNufgyqmvbu2 = nufgyqmvbu(this.f26650zoijcleaow.f18269jlmebxxoox[3]);
                        if (gxszxtbevoVarNufgyqmvbu2 != null) {
                            zoijcleaow(this.f26642dxjokdxxww, gxszxtbevoVarNufgyqmvbu2, -this.f26650zoijcleaow.f18269jlmebxxoox[3].gxszxtbevo());
                        }
                        this.f26647nufgyqmvbu.f26611zoijcleaow = true;
                        this.f26642dxjokdxxww.f26611zoijcleaow = true;
                    }
                    if (this.f26650zoijcleaow.jhduphickx()) {
                        zoijcleaow(this.f26587gtknphoqwx, this.f26647nufgyqmvbu, this.f26650zoijcleaow.oxmwwwfdhm());
                        return;
                    }
                    return;
                }
                if (wkgbmnqykcVar2 != null) {
                    gxszxtbevo gxszxtbevoVarNufgyqmvbu3 = nufgyqmvbu(wkgbmnqykcVar);
                    if (gxszxtbevoVarNufgyqmvbu3 != null) {
                        zoijcleaow(this.f26647nufgyqmvbu, gxszxtbevoVarNufgyqmvbu3, this.f26650zoijcleaow.f18269jlmebxxoox[2].gxszxtbevo());
                        zoijcleaow(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, this.f26643eablkybsjg.f26607lqeggnwhkg);
                        if (this.f26650zoijcleaow.jhduphickx()) {
                            zoijcleaow(this.f26587gtknphoqwx, this.f26647nufgyqmvbu, this.f26650zoijcleaow.oxmwwwfdhm());
                            return;
                        }
                        return;
                    }
                    return;
                }
                c1.wkgbmnqykc wkgbmnqykcVar3 = wkgbmnqykcVarArr[3];
                if (wkgbmnqykcVar3.f18440gxszxtbevo != null) {
                    gxszxtbevo gxszxtbevoVarNufgyqmvbu4 = nufgyqmvbu(wkgbmnqykcVar3);
                    if (gxszxtbevoVarNufgyqmvbu4 != null) {
                        zoijcleaow(this.f26642dxjokdxxww, gxszxtbevoVarNufgyqmvbu4, -this.f26650zoijcleaow.f18269jlmebxxoox[3].gxszxtbevo());
                        zoijcleaow(this.f26647nufgyqmvbu, this.f26642dxjokdxxww, -this.f26643eablkybsjg.f26607lqeggnwhkg);
                    }
                    if (this.f26650zoijcleaow.jhduphickx()) {
                        zoijcleaow(this.f26587gtknphoqwx, this.f26647nufgyqmvbu, this.f26650zoijcleaow.oxmwwwfdhm());
                        return;
                    }
                    return;
                }
                c1.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVarArr[4];
                if (wkgbmnqykcVar4.f18440gxszxtbevo != null) {
                    gxszxtbevo gxszxtbevoVarNufgyqmvbu5 = nufgyqmvbu(wkgbmnqykcVar4);
                    if (gxszxtbevoVarNufgyqmvbu5 != null) {
                        zoijcleaow(this.f26587gtknphoqwx, gxszxtbevoVarNufgyqmvbu5, 0);
                        zoijcleaow(this.f26647nufgyqmvbu, this.f26587gtknphoqwx, -this.f26650zoijcleaow.oxmwwwfdhm());
                        zoijcleaow(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, this.f26643eablkybsjg.f26607lqeggnwhkg);
                        return;
                    }
                    return;
                }
                if ((eablkybsjgVar2 instanceof c1.dxjokdxxww) || eablkybsjgVar2.hkdspvbjdz() == null || this.f26650zoijcleaow.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.CENTER).f18440gxszxtbevo != null) {
                    return;
                }
                zoijcleaow(this.f26647nufgyqmvbu, this.f26650zoijcleaow.hkdspvbjdz().f18254gxszxtbevo.f26647nufgyqmvbu, this.f26650zoijcleaow.vipkmwdibw());
                zoijcleaow(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, this.f26643eablkybsjg.f26607lqeggnwhkg);
                if (this.f26650zoijcleaow.jhduphickx()) {
                    zoijcleaow(this.f26587gtknphoqwx, this.f26647nufgyqmvbu, this.f26650zoijcleaow.oxmwwwfdhm());
                    return;
                }
                return;
            }
        }
        if (z13 || this.f26649wkgbmnqykc != c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
            lqeggnwhkgVar.zoijcleaow(this);
        } else {
            c1.eablkybsjg eablkybsjgVar3 = this.f26650zoijcleaow;
            int i13 = eablkybsjgVar3.f18238cqumvgiudr;
            if (i13 == 2) {
                c1.eablkybsjg eablkybsjgVarHkdspvbjdz3 = eablkybsjgVar3.hkdspvbjdz();
                if (eablkybsjgVarHkdspvbjdz3 != null) {
                    lqeggnwhkg lqeggnwhkgVar2 = eablkybsjgVarHkdspvbjdz3.f18254gxszxtbevo.f26643eablkybsjg;
                    this.f26643eablkybsjg.f26601draadjrbmk.add(lqeggnwhkgVar2);
                    lqeggnwhkgVar2.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                    lqeggnwhkg lqeggnwhkgVar3 = this.f26643eablkybsjg;
                    lqeggnwhkgVar3.f26611zoijcleaow = true;
                    lqeggnwhkgVar3.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
                    this.f26643eablkybsjg.f26604gtknphoqwx.add(this.f26642dxjokdxxww);
                }
            } else if (i13 == 3 && !eablkybsjgVar3.sflfametgt()) {
                c1.eablkybsjg eablkybsjgVar4 = this.f26650zoijcleaow;
                if (eablkybsjgVar4.f18264iwizpuwonk != 3) {
                    lqeggnwhkg lqeggnwhkgVar4 = eablkybsjgVar4.f18245eablkybsjg.f26643eablkybsjg;
                    this.f26643eablkybsjg.f26601draadjrbmk.add(lqeggnwhkgVar4);
                    lqeggnwhkgVar4.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                    lqeggnwhkg lqeggnwhkgVar5 = this.f26643eablkybsjg;
                    lqeggnwhkgVar5.f26611zoijcleaow = true;
                    lqeggnwhkgVar5.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
                    this.f26643eablkybsjg.f26604gtknphoqwx.add(this.f26642dxjokdxxww);
                }
            }
        }
        c1.eablkybsjg eablkybsjgVar5 = this.f26650zoijcleaow;
        c1.wkgbmnqykc[] wkgbmnqykcVarArr2 = eablkybsjgVar5.f18269jlmebxxoox;
        c1.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVarArr2[2];
        c1.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar5.f18440gxszxtbevo;
        if (wkgbmnqykcVar6 != null && wkgbmnqykcVarArr2[3].f18440gxszxtbevo != null) {
            if (eablkybsjgVar5.sflfametgt()) {
                this.f26647nufgyqmvbu.f26605gxszxtbevo = this.f26650zoijcleaow.f18269jlmebxxoox[2].gxszxtbevo();
                this.f26642dxjokdxxww.f26605gxszxtbevo = -this.f26650zoijcleaow.f18269jlmebxxoox[3].gxszxtbevo();
            } else {
                gxszxtbevo gxszxtbevoVarNufgyqmvbu6 = nufgyqmvbu(this.f26650zoijcleaow.f18269jlmebxxoox[2]);
                gxszxtbevo gxszxtbevoVarNufgyqmvbu7 = nufgyqmvbu(this.f26650zoijcleaow.f18269jlmebxxoox[3]);
                if (gxszxtbevoVarNufgyqmvbu6 != null) {
                    gxszxtbevoVarNufgyqmvbu6.zoijcleaow(this);
                }
                if (gxszxtbevoVarNufgyqmvbu7 != null) {
                    gxszxtbevoVarNufgyqmvbu7.zoijcleaow(this);
                }
                this.f26641btonecajqb = rgvfuqvkyq.zoijcleaow.CENTER;
            }
            if (this.f26650zoijcleaow.jhduphickx()) {
                ppxfxbqfkf(this.f26587gtknphoqwx, this.f26647nufgyqmvbu, 1, this.f26586draadjrbmk);
            }
        } else if (wkgbmnqykcVar6 != null) {
            gxszxtbevo gxszxtbevoVarNufgyqmvbu8 = nufgyqmvbu(wkgbmnqykcVar5);
            if (gxszxtbevoVarNufgyqmvbu8 != null) {
                zoijcleaow(this.f26647nufgyqmvbu, gxszxtbevoVarNufgyqmvbu8, this.f26650zoijcleaow.f18269jlmebxxoox[2].gxszxtbevo());
                ppxfxbqfkf(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, 1, this.f26643eablkybsjg);
                if (this.f26650zoijcleaow.jhduphickx()) {
                    ppxfxbqfkf(this.f26587gtknphoqwx, this.f26647nufgyqmvbu, 1, this.f26586draadjrbmk);
                }
                c1.eablkybsjg.zoijcleaow zoijcleaowVar2 = this.f26649wkgbmnqykc;
                c1.eablkybsjg.zoijcleaow zoijcleaowVar3 = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                if (zoijcleaowVar2 == zoijcleaowVar3 && this.f26650zoijcleaow.cqumvgiudr() > 0.0f) {
                    draadjrbmk draadjrbmkVar = this.f26650zoijcleaow.f18245eablkybsjg;
                    if (draadjrbmkVar.f26649wkgbmnqykc == zoijcleaowVar3) {
                        draadjrbmkVar.f26643eablkybsjg.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                        this.f26643eablkybsjg.f26601draadjrbmk.add(this.f26650zoijcleaow.f18245eablkybsjg.f26643eablkybsjg);
                        this.f26643eablkybsjg.f26606iobyxmoadg = this;
                    }
                }
            }
        } else {
            c1.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVarArr2[3];
            if (wkgbmnqykcVar7.f18440gxszxtbevo != null) {
                gxszxtbevo gxszxtbevoVarNufgyqmvbu9 = nufgyqmvbu(wkgbmnqykcVar7);
                if (gxszxtbevoVarNufgyqmvbu9 != null) {
                    zoijcleaow(this.f26642dxjokdxxww, gxszxtbevoVarNufgyqmvbu9, -this.f26650zoijcleaow.f18269jlmebxxoox[3].gxszxtbevo());
                    ppxfxbqfkf(this.f26647nufgyqmvbu, this.f26642dxjokdxxww, -1, this.f26643eablkybsjg);
                    if (this.f26650zoijcleaow.jhduphickx()) {
                        ppxfxbqfkf(this.f26587gtknphoqwx, this.f26647nufgyqmvbu, 1, this.f26586draadjrbmk);
                    }
                }
            } else {
                c1.wkgbmnqykc wkgbmnqykcVar8 = wkgbmnqykcVarArr2[4];
                if (wkgbmnqykcVar8.f18440gxszxtbevo != null) {
                    gxszxtbevo gxszxtbevoVarNufgyqmvbu10 = nufgyqmvbu(wkgbmnqykcVar8);
                    if (gxszxtbevoVarNufgyqmvbu10 != null) {
                        zoijcleaow(this.f26587gtknphoqwx, gxszxtbevoVarNufgyqmvbu10, 0);
                        ppxfxbqfkf(this.f26647nufgyqmvbu, this.f26587gtknphoqwx, -1, this.f26586draadjrbmk);
                        ppxfxbqfkf(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, 1, this.f26643eablkybsjg);
                    }
                } else if (!(eablkybsjgVar5 instanceof c1.dxjokdxxww) && eablkybsjgVar5.hkdspvbjdz() != null) {
                    zoijcleaow(this.f26647nufgyqmvbu, this.f26650zoijcleaow.hkdspvbjdz().f18254gxszxtbevo.f26647nufgyqmvbu, this.f26650zoijcleaow.vipkmwdibw());
                    ppxfxbqfkf(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, 1, this.f26643eablkybsjg);
                    if (this.f26650zoijcleaow.jhduphickx()) {
                        ppxfxbqfkf(this.f26587gtknphoqwx, this.f26647nufgyqmvbu, 1, this.f26586draadjrbmk);
                    }
                    c1.eablkybsjg.zoijcleaow zoijcleaowVar4 = this.f26649wkgbmnqykc;
                    c1.eablkybsjg.zoijcleaow zoijcleaowVar5 = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                    if (zoijcleaowVar4 == zoijcleaowVar5 && this.f26650zoijcleaow.cqumvgiudr() > 0.0f) {
                        draadjrbmk draadjrbmkVar2 = this.f26650zoijcleaow.f18245eablkybsjg;
                        if (draadjrbmkVar2.f26649wkgbmnqykc == zoijcleaowVar5) {
                            draadjrbmkVar2.f26643eablkybsjg.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                            this.f26643eablkybsjg.f26601draadjrbmk.add(this.f26650zoijcleaow.f18245eablkybsjg.f26643eablkybsjg);
                            this.f26643eablkybsjg.f26606iobyxmoadg = this;
                        }
                    }
                }
            }
        }
        if (this.f26643eablkybsjg.f26601draadjrbmk.size() == 0) {
            this.f26643eablkybsjg.f26609ppxfxbqfkf = true;
        }
    }
}

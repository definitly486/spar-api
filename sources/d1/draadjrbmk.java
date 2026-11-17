package d1;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk extends rgvfuqvkyq {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static int[] f26589gtknphoqwx = new int[2];

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f26590iobyxmoadg;

        static {
            int[] iArr = new int[rgvfuqvkyq.zoijcleaow.values().length];
            f26590iobyxmoadg = iArr;
            try {
                iArr[rgvfuqvkyq.zoijcleaow.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26590iobyxmoadg[rgvfuqvkyq.zoijcleaow.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26590iobyxmoadg[rgvfuqvkyq.zoijcleaow.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public draadjrbmk(c1.eablkybsjg eablkybsjgVar) {
        super(eablkybsjgVar);
        this.f26647nufgyqmvbu.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.LEFT;
        this.f26642dxjokdxxww.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.RIGHT;
        this.f26644gxszxtbevo = 0;
    }

    private void vdvldrhtss(int[] iArr, int i13, int i14, int i15, int i16, float f13, int i17) {
        int i18 = i14 - i13;
        int i19 = i16 - i15;
        if (i17 != -1) {
            if (i17 == 0) {
                iArr[0] = (int) ((i19 * f13) + 0.5f);
                iArr[1] = i19;
                return;
            } else {
                if (i17 != 1) {
                    return;
                }
                iArr[0] = i18;
                iArr[1] = (int) ((i18 * f13) + 0.5f);
                return;
            }
        }
        int i23 = (int) ((i19 * f13) + 0.5f);
        int i24 = (int) ((i18 / f13) + 0.5f);
        if (i23 <= i18) {
            iArr[0] = i23;
            iArr[1] = i19;
        } else if (i24 <= i19) {
            iArr[0] = i18;
            iArr[1] = i24;
        }
    }

    @Override // d1.rgvfuqvkyq
    public void eablkybsjg() {
        gxszxtbevo gxszxtbevoVar = this.f26647nufgyqmvbu;
        if (gxszxtbevoVar.f26600btonecajqb) {
            this.f26650zoijcleaow.w(gxszxtbevoVar.f26607lqeggnwhkg);
        }
    }

    @Override // d1.rgvfuqvkyq
    void gxszxtbevo() {
        this.f26648ppxfxbqfkf = null;
        this.f26647nufgyqmvbu.ppxfxbqfkf();
        this.f26642dxjokdxxww.ppxfxbqfkf();
        this.f26643eablkybsjg.ppxfxbqfkf();
        this.f26646lqeggnwhkg = false;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02df  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ee  */
    @Override // d1.rgvfuqvkyq, d1.wkgbmnqykc
    public void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        int iLqeggnwhkg;
        int i13;
        int iLqeggnwhkg2;
        float f13;
        float fCqumvgiudr;
        float fCqumvgiudr2;
        int i14;
        int i15 = iobyxmoadg.f26590iobyxmoadg[this.f26641btonecajqb.ordinal()];
        if (i15 == 1) {
            rgvfuqvkyq(wkgbmnqykcVar);
        } else if (i15 == 2) {
            ojitshcjhn(wkgbmnqykcVar);
        } else if (i15 == 3) {
            c1.eablkybsjg eablkybsjgVar = this.f26650zoijcleaow;
            agtfadlqog(wkgbmnqykcVar, eablkybsjgVar.f18303stevsuqkhv, eablkybsjgVar.f18305tzroggbefp, 0);
            return;
        }
        if (!this.f26643eablkybsjg.f26600btonecajqb && this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
            c1.eablkybsjg eablkybsjgVar2 = this.f26650zoijcleaow;
            int i16 = eablkybsjgVar2.f18264iwizpuwonk;
            if (i16 == 2) {
                c1.eablkybsjg eablkybsjgVarHkdspvbjdz = eablkybsjgVar2.hkdspvbjdz();
                if (eablkybsjgVarHkdspvbjdz != null) {
                    lqeggnwhkg lqeggnwhkgVar = eablkybsjgVarHkdspvbjdz.f18245eablkybsjg.f26643eablkybsjg;
                    if (lqeggnwhkgVar.f26600btonecajqb) {
                        this.f26643eablkybsjg.wkgbmnqykc((int) ((lqeggnwhkgVar.f26607lqeggnwhkg * this.f26650zoijcleaow.f18328zynmafqrjb) + 0.5f));
                    }
                }
            } else if (i16 == 3) {
                int i17 = eablkybsjgVar2.f18238cqumvgiudr;
                if (i17 == 0 || i17 == 3) {
                    agtfadlqog agtfadlqogVar = eablkybsjgVar2.f18254gxszxtbevo;
                    gxszxtbevo gxszxtbevoVar = agtfadlqogVar.f26647nufgyqmvbu;
                    gxszxtbevo gxszxtbevoVar2 = agtfadlqogVar.f26642dxjokdxxww;
                    boolean z13 = eablkybsjgVar2.f18303stevsuqkhv.f18440gxszxtbevo != null;
                    boolean z14 = eablkybsjgVar2.f18275kegysxyocb.f18440gxszxtbevo != null;
                    boolean z15 = eablkybsjgVar2.f18305tzroggbefp.f18440gxszxtbevo != null;
                    boolean z16 = eablkybsjgVar2.f18281mbcevpiqjq.f18440gxszxtbevo != null;
                    int iEsjtqupxsv = eablkybsjgVar2.esjtqupxsv();
                    if (z13 && z14 && z15 && z16) {
                        float fCqumvgiudr3 = this.f26650zoijcleaow.cqumvgiudr();
                        if (gxszxtbevoVar.f26600btonecajqb && gxszxtbevoVar2.f26600btonecajqb) {
                            gxszxtbevo gxszxtbevoVar3 = this.f26647nufgyqmvbu;
                            if (gxszxtbevoVar3.f26609ppxfxbqfkf && this.f26642dxjokdxxww.f26609ppxfxbqfkf) {
                                vdvldrhtss(f26589gtknphoqwx, ((gxszxtbevo) gxszxtbevoVar3.f26601draadjrbmk.get(0)).f26607lqeggnwhkg + this.f26647nufgyqmvbu.f26605gxszxtbevo, ((gxszxtbevo) this.f26642dxjokdxxww.f26601draadjrbmk.get(0)).f26607lqeggnwhkg - this.f26642dxjokdxxww.f26605gxszxtbevo, gxszxtbevoVar.f26607lqeggnwhkg + gxszxtbevoVar.f26605gxszxtbevo, gxszxtbevoVar2.f26607lqeggnwhkg - gxszxtbevoVar2.f26605gxszxtbevo, fCqumvgiudr3, iEsjtqupxsv);
                                this.f26643eablkybsjg.wkgbmnqykc(f26589gtknphoqwx[0]);
                                this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.wkgbmnqykc(f26589gtknphoqwx[1]);
                                return;
                            }
                            return;
                        }
                        gxszxtbevo gxszxtbevoVar4 = this.f26647nufgyqmvbu;
                        if (gxszxtbevoVar4.f26600btonecajqb) {
                            gxszxtbevo gxszxtbevoVar5 = this.f26642dxjokdxxww;
                            if (gxszxtbevoVar5.f26600btonecajqb) {
                                if (!gxszxtbevoVar.f26609ppxfxbqfkf || !gxszxtbevoVar2.f26609ppxfxbqfkf) {
                                    return;
                                }
                                vdvldrhtss(f26589gtknphoqwx, gxszxtbevoVar4.f26607lqeggnwhkg + gxszxtbevoVar4.f26605gxszxtbevo, gxszxtbevoVar5.f26607lqeggnwhkg - gxszxtbevoVar5.f26605gxszxtbevo, ((gxszxtbevo) gxszxtbevoVar.f26601draadjrbmk.get(0)).f26607lqeggnwhkg + gxszxtbevoVar.f26605gxszxtbevo, ((gxszxtbevo) gxszxtbevoVar2.f26601draadjrbmk.get(0)).f26607lqeggnwhkg - gxszxtbevoVar2.f26605gxszxtbevo, fCqumvgiudr3, iEsjtqupxsv);
                                this.f26643eablkybsjg.wkgbmnqykc(f26589gtknphoqwx[0]);
                                this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.wkgbmnqykc(f26589gtknphoqwx[1]);
                            }
                        }
                        gxszxtbevo gxszxtbevoVar6 = this.f26647nufgyqmvbu;
                        if (!gxszxtbevoVar6.f26609ppxfxbqfkf || !this.f26642dxjokdxxww.f26609ppxfxbqfkf || !gxszxtbevoVar.f26609ppxfxbqfkf || !gxszxtbevoVar2.f26609ppxfxbqfkf) {
                            return;
                        }
                        vdvldrhtss(f26589gtknphoqwx, ((gxszxtbevo) gxszxtbevoVar6.f26601draadjrbmk.get(0)).f26607lqeggnwhkg + this.f26647nufgyqmvbu.f26605gxszxtbevo, ((gxszxtbevo) this.f26642dxjokdxxww.f26601draadjrbmk.get(0)).f26607lqeggnwhkg - this.f26642dxjokdxxww.f26605gxszxtbevo, ((gxszxtbevo) gxszxtbevoVar.f26601draadjrbmk.get(0)).f26607lqeggnwhkg + gxszxtbevoVar.f26605gxszxtbevo, ((gxszxtbevo) gxszxtbevoVar2.f26601draadjrbmk.get(0)).f26607lqeggnwhkg - gxszxtbevoVar2.f26605gxszxtbevo, fCqumvgiudr3, iEsjtqupxsv);
                        this.f26643eablkybsjg.wkgbmnqykc(f26589gtknphoqwx[0]);
                        this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.wkgbmnqykc(f26589gtknphoqwx[1]);
                    } else if (z13 && z15) {
                        if (!this.f26647nufgyqmvbu.f26609ppxfxbqfkf || !this.f26642dxjokdxxww.f26609ppxfxbqfkf) {
                            return;
                        }
                        float fCqumvgiudr4 = this.f26650zoijcleaow.cqumvgiudr();
                        int i18 = ((gxszxtbevo) this.f26647nufgyqmvbu.f26601draadjrbmk.get(0)).f26607lqeggnwhkg + this.f26647nufgyqmvbu.f26605gxszxtbevo;
                        int i19 = ((gxszxtbevo) this.f26642dxjokdxxww.f26601draadjrbmk.get(0)).f26607lqeggnwhkg - this.f26642dxjokdxxww.f26605gxszxtbevo;
                        if (iEsjtqupxsv == -1 || iEsjtqupxsv == 0) {
                            int iLqeggnwhkg3 = lqeggnwhkg(i19 - i18, 0);
                            int i23 = (int) ((iLqeggnwhkg3 * fCqumvgiudr4) + 0.5f);
                            int iLqeggnwhkg4 = lqeggnwhkg(i23, 1);
                            if (i23 != iLqeggnwhkg4) {
                                iLqeggnwhkg3 = (int) ((iLqeggnwhkg4 / fCqumvgiudr4) + 0.5f);
                            }
                            this.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg3);
                            this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg4);
                        } else if (iEsjtqupxsv == 1) {
                            int iLqeggnwhkg5 = lqeggnwhkg(i19 - i18, 0);
                            int i24 = (int) ((iLqeggnwhkg5 / fCqumvgiudr4) + 0.5f);
                            int iLqeggnwhkg6 = lqeggnwhkg(i24, 1);
                            if (i24 != iLqeggnwhkg6) {
                                iLqeggnwhkg5 = (int) ((iLqeggnwhkg6 * fCqumvgiudr4) + 0.5f);
                            }
                            this.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg5);
                            this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg6);
                        }
                    } else if (z14 && z16) {
                        if (!gxszxtbevoVar.f26609ppxfxbqfkf || !gxszxtbevoVar2.f26609ppxfxbqfkf) {
                            return;
                        }
                        float fCqumvgiudr5 = this.f26650zoijcleaow.cqumvgiudr();
                        int i25 = ((gxszxtbevo) gxszxtbevoVar.f26601draadjrbmk.get(0)).f26607lqeggnwhkg + gxszxtbevoVar.f26605gxszxtbevo;
                        int i26 = ((gxszxtbevo) gxszxtbevoVar2.f26601draadjrbmk.get(0)).f26607lqeggnwhkg - gxszxtbevoVar2.f26605gxszxtbevo;
                        if (iEsjtqupxsv == -1) {
                            iLqeggnwhkg = lqeggnwhkg(i26 - i25, 1);
                            i13 = (int) ((iLqeggnwhkg / fCqumvgiudr5) + 0.5f);
                            iLqeggnwhkg2 = lqeggnwhkg(i13, 0);
                            if (i13 != iLqeggnwhkg2) {
                                iLqeggnwhkg = (int) ((iLqeggnwhkg2 * fCqumvgiudr5) + 0.5f);
                            }
                            this.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg2);
                            this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg);
                        } else if (iEsjtqupxsv == 0) {
                            int iLqeggnwhkg7 = lqeggnwhkg(i26 - i25, 1);
                            int i27 = (int) ((iLqeggnwhkg7 * fCqumvgiudr5) + 0.5f);
                            int iLqeggnwhkg8 = lqeggnwhkg(i27, 0);
                            if (i27 != iLqeggnwhkg8) {
                                iLqeggnwhkg7 = (int) ((iLqeggnwhkg8 / fCqumvgiudr5) + 0.5f);
                            }
                            this.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg8);
                            this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg7);
                        } else if (iEsjtqupxsv == 1) {
                            iLqeggnwhkg = lqeggnwhkg(i26 - i25, 1);
                            i13 = (int) ((iLqeggnwhkg / fCqumvgiudr5) + 0.5f);
                            iLqeggnwhkg2 = lqeggnwhkg(i13, 0);
                            if (i13 != iLqeggnwhkg2) {
                                iLqeggnwhkg = (int) ((iLqeggnwhkg2 * fCqumvgiudr5) + 0.5f);
                            }
                            this.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg2);
                            this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.wkgbmnqykc(iLqeggnwhkg);
                        }
                    }
                } else {
                    int iEsjtqupxsv2 = eablkybsjgVar2.esjtqupxsv();
                    if (iEsjtqupxsv2 != -1) {
                        if (iEsjtqupxsv2 == 0) {
                            c1.eablkybsjg eablkybsjgVar3 = this.f26650zoijcleaow;
                            fCqumvgiudr2 = eablkybsjgVar3.f18254gxszxtbevo.f26643eablkybsjg.f26607lqeggnwhkg / eablkybsjgVar3.cqumvgiudr();
                            i14 = (int) (fCqumvgiudr2 + 0.5f);
                        } else if (iEsjtqupxsv2 != 1) {
                            i14 = 0;
                        } else {
                            c1.eablkybsjg eablkybsjgVar4 = this.f26650zoijcleaow;
                            f13 = eablkybsjgVar4.f18254gxszxtbevo.f26643eablkybsjg.f26607lqeggnwhkg;
                            fCqumvgiudr = eablkybsjgVar4.cqumvgiudr();
                        }
                        this.f26643eablkybsjg.wkgbmnqykc(i14);
                    } else {
                        c1.eablkybsjg eablkybsjgVar5 = this.f26650zoijcleaow;
                        f13 = eablkybsjgVar5.f18254gxszxtbevo.f26643eablkybsjg.f26607lqeggnwhkg;
                        fCqumvgiudr = eablkybsjgVar5.cqumvgiudr();
                    }
                    fCqumvgiudr2 = f13 * fCqumvgiudr;
                    i14 = (int) (fCqumvgiudr2 + 0.5f);
                    this.f26643eablkybsjg.wkgbmnqykc(i14);
                }
            }
        }
        gxszxtbevo gxszxtbevoVar7 = this.f26647nufgyqmvbu;
        if (gxszxtbevoVar7.f26609ppxfxbqfkf) {
            gxszxtbevo gxszxtbevoVar8 = this.f26642dxjokdxxww;
            if (gxszxtbevoVar8.f26609ppxfxbqfkf) {
                if (gxszxtbevoVar7.f26600btonecajqb && gxszxtbevoVar8.f26600btonecajqb && this.f26643eablkybsjg.f26600btonecajqb) {
                    return;
                }
                if (!this.f26643eablkybsjg.f26600btonecajqb && this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                    c1.eablkybsjg eablkybsjgVar6 = this.f26650zoijcleaow;
                    if (eablkybsjgVar6.f18264iwizpuwonk == 0 && !eablkybsjgVar6.yfnezrywwk()) {
                        gxszxtbevo gxszxtbevoVar9 = (gxszxtbevo) this.f26647nufgyqmvbu.f26601draadjrbmk.get(0);
                        gxszxtbevo gxszxtbevoVar10 = (gxszxtbevo) this.f26642dxjokdxxww.f26601draadjrbmk.get(0);
                        int i28 = gxszxtbevoVar9.f26607lqeggnwhkg;
                        gxszxtbevo gxszxtbevoVar11 = this.f26647nufgyqmvbu;
                        int i29 = i28 + gxszxtbevoVar11.f26605gxszxtbevo;
                        int i33 = gxszxtbevoVar10.f26607lqeggnwhkg + this.f26642dxjokdxxww.f26605gxszxtbevo;
                        gxszxtbevoVar11.wkgbmnqykc(i29);
                        this.f26642dxjokdxxww.wkgbmnqykc(i33);
                        this.f26643eablkybsjg.wkgbmnqykc(i33 - i29);
                        return;
                    }
                }
                if (!this.f26643eablkybsjg.f26600btonecajqb && this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && this.f26645iobyxmoadg == 1 && this.f26647nufgyqmvbu.f26601draadjrbmk.size() > 0 && this.f26642dxjokdxxww.f26601draadjrbmk.size() > 0) {
                    int iMin = Math.min((((gxszxtbevo) this.f26642dxjokdxxww.f26601draadjrbmk.get(0)).f26607lqeggnwhkg + this.f26642dxjokdxxww.f26605gxszxtbevo) - (((gxszxtbevo) this.f26647nufgyqmvbu.f26601draadjrbmk.get(0)).f26607lqeggnwhkg + this.f26647nufgyqmvbu.f26605gxszxtbevo), this.f26643eablkybsjg.f26621wflxmlrfwp);
                    c1.eablkybsjg eablkybsjgVar7 = this.f26650zoijcleaow;
                    int i34 = eablkybsjgVar7.f18293pmvmpeiblj;
                    int iMax = Math.max(eablkybsjgVar7.f18276lereixgezr, iMin);
                    if (i34 > 0) {
                        iMax = Math.min(i34, iMax);
                    }
                    this.f26643eablkybsjg.wkgbmnqykc(iMax);
                }
                if (this.f26643eablkybsjg.f26600btonecajqb) {
                    gxszxtbevo gxszxtbevoVar12 = (gxszxtbevo) this.f26647nufgyqmvbu.f26601draadjrbmk.get(0);
                    gxszxtbevo gxszxtbevoVar13 = (gxszxtbevo) this.f26642dxjokdxxww.f26601draadjrbmk.get(0);
                    int i35 = gxszxtbevoVar12.f26607lqeggnwhkg + this.f26647nufgyqmvbu.f26605gxszxtbevo;
                    int i36 = gxszxtbevoVar13.f26607lqeggnwhkg + this.f26642dxjokdxxww.f26605gxszxtbevo;
                    float fPmvmpeiblj = this.f26650zoijcleaow.pmvmpeiblj();
                    if (gxszxtbevoVar12 == gxszxtbevoVar13) {
                        i35 = gxszxtbevoVar12.f26607lqeggnwhkg;
                        i36 = gxszxtbevoVar13.f26607lqeggnwhkg;
                        fPmvmpeiblj = 0.5f;
                    }
                    this.f26647nufgyqmvbu.wkgbmnqykc((int) (i35 + 0.5f + (((i36 - i35) - this.f26643eablkybsjg.f26607lqeggnwhkg) * fPmvmpeiblj)));
                    this.f26642dxjokdxxww.wkgbmnqykc(this.f26647nufgyqmvbu.f26607lqeggnwhkg + this.f26643eablkybsjg.f26607lqeggnwhkg);
                }
            }
        }
    }

    void oxmwwwfdhm() {
        this.f26646lqeggnwhkg = false;
        this.f26647nufgyqmvbu.ppxfxbqfkf();
        this.f26647nufgyqmvbu.f26600btonecajqb = false;
        this.f26642dxjokdxxww.ppxfxbqfkf();
        this.f26642dxjokdxxww.f26600btonecajqb = false;
        this.f26643eablkybsjg.f26600btonecajqb = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f26650zoijcleaow.jyumaefscl();
    }

    @Override // d1.rgvfuqvkyq
    boolean wflxmlrfwp() {
        return this.f26649wkgbmnqykc != c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT || this.f26650zoijcleaow.f18264iwizpuwonk == 0;
    }

    @Override // d1.rgvfuqvkyq
    void wkgbmnqykc() {
        c1.eablkybsjg eablkybsjgVarHkdspvbjdz;
        c1.eablkybsjg eablkybsjgVarHkdspvbjdz2;
        c1.eablkybsjg eablkybsjgVar = this.f26650zoijcleaow;
        if (eablkybsjgVar.f18260iobyxmoadg) {
            this.f26643eablkybsjg.wkgbmnqykc(eablkybsjgVar.jlmebxxoox());
        }
        if (this.f26643eablkybsjg.f26600btonecajqb) {
            c1.eablkybsjg.zoijcleaow zoijcleaowVar = this.f26649wkgbmnqykc;
            c1.eablkybsjg.zoijcleaow zoijcleaowVar2 = c1.eablkybsjg.zoijcleaow.MATCH_PARENT;
            if (zoijcleaowVar == zoijcleaowVar2 && (eablkybsjgVarHkdspvbjdz = this.f26650zoijcleaow.hkdspvbjdz()) != null && (eablkybsjgVarHkdspvbjdz.istkbnxepw() == c1.eablkybsjg.zoijcleaow.FIXED || eablkybsjgVarHkdspvbjdz.istkbnxepw() == zoijcleaowVar2)) {
                zoijcleaow(this.f26647nufgyqmvbu, eablkybsjgVarHkdspvbjdz.f18245eablkybsjg.f26647nufgyqmvbu, this.f26650zoijcleaow.f18303stevsuqkhv.gxszxtbevo());
                zoijcleaow(this.f26642dxjokdxxww, eablkybsjgVarHkdspvbjdz.f18245eablkybsjg.f26642dxjokdxxww, -this.f26650zoijcleaow.f18305tzroggbefp.gxszxtbevo());
                return;
            }
        } else {
            c1.eablkybsjg.zoijcleaow zoijcleaowVarIstkbnxepw = this.f26650zoijcleaow.istkbnxepw();
            this.f26649wkgbmnqykc = zoijcleaowVarIstkbnxepw;
            if (zoijcleaowVarIstkbnxepw != c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                c1.eablkybsjg.zoijcleaow zoijcleaowVar3 = c1.eablkybsjg.zoijcleaow.MATCH_PARENT;
                if (zoijcleaowVarIstkbnxepw == zoijcleaowVar3 && (eablkybsjgVarHkdspvbjdz2 = this.f26650zoijcleaow.hkdspvbjdz()) != null && (eablkybsjgVarHkdspvbjdz2.istkbnxepw() == c1.eablkybsjg.zoijcleaow.FIXED || eablkybsjgVarHkdspvbjdz2.istkbnxepw() == zoijcleaowVar3)) {
                    int iJlmebxxoox = (eablkybsjgVarHkdspvbjdz2.jlmebxxoox() - this.f26650zoijcleaow.f18303stevsuqkhv.gxszxtbevo()) - this.f26650zoijcleaow.f18305tzroggbefp.gxszxtbevo();
                    zoijcleaow(this.f26647nufgyqmvbu, eablkybsjgVarHkdspvbjdz2.f18245eablkybsjg.f26647nufgyqmvbu, this.f26650zoijcleaow.f18303stevsuqkhv.gxszxtbevo());
                    zoijcleaow(this.f26642dxjokdxxww, eablkybsjgVarHkdspvbjdz2.f18245eablkybsjg.f26642dxjokdxxww, -this.f26650zoijcleaow.f18305tzroggbefp.gxszxtbevo());
                    this.f26643eablkybsjg.wkgbmnqykc(iJlmebxxoox);
                    return;
                }
                if (this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.FIXED) {
                    this.f26643eablkybsjg.wkgbmnqykc(this.f26650zoijcleaow.jlmebxxoox());
                }
            }
        }
        lqeggnwhkg lqeggnwhkgVar = this.f26643eablkybsjg;
        if (lqeggnwhkgVar.f26600btonecajqb) {
            c1.eablkybsjg eablkybsjgVar2 = this.f26650zoijcleaow;
            if (eablkybsjgVar2.f18260iobyxmoadg) {
                c1.wkgbmnqykc[] wkgbmnqykcVarArr = eablkybsjgVar2.f18269jlmebxxoox;
                c1.wkgbmnqykc wkgbmnqykcVar = wkgbmnqykcVarArr[0];
                c1.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar.f18440gxszxtbevo;
                if (wkgbmnqykcVar2 != null && wkgbmnqykcVarArr[1].f18440gxszxtbevo != null) {
                    if (eablkybsjgVar2.yfnezrywwk()) {
                        this.f26647nufgyqmvbu.f26605gxszxtbevo = this.f26650zoijcleaow.f18269jlmebxxoox[0].gxszxtbevo();
                        this.f26642dxjokdxxww.f26605gxszxtbevo = -this.f26650zoijcleaow.f18269jlmebxxoox[1].gxszxtbevo();
                        return;
                    }
                    gxszxtbevo gxszxtbevoVarNufgyqmvbu = nufgyqmvbu(this.f26650zoijcleaow.f18269jlmebxxoox[0]);
                    if (gxszxtbevoVarNufgyqmvbu != null) {
                        zoijcleaow(this.f26647nufgyqmvbu, gxszxtbevoVarNufgyqmvbu, this.f26650zoijcleaow.f18269jlmebxxoox[0].gxszxtbevo());
                    }
                    gxszxtbevo gxszxtbevoVarNufgyqmvbu2 = nufgyqmvbu(this.f26650zoijcleaow.f18269jlmebxxoox[1]);
                    if (gxszxtbevoVarNufgyqmvbu2 != null) {
                        zoijcleaow(this.f26642dxjokdxxww, gxszxtbevoVarNufgyqmvbu2, -this.f26650zoijcleaow.f18269jlmebxxoox[1].gxszxtbevo());
                    }
                    this.f26647nufgyqmvbu.f26611zoijcleaow = true;
                    this.f26642dxjokdxxww.f26611zoijcleaow = true;
                    return;
                }
                if (wkgbmnqykcVar2 != null) {
                    gxszxtbevo gxszxtbevoVarNufgyqmvbu3 = nufgyqmvbu(wkgbmnqykcVar);
                    if (gxszxtbevoVarNufgyqmvbu3 != null) {
                        zoijcleaow(this.f26647nufgyqmvbu, gxszxtbevoVarNufgyqmvbu3, this.f26650zoijcleaow.f18269jlmebxxoox[0].gxszxtbevo());
                        zoijcleaow(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, this.f26643eablkybsjg.f26607lqeggnwhkg);
                        return;
                    }
                    return;
                }
                c1.wkgbmnqykc wkgbmnqykcVar3 = wkgbmnqykcVarArr[1];
                if (wkgbmnqykcVar3.f18440gxszxtbevo != null) {
                    gxszxtbevo gxszxtbevoVarNufgyqmvbu4 = nufgyqmvbu(wkgbmnqykcVar3);
                    if (gxszxtbevoVarNufgyqmvbu4 != null) {
                        zoijcleaow(this.f26642dxjokdxxww, gxszxtbevoVarNufgyqmvbu4, -this.f26650zoijcleaow.f18269jlmebxxoox[1].gxszxtbevo());
                        zoijcleaow(this.f26647nufgyqmvbu, this.f26642dxjokdxxww, -this.f26643eablkybsjg.f26607lqeggnwhkg);
                        return;
                    }
                    return;
                }
                if ((eablkybsjgVar2 instanceof c1.dxjokdxxww) || eablkybsjgVar2.hkdspvbjdz() == null || this.f26650zoijcleaow.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.CENTER).f18440gxszxtbevo != null) {
                    return;
                }
                zoijcleaow(this.f26647nufgyqmvbu, this.f26650zoijcleaow.hkdspvbjdz().f18245eablkybsjg.f26647nufgyqmvbu, this.f26650zoijcleaow.ribwqtqdhb());
                zoijcleaow(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, this.f26643eablkybsjg.f26607lqeggnwhkg);
                return;
            }
        }
        if (this.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
            c1.eablkybsjg eablkybsjgVar3 = this.f26650zoijcleaow;
            int i13 = eablkybsjgVar3.f18264iwizpuwonk;
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
            } else if (i13 == 3) {
                if (eablkybsjgVar3.f18238cqumvgiudr == 3) {
                    this.f26647nufgyqmvbu.f26606iobyxmoadg = this;
                    this.f26642dxjokdxxww.f26606iobyxmoadg = this;
                    agtfadlqog agtfadlqogVar = eablkybsjgVar3.f18254gxszxtbevo;
                    agtfadlqogVar.f26647nufgyqmvbu.f26606iobyxmoadg = this;
                    agtfadlqogVar.f26642dxjokdxxww.f26606iobyxmoadg = this;
                    lqeggnwhkgVar.f26606iobyxmoadg = this;
                    if (eablkybsjgVar3.sflfametgt()) {
                        this.f26643eablkybsjg.f26601draadjrbmk.add(this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg);
                        this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                        agtfadlqog agtfadlqogVar2 = this.f26650zoijcleaow.f18254gxszxtbevo;
                        agtfadlqogVar2.f26643eablkybsjg.f26606iobyxmoadg = this;
                        this.f26643eablkybsjg.f26601draadjrbmk.add(agtfadlqogVar2.f26647nufgyqmvbu);
                        this.f26643eablkybsjg.f26601draadjrbmk.add(this.f26650zoijcleaow.f18254gxszxtbevo.f26642dxjokdxxww);
                        this.f26650zoijcleaow.f18254gxszxtbevo.f26647nufgyqmvbu.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                        this.f26650zoijcleaow.f18254gxszxtbevo.f26642dxjokdxxww.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                    } else if (this.f26650zoijcleaow.yfnezrywwk()) {
                        this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.f26601draadjrbmk.add(this.f26643eablkybsjg);
                        this.f26643eablkybsjg.f26604gtknphoqwx.add(this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg);
                    } else {
                        this.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.f26601draadjrbmk.add(this.f26643eablkybsjg);
                    }
                } else {
                    lqeggnwhkg lqeggnwhkgVar4 = eablkybsjgVar3.f18254gxszxtbevo.f26643eablkybsjg;
                    lqeggnwhkgVar.f26601draadjrbmk.add(lqeggnwhkgVar4);
                    lqeggnwhkgVar4.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                    this.f26650zoijcleaow.f18254gxszxtbevo.f26647nufgyqmvbu.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                    this.f26650zoijcleaow.f18254gxszxtbevo.f26642dxjokdxxww.f26604gtknphoqwx.add(this.f26643eablkybsjg);
                    lqeggnwhkg lqeggnwhkgVar5 = this.f26643eablkybsjg;
                    lqeggnwhkgVar5.f26611zoijcleaow = true;
                    lqeggnwhkgVar5.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
                    this.f26643eablkybsjg.f26604gtknphoqwx.add(this.f26642dxjokdxxww);
                    this.f26647nufgyqmvbu.f26601draadjrbmk.add(this.f26643eablkybsjg);
                    this.f26642dxjokdxxww.f26601draadjrbmk.add(this.f26643eablkybsjg);
                }
            }
        }
        c1.eablkybsjg eablkybsjgVar4 = this.f26650zoijcleaow;
        c1.wkgbmnqykc[] wkgbmnqykcVarArr2 = eablkybsjgVar4.f18269jlmebxxoox;
        c1.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVarArr2[0];
        c1.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar4.f18440gxszxtbevo;
        if (wkgbmnqykcVar5 != null && wkgbmnqykcVarArr2[1].f18440gxszxtbevo != null) {
            if (eablkybsjgVar4.yfnezrywwk()) {
                this.f26647nufgyqmvbu.f26605gxszxtbevo = this.f26650zoijcleaow.f18269jlmebxxoox[0].gxszxtbevo();
                this.f26642dxjokdxxww.f26605gxszxtbevo = -this.f26650zoijcleaow.f18269jlmebxxoox[1].gxszxtbevo();
                return;
            }
            gxszxtbevo gxszxtbevoVarNufgyqmvbu5 = nufgyqmvbu(this.f26650zoijcleaow.f18269jlmebxxoox[0]);
            gxszxtbevo gxszxtbevoVarNufgyqmvbu6 = nufgyqmvbu(this.f26650zoijcleaow.f18269jlmebxxoox[1]);
            if (gxszxtbevoVarNufgyqmvbu5 != null) {
                gxszxtbevoVarNufgyqmvbu5.zoijcleaow(this);
            }
            if (gxszxtbevoVarNufgyqmvbu6 != null) {
                gxszxtbevoVarNufgyqmvbu6.zoijcleaow(this);
            }
            this.f26641btonecajqb = rgvfuqvkyq.zoijcleaow.CENTER;
            return;
        }
        if (wkgbmnqykcVar5 != null) {
            gxszxtbevo gxszxtbevoVarNufgyqmvbu7 = nufgyqmvbu(wkgbmnqykcVar4);
            if (gxszxtbevoVarNufgyqmvbu7 != null) {
                zoijcleaow(this.f26647nufgyqmvbu, gxszxtbevoVarNufgyqmvbu7, this.f26650zoijcleaow.f18269jlmebxxoox[0].gxszxtbevo());
                ppxfxbqfkf(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, 1, this.f26643eablkybsjg);
                return;
            }
            return;
        }
        c1.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVarArr2[1];
        if (wkgbmnqykcVar6.f18440gxszxtbevo != null) {
            gxszxtbevo gxszxtbevoVarNufgyqmvbu8 = nufgyqmvbu(wkgbmnqykcVar6);
            if (gxszxtbevoVarNufgyqmvbu8 != null) {
                zoijcleaow(this.f26642dxjokdxxww, gxszxtbevoVarNufgyqmvbu8, -this.f26650zoijcleaow.f18269jlmebxxoox[1].gxszxtbevo());
                ppxfxbqfkf(this.f26647nufgyqmvbu, this.f26642dxjokdxxww, -1, this.f26643eablkybsjg);
                return;
            }
            return;
        }
        if ((eablkybsjgVar4 instanceof c1.dxjokdxxww) || eablkybsjgVar4.hkdspvbjdz() == null) {
            return;
        }
        zoijcleaow(this.f26647nufgyqmvbu, this.f26650zoijcleaow.hkdspvbjdz().f18245eablkybsjg.f26647nufgyqmvbu, this.f26650zoijcleaow.ribwqtqdhb());
        ppxfxbqfkf(this.f26642dxjokdxxww, this.f26647nufgyqmvbu, 1, this.f26643eablkybsjg);
    }
}

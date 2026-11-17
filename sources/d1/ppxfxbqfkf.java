package d1;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf extends rgvfuqvkyq {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f26639draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    ArrayList f26640gtknphoqwx;

    public ppxfxbqfkf(c1.eablkybsjg eablkybsjgVar, int i13) {
        super(eablkybsjgVar);
        this.f26640gtknphoqwx = new ArrayList();
        this.f26644gxszxtbevo = i13;
        vdvldrhtss();
    }

    private c1.eablkybsjg kcexrzcfyt() {
        for (int size = this.f26640gtknphoqwx.size() - 1; size >= 0; size--) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) this.f26640gtknphoqwx.get(size);
            if (rgvfuqvkyqVar.f26650zoijcleaow.crxdokpmqz() != 8) {
                return rgvfuqvkyqVar.f26650zoijcleaow;
            }
        }
        return null;
    }

    private c1.eablkybsjg oxmwwwfdhm() {
        for (int i13 = 0; i13 < this.f26640gtknphoqwx.size(); i13++) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) this.f26640gtknphoqwx.get(i13);
            if (rgvfuqvkyqVar.f26650zoijcleaow.crxdokpmqz() != 8) {
                return rgvfuqvkyqVar.f26650zoijcleaow;
            }
        }
        return null;
    }

    private void vdvldrhtss() {
        c1.eablkybsjg eablkybsjgVar;
        c1.eablkybsjg eablkybsjgVar2 = this.f26650zoijcleaow;
        c1.eablkybsjg eablkybsjgVarCllcsxoeiz = eablkybsjgVar2.cllcsxoeiz(this.f26644gxszxtbevo);
        while (true) {
            c1.eablkybsjg eablkybsjgVar3 = eablkybsjgVarCllcsxoeiz;
            eablkybsjgVar = eablkybsjgVar2;
            eablkybsjgVar2 = eablkybsjgVar3;
            if (eablkybsjgVar2 == null) {
                break;
            } else {
                eablkybsjgVarCllcsxoeiz = eablkybsjgVar2.cllcsxoeiz(this.f26644gxszxtbevo);
            }
        }
        this.f26650zoijcleaow = eablkybsjgVar;
        this.f26640gtknphoqwx.add(eablkybsjgVar.wypolnanlu(this.f26644gxszxtbevo));
        c1.eablkybsjg eablkybsjgVarJpowsppfya = eablkybsjgVar.jpowsppfya(this.f26644gxszxtbevo);
        while (eablkybsjgVarJpowsppfya != null) {
            this.f26640gtknphoqwx.add(eablkybsjgVarJpowsppfya.wypolnanlu(this.f26644gxszxtbevo));
            eablkybsjgVarJpowsppfya = eablkybsjgVarJpowsppfya.jpowsppfya(this.f26644gxszxtbevo);
        }
        for (rgvfuqvkyq rgvfuqvkyqVar : this.f26640gtknphoqwx) {
            int i13 = this.f26644gxszxtbevo;
            if (i13 == 0) {
                rgvfuqvkyqVar.f26650zoijcleaow.f18294ppxfxbqfkf = this;
            } else if (i13 == 1) {
                rgvfuqvkyqVar.f26650zoijcleaow.f18314wkgbmnqykc = this;
            }
        }
        if (this.f26644gxszxtbevo == 0 && ((c1.gxszxtbevo) this.f26650zoijcleaow.hkdspvbjdz()).a0() && this.f26640gtknphoqwx.size() > 1) {
            ArrayList arrayList = this.f26640gtknphoqwx;
            this.f26650zoijcleaow = ((rgvfuqvkyq) arrayList.get(arrayList.size() - 1)).f26650zoijcleaow;
        }
        this.f26639draadjrbmk = this.f26644gxszxtbevo == 0 ? this.f26650zoijcleaow.zynmafqrjb() : this.f26650zoijcleaow.ntlheqmsrt();
    }

    @Override // d1.rgvfuqvkyq
    public long btonecajqb() {
        int size = this.f26640gtknphoqwx.size();
        long jBtonecajqb = 0;
        for (int i13 = 0; i13 < size; i13++) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) this.f26640gtknphoqwx.get(i13);
            jBtonecajqb = jBtonecajqb + ((long) rgvfuqvkyqVar.f26647nufgyqmvbu.f26605gxszxtbevo) + rgvfuqvkyqVar.btonecajqb() + ((long) rgvfuqvkyqVar.f26642dxjokdxxww.f26605gxszxtbevo);
        }
        return jBtonecajqb;
    }

    @Override // d1.rgvfuqvkyq
    public void eablkybsjg() {
        for (int i13 = 0; i13 < this.f26640gtknphoqwx.size(); i13++) {
            ((rgvfuqvkyq) this.f26640gtknphoqwx.get(i13)).eablkybsjg();
        }
    }

    @Override // d1.rgvfuqvkyq
    void gxszxtbevo() {
        this.f26648ppxfxbqfkf = null;
        Iterator it = this.f26640gtknphoqwx.iterator();
        while (it.hasNext()) {
            ((rgvfuqvkyq) it.next()).gxszxtbevo();
        }
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00f4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    @Override // d1.rgvfuqvkyq, d1.wkgbmnqykc
    public void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f13;
        boolean z13;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        float f14;
        if (this.f26647nufgyqmvbu.f26600btonecajqb && this.f26642dxjokdxxww.f26600btonecajqb) {
            c1.eablkybsjg eablkybsjgVarHkdspvbjdz = this.f26650zoijcleaow.hkdspvbjdz();
            boolean zA0 = eablkybsjgVarHkdspvbjdz instanceof c1.gxszxtbevo ? ((c1.gxszxtbevo) eablkybsjgVarHkdspvbjdz).a0() : false;
            int i29 = this.f26642dxjokdxxww.f26607lqeggnwhkg - this.f26647nufgyqmvbu.f26607lqeggnwhkg;
            int size = this.f26640gtknphoqwx.size();
            int i33 = 0;
            while (true) {
                i13 = -1;
                i14 = 8;
                if (i33 >= size) {
                    i33 = -1;
                    break;
                } else if (((rgvfuqvkyq) this.f26640gtknphoqwx.get(i33)).f26650zoijcleaow.crxdokpmqz() != 8) {
                    break;
                } else {
                    i33++;
                }
            }
            int i34 = size - 1;
            for (int i35 = i34; i35 >= 0; i35--) {
                if (((rgvfuqvkyq) this.f26640gtknphoqwx.get(i35)).f26650zoijcleaow.crxdokpmqz() != 8) {
                    i13 = i35;
                    break;
                }
            }
            int i36 = 0;
            while (true) {
                if (i36 >= 2) {
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                    f13 = 0.0f;
                    break;
                }
                int i37 = 0;
                i16 = 0;
                i17 = 0;
                int i38 = 0;
                f13 = 0.0f;
                while (i37 < size) {
                    rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) this.f26640gtknphoqwx.get(i37);
                    if (rgvfuqvkyqVar.f26650zoijcleaow.crxdokpmqz() != i14) {
                        i38++;
                        if (i37 > 0 && i37 >= i33) {
                            i16 += rgvfuqvkyqVar.f26647nufgyqmvbu.f26605gxszxtbevo;
                        }
                        lqeggnwhkg lqeggnwhkgVar = rgvfuqvkyqVar.f26643eablkybsjg;
                        int i39 = lqeggnwhkgVar.f26607lqeggnwhkg;
                        boolean z14 = rgvfuqvkyqVar.f26649wkgbmnqykc != c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                        if (z14) {
                            int i43 = this.f26644gxszxtbevo;
                            if (i43 == 0 && !rgvfuqvkyqVar.f26650zoijcleaow.f18245eablkybsjg.f26643eablkybsjg.f26600btonecajqb) {
                                return;
                            }
                            if (i43 == 1 && !rgvfuqvkyqVar.f26650zoijcleaow.f18254gxszxtbevo.f26643eablkybsjg.f26600btonecajqb) {
                                return;
                            } else {
                                i27 = i39;
                            }
                        } else {
                            i27 = i39;
                            if (rgvfuqvkyqVar.f26645iobyxmoadg == 1 && i36 == 0) {
                                i28 = lqeggnwhkgVar.f26621wflxmlrfwp;
                                i17++;
                            } else {
                                if (lqeggnwhkgVar.f26600btonecajqb) {
                                    i28 = i27;
                                }
                                if (z14) {
                                    i16 += i28;
                                } else {
                                    i17++;
                                    f14 = rgvfuqvkyqVar.f26650zoijcleaow.f18266ixidwrxhsl[this.f26644gxszxtbevo];
                                    if (f14 >= 0.0f) {
                                        f13 += f14;
                                    }
                                }
                                if (i37 >= i34 && i37 < i13) {
                                    i16 += -rgvfuqvkyqVar.f26642dxjokdxxww.f26605gxszxtbevo;
                                }
                            }
                            z14 = true;
                            if (z14) {
                                i17++;
                                f14 = rgvfuqvkyqVar.f26650zoijcleaow.f18266ixidwrxhsl[this.f26644gxszxtbevo];
                                if (f14 >= 0.0f) {
                                    f13 += f14;
                                }
                            } else {
                                i16 += i28;
                            }
                            if (i37 >= i34) {
                            }
                        }
                        i28 = i27;
                        if (z14) {
                            i17++;
                            f14 = rgvfuqvkyqVar.f26650zoijcleaow.f18266ixidwrxhsl[this.f26644gxszxtbevo];
                            if (f14 >= 0.0f) {
                                f13 += f14;
                            }
                        } else {
                            i16 += i28;
                        }
                        if (i37 >= i34) {
                        }
                    }
                    i37++;
                    i14 = 8;
                }
                if (i16 < i29 || i17 == 0) {
                    i15 = i38;
                    break;
                } else {
                    i36++;
                    i14 = 8;
                }
            }
            int i44 = this.f26647nufgyqmvbu.f26607lqeggnwhkg;
            if (zA0) {
                i44 = this.f26642dxjokdxxww.f26607lqeggnwhkg;
            }
            if (i16 > i29) {
                i44 = zA0 ? i44 + ((int) (((i16 - i29) / 2.0f) + 0.5f)) : i44 - ((int) (((i16 - i29) / 2.0f) + 0.5f));
            }
            if (i17 > 0) {
                float f15 = i29 - i16;
                int i45 = (int) ((f15 / i17) + 0.5f);
                int i46 = 0;
                int i47 = 0;
                while (i46 < size) {
                    rgvfuqvkyq rgvfuqvkyqVar2 = (rgvfuqvkyq) this.f26640gtknphoqwx.get(i46);
                    int i48 = i45;
                    int i49 = i16;
                    if (rgvfuqvkyqVar2.f26650zoijcleaow.crxdokpmqz() != 8 && rgvfuqvkyqVar2.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) {
                        lqeggnwhkg lqeggnwhkgVar2 = rgvfuqvkyqVar2.f26643eablkybsjg;
                        if (lqeggnwhkgVar2.f26600btonecajqb) {
                            zA0 = zA0;
                            i44 = i44;
                            f15 = f15;
                        } else {
                            int i53 = f13 > 0.0f ? (int) (((rgvfuqvkyqVar2.f26650zoijcleaow.f18266ixidwrxhsl[this.f26644gxszxtbevo] * f15) / f13) + 0.5f) : i48;
                            if (this.f26644gxszxtbevo == 0) {
                                c1.eablkybsjg eablkybsjgVar = rgvfuqvkyqVar2.f26650zoijcleaow;
                                i26 = eablkybsjgVar.f18293pmvmpeiblj;
                                i25 = eablkybsjgVar.f18276lereixgezr;
                            } else {
                                c1.eablkybsjg eablkybsjgVar2 = rgvfuqvkyqVar2.f26650zoijcleaow;
                                int i54 = eablkybsjgVar2.f18236cdpycssgdh;
                                i25 = eablkybsjgVar2.f18263istkbnxepw;
                                i26 = i54;
                            }
                            int iMax = Math.max(i25, rgvfuqvkyqVar2.f26645iobyxmoadg == 1 ? Math.min(i53, lqeggnwhkgVar2.f26621wflxmlrfwp) : i53);
                            if (i26 > 0) {
                                iMax = Math.min(i26, iMax);
                            }
                            if (iMax != i53) {
                                i47++;
                                i53 = iMax;
                            }
                            rgvfuqvkyqVar2.f26643eablkybsjg.wkgbmnqykc(i53);
                        }
                    } else {
                        zA0 = zA0;
                        i44 = i44;
                        f15 = f15;
                    }
                    i46++;
                    i45 = i48;
                    i16 = i49;
                    i44 = i44;
                    f15 = f15;
                    zA0 = zA0;
                    i15 = i15;
                }
                z13 = zA0;
                i18 = i15;
                i19 = i44;
                int i55 = i16;
                if (i47 > 0) {
                    i17 -= i47;
                    i16 = 0;
                    for (int i56 = 0; i56 < size; i56++) {
                        rgvfuqvkyq rgvfuqvkyqVar3 = (rgvfuqvkyq) this.f26640gtknphoqwx.get(i56);
                        if (rgvfuqvkyqVar3.f26650zoijcleaow.crxdokpmqz() != 8) {
                            if (i56 > 0 && i56 >= i33) {
                                i16 += rgvfuqvkyqVar3.f26647nufgyqmvbu.f26605gxszxtbevo;
                            }
                            i16 += rgvfuqvkyqVar3.f26643eablkybsjg.f26607lqeggnwhkg;
                            if (i56 < i34 && i56 < i13) {
                                i16 += -rgvfuqvkyqVar3.f26642dxjokdxxww.f26605gxszxtbevo;
                            }
                        }
                    }
                } else {
                    i16 = i55;
                }
                i24 = 2;
                if (this.f26639draadjrbmk == 2 && i47 == 0) {
                    i23 = 0;
                    this.f26639draadjrbmk = 0;
                } else {
                    i23 = 0;
                }
            } else {
                z13 = zA0;
                i18 = i15;
                i19 = i44;
                i23 = 0;
                i24 = 2;
            }
            if (i16 > i29) {
                this.f26639draadjrbmk = i24;
            }
            if (i18 > 0 && i17 == 0 && i33 == i13) {
                this.f26639draadjrbmk = i24;
            }
            int i57 = this.f26639draadjrbmk;
            if (i57 == 1) {
                int i58 = i18;
                int i59 = i58 > 1 ? (i29 - i16) / (i58 - 1) : i58 == 1 ? (i29 - i16) / 2 : i23;
                if (i17 > 0) {
                    i59 = i23;
                }
                int i63 = i19;
                for (int i64 = i23; i64 < size; i64++) {
                    rgvfuqvkyq rgvfuqvkyqVar4 = (rgvfuqvkyq) this.f26640gtknphoqwx.get(z13 ? size - (i64 + 1) : i64);
                    if (rgvfuqvkyqVar4.f26650zoijcleaow.crxdokpmqz() == 8) {
                        rgvfuqvkyqVar4.f26647nufgyqmvbu.wkgbmnqykc(i63);
                        rgvfuqvkyqVar4.f26642dxjokdxxww.wkgbmnqykc(i63);
                    } else {
                        if (i64 > 0) {
                            i63 = z13 ? i63 - i59 : i63 + i59;
                        }
                        if (i64 > 0 && i64 >= i33) {
                            i63 = z13 ? i63 - rgvfuqvkyqVar4.f26647nufgyqmvbu.f26605gxszxtbevo : i63 + rgvfuqvkyqVar4.f26647nufgyqmvbu.f26605gxszxtbevo;
                        }
                        if (z13) {
                            rgvfuqvkyqVar4.f26642dxjokdxxww.wkgbmnqykc(i63);
                        } else {
                            rgvfuqvkyqVar4.f26647nufgyqmvbu.wkgbmnqykc(i63);
                        }
                        lqeggnwhkg lqeggnwhkgVar3 = rgvfuqvkyqVar4.f26643eablkybsjg;
                        int i65 = lqeggnwhkgVar3.f26607lqeggnwhkg;
                        if (rgvfuqvkyqVar4.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && rgvfuqvkyqVar4.f26645iobyxmoadg == 1) {
                            i65 = lqeggnwhkgVar3.f26621wflxmlrfwp;
                        }
                        i63 = z13 ? i63 - i65 : i63 + i65;
                        if (z13) {
                            rgvfuqvkyqVar4.f26647nufgyqmvbu.wkgbmnqykc(i63);
                        } else {
                            rgvfuqvkyqVar4.f26642dxjokdxxww.wkgbmnqykc(i63);
                        }
                        rgvfuqvkyqVar4.f26646lqeggnwhkg = true;
                        if (i64 < i34 && i64 < i13) {
                            i63 = z13 ? i63 - (-rgvfuqvkyqVar4.f26642dxjokdxxww.f26605gxszxtbevo) : i63 + (-rgvfuqvkyqVar4.f26642dxjokdxxww.f26605gxszxtbevo);
                        }
                    }
                }
                return;
            }
            int i66 = i18;
            if (i57 == 0) {
                int i67 = (i29 - i16) / (i66 + 1);
                if (i17 > 0) {
                    i67 = i23;
                }
                int i68 = i19;
                for (int i69 = i23; i69 < size; i69++) {
                    rgvfuqvkyq rgvfuqvkyqVar5 = (rgvfuqvkyq) this.f26640gtknphoqwx.get(z13 ? size - (i69 + 1) : i69);
                    if (rgvfuqvkyqVar5.f26650zoijcleaow.crxdokpmqz() == 8) {
                        rgvfuqvkyqVar5.f26647nufgyqmvbu.wkgbmnqykc(i68);
                        rgvfuqvkyqVar5.f26642dxjokdxxww.wkgbmnqykc(i68);
                    } else {
                        int i73 = z13 ? i68 - i67 : i68 + i67;
                        if (i69 > 0 && i69 >= i33) {
                            i73 = z13 ? i73 - rgvfuqvkyqVar5.f26647nufgyqmvbu.f26605gxszxtbevo : i73 + rgvfuqvkyqVar5.f26647nufgyqmvbu.f26605gxszxtbevo;
                        }
                        if (z13) {
                            rgvfuqvkyqVar5.f26642dxjokdxxww.wkgbmnqykc(i73);
                        } else {
                            rgvfuqvkyqVar5.f26647nufgyqmvbu.wkgbmnqykc(i73);
                        }
                        lqeggnwhkg lqeggnwhkgVar4 = rgvfuqvkyqVar5.f26643eablkybsjg;
                        int iMin = lqeggnwhkgVar4.f26607lqeggnwhkg;
                        if (rgvfuqvkyqVar5.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && rgvfuqvkyqVar5.f26645iobyxmoadg == 1) {
                            iMin = Math.min(iMin, lqeggnwhkgVar4.f26621wflxmlrfwp);
                        }
                        i68 = z13 ? i73 - iMin : i73 + iMin;
                        if (z13) {
                            rgvfuqvkyqVar5.f26647nufgyqmvbu.wkgbmnqykc(i68);
                        } else {
                            rgvfuqvkyqVar5.f26642dxjokdxxww.wkgbmnqykc(i68);
                        }
                        if (i69 < i34 && i69 < i13) {
                            i68 = z13 ? i68 - (-rgvfuqvkyqVar5.f26642dxjokdxxww.f26605gxszxtbevo) : i68 + (-rgvfuqvkyqVar5.f26642dxjokdxxww.f26605gxszxtbevo);
                        }
                    }
                }
                return;
            }
            if (i57 == 2) {
                float fPmvmpeiblj = this.f26644gxszxtbevo == 0 ? this.f26650zoijcleaow.pmvmpeiblj() : this.f26650zoijcleaow.mbcevpiqjq();
                if (z13) {
                    fPmvmpeiblj = 1.0f - fPmvmpeiblj;
                }
                int i74 = (int) (((i29 - i16) * fPmvmpeiblj) + 0.5f);
                if (i74 < 0 || i17 > 0) {
                    i74 = i23;
                }
                int i75 = z13 ? i19 - i74 : i19 + i74;
                for (int i76 = i23; i76 < size; i76++) {
                    rgvfuqvkyq rgvfuqvkyqVar6 = (rgvfuqvkyq) this.f26640gtknphoqwx.get(z13 ? size - (i76 + 1) : i76);
                    if (rgvfuqvkyqVar6.f26650zoijcleaow.crxdokpmqz() == 8) {
                        rgvfuqvkyqVar6.f26647nufgyqmvbu.wkgbmnqykc(i75);
                        rgvfuqvkyqVar6.f26642dxjokdxxww.wkgbmnqykc(i75);
                    } else {
                        if (i76 > 0 && i76 >= i33) {
                            i75 = z13 ? i75 - rgvfuqvkyqVar6.f26647nufgyqmvbu.f26605gxszxtbevo : i75 + rgvfuqvkyqVar6.f26647nufgyqmvbu.f26605gxszxtbevo;
                        }
                        if (z13) {
                            rgvfuqvkyqVar6.f26642dxjokdxxww.wkgbmnqykc(i75);
                        } else {
                            rgvfuqvkyqVar6.f26647nufgyqmvbu.wkgbmnqykc(i75);
                        }
                        lqeggnwhkg lqeggnwhkgVar5 = rgvfuqvkyqVar6.f26643eablkybsjg;
                        int i77 = lqeggnwhkgVar5.f26607lqeggnwhkg;
                        if (rgvfuqvkyqVar6.f26649wkgbmnqykc == c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT && rgvfuqvkyqVar6.f26645iobyxmoadg == 1) {
                            i77 = lqeggnwhkgVar5.f26621wflxmlrfwp;
                        }
                        i75 = z13 ? i75 - i77 : i75 + i77;
                        if (z13) {
                            rgvfuqvkyqVar6.f26647nufgyqmvbu.wkgbmnqykc(i75);
                        } else {
                            rgvfuqvkyqVar6.f26642dxjokdxxww.wkgbmnqykc(i75);
                        }
                        if (i76 < i34 && i76 < i13) {
                            i75 = z13 ? i75 - (-rgvfuqvkyqVar6.f26642dxjokdxxww.f26605gxszxtbevo) : i75 + (-rgvfuqvkyqVar6.f26642dxjokdxxww.f26605gxszxtbevo);
                        }
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("ChainRun ");
        sb3.append(this.f26644gxszxtbevo == 0 ? "horizontal : " : "vertical : ");
        for (rgvfuqvkyq rgvfuqvkyqVar : this.f26640gtknphoqwx) {
            sb3.append("<");
            sb3.append(rgvfuqvkyqVar);
            sb3.append("> ");
        }
        return sb3.toString();
    }

    @Override // d1.rgvfuqvkyq
    boolean wflxmlrfwp() {
        int size = this.f26640gtknphoqwx.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!((rgvfuqvkyq) this.f26640gtknphoqwx.get(i13)).wflxmlrfwp()) {
                return false;
            }
        }
        return true;
    }

    @Override // d1.rgvfuqvkyq
    void wkgbmnqykc() {
        Iterator it = this.f26640gtknphoqwx.iterator();
        while (it.hasNext()) {
            ((rgvfuqvkyq) it.next()).wkgbmnqykc();
        }
        int size = this.f26640gtknphoqwx.size();
        if (size < 1) {
            return;
        }
        c1.eablkybsjg eablkybsjgVar = ((rgvfuqvkyq) this.f26640gtknphoqwx.get(0)).f26650zoijcleaow;
        c1.eablkybsjg eablkybsjgVar2 = ((rgvfuqvkyq) this.f26640gtknphoqwx.get(size - 1)).f26650zoijcleaow;
        if (this.f26644gxszxtbevo == 0) {
            c1.wkgbmnqykc wkgbmnqykcVar = eablkybsjgVar.f18303stevsuqkhv;
            c1.wkgbmnqykc wkgbmnqykcVar2 = eablkybsjgVar2.f18305tzroggbefp;
            gxszxtbevo gxszxtbevoVarDxjokdxxww = dxjokdxxww(wkgbmnqykcVar, 0);
            int iGxszxtbevo = wkgbmnqykcVar.gxszxtbevo();
            c1.eablkybsjg eablkybsjgVarOxmwwwfdhm = oxmwwwfdhm();
            if (eablkybsjgVarOxmwwwfdhm != null) {
                iGxszxtbevo = eablkybsjgVarOxmwwwfdhm.f18303stevsuqkhv.gxszxtbevo();
            }
            if (gxszxtbevoVarDxjokdxxww != null) {
                zoijcleaow(this.f26647nufgyqmvbu, gxszxtbevoVarDxjokdxxww, iGxszxtbevo);
            }
            gxszxtbevo gxszxtbevoVarDxjokdxxww2 = dxjokdxxww(wkgbmnqykcVar2, 0);
            int iGxszxtbevo2 = wkgbmnqykcVar2.gxszxtbevo();
            c1.eablkybsjg eablkybsjgVarKcexrzcfyt = kcexrzcfyt();
            if (eablkybsjgVarKcexrzcfyt != null) {
                iGxszxtbevo2 = eablkybsjgVarKcexrzcfyt.f18305tzroggbefp.gxszxtbevo();
            }
            if (gxszxtbevoVarDxjokdxxww2 != null) {
                zoijcleaow(this.f26642dxjokdxxww, gxszxtbevoVarDxjokdxxww2, -iGxszxtbevo2);
            }
        } else {
            c1.wkgbmnqykc wkgbmnqykcVar3 = eablkybsjgVar.f18275kegysxyocb;
            c1.wkgbmnqykc wkgbmnqykcVar4 = eablkybsjgVar2.f18281mbcevpiqjq;
            gxszxtbevo gxszxtbevoVarDxjokdxxww3 = dxjokdxxww(wkgbmnqykcVar3, 1);
            int iGxszxtbevo3 = wkgbmnqykcVar3.gxszxtbevo();
            c1.eablkybsjg eablkybsjgVarOxmwwwfdhm2 = oxmwwwfdhm();
            if (eablkybsjgVarOxmwwwfdhm2 != null) {
                iGxszxtbevo3 = eablkybsjgVarOxmwwwfdhm2.f18275kegysxyocb.gxszxtbevo();
            }
            if (gxszxtbevoVarDxjokdxxww3 != null) {
                zoijcleaow(this.f26647nufgyqmvbu, gxszxtbevoVarDxjokdxxww3, iGxszxtbevo3);
            }
            gxszxtbevo gxszxtbevoVarDxjokdxxww4 = dxjokdxxww(wkgbmnqykcVar4, 1);
            int iGxszxtbevo4 = wkgbmnqykcVar4.gxszxtbevo();
            c1.eablkybsjg eablkybsjgVarKcexrzcfyt2 = kcexrzcfyt();
            if (eablkybsjgVarKcexrzcfyt2 != null) {
                iGxszxtbevo4 = eablkybsjgVarKcexrzcfyt2.f18281mbcevpiqjq.gxszxtbevo();
            }
            if (gxszxtbevoVarDxjokdxxww4 != null) {
                zoijcleaow(this.f26642dxjokdxxww, gxszxtbevoVarDxjokdxxww4, -iGxszxtbevo4);
            }
        }
        this.f26647nufgyqmvbu.f26606iobyxmoadg = this;
        this.f26642dxjokdxxww.f26606iobyxmoadg = this;
    }
}

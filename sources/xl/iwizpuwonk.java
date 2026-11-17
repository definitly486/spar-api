package xl;

/* JADX INFO: loaded from: classes3.dex */
class iwizpuwonk implements zl.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final zdlpuopuiu f122696iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final gxszxtbevo.iobyxmoadg f122697ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final wl.lqeggnwhkg f122698zoijcleaow;

    static class iobyxmoadg extends zoijcleaow {
        iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
            super(zdlpuopuiuVar, lqeggnwhkgVar, iobyxmoadgVar);
        }

        @Override // xl.iwizpuwonk.zoijcleaow
        boolean rgvfuqvkyq(zdlpuopuiu zdlpuopuiuVar) {
            if (zdlpuopuiuVar == null || zdlpuopuiuVar == this.f122696iobyxmoadg || this.f122699wkgbmnqykc || zoijcleaow.draadjrbmk(zdlpuopuiuVar)) {
                return false;
            }
            if (zdlpuopuiuVar instanceof lereixgezr) {
                return (zdlpuopuiuVar.stevsuqkhv() == null && zdlpuopuiuVar.zynmafqrjb() == null) ? false : true;
            }
            return true;
        }

        @Override // xl.iwizpuwonk.zoijcleaow
        boolean wflxmlrfwp(zdlpuopuiu zdlpuopuiuVar) {
            return zdlpuopuiuVar != null;
        }
    }

    static class zoijcleaow extends iwizpuwonk {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        boolean f122699wkgbmnqykc;

        zoijcleaow(zdlpuopuiu zdlpuopuiuVar, wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
            super(zdlpuopuiuVar, lqeggnwhkgVar, iobyxmoadgVar);
            this.f122699wkgbmnqykc = false;
            while (zdlpuopuiuVar != null) {
                if (vdvldrhtss(yl.kcexrzcfyt.f125778cdpycssgdh, zdlpuopuiuVar)) {
                    this.f122699wkgbmnqykc = true;
                    return;
                }
                zdlpuopuiuVar = zdlpuopuiuVar.dsvhmnatus();
            }
        }

        static zdlpuopuiu agtfadlqog(zdlpuopuiu zdlpuopuiuVar) {
            while (draadjrbmk(zdlpuopuiuVar)) {
                zdlpuopuiuVar = zdlpuopuiuVar.zynmafqrjb();
            }
            return zdlpuopuiuVar;
        }

        static boolean btonecajqb(wflxmlrfwp wflxmlrfwpVar) {
            wflxmlrfwp wflxmlrfwpVarAuzgnhcxok = wflxmlrfwpVar.auzgnhcxok();
            for (int i13 = 0; i13 < 5 && wflxmlrfwpVarAuzgnhcxok != null; i13++) {
                if (wflxmlrfwpVarAuzgnhcxok.ageimvtcrz() || !wflxmlrfwpVarAuzgnhcxok.f122732iwizpuwonk.lqeggnwhkg()) {
                    return true;
                }
                wflxmlrfwpVarAuzgnhcxok = wflxmlrfwpVarAuzgnhcxok.pmvmpeiblj();
            }
            return false;
        }

        static boolean draadjrbmk(zdlpuopuiu zdlpuopuiuVar) {
            return (zdlpuopuiuVar instanceof lereixgezr) && ((lereixgezr) zdlpuopuiuVar).sflfametgt();
        }

        static boolean gtknphoqwx(wflxmlrfwp wflxmlrfwpVar) {
            zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = wflxmlrfwpVar.zdlpuopuiu();
            for (int i13 = 0; i13 < 5 && zdlpuopuiuVarZdlpuopuiu != null; i13++) {
                if (!(zdlpuopuiuVarZdlpuopuiu instanceof lereixgezr)) {
                    return true;
                }
                zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVarZdlpuopuiu.zynmafqrjb();
            }
            return false;
        }

        static zdlpuopuiu ojitshcjhn(zdlpuopuiu zdlpuopuiuVar) {
            zdlpuopuiu zdlpuopuiuVarStevsuqkhv = zdlpuopuiuVar.stevsuqkhv();
            while (draadjrbmk(zdlpuopuiuVarStevsuqkhv)) {
                zdlpuopuiuVarStevsuqkhv = zdlpuopuiuVarStevsuqkhv.stevsuqkhv();
            }
            return zdlpuopuiuVarStevsuqkhv;
        }

        static boolean vdvldrhtss(int i13, zdlpuopuiu zdlpuopuiuVar) {
            return (zdlpuopuiuVar instanceof wflxmlrfwp) && ((wflxmlrfwp) zdlpuopuiuVar).f122732iwizpuwonk.ppxfxbqfkf(i13);
        }

        @Override // xl.iwizpuwonk
        void eablkybsjg(kcexrzcfyt kcexrzcfytVar, int i13) {
            if (rgvfuqvkyq(kcexrzcfytVar)) {
                nufgyqmvbu(i13);
            }
            super.eablkybsjg(kcexrzcfytVar, i13);
        }

        @Override // xl.iwizpuwonk
        void gxszxtbevo(wflxmlrfwp wflxmlrfwpVar, int i13) {
            if (rgvfuqvkyq(agtfadlqog(wflxmlrfwpVar.zdlpuopuiu()))) {
                nufgyqmvbu(i13);
            }
            super.gxszxtbevo(wflxmlrfwpVar, i13);
            if (this.f122699wkgbmnqykc && wflxmlrfwpVar.f122732iwizpuwonk.ppxfxbqfkf(yl.kcexrzcfyt.f125778cdpycssgdh)) {
                do {
                    wflxmlrfwpVar = wflxmlrfwpVar.hkdspvbjdz();
                    if (wflxmlrfwpVar == null) {
                        this.f122699wkgbmnqykc = false;
                        return;
                    }
                } while (!wflxmlrfwpVar.n().wflxmlrfwp());
            }
        }

        @Override // xl.iwizpuwonk
        void lqeggnwhkg(lereixgezr lereixgezrVar, int i13, int i14) {
            if (!this.f122699wkgbmnqykc) {
                i13 = oxmwwwfdhm(lereixgezrVar, i13 | 4);
                if (!lereixgezrVar.sflfametgt() && wflxmlrfwp(lereixgezrVar.f122742zdlpuopuiu) && rgvfuqvkyq(lereixgezrVar)) {
                    nufgyqmvbu(i14);
                }
            }
            super.lqeggnwhkg(lereixgezrVar, i13, i14);
        }

        int oxmwwwfdhm(lereixgezr lereixgezrVar, int i13) {
            if (!wflxmlrfwp(lereixgezrVar.f122742zdlpuopuiu)) {
                return i13;
            }
            zdlpuopuiu zdlpuopuiuVarStevsuqkhv = lereixgezrVar.stevsuqkhv();
            zdlpuopuiu zdlpuopuiuVarZynmafqrjb = lereixgezrVar.zynmafqrjb();
            if ((!(zdlpuopuiuVarStevsuqkhv instanceof wflxmlrfwp) || wflxmlrfwp(zdlpuopuiuVarStevsuqkhv)) && (zdlpuopuiuVarStevsuqkhv == null || (!(zdlpuopuiuVarStevsuqkhv instanceof lereixgezr) && rgvfuqvkyq(zdlpuopuiuVarStevsuqkhv)))) {
                i13 |= 8;
            }
            return (zdlpuopuiuVarZynmafqrjb == null || (!(zdlpuopuiuVarZynmafqrjb instanceof lereixgezr) && rgvfuqvkyq(zdlpuopuiuVarZynmafqrjb))) ? i13 | 16 : i13;
        }

        boolean rgvfuqvkyq(zdlpuopuiu zdlpuopuiuVar) {
            if (zdlpuopuiuVar == null || zdlpuopuiuVar == this.f122696iobyxmoadg || this.f122699wkgbmnqykc || draadjrbmk(zdlpuopuiuVar)) {
                return false;
            }
            if (wflxmlrfwp(zdlpuopuiuVar)) {
                return true;
            }
            zdlpuopuiu zdlpuopuiuVarOjitshcjhn = ojitshcjhn(zdlpuopuiuVar);
            if (wflxmlrfwp(zdlpuopuiuVarOjitshcjhn)) {
                return true;
            }
            wflxmlrfwp wflxmlrfwpVar = zdlpuopuiuVar.f122742zdlpuopuiu;
            if (!wflxmlrfwp(wflxmlrfwpVar) || wflxmlrfwpVar.n().ppxfxbqfkf(yl.kcexrzcfyt.f125785pmvmpeiblj) || !gtknphoqwx(wflxmlrfwpVar)) {
                return false;
            }
            if (zdlpuopuiuVarOjitshcjhn != null) {
                if (zdlpuopuiuVarOjitshcjhn instanceof lereixgezr) {
                    return false;
                }
                if (!wflxmlrfwp(zdlpuopuiuVarOjitshcjhn) && (zdlpuopuiuVarOjitshcjhn instanceof wflxmlrfwp)) {
                    return false;
                }
            }
            return true;
        }

        boolean wflxmlrfwp(zdlpuopuiu zdlpuopuiuVar) {
            if (zdlpuopuiuVar == null || !(zdlpuopuiuVar instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) zdlpuopuiuVar;
            if (!wflxmlrfwpVar.ageimvtcrz()) {
                if (wflxmlrfwpVar.f122732iwizpuwonk.lqeggnwhkg()) {
                    return false;
                }
                if (!(wflxmlrfwpVar.f122742zdlpuopuiu instanceof gxszxtbevo) && !btonecajqb(wflxmlrfwpVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // xl.iwizpuwonk
        void wkgbmnqykc(wflxmlrfwp wflxmlrfwpVar, int i13) {
            if (rgvfuqvkyq(wflxmlrfwpVar)) {
                nufgyqmvbu(i13);
            }
            super.wkgbmnqykc(wflxmlrfwpVar, i13);
            if (vdvldrhtss(yl.kcexrzcfyt.f125778cdpycssgdh, wflxmlrfwpVar)) {
                this.f122699wkgbmnqykc = true;
            }
        }
    }

    iwizpuwonk(zdlpuopuiu zdlpuopuiuVar, wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        this.f122696iobyxmoadg = zdlpuopuiuVar;
        this.f122698zoijcleaow = lqeggnwhkgVar;
        this.f122697ppxfxbqfkf = iobyxmoadgVar;
    }

    static iwizpuwonk dxjokdxxww(zdlpuopuiu zdlpuopuiuVar, wl.lqeggnwhkg lqeggnwhkgVar) {
        gxszxtbevo.iobyxmoadg iobyxmoadgVarIobyxmoadg = jyumaefscl.iobyxmoadg(zdlpuopuiuVar);
        if (iobyxmoadgVarIobyxmoadg.gtknphoqwx()) {
            return new iobyxmoadg(zdlpuopuiuVar, lqeggnwhkgVar, iobyxmoadgVarIobyxmoadg);
        }
        return iobyxmoadgVarIobyxmoadg.wflxmlrfwp() ? new zoijcleaow(zdlpuopuiuVar, lqeggnwhkgVar, iobyxmoadgVarIobyxmoadg) : new iwizpuwonk(zdlpuopuiuVar, lqeggnwhkgVar, iobyxmoadgVarIobyxmoadg);
    }

    void eablkybsjg(kcexrzcfyt kcexrzcfytVar, int i13) {
        kcexrzcfytVar.hcddaimhww(this.f122698zoijcleaow, this.f122697ppxfxbqfkf);
    }

    void gxszxtbevo(wflxmlrfwp wflxmlrfwpVar, int i13) {
        wflxmlrfwpVar.ixidwrxhsl(this.f122698zoijcleaow, this.f122697ppxfxbqfkf);
    }

    @Override // zl.gxszxtbevo
    public void iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, int i13) {
        if (zdlpuopuiuVar.getClass() == lereixgezr.class) {
            lqeggnwhkg((lereixgezr) zdlpuopuiuVar, 0, i13);
        } else if (zdlpuopuiuVar instanceof wflxmlrfwp) {
            wkgbmnqykc((wflxmlrfwp) zdlpuopuiuVar, i13);
        } else {
            eablkybsjg((kcexrzcfyt) zdlpuopuiuVar, i13);
        }
    }

    void lqeggnwhkg(lereixgezr lereixgezrVar, int i13, int i14) {
        ojitshcjhn.draadjrbmk(this.f122698zoijcleaow, lereixgezrVar.metgxyhuhe(), this.f122697ppxfxbqfkf, i13 | 1);
    }

    void nufgyqmvbu(int i13) {
        this.f122698zoijcleaow.iobyxmoadg('\n').zoijcleaow(wl.kcexrzcfyt.cqumvgiudr(i13 * this.f122697ppxfxbqfkf.lqeggnwhkg(), this.f122697ppxfxbqfkf.nufgyqmvbu()));
    }

    void wkgbmnqykc(wflxmlrfwp wflxmlrfwpVar, int i13) {
        wflxmlrfwpVar.hcddaimhww(this.f122698zoijcleaow, this.f122697ppxfxbqfkf);
    }

    @Override // zl.gxszxtbevo
    public void zoijcleaow(zdlpuopuiu zdlpuopuiuVar, int i13) {
        if (zdlpuopuiuVar instanceof wflxmlrfwp) {
            gxszxtbevo((wflxmlrfwp) zdlpuopuiuVar, i13);
        }
    }
}

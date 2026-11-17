package d1;

/* JADX INFO: loaded from: classes.dex */
class btonecajqb extends rgvfuqvkyq {
    btonecajqb(c1.eablkybsjg eablkybsjgVar) {
        super(eablkybsjgVar);
        eablkybsjgVar.f18245eablkybsjg.gxszxtbevo();
        eablkybsjgVar.f18254gxszxtbevo.gxszxtbevo();
        this.f26644gxszxtbevo = ((c1.nufgyqmvbu) eablkybsjgVar).C();
    }

    private void vdvldrhtss(gxszxtbevo gxszxtbevoVar) {
        this.f26647nufgyqmvbu.f26604gtknphoqwx.add(gxszxtbevoVar);
        gxszxtbevoVar.f26601draadjrbmk.add(this.f26647nufgyqmvbu);
    }

    @Override // d1.rgvfuqvkyq
    public void eablkybsjg() {
        if (((c1.nufgyqmvbu) this.f26650zoijcleaow).C() == 1) {
            this.f26650zoijcleaow.w(this.f26647nufgyqmvbu.f26607lqeggnwhkg);
        } else {
            this.f26650zoijcleaow.x(this.f26647nufgyqmvbu.f26607lqeggnwhkg);
        }
    }

    @Override // d1.rgvfuqvkyq
    void gxszxtbevo() {
        this.f26647nufgyqmvbu.ppxfxbqfkf();
    }

    @Override // d1.rgvfuqvkyq, d1.wkgbmnqykc
    public void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        gxszxtbevo gxszxtbevoVar = this.f26647nufgyqmvbu;
        if (gxszxtbevoVar.f26609ppxfxbqfkf && !gxszxtbevoVar.f26600btonecajqb) {
            this.f26647nufgyqmvbu.wkgbmnqykc((int) ((((gxszxtbevo) gxszxtbevoVar.f26601draadjrbmk.get(0)).f26607lqeggnwhkg * ((c1.nufgyqmvbu) this.f26650zoijcleaow).F()) + 0.5f));
        }
    }

    @Override // d1.rgvfuqvkyq
    boolean wflxmlrfwp() {
        return false;
    }

    @Override // d1.rgvfuqvkyq
    void wkgbmnqykc() {
        c1.nufgyqmvbu nufgyqmvbuVar = (c1.nufgyqmvbu) this.f26650zoijcleaow;
        int iD = nufgyqmvbuVar.D();
        int iE = nufgyqmvbuVar.E();
        nufgyqmvbuVar.F();
        if (nufgyqmvbuVar.C() == 1) {
            if (iD != -1) {
                this.f26647nufgyqmvbu.f26601draadjrbmk.add(this.f26650zoijcleaow.f18259ikoacuggdj.f18245eablkybsjg.f26647nufgyqmvbu);
                this.f26650zoijcleaow.f18259ikoacuggdj.f18245eablkybsjg.f26647nufgyqmvbu.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
                this.f26647nufgyqmvbu.f26605gxszxtbevo = iD;
            } else if (iE != -1) {
                this.f26647nufgyqmvbu.f26601draadjrbmk.add(this.f26650zoijcleaow.f18259ikoacuggdj.f18245eablkybsjg.f26642dxjokdxxww);
                this.f26650zoijcleaow.f18259ikoacuggdj.f18245eablkybsjg.f26642dxjokdxxww.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
                this.f26647nufgyqmvbu.f26605gxszxtbevo = -iE;
            } else {
                gxszxtbevo gxszxtbevoVar = this.f26647nufgyqmvbu;
                gxszxtbevoVar.f26611zoijcleaow = true;
                gxszxtbevoVar.f26601draadjrbmk.add(this.f26650zoijcleaow.f18259ikoacuggdj.f18245eablkybsjg.f26642dxjokdxxww);
                this.f26650zoijcleaow.f18259ikoacuggdj.f18245eablkybsjg.f26642dxjokdxxww.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
            }
            vdvldrhtss(this.f26650zoijcleaow.f18245eablkybsjg.f26647nufgyqmvbu);
            vdvldrhtss(this.f26650zoijcleaow.f18245eablkybsjg.f26642dxjokdxxww);
            return;
        }
        if (iD != -1) {
            this.f26647nufgyqmvbu.f26601draadjrbmk.add(this.f26650zoijcleaow.f18259ikoacuggdj.f18254gxszxtbevo.f26647nufgyqmvbu);
            this.f26650zoijcleaow.f18259ikoacuggdj.f18254gxszxtbevo.f26647nufgyqmvbu.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
            this.f26647nufgyqmvbu.f26605gxszxtbevo = iD;
        } else if (iE != -1) {
            this.f26647nufgyqmvbu.f26601draadjrbmk.add(this.f26650zoijcleaow.f18259ikoacuggdj.f18254gxszxtbevo.f26642dxjokdxxww);
            this.f26650zoijcleaow.f18259ikoacuggdj.f18254gxszxtbevo.f26642dxjokdxxww.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
            this.f26647nufgyqmvbu.f26605gxszxtbevo = -iE;
        } else {
            gxszxtbevo gxszxtbevoVar2 = this.f26647nufgyqmvbu;
            gxszxtbevoVar2.f26611zoijcleaow = true;
            gxszxtbevoVar2.f26601draadjrbmk.add(this.f26650zoijcleaow.f18259ikoacuggdj.f18254gxszxtbevo.f26642dxjokdxxww);
            this.f26650zoijcleaow.f18259ikoacuggdj.f18254gxszxtbevo.f26642dxjokdxxww.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
        }
        vdvldrhtss(this.f26650zoijcleaow.f18254gxszxtbevo.f26647nufgyqmvbu);
        vdvldrhtss(this.f26650zoijcleaow.f18254gxszxtbevo.f26642dxjokdxxww);
    }
}

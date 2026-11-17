package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class gtknphoqwx implements f3.ylkuphrtab {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f10554cqumvgiudr = true;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f10555esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private f3.ylkuphrtab f10556iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private wizcaqwiak f10557jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final iobyxmoadg f10558yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final f3.cllcsxoeiz f10559zdlpuopuiu;

    public interface iobyxmoadg {
        void nufgyqmvbu(v2.cqumvgiudr cqumvgiudrVar);
    }

    public gtknphoqwx(iobyxmoadg iobyxmoadgVar, y2.dxjokdxxww dxjokdxxwwVar) {
        this.f10558yggfygwlhe = iobyxmoadgVar;
        this.f10559zdlpuopuiu = new f3.cllcsxoeiz(dxjokdxxwwVar);
    }

    private void btonecajqb(boolean z13) {
        if (wkgbmnqykc(z13)) {
            this.f10554cqumvgiudr = true;
            if (this.f10555esjtqupxsv) {
                this.f10559zdlpuopuiu.zoijcleaow();
                return;
            }
            return;
        }
        f3.ylkuphrtab ylkuphrtabVar = (f3.ylkuphrtab) y2.iobyxmoadg.eablkybsjg(this.f10556iwizpuwonk);
        long jHcddaimhww = ylkuphrtabVar.hcddaimhww();
        if (this.f10554cqumvgiudr) {
            if (jHcddaimhww < this.f10559zdlpuopuiu.hcddaimhww()) {
                this.f10559zdlpuopuiu.ppxfxbqfkf();
                return;
            } else {
                this.f10554cqumvgiudr = false;
                if (this.f10555esjtqupxsv) {
                    this.f10559zdlpuopuiu.zoijcleaow();
                }
            }
        }
        this.f10559zdlpuopuiu.iobyxmoadg(jHcddaimhww);
        v2.cqumvgiudr cqumvgiudrVarLqeggnwhkg = ylkuphrtabVar.lqeggnwhkg();
        if (cqumvgiudrVarLqeggnwhkg.equals(this.f10559zdlpuopuiu.lqeggnwhkg())) {
            return;
        }
        this.f10559zdlpuopuiu.eablkybsjg(cqumvgiudrVarLqeggnwhkg);
        this.f10558yggfygwlhe.nufgyqmvbu(cqumvgiudrVarLqeggnwhkg);
    }

    private boolean wkgbmnqykc(boolean z13) {
        wizcaqwiak wizcaqwiakVar = this.f10557jyumaefscl;
        return wizcaqwiakVar == null || wizcaqwiakVar.wkgbmnqykc() || (z13 && this.f10557jyumaefscl.getState() != 2) || (!this.f10557jyumaefscl.ppxfxbqfkf() && (z13 || this.f10557jyumaefscl.wflxmlrfwp()));
    }

    public long dxjokdxxww(boolean z13) {
        btonecajqb(z13);
        return hcddaimhww();
    }

    @Override // f3.ylkuphrtab
    public void eablkybsjg(v2.cqumvgiudr cqumvgiudrVar) {
        f3.ylkuphrtab ylkuphrtabVar = this.f10556iwizpuwonk;
        if (ylkuphrtabVar != null) {
            ylkuphrtabVar.eablkybsjg(cqumvgiudrVar);
            cqumvgiudrVar = this.f10556iwizpuwonk.lqeggnwhkg();
        }
        this.f10559zdlpuopuiu.eablkybsjg(cqumvgiudrVar);
    }

    public void gxszxtbevo() {
        this.f10555esjtqupxsv = true;
        this.f10559zdlpuopuiu.zoijcleaow();
    }

    @Override // f3.ylkuphrtab
    public long hcddaimhww() {
        return this.f10554cqumvgiudr ? this.f10559zdlpuopuiu.hcddaimhww() : ((f3.ylkuphrtab) y2.iobyxmoadg.eablkybsjg(this.f10556iwizpuwonk)).hcddaimhww();
    }

    public void iobyxmoadg(wizcaqwiak wizcaqwiakVar) {
        if (wizcaqwiakVar == this.f10557jyumaefscl) {
            this.f10556iwizpuwonk = null;
            this.f10557jyumaefscl = null;
            this.f10554cqumvgiudr = true;
        }
    }

    @Override // f3.ylkuphrtab
    public boolean iwizpuwonk() {
        return this.f10554cqumvgiudr ? this.f10559zdlpuopuiu.iwizpuwonk() : ((f3.ylkuphrtab) y2.iobyxmoadg.eablkybsjg(this.f10556iwizpuwonk)).iwizpuwonk();
    }

    @Override // f3.ylkuphrtab
    public v2.cqumvgiudr lqeggnwhkg() {
        f3.ylkuphrtab ylkuphrtabVar = this.f10556iwizpuwonk;
        return ylkuphrtabVar != null ? ylkuphrtabVar.lqeggnwhkg() : this.f10559zdlpuopuiu.lqeggnwhkg();
    }

    public void nufgyqmvbu() {
        this.f10555esjtqupxsv = false;
        this.f10559zdlpuopuiu.ppxfxbqfkf();
    }

    public void ppxfxbqfkf(long j13) {
        this.f10559zdlpuopuiu.iobyxmoadg(j13);
    }

    public void zoijcleaow(wizcaqwiak wizcaqwiakVar) throws ExoPlaybackException {
        f3.ylkuphrtab ylkuphrtabVar;
        f3.ylkuphrtab ylkuphrtabVarKegysxyocb = wizcaqwiakVar.kegysxyocb();
        if (ylkuphrtabVarKegysxyocb == null || ylkuphrtabVarKegysxyocb == (ylkuphrtabVar = this.f10556iwizpuwonk)) {
            return;
        }
        if (ylkuphrtabVar != null) {
            throw ExoPlaybackException.nufgyqmvbu(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f10556iwizpuwonk = ylkuphrtabVarKegysxyocb;
        this.f10557jyumaefscl = wizcaqwiakVar;
        ylkuphrtabVarKegysxyocb.eablkybsjg(this.f10559zdlpuopuiu.lqeggnwhkg());
    }
}

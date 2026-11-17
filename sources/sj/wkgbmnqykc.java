package sj;

/* JADX INFO: loaded from: classes3.dex */
class wkgbmnqykc extends tj.wkgbmnqykc {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final tg.rgvfuqvkyq f107052iwizpuwonk;

    public /* synthetic */ wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(rgvfuqvkyqVar, (i14 & 2) != 0 ? lg.gtknphoqwx.f62507zdlpuopuiu : btonecajqbVar, (i14 & 4) != 0 ? -2 : i13, (i14 & 8) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar);
    }

    static /* synthetic */ Object wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objInvoke = wkgbmnqykcVar.f107052iwizpuwonk.invoke(zdlpuopuiuVar, gxszxtbevoVar);
        return objInvoke == mg.zoijcleaow.gxszxtbevo() ? objInvoke : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tj.wkgbmnqykc
    protected Object eablkybsjg(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
        return wflxmlrfwp(this, zdlpuopuiuVar, gxszxtbevoVar);
    }

    @Override // tj.wkgbmnqykc
    protected tj.wkgbmnqykc gxszxtbevo(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return new wkgbmnqykc(this.f107052iwizpuwonk, btonecajqbVar, i13, iobyxmoadgVar);
    }

    @Override // tj.wkgbmnqykc
    public String toString() {
        return "block[" + this.f107052iwizpuwonk + "] -> " + super.toString();
    }

    public wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        super(btonecajqbVar, i13, iobyxmoadgVar);
        this.f107052iwizpuwonk = rgvfuqvkyqVar;
    }
}

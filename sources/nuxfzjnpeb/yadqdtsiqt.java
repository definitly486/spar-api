package nuxfzjnpeb;

/* JADX INFO: loaded from: classes.dex */
final class yadqdtsiqt implements androidx.compose.ui.window.zdlpuopuiu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private w0.agtfadlqog f71248eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.compose.ui.window.zdlpuopuiu f71249iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private w0.zdlpuopuiu f71250ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private w0.oxmwwwfdhm f71251wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private w0.oxmwwwfdhm f71252zoijcleaow;

    public yadqdtsiqt(androidx.compose.ui.window.zdlpuopuiu zdlpuopuiuVar) {
        this.f71249iobyxmoadg = zdlpuopuiuVar;
    }

    @Override // androidx.compose.ui.window.zdlpuopuiu
    public long iobyxmoadg(w0.rgvfuqvkyq rgvfuqvkyqVar, long j13, w0.zdlpuopuiu zdlpuopuiuVar, long j14) {
        w0.agtfadlqog agtfadlqogVar = this.f71248eablkybsjg;
        if (agtfadlqogVar != null) {
            w0.oxmwwwfdhm oxmwwwfdhmVar = this.f71252zoijcleaow;
            if ((oxmwwwfdhmVar == null ? false : w0.oxmwwwfdhm.eablkybsjg(oxmwwwfdhmVar.btonecajqb(), j13)) && this.f71250ppxfxbqfkf == zdlpuopuiuVar) {
                w0.oxmwwwfdhm oxmwwwfdhmVar2 = this.f71251wkgbmnqykc;
                if (oxmwwwfdhmVar2 != null ? w0.oxmwwwfdhm.eablkybsjg(oxmwwwfdhmVar2.btonecajqb(), j14) : false) {
                    return agtfadlqogVar.rgvfuqvkyq();
                }
            }
        }
        long jIobyxmoadg = this.f71249iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar, j13, zdlpuopuiuVar, j14);
        this.f71252zoijcleaow = w0.oxmwwwfdhm.zoijcleaow(j13);
        this.f71250ppxfxbqfkf = zdlpuopuiuVar;
        this.f71251wkgbmnqykc = w0.oxmwwwfdhm.zoijcleaow(j14);
        this.f71248eablkybsjg = w0.agtfadlqog.ppxfxbqfkf(jIobyxmoadg);
        return jIobyxmoadg;
    }
}

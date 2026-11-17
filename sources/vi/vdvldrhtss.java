package vi;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jh.cllcsxoeiz f116975iobyxmoadg;

    public vdvldrhtss(jh.cllcsxoeiz packageFragmentProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageFragmentProvider, "packageFragmentProvider");
        this.f116975iobyxmoadg = packageFragmentProvider;
    }

    @Override // vi.btonecajqb
    public dxjokdxxww iobyxmoadg(ii.zoijcleaow classId) {
        dxjokdxxww dxjokdxxwwVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
        for (jh.hkdspvbjdz hkdspvbjdzVar : jh.kegysxyocb.ppxfxbqfkf(this.f116975iobyxmoadg, classId.gxszxtbevo())) {
            if ((hkdspvbjdzVar instanceof oxmwwwfdhm) && (dxjokdxxwwVarIobyxmoadg = ((oxmwwwfdhm) hkdspvbjdzVar).wizcaqwiak().iobyxmoadg(classId)) != null) {
                return dxjokdxxwwVarIobyxmoadg;
            }
        }
        return null;
    }
}

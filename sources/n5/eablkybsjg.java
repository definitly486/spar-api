package n5;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg implements u5.nufgyqmvbu.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final u5.nufgyqmvbu.ppxfxbqfkf f68800iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f68801zoijcleaow;

    public eablkybsjg(u5.nufgyqmvbu.ppxfxbqfkf delegate, ppxfxbqfkf autoCloser) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(autoCloser, "autoCloser");
        this.f68800iobyxmoadg = delegate;
        this.f68801zoijcleaow = autoCloser;
    }

    @Override // u5.nufgyqmvbu.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc iobyxmoadg(u5.nufgyqmvbu.zoijcleaow configuration) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        return new wkgbmnqykc(this.f68800iobyxmoadg.iobyxmoadg(configuration), this.f68801zoijcleaow);
    }
}

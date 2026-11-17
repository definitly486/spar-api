package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class sopmlzcsov implements gg.gtknphoqwx {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private ntlheqmsrt f9545cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final tg.iobyxmoadg f9546iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.iobyxmoadg f9547jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final tg.iobyxmoadg f9548yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ah.wkgbmnqykc f9549zdlpuopuiu;

    public sopmlzcsov(ah.wkgbmnqykc viewModelClass, tg.iobyxmoadg storeProducer, tg.iobyxmoadg factoryProducer, tg.iobyxmoadg extrasProducer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storeProducer, "storeProducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(factoryProducer, "factoryProducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extrasProducer, "extrasProducer");
        this.f9549zdlpuopuiu = viewModelClass;
        this.f9548yggfygwlhe = storeProducer;
        this.f9547jyumaefscl = factoryProducer;
        this.f9546iwizpuwonk = extrasProducer;
    }

    @Override // gg.gtknphoqwx
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public ntlheqmsrt getValue() {
        ntlheqmsrt ntlheqmsrtVar = this.f9545cqumvgiudr;
        if (ntlheqmsrtVar != null) {
            return ntlheqmsrtVar;
        }
        ntlheqmsrt ntlheqmsrtVarIobyxmoadg = crxdokpmqz.f9445zoijcleaow.iobyxmoadg((jlmebxxoox) this.f9548yggfygwlhe.invoke(), (crxdokpmqz.ppxfxbqfkf) this.f9547jyumaefscl.invoke(), (t2.iobyxmoadg) this.f9546iwizpuwonk.invoke()).iobyxmoadg(this.f9549zdlpuopuiu);
        this.f9545cqumvgiudr = ntlheqmsrtVarIobyxmoadg;
        return ntlheqmsrtVarIobyxmoadg;
    }

    @Override // gg.gtknphoqwx
    public boolean isInitialized() {
        return this.f9545cqumvgiudr != null;
    }
}

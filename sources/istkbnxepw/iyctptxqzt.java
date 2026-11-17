package istkbnxepw;

/* JADX INFO: loaded from: classes.dex */
public final class iyctptxqzt implements lereixgezr.czzsidtyhn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lereixgezr.czzsidtyhn f49348eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f49349wkgbmnqykc;

    public iyctptxqzt(long j13, lereixgezr.czzsidtyhn czzsidtyhnVar) {
        u1.nufgyqmvbu.zoijcleaow(j13 >= 0, "Timeout must be non-negative.");
        this.f49349wkgbmnqykc = j13;
        this.f49348eablkybsjg = czzsidtyhnVar;
    }

    @Override // lereixgezr.czzsidtyhn
    public lereixgezr.czzsidtyhn.ppxfxbqfkf gxszxtbevo(lereixgezr.czzsidtyhn.zoijcleaow zoijcleaowVar) {
        lereixgezr.czzsidtyhn.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = this.f49348eablkybsjg.gxszxtbevo(zoijcleaowVar);
        return (iobyxmoadg() <= 0 || zoijcleaowVar.zoijcleaow() < iobyxmoadg() - ppxfxbqfkfVarGxszxtbevo.zoijcleaow()) ? ppxfxbqfkfVarGxszxtbevo : lereixgezr.czzsidtyhn.ppxfxbqfkf.f62260wkgbmnqykc;
    }

    @Override // lereixgezr.czzsidtyhn
    public long iobyxmoadg() {
        return this.f49349wkgbmnqykc;
    }
}

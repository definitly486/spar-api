package q9;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class vdvldrhtss implements o9.btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f78303iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zdlpuopuiu f78304ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f78305zoijcleaow;

    vdvldrhtss(Set set, rgvfuqvkyq rgvfuqvkyqVar, zdlpuopuiu zdlpuopuiuVar) {
        this.f78303iobyxmoadg = set;
        this.f78305zoijcleaow = rgvfuqvkyqVar;
        this.f78304ppxfxbqfkf = zdlpuopuiuVar;
    }

    @Override // o9.btonecajqb
    public o9.dxjokdxxww iobyxmoadg(String str, Class cls, o9.ppxfxbqfkf ppxfxbqfkfVar, o9.nufgyqmvbu nufgyqmvbuVar) {
        if (this.f78303iobyxmoadg.contains(ppxfxbqfkfVar)) {
            return new kcexrzcfyt(this.f78305zoijcleaow, str, ppxfxbqfkfVar, nufgyqmvbuVar, this.f78304ppxfxbqfkf);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", ppxfxbqfkfVar, this.f78303iobyxmoadg));
    }
}

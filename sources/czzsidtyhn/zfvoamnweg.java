package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
public final class zfvoamnweg implements ydmasvzmpa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f26531iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f26532ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f26533wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f26534zoijcleaow;

    public /* synthetic */ zfvoamnweg(float f13, float f14, float f15, float f16, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zfvoamnweg)) {
            return false;
        }
        zfvoamnweg zfvoamnwegVar = (zfvoamnweg) obj;
        return w0.nufgyqmvbu.dxjokdxxww(this.f26531iobyxmoadg, zfvoamnwegVar.f26531iobyxmoadg) && w0.nufgyqmvbu.dxjokdxxww(this.f26534zoijcleaow, zfvoamnwegVar.f26534zoijcleaow) && w0.nufgyqmvbu.dxjokdxxww(this.f26532ppxfxbqfkf, zfvoamnwegVar.f26532ppxfxbqfkf) && w0.nufgyqmvbu.dxjokdxxww(this.f26533wkgbmnqykc, zfvoamnwegVar.f26533wkgbmnqykc);
    }

    public int hashCode() {
        return (((((w0.nufgyqmvbu.btonecajqb(this.f26531iobyxmoadg) * 31) + w0.nufgyqmvbu.btonecajqb(this.f26534zoijcleaow)) * 31) + w0.nufgyqmvbu.btonecajqb(this.f26532ppxfxbqfkf)) * 31) + w0.nufgyqmvbu.btonecajqb(this.f26533wkgbmnqykc);
    }

    @Override // czzsidtyhn.ydmasvzmpa
    public float iobyxmoadg() {
        return this.f26533wkgbmnqykc;
    }

    @Override // czzsidtyhn.ydmasvzmpa
    public float ppxfxbqfkf(w0.zdlpuopuiu zdlpuopuiuVar) {
        return zdlpuopuiuVar == w0.zdlpuopuiu.Ltr ? this.f26531iobyxmoadg : this.f26532ppxfxbqfkf;
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26531iobyxmoadg)) + ", top=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26534zoijcleaow)) + ", end=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26532ppxfxbqfkf)) + ", bottom=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26533wkgbmnqykc)) + ')';
    }

    @Override // czzsidtyhn.ydmasvzmpa
    public float wkgbmnqykc() {
        return this.f26534zoijcleaow;
    }

    @Override // czzsidtyhn.ydmasvzmpa
    public float zoijcleaow(w0.zdlpuopuiu zdlpuopuiuVar) {
        return zdlpuopuiuVar == w0.zdlpuopuiu.Ltr ? this.f26532ppxfxbqfkf : this.f26531iobyxmoadg;
    }

    private zfvoamnweg(float f13, float f14, float f15, float f16) {
        this.f26531iobyxmoadg = f13;
        this.f26534zoijcleaow = f14;
        this.f26532ppxfxbqfkf = f15;
        this.f26533wkgbmnqykc = f16;
        if (!((f13 >= 0.0f) & (f14 >= 0.0f) & (f15 >= 0.0f)) || !(f16 >= 0.0f)) {
            uwvvkdfqfp.iobyxmoadg.iobyxmoadg("Padding must be non-negative");
        }
    }
}

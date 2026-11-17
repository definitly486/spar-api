package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
public final class weqkydbzbr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f26489iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private zdlpuopuiu f26490ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f26491zoijcleaow;

    public weqkydbzbr(float f13, boolean z13, zdlpuopuiu zdlpuopuiuVar, lereixgezr lereixgezrVar) {
        this.f26489iobyxmoadg = f13;
        this.f26491zoijcleaow = z13;
        this.f26490ppxfxbqfkf = zdlpuopuiuVar;
    }

    public final void eablkybsjg(zdlpuopuiu zdlpuopuiuVar) {
        this.f26490ppxfxbqfkf = zdlpuopuiuVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof weqkydbzbr)) {
            return false;
        }
        weqkydbzbr weqkydbzbrVar = (weqkydbzbr) obj;
        return Float.compare(this.f26489iobyxmoadg, weqkydbzbrVar.f26489iobyxmoadg) == 0 && this.f26491zoijcleaow == weqkydbzbrVar.f26491zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f26490ppxfxbqfkf, weqkydbzbrVar.f26490ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(null, null);
    }

    public final void gxszxtbevo(boolean z13) {
        this.f26491zoijcleaow = z13;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f26489iobyxmoadg) * 31) + Boolean.hashCode(this.f26491zoijcleaow)) * 31;
        zdlpuopuiu zdlpuopuiuVar = this.f26490ppxfxbqfkf;
        return (iHashCode + (zdlpuopuiuVar == null ? 0 : zdlpuopuiuVar.hashCode())) * 31;
    }

    public final zdlpuopuiu iobyxmoadg() {
        return this.f26490ppxfxbqfkf;
    }

    public final void lqeggnwhkg(float f13) {
        this.f26489iobyxmoadg = f13;
    }

    public final lereixgezr ppxfxbqfkf() {
        return null;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f26489iobyxmoadg + ", fill=" + this.f26491zoijcleaow + ", crossAxisAlignment=" + this.f26490ppxfxbqfkf + ", flowLayoutData=" + ((Object) null) + ')';
    }

    public final float wkgbmnqykc() {
        return this.f26489iobyxmoadg;
    }

    public final boolean zoijcleaow() {
        return this.f26491zoijcleaow;
    }

    public /* synthetic */ weqkydbzbr(float f13, boolean z13, zdlpuopuiu zdlpuopuiuVar, lereixgezr lereixgezrVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? null : zdlpuopuiuVar, (i13 & 8) != 0 ? null : lereixgezrVar);
    }
}

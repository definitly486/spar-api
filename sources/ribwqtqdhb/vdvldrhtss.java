package ribwqtqdhb;

import vipkmwdibw.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f82843iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wwaezpbzkn f82844ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f82845zoijcleaow;

    public /* synthetic */ vdvldrhtss(float f13, long j13, wwaezpbzkn wwaezpbzknVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, j13, wwaezpbzknVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return Float.compare(this.f82843iobyxmoadg, vdvldrhtssVar.f82843iobyxmoadg) == 0 && androidx.compose.ui.graphics.btonecajqb.eablkybsjg(this.f82845zoijcleaow, vdvldrhtssVar.f82845zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82844ppxfxbqfkf, vdvldrhtssVar.f82844ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f82843iobyxmoadg) * 31) + androidx.compose.ui.graphics.btonecajqb.nufgyqmvbu(this.f82845zoijcleaow)) * 31) + this.f82844ppxfxbqfkf.hashCode();
    }

    public final wwaezpbzkn iobyxmoadg() {
        return this.f82844ppxfxbqfkf;
    }

    public final long ppxfxbqfkf() {
        return this.f82845zoijcleaow;
    }

    public String toString() {
        return "Scale(scale=" + this.f82843iobyxmoadg + ", transformOrigin=" + ((Object) androidx.compose.ui.graphics.btonecajqb.dxjokdxxww(this.f82845zoijcleaow)) + ", animationSpec=" + this.f82844ppxfxbqfkf + ')';
    }

    public final float zoijcleaow() {
        return this.f82843iobyxmoadg;
    }

    private vdvldrhtss(float f13, long j13, wwaezpbzkn wwaezpbzknVar) {
        this.f82843iobyxmoadg = f13;
        this.f82845zoijcleaow = j13;
        this.f82844ppxfxbqfkf = wwaezpbzknVar;
    }
}

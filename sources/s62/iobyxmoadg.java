package s62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105612iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f105613ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f105614zoijcleaow;

    public iobyxmoadg(String text, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(text, "text");
        this.f105612iobyxmoadg = text;
        this.f105614zoijcleaow = i13;
        this.f105613ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f105612iobyxmoadg, iobyxmoadgVar.f105612iobyxmoadg) && this.f105614zoijcleaow == iobyxmoadgVar.f105614zoijcleaow && this.f105613ppxfxbqfkf == iobyxmoadgVar.f105613ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f105612iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f105614zoijcleaow)) * 31) + Boolean.hashCode(this.f105613ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f105612iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f105613ppxfxbqfkf;
    }

    public String toString() {
        return "ItemTableSpecialBannerUiModel(text=" + this.f105612iobyxmoadg + ", typeFace=" + this.f105614zoijcleaow + ", isFirstRow=" + this.f105613ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f105614zoijcleaow;
    }
}

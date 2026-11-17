package ls1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f63978iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f63979ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f63980zoijcleaow;

    public iobyxmoadg(String text, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(text, "text");
        this.f63978iobyxmoadg = text;
        this.f63980zoijcleaow = i13;
        this.f63979ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f63978iobyxmoadg, iobyxmoadgVar.f63978iobyxmoadg) && this.f63980zoijcleaow == iobyxmoadgVar.f63980zoijcleaow && this.f63979ppxfxbqfkf == iobyxmoadgVar.f63979ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f63978iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f63980zoijcleaow)) * 31) + Boolean.hashCode(this.f63979ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f63978iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f63979ppxfxbqfkf;
    }

    public String toString() {
        return "ItemTableSpecialBannerUiModel(text=" + this.f63978iobyxmoadg + ", typeFace=" + this.f63980zoijcleaow + ", isFirstRow=" + this.f63979ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f63980zoijcleaow;
    }
}

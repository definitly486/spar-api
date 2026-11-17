package om1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f73165iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f73166ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f73167zoijcleaow;

    public iobyxmoadg(boolean z13, boolean z14, zoijcleaow type) {
        zdlpuopuiu.btonecajqb(type, "type");
        this.f73165iobyxmoadg = z13;
        this.f73167zoijcleaow = z14;
        this.f73166ppxfxbqfkf = type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f73165iobyxmoadg == iobyxmoadgVar.f73165iobyxmoadg && this.f73167zoijcleaow == iobyxmoadgVar.f73167zoijcleaow && this.f73166ppxfxbqfkf == iobyxmoadgVar.f73166ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f73165iobyxmoadg) * 31) + Boolean.hashCode(this.f73167zoijcleaow)) * 31) + this.f73166ppxfxbqfkf.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f73166ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f73165iobyxmoadg;
    }

    public String toString() {
        return "ButtonUiModel(isLoading=" + this.f73165iobyxmoadg + ", isEnabled=" + this.f73167zoijcleaow + ", type=" + this.f73166ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f73167zoijcleaow;
    }
}

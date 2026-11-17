package rc1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f82532iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f82533ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f82534zoijcleaow;

    public iobyxmoadg(String message, String selected, boolean z13) {
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(selected, "selected");
        this.f82532iobyxmoadg = message;
        this.f82534zoijcleaow = selected;
        this.f82533ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f82532iobyxmoadg, iobyxmoadgVar.f82532iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f82534zoijcleaow, iobyxmoadgVar.f82534zoijcleaow) && this.f82533ppxfxbqfkf == iobyxmoadgVar.f82533ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f82532iobyxmoadg.hashCode() * 31) + this.f82534zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f82533ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f82532iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f82533ppxfxbqfkf;
    }

    public String toString() {
        return "CategoriesInfoUiModel(message=" + this.f82532iobyxmoadg + ", selected=" + this.f82534zoijcleaow + ", isAvailable=" + this.f82533ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f82534zoijcleaow;
    }
}

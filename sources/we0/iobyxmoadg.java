package we0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f119450iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f119451ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f119452zoijcleaow;

    public iobyxmoadg(String message, String selected, boolean z13) {
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(selected, "selected");
        this.f119450iobyxmoadg = message;
        this.f119452zoijcleaow = selected;
        this.f119451ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f119450iobyxmoadg, iobyxmoadgVar.f119450iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f119452zoijcleaow, iobyxmoadgVar.f119452zoijcleaow) && this.f119451ppxfxbqfkf == iobyxmoadgVar.f119451ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f119450iobyxmoadg.hashCode() * 31) + this.f119452zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f119451ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f119450iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f119451ppxfxbqfkf;
    }

    public String toString() {
        return "CategoriesInfoUiModel(message=" + this.f119450iobyxmoadg + ", selected=" + this.f119452zoijcleaow + ", isAvailable=" + this.f119451ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f119452zoijcleaow;
    }
}

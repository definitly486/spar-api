package ny1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f71430iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f71431ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f71432zoijcleaow;

    public iobyxmoadg(List purchaseLists, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
        this.f71430iobyxmoadg = purchaseLists;
        this.f71432zoijcleaow = z13;
        this.f71431ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f71430iobyxmoadg, iobyxmoadgVar.f71430iobyxmoadg) && this.f71432zoijcleaow == iobyxmoadgVar.f71432zoijcleaow && this.f71431ppxfxbqfkf == iobyxmoadgVar.f71431ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f71430iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f71432zoijcleaow)) * 31) + Boolean.hashCode(this.f71431ppxfxbqfkf);
    }

    public final List iobyxmoadg() {
        return this.f71430iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f71432zoijcleaow;
    }

    public String toString() {
        return "Model(purchaseLists=" + this.f71430iobyxmoadg + ", isLoading=" + this.f71432zoijcleaow + ", isInitializing=" + this.f71431ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f71431ppxfxbqfkf;
    }
}

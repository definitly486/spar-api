package tj1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f110743iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f110744ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f110745zoijcleaow;

    public iobyxmoadg(List purchaseLists, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
        this.f110743iobyxmoadg = purchaseLists;
        this.f110745zoijcleaow = z13;
        this.f110744ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f110743iobyxmoadg, iobyxmoadgVar.f110743iobyxmoadg) && this.f110745zoijcleaow == iobyxmoadgVar.f110745zoijcleaow && this.f110744ppxfxbqfkf == iobyxmoadgVar.f110744ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f110743iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f110745zoijcleaow)) * 31) + Boolean.hashCode(this.f110744ppxfxbqfkf);
    }

    public final List iobyxmoadg() {
        return this.f110743iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f110745zoijcleaow;
    }

    public String toString() {
        return "Model(purchaseLists=" + this.f110743iobyxmoadg + ", isLoading=" + this.f110745zoijcleaow + ", isInitializing=" + this.f110744ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f110744ppxfxbqfkf;
    }
}

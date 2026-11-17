package ya1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f124286iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f124287ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f124288zoijcleaow;

    public lqeggnwhkg(List items, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f124286iobyxmoadg = items;
        this.f124288zoijcleaow = i13;
        this.f124287ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f124286iobyxmoadg, lqeggnwhkgVar.f124286iobyxmoadg) && this.f124288zoijcleaow == lqeggnwhkgVar.f124288zoijcleaow && this.f124287ppxfxbqfkf == lqeggnwhkgVar.f124287ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f124286iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f124288zoijcleaow)) * 31) + Boolean.hashCode(this.f124287ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f124288zoijcleaow;
    }

    public String toString() {
        return "Model(items=" + this.f124286iobyxmoadg + ", currentItemPosition=" + this.f124288zoijcleaow + ", isLoading=" + this.f124287ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f124286iobyxmoadg;
    }
}

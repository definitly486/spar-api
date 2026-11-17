package bd0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f15833iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f15834ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f15835zoijcleaow;

    public lqeggnwhkg(List items, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f15833iobyxmoadg = items;
        this.f15835zoijcleaow = i13;
        this.f15834ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f15833iobyxmoadg, lqeggnwhkgVar.f15833iobyxmoadg) && this.f15835zoijcleaow == lqeggnwhkgVar.f15835zoijcleaow && this.f15834ppxfxbqfkf == lqeggnwhkgVar.f15834ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f15833iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f15835zoijcleaow)) * 31) + Boolean.hashCode(this.f15834ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f15835zoijcleaow;
    }

    public String toString() {
        return "Model(items=" + this.f15833iobyxmoadg + ", currentItemPosition=" + this.f15835zoijcleaow + ", isLoading=" + this.f15834ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f15833iobyxmoadg;
    }
}

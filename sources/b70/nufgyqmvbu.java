package b70;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f15432iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f15433ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f15434zoijcleaow;

    public nufgyqmvbu(List blocks, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(blocks, "blocks");
        this.f15432iobyxmoadg = blocks;
        this.f15434zoijcleaow = z13;
        this.f15433ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f15432iobyxmoadg, nufgyqmvbuVar.f15432iobyxmoadg) && this.f15434zoijcleaow == nufgyqmvbuVar.f15434zoijcleaow && this.f15433ppxfxbqfkf == nufgyqmvbuVar.f15433ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f15432iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15434zoijcleaow)) * 31) + Boolean.hashCode(this.f15433ppxfxbqfkf);
    }

    public final List iobyxmoadg() {
        return this.f15432iobyxmoadg;
    }

    public String toString() {
        return "DeliveryOptionsModel(blocks=" + this.f15432iobyxmoadg + ", isLoading=" + this.f15434zoijcleaow + ", hideScreen=" + this.f15433ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f15434zoijcleaow;
    }
}

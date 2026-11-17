package q51;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f77903iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f77904ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f77905zoijcleaow;

    public nufgyqmvbu(List blocks, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(blocks, "blocks");
        this.f77903iobyxmoadg = blocks;
        this.f77905zoijcleaow = z13;
        this.f77904ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f77903iobyxmoadg, nufgyqmvbuVar.f77903iobyxmoadg) && this.f77905zoijcleaow == nufgyqmvbuVar.f77905zoijcleaow && this.f77904ppxfxbqfkf == nufgyqmvbuVar.f77904ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f77903iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f77905zoijcleaow)) * 31) + Boolean.hashCode(this.f77904ppxfxbqfkf);
    }

    public final List iobyxmoadg() {
        return this.f77903iobyxmoadg;
    }

    public String toString() {
        return "DeliveryOptionsModel(blocks=" + this.f77903iobyxmoadg + ", isLoading=" + this.f77905zoijcleaow + ", hideScreen=" + this.f77904ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f77905zoijcleaow;
    }
}

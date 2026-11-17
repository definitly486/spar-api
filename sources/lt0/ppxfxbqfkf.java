package lt0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f64038iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f64039zoijcleaow;

    public ppxfxbqfkf(iobyxmoadg product, List replaces) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(replaces, "replaces");
        this.f64038iobyxmoadg = product;
        this.f64039zoijcleaow = replaces;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f64038iobyxmoadg, ppxfxbqfkfVar.f64038iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f64039zoijcleaow, ppxfxbqfkfVar.f64039zoijcleaow);
    }

    public int hashCode() {
        return (this.f64038iobyxmoadg.hashCode() * 31) + this.f64039zoijcleaow.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f64038iobyxmoadg;
    }

    public String toString() {
        return "SpecificOrderProductUiModel(product=" + this.f64038iobyxmoadg + ", replaces=" + this.f64039zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f64039zoijcleaow;
    }
}

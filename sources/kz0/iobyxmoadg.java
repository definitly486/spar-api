package kz0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.Warning;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f61168iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Warning f61169zoijcleaow;

    public iobyxmoadg(List productList, Warning warning) {
        zdlpuopuiu.btonecajqb(productList, "productList");
        zdlpuopuiu.btonecajqb(warning, "warning");
        this.f61168iobyxmoadg = productList;
        this.f61169zoijcleaow = warning;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f61168iobyxmoadg, iobyxmoadgVar.f61168iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61169zoijcleaow, iobyxmoadgVar.f61169zoijcleaow);
    }

    public int hashCode() {
        return (this.f61168iobyxmoadg.hashCode() * 31) + this.f61169zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f61168iobyxmoadg;
    }

    public String toString() {
        return "AddComboToCartResult(productList=" + this.f61168iobyxmoadg + ", warning=" + this.f61169zoijcleaow + ")";
    }

    public final Warning zoijcleaow() {
        return this.f61169zoijcleaow;
    }
}

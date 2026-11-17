package kt0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ComboSetProduct f60556iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ComboSetProduct f60557zoijcleaow;

    public wkgbmnqykc(ComboSetProduct first, ComboSetProduct second) {
        zdlpuopuiu.btonecajqb(first, "first");
        zdlpuopuiu.btonecajqb(second, "second");
        this.f60556iobyxmoadg = first;
        this.f60557zoijcleaow = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f60556iobyxmoadg, wkgbmnqykcVar.f60556iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f60557zoijcleaow, wkgbmnqykcVar.f60557zoijcleaow);
    }

    public int hashCode() {
        return (this.f60556iobyxmoadg.hashCode() * 31) + this.f60557zoijcleaow.hashCode();
    }

    public final ComboSetProduct iobyxmoadg() {
        return this.f60556iobyxmoadg;
    }

    public String toString() {
        return "ProductsOnDisplayComboSetUiModel(first=" + this.f60556iobyxmoadg + ", second=" + this.f60557zoijcleaow + ")";
    }

    public final ComboSetProduct zoijcleaow() {
        return this.f60557zoijcleaow;
    }
}

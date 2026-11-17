package qu;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ComboSetProduct f80664iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ComboSetProduct f80665zoijcleaow;

    public wkgbmnqykc(ComboSetProduct first, ComboSetProduct second) {
        zdlpuopuiu.btonecajqb(first, "first");
        zdlpuopuiu.btonecajqb(second, "second");
        this.f80664iobyxmoadg = first;
        this.f80665zoijcleaow = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f80664iobyxmoadg, wkgbmnqykcVar.f80664iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80665zoijcleaow, wkgbmnqykcVar.f80665zoijcleaow);
    }

    public int hashCode() {
        return (this.f80664iobyxmoadg.hashCode() * 31) + this.f80665zoijcleaow.hashCode();
    }

    public final ComboSetProduct iobyxmoadg() {
        return this.f80664iobyxmoadg;
    }

    public String toString() {
        return "ProductsOnDisplayComboSetUiModel(first=" + this.f80664iobyxmoadg + ", second=" + this.f80665zoijcleaow + ")";
    }

    public final ComboSetProduct zoijcleaow() {
        return this.f80665zoijcleaow;
    }
}

package lz0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.handler.ProductMessageType;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f64594eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f64595iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f64596ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final MeasureType f64597wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f64598zoijcleaow;

    public iobyxmoadg(String id2, String str, double d13, MeasureType measureType, List limits) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        zdlpuopuiu.btonecajqb(limits, "limits");
        this.f64595iobyxmoadg = id2;
        this.f64598zoijcleaow = str;
        this.f64596ppxfxbqfkf = d13;
        this.f64597wkgbmnqykc = measureType;
        this.f64594eablkybsjg = limits;
    }

    public final ProductUIData eablkybsjg(ProductMessageType productMessageType) {
        return new ProductUIData(this.f64595iobyxmoadg, this.f64598zoijcleaow, this.f64596ppxfxbqfkf, this.f64597wkgbmnqykc, false, this.f64594eablkybsjg, productMessageType, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f64595iobyxmoadg, iobyxmoadgVar.f64595iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f64598zoijcleaow, iobyxmoadgVar.f64598zoijcleaow) && Double.compare(this.f64596ppxfxbqfkf, iobyxmoadgVar.f64596ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f64597wkgbmnqykc, iobyxmoadgVar.f64597wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f64594eablkybsjg, iobyxmoadgVar.f64594eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = this.f64595iobyxmoadg.hashCode() * 31;
        String str = this.f64598zoijcleaow;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.f64596ppxfxbqfkf)) * 31) + this.f64597wkgbmnqykc.hashCode()) * 31) + this.f64594eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f64595iobyxmoadg;
    }

    public final MeasureType ppxfxbqfkf() {
        return this.f64597wkgbmnqykc;
    }

    public String toString() {
        return "ProductSourceData(id=" + this.f64595iobyxmoadg + ", article=" + this.f64598zoijcleaow + ", quantity=" + this.f64596ppxfxbqfkf + ", measureType=" + this.f64597wkgbmnqykc + ", limits=" + this.f64594eablkybsjg + ")";
    }

    public final double wkgbmnqykc() {
        return this.f64596ppxfxbqfkf;
    }

    public final List zoijcleaow() {
        return this.f64594eablkybsjg;
    }
}

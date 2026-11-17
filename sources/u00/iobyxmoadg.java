package u00;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.handler.ProductMessageType;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f112438eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f112439iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f112440ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final MeasureType f112441wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f112442zoijcleaow;

    public iobyxmoadg(String id2, String str, double d13, MeasureType measureType, List limits) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        zdlpuopuiu.btonecajqb(limits, "limits");
        this.f112439iobyxmoadg = id2;
        this.f112442zoijcleaow = str;
        this.f112440ppxfxbqfkf = d13;
        this.f112441wkgbmnqykc = measureType;
        this.f112438eablkybsjg = limits;
    }

    public final ProductUIData eablkybsjg(ProductMessageType productMessageType) {
        return new ProductUIData(this.f112439iobyxmoadg, this.f112442zoijcleaow, this.f112440ppxfxbqfkf, this.f112441wkgbmnqykc, false, this.f112438eablkybsjg, productMessageType, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f112439iobyxmoadg, iobyxmoadgVar.f112439iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112442zoijcleaow, iobyxmoadgVar.f112442zoijcleaow) && Double.compare(this.f112440ppxfxbqfkf, iobyxmoadgVar.f112440ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f112441wkgbmnqykc, iobyxmoadgVar.f112441wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f112438eablkybsjg, iobyxmoadgVar.f112438eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = this.f112439iobyxmoadg.hashCode() * 31;
        String str = this.f112442zoijcleaow;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.f112440ppxfxbqfkf)) * 31) + this.f112441wkgbmnqykc.hashCode()) * 31) + this.f112438eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f112439iobyxmoadg;
    }

    public final MeasureType ppxfxbqfkf() {
        return this.f112441wkgbmnqykc;
    }

    public String toString() {
        return "ProductSourceData(id=" + this.f112439iobyxmoadg + ", article=" + this.f112442zoijcleaow + ", quantity=" + this.f112440ppxfxbqfkf + ", measureType=" + this.f112441wkgbmnqykc + ", limits=" + this.f112438eablkybsjg + ")";
    }

    public final double wkgbmnqykc() {
        return this.f112440ppxfxbqfkf;
    }

    public final List zoijcleaow() {
        return this.f112438eablkybsjg;
    }
}

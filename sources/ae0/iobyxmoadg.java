package ae0;

import kotlin.jvm.internal.zdlpuopuiu;
import pu.zoijcleaow;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import w30.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements zoijcleaow, ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final MeasureTypeModel f1660cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final double f1661esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f1662iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f1663jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final double f1664lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f1665pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f1666yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f1667zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final ge0.zoijcleaow f1668zynmafqrjb;

    public iobyxmoadg(String itemId, String name, String article, String photoUrl, MeasureTypeModel measureTypeModel, double d13, double d14, boolean z13, ge0.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        this.f1667zdlpuopuiu = itemId;
        this.f1666yggfygwlhe = name;
        this.f1663jyumaefscl = article;
        this.f1662iwizpuwonk = photoUrl;
        this.f1660cqumvgiudr = measureTypeModel;
        this.f1661esjtqupxsv = d13;
        this.f1664lereixgezr = d14;
        this.f1665pmvmpeiblj = z13;
        this.f1668zynmafqrjb = zoijcleaowVar;
    }

    public final double btonecajqb() {
        return this.f1664lereixgezr;
    }

    public final boolean draadjrbmk() {
        return this.f1665pmvmpeiblj;
    }

    public final String dxjokdxxww() {
        return this.f1662iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f1667zdlpuopuiu, iobyxmoadgVar.f1667zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f1666yggfygwlhe, iobyxmoadgVar.f1666yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f1663jyumaefscl, iobyxmoadgVar.f1663jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f1662iwizpuwonk, iobyxmoadgVar.f1662iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f1660cqumvgiudr, iobyxmoadgVar.f1660cqumvgiudr) && Double.compare(this.f1661esjtqupxsv, iobyxmoadgVar.f1661esjtqupxsv) == 0 && Double.compare(this.f1664lereixgezr, iobyxmoadgVar.f1664lereixgezr) == 0 && this.f1665pmvmpeiblj == iobyxmoadgVar.f1665pmvmpeiblj && this.f1668zynmafqrjb == iobyxmoadgVar.f1668zynmafqrjb;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f1667zdlpuopuiu;
    }

    public final double gtknphoqwx() {
        return this.f1661esjtqupxsv;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f1667zdlpuopuiu.hashCode() * 31) + this.f1666yggfygwlhe.hashCode()) * 31) + this.f1663jyumaefscl.hashCode()) * 31) + this.f1662iwizpuwonk.hashCode()) * 31) + this.f1660cqumvgiudr.hashCode()) * 31) + Double.hashCode(this.f1661esjtqupxsv)) * 31) + Double.hashCode(this.f1664lereixgezr)) * 31) + Boolean.hashCode(this.f1665pmvmpeiblj)) * 31;
        ge0.zoijcleaow zoijcleaowVar = this.f1668zynmafqrjb;
        return iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f1663jyumaefscl;
    }

    public final MeasureTypeModel lqeggnwhkg() {
        return this.f1660cqumvgiudr;
    }

    public final String nufgyqmvbu() {
        return this.f1666yggfygwlhe;
    }

    public String toString() {
        return "RestaurantProductUiModel(itemId=" + this.f1667zdlpuopuiu + ", name=" + this.f1666yggfygwlhe + ", article=" + this.f1663jyumaefscl + ", photoUrl=" + this.f1662iwizpuwonk + ", measureTypeModel=" + this.f1660cqumvgiudr + ", weight=" + this.f1661esjtqupxsv + ", price=" + this.f1664lereixgezr + ", isDispPer100=" + this.f1665pmvmpeiblj + ", buyState=" + this.f1668zynmafqrjb + ")";
    }

    public final ge0.zoijcleaow wkgbmnqykc() {
        return this.f1668zynmafqrjb;
    }
}

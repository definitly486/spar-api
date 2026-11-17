package wb1;

import b21.ppxfxbqfkf;
import jt0.zoijcleaow;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements zoijcleaow, ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final MeasureTypeModel f119220cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final double f119221esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f119222iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f119223jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final double f119224lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f119225pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f119226yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f119227zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final bc1.zoijcleaow f119228zynmafqrjb;

    public iobyxmoadg(String itemId, String name, String article, String photoUrl, MeasureTypeModel measureTypeModel, double d13, double d14, boolean z13, bc1.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        this.f119227zdlpuopuiu = itemId;
        this.f119226yggfygwlhe = name;
        this.f119223jyumaefscl = article;
        this.f119222iwizpuwonk = photoUrl;
        this.f119220cqumvgiudr = measureTypeModel;
        this.f119221esjtqupxsv = d13;
        this.f119224lereixgezr = d14;
        this.f119225pmvmpeiblj = z13;
        this.f119228zynmafqrjb = zoijcleaowVar;
    }

    public final double btonecajqb() {
        return this.f119224lereixgezr;
    }

    public final boolean draadjrbmk() {
        return this.f119225pmvmpeiblj;
    }

    public final String dxjokdxxww() {
        return this.f119222iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f119227zdlpuopuiu, iobyxmoadgVar.f119227zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f119226yggfygwlhe, iobyxmoadgVar.f119226yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f119223jyumaefscl, iobyxmoadgVar.f119223jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f119222iwizpuwonk, iobyxmoadgVar.f119222iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f119220cqumvgiudr, iobyxmoadgVar.f119220cqumvgiudr) && Double.compare(this.f119221esjtqupxsv, iobyxmoadgVar.f119221esjtqupxsv) == 0 && Double.compare(this.f119224lereixgezr, iobyxmoadgVar.f119224lereixgezr) == 0 && this.f119225pmvmpeiblj == iobyxmoadgVar.f119225pmvmpeiblj && this.f119228zynmafqrjb == iobyxmoadgVar.f119228zynmafqrjb;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f119227zdlpuopuiu;
    }

    public final double gtknphoqwx() {
        return this.f119221esjtqupxsv;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f119227zdlpuopuiu.hashCode() * 31) + this.f119226yggfygwlhe.hashCode()) * 31) + this.f119223jyumaefscl.hashCode()) * 31) + this.f119222iwizpuwonk.hashCode()) * 31) + this.f119220cqumvgiudr.hashCode()) * 31) + Double.hashCode(this.f119221esjtqupxsv)) * 31) + Double.hashCode(this.f119224lereixgezr)) * 31) + Boolean.hashCode(this.f119225pmvmpeiblj)) * 31;
        bc1.zoijcleaow zoijcleaowVar = this.f119228zynmafqrjb;
        return iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f119223jyumaefscl;
    }

    public final MeasureTypeModel lqeggnwhkg() {
        return this.f119220cqumvgiudr;
    }

    public final String nufgyqmvbu() {
        return this.f119226yggfygwlhe;
    }

    public String toString() {
        return "RestaurantProductUiModel(itemId=" + this.f119227zdlpuopuiu + ", name=" + this.f119226yggfygwlhe + ", article=" + this.f119223jyumaefscl + ", photoUrl=" + this.f119222iwizpuwonk + ", measureTypeModel=" + this.f119220cqumvgiudr + ", weight=" + this.f119221esjtqupxsv + ", price=" + this.f119224lereixgezr + ", isDispPer100=" + this.f119225pmvmpeiblj + ", buyState=" + this.f119228zynmafqrjb + ")";
    }

    public final bc1.zoijcleaow wkgbmnqykc() {
        return this.f119228zynmafqrjb;
    }
}

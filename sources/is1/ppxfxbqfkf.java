package is1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final zoijcleaow f49279cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Double f49280cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Double f49281esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final boolean f49282istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f49283iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f49284jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final String f49285lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f49286pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ColorsUiModel f49287yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f49288zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final String f49289zynmafqrjb;

    public ppxfxbqfkf(String article, ColorsUiModel colorsUiModel, String image, String name, Double d13, Double d14, String str, String desc, String qrCode, boolean z13, zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(desc, "desc");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        this.f49288zdlpuopuiu = article;
        this.f49287yggfygwlhe = colorsUiModel;
        this.f49284jyumaefscl = image;
        this.f49283iwizpuwonk = name;
        this.f49280cqumvgiudr = d13;
        this.f49281esjtqupxsv = d14;
        this.f49285lereixgezr = str;
        this.f49286pmvmpeiblj = desc;
        this.f49289zynmafqrjb = qrCode;
        this.f49282istkbnxepw = z13;
        this.f49279cdpycssgdh = zoijcleaowVar;
    }

    public final Double btonecajqb() {
        return this.f49281esjtqupxsv;
    }

    public final String draadjrbmk() {
        return this.f49289zynmafqrjb;
    }

    public final String dxjokdxxww() {
        return this.f49283iwizpuwonk;
    }

    public final ColorsUiModel eablkybsjg() {
        return this.f49287yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f49288zdlpuopuiu, ppxfxbqfkfVar.f49288zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f49287yggfygwlhe, ppxfxbqfkfVar.f49287yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f49284jyumaefscl, ppxfxbqfkfVar.f49284jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f49283iwizpuwonk, ppxfxbqfkfVar.f49283iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f49280cqumvgiudr, ppxfxbqfkfVar.f49280cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f49281esjtqupxsv, ppxfxbqfkfVar.f49281esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f49285lereixgezr, ppxfxbqfkfVar.f49285lereixgezr) && zdlpuopuiu.eablkybsjg(this.f49286pmvmpeiblj, ppxfxbqfkfVar.f49286pmvmpeiblj) && zdlpuopuiu.eablkybsjg(this.f49289zynmafqrjb, ppxfxbqfkfVar.f49289zynmafqrjb) && this.f49282istkbnxepw == ppxfxbqfkfVar.f49282istkbnxepw && zdlpuopuiu.eablkybsjg(this.f49279cdpycssgdh, ppxfxbqfkfVar.f49279cdpycssgdh);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f49288zdlpuopuiu;
    }

    public final Double gtknphoqwx() {
        return this.f49280cqumvgiudr;
    }

    public int hashCode() {
        int iHashCode = this.f49288zdlpuopuiu.hashCode() * 31;
        ColorsUiModel colorsUiModel = this.f49287yggfygwlhe;
        int iHashCode2 = (((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + this.f49284jyumaefscl.hashCode()) * 31) + this.f49283iwizpuwonk.hashCode()) * 31;
        Double d13 = this.f49280cqumvgiudr;
        int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f49281esjtqupxsv;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.f49285lereixgezr;
        int iHashCode5 = (((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.f49286pmvmpeiblj.hashCode()) * 31) + this.f49289zynmafqrjb.hashCode()) * 31) + Boolean.hashCode(this.f49282istkbnxepw)) * 31;
        zoijcleaow zoijcleaowVar = this.f49279cdpycssgdh;
        return iHashCode5 + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
    }

    public final boolean iobyxmoadg() {
        return this.f49282istkbnxepw;
    }

    public final String lqeggnwhkg() {
        return this.f49286pmvmpeiblj;
    }

    public final String nufgyqmvbu() {
        return this.f49284jyumaefscl;
    }

    public String toString() {
        return "PromoItemUiModel(article=" + this.f49288zdlpuopuiu + ", colorsUiModel=" + this.f49287yggfygwlhe + ", image=" + this.f49284jyumaefscl + ", name=" + this.f49283iwizpuwonk + ", price=" + this.f49280cqumvgiudr + ", oldPrice=" + this.f49281esjtqupxsv + ", unit=" + this.f49285lereixgezr + ", desc=" + this.f49286pmvmpeiblj + ", qrCode=" + this.f49289zynmafqrjb + ", available=" + this.f49282istkbnxepw + ", button=" + this.f49279cdpycssgdh + ")";
    }

    public final String wflxmlrfwp() {
        return this.f49285lereixgezr;
    }

    public final zoijcleaow wkgbmnqykc() {
        return this.f49279cdpycssgdh;
    }
}

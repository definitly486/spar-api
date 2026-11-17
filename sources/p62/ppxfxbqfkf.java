package p62;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final zoijcleaow f75837cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Double f75838cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Double f75839esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final boolean f75840istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f75841iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f75842jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final String f75843lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f75844pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ColorsUiModel f75845yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f75846zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final String f75847zynmafqrjb;

    public ppxfxbqfkf(String article, ColorsUiModel colorsUiModel, String image, String name, Double d13, Double d14, String str, String desc, String qrCode, boolean z13, zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(desc, "desc");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        this.f75846zdlpuopuiu = article;
        this.f75845yggfygwlhe = colorsUiModel;
        this.f75842jyumaefscl = image;
        this.f75841iwizpuwonk = name;
        this.f75838cqumvgiudr = d13;
        this.f75839esjtqupxsv = d14;
        this.f75843lereixgezr = str;
        this.f75844pmvmpeiblj = desc;
        this.f75847zynmafqrjb = qrCode;
        this.f75840istkbnxepw = z13;
        this.f75837cdpycssgdh = zoijcleaowVar;
    }

    public final Double btonecajqb() {
        return this.f75839esjtqupxsv;
    }

    public final String draadjrbmk() {
        return this.f75847zynmafqrjb;
    }

    public final String dxjokdxxww() {
        return this.f75841iwizpuwonk;
    }

    public final ColorsUiModel eablkybsjg() {
        return this.f75845yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f75846zdlpuopuiu, ppxfxbqfkfVar.f75846zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f75845yggfygwlhe, ppxfxbqfkfVar.f75845yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f75842jyumaefscl, ppxfxbqfkfVar.f75842jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f75841iwizpuwonk, ppxfxbqfkfVar.f75841iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f75838cqumvgiudr, ppxfxbqfkfVar.f75838cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f75839esjtqupxsv, ppxfxbqfkfVar.f75839esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f75843lereixgezr, ppxfxbqfkfVar.f75843lereixgezr) && zdlpuopuiu.eablkybsjg(this.f75844pmvmpeiblj, ppxfxbqfkfVar.f75844pmvmpeiblj) && zdlpuopuiu.eablkybsjg(this.f75847zynmafqrjb, ppxfxbqfkfVar.f75847zynmafqrjb) && this.f75840istkbnxepw == ppxfxbqfkfVar.f75840istkbnxepw && zdlpuopuiu.eablkybsjg(this.f75837cdpycssgdh, ppxfxbqfkfVar.f75837cdpycssgdh);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f75846zdlpuopuiu;
    }

    public final Double gtknphoqwx() {
        return this.f75838cqumvgiudr;
    }

    public int hashCode() {
        int iHashCode = this.f75846zdlpuopuiu.hashCode() * 31;
        ColorsUiModel colorsUiModel = this.f75845yggfygwlhe;
        int iHashCode2 = (((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + this.f75842jyumaefscl.hashCode()) * 31) + this.f75841iwizpuwonk.hashCode()) * 31;
        Double d13 = this.f75838cqumvgiudr;
        int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f75839esjtqupxsv;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.f75843lereixgezr;
        int iHashCode5 = (((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.f75844pmvmpeiblj.hashCode()) * 31) + this.f75847zynmafqrjb.hashCode()) * 31) + Boolean.hashCode(this.f75840istkbnxepw)) * 31;
        zoijcleaow zoijcleaowVar = this.f75837cdpycssgdh;
        return iHashCode5 + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
    }

    public final boolean iobyxmoadg() {
        return this.f75840istkbnxepw;
    }

    public final String lqeggnwhkg() {
        return this.f75844pmvmpeiblj;
    }

    public final String nufgyqmvbu() {
        return this.f75842jyumaefscl;
    }

    public String toString() {
        return "PromoItemUiModel(article=" + this.f75846zdlpuopuiu + ", colorsUiModel=" + this.f75845yggfygwlhe + ", image=" + this.f75842jyumaefscl + ", name=" + this.f75841iwizpuwonk + ", price=" + this.f75838cqumvgiudr + ", oldPrice=" + this.f75839esjtqupxsv + ", unit=" + this.f75843lereixgezr + ", desc=" + this.f75844pmvmpeiblj + ", qrCode=" + this.f75847zynmafqrjb + ", available=" + this.f75840istkbnxepw + ", button=" + this.f75837cdpycssgdh + ")";
    }

    public final String wflxmlrfwp() {
        return this.f75843lereixgezr;
    }

    public final zoijcleaow wkgbmnqykc() {
        return this.f75837cdpycssgdh;
    }
}

package o62;

import f40.zoijcleaow;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;
import t40.wkgbmnqykc;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg, wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f72179cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final zoijcleaow f72180esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f72181iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f72182jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final List f72183lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final ColorsUiModel f72184pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f72185yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f72186zdlpuopuiu;

    public iobyxmoadg(String itemId, String title, String buttonText, String action, String reference, zoijcleaow navlink, List products, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f72186zdlpuopuiu = itemId;
        this.f72185yggfygwlhe = title;
        this.f72182jyumaefscl = buttonText;
        this.f72181iwizpuwonk = action;
        this.f72179cqumvgiudr = reference;
        this.f72180esjtqupxsv = navlink;
        this.f72183lereixgezr = products;
        this.f72184pmvmpeiblj = colorsUiModel;
    }

    public final String btonecajqb() {
        return this.f72179cqumvgiudr;
    }

    public final List dxjokdxxww() {
        return this.f72183lereixgezr;
    }

    public final String eablkybsjg() {
        return this.f72182jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f72186zdlpuopuiu, iobyxmoadgVar.f72186zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f72185yggfygwlhe, iobyxmoadgVar.f72185yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f72182jyumaefscl, iobyxmoadgVar.f72182jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f72181iwizpuwonk, iobyxmoadgVar.f72181iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f72179cqumvgiudr, iobyxmoadgVar.f72179cqumvgiudr) && this.f72180esjtqupxsv == iobyxmoadgVar.f72180esjtqupxsv && zdlpuopuiu.eablkybsjg(this.f72183lereixgezr, iobyxmoadgVar.f72183lereixgezr) && zdlpuopuiu.eablkybsjg(this.f72184pmvmpeiblj, iobyxmoadgVar.f72184pmvmpeiblj);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f72186zdlpuopuiu;
    }

    public final String gtknphoqwx() {
        return this.f72185yggfygwlhe;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.f72186zdlpuopuiu.hashCode() * 31) + this.f72185yggfygwlhe.hashCode()) * 31) + this.f72182jyumaefscl.hashCode()) * 31) + this.f72181iwizpuwonk.hashCode()) * 31) + this.f72179cqumvgiudr.hashCode()) * 31) + this.f72180esjtqupxsv.hashCode()) * 31) + this.f72183lereixgezr.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f72184pmvmpeiblj;
        return iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode());
    }

    public final iobyxmoadg iobyxmoadg(String itemId, String title, String buttonText, String action, String reference, zoijcleaow navlink, List products, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(products, "products");
        return new iobyxmoadg(itemId, title, buttonText, action, reference, navlink, products, colorsUiModel);
    }

    public final ColorsUiModel lqeggnwhkg() {
        return this.f72184pmvmpeiblj;
    }

    public final zoijcleaow nufgyqmvbu() {
        return this.f72180esjtqupxsv;
    }

    public String toString() {
        return "ProductListUiModel(itemId=" + this.f72186zdlpuopuiu + ", title=" + this.f72185yggfygwlhe + ", buttonText=" + this.f72182jyumaefscl + ", action=" + this.f72181iwizpuwonk + ", reference=" + this.f72179cqumvgiudr + ", navlink=" + this.f72180esjtqupxsv + ", products=" + this.f72183lereixgezr + ", colorsModel=" + this.f72184pmvmpeiblj + ")";
    }
}

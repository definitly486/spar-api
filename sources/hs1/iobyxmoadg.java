package hs1;

import c31.wkgbmnqykc;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg, wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f41053cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ojitshcjhn f41054esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f41055iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f41056jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final List f41057lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final ColorsUiModel f41058pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f41059yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f41060zdlpuopuiu;

    public iobyxmoadg(String itemId, String title, String buttonText, String action, String reference, ojitshcjhn navlink, List products, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f41060zdlpuopuiu = itemId;
        this.f41059yggfygwlhe = title;
        this.f41056jyumaefscl = buttonText;
        this.f41055iwizpuwonk = action;
        this.f41053cqumvgiudr = reference;
        this.f41054esjtqupxsv = navlink;
        this.f41057lereixgezr = products;
        this.f41058pmvmpeiblj = colorsUiModel;
    }

    public final String btonecajqb() {
        return this.f41053cqumvgiudr;
    }

    public final List dxjokdxxww() {
        return this.f41057lereixgezr;
    }

    public final String eablkybsjg() {
        return this.f41056jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f41060zdlpuopuiu, iobyxmoadgVar.f41060zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f41059yggfygwlhe, iobyxmoadgVar.f41059yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f41056jyumaefscl, iobyxmoadgVar.f41056jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f41055iwizpuwonk, iobyxmoadgVar.f41055iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f41053cqumvgiudr, iobyxmoadgVar.f41053cqumvgiudr) && this.f41054esjtqupxsv == iobyxmoadgVar.f41054esjtqupxsv && zdlpuopuiu.eablkybsjg(this.f41057lereixgezr, iobyxmoadgVar.f41057lereixgezr) && zdlpuopuiu.eablkybsjg(this.f41058pmvmpeiblj, iobyxmoadgVar.f41058pmvmpeiblj);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f41060zdlpuopuiu;
    }

    public final String gtknphoqwx() {
        return this.f41059yggfygwlhe;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.f41060zdlpuopuiu.hashCode() * 31) + this.f41059yggfygwlhe.hashCode()) * 31) + this.f41056jyumaefscl.hashCode()) * 31) + this.f41055iwizpuwonk.hashCode()) * 31) + this.f41053cqumvgiudr.hashCode()) * 31) + this.f41054esjtqupxsv.hashCode()) * 31) + this.f41057lereixgezr.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f41058pmvmpeiblj;
        return iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode());
    }

    public final iobyxmoadg iobyxmoadg(String itemId, String title, String buttonText, String action, String reference, ojitshcjhn navlink, List products, ColorsUiModel colorsUiModel) {
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
        return this.f41058pmvmpeiblj;
    }

    public final ojitshcjhn nufgyqmvbu() {
        return this.f41054esjtqupxsv;
    }

    public String toString() {
        return "ProductListUiModel(itemId=" + this.f41060zdlpuopuiu + ", title=" + this.f41059yggfygwlhe + ", buttonText=" + this.f41056jyumaefscl + ", action=" + this.f41055iwizpuwonk + ", reference=" + this.f41053cqumvgiudr + ", navlink=" + this.f41054esjtqupxsv + ", products=" + this.f41057lereixgezr + ", colorsModel=" + this.f41058pmvmpeiblj + ")";
    }
}

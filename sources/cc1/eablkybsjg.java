package cc1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f19634iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f19635jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f19636yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f19637zdlpuopuiu;

    public eablkybsjg(String itemId, String imageUrl, ColorsUiModel colorsUiModel, String adv) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f19637zdlpuopuiu = itemId;
        this.f19636yggfygwlhe = imageUrl;
        this.f19635jyumaefscl = colorsUiModel;
        this.f19634iwizpuwonk = adv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f19637zdlpuopuiu, eablkybsjgVar.f19637zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f19636yggfygwlhe, eablkybsjgVar.f19636yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f19635jyumaefscl, eablkybsjgVar.f19635jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f19634iwizpuwonk, eablkybsjgVar.f19634iwizpuwonk);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f19637zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f19637zdlpuopuiu.hashCode() * 31) + this.f19636yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f19635jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + this.f19634iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f19634iwizpuwonk;
    }

    public String toString() {
        return "BannerViewUiModel(itemId=" + this.f19637zdlpuopuiu + ", imageUrl=" + this.f19636yggfygwlhe + ", colorsModel=" + this.f19635jyumaefscl + ", adv=" + this.f19634iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f19636yggfygwlhe;
    }

    public /* synthetic */ eablkybsjg(String str, String str2, ColorsUiModel colorsUiModel, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? null : colorsUiModel, str3);
    }
}

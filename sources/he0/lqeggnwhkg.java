package he0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f40106iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f40107jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f40108yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f40109zdlpuopuiu;

    public lqeggnwhkg(String itemId, String imageUrl, ColorsUiModel colorsUiModel, String adv) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f40109zdlpuopuiu = itemId;
        this.f40108yggfygwlhe = imageUrl;
        this.f40107jyumaefscl = colorsUiModel;
        this.f40106iwizpuwonk = adv;
    }

    public final String eablkybsjg() {
        return this.f40108yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f40109zdlpuopuiu, lqeggnwhkgVar.f40109zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f40108yggfygwlhe, lqeggnwhkgVar.f40108yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f40107jyumaefscl, lqeggnwhkgVar.f40107jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f40106iwizpuwonk, lqeggnwhkgVar.f40106iwizpuwonk);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f40109zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f40109zdlpuopuiu.hashCode() * 31) + this.f40108yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f40107jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + this.f40106iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f40106iwizpuwonk;
    }

    public String toString() {
        return "BannerViewUiModel(itemId=" + this.f40109zdlpuopuiu + ", imageUrl=" + this.f40108yggfygwlhe + ", colorsModel=" + this.f40107jyumaefscl + ", adv=" + this.f40106iwizpuwonk + ")";
    }

    public final ColorsUiModel wkgbmnqykc() {
        return this.f40107jyumaefscl;
    }

    public /* synthetic */ lqeggnwhkg(String str, String str2, ColorsUiModel colorsUiModel, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? null : colorsUiModel, str3);
    }
}

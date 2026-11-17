package z62;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ColorsUiModel f129231cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f129232esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final List f129233iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f129234jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final boolean f129235lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f129236pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f129237yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f129238zdlpuopuiu;

    public iobyxmoadg(String itemId, String collectionId, String title, List items, ColorsUiModel colorsUiModel, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f129238zdlpuopuiu = itemId;
        this.f129237yggfygwlhe = collectionId;
        this.f129234jyumaefscl = title;
        this.f129233iwizpuwonk = items;
        this.f129231cqumvgiudr = colorsUiModel;
        this.f129232esjtqupxsv = z13;
        this.f129235lereixgezr = z14;
        this.f129236pmvmpeiblj = z15;
    }

    public final boolean btonecajqb() {
        return this.f129235lereixgezr;
    }

    public final boolean draadjrbmk() {
        return this.f129236pmvmpeiblj;
    }

    public final String dxjokdxxww() {
        return this.f129234jyumaefscl;
    }

    public final String eablkybsjg() {
        return this.f129237yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f129238zdlpuopuiu, iobyxmoadgVar.f129238zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f129237yggfygwlhe, iobyxmoadgVar.f129237yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f129234jyumaefscl, iobyxmoadgVar.f129234jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f129233iwizpuwonk, iobyxmoadgVar.f129233iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f129231cqumvgiudr, iobyxmoadgVar.f129231cqumvgiudr) && this.f129232esjtqupxsv == iobyxmoadgVar.f129232esjtqupxsv && this.f129235lereixgezr == iobyxmoadgVar.f129235lereixgezr && this.f129236pmvmpeiblj == iobyxmoadgVar.f129236pmvmpeiblj;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f129238zdlpuopuiu;
    }

    public final boolean gtknphoqwx() {
        return this.f129232esjtqupxsv;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f129238zdlpuopuiu.hashCode() * 31) + this.f129237yggfygwlhe.hashCode()) * 31) + this.f129234jyumaefscl.hashCode()) * 31) + this.f129233iwizpuwonk.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f129231cqumvgiudr;
        return ((((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f129232esjtqupxsv)) * 31) + Boolean.hashCode(this.f129235lereixgezr)) * 31) + Boolean.hashCode(this.f129236pmvmpeiblj);
    }

    public final iobyxmoadg iobyxmoadg(String itemId, String collectionId, String title, List items, ColorsUiModel colorsUiModel, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        return new iobyxmoadg(itemId, collectionId, title, items, colorsUiModel, z13, z14, z15);
    }

    public final ColorsUiModel lqeggnwhkg() {
        return this.f129231cqumvgiudr;
    }

    public final List nufgyqmvbu() {
        return this.f129233iwizpuwonk;
    }

    public String toString() {
        return "SpecialBannerPromoCollectionUiModel(itemId=" + this.f129238zdlpuopuiu + ", collectionId=" + this.f129237yggfygwlhe + ", title=" + this.f129234jyumaefscl + ", items=" + this.f129233iwizpuwonk + ", colorsUiModel=" + this.f129231cqumvgiudr + ", isNeededPainting=" + this.f129232esjtqupxsv + ", isLoading=" + this.f129235lereixgezr + ", isScrollComplete=" + this.f129236pmvmpeiblj + ")";
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, List list, ColorsUiModel colorsUiModel, boolean z13, boolean z14, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, list, colorsUiModel, z13, (i13 & 64) != 0 ? false : z14, z15);
    }
}

package ss1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ColorsUiModel f108526cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f108527esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final List f108528iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f108529jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final boolean f108530lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f108531pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f108532yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f108533zdlpuopuiu;

    public iobyxmoadg(String itemId, String collectionId, String title, List items, ColorsUiModel colorsUiModel, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f108533zdlpuopuiu = itemId;
        this.f108532yggfygwlhe = collectionId;
        this.f108529jyumaefscl = title;
        this.f108528iwizpuwonk = items;
        this.f108526cqumvgiudr = colorsUiModel;
        this.f108527esjtqupxsv = z13;
        this.f108530lereixgezr = z14;
        this.f108531pmvmpeiblj = z15;
    }

    public final boolean btonecajqb() {
        return this.f108530lereixgezr;
    }

    public final boolean draadjrbmk() {
        return this.f108531pmvmpeiblj;
    }

    public final String dxjokdxxww() {
        return this.f108529jyumaefscl;
    }

    public final String eablkybsjg() {
        return this.f108532yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f108533zdlpuopuiu, iobyxmoadgVar.f108533zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f108532yggfygwlhe, iobyxmoadgVar.f108532yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f108529jyumaefscl, iobyxmoadgVar.f108529jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f108528iwizpuwonk, iobyxmoadgVar.f108528iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f108526cqumvgiudr, iobyxmoadgVar.f108526cqumvgiudr) && this.f108527esjtqupxsv == iobyxmoadgVar.f108527esjtqupxsv && this.f108530lereixgezr == iobyxmoadgVar.f108530lereixgezr && this.f108531pmvmpeiblj == iobyxmoadgVar.f108531pmvmpeiblj;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f108533zdlpuopuiu;
    }

    public final boolean gtknphoqwx() {
        return this.f108527esjtqupxsv;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f108533zdlpuopuiu.hashCode() * 31) + this.f108532yggfygwlhe.hashCode()) * 31) + this.f108529jyumaefscl.hashCode()) * 31) + this.f108528iwizpuwonk.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f108526cqumvgiudr;
        return ((((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f108527esjtqupxsv)) * 31) + Boolean.hashCode(this.f108530lereixgezr)) * 31) + Boolean.hashCode(this.f108531pmvmpeiblj);
    }

    public final iobyxmoadg iobyxmoadg(String itemId, String collectionId, String title, List items, ColorsUiModel colorsUiModel, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        return new iobyxmoadg(itemId, collectionId, title, items, colorsUiModel, z13, z14, z15);
    }

    public final ColorsUiModel lqeggnwhkg() {
        return this.f108526cqumvgiudr;
    }

    public final List nufgyqmvbu() {
        return this.f108528iwizpuwonk;
    }

    public String toString() {
        return "SpecialBannerPromoCollectionUiModel(itemId=" + this.f108533zdlpuopuiu + ", collectionId=" + this.f108532yggfygwlhe + ", title=" + this.f108529jyumaefscl + ", items=" + this.f108528iwizpuwonk + ", colorsUiModel=" + this.f108526cqumvgiudr + ", isNeededPainting=" + this.f108527esjtqupxsv + ", isLoading=" + this.f108530lereixgezr + ", isScrollComplete=" + this.f108531pmvmpeiblj + ")";
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, List list, ColorsUiModel colorsUiModel, boolean z13, boolean z14, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, list, colorsUiModel, z13, (i13 & 64) != 0 ? false : z14, z15);
    }
}

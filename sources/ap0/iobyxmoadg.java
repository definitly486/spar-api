package ap0;

import b21.ppxfxbqfkf;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f14063cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f14064esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f14065iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f14066jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ColorsUiModel f14067lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f14068yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f14069zdlpuopuiu;

    public iobyxmoadg(String itemId, String str, String str2, boolean z13, boolean z14, String adv, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f14069zdlpuopuiu = itemId;
        this.f14068yggfygwlhe = str;
        this.f14066jyumaefscl = str2;
        this.f14065iwizpuwonk = z13;
        this.f14063cqumvgiudr = z14;
        this.f14064esjtqupxsv = adv;
        this.f14067lereixgezr = colorsUiModel;
    }

    public static /* synthetic */ iobyxmoadg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String str, String str2, String str3, boolean z13, boolean z14, String str4, ColorsUiModel colorsUiModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f14069zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f14068yggfygwlhe;
        }
        String str5 = str2;
        if ((i13 & 4) != 0) {
            str3 = iobyxmoadgVar.f14066jyumaefscl;
        }
        String str6 = str3;
        if ((i13 & 8) != 0) {
            z13 = iobyxmoadgVar.f14065iwizpuwonk;
        }
        boolean z15 = z13;
        if ((i13 & 16) != 0) {
            z14 = iobyxmoadgVar.f14063cqumvgiudr;
        }
        boolean z16 = z14;
        if ((i13 & 32) != 0) {
            str4 = iobyxmoadgVar.f14064esjtqupxsv;
        }
        String str7 = str4;
        if ((i13 & 64) != 0) {
            colorsUiModel = iobyxmoadgVar.f14067lereixgezr;
        }
        return iobyxmoadgVar.iobyxmoadg(str, str5, str6, z15, z16, str7, colorsUiModel);
    }

    public final boolean btonecajqb() {
        return this.f14065iwizpuwonk;
    }

    public final String dxjokdxxww() {
        return this.f14068yggfygwlhe;
    }

    public final String eablkybsjg() {
        return this.f14064esjtqupxsv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f14069zdlpuopuiu, iobyxmoadgVar.f14069zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f14068yggfygwlhe, iobyxmoadgVar.f14068yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f14066jyumaefscl, iobyxmoadgVar.f14066jyumaefscl) && this.f14065iwizpuwonk == iobyxmoadgVar.f14065iwizpuwonk && this.f14063cqumvgiudr == iobyxmoadgVar.f14063cqumvgiudr && zdlpuopuiu.eablkybsjg(this.f14064esjtqupxsv, iobyxmoadgVar.f14064esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f14067lereixgezr, iobyxmoadgVar.f14067lereixgezr);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f14069zdlpuopuiu;
    }

    public final boolean gtknphoqwx() {
        return this.f14063cqumvgiudr;
    }

    public int hashCode() {
        int iHashCode = this.f14069zdlpuopuiu.hashCode() * 31;
        String str = this.f14068yggfygwlhe;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14066jyumaefscl;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f14065iwizpuwonk)) * 31) + Boolean.hashCode(this.f14063cqumvgiudr)) * 31) + this.f14064esjtqupxsv.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f14067lereixgezr;
        return iHashCode3 + (colorsUiModel != null ? colorsUiModel.hashCode() : 0);
    }

    public final iobyxmoadg iobyxmoadg(String itemId, String str, String str2, boolean z13, boolean z14, String adv, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(adv, "adv");
        return new iobyxmoadg(itemId, str, str2, z13, z14, adv, colorsUiModel);
    }

    public final ColorsUiModel lqeggnwhkg() {
        return this.f14067lereixgezr;
    }

    public final String nufgyqmvbu() {
        return this.f14066jyumaefscl;
    }

    public String toString() {
        return "CatalogUiModel(itemId=" + this.f14069zdlpuopuiu + ", title=" + this.f14068yggfygwlhe + ", imageUrl=" + this.f14066jyumaefscl + ", isAgeCheckedNeeded=" + this.f14065iwizpuwonk + ", isChecked=" + this.f14063cqumvgiudr + ", adv=" + this.f14064esjtqupxsv + ", colorsUiModel=" + this.f14067lereixgezr + ")";
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, boolean z13, boolean z14, String str4, ColorsUiModel colorsUiModel, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? "" : str4, (i13 & 64) != 0 ? null : colorsUiModel);
    }
}

package oq;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;
import w30.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f74101cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f74102esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f74103iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f74104jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ColorsUiModel f74105lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f74106yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f74107zdlpuopuiu;

    public iobyxmoadg(String itemId, String str, String str2, boolean z13, boolean z14, String adv, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f74107zdlpuopuiu = itemId;
        this.f74106yggfygwlhe = str;
        this.f74104jyumaefscl = str2;
        this.f74103iwizpuwonk = z13;
        this.f74101cqumvgiudr = z14;
        this.f74102esjtqupxsv = adv;
        this.f74105lereixgezr = colorsUiModel;
    }

    public static /* synthetic */ iobyxmoadg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String str, String str2, String str3, boolean z13, boolean z14, String str4, ColorsUiModel colorsUiModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f74107zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f74106yggfygwlhe;
        }
        String str5 = str2;
        if ((i13 & 4) != 0) {
            str3 = iobyxmoadgVar.f74104jyumaefscl;
        }
        String str6 = str3;
        if ((i13 & 8) != 0) {
            z13 = iobyxmoadgVar.f74103iwizpuwonk;
        }
        boolean z15 = z13;
        if ((i13 & 16) != 0) {
            z14 = iobyxmoadgVar.f74101cqumvgiudr;
        }
        boolean z16 = z14;
        if ((i13 & 32) != 0) {
            str4 = iobyxmoadgVar.f74102esjtqupxsv;
        }
        String str7 = str4;
        if ((i13 & 64) != 0) {
            colorsUiModel = iobyxmoadgVar.f74105lereixgezr;
        }
        return iobyxmoadgVar.iobyxmoadg(str, str5, str6, z15, z16, str7, colorsUiModel);
    }

    public final boolean btonecajqb() {
        return this.f74103iwizpuwonk;
    }

    public final String dxjokdxxww() {
        return this.f74106yggfygwlhe;
    }

    public final String eablkybsjg() {
        return this.f74102esjtqupxsv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f74107zdlpuopuiu, iobyxmoadgVar.f74107zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f74106yggfygwlhe, iobyxmoadgVar.f74106yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f74104jyumaefscl, iobyxmoadgVar.f74104jyumaefscl) && this.f74103iwizpuwonk == iobyxmoadgVar.f74103iwizpuwonk && this.f74101cqumvgiudr == iobyxmoadgVar.f74101cqumvgiudr && zdlpuopuiu.eablkybsjg(this.f74102esjtqupxsv, iobyxmoadgVar.f74102esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f74105lereixgezr, iobyxmoadgVar.f74105lereixgezr);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f74107zdlpuopuiu;
    }

    public final boolean gtknphoqwx() {
        return this.f74101cqumvgiudr;
    }

    public int hashCode() {
        int iHashCode = this.f74107zdlpuopuiu.hashCode() * 31;
        String str = this.f74106yggfygwlhe;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74104jyumaefscl;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f74103iwizpuwonk)) * 31) + Boolean.hashCode(this.f74101cqumvgiudr)) * 31) + this.f74102esjtqupxsv.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f74105lereixgezr;
        return iHashCode3 + (colorsUiModel != null ? colorsUiModel.hashCode() : 0);
    }

    public final iobyxmoadg iobyxmoadg(String itemId, String str, String str2, boolean z13, boolean z14, String adv, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(adv, "adv");
        return new iobyxmoadg(itemId, str, str2, z13, z14, adv, colorsUiModel);
    }

    public final ColorsUiModel lqeggnwhkg() {
        return this.f74105lereixgezr;
    }

    public final String nufgyqmvbu() {
        return this.f74104jyumaefscl;
    }

    public String toString() {
        return "CatalogUiModel(itemId=" + this.f74107zdlpuopuiu + ", title=" + this.f74106yggfygwlhe + ", imageUrl=" + this.f74104jyumaefscl + ", isAgeCheckedNeeded=" + this.f74103iwizpuwonk + ", isChecked=" + this.f74101cqumvgiudr + ", adv=" + this.f74102esjtqupxsv + ", colorsUiModel=" + this.f74105lereixgezr + ")";
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, boolean z13, boolean z14, String str4, ColorsUiModel colorsUiModel, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? "" : str4, (i13 & 64) != 0 ? null : colorsUiModel);
    }
}

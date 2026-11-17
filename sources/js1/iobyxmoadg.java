package js1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f52274cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f52275esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ColorsUiModel f52276iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f52277jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f52278yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f52279zdlpuopuiu;

    public iobyxmoadg(String itemId, String answer, String question, ColorsUiModel colorsUiModel, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(answer, "answer");
        zdlpuopuiu.btonecajqb(question, "question");
        this.f52279zdlpuopuiu = itemId;
        this.f52278yggfygwlhe = answer;
        this.f52277jyumaefscl = question;
        this.f52276iwizpuwonk = colorsUiModel;
        this.f52274cqumvgiudr = z13;
        this.f52275esjtqupxsv = z14;
    }

    public static /* synthetic */ iobyxmoadg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String str, String str2, String str3, ColorsUiModel colorsUiModel, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f52279zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f52278yggfygwlhe;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            str3 = iobyxmoadgVar.f52277jyumaefscl;
        }
        String str5 = str3;
        if ((i13 & 8) != 0) {
            colorsUiModel = iobyxmoadgVar.f52276iwizpuwonk;
        }
        ColorsUiModel colorsUiModel2 = colorsUiModel;
        if ((i13 & 16) != 0) {
            z13 = iobyxmoadgVar.f52274cqumvgiudr;
        }
        boolean z15 = z13;
        if ((i13 & 32) != 0) {
            z14 = iobyxmoadgVar.f52275esjtqupxsv;
        }
        return iobyxmoadgVar.iobyxmoadg(str, str4, str5, colorsUiModel2, z15, z14);
    }

    public final boolean btonecajqb() {
        return this.f52274cqumvgiudr;
    }

    public final boolean dxjokdxxww() {
        return this.f52275esjtqupxsv;
    }

    public final String eablkybsjg() {
        return this.f52278yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f52279zdlpuopuiu, iobyxmoadgVar.f52279zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f52278yggfygwlhe, iobyxmoadgVar.f52278yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f52277jyumaefscl, iobyxmoadgVar.f52277jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f52276iwizpuwonk, iobyxmoadgVar.f52276iwizpuwonk) && this.f52274cqumvgiudr == iobyxmoadgVar.f52274cqumvgiudr && this.f52275esjtqupxsv == iobyxmoadgVar.f52275esjtqupxsv;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f52279zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f52279zdlpuopuiu.hashCode() * 31) + this.f52278yggfygwlhe.hashCode()) * 31) + this.f52277jyumaefscl.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f52276iwizpuwonk;
        return ((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f52274cqumvgiudr)) * 31) + Boolean.hashCode(this.f52275esjtqupxsv);
    }

    public final iobyxmoadg iobyxmoadg(String itemId, String answer, String question, ColorsUiModel colorsUiModel, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(answer, "answer");
        zdlpuopuiu.btonecajqb(question, "question");
        return new iobyxmoadg(itemId, answer, question, colorsUiModel, z13, z14);
    }

    public final ColorsUiModel lqeggnwhkg() {
        return this.f52276iwizpuwonk;
    }

    public final String nufgyqmvbu() {
        return this.f52277jyumaefscl;
    }

    public String toString() {
        return "QuestionItemSpecialBannerUiModel(itemId=" + this.f52279zdlpuopuiu + ", answer=" + this.f52278yggfygwlhe + ", question=" + this.f52277jyumaefscl + ", colorsUiModel=" + this.f52276iwizpuwonk + ", isNeededPainting=" + this.f52274cqumvgiudr + ", isExpanded=" + this.f52275esjtqupxsv + ")";
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, ColorsUiModel colorsUiModel, boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, colorsUiModel, z13, (i13 & 32) != 0 ? false : z14);
    }
}

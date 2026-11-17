package q62;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f78016cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f78017esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ColorsUiModel f78018iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f78019jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f78020yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f78021zdlpuopuiu;

    public iobyxmoadg(String itemId, String answer, String question, ColorsUiModel colorsUiModel, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(answer, "answer");
        zdlpuopuiu.btonecajqb(question, "question");
        this.f78021zdlpuopuiu = itemId;
        this.f78020yggfygwlhe = answer;
        this.f78019jyumaefscl = question;
        this.f78018iwizpuwonk = colorsUiModel;
        this.f78016cqumvgiudr = z13;
        this.f78017esjtqupxsv = z14;
    }

    public static /* synthetic */ iobyxmoadg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String str, String str2, String str3, ColorsUiModel colorsUiModel, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f78021zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f78020yggfygwlhe;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            str3 = iobyxmoadgVar.f78019jyumaefscl;
        }
        String str5 = str3;
        if ((i13 & 8) != 0) {
            colorsUiModel = iobyxmoadgVar.f78018iwizpuwonk;
        }
        ColorsUiModel colorsUiModel2 = colorsUiModel;
        if ((i13 & 16) != 0) {
            z13 = iobyxmoadgVar.f78016cqumvgiudr;
        }
        boolean z15 = z13;
        if ((i13 & 32) != 0) {
            z14 = iobyxmoadgVar.f78017esjtqupxsv;
        }
        return iobyxmoadgVar.iobyxmoadg(str, str4, str5, colorsUiModel2, z15, z14);
    }

    public final boolean btonecajqb() {
        return this.f78016cqumvgiudr;
    }

    public final boolean dxjokdxxww() {
        return this.f78017esjtqupxsv;
    }

    public final String eablkybsjg() {
        return this.f78020yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f78021zdlpuopuiu, iobyxmoadgVar.f78021zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f78020yggfygwlhe, iobyxmoadgVar.f78020yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f78019jyumaefscl, iobyxmoadgVar.f78019jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f78018iwizpuwonk, iobyxmoadgVar.f78018iwizpuwonk) && this.f78016cqumvgiudr == iobyxmoadgVar.f78016cqumvgiudr && this.f78017esjtqupxsv == iobyxmoadgVar.f78017esjtqupxsv;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f78021zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f78021zdlpuopuiu.hashCode() * 31) + this.f78020yggfygwlhe.hashCode()) * 31) + this.f78019jyumaefscl.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f78018iwizpuwonk;
        return ((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f78016cqumvgiudr)) * 31) + Boolean.hashCode(this.f78017esjtqupxsv);
    }

    public final iobyxmoadg iobyxmoadg(String itemId, String answer, String question, ColorsUiModel colorsUiModel, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(answer, "answer");
        zdlpuopuiu.btonecajqb(question, "question");
        return new iobyxmoadg(itemId, answer, question, colorsUiModel, z13, z14);
    }

    public final ColorsUiModel lqeggnwhkg() {
        return this.f78018iwizpuwonk;
    }

    public final String nufgyqmvbu() {
        return this.f78019jyumaefscl;
    }

    public String toString() {
        return "QuestionItemSpecialBannerUiModel(itemId=" + this.f78021zdlpuopuiu + ", answer=" + this.f78020yggfygwlhe + ", question=" + this.f78019jyumaefscl + ", colorsUiModel=" + this.f78018iwizpuwonk + ", isNeededPainting=" + this.f78016cqumvgiudr + ", isExpanded=" + this.f78017esjtqupxsv + ")";
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, ColorsUiModel colorsUiModel, boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, colorsUiModel, z13, (i13 & 32) != 0 ? false : z14);
    }
}

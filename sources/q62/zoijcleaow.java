package q62;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f78024iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f78025ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ColorsUiModel f78026zoijcleaow;

    public zoijcleaow(List items, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f78024iobyxmoadg = items;
        this.f78026zoijcleaow = colorsUiModel;
        this.f78025ppxfxbqfkf = z13;
    }

    public static /* synthetic */ zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar, List list, ColorsUiModel colorsUiModel, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = zoijcleaowVar.f78024iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            colorsUiModel = zoijcleaowVar.f78026zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z13 = zoijcleaowVar.f78025ppxfxbqfkf;
        }
        return zoijcleaowVar.iobyxmoadg(list, colorsUiModel, z13);
    }

    public final boolean eablkybsjg() {
        return this.f78025ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f78024iobyxmoadg, zoijcleaowVar.f78024iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f78026zoijcleaow, zoijcleaowVar.f78026zoijcleaow) && this.f78025ppxfxbqfkf == zoijcleaowVar.f78025ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = this.f78024iobyxmoadg.hashCode() * 31;
        ColorsUiModel colorsUiModel = this.f78026zoijcleaow;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f78025ppxfxbqfkf);
    }

    public final zoijcleaow iobyxmoadg(List items, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(items, "items");
        return new zoijcleaow(items, colorsUiModel, z13);
    }

    public final ColorsUiModel ppxfxbqfkf() {
        return this.f78026zoijcleaow;
    }

    public String toString() {
        return "QuestionItemsSpecialBannerUiModel(items=" + this.f78024iobyxmoadg + ", colorsUiModel=" + this.f78026zoijcleaow + ", isNeededPainting=" + this.f78025ppxfxbqfkf + ")";
    }

    public final List wkgbmnqykc() {
        return this.f78024iobyxmoadg;
    }
}

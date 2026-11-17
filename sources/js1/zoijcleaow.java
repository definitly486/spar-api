package js1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f52282iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f52283ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ColorsUiModel f52284zoijcleaow;

    public zoijcleaow(List items, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f52282iobyxmoadg = items;
        this.f52284zoijcleaow = colorsUiModel;
        this.f52283ppxfxbqfkf = z13;
    }

    public static /* synthetic */ zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar, List list, ColorsUiModel colorsUiModel, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = zoijcleaowVar.f52282iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            colorsUiModel = zoijcleaowVar.f52284zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z13 = zoijcleaowVar.f52283ppxfxbqfkf;
        }
        return zoijcleaowVar.iobyxmoadg(list, colorsUiModel, z13);
    }

    public final boolean eablkybsjg() {
        return this.f52283ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f52282iobyxmoadg, zoijcleaowVar.f52282iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f52284zoijcleaow, zoijcleaowVar.f52284zoijcleaow) && this.f52283ppxfxbqfkf == zoijcleaowVar.f52283ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = this.f52282iobyxmoadg.hashCode() * 31;
        ColorsUiModel colorsUiModel = this.f52284zoijcleaow;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f52283ppxfxbqfkf);
    }

    public final zoijcleaow iobyxmoadg(List items, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(items, "items");
        return new zoijcleaow(items, colorsUiModel, z13);
    }

    public final ColorsUiModel ppxfxbqfkf() {
        return this.f52284zoijcleaow;
    }

    public String toString() {
        return "QuestionItemsSpecialBannerUiModel(items=" + this.f52282iobyxmoadg + ", colorsUiModel=" + this.f52284zoijcleaow + ", isNeededPainting=" + this.f52283ppxfxbqfkf + ")";
    }

    public final List wkgbmnqykc() {
        return this.f52282iobyxmoadg;
    }
}

package rq;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v00.ppxfxbqfkf f83583iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ColorsUiModel.Hex f83584ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f83585zoijcleaow;

    public lqeggnwhkg(v00.ppxfxbqfkf selected, List supportedTypes, ColorsUiModel.Hex hex) {
        zdlpuopuiu.btonecajqb(selected, "selected");
        zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
        this.f83583iobyxmoadg = selected;
        this.f83585zoijcleaow = supportedTypes;
        this.f83584ppxfxbqfkf = hex;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f83583iobyxmoadg == lqeggnwhkgVar.f83583iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f83585zoijcleaow, lqeggnwhkgVar.f83585zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83584ppxfxbqfkf, lqeggnwhkgVar.f83584ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f83583iobyxmoadg.hashCode() * 31) + this.f83585zoijcleaow.hashCode()) * 31;
        ColorsUiModel.Hex hex = this.f83584ppxfxbqfkf;
        return iHashCode + (hex == null ? 0 : hex.hashCode());
    }

    public final ColorsUiModel.Hex iobyxmoadg() {
        return this.f83584ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f83585zoijcleaow;
    }

    public String toString() {
        return "Model(selected=" + this.f83583iobyxmoadg + ", supportedTypes=" + this.f83585zoijcleaow + ", colorsUiModel=" + this.f83584ppxfxbqfkf + ")";
    }

    public final v00.ppxfxbqfkf zoijcleaow() {
        return this.f83583iobyxmoadg;
    }
}

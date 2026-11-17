package dp0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final mz0.ppxfxbqfkf f29289iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ColorsUiModel.Hex f29290ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f29291zoijcleaow;

    public lqeggnwhkg(mz0.ppxfxbqfkf selected, List supportedTypes, ColorsUiModel.Hex hex) {
        zdlpuopuiu.btonecajqb(selected, "selected");
        zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
        this.f29289iobyxmoadg = selected;
        this.f29291zoijcleaow = supportedTypes;
        this.f29290ppxfxbqfkf = hex;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f29289iobyxmoadg == lqeggnwhkgVar.f29289iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f29291zoijcleaow, lqeggnwhkgVar.f29291zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f29290ppxfxbqfkf, lqeggnwhkgVar.f29290ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f29289iobyxmoadg.hashCode() * 31) + this.f29291zoijcleaow.hashCode()) * 31;
        ColorsUiModel.Hex hex = this.f29290ppxfxbqfkf;
        return iHashCode + (hex == null ? 0 : hex.hashCode());
    }

    public final ColorsUiModel.Hex iobyxmoadg() {
        return this.f29290ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f29291zoijcleaow;
    }

    public String toString() {
        return "Model(selected=" + this.f29289iobyxmoadg + ", supportedTypes=" + this.f29291zoijcleaow + ", colorsUiModel=" + this.f29290ppxfxbqfkf + ")";
    }

    public final mz0.ppxfxbqfkf zoijcleaow() {
        return this.f29289iobyxmoadg;
    }
}

package rp1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f83574iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f83575ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ScanGoProductUiModel f83576wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f83577zoijcleaow;

    public lqeggnwhkg(boolean z13, int i13, String warningMessage, ScanGoProductUiModel product) {
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        zdlpuopuiu.btonecajqb(product, "product");
        this.f83574iobyxmoadg = z13;
        this.f83577zoijcleaow = i13;
        this.f83575ppxfxbqfkf = warningMessage;
        this.f83576wkgbmnqykc = product;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f83574iobyxmoadg == lqeggnwhkgVar.f83574iobyxmoadg && this.f83577zoijcleaow == lqeggnwhkgVar.f83577zoijcleaow && zdlpuopuiu.eablkybsjg(this.f83575ppxfxbqfkf, lqeggnwhkgVar.f83575ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f83576wkgbmnqykc, lqeggnwhkgVar.f83576wkgbmnqykc);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f83574iobyxmoadg) * 31) + Integer.hashCode(this.f83577zoijcleaow)) * 31) + this.f83575ppxfxbqfkf.hashCode()) * 31) + this.f83576wkgbmnqykc.hashCode();
    }

    public final ScanGoProductUiModel iobyxmoadg() {
        return this.f83576wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f83574iobyxmoadg + ", productId=" + this.f83577zoijcleaow + ", warningMessage=" + this.f83575ppxfxbqfkf + ", product=" + this.f83576wkgbmnqykc + ")";
    }
}

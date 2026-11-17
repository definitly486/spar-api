package v32;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f115934iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f115935ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ScanGoProductUiModel f115936wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f115937zoijcleaow;

    public lqeggnwhkg(boolean z13, int i13, String warningMessage, ScanGoProductUiModel product) {
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        zdlpuopuiu.btonecajqb(product, "product");
        this.f115934iobyxmoadg = z13;
        this.f115937zoijcleaow = i13;
        this.f115935ppxfxbqfkf = warningMessage;
        this.f115936wkgbmnqykc = product;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f115934iobyxmoadg == lqeggnwhkgVar.f115934iobyxmoadg && this.f115937zoijcleaow == lqeggnwhkgVar.f115937zoijcleaow && zdlpuopuiu.eablkybsjg(this.f115935ppxfxbqfkf, lqeggnwhkgVar.f115935ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f115936wkgbmnqykc, lqeggnwhkgVar.f115936wkgbmnqykc);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f115934iobyxmoadg) * 31) + Integer.hashCode(this.f115937zoijcleaow)) * 31) + this.f115935ppxfxbqfkf.hashCode()) * 31) + this.f115936wkgbmnqykc.hashCode();
    }

    public final ScanGoProductUiModel iobyxmoadg() {
        return this.f115936wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f115934iobyxmoadg + ", productId=" + this.f115937zoijcleaow + ", warningMessage=" + this.f115935ppxfxbqfkf + ", product=" + this.f115936wkgbmnqykc + ")";
    }
}

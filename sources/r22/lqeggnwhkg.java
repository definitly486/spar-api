package r22;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f81484iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f81485ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ScanGoProductUiModel f81486zoijcleaow;

    public lqeggnwhkg(boolean z13, ScanGoProductUiModel product, boolean z14) {
        zdlpuopuiu.btonecajqb(product, "product");
        this.f81484iobyxmoadg = z13;
        this.f81486zoijcleaow = product;
        this.f81485ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f81484iobyxmoadg == lqeggnwhkgVar.f81484iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f81486zoijcleaow, lqeggnwhkgVar.f81486zoijcleaow) && this.f81485ppxfxbqfkf == lqeggnwhkgVar.f81485ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f81484iobyxmoadg) * 31) + this.f81486zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f81485ppxfxbqfkf);
    }

    public final ScanGoProductUiModel iobyxmoadg() {
        return this.f81486zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f81484iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f81484iobyxmoadg + ", product=" + this.f81486zoijcleaow + ", isFirstMessage=" + this.f81485ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f81485ppxfxbqfkf;
    }
}

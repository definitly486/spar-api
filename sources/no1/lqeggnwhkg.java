package no1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f70471iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f70472ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ScanGoProductUiModel f70473zoijcleaow;

    public lqeggnwhkg(boolean z13, ScanGoProductUiModel product, boolean z14) {
        zdlpuopuiu.btonecajqb(product, "product");
        this.f70471iobyxmoadg = z13;
        this.f70473zoijcleaow = product;
        this.f70472ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f70471iobyxmoadg == lqeggnwhkgVar.f70471iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f70473zoijcleaow, lqeggnwhkgVar.f70473zoijcleaow) && this.f70472ppxfxbqfkf == lqeggnwhkgVar.f70472ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f70471iobyxmoadg) * 31) + this.f70473zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f70472ppxfxbqfkf);
    }

    public final ScanGoProductUiModel iobyxmoadg() {
        return this.f70473zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f70471iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f70471iobyxmoadg + ", product=" + this.f70473zoijcleaow + ", isFirstMessage=" + this.f70472ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f70472ppxfxbqfkf;
    }
}

package go0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f37997iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f37998ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ProductCardEvent f37999zoijcleaow;

    public ppxfxbqfkf(String productId, ProductCardEvent productCardEvent, String str) {
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
        this.f37997iobyxmoadg = productId;
        this.f37999zoijcleaow = productCardEvent;
        this.f37998ppxfxbqfkf = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f37997iobyxmoadg, ppxfxbqfkfVar.f37997iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f37999zoijcleaow, ppxfxbqfkfVar.f37999zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f37998ppxfxbqfkf, ppxfxbqfkfVar.f37998ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f37997iobyxmoadg.hashCode() * 31) + this.f37999zoijcleaow.hashCode()) * 31;
        String str = this.f37998ppxfxbqfkf;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final ProductCardEvent iobyxmoadg() {
        return this.f37999zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f37998ppxfxbqfkf;
    }

    public String toString() {
        return "OnProductChangeParams(productId=" + this.f37997iobyxmoadg + ", productCardEvent=" + this.f37999zoijcleaow + ", sectionId=" + this.f37998ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f37997iobyxmoadg;
    }

    public /* synthetic */ ppxfxbqfkf(String str, ProductCardEvent productCardEvent, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, productCardEvent, (i13 & 4) != 0 ? null : str2);
    }
}

package nt0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements jt0.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f71003jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f71004yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ProductUiModel f71005zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public ppxfxbqfkf(ProductUiModel promoItem, String str) {
        zdlpuopuiu.btonecajqb(promoItem, "promoItem");
        this.f71005zdlpuopuiu = promoItem;
        this.f71004yggfygwlhe = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f71005zdlpuopuiu, ppxfxbqfkfVar.f71005zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f71004yggfygwlhe, ppxfxbqfkfVar.f71004yggfygwlhe);
    }

    public int hashCode() {
        int iHashCode = this.f71005zdlpuopuiu.hashCode() * 31;
        String str = this.f71004yggfygwlhe;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f71004yggfygwlhe;
    }

    public String toString() {
        return "PromoProductSection(promoItem=" + this.f71005zdlpuopuiu + ", backgroundColor=" + this.f71004yggfygwlhe + ")";
    }

    public final ProductUiModel zoijcleaow() {
        return this.f71005zdlpuopuiu;
    }
}

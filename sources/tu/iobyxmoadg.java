package tu;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.product.ProductUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements pu.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final C2742iobyxmoadg f111537jyumaefscl = new C2742iobyxmoadg(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f111538yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ProductUiModel f111539zdlpuopuiu;

    /* JADX INFO: renamed from: tu.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2742iobyxmoadg {
        public /* synthetic */ C2742iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2742iobyxmoadg() {
        }
    }

    public iobyxmoadg(ProductUiModel promoItem, String str) {
        zdlpuopuiu.btonecajqb(promoItem, "promoItem");
        this.f111539zdlpuopuiu = promoItem;
        this.f111538yggfygwlhe = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f111539zdlpuopuiu, iobyxmoadgVar.f111539zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f111538yggfygwlhe, iobyxmoadgVar.f111538yggfygwlhe);
    }

    public int hashCode() {
        int iHashCode = this.f111539zdlpuopuiu.hashCode() * 31;
        String str = this.f111538yggfygwlhe;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f111538yggfygwlhe;
    }

    public String toString() {
        return "PromoProductSection(promoItem=" + this.f111539zdlpuopuiu + ", backgroundColor=" + this.f111538yggfygwlhe + ")";
    }

    public final ProductUiModel zoijcleaow() {
        return this.f111539zdlpuopuiu;
    }
}

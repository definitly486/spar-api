package z51;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f129138iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f129139iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(ComboSetProduct product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f129139iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f129139iobyxmoadg, ((ppxfxbqfkf) obj).f129139iobyxmoadg);
        }

        public int hashCode() {
            return this.f129139iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f129139iobyxmoadg;
        }

        public String toString() {
            return "OnProductsFirstClicked(product=" + this.f129139iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: z51.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C3276wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f129140iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3276wkgbmnqykc(ComboSetProduct product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f129140iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3276wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f129140iobyxmoadg, ((C3276wkgbmnqykc) obj).f129140iobyxmoadg);
        }

        public int hashCode() {
            return this.f129140iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f129140iobyxmoadg;
        }

        public String toString() {
            return "OnProductsSecondClicked(product=" + this.f129140iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f129141iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

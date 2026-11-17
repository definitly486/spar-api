package k70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f54110iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f54111iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(ComboSetProduct product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f54111iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f54111iobyxmoadg, ((ppxfxbqfkf) obj).f54111iobyxmoadg);
        }

        public int hashCode() {
            return this.f54111iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f54111iobyxmoadg;
        }

        public String toString() {
            return "OnProductsFirstClicked(product=" + this.f54111iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: k70.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1161wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f54112iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1161wkgbmnqykc(ComboSetProduct product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f54112iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1161wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f54112iobyxmoadg, ((C1161wkgbmnqykc) obj).f54112iobyxmoadg);
        }

        public int hashCode() {
            return this.f54112iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f54112iobyxmoadg;
        }

        public String toString() {
            return "OnProductsSecondClicked(product=" + this.f54112iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f54113iobyxmoadg = new zoijcleaow();

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

package ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f88595iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f88596iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(ComboSetProduct product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f88596iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f88596iobyxmoadg, ((ppxfxbqfkf) obj).f88596iobyxmoadg);
        }

        public int hashCode() {
            return this.f88596iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f88596iobyxmoadg;
        }

        public String toString() {
            return "OnProductsFirstClicked(product=" + this.f88596iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f88597iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(ComboSetProduct product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f88597iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f88597iobyxmoadg, ((wkgbmnqykc) obj).f88597iobyxmoadg);
        }

        public int hashCode() {
            return this.f88597iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f88597iobyxmoadg;
        }

        public String toString() {
            return "OnProductsSecondClicked(product=" + this.f88597iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2032zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2032zoijcleaow f88598iobyxmoadg = new C2032zoijcleaow();

        private C2032zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}

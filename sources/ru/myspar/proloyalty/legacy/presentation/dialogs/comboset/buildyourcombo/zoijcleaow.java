package ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96402iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f96403iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(ComboSetProduct product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f96403iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f96403iobyxmoadg, ((ppxfxbqfkf) obj).f96403iobyxmoadg);
        }

        public int hashCode() {
            return this.f96403iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f96403iobyxmoadg;
        }

        public String toString() {
            return "OnProductsFirstClicked(product=" + this.f96403iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f96404iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(ComboSetProduct product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f96404iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f96404iobyxmoadg, ((wkgbmnqykc) obj).f96404iobyxmoadg);
        }

        public int hashCode() {
            return this.f96404iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f96404iobyxmoadg;
        }

        public String toString() {
            return "OnProductsSecondClicked(product=" + this.f96404iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2277zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2277zoijcleaow f96405iobyxmoadg = new C2277zoijcleaow();

        private C2277zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}

package ru.myspar.proloyalty.evropolis.impl.gift.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class eablkybsjg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96163iobyxmoadg;

        public eablkybsjg(String id2) {
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f96163iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f96163iobyxmoadg, ((eablkybsjg) obj).f96163iobyxmoadg);
        }

        public int hashCode() {
            return this.f96163iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96163iobyxmoadg;
        }

        public String toString() {
            return "OnTabSelected(id=" + this.f96163iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96164iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f96165iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f96166iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.evropolis.impl.gift.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2270zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f96167iobyxmoadg;

        public C2270zoijcleaow(ProductUiModel product) {
            zdlpuopuiu.btonecajqb(product, "product");
            this.f96167iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2270zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f96167iobyxmoadg, ((C2270zoijcleaow) obj).f96167iobyxmoadg);
        }

        public int hashCode() {
            return this.f96167iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f96167iobyxmoadg;
        }

        public String toString() {
            return "OnProductActionClicked(product=" + this.f96167iobyxmoadg + ")";
        }
    }
}

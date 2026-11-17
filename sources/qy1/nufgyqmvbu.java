package qy1;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nufgyqmvbu {

    public static final class eablkybsjg extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qy1.iobyxmoadg f81002iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(qy1.iobyxmoadg params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f81002iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f81002iobyxmoadg, ((eablkybsjg) obj).f81002iobyxmoadg);
        }

        public int hashCode() {
            return this.f81002iobyxmoadg.hashCode();
        }

        public final qy1.iobyxmoadg iobyxmoadg() {
            return this.f81002iobyxmoadg;
        }

        public String toString() {
            return "OnCleaningCartButtonClicked(params=" + this.f81002iobyxmoadg + ")";
        }
    }

    public static abstract class iobyxmoadg extends nufgyqmvbu {

        /* JADX INFO: renamed from: qy1.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1805iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f81003iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final AnalyticElement.ProductItemElement f81004zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1805iobyxmoadg(String article, AnalyticElement.ProductItemElement productItemElement) {
                super(null);
                zdlpuopuiu.btonecajqb(article, "article");
                zdlpuopuiu.btonecajqb(productItemElement, "productItemElement");
                this.f81003iobyxmoadg = article;
                this.f81004zoijcleaow = productItemElement;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1805iobyxmoadg)) {
                    return false;
                }
                C1805iobyxmoadg c1805iobyxmoadg = (C1805iobyxmoadg) obj;
                return zdlpuopuiu.eablkybsjg(this.f81003iobyxmoadg, c1805iobyxmoadg.f81003iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81004zoijcleaow, c1805iobyxmoadg.f81004zoijcleaow);
            }

            public int hashCode() {
                return (this.f81003iobyxmoadg.hashCode() * 31) + this.f81004zoijcleaow.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f81003iobyxmoadg;
            }

            public String toString() {
                return "OnProductClicked(article=" + this.f81003iobyxmoadg + ", productItemElement=" + this.f81004zoijcleaow + ")";
            }

            public final AnalyticElement.ProductItemElement zoijcleaow() {
                return this.f81004zoijcleaow;
            }
        }

        public static final class ppxfxbqfkf extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f81005iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final int f81006zoijcleaow;

            public /* synthetic */ ppxfxbqfkf(String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this(str, i13);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ppxfxbqfkf)) {
                    return false;
                }
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
                return zdlpuopuiu.eablkybsjg(this.f81005iobyxmoadg, ppxfxbqfkfVar.f81005iobyxmoadg) && this.f81006zoijcleaow == ppxfxbqfkfVar.f81006zoijcleaow;
            }

            public int hashCode() {
                return (this.f81005iobyxmoadg.hashCode() * 31) + pmvmpeiblj.wkgbmnqykc(this.f81006zoijcleaow);
            }

            public final String iobyxmoadg() {
                return this.f81005iobyxmoadg;
            }

            public String toString() {
                return "OnSetRatingClicked(article=" + this.f81005iobyxmoadg + ", rating=" + pmvmpeiblj.eablkybsjg(this.f81006zoijcleaow) + ")";
            }

            public final int zoijcleaow() {
                return this.f81006zoijcleaow;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private ppxfxbqfkf(String article, int i13) {
                super(null);
                zdlpuopuiu.btonecajqb(article, "article");
                this.f81005iobyxmoadg = article;
                this.f81006zoijcleaow = i13;
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f81007iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return 795575292;
            }

            public String toString() {
                return "OnRepeatPurchaseClicked";
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qy1.iobyxmoadg f81008iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(qy1.iobyxmoadg params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f81008iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f81008iobyxmoadg, ((ppxfxbqfkf) obj).f81008iobyxmoadg);
        }

        public int hashCode() {
            return this.f81008iobyxmoadg.hashCode();
        }

        public final qy1.iobyxmoadg iobyxmoadg() {
            return this.f81008iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f81008iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f81009iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 709834739;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class zoijcleaow extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qy1.iobyxmoadg.zoijcleaow f81010iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(qy1.iobyxmoadg.zoijcleaow params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f81010iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f81010iobyxmoadg, ((zoijcleaow) obj).f81010iobyxmoadg);
        }

        public int hashCode() {
            return this.f81010iobyxmoadg.hashCode();
        }

        public final qy1.iobyxmoadg.zoijcleaow iobyxmoadg() {
            return this.f81010iobyxmoadg;
        }

        public String toString() {
            return "OnAddToCartClicked(params=" + this.f81010iobyxmoadg + ")";
        }
    }

    public /* synthetic */ nufgyqmvbu(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private nufgyqmvbu() {
    }
}

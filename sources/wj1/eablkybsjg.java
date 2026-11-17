package wj1;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static abstract class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: wj1.eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3000iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f119995iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final AnalyticElement.ProductItemElement f119996zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3000iobyxmoadg(String article, AnalyticElement.ProductItemElement productItemElement) {
                super(null);
                zdlpuopuiu.btonecajqb(article, "article");
                zdlpuopuiu.btonecajqb(productItemElement, "productItemElement");
                this.f119995iobyxmoadg = article;
                this.f119996zoijcleaow = productItemElement;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3000iobyxmoadg)) {
                    return false;
                }
                C3000iobyxmoadg c3000iobyxmoadg = (C3000iobyxmoadg) obj;
                return zdlpuopuiu.eablkybsjg(this.f119995iobyxmoadg, c3000iobyxmoadg.f119995iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f119996zoijcleaow, c3000iobyxmoadg.f119996zoijcleaow);
            }

            public int hashCode() {
                return (this.f119995iobyxmoadg.hashCode() * 31) + this.f119996zoijcleaow.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f119995iobyxmoadg;
            }

            public String toString() {
                return "OnProductClicked(article=" + this.f119995iobyxmoadg + ", productItemElement=" + this.f119996zoijcleaow + ")";
            }

            public final AnalyticElement.ProductItemElement zoijcleaow() {
                return this.f119996zoijcleaow;
            }
        }

        public static final class ppxfxbqfkf extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f119997iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final int f119998zoijcleaow;

            public /* synthetic */ ppxfxbqfkf(String str, int i13, gtknphoqwx gtknphoqwxVar) {
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
                return zdlpuopuiu.eablkybsjg(this.f119997iobyxmoadg, ppxfxbqfkfVar.f119997iobyxmoadg) && this.f119998zoijcleaow == ppxfxbqfkfVar.f119998zoijcleaow;
            }

            public int hashCode() {
                return (this.f119997iobyxmoadg.hashCode() * 31) + pmvmpeiblj.wkgbmnqykc(this.f119998zoijcleaow);
            }

            public final String iobyxmoadg() {
                return this.f119997iobyxmoadg;
            }

            public String toString() {
                return "OnSetRatingClicked(article=" + this.f119997iobyxmoadg + ", rating=" + pmvmpeiblj.eablkybsjg(this.f119998zoijcleaow) + ")";
            }

            public final int zoijcleaow() {
                return this.f119998zoijcleaow;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private ppxfxbqfkf(String article, int i13) {
                super(null);
                zdlpuopuiu.btonecajqb(article, "article");
                this.f119997iobyxmoadg = article;
                this.f119998zoijcleaow = i13;
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f119999iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return 1730779935;
            }

            public String toString() {
                return "OnRepeatPurchaseClicked";
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f120000iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1092799088;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wj1.iobyxmoadg f120001iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(wj1.iobyxmoadg params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f120001iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f120001iobyxmoadg, ((wkgbmnqykc) obj).f120001iobyxmoadg);
        }

        public int hashCode() {
            return this.f120001iobyxmoadg.hashCode();
        }

        public final wj1.iobyxmoadg iobyxmoadg() {
            return this.f120001iobyxmoadg;
        }

        public String toString() {
            return "OnCleaningCartButtonClicked(params=" + this.f120001iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wj1.iobyxmoadg.zoijcleaow f120002iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(wj1.iobyxmoadg.zoijcleaow params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f120002iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f120002iobyxmoadg, ((zoijcleaow) obj).f120002iobyxmoadg);
        }

        public int hashCode() {
            return this.f120002iobyxmoadg.hashCode();
        }

        public final wj1.iobyxmoadg.zoijcleaow iobyxmoadg() {
            return this.f120002iobyxmoadg;
        }

        public String toString() {
            return "OnAddToCartClicked(params=" + this.f120002iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

package ru.myspar.proloyalty.purchases.impl.list_details.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class agtfadlqog extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f99748iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f99749zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(HintUiModel hint, AnalyticElement analyticElement) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f99748iobyxmoadg = hint;
            this.f99749zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return zdlpuopuiu.eablkybsjg(this.f99748iobyxmoadg, agtfadlqogVar.f99748iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99749zoijcleaow, agtfadlqogVar.f99749zoijcleaow);
        }

        public int hashCode() {
            return (this.f99748iobyxmoadg.hashCode() * 31) + this.f99749zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f99749zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f99748iobyxmoadg + ", analyticElement=" + this.f99749zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f99748iobyxmoadg;
        }
    }

    public static final class btonecajqb extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99750iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(String productId) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f99750iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f99750iobyxmoadg, ((btonecajqb) obj).f99750iobyxmoadg);
        }

        public int hashCode() {
            return this.f99750iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99750iobyxmoadg;
        }

        public String toString() {
            return "OnClickedChangeProductFavoriteState(productId=" + this.f99750iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99751iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f99751iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f99751iobyxmoadg, ((draadjrbmk) obj).f99751iobyxmoadg);
        }

        public int hashCode() {
            return this.f99751iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99751iobyxmoadg;
        }

        public String toString() {
            return "OnDecreaseClick(productArticle=" + this.f99751iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99752iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f99752iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f99752iobyxmoadg, ((dxjokdxxww) obj).f99752iobyxmoadg);
        }

        public int hashCode() {
            return this.f99752iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99752iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductMeasureType(productArticle=" + this.f99752iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f99753iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1706228121;
        }

        public String toString() {
            return "OnBtnNavigateToCatalogClicked";
        }
    }

    public static final class gtknphoqwx extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99754iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final gk1.iobyxmoadg f99755zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(String str, gk1.iobyxmoadg sectionDeleteFrom) {
            super(null);
            zdlpuopuiu.btonecajqb(sectionDeleteFrom, "sectionDeleteFrom");
            this.f99754iobyxmoadg = str;
            this.f99755zoijcleaow = sectionDeleteFrom;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return zdlpuopuiu.eablkybsjg(this.f99754iobyxmoadg, gtknphoqwxVar.f99754iobyxmoadg) && this.f99755zoijcleaow == gtknphoqwxVar.f99755zoijcleaow;
        }

        public int hashCode() {
            String str = this.f99754iobyxmoadg;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f99755zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99754iobyxmoadg;
        }

        public String toString() {
            return "OnConfirmDeleteProductFromList(productId=" + this.f99754iobyxmoadg + ", sectionDeleteFrom=" + this.f99755zoijcleaow + ")";
        }

        public final gk1.iobyxmoadg zoijcleaow() {
            return this.f99755zoijcleaow;
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f99756iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 2131347936;
        }

        public String toString() {
            return "OnBtnSearchClicked";
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99757iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f99757iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99757iobyxmoadg, ((iobyxmoadg) obj).f99757iobyxmoadg);
        }

        public int hashCode() {
            return this.f99757iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99757iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToCartClicked(productArticle=" + this.f99757iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f99758iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 856475303;
        }

        public String toString() {
            return "OnBtnShareClicked";
        }
    }

    public static final class nufgyqmvbu extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99759iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f99760zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String productArticle, double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f99759iobyxmoadg = productArticle;
            this.f99760zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f99759iobyxmoadg, nufgyqmvbuVar.f99759iobyxmoadg) && Double.compare(this.f99760zoijcleaow, nufgyqmvbuVar.f99760zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f99759iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f99760zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f99759iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputQuantity(productArticle=" + this.f99759iobyxmoadg + ", quantity=" + this.f99760zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f99760zoijcleaow;
        }
    }

    public static final class ojitshcjhn extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99761iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f99761iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f99761iobyxmoadg, ((ojitshcjhn) obj).f99761iobyxmoadg);
        }

        public int hashCode() {
            return this.f99761iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99761iobyxmoadg;
        }

        public String toString() {
            return "OnIncreaseClick(productArticle=" + this.f99761iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f99762iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1160642035;
        }

        public String toString() {
            return "OnBtnChooseAllBoughtListClicked";
        }
    }

    public static final class rgvfuqvkyq extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99763iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final gk1.iobyxmoadg f99764zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(String str, gk1.iobyxmoadg sectionMovedTo) {
            super(null);
            zdlpuopuiu.btonecajqb(sectionMovedTo, "sectionMovedTo");
            this.f99763iobyxmoadg = str;
            this.f99764zoijcleaow = sectionMovedTo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return zdlpuopuiu.eablkybsjg(this.f99763iobyxmoadg, rgvfuqvkyqVar.f99763iobyxmoadg) && this.f99764zoijcleaow == rgvfuqvkyqVar.f99764zoijcleaow;
        }

        public int hashCode() {
            String str = this.f99763iobyxmoadg;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f99764zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99763iobyxmoadg;
        }

        public String toString() {
            return "OnMoveProductToAnotherSection(productId=" + this.f99763iobyxmoadg + ", sectionMovedTo=" + this.f99764zoijcleaow + ")";
        }

        public final gk1.iobyxmoadg zoijcleaow() {
            return this.f99764zoijcleaow;
        }
    }

    public static final class vdvldrhtss extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99765iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f99766zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(String productArticle, String productName) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f99765iobyxmoadg = productArticle;
            this.f99766zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return zdlpuopuiu.eablkybsjg(this.f99765iobyxmoadg, vdvldrhtssVar.f99765iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99766zoijcleaow, vdvldrhtssVar.f99766zoijcleaow);
        }

        public int hashCode() {
            return (this.f99765iobyxmoadg.hashCode() * 31) + this.f99766zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99765iobyxmoadg;
        }

        public String toString() {
            return "OnProductCardClicked(productArticle=" + this.f99765iobyxmoadg + ", productName=" + this.f99766zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f99766zoijcleaow;
        }
    }

    public static final class wflxmlrfwp extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99767iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final gk1.iobyxmoadg f99768zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(String productId, gk1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(section, "section");
            this.f99767iobyxmoadg = productId;
            this.f99768zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return zdlpuopuiu.eablkybsjg(this.f99767iobyxmoadg, wflxmlrfwpVar.f99767iobyxmoadg) && this.f99768zoijcleaow == wflxmlrfwpVar.f99768zoijcleaow;
        }

        public int hashCode() {
            return (this.f99767iobyxmoadg.hashCode() * 31) + this.f99768zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99767iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteProductClicked(productId=" + this.f99767iobyxmoadg + ", section=" + this.f99768zoijcleaow + ")";
        }

        public final gk1.iobyxmoadg zoijcleaow() {
            return this.f99768zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f99769iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -750176823;
        }

        public String toString() {
            return "OnBtnChooseAllToBuyListClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.list_details.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2394zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2394zoijcleaow f99770iobyxmoadg = new C2394zoijcleaow();

        private C2394zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2394zoijcleaow);
        }

        public int hashCode() {
            return 1008376227;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}

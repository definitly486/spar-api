package ru.myspar.purchases.impl.list_details.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.legacy.presentation.model.AddProductParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class agtfadlqog extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102460iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final az1.iobyxmoadg f102461zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(String productId, az1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(section, "section");
            this.f102460iobyxmoadg = productId;
            this.f102461zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return zdlpuopuiu.eablkybsjg(this.f102460iobyxmoadg, agtfadlqogVar.f102460iobyxmoadg) && this.f102461zoijcleaow == agtfadlqogVar.f102461zoijcleaow;
        }

        public int hashCode() {
            return (this.f102460iobyxmoadg.hashCode() * 31) + this.f102461zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102460iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteProductClicked(productId=" + this.f102460iobyxmoadg + ", section=" + this.f102461zoijcleaow + ")";
        }

        public final az1.iobyxmoadg zoijcleaow() {
            return this.f102461zoijcleaow;
        }
    }

    public static final class btonecajqb extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102462iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f102462iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f102462iobyxmoadg, ((btonecajqb) obj).f102462iobyxmoadg);
        }

        public int hashCode() {
            return this.f102462iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102462iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductMeasureType(productArticle=" + this.f102462iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102463iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final az1.iobyxmoadg f102464zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(String str, az1.iobyxmoadg sectionDeleteFrom) {
            super(null);
            zdlpuopuiu.btonecajqb(sectionDeleteFrom, "sectionDeleteFrom");
            this.f102463iobyxmoadg = str;
            this.f102464zoijcleaow = sectionDeleteFrom;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return zdlpuopuiu.eablkybsjg(this.f102463iobyxmoadg, draadjrbmkVar.f102463iobyxmoadg) && this.f102464zoijcleaow == draadjrbmkVar.f102464zoijcleaow;
        }

        public int hashCode() {
            String str = this.f102463iobyxmoadg;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f102464zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102463iobyxmoadg;
        }

        public String toString() {
            return "OnConfirmDeleteProductFromList(productId=" + this.f102463iobyxmoadg + ", sectionDeleteFrom=" + this.f102464zoijcleaow + ")";
        }

        public final az1.iobyxmoadg zoijcleaow() {
            return this.f102464zoijcleaow;
        }
    }

    public static final class dxjokdxxww extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102465iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f102466zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String productArticle, double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f102465iobyxmoadg = productArticle;
            this.f102466zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f102465iobyxmoadg, dxjokdxxwwVar.f102465iobyxmoadg) && Double.compare(this.f102466zoijcleaow, dxjokdxxwwVar.f102466zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f102465iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f102466zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f102465iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputQuantity(productArticle=" + this.f102465iobyxmoadg + ", quantity=" + this.f102466zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f102466zoijcleaow;
        }
    }

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f102467iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -146914074;
        }

        public String toString() {
            return "OnBtnChooseAllToBuyListClicked";
        }
    }

    public static final class gtknphoqwx extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102468iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(String productId) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f102468iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f102468iobyxmoadg, ((gtknphoqwx) obj).f102468iobyxmoadg);
        }

        public int hashCode() {
            return this.f102468iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102468iobyxmoadg;
        }

        public String toString() {
            return "OnClickedChangeProductFavoriteState(productId=" + this.f102468iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f102469iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -75427108;
        }

        public String toString() {
            return "OnBtnNavigateToCatalogClicked";
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102470iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f102470iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102470iobyxmoadg, ((iobyxmoadg) obj).f102470iobyxmoadg);
        }

        public int hashCode() {
            return this.f102470iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102470iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToCartClicked(productArticle=" + this.f102470iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f102471iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -173089667;
        }

        public String toString() {
            return "OnBtnSearchClicked";
        }
    }

    public static final class nufgyqmvbu extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f102472iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 643591274;
        }

        public String toString() {
            return "OnBtnShareClicked";
        }
    }

    public static final class ojitshcjhn extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f102473iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f102474zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(HintUiModel hint, AnalyticElement analyticElement) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f102473iobyxmoadg = hint;
            this.f102474zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ojitshcjhn)) {
                return false;
            }
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
            return zdlpuopuiu.eablkybsjg(this.f102473iobyxmoadg, ojitshcjhnVar.f102473iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102474zoijcleaow, ojitshcjhnVar.f102474zoijcleaow);
        }

        public int hashCode() {
            return (this.f102473iobyxmoadg.hashCode() * 31) + this.f102474zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f102474zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f102473iobyxmoadg + ", analyticElement=" + this.f102474zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f102473iobyxmoadg;
        }
    }

    public static final class oxmwwwfdhm extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102475iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f102476zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(String productArticle, String productName) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f102475iobyxmoadg = productArticle;
            this.f102476zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return zdlpuopuiu.eablkybsjg(this.f102475iobyxmoadg, oxmwwwfdhmVar.f102475iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102476zoijcleaow, oxmwwwfdhmVar.f102476zoijcleaow);
        }

        public int hashCode() {
            return (this.f102475iobyxmoadg.hashCode() * 31) + this.f102476zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102475iobyxmoadg;
        }

        public String toString() {
            return "OnProductCardClicked(productArticle=" + this.f102475iobyxmoadg + ", productName=" + this.f102476zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f102476zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f102477iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1387161370;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class rgvfuqvkyq extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102478iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f102478iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && zdlpuopuiu.eablkybsjg(this.f102478iobyxmoadg, ((rgvfuqvkyq) obj).f102478iobyxmoadg);
        }

        public int hashCode() {
            return this.f102478iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102478iobyxmoadg;
        }

        public String toString() {
            return "OnIncreaseClick(productArticle=" + this.f102478iobyxmoadg + ")";
        }
    }

    public static final class vdvldrhtss extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102479iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final az1.iobyxmoadg f102480zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(String str, az1.iobyxmoadg sectionMovedTo) {
            super(null);
            zdlpuopuiu.btonecajqb(sectionMovedTo, "sectionMovedTo");
            this.f102479iobyxmoadg = str;
            this.f102480zoijcleaow = sectionMovedTo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return zdlpuopuiu.eablkybsjg(this.f102479iobyxmoadg, vdvldrhtssVar.f102479iobyxmoadg) && this.f102480zoijcleaow == vdvldrhtssVar.f102480zoijcleaow;
        }

        public int hashCode() {
            String str = this.f102479iobyxmoadg;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f102480zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102479iobyxmoadg;
        }

        public String toString() {
            return "OnMoveProductToAnotherSection(productId=" + this.f102479iobyxmoadg + ", sectionMovedTo=" + this.f102480zoijcleaow + ")";
        }

        public final az1.iobyxmoadg zoijcleaow() {
            return this.f102480zoijcleaow;
        }
    }

    public static final class wflxmlrfwp extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102481iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f102481iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f102481iobyxmoadg, ((wflxmlrfwp) obj).f102481iobyxmoadg);
        }

        public int hashCode() {
            return this.f102481iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102481iobyxmoadg;
        }

        public String toString() {
            return "OnDecreaseClick(productArticle=" + this.f102481iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f102482iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1613049226;
        }

        public String toString() {
            return "OnBtnChooseAllBoughtListClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.list_details.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2476zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f102483zoijcleaow = AddProductParams.f88839lereixgezr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AddProductParams f102484iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2476zoijcleaow(AddProductParams params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f102484iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2476zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102484iobyxmoadg, ((C2476zoijcleaow) obj).f102484iobyxmoadg);
        }

        public int hashCode() {
            return this.f102484iobyxmoadg.hashCode();
        }

        public final AddProductParams iobyxmoadg() {
            return this.f102484iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f102484iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}

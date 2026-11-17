package fy1;

import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.legacy.presentation.model.AddProductParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35470iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final az1.iobyxmoadg f35471zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(String productId, az1.iobyxmoadg sectionDeleteFrom) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sectionDeleteFrom, "sectionDeleteFrom");
            this.f35470iobyxmoadg = productId;
            this.f35471zoijcleaow = sectionDeleteFrom;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35470iobyxmoadg, agtfadlqogVar.f35470iobyxmoadg) && this.f35471zoijcleaow == agtfadlqogVar.f35471zoijcleaow;
        }

        public int hashCode() {
            return (this.f35470iobyxmoadg.hashCode() * 31) + this.f35471zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35470iobyxmoadg;
        }

        public String toString() {
            return "OnConfirmDeleteProductFromList(productId=" + this.f35470iobyxmoadg + ", sectionDeleteFrom=" + this.f35471zoijcleaow + ")";
        }

        public final az1.iobyxmoadg zoijcleaow() {
            return this.f35471zoijcleaow;
        }
    }

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35472iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(String productArticle) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f35472iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35472iobyxmoadg, ((btonecajqb) obj).f35472iobyxmoadg);
        }

        public int hashCode() {
            return this.f35472iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35472iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductMeasureType(productArticle=" + this.f35472iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35473iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(String productId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f35473iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35473iobyxmoadg, ((draadjrbmk) obj).f35473iobyxmoadg);
        }

        public int hashCode() {
            return this.f35473iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35473iobyxmoadg;
        }

        public String toString() {
            return "OnClickedChangeProductFavoriteState(productId=" + this.f35473iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35474iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f35475zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String productArticle, double d13) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f35474iobyxmoadg = productArticle;
            this.f35475zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35474iobyxmoadg, dxjokdxxwwVar.f35474iobyxmoadg) && Double.compare(this.f35475zoijcleaow, dxjokdxxwwVar.f35475zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f35474iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f35475zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f35474iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputQuantity(productArticle=" + this.f35474iobyxmoadg + ", quantity=" + this.f35475zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f35475zoijcleaow;
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f35476iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {
        public abstract AddProductParams iobyxmoadg();

        public abstract String zoijcleaow();
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f35477iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35478iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String productArticle) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f35478iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35478iobyxmoadg, ((iobyxmoadg) obj).f35478iobyxmoadg);
        }

        public int hashCode() {
            return this.f35478iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35478iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToCartClicked(productArticle=" + this.f35478iobyxmoadg + ")";
        }
    }

    public static final class kcexrzcfyt extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final az1.iobyxmoadg f35479iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(az1.iobyxmoadg sectionMovedTo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sectionMovedTo, "sectionMovedTo");
            this.f35479iobyxmoadg = sectionMovedTo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && this.f35479iobyxmoadg == ((kcexrzcfyt) obj).f35479iobyxmoadg;
        }

        public int hashCode() {
            return this.f35479iobyxmoadg.hashCode();
        }

        public final az1.iobyxmoadg iobyxmoadg() {
            return this.f35479iobyxmoadg;
        }

        public String toString() {
            return "OnMoveAllSectionProductsToAnotherSection(sectionMovedTo=" + this.f35479iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f35480iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -138860766;
        }

        public String toString() {
            return "OnBtnSearchClicked";
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f35481iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 1614526757;
        }

        public String toString() {
            return "OnBtnShareClicked";
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35482iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(String productArticle) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f35482iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35482iobyxmoadg, ((ojitshcjhn) obj).f35482iobyxmoadg);
        }

        public int hashCode() {
            return this.f35482iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35482iobyxmoadg;
        }

        public String toString() {
            return "OnDecreaseClick(productArticle=" + this.f35482iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35483iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(String productArticle) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f35483iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35483iobyxmoadg, ((oxmwwwfdhm) obj).f35483iobyxmoadg);
        }

        public int hashCode() {
            return this.f35483iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35483iobyxmoadg;
        }

        public String toString() {
            return "OnIncreaseClick(productArticle=" + this.f35483iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f35484iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1664252705;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class rgvfuqvkyq extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35485iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final az1.iobyxmoadg f35486zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(String productId, az1.iobyxmoadg section) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(section, "section");
            this.f35485iobyxmoadg = productId;
            this.f35486zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35485iobyxmoadg, rgvfuqvkyqVar.f35485iobyxmoadg) && this.f35486zoijcleaow == rgvfuqvkyqVar.f35486zoijcleaow;
        }

        public int hashCode() {
            return (this.f35485iobyxmoadg.hashCode() * 31) + this.f35486zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35485iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteProductClicked(productId=" + this.f35485iobyxmoadg + ", section=" + this.f35486zoijcleaow + ")";
        }

        public final az1.iobyxmoadg zoijcleaow() {
            return this.f35486zoijcleaow;
        }
    }

    public static final class vdvldrhtss extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f35487iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f35488zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(HintUiModel hint, AnalyticElement analyticElement) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f35487iobyxmoadg = hint;
            this.f35488zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35487iobyxmoadg, vdvldrhtssVar.f35487iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35488zoijcleaow, vdvldrhtssVar.f35488zoijcleaow);
        }

        public int hashCode() {
            return (this.f35487iobyxmoadg.hashCode() * 31) + this.f35488zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f35488zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f35487iobyxmoadg + ", analyticElement=" + this.f35488zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f35487iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final az1.iobyxmoadg f35489iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(az1.iobyxmoadg sectionDeleteFrom) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sectionDeleteFrom, "sectionDeleteFrom");
            this.f35489iobyxmoadg = sectionDeleteFrom;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && this.f35489iobyxmoadg == ((wflxmlrfwp) obj).f35489iobyxmoadg;
        }

        public int hashCode() {
            return this.f35489iobyxmoadg.hashCode();
        }

        public final az1.iobyxmoadg iobyxmoadg() {
            return this.f35489iobyxmoadg;
        }

        public String toString() {
            return "OnConfirmDeleteAllSectionProducts(sectionDeleteFrom=" + this.f35489iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: fy1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0801wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0801wkgbmnqykc f35490iobyxmoadg = new C0801wkgbmnqykc();

        private C0801wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0801wkgbmnqykc);
        }

        public int hashCode() {
            return 1850457073;
        }

        public String toString() {
            return "OnBtnChooseAllBoughtListClicked";
        }
    }

    public static final class yggfygwlhe extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35491iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f35492zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public yggfygwlhe(String productArticle, String productName) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productName, "productName");
            this.f35491iobyxmoadg = productArticle;
            this.f35492zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof yggfygwlhe)) {
                return false;
            }
            yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35491iobyxmoadg, yggfygwlheVar.f35491iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35492zoijcleaow, yggfygwlheVar.f35492zoijcleaow);
        }

        public int hashCode() {
            return (this.f35491iobyxmoadg.hashCode() * 31) + this.f35492zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35491iobyxmoadg;
        }

        public String toString() {
            return "OnProductCardClicked(productArticle=" + this.f35491iobyxmoadg + ", productName=" + this.f35492zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f35492zoijcleaow;
        }
    }

    public static final class zdlpuopuiu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35493iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final az1.iobyxmoadg f35494zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zdlpuopuiu(String productId, az1.iobyxmoadg sectionMovedTo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sectionMovedTo, "sectionMovedTo");
            this.f35493iobyxmoadg = productId;
            this.f35494zoijcleaow = sectionMovedTo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zdlpuopuiu)) {
                return false;
            }
            zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35493iobyxmoadg, zdlpuopuiuVar.f35493iobyxmoadg) && this.f35494zoijcleaow == zdlpuopuiuVar.f35494zoijcleaow;
        }

        public int hashCode() {
            return (this.f35493iobyxmoadg.hashCode() * 31) + this.f35494zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35493iobyxmoadg;
        }

        public String toString() {
            return "OnMoveProductToAnotherSection(productId=" + this.f35493iobyxmoadg + ", sectionMovedTo=" + this.f35494zoijcleaow + ")";
        }

        public final az1.iobyxmoadg zoijcleaow() {
            return this.f35494zoijcleaow;
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f35495zoijcleaow = AddProductParams.f88839lereixgezr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AddProductParams f35496iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(AddProductParams params) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f35496iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35496iobyxmoadg, ((zoijcleaow) obj).f35496iobyxmoadg);
        }

        public int hashCode() {
            return this.f35496iobyxmoadg.hashCode();
        }

        public final AddProductParams iobyxmoadg() {
            return this.f35496iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f35496iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

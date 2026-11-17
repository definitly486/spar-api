package ru.myspar.proloyalty.myspar.impl.presentation;

import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vdvldrhtss {

    public static final class agtfadlqog extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final k21.ojitshcjhn f98180iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98181zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(k21.ojitshcjhn navLink, String str) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f98180iobyxmoadg = navLink;
            this.f98181zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return this.f98180iobyxmoadg == agtfadlqogVar.f98180iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98181zoijcleaow, agtfadlqogVar.f98181zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f98180iobyxmoadg.hashCode() * 31;
            String str = this.f98181zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final k21.ojitshcjhn iobyxmoadg() {
            return this.f98180iobyxmoadg;
        }

        public String toString() {
            return "OnLoyaltyProgramBannerClicked(navLink=" + this.f98180iobyxmoadg + ", reference=" + this.f98181zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f98181zoijcleaow;
        }
    }

    public static final class btonecajqb extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final df1.iobyxmoadg.wkgbmnqykc.zoijcleaow f98182iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(df1.iobyxmoadg.wkgbmnqykc.zoijcleaow discount) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(discount, "discount");
            this.f98182iobyxmoadg = discount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98182iobyxmoadg, ((btonecajqb) obj).f98182iobyxmoadg);
        }

        public int hashCode() {
            return this.f98182iobyxmoadg.hashCode();
        }

        public final df1.iobyxmoadg.wkgbmnqykc.zoijcleaow iobyxmoadg() {
            return this.f98182iobyxmoadg;
        }

        public String toString() {
            return "OnDiscountsClicked(discount=" + this.f98182iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final cqumvgiudr f98183iobyxmoadg = new cqumvgiudr();

        private cqumvgiudr() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof cqumvgiudr);
        }

        public int hashCode() {
            return -538532761;
        }

        public String toString() {
            return "OnScanAndGoButtonClicked";
        }
    }

    public static final class draadjrbmk extends vdvldrhtss {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f98184ppxfxbqfkf = m91.nufgyqmvbu.f66617istkbnxepw;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final m91.nufgyqmvbu f98185iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f98186zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(m91.nufgyqmvbu feature, int i13) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feature, "feature");
            this.f98185iobyxmoadg = feature;
            this.f98186zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98185iobyxmoadg, draadjrbmkVar.f98185iobyxmoadg) && this.f98186zoijcleaow == draadjrbmkVar.f98186zoijcleaow;
        }

        public int hashCode() {
            return (this.f98185iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f98186zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f98186zoijcleaow;
        }

        public String toString() {
            return "OnFeatureClicked(feature=" + this.f98185iobyxmoadg + ", bannerIndex=" + this.f98186zoijcleaow + ")";
        }

        public final m91.nufgyqmvbu zoijcleaow() {
            return this.f98185iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98187iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String orderId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f98187iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98187iobyxmoadg, ((dxjokdxxww) obj).f98187iobyxmoadg);
        }

        public int hashCode() {
            return this.f98187iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98187iobyxmoadg;
        }

        public String toString() {
            return "OnClickedOrderStatusBanner(orderId=" + this.f98187iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f98188iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(ChangeProductParams params) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f98188iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98188iobyxmoadg, ((eablkybsjg) obj).f98188iobyxmoadg);
        }

        public int hashCode() {
            return this.f98188iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f98188iobyxmoadg;
        }

        public String toString() {
            return "OnBuyProduct(params=" + this.f98188iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final esjtqupxsv f98189iobyxmoadg = new esjtqupxsv();

        private esjtqupxsv() {
            super(null);
        }
    }

    public static final class gtknphoqwx extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f98190iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
            super(null);
        }
    }

    public static final class gxszxtbevo extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f98191iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wm0.zoijcleaow f98192zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(ComboSetProduct comboSetProduct, wm0.zoijcleaow analyticsData) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
            this.f98191iobyxmoadg = comboSetProduct;
            this.f98192zoijcleaow = analyticsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98191iobyxmoadg, gxszxtbevoVar.f98191iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98192zoijcleaow, gxszxtbevoVar.f98192zoijcleaow);
        }

        public int hashCode() {
            return (this.f98191iobyxmoadg.hashCode() * 31) + this.f98192zoijcleaow.hashCode();
        }

        public final wm0.zoijcleaow iobyxmoadg() {
            return this.f98192zoijcleaow;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f98191iobyxmoadg + ", analyticsData=" + this.f98192zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f98191iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe.iobyxmoadg f98193iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe.iobyxmoadg source) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            this.f98193iobyxmoadg = source;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98193iobyxmoadg, ((iobyxmoadg) obj).f98193iobyxmoadg);
        }

        public int hashCode() {
            return this.f98193iobyxmoadg.hashCode();
        }

        public final ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe.iobyxmoadg iobyxmoadg() {
            return this.f98193iobyxmoadg;
        }

        public String toString() {
            return "OnAdultWarningDialogConfirmed(source=" + this.f98193iobyxmoadg + ")";
        }
    }

    public static final class istkbnxepw extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final istkbnxepw f98194iobyxmoadg = new istkbnxepw();

        private istkbnxepw() {
            super(null);
        }
    }

    public static final class iwizpuwonk extends vdvldrhtss {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f98195zoijcleaow = m91.gxszxtbevo.f66592wypolnanlu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final m91.gxszxtbevo f98196iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iwizpuwonk(m91.gxszxtbevo banner) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f98196iobyxmoadg = banner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98196iobyxmoadg, ((iwizpuwonk) obj).f98196iobyxmoadg);
        }

        public int hashCode() {
            return this.f98196iobyxmoadg.hashCode();
        }

        public final m91.gxszxtbevo iobyxmoadg() {
            return this.f98196iobyxmoadg;
        }

        public String toString() {
            return "OnRestaurantBannerClicked(banner=" + this.f98196iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl extends vdvldrhtss {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f98197zoijcleaow = ot0.zoijcleaow.f74705wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ot0.zoijcleaow f98198iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(ot0.zoijcleaow recommendations) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
            this.f98198iobyxmoadg = recommendations;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98198iobyxmoadg, ((jyumaefscl) obj).f98198iobyxmoadg);
        }

        public int hashCode() {
            return this.f98198iobyxmoadg.hashCode();
        }

        public final ot0.zoijcleaow iobyxmoadg() {
            return this.f98198iobyxmoadg;
        }

        public String toString() {
            return "OnRecommendationProductMoreClicked(recommendations=" + this.f98198iobyxmoadg + ")";
        }
    }

    public static final class kcexrzcfyt extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final df1.iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow f98199iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(df1.iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow promo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promo, "promo");
            this.f98199iobyxmoadg = promo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98199iobyxmoadg, ((kcexrzcfyt) obj).f98199iobyxmoadg);
        }

        public int hashCode() {
            return this.f98199iobyxmoadg.hashCode();
        }

        public final df1.iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow iobyxmoadg() {
            return this.f98199iobyxmoadg;
        }

        public String toString() {
            return "OnPromoClicked(promo=" + this.f98199iobyxmoadg + ")";
        }
    }

    public static final class lereixgezr extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bf1.zoijcleaow f98200iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lereixgezr(bf1.zoijcleaow specialProduct) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialProduct, "specialProduct");
            this.f98200iobyxmoadg = specialProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98200iobyxmoadg, ((lereixgezr) obj).f98200iobyxmoadg);
        }

        public int hashCode() {
            return this.f98200iobyxmoadg.hashCode();
        }

        public final bf1.zoijcleaow iobyxmoadg() {
            return this.f98200iobyxmoadg;
        }

        public String toString() {
            return "OnSpecialProductMoreClicked(specialProduct=" + this.f98200iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f98201iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f98202zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f98201iobyxmoadg = productFirst;
            this.f98202zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98201iobyxmoadg, lqeggnwhkgVar.f98201iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98202zoijcleaow, lqeggnwhkgVar.f98202zoijcleaow);
        }

        public int hashCode() {
            return (this.f98201iobyxmoadg.hashCode() * 31) + this.f98202zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f98201iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f98201iobyxmoadg + ", productSecond=" + this.f98202zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f98202zoijcleaow;
        }
    }

    public static final class nufgyqmvbu extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final kt0.iobyxmoadg f98203iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(kt0.iobyxmoadg comboSet) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f98203iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98203iobyxmoadg, ((nufgyqmvbu) obj).f98203iobyxmoadg);
        }

        public int hashCode() {
            return this.f98203iobyxmoadg.hashCode();
        }

        public final kt0.iobyxmoadg iobyxmoadg() {
            return this.f98203iobyxmoadg;
        }

        public String toString() {
            return "OnClickedComboShowAll(comboSet=" + this.f98203iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f98204iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
            super(null);
        }
    }

    public static final class oxmwwwfdhm extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f98205iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final bf1.zoijcleaow f98206zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(ProductUiModel product, bf1.zoijcleaow section) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(section, "section");
            this.f98205iobyxmoadg = product;
            this.f98206zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98205iobyxmoadg, oxmwwwfdhmVar.f98205iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98206zoijcleaow, oxmwwwfdhmVar.f98206zoijcleaow);
        }

        public int hashCode() {
            return (this.f98205iobyxmoadg.hashCode() * 31) + this.f98206zoijcleaow.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f98205iobyxmoadg;
        }

        public String toString() {
            return "OnProductDetailClicked(product=" + this.f98205iobyxmoadg + ", section=" + this.f98206zoijcleaow + ")";
        }

        public final bf1.zoijcleaow zoijcleaow() {
            return this.f98206zoijcleaow;
        }
    }

    public static final class pmvmpeiblj extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bf1.ppxfxbqfkf f98207iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public pmvmpeiblj(bf1.ppxfxbqfkf story) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(story, "story");
            this.f98207iobyxmoadg = story;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pmvmpeiblj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98207iobyxmoadg, ((pmvmpeiblj) obj).f98207iobyxmoadg);
        }

        public int hashCode() {
            return this.f98207iobyxmoadg.hashCode();
        }

        public final bf1.ppxfxbqfkf iobyxmoadg() {
            return this.f98207iobyxmoadg;
        }

        public String toString() {
            return "OnStoryClicked(story=" + this.f98207iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends vdvldrhtss {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f98208ppxfxbqfkf = m91.gxszxtbevo.f66592wypolnanlu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final m91.gxszxtbevo f98209iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f98210zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(m91.gxszxtbevo banner, int i13) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f98209iobyxmoadg = banner;
            this.f98210zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98209iobyxmoadg, ppxfxbqfkfVar.f98209iobyxmoadg) && this.f98210zoijcleaow == ppxfxbqfkfVar.f98210zoijcleaow;
        }

        public int hashCode() {
            return (this.f98209iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f98210zoijcleaow);
        }

        public final m91.gxszxtbevo iobyxmoadg() {
            return this.f98209iobyxmoadg;
        }

        public String toString() {
            return "OnBannerClicked(banner=" + this.f98209iobyxmoadg + ", bannerIndex=" + this.f98210zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f98210zoijcleaow;
        }
    }

    public static final class rgvfuqvkyq extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f98211iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss$vdvldrhtss, reason: collision with other inner class name */
    public static final class C2326vdvldrhtss extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f98212iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f98213ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f98214zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2326vdvldrhtss(ProductUiModel product, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f98212iobyxmoadg = product;
            this.f98214zoijcleaow = productCardEvent;
            this.f98213ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2326vdvldrhtss)) {
                return false;
            }
            C2326vdvldrhtss c2326vdvldrhtss = (C2326vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98212iobyxmoadg, c2326vdvldrhtss.f98212iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98214zoijcleaow, c2326vdvldrhtss.f98214zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98213ppxfxbqfkf, c2326vdvldrhtss.f98213ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f98212iobyxmoadg.hashCode() * 31) + this.f98214zoijcleaow.hashCode()) * 31) + this.f98213ppxfxbqfkf.hashCode();
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f98213ppxfxbqfkf;
        }

        public final ProductCardEvent ppxfxbqfkf() {
            return this.f98214zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(product=" + this.f98212iobyxmoadg + ", productCardEvent=" + this.f98214zoijcleaow + ", analyticsLocation=" + this.f98213ppxfxbqfkf + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f98212iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f98215iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f98216ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f98217zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation analyticsLocation) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f98215iobyxmoadg = hint;
            this.f98217zoijcleaow = analyticElement;
            this.f98216ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98215iobyxmoadg, wflxmlrfwpVar.f98215iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98217zoijcleaow, wflxmlrfwpVar.f98217zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98216ppxfxbqfkf, wflxmlrfwpVar.f98216ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f98215iobyxmoadg.hashCode() * 31) + this.f98217zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f98216ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f98217zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f98215iobyxmoadg;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f98215iobyxmoadg + ", analyticElement=" + this.f98217zoijcleaow + ", analyticsLocation=" + this.f98216ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f98216ppxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc extends vdvldrhtss {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f98218zoijcleaow = l91.iobyxmoadg.f61959gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final l91.iobyxmoadg f98219iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(l91.iobyxmoadg brand) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(brand, "brand");
            this.f98219iobyxmoadg = brand;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98219iobyxmoadg, ((wkgbmnqykc) obj).f98219iobyxmoadg);
        }

        public int hashCode() {
            return this.f98219iobyxmoadg.hashCode();
        }

        public final l91.iobyxmoadg iobyxmoadg() {
            return this.f98219iobyxmoadg;
        }

        public String toString() {
            return "OnBrandClicked(brand=" + this.f98219iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe extends vdvldrhtss {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f98220ppxfxbqfkf = ot0.zoijcleaow.f74705wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ot0.zoijcleaow f98221iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductUiModel f98222zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public yggfygwlhe(ot0.zoijcleaow recommendations, ProductUiModel product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f98221iobyxmoadg = recommendations;
            this.f98222zoijcleaow = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof yggfygwlhe)) {
                return false;
            }
            yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98221iobyxmoadg, yggfygwlheVar.f98221iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98222zoijcleaow, yggfygwlheVar.f98222zoijcleaow);
        }

        public int hashCode() {
            return (this.f98221iobyxmoadg.hashCode() * 31) + this.f98222zoijcleaow.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f98222zoijcleaow;
        }

        public String toString() {
            return "OnRecommendationProductDetailClicked(recommendations=" + this.f98221iobyxmoadg + ", product=" + this.f98222zoijcleaow + ")";
        }

        public final ot0.zoijcleaow zoijcleaow() {
            return this.f98221iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f98223iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
            super(null);
        }
    }

    public static final class zoijcleaow extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f98224iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public static final class zynmafqrjb extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zynmafqrjb f98225iobyxmoadg = new zynmafqrjb();

        private zynmafqrjb() {
            super(null);
        }
    }

    public /* synthetic */ vdvldrhtss(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private vdvldrhtss() {
    }
}

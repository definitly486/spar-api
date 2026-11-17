package ru.myspar.myspar.impl.presentation;

import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oxmwwwfdhm {

    public static final class agtfadlqog extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f90777iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }
    }

    public static final class btonecajqb extends oxmwwwfdhm {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f90778zoijcleaow = nb0.zoijcleaow.f69536zoijcleaow;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final yh0.iobyxmoadg.wkgbmnqykc.zoijcleaow f90779iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(yh0.iobyxmoadg.wkgbmnqykc.zoijcleaow discount) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(discount, "discount");
            this.f90779iobyxmoadg = discount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90779iobyxmoadg, ((btonecajqb) obj).f90779iobyxmoadg);
        }

        public int hashCode() {
            return this.f90779iobyxmoadg.hashCode();
        }

        public final yh0.iobyxmoadg.wkgbmnqykc.zoijcleaow iobyxmoadg() {
            return this.f90779iobyxmoadg;
        }

        public String toString() {
            return "OnDiscountsClicked(discount=" + this.f90779iobyxmoadg + ")";
        }
    }

    public static final class cdpycssgdh extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final cdpycssgdh f90780iobyxmoadg = new cdpycssgdh();

        private cdpycssgdh() {
            super(null);
        }
    }

    public static final class cqumvgiudr extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final cqumvgiudr f90781iobyxmoadg = new cqumvgiudr();

        private cqumvgiudr() {
            super(null);
        }
    }

    public static final class draadjrbmk extends oxmwwwfdhm {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f90782ppxfxbqfkf = nb0.gxszxtbevo.f69518istkbnxepw;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nb0.gxszxtbevo f90783iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f90784zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(nb0.gxszxtbevo feature, int i13) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feature, "feature");
            this.f90783iobyxmoadg = feature;
            this.f90784zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90783iobyxmoadg, draadjrbmkVar.f90783iobyxmoadg) && this.f90784zoijcleaow == draadjrbmkVar.f90784zoijcleaow;
        }

        public int hashCode() {
            return (this.f90783iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f90784zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f90784zoijcleaow;
        }

        public String toString() {
            return "OnFeatureClicked(feature=" + this.f90783iobyxmoadg + ", bannerIndex=" + this.f90784zoijcleaow + ")";
        }

        public final nb0.gxszxtbevo zoijcleaow() {
            return this.f90783iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90785iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String orderId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f90785iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90785iobyxmoadg, ((dxjokdxxww) obj).f90785iobyxmoadg);
        }

        public int hashCode() {
            return this.f90785iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f90785iobyxmoadg;
        }

        public String toString() {
            return "OnClickedOrderStatusBanner(orderId=" + this.f90785iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f90786iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(ChangeProductParams params) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f90786iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90786iobyxmoadg, ((eablkybsjg) obj).f90786iobyxmoadg);
        }

        public int hashCode() {
            return this.f90786iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f90786iobyxmoadg;
        }

        public String toString() {
            return "OnBuyProduct(params=" + this.f90786iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv extends oxmwwwfdhm {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f90787zoijcleaow = nb0.eablkybsjg.f69495wypolnanlu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nb0.eablkybsjg f90788iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public esjtqupxsv(nb0.eablkybsjg banner) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f90788iobyxmoadg = banner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof esjtqupxsv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90788iobyxmoadg, ((esjtqupxsv) obj).f90788iobyxmoadg);
        }

        public int hashCode() {
            return this.f90788iobyxmoadg.hashCode();
        }

        public final nb0.eablkybsjg iobyxmoadg() {
            return this.f90788iobyxmoadg;
        }

        public String toString() {
            return "OnRestaurantBannerClicked(banner=" + this.f90788iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f90789iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
            super(null);
        }
    }

    public static final class gxszxtbevo extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f90790iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final mo.zoijcleaow f90791zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(ComboSetProduct comboSetProduct, mo.zoijcleaow analyticsData) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
            this.f90790iobyxmoadg = comboSetProduct;
            this.f90791zoijcleaow = analyticsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90790iobyxmoadg, gxszxtbevoVar.f90790iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90791zoijcleaow, gxszxtbevoVar.f90791zoijcleaow);
        }

        public int hashCode() {
            return (this.f90790iobyxmoadg.hashCode() * 31) + this.f90791zoijcleaow.hashCode();
        }

        public final mo.zoijcleaow iobyxmoadg() {
            return this.f90791zoijcleaow;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f90790iobyxmoadg + ", analyticsData=" + this.f90791zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f90790iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ru.myspar.myspar.impl.presentation.jyumaefscl.iobyxmoadg f90792iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ru.myspar.myspar.impl.presentation.jyumaefscl.iobyxmoadg source) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            this.f90792iobyxmoadg = source;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90792iobyxmoadg, ((iobyxmoadg) obj).f90792iobyxmoadg);
        }

        public int hashCode() {
            return this.f90792iobyxmoadg.hashCode();
        }

        public final ru.myspar.myspar.impl.presentation.jyumaefscl.iobyxmoadg iobyxmoadg() {
            return this.f90792iobyxmoadg;
        }

        public String toString() {
            return "OnAdultWarningDialogConfirmed(source=" + this.f90792iobyxmoadg + ")";
        }
    }

    public static final class istkbnxepw extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final istkbnxepw f90793iobyxmoadg = new istkbnxepw();

        private istkbnxepw() {
            super(null);
        }
    }

    public static final class iwizpuwonk extends oxmwwwfdhm {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f90794zoijcleaow = uu.zoijcleaow.f114412wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final uu.zoijcleaow f90795iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iwizpuwonk(uu.zoijcleaow recommendations) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
            this.f90795iobyxmoadg = recommendations;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90795iobyxmoadg, ((iwizpuwonk) obj).f90795iobyxmoadg);
        }

        public int hashCode() {
            return this.f90795iobyxmoadg.hashCode();
        }

        public final uu.zoijcleaow iobyxmoadg() {
            return this.f90795iobyxmoadg;
        }

        public String toString() {
            return "OnRecommendationProductMoreClicked(recommendations=" + this.f90795iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl extends oxmwwwfdhm {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f90796ppxfxbqfkf = uu.zoijcleaow.f114412wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final uu.zoijcleaow f90797iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductUiModel f90798zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(uu.zoijcleaow recommendations, ProductUiModel product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f90797iobyxmoadg = recommendations;
            this.f90798zoijcleaow = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof jyumaefscl)) {
                return false;
            }
            jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90797iobyxmoadg, jyumaefsclVar.f90797iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90798zoijcleaow, jyumaefsclVar.f90798zoijcleaow);
        }

        public int hashCode() {
            return (this.f90797iobyxmoadg.hashCode() * 31) + this.f90798zoijcleaow.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f90798zoijcleaow;
        }

        public String toString() {
            return "OnRecommendationProductDetailClicked(recommendations=" + this.f90797iobyxmoadg + ", product=" + this.f90798zoijcleaow + ")";
        }

        public final uu.zoijcleaow zoijcleaow() {
            return this.f90797iobyxmoadg;
        }
    }

    public static final class kcexrzcfyt extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f90799iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wh0.wkgbmnqykc f90800zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(ProductUiModel product, wh0.wkgbmnqykc section) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(section, "section");
            this.f90799iobyxmoadg = product;
            this.f90800zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kcexrzcfyt)) {
                return false;
            }
            kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90799iobyxmoadg, kcexrzcfytVar.f90799iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90800zoijcleaow, kcexrzcfytVar.f90800zoijcleaow);
        }

        public int hashCode() {
            return (this.f90799iobyxmoadg.hashCode() * 31) + this.f90800zoijcleaow.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f90799iobyxmoadg;
        }

        public String toString() {
            return "OnProductDetailClicked(product=" + this.f90799iobyxmoadg + ", section=" + this.f90800zoijcleaow + ")";
        }

        public final wh0.wkgbmnqykc zoijcleaow() {
            return this.f90800zoijcleaow;
        }
    }

    public static final class lereixgezr extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lereixgezr f90801iobyxmoadg = new lereixgezr();

        private lereixgezr() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lereixgezr);
        }

        public int hashCode() {
            return -1817739772;
        }

        public String toString() {
            return "OnScanAndGoButtonClicked";
        }
    }

    public static final class lqeggnwhkg extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f90802iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f90803zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f90802iobyxmoadg = productFirst;
            this.f90803zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90802iobyxmoadg, lqeggnwhkgVar.f90802iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90803zoijcleaow, lqeggnwhkgVar.f90803zoijcleaow);
        }

        public int hashCode() {
            return (this.f90802iobyxmoadg.hashCode() * 31) + this.f90803zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f90802iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f90802iobyxmoadg + ", productSecond=" + this.f90803zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f90803zoijcleaow;
        }
    }

    public static final class nufgyqmvbu extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qu.iobyxmoadg f90804iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(qu.iobyxmoadg comboSet) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f90804iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90804iobyxmoadg, ((nufgyqmvbu) obj).f90804iobyxmoadg);
        }

        public int hashCode() {
            return this.f90804iobyxmoadg.hashCode();
        }

        public final qu.iobyxmoadg iobyxmoadg() {
            return this.f90804iobyxmoadg;
        }

        public String toString() {
            return "OnClickedComboShowAll(comboSet=" + this.f90804iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f40.zoijcleaow f90805iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f90806zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(f40.zoijcleaow navLink, String str) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f90805iobyxmoadg = navLink;
            this.f90806zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ojitshcjhn)) {
                return false;
            }
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
            return this.f90805iobyxmoadg == ojitshcjhnVar.f90805iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90806zoijcleaow, ojitshcjhnVar.f90806zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f90805iobyxmoadg.hashCode() * 31;
            String str = this.f90806zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final f40.zoijcleaow iobyxmoadg() {
            return this.f90805iobyxmoadg;
        }

        public String toString() {
            return "OnLoyaltyProgramBannerClicked(navLink=" + this.f90805iobyxmoadg + ", reference=" + this.f90806zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f90806zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.oxmwwwfdhm$oxmwwwfdhm, reason: collision with other inner class name */
    public static final class C2107oxmwwwfdhm extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f90807iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f90808ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f90809zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2107oxmwwwfdhm(ProductUiModel product, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f90807iobyxmoadg = product;
            this.f90809zoijcleaow = productCardEvent;
            this.f90808ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2107oxmwwwfdhm)) {
                return false;
            }
            C2107oxmwwwfdhm c2107oxmwwwfdhm = (C2107oxmwwwfdhm) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90807iobyxmoadg, c2107oxmwwwfdhm.f90807iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90809zoijcleaow, c2107oxmwwwfdhm.f90809zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90808ppxfxbqfkf, c2107oxmwwwfdhm.f90808ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f90807iobyxmoadg.hashCode() * 31) + this.f90809zoijcleaow.hashCode()) * 31) + this.f90808ppxfxbqfkf.hashCode();
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f90808ppxfxbqfkf;
        }

        public final ProductCardEvent ppxfxbqfkf() {
            return this.f90809zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(product=" + this.f90807iobyxmoadg + ", productCardEvent=" + this.f90809zoijcleaow + ", analyticsLocation=" + this.f90808ppxfxbqfkf + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f90807iobyxmoadg;
        }
    }

    public static final class pmvmpeiblj extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wh0.wkgbmnqykc f90810iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public pmvmpeiblj(wh0.wkgbmnqykc specialProduct) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialProduct, "specialProduct");
            this.f90810iobyxmoadg = specialProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pmvmpeiblj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90810iobyxmoadg, ((pmvmpeiblj) obj).f90810iobyxmoadg);
        }

        public int hashCode() {
            return this.f90810iobyxmoadg.hashCode();
        }

        public final wh0.wkgbmnqykc iobyxmoadg() {
            return this.f90810iobyxmoadg;
        }

        public String toString() {
            return "OnSpecialProductMoreClicked(specialProduct=" + this.f90810iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends oxmwwwfdhm {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f90811ppxfxbqfkf = nb0.eablkybsjg.f69495wypolnanlu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nb0.eablkybsjg f90812iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f90813zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(nb0.eablkybsjg banner, int i13) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f90812iobyxmoadg = banner;
            this.f90813zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90812iobyxmoadg, ppxfxbqfkfVar.f90812iobyxmoadg) && this.f90813zoijcleaow == ppxfxbqfkfVar.f90813zoijcleaow;
        }

        public int hashCode() {
            return (this.f90812iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f90813zoijcleaow);
        }

        public final nb0.eablkybsjg iobyxmoadg() {
            return this.f90812iobyxmoadg;
        }

        public String toString() {
            return "OnBannerClicked(banner=" + this.f90812iobyxmoadg + ", bannerIndex=" + this.f90813zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f90813zoijcleaow;
        }
    }

    public static final class rgvfuqvkyq extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f90814iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }
    }

    public static final class vdvldrhtss extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final vdvldrhtss f90815iobyxmoadg = new vdvldrhtss();

        private vdvldrhtss() {
            super(null);
        }
    }

    public static final class wflxmlrfwp extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f90816iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f90817ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f90818zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation analyticsLocation) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f90816iobyxmoadg = hint;
            this.f90818zoijcleaow = analyticElement;
            this.f90817ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90816iobyxmoadg, wflxmlrfwpVar.f90816iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90818zoijcleaow, wflxmlrfwpVar.f90818zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90817ppxfxbqfkf, wflxmlrfwpVar.f90817ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f90816iobyxmoadg.hashCode() * 31) + this.f90818zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f90817ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f90818zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f90816iobyxmoadg;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f90816iobyxmoadg + ", analyticElement=" + this.f90818zoijcleaow + ", analyticsLocation=" + this.f90817ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f90817ppxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc extends oxmwwwfdhm {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f90819zoijcleaow = mb0.iobyxmoadg.f66734gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mb0.iobyxmoadg f90820iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(mb0.iobyxmoadg brand) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(brand, "brand");
            this.f90820iobyxmoadg = brand;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90820iobyxmoadg, ((wkgbmnqykc) obj).f90820iobyxmoadg);
        }

        public int hashCode() {
            return this.f90820iobyxmoadg.hashCode();
        }

        public final mb0.iobyxmoadg iobyxmoadg() {
            return this.f90820iobyxmoadg;
        }

        public String toString() {
            return "OnBrandClicked(brand=" + this.f90820iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f90821iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
            super(null);
        }
    }

    public static final class zdlpuopuiu extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final yh0.iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow f90822iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zdlpuopuiu(yh0.iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow promo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promo, "promo");
            this.f90822iobyxmoadg = promo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90822iobyxmoadg, ((zdlpuopuiu) obj).f90822iobyxmoadg);
        }

        public int hashCode() {
            return this.f90822iobyxmoadg.hashCode();
        }

        public final yh0.iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow iobyxmoadg() {
            return this.f90822iobyxmoadg;
        }

        public String toString() {
            return "OnPromoClicked(promo=" + this.f90822iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f90823iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ChangeProductParams params) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f90823iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90823iobyxmoadg, ((zoijcleaow) obj).f90823iobyxmoadg);
        }

        public int hashCode() {
            return this.f90823iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f90823iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f90823iobyxmoadg + ")";
        }
    }

    public static final class zynmafqrjb extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wh0.eablkybsjg f90824iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zynmafqrjb(wh0.eablkybsjg story) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(story, "story");
            this.f90824iobyxmoadg = story;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zynmafqrjb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90824iobyxmoadg, ((zynmafqrjb) obj).f90824iobyxmoadg);
        }

        public int hashCode() {
            return this.f90824iobyxmoadg.hashCode();
        }

        public final wh0.eablkybsjg iobyxmoadg() {
            return this.f90824iobyxmoadg;
        }

        public String toString() {
            return "OnStoryClicked(story=" + this.f90824iobyxmoadg + ")";
        }
    }

    public /* synthetic */ oxmwwwfdhm(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private oxmwwwfdhm() {
    }
}

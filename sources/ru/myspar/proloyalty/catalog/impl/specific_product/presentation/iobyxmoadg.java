package ru.myspar.proloyalty.catalog.impl.specific_product.presentation;

import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    public static final class agtfadlqog implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93668iobyxmoadg;

        public agtfadlqog(String variantId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(variantId, "variantId");
            this.f93668iobyxmoadg = variantId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93668iobyxmoadg, ((agtfadlqog) obj).f93668iobyxmoadg);
        }

        public int hashCode() {
            return this.f93668iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93668iobyxmoadg;
        }

        public String toString() {
            return "OnProductVariantClick(variantId=" + this.f93668iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f93669iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 821262226;
        }

        public String toString() {
            return "OnImageLoadCompleted";
        }
    }

    public static final class cqumvgiudr implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final cqumvgiudr f93670iobyxmoadg = new cqumvgiudr();

        private cqumvgiudr() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof cqumvgiudr);
        }

        public int hashCode() {
            return -1324120250;
        }

        public String toString() {
            return "OnTopBarFavoriteClick";
        }
    }

    public static final class draadjrbmk implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f93671iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -1932735158;
        }

        public String toString() {
            return "OnMoreReviewsClick";
        }
    }

    public static final class eablkybsjg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93675iobyxmoadg;

        public eablkybsjg(String comboSetId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetId, "comboSetId");
            this.f93675iobyxmoadg = comboSetId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93675iobyxmoadg, ((eablkybsjg) obj).f93675iobyxmoadg);
        }

        public int hashCode() {
            return this.f93675iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93675iobyxmoadg;
        }

        public String toString() {
            return "OnClickComboShowAll(comboSetId=" + this.f93675iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final esjtqupxsv f93676iobyxmoadg = new esjtqupxsv();

        private esjtqupxsv() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof esjtqupxsv);
        }

        public int hashCode() {
            return 825970819;
        }

        public String toString() {
            return "OnTopBarPurchaseListClick";
        }
    }

    public static final class gtknphoqwx implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductCardEvent f93677iobyxmoadg;

        public gtknphoqwx(ProductCardEvent event) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            this.f93677iobyxmoadg = event;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93677iobyxmoadg, ((gtknphoqwx) obj).f93677iobyxmoadg);
        }

        public int hashCode() {
            return this.f93677iobyxmoadg.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f93677iobyxmoadg;
        }

        public String toString() {
            return "OnMainProductCardEvent(event=" + this.f93677iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f93678iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1376619008;
        }

        public String toString() {
            return "OnConfirmDialog";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2210iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2210iobyxmoadg f93679iobyxmoadg = new C2210iobyxmoadg();

        private C2210iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2210iobyxmoadg);
        }

        public int hashCode() {
            return -427627817;
        }

        public String toString() {
            return "OnAddReviewClick";
        }
    }

    public static final class iwizpuwonk implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f93680iobyxmoadg;

        public iwizpuwonk(boolean z13) {
            this.f93680iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && this.f93680iobyxmoadg == ((iwizpuwonk) obj).f93680iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f93680iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f93680iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f93680iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f93681iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return 1178702634;
        }

        public String toString() {
            return "OnShowDeclarationsClick";
        }
    }

    public static final class kcexrzcfyt implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93682iobyxmoadg;

        public kcexrzcfyt(String productId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f93682iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93682iobyxmoadg, ((kcexrzcfyt) obj).f93682iobyxmoadg);
        }

        public int hashCode() {
            return this.f93682iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93682iobyxmoadg;
        }

        public String toString() {
            return "OnRecommendationProductPurchaseListClick(productId=" + this.f93682iobyxmoadg + ")";
        }
    }

    public static final class lereixgezr implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lereixgezr f93683iobyxmoadg = new lereixgezr();

        private lereixgezr() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lereixgezr);
        }

        public int hashCode() {
            return 1776299765;
        }

        public String toString() {
            return "OnVideoClick";
        }
    }

    public static final class lqeggnwhkg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f93684iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1442069942;
        }

        public String toString() {
            return "OnDismissDialog";
        }
    }

    public static final class nufgyqmvbu implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f93685iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f93685iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f93685iobyxmoadg == ((nufgyqmvbu) obj).f93685iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f93685iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f93685iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f93685iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qq0.wkgbmnqykc f93686iobyxmoadg;

        public ojitshcjhn(qq0.wkgbmnqykc rating) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rating, "rating");
            this.f93686iobyxmoadg = rating;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93686iobyxmoadg, ((ojitshcjhn) obj).f93686iobyxmoadg);
        }

        public int hashCode() {
            return this.f93686iobyxmoadg.hashCode();
        }

        public final qq0.wkgbmnqykc iobyxmoadg() {
            return this.f93686iobyxmoadg;
        }

        public String toString() {
            return "OnRatingClick(rating=" + this.f93686iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93687iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f93688zoijcleaow;

        public oxmwwwfdhm(String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f93687iobyxmoadg = productId;
            this.f93688zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93687iobyxmoadg, oxmwwwfdhmVar.f93687iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93688zoijcleaow, oxmwwwfdhmVar.f93688zoijcleaow);
        }

        public int hashCode() {
            return (this.f93687iobyxmoadg.hashCode() * 31) + this.f93688zoijcleaow.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f93688zoijcleaow;
        }

        public String toString() {
            return "OnRecommendationProductClick(productId=" + this.f93687iobyxmoadg + ", analyticsLocation=" + this.f93688zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f93687iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f93689iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f93690zoijcleaow;

        public ppxfxbqfkf(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f93689iobyxmoadg = productFirst;
            this.f93690zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93689iobyxmoadg, ppxfxbqfkfVar.f93689iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93690zoijcleaow, ppxfxbqfkfVar.f93690zoijcleaow);
        }

        public int hashCode() {
            return (this.f93689iobyxmoadg.hashCode() * 31) + this.f93690zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f93689iobyxmoadg;
        }

        public String toString() {
            return "OnClickAddComboToCart(productFirst=" + this.f93689iobyxmoadg + ", productSecond=" + this.f93690zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f93690zoijcleaow;
        }
    }

    public static final class rgvfuqvkyq implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93691iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f93692zoijcleaow;

        public rgvfuqvkyq(String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f93691iobyxmoadg = productId;
            this.f93692zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93691iobyxmoadg, rgvfuqvkyqVar.f93691iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93692zoijcleaow, rgvfuqvkyqVar.f93692zoijcleaow);
        }

        public int hashCode() {
            return (this.f93691iobyxmoadg.hashCode() * 31) + this.f93692zoijcleaow.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f93692zoijcleaow;
        }

        public String toString() {
            return "OnRecommendationFavoriteClick(productId=" + this.f93691iobyxmoadg + ", analyticsLocation=" + this.f93692zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f93691iobyxmoadg;
        }
    }

    public static final class vdvldrhtss implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93693iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f93694ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f93695zoijcleaow;

        public vdvldrhtss(String productId, ProductCardEvent event, AnalyticsLocation.ItemFeed analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f93693iobyxmoadg = productId;
            this.f93695zoijcleaow = event;
            this.f93694ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93693iobyxmoadg, vdvldrhtssVar.f93693iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93695zoijcleaow, vdvldrhtssVar.f93695zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93694ppxfxbqfkf, vdvldrhtssVar.f93694ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f93693iobyxmoadg.hashCode() * 31) + this.f93695zoijcleaow.hashCode()) * 31) + this.f93694ppxfxbqfkf.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f93694ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f93693iobyxmoadg;
        }

        public String toString() {
            return "OnRecommendationProductChangeEvent(productId=" + this.f93693iobyxmoadg + ", event=" + this.f93695zoijcleaow + ", analyticsLocation=" + this.f93694ppxfxbqfkf + ")";
        }

        public final ProductCardEvent zoijcleaow() {
            return this.f93695zoijcleaow;
        }
    }

    public static final class wflxmlrfwp implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93696iobyxmoadg;

        public wflxmlrfwp(String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f93696iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93696iobyxmoadg, ((wflxmlrfwp) obj).f93696iobyxmoadg);
        }

        public int hashCode() {
            return this.f93696iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93696iobyxmoadg;
        }

        public String toString() {
            return "OnProductPhotoClick(url=" + this.f93696iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f93697iobyxmoadg;

        public wkgbmnqykc(ComboSetProduct comboSetProduct) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            this.f93697iobyxmoadg = comboSetProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93697iobyxmoadg, ((wkgbmnqykc) obj).f93697iobyxmoadg);
        }

        public int hashCode() {
            return this.f93697iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f93697iobyxmoadg;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f93697iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f93698iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return 1606185489;
        }

        public String toString() {
            return "OnShareClick";
        }
    }

    public static final class zdlpuopuiu implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f93699iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return -2068620713;
        }

        public String toString() {
            return "OnReturnToEditOrderClick";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f93700iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1142303417;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class dxjokdxxww implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f93672iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f93673ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f93674zoijcleaow;

        public dxjokdxxww(HintUiModel hint, AnalyticElement analyticsElement, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsElement, "analyticsElement");
            this.f93672iobyxmoadg = hint;
            this.f93674zoijcleaow = analyticsElement;
            this.f93673ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93672iobyxmoadg, dxjokdxxwwVar.f93672iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93674zoijcleaow, dxjokdxxwwVar.f93674zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93673ppxfxbqfkf, dxjokdxxwwVar.f93673ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f93672iobyxmoadg.hashCode() * 31) + this.f93674zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f93673ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f93674zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f93672iobyxmoadg;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f93672iobyxmoadg + ", analyticsElement=" + this.f93674zoijcleaow + ", analyticsLocation=" + this.f93673ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f93673ppxfxbqfkf;
        }

        public /* synthetic */ dxjokdxxww(HintUiModel hintUiModel, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(hintUiModel, analyticElement, (i13 & 4) != 0 ? null : analyticsLocation);
        }
    }
}

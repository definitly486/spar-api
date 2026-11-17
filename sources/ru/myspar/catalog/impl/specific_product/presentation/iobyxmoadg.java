package ru.myspar.catalog.impl.specific_product.presentation;

import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    public static final class agtfadlqog implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85925iobyxmoadg;

        public agtfadlqog(String variantId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(variantId, "variantId");
            this.f85925iobyxmoadg = variantId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85925iobyxmoadg, ((agtfadlqog) obj).f85925iobyxmoadg);
        }

        public int hashCode() {
            return this.f85925iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85925iobyxmoadg;
        }

        public String toString() {
            return "OnProductVariantClick(variantId=" + this.f85925iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f85926iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 1210014933;
        }

        public String toString() {
            return "OnImageLoadCompleted";
        }
    }

    public static final class cqumvgiudr implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final cqumvgiudr f85927iobyxmoadg = new cqumvgiudr();

        private cqumvgiudr() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof cqumvgiudr);
        }

        public int hashCode() {
            return 353058080;
        }

        public String toString() {
            return "OnTopBarPurchaseListClick";
        }
    }

    public static final class draadjrbmk implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f85928iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return 1361520461;
        }

        public String toString() {
            return "OnMoreReviewsClick";
        }
    }

    public static final class eablkybsjg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85932iobyxmoadg;

        public eablkybsjg(String comboSetId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetId, "comboSetId");
            this.f85932iobyxmoadg = comboSetId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85932iobyxmoadg, ((eablkybsjg) obj).f85932iobyxmoadg);
        }

        public int hashCode() {
            return this.f85932iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85932iobyxmoadg;
        }

        public String toString() {
            return "OnClickComboShowAll(comboSetId=" + this.f85932iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final esjtqupxsv f85933iobyxmoadg = new esjtqupxsv();

        private esjtqupxsv() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof esjtqupxsv);
        }

        public int hashCode() {
            return 796591928;
        }

        public String toString() {
            return "OnVideoClick";
        }
    }

    public static final class gtknphoqwx implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductCardEvent f85934iobyxmoadg;

        public gtknphoqwx(ProductCardEvent event) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            this.f85934iobyxmoadg = event;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85934iobyxmoadg, ((gtknphoqwx) obj).f85934iobyxmoadg);
        }

        public int hashCode() {
            return this.f85934iobyxmoadg.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f85934iobyxmoadg;
        }

        public String toString() {
            return "OnMainProductCardEvent(event=" + this.f85934iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f85935iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 744952541;
        }

        public String toString() {
            return "OnConfirmDialog";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1971iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1971iobyxmoadg f85936iobyxmoadg = new C1971iobyxmoadg();

        private C1971iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1971iobyxmoadg);
        }

        public int hashCode() {
            return 916580762;
        }

        public String toString() {
            return "OnAddReviewClick";
        }
    }

    public static final class iwizpuwonk implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f85937iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return 2137279075;
        }

        public String toString() {
            return "OnTopBarFavoriteClick";
        }
    }

    public static final class jyumaefscl implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f85938iobyxmoadg;

        public jyumaefscl(boolean z13) {
            this.f85938iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && this.f85938iobyxmoadg == ((jyumaefscl) obj).f85938iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f85938iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f85938iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f85938iobyxmoadg + ")";
        }
    }

    public static final class kcexrzcfyt implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85939iobyxmoadg;

        public kcexrzcfyt(String productId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f85939iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85939iobyxmoadg, ((kcexrzcfyt) obj).f85939iobyxmoadg);
        }

        public int hashCode() {
            return this.f85939iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85939iobyxmoadg;
        }

        public String toString() {
            return "OnRecommendationProductPurchaseListClick(productId=" + this.f85939iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f85940iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 679501607;
        }

        public String toString() {
            return "OnDismissDialog";
        }
    }

    public static final class nufgyqmvbu implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f85941iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f85941iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f85941iobyxmoadg == ((nufgyqmvbu) obj).f85941iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f85941iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f85941iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f85941iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bs.wkgbmnqykc f85942iobyxmoadg;

        public ojitshcjhn(bs.wkgbmnqykc rating) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rating, "rating");
            this.f85942iobyxmoadg = rating;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85942iobyxmoadg, ((ojitshcjhn) obj).f85942iobyxmoadg);
        }

        public int hashCode() {
            return this.f85942iobyxmoadg.hashCode();
        }

        public final bs.wkgbmnqykc iobyxmoadg() {
            return this.f85942iobyxmoadg;
        }

        public String toString() {
            return "OnRatingClick(rating=" + this.f85942iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85943iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f85944zoijcleaow;

        public oxmwwwfdhm(String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f85943iobyxmoadg = productId;
            this.f85944zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85943iobyxmoadg, oxmwwwfdhmVar.f85943iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85944zoijcleaow, oxmwwwfdhmVar.f85944zoijcleaow);
        }

        public int hashCode() {
            return (this.f85943iobyxmoadg.hashCode() * 31) + this.f85944zoijcleaow.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f85944zoijcleaow;
        }

        public String toString() {
            return "OnRecommendationProductClick(productId=" + this.f85943iobyxmoadg + ", analyticsLocation=" + this.f85944zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f85943iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f85945iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f85946zoijcleaow;

        public ppxfxbqfkf(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f85945iobyxmoadg = productFirst;
            this.f85946zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85945iobyxmoadg, ppxfxbqfkfVar.f85945iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85946zoijcleaow, ppxfxbqfkfVar.f85946zoijcleaow);
        }

        public int hashCode() {
            return (this.f85945iobyxmoadg.hashCode() * 31) + this.f85946zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f85945iobyxmoadg;
        }

        public String toString() {
            return "OnClickAddComboToCart(productFirst=" + this.f85945iobyxmoadg + ", productSecond=" + this.f85946zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f85946zoijcleaow;
        }
    }

    public static final class rgvfuqvkyq implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85947iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f85948zoijcleaow;

        public rgvfuqvkyq(String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f85947iobyxmoadg = productId;
            this.f85948zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85947iobyxmoadg, rgvfuqvkyqVar.f85947iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85948zoijcleaow, rgvfuqvkyqVar.f85948zoijcleaow);
        }

        public int hashCode() {
            return (this.f85947iobyxmoadg.hashCode() * 31) + this.f85948zoijcleaow.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f85948zoijcleaow;
        }

        public String toString() {
            return "OnRecommendationFavoriteClick(productId=" + this.f85947iobyxmoadg + ", analyticsLocation=" + this.f85948zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f85947iobyxmoadg;
        }
    }

    public static final class vdvldrhtss implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85949iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f85950ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f85951zoijcleaow;

        public vdvldrhtss(String productId, ProductCardEvent event, AnalyticsLocation.ItemFeed analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f85949iobyxmoadg = productId;
            this.f85951zoijcleaow = event;
            this.f85950ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85949iobyxmoadg, vdvldrhtssVar.f85949iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85951zoijcleaow, vdvldrhtssVar.f85951zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85950ppxfxbqfkf, vdvldrhtssVar.f85950ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f85949iobyxmoadg.hashCode() * 31) + this.f85951zoijcleaow.hashCode()) * 31) + this.f85950ppxfxbqfkf.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f85950ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f85949iobyxmoadg;
        }

        public String toString() {
            return "OnRecommendationProductChangeEvent(productId=" + this.f85949iobyxmoadg + ", event=" + this.f85951zoijcleaow + ", analyticsLocation=" + this.f85950ppxfxbqfkf + ")";
        }

        public final ProductCardEvent zoijcleaow() {
            return this.f85951zoijcleaow;
        }
    }

    public static final class wflxmlrfwp implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85952iobyxmoadg;

        public wflxmlrfwp(String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f85952iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85952iobyxmoadg, ((wflxmlrfwp) obj).f85952iobyxmoadg);
        }

        public int hashCode() {
            return this.f85952iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85952iobyxmoadg;
        }

        public String toString() {
            return "OnProductPhotoClick(url=" + this.f85952iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f85953iobyxmoadg;

        public wkgbmnqykc(ComboSetProduct comboSetProduct) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            this.f85953iobyxmoadg = comboSetProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85953iobyxmoadg, ((wkgbmnqykc) obj).f85953iobyxmoadg);
        }

        public int hashCode() {
            return this.f85953iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f85953iobyxmoadg;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f85953iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f85954iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return 626477652;
        }

        public String toString() {
            return "OnShareClick";
        }
    }

    public static final class zdlpuopuiu implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f85955iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return -1391139302;
        }

        public String toString() {
            return "OnReturnToEditOrderClick";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f85956iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 695057942;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class dxjokdxxww implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f85929iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f85930ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f85931zoijcleaow;

        public dxjokdxxww(HintUiModel hint, AnalyticElement analyticsElement, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsElement, "analyticsElement");
            this.f85929iobyxmoadg = hint;
            this.f85931zoijcleaow = analyticsElement;
            this.f85930ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85929iobyxmoadg, dxjokdxxwwVar.f85929iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85931zoijcleaow, dxjokdxxwwVar.f85931zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85930ppxfxbqfkf, dxjokdxxwwVar.f85930ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f85929iobyxmoadg.hashCode() * 31) + this.f85931zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f85930ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f85931zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f85929iobyxmoadg;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f85929iobyxmoadg + ", analyticsElement=" + this.f85931zoijcleaow + ", analyticsLocation=" + this.f85930ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f85930ppxfxbqfkf;
        }

        public /* synthetic */ dxjokdxxww(HintUiModel hintUiModel, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(hintUiModel, analyticElement, (i13 & 4) != 0 ? null : analyticsLocation);
        }
    }
}

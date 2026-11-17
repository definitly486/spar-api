package ru.myspar.catalog.impl.specific_product.domain.store;

import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class agtfadlqog implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f85872iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 2064211562;
        }

        public String toString() {
            return "ReturnToOrderEdit";
        }
    }

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f85873iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 1485706764;
        }

        public String toString() {
            return "OnImageLoadCompleted";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85874iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f85875zoijcleaow;

        public draadjrbmk(String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f85874iobyxmoadg = productId;
            this.f85875zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85874iobyxmoadg, draadjrbmkVar.f85874iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85875zoijcleaow, draadjrbmkVar.f85875zoijcleaow);
        }

        public int hashCode() {
            return (this.f85874iobyxmoadg.hashCode() * 31) + this.f85875zoijcleaow.hashCode();
        }

        public final String ppxfxbqfkf() {
            return this.f85874iobyxmoadg;
        }

        public String toString() {
            return "OpenRecommendationProduct(productId=" + this.f85874iobyxmoadg + ", analyticsLocation=" + this.f85875zoijcleaow + ")";
        }

        public final AnalyticsLocation.ItemFeed zoijcleaow() {
            return this.f85875zoijcleaow;
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f85876iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f85877ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f85878zoijcleaow;

        public dxjokdxxww(HintUiModel hint, AnalyticElement analyticsElement, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsElement, "analyticsElement");
            this.f85876iobyxmoadg = hint;
            this.f85878zoijcleaow = analyticsElement;
            this.f85877ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85876iobyxmoadg, dxjokdxxwwVar.f85876iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85878zoijcleaow, dxjokdxxwwVar.f85878zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85877ppxfxbqfkf, dxjokdxxwwVar.f85877ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f85876iobyxmoadg.hashCode() * 31) + this.f85878zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f85877ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation ppxfxbqfkf() {
            return this.f85877ppxfxbqfkf;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f85876iobyxmoadg + ", analyticsElement=" + this.f85878zoijcleaow + ", analyticsLocation=" + this.f85877ppxfxbqfkf + ")";
        }

        public final HintUiModel wkgbmnqykc() {
            return this.f85876iobyxmoadg;
        }

        public final AnalyticElement zoijcleaow() {
            return this.f85878zoijcleaow;
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f85879iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -176330958;
        }

        public String toString() {
            return "ClearDialog";
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f85880iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f85880iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f85880iobyxmoadg == ((gtknphoqwx) obj).f85880iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f85880iobyxmoadg);
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f85880iobyxmoadg + ")";
        }

        public final boolean zoijcleaow() {
            return this.f85880iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f85881iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1169630683;
        }

        public String toString() {
            return "ConfirmDialog";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f85882iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f85883zoijcleaow;

        public iobyxmoadg(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f85882iobyxmoadg = productFirst;
            this.f85883zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85882iobyxmoadg, iobyxmoadgVar.f85882iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85883zoijcleaow, iobyxmoadgVar.f85883zoijcleaow);
        }

        public int hashCode() {
            return (this.f85882iobyxmoadg.hashCode() * 31) + this.f85883zoijcleaow.hashCode();
        }

        public final ComboSetProduct ppxfxbqfkf() {
            return this.f85883zoijcleaow;
        }

        public String toString() {
            return "AddComboSet(productFirst=" + this.f85882iobyxmoadg + ", productSecond=" + this.f85883zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f85882iobyxmoadg;
        }
    }

    public static final class jyumaefscl implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f85884iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return 261016245;
        }

        public String toString() {
            return "ShowVivinoInfo";
        }
    }

    public static final class kcexrzcfyt implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f85885iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return 1309065872;
        }

        public String toString() {
            return "ShowMoreReviewsMainProduct";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f85886iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -2089492519;
        }

        public String toString() {
            return "OnBackPressed";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f85887iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f85887iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f85887iobyxmoadg == ((nufgyqmvbu) obj).f85887iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f85887iobyxmoadg);
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f85887iobyxmoadg + ")";
        }

        public final boolean zoijcleaow() {
            return this.f85887iobyxmoadg;
        }
    }

    public static final class ojitshcjhn implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f85888iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 1658354810;
        }

        public String toString() {
            return "ShareMainProduct";
        }
    }

    public static final class oxmwwwfdhm implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final oxmwwwfdhm f85889iobyxmoadg = new oxmwwwfdhm();

        private oxmwwwfdhm() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof oxmwwwfdhm);
        }

        public int hashCode() {
            return -398178907;
        }

        public String toString() {
            return "ShowMainProductVideo";
        }
    }

    public interface ppxfxbqfkf extends wkgbmnqykc {

        public static final class iobyxmoadg implements ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f85890iobyxmoadg = new iobyxmoadg();

            private iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof iobyxmoadg);
            }

            public int hashCode() {
                return 1036114690;
            }

            public String toString() {
                return "MainProduct";
            }
        }

        public static final class zoijcleaow implements ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f85891iobyxmoadg;

            public zoijcleaow(String productId) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
                this.f85891iobyxmoadg = productId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85891iobyxmoadg, ((zoijcleaow) obj).f85891iobyxmoadg);
            }

            public int hashCode() {
                return this.f85891iobyxmoadg.hashCode();
            }

            public String toString() {
                return "RecommendationProduct(productId=" + this.f85891iobyxmoadg + ")";
            }

            public final String zoijcleaow() {
                return this.f85891iobyxmoadg;
            }
        }
    }

    public static final class rgvfuqvkyq implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85892iobyxmoadg;

        public rgvfuqvkyq(String comboSetId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetId, "comboSetId");
            this.f85892iobyxmoadg = comboSetId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85892iobyxmoadg, ((rgvfuqvkyq) obj).f85892iobyxmoadg);
        }

        public int hashCode() {
            return this.f85892iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ShowComboSet(comboSetId=" + this.f85892iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f85892iobyxmoadg;
        }
    }

    public static final class vdvldrhtss implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f85893iobyxmoadg;

        public vdvldrhtss(ComboSetProduct comboSetProduct) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            this.f85893iobyxmoadg = comboSetProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85893iobyxmoadg, ((vdvldrhtss) obj).f85893iobyxmoadg);
        }

        public int hashCode() {
            return this.f85893iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ShowComboSetProduct(comboSetProduct=" + this.f85893iobyxmoadg + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f85893iobyxmoadg;
        }
    }

    public interface wflxmlrfwp extends wkgbmnqykc {

        public static final class iobyxmoadg implements wflxmlrfwp {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final ProductCardEvent f85894iobyxmoadg;

            public iobyxmoadg(ProductCardEvent event) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
                this.f85894iobyxmoadg = event;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85894iobyxmoadg, ((iobyxmoadg) obj).f85894iobyxmoadg);
            }

            public int hashCode() {
                return this.f85894iobyxmoadg.hashCode();
            }

            @Override // ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp
            public ProductCardEvent iobyxmoadg() {
                return this.f85894iobyxmoadg;
            }

            public String toString() {
                return "MainProduct(event=" + this.f85894iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow implements wflxmlrfwp {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final ProductCardEvent f85895iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final AnalyticsLocation.ItemFeed f85896ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f85897zoijcleaow;

            public zoijcleaow(ProductCardEvent event, String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
                this.f85895iobyxmoadg = event;
                this.f85897zoijcleaow = productId;
                this.f85896ppxfxbqfkf = analyticsLocation;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85895iobyxmoadg, zoijcleaowVar.f85895iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85897zoijcleaow, zoijcleaowVar.f85897zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85896ppxfxbqfkf, zoijcleaowVar.f85896ppxfxbqfkf);
            }

            public int hashCode() {
                return (((this.f85895iobyxmoadg.hashCode() * 31) + this.f85897zoijcleaow.hashCode()) * 31) + this.f85896ppxfxbqfkf.hashCode();
            }

            @Override // ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp
            public ProductCardEvent iobyxmoadg() {
                return this.f85895iobyxmoadg;
            }

            public final String ppxfxbqfkf() {
                return this.f85897zoijcleaow;
            }

            public String toString() {
                return "RecommendationProduct(event=" + this.f85895iobyxmoadg + ", productId=" + this.f85897zoijcleaow + ", analyticsLocation=" + this.f85896ppxfxbqfkf + ")";
            }

            public final AnalyticsLocation.ItemFeed zoijcleaow() {
                return this.f85896ppxfxbqfkf;
            }
        }

        ProductCardEvent iobyxmoadg();
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public interface InterfaceC1970wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc$wkgbmnqykc$iobyxmoadg */
        public static final class iobyxmoadg implements InterfaceC1970wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f85898iobyxmoadg = new iobyxmoadg();

            private iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof iobyxmoadg);
            }

            public int hashCode() {
                return -1702615945;
            }

            public String toString() {
                return "MainProduct";
            }
        }

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc$wkgbmnqykc$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC1970wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f85899iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final AnalyticsLocation.ItemFeed f85900zoijcleaow;

            public zoijcleaow(String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
                this.f85899iobyxmoadg = productId;
                this.f85900zoijcleaow = analyticsLocation;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85899iobyxmoadg, zoijcleaowVar.f85899iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85900zoijcleaow, zoijcleaowVar.f85900zoijcleaow);
            }

            public int hashCode() {
                return (this.f85899iobyxmoadg.hashCode() * 31) + this.f85900zoijcleaow.hashCode();
            }

            public final String ppxfxbqfkf() {
                return this.f85899iobyxmoadg;
            }

            public String toString() {
                return "RecommendationProduct(productId=" + this.f85899iobyxmoadg + ", analyticsLocation=" + this.f85900zoijcleaow + ")";
            }

            public final AnalyticsLocation.ItemFeed zoijcleaow() {
                return this.f85900zoijcleaow;
            }
        }
    }

    public static final class yggfygwlhe implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85901iobyxmoadg;

        public yggfygwlhe(String variantId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(variantId, "variantId");
            this.f85901iobyxmoadg = variantId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85901iobyxmoadg, ((yggfygwlhe) obj).f85901iobyxmoadg);
        }

        public int hashCode() {
            return this.f85901iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ShowProductVariant(variantId=" + this.f85901iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f85901iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85902iobyxmoadg;

        public zdlpuopuiu(String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f85902iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85902iobyxmoadg, ((zdlpuopuiu) obj).f85902iobyxmoadg);
        }

        public int hashCode() {
            return this.f85902iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ShowProductPhoto(url=" + this.f85902iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f85902iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f85903iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -645696704;
        }

        public String toString() {
            return "AddReviewMainProduct";
        }
    }
}

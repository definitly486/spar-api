package ru.myspar.proloyalty.catalog.impl.specific_product.domain.store;

import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public interface agtfadlqog extends wkgbmnqykc {

        public static final class iobyxmoadg implements agtfadlqog {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final ProductCardEvent f93601iobyxmoadg;

            public iobyxmoadg(ProductCardEvent event) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
                this.f93601iobyxmoadg = event;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93601iobyxmoadg, ((iobyxmoadg) obj).f93601iobyxmoadg);
            }

            public int hashCode() {
                return this.f93601iobyxmoadg.hashCode();
            }

            @Override // ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog
            public ProductCardEvent iobyxmoadg() {
                return this.f93601iobyxmoadg;
            }

            public String toString() {
                return "MainProduct(event=" + this.f93601iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow implements agtfadlqog {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final ProductCardEvent f93602iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final AnalyticsLocation.ItemFeed f93603ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f93604zoijcleaow;

            public zoijcleaow(ProductCardEvent event, String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
                this.f93602iobyxmoadg = event;
                this.f93604zoijcleaow = productId;
                this.f93603ppxfxbqfkf = analyticsLocation;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93602iobyxmoadg, zoijcleaowVar.f93602iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93604zoijcleaow, zoijcleaowVar.f93604zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93603ppxfxbqfkf, zoijcleaowVar.f93603ppxfxbqfkf);
            }

            public int hashCode() {
                return (((this.f93602iobyxmoadg.hashCode() * 31) + this.f93604zoijcleaow.hashCode()) * 31) + this.f93603ppxfxbqfkf.hashCode();
            }

            @Override // ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog
            public ProductCardEvent iobyxmoadg() {
                return this.f93602iobyxmoadg;
            }

            public final String ppxfxbqfkf() {
                return this.f93604zoijcleaow;
            }

            public String toString() {
                return "RecommendationProduct(event=" + this.f93602iobyxmoadg + ", productId=" + this.f93604zoijcleaow + ", analyticsLocation=" + this.f93603ppxfxbqfkf + ")";
            }

            public final AnalyticsLocation.ItemFeed zoijcleaow() {
                return this.f93603ppxfxbqfkf;
            }
        }

        ProductCardEvent iobyxmoadg();
    }

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f93605iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return -91171575;
        }

        public String toString() {
            return "OnImageLoadCompleted";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f93606iobyxmoadg;

        public draadjrbmk(boolean z13) {
            this.f93606iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && this.f93606iobyxmoadg == ((draadjrbmk) obj).f93606iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f93606iobyxmoadg);
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f93606iobyxmoadg + ")";
        }

        public final boolean zoijcleaow() {
            return this.f93606iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f93607iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f93608ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f93609zoijcleaow;

        public dxjokdxxww(HintUiModel hint, AnalyticElement analyticsElement, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsElement, "analyticsElement");
            this.f93607iobyxmoadg = hint;
            this.f93609zoijcleaow = analyticsElement;
            this.f93608ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93607iobyxmoadg, dxjokdxxwwVar.f93607iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93609zoijcleaow, dxjokdxxwwVar.f93609zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93608ppxfxbqfkf, dxjokdxxwwVar.f93608ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f93607iobyxmoadg.hashCode() * 31) + this.f93609zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f93608ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation ppxfxbqfkf() {
            return this.f93608ppxfxbqfkf;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f93607iobyxmoadg + ", analyticsElement=" + this.f93609zoijcleaow + ", analyticsLocation=" + this.f93608ppxfxbqfkf + ")";
        }

        public final HintUiModel wkgbmnqykc() {
            return this.f93607iobyxmoadg;
        }

        public final AnalyticElement zoijcleaow() {
            return this.f93609zoijcleaow;
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f93610iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1281451925;
        }

        public String toString() {
            return "ClearDialog";
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f93611iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return 1711353427;
        }

        public String toString() {
            return "OnShowDeclarationsClick";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f93612iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -399618616;
        }

        public String toString() {
            return "ConfirmDialog";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f93613iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f93614zoijcleaow;

        public iobyxmoadg(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f93613iobyxmoadg = productFirst;
            this.f93614zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93613iobyxmoadg, iobyxmoadgVar.f93613iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93614zoijcleaow, iobyxmoadgVar.f93614zoijcleaow);
        }

        public int hashCode() {
            return (this.f93613iobyxmoadg.hashCode() * 31) + this.f93614zoijcleaow.hashCode();
        }

        public final ComboSetProduct ppxfxbqfkf() {
            return this.f93614zoijcleaow;
        }

        public String toString() {
            return "AddComboSet(productFirst=" + this.f93613iobyxmoadg + ", productSecond=" + this.f93614zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f93613iobyxmoadg;
        }
    }

    public static final class iwizpuwonk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f93615iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return -1638413454;
        }

        public String toString() {
            return "ShowVivinoInfo";
        }
    }

    public static final class jyumaefscl implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93616iobyxmoadg;

        public jyumaefscl(String variantId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(variantId, "variantId");
            this.f93616iobyxmoadg = variantId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93616iobyxmoadg, ((jyumaefscl) obj).f93616iobyxmoadg);
        }

        public int hashCode() {
            return this.f93616iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ShowProductVariant(variantId=" + this.f93616iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f93616iobyxmoadg;
        }
    }

    public static final class kcexrzcfyt implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f93617iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return -1975057246;
        }

        public String toString() {
            return "ShowMainProductVideo";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f93618iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1319480452;
        }

        public String toString() {
            return "OnBackPressed";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f93619iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f93619iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f93619iobyxmoadg == ((nufgyqmvbu) obj).f93619iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f93619iobyxmoadg);
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f93619iobyxmoadg + ")";
        }

        public final boolean zoijcleaow() {
            return this.f93619iobyxmoadg;
        }
    }

    public static final class ojitshcjhn implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f93620iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -1946793843;
        }

        public String toString() {
            return "ReturnToOrderEdit";
        }
    }

    public static final class oxmwwwfdhm implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f93621iobyxmoadg;

        public oxmwwwfdhm(ComboSetProduct comboSetProduct) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            this.f93621iobyxmoadg = comboSetProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93621iobyxmoadg, ((oxmwwwfdhm) obj).f93621iobyxmoadg);
        }

        public int hashCode() {
            return this.f93621iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ShowComboSetProduct(comboSetProduct=" + this.f93621iobyxmoadg + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f93621iobyxmoadg;
        }
    }

    public interface ppxfxbqfkf extends wkgbmnqykc {

        public static final class iobyxmoadg implements ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f93622iobyxmoadg = new iobyxmoadg();

            private iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof iobyxmoadg);
            }

            public int hashCode() {
                return 1971319333;
            }

            public String toString() {
                return "MainProduct";
            }
        }

        public static final class zoijcleaow implements ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f93623iobyxmoadg;

            public zoijcleaow(String productId) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
                this.f93623iobyxmoadg = productId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93623iobyxmoadg, ((zoijcleaow) obj).f93623iobyxmoadg);
            }

            public int hashCode() {
                return this.f93623iobyxmoadg.hashCode();
            }

            public String toString() {
                return "RecommendationProduct(productId=" + this.f93623iobyxmoadg + ")";
            }

            public final String zoijcleaow() {
                return this.f93623iobyxmoadg;
            }
        }
    }

    public static final class rgvfuqvkyq implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f93624iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 1667514871;
        }

        public String toString() {
            return "ShareMainProduct";
        }
    }

    public static final class vdvldrhtss implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93625iobyxmoadg;

        public vdvldrhtss(String comboSetId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetId, "comboSetId");
            this.f93625iobyxmoadg = comboSetId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93625iobyxmoadg, ((vdvldrhtss) obj).f93625iobyxmoadg);
        }

        public int hashCode() {
            return this.f93625iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ShowComboSet(comboSetId=" + this.f93625iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f93625iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93626iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f93627zoijcleaow;

        public wflxmlrfwp(String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f93626iobyxmoadg = productId;
            this.f93627zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93626iobyxmoadg, wflxmlrfwpVar.f93626iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93627zoijcleaow, wflxmlrfwpVar.f93627zoijcleaow);
        }

        public int hashCode() {
            return (this.f93626iobyxmoadg.hashCode() * 31) + this.f93627zoijcleaow.hashCode();
        }

        public final String ppxfxbqfkf() {
            return this.f93626iobyxmoadg;
        }

        public String toString() {
            return "OpenRecommendationProduct(productId=" + this.f93626iobyxmoadg + ", analyticsLocation=" + this.f93627zoijcleaow + ")";
        }

        public final AnalyticsLocation.ItemFeed zoijcleaow() {
            return this.f93627zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public interface InterfaceC2208wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc$wkgbmnqykc$iobyxmoadg */
        public static final class iobyxmoadg implements InterfaceC2208wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f93628iobyxmoadg = new iobyxmoadg();

            private iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof iobyxmoadg);
            }

            public int hashCode() {
                return 1518924212;
            }

            public String toString() {
                return "MainProduct";
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc$wkgbmnqykc$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC2208wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f93629iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final AnalyticsLocation.ItemFeed f93630zoijcleaow;

            public zoijcleaow(String productId, AnalyticsLocation.ItemFeed analyticsLocation) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
                this.f93629iobyxmoadg = productId;
                this.f93630zoijcleaow = analyticsLocation;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93629iobyxmoadg, zoijcleaowVar.f93629iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93630zoijcleaow, zoijcleaowVar.f93630zoijcleaow);
            }

            public int hashCode() {
                return (this.f93629iobyxmoadg.hashCode() * 31) + this.f93630zoijcleaow.hashCode();
            }

            public final String ppxfxbqfkf() {
                return this.f93629iobyxmoadg;
            }

            public String toString() {
                return "RecommendationProduct(productId=" + this.f93629iobyxmoadg + ", analyticsLocation=" + this.f93630zoijcleaow + ")";
            }

            public final AnalyticsLocation.ItemFeed zoijcleaow() {
                return this.f93630zoijcleaow;
            }
        }
    }

    public static final class yggfygwlhe implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93631iobyxmoadg;

        public yggfygwlhe(String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f93631iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93631iobyxmoadg, ((yggfygwlhe) obj).f93631iobyxmoadg);
        }

        public int hashCode() {
            return this.f93631iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ShowProductPhoto(url=" + this.f93631iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f93631iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f93632iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 235638733;
        }

        public String toString() {
            return "ShowMoreReviewsMainProduct";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f93633iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 2072392253;
        }

        public String toString() {
            return "AddReviewMainProduct";
        }
    }
}

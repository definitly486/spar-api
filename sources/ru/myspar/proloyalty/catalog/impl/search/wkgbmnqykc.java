package ru.myspar.proloyalty.catalog.impl.search;

import p0.tzroggbefp;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.catalog.impl.search.models.SearchCategoryUiModel;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93355iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(String history) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(history, "history");
            this.f93355iobyxmoadg = history;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93355iobyxmoadg, ((agtfadlqog) obj).f93355iobyxmoadg);
        }

        public int hashCode() {
            return this.f93355iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93355iobyxmoadg;
        }

        public String toString() {
            return "OnHistoryClicked(history=" + this.f93355iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dq0.iobyxmoadg f93356iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(dq0.iobyxmoadg feature) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feature, "feature");
            this.f93356iobyxmoadg = feature;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93356iobyxmoadg, ((btonecajqb) obj).f93356iobyxmoadg);
        }

        public int hashCode() {
            return this.f93356iobyxmoadg.hashCode();
        }

        public final dq0.iobyxmoadg iobyxmoadg() {
            return this.f93356iobyxmoadg;
        }

        public String toString() {
            return "OnFeatureClicked(feature=" + this.f93356iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f93357iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.SearchItemElement.Item f93358zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(HintUiModel hint, AnalyticElement.SearchItemElement.Item analyticsElement) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsElement, "analyticsElement");
            this.f93357iobyxmoadg = hint;
            this.f93358zoijcleaow = analyticsElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93357iobyxmoadg, draadjrbmkVar.f93357iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93358zoijcleaow, draadjrbmkVar.f93358zoijcleaow);
        }

        public int hashCode() {
            return (this.f93357iobyxmoadg.hashCode() * 31) + this.f93358zoijcleaow.hashCode();
        }

        public final AnalyticElement.SearchItemElement.Item iobyxmoadg() {
            return this.f93358zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f93357iobyxmoadg + ", analyticsElement=" + this.f93358zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f93357iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f93359iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f93360zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(ProductUiModel product, boolean z13) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f93359iobyxmoadg = product;
            this.f93360zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93359iobyxmoadg, dxjokdxxwwVar.f93359iobyxmoadg) && this.f93360zoijcleaow == dxjokdxxwwVar.f93360zoijcleaow;
        }

        public int hashCode() {
            return (this.f93359iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f93360zoijcleaow);
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f93359iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(product=" + this.f93359iobyxmoadg + ", isRecommendation=" + this.f93360zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f93360zoijcleaow;
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SearchCategoryUiModel f93361iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(SearchCategoryUiModel category) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(category, "category");
            this.f93361iobyxmoadg = category;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93361iobyxmoadg, ((eablkybsjg) obj).f93361iobyxmoadg);
        }

        public int hashCode() {
            return this.f93361iobyxmoadg.hashCode();
        }

        public final SearchCategoryUiModel iobyxmoadg() {
            return this.f93361iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryClicked(category=" + this.f93361iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f93362iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
            super(null);
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f93363iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f93364ppxfxbqfkf = CounterModel.f93858wwaezpbzkn;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f93365iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final CounterModel f93366zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ProductUiModel product, CounterModel counterModel) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(counterModel, "counterModel");
            this.f93365iobyxmoadg = product;
            this.f93366zoijcleaow = counterModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93365iobyxmoadg, iobyxmoadgVar.f93365iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93366zoijcleaow, iobyxmoadgVar.f93366zoijcleaow);
        }

        public int hashCode() {
            return (this.f93365iobyxmoadg.hashCode() * 31) + this.f93366zoijcleaow.hashCode();
        }

        public final CounterModel iobyxmoadg() {
            return this.f93366zoijcleaow;
        }

        public String toString() {
            return "OnAddProductToPurchaseListClicked(product=" + this.f93365iobyxmoadg + ", counterModel=" + this.f93366zoijcleaow + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f93365iobyxmoadg;
        }
    }

    public static final class iwizpuwonk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93367iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iwizpuwonk(String query) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            this.f93367iobyxmoadg = query;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93367iobyxmoadg, ((iwizpuwonk) obj).f93367iobyxmoadg);
        }

        public int hashCode() {
            return this.f93367iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93367iobyxmoadg;
        }

        public String toString() {
            return "OnSuggestionClicked(query=" + this.f93367iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f93368iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(mz0.ppxfxbqfkf type) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            this.f93368iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && this.f93368iobyxmoadg == ((jyumaefscl) obj).f93368iobyxmoadg;
        }

        public int hashCode() {
            return this.f93368iobyxmoadg.hashCode();
        }

        public final mz0.ppxfxbqfkf iobyxmoadg() {
            return this.f93368iobyxmoadg;
        }

        public String toString() {
            return "OnSortSelected(type=" + this.f93368iobyxmoadg + ")";
        }
    }

    public static final class kcexrzcfyt extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f93369iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(tzroggbefp query) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            this.f93369iobyxmoadg = query;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93369iobyxmoadg, ((kcexrzcfyt) obj).f93369iobyxmoadg);
        }

        public int hashCode() {
            return this.f93369iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f93369iobyxmoadg;
        }

        public String toString() {
            return "OnSearchChanged(query=" + this.f93369iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f93370iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 802911221;
        }

        public String toString() {
            return "OnClearClicked";
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93371iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String history) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(history, "history");
            this.f93371iobyxmoadg = history;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93371iobyxmoadg, ((nufgyqmvbu) obj).f93371iobyxmoadg);
        }

        public int hashCode() {
            return this.f93371iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93371iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteHistoryClicked(history=" + this.f93371iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f93372iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 1729271933;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class oxmwwwfdhm extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final oxmwwwfdhm f93373iobyxmoadg = new oxmwwwfdhm();

        private oxmwwwfdhm() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f93374iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -149606734;
        }

        public String toString() {
            return "OnAgeCheckDecline";
        }
    }

    public static final class rgvfuqvkyq extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f93375iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f93376ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f93377zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(ProductUiModel uiModel, ProductCardEvent productCardEvent, boolean z13) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiModel, "uiModel");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f93375iobyxmoadg = uiModel;
            this.f93377zoijcleaow = productCardEvent;
            this.f93376ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93375iobyxmoadg, rgvfuqvkyqVar.f93375iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93377zoijcleaow, rgvfuqvkyqVar.f93377zoijcleaow) && this.f93376ppxfxbqfkf == rgvfuqvkyqVar.f93376ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f93375iobyxmoadg.hashCode() * 31) + this.f93377zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f93376ppxfxbqfkf);
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f93377zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f93376ppxfxbqfkf;
        }

        public String toString() {
            return "OnProductChanged(uiModel=" + this.f93375iobyxmoadg + ", productCardEvent=" + this.f93377zoijcleaow + ", isRecommendation=" + this.f93376ppxfxbqfkf + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f93375iobyxmoadg;
        }
    }

    public static final class vdvldrhtss extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f93378iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f93379zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(ProductUiModel product, boolean z13) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f93378iobyxmoadg = product;
            this.f93379zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93378iobyxmoadg, vdvldrhtssVar.f93378iobyxmoadg) && this.f93379zoijcleaow == vdvldrhtssVar.f93379zoijcleaow;
        }

        public int hashCode() {
            return (this.f93378iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f93379zoijcleaow);
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f93378iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(product=" + this.f93378iobyxmoadg + ", isRecommendation=" + this.f93379zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f93379zoijcleaow;
        }
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f93380iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -1683288941;
        }

        public String toString() {
            return "OnHistoryClearClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2189wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2189wkgbmnqykc f93381iobyxmoadg = new C2189wkgbmnqykc();

        private C2189wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2189wkgbmnqykc);
        }

        public int hashCode() {
            return -2120881178;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class yggfygwlhe extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f93382iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
            super(null);
        }
    }

    public static final class zdlpuopuiu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f93383iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 1219822717;
        }

        public String toString() {
            return "OnSearchConfirm";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bq0.iobyxmoadg f93384iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(bq0.iobyxmoadg cachedParams) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cachedParams, "cachedParams");
            this.f93384iobyxmoadg = cachedParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93384iobyxmoadg, ((zoijcleaow) obj).f93384iobyxmoadg);
        }

        public int hashCode() {
            return this.f93384iobyxmoadg.hashCode();
        }

        public final bq0.iobyxmoadg iobyxmoadg() {
            return this.f93384iobyxmoadg;
        }

        public String toString() {
            return "OnAgeCheckApprove(cachedParams=" + this.f93384iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

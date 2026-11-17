package aq0;

import p0.tzroggbefp;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.catalog.impl.search.models.SearchCategoryUiModel;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class agtfadlqog implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f14104iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 851330531;
        }

        public String toString() {
            return "OnHistoryClearClicked";
        }
    }

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dq0.iobyxmoadg f14105iobyxmoadg;

        public btonecajqb(dq0.iobyxmoadg feature) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feature, "feature");
            this.f14105iobyxmoadg = feature;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14105iobyxmoadg, ((btonecajqb) obj).f14105iobyxmoadg);
        }

        public int hashCode() {
            return this.f14105iobyxmoadg.hashCode();
        }

        public final dq0.iobyxmoadg iobyxmoadg() {
            return this.f14105iobyxmoadg;
        }

        public String toString() {
            return "OnFeatureClicked(feature=" + this.f14105iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14106iobyxmoadg;

        public cqumvgiudr(boolean z13) {
            this.f14106iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && this.f14106iobyxmoadg == ((cqumvgiudr) obj).f14106iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14106iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14106iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f14106iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14107iobyxmoadg;

        public draadjrbmk(boolean z13) {
            this.f14107iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && this.f14107iobyxmoadg == ((draadjrbmk) obj).f14107iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14107iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14107iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f14107iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f14108eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14109iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f14110ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f14111wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f14112zoijcleaow;

        public dxjokdxxww(String productId, String productArticle, String productName, boolean z13, boolean z14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productName, "productName");
            this.f14109iobyxmoadg = productId;
            this.f14112zoijcleaow = productArticle;
            this.f14110ppxfxbqfkf = productName;
            this.f14111wkgbmnqykc = z13;
            this.f14108eablkybsjg = z14;
        }

        public final boolean eablkybsjg() {
            return this.f14108eablkybsjg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14109iobyxmoadg, dxjokdxxwwVar.f14109iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14112zoijcleaow, dxjokdxxwwVar.f14112zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14110ppxfxbqfkf, dxjokdxxwwVar.f14110ppxfxbqfkf) && this.f14111wkgbmnqykc == dxjokdxxwwVar.f14111wkgbmnqykc && this.f14108eablkybsjg == dxjokdxxwwVar.f14108eablkybsjg;
        }

        public int hashCode() {
            return (((((((this.f14109iobyxmoadg.hashCode() * 31) + this.f14112zoijcleaow.hashCode()) * 31) + this.f14110ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f14111wkgbmnqykc)) * 31) + Boolean.hashCode(this.f14108eablkybsjg);
        }

        public final String iobyxmoadg() {
            return this.f14112zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f14110ppxfxbqfkf;
        }

        public String toString() {
            return "OnFavoriteClicked(productId=" + this.f14109iobyxmoadg + ", productArticle=" + this.f14112zoijcleaow + ", productName=" + this.f14110ppxfxbqfkf + ", isFavorite=" + this.f14111wkgbmnqykc + ", isRecommendation=" + this.f14108eablkybsjg + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f14111wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f14109iobyxmoadg;
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SearchCategoryUiModel f14113iobyxmoadg;

        public eablkybsjg(SearchCategoryUiModel category) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(category, "category");
            this.f14113iobyxmoadg = category;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14113iobyxmoadg, ((eablkybsjg) obj).f14113iobyxmoadg);
        }

        public int hashCode() {
            return this.f14113iobyxmoadg.hashCode();
        }

        public final SearchCategoryUiModel iobyxmoadg() {
            return this.f14113iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryClicked(category=" + this.f14113iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14114iobyxmoadg;

        public esjtqupxsv(String query) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            this.f14114iobyxmoadg = query;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof esjtqupxsv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14114iobyxmoadg, ((esjtqupxsv) obj).f14114iobyxmoadg);
        }

        public int hashCode() {
            return this.f14114iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f14114iobyxmoadg;
        }

        public String toString() {
            return "OnSuggestionClicked(query=" + this.f14114iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f14115iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }
    }

    /* JADX INFO: renamed from: aq0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C0217gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0217gxszxtbevo f14116iobyxmoadg = new C0217gxszxtbevo();

        private C0217gxszxtbevo() {
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f14117ppxfxbqfkf = CounterModel.f93858wwaezpbzkn;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f14118iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final CounterModel f14119zoijcleaow;

        public iobyxmoadg(ProductUiModel product, CounterModel counterModel) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(counterModel, "counterModel");
            this.f14118iobyxmoadg = product;
            this.f14119zoijcleaow = counterModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14118iobyxmoadg, iobyxmoadgVar.f14118iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14119zoijcleaow, iobyxmoadgVar.f14119zoijcleaow);
        }

        public int hashCode() {
            return (this.f14118iobyxmoadg.hashCode() * 31) + this.f14119zoijcleaow.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f14118iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchaseListClicked(product=" + this.f14118iobyxmoadg + ", counterModel=" + this.f14119zoijcleaow + ")";
        }
    }

    public static final class iwizpuwonk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f14120iobyxmoadg;

        public iwizpuwonk(mz0.ppxfxbqfkf type) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            this.f14120iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && this.f14120iobyxmoadg == ((iwizpuwonk) obj).f14120iobyxmoadg;
        }

        public int hashCode() {
            return this.f14120iobyxmoadg.hashCode();
        }

        public final mz0.ppxfxbqfkf iobyxmoadg() {
            return this.f14120iobyxmoadg;
        }

        public String toString() {
            return "OnSortSelected(type=" + this.f14120iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f14121iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
        }
    }

    public static final class kcexrzcfyt implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f14122iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f14123iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1648159579;
        }

        public String toString() {
            return "OnClearClicked";
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14124iobyxmoadg;

        public nufgyqmvbu(String history) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(history, "history");
            this.f14124iobyxmoadg = history;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14124iobyxmoadg, ((nufgyqmvbu) obj).f14124iobyxmoadg);
        }

        public int hashCode() {
            return this.f14124iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f14124iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteHistoryClicked(history=" + this.f14124iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14125iobyxmoadg;

        public ojitshcjhn(String history) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(history, "history");
            this.f14125iobyxmoadg = history;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14125iobyxmoadg, ((ojitshcjhn) obj).f14125iobyxmoadg);
        }

        public int hashCode() {
            return this.f14125iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f14125iobyxmoadg;
        }

        public String toString() {
            return "OnHistoryClicked(history=" + this.f14125iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14126iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f14127ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f14128wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f14129zoijcleaow;

        public oxmwwwfdhm(String productId, String productArticle, String productName, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productName, "productName");
            this.f14126iobyxmoadg = productId;
            this.f14129zoijcleaow = productArticle;
            this.f14127ppxfxbqfkf = productName;
            this.f14128wkgbmnqykc = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14126iobyxmoadg, oxmwwwfdhmVar.f14126iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14129zoijcleaow, oxmwwwfdhmVar.f14129zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14127ppxfxbqfkf, oxmwwwfdhmVar.f14127ppxfxbqfkf) && this.f14128wkgbmnqykc == oxmwwwfdhmVar.f14128wkgbmnqykc;
        }

        public int hashCode() {
            return (((((this.f14126iobyxmoadg.hashCode() * 31) + this.f14129zoijcleaow.hashCode()) * 31) + this.f14127ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f14128wkgbmnqykc);
        }

        public final String iobyxmoadg() {
            return this.f14129zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f14127ppxfxbqfkf;
        }

        public String toString() {
            return "OnProductClicked(productId=" + this.f14126iobyxmoadg + ", productArticle=" + this.f14129zoijcleaow + ", productName=" + this.f14127ppxfxbqfkf + ", isRecommendation=" + this.f14128wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f14128wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f14126iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f14130iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1260810238;
        }

        public String toString() {
            return "OnAgeCheckDecline";
        }
    }

    public static final class rgvfuqvkyq implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f14131iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return -1043984083;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class vdvldrhtss implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f14132iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f14133ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f14134zoijcleaow;

        public vdvldrhtss(ProductUiModel uiModel, ProductCardEvent productCardEvent, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiModel, "uiModel");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f14132iobyxmoadg = uiModel;
            this.f14134zoijcleaow = productCardEvent;
            this.f14133ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14132iobyxmoadg, vdvldrhtssVar.f14132iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14134zoijcleaow, vdvldrhtssVar.f14134zoijcleaow) && this.f14133ppxfxbqfkf == vdvldrhtssVar.f14133ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f14132iobyxmoadg.hashCode() * 31) + this.f14134zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f14133ppxfxbqfkf);
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f14134zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f14133ppxfxbqfkf;
        }

        public String toString() {
            return "OnProductChanged(uiModel=" + this.f14132iobyxmoadg + ", productCardEvent=" + this.f14134zoijcleaow + ", isRecommendation=" + this.f14133ppxfxbqfkf + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f14132iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f14135iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.SearchItemElement.Item f14136zoijcleaow;

        public wflxmlrfwp(HintUiModel hint, AnalyticElement.SearchItemElement.Item analyticsElement) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsElement, "analyticsElement");
            this.f14135iobyxmoadg = hint;
            this.f14136zoijcleaow = analyticsElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14135iobyxmoadg, wflxmlrfwpVar.f14135iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14136zoijcleaow, wflxmlrfwpVar.f14136zoijcleaow);
        }

        public int hashCode() {
            return (this.f14135iobyxmoadg.hashCode() * 31) + this.f14136zoijcleaow.hashCode();
        }

        public final AnalyticElement.SearchItemElement.Item iobyxmoadg() {
            return this.f14136zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f14135iobyxmoadg + ", analyticsElement=" + this.f14136zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f14135iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f14137iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 2102495542;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class yggfygwlhe implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f14138iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return -1748928051;
        }

        public String toString() {
            return "OnSearchConfirm";
        }
    }

    public static final class zdlpuopuiu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f14139iobyxmoadg;

        public zdlpuopuiu(tzroggbefp query) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            this.f14139iobyxmoadg = query;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14139iobyxmoadg, ((zdlpuopuiu) obj).f14139iobyxmoadg);
        }

        public int hashCode() {
            return this.f14139iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f14139iobyxmoadg;
        }

        public String toString() {
            return "OnSearchChanged(query=" + this.f14139iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bq0.iobyxmoadg f14140iobyxmoadg;

        public zoijcleaow(bq0.iobyxmoadg cachedParams) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cachedParams, "cachedParams");
            this.f14140iobyxmoadg = cachedParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f14140iobyxmoadg, ((zoijcleaow) obj).f14140iobyxmoadg);
        }

        public int hashCode() {
            return this.f14140iobyxmoadg.hashCode();
        }

        public final bq0.iobyxmoadg iobyxmoadg() {
            return this.f14140iobyxmoadg;
        }

        public String toString() {
            return "OnAgeCheckApprove(cachedParams=" + this.f14140iobyxmoadg + ")";
        }
    }
}

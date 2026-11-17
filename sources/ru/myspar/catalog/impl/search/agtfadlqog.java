package ru.myspar.catalog.impl.search;

import p0.tzroggbefp;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.catalog.impl.search.models.SearchCategoryUiModel;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.product.ProductListData;

/* JADX INFO: loaded from: classes4.dex */
public abstract class agtfadlqog {

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.search.agtfadlqog$agtfadlqog, reason: collision with other inner class name */
    public static final class C1946agtfadlqog extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1946agtfadlqog f85401iobyxmoadg = new C1946agtfadlqog();

        private C1946agtfadlqog() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1946agtfadlqog);
        }

        public int hashCode() {
            return 1100600112;
        }

        public String toString() {
            return "OnHistoryClearClicked";
        }
    }

    public static final class btonecajqb extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f85402iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(ProductUiModel product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f85402iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85402iobyxmoadg, ((btonecajqb) obj).f85402iobyxmoadg);
        }

        public int hashCode() {
            return this.f85402iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f85402iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(product=" + this.f85402iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85403iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cqumvgiudr(String query) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            this.f85403iobyxmoadg = query;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85403iobyxmoadg, ((cqumvgiudr) obj).f85403iobyxmoadg);
        }

        public int hashCode() {
            return this.f85403iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85403iobyxmoadg;
        }

        public String toString() {
            return "OnSuggestionClicked(query=" + this.f85403iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f85404iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }
    }

    public static final class dxjokdxxww extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85405iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String history) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(history, "history");
            this.f85405iobyxmoadg = history;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85405iobyxmoadg, ((dxjokdxxww) obj).f85405iobyxmoadg);
        }

        public int hashCode() {
            return this.f85405iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85405iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteHistoryClicked(history=" + this.f85405iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f85406iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 2014438083;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class gtknphoqwx extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pr.iobyxmoadg f85407iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(pr.iobyxmoadg feature) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feature, "feature");
            this.f85407iobyxmoadg = feature;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85407iobyxmoadg, ((gtknphoqwx) obj).f85407iobyxmoadg);
        }

        public int hashCode() {
            return this.f85407iobyxmoadg.hashCode();
        }

        public final pr.iobyxmoadg iobyxmoadg() {
            return this.f85407iobyxmoadg;
        }

        public String toString() {
            return "OnFeatureClicked(feature=" + this.f85407iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SearchCategoryUiModel f85408iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(SearchCategoryUiModel category) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(category, "category");
            this.f85408iobyxmoadg = category;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85408iobyxmoadg, ((gxszxtbevo) obj).f85408iobyxmoadg);
        }

        public int hashCode() {
            return this.f85408iobyxmoadg.hashCode();
        }

        public final SearchCategoryUiModel iobyxmoadg() {
            return this.f85408iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryClicked(category=" + this.f85408iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends agtfadlqog {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f85409ppxfxbqfkf = CounterModel.f86124wwaezpbzkn;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f85410iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final CounterModel f85411zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ProductUiModel product, CounterModel counterModel) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(counterModel, "counterModel");
            this.f85410iobyxmoadg = product;
            this.f85411zoijcleaow = counterModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85410iobyxmoadg, iobyxmoadgVar.f85410iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85411zoijcleaow, iobyxmoadgVar.f85411zoijcleaow);
        }

        public int hashCode() {
            return (this.f85410iobyxmoadg.hashCode() * 31) + this.f85411zoijcleaow.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f85410iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchaseListClicked(product=" + this.f85410iobyxmoadg + ", counterModel=" + this.f85411zoijcleaow + ")";
        }
    }

    public static final class iwizpuwonk extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f85412iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iwizpuwonk(v00.ppxfxbqfkf type) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            this.f85412iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && this.f85412iobyxmoadg == ((iwizpuwonk) obj).f85412iobyxmoadg;
        }

        public int hashCode() {
            return this.f85412iobyxmoadg.hashCode();
        }

        public final v00.ppxfxbqfkf iobyxmoadg() {
            return this.f85412iobyxmoadg;
        }

        public String toString() {
            return "OnSortSelected(type=" + this.f85412iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f85413iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
            super(null);
        }
    }

    public static final class kcexrzcfyt extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f85414iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f85415iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f85416iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -742902792;
        }

        public String toString() {
            return "OnClearClicked";
        }
    }

    public static final class ojitshcjhn extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85417iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(String history) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(history, "history");
            this.f85417iobyxmoadg = history;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85417iobyxmoadg, ((ojitshcjhn) obj).f85417iobyxmoadg);
        }

        public int hashCode() {
            return this.f85417iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85417iobyxmoadg;
        }

        public String toString() {
            return "OnHistoryClicked(history=" + this.f85417iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f85418iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(ProductUiModel product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f85418iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85418iobyxmoadg, ((oxmwwwfdhm) obj).f85418iobyxmoadg);
        }

        public int hashCode() {
            return this.f85418iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f85418iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(product=" + this.f85418iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f85419iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -855520305;
        }

        public String toString() {
            return "OnAgeCheckDecline";
        }
    }

    public static final class rgvfuqvkyq extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f85420iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 1308480000;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class vdvldrhtss extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f85421iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f85422zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(ProductUiModel uiModel, ProductCardEvent productCardEvent) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiModel, "uiModel");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f85421iobyxmoadg = uiModel;
            this.f85422zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85421iobyxmoadg, vdvldrhtssVar.f85421iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85422zoijcleaow, vdvldrhtssVar.f85422zoijcleaow);
        }

        public int hashCode() {
            return (this.f85421iobyxmoadg.hashCode() * 31) + this.f85422zoijcleaow.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f85422zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(uiModel=" + this.f85421iobyxmoadg + ", productCardEvent=" + this.f85422zoijcleaow + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f85421iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f85423iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.SearchItemElement.Item f85424zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(HintUiModel hint, AnalyticElement.SearchItemElement.Item analyticsElement) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsElement, "analyticsElement");
            this.f85423iobyxmoadg = hint;
            this.f85424zoijcleaow = analyticsElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85423iobyxmoadg, wflxmlrfwpVar.f85423iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85424zoijcleaow, wflxmlrfwpVar.f85424zoijcleaow);
        }

        public int hashCode() {
            return (this.f85423iobyxmoadg.hashCode() * 31) + this.f85424zoijcleaow.hashCode();
        }

        public final AnalyticElement.SearchItemElement.Item iobyxmoadg() {
            return this.f85424zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f85423iobyxmoadg + ", analyticsElement=" + this.f85424zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f85423iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f85425iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(ChangeProductParams params) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f85425iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85425iobyxmoadg, ((wkgbmnqykc) obj).f85425iobyxmoadg);
        }

        public int hashCode() {
            return this.f85425iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f85425iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f85425iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f85426iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return 544228570;
        }

        public String toString() {
            return "OnSearchConfirm";
        }
    }

    public static final class zdlpuopuiu extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f85427iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zdlpuopuiu(tzroggbefp query) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            this.f85427iobyxmoadg = query;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85427iobyxmoadg, ((zdlpuopuiu) obj).f85427iobyxmoadg);
        }

        public int hashCode() {
            return this.f85427iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f85427iobyxmoadg;
        }

        public String toString() {
            return "OnSearchChanged(query=" + this.f85427iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListData f85428iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ru.myspar.catalog.impl.search.zdlpuopuiu.zoijcleaow f85429zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ProductListData products, ru.myspar.catalog.impl.search.zdlpuopuiu.zoijcleaow cachedParams) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(products, "products");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cachedParams, "cachedParams");
            this.f85428iobyxmoadg = products;
            this.f85429zoijcleaow = cachedParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85428iobyxmoadg, zoijcleaowVar.f85428iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85429zoijcleaow, zoijcleaowVar.f85429zoijcleaow);
        }

        public int hashCode() {
            return (this.f85428iobyxmoadg.hashCode() * 31) + this.f85429zoijcleaow.hashCode();
        }

        public final ru.myspar.catalog.impl.search.zdlpuopuiu.zoijcleaow iobyxmoadg() {
            return this.f85429zoijcleaow;
        }

        public String toString() {
            return "OnAgeCheckApprove(products=" + this.f85428iobyxmoadg + ", cachedParams=" + this.f85429zoijcleaow + ")";
        }

        public final ProductListData zoijcleaow() {
            return this.f85428iobyxmoadg;
        }
    }

    public /* synthetic */ agtfadlqog(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private agtfadlqog() {
    }
}

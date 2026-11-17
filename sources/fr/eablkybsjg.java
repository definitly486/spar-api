package fr;

import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class agtfadlqog implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f34612iobyxmoadg;

        public agtfadlqog(ChangeProductParams params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f34612iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34612iobyxmoadg, ((agtfadlqog) obj).f34612iobyxmoadg);
        }

        public int hashCode() {
            return this.f34612iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f34612iobyxmoadg;
        }

        public String toString() {
            return "OnIqosAgreementConfirmed(params=" + this.f34612iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34613iobyxmoadg;

        public btonecajqb(String productId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f34613iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34613iobyxmoadg, ((btonecajqb) obj).f34613iobyxmoadg);
        }

        public int hashCode() {
            return this.f34613iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34613iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(productId=" + this.f34613iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f34614iobyxmoadg;

        public cqumvgiudr(v00.ppxfxbqfkf type) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            this.f34614iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && this.f34614iobyxmoadg == ((cqumvgiudr) obj).f34614iobyxmoadg;
        }

        public int hashCode() {
            return this.f34614iobyxmoadg.hashCode();
        }

        public final v00.ppxfxbqfkf iobyxmoadg() {
            return this.f34614iobyxmoadg;
        }

        public String toString() {
            return "OnSortSelected(type=" + this.f34614iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34615iobyxmoadg;

        public draadjrbmk(boolean z13) {
            this.f34615iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && this.f34615iobyxmoadg == ((draadjrbmk) obj).f34615iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34615iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34615iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f34615iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34616iobyxmoadg;

        public dxjokdxxww(String comboSetId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetId, "comboSetId");
            this.f34616iobyxmoadg = comboSetId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34616iobyxmoadg, ((dxjokdxxww) obj).f34616iobyxmoadg);
        }

        public int hashCode() {
            return this.f34616iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34616iobyxmoadg;
        }

        public String toString() {
            return "OnClickedComboShowAll(comboSetId=" + this.f34616iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: fr.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0767eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34617iobyxmoadg;

        public C0767eablkybsjg(String bannerId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bannerId, "bannerId");
            this.f34617iobyxmoadg = bannerId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0767eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34617iobyxmoadg, ((C0767eablkybsjg) obj).f34617iobyxmoadg);
        }

        public int hashCode() {
            return this.f34617iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34617iobyxmoadg;
        }

        public String toString() {
            return "OnBannerClicked(bannerId=" + this.f34617iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34618iobyxmoadg;

        public esjtqupxsv(boolean z13) {
            this.f34618iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof esjtqupxsv) && this.f34618iobyxmoadg == ((esjtqupxsv) obj).f34618iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34618iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34618iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f34618iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f34619iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return -1683107811;
        }

        public String toString() {
            return "OnFiltersClicked";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f34620iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1441683143;
        }

        public String toString() {
            return "OnChangeListType";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34621iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f34622zoijcleaow;

        public iobyxmoadg(String productId, double d13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f34621iobyxmoadg = productId;
            this.f34622zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34621iobyxmoadg, iobyxmoadgVar.f34621iobyxmoadg) && Double.compare(this.f34622zoijcleaow, iobyxmoadgVar.f34622zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f34621iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f34622zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f34621iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchaseListClicked(productId=" + this.f34621iobyxmoadg + ", quantity=" + this.f34622zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f34622zoijcleaow;
        }
    }

    public static final class iwizpuwonk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f34623iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return 1137137112;
        }

        public String toString() {
            return "OnSortClicked";
        }
    }

    public static final class jyumaefscl implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f34624iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return 1957762766;
        }

        public String toString() {
            return "OnSearchClicked";
        }
    }

    public static final class kcexrzcfyt implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f34625iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return 591303562;
        }

        public String toString() {
            return "OnRefresh";
        }
    }

    public static final class lereixgezr implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34626iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f34627zoijcleaow;

        public lereixgezr(String categoryTitle, String categoryId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f34626iobyxmoadg = categoryTitle;
            this.f34627zoijcleaow = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lereixgezr)) {
                return false;
            }
            lereixgezr lereixgezrVar = (lereixgezr) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34626iobyxmoadg, lereixgezrVar.f34626iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34627zoijcleaow, lereixgezrVar.f34627zoijcleaow);
        }

        public int hashCode() {
            return (this.f34626iobyxmoadg.hashCode() * 31) + this.f34627zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34627zoijcleaow;
        }

        public String toString() {
            return "OnSubCategoryClicked(categoryTitle=" + this.f34626iobyxmoadg + ", categoryId=" + this.f34627zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f34626iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f34628iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final mo.zoijcleaow f34629zoijcleaow;

        public lqeggnwhkg(ComboSetProduct comboSetProduct, mo.zoijcleaow analyticsData) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
            this.f34628iobyxmoadg = comboSetProduct;
            this.f34629zoijcleaow = analyticsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34628iobyxmoadg, lqeggnwhkgVar.f34628iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34629zoijcleaow, lqeggnwhkgVar.f34629zoijcleaow);
        }

        public int hashCode() {
            return (this.f34628iobyxmoadg.hashCode() * 31) + this.f34629zoijcleaow.hashCode();
        }

        public final mo.zoijcleaow iobyxmoadg() {
            return this.f34629zoijcleaow;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f34628iobyxmoadg + ", analyticsData=" + this.f34629zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f34628iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f34630iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f34631zoijcleaow;

        public nufgyqmvbu(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f34630iobyxmoadg = productFirst;
            this.f34631zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34630iobyxmoadg, nufgyqmvbuVar.f34630iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34631zoijcleaow, nufgyqmvbuVar.f34631zoijcleaow);
        }

        public int hashCode() {
            return (this.f34630iobyxmoadg.hashCode() * 31) + this.f34631zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f34630iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f34630iobyxmoadg + ", productSecond=" + this.f34631zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f34631zoijcleaow;
        }
    }

    public static final class ojitshcjhn implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f34632iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 188493016;
        }

        public String toString() {
            return "OnNavigateToCartTab";
        }
    }

    public static final class oxmwwwfdhm implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34633iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f34634ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final AnalyticsLocation f34635wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f34636zoijcleaow;

        public oxmwwwfdhm(String productName, String productId, String productArticle, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productName, "productName");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f34633iobyxmoadg = productName;
            this.f34636zoijcleaow = productId;
            this.f34634ppxfxbqfkf = productArticle;
            this.f34635wkgbmnqykc = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34633iobyxmoadg, oxmwwwfdhmVar.f34633iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34636zoijcleaow, oxmwwwfdhmVar.f34636zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34634ppxfxbqfkf, oxmwwwfdhmVar.f34634ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34635wkgbmnqykc, oxmwwwfdhmVar.f34635wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f34633iobyxmoadg.hashCode() * 31) + this.f34636zoijcleaow.hashCode()) * 31) + this.f34634ppxfxbqfkf.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f34635wkgbmnqykc;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f34635wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f34636zoijcleaow;
        }

        public String toString() {
            return "OnProductClicked(productName=" + this.f34633iobyxmoadg + ", productId=" + this.f34636zoijcleaow + ", productArticle=" + this.f34634ppxfxbqfkf + ", analyticsLocation=" + this.f34635wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f34633iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f34634ppxfxbqfkf;
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f34637iobyxmoadg;

        public ppxfxbqfkf(ChangeProductParams params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f34637iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34637iobyxmoadg, ((ppxfxbqfkf) obj).f34637iobyxmoadg);
        }

        public int hashCode() {
            return this.f34637iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f34637iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f34637iobyxmoadg + ")";
        }
    }

    public static final class rgvfuqvkyq implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f34638iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return -1009203885;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class vdvldrhtss implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34639iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f34640ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f34641zoijcleaow;

        public vdvldrhtss(String productArticle, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f34639iobyxmoadg = productArticle;
            this.f34641zoijcleaow = productCardEvent;
            this.f34640ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34639iobyxmoadg, vdvldrhtssVar.f34639iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34641zoijcleaow, vdvldrhtssVar.f34641zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34640ppxfxbqfkf, vdvldrhtssVar.f34640ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f34639iobyxmoadg.hashCode() * 31) + this.f34641zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f34640ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f34640ppxfxbqfkf;
        }

        public final ProductCardEvent ppxfxbqfkf() {
            return this.f34641zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productArticle=" + this.f34639iobyxmoadg + ", productCardEvent=" + this.f34641zoijcleaow + ", analyticsLocation=" + this.f34640ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f34639iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f34642iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f34643ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f34644zoijcleaow;

        public wflxmlrfwp(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f34642iobyxmoadg = hint;
            this.f34644zoijcleaow = analyticElement;
            this.f34643ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34642iobyxmoadg, wflxmlrfwpVar.f34642iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34644zoijcleaow, wflxmlrfwpVar.f34644zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34643ppxfxbqfkf, wflxmlrfwpVar.f34643ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f34642iobyxmoadg.hashCode() * 31) + this.f34644zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f34643ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f34644zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f34642iobyxmoadg;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f34642iobyxmoadg + ", analyticElement=" + this.f34644zoijcleaow + ", analyticsLocation=" + this.f34643ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f34643ppxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f34645iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1381617041;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class yggfygwlhe implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f34646iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return 20260346;
        }

        public String toString() {
            return "OnScanClick";
        }
    }

    public static final class zdlpuopuiu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f34647iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 1937882332;
        }

        public String toString() {
            return "OnReturnToOrderEdit";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34648iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f34649ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f34650zoijcleaow;

        public zoijcleaow(boolean z13, String categoryTitle, String categoryId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f34648iobyxmoadg = z13;
            this.f34650zoijcleaow = categoryTitle;
            this.f34649ppxfxbqfkf = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f34648iobyxmoadg == zoijcleaowVar.f34648iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34650zoijcleaow, zoijcleaowVar.f34650zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34649ppxfxbqfkf, zoijcleaowVar.f34649ppxfxbqfkf);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f34648iobyxmoadg) * 31) + this.f34650zoijcleaow.hashCode()) * 31) + this.f34649ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34649ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f34648iobyxmoadg;
        }

        public String toString() {
            return "OnAgeConfirmDialogAction(isAgeConfirmed=" + this.f34648iobyxmoadg + ", categoryTitle=" + this.f34650zoijcleaow + ", categoryId=" + this.f34649ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f34650zoijcleaow;
        }
    }
}

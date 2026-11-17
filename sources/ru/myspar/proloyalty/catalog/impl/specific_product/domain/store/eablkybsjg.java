package ru.myspar.proloyalty.catalog.impl.specific_product.domain.store;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;
import ru.myspar.proloyalty.core.domain.models.product.VivinoRating;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class agtfadlqog implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f93420ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f93421iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f93422zoijcleaow;

        public agtfadlqog(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f93421iobyxmoadg = hint;
            this.f93422zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return zdlpuopuiu.eablkybsjg(this.f93421iobyxmoadg, agtfadlqogVar.f93421iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93422zoijcleaow, agtfadlqogVar.f93422zoijcleaow);
        }

        public int hashCode() {
            return (this.f93421iobyxmoadg.hashCode() * 31) + this.f93422zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f93422zoijcleaow;
        }

        public String toString() {
            return "ShowHint(hint=" + this.f93421iobyxmoadg + ", analyticsInfo=" + this.f93422zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f93421iobyxmoadg;
        }
    }

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93423iobyxmoadg;

        public btonecajqb(String article) {
            zdlpuopuiu.btonecajqb(article, "article");
            this.f93423iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f93423iobyxmoadg, ((btonecajqb) obj).f93423iobyxmoadg);
        }

        public int hashCode() {
            return this.f93423iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93423iobyxmoadg;
        }

        public String toString() {
            return "OpenShareProduct(article=" + this.f93423iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93424iobyxmoadg;

        public draadjrbmk(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f93424iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f93424iobyxmoadg, ((draadjrbmk) obj).f93424iobyxmoadg);
        }

        public int hashCode() {
            return this.f93424iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93424iobyxmoadg;
        }

        public String toString() {
            return "OpenVideoPhoto(url=" + this.f93424iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93425iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f93426zoijcleaow;

        public dxjokdxxww(String productArticle, String productName) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f93425iobyxmoadg = productArticle;
            this.f93426zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f93425iobyxmoadg, dxjokdxxwwVar.f93425iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93426zoijcleaow, dxjokdxxwwVar.f93426zoijcleaow);
        }

        public int hashCode() {
            return (this.f93425iobyxmoadg.hashCode() * 31) + this.f93426zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93425iobyxmoadg;
        }

        public String toString() {
            return "OpenRateProduct(productArticle=" + this.f93425iobyxmoadg + ", productName=" + this.f93426zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f93426zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2191eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93427iobyxmoadg;

        public C2191eablkybsjg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f93427iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2191eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f93427iobyxmoadg, ((C2191eablkybsjg) obj).f93427iobyxmoadg);
        }

        public int hashCode() {
            return this.f93427iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93427iobyxmoadg;
        }

        public String toString() {
            return "OpenOrderEdit(orderId=" + this.f93427iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductPayload f93428iobyxmoadg;

        public gtknphoqwx(ProductPayload productPayload) {
            zdlpuopuiu.btonecajqb(productPayload, "productPayload");
            this.f93428iobyxmoadg = productPayload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f93428iobyxmoadg, ((gtknphoqwx) obj).f93428iobyxmoadg);
        }

        public int hashCode() {
            return this.f93428iobyxmoadg.hashCode();
        }

        public final ProductPayload iobyxmoadg() {
            return this.f93428iobyxmoadg;
        }

        public String toString() {
            return "OpenSpecificProduct(productPayload=" + this.f93428iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93429iobyxmoadg;

        public gxszxtbevo(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f93429iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f93429iobyxmoadg, ((gxszxtbevo) obj).f93429iobyxmoadg);
        }

        public int hashCode() {
            return this.f93429iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93429iobyxmoadg;
        }

        public String toString() {
            return "OpenProductPhoto(url=" + this.f93429iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f93430iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 177421322;
        }

        public String toString() {
            return "Exit";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93431iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Double f93432ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final ColorsModel f93433wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f93434zoijcleaow;

        public lqeggnwhkg(String productArticle, String productName, Double d13, ColorsModel colorsModel) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f93431iobyxmoadg = productArticle;
            this.f93434zoijcleaow = productName;
            this.f93432ppxfxbqfkf = d13;
            this.f93433wkgbmnqykc = colorsModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f93431iobyxmoadg, lqeggnwhkgVar.f93431iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93434zoijcleaow, lqeggnwhkgVar.f93434zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f93432ppxfxbqfkf, lqeggnwhkgVar.f93432ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f93433wkgbmnqykc, lqeggnwhkgVar.f93433wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((this.f93431iobyxmoadg.hashCode() * 31) + this.f93434zoijcleaow.hashCode()) * 31;
            Double d13 = this.f93432ppxfxbqfkf;
            int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
            ColorsModel colorsModel = this.f93433wkgbmnqykc;
            return iHashCode2 + (colorsModel != null ? colorsModel.hashCode() : 0);
        }

        public final ColorsModel iobyxmoadg() {
            return this.f93433wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f93434zoijcleaow;
        }

        public String toString() {
            return "OpenProductReviews(productArticle=" + this.f93431iobyxmoadg + ", productName=" + this.f93434zoijcleaow + ", productRating=" + this.f93432ppxfxbqfkf + ", colorsModel=" + this.f93433wkgbmnqykc + ")";
        }

        public final Double wkgbmnqykc() {
            return this.f93432ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f93431iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f93435iobyxmoadg;

        public nufgyqmvbu(PurchaseListAddProductDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f93435iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f93435iobyxmoadg, ((nufgyqmvbu) obj).f93435iobyxmoadg);
        }

        public int hashCode() {
            return this.f93435iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f93435iobyxmoadg;
        }

        public String toString() {
            return "OpenPurchaseList(args=" + this.f93435iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f93436iobyxmoadg;

        public ojitshcjhn(List declarations) {
            zdlpuopuiu.btonecajqb(declarations, "declarations");
            this.f93436iobyxmoadg = declarations;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f93436iobyxmoadg, ((ojitshcjhn) obj).f93436iobyxmoadg);
        }

        public int hashCode() {
            return this.f93436iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f93436iobyxmoadg;
        }

        public String toString() {
            return "ShowProductDeclarations(declarations=" + this.f93436iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f93437iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 934546806;
        }

        public String toString() {
            return "OpenCart";
        }
    }

    public static final class wflxmlrfwp implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VivinoRating f93438iobyxmoadg;

        public wflxmlrfwp(VivinoRating vivinoRating) {
            zdlpuopuiu.btonecajqb(vivinoRating, "vivinoRating");
            this.f93438iobyxmoadg = vivinoRating;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f93438iobyxmoadg, ((wflxmlrfwp) obj).f93438iobyxmoadg);
        }

        public int hashCode() {
            return this.f93438iobyxmoadg.hashCode();
        }

        public final VivinoRating iobyxmoadg() {
            return this.f93438iobyxmoadg;
        }

        public String toString() {
            return "OpenVivinoInfo(vivinoRating=" + this.f93438iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSet f93439iobyxmoadg;

        public wkgbmnqykc(ComboSet comboSet) {
            zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f93439iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f93439iobyxmoadg, ((wkgbmnqykc) obj).f93439iobyxmoadg);
        }

        public int hashCode() {
            return this.f93439iobyxmoadg.hashCode();
        }

        public final ComboSet iobyxmoadg() {
            return this.f93439iobyxmoadg;
        }

        public String toString() {
            return "OpenComboSet(comboSet=" + this.f93439iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f93440iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 2037706609;
        }

        public String toString() {
            return "OpenAuthorized";
        }
    }
}

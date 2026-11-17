package ru.myspar.catalog.impl.specific_product.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.comboset.ComboSet;
import ru.myspar.core.domain.models.product.VivinoRating;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class agtfadlqog implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VivinoRating f85690iobyxmoadg;

        public agtfadlqog(VivinoRating vivinoRating) {
            zdlpuopuiu.btonecajqb(vivinoRating, "vivinoRating");
            this.f85690iobyxmoadg = vivinoRating;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f85690iobyxmoadg, ((agtfadlqog) obj).f85690iobyxmoadg);
        }

        public int hashCode() {
            return this.f85690iobyxmoadg.hashCode();
        }

        public final VivinoRating iobyxmoadg() {
            return this.f85690iobyxmoadg;
        }

        public String toString() {
            return "OpenVivinoInfo(vivinoRating=" + this.f85690iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85691iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f85692zoijcleaow;

        public btonecajqb(String productArticle, String productName) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f85691iobyxmoadg = productArticle;
            this.f85692zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f85691iobyxmoadg, btonecajqbVar.f85691iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85692zoijcleaow, btonecajqbVar.f85692zoijcleaow);
        }

        public int hashCode() {
            return (this.f85691iobyxmoadg.hashCode() * 31) + this.f85692zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85691iobyxmoadg;
        }

        public String toString() {
            return "OpenRateProduct(productArticle=" + this.f85691iobyxmoadg + ", productName=" + this.f85692zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f85692zoijcleaow;
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductPayload f85693iobyxmoadg;

        public draadjrbmk(ProductPayload productPayload) {
            zdlpuopuiu.btonecajqb(productPayload, "productPayload");
            this.f85693iobyxmoadg = productPayload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f85693iobyxmoadg, ((draadjrbmk) obj).f85693iobyxmoadg);
        }

        public int hashCode() {
            return this.f85693iobyxmoadg.hashCode();
        }

        public final ProductPayload iobyxmoadg() {
            return this.f85693iobyxmoadg;
        }

        public String toString() {
            return "OpenSpecificProduct(productPayload=" + this.f85693iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f85694iobyxmoadg;

        public dxjokdxxww(PurchaseListAddProductDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f85694iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f85694iobyxmoadg, ((dxjokdxxww) obj).f85694iobyxmoadg);
        }

        public int hashCode() {
            return this.f85694iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f85694iobyxmoadg;
        }

        public String toString() {
            return "OpenPurchaseList(args=" + this.f85694iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85696iobyxmoadg;

        public gtknphoqwx(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f85696iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f85696iobyxmoadg, ((gtknphoqwx) obj).f85696iobyxmoadg);
        }

        public int hashCode() {
            return this.f85696iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85696iobyxmoadg;
        }

        public String toString() {
            return "OpenShareProduct(productId=" + this.f85696iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85697iobyxmoadg;

        public gxszxtbevo(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f85697iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f85697iobyxmoadg, ((gxszxtbevo) obj).f85697iobyxmoadg);
        }

        public int hashCode() {
            return this.f85697iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85697iobyxmoadg;
        }

        public String toString() {
            return "OpenOrderEdit(orderId=" + this.f85697iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f85698iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -295491417;
        }

        public String toString() {
            return "Exit";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85699iobyxmoadg;

        public lqeggnwhkg(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f85699iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f85699iobyxmoadg, ((lqeggnwhkg) obj).f85699iobyxmoadg);
        }

        public int hashCode() {
            return this.f85699iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85699iobyxmoadg;
        }

        public String toString() {
            return "OpenProductPhoto(url=" + this.f85699iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85700iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Double f85701ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final ColorsModel f85702wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f85703zoijcleaow;

        public nufgyqmvbu(String productArticle, String productName, Double d13, ColorsModel colorsModel) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f85700iobyxmoadg = productArticle;
            this.f85703zoijcleaow = productName;
            this.f85701ppxfxbqfkf = d13;
            this.f85702wkgbmnqykc = colorsModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f85700iobyxmoadg, nufgyqmvbuVar.f85700iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85703zoijcleaow, nufgyqmvbuVar.f85703zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f85701ppxfxbqfkf, nufgyqmvbuVar.f85701ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f85702wkgbmnqykc, nufgyqmvbuVar.f85702wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((this.f85700iobyxmoadg.hashCode() * 31) + this.f85703zoijcleaow.hashCode()) * 31;
            Double d13 = this.f85701ppxfxbqfkf;
            int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
            ColorsModel colorsModel = this.f85702wkgbmnqykc;
            return iHashCode2 + (colorsModel != null ? colorsModel.hashCode() : 0);
        }

        public final ColorsModel iobyxmoadg() {
            return this.f85702wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f85703zoijcleaow;
        }

        public String toString() {
            return "OpenProductReviews(productArticle=" + this.f85700iobyxmoadg + ", productName=" + this.f85703zoijcleaow + ", productRating=" + this.f85701ppxfxbqfkf + ", colorsModel=" + this.f85702wkgbmnqykc + ")";
        }

        public final Double wkgbmnqykc() {
            return this.f85701ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f85700iobyxmoadg;
        }
    }

    public static final class ojitshcjhn implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f85704ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f85705iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f85706zoijcleaow;

        public ojitshcjhn(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f85705iobyxmoadg = hint;
            this.f85706zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ojitshcjhn)) {
                return false;
            }
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
            return zdlpuopuiu.eablkybsjg(this.f85705iobyxmoadg, ojitshcjhnVar.f85705iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85706zoijcleaow, ojitshcjhnVar.f85706zoijcleaow);
        }

        public int hashCode() {
            return (this.f85705iobyxmoadg.hashCode() * 31) + this.f85706zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f85706zoijcleaow;
        }

        public String toString() {
            return "ShowHint(hint=" + this.f85705iobyxmoadg + ", analyticsInfo=" + this.f85706zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f85705iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f85707iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1571658861;
        }

        public String toString() {
            return "OpenCart";
        }
    }

    public static final class wflxmlrfwp implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85708iobyxmoadg;

        public wflxmlrfwp(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f85708iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f85708iobyxmoadg, ((wflxmlrfwp) obj).f85708iobyxmoadg);
        }

        public int hashCode() {
            return this.f85708iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85708iobyxmoadg;
        }

        public String toString() {
            return "OpenVideoPhoto(url=" + this.f85708iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSet f85709iobyxmoadg;

        public wkgbmnqykc(ComboSet comboSet) {
            zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f85709iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f85709iobyxmoadg, ((wkgbmnqykc) obj).f85709iobyxmoadg);
        }

        public int hashCode() {
            return this.f85709iobyxmoadg.hashCode();
        }

        public final ComboSet iobyxmoadg() {
            return this.f85709iobyxmoadg;
        }

        public String toString() {
            return "OpenComboSet(comboSet=" + this.f85709iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f85710iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f85710iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f85710iobyxmoadg == ((zoijcleaow) obj).f85710iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f85710iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f85710iobyxmoadg;
        }

        public String toString() {
            return "NavigateToStartAddressFlowScreen(hasUserAnyAddress=" + this.f85710iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1952eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NonAuthorizedPayload.zoijcleaow f85695iobyxmoadg;

        public C1952eablkybsjg(NonAuthorizedPayload.zoijcleaow errorType) {
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            this.f85695iobyxmoadg = errorType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1952eablkybsjg) && this.f85695iobyxmoadg == ((C1952eablkybsjg) obj).f85695iobyxmoadg;
        }

        public int hashCode() {
            return this.f85695iobyxmoadg.hashCode();
        }

        public String toString() {
            return "OpenNonAuthorized(errorType=" + this.f85695iobyxmoadg + ")";
        }

        public /* synthetic */ C1952eablkybsjg(NonAuthorizedPayload.zoijcleaow zoijcleaowVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? NonAuthorizedPayload.zoijcleaow.DEFAULT : zoijcleaowVar);
        }
    }
}

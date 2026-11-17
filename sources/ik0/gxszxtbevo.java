package ik0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes3.dex */
public interface gxszxtbevo {

    public static final class agtfadlqog implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f44611iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 1843817840;
        }

        public String toString() {
            return "ShowWithLimitAddedProductToBasket";
        }
    }

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f44612ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f44613iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f44614zoijcleaow;

        public btonecajqb(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f44613iobyxmoadg = hint;
            this.f44614zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f44613iobyxmoadg, btonecajqbVar.f44613iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44614zoijcleaow, btonecajqbVar.f44614zoijcleaow);
        }

        public int hashCode() {
            return (this.f44613iobyxmoadg.hashCode() * 31) + this.f44614zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f44614zoijcleaow;
        }

        public String toString() {
            return "ShowHintDialog(hint=" + this.f44613iobyxmoadg + ", analyticsInfo=" + this.f44614zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f44613iobyxmoadg;
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f44615iobyxmoadg;

        public draadjrbmk(int i13) {
            this.f44615iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && this.f44615iobyxmoadg == ((draadjrbmk) obj).f44615iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f44615iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f44615iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbarMessage(res=" + this.f44615iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f44616iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1292263709;
        }

        public String toString() {
            return "ShowErrorAddedProductToBasket";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44617iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f44618ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f44619zoijcleaow;

        public eablkybsjg(String productId, String productsSetId, String productsSetName) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productsSetId, "productsSetId");
            zdlpuopuiu.btonecajqb(productsSetName, "productsSetName");
            this.f44617iobyxmoadg = productId;
            this.f44619zoijcleaow = productsSetId;
            this.f44618ppxfxbqfkf = productsSetName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f44617iobyxmoadg, eablkybsjgVar.f44617iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44619zoijcleaow, eablkybsjgVar.f44619zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f44618ppxfxbqfkf, eablkybsjgVar.f44618ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f44617iobyxmoadg.hashCode() * 31) + this.f44619zoijcleaow.hashCode()) * 31) + this.f44618ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f44617iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificProductScreen(productId=" + this.f44617iobyxmoadg + ", productsSetId=" + this.f44619zoijcleaow + ", productsSetName=" + this.f44618ppxfxbqfkf + ")";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f44620iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return 2060620275;
        }

        public String toString() {
            return "ShowMessageProductNotAvailable";
        }
    }

    /* JADX INFO: renamed from: ik0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1036gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1036gxszxtbevo f44621iobyxmoadg = new C1036gxszxtbevo();

        private C1036gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1036gxszxtbevo);
        }

        public int hashCode() {
            return -2024028691;
        }

        public String toString() {
            return "ShowDialogAvailableOnlyForPickup";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f44622iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1915970352;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44623iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f44624ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Integer f44625wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f44626zoijcleaow;

        public lqeggnwhkg(String productSetName, List products, List productData, Integer num) {
            zdlpuopuiu.btonecajqb(productSetName, "productSetName");
            zdlpuopuiu.btonecajqb(products, "products");
            zdlpuopuiu.btonecajqb(productData, "productData");
            this.f44623iobyxmoadg = productSetName;
            this.f44626zoijcleaow = products;
            this.f44624ppxfxbqfkf = productData;
            this.f44625wkgbmnqykc = num;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f44623iobyxmoadg, lqeggnwhkgVar.f44623iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44626zoijcleaow, lqeggnwhkgVar.f44626zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f44624ppxfxbqfkf, lqeggnwhkgVar.f44624ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f44625wkgbmnqykc, lqeggnwhkgVar.f44625wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f44623iobyxmoadg.hashCode() * 31) + this.f44626zoijcleaow.hashCode()) * 31) + this.f44624ppxfxbqfkf.hashCode()) * 31;
            Integer num = this.f44625wkgbmnqykc;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final List iobyxmoadg() {
            return this.f44624ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f44623iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogChangeProductSetCount(productSetName=" + this.f44623iobyxmoadg + ", products=" + this.f44626zoijcleaow + ", productData=" + this.f44624ppxfxbqfkf + ", productSetCount=" + this.f44625wkgbmnqykc + ")";
        }

        public final List wkgbmnqykc() {
            return this.f44626zoijcleaow;
        }

        public final Integer zoijcleaow() {
            return this.f44625wkgbmnqykc;
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f44627iobyxmoadg;

        public nufgyqmvbu(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f44627iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f44627iobyxmoadg, ((nufgyqmvbu) obj).f44627iobyxmoadg);
        }

        public int hashCode() {
            return this.f44627iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f44627iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f44627iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f44628iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 1076297186;
        }

        public String toString() {
            return "ShowWithWarningsAddedProductToBasket";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f44629iobyxmoadg;

        public ppxfxbqfkf(PurchaseListAddProductDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f44629iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f44629iobyxmoadg, ((ppxfxbqfkf) obj).f44629iobyxmoadg);
        }

        public int hashCode() {
            return this.f44629iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f44629iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSelectPurchaseListScreen(args=" + this.f44629iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f44630iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return 333120158;
        }

        public String toString() {
            return "ShowSuccessAddedProductToBasket";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f44631iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f44631iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f44631iobyxmoadg == ((wkgbmnqykc) obj).f44631iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44631iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f44631iobyxmoadg;
        }

        public String toString() {
            return "NavigateToShipmentMethodScreen(hasUserAnyAddress=" + this.f44631iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f44632iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1435635765;
        }

        public String toString() {
            return "NavigateNonAuthorizedScreen";
        }
    }
}

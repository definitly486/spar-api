package yh1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface gxszxtbevo {

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f125191iobyxmoadg;

        public btonecajqb(int i13) {
            this.f125191iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f125191iobyxmoadg == ((btonecajqb) obj).f125191iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f125191iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f125191iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbarMessage(res=" + this.f125191iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f125192iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return 1512302611;
        }

        public String toString() {
            return "ShowWithLimitAddedProductToBasket";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f125193iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 403231280;
        }

        public String toString() {
            return "ShowMessageProductNotAvailable";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125194iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f125195ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Integer f125196wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f125197zoijcleaow;

        public eablkybsjg(String productSetName, List products, List productData, Integer num) {
            zdlpuopuiu.btonecajqb(productSetName, "productSetName");
            zdlpuopuiu.btonecajqb(products, "products");
            zdlpuopuiu.btonecajqb(productData, "productData");
            this.f125194iobyxmoadg = productSetName;
            this.f125197zoijcleaow = products;
            this.f125195ppxfxbqfkf = productData;
            this.f125196wkgbmnqykc = num;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f125194iobyxmoadg, eablkybsjgVar.f125194iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125197zoijcleaow, eablkybsjgVar.f125197zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f125195ppxfxbqfkf, eablkybsjgVar.f125195ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f125196wkgbmnqykc, eablkybsjgVar.f125196wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f125194iobyxmoadg.hashCode() * 31) + this.f125197zoijcleaow.hashCode()) * 31) + this.f125195ppxfxbqfkf.hashCode()) * 31;
            Integer num = this.f125196wkgbmnqykc;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final List iobyxmoadg() {
            return this.f125195ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f125194iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogChangeProductSetCount(productSetName=" + this.f125194iobyxmoadg + ", products=" + this.f125197zoijcleaow + ", productData=" + this.f125195ppxfxbqfkf + ", productSetCount=" + this.f125196wkgbmnqykc + ")";
        }

        public final List wkgbmnqykc() {
            return this.f125197zoijcleaow;
        }

        public final Integer zoijcleaow() {
            return this.f125196wkgbmnqykc;
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f125198iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return 493668865;
        }

        public String toString() {
            return "ShowSuccessAddedProductToBasket";
        }
    }

    /* JADX INFO: renamed from: yh1.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C3192gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f125199iobyxmoadg;

        public C3192gxszxtbevo(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f125199iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3192gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f125199iobyxmoadg, ((C3192gxszxtbevo) obj).f125199iobyxmoadg);
        }

        public int hashCode() {
            return this.f125199iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f125199iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f125199iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f125200iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1906810291;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f125201iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1207180538;
        }

        public String toString() {
            return "ShowErrorAddedProductToBasket";
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f125202ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f125203iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f125204zoijcleaow;

        public nufgyqmvbu(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f125203iobyxmoadg = hint;
            this.f125204zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f125203iobyxmoadg, nufgyqmvbuVar.f125203iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125204zoijcleaow, nufgyqmvbuVar.f125204zoijcleaow);
        }

        public int hashCode() {
            return (this.f125203iobyxmoadg.hashCode() * 31) + this.f125204zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f125204zoijcleaow;
        }

        public String toString() {
            return "ShowHintDialog(hint=" + this.f125203iobyxmoadg + ", analyticsInfo=" + this.f125204zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f125203iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f125205iobyxmoadg;

        public ppxfxbqfkf(PurchaseListAddProductDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f125205iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f125205iobyxmoadg, ((ppxfxbqfkf) obj).f125205iobyxmoadg);
        }

        public int hashCode() {
            return this.f125205iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f125205iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSelectPurchaseListScreen(args=" + this.f125205iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f125206iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -964076449;
        }

        public String toString() {
            return "ShowWithWarningsAddedProductToBasket";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125207iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f125208ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f125209zoijcleaow;

        public wkgbmnqykc(String productId, String productsSetId, String productsSetName) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productsSetId, "productsSetId");
            zdlpuopuiu.btonecajqb(productsSetName, "productsSetName");
            this.f125207iobyxmoadg = productId;
            this.f125209zoijcleaow = productsSetId;
            this.f125208ppxfxbqfkf = productsSetName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f125207iobyxmoadg, wkgbmnqykcVar.f125207iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125209zoijcleaow, wkgbmnqykcVar.f125209zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f125208ppxfxbqfkf, wkgbmnqykcVar.f125208ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f125207iobyxmoadg.hashCode() * 31) + this.f125209zoijcleaow.hashCode()) * 31) + this.f125208ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125207iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificProductScreen(productId=" + this.f125207iobyxmoadg + ", productsSetId=" + this.f125209zoijcleaow + ", productsSetName=" + this.f125208ppxfxbqfkf + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f125210iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1311302436;
        }

        public String toString() {
            return "NavigateToAuthorizationScreen";
        }
    }
}

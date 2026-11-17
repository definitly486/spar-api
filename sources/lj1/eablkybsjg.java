package lj1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class btonecajqb extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f62700iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final gk1.iobyxmoadg f62701zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(String productId, gk1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(section, "section");
            this.f62700iobyxmoadg = productId;
            this.f62701zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f62700iobyxmoadg, btonecajqbVar.f62700iobyxmoadg) && this.f62701zoijcleaow == btonecajqbVar.f62701zoijcleaow;
        }

        public int hashCode() {
            return (this.f62700iobyxmoadg.hashCode() * 31) + this.f62701zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f62700iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogConfirmDeleteProductFromList(productId=" + this.f62700iobyxmoadg + ", section=" + this.f62701zoijcleaow + ")";
        }

        public final gk1.iobyxmoadg zoijcleaow() {
            return this.f62701zoijcleaow;
        }
    }

    public static final class draadjrbmk extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f62702iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return 1130593316;
        }

        public String toString() {
            return "ShowMessageProductNotAvailable";
        }
    }

    public static final class dxjokdxxww extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gk1.iobyxmoadg f62703iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(gk1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(section, "section");
            this.f62703iobyxmoadg = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && this.f62703iobyxmoadg == ((dxjokdxxww) obj).f62703iobyxmoadg;
        }

        public int hashCode() {
            return this.f62703iobyxmoadg.hashCode();
        }

        public final gk1.iobyxmoadg iobyxmoadg() {
            return this.f62703iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogActionsWithAllProducts(section=" + this.f62703iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: lj1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1272eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1272eablkybsjg f62704iobyxmoadg = new C1272eablkybsjg();

        private C1272eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1272eablkybsjg);
        }

        public int hashCode() {
            return 6154793;
        }

        public String toString() {
            return "NavigateToSearchScreen";
        }
    }

    public static final class gtknphoqwx extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f62705iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f62705iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f62705iobyxmoadg, ((gtknphoqwx) obj).f62705iobyxmoadg);
        }

        public int hashCode() {
            return this.f62705iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f62705iobyxmoadg;
        }

        public String toString() {
            return "ShowMessageLimitAddedProduct(message=" + this.f62705iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f62706ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f62707iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f62708zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f62707iobyxmoadg = hint;
            this.f62708zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f62707iobyxmoadg, gxszxtbevoVar.f62707iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f62708zoijcleaow, gxszxtbevoVar.f62708zoijcleaow);
        }

        public int hashCode() {
            return (this.f62707iobyxmoadg.hashCode() * 31) + this.f62708zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f62708zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f62707iobyxmoadg + ", analyticsInfo=" + this.f62708zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f62707iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f62709iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 37282096;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f62710iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f62710iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f62710iobyxmoadg, ((lqeggnwhkg) obj).f62710iobyxmoadg);
        }

        public int hashCode() {
            return this.f62710iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f62710iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f62710iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f62711iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String purchaseListDeepLink) {
            super(null);
            zdlpuopuiu.btonecajqb(purchaseListDeepLink, "purchaseListDeepLink");
            this.f62711iobyxmoadg = purchaseListDeepLink;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f62711iobyxmoadg, ((nufgyqmvbu) obj).f62711iobyxmoadg);
        }

        public int hashCode() {
            return this.f62711iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f62711iobyxmoadg;
        }

        public String toString() {
            return "SharePurchaseList(purchaseListDeepLink=" + this.f62711iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f62712iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f62713ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f62714zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String productArticle, String listId, String listName) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(listId, "listId");
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f62712iobyxmoadg = productArticle;
            this.f62714zoijcleaow = listId;
            this.f62713ppxfxbqfkf = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f62712iobyxmoadg, ppxfxbqfkfVar.f62712iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f62714zoijcleaow, ppxfxbqfkfVar.f62714zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f62713ppxfxbqfkf, ppxfxbqfkfVar.f62713ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f62712iobyxmoadg.hashCode() * 31) + this.f62714zoijcleaow.hashCode()) * 31) + this.f62713ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f62712iobyxmoadg;
        }

        public String toString() {
            return "NavigateToCardOfProductScreen(productArticle=" + this.f62712iobyxmoadg + ", listId=" + this.f62714zoijcleaow + ", listName=" + this.f62713ppxfxbqfkf + ")";
        }
    }

    public static final class wflxmlrfwp extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f62715iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -339028015;
        }

        public String toString() {
            return "ShowMessageSuccessAddedProduct";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f62716iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -336404848;
        }

        public String toString() {
            return "NavigateToCatalogScreen";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f62717iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1658867029;
        }

        public String toString() {
            return "NavigateAuthorizationScreen";
        }
    }

    public /* synthetic */ eablkybsjg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

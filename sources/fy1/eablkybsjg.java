package fy1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.legacy.presentation.model.AddProductParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class agtfadlqog extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f35338iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return -1643097945;
        }

        public String toString() {
            return "ShowMessageProductNotAvailable";
        }
    }

    public static final class btonecajqb extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f35339ppxfxbqfkf = AddProductParams.f88839lereixgezr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AddProductParams f35340iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f35341zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(AddProductParams params, String message) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f35340iobyxmoadg = params;
            this.f35341zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f35340iobyxmoadg, btonecajqbVar.f35340iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35341zoijcleaow, btonecajqbVar.f35341zoijcleaow);
        }

        public int hashCode() {
            return (this.f35340iobyxmoadg.hashCode() * 31) + this.f35341zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35341zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f35340iobyxmoadg + ", message=" + this.f35341zoijcleaow + ")";
        }

        public final AddProductParams zoijcleaow() {
            return this.f35340iobyxmoadg;
        }
    }

    public static final class draadjrbmk extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35342iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final az1.iobyxmoadg f35343zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(String productId, az1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(section, "section");
            this.f35342iobyxmoadg = productId;
            this.f35343zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return zdlpuopuiu.eablkybsjg(this.f35342iobyxmoadg, draadjrbmkVar.f35342iobyxmoadg) && this.f35343zoijcleaow == draadjrbmkVar.f35343zoijcleaow;
        }

        public int hashCode() {
            return (this.f35342iobyxmoadg.hashCode() * 31) + this.f35343zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35342iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogConfirmDeleteProductFromList(productId=" + this.f35342iobyxmoadg + ", section=" + this.f35343zoijcleaow + ")";
        }

        public final az1.iobyxmoadg zoijcleaow() {
            return this.f35343zoijcleaow;
        }
    }

    public static final class dxjokdxxww extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35344iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String purchaseListDeepLink) {
            super(null);
            zdlpuopuiu.btonecajqb(purchaseListDeepLink, "purchaseListDeepLink");
            this.f35344iobyxmoadg = purchaseListDeepLink;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f35344iobyxmoadg, ((dxjokdxxww) obj).f35344iobyxmoadg);
        }

        public int hashCode() {
            return this.f35344iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35344iobyxmoadg;
        }

        public String toString() {
            return "SharePurchaseList(purchaseListDeepLink=" + this.f35344iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: fy1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0794eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0794eablkybsjg f35345iobyxmoadg = new C0794eablkybsjg();

        private C0794eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0794eablkybsjg);
        }

        public int hashCode() {
            return -1409486420;
        }

        public String toString() {
            return "NavigateToSearchScreen";
        }
    }

    public static final class gtknphoqwx extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final az1.iobyxmoadg f35346iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(az1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(section, "section");
            this.f35346iobyxmoadg = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f35346iobyxmoadg == ((gtknphoqwx) obj).f35346iobyxmoadg;
        }

        public int hashCode() {
            return this.f35346iobyxmoadg.hashCode();
        }

        public final az1.iobyxmoadg iobyxmoadg() {
            return this.f35346iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogActionsWithAllProducts(section=" + this.f35346iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f35347ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f35348iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f35349zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f35348iobyxmoadg = hint;
            this.f35349zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f35348iobyxmoadg, gxszxtbevoVar.f35348iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35349zoijcleaow, gxszxtbevoVar.f35349zoijcleaow);
        }

        public int hashCode() {
            return (this.f35348iobyxmoadg.hashCode() * 31) + this.f35349zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f35349zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f35348iobyxmoadg + ", analyticsInfo=" + this.f35349zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f35348iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f35350iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1013394573;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f35351iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            super(null);
            this.f35351iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f35351iobyxmoadg == ((lqeggnwhkg) obj).f35351iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f35351iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f35351iobyxmoadg;
        }

        public String toString() {
            return "OpenDeliveryInfoScreen(hasUserAnyAddress=" + this.f35351iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f35352iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f35352iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f35352iobyxmoadg, ((nufgyqmvbu) obj).f35352iobyxmoadg);
        }

        public int hashCode() {
            return this.f35352iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f35352iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f35352iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f35353iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 1182248020;
        }

        public String toString() {
            return "ShowMessageSuccessAddedProduct";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f35354iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1271609491;
        }

        public String toString() {
            return "NavigateToCatalogScreen";
        }
    }

    public static final class wflxmlrfwp extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35355iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f35355iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f35355iobyxmoadg, ((wflxmlrfwp) obj).f35355iobyxmoadg);
        }

        public int hashCode() {
            return this.f35355iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35355iobyxmoadg;
        }

        public String toString() {
            return "ShowMessageLimitAddedProduct(message=" + this.f35355iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f35356iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -966435651;
        }

        public String toString() {
            return "NavigateToLoginScreen";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35357iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f35358ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f35359zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productArticle, String listId, String listName) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(listId, "listId");
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f35357iobyxmoadg = productArticle;
            this.f35359zoijcleaow = listId;
            this.f35358ppxfxbqfkf = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f35357iobyxmoadg, zoijcleaowVar.f35357iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35359zoijcleaow, zoijcleaowVar.f35359zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f35358ppxfxbqfkf, zoijcleaowVar.f35358ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f35357iobyxmoadg.hashCode() * 31) + this.f35359zoijcleaow.hashCode()) * 31) + this.f35358ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35357iobyxmoadg;
        }

        public String toString() {
            return "NavigateToCardOfProductScreen(productArticle=" + this.f35357iobyxmoadg + ", listId=" + this.f35359zoijcleaow + ", listName=" + this.f35358ppxfxbqfkf + ")";
        }
    }

    public /* synthetic */ eablkybsjg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

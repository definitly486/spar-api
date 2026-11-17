package aq0;

import java.util.List;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes5.dex */
public interface lqeggnwhkg {

    public static final class agtfadlqog implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14142iobyxmoadg;

        public agtfadlqog(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f14142iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f14142iobyxmoadg, ((agtfadlqog) obj).f14142iobyxmoadg);
        }

        public int hashCode() {
            return this.f14142iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f14142iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f14142iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements lqeggnwhkg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f14143ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f14144iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f14145zoijcleaow;

        public btonecajqb(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f14144iobyxmoadg = hint;
            this.f14145zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f14144iobyxmoadg, btonecajqbVar.f14144iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14145zoijcleaow, btonecajqbVar.f14145zoijcleaow);
        }

        public int hashCode() {
            return (this.f14144iobyxmoadg.hashCode() * 31) + this.f14145zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f14145zoijcleaow;
        }

        public String toString() {
            return "ShowProductHint(hint=" + this.f14144iobyxmoadg + ", analyticsInfo=" + this.f14145zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f14144iobyxmoadg;
        }
    }

    public static final class draadjrbmk implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f14146iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f14147zoijcleaow;

        public draadjrbmk(mz0.ppxfxbqfkf type, List supportedTypes) {
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
            this.f14146iobyxmoadg = type;
            this.f14147zoijcleaow = supportedTypes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return this.f14146iobyxmoadg == draadjrbmkVar.f14146iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f14147zoijcleaow, draadjrbmkVar.f14147zoijcleaow);
        }

        public int hashCode() {
            return (this.f14146iobyxmoadg.hashCode() * 31) + this.f14147zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f14147zoijcleaow;
        }

        public String toString() {
            return "ShowSortDialog(type=" + this.f14146iobyxmoadg + ", supportedTypes=" + this.f14147zoijcleaow + ")";
        }

        public final mz0.ppxfxbqfkf zoijcleaow() {
            return this.f14146iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f14148iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -234414861;
        }

        public String toString() {
            return "ShowOrderDeliveryPriceChangeMessage";
        }
    }

    public static final class eablkybsjg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14149iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f14150ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f14151zoijcleaow;

        public eablkybsjg(String str, String str2, List list) {
            this.f14149iobyxmoadg = str;
            this.f14151zoijcleaow = str2;
            this.f14150ppxfxbqfkf = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f14149iobyxmoadg, eablkybsjgVar.f14149iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14151zoijcleaow, eablkybsjgVar.f14151zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f14150ppxfxbqfkf, eablkybsjgVar.f14150ppxfxbqfkf);
        }

        public int hashCode() {
            String str = this.f14149iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f14151zoijcleaow;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.f14150ppxfxbqfkf;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final List iobyxmoadg() {
            return this.f14150ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f14151zoijcleaow;
        }

        public String toString() {
            return "NavigateToSelectFiltersScreen(query=" + this.f14149iobyxmoadg + ", sectionId=" + this.f14151zoijcleaow + ", filters=" + this.f14150ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f14149iobyxmoadg;
        }
    }

    public static final class gtknphoqwx implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f14152iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return -1807463905;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class gxszxtbevo implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14153iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f14154zoijcleaow;

        public gxszxtbevo(String productId, String str) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f14153iobyxmoadg = productId;
            this.f14154zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f14153iobyxmoadg, gxszxtbevoVar.f14153iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14154zoijcleaow, gxszxtbevoVar.f14154zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f14153iobyxmoadg.hashCode() * 31;
            String str = this.f14154zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f14154zoijcleaow;
        }

        public String toString() {
            return "NavigateToSpecificProductScreen(productId=" + this.f14153iobyxmoadg + ", orderEditId=" + this.f14154zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f14153iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f14155iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1741045064;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    /* JADX INFO: renamed from: aq0.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    public static final class C0218lqeggnwhkg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bq0.iobyxmoadg f14156iobyxmoadg;

        public C0218lqeggnwhkg(bq0.iobyxmoadg cachedParams) {
            zdlpuopuiu.btonecajqb(cachedParams, "cachedParams");
            this.f14156iobyxmoadg = cachedParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0218lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f14156iobyxmoadg, ((C0218lqeggnwhkg) obj).f14156iobyxmoadg);
        }

        public int hashCode() {
            return this.f14156iobyxmoadg.hashCode();
        }

        public final bq0.iobyxmoadg iobyxmoadg() {
            return this.f14156iobyxmoadg;
        }

        public String toString() {
            return "ShowAgeCheckedDialog(cachedParams=" + this.f14156iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f14157iobyxmoadg;

        public nufgyqmvbu(PurchaseListAddProductDialogArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f14157iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f14157iobyxmoadg, ((nufgyqmvbu) obj).f14157iobyxmoadg);
        }

        public int hashCode() {
            return this.f14157iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f14157iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f14157iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final int f14158wkgbmnqykc = AnalyticsPayload.f95299iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ojitshcjhn f14159iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsPayload f14160ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f14161zoijcleaow;

        public ppxfxbqfkf(ojitshcjhn navLink, String str, AnalyticsPayload analyticsPayload) {
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            zdlpuopuiu.btonecajqb(analyticsPayload, "analyticsPayload");
            this.f14159iobyxmoadg = navLink;
            this.f14161zoijcleaow = str;
            this.f14160ppxfxbqfkf = analyticsPayload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f14159iobyxmoadg == ppxfxbqfkfVar.f14159iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f14161zoijcleaow, ppxfxbqfkfVar.f14161zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f14160ppxfxbqfkf, ppxfxbqfkfVar.f14160ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f14159iobyxmoadg.hashCode() * 31;
            String str = this.f14161zoijcleaow;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f14160ppxfxbqfkf.hashCode();
        }

        public final AnalyticsPayload iobyxmoadg() {
            return this.f14160ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f14161zoijcleaow;
        }

        public String toString() {
            return "NavigateByNavLink(navLink=" + this.f14159iobyxmoadg + ", reference=" + this.f14161zoijcleaow + ", analyticsPayload=" + this.f14160ppxfxbqfkf + ")";
        }

        public final ojitshcjhn zoijcleaow() {
            return this.f14159iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f14162iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return 350186381;
        }

        public String toString() {
            return "ShowSuccessAddedMessage";
        }
    }

    public static final class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f14163iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 2950681;
        }

        public String toString() {
            return "NavigateToAuthorizationScreen";
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14164iobyxmoadg;

        public zoijcleaow(String orderEditId) {
            zdlpuopuiu.btonecajqb(orderEditId, "orderEditId");
            this.f14164iobyxmoadg = orderEditId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f14164iobyxmoadg, ((zoijcleaow) obj).f14164iobyxmoadg);
        }

        public int hashCode() {
            return this.f14164iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f14164iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackToEditOrderScreen(orderEditId=" + this.f14164iobyxmoadg + ")";
        }
    }
}

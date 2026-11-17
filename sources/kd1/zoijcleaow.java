package kd1;

import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.core.domain.models.payload.sbp.RedirectPaySuccessPayload;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.orders.api.model.SpecificOrderArgs;
import ru.myspar.proloyalty.products_from_banner.api.models.ProductsFromBannerScreenArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.proloyalty.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.proloyalty.subscription.api.model.SubscriptionDetailPayload;
import ru.myspar.proloyalty.tipsorder.api.model.TipsOrderArgs;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class agtfadlqog implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f55280iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f55281zoijcleaow;

        public agtfadlqog(String url, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f55280iobyxmoadg = url;
            this.f55281zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55280iobyxmoadg, agtfadlqogVar.f55280iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55281zoijcleaow, agtfadlqogVar.f55281zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f55280iobyxmoadg.hashCode() * 31;
            String str = this.f55281zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String ppxfxbqfkf() {
            return this.f55280iobyxmoadg;
        }

        public String toString() {
            return "Game(url=" + this.f55280iobyxmoadg + ", token=" + this.f55281zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f55281zoijcleaow;
        }
    }

    public static final class btonecajqb implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f55282iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return -1831385344;
        }

        public String toString() {
            return "ElectronicCheck";
        }
    }

    public static final class cdpycssgdh implements zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f55283zoijcleaow = x81.wflxmlrfwp.f121527wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final x81.wflxmlrfwp f55284iobyxmoadg;

        public cdpycssgdh(x81.wflxmlrfwp args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55284iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cdpycssgdh) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55284iobyxmoadg, ((cdpycssgdh) obj).f55284iobyxmoadg);
        }

        public int hashCode() {
            return this.f55284iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Quiz(args=" + this.f55284iobyxmoadg + ")";
        }

        public final x81.wflxmlrfwp zoijcleaow() {
            return this.f55284iobyxmoadg;
        }
    }

    public static final class cllcsxoeiz implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubscriptionDetailPayload f55285iobyxmoadg;

        public cllcsxoeiz(SubscriptionDetailPayload args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55285iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cllcsxoeiz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55285iobyxmoadg, ((cllcsxoeiz) obj).f55285iobyxmoadg);
        }

        public int hashCode() {
            return this.f55285iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SubscriptionDetail(args=" + this.f55285iobyxmoadg + ")";
        }

        public final SubscriptionDetailPayload zoijcleaow() {
            return this.f55285iobyxmoadg;
        }
    }

    public static final class cqumvgiudr implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductsFromBannerScreenArgs f55286iobyxmoadg;

        public cqumvgiudr(ProductsFromBannerScreenArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55286iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55286iobyxmoadg, ((cqumvgiudr) obj).f55286iobyxmoadg);
        }

        public int hashCode() {
            return this.f55286iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ProductsFromBanner(args=" + this.f55286iobyxmoadg + ")";
        }

        public final ProductsFromBannerScreenArgs zoijcleaow() {
            return this.f55286iobyxmoadg;
        }
    }

    public static final class draadjrbmk implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f55287iobyxmoadg;

        public draadjrbmk(String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f55287iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55287iobyxmoadg, ((draadjrbmk) obj).f55287iobyxmoadg);
        }

        public int hashCode() {
            return this.f55287iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ExternalWeb(url=" + this.f55287iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f55287iobyxmoadg;
        }
    }

    public static final class dsvhmnatus implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TipsOrderArgs f55288iobyxmoadg;

        public dsvhmnatus(TipsOrderArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55288iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dsvhmnatus) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55288iobyxmoadg, ((dsvhmnatus) obj).f55288iobyxmoadg);
        }

        public int hashCode() {
            return this.f55288iobyxmoadg.hashCode();
        }

        public String toString() {
            return "TipsOrder(args=" + this.f55288iobyxmoadg + ")";
        }

        public final TipsOrderArgs zoijcleaow() {
            return this.f55288iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f55289iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final cl0.zoijcleaow f55290zoijcleaow;

        public dxjokdxxww(boolean z13, cl0.zoijcleaow addressType) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f55289iobyxmoadg = z13;
            this.f55290zoijcleaow = addressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return this.f55289iobyxmoadg == dxjokdxxwwVar.f55289iobyxmoadg && this.f55290zoijcleaow == dxjokdxxwwVar.f55290zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f55289iobyxmoadg) * 31) + this.f55290zoijcleaow.hashCode();
        }

        public final boolean ppxfxbqfkf() {
            return this.f55289iobyxmoadg;
        }

        public String toString() {
            return "Delivery(hasUserAnyAddress=" + this.f55289iobyxmoadg + ", addressType=" + this.f55290zoijcleaow + ")";
        }

        public final cl0.zoijcleaow zoijcleaow() {
            return this.f55290zoijcleaow;
        }
    }

    public static final class eablkybsjg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f55291iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f55291iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f55291iobyxmoadg == ((eablkybsjg) obj).f55291iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f55291iobyxmoadg);
        }

        public String toString() {
            return "CatalogTab(withPartners=" + this.f55291iobyxmoadg + ")";
        }

        public final boolean zoijcleaow() {
            return this.f55291iobyxmoadg;
        }

        public /* synthetic */ eablkybsjg(boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? false : z13);
        }
    }

    public static final class esjtqupxsv implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final esjtqupxsv f55292iobyxmoadg = new esjtqupxsv();

        private esjtqupxsv() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof esjtqupxsv);
        }

        public int hashCode() {
            return -827862345;
        }

        public String toString() {
            return "Promotion";
        }
    }

    public static final class gtknphoqwx implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EvropolisGift f55293iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f55294zoijcleaow;

        public gtknphoqwx(EvropolisGift gift, DeliveryCode deliveryCode) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gift, "gift");
            this.f55293iobyxmoadg = gift;
            this.f55294zoijcleaow = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55293iobyxmoadg, gtknphoqwxVar.f55293iobyxmoadg) && this.f55294zoijcleaow == gtknphoqwxVar.f55294zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f55293iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f55294zoijcleaow;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final EvropolisGift ppxfxbqfkf() {
            return this.f55293iobyxmoadg;
        }

        public String toString() {
            return "Evropolis(gift=" + this.f55293iobyxmoadg + ", deliveryCode=" + this.f55294zoijcleaow + ")";
        }

        public final DeliveryCode zoijcleaow() {
            return this.f55294zoijcleaow;
        }
    }

    public static final class gxszxtbevo implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f55295iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -959958791;
        }

        public String toString() {
            return "CategoriesDetail";
        }
    }

    public static final class hcddaimhww implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SpecificOrderArgs f55296iobyxmoadg;

        public hcddaimhww(SpecificOrderArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55296iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof hcddaimhww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55296iobyxmoadg, ((hcddaimhww) obj).f55296iobyxmoadg);
        }

        public int hashCode() {
            return this.f55296iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SpecificOrder(args=" + this.f55296iobyxmoadg + ")";
        }

        public final SpecificOrderArgs zoijcleaow() {
            return this.f55296iobyxmoadg;
        }
    }

    public static final class hkdspvbjdz implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubCatalogArgs f55297iobyxmoadg;

        public hkdspvbjdz(SubCatalogArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55297iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof hkdspvbjdz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55297iobyxmoadg, ((hkdspvbjdz) obj).f55297iobyxmoadg);
        }

        public int hashCode() {
            return this.f55297iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SubCatalog(args=" + this.f55297iobyxmoadg + ")";
        }

        public final SubCatalogArgs zoijcleaow() {
            return this.f55297iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f55298iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1594084274;
        }

        public String toString() {
            return "ActivationCard";
        }
    }

    public static final class iozdgvuglv implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iozdgvuglv f55299iobyxmoadg = new iozdgvuglv();

        private iozdgvuglv() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iozdgvuglv);
        }

        public int hashCode() {
            return 1351493169;
        }

        public String toString() {
            return "ReturnFromPaySystem";
        }
    }

    public static final class istkbnxepw implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f55300iobyxmoadg;

        public istkbnxepw(String reference) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
            this.f55300iobyxmoadg = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof istkbnxepw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55300iobyxmoadg, ((istkbnxepw) obj).f55300iobyxmoadg);
        }

        public int hashCode() {
            return this.f55300iobyxmoadg.hashCode();
        }

        public String toString() {
            return "PushDescription(reference=" + this.f55300iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f55300iobyxmoadg;
        }
    }

    public static final class iwizpuwonk implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListPayload f55301iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final MainTab f55302zoijcleaow;

        public iwizpuwonk(ProductListPayload args, MainTab mainTab) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55301iobyxmoadg = args;
            this.f55302zoijcleaow = mainTab;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iwizpuwonk)) {
                return false;
            }
            iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55301iobyxmoadg, iwizpuwonkVar.f55301iobyxmoadg) && this.f55302zoijcleaow == iwizpuwonkVar.f55302zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f55301iobyxmoadg.hashCode() * 31;
            MainTab mainTab = this.f55302zoijcleaow;
            return iHashCode + (mainTab == null ? 0 : mainTab.hashCode());
        }

        public final MainTab ppxfxbqfkf() {
            return this.f55302zoijcleaow;
        }

        public String toString() {
            return "ProductList(args=" + this.f55301iobyxmoadg + ", tab=" + this.f55302zoijcleaow + ")";
        }

        public final ProductListPayload zoijcleaow() {
            return this.f55301iobyxmoadg;
        }
    }

    public static final class jpowsppfya implements zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f55303zoijcleaow = SpecificRestaurantArgs.f95864yggfygwlhe;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SpecificRestaurantArgs f55304iobyxmoadg;

        public jpowsppfya(SpecificRestaurantArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55304iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jpowsppfya) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55304iobyxmoadg, ((jpowsppfya) obj).f55304iobyxmoadg);
        }

        public int hashCode() {
            return this.f55304iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SpecificRestaurant(args=" + this.f55304iobyxmoadg + ")";
        }

        public final SpecificRestaurantArgs zoijcleaow() {
            return this.f55304iobyxmoadg;
        }
    }

    public static final class jyumaefscl implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductPayload f55305iobyxmoadg;

        public jyumaefscl(ProductPayload args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55305iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55305iobyxmoadg, ((jyumaefscl) obj).f55305iobyxmoadg);
        }

        public int hashCode() {
            return this.f55305iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Product(args=" + this.f55305iobyxmoadg + ")";
        }

        public final ProductPayload zoijcleaow() {
            return this.f55305iobyxmoadg;
        }
    }

    public static final class kcexrzcfyt implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f55306iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return 606882863;
        }

        public String toString() {
            return "MySparTab";
        }
    }

    public static final class lereixgezr implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lereixgezr f55307iobyxmoadg = new lereixgezr();

        private lereixgezr() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lereixgezr);
        }

        public int hashCode() {
            return 1813589042;
        }

        public String toString() {
            return "PromotionOnboarding";
        }
    }

    public static final class lmojexxdyd implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lmojexxdyd f55308iobyxmoadg = new lmojexxdyd();

        private lmojexxdyd() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lmojexxdyd);
        }

        public int hashCode() {
            return 327575750;
        }

        public String toString() {
            return "ScanProduct";
        }
    }

    public static final class lqeggnwhkg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f55309iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1626128188;
        }

        public String toString() {
            return "Chat";
        }
    }

    public static final class nufgyqmvbu implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f55310iobyxmoadg;

        public nufgyqmvbu(String comboId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboId, "comboId");
            this.f55310iobyxmoadg = comboId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55310iobyxmoadg, ((nufgyqmvbu) obj).f55310iobyxmoadg);
        }

        public int hashCode() {
            return this.f55310iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Combo(comboId=" + this.f55310iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f55310iobyxmoadg;
        }
    }

    public static final class ojitshcjhn implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f55311iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 474450530;
        }

        public String toString() {
            return "Intervals";
        }
    }

    public static final class oxmwwwfdhm implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final oxmwwwfdhm f55312iobyxmoadg = new oxmwwwfdhm();

        private oxmwwwfdhm() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof oxmwwwfdhm);
        }

        public int hashCode() {
            return 2142105690;
        }

        public String toString() {
            return "MyPurchases";
        }
    }

    public static final class pkzmftpjix implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SpecialBannerPayload f55313iobyxmoadg;

        public pkzmftpjix(SpecialBannerPayload args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55313iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pkzmftpjix) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55313iobyxmoadg, ((pkzmftpjix) obj).f55313iobyxmoadg);
        }

        public int hashCode() {
            return this.f55313iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SpecialBanner(args=" + this.f55313iobyxmoadg + ")";
        }

        public final SpecialBannerPayload zoijcleaow() {
            return this.f55313iobyxmoadg;
        }
    }

    public static final class pmvmpeiblj implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final pmvmpeiblj f55314iobyxmoadg = new pmvmpeiblj();

        private pmvmpeiblj() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof pmvmpeiblj);
        }

        public int hashCode() {
            return 830997518;
        }

        public String toString() {
            return "PurchasesHistory";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f55315iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -405828938;
        }

        public String toString() {
            return "CardMySpar";
        }
    }

    public static final class rgvfuqvkyq implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f55316iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 1470923452;
        }

        public String toString() {
            return "MyAddress";
        }
    }

    public static final class vdvldrhtss implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f55317iobyxmoadg;

        public vdvldrhtss(boolean z13) {
            this.f55317iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && this.f55317iobyxmoadg == ((vdvldrhtss) obj).f55317iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f55317iobyxmoadg);
        }

        public String toString() {
            return "MyCoupons(withAnimation=" + this.f55317iobyxmoadg + ")";
        }

        public final boolean zoijcleaow() {
            return this.f55317iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f55318iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return 223216369;
        }

        public String toString() {
            return "Feedback";
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f55319iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1233337495;
        }

        public String toString() {
            return "CartTab";
        }
    }

    public static final class wwaezpbzkn implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListSharedWithYouDialogArgs f55320iobyxmoadg;

        public wwaezpbzkn(PurchaseListSharedWithYouDialogArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55320iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wwaezpbzkn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55320iobyxmoadg, ((wwaezpbzkn) obj).f55320iobyxmoadg);
        }

        public int hashCode() {
            return this.f55320iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SharedPurchaseList(args=" + this.f55320iobyxmoadg + ")";
        }

        public final PurchaseListSharedWithYouDialogArgs zoijcleaow() {
            return this.f55320iobyxmoadg;
        }
    }

    public static final class yadqdtsiqt implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RedirectPaySuccessPayload f55321iobyxmoadg;

        public yadqdtsiqt(RedirectPaySuccessPayload args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f55321iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yadqdtsiqt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55321iobyxmoadg, ((yadqdtsiqt) obj).f55321iobyxmoadg);
        }

        public int hashCode() {
            return this.f55321iobyxmoadg.hashCode();
        }

        public String toString() {
            return "RedirectPayment(args=" + this.f55321iobyxmoadg + ")";
        }

        public final RedirectPaySuccessPayload zoijcleaow() {
            return this.f55321iobyxmoadg;
        }
    }

    public static final class yggfygwlhe implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f55322iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return 1782647383;
        }

        public String toString() {
            return "Notification";
        }
    }

    public static final class ylkuphrtab implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ylkuphrtab f55323iobyxmoadg = new ylkuphrtab();

        private ylkuphrtab() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ylkuphrtab);
        }

        public int hashCode() {
            return -1625651102;
        }

        public String toString() {
            return "Shop";
        }
    }

    public static final class zdlpuopuiu implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f55324iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 334895401;
        }

        public String toString() {
            return "NonAuth";
        }
    }

    /* JADX INFO: renamed from: kd1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1177zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f55325iobyxmoadg;

        public C1177zoijcleaow(String number) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(number, "number");
            this.f55325iobyxmoadg = number;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1177zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55325iobyxmoadg, ((C1177zoijcleaow) obj).f55325iobyxmoadg);
        }

        public int hashCode() {
            return this.f55325iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Call(number=" + this.f55325iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f55325iobyxmoadg;
        }
    }

    public static final class zynmafqrjb implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zynmafqrjb f55326iobyxmoadg = new zynmafqrjb();

        private zynmafqrjb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zynmafqrjb);
        }

        public int hashCode() {
            return 1143559012;
        }

        public String toString() {
            return "PurchasesList";
        }
    }

    default AnalyticsPage iobyxmoadg() {
        AnalyticsPage subscription;
        if ((this instanceof C1177zoijcleaow) || (this instanceof agtfadlqog) || (this instanceof gtknphoqwx) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, esjtqupxsv.f55292iobyxmoadg) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, lereixgezr.f55307iobyxmoadg) || (this instanceof jpowsppfya) || (this instanceof draadjrbmk) || (this instanceof istkbnxepw) || (this instanceof wwaezpbzkn) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, pmvmpeiblj.f55314iobyxmoadg) || (this instanceof yadqdtsiqt) || (this instanceof cdpycssgdh) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, iozdgvuglv.f55299iobyxmoadg) || (this instanceof dxjokdxxww) || (this instanceof ojitshcjhn) || (this instanceof zdlpuopuiu) || (this instanceof iobyxmoadg) || (this instanceof nufgyqmvbu)) {
            return null;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, ppxfxbqfkf.f55315iobyxmoadg)) {
            return AnalyticsPage.QrCode.f92367iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, wkgbmnqykc.f55319iobyxmoadg)) {
            return AnalyticsPage.Basket.f92301iwizpuwonk;
        }
        if (this instanceof eablkybsjg) {
            return AnalyticsPage.CatalogTab.f92305iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, gxszxtbevo.f55295iobyxmoadg)) {
            return AnalyticsPage.ChoosingCategories.f92306iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, lqeggnwhkg.f55309iobyxmoadg)) {
            return AnalyticsPage.SupportChat.f92389iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, btonecajqb.f55282iobyxmoadg)) {
            return AnalyticsPage.Echecks.f92321iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, wflxmlrfwp.f55318iobyxmoadg)) {
            return AnalyticsPage.Feedback.f92325iwizpuwonk;
        }
        if (this instanceof rgvfuqvkyq) {
            return AnalyticsPage.Addresses.f92300iwizpuwonk;
        }
        if (this instanceof vdvldrhtss) {
            return AnalyticsPage.MyCoupons.f92336iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, oxmwwwfdhm.f55312iobyxmoadg)) {
            return AnalyticsPage.PurchasesHistory.f92365iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, kcexrzcfyt.f55306iobyxmoadg)) {
            return AnalyticsPage.MainScreen.f92334iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, yggfygwlhe.f55322iobyxmoadg)) {
            return AnalyticsPage.NotificationsAdv.f92342iwizpuwonk;
        }
        if (this instanceof jyumaefscl) {
            ProductPayload.Type type = ((jyumaefscl) this).zoijcleaow().getType();
            ProductPayload.Type.Article article = type instanceof ProductPayload.Type.Article ? (ProductPayload.Type.Article) type : null;
            subscription = new AnalyticsPage.ItemDetail(article != null ? article.getValue() : null, null);
        } else {
            if (this instanceof iwizpuwonk) {
                iwizpuwonk iwizpuwonkVar = (iwizpuwonk) this;
                String sectionId = iwizpuwonkVar.zoijcleaow().getSectionId();
                if (sectionId == null && (sectionId = iwizpuwonkVar.zoijcleaow().getBrandId()) == null) {
                    sectionId = "";
                }
                String productsTitle = iwizpuwonkVar.zoijcleaow().getProductsTitle();
                subscription = new AnalyticsPage.ProductList(productsTitle != null ? productsTitle : "", sectionId);
            } else if (this instanceof cqumvgiudr) {
                subscription = new AnalyticsPage.ProductsFromBanner(((cqumvgiudr) this).zoijcleaow().getBlockId(), null);
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, zynmafqrjb.f55326iobyxmoadg)) {
                    return AnalyticsPage.ShoppingLists.f92378iwizpuwonk;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, lmojexxdyd.f55308iobyxmoadg)) {
                    return AnalyticsPage.Scan.f92372iwizpuwonk;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, ylkuphrtab.f55323iobyxmoadg)) {
                    return AnalyticsPage.Shops.f92379iwizpuwonk;
                }
                if (this instanceof pkzmftpjix) {
                    pkzmftpjix pkzmftpjixVar = (pkzmftpjix) this;
                    String bannerId = pkzmftpjixVar.zoijcleaow().getBannerId();
                    String bannerTitle = pkzmftpjixVar.zoijcleaow().getBannerTitle();
                    subscription = new AnalyticsPage.LandingPage(bannerTitle != null ? bannerTitle : "", bannerId);
                } else {
                    if (this instanceof hcddaimhww) {
                        return new AnalyticsPage.Order(((hcddaimhww) this).zoijcleaow().getOrderId());
                    }
                    if (this instanceof hkdspvbjdz) {
                        hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) this;
                        String parentId = hkdspvbjdzVar.zoijcleaow().getParentId();
                        String title = hkdspvbjdzVar.zoijcleaow().getTitle();
                        subscription = new AnalyticsPage.SubCatalog(title != null ? title : "", parentId);
                    } else {
                        if (!(this instanceof cllcsxoeiz)) {
                            if (this instanceof dsvhmnatus) {
                                return AnalyticsPage.Tips.f92391iwizpuwonk;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        subscription = new AnalyticsPage.Subscription(((cllcsxoeiz) this).zoijcleaow().getSubscriptionDetailId(), null);
                    }
                }
            }
        }
        return subscription;
    }
}

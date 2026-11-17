package fg0;

import kotlin.NoWhenBranchMatchedException;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.core.domain.models.payload.sbp.RedirectPaySuccessPayload;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.orders.api.model.SpecificOrderArgs;
import ru.myspar.products_from_banner.api.models.ProductsFromBannerScreenArgs;
import ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.subscription.api.model.SubscriptionDetailPayload;
import ru.myspar.tipsorder.api.model.TipsOrderArgs;

/* JADX INFO: loaded from: classes4.dex */
public interface zoijcleaow {

    public static final class agtfadlqog implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f33702iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 765009881;
        }

        public String toString() {
            return "MyAddress";
        }
    }

    public static final class btonecajqb implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EvropolisGift f33703iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f33704zoijcleaow;

        public btonecajqb(EvropolisGift gift, DeliveryCode deliveryCode) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gift, "gift");
            this.f33703iobyxmoadg = gift;
            this.f33704zoijcleaow = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33703iobyxmoadg, btonecajqbVar.f33703iobyxmoadg) && this.f33704zoijcleaow == btonecajqbVar.f33704zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f33703iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f33704zoijcleaow;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final EvropolisGift ppxfxbqfkf() {
            return this.f33703iobyxmoadg;
        }

        public String toString() {
            return "Evropolis(gift=" + this.f33703iobyxmoadg + ", deliveryCode=" + this.f33704zoijcleaow + ")";
        }

        public final DeliveryCode zoijcleaow() {
            return this.f33704zoijcleaow;
        }
    }

    public static final class cdpycssgdh implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final cdpycssgdh f33705iobyxmoadg = new cdpycssgdh();

        private cdpycssgdh() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof cdpycssgdh);
        }

        public int hashCode() {
            return -821902578;
        }

        public String toString() {
            return "ReturnFromPaySystem";
        }
    }

    public static final class cqumvgiudr implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final cqumvgiudr f33706iobyxmoadg = new cqumvgiudr();

        private cqumvgiudr() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof cqumvgiudr);
        }

        public int hashCode() {
            return -359806705;
        }

        public String toString() {
            return "PromotionOnboarding";
        }
    }

    public static final class draadjrbmk implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f33707iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return 754634292;
        }

        public String toString() {
            return "Feedback";
        }
    }

    public static final class dxjokdxxww implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f33708iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 2016336477;
        }

        public String toString() {
            return "ElectronicCheck";
        }
    }

    public static final class eablkybsjg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f33709iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1939666628;
        }

        public String toString() {
            return "CategoriesDetail";
        }
    }

    public static final class esjtqupxsv implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final esjtqupxsv f33710iobyxmoadg = new esjtqupxsv();

        private esjtqupxsv() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof esjtqupxsv);
        }

        public int hashCode() {
            return -148710319;
        }

        public String toString() {
            return "PurchasesHistory";
        }
    }

    public static final class gtknphoqwx implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f33711iobyxmoadg;

        public gtknphoqwx(String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f33711iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33711iobyxmoadg, ((gtknphoqwx) obj).f33711iobyxmoadg);
        }

        public int hashCode() {
            return this.f33711iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ExternalWeb(url=" + this.f33711iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f33711iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f33712iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 2014717319;
        }

        public String toString() {
            return "Chat";
        }
    }

    public static final class hcddaimhww implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubCatalogArgs f33713iobyxmoadg;

        public hcddaimhww(SubCatalogArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33713iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof hcddaimhww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33713iobyxmoadg, ((hcddaimhww) obj).f33713iobyxmoadg);
        }

        public int hashCode() {
            return this.f33713iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SubCatalog(args=" + this.f33713iobyxmoadg + ")";
        }

        public final SubCatalogArgs zoijcleaow() {
            return this.f33713iobyxmoadg;
        }
    }

    public static final class hkdspvbjdz implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TipsOrderArgs f33714iobyxmoadg;

        public hkdspvbjdz(TipsOrderArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33714iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof hkdspvbjdz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33714iobyxmoadg, ((hkdspvbjdz) obj).f33714iobyxmoadg);
        }

        public int hashCode() {
            return this.f33714iobyxmoadg.hashCode();
        }

        public String toString() {
            return "TipsOrder(args=" + this.f33714iobyxmoadg + ")";
        }

        public final TipsOrderArgs zoijcleaow() {
            return this.f33714iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f33715iobyxmoadg;

        public iobyxmoadg(String number) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(number, "number");
            this.f33715iobyxmoadg = number;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33715iobyxmoadg, ((iobyxmoadg) obj).f33715iobyxmoadg);
        }

        public int hashCode() {
            return this.f33715iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Call(number=" + this.f33715iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f33715iobyxmoadg;
        }
    }

    public static final class iozdgvuglv implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListSharedWithYouDialogArgs f33716iobyxmoadg;

        public iozdgvuglv(PurchaseListSharedWithYouDialogArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33716iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iozdgvuglv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33716iobyxmoadg, ((iozdgvuglv) obj).f33716iobyxmoadg);
        }

        public int hashCode() {
            return this.f33716iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SharedPurchaseList(args=" + this.f33716iobyxmoadg + ")";
        }

        public final PurchaseListSharedWithYouDialogArgs zoijcleaow() {
            return this.f33716iobyxmoadg;
        }
    }

    public static final class istkbnxepw implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RedirectPaySuccessPayload f33717iobyxmoadg;

        public istkbnxepw(RedirectPaySuccessPayload args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33717iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof istkbnxepw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33717iobyxmoadg, ((istkbnxepw) obj).f33717iobyxmoadg);
        }

        public int hashCode() {
            return this.f33717iobyxmoadg.hashCode();
        }

        public String toString() {
            return "RedirectPayment(args=" + this.f33717iobyxmoadg + ")";
        }

        public final RedirectPaySuccessPayload zoijcleaow() {
            return this.f33717iobyxmoadg;
        }
    }

    public static final class iwizpuwonk implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f33718iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return -1533775916;
        }

        public String toString() {
            return "Promotion";
        }
    }

    public static final class jpowsppfya implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubscriptionDetailPayload f33719iobyxmoadg;

        public jpowsppfya(SubscriptionDetailPayload args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33719iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jpowsppfya) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33719iobyxmoadg, ((jpowsppfya) obj).f33719iobyxmoadg);
        }

        public int hashCode() {
            return this.f33719iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SubscriptionDetail(args=" + this.f33719iobyxmoadg + ")";
        }

        public final SubscriptionDetailPayload zoijcleaow() {
            return this.f33719iobyxmoadg;
        }
    }

    public static final class jyumaefscl implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductsFromBannerScreenArgs f33720iobyxmoadg;

        public jyumaefscl(ProductsFromBannerScreenArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33720iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33720iobyxmoadg, ((jyumaefscl) obj).f33720iobyxmoadg);
        }

        public int hashCode() {
            return this.f33720iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ProductsFromBanner(args=" + this.f33720iobyxmoadg + ")";
        }

        public final ProductsFromBannerScreenArgs zoijcleaow() {
            return this.f33720iobyxmoadg;
        }
    }

    public static final class kcexrzcfyt implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f33721iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return 71334938;
        }

        public String toString() {
            return "Notification";
        }
    }

    public static final class lereixgezr implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lereixgezr f33722iobyxmoadg = new lereixgezr();

        private lereixgezr() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lereixgezr);
        }

        public int hashCode() {
            return -367519231;
        }

        public String toString() {
            return "PurchasesList";
        }
    }

    public static final class lmojexxdyd implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lmojexxdyd f33723iobyxmoadg = new lmojexxdyd();

        private lmojexxdyd() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lmojexxdyd);
        }

        public int hashCode() {
            return 2015194405;
        }

        public String toString() {
            return "Shop";
        }
    }

    public static final class lqeggnwhkg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f33724iobyxmoadg;

        public lqeggnwhkg(String comboId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboId, "comboId");
            this.f33724iobyxmoadg = comboId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33724iobyxmoadg, ((lqeggnwhkg) obj).f33724iobyxmoadg);
        }

        public int hashCode() {
            return this.f33724iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Combo(comboId=" + this.f33724iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f33724iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f33725iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final rm.zoijcleaow f33726zoijcleaow;

        public nufgyqmvbu(boolean z13, rm.zoijcleaow addressType) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f33725iobyxmoadg = z13;
            this.f33726zoijcleaow = addressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return this.f33725iobyxmoadg == nufgyqmvbuVar.f33725iobyxmoadg && this.f33726zoijcleaow == nufgyqmvbuVar.f33726zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f33725iobyxmoadg) * 31) + this.f33726zoijcleaow.hashCode();
        }

        public final boolean ppxfxbqfkf() {
            return this.f33725iobyxmoadg;
        }

        public String toString() {
            return "Delivery(hasUserAnyAddress=" + this.f33725iobyxmoadg + ", addressType=" + this.f33726zoijcleaow + ")";
        }

        public final rm.zoijcleaow zoijcleaow() {
            return this.f33726zoijcleaow;
        }
    }

    public static final class ojitshcjhn implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f33727iobyxmoadg;

        public ojitshcjhn(boolean z13) {
            this.f33727iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && this.f33727iobyxmoadg == ((ojitshcjhn) obj).f33727iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f33727iobyxmoadg);
        }

        public String toString() {
            return "MyCoupons(withAnimation=" + this.f33727iobyxmoadg + ")";
        }

        public final boolean zoijcleaow() {
            return this.f33727iobyxmoadg;
        }
    }

    public static final class oxmwwwfdhm implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NonAuthorizedPayload f33728iobyxmoadg;

        public oxmwwwfdhm(NonAuthorizedPayload args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33728iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33728iobyxmoadg, ((oxmwwwfdhm) obj).f33728iobyxmoadg);
        }

        public int hashCode() {
            return this.f33728iobyxmoadg.hashCode();
        }

        public String toString() {
            return "NonAuth(args=" + this.f33728iobyxmoadg + ")";
        }

        public /* synthetic */ oxmwwwfdhm(NonAuthorizedPayload nonAuthorizedPayload, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? new NonAuthorizedPayload(null, null, 3, null) : nonAuthorizedPayload);
        }
    }

    public static final class pkzmftpjix implements zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f33729zoijcleaow = SpecificRestaurantArgs.f88087yggfygwlhe;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SpecificRestaurantArgs f33730iobyxmoadg;

        public pkzmftpjix(SpecificRestaurantArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33730iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pkzmftpjix) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33730iobyxmoadg, ((pkzmftpjix) obj).f33730iobyxmoadg);
        }

        public int hashCode() {
            return this.f33730iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SpecificRestaurant(args=" + this.f33730iobyxmoadg + ")";
        }

        public final SpecificRestaurantArgs zoijcleaow() {
            return this.f33730iobyxmoadg;
        }
    }

    public static final class pmvmpeiblj implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f33731iobyxmoadg;

        public pmvmpeiblj(String reference) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
            this.f33731iobyxmoadg = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pmvmpeiblj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33731iobyxmoadg, ((pmvmpeiblj) obj).f33731iobyxmoadg);
        }

        public int hashCode() {
            return this.f33731iobyxmoadg.hashCode();
        }

        public String toString() {
            return "PushDescription(reference=" + this.f33731iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f33731iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f33732iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1908931642;
        }

        public String toString() {
            return "CartTab";
        }
    }

    public static final class rgvfuqvkyq implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f33733iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return -1930970569;
        }

        public String toString() {
            return "MyPurchases";
        }
    }

    public static final class vdvldrhtss implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final vdvldrhtss f33734iobyxmoadg = new vdvldrhtss();

        private vdvldrhtss() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof vdvldrhtss);
        }

        public int hashCode() {
            return -99030708;
        }

        public String toString() {
            return "MySparTab";
        }
    }

    public static final class wflxmlrfwp implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f33735iobyxmoadg;

        public wflxmlrfwp(String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f33735iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33735iobyxmoadg, ((wflxmlrfwp) obj).f33735iobyxmoadg);
        }

        public int hashCode() {
            return this.f33735iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Game(url=" + this.f33735iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f33735iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f33736iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f33736iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f33736iobyxmoadg == ((wkgbmnqykc) obj).f33736iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f33736iobyxmoadg);
        }

        public String toString() {
            return "CatalogTab(withPartners=" + this.f33736iobyxmoadg + ")";
        }

        public final boolean zoijcleaow() {
            return this.f33736iobyxmoadg;
        }

        public /* synthetic */ wkgbmnqykc(boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? false : z13);
        }
    }

    public static final class wwaezpbzkn implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SpecialBannerPayload f33737iobyxmoadg;

        public wwaezpbzkn(SpecialBannerPayload args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33737iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wwaezpbzkn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33737iobyxmoadg, ((wwaezpbzkn) obj).f33737iobyxmoadg);
        }

        public int hashCode() {
            return this.f33737iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SpecialBanner(args=" + this.f33737iobyxmoadg + ")";
        }

        public final SpecialBannerPayload zoijcleaow() {
            return this.f33737iobyxmoadg;
        }
    }

    public static final class yadqdtsiqt implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yadqdtsiqt f33738iobyxmoadg = new yadqdtsiqt();

        private yadqdtsiqt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yadqdtsiqt);
        }

        public int hashCode() {
            return 549466787;
        }

        public String toString() {
            return "ScanProduct";
        }
    }

    public static final class yggfygwlhe implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListPayload f33739iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final MainTab f33740zoijcleaow;

        public yggfygwlhe(ProductListPayload args, MainTab mainTab) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33739iobyxmoadg = args;
            this.f33740zoijcleaow = mainTab;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof yggfygwlhe)) {
                return false;
            }
            yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33739iobyxmoadg, yggfygwlheVar.f33739iobyxmoadg) && this.f33740zoijcleaow == yggfygwlheVar.f33740zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f33739iobyxmoadg.hashCode() * 31;
            MainTab mainTab = this.f33740zoijcleaow;
            return iHashCode + (mainTab == null ? 0 : mainTab.hashCode());
        }

        public final MainTab ppxfxbqfkf() {
            return this.f33740zoijcleaow;
        }

        public String toString() {
            return "ProductList(args=" + this.f33739iobyxmoadg + ", tab=" + this.f33740zoijcleaow + ")";
        }

        public final ProductListPayload zoijcleaow() {
            return this.f33739iobyxmoadg;
        }
    }

    public static final class ylkuphrtab implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SpecificOrderArgs f33741iobyxmoadg;

        public ylkuphrtab(SpecificOrderArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33741iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ylkuphrtab) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33741iobyxmoadg, ((ylkuphrtab) obj).f33741iobyxmoadg);
        }

        public int hashCode() {
            return this.f33741iobyxmoadg.hashCode();
        }

        public String toString() {
            return "SpecificOrder(args=" + this.f33741iobyxmoadg + ")";
        }

        public final SpecificOrderArgs zoijcleaow() {
            return this.f33741iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductPayload f33742iobyxmoadg;

        public zdlpuopuiu(ProductPayload args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33742iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33742iobyxmoadg, ((zdlpuopuiu) obj).f33742iobyxmoadg);
        }

        public int hashCode() {
            return this.f33742iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Product(args=" + this.f33742iobyxmoadg + ")";
        }

        public final ProductPayload zoijcleaow() {
            return this.f33742iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: fg0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0745zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0745zoijcleaow f33743iobyxmoadg = new C0745zoijcleaow();

        private C0745zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0745zoijcleaow);
        }

        public int hashCode() {
            return -814313159;
        }

        public String toString() {
            return "CardMySpar";
        }
    }

    public static final class zynmafqrjb implements zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f33744zoijcleaow = xa0.wflxmlrfwp.f121917wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final xa0.wflxmlrfwp f33745iobyxmoadg;

        public zynmafqrjb(xa0.wflxmlrfwp args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f33745iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zynmafqrjb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33745iobyxmoadg, ((zynmafqrjb) obj).f33745iobyxmoadg);
        }

        public int hashCode() {
            return this.f33745iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Quiz(args=" + this.f33745iobyxmoadg + ")";
        }

        public final xa0.wflxmlrfwp zoijcleaow() {
            return this.f33745iobyxmoadg;
        }
    }

    default AnalyticsPage iobyxmoadg() {
        AnalyticsPage subscription;
        if ((this instanceof iobyxmoadg) || (this instanceof wflxmlrfwp) || (this instanceof btonecajqb) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, iwizpuwonk.f33718iobyxmoadg) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, cqumvgiudr.f33706iobyxmoadg) || (this instanceof pkzmftpjix) || (this instanceof gtknphoqwx) || (this instanceof pmvmpeiblj) || (this instanceof iozdgvuglv) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, esjtqupxsv.f33710iobyxmoadg) || (this instanceof istkbnxepw) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, cdpycssgdh.f33705iobyxmoadg) || (this instanceof zynmafqrjb) || (this instanceof nufgyqmvbu) || (this instanceof oxmwwwfdhm) || (this instanceof lqeggnwhkg)) {
            return null;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, C0745zoijcleaow.f33743iobyxmoadg)) {
            return AnalyticsPage.QrCode.f84339iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, ppxfxbqfkf.f33732iobyxmoadg)) {
            return AnalyticsPage.Basket.f84273iwizpuwonk;
        }
        if (this instanceof wkgbmnqykc) {
            return AnalyticsPage.CatalogTab.f84277iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, eablkybsjg.f33709iobyxmoadg)) {
            return AnalyticsPage.ChoosingCategories.f84278iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, gxszxtbevo.f33712iobyxmoadg)) {
            return AnalyticsPage.SupportChat.f84361iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, dxjokdxxww.f33708iobyxmoadg)) {
            return AnalyticsPage.Echecks.f84293iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, draadjrbmk.f33707iobyxmoadg)) {
            return AnalyticsPage.Feedback.f84297iwizpuwonk;
        }
        if (this instanceof agtfadlqog) {
            return AnalyticsPage.Addresses.f84272iwizpuwonk;
        }
        if (this instanceof ojitshcjhn) {
            return AnalyticsPage.MyCoupons.f84308iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, rgvfuqvkyq.f33733iobyxmoadg)) {
            return AnalyticsPage.PurchasesHistory.f84337iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, vdvldrhtss.f33734iobyxmoadg)) {
            return AnalyticsPage.MainScreen.f84306iwizpuwonk;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, kcexrzcfyt.f33721iobyxmoadg)) {
            return AnalyticsPage.NotificationsAdv.f84314iwizpuwonk;
        }
        if (this instanceof zdlpuopuiu) {
            ProductPayload.Type type = ((zdlpuopuiu) this).zoijcleaow().getType();
            ProductPayload.Type.Article article = type instanceof ProductPayload.Type.Article ? (ProductPayload.Type.Article) type : null;
            subscription = new AnalyticsPage.ItemDetail(article != null ? article.getValue() : null, null);
        } else {
            if (this instanceof yggfygwlhe) {
                yggfygwlhe yggfygwlheVar = (yggfygwlhe) this;
                String sectionId = yggfygwlheVar.zoijcleaow().getSectionId();
                if (sectionId == null && (sectionId = yggfygwlheVar.zoijcleaow().getBrandId()) == null) {
                    sectionId = "";
                }
                String productsTitle = yggfygwlheVar.zoijcleaow().getProductsTitle();
                subscription = new AnalyticsPage.ProductList(productsTitle != null ? productsTitle : "", sectionId);
            } else if (this instanceof jyumaefscl) {
                subscription = new AnalyticsPage.ProductsFromBanner(((jyumaefscl) this).zoijcleaow().getBlockId(), null);
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, lereixgezr.f33722iobyxmoadg)) {
                    return AnalyticsPage.ShoppingLists.f84350iwizpuwonk;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, yadqdtsiqt.f33738iobyxmoadg)) {
                    return AnalyticsPage.Scan.f84344iwizpuwonk;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, lmojexxdyd.f33723iobyxmoadg)) {
                    return AnalyticsPage.Shops.f84351iwizpuwonk;
                }
                if (this instanceof wwaezpbzkn) {
                    wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) this;
                    String bannerId = wwaezpbzknVar.zoijcleaow().getBannerId();
                    String bannerTitle = wwaezpbzknVar.zoijcleaow().getBannerTitle();
                    subscription = new AnalyticsPage.LandingPage(bannerTitle != null ? bannerTitle : "", bannerId);
                } else {
                    if (this instanceof ylkuphrtab) {
                        return new AnalyticsPage.Order(((ylkuphrtab) this).zoijcleaow().getOrderId());
                    }
                    if (this instanceof hcddaimhww) {
                        hcddaimhww hcddaimhwwVar = (hcddaimhww) this;
                        String parentId = hcddaimhwwVar.zoijcleaow().getParentId();
                        String title = hcddaimhwwVar.zoijcleaow().getTitle();
                        subscription = new AnalyticsPage.SubCatalog(title != null ? title : "", parentId);
                    } else {
                        if (!(this instanceof jpowsppfya)) {
                            if (this instanceof hkdspvbjdz) {
                                return AnalyticsPage.Tips.f84363iwizpuwonk;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        subscription = new AnalyticsPage.Subscription(((jpowsppfya) this).zoijcleaow().getSubscriptionDetailId(), null);
                    }
                }
            }
        }
        return subscription;
    }
}

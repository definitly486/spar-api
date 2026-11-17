package ru.myspar.specialbanner.impl.presentation;

import java.util.Date;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.domain.feature.qrcode.store.QrCodeArgs;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uwvvkdfqfp {

    public static final class agtfadlqog extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f104169iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(ChangeProductParams addParams) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addParams, "addParams");
            this.f104169iobyxmoadg = addParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104169iobyxmoadg, ((agtfadlqog) obj).f104169iobyxmoadg);
        }

        public int hashCode() {
            return this.f104169iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f104169iobyxmoadg;
        }

        public String toString() {
            return "ShowIqosAgreementsDialog(addParams=" + this.f104169iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f104170iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(PurchaseListAddProductDialogArgs dialogArgs) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f104170iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104170iobyxmoadg, ((btonecajqb) obj).f104170iobyxmoadg);
        }

        public int hashCode() {
            return this.f104170iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f104170iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f104170iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EvropolisGift f104171iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f104172zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(EvropolisGift gift, DeliveryCode deliveryCode) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gift, "gift");
            this.f104171iobyxmoadg = gift;
            this.f104172zoijcleaow = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104171iobyxmoadg, draadjrbmkVar.f104171iobyxmoadg) && this.f104172zoijcleaow == draadjrbmkVar.f104172zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f104171iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f104172zoijcleaow;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f104172zoijcleaow;
        }

        public String toString() {
            return "ShowEvropolisGiftDialog(gift=" + this.f104171iobyxmoadg + ", deliveryCode=" + this.f104172zoijcleaow + ")";
        }

        public final EvropolisGift zoijcleaow() {
            return this.f104171iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends uwvvkdfqfp {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f104173zoijcleaow = BuildYourComboDialogArgs.f87699cqumvgiudr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BuildYourComboDialogArgs f104174iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(BuildYourComboDialogArgs dialogArgs) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f104174iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104174iobyxmoadg, ((dxjokdxxww) obj).f104174iobyxmoadg);
        }

        public int hashCode() {
            return this.f104174iobyxmoadg.hashCode();
        }

        public final BuildYourComboDialogArgs iobyxmoadg() {
            return this.f104174iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(dialogArgs=" + this.f104174iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f104175iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class gtknphoqwx extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f104176iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return 1982883117;
        }

        public String toString() {
            return "ShowErrorDialogUnlockPromoProduct";
        }
    }

    public static final class gxszxtbevo extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f104177iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f104178zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(ChangeProductParams params, String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f104177iobyxmoadg = params;
            this.f104178zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104177iobyxmoadg, gxszxtbevoVar.f104177iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104178zoijcleaow, gxszxtbevoVar.f104178zoijcleaow);
        }

        public int hashCode() {
            return (this.f104177iobyxmoadg.hashCode() * 31) + this.f104178zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104178zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f104177iobyxmoadg + ", message=" + this.f104178zoijcleaow + ")";
        }

        public final ChangeProductParams zoijcleaow() {
            return this.f104177iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104179iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class iwizpuwonk extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104180iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iwizpuwonk(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f104180iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104180iobyxmoadg, ((iwizpuwonk) obj).f104180iobyxmoadg);
        }

        public int hashCode() {
            return this.f104180iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104180iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f104180iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f104181iobyxmoadg;

        public jyumaefscl(int i13) {
            super(null);
            this.f104181iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && this.f104181iobyxmoadg == ((jyumaefscl) obj).f104181iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f104181iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f104181iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbarMessage(res=" + this.f104181iobyxmoadg + ")";
        }
    }

    public static final class kcexrzcfyt extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104182iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f104183ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f104184zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(String name, String description, String imageUrl) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
            this.f104182iobyxmoadg = name;
            this.f104184zoijcleaow = description;
            this.f104183ppxfxbqfkf = imageUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kcexrzcfyt)) {
                return false;
            }
            kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104182iobyxmoadg, kcexrzcfytVar.f104182iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104184zoijcleaow, kcexrzcfytVar.f104184zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104183ppxfxbqfkf, kcexrzcfytVar.f104183ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f104182iobyxmoadg.hashCode() * 31) + this.f104184zoijcleaow.hashCode()) * 31) + this.f104183ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104184zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f104182iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoCollectionItemsDetailDialog(name=" + this.f104182iobyxmoadg + ", description=" + this.f104184zoijcleaow + ", imageUrl=" + this.f104183ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f104183ppxfxbqfkf;
        }
    }

    public static final class lqeggnwhkg extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f104185iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1330422000;
        }

        public String toString() {
            return "ShowBonusCardDialog";
        }
    }

    public static final class nufgyqmvbu extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f104186iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }
    }

    public static final class ojitshcjhn extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104187iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f104187iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104187iobyxmoadg, ((ojitshcjhn) obj).f104187iobyxmoadg);
        }

        public int hashCode() {
            return this.f104187iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104187iobyxmoadg;
        }

        public String toString() {
            return "ShowLimitAddedMessage(message=" + this.f104187iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm extends uwvvkdfqfp {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f104188zoijcleaow = QrCodeArgs.f87774yadqdtsiqt;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final QrCodeArgs f104189iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(QrCodeArgs args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f104189iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104189iobyxmoadg, ((oxmwwwfdhm) obj).f104189iobyxmoadg);
        }

        public int hashCode() {
            return this.f104189iobyxmoadg.hashCode();
        }

        public final QrCodeArgs iobyxmoadg() {
            return this.f104189iobyxmoadg;
        }

        public String toString() {
            return "ShowProductQrCode(args=" + this.f104189iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f104190iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class rgvfuqvkyq extends uwvvkdfqfp {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f104191ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f104192iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f104193zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f104192iobyxmoadg = hint;
            this.f104193zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104192iobyxmoadg, rgvfuqvkyqVar.f104192iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104193zoijcleaow, rgvfuqvkyqVar.f104193zoijcleaow);
        }

        public int hashCode() {
            return (this.f104192iobyxmoadg.hashCode() * 31) + this.f104193zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f104193zoijcleaow;
        }

        public String toString() {
            return "ShowProductHintDialog(hint=" + this.f104192iobyxmoadg + ", analyticsInfo=" + this.f104193zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f104192iobyxmoadg;
        }
    }

    public static final class vdvldrhtss extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final vdvldrhtss f104194iobyxmoadg = new vdvldrhtss();

        private vdvldrhtss() {
            super(null);
        }
    }

    public static final class wflxmlrfwp extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f104195iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f104196iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class yggfygwlhe extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final k62.ppxfxbqfkf f104197iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public yggfygwlhe(k62.ppxfxbqfkf shop) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shop, "shop");
            this.f104197iobyxmoadg = shop;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104197iobyxmoadg, ((yggfygwlhe) obj).f104197iobyxmoadg);
        }

        public int hashCode() {
            return this.f104197iobyxmoadg.hashCode();
        }

        public final k62.ppxfxbqfkf iobyxmoadg() {
            return this.f104197iobyxmoadg;
        }

        public String toString() {
            return "ShowShopDetails(shop=" + this.f104197iobyxmoadg + ")";
        }
    }

    public static final class zdlpuopuiu extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f104198iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
            super(null);
        }
    }

    public static final class zoijcleaow extends uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104199iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Date f104200zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String itemId, Date selectedDate) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectedDate, "selectedDate");
            this.f104199iobyxmoadg = itemId;
            this.f104200zoijcleaow = selectedDate;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104199iobyxmoadg, zoijcleaowVar.f104199iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104200zoijcleaow, zoijcleaowVar.f104200zoijcleaow);
        }

        public int hashCode() {
            return (this.f104199iobyxmoadg.hashCode() * 31) + this.f104200zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104199iobyxmoadg;
        }

        public String toString() {
            return "OpenTimePicker(itemId=" + this.f104199iobyxmoadg + ", selectedDate=" + this.f104200zoijcleaow + ")";
        }

        public final Date zoijcleaow() {
            return this.f104200zoijcleaow;
        }
    }

    public /* synthetic */ uwvvkdfqfp(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private uwvvkdfqfp() {
    }
}

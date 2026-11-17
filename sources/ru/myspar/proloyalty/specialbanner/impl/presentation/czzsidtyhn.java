package ru.myspar.proloyalty.specialbanner.impl.presentation;

import java.util.Date;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.domain.feature.qrcode.store.QrCodeArgs;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class czzsidtyhn {

    public static final class agtfadlqog extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101400iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f101400iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101400iobyxmoadg, ((agtfadlqog) obj).f101400iobyxmoadg);
        }

        public int hashCode() {
            return this.f101400iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101400iobyxmoadg;
        }

        public String toString() {
            return "ShowLimitAddedMessage(message=" + this.f101400iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f101401iobyxmoadg = new btonecajqb();

        private btonecajqb() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 2105529127;
        }

        public String toString() {
            return "ShowErrorSnackbarUnlockPromoProduct";
        }
    }

    public static final class draadjrbmk extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f101402iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }
    }

    public static final class dxjokdxxww extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f101403iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(PurchaseListAddProductDialogArgs dialogArgs) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f101403iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101403iobyxmoadg, ((dxjokdxxww) obj).f101403iobyxmoadg);
        }

        public int hashCode() {
            return this.f101403iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f101403iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f101403iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f101404iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class gtknphoqwx extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EvropolisGift f101405iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f101406zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(EvropolisGift gift, DeliveryCode deliveryCode) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gift, "gift");
            this.f101405iobyxmoadg = gift;
            this.f101406zoijcleaow = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101405iobyxmoadg, gtknphoqwxVar.f101405iobyxmoadg) && this.f101406zoijcleaow == gtknphoqwxVar.f101406zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f101405iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f101406zoijcleaow;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f101406zoijcleaow;
        }

        public String toString() {
            return "ShowEvropolisGiftDialog(gift=" + this.f101405iobyxmoadg + ", deliveryCode=" + this.f101406zoijcleaow + ")";
        }

        public final EvropolisGift zoijcleaow() {
            return this.f101405iobyxmoadg;
        }
    }

    public static final class gxszxtbevo extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f101407iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -279745331;
        }

        public String toString() {
            return "ShowBonusCardDialog";
        }
    }

    public static final class iobyxmoadg extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f101408iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class jyumaefscl extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101409iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f101409iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101409iobyxmoadg, ((jyumaefscl) obj).f101409iobyxmoadg);
        }

        public int hashCode() {
            return this.f101409iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101409iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f101409iobyxmoadg + ")";
        }
    }

    public static final class kcexrzcfyt extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f101410iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f101411iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends czzsidtyhn {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f101412zoijcleaow = BuildYourComboDialogArgs.f95481iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BuildYourComboDialogArgs f101413iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(BuildYourComboDialogArgs dialogArgs) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f101413iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101413iobyxmoadg, ((nufgyqmvbu) obj).f101413iobyxmoadg);
        }

        public int hashCode() {
            return this.f101413iobyxmoadg.hashCode();
        }

        public final BuildYourComboDialogArgs iobyxmoadg() {
            return this.f101413iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(dialogArgs=" + this.f101413iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn extends czzsidtyhn {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f101414ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f101415iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f101416zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f101415iobyxmoadg = hint;
            this.f101416zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ojitshcjhn)) {
                return false;
            }
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101415iobyxmoadg, ojitshcjhnVar.f101415iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101416zoijcleaow, ojitshcjhnVar.f101416zoijcleaow);
        }

        public int hashCode() {
            return (this.f101415iobyxmoadg.hashCode() * 31) + this.f101416zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f101416zoijcleaow;
        }

        public String toString() {
            return "ShowProductHintDialog(hint=" + this.f101415iobyxmoadg + ", analyticsInfo=" + this.f101416zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f101415iobyxmoadg;
        }
    }

    public static final class oxmwwwfdhm extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101417iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f101418ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f101419zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(String name, String description, String imageUrl) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
            this.f101417iobyxmoadg = name;
            this.f101419zoijcleaow = description;
            this.f101418ppxfxbqfkf = imageUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101417iobyxmoadg, oxmwwwfdhmVar.f101417iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101419zoijcleaow, oxmwwwfdhmVar.f101419zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101418ppxfxbqfkf, oxmwwwfdhmVar.f101418ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f101417iobyxmoadg.hashCode() * 31) + this.f101419zoijcleaow.hashCode()) * 31) + this.f101418ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101419zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f101417iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoCollectionItemsDetailDialog(name=" + this.f101417iobyxmoadg + ", description=" + this.f101419zoijcleaow + ", imageUrl=" + this.f101418ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f101418ppxfxbqfkf;
        }
    }

    public static final class ppxfxbqfkf extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f101420iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class rgvfuqvkyq extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f101421iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }
    }

    public static final class vdvldrhtss extends czzsidtyhn {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f101422zoijcleaow = QrCodeArgs.f95553yadqdtsiqt;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final QrCodeArgs f101423iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(QrCodeArgs args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f101423iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101423iobyxmoadg, ((vdvldrhtss) obj).f101423iobyxmoadg);
        }

        public int hashCode() {
            return this.f101423iobyxmoadg.hashCode();
        }

        public final QrCodeArgs iobyxmoadg() {
            return this.f101423iobyxmoadg;
        }

        public String toString() {
            return "ShowProductQrCode(args=" + this.f101423iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f101424iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(ChangeProductParams addParams) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addParams, "addParams");
            this.f101424iobyxmoadg = addParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101424iobyxmoadg, ((wflxmlrfwp) obj).f101424iobyxmoadg);
        }

        public int hashCode() {
            return this.f101424iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f101424iobyxmoadg;
        }

        public String toString() {
            return "ShowIqosAgreementsDialog(addParams=" + this.f101424iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f101425iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class yggfygwlhe extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f101426iobyxmoadg;

        public yggfygwlhe(int i13) {
            super(null);
            this.f101426iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && this.f101426iobyxmoadg == ((yggfygwlhe) obj).f101426iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f101426iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f101426iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbarMessage(res=" + this.f101426iobyxmoadg + ")";
        }
    }

    public static final class zdlpuopuiu extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ds1.ppxfxbqfkf f101427iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zdlpuopuiu(ds1.ppxfxbqfkf shop) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shop, "shop");
            this.f101427iobyxmoadg = shop;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101427iobyxmoadg, ((zdlpuopuiu) obj).f101427iobyxmoadg);
        }

        public int hashCode() {
            return this.f101427iobyxmoadg.hashCode();
        }

        public final ds1.ppxfxbqfkf iobyxmoadg() {
            return this.f101427iobyxmoadg;
        }

        public String toString() {
            return "ShowShopDetails(shop=" + this.f101427iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends czzsidtyhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101428iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Date f101429zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String itemId, Date selectedDate) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectedDate, "selectedDate");
            this.f101428iobyxmoadg = itemId;
            this.f101429zoijcleaow = selectedDate;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101428iobyxmoadg, zoijcleaowVar.f101428iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101429zoijcleaow, zoijcleaowVar.f101429zoijcleaow);
        }

        public int hashCode() {
            return (this.f101428iobyxmoadg.hashCode() * 31) + this.f101429zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101428iobyxmoadg;
        }

        public String toString() {
            return "OpenTimePicker(itemId=" + this.f101428iobyxmoadg + ", selectedDate=" + this.f101429zoijcleaow + ")";
        }

        public final Date zoijcleaow() {
            return this.f101429zoijcleaow;
        }
    }

    public /* synthetic */ czzsidtyhn(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private czzsidtyhn() {
    }
}

package ru.myspar.orders.impl.screens.specific.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91450iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f91450iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f91450iobyxmoadg, ((agtfadlqog) obj).f91450iobyxmoadg);
        }

        public int hashCode() {
            return this.f91450iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91450iobyxmoadg;
        }

        public String toString() {
            return "ShowProductLimitMessage(message=" + this.f91450iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f91451iobyxmoadg = new btonecajqb();

        private btonecajqb() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 6276229;
        }

        public String toString() {
            return "ShowInPlaceDialog";
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91452iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f91453zoijcleaow;

        public draadjrbmk(int i13, int i14) {
            super(null);
            this.f91452iobyxmoadg = i13;
            this.f91453zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return this.f91452iobyxmoadg == draadjrbmkVar.f91452iobyxmoadg && this.f91453zoijcleaow == draadjrbmkVar.f91453zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f91452iobyxmoadg) * 31) + Integer.hashCode(this.f91453zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f91453zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialog(title=" + this.f91452iobyxmoadg + ", message=" + this.f91453zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f91452iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91454iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f91454iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f91454iobyxmoadg, ((dxjokdxxww) obj).f91454iobyxmoadg);
        }

        public int hashCode() {
            return this.f91454iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91454iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f91454iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f91455iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 151680021;
        }

        public String toString() {
            return "OnMyWayComplete";
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f91456iobyxmoadg;

        public gtknphoqwx(CharSequence charSequence) {
            super(null);
            this.f91456iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f91456iobyxmoadg, ((gtknphoqwx) obj).f91456iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f91456iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f91456iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f91456iobyxmoadg) + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f91457iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 98981908;
        }

        public String toString() {
            return "ShowAppReview";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91458iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            this.f91458iobyxmoadg = orderNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91458iobyxmoadg, ((iobyxmoadg) obj).f91458iobyxmoadg);
        }

        public int hashCode() {
            return this.f91458iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91458iobyxmoadg;
        }

        public String toString() {
            return "CopyOrderNumber(orderNumber=" + this.f91458iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91459iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f91460zoijcleaow;

        public lqeggnwhkg(int i13, int i14) {
            super(null);
            this.f91459iobyxmoadg = i13;
            this.f91460zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return this.f91459iobyxmoadg == lqeggnwhkgVar.f91459iobyxmoadg && this.f91460zoijcleaow == lqeggnwhkgVar.f91460zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f91459iobyxmoadg) * 31) + Integer.hashCode(this.f91460zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f91460zoijcleaow;
        }

        public String toString() {
            return "ShowDeleteAllReplacementsNotificationDialog(title=" + this.f91459iobyxmoadg + ", message=" + this.f91460zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f91459iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91461iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f91462ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f91463wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f91464zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String merchantLogin, String apiKey, String orderNumber, String bankInvoiceId) {
            super(null);
            zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
            zdlpuopuiu.btonecajqb(apiKey, "apiKey");
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
            this.f91461iobyxmoadg = merchantLogin;
            this.f91464zoijcleaow = apiKey;
            this.f91462ppxfxbqfkf = orderNumber;
            this.f91463wkgbmnqykc = bankInvoiceId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f91461iobyxmoadg, nufgyqmvbuVar.f91461iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91464zoijcleaow, nufgyqmvbuVar.f91464zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91462ppxfxbqfkf, nufgyqmvbuVar.f91462ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f91463wkgbmnqykc, nufgyqmvbuVar.f91463wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f91461iobyxmoadg.hashCode() * 31) + this.f91464zoijcleaow.hashCode()) * 31) + this.f91462ppxfxbqfkf.hashCode()) * 31) + this.f91463wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91464zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f91461iobyxmoadg;
        }

        public String toString() {
            return "ShowEcomSdkPaymentScreen(merchantLogin=" + this.f91461iobyxmoadg + ", apiKey=" + this.f91464zoijcleaow + ", orderNumber=" + this.f91462ppxfxbqfkf + ", bankInvoiceId=" + this.f91463wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f91462ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f91463wkgbmnqykc;
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f91465iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(List sbpBanks) {
            super(null);
            zdlpuopuiu.btonecajqb(sbpBanks, "sbpBanks");
            this.f91465iobyxmoadg = sbpBanks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f91465iobyxmoadg, ((ojitshcjhn) obj).f91465iobyxmoadg);
        }

        public int hashCode() {
            return this.f91465iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f91465iobyxmoadg;
        }

        public String toString() {
            return "ShowSbpPaymentScreen(sbpBanks=" + this.f91465iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91466iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String deliveryPhone) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
            this.f91466iobyxmoadg = deliveryPhone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f91466iobyxmoadg, ((ppxfxbqfkf) obj).f91466iobyxmoadg);
        }

        public int hashCode() {
            return this.f91466iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91466iobyxmoadg;
        }

        public String toString() {
            return "InMarkerPickupInfo(deliveryPhone=" + this.f91466iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91467iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f91468zoijcleaow;

        public wflxmlrfwp(int i13, int i14) {
            super(null);
            this.f91467iobyxmoadg = i13;
            this.f91468zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return this.f91467iobyxmoadg == wflxmlrfwpVar.f91467iobyxmoadg && this.f91468zoijcleaow == wflxmlrfwpVar.f91468zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f91467iobyxmoadg) * 31) + Integer.hashCode(this.f91468zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f91468zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialogWithRefresh(title=" + this.f91467iobyxmoadg + ", message=" + this.f91468zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f91467iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2123wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f91469ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f91470iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f91471zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2123wkgbmnqykc(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f91470iobyxmoadg = hint;
            this.f91471zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2123wkgbmnqykc)) {
                return false;
            }
            C2123wkgbmnqykc c2123wkgbmnqykc = (C2123wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f91470iobyxmoadg, c2123wkgbmnqykc.f91470iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91471zoijcleaow, c2123wkgbmnqykc.f91471zoijcleaow);
        }

        public int hashCode() {
            return (this.f91470iobyxmoadg.hashCode() * 31) + this.f91471zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f91471zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f91470iobyxmoadg + ", analyticsInfo=" + this.f91471zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f91470iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91472iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String deliveryPhone) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
            this.f91472iobyxmoadg = deliveryPhone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91472iobyxmoadg, ((zoijcleaow) obj).f91472iobyxmoadg);
        }

        public int hashCode() {
            return this.f91472iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91472iobyxmoadg;
        }

        public String toString() {
            return "InCarPickupInfo(deliveryPhone=" + this.f91472iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

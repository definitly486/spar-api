package ru.myspar.proloyalty.orders.impl.screens.specific.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99100iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f99100iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f99100iobyxmoadg, ((agtfadlqog) obj).f99100iobyxmoadg);
        }

        public int hashCode() {
            return this.f99100iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99100iobyxmoadg;
        }

        public String toString() {
            return "ShowProductLimitMessage(message=" + this.f99100iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f99101iobyxmoadg = new btonecajqb();

        private btonecajqb() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return -1893153470;
        }

        public String toString() {
            return "ShowInPlaceDialog";
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f99102iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f99103zoijcleaow;

        public draadjrbmk(int i13, int i14) {
            super(null);
            this.f99102iobyxmoadg = i13;
            this.f99103zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return this.f99102iobyxmoadg == draadjrbmkVar.f99102iobyxmoadg && this.f99103zoijcleaow == draadjrbmkVar.f99103zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f99102iobyxmoadg) * 31) + Integer.hashCode(this.f99103zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f99103zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialog(title=" + this.f99102iobyxmoadg + ", message=" + this.f99103zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f99102iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99104iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99104iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f99104iobyxmoadg, ((dxjokdxxww) obj).f99104iobyxmoadg);
        }

        public int hashCode() {
            return this.f99104iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99104iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99104iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f99105iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1901690862;
        }

        public String toString() {
            return "OnMyWayComplete";
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f99106iobyxmoadg;

        public gtknphoqwx(CharSequence charSequence) {
            super(null);
            this.f99106iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f99106iobyxmoadg, ((gtknphoqwx) obj).f99106iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f99106iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f99106iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f99106iobyxmoadg) + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f99107iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1239466159;
        }

        public String toString() {
            return "ShowAppReview";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99108iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            this.f99108iobyxmoadg = orderNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99108iobyxmoadg, ((iobyxmoadg) obj).f99108iobyxmoadg);
        }

        public int hashCode() {
            return this.f99108iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99108iobyxmoadg;
        }

        public String toString() {
            return "CopyOrderNumber(orderNumber=" + this.f99108iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f99109iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f99110zoijcleaow;

        public lqeggnwhkg(int i13, int i14) {
            super(null);
            this.f99109iobyxmoadg = i13;
            this.f99110zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return this.f99109iobyxmoadg == lqeggnwhkgVar.f99109iobyxmoadg && this.f99110zoijcleaow == lqeggnwhkgVar.f99110zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f99109iobyxmoadg) * 31) + Integer.hashCode(this.f99110zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f99110zoijcleaow;
        }

        public String toString() {
            return "ShowDeleteAllReplacementsNotificationDialog(title=" + this.f99109iobyxmoadg + ", message=" + this.f99110zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f99109iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99111iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f99112ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f99113wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f99114zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String merchantLogin, String apiKey, String orderNumber, String bankInvoiceId) {
            super(null);
            zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
            zdlpuopuiu.btonecajqb(apiKey, "apiKey");
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
            this.f99111iobyxmoadg = merchantLogin;
            this.f99114zoijcleaow = apiKey;
            this.f99112ppxfxbqfkf = orderNumber;
            this.f99113wkgbmnqykc = bankInvoiceId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f99111iobyxmoadg, nufgyqmvbuVar.f99111iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99114zoijcleaow, nufgyqmvbuVar.f99114zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99112ppxfxbqfkf, nufgyqmvbuVar.f99112ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99113wkgbmnqykc, nufgyqmvbuVar.f99113wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f99111iobyxmoadg.hashCode() * 31) + this.f99114zoijcleaow.hashCode()) * 31) + this.f99112ppxfxbqfkf.hashCode()) * 31) + this.f99113wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99114zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f99111iobyxmoadg;
        }

        public String toString() {
            return "ShowEcomSdkPaymentScreen(merchantLogin=" + this.f99111iobyxmoadg + ", apiKey=" + this.f99114zoijcleaow + ", orderNumber=" + this.f99112ppxfxbqfkf + ", bankInvoiceId=" + this.f99113wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f99112ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f99113wkgbmnqykc;
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f99115iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(List sbpBanks) {
            super(null);
            zdlpuopuiu.btonecajqb(sbpBanks, "sbpBanks");
            this.f99115iobyxmoadg = sbpBanks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f99115iobyxmoadg, ((ojitshcjhn) obj).f99115iobyxmoadg);
        }

        public int hashCode() {
            return this.f99115iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f99115iobyxmoadg;
        }

        public String toString() {
            return "ShowSbpPaymentScreen(sbpBanks=" + this.f99115iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99116iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String deliveryPhone) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
            this.f99116iobyxmoadg = deliveryPhone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99116iobyxmoadg, ((ppxfxbqfkf) obj).f99116iobyxmoadg);
        }

        public int hashCode() {
            return this.f99116iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99116iobyxmoadg;
        }

        public String toString() {
            return "InMarkerPickupInfo(deliveryPhone=" + this.f99116iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f99117iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f99118zoijcleaow;

        public wflxmlrfwp(int i13, int i14) {
            super(null);
            this.f99117iobyxmoadg = i13;
            this.f99118zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return this.f99117iobyxmoadg == wflxmlrfwpVar.f99117iobyxmoadg && this.f99118zoijcleaow == wflxmlrfwpVar.f99118zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f99117iobyxmoadg) * 31) + Integer.hashCode(this.f99118zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f99118zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialogWithRefresh(title=" + this.f99117iobyxmoadg + ", message=" + this.f99118zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f99117iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2370wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f99119ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f99120iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f99121zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2370wkgbmnqykc(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f99120iobyxmoadg = hint;
            this.f99121zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2370wkgbmnqykc)) {
                return false;
            }
            C2370wkgbmnqykc c2370wkgbmnqykc = (C2370wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f99120iobyxmoadg, c2370wkgbmnqykc.f99120iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99121zoijcleaow, c2370wkgbmnqykc.f99121zoijcleaow);
        }

        public int hashCode() {
            return (this.f99120iobyxmoadg.hashCode() * 31) + this.f99121zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f99121zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f99120iobyxmoadg + ", analyticsInfo=" + this.f99121zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f99120iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99122iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String deliveryPhone) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
            this.f99122iobyxmoadg = deliveryPhone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99122iobyxmoadg, ((zoijcleaow) obj).f99122iobyxmoadg);
        }

        public int hashCode() {
            return this.f99122iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99122iobyxmoadg;
        }

        public String toString() {
            return "InCarPickupInfo(deliveryPhone=" + this.f99122iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

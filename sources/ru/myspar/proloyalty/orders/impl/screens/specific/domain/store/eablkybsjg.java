package ru.myspar.proloyalty.orders.impl.screens.specific.domain.store;

import java.util.List;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import ru.myspar.proloyalty.core.domain.models.tracking.TrackingOrderPayload;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;
import ru.myspar.proloyalty.payment.api.model.PaymentWebArgs;
import ru.myspar.proloyalty.rate.rate_order.api.models.RateOrderPayload;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class agtfadlqog extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f98717iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 1187528069;
        }

        public String toString() {
            return "NavigateToStore";
        }
    }

    public static final class btonecajqb extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentMethodsArgs f98718iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(PaymentMethodsArgs args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f98718iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98718iobyxmoadg, ((btonecajqb) obj).f98718iobyxmoadg);
        }

        public int hashCode() {
            return this.f98718iobyxmoadg.hashCode();
        }

        public final PaymentMethodsArgs iobyxmoadg() {
            return this.f98718iobyxmoadg;
        }

        public String toString() {
            return "NavigateToPaymentMethodsScreen(args=" + this.f98718iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f98719iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f98720zoijcleaow;

        public cqumvgiudr(int i13, int i14) {
            super(null);
            this.f98719iobyxmoadg = i13;
            this.f98720zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof cqumvgiudr)) {
                return false;
            }
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
            return this.f98719iobyxmoadg == cqumvgiudrVar.f98719iobyxmoadg && this.f98720zoijcleaow == cqumvgiudrVar.f98720zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f98719iobyxmoadg) * 31) + Integer.hashCode(this.f98720zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f98720zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialog(title=" + this.f98719iobyxmoadg + ", message=" + this.f98720zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f98719iobyxmoadg;
        }
    }

    public static final class draadjrbmk extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RateOrderPayload f98721iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(RateOrderPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f98721iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98721iobyxmoadg, ((draadjrbmk) obj).f98721iobyxmoadg);
        }

        public int hashCode() {
            return this.f98721iobyxmoadg.hashCode();
        }

        public final RateOrderPayload iobyxmoadg() {
            return this.f98721iobyxmoadg;
        }

        public String toString() {
            return "NavigateToRateOrderSuccess(args=" + this.f98721iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f98722iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 922265843;
        }

        public String toString() {
            return "NavigateToMainAndCartTab";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2359eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2359eablkybsjg f98723iobyxmoadg = new C2359eablkybsjg();

        private C2359eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2359eablkybsjg);
        }

        public int hashCode() {
            return 2043316210;
        }

        public String toString() {
            return "InPlace";
        }
    }

    public static final class esjtqupxsv extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f98724iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f98725zoijcleaow;

        public esjtqupxsv(int i13, int i14) {
            super(null);
            this.f98724iobyxmoadg = i13;
            this.f98725zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof esjtqupxsv)) {
                return false;
            }
            esjtqupxsv esjtqupxsvVar = (esjtqupxsv) obj;
            return this.f98724iobyxmoadg == esjtqupxsvVar.f98724iobyxmoadg && this.f98725zoijcleaow == esjtqupxsvVar.f98725zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f98724iobyxmoadg) * 31) + Integer.hashCode(this.f98725zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f98725zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialogWithRefresh(title=" + this.f98724iobyxmoadg + ", message=" + this.f98725zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f98724iobyxmoadg;
        }
    }

    public static final class gtknphoqwx extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RateOrderPayload f98726iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(RateOrderPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f98726iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98726iobyxmoadg, ((gtknphoqwx) obj).f98726iobyxmoadg);
        }

        public int hashCode() {
            return this.f98726iobyxmoadg.hashCode();
        }

        public final RateOrderPayload iobyxmoadg() {
            return this.f98726iobyxmoadg;
        }

        public String toString() {
            return "NavigateToRateOrder(args=" + this.f98726iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EditOrderPayload f98727iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(EditOrderPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f98727iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98727iobyxmoadg, ((gxszxtbevo) obj).f98727iobyxmoadg);
        }

        public int hashCode() {
            return this.f98727iobyxmoadg.hashCode();
        }

        public final EditOrderPayload iobyxmoadg() {
            return this.f98727iobyxmoadg;
        }

        public String toString() {
            return "NavigateToEditOrder(args=" + this.f98727iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f98728iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 102785495;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class istkbnxepw extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentWebArgs f98729iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public istkbnxepw(PaymentWebArgs webViewArgs) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(webViewArgs, "webViewArgs");
            this.f98729iobyxmoadg = webViewArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof istkbnxepw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98729iobyxmoadg, ((istkbnxepw) obj).f98729iobyxmoadg);
        }

        public int hashCode() {
            return this.f98729iobyxmoadg.hashCode();
        }

        public final PaymentWebArgs iobyxmoadg() {
            return this.f98729iobyxmoadg;
        }

        public String toString() {
            return "ShowWebViewPaymentScreen(webViewArgs=" + this.f98729iobyxmoadg + ")";
        }
    }

    public static final class iwizpuwonk extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98730iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iwizpuwonk(String errorMessage) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorMessage, "errorMessage");
            this.f98730iobyxmoadg = errorMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98730iobyxmoadg, ((iwizpuwonk) obj).f98730iobyxmoadg);
        }

        public int hashCode() {
            return this.f98730iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98730iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorMessage(errorMessage=" + this.f98730iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98731iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f98732ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f98733wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98734zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(String merchantLogin, String apiKey, String orderNumber, String bankInvoiceId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiKey, "apiKey");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
            this.f98731iobyxmoadg = merchantLogin;
            this.f98734zoijcleaow = apiKey;
            this.f98732ppxfxbqfkf = orderNumber;
            this.f98733wkgbmnqykc = bankInvoiceId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof jyumaefscl)) {
                return false;
            }
            jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98731iobyxmoadg, jyumaefsclVar.f98731iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98734zoijcleaow, jyumaefsclVar.f98734zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98732ppxfxbqfkf, jyumaefsclVar.f98732ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98733wkgbmnqykc, jyumaefsclVar.f98733wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f98731iobyxmoadg.hashCode() * 31) + this.f98734zoijcleaow.hashCode()) * 31) + this.f98732ppxfxbqfkf.hashCode()) * 31) + this.f98733wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98734zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f98731iobyxmoadg;
        }

        public String toString() {
            return "ShowEcomSdkPaymentScreen(merchantLogin=" + this.f98731iobyxmoadg + ", apiKey=" + this.f98734zoijcleaow + ", orderNumber=" + this.f98732ppxfxbqfkf + ", bankInvoiceId=" + this.f98733wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f98732ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f98733wkgbmnqykc;
        }
    }

    public static final class kcexrzcfyt extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f98735iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(Throwable error) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
            this.f98735iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98735iobyxmoadg, ((kcexrzcfyt) obj).f98735iobyxmoadg);
        }

        public int hashCode() {
            return this.f98735iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f98735iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f98735iobyxmoadg + ")";
        }
    }

    public static final class lereixgezr extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98736iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lereixgezr(String orderId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f98736iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98736iobyxmoadg, ((lereixgezr) obj).f98736iobyxmoadg);
        }

        public int hashCode() {
            return this.f98736iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98736iobyxmoadg;
        }

        public String toString() {
            return "ShowOrderCanceled(orderId=" + this.f98736iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98737iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String phone) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
            this.f98737iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98737iobyxmoadg, ((lqeggnwhkg) obj).f98737iobyxmoadg);
        }

        public int hashCode() {
            return this.f98737iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98737iobyxmoadg;
        }

        public String toString() {
            return "NavigateToExternalDial(phone=" + this.f98737iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f98738iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1905478559;
        }

        public String toString() {
            return "NavigateToFeedback";
        }
    }

    public static final class ojitshcjhn extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TrackingOrderPayload f98739iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(TrackingOrderPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f98739iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98739iobyxmoadg, ((ojitshcjhn) obj).f98739iobyxmoadg);
        }

        public int hashCode() {
            return this.f98739iobyxmoadg.hashCode();
        }

        public final TrackingOrderPayload iobyxmoadg() {
            return this.f98739iobyxmoadg;
        }

        public String toString() {
            return "NavigateToTrackingOrder(args=" + this.f98739iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98740iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(String orderId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f98740iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98740iobyxmoadg, ((oxmwwwfdhm) obj).f98740iobyxmoadg);
        }

        public int hashCode() {
            return this.f98740iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98740iobyxmoadg;
        }

        public String toString() {
            return "OpenTipsOrderScreen(orderId=" + this.f98740iobyxmoadg + ")";
        }
    }

    public static final class pmvmpeiblj extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98741iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public pmvmpeiblj(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f98741iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pmvmpeiblj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98741iobyxmoadg, ((pmvmpeiblj) obj).f98741iobyxmoadg);
        }

        public int hashCode() {
            return this.f98741iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98741iobyxmoadg;
        }

        public String toString() {
            return "ShowProductLimitMessage(message=" + this.f98741iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98742iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String deliveryPhone) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
            this.f98742iobyxmoadg = deliveryPhone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98742iobyxmoadg, ((ppxfxbqfkf) obj).f98742iobyxmoadg);
        }

        public int hashCode() {
            return this.f98742iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98742iobyxmoadg;
        }

        public String toString() {
            return "InCarPickupInfo(deliveryPhone=" + this.f98742iobyxmoadg + ")";
        }
    }

    public static final class rgvfuqvkyq extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f98743ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f98744iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f98745zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f98744iobyxmoadg = hint;
            this.f98745zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98744iobyxmoadg, rgvfuqvkyqVar.f98744iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98745zoijcleaow, rgvfuqvkyqVar.f98745zoijcleaow);
        }

        public int hashCode() {
            return (this.f98744iobyxmoadg.hashCode() * 31) + this.f98745zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f98745zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f98744iobyxmoadg + ", analyticsInfo=" + this.f98745zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f98744iobyxmoadg;
        }
    }

    public static final class vdvldrhtss extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final vdvldrhtss f98746iobyxmoadg = new vdvldrhtss();

        private vdvldrhtss() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof vdvldrhtss);
        }

        public int hashCode() {
            return -1097094803;
        }

        public String toString() {
            return "OnMyWayComplete";
        }
    }

    public static final class wflxmlrfwp extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductPayload f98747iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(ProductPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f98747iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98747iobyxmoadg, ((wflxmlrfwp) obj).f98747iobyxmoadg);
        }

        public int hashCode() {
            return this.f98747iobyxmoadg.hashCode();
        }

        public final ProductPayload iobyxmoadg() {
            return this.f98747iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificProduct(args=" + this.f98747iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98748iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String deliveryPhone) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
            this.f98748iobyxmoadg = deliveryPhone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98748iobyxmoadg, ((wkgbmnqykc) obj).f98748iobyxmoadg);
        }

        public int hashCode() {
            return this.f98748iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98748iobyxmoadg;
        }

        public String toString() {
            return "InMarkerPickupInfo(deliveryPhone=" + this.f98748iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f98749iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f98750zoijcleaow;

        public yggfygwlhe(int i13, int i14) {
            super(null);
            this.f98749iobyxmoadg = i13;
            this.f98750zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof yggfygwlhe)) {
                return false;
            }
            yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
            return this.f98749iobyxmoadg == yggfygwlheVar.f98749iobyxmoadg && this.f98750zoijcleaow == yggfygwlheVar.f98750zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f98749iobyxmoadg) * 31) + Integer.hashCode(this.f98750zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f98750zoijcleaow;
        }

        public String toString() {
            return "ShowDeleteAllReplacementsNotificationDialog(title=" + this.f98749iobyxmoadg + ", message=" + this.f98750zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f98749iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f98751iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 611648364;
        }

        public String toString() {
            return "ShowAppReview";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98752iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String orderId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f98752iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98752iobyxmoadg, ((zoijcleaow) obj).f98752iobyxmoadg);
        }

        public int hashCode() {
            return this.f98752iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98752iobyxmoadg;
        }

        public String toString() {
            return "CopyOrderNumber(orderId=" + this.f98752iobyxmoadg + ")";
        }
    }

    public static final class zynmafqrjb extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f98753iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zynmafqrjb(List sbpBanks) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sbpBanks, "sbpBanks");
            this.f98753iobyxmoadg = sbpBanks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zynmafqrjb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98753iobyxmoadg, ((zynmafqrjb) obj).f98753iobyxmoadg);
        }

        public int hashCode() {
            return this.f98753iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f98753iobyxmoadg;
        }

        public String toString() {
            return "ShowSbpPaymentScreen(sbpBanks=" + this.f98753iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

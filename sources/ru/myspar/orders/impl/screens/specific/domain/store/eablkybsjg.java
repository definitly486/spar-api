package ru.myspar.orders.impl.screens.specific.domain.store;

import java.util.List;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.payload.EditOrderPayload;
import ru.myspar.core.domain.models.tracking.TrackingOrderPayload;
import ru.myspar.payment.api.model.PaymentMethodsArgs;
import ru.myspar.payment.api.model.PaymentWebArgs;
import ru.myspar.rate.rate_order.api.models.RateOrderPayload;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    public static final class agtfadlqog extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f91063iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return -270254814;
        }

        public String toString() {
            return "NavigateToStore";
        }
    }

    public static final class btonecajqb extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentMethodsArgs f91064iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(PaymentMethodsArgs args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f91064iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91064iobyxmoadg, ((btonecajqb) obj).f91064iobyxmoadg);
        }

        public int hashCode() {
            return this.f91064iobyxmoadg.hashCode();
        }

        public final PaymentMethodsArgs iobyxmoadg() {
            return this.f91064iobyxmoadg;
        }

        public String toString() {
            return "NavigateToPaymentMethodsScreen(args=" + this.f91064iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91065iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f91066zoijcleaow;

        public cqumvgiudr(int i13, int i14) {
            super(null);
            this.f91065iobyxmoadg = i13;
            this.f91066zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof cqumvgiudr)) {
                return false;
            }
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
            return this.f91065iobyxmoadg == cqumvgiudrVar.f91065iobyxmoadg && this.f91066zoijcleaow == cqumvgiudrVar.f91066zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f91065iobyxmoadg) * 31) + Integer.hashCode(this.f91066zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f91066zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialog(title=" + this.f91065iobyxmoadg + ", message=" + this.f91066zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f91065iobyxmoadg;
        }
    }

    public static final class draadjrbmk extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RateOrderPayload f91067iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(RateOrderPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f91067iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91067iobyxmoadg, ((draadjrbmk) obj).f91067iobyxmoadg);
        }

        public int hashCode() {
            return this.f91067iobyxmoadg.hashCode();
        }

        public final RateOrderPayload iobyxmoadg() {
            return this.f91067iobyxmoadg;
        }

        public String toString() {
            return "NavigateToRateOrderSuccess(args=" + this.f91067iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f91068iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1795823114;
        }

        public String toString() {
            return "NavigateToMainAndCartTab";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2112eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2112eablkybsjg f91069iobyxmoadg = new C2112eablkybsjg();

        private C2112eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2112eablkybsjg);
        }

        public int hashCode() {
            return 1570403471;
        }

        public String toString() {
            return "InPlace";
        }
    }

    public static final class esjtqupxsv extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91070iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f91071zoijcleaow;

        public esjtqupxsv(int i13, int i14) {
            super(null);
            this.f91070iobyxmoadg = i13;
            this.f91071zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof esjtqupxsv)) {
                return false;
            }
            esjtqupxsv esjtqupxsvVar = (esjtqupxsv) obj;
            return this.f91070iobyxmoadg == esjtqupxsvVar.f91070iobyxmoadg && this.f91071zoijcleaow == esjtqupxsvVar.f91071zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f91070iobyxmoadg) * 31) + Integer.hashCode(this.f91071zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f91071zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialogWithRefresh(title=" + this.f91070iobyxmoadg + ", message=" + this.f91071zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f91070iobyxmoadg;
        }
    }

    public static final class gtknphoqwx extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RateOrderPayload f91072iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(RateOrderPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f91072iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91072iobyxmoadg, ((gtknphoqwx) obj).f91072iobyxmoadg);
        }

        public int hashCode() {
            return this.f91072iobyxmoadg.hashCode();
        }

        public final RateOrderPayload iobyxmoadg() {
            return this.f91072iobyxmoadg;
        }

        public String toString() {
            return "NavigateToRateOrder(args=" + this.f91072iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EditOrderPayload f91073iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(EditOrderPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f91073iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91073iobyxmoadg, ((gxszxtbevo) obj).f91073iobyxmoadg);
        }

        public int hashCode() {
            return this.f91073iobyxmoadg.hashCode();
        }

        public final EditOrderPayload iobyxmoadg() {
            return this.f91073iobyxmoadg;
        }

        public String toString() {
            return "NavigateToEditOrder(args=" + this.f91073iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f91074iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 31982170;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class istkbnxepw extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentWebArgs f91075iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public istkbnxepw(PaymentWebArgs webViewArgs) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(webViewArgs, "webViewArgs");
            this.f91075iobyxmoadg = webViewArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof istkbnxepw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91075iobyxmoadg, ((istkbnxepw) obj).f91075iobyxmoadg);
        }

        public int hashCode() {
            return this.f91075iobyxmoadg.hashCode();
        }

        public final PaymentWebArgs iobyxmoadg() {
            return this.f91075iobyxmoadg;
        }

        public String toString() {
            return "ShowWebViewPaymentScreen(webViewArgs=" + this.f91075iobyxmoadg + ")";
        }
    }

    public static final class iwizpuwonk extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91076iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iwizpuwonk(String errorMessage) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorMessage, "errorMessage");
            this.f91076iobyxmoadg = errorMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91076iobyxmoadg, ((iwizpuwonk) obj).f91076iobyxmoadg);
        }

        public int hashCode() {
            return this.f91076iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91076iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorMessage(errorMessage=" + this.f91076iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91077iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f91078ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f91079wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f91080zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(String merchantLogin, String apiKey, String orderNumber, String bankInvoiceId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiKey, "apiKey");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
            this.f91077iobyxmoadg = merchantLogin;
            this.f91080zoijcleaow = apiKey;
            this.f91078ppxfxbqfkf = orderNumber;
            this.f91079wkgbmnqykc = bankInvoiceId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof jyumaefscl)) {
                return false;
            }
            jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91077iobyxmoadg, jyumaefsclVar.f91077iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91080zoijcleaow, jyumaefsclVar.f91080zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91078ppxfxbqfkf, jyumaefsclVar.f91078ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91079wkgbmnqykc, jyumaefsclVar.f91079wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f91077iobyxmoadg.hashCode() * 31) + this.f91080zoijcleaow.hashCode()) * 31) + this.f91078ppxfxbqfkf.hashCode()) * 31) + this.f91079wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91080zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f91077iobyxmoadg;
        }

        public String toString() {
            return "ShowEcomSdkPaymentScreen(merchantLogin=" + this.f91077iobyxmoadg + ", apiKey=" + this.f91080zoijcleaow + ", orderNumber=" + this.f91078ppxfxbqfkf + ", bankInvoiceId=" + this.f91079wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f91078ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f91079wkgbmnqykc;
        }
    }

    public static final class kcexrzcfyt extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91081iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(Throwable error) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
            this.f91081iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91081iobyxmoadg, ((kcexrzcfyt) obj).f91081iobyxmoadg);
        }

        public int hashCode() {
            return this.f91081iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91081iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f91081iobyxmoadg + ")";
        }
    }

    public static final class lereixgezr extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91082iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lereixgezr(String orderId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f91082iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91082iobyxmoadg, ((lereixgezr) obj).f91082iobyxmoadg);
        }

        public int hashCode() {
            return this.f91082iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91082iobyxmoadg;
        }

        public String toString() {
            return "ShowOrderCanceled(orderId=" + this.f91082iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91083iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String phone) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
            this.f91083iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91083iobyxmoadg, ((lqeggnwhkg) obj).f91083iobyxmoadg);
        }

        public int hashCode() {
            return this.f91083iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91083iobyxmoadg;
        }

        public String toString() {
            return "NavigateToExternalDial(phone=" + this.f91083iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f91084iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -6048860;
        }

        public String toString() {
            return "NavigateToFeedback";
        }
    }

    public static final class ojitshcjhn extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TrackingOrderPayload f91085iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(TrackingOrderPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f91085iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91085iobyxmoadg, ((ojitshcjhn) obj).f91085iobyxmoadg);
        }

        public int hashCode() {
            return this.f91085iobyxmoadg.hashCode();
        }

        public final TrackingOrderPayload iobyxmoadg() {
            return this.f91085iobyxmoadg;
        }

        public String toString() {
            return "NavigateToTrackingOrder(args=" + this.f91085iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91086iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(String orderId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f91086iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91086iobyxmoadg, ((oxmwwwfdhm) obj).f91086iobyxmoadg);
        }

        public int hashCode() {
            return this.f91086iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91086iobyxmoadg;
        }

        public String toString() {
            return "OpenTipsOrderScreen(orderId=" + this.f91086iobyxmoadg + ")";
        }
    }

    public static final class pmvmpeiblj extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91087iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public pmvmpeiblj(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f91087iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pmvmpeiblj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91087iobyxmoadg, ((pmvmpeiblj) obj).f91087iobyxmoadg);
        }

        public int hashCode() {
            return this.f91087iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91087iobyxmoadg;
        }

        public String toString() {
            return "ShowProductLimitMessage(message=" + this.f91087iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91088iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String deliveryPhone) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
            this.f91088iobyxmoadg = deliveryPhone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91088iobyxmoadg, ((ppxfxbqfkf) obj).f91088iobyxmoadg);
        }

        public int hashCode() {
            return this.f91088iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91088iobyxmoadg;
        }

        public String toString() {
            return "InCarPickupInfo(deliveryPhone=" + this.f91088iobyxmoadg + ")";
        }
    }

    public static final class rgvfuqvkyq extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f91089ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f91090iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f91091zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f91090iobyxmoadg = hint;
            this.f91091zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91090iobyxmoadg, rgvfuqvkyqVar.f91090iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91091zoijcleaow, rgvfuqvkyqVar.f91091zoijcleaow);
        }

        public int hashCode() {
            return (this.f91090iobyxmoadg.hashCode() * 31) + this.f91091zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f91091zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f91090iobyxmoadg + ", analyticsInfo=" + this.f91091zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f91090iobyxmoadg;
        }
    }

    public static final class vdvldrhtss extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final vdvldrhtss f91092iobyxmoadg = new vdvldrhtss();

        private vdvldrhtss() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof vdvldrhtss);
        }

        public int hashCode() {
            return 1740089610;
        }

        public String toString() {
            return "OnMyWayComplete";
        }
    }

    public static final class wflxmlrfwp extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductPayload f91093iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(ProductPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f91093iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91093iobyxmoadg, ((wflxmlrfwp) obj).f91093iobyxmoadg);
        }

        public int hashCode() {
            return this.f91093iobyxmoadg.hashCode();
        }

        public final ProductPayload iobyxmoadg() {
            return this.f91093iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificProduct(args=" + this.f91093iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91094iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String deliveryPhone) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
            this.f91094iobyxmoadg = deliveryPhone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91094iobyxmoadg, ((wkgbmnqykc) obj).f91094iobyxmoadg);
        }

        public int hashCode() {
            return this.f91094iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91094iobyxmoadg;
        }

        public String toString() {
            return "InMarkerPickupInfo(deliveryPhone=" + this.f91094iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91095iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f91096zoijcleaow;

        public yggfygwlhe(int i13, int i14) {
            super(null);
            this.f91095iobyxmoadg = i13;
            this.f91096zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof yggfygwlhe)) {
                return false;
            }
            yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
            return this.f91095iobyxmoadg == yggfygwlheVar.f91095iobyxmoadg && this.f91096zoijcleaow == yggfygwlheVar.f91096zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f91095iobyxmoadg) * 31) + Integer.hashCode(this.f91096zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f91096zoijcleaow;
        }

        public String toString() {
            return "ShowDeleteAllReplacementsNotificationDialog(title=" + this.f91095iobyxmoadg + ", message=" + this.f91096zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f91095iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f91097iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 1624655433;
        }

        public String toString() {
            return "ShowAppReview";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91098iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String orderId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f91098iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91098iobyxmoadg, ((zoijcleaow) obj).f91098iobyxmoadg);
        }

        public int hashCode() {
            return this.f91098iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91098iobyxmoadg;
        }

        public String toString() {
            return "CopyOrderNumber(orderId=" + this.f91098iobyxmoadg + ")";
        }
    }

    public static final class zynmafqrjb extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f91099iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zynmafqrjb(List sbpBanks) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sbpBanks, "sbpBanks");
            this.f91099iobyxmoadg = sbpBanks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zynmafqrjb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91099iobyxmoadg, ((zynmafqrjb) obj).f91099iobyxmoadg);
        }

        public int hashCode() {
            return this.f91099iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f91099iobyxmoadg;
        }

        public String toString() {
            return "ShowSbpPaymentScreen(sbpBanks=" + this.f91099iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

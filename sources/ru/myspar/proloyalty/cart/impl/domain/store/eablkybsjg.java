package ru.myspar.proloyalty.cart.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBarDeliveryTerms;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class agtfadlqog implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CartProgressBarDeliveryTerms f92697iobyxmoadg;

        public agtfadlqog(CartProgressBarDeliveryTerms deliveryTerms) {
            zdlpuopuiu.btonecajqb(deliveryTerms, "deliveryTerms");
            this.f92697iobyxmoadg = deliveryTerms;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f92697iobyxmoadg, ((agtfadlqog) obj).f92697iobyxmoadg);
        }

        public int hashCode() {
            return this.f92697iobyxmoadg.hashCode();
        }

        public final CartProgressBarDeliveryTerms iobyxmoadg() {
            return this.f92697iobyxmoadg;
        }

        public String toString() {
            return "ShowDeliveryTermsDialog(deliveryTerms=" + this.f92697iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f92698iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return -1166354734;
        }

        public String toString() {
            return "OpenOrderCommentsScreen";
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92699iobyxmoadg;

        public draadjrbmk(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f92699iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f92699iobyxmoadg, ((draadjrbmk) obj).f92699iobyxmoadg);
        }

        public int hashCode() {
            return this.f92699iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92699iobyxmoadg;
        }

        public String toString() {
            return "OpenProduct(productId=" + this.f92699iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f92700iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -267410293;
        }

        public String toString() {
            return "OpenIntervalEdit";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2158eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2158eablkybsjg f92701iobyxmoadg = new C2158eablkybsjg();

        private C2158eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2158eablkybsjg);
        }

        public int hashCode() {
            return 1993677216;
        }

        public String toString() {
            return "OnCatalogClick";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92702iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f92703zoijcleaow;

        public gtknphoqwx(String name, String phone) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f92702iobyxmoadg = name;
            this.f92703zoijcleaow = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return zdlpuopuiu.eablkybsjg(this.f92702iobyxmoadg, gtknphoqwxVar.f92702iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92703zoijcleaow, gtknphoqwxVar.f92703zoijcleaow);
        }

        public int hashCode() {
            return (this.f92702iobyxmoadg.hashCode() * 31) + this.f92703zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92702iobyxmoadg;
        }

        public String toString() {
            return "OpenOrderReceiverScreen(name=" + this.f92702iobyxmoadg + ", phone=" + this.f92703zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f92703zoijcleaow;
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f92704ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f92705iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f92706zoijcleaow;

        public gxszxtbevo(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f92705iobyxmoadg = hint;
            this.f92706zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f92705iobyxmoadg, gxszxtbevoVar.f92705iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92706zoijcleaow, gxszxtbevoVar.f92706zoijcleaow);
        }

        public int hashCode() {
            return (this.f92705iobyxmoadg.hashCode() * 31) + this.f92706zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f92706zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f92705iobyxmoadg + ", analyticsInfo=" + this.f92706zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f92705iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92707iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -716673895;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f92708zoijcleaow = NavigationPayload.f95326zynmafqrjb;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f92709iobyxmoadg;

        public lqeggnwhkg(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f92709iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f92709iobyxmoadg, ((lqeggnwhkg) obj).f92709iobyxmoadg);
        }

        public int hashCode() {
            return this.f92709iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f92709iobyxmoadg;
        }

        public String toString() {
            return "OnLoadInfoClicked(payload=" + this.f92709iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92710iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final cl0.zoijcleaow f92711zoijcleaow;

        public nufgyqmvbu(boolean z13, cl0.zoijcleaow addressType) {
            zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f92710iobyxmoadg = z13;
            this.f92711zoijcleaow = addressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return this.f92710iobyxmoadg == nufgyqmvbuVar.f92710iobyxmoadg && this.f92711zoijcleaow == nufgyqmvbuVar.f92711zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f92710iobyxmoadg) * 31) + this.f92711zoijcleaow.hashCode();
        }

        public final cl0.zoijcleaow iobyxmoadg() {
            return this.f92711zoijcleaow;
        }

        public String toString() {
            return "OpenDeliveryInfoScreen(hasUserAnyAddress=" + this.f92710iobyxmoadg + ", addressType=" + this.f92711zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f92710iobyxmoadg;
        }
    }

    public static final class ojitshcjhn implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92712iobyxmoadg;

        public ojitshcjhn(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f92712iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f92712iobyxmoadg, ((ojitshcjhn) obj).f92712iobyxmoadg);
        }

        public int hashCode() {
            return this.f92712iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92712iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningInfoMessage(message=" + this.f92712iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f92713iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1028777790;
        }

        public String toString() {
            return "NavigateToMainTab";
        }
    }

    public static final class wflxmlrfwp implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f92714iobyxmoadg;

        public wflxmlrfwp(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f92714iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f92714iobyxmoadg, ((wflxmlrfwp) obj).f92714iobyxmoadg);
        }

        public int hashCode() {
            return this.f92714iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f92714iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f92714iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentMethodsArgs f92715iobyxmoadg;

        public wkgbmnqykc(PaymentMethodsArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f92715iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f92715iobyxmoadg, ((wkgbmnqykc) obj).f92715iobyxmoadg);
        }

        public int hashCode() {
            return this.f92715iobyxmoadg.hashCode();
        }

        public final PaymentMethodsArgs iobyxmoadg() {
            return this.f92715iobyxmoadg;
        }

        public String toString() {
            return "NavigateToPaymentScreen(args=" + this.f92715iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f92716iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1459905780;
        }

        public String toString() {
            return "ClearPromo";
        }
    }
}

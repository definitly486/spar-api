package ru.myspar.cart.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.cart.CartProgressBarDeliveryTerms;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.payment.api.model.PaymentMethodsArgs;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class agtfadlqog implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84765iobyxmoadg;

        public agtfadlqog(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f84765iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f84765iobyxmoadg, ((agtfadlqog) obj).f84765iobyxmoadg);
        }

        public int hashCode() {
            return this.f84765iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84765iobyxmoadg;
        }

        public String toString() {
            return "OpenProduct(productId=" + this.f84765iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84766iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final rm.zoijcleaow f84767zoijcleaow;

        public btonecajqb(boolean z13, rm.zoijcleaow addressType) {
            zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f84766iobyxmoadg = z13;
            this.f84767zoijcleaow = addressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return this.f84766iobyxmoadg == btonecajqbVar.f84766iobyxmoadg && this.f84767zoijcleaow == btonecajqbVar.f84767zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f84766iobyxmoadg) * 31) + this.f84767zoijcleaow.hashCode();
        }

        public final rm.zoijcleaow iobyxmoadg() {
            return this.f84767zoijcleaow;
        }

        public String toString() {
            return "OpenDeliveryInfoScreen(hasUserAnyAddress=" + this.f84766iobyxmoadg + ", addressType=" + this.f84767zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f84766iobyxmoadg;
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f84768iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -1472526609;
        }

        public String toString() {
            return "OpenOrderCommentsScreen";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f84769zoijcleaow = NavigationPayload.f87549istkbnxepw;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f84770iobyxmoadg;

        public dxjokdxxww(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f84770iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f84770iobyxmoadg, ((dxjokdxxww) obj).f84770iobyxmoadg);
        }

        public int hashCode() {
            return this.f84770iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f84770iobyxmoadg;
        }

        public String toString() {
            return "OnLoadInfoClicked(payload=" + this.f84770iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1919eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentMethodsArgs f84771iobyxmoadg;

        public C1919eablkybsjg(PaymentMethodsArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f84771iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1919eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f84771iobyxmoadg, ((C1919eablkybsjg) obj).f84771iobyxmoadg);
        }

        public int hashCode() {
            return this.f84771iobyxmoadg.hashCode();
        }

        public final PaymentMethodsArgs iobyxmoadg() {
            return this.f84771iobyxmoadg;
        }

        public String toString() {
            return "NavigateToPaymentScreen(args=" + this.f84771iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f84772iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return -675894514;
        }

        public String toString() {
            return "OpenIntervalEdit";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f84773iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1831947760;
        }

        public String toString() {
            return "NavigateToRegisterScreen";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84774iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1350229916;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f84775iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1769872157;
        }

        public String toString() {
            return "OnCatalogClick";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f84776ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f84777iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f84778zoijcleaow;

        public nufgyqmvbu(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f84777iobyxmoadg = hint;
            this.f84778zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f84777iobyxmoadg, nufgyqmvbuVar.f84777iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f84778zoijcleaow, nufgyqmvbuVar.f84778zoijcleaow);
        }

        public int hashCode() {
            return (this.f84777iobyxmoadg.hashCode() * 31) + this.f84778zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f84778zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f84777iobyxmoadg + ", analyticsInfo=" + this.f84778zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f84777iobyxmoadg;
        }
    }

    public static final class ojitshcjhn implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f84779iobyxmoadg;

        public ojitshcjhn(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f84779iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f84779iobyxmoadg, ((ojitshcjhn) obj).f84779iobyxmoadg);
        }

        public int hashCode() {
            return this.f84779iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f84779iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f84779iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84780iobyxmoadg;

        public oxmwwwfdhm(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f84780iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && zdlpuopuiu.eablkybsjg(this.f84780iobyxmoadg, ((oxmwwwfdhm) obj).f84780iobyxmoadg);
        }

        public int hashCode() {
            return this.f84780iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84780iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningInfoMessage(message=" + this.f84780iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f84781iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -542683578;
        }

        public String toString() {
            return "NavigateToLoginBySmsScreen";
        }
    }

    public static final class rgvfuqvkyq implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CartProgressBarDeliveryTerms f84782iobyxmoadg;

        public rgvfuqvkyq(CartProgressBarDeliveryTerms deliveryTerms) {
            zdlpuopuiu.btonecajqb(deliveryTerms, "deliveryTerms");
            this.f84782iobyxmoadg = deliveryTerms;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && zdlpuopuiu.eablkybsjg(this.f84782iobyxmoadg, ((rgvfuqvkyq) obj).f84782iobyxmoadg);
        }

        public int hashCode() {
            return this.f84782iobyxmoadg.hashCode();
        }

        public final CartProgressBarDeliveryTerms iobyxmoadg() {
            return this.f84782iobyxmoadg;
        }

        public String toString() {
            return "ShowDeliveryTermsDialog(deliveryTerms=" + this.f84782iobyxmoadg + ")";
        }
    }

    public static final class vdvldrhtss implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84783iobyxmoadg;

        public vdvldrhtss(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f84783iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && zdlpuopuiu.eablkybsjg(this.f84783iobyxmoadg, ((vdvldrhtss) obj).f84783iobyxmoadg);
        }

        public int hashCode() {
            return this.f84783iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84783iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f84783iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84784iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f84785zoijcleaow;

        public wflxmlrfwp(String name, String phone) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f84784iobyxmoadg = name;
            this.f84785zoijcleaow = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return zdlpuopuiu.eablkybsjg(this.f84784iobyxmoadg, wflxmlrfwpVar.f84784iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f84785zoijcleaow, wflxmlrfwpVar.f84785zoijcleaow);
        }

        public int hashCode() {
            return (this.f84784iobyxmoadg.hashCode() * 31) + this.f84785zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84784iobyxmoadg;
        }

        public String toString() {
            return "OpenOrderReceiverScreen(name=" + this.f84784iobyxmoadg + ", phone=" + this.f84785zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f84785zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f84786iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1250668827;
        }

        public String toString() {
            return "NavigateToMainTab";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f84787iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 805783991;
        }

        public String toString() {
            return "ClearPromo";
        }
    }
}

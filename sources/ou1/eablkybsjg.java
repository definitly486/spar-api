package ou1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: ou1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1624eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f74740iobyxmoadg;

        public C1624eablkybsjg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f74740iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1624eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f74740iobyxmoadg, ((C1624eablkybsjg) obj).f74740iobyxmoadg);
        }

        public int hashCode() {
            return this.f74740iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f74740iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f74740iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74741iobyxmoadg;

        public gxszxtbevo(String surveyUrl) {
            zdlpuopuiu.btonecajqb(surveyUrl, "surveyUrl");
            this.f74741iobyxmoadg = surveyUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f74741iobyxmoadg, ((gxszxtbevo) obj).f74741iobyxmoadg);
        }

        public int hashCode() {
            return this.f74741iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f74741iobyxmoadg;
        }

        public String toString() {
            return "ShowSubscriptionSurvey(surveyUrl=" + this.f74741iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f74742iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 805540131;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74743iobyxmoadg;

        public ppxfxbqfkf(String fileUrl) {
            zdlpuopuiu.btonecajqb(fileUrl, "fileUrl");
            this.f74743iobyxmoadg = fileUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f74743iobyxmoadg, ((ppxfxbqfkf) obj).f74743iobyxmoadg);
        }

        public int hashCode() {
            return this.f74743iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f74743iobyxmoadg;
        }

        public String toString() {
            return "NavigateToFileReader(fileUrl=" + this.f74743iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentMethodsArgs f74744iobyxmoadg;

        public wkgbmnqykc(PaymentMethodsArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f74744iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f74744iobyxmoadg, ((wkgbmnqykc) obj).f74744iobyxmoadg);
        }

        public int hashCode() {
            return this.f74744iobyxmoadg.hashCode();
        }

        public final PaymentMethodsArgs iobyxmoadg() {
            return this.f74744iobyxmoadg;
        }

        public String toString() {
            return "NavigateToPaymentMethodsScreen(args=" + this.f74744iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f74745iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1341945525;
        }

        public String toString() {
            return "NavigateToAuthScreen";
        }
    }
}

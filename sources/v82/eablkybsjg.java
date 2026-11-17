package v82;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.payment.api.model.PaymentMethodsArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: v82.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2896eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f116340iobyxmoadg;

        public C2896eablkybsjg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f116340iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2896eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f116340iobyxmoadg, ((C2896eablkybsjg) obj).f116340iobyxmoadg);
        }

        public int hashCode() {
            return this.f116340iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f116340iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f116340iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f116341iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 332627392;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f116342iobyxmoadg;

        public ppxfxbqfkf(String fileUrl) {
            zdlpuopuiu.btonecajqb(fileUrl, "fileUrl");
            this.f116342iobyxmoadg = fileUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f116342iobyxmoadg, ((ppxfxbqfkf) obj).f116342iobyxmoadg);
        }

        public int hashCode() {
            return this.f116342iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f116342iobyxmoadg;
        }

        public String toString() {
            return "NavigateToFileReader(fileUrl=" + this.f116342iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentMethodsArgs f116343iobyxmoadg;

        public wkgbmnqykc(PaymentMethodsArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f116343iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f116343iobyxmoadg, ((wkgbmnqykc) obj).f116343iobyxmoadg);
        }

        public int hashCode() {
            return this.f116343iobyxmoadg.hashCode();
        }

        public final PaymentMethodsArgs iobyxmoadg() {
            return this.f116343iobyxmoadg;
        }

        public String toString() {
            return "NavigateToPaymentMethodsScreen(args=" + this.f116343iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f116344iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1495238888;
        }

        public String toString() {
            return "NavigateToAuthScreen";
        }
    }
}

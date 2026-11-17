package tj0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.components.payment.api.models.PaymentModel;

/* JADX INFO: loaded from: classes3.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f110734iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 680884934;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: tj0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2728ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2728ppxfxbqfkf f110735iobyxmoadg = new C2728ppxfxbqfkf();

        private C2728ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2728ppxfxbqfkf);
        }

        public int hashCode() {
            return 313477145;
        }

        public String toString() {
            return "OnPayClicked";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentModel f110736iobyxmoadg;

        public wkgbmnqykc(PaymentModel value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f110736iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f110736iobyxmoadg, ((wkgbmnqykc) obj).f110736iobyxmoadg);
        }

        public int hashCode() {
            return this.f110736iobyxmoadg.hashCode();
        }

        public final PaymentModel iobyxmoadg() {
            return this.f110736iobyxmoadg;
        }

        public String toString() {
            return "OnSelectMethod(value=" + this.f110736iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f110737iobyxmoadg;

        public zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f110737iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f110737iobyxmoadg, ((zoijcleaow) obj).f110737iobyxmoadg);
        }

        public int hashCode() {
            return this.f110737iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f110737iobyxmoadg;
        }

        public String toString() {
            return "OnChangeNominal(value=" + this.f110737iobyxmoadg + ")";
        }
    }
}

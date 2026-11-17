package ug1;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.components.payment.api.models.PaymentModel;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f113552iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1153797673;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ug1.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2815ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2815ppxfxbqfkf f113553iobyxmoadg = new C2815ppxfxbqfkf();

        private C2815ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2815ppxfxbqfkf);
        }

        public int hashCode() {
            return -364004266;
        }

        public String toString() {
            return "OnPayClicked";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentModel f113554iobyxmoadg;

        public wkgbmnqykc(PaymentModel value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f113554iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f113554iobyxmoadg, ((wkgbmnqykc) obj).f113554iobyxmoadg);
        }

        public int hashCode() {
            return this.f113554iobyxmoadg.hashCode();
        }

        public final PaymentModel iobyxmoadg() {
            return this.f113554iobyxmoadg;
        }

        public String toString() {
            return "OnSelectMethod(value=" + this.f113554iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f113555iobyxmoadg;

        public zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f113555iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f113555iobyxmoadg, ((zoijcleaow) obj).f113555iobyxmoadg);
        }

        public int hashCode() {
            return this.f113555iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f113555iobyxmoadg;
        }

        public String toString() {
            return "OnChangeNominal(value=" + this.f113555iobyxmoadg + ")";
        }
    }
}

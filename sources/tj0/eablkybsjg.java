package tj0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.components.payment.api.models.PaymentModel;

/* JADX INFO: loaded from: classes3.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f110724iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f110724iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f110724iobyxmoadg == ((iobyxmoadg) obj).f110724iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f110724iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f110724iobyxmoadg;
        }

        public String toString() {
            return "ChangeIsLoading(value=" + this.f110724iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentModel f110725iobyxmoadg;

        public ppxfxbqfkf(PaymentModel value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f110725iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f110725iobyxmoadg, ((ppxfxbqfkf) obj).f110725iobyxmoadg);
        }

        public int hashCode() {
            return this.f110725iobyxmoadg.hashCode();
        }

        public final PaymentModel iobyxmoadg() {
            return this.f110725iobyxmoadg;
        }

        public String toString() {
            return "SelectMethod(value=" + this.f110725iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f110726iobyxmoadg;

        public zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f110726iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f110726iobyxmoadg, ((zoijcleaow) obj).f110726iobyxmoadg);
        }

        public int hashCode() {
            return this.f110726iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f110726iobyxmoadg;
        }

        public String toString() {
            return "ChangeNominal(value=" + this.f110726iobyxmoadg + ")";
        }
    }
}

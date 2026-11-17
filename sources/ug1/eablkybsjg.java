package ug1;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.components.payment.api.models.PaymentModel;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f113542iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f113542iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f113542iobyxmoadg == ((iobyxmoadg) obj).f113542iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f113542iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f113542iobyxmoadg;
        }

        public String toString() {
            return "ChangeIsLoading(value=" + this.f113542iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentModel f113543iobyxmoadg;

        public ppxfxbqfkf(PaymentModel value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f113543iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f113543iobyxmoadg, ((ppxfxbqfkf) obj).f113543iobyxmoadg);
        }

        public int hashCode() {
            return this.f113543iobyxmoadg.hashCode();
        }

        public final PaymentModel iobyxmoadg() {
            return this.f113543iobyxmoadg;
        }

        public String toString() {
            return "SelectMethod(value=" + this.f113543iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f113544iobyxmoadg;

        public zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f113544iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f113544iobyxmoadg, ((zoijcleaow) obj).f113544iobyxmoadg);
        }

        public int hashCode() {
            return this.f113544iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f113544iobyxmoadg;
        }

        public String toString() {
            return "ChangeNominal(value=" + this.f113544iobyxmoadg + ")";
        }
    }
}

package en0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f31607iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f31607iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f31607iobyxmoadg == ((iobyxmoadg) obj).f31607iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f31607iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f31607iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f31607iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f31608iobyxmoadg;

        public zoijcleaow(tzroggbefp phoneNumber) {
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f31608iobyxmoadg = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f31608iobyxmoadg, ((zoijcleaow) obj).f31608iobyxmoadg);
        }

        public int hashCode() {
            return this.f31608iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f31608iobyxmoadg;
        }

        public String toString() {
            return "PhoneNumberChanged(phoneNumber=" + this.f31608iobyxmoadg + ")";
        }
    }
}

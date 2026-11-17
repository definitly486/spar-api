package en0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f31620iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1542166125;
        }

        public String toString() {
            return "OnCloseClick";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f31621iobyxmoadg;

        public ppxfxbqfkf(tzroggbefp phoneNumber) {
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f31621iobyxmoadg = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f31621iobyxmoadg, ((ppxfxbqfkf) obj).f31621iobyxmoadg);
        }

        public int hashCode() {
            return this.f31621iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f31621iobyxmoadg;
        }

        public String toString() {
            return "OnPhoneNumberChanged(phoneNumber=" + this.f31621iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f31622iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 827034398;
        }

        public String toString() {
            return "OnContinueClick";
        }
    }
}

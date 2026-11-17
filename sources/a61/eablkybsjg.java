package a61;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f918iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -776302357;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f919iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f919iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f919iobyxmoadg, ((ppxfxbqfkf) obj).f919iobyxmoadg);
        }

        public int hashCode() {
            return this.f919iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f919iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f919iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f920iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -945919945;
        }

        public String toString() {
            return "ShowQrCodeDialog";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f921iobyxmoadg;

        public zoijcleaow(CharSequence promoCode) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f921iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f921iobyxmoadg, ((zoijcleaow) obj).f921iobyxmoadg);
        }

        public int hashCode() {
            return this.f921iobyxmoadg.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f921iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCodeClicked(promoCode=" + ((Object) this.f921iobyxmoadg) + ")";
        }
    }
}

package yk0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: yk0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C3198eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125540iobyxmoadg;

        public C3198eablkybsjg(String cardNumber) {
            zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
            this.f125540iobyxmoadg = cardNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3198eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f125540iobyxmoadg, ((C3198eablkybsjg) obj).f125540iobyxmoadg);
        }

        public int hashCode() {
            return this.f125540iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125540iobyxmoadg;
        }

        public String toString() {
            return "Success(cardNumber=" + this.f125540iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f125541iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 145619710;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f125542iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1953867064;
        }

        public String toString() {
            return "NavigateToSupportScreen";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f125543iobyxmoadg;

        public wkgbmnqykc(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f125543iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f125543iobyxmoadg, ((wkgbmnqykc) obj).f125543iobyxmoadg);
        }

        public int hashCode() {
            return this.f125543iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f125543iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackbar(throwable=" + this.f125543iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f125544iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1432571468;
        }

        public String toString() {
            return "NavigateToScanScreen";
        }
    }
}

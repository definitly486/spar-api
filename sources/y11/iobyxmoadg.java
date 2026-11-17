package y11;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    public static final class eablkybsjg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f123514iobyxmoadg;

        public eablkybsjg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f123514iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f123514iobyxmoadg, ((eablkybsjg) obj).f123514iobyxmoadg);
        }

        public int hashCode() {
            return this.f123514iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f123514iobyxmoadg;
        }

        public String toString() {
            return "ShowTechnicalWorkScreen(message=" + this.f123514iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: y11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3121iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C3121iobyxmoadg f123515iobyxmoadg = new C3121iobyxmoadg();

        private C3121iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C3121iobyxmoadg);
        }

        public int hashCode() {
            return 1096029537;
        }

        public String toString() {
            return "ChangeBitrixVersion";
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f123516iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1536949046;
        }

        public String toString() {
            return "NonAuthNavigation";
        }
    }

    public static final class wkgbmnqykc implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lr0.eablkybsjg f123517iobyxmoadg;

        public wkgbmnqykc(lr0.eablkybsjg snackbar) {
            zdlpuopuiu.btonecajqb(snackbar, "snackbar");
            this.f123517iobyxmoadg = snackbar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f123517iobyxmoadg, ((wkgbmnqykc) obj).f123517iobyxmoadg);
        }

        public int hashCode() {
            return this.f123517iobyxmoadg.hashCode();
        }

        public final lr0.eablkybsjg iobyxmoadg() {
            return this.f123517iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbar(snackbar=" + this.f123517iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f123518iobyxmoadg;

        public zoijcleaow(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f123518iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f123518iobyxmoadg, ((zoijcleaow) obj).f123518iobyxmoadg);
        }

        public int hashCode() {
            return this.f123518iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f123518iobyxmoadg;
        }

        public String toString() {
            return "LogError(throwable=" + this.f123518iobyxmoadg + ")";
        }
    }
}

package c80;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f19179iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -967283856;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19180iobyxmoadg;

        public ppxfxbqfkf(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f19180iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f19180iobyxmoadg, ((ppxfxbqfkf) obj).f19180iobyxmoadg);
        }

        public int hashCode() {
            return this.f19180iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f19180iobyxmoadg;
        }

        public String toString() {
            return "ShowDeleteDialog(cardId=" + this.f19180iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f19181iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -737623054;
        }

        public String toString() {
            return "ShowDeleteSuccess";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f19182iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f19182iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f19182iobyxmoadg, ((zoijcleaow) obj).f19182iobyxmoadg);
        }

        public int hashCode() {
            return this.f19182iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f19182iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f19182iobyxmoadg + ")";
        }
    }
}

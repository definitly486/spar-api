package n61;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f69179iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 543794387;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f69180iobyxmoadg;

        public ppxfxbqfkf(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f69180iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f69180iobyxmoadg, ((ppxfxbqfkf) obj).f69180iobyxmoadg);
        }

        public int hashCode() {
            return this.f69180iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f69180iobyxmoadg;
        }

        public String toString() {
            return "ShowDeleteDialog(cardId=" + this.f69180iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f69181iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -666819729;
        }

        public String toString() {
            return "ShowDeleteSuccess";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f69182iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f69182iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f69182iobyxmoadg, ((zoijcleaow) obj).f69182iobyxmoadg);
        }

        public int hashCode() {
            return this.f69182iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f69182iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f69182iobyxmoadg + ")";
        }
    }
}

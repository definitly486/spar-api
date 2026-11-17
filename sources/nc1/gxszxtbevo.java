package nc1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f69665iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1734255742;
        }

        public String toString() {
            return "ConfirmSelectedCategoriesSuccess";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lu0.iobyxmoadg f69666iobyxmoadg;

        public iobyxmoadg(lu0.iobyxmoadg detail) {
            zdlpuopuiu.btonecajqb(detail, "detail");
            this.f69666iobyxmoadg = detail;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69666iobyxmoadg, ((iobyxmoadg) obj).f69666iobyxmoadg);
        }

        public int hashCode() {
            return this.f69666iobyxmoadg.hashCode();
        }

        public final lu0.iobyxmoadg iobyxmoadg() {
            return this.f69666iobyxmoadg;
        }

        public String toString() {
            return "ChangeCategoriesDetail(detail=" + this.f69666iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f69667iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f69667iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f69667iobyxmoadg == ((ppxfxbqfkf) obj).f69667iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f69667iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f69667iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoadingState(isLoading=" + this.f69667iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f69668iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f69668iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f69668iobyxmoadg == ((wkgbmnqykc) obj).f69668iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f69668iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f69668iobyxmoadg;
        }

        public String toString() {
            return "ChangeUserConfirmState(state=" + this.f69668iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f69669iobyxmoadg;

        public zoijcleaow(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f69669iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f69669iobyxmoadg, ((zoijcleaow) obj).f69669iobyxmoadg);
        }

        public int hashCode() {
            return this.f69669iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f69669iobyxmoadg;
        }

        public String toString() {
            return "ChangeCategorySelectedState(categoryId=" + this.f69669iobyxmoadg + ")";
        }
    }
}

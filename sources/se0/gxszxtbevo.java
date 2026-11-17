package se0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f106053iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1052213121;
        }

        public String toString() {
            return "ConfirmSelectedCategoriesSuccess";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rv.iobyxmoadg f106054iobyxmoadg;

        public iobyxmoadg(rv.iobyxmoadg detail) {
            zdlpuopuiu.btonecajqb(detail, "detail");
            this.f106054iobyxmoadg = detail;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f106054iobyxmoadg, ((iobyxmoadg) obj).f106054iobyxmoadg);
        }

        public int hashCode() {
            return this.f106054iobyxmoadg.hashCode();
        }

        public final rv.iobyxmoadg iobyxmoadg() {
            return this.f106054iobyxmoadg;
        }

        public String toString() {
            return "ChangeCategoriesDetail(detail=" + this.f106054iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f106055iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f106055iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f106055iobyxmoadg == ((ppxfxbqfkf) obj).f106055iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f106055iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f106055iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoadingState(isLoading=" + this.f106055iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f106056iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f106056iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f106056iobyxmoadg == ((wkgbmnqykc) obj).f106056iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f106056iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f106056iobyxmoadg;
        }

        public String toString() {
            return "ChangeUserConfirmState(state=" + this.f106056iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f106057iobyxmoadg;

        public zoijcleaow(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f106057iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f106057iobyxmoadg, ((zoijcleaow) obj).f106057iobyxmoadg);
        }

        public int hashCode() {
            return this.f106057iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f106057iobyxmoadg;
        }

        public String toString() {
            return "ChangeCategorySelectedState(categoryId=" + this.f106057iobyxmoadg + ")";
        }
    }
}

package nc1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f69692iobyxmoadg;

        public iobyxmoadg(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f69692iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69692iobyxmoadg, ((iobyxmoadg) obj).f69692iobyxmoadg);
        }

        public int hashCode() {
            return this.f69692iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f69692iobyxmoadg;
        }

        public String toString() {
            return "ChangeCategorySelectedState(categoryId=" + this.f69692iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f69693iobyxmoadg;

        public ppxfxbqfkf(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f69693iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f69693iobyxmoadg, ((ppxfxbqfkf) obj).f69693iobyxmoadg);
        }

        public int hashCode() {
            return this.f69693iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f69693iobyxmoadg;
        }

        public String toString() {
            return "GetCategoryInfo(categoryId=" + this.f69693iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: nc1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1499wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1499wkgbmnqykc f69694iobyxmoadg = new C1499wkgbmnqykc();

        private C1499wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1499wkgbmnqykc);
        }

        public int hashCode() {
            return 2047886667;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f69695iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -128476796;
        }

        public String toString() {
            return "ConfirmSelectedCategories";
        }
    }
}

package se0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f106072iobyxmoadg;

        public iobyxmoadg(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f106072iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f106072iobyxmoadg, ((iobyxmoadg) obj).f106072iobyxmoadg);
        }

        public int hashCode() {
            return this.f106072iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f106072iobyxmoadg;
        }

        public String toString() {
            return "ChangeCategorySelectedState(categoryId=" + this.f106072iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f106073iobyxmoadg;

        public ppxfxbqfkf(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f106073iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f106073iobyxmoadg, ((ppxfxbqfkf) obj).f106073iobyxmoadg);
        }

        public int hashCode() {
            return this.f106073iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f106073iobyxmoadg;
        }

        public String toString() {
            return "GetCategoryInfo(categoryId=" + this.f106073iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: se0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2600wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2600wkgbmnqykc f106074iobyxmoadg = new C2600wkgbmnqykc();

        private C2600wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2600wkgbmnqykc);
        }

        public int hashCode() {
            return 2038726606;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f106075iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1987064863;
        }

        public String toString() {
            return "ConfirmSelectedCategories";
        }
    }
}

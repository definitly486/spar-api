package ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface lqeggnwhkg {

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f97705iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -892099037;
        }

        public String toString() {
            return "OnBtnAcceptClicked";
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97706iobyxmoadg;

        public ppxfxbqfkf(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f97706iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f97706iobyxmoadg, ((ppxfxbqfkf) obj).f97706iobyxmoadg);
        }

        public int hashCode() {
            return this.f97706iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97706iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryClicked(categoryId=" + this.f97706iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97707iobyxmoadg;

        public wkgbmnqykc(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f97707iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f97707iobyxmoadg, ((wkgbmnqykc) obj).f97707iobyxmoadg);
        }

        public int hashCode() {
            return this.f97707iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97707iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryInfoClicked(categoryId=" + this.f97707iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f97708iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1967045020;
        }

        public String toString() {
            return "OnBtnBackClicked";
        }
    }
}

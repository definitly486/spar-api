package ru.myspar.loyalty_program.impl.presentation.categories_detail;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface lqeggnwhkg {

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f90095iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 181328102;
        }

        public String toString() {
            return "OnBtnAcceptClicked";
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90096iobyxmoadg;

        public ppxfxbqfkf(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f90096iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f90096iobyxmoadg, ((ppxfxbqfkf) obj).f90096iobyxmoadg);
        }

        public int hashCode() {
            return this.f90096iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f90096iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryClicked(categoryId=" + this.f90096iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90097iobyxmoadg;

        public wkgbmnqykc(String categoryId) {
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f90097iobyxmoadg = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f90097iobyxmoadg, ((wkgbmnqykc) obj).f90097iobyxmoadg);
        }

        public int hashCode() {
            return this.f90097iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f90097iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryInfoClicked(categoryId=" + this.f90097iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f90098iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 912281063;
        }

        public String toString() {
            return "OnBtnBackClicked";
        }
    }
}

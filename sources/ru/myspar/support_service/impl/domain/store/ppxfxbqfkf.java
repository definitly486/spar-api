package ru.myspar.support_service.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104472iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 766424271;
        }

        public String toString() {
            return "LoadContent";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.support_service.impl.domain.store.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2526ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2526ppxfxbqfkf f104473iobyxmoadg = new C2526ppxfxbqfkf();

        private C2526ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2526ppxfxbqfkf);
        }

        public int hashCode() {
            return 1000626698;
        }

        public String toString() {
            return "ProcessDefaultCallAction";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f104474iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1487029374;
        }

        public String toString() {
            return "RefreshContent";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104475iobyxmoadg;

        public zoijcleaow(String actionName) {
            zdlpuopuiu.btonecajqb(actionName, "actionName");
            this.f104475iobyxmoadg = actionName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104475iobyxmoadg, ((zoijcleaow) obj).f104475iobyxmoadg);
        }

        public int hashCode() {
            return this.f104475iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104475iobyxmoadg;
        }

        public String toString() {
            return "ProcessAction(actionName=" + this.f104475iobyxmoadg + ")";
        }
    }
}

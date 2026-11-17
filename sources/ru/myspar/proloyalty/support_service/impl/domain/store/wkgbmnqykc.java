package ru.myspar.proloyalty.support_service.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f101838iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1333639950;
        }

        public String toString() {
            return "LoadContent";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f101839iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -898803001;
        }

        public String toString() {
            return "ProcessDefaultCallAction";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.support_service.impl.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2448wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2448wkgbmnqykc f101840iobyxmoadg = new C2448wkgbmnqykc();

        private C2448wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2448wkgbmnqykc);
        }

        public int hashCode() {
            return 288363647;
        }

        public String toString() {
            return "RefreshContent";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101841iobyxmoadg;

        public zoijcleaow(String actionName) {
            zdlpuopuiu.btonecajqb(actionName, "actionName");
            this.f101841iobyxmoadg = actionName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f101841iobyxmoadg, ((zoijcleaow) obj).f101841iobyxmoadg);
        }

        public int hashCode() {
            return this.f101841iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101841iobyxmoadg;
        }

        public String toString() {
            return "ProcessAction(actionName=" + this.f101841iobyxmoadg + ")";
        }
    }
}

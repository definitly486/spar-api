package ru.myspar.support_service.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104505iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1367179529;
        }

        public String toString() {
            return "ContentShow";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f104506iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 2027572615;
        }

        public String toString() {
            return "OnDefaultCallClick";
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f104507iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -997955733;
        }

        public String toString() {
            return "OnRefreshClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.support_service.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2529zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104508iobyxmoadg;

        public C2529zoijcleaow(String name) {
            zdlpuopuiu.btonecajqb(name, "name");
            this.f104508iobyxmoadg = name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2529zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104508iobyxmoadg, ((C2529zoijcleaow) obj).f104508iobyxmoadg);
        }

        public int hashCode() {
            return this.f104508iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104508iobyxmoadg;
        }

        public String toString() {
            return "OnActionClick(name=" + this.f104508iobyxmoadg + ")";
        }
    }
}

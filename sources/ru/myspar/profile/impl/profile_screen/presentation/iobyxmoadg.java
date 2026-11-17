package ru.myspar.profile.impl.profile_screen.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface iobyxmoadg {

    public static final class eablkybsjg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final uk0.zoijcleaow f91735iobyxmoadg;

        public eablkybsjg(uk0.zoijcleaow item) {
            zdlpuopuiu.btonecajqb(item, "item");
            this.f91735iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f91735iobyxmoadg, ((eablkybsjg) obj).f91735iobyxmoadg);
        }

        public int hashCode() {
            return this.f91735iobyxmoadg.hashCode();
        }

        public final uk0.zoijcleaow iobyxmoadg() {
            return this.f91735iobyxmoadg;
        }

        public String toString() {
            return "OnProfileMenuItemClick(item=" + this.f91735iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f91736iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1062948118;
        }

        public String toString() {
            return "OnRegisterClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.profile.impl.profile_screen.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2130iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2130iobyxmoadg f91737iobyxmoadg = new C2130iobyxmoadg();

        private C2130iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2130iobyxmoadg);
        }

        public int hashCode() {
            return -987885146;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class lqeggnwhkg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f91738iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -481871961;
        }

        public String toString() {
            return "OnStart";
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f91739iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1945424291;
        }

        public String toString() {
            return "OnLogoutClick";
        }
    }

    public static final class wkgbmnqykc implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f91740iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1203439269;
        }

        public String toString() {
            return "OnOptionsClick";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f91741iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 35188602;
        }

        public String toString() {
            return "OnLoginClick";
        }
    }
}

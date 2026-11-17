package ru.myspar.proloyalty.legacy.presentation.screen.editorder;

import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes5.dex */
public interface cqumvgiudr {

    public static final class btonecajqb implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocalDateTime f96770iobyxmoadg;

        public btonecajqb(LocalDateTime localTime) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(localTime, "localTime");
            this.f96770iobyxmoadg = localTime;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f96770iobyxmoadg, ((btonecajqb) obj).f96770iobyxmoadg);
        }

        public int hashCode() {
            return this.f96770iobyxmoadg.hashCode();
        }

        public final LocalDateTime iobyxmoadg() {
            return this.f96770iobyxmoadg;
        }

        public String toString() {
            return "StartNotification(localTime=" + this.f96770iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96771iobyxmoadg;

        public dxjokdxxww(String message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f96771iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f96771iobyxmoadg, ((dxjokdxxww) obj).f96771iobyxmoadg);
        }

        public int hashCode() {
            return this.f96771iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96771iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningSnackBar(message=" + this.f96771iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f96772iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -703108433;
        }

        public String toString() {
            return "ShowLimitTimeDialog";
        }
    }

    public static final class gxszxtbevo implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f96773iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1956779267;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class iobyxmoadg implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96774iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -820872510;
        }

        public String toString() {
            return "FinishNotification";
        }
    }

    public static final class lqeggnwhkg implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f96775iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 1292443073;
        }

        public String toString() {
            return "ShowSavedMessage";
        }
    }

    public static final class nufgyqmvbu implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f96776iobyxmoadg;

        public nufgyqmvbu(int i13) {
            this.f96776iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f96776iobyxmoadg == ((nufgyqmvbu) obj).f96776iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f96776iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f96776iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningResSnackBar(messageRes=" + this.f96776iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f96777iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 904732885;
        }

        public String toString() {
            return "ShowDeleteLastProductDialog";
        }
    }

    public static final class wkgbmnqykc implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f96778iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -588547449;
        }

        public String toString() {
            return "ShowExitDialog";
        }
    }

    public static final class zoijcleaow implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f96779iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1653478445;
        }

        public String toString() {
            return "RequestFocus";
        }
    }
}

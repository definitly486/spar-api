package ru.myspar.legacy.presentation.screen.editorder;

import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes4.dex */
public interface cqumvgiudr {

    public static final class btonecajqb implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocalDateTime f88986iobyxmoadg;

        public btonecajqb(LocalDateTime localTime) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(localTime, "localTime");
            this.f88986iobyxmoadg = localTime;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f88986iobyxmoadg, ((btonecajqb) obj).f88986iobyxmoadg);
        }

        public int hashCode() {
            return this.f88986iobyxmoadg.hashCode();
        }

        public final LocalDateTime iobyxmoadg() {
            return this.f88986iobyxmoadg;
        }

        public String toString() {
            return "StartNotification(localTime=" + this.f88986iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88987iobyxmoadg;

        public dxjokdxxww(String message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f88987iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f88987iobyxmoadg, ((dxjokdxxww) obj).f88987iobyxmoadg);
        }

        public int hashCode() {
            return this.f88987iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88987iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningSnackBar(message=" + this.f88987iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f88988iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1085653196;
        }

        public String toString() {
            return "ShowLimitTimeDialog";
        }
    }

    public static final class gxszxtbevo implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f88989iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1743895238;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class iobyxmoadg implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f88990iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1871549179;
        }

        public String toString() {
            return "FinishNotification";
        }
    }

    public static final class lqeggnwhkg implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f88991iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -482949948;
        }

        public String toString() {
            return "ShowSavedMessage";
        }
    }

    public static final class nufgyqmvbu implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f88992iobyxmoadg;

        public nufgyqmvbu(int i13) {
            this.f88992iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f88992iobyxmoadg == ((nufgyqmvbu) obj).f88992iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f88992iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f88992iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningResSnackBar(messageRes=" + this.f88992iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f88993iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -342488590;
        }

        public String toString() {
            return "ShowDeleteLastProductDialog";
        }
    }

    public static final class wkgbmnqykc implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f88994iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 88933962;
        }

        public String toString() {
            return "ShowExitDialog";
        }
    }

    public static final class zoijcleaow implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f88995iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1582675120;
        }

        public String toString() {
            return "RequestFocus";
        }
    }
}

package ru.myspar.proloyalty.payment.impl.web.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f99231iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -2040390317;
        }

        public String toString() {
            return "OnPaymentSuccess";
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99232iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f99232iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f99232iobyxmoadg, ((gxszxtbevo) obj).f99232iobyxmoadg);
        }

        public int hashCode() {
            return this.f99232iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99232iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f99232iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99233iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -999510331;
        }

        public String toString() {
            return "OnBackPressed";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f99234iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -114141235;
        }

        public String toString() {
            return "OnHomePressed";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f99235iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1813276458;
        }

        public String toString() {
            return "OnPaymentCancel";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.payment.impl.web.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2373zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2373zoijcleaow f99236iobyxmoadg = new C2373zoijcleaow();

        private C2373zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2373zoijcleaow);
        }

        public int hashCode() {
            return -1740154256;
        }

        public String toString() {
            return "OnCloseConfirmExitPopup";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}

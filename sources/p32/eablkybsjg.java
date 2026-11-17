package p32;

import java.util.Arrays;
import ru.myspar.purchases.api.model.PurchasesHistoryArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class agtfadlqog extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75522iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f75522iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75522iobyxmoadg, ((agtfadlqog) obj).f75522iobyxmoadg);
        }

        public int hashCode() {
            return this.f75522iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75522iobyxmoadg;
        }

        public String toString() {
            return "ShowPopupMessage(message=" + this.f75522iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f75523iobyxmoadg = new btonecajqb();

        private btonecajqb() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 1155380897;
        }

        public String toString() {
            return "ShowCameraPermissionDeniedMessage";
        }
    }

    public static final class draadjrbmk extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f75524iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return 975786072;
        }

        public String toString() {
            return "ShowEnableWifiMessage";
        }
    }

    public static final class dxjokdxxww extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f75525iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1373133526;
        }

        public String toString() {
            return "ShowCameraNotFoundErrorMessage";
        }
    }

    /* JADX INFO: renamed from: p32.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1662eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String[] f75526iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1662eablkybsjg(String[] permissions) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissions, "permissions");
            this.f75526iobyxmoadg = permissions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1662eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75526iobyxmoadg, ((C1662eablkybsjg) obj).f75526iobyxmoadg);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f75526iobyxmoadg);
        }

        public final String[] iobyxmoadg() {
            return this.f75526iobyxmoadg;
        }

        public String toString() {
            return "RequestPermissions(permissions=" + Arrays.toString(this.f75526iobyxmoadg) + ")";
        }
    }

    public static final class gtknphoqwx extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75527iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f75527iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75527iobyxmoadg, ((gtknphoqwx) obj).f75527iobyxmoadg);
        }

        public int hashCode() {
            return this.f75527iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75527iobyxmoadg;
        }

        public String toString() {
            return "ShowCheckCityDialog(message=" + this.f75527iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f75528iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1930630638;
        }

        public String toString() {
            return "ResumeScanSession";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f75529iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1587649535;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class kcexrzcfyt extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f75530iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return -1896439335;
        }

        public String toString() {
            return "ToWifiSettingsScreen";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75531iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final o32.iobyxmoadg f75532zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String address, o32.iobyxmoadg scanGoFindShopType) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(address, "address");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoFindShopType, "scanGoFindShopType");
            this.f75531iobyxmoadg = address;
            this.f75532zoijcleaow = scanGoFindShopType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75531iobyxmoadg, lqeggnwhkgVar.f75531iobyxmoadg) && this.f75532zoijcleaow == lqeggnwhkgVar.f75532zoijcleaow;
        }

        public int hashCode() {
            return (this.f75531iobyxmoadg.hashCode() * 31) + this.f75532zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75531iobyxmoadg;
        }

        public String toString() {
            return "ShowAgreementDialog(address=" + this.f75531iobyxmoadg + ", scanGoFindShopType=" + this.f75532zoijcleaow + ")";
        }

        public final o32.iobyxmoadg zoijcleaow() {
            return this.f75532zoijcleaow;
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f75533iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 885913307;
        }

        public String toString() {
            return "ShowCameraInitializationErrorMessage";
        }
    }

    public static final class ojitshcjhn extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f75534iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 1515219312;
        }

        public String toString() {
            return "ShowWrongQrMessage";
        }
    }

    public static final class oxmwwwfdhm extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final oxmwwwfdhm f75535iobyxmoadg = new oxmwwwfdhm();

        private oxmwwwfdhm() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof oxmwwwfdhm);
        }

        public int hashCode() {
            return -174300154;
        }

        public String toString() {
            return "ToScanGoCartScreen";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f75536iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1091481187;
        }

        public String toString() {
            return "PauseScanSession";
        }
    }

    public static final class rgvfuqvkyq extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f75537iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return -293488719;
        }

        public String toString() {
            return "StartScanSession";
        }
    }

    public static final class vdvldrhtss extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchasesHistoryArgs f75538iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(PurchasesHistoryArgs args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f75538iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75538iobyxmoadg, ((vdvldrhtss) obj).f75538iobyxmoadg);
        }

        public int hashCode() {
            return this.f75538iobyxmoadg.hashCode();
        }

        public String toString() {
            return "ToPurchasesHistory(args=" + this.f75538iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f75539iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -879673720;
        }

        public String toString() {
            return "ShowErrorOnRequestMessage";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f75540iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
            this.f75540iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75540iobyxmoadg, ((wkgbmnqykc) obj).f75540iobyxmoadg);
        }

        public int hashCode() {
            return this.f75540iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f75540iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f75540iobyxmoadg + ")";
        }
    }

    public static final class zdlpuopuiu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f75541iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return -1653110622;
        }

        public String toString() {
            return "ToggleFlash";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f75542iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 2095528543;
        }

        public String toString() {
            return "DismissEnableWifiMessage";
        }
    }

    public /* synthetic */ eablkybsjg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

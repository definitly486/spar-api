package ru.myspar.scango.impl.screens.scan.shop.presentation;

import java.util.Arrays;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f103723iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 862359101;
        }

        public String toString() {
            return "ShowWrongQrMessage";
        }
    }

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f103724iobyxmoadg = new btonecajqb();

        private btonecajqb() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return -770843541;
        }

        public String toString() {
            return "ShowEnableWifiMessage";
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f103725iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -2024044261;
        }

        public String toString() {
            return "ShowErrorOnRequestMessage";
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f103726iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f103726iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f103726iobyxmoadg, ((dxjokdxxww) obj).f103726iobyxmoadg);
        }

        public int hashCode() {
            return this.f103726iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f103726iobyxmoadg;
        }

        public String toString() {
            return "ShowCheckCityDialog(message=" + this.f103726iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f103727iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final o32.iobyxmoadg f103728zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(CharSequence message, o32.iobyxmoadg scanGoFindShopType) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            zdlpuopuiu.btonecajqb(scanGoFindShopType, "scanGoFindShopType");
            this.f103727iobyxmoadg = message;
            this.f103728zoijcleaow = scanGoFindShopType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f103727iobyxmoadg, eablkybsjgVar.f103727iobyxmoadg) && this.f103728zoijcleaow == eablkybsjgVar.f103728zoijcleaow;
        }

        public int hashCode() {
            return (this.f103727iobyxmoadg.hashCode() * 31) + this.f103728zoijcleaow.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f103727iobyxmoadg;
        }

        public String toString() {
            CharSequence charSequence = this.f103727iobyxmoadg;
            return "ShowAgreementDialog(message=" + ((Object) charSequence) + ", scanGoFindShopType=" + this.f103728zoijcleaow + ")";
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f103729iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f103729iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f103729iobyxmoadg, ((gtknphoqwx) obj).f103729iobyxmoadg);
        }

        public int hashCode() {
            return this.f103729iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f103729iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f103729iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f103730iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -611098008;
        }

        public String toString() {
            return "ShowCameraInitializationErrorMessage";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f103731iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1781518700;
        }

        public String toString() {
            return "DismissEnableWifiMessage";
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f103732iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 34864759;
        }

        public String toString() {
            return "ShowCameraNotFoundErrorMessage";
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f103733iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -2113290700;
        }

        public String toString() {
            return "ShowCameraPermissionDeniedMessage";
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f103734iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 1015327678;
        }

        public String toString() {
            return "StartScanSession";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String[] f103735iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String[] permissions) {
            super(null);
            zdlpuopuiu.btonecajqb(permissions, "permissions");
            this.f103735iobyxmoadg = permissions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f103735iobyxmoadg, ((ppxfxbqfkf) obj).f103735iobyxmoadg);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f103735iobyxmoadg);
        }

        public final String[] iobyxmoadg() {
            return this.f103735iobyxmoadg;
        }

        public String toString() {
            return "RequestPermissions(permissions=" + Arrays.toString(this.f103735iobyxmoadg) + ")";
        }
    }

    public static final class rgvfuqvkyq extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f103736iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 681934965;
        }

        public String toString() {
            return "ToggleFlash";
        }
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f103737iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f103737iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f103737iobyxmoadg, ((wflxmlrfwp) obj).f103737iobyxmoadg);
        }

        public int hashCode() {
            return this.f103737iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f103737iobyxmoadg;
        }

        public String toString() {
            return "ShowPopupMessage(message=" + this.f103737iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.scan.shop.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2515wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2515wkgbmnqykc f103738iobyxmoadg = new C2515wkgbmnqykc();

        private C2515wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2515wkgbmnqykc);
        }

        public int hashCode() {
            return -12027995;
        }

        public String toString() {
            return "ResumeScanSession";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f103739iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 217335210;
        }

        public String toString() {
            return "PauseScanSession";
        }
    }

    public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

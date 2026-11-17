package d80;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f27157iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 226348066;
        }

        public String toString() {
            return "ToggleFlashClicked";
        }
    }

    /* JADX INFO: renamed from: d80.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0502eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0502eablkybsjg f27158iobyxmoadg = new C0502eablkybsjg();

        private C0502eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0502eablkybsjg);
        }

        public int hashCode() {
            return 851957912;
        }

        public String toString() {
            return "ShowCameraInitializationErrorMessage";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f27159iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 514381991;
        }

        public String toString() {
            return "ShowCameraNotFoundErrorMessage";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f27160iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 614889918;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f27161iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1876658684;
        }

        public String toString() {
            return "ShowCameraPermissionDeniedMessage";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f27162iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f27162iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f27162iobyxmoadg == ((nufgyqmvbu) obj).f27162iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f27162iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f27162iobyxmoadg;
        }

        public String toString() {
            return "StartScanSession(withResume=" + this.f27162iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f27163iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1820177370;
        }

        public String toString() {
            return "PauseScanSession";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f27164iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1863528587;
        }

        public String toString() {
            return "ResumeScanSession";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f27165iobyxmoadg;

        public zoijcleaow(String barcode) {
            zdlpuopuiu.btonecajqb(barcode, "barcode");
            this.f27165iobyxmoadg = barcode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f27165iobyxmoadg, ((zoijcleaow) obj).f27165iobyxmoadg);
        }

        public int hashCode() {
            return this.f27165iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27165iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificProductScreen(barcode=" + this.f27165iobyxmoadg + ")";
        }
    }
}

package ru.myspar.legacy.presentation.screen.scanproduct;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f89657iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f89658iobyxmoadg;

        public gxszxtbevo(boolean z13) {
            super(null);
            this.f89658iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && this.f89658iobyxmoadg == ((gxszxtbevo) obj).f89658iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f89658iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f89658iobyxmoadg;
        }

        public String toString() {
            return "OnFlashStateChanged(flashEnabled=" + this.f89658iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f89659iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f89660iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2055ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f89661iobyxmoadg;

        public C2055ppxfxbqfkf(boolean z13) {
            super(null);
            this.f89661iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2055ppxfxbqfkf) && this.f89661iobyxmoadg == ((C2055ppxfxbqfkf) obj).f89661iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f89661iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f89661iobyxmoadg;
        }

        public String toString() {
            return "OnCameraHasFlash(hasFlash=" + this.f89661iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f89662iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89663iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String rawBarcode) {
            super(null);
            zdlpuopuiu.btonecajqb(rawBarcode, "rawBarcode");
            this.f89663iobyxmoadg = rawBarcode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89663iobyxmoadg, ((zoijcleaow) obj).f89663iobyxmoadg);
        }

        public int hashCode() {
            return this.f89663iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89663iobyxmoadg;
        }

        public String toString() {
            return "OnBarcodeScanned(rawBarcode=" + this.f89663iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}

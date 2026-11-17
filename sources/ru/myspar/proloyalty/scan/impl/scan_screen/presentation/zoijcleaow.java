package ru.myspar.proloyalty.scan.impl.scan_screen.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f100430iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f100431iobyxmoadg;

        public gxszxtbevo(boolean z13) {
            super(null);
            this.f100431iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && this.f100431iobyxmoadg == ((gxszxtbevo) obj).f100431iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f100431iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f100431iobyxmoadg;
        }

        public String toString() {
            return "OnFlashStateChanged(flashEnabled=" + this.f100431iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f100432iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f100433iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f100434iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f100434iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f100434iobyxmoadg == ((ppxfxbqfkf) obj).f100434iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f100434iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f100434iobyxmoadg;
        }

        public String toString() {
            return "OnCameraHasFlash(hasFlash=" + this.f100434iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f100435iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2415zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f100436iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2415zoijcleaow(String rawBarcode) {
            super(null);
            zdlpuopuiu.btonecajqb(rawBarcode, "rawBarcode");
            this.f100436iobyxmoadg = rawBarcode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2415zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f100436iobyxmoadg, ((C2415zoijcleaow) obj).f100436iobyxmoadg);
        }

        public int hashCode() {
            return this.f100436iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f100436iobyxmoadg;
        }

        public String toString() {
            return "OnBarcodeScanned(rawBarcode=" + this.f100436iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}

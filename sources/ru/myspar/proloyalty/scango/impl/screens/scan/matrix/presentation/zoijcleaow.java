package ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f100909iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f100909iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f100909iobyxmoadg == ((eablkybsjg) obj).f100909iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f100909iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f100909iobyxmoadg;
        }

        public String toString() {
            return "OnFlashStateChanged(flashEnabled=" + this.f100909iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f100910iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String code) {
            super(null);
            zdlpuopuiu.btonecajqb(code, "code");
            this.f100910iobyxmoadg = code;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f100910iobyxmoadg, ((gxszxtbevo) obj).f100910iobyxmoadg);
        }

        public int hashCode() {
            return this.f100910iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f100910iobyxmoadg;
        }

        public String toString() {
            return "OnMatrixScanned(code=" + this.f100910iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f100911iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f100912iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f100913iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f100914iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f100915iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2431zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f100916iobyxmoadg;

        public C2431zoijcleaow(boolean z13) {
            super(null);
            this.f100916iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2431zoijcleaow) && this.f100916iobyxmoadg == ((C2431zoijcleaow) obj).f100916iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f100916iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f100916iobyxmoadg;
        }

        public String toString() {
            return "OnCameraHasFlash(hasFlash=" + this.f100916iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}

package ru.myspar.scango.impl.screens.scan.matrix.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f103566iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f103566iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f103566iobyxmoadg == ((eablkybsjg) obj).f103566iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f103566iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f103566iobyxmoadg;
        }

        public String toString() {
            return "OnFlashStateChanged(flashEnabled=" + this.f103566iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f103567iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String code) {
            super(null);
            zdlpuopuiu.btonecajqb(code, "code");
            this.f103567iobyxmoadg = code;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f103567iobyxmoadg, ((gxszxtbevo) obj).f103567iobyxmoadg);
        }

        public int hashCode() {
            return this.f103567iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f103567iobyxmoadg;
        }

        public String toString() {
            return "OnMatrixScanned(code=" + this.f103567iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f103568iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f103569iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f103570iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f103571iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f103572iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2510zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f103573iobyxmoadg;

        public C2510zoijcleaow(boolean z13) {
            super(null);
            this.f103573iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2510zoijcleaow) && this.f103573iobyxmoadg == ((C2510zoijcleaow) obj).f103573iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f103573iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f103573iobyxmoadg;
        }

        public String toString() {
            return "OnCameraHasFlash(hasFlash=" + this.f103573iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}

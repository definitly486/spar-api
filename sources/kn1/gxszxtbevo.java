package kn1;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f59882iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f59882iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f59882iobyxmoadg == ((iobyxmoadg) obj).f59882iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f59882iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f59882iobyxmoadg;
        }

        public String toString() {
            return "CameraHasFlash(hasFlash=" + this.f59882iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f59883iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f59883iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f59883iobyxmoadg == ((zoijcleaow) obj).f59883iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f59883iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f59883iobyxmoadg;
        }

        public String toString() {
            return "FlashStateChanged(isFlashEnabled=" + this.f59883iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

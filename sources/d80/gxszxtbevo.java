package d80;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f27166iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f27166iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f27166iobyxmoadg == ((iobyxmoadg) obj).f27166iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f27166iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f27166iobyxmoadg;
        }

        public String toString() {
            return "CameraHasFlash(hasFlash=" + this.f27166iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f27167iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f27167iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f27167iobyxmoadg == ((zoijcleaow) obj).f27167iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f27167iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f27167iobyxmoadg;
        }

        public String toString() {
            return "FlashStateChanged(isFlashEnabled=" + this.f27167iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

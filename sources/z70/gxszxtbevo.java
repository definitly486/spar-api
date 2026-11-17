package z70;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f129252iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f129252iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f129252iobyxmoadg == ((iobyxmoadg) obj).f129252iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f129252iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f129252iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f129252iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f129253iobyxmoadg;

        public zoijcleaow(int i13) {
            super(null);
            this.f129253iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f129253iobyxmoadg == ((zoijcleaow) obj).f129253iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f129253iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f129253iobyxmoadg;
        }

        public String toString() {
            return "RatingChanged(rating=" + this.f129253iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

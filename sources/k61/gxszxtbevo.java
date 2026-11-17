package k61;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f53918iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f53918iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f53918iobyxmoadg == ((iobyxmoadg) obj).f53918iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f53918iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f53918iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f53918iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f53919iobyxmoadg;

        public zoijcleaow(int i13) {
            super(null);
            this.f53919iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f53919iobyxmoadg == ((zoijcleaow) obj).f53919iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f53919iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f53919iobyxmoadg;
        }

        public String toString() {
            return "RatingChanged(rating=" + this.f53919iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

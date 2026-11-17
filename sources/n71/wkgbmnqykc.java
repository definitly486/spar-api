package n71;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f69344iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f69345iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f69345iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f69345iobyxmoadg == ((zoijcleaow) obj).f69345iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f69345iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f69345iobyxmoadg;
        }

        public String toString() {
            return "OnReceiveDigitalChecksChecked(isChecked=" + this.f69345iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

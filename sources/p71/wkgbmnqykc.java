package p71;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f75948iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f75949iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f75949iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f75949iobyxmoadg == ((zoijcleaow) obj).f75949iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f75949iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f75949iobyxmoadg;
        }

        public String toString() {
            return "OnReceiveDigitalChecksChecked(isChecked=" + this.f75949iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

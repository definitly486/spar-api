package vv1;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f118104iobyxmoadg;

        public iobyxmoadg(int i13) {
            super(null);
            this.f118104iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f118104iobyxmoadg == ((iobyxmoadg) obj).f118104iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f118104iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f118104iobyxmoadg;
        }

        public String toString() {
            return "MaxRange(upperBound=" + this.f118104iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f118105iobyxmoadg;

        public zoijcleaow(int i13) {
            super(null);
            this.f118105iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f118105iobyxmoadg == ((zoijcleaow) obj).f118105iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f118105iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f118105iobyxmoadg;
        }

        public String toString() {
            return "MinRange(lowerBound=" + this.f118105iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

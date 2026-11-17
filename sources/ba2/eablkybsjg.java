package ba2;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f15589iobyxmoadg;

        public iobyxmoadg(int i13) {
            super(null);
            this.f15589iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f15589iobyxmoadg == ((iobyxmoadg) obj).f15589iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f15589iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f15589iobyxmoadg;
        }

        public String toString() {
            return "MaxRange(upperBound=" + this.f15589iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f15590iobyxmoadg;

        public zoijcleaow(int i13) {
            super(null);
            this.f15590iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f15590iobyxmoadg == ((zoijcleaow) obj).f15590iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f15590iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f15590iobyxmoadg;
        }

        public String toString() {
            return "MinRange(lowerBound=" + this.f15590iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

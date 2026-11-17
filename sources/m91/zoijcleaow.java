package m91;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f66632iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow iobyxmoadg(Integer num) {
            if (num != null) {
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    return new ppxfxbqfkf(Math.min(num.intValue(), 99));
                }
            }
            return C1377zoijcleaow.f66634zoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f66633zoijcleaow;

        public ppxfxbqfkf(int i13) {
            super(null);
            this.f66633zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f66633zoijcleaow == ((ppxfxbqfkf) obj).f66633zoijcleaow;
        }

        public int hashCode() {
            return Integer.hashCode(this.f66633zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f66633zoijcleaow;
        }

        public String toString() {
            return "WithCount(count=" + this.f66633zoijcleaow + ")";
        }
    }

    /* JADX INFO: renamed from: m91.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1377zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final C1377zoijcleaow f66634zoijcleaow = new C1377zoijcleaow();

        private C1377zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1377zoijcleaow);
        }

        public int hashCode() {
            return 1657876465;
        }

        public String toString() {
            return "None";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}

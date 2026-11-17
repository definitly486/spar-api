package nb0;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f69535iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f69536zoijcleaow = 0;

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
            return C1496zoijcleaow.f69538ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f69537ppxfxbqfkf;

        public ppxfxbqfkf(int i13) {
            super(null);
            this.f69537ppxfxbqfkf = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f69537ppxfxbqfkf == ((ppxfxbqfkf) obj).f69537ppxfxbqfkf;
        }

        public int hashCode() {
            return Integer.hashCode(this.f69537ppxfxbqfkf);
        }

        public final int iobyxmoadg() {
            return this.f69537ppxfxbqfkf;
        }

        public String toString() {
            return "WithCount(count=" + this.f69537ppxfxbqfkf + ")";
        }
    }

    /* JADX INFO: renamed from: nb0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1496zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final C1496zoijcleaow f69538ppxfxbqfkf = new C1496zoijcleaow();

        private C1496zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1496zoijcleaow);
        }

        public int hashCode() {
            return 1003754676;
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

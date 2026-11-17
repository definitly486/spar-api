package f7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f33044iobyxmoadg;

        public iobyxmoadg(int i13) {
            super(null);
            this.f33044iobyxmoadg = i13;
            if (i13 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f33044iobyxmoadg == ((iobyxmoadg) obj).f33044iobyxmoadg;
        }

        public int hashCode() {
            return this.f33044iobyxmoadg;
        }

        public String toString() {
            return String.valueOf(this.f33044iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f33045iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}

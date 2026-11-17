package sx;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: sx.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2673iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f108612iobyxmoadg;

        public C2673iobyxmoadg(boolean z13) {
            this.f108612iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2673iobyxmoadg) && this.f108612iobyxmoadg == ((C2673iobyxmoadg) obj).f108612iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f108612iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f108612iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenChanged(isHidden=" + this.f108612iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f108613iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1494137817;
        }

        public String toString() {
            return "OnStop";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f108614iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 926354653;
        }

        public String toString() {
            return "OnStart";
        }
    }
}

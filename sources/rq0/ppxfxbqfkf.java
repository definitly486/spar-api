package rq0;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f83653iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 971244531;
        }

        public String toString() {
            return "Init";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83654iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f83654iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f83654iobyxmoadg == ((zoijcleaow) obj).f83654iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83654iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83654iobyxmoadg;
        }

        public String toString() {
            return "ShowPopup(isEditOrderMode=" + this.f83654iobyxmoadg + ")";
        }
    }
}

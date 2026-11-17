package cs;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f25630iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1202151216;
        }

        public String toString() {
            return "Init";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f25631iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f25631iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f25631iobyxmoadg == ((zoijcleaow) obj).f25631iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f25631iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f25631iobyxmoadg;
        }

        public String toString() {
            return "ShowLoymaxPopup(isEditOrderMode=" + this.f25631iobyxmoadg + ")";
        }
    }
}

package pw0;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: pw0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1718iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f77386iobyxmoadg;

        public C1718iobyxmoadg(boolean z13) {
            this.f77386iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1718iobyxmoadg) && this.f77386iobyxmoadg == ((C1718iobyxmoadg) obj).f77386iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f77386iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f77386iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenChanged(isHidden=" + this.f77386iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f77387iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -840016028;
        }

        public String toString() {
            return "OnStop";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f77388iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -270706368;
        }

        public String toString() {
            return "OnStart";
        }
    }
}

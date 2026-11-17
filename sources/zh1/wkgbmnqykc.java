package zh1;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f129993iobyxmoadg;

        public iobyxmoadg(int i13) {
            this.f129993iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f129993iobyxmoadg == ((iobyxmoadg) obj).f129993iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f129993iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f129993iobyxmoadg;
        }

        public String toString() {
            return "DismissDialogWithResult(productSetCount=" + this.f129993iobyxmoadg + ")";
        }
    }
}

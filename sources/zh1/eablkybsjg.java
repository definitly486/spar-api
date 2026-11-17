package zh1;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f129986iobyxmoadg;

        public iobyxmoadg(int i13) {
            this.f129986iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f129986iobyxmoadg == ((iobyxmoadg) obj).f129986iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f129986iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f129986iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductSetCount(newCount=" + this.f129986iobyxmoadg + ")";
        }
    }
}

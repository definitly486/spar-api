package jk0;

/* JADX INFO: loaded from: classes3.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f51624iobyxmoadg;

        public iobyxmoadg(int i13) {
            this.f51624iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f51624iobyxmoadg == ((iobyxmoadg) obj).f51624iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f51624iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f51624iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductSetCount(newCount=" + this.f51624iobyxmoadg + ")";
        }
    }
}

package jk0;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f51631iobyxmoadg;

        public iobyxmoadg(int i13) {
            this.f51631iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f51631iobyxmoadg == ((iobyxmoadg) obj).f51631iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f51631iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f51631iobyxmoadg;
        }

        public String toString() {
            return "DismissDialogWithResult(productSetCount=" + this.f51631iobyxmoadg + ")";
        }
    }
}

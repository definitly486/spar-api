package ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f99400iobyxmoadg;

        public iobyxmoadg(int i13) {
            this.f99400iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f99400iobyxmoadg == ((iobyxmoadg) obj).f99400iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f99400iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f99400iobyxmoadg;
        }

        public String toString() {
            return "DismissDialogWithResult(productSetCount=" + this.f99400iobyxmoadg + ")";
        }
    }
}

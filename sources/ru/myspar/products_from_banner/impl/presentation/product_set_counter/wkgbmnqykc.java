package ru.myspar.products_from_banner.impl.presentation.product_set_counter;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91705iobyxmoadg;

        public iobyxmoadg(int i13) {
            this.f91705iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f91705iobyxmoadg == ((iobyxmoadg) obj).f91705iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f91705iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f91705iobyxmoadg;
        }

        public String toString() {
            return "DismissDialogWithResult(productSetCount=" + this.f91705iobyxmoadg + ")";
        }
    }
}

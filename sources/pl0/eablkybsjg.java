package pl0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f76901iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1010302266;
        }

        public String toString() {
            return "ShowCannotDeleteMessage";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f76902iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -204735215;
        }

        public String toString() {
            return "ShowPriceCanChangeMessage";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f76903iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 136397368;
        }

        public String toString() {
            return "ShowSomethingProductsAvailableOnlyForPickupMessage";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f76904iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f76904iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f76904iobyxmoadg, ((zoijcleaow) obj).f76904iobyxmoadg);
        }

        public int hashCode() {
            return this.f76904iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f76904iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f76904iobyxmoadg + ")";
        }
    }
}

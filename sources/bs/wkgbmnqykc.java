package bs;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f16988iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1224041434;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f16989iobyxmoadg;

        public ppxfxbqfkf(String ratingValue) {
            zdlpuopuiu.btonecajqb(ratingValue, "ratingValue");
            this.f16989iobyxmoadg = ratingValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f16989iobyxmoadg, ((ppxfxbqfkf) obj).f16989iobyxmoadg);
        }

        public int hashCode() {
            return this.f16989iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f16989iobyxmoadg;
        }

        public String toString() {
            return "Vivino(ratingValue=" + this.f16989iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f16990iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f16991zoijcleaow;

        public zoijcleaow(String ratingValue, int i13) {
            zdlpuopuiu.btonecajqb(ratingValue, "ratingValue");
            this.f16990iobyxmoadg = ratingValue;
            this.f16991zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f16990iobyxmoadg, zoijcleaowVar.f16990iobyxmoadg) && this.f16991zoijcleaow == zoijcleaowVar.f16991zoijcleaow;
        }

        public int hashCode() {
            return (this.f16990iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f16991zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f16990iobyxmoadg;
        }

        public String toString() {
            return "User(ratingValue=" + this.f16990iobyxmoadg + ", reviewsCount=" + this.f16991zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f16991zoijcleaow;
        }
    }
}

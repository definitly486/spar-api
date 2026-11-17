package qq0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f80520iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2113634947;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f80521iobyxmoadg;

        public ppxfxbqfkf(String ratingValue) {
            zdlpuopuiu.btonecajqb(ratingValue, "ratingValue");
            this.f80521iobyxmoadg = ratingValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f80521iobyxmoadg, ((ppxfxbqfkf) obj).f80521iobyxmoadg);
        }

        public int hashCode() {
            return this.f80521iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f80521iobyxmoadg;
        }

        public String toString() {
            return "Vivino(ratingValue=" + this.f80521iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f80522iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f80523zoijcleaow;

        public zoijcleaow(String ratingValue, int i13) {
            zdlpuopuiu.btonecajqb(ratingValue, "ratingValue");
            this.f80522iobyxmoadg = ratingValue;
            this.f80523zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f80522iobyxmoadg, zoijcleaowVar.f80522iobyxmoadg) && this.f80523zoijcleaow == zoijcleaowVar.f80523zoijcleaow;
        }

        public int hashCode() {
            return (this.f80522iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f80523zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f80522iobyxmoadg;
        }

        public String toString() {
            return "User(ratingValue=" + this.f80522iobyxmoadg + ", reviewsCount=" + this.f80523zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f80523zoijcleaow;
        }
    }
}

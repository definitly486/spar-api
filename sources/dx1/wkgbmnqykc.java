package dx1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f29808iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1793431025;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29809iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String url) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f29809iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f29809iobyxmoadg, ((ppxfxbqfkf) obj).f29809iobyxmoadg);
        }

        public int hashCode() {
            return this.f29809iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f29809iobyxmoadg;
        }

        public String toString() {
            return "OnTracking(url=" + this.f29809iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29810iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f29810iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f29810iobyxmoadg, ((zoijcleaow) obj).f29810iobyxmoadg);
        }

        public int hashCode() {
            return this.f29810iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f29810iobyxmoadg;
        }

        public String toString() {
            return "OnReceivedError(message=" + this.f29810iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

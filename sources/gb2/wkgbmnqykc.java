package gb2;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f36788iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 546209550;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36789iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String url) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f36789iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f36789iobyxmoadg, ((ppxfxbqfkf) obj).f36789iobyxmoadg);
        }

        public int hashCode() {
            return this.f36789iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f36789iobyxmoadg;
        }

        public String toString() {
            return "OnTracking(url=" + this.f36789iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36790iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f36790iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f36790iobyxmoadg, ((zoijcleaow) obj).f36790iobyxmoadg);
        }

        public int hashCode() {
            return this.f36790iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f36790iobyxmoadg;
        }

        public String toString() {
            return "OnReceivedError(message=" + this.f36790iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

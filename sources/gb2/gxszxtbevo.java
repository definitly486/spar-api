package gb2;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36775iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String trackingUrl) {
            super(null);
            zdlpuopuiu.btonecajqb(trackingUrl, "trackingUrl");
            this.f36775iobyxmoadg = trackingUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36775iobyxmoadg, ((iobyxmoadg) obj).f36775iobyxmoadg);
        }

        public int hashCode() {
            return this.f36775iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f36775iobyxmoadg;
        }

        public String toString() {
            return "TrackingUrl(trackingUrl=" + this.f36775iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

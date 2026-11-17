package dx1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29782iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f29783zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String trackingUrl, String str) {
            super(null);
            zdlpuopuiu.btonecajqb(trackingUrl, "trackingUrl");
            this.f29782iobyxmoadg = trackingUrl;
            this.f29783zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f29782iobyxmoadg, iobyxmoadgVar.f29782iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29783zoijcleaow, iobyxmoadgVar.f29783zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f29782iobyxmoadg.hashCode() * 31;
            String str = this.f29783zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f29783zoijcleaow;
        }

        public String toString() {
            return "TrackingUrl(trackingUrl=" + this.f29782iobyxmoadg + ", token=" + this.f29783zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f29782iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

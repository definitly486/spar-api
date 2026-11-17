package xg1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f122347iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f122348zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String url, double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f122347iobyxmoadg = url;
            this.f122348zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f122347iobyxmoadg, iobyxmoadgVar.f122347iobyxmoadg) && Double.compare(this.f122348zoijcleaow, iobyxmoadgVar.f122348zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f122347iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f122348zoijcleaow);
        }

        public final double iobyxmoadg() {
            return this.f122348zoijcleaow;
        }

        public String toString() {
            return "InfoUpdated(url=" + this.f122347iobyxmoadg + ", totalPrice=" + this.f122348zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f122347iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

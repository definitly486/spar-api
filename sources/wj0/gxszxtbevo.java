package wj0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f119977iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f119978zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String url, double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f119977iobyxmoadg = url;
            this.f119978zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f119977iobyxmoadg, iobyxmoadgVar.f119977iobyxmoadg) && Double.compare(this.f119978zoijcleaow, iobyxmoadgVar.f119978zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f119977iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f119978zoijcleaow);
        }

        public final double iobyxmoadg() {
            return this.f119978zoijcleaow;
        }

        public String toString() {
            return "InfoUpdated(url=" + this.f119977iobyxmoadg + ", totalPrice=" + this.f119978zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f119977iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

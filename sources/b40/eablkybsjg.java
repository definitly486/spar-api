package b40;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import l9.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg extends l9.eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vdvldrhtss f15119iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f15120zoijcleaow;

        public iobyxmoadg(vdvldrhtss screen, boolean z13) {
            zdlpuopuiu.btonecajqb(screen, "screen");
            this.f15119iobyxmoadg = screen;
            this.f15120zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f15119iobyxmoadg, iobyxmoadgVar.f15119iobyxmoadg) && this.f15120zoijcleaow == iobyxmoadgVar.f15120zoijcleaow;
        }

        public int hashCode() {
            return (this.f15119iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15120zoijcleaow);
        }

        public final vdvldrhtss iobyxmoadg() {
            return this.f15119iobyxmoadg;
        }

        public String toString() {
            return "BackToInclusive(screen=" + this.f15119iobyxmoadg + ", isInclusive=" + this.f15120zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f15120zoijcleaow;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vdvldrhtss f15121iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f15122zoijcleaow;

        public zoijcleaow(vdvldrhtss screen, boolean z13) {
            zdlpuopuiu.btonecajqb(screen, "screen");
            this.f15121iobyxmoadg = screen;
            this.f15122zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f15121iobyxmoadg, zoijcleaowVar.f15121iobyxmoadg) && this.f15122zoijcleaow == zoijcleaowVar.f15122zoijcleaow;
        }

        public int hashCode() {
            return (this.f15121iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15122zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f15122zoijcleaow;
        }

        public String toString() {
            return "ForwardIfNotOpen(screen=" + this.f15121iobyxmoadg + ", addToBackStack=" + this.f15122zoijcleaow + ")";
        }

        public final vdvldrhtss zoijcleaow() {
            return this.f15121iobyxmoadg;
        }

        public /* synthetic */ zoijcleaow(vdvldrhtss vdvldrhtssVar, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
            this(vdvldrhtssVar, (i13 & 2) != 0 ? true : z13);
        }
    }
}

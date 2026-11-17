package g21;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import l9.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg extends l9.eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vdvldrhtss f35869iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f35870zoijcleaow;

        public iobyxmoadg(vdvldrhtss screen, boolean z13) {
            zdlpuopuiu.btonecajqb(screen, "screen");
            this.f35869iobyxmoadg = screen;
            this.f35870zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f35869iobyxmoadg, iobyxmoadgVar.f35869iobyxmoadg) && this.f35870zoijcleaow == iobyxmoadgVar.f35870zoijcleaow;
        }

        public int hashCode() {
            return (this.f35869iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f35870zoijcleaow);
        }

        public final vdvldrhtss iobyxmoadg() {
            return this.f35869iobyxmoadg;
        }

        public String toString() {
            return "BackToInclusive(screen=" + this.f35869iobyxmoadg + ", isInclusive=" + this.f35870zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f35870zoijcleaow;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vdvldrhtss f35871iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f35872zoijcleaow;

        public zoijcleaow(vdvldrhtss screen, boolean z13) {
            zdlpuopuiu.btonecajqb(screen, "screen");
            this.f35871iobyxmoadg = screen;
            this.f35872zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f35871iobyxmoadg, zoijcleaowVar.f35871iobyxmoadg) && this.f35872zoijcleaow == zoijcleaowVar.f35872zoijcleaow;
        }

        public int hashCode() {
            return (this.f35871iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f35872zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f35872zoijcleaow;
        }

        public String toString() {
            return "ForwardIfNotOpen(screen=" + this.f35871iobyxmoadg + ", addToBackStack=" + this.f35872zoijcleaow + ")";
        }

        public final vdvldrhtss zoijcleaow() {
            return this.f35871iobyxmoadg;
        }

        public /* synthetic */ zoijcleaow(vdvldrhtss vdvldrhtssVar, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
            this(vdvldrhtssVar, (i13 & 2) != 0 ? true : z13);
        }
    }
}

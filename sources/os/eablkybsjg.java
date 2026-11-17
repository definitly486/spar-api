package os;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final os.iobyxmoadg f74624iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(os.iobyxmoadg change) {
            super(null);
            zdlpuopuiu.btonecajqb(change, "change");
            this.f74624iobyxmoadg = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f74624iobyxmoadg, ((iobyxmoadg) obj).f74624iobyxmoadg);
        }

        public int hashCode() {
            return this.f74624iobyxmoadg.hashCode();
        }

        public final os.iobyxmoadg iobyxmoadg() {
            return this.f74624iobyxmoadg;
        }

        public String toString() {
            return "Change(change=" + this.f74624iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f74625iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f74625iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f74625iobyxmoadg == ((zoijcleaow) obj).f74625iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f74625iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f74625iobyxmoadg;
        }

        public String toString() {
            return "Visibility(isScreenVisible=" + this.f74625iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

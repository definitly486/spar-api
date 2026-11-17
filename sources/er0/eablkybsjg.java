package er0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final er0.iobyxmoadg f31805iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(er0.iobyxmoadg change) {
            super(null);
            zdlpuopuiu.btonecajqb(change, "change");
            this.f31805iobyxmoadg = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31805iobyxmoadg, ((iobyxmoadg) obj).f31805iobyxmoadg);
        }

        public int hashCode() {
            return this.f31805iobyxmoadg.hashCode();
        }

        public final er0.iobyxmoadg iobyxmoadg() {
            return this.f31805iobyxmoadg;
        }

        public String toString() {
            return "Change(change=" + this.f31805iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f31806iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f31806iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f31806iobyxmoadg == ((zoijcleaow) obj).f31806iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f31806iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f31806iobyxmoadg;
        }

        public String toString() {
            return "Visibility(isScreenVisible=" + this.f31806iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

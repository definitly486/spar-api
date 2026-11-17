package ti0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final x00.iobyxmoadg f110558iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(x00.iobyxmoadg darkModeState) {
            super(null);
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f110558iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f110558iobyxmoadg == ((iobyxmoadg) obj).f110558iobyxmoadg;
        }

        public int hashCode() {
            return this.f110558iobyxmoadg.hashCode();
        }

        public final x00.iobyxmoadg iobyxmoadg() {
            return this.f110558iobyxmoadg;
        }

        public String toString() {
            return "SaveDarkModeState(darkModeState=" + this.f110558iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

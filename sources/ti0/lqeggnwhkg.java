package ti0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final x00.iobyxmoadg f110565iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(x00.iobyxmoadg darkModeState) {
            super(null);
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f110565iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f110565iobyxmoadg == ((iobyxmoadg) obj).f110565iobyxmoadg;
        }

        public int hashCode() {
            return this.f110565iobyxmoadg.hashCode();
        }

        public final x00.iobyxmoadg iobyxmoadg() {
            return this.f110565iobyxmoadg;
        }

        public String toString() {
            return "DarkModeStateReceived(darkModeState=" + this.f110565iobyxmoadg + ")";
        }
    }

    public /* synthetic */ lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private lqeggnwhkg() {
    }
}

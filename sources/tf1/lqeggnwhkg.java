package tf1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oz0.iobyxmoadg f110455iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(oz0.iobyxmoadg darkModeState) {
            super(null);
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f110455iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f110455iobyxmoadg == ((iobyxmoadg) obj).f110455iobyxmoadg;
        }

        public int hashCode() {
            return this.f110455iobyxmoadg.hashCode();
        }

        public final oz0.iobyxmoadg iobyxmoadg() {
            return this.f110455iobyxmoadg;
        }

        public String toString() {
            return "DarkModeStateReceived(darkModeState=" + this.f110455iobyxmoadg + ")";
        }
    }

    public /* synthetic */ lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private lqeggnwhkg() {
    }
}

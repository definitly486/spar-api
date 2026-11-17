package tf1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oz0.iobyxmoadg f110448iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(oz0.iobyxmoadg darkModeState) {
            super(null);
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f110448iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f110448iobyxmoadg == ((iobyxmoadg) obj).f110448iobyxmoadg;
        }

        public int hashCode() {
            return this.f110448iobyxmoadg.hashCode();
        }

        public final oz0.iobyxmoadg iobyxmoadg() {
            return this.f110448iobyxmoadg;
        }

        public String toString() {
            return "SaveDarkModeState(darkModeState=" + this.f110448iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

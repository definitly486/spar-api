package cp0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f25472iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(mz0.ppxfxbqfkf sortState) {
            super(null);
            zdlpuopuiu.btonecajqb(sortState, "sortState");
            this.f25472iobyxmoadg = sortState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f25472iobyxmoadg == ((iobyxmoadg) obj).f25472iobyxmoadg;
        }

        public int hashCode() {
            return this.f25472iobyxmoadg.hashCode();
        }

        public final mz0.ppxfxbqfkf iobyxmoadg() {
            return this.f25472iobyxmoadg;
        }

        public String toString() {
            return "SendResult(sortState=" + this.f25472iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

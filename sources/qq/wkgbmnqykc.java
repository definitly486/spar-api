package qq;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f80495iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(v00.ppxfxbqfkf sortState) {
            super(null);
            zdlpuopuiu.btonecajqb(sortState, "sortState");
            this.f80495iobyxmoadg = sortState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f80495iobyxmoadg == ((iobyxmoadg) obj).f80495iobyxmoadg;
        }

        public int hashCode() {
            return this.f80495iobyxmoadg.hashCode();
        }

        public final v00.ppxfxbqfkf iobyxmoadg() {
            return this.f80495iobyxmoadg;
        }

        public String toString() {
            return "SendResult(sortState=" + this.f80495iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}

package x70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f121393iobyxmoadg;

        public iobyxmoadg(int i13) {
            super(null);
            this.f121393iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f121393iobyxmoadg == ((iobyxmoadg) obj).f121393iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f121393iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f121393iobyxmoadg;
        }

        public String toString() {
            return "CurrentItemPositionFetched(position=" + this.f121393iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f121394iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f121394iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f121394iobyxmoadg == ((ppxfxbqfkf) obj).f121394iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f121394iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f121394iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f121394iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion f121395iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Promotion data) {
            super(null);
            zdlpuopuiu.btonecajqb(data, "data");
            this.f121395iobyxmoadg = data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f121395iobyxmoadg, ((zoijcleaow) obj).f121395iobyxmoadg);
        }

        public int hashCode() {
            return this.f121395iobyxmoadg.hashCode();
        }

        public final Promotion iobyxmoadg() {
            return this.f121395iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(data=" + this.f121395iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

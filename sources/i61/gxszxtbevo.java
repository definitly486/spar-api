package i61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f42018iobyxmoadg;

        public iobyxmoadg(int i13) {
            super(null);
            this.f42018iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f42018iobyxmoadg == ((iobyxmoadg) obj).f42018iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f42018iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f42018iobyxmoadg;
        }

        public String toString() {
            return "CurrentItemPositionFetched(position=" + this.f42018iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f42019iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f42019iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f42019iobyxmoadg == ((ppxfxbqfkf) obj).f42019iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f42019iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f42019iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f42019iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion f42020iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Promotion data) {
            super(null);
            zdlpuopuiu.btonecajqb(data, "data");
            this.f42020iobyxmoadg = data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f42020iobyxmoadg, ((zoijcleaow) obj).f42020iobyxmoadg);
        }

        public int hashCode() {
            return this.f42020iobyxmoadg.hashCode();
        }

        public final Promotion iobyxmoadg() {
            return this.f42020iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(data=" + this.f42020iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

package h61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f39684iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f39684iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f39684iobyxmoadg == ((iobyxmoadg) obj).f39684iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f39684iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f39684iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f39684iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39685iobyxmoadg;

        public ppxfxbqfkf(String str) {
            super(null);
            this.f39685iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f39685iobyxmoadg, ((ppxfxbqfkf) obj).f39685iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f39685iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39685iobyxmoadg;
        }

        public String toString() {
            return "SelectedItemIdChanged(selectedItemId=" + this.f39685iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion f39686iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f39687ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f39688zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Promotion promotion, boolean z13, String str) {
            super(null);
            zdlpuopuiu.btonecajqb(promotion, "promotion");
            this.f39686iobyxmoadg = promotion;
            this.f39688zoijcleaow = z13;
            this.f39687ppxfxbqfkf = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f39686iobyxmoadg, zoijcleaowVar.f39686iobyxmoadg) && this.f39688zoijcleaow == zoijcleaowVar.f39688zoijcleaow && zdlpuopuiu.eablkybsjg(this.f39687ppxfxbqfkf, zoijcleaowVar.f39687ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f39686iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f39688zoijcleaow)) * 31;
            String str = this.f39687ppxfxbqfkf;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final Promotion iobyxmoadg() {
            return this.f39686iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f39688zoijcleaow;
        }

        public String toString() {
            return "PromotionFetched(promotion=" + this.f39686iobyxmoadg + ", isLoggedIn=" + this.f39688zoijcleaow + ", selectedItemId=" + this.f39687ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f39687ppxfxbqfkf;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

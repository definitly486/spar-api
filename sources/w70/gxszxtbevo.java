package w70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f118939iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f118939iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f118939iobyxmoadg == ((iobyxmoadg) obj).f118939iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f118939iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f118939iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f118939iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118940iobyxmoadg;

        public ppxfxbqfkf(String str) {
            super(null);
            this.f118940iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f118940iobyxmoadg, ((ppxfxbqfkf) obj).f118940iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f118940iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118940iobyxmoadg;
        }

        public String toString() {
            return "SelectedItemIdChanged(selectedItemId=" + this.f118940iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion f118941iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f118942ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f118943zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Promotion promotion, boolean z13, String str) {
            super(null);
            zdlpuopuiu.btonecajqb(promotion, "promotion");
            this.f118941iobyxmoadg = promotion;
            this.f118943zoijcleaow = z13;
            this.f118942ppxfxbqfkf = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f118941iobyxmoadg, zoijcleaowVar.f118941iobyxmoadg) && this.f118943zoijcleaow == zoijcleaowVar.f118943zoijcleaow && zdlpuopuiu.eablkybsjg(this.f118942ppxfxbqfkf, zoijcleaowVar.f118942ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f118941iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f118943zoijcleaow)) * 31;
            String str = this.f118942ppxfxbqfkf;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final Promotion iobyxmoadg() {
            return this.f118941iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f118943zoijcleaow;
        }

        public String toString() {
            return "PromotionFetched(promotion=" + this.f118941iobyxmoadg + ", isLoggedIn=" + this.f118943zoijcleaow + ", selectedItemId=" + this.f118942ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f118942ppxfxbqfkf;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

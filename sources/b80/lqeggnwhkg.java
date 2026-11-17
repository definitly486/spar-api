package b80;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.review.api.model.Reviews;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f15480iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List items) {
            super(null);
            zdlpuopuiu.btonecajqb(items, "items");
            this.f15480iobyxmoadg = items;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15480iobyxmoadg, ((iobyxmoadg) obj).f15480iobyxmoadg);
        }

        public int hashCode() {
            return this.f15480iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f15480iobyxmoadg;
        }

        public String toString() {
            return "ExpandUpdated(items=" + this.f15480iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Reviews f15481iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f15482ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f15483wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f15484zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Reviews reviews, int i13, boolean z13, boolean z14) {
            super(null);
            zdlpuopuiu.btonecajqb(reviews, "reviews");
            this.f15481iobyxmoadg = reviews;
            this.f15484zoijcleaow = i13;
            this.f15482ppxfxbqfkf = z13;
            this.f15483wkgbmnqykc = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f15481iobyxmoadg, ppxfxbqfkfVar.f15481iobyxmoadg) && this.f15484zoijcleaow == ppxfxbqfkfVar.f15484zoijcleaow && this.f15482ppxfxbqfkf == ppxfxbqfkfVar.f15482ppxfxbqfkf && this.f15483wkgbmnqykc == ppxfxbqfkfVar.f15483wkgbmnqykc;
        }

        public int hashCode() {
            return (((((this.f15481iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f15484zoijcleaow)) * 31) + Boolean.hashCode(this.f15482ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f15483wkgbmnqykc);
        }

        public final int iobyxmoadg() {
            return this.f15484zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f15483wkgbmnqykc;
        }

        public String toString() {
            return "ReviewsUpdated(reviews=" + this.f15481iobyxmoadg + ", page=" + this.f15484zoijcleaow + ", isNeedScrollToTop=" + this.f15482ppxfxbqfkf + ", isLoggedInUser=" + this.f15483wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f15482ppxfxbqfkf;
        }

        public final Reviews zoijcleaow() {
            return this.f15481iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f15485iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1013024503;
        }

        public String toString() {
            return "ScrolledToTop";
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f15486iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f15487zoijcleaow;

        public zoijcleaow(boolean z13, boolean z14) {
            super(null);
            this.f15486iobyxmoadg = z13;
            this.f15487zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f15486iobyxmoadg == zoijcleaowVar.f15486iobyxmoadg && this.f15487zoijcleaow == zoijcleaowVar.f15487zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f15486iobyxmoadg) * 31) + Boolean.hashCode(this.f15487zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f15487zoijcleaow;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f15486iobyxmoadg + ", isInitLoad=" + this.f15487zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f15486iobyxmoadg;
        }

        public /* synthetic */ zoijcleaow(boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
            this(z13, (i13 & 2) != 0 ? false : z14);
        }
    }

    public /* synthetic */ lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private lqeggnwhkg() {
    }
}

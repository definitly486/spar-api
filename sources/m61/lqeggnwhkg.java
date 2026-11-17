package m61;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.rate.review.api.model.Reviews;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f66225iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List items) {
            super(null);
            zdlpuopuiu.btonecajqb(items, "items");
            this.f66225iobyxmoadg = items;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66225iobyxmoadg, ((iobyxmoadg) obj).f66225iobyxmoadg);
        }

        public int hashCode() {
            return this.f66225iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f66225iobyxmoadg;
        }

        public String toString() {
            return "ExpandUpdated(items=" + this.f66225iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Reviews f66226iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f66227ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f66228wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f66229zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Reviews reviews, int i13, boolean z13, boolean z14) {
            super(null);
            zdlpuopuiu.btonecajqb(reviews, "reviews");
            this.f66226iobyxmoadg = reviews;
            this.f66229zoijcleaow = i13;
            this.f66227ppxfxbqfkf = z13;
            this.f66228wkgbmnqykc = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f66226iobyxmoadg, ppxfxbqfkfVar.f66226iobyxmoadg) && this.f66229zoijcleaow == ppxfxbqfkfVar.f66229zoijcleaow && this.f66227ppxfxbqfkf == ppxfxbqfkfVar.f66227ppxfxbqfkf && this.f66228wkgbmnqykc == ppxfxbqfkfVar.f66228wkgbmnqykc;
        }

        public int hashCode() {
            return (((((this.f66226iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f66229zoijcleaow)) * 31) + Boolean.hashCode(this.f66227ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f66228wkgbmnqykc);
        }

        public final int iobyxmoadg() {
            return this.f66229zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f66228wkgbmnqykc;
        }

        public String toString() {
            return "ReviewsUpdated(reviews=" + this.f66226iobyxmoadg + ", page=" + this.f66229zoijcleaow + ", isNeedScrollToTop=" + this.f66227ppxfxbqfkf + ", isLoggedInUser=" + this.f66228wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f66227ppxfxbqfkf;
        }

        public final Reviews zoijcleaow() {
            return this.f66226iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f66230iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 2013736180;
        }

        public String toString() {
            return "ScrolledToTop";
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f66231iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f66232zoijcleaow;

        public zoijcleaow(boolean z13, boolean z14) {
            super(null);
            this.f66231iobyxmoadg = z13;
            this.f66232zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f66231iobyxmoadg == zoijcleaowVar.f66231iobyxmoadg && this.f66232zoijcleaow == zoijcleaowVar.f66232zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f66231iobyxmoadg) * 31) + Boolean.hashCode(this.f66232zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f66232zoijcleaow;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f66231iobyxmoadg + ", isInitLoad=" + this.f66232zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f66231iobyxmoadg;
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

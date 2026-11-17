package p91;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final C1680iobyxmoadg f76224eablkybsjg = new C1680iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f76225gxszxtbevo = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f76226iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f76227ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f76228wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f76229zoijcleaow;

    /* JADX INFO: renamed from: p91.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1680iobyxmoadg {
        public /* synthetic */ C1680iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iobyxmoadg iobyxmoadg() {
            return new iobyxmoadg(false, dxjokdxxww.ppxfxbqfkf(), dxjokdxxww.ppxfxbqfkf(), jyumaefscl.wflxmlrfwp());
        }

        private C1680iobyxmoadg() {
        }
    }

    public iobyxmoadg(boolean z13, String averageRating, String reviewsCount, List reviewsByRating) {
        zdlpuopuiu.btonecajqb(averageRating, "averageRating");
        zdlpuopuiu.btonecajqb(reviewsCount, "reviewsCount");
        zdlpuopuiu.btonecajqb(reviewsByRating, "reviewsByRating");
        this.f76226iobyxmoadg = z13;
        this.f76229zoijcleaow = averageRating;
        this.f76227ppxfxbqfkf = reviewsCount;
        this.f76228wkgbmnqykc = reviewsByRating;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f76226iobyxmoadg == iobyxmoadgVar.f76226iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f76229zoijcleaow, iobyxmoadgVar.f76229zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f76227ppxfxbqfkf, iobyxmoadgVar.f76227ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f76228wkgbmnqykc, iobyxmoadgVar.f76228wkgbmnqykc);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f76226iobyxmoadg) * 31) + this.f76229zoijcleaow.hashCode()) * 31) + this.f76227ppxfxbqfkf.hashCode()) * 31) + this.f76228wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f76229zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f76227ppxfxbqfkf;
    }

    public String toString() {
        return "RatingHeaderUiModel(isVisible=" + this.f76226iobyxmoadg + ", averageRating=" + this.f76229zoijcleaow + ", reviewsCount=" + this.f76227ppxfxbqfkf + ", reviewsByRating=" + this.f76228wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f76226iobyxmoadg;
    }

    public final List zoijcleaow() {
        return this.f76228wkgbmnqykc;
    }
}

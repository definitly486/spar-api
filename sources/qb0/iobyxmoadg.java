package qb0;

import hg.jyumaefscl;
import java.util.List;
import k30.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final C1755iobyxmoadg f78390eablkybsjg = new C1755iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f78391gxszxtbevo = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f78392iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f78393ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f78394wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f78395zoijcleaow;

    /* JADX INFO: renamed from: qb0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1755iobyxmoadg {
        public /* synthetic */ C1755iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iobyxmoadg iobyxmoadg() {
            return new iobyxmoadg(false, draadjrbmk.ppxfxbqfkf(), draadjrbmk.ppxfxbqfkf(), jyumaefscl.wflxmlrfwp());
        }

        private C1755iobyxmoadg() {
        }
    }

    public iobyxmoadg(boolean z13, String averageRating, String reviewsCount, List reviewsByRating) {
        zdlpuopuiu.btonecajqb(averageRating, "averageRating");
        zdlpuopuiu.btonecajqb(reviewsCount, "reviewsCount");
        zdlpuopuiu.btonecajqb(reviewsByRating, "reviewsByRating");
        this.f78392iobyxmoadg = z13;
        this.f78395zoijcleaow = averageRating;
        this.f78393ppxfxbqfkf = reviewsCount;
        this.f78394wkgbmnqykc = reviewsByRating;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f78392iobyxmoadg == iobyxmoadgVar.f78392iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f78395zoijcleaow, iobyxmoadgVar.f78395zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f78393ppxfxbqfkf, iobyxmoadgVar.f78393ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f78394wkgbmnqykc, iobyxmoadgVar.f78394wkgbmnqykc);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f78392iobyxmoadg) * 31) + this.f78395zoijcleaow.hashCode()) * 31) + this.f78393ppxfxbqfkf.hashCode()) * 31) + this.f78394wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f78395zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f78393ppxfxbqfkf;
    }

    public String toString() {
        return "RatingHeaderUiModel(isVisible=" + this.f78392iobyxmoadg + ", averageRating=" + this.f78395zoijcleaow + ", reviewsCount=" + this.f78393ppxfxbqfkf + ", reviewsByRating=" + this.f78394wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f78392iobyxmoadg;
    }

    public final List zoijcleaow() {
        return this.f78394wkgbmnqykc;
    }
}

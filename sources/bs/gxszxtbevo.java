package bs;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f16969iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Integer f16970ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f16971zoijcleaow;

    public gxszxtbevo(int i13, List reviews, Integer num) {
        zdlpuopuiu.btonecajqb(reviews, "reviews");
        this.f16969iobyxmoadg = i13;
        this.f16971zoijcleaow = reviews;
        this.f16970ppxfxbqfkf = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f16969iobyxmoadg == gxszxtbevoVar.f16969iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f16971zoijcleaow, gxszxtbevoVar.f16971zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f16970ppxfxbqfkf, gxszxtbevoVar.f16970ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f16969iobyxmoadg) * 31) + this.f16971zoijcleaow.hashCode()) * 31;
        Integer num = this.f16970ppxfxbqfkf;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final Integer iobyxmoadg() {
        return this.f16970ppxfxbqfkf;
    }

    public final int ppxfxbqfkf() {
        return this.f16969iobyxmoadg;
    }

    public String toString() {
        return "UserReviewsUiModel(reviewsMoreCount=" + this.f16969iobyxmoadg + ", reviews=" + this.f16971zoijcleaow + ", buttonAddReviewTextRes=" + this.f16970ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f16971zoijcleaow;
    }
}

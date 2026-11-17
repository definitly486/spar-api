package qq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f80502iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Integer f80503ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f80504zoijcleaow;

    public gxszxtbevo(int i13, List reviews, Integer num) {
        zdlpuopuiu.btonecajqb(reviews, "reviews");
        this.f80502iobyxmoadg = i13;
        this.f80504zoijcleaow = reviews;
        this.f80503ppxfxbqfkf = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f80502iobyxmoadg == gxszxtbevoVar.f80502iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f80504zoijcleaow, gxszxtbevoVar.f80504zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f80503ppxfxbqfkf, gxszxtbevoVar.f80503ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f80502iobyxmoadg) * 31) + this.f80504zoijcleaow.hashCode()) * 31;
        Integer num = this.f80503ppxfxbqfkf;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final Integer iobyxmoadg() {
        return this.f80503ppxfxbqfkf;
    }

    public final int ppxfxbqfkf() {
        return this.f80502iobyxmoadg;
    }

    public String toString() {
        return "UserReviewsUiModel(reviewsMoreCount=" + this.f80502iobyxmoadg + ", reviews=" + this.f80504zoijcleaow + ", buttonAddReviewTextRes=" + this.f80503ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f80504zoijcleaow;
    }
}

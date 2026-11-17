package dm1;

import gg.cqumvgiudr;
import gg.pmvmpeiblj;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends wm0.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f29177eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Map f29178gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f29179ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f29180wkgbmnqykc;

    public /* synthetic */ zoijcleaow(String str, int i13, String str2, gtknphoqwx gtknphoqwxVar) {
        this(str, i13, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f29179ppxfxbqfkf, zoijcleaowVar.f29179ppxfxbqfkf) && this.f29180wkgbmnqykc == zoijcleaowVar.f29180wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f29177eablkybsjg, zoijcleaowVar.f29177eablkybsjg);
    }

    public int hashCode() {
        return (((this.f29179ppxfxbqfkf.hashCode() * 31) + pmvmpeiblj.wkgbmnqykc(this.f29180wkgbmnqykc)) * 31) + this.f29177eablkybsjg.hashCode();
    }

    public String toString() {
        return "RateProductReviewSendEvent(article=" + this.f29179ppxfxbqfkf + ", rating=" + pmvmpeiblj.eablkybsjg(this.f29180wkgbmnqykc) + ", review=" + this.f29177eablkybsjg + ")";
    }

    @Override // wm0.iobyxmoadg
    public Map zoijcleaow() {
        return this.f29178gxszxtbevo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zoijcleaow(String article, int i13, String review) {
        super("Отзыв отправлен");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(review, "review");
        this.f29179ppxfxbqfkf = article;
        this.f29180wkgbmnqykc = i13;
        this.f29177eablkybsjg = review;
        this.f29178gxszxtbevo = tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg("article", article), cqumvgiudr.iobyxmoadg("rating", pmvmpeiblj.iobyxmoadg(i13)), cqumvgiudr.iobyxmoadg("review", review));
    }
}

package m02;

import gg.cqumvgiudr;
import gg.pmvmpeiblj;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends mo.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f64926eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Map f64927gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f64928ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f64929wkgbmnqykc;

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
        return zdlpuopuiu.eablkybsjg(this.f64928ppxfxbqfkf, zoijcleaowVar.f64928ppxfxbqfkf) && this.f64929wkgbmnqykc == zoijcleaowVar.f64929wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f64926eablkybsjg, zoijcleaowVar.f64926eablkybsjg);
    }

    public int hashCode() {
        return (((this.f64928ppxfxbqfkf.hashCode() * 31) + pmvmpeiblj.wkgbmnqykc(this.f64929wkgbmnqykc)) * 31) + this.f64926eablkybsjg.hashCode();
    }

    public String toString() {
        return "RateProductReviewSendEvent(article=" + this.f64928ppxfxbqfkf + ", rating=" + pmvmpeiblj.eablkybsjg(this.f64929wkgbmnqykc) + ", review=" + this.f64926eablkybsjg + ")";
    }

    @Override // mo.iobyxmoadg
    public Map zoijcleaow() {
        return this.f64927gxszxtbevo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zoijcleaow(String article, int i13, String review) {
        super("Отзыв отправлен");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(review, "review");
        this.f64928ppxfxbqfkf = article;
        this.f64929wkgbmnqykc = i13;
        this.f64926eablkybsjg = review;
        this.f64927gxszxtbevo = tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg("article", article), cqumvgiudr.iobyxmoadg("rating", pmvmpeiblj.iobyxmoadg(i13)), cqumvgiudr.iobyxmoadg("review", review));
    }
}

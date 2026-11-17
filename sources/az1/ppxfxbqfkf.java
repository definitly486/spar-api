package az1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14819iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f14820ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f14821zoijcleaow;

    public ppxfxbqfkf(String article, double d13, String measure) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measure, "measure");
        this.f14819iobyxmoadg = article;
        this.f14821zoijcleaow = d13;
        this.f14820ppxfxbqfkf = measure;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f14819iobyxmoadg, ppxfxbqfkfVar.f14819iobyxmoadg) && Double.compare(this.f14821zoijcleaow, ppxfxbqfkfVar.f14821zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f14820ppxfxbqfkf, ppxfxbqfkfVar.f14820ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f14819iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f14821zoijcleaow)) * 31) + this.f14820ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f14819iobyxmoadg;
    }

    public final double ppxfxbqfkf() {
        return this.f14821zoijcleaow;
    }

    public String toString() {
        return "PurchasesListProductDetail(article=" + this.f14819iobyxmoadg + ", quantity=" + this.f14821zoijcleaow + ", measure=" + this.f14820ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f14820ppxfxbqfkf;
    }
}
